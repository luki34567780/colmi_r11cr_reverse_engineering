package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandle {
    private static final java.lang.Class[] ACCEPTABLE_CLASSES;
    private static final java.lang.String KEYS = "keys";
    private static final java.lang.String VALUES = "values";
    private final java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?>> mLiveDatas;
    final java.util.Map<java.lang.String, java.lang.Object> mRegular;
    private final androidx.savedstate.SavedStateRegistry.SavedStateProvider mSavedStateProvider;
    final java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> mSavedStateProviders;

    public SavedStateHandle(java.util.Map<java.lang.String, java.lang.Object> initialState) {
        this.mSavedStateProviders = new java.util.HashMap();
        this.mLiveDatas = new java.util.HashMap();
        this.mSavedStateProvider = new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.SavedStateHandle.1
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public android.os.Bundle saveState() {
                for (java.util.Map.Entry entry : new java.util.HashMap(androidx.lifecycle.SavedStateHandle.this.mSavedStateProviders).entrySet()) {
                    androidx.lifecycle.SavedStateHandle.this.set((java.lang.String) entry.getKey(), ((androidx.savedstate.SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
                }
                java.util.Set<java.lang.String> keySet = androidx.lifecycle.SavedStateHandle.this.mRegular.keySet();
                java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(keySet.size());
                java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>(arrayList.size());
                for (java.lang.String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(androidx.lifecycle.SavedStateHandle.this.mRegular.get(str));
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelableArrayList(androidx.lifecycle.SavedStateHandle.KEYS, arrayList);
                bundle.putParcelableArrayList(androidx.lifecycle.SavedStateHandle.VALUES, arrayList2);
                return bundle;
            }
        };
        this.mRegular = new java.util.HashMap(initialState);
    }

    public SavedStateHandle() {
        this.mSavedStateProviders = new java.util.HashMap();
        this.mLiveDatas = new java.util.HashMap();
        this.mSavedStateProvider = new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.SavedStateHandle.1
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public android.os.Bundle saveState() {
                for (java.util.Map.Entry entry : new java.util.HashMap(androidx.lifecycle.SavedStateHandle.this.mSavedStateProviders).entrySet()) {
                    androidx.lifecycle.SavedStateHandle.this.set((java.lang.String) entry.getKey(), ((androidx.savedstate.SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
                }
                java.util.Set<java.lang.String> keySet = androidx.lifecycle.SavedStateHandle.this.mRegular.keySet();
                java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(keySet.size());
                java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>(arrayList.size());
                for (java.lang.String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(androidx.lifecycle.SavedStateHandle.this.mRegular.get(str));
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelableArrayList(androidx.lifecycle.SavedStateHandle.KEYS, arrayList);
                bundle.putParcelableArrayList(androidx.lifecycle.SavedStateHandle.VALUES, arrayList2);
                return bundle;
            }
        };
        this.mRegular = new java.util.HashMap();
    }

    static androidx.lifecycle.SavedStateHandle createHandle(android.os.Bundle restoredState, android.os.Bundle defaultState) {
        if (restoredState == null && defaultState == null) {
            return new androidx.lifecycle.SavedStateHandle();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (defaultState != null) {
            for (java.lang.String str : defaultState.keySet()) {
                hashMap.put(str, defaultState.get(str));
            }
        }
        if (restoredState == null) {
            return new androidx.lifecycle.SavedStateHandle(hashMap);
        }
        java.util.ArrayList parcelableArrayList = restoredState.getParcelableArrayList(KEYS);
        java.util.ArrayList parcelableArrayList2 = restoredState.getParcelableArrayList(VALUES);
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new java.lang.IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashMap.put((java.lang.String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new androidx.lifecycle.SavedStateHandle(hashMap);
    }

    androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.mSavedStateProvider;
    }

    public boolean contains(java.lang.String key) {
        return this.mRegular.containsKey(key);
    }

    public <T> androidx.lifecycle.MutableLiveData<T> getLiveData(java.lang.String key) {
        return getLiveDataInternal(key, false, null);
    }

    public <T> androidx.lifecycle.MutableLiveData<T> getLiveData(java.lang.String key, T initialValue) {
        return getLiveDataInternal(key, true, initialValue);
    }

    private <T> androidx.lifecycle.MutableLiveData<T> getLiveDataInternal(java.lang.String key, boolean hasInitialValue, T initialValue) {
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> savingStateLiveData;
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> savingStateLiveData2 = this.mLiveDatas.get(key);
        if (savingStateLiveData2 != null) {
            return savingStateLiveData2;
        }
        if (this.mRegular.containsKey(key)) {
            savingStateLiveData = new androidx.lifecycle.SavedStateHandle.SavingStateLiveData<>(this, key, this.mRegular.get(key));
        } else if (hasInitialValue) {
            savingStateLiveData = new androidx.lifecycle.SavedStateHandle.SavingStateLiveData<>(this, key, initialValue);
        } else {
            savingStateLiveData = new androidx.lifecycle.SavedStateHandle.SavingStateLiveData<>(this, key);
        }
        this.mLiveDatas.put(key, savingStateLiveData);
        return savingStateLiveData;
    }

    public java.util.Set<java.lang.String> keys() {
        java.util.HashSet hashSet = new java.util.HashSet(this.mRegular.keySet());
        hashSet.addAll(this.mSavedStateProviders.keySet());
        hashSet.addAll(this.mLiveDatas.keySet());
        return hashSet;
    }

    public <T> T get(java.lang.String str) {
        return (T) this.mRegular.get(str);
    }

    public <T> void set(java.lang.String key, T value) {
        validateValue(value);
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> savingStateLiveData = this.mLiveDatas.get(key);
        if (savingStateLiveData != null) {
            savingStateLiveData.setValue(value);
        } else {
            this.mRegular.put(key, value);
        }
    }

    private static void validateValue(java.lang.Object value) {
        if (value == null) {
            return;
        }
        for (java.lang.Class cls : ACCEPTABLE_CLASSES) {
            if (cls.isInstance(value)) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Can't put value with type " + value.getClass() + " into saved state");
    }

    public <T> T remove(java.lang.String str) {
        T t = (T) this.mRegular.remove(str);
        androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?> remove = this.mLiveDatas.remove(str);
        if (remove != null) {
            remove.detach();
        }
        return t;
    }

    public void setSavedStateProvider(java.lang.String key, androidx.savedstate.SavedStateRegistry.SavedStateProvider provider) {
        this.mSavedStateProviders.put(key, provider);
    }

    public void clearSavedStateProvider(java.lang.String key) {
        this.mSavedStateProviders.remove(key);
    }

    static class SavingStateLiveData<T> extends androidx.lifecycle.MutableLiveData<T> {
        private androidx.lifecycle.SavedStateHandle mHandle;
        private java.lang.String mKey;

        SavingStateLiveData(androidx.lifecycle.SavedStateHandle handle, java.lang.String key, T value) {
            super(value);
            this.mKey = key;
            this.mHandle = handle;
        }

        SavingStateLiveData(androidx.lifecycle.SavedStateHandle handle, java.lang.String key) {
            this.mKey = key;
            this.mHandle = handle;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T value) {
            androidx.lifecycle.SavedStateHandle savedStateHandle = this.mHandle;
            if (savedStateHandle != null) {
                savedStateHandle.mRegular.put(this.mKey, value);
            }
            super.setValue(value);
        }

        void detach() {
            this.mHandle = null;
        }
    }

    static {
        java.lang.Class[] clsArr = new java.lang.Class[29];
        clsArr[0] = java.lang.Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = java.lang.Double.TYPE;
        clsArr[3] = double[].class;
        clsArr[4] = java.lang.Integer.TYPE;
        clsArr[5] = int[].class;
        clsArr[6] = java.lang.Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = java.lang.String.class;
        clsArr[9] = java.lang.String[].class;
        clsArr[10] = android.os.Binder.class;
        clsArr[11] = android.os.Bundle.class;
        clsArr[12] = java.lang.Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = java.lang.Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = java.lang.CharSequence.class;
        clsArr[17] = java.lang.CharSequence[].class;
        clsArr[18] = java.util.ArrayList.class;
        clsArr[19] = java.lang.Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = android.os.Parcelable.class;
        clsArr[22] = android.os.Parcelable[].class;
        clsArr[23] = java.io.Serializable.class;
        clsArr[24] = java.lang.Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = android.util.SparseArray.class;
        clsArr[27] = android.os.Build.VERSION.SDK_INT >= 21 ? android.util.Size.class : java.lang.Integer.TYPE;
        clsArr[28] = android.os.Build.VERSION.SDK_INT >= 21 ? android.util.SizeF.class : java.lang.Integer.TYPE;
        ACCEPTABLE_CLASSES = clsArr;
    }
}
