package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.KeyedFactory {
    private static final java.lang.Class<?>[] ANDROID_VIEWMODEL_SIGNATURE = {android.app.Application.class, androidx.lifecycle.SavedStateHandle.class};
    private static final java.lang.Class<?>[] VIEWMODEL_SIGNATURE = {androidx.lifecycle.SavedStateHandle.class};
    private final android.app.Application mApplication;
    private final android.os.Bundle mDefaultArgs;
    private final androidx.lifecycle.ViewModelProvider.Factory mFactory;
    private final androidx.lifecycle.Lifecycle mLifecycle;
    private final androidx.savedstate.SavedStateRegistry mSavedStateRegistry;

    public SavedStateViewModelFactory(android.app.Application application, androidx.savedstate.SavedStateRegistryOwner owner) {
        this(application, owner, null);
    }

    public SavedStateViewModelFactory(android.app.Application application, androidx.savedstate.SavedStateRegistryOwner owner, android.os.Bundle defaultArgs) {
        androidx.lifecycle.ViewModelProvider.Factory newInstanceFactory;
        this.mSavedStateRegistry = owner.getSavedStateRegistry();
        this.mLifecycle = owner.getLifecycle();
        this.mDefaultArgs = defaultArgs;
        this.mApplication = application;
        if (application != null) {
            newInstanceFactory = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.getInstance(application);
        } else {
            newInstanceFactory = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.getInstance();
        }
        this.mFactory = newInstanceFactory;
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.String str, java.lang.Class<T> cls) {
        java.lang.reflect.Constructor findMatchingConstructor;
        T t;
        boolean isAssignableFrom = androidx.lifecycle.AndroidViewModel.class.isAssignableFrom(cls);
        if (isAssignableFrom && this.mApplication != null) {
            findMatchingConstructor = findMatchingConstructor(cls, ANDROID_VIEWMODEL_SIGNATURE);
        } else {
            findMatchingConstructor = findMatchingConstructor(cls, VIEWMODEL_SIGNATURE);
        }
        if (findMatchingConstructor == null) {
            return (T) this.mFactory.create(cls);
        }
        androidx.lifecycle.SavedStateHandleController create = androidx.lifecycle.SavedStateHandleController.create(this.mSavedStateRegistry, this.mLifecycle, str, this.mDefaultArgs);
        if (isAssignableFrom) {
            try {
                android.app.Application application = this.mApplication;
                if (application != null) {
                    t = (T) findMatchingConstructor.newInstance(application, create.getHandle());
                    t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", create);
                    return t;
                }
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.RuntimeException("Failed to access " + cls, e);
            } catch (java.lang.InstantiationException e2) {
                throw new java.lang.RuntimeException("A " + cls + " cannot be instantiated.", e2);
            } catch (java.lang.reflect.InvocationTargetException e3) {
                throw new java.lang.RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
            }
        }
        t = (T) findMatchingConstructor.newInstance(create.getHandle());
        t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", create);
        return t;
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory, androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) create(canonicalName, cls);
    }

    private static <T> java.lang.reflect.Constructor<T> findMatchingConstructor(java.lang.Class<T> cls, java.lang.Class<?>[] clsArr) {
        for (java.lang.Object obj : cls.getConstructors()) {
            java.lang.reflect.Constructor<T> constructor = (java.lang.reflect.Constructor<T>) obj;
            if (java.util.Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    void onRequery(androidx.lifecycle.ViewModel viewModel) {
        androidx.lifecycle.SavedStateHandleController.attachHandleIfNeeded(viewModel, this.mSavedStateRegistry, this.mLifecycle);
    }
}
