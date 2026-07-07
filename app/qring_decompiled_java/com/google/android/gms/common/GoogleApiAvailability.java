package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class GoogleApiAvailability extends com.google.android.gms.common.GoogleApiAvailabilityLight {
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private java.lang.String zac;
    private static final java.lang.Object zaa = new java.lang.Object();
    private static final com.google.android.gms.common.GoogleApiAvailability zab = new com.google.android.gms.common.GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static com.google.android.gms.common.GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> zai(com.google.android.gms.common.api.HasApiKey<?> hasApiKey, com.google.android.gms.common.api.HasApiKey<?>... hasApiKeyArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (com.google.android.gms.common.api.HasApiKey<?> hasApiKey2 : hasApiKeyArr) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(java.util.Arrays.asList(hasApiKeyArr));
        return com.google.android.gms.common.api.internal.GoogleApiManager.zal().zao(arrayList);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> checkApiAvailability(com.google.android.gms.common.api.GoogleApi<?> googleApi, com.google.android.gms.common.api.GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.gms.common.zab
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                int i = com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return com.google.android.gms.tasks.Tasks.forResult(null);
            }
        });
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int getClientVersion(android.content.Context context) {
        return super.getClientVersion(context);
    }

    public android.app.Dialog getErrorDialog(android.app.Activity activity, int i, int i2) {
        return getErrorDialog(activity, i, i2, (android.content.DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public android.content.Intent getErrorResolutionIntent(android.content.Context context, int i, java.lang.String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final java.lang.String getErrorString(int i) {
        return super.getErrorString(i);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(android.content.Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> makeGooglePlayServicesAvailable(android.app.Activity activity) {
        int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        com.google.android.gms.common.internal.Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i);
        if (isGooglePlayServicesAvailable == 0) {
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        com.google.android.gms.common.api.internal.zacc zaa2 = com.google.android.gms.common.api.internal.zacc.zaa(activity);
        zaa2.zah(new com.google.android.gms.common.ConnectionResult(isGooglePlayServicesAvailable, null), 0);
        return zaa2.zad();
    }

    public void setDefaultNotificationChannelId(android.content.Context context, java.lang.String str) {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.app.NotificationManager) com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    public boolean showErrorDialogFragment(android.app.Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, null);
    }

    public void showErrorNotification(android.content.Context context, int i) {
        zae(context, i, null, getErrorResolutionPendingIntent(context, i, 0, "n"));
    }

    final android.app.Dialog zaa(android.content.Context context, int i, com.google.android.gms.common.internal.zag zagVar, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        android.app.AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new android.app.AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new android.app.AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.zac.zad(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        java.lang.String zac = com.google.android.gms.common.internal.zac.zac(context, i);
        if (zac != null) {
            builder.setPositiveButton(zac, zagVar);
        }
        java.lang.String zag = com.google.android.gms.common.internal.zac.zag(context, i);
        if (zag != null) {
            builder.setTitle(zag);
        }
        android.util.Log.w("GoogleApiAvailability", java.lang.String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", java.lang.Integer.valueOf(i)), new java.lang.IllegalArgumentException());
        return builder.create();
    }

    public final android.app.Dialog zab(android.app.Activity activity, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.zac.zad(activity, 18));
        builder.setPositiveButton("", (android.content.DialogInterface.OnClickListener) null);
        android.app.AlertDialog create = builder.create();
        zad(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final com.google.android.gms.common.api.internal.zabx zac(android.content.Context context, com.google.android.gms.common.api.internal.zabw zabwVar) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        com.google.android.gms.common.api.internal.zabx zabxVar = new com.google.android.gms.common.api.internal.zabx(zabwVar);
        context.registerReceiver(zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabxVar;
        }
        zabwVar.zaa();
        zabxVar.zab();
        return null;
    }

    final void zad(android.app.Activity activity, android.app.Dialog dialog, java.lang.String str, android.content.DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.FragmentActivity) {
                com.google.android.gms.common.SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((androidx.fragment.app.FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (java.lang.NoClassDefFoundError unused) {
        }
        com.google.android.gms.common.ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void zae(android.content.Context context, int i, java.lang.String str, android.app.PendingIntent pendingIntent) {
        int i2;
        java.lang.String str2;
        android.util.Log.w("GoogleApiAvailability", java.lang.String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", java.lang.Integer.valueOf(i), null), new java.lang.IllegalArgumentException());
        if (i == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                android.util.Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        java.lang.String zaf = com.google.android.gms.common.internal.zac.zaf(context, i);
        java.lang.String zae = com.google.android.gms.common.internal.zac.zae(context, i);
        android.content.res.Resources resources = context.getResources();
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getSystemService("notification"));
        androidx.core.app.NotificationCompat.Builder style = new androidx.core.app.NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(zaf).setStyle(new androidx.core.app.NotificationCompat.BigTextStyle().bigText(zae));
        if (com.google.android.gms.common.util.DeviceProperties.isWearable(context)) {
            com.google.android.gms.common.internal.Preconditions.checkState(com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKatWatch());
            style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
            if (com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(context)) {
                style.addAction(com.google.android.gms.base.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R.string.common_open_on_phone), pendingIntent);
            } else {
                style.setContentIntent(pendingIntent);
            }
        } else {
            style.setSmallIcon(android.R.drawable.stat_sys_warning).setTicker(resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker)).setWhen(java.lang.System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(zae);
        }
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            com.google.android.gms.common.internal.Preconditions.checkState(com.google.android.gms.common.util.PlatformVersion.isAtLeastO());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                java.lang.String zab2 = com.google.android.gms.common.internal.zac.zab(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new android.app.NotificationChannel("com.google.android.gms.availability", zab2, 4));
                } else if (!zab2.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(zab2);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            style.setChannelId(str2);
        }
        android.app.Notification build = style.build();
        if (i == 1 || i == 2 || i == 3) {
            com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, build);
    }

    final void zaf(android.content.Context context) {
        new com.google.android.gms.common.zac(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean zag(android.app.Activity activity, com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog zaa2 = zaa(activity, i, com.google.android.gms.common.internal.zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i, "d"), 2), onCancelListener);
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zah(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        android.app.PendingIntent errorResolutionPendingIntent;
        if (com.google.android.gms.common.wrappers.InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zae(context, connectionResult.getErrorCode(), null, com.google.android.gms.internal.base.zal.zaa(context, 0, com.google.android.gms.common.api.GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i, true), com.google.android.gms.internal.base.zal.zaa | 134217728));
        return true;
    }

    public android.app.Dialog getErrorDialog(android.app.Activity activity, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i, com.google.android.gms.common.internal.zag.zab(activity, getErrorResolutionIntent(activity, i, "d"), i2), onCancelListener);
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult) {
        return connectionResult.hasResolution() ? connectionResult.getResolution() : getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(android.content.Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    public boolean showErrorDialogFragment(android.app.Activity activity, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> checkApiAvailability(com.google.android.gms.common.api.HasApiKey<?> hasApiKey, com.google.android.gms.common.api.HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                int i = com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return com.google.android.gms.tasks.Tasks.forResult(null);
            }
        });
    }

    public void showErrorNotification(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult) {
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    public android.app.Dialog getErrorDialog(androidx.fragment.app.Fragment fragment, int i, int i2) {
        return getErrorDialog(fragment, i, i2, (android.content.DialogInterface.OnCancelListener) null);
    }

    public android.app.Dialog getErrorDialog(androidx.fragment.app.Fragment fragment, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i, com.google.android.gms.common.internal.zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i, "d"), i2), onCancelListener);
    }
}
