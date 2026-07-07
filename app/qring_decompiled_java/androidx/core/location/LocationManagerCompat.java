package androidx.core.location;

/* loaded from: classes.dex */
public final class LocationManagerCompat {
    private static final long GET_CURRENT_LOCATION_TIMEOUT_MS = 30000;
    private static final long MAX_CURRENT_LOCATION_AGE_MS = 10000;
    private static final long PRE_N_LOOPER_TIMEOUT_S = 5;
    private static java.lang.reflect.Field sContextField;
    static final java.util.WeakHashMap<android.location.LocationListener, java.util.List<java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>>> sLocationListeners = new java.util.WeakHashMap<>();
    private static java.lang.reflect.Method sRequestLocationUpdatesExecutorMethod;
    private static java.lang.reflect.Method sRequestLocationUpdatesLooperMethod;

    public static boolean isLocationEnabled(android.location.LocationManager locationManager) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.location.LocationManagerCompat.Api28Impl.isLocationEnabled(locationManager);
        }
        if (android.os.Build.VERSION.SDK_INT <= 19) {
            try {
                if (sContextField == null) {
                    java.lang.reflect.Field declaredField = android.location.LocationManager.class.getDeclaredField("mContext");
                    sContextField = declaredField;
                    declaredField.setAccessible(true);
                }
                android.content.Context context = (android.content.Context) sContextField.get(locationManager);
                if (context != null) {
                    if (android.os.Build.VERSION.SDK_INT == 19) {
                        return android.provider.Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0;
                    }
                    return !android.text.TextUtils.isEmpty(android.provider.Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
                }
            } catch (java.lang.ClassCastException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException | java.lang.SecurityException unused) {
            }
        }
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled(com.amap.api.services.geocoder.GeocodeSearch.GPS);
    }

    public static boolean hasProvider(android.location.LocationManager locationManager, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.location.LocationManagerCompat.Api31Impl.hasProvider(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            return locationManager.getProvider(str) != null;
        } catch (java.lang.SecurityException unused) {
            return false;
        }
    }

    public static void getCurrentLocation(android.location.LocationManager locationManager, java.lang.String str, androidx.core.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, final androidx.core.util.Consumer<android.location.Location> consumer) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.location.LocationManagerCompat.Api30Impl.getCurrentLocation(locationManager, str, cancellationSignal, executor, consumer);
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        final android.location.Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && android.os.SystemClock.elapsedRealtime() - androidx.core.location.LocationCompat.getElapsedRealtimeMillis(lastKnownLocation) < 10000) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.util.Consumer.this.accept(lastKnownLocation);
                }
            });
            return;
        }
        final androidx.core.location.LocationManagerCompat.CancellableLocationListener cancellableLocationListener = new androidx.core.location.LocationManagerCompat.CancellableLocationListener(locationManager, executor, consumer);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, cancellableLocationListener, android.os.Looper.getMainLooper());
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new androidx.core.os.CancellationSignal.OnCancelListener() { // from class: androidx.core.location.LocationManagerCompat.1
                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    androidx.core.location.LocationManagerCompat.CancellableLocationListener.this.cancel();
                }
            });
        }
        cancellableLocationListener.startTimeout(30000L);
    }

    public static void requestLocationUpdates(android.location.LocationManager locationManager, java.lang.String str, androidx.core.location.LocationRequestCompat locationRequestCompat, java.util.concurrent.Executor executor, androidx.core.location.LocationListenerCompat locationListenerCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.core.location.LocationManagerCompat.Api31Impl.requestLocationUpdates(locationManager, str, locationRequestCompat.toLocationRequest(), executor, locationListenerCompat);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            try {
                if (sRequestLocationUpdatesExecutorMethod == null) {
                    java.lang.reflect.Method declaredMethod = android.location.LocationManager.class.getDeclaredMethod("requestLocationUpdates", android.location.LocationRequest.class, java.util.concurrent.Executor.class, android.location.LocationListener.class);
                    sRequestLocationUpdatesExecutorMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                android.location.LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    sRequestLocationUpdatesExecutorMethod.invoke(locationManager, locationRequest, executor, locationListenerCompat);
                    return;
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
        androidx.core.location.LocationManagerCompat.LocationListenerTransport locationListenerTransport = new androidx.core.location.LocationManagerCompat.LocationListenerTransport(locationListenerCompat, executor);
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            try {
                if (sRequestLocationUpdatesLooperMethod == null) {
                    java.lang.reflect.Method declaredMethod2 = android.location.LocationManager.class.getDeclaredMethod("requestLocationUpdates", android.location.LocationRequest.class, android.location.LocationListener.class, android.os.Looper.class);
                    sRequestLocationUpdatesLooperMethod = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                android.location.LocationRequest locationRequest2 = locationRequestCompat.toLocationRequest(str);
                if (locationRequest2 != null) {
                    synchronized (sLocationListeners) {
                        sRequestLocationUpdatesLooperMethod.invoke(locationManager, locationRequest2, locationListenerTransport, android.os.Looper.getMainLooper());
                        locationListenerTransport.register();
                    }
                    return;
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }
        synchronized (sLocationListeners) {
            locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerTransport, android.os.Looper.getMainLooper());
            locationListenerTransport.register();
        }
    }

    public static void requestLocationUpdates(android.location.LocationManager locationManager, java.lang.String str, androidx.core.location.LocationRequestCompat locationRequestCompat, androidx.core.location.LocationListenerCompat locationListenerCompat, android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.core.location.LocationManagerCompat.Api31Impl.requestLocationUpdates(locationManager, str, locationRequestCompat.toLocationRequest(), androidx.core.os.ExecutorCompat.create(new android.os.Handler(looper)), locationListenerCompat);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            try {
                if (sRequestLocationUpdatesLooperMethod == null) {
                    java.lang.reflect.Method declaredMethod = android.location.LocationManager.class.getDeclaredMethod("requestLocationUpdates", android.location.LocationRequest.class, android.location.LocationListener.class, android.os.Looper.class);
                    sRequestLocationUpdatesLooperMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                try {
                    android.location.LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                    if (locationRequest != null) {
                        sRequestLocationUpdatesLooperMethod.invoke(locationManager, locationRequest, locationListenerCompat, looper);
                        return;
                    }
                } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused) {
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused2) {
            }
            locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerCompat, looper);
        }
        locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerCompat, looper);
    }

    public static void removeUpdates(android.location.LocationManager locationManager, androidx.core.location.LocationListenerCompat locationListenerCompat) {
        java.util.WeakHashMap<android.location.LocationListener, java.util.List<java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>>> weakHashMap = sLocationListeners;
        synchronized (weakHashMap) {
            java.util.List<java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> remove = weakHashMap.remove(locationListenerCompat);
            if (remove != null) {
                java.util.Iterator<java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> it = remove.iterator();
                while (it.hasNext()) {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport locationListenerTransport = it.next().get();
                    if (locationListenerTransport != null && locationListenerTransport.unregister()) {
                        locationManager.removeUpdates(locationListenerTransport);
                    }
                }
            }
        }
        locationManager.removeUpdates(locationListenerCompat);
    }

    public static java.lang.String getGnssHardwareModelName(android.location.LocationManager locationManager) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.location.LocationManagerCompat.Api28Impl.getGnssHardwareModelName(locationManager);
        }
        return null;
    }

    public static int getGnssYearOfHardware(android.location.LocationManager locationManager) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.location.LocationManagerCompat.Api28Impl.getGnssYearOfHardware(locationManager);
        }
        return 0;
    }

    private static class GnssLazyLoader {
        static final androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> sGnssStatusListeners = new androidx.collection.SimpleArrayMap<>();

        private GnssLazyLoader() {
        }
    }

    public static boolean registerGnssStatusCallback(android.location.LocationManager locationManager, androidx.core.location.GnssStatusCompat.Callback callback, android.os.Handler handler) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, androidx.core.os.ExecutorCompat.create(handler), callback);
        }
        return registerGnssStatusCallback(locationManager, new androidx.core.location.LocationManagerCompat.InlineHandlerExecutor(handler), callback);
    }

    public static boolean registerGnssStatusCallback(android.location.LocationManager locationManager, java.util.concurrent.Executor executor, androidx.core.location.GnssStatusCompat.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, null, executor, callback);
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == null) {
            myLooper = android.os.Looper.getMainLooper();
        }
        return registerGnssStatusCallback(locationManager, new android.os.Handler(myLooper), executor, callback);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0116 A[Catch: all -> 0x0132, TryCatch #7 {all -> 0x0132, blocks: (B:88:0x00f5, B:89:0x010b, B:76:0x010e, B:78:0x0116, B:80:0x011e, B:81:0x0124, B:82:0x0125, B:83:0x012a, B:84:0x012b, B:85:0x0131, B:71:0x00e4), top: B:53:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012b A[Catch: all -> 0x0132, TryCatch #7 {all -> 0x0132, blocks: (B:88:0x00f5, B:89:0x010b, B:76:0x010e, B:78:0x0116, B:80:0x011e, B:81:0x0124, B:82:0x0125, B:83:0x012a, B:84:0x012b, B:85:0x0131, B:71:0x00e4), top: B:53:0x00a4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean registerGnssStatusCallback(final android.location.LocationManager r9, android.os.Handler r10, java.util.concurrent.Executor r11, androidx.core.location.GnssStatusCompat.Callback r12) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.location.LocationManagerCompat.registerGnssStatusCallback(android.location.LocationManager, android.os.Handler, java.util.concurrent.Executor, androidx.core.location.GnssStatusCompat$Callback):boolean");
    }

    public static void unregisterGnssStatusCallback(android.location.LocationManager locationManager, androidx.core.location.GnssStatusCompat.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            synchronized (androidx.core.location.LocationManagerCompat.GnssLazyLoader.sGnssStatusListeners) {
                android.location.GnssStatus.Callback callback2 = (androidx.core.location.LocationManagerCompat.GnssStatusTransport) androidx.core.location.LocationManagerCompat.GnssLazyLoader.sGnssStatusListeners.remove(callback);
                if (callback2 != null) {
                    locationManager.unregisterGnssStatusCallback(callback2);
                }
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            synchronized (androidx.core.location.LocationManagerCompat.GnssLazyLoader.sGnssStatusListeners) {
                androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) androidx.core.location.LocationManagerCompat.GnssLazyLoader.sGnssStatusListeners.remove(callback);
                if (preRGnssStatusTransport != null) {
                    preRGnssStatusTransport.unregister();
                    locationManager.unregisterGnssStatusCallback(preRGnssStatusTransport);
                }
            }
            return;
        }
        synchronized (androidx.core.location.LocationManagerCompat.GnssLazyLoader.sGnssStatusListeners) {
            androidx.core.location.LocationManagerCompat.GpsStatusTransport gpsStatusTransport = (androidx.core.location.LocationManagerCompat.GpsStatusTransport) androidx.core.location.LocationManagerCompat.GnssLazyLoader.sGnssStatusListeners.remove(callback);
            if (gpsStatusTransport != null) {
                gpsStatusTransport.unregister();
                locationManager.removeGpsStatusListener(gpsStatusTransport);
            }
        }
    }

    private LocationManagerCompat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class LocationListenerTransport implements android.location.LocationListener {
        final java.util.concurrent.Executor mExecutor;
        volatile androidx.core.location.LocationListenerCompat mListener;

        LocationListenerTransport(androidx.core.location.LocationListenerCompat locationListenerCompat, java.util.concurrent.Executor executor) {
            this.mListener = (androidx.core.location.LocationListenerCompat) androidx.core.util.ObjectsCompat.requireNonNull(locationListenerCompat, "invalid null listener");
            this.mExecutor = executor;
        }

        public void register() {
            java.util.List<java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> list = androidx.core.location.LocationManagerCompat.sLocationListeners.get(this.mListener);
            if (list == null) {
                list = new java.util.ArrayList<>(1);
                androidx.core.location.LocationManagerCompat.sLocationListeners.put(this.mListener, list);
            } else if (android.os.Build.VERSION.SDK_INT >= 24) {
                list.removeIf(new java.util.function.Predicate() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda6
                    @Override // java.util.function.Predicate
                    public final boolean test(java.lang.Object obj) {
                        return androidx.core.location.LocationManagerCompat.LocationListenerTransport.lambda$register$0((java.lang.ref.WeakReference) obj);
                    }
                });
            } else {
                java.util.Iterator<java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == null) {
                        it.remove();
                    }
                }
            }
            list.add(new java.lang.ref.WeakReference<>(this));
        }

        static /* synthetic */ boolean lambda$register$0(java.lang.ref.WeakReference weakReference) {
            return weakReference.get() == null;
        }

        public boolean unregister() {
            androidx.core.location.LocationListenerCompat locationListenerCompat = this.mListener;
            if (locationListenerCompat == null) {
                return false;
            }
            this.mListener = null;
            java.util.List<java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> list = androidx.core.location.LocationManagerCompat.sLocationListeners.get(locationListenerCompat);
            if (list == null) {
                return true;
            }
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                list.removeIf(new java.util.function.Predicate() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda7
                    @Override // java.util.function.Predicate
                    public final boolean test(java.lang.Object obj) {
                        return androidx.core.location.LocationManagerCompat.LocationListenerTransport.lambda$unregister$1((java.lang.ref.WeakReference) obj);
                    }
                });
            } else {
                java.util.Iterator<java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == null) {
                        it.remove();
                    }
                }
            }
            if (!list.isEmpty()) {
                return true;
            }
            androidx.core.location.LocationManagerCompat.sLocationListeners.remove(locationListenerCompat);
            return true;
        }

        static /* synthetic */ boolean lambda$unregister$1(java.lang.ref.WeakReference weakReference) {
            return weakReference.get() == null;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final android.location.Location location) {
            final androidx.core.location.LocationListenerCompat locationListenerCompat = this.mListener;
            if (locationListenerCompat == null) {
                return;
            }
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.m142xad6a74fb(locationListenerCompat, location);
                }
            });
        }

        /* renamed from: lambda$onLocationChanged$2$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        public /* synthetic */ void m142xad6a74fb(androidx.core.location.LocationListenerCompat locationListenerCompat, android.location.Location location) {
            if (this.mListener != locationListenerCompat) {
                return;
            }
            locationListenerCompat.onLocationChanged(location);
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final java.util.List<android.location.Location> list) {
            final androidx.core.location.LocationListenerCompat locationListenerCompat = this.mListener;
            if (locationListenerCompat == null) {
                return;
            }
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.m143x2fb529da(locationListenerCompat, list);
                }
            });
        }

        /* renamed from: lambda$onLocationChanged$3$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        public /* synthetic */ void m143x2fb529da(androidx.core.location.LocationListenerCompat locationListenerCompat, java.util.List list) {
            if (this.mListener != locationListenerCompat) {
                return;
            }
            locationListenerCompat.onLocationChanged((java.util.List<android.location.Location>) list);
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i) {
            final androidx.core.location.LocationListenerCompat locationListenerCompat = this.mListener;
            if (locationListenerCompat == null) {
                return;
            }
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.m141xf4e2685b(locationListenerCompat, i);
                }
            });
        }

        /* renamed from: lambda$onFlushComplete$4$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        public /* synthetic */ void m141xf4e2685b(androidx.core.location.LocationListenerCompat locationListenerCompat, int i) {
            if (this.mListener != locationListenerCompat) {
                return;
            }
            locationListenerCompat.onFlushComplete(i);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final java.lang.String str, final int i, final android.os.Bundle bundle) {
            final androidx.core.location.LocationListenerCompat locationListenerCompat = this.mListener;
            if (locationListenerCompat == null) {
                return;
            }
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.m146xe07c10d5(locationListenerCompat, str, i, bundle);
                }
            });
        }

        /* renamed from: lambda$onStatusChanged$5$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        public /* synthetic */ void m146xe07c10d5(androidx.core.location.LocationListenerCompat locationListenerCompat, java.lang.String str, int i, android.os.Bundle bundle) {
            if (this.mListener != locationListenerCompat) {
                return;
            }
            locationListenerCompat.onStatusChanged(str, i, bundle);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(final java.lang.String str) {
            final androidx.core.location.LocationListenerCompat locationListenerCompat = this.mListener;
            if (locationListenerCompat == null) {
                return;
            }
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.m145x5ebfe4c6(locationListenerCompat, str);
                }
            });
        }

        /* renamed from: lambda$onProviderEnabled$6$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        public /* synthetic */ void m145x5ebfe4c6(androidx.core.location.LocationListenerCompat locationListenerCompat, java.lang.String str) {
            if (this.mListener != locationListenerCompat) {
                return;
            }
            locationListenerCompat.onProviderEnabled(str);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(final java.lang.String str) {
            final androidx.core.location.LocationListenerCompat locationListenerCompat = this.mListener;
            if (locationListenerCompat == null) {
                return;
            }
            this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.LocationListenerTransport.this.m144x48c02650(locationListenerCompat, str);
                }
            });
        }

        /* renamed from: lambda$onProviderDisabled$7$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        public /* synthetic */ void m144x48c02650(androidx.core.location.LocationListenerCompat locationListenerCompat, java.lang.String str) {
            if (this.mListener != locationListenerCompat) {
                return;
            }
            locationListenerCompat.onProviderDisabled(str);
        }
    }

    private static class GnssStatusTransport extends android.location.GnssStatus.Callback {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;

        GnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback callback) {
            androidx.core.util.Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.mCallback.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.mCallback.onStopped();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
            this.mCallback.onFirstFix(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus gnssStatus) {
            this.mCallback.onSatelliteStatusChanged(androidx.core.location.GnssStatusCompat.wrap(gnssStatus));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PreRGnssStatusTransport extends android.location.GnssStatus.Callback {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;
        volatile java.util.concurrent.Executor mExecutor;

        PreRGnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback callback) {
            androidx.core.util.Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        public void register(java.util.concurrent.Executor executor) {
            androidx.core.util.Preconditions.checkArgument(executor != null, "invalid null executor");
            androidx.core.util.Preconditions.checkState(this.mExecutor == null);
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final java.util.concurrent.Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.this.m149x7ba12b9c(executor);
                }
            });
        }

        /* renamed from: lambda$onStarted$0$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        public /* synthetic */ void m149x7ba12b9c(java.util.concurrent.Executor executor) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final java.util.concurrent.Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.this.m150x80a5cd6f(executor);
                }
            });
        }

        /* renamed from: lambda$onStopped$1$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        public /* synthetic */ void m150x80a5cd6f(java.util.concurrent.Executor executor) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onStopped();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i) {
            final java.util.concurrent.Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.this.m147x4191f1e(executor, i);
                }
            });
        }

        /* renamed from: lambda$onFirstFix$2$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        public /* synthetic */ void m147x4191f1e(java.util.concurrent.Executor executor, int i) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onFirstFix(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final android.location.GnssStatus gnssStatus) {
            final java.util.concurrent.Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.this.m148xdecf6cdb(executor, gnssStatus);
                }
            });
        }

        /* renamed from: lambda$onSatelliteStatusChanged$3$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        public /* synthetic */ void m148xdecf6cdb(java.util.concurrent.Executor executor, android.location.GnssStatus gnssStatus) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onSatelliteStatusChanged(androidx.core.location.GnssStatusCompat.wrap(gnssStatus));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class GpsStatusTransport implements android.location.GpsStatus.Listener {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;
        volatile java.util.concurrent.Executor mExecutor;
        private final android.location.LocationManager mLocationManager;

        GpsStatusTransport(android.location.LocationManager locationManager, androidx.core.location.GnssStatusCompat.Callback callback) {
            androidx.core.util.Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mLocationManager = locationManager;
            this.mCallback = callback;
        }

        public void register(java.util.concurrent.Executor executor) {
            androidx.core.util.Preconditions.checkState(this.mExecutor == null);
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i) {
            android.location.GpsStatus gpsStatus;
            final java.util.concurrent.Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            if (i == 1) {
                executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.core.location.LocationManagerCompat.GpsStatusTransport.this.m137x75e92221(executor);
                    }
                });
                return;
            }
            if (i == 2) {
                executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.core.location.LocationManagerCompat.GpsStatusTransport.this.m138xc3a89a22(executor);
                    }
                });
                return;
            }
            if (i != 3) {
                if (i == 4 && (gpsStatus = this.mLocationManager.getGpsStatus(null)) != null) {
                    final androidx.core.location.GnssStatusCompat wrap = androidx.core.location.GnssStatusCompat.wrap(gpsStatus);
                    executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.core.location.LocationManagerCompat.GpsStatusTransport.this.m140x5f278a24(executor, wrap);
                        }
                    });
                    return;
                }
                return;
            }
            android.location.GpsStatus gpsStatus2 = this.mLocationManager.getGpsStatus(null);
            if (gpsStatus2 != null) {
                final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                executor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.core.location.LocationManagerCompat.GpsStatusTransport.this.m139x11681223(executor, timeToFirstFix);
                    }
                });
            }
        }

        /* renamed from: lambda$onGpsStatusChanged$0$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        public /* synthetic */ void m137x75e92221(java.util.concurrent.Executor executor) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onStarted();
        }

        /* renamed from: lambda$onGpsStatusChanged$1$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        public /* synthetic */ void m138xc3a89a22(java.util.concurrent.Executor executor) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onStopped();
        }

        /* renamed from: lambda$onGpsStatusChanged$2$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        public /* synthetic */ void m139x11681223(java.util.concurrent.Executor executor, int i) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onFirstFix(i);
        }

        /* renamed from: lambda$onGpsStatusChanged$3$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        public /* synthetic */ void m140x5f278a24(java.util.concurrent.Executor executor, androidx.core.location.GnssStatusCompat gnssStatusCompat) {
            if (this.mExecutor != executor) {
                return;
            }
            this.mCallback.onSatelliteStatusChanged(gnssStatusCompat);
        }
    }

    private static class Api31Impl {
        private Api31Impl() {
        }

        static boolean hasProvider(android.location.LocationManager locationManager, java.lang.String str) {
            return locationManager.hasProvider(str);
        }

        static void requestLocationUpdates(android.location.LocationManager locationManager, java.lang.String str, android.location.LocationRequest locationRequest, java.util.concurrent.Executor executor, android.location.LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        static void getCurrentLocation(android.location.LocationManager locationManager, java.lang.String str, androidx.core.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, final androidx.core.util.Consumer<android.location.Location> consumer) {
            android.os.CancellationSignal cancellationSignal2 = cancellationSignal != null ? (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject() : null;
            java.util.Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(str, cancellationSignal2, executor, new java.util.function.Consumer() { // from class: androidx.core.location.LocationManagerCompat$Api30Impl$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    androidx.core.util.Consumer.this.accept((android.location.Location) obj);
                }
            });
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        static boolean isLocationEnabled(android.location.LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }

        static java.lang.String getGnssHardwareModelName(android.location.LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        static int getGnssYearOfHardware(android.location.LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class CancellableLocationListener implements android.location.LocationListener {
        private androidx.core.util.Consumer<android.location.Location> mConsumer;
        private final java.util.concurrent.Executor mExecutor;
        private final android.location.LocationManager mLocationManager;
        private final android.os.Handler mTimeoutHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        java.lang.Runnable mTimeoutRunnable;
        private boolean mTriggered;

        @Override // android.location.LocationListener
        public void onProviderEnabled(java.lang.String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String str, int i, android.os.Bundle bundle) {
        }

        CancellableLocationListener(android.location.LocationManager locationManager, java.util.concurrent.Executor executor, androidx.core.util.Consumer<android.location.Location> consumer) {
            this.mLocationManager = locationManager;
            this.mExecutor = executor;
            this.mConsumer = consumer;
        }

        public void cancel() {
            synchronized (this) {
                if (this.mTriggered) {
                    return;
                }
                this.mTriggered = true;
                cleanup();
            }
        }

        public void startTimeout(long j) {
            synchronized (this) {
                if (this.mTriggered) {
                    return;
                }
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat.CancellableLocationListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        androidx.core.location.LocationManagerCompat.CancellableLocationListener.this.mTimeoutRunnable = null;
                        androidx.core.location.LocationManagerCompat.CancellableLocationListener.this.onLocationChanged((android.location.Location) null);
                    }
                };
                this.mTimeoutRunnable = runnable;
                this.mTimeoutHandler.postDelayed(runnable, j);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(java.lang.String str) {
            onLocationChanged((android.location.Location) null);
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final android.location.Location location) {
            synchronized (this) {
                if (this.mTriggered) {
                    return;
                }
                this.mTriggered = true;
                final androidx.core.util.Consumer<android.location.Location> consumer = this.mConsumer;
                this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.core.util.Consumer.this.accept(location);
                    }
                });
                cleanup();
            }
        }

        private void cleanup() {
            this.mConsumer = null;
            this.mLocationManager.removeUpdates(this);
            java.lang.Runnable runnable = this.mTimeoutRunnable;
            if (runnable != null) {
                this.mTimeoutHandler.removeCallbacks(runnable);
                this.mTimeoutRunnable = null;
            }
        }
    }

    private static final class InlineHandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        InlineHandlerExecutor(android.os.Handler handler) {
            this.mHandler = (android.os.Handler) androidx.core.util.Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            if (android.os.Looper.myLooper() == this.mHandler.getLooper()) {
                runnable.run();
            } else {
                if (this.mHandler.post((java.lang.Runnable) androidx.core.util.Preconditions.checkNotNull(runnable))) {
                    return;
                }
                throw new java.util.concurrent.RejectedExecutionException(this.mHandler + " is shutting down");
            }
        }
    }
}
