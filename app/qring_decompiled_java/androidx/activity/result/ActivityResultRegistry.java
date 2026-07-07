package androidx.activity.result;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final java.lang.String LOG_TAG = "ActivityResultRegistry";
    private java.util.Random mRandom = new java.util.Random();
    private final java.util.Map<java.lang.Integer, java.lang.String> mRcToKey = new java.util.HashMap();
    final java.util.Map<java.lang.String, java.lang.Integer> mKeyToRc = new java.util.HashMap();
    private final java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.LifecycleContainer> mKeyToLifecycleContainers = new java.util.HashMap();
    java.util.ArrayList<java.lang.String> mLaunchedKeys = new java.util.ArrayList<>();
    final transient java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.CallbackAndContract<?>> mKeyToCallback = new java.util.HashMap();
    final java.util.Map<java.lang.String, java.lang.Object> mParsedPendingResults = new java.util.HashMap();
    final android.os.Bundle mPendingResults = new android.os.Bundle();

    public abstract <I, O> void onLaunch(int requestCode, androidx.activity.result.contract.ActivityResultContract<I, O> contract, I input, androidx.core.app.ActivityOptionsCompat options);

    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> register(final java.lang.String key, final androidx.lifecycle.LifecycleOwner lifecycleOwner, final androidx.activity.result.contract.ActivityResultContract<I, O> contract, final androidx.activity.result.ActivityResultCallback<O> callback) {
        androidx.lifecycle.Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
            throw new java.lang.IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
        }
        final int registerKey = registerKey(key);
        androidx.activity.result.ActivityResultRegistry.LifecycleContainer lifecycleContainer = this.mKeyToLifecycleContainers.get(key);
        if (lifecycleContainer == null) {
            lifecycleContainer = new androidx.activity.result.ActivityResultRegistry.LifecycleContainer(lifecycle);
        }
        lifecycleContainer.addObserver(new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                if (androidx.lifecycle.Lifecycle.Event.ON_START.equals(event)) {
                    androidx.activity.result.ActivityResultRegistry.this.mKeyToCallback.put(key, new androidx.activity.result.ActivityResultRegistry.CallbackAndContract<>(callback, contract));
                    if (androidx.activity.result.ActivityResultRegistry.this.mParsedPendingResults.containsKey(key)) {
                        java.lang.Object obj = androidx.activity.result.ActivityResultRegistry.this.mParsedPendingResults.get(key);
                        androidx.activity.result.ActivityResultRegistry.this.mParsedPendingResults.remove(key);
                        callback.onActivityResult(obj);
                    }
                    androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) androidx.activity.result.ActivityResultRegistry.this.mPendingResults.getParcelable(key);
                    if (activityResult != null) {
                        androidx.activity.result.ActivityResultRegistry.this.mPendingResults.remove(key);
                        callback.onActivityResult(contract.parseResult(activityResult.getResultCode(), activityResult.getData()));
                        return;
                    }
                    return;
                }
                if (androidx.lifecycle.Lifecycle.Event.ON_STOP.equals(event)) {
                    androidx.activity.result.ActivityResultRegistry.this.mKeyToCallback.remove(key);
                } else if (androidx.lifecycle.Lifecycle.Event.ON_DESTROY.equals(event)) {
                    androidx.activity.result.ActivityResultRegistry.this.unregister(key);
                }
            }
        });
        this.mKeyToLifecycleContainers.put(key, lifecycleContainer);
        return new androidx.activity.result.ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.2
            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I input, androidx.core.app.ActivityOptionsCompat options) {
                androidx.activity.result.ActivityResultRegistry.this.mLaunchedKeys.add(key);
                java.lang.Integer num = androidx.activity.result.ActivityResultRegistry.this.mKeyToRc.get(key);
                androidx.activity.result.ActivityResultRegistry.this.onLaunch(num != null ? num.intValue() : registerKey, contract, input, options);
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                androidx.activity.result.ActivityResultRegistry.this.unregister(key);
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public androidx.activity.result.contract.ActivityResultContract<I, ?> getContract() {
                return contract;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> register(final java.lang.String key, final androidx.activity.result.contract.ActivityResultContract<I, O> contract, final androidx.activity.result.ActivityResultCallback<O> callback) {
        final int registerKey = registerKey(key);
        this.mKeyToCallback.put(key, new androidx.activity.result.ActivityResultRegistry.CallbackAndContract<>(callback, contract));
        if (this.mParsedPendingResults.containsKey(key)) {
            java.lang.Object obj = this.mParsedPendingResults.get(key);
            this.mParsedPendingResults.remove(key);
            callback.onActivityResult(obj);
        }
        androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) this.mPendingResults.getParcelable(key);
        if (activityResult != null) {
            this.mPendingResults.remove(key);
            callback.onActivityResult(contract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new androidx.activity.result.ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.3
            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I input, androidx.core.app.ActivityOptionsCompat options) {
                androidx.activity.result.ActivityResultRegistry.this.mLaunchedKeys.add(key);
                java.lang.Integer num = androidx.activity.result.ActivityResultRegistry.this.mKeyToRc.get(key);
                androidx.activity.result.ActivityResultRegistry.this.onLaunch(num != null ? num.intValue() : registerKey, contract, input, options);
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                androidx.activity.result.ActivityResultRegistry.this.unregister(key);
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public androidx.activity.result.contract.ActivityResultContract<I, ?> getContract() {
                return contract;
            }
        };
    }

    final void unregister(java.lang.String key) {
        java.lang.Integer remove;
        if (!this.mLaunchedKeys.contains(key) && (remove = this.mKeyToRc.remove(key)) != null) {
            this.mRcToKey.remove(remove);
        }
        this.mKeyToCallback.remove(key);
        if (this.mParsedPendingResults.containsKey(key)) {
            android.util.Log.w(LOG_TAG, "Dropping pending result for request " + key + ": " + this.mParsedPendingResults.get(key));
            this.mParsedPendingResults.remove(key);
        }
        if (this.mPendingResults.containsKey(key)) {
            android.util.Log.w(LOG_TAG, "Dropping pending result for request " + key + ": " + this.mPendingResults.getParcelable(key));
            this.mPendingResults.remove(key);
        }
        androidx.activity.result.ActivityResultRegistry.LifecycleContainer lifecycleContainer = this.mKeyToLifecycleContainers.get(key);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
            this.mKeyToLifecycleContainers.remove(key);
        }
    }

    public final void onSaveInstanceState(android.os.Bundle outState) {
        outState.putIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, new java.util.ArrayList<>(this.mKeyToRc.values()));
        outState.putStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, new java.util.ArrayList<>(this.mKeyToRc.keySet()));
        outState.putStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, new java.util.ArrayList<>(this.mLaunchedKeys));
        outState.putBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS, (android.os.Bundle) this.mPendingResults.clone());
        outState.putSerializable(KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT, this.mRandom);
    }

    public final void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return;
        }
        java.util.ArrayList<java.lang.Integer> integerArrayList = savedInstanceState.getIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS);
        java.util.ArrayList<java.lang.String> stringArrayList = savedInstanceState.getStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.mLaunchedKeys = savedInstanceState.getStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS);
        this.mRandom = (java.util.Random) savedInstanceState.getSerializable(KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT);
        this.mPendingResults.putAll(savedInstanceState.getBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS));
        for (int i = 0; i < stringArrayList.size(); i++) {
            java.lang.String str = stringArrayList.get(i);
            if (this.mKeyToRc.containsKey(str)) {
                java.lang.Integer remove = this.mKeyToRc.remove(str);
                if (!this.mPendingResults.containsKey(str)) {
                    this.mRcToKey.remove(remove);
                }
            }
            bindRcKey(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    public final boolean dispatchResult(int requestCode, int resultCode, android.content.Intent data) {
        java.lang.String str = this.mRcToKey.get(java.lang.Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        this.mLaunchedKeys.remove(str);
        doDispatch(str, resultCode, data, this.mKeyToCallback.get(str));
        return true;
    }

    public final <O> boolean dispatchResult(int requestCode, O result) {
        java.lang.String str = this.mRcToKey.get(java.lang.Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        this.mLaunchedKeys.remove(str);
        androidx.activity.result.ActivityResultRegistry.CallbackAndContract<?> callbackAndContract = this.mKeyToCallback.get(str);
        if (callbackAndContract == null || callbackAndContract.mCallback == null) {
            this.mPendingResults.remove(str);
            this.mParsedPendingResults.put(str, result);
            return true;
        }
        callbackAndContract.mCallback.onActivityResult(result);
        return true;
    }

    private <O> void doDispatch(java.lang.String str, int i, android.content.Intent intent, androidx.activity.result.ActivityResultRegistry.CallbackAndContract<O> callbackAndContract) {
        if (callbackAndContract != null && callbackAndContract.mCallback != null) {
            callbackAndContract.mCallback.onActivityResult(callbackAndContract.mContract.parseResult(i, intent));
        } else {
            this.mParsedPendingResults.remove(str);
            this.mPendingResults.putParcelable(str, new androidx.activity.result.ActivityResult(i, intent));
        }
    }

    private int registerKey(java.lang.String key) {
        java.lang.Integer num = this.mKeyToRc.get(key);
        if (num != null) {
            return num.intValue();
        }
        int generateRandomNumber = generateRandomNumber();
        bindRcKey(generateRandomNumber, key);
        return generateRandomNumber;
    }

    private int generateRandomNumber() {
        int nextInt = this.mRandom.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.mRcToKey.containsKey(java.lang.Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.mRandom.nextInt(2147418112);
        }
    }

    private void bindRcKey(int rc, java.lang.String key) {
        this.mRcToKey.put(java.lang.Integer.valueOf(rc), key);
        this.mKeyToRc.put(key, java.lang.Integer.valueOf(rc));
    }

    private static class CallbackAndContract<O> {
        final androidx.activity.result.ActivityResultCallback<O> mCallback;
        final androidx.activity.result.contract.ActivityResultContract<?, O> mContract;

        CallbackAndContract(androidx.activity.result.ActivityResultCallback<O> callback, androidx.activity.result.contract.ActivityResultContract<?, O> contract) {
            this.mCallback = callback;
            this.mContract = contract;
        }
    }

    private static class LifecycleContainer {
        final androidx.lifecycle.Lifecycle mLifecycle;
        private final java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> mObservers = new java.util.ArrayList<>();

        LifecycleContainer(androidx.lifecycle.Lifecycle lifecycle) {
            this.mLifecycle = lifecycle;
        }

        void addObserver(androidx.lifecycle.LifecycleEventObserver observer) {
            this.mLifecycle.addObserver(observer);
            this.mObservers.add(observer);
        }

        void clearObservers() {
            java.util.Iterator<androidx.lifecycle.LifecycleEventObserver> it = this.mObservers.iterator();
            while (it.hasNext()) {
                this.mLifecycle.removeObserver(it.next());
            }
            this.mObservers.clear();
        }
    }
}
