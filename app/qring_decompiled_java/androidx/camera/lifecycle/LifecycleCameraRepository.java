package androidx.camera.lifecycle;

/* loaded from: classes.dex */
final class LifecycleCameraRepository {
    private final java.lang.Object mLock = new java.lang.Object();
    private final java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository.Key, androidx.camera.lifecycle.LifecycleCamera> mCameraMap = new java.util.HashMap();
    private final java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key>> mLifecycleObserverMap = new java.util.HashMap();
    private final java.util.ArrayDeque<androidx.lifecycle.LifecycleOwner> mActiveLifecycleOwners = new java.util.ArrayDeque<>();

    LifecycleCameraRepository() {
    }

    androidx.camera.lifecycle.LifecycleCamera createLifecycleCamera(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdaptor) {
        androidx.camera.lifecycle.LifecycleCamera lifecycleCamera;
        synchronized (this.mLock) {
            androidx.core.util.Preconditions.checkArgument(this.mCameraMap.get(androidx.camera.lifecycle.LifecycleCameraRepository.Key.create(lifecycleOwner, cameraUseCaseAdaptor.getCameraId())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            if (lifecycleOwner.getLifecycle().getCurrentState() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                throw new java.lang.IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
            }
            lifecycleCamera = new androidx.camera.lifecycle.LifecycleCamera(lifecycleOwner, cameraUseCaseAdaptor);
            if (cameraUseCaseAdaptor.getUseCases().isEmpty()) {
                lifecycleCamera.suspend();
            }
            registerCamera(lifecycleCamera);
        }
        return lifecycleCamera;
    }

    androidx.camera.lifecycle.LifecycleCamera getLifecycleCamera(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.camera.core.internal.CameraUseCaseAdapter.CameraId cameraId) {
        androidx.camera.lifecycle.LifecycleCamera lifecycleCamera;
        synchronized (this.mLock) {
            lifecycleCamera = this.mCameraMap.get(androidx.camera.lifecycle.LifecycleCameraRepository.Key.create(lifecycleOwner, cameraId));
        }
        return lifecycleCamera;
    }

    java.util.Collection<androidx.camera.lifecycle.LifecycleCamera> getLifecycleCameras() {
        java.util.Collection<androidx.camera.lifecycle.LifecycleCamera> unmodifiableCollection;
        synchronized (this.mLock) {
            unmodifiableCollection = java.util.Collections.unmodifiableCollection(this.mCameraMap.values());
        }
        return unmodifiableCollection;
    }

    void clear() {
        synchronized (this.mLock) {
            java.util.Iterator it = new java.util.HashSet(this.mLifecycleObserverMap.keySet()).iterator();
            while (it.hasNext()) {
                unregisterLifecycle(((androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver) it.next()).getLifecycleOwner());
            }
        }
    }

    private void registerCamera(androidx.camera.lifecycle.LifecycleCamera lifecycleCamera) {
        java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key> hashSet;
        synchronized (this.mLock) {
            androidx.lifecycle.LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            androidx.camera.lifecycle.LifecycleCameraRepository.Key create = androidx.camera.lifecycle.LifecycleCameraRepository.Key.create(lifecycleOwner, lifecycleCamera.getCameraUseCaseAdapter().getCameraId());
            androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            if (lifecycleCameraRepositoryObserver != null) {
                hashSet = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver);
            } else {
                hashSet = new java.util.HashSet<>();
            }
            hashSet.add(create);
            this.mCameraMap.put(create, lifecycleCamera);
            if (lifecycleCameraRepositoryObserver == null) {
                androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver2 = new androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver(lifecycleOwner, this);
                this.mLifecycleObserverMap.put(lifecycleCameraRepositoryObserver2, hashSet);
                lifecycleOwner.getLifecycle().addObserver(lifecycleCameraRepositoryObserver2);
            }
        }
    }

    void unregisterLifecycle(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            if (lifecycleCameraRepositoryObserver == null) {
                return;
            }
            setInactive(lifecycleOwner);
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
            while (it.hasNext()) {
                this.mCameraMap.remove(it.next());
            }
            this.mLifecycleObserverMap.remove(lifecycleCameraRepositoryObserver);
            lifecycleCameraRepositoryObserver.getLifecycleOwner().getLifecycle().removeObserver(lifecycleCameraRepositoryObserver);
        }
    }

    private androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver getLifecycleCameraRepositoryObserver(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            for (androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.mLifecycleObserverMap.keySet()) {
                if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.getLifecycleOwner())) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    void bindToLifecycleCamera(androidx.camera.lifecycle.LifecycleCamera lifecycleCamera, androidx.camera.core.ViewPort viewPort, java.util.Collection<androidx.camera.core.UseCase> useCases) {
        synchronized (this.mLock) {
            androidx.core.util.Preconditions.checkArgument(!useCases.isEmpty());
            androidx.lifecycle.LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(lifecycleOwner)).iterator();
            while (it.hasNext()) {
                androidx.camera.lifecycle.LifecycleCamera lifecycleCamera2 = (androidx.camera.lifecycle.LifecycleCamera) androidx.core.util.Preconditions.checkNotNull(this.mCameraMap.get(it.next()));
                if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.getUseCases().isEmpty()) {
                    throw new java.lang.IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                }
            }
            try {
                lifecycleCamera.getCameraUseCaseAdapter().setViewPort(viewPort);
                lifecycleCamera.bind(useCases);
                if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
                    setActive(lifecycleOwner);
                }
            } catch (androidx.camera.core.internal.CameraUseCaseAdapter.CameraException e) {
                throw new java.lang.IllegalArgumentException(e.getMessage());
            }
        }
    }

    void unbind(java.util.Collection<androidx.camera.core.UseCase> useCases) {
        synchronized (this.mLock) {
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.mCameraMap.keySet().iterator();
            while (it.hasNext()) {
                androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                boolean z = !lifecycleCamera.getUseCases().isEmpty();
                lifecycleCamera.unbind(useCases);
                if (z && lifecycleCamera.getUseCases().isEmpty()) {
                    setInactive(lifecycleCamera.getLifecycleOwner());
                }
            }
        }
    }

    void unbindAll() {
        synchronized (this.mLock) {
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.mCameraMap.keySet().iterator();
            while (it.hasNext()) {
                androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                lifecycleCamera.unbindAll();
                setInactive(lifecycleCamera.getLifecycleOwner());
            }
        }
    }

    void setActive(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            if (hasUseCaseBound(lifecycleOwner)) {
                if (this.mActiveLifecycleOwners.isEmpty()) {
                    this.mActiveLifecycleOwners.push(lifecycleOwner);
                } else {
                    androidx.lifecycle.LifecycleOwner peek = this.mActiveLifecycleOwners.peek();
                    if (!lifecycleOwner.equals(peek)) {
                        suspendUseCases(peek);
                        this.mActiveLifecycleOwners.remove(lifecycleOwner);
                        this.mActiveLifecycleOwners.push(lifecycleOwner);
                    }
                }
                unsuspendUseCases(lifecycleOwner);
            }
        }
    }

    void setInactive(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            this.mActiveLifecycleOwners.remove(lifecycleOwner);
            suspendUseCases(lifecycleOwner);
            if (!this.mActiveLifecycleOwners.isEmpty()) {
                unsuspendUseCases(this.mActiveLifecycleOwners.peek());
            }
        }
    }

    private boolean hasUseCaseBound(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            if (lifecycleCameraRepositoryObserver == null) {
                return false;
            }
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
            while (it.hasNext()) {
                if (!((androidx.camera.lifecycle.LifecycleCamera) androidx.core.util.Preconditions.checkNotNull(this.mCameraMap.get(it.next()))).getUseCases().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    private void suspendUseCases(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(lifecycleOwner)).iterator();
            while (it.hasNext()) {
                ((androidx.camera.lifecycle.LifecycleCamera) androidx.core.util.Preconditions.checkNotNull(this.mCameraMap.get(it.next()))).suspend();
            }
        }
    }

    private void unsuspendUseCases(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(lifecycleOwner)).iterator();
            while (it.hasNext()) {
                androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                if (!((androidx.camera.lifecycle.LifecycleCamera) androidx.core.util.Preconditions.checkNotNull(lifecycleCamera)).getUseCases().isEmpty()) {
                    lifecycleCamera.unsuspend();
                }
            }
        }
    }

    static abstract class Key {
        public abstract androidx.camera.core.internal.CameraUseCaseAdapter.CameraId getCameraId();

        public abstract androidx.lifecycle.LifecycleOwner getLifecycleOwner();

        Key() {
        }

        static androidx.camera.lifecycle.LifecycleCameraRepository.Key create(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.camera.core.internal.CameraUseCaseAdapter.CameraId cameraId) {
            return new androidx.camera.lifecycle.AutoValue_LifecycleCameraRepository_Key(lifecycleOwner, cameraId);
        }
    }

    private static class LifecycleCameraRepositoryObserver implements androidx.lifecycle.LifecycleObserver {
        private final androidx.camera.lifecycle.LifecycleCameraRepository mLifecycleCameraRepository;
        private final androidx.lifecycle.LifecycleOwner mLifecycleOwner;

        LifecycleCameraRepositoryObserver(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository) {
            this.mLifecycleOwner = lifecycleOwner;
            this.mLifecycleCameraRepository = lifecycleCameraRepository;
        }

        androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
            return this.mLifecycleOwner;
        }

        @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
        public void onStart(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.setActive(lifecycleOwner);
        }

        @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP)
        public void onStop(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.setInactive(lifecycleOwner);
        }

        @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
        public void onDestroy(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.unregisterLifecycle(lifecycleOwner);
        }
    }
}
