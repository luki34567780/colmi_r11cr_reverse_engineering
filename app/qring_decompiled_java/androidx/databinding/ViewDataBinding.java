package androidx.databinding;

/* loaded from: classes.dex */
public abstract class ViewDataBinding extends androidx.databinding.BaseObservable implements androidx.viewbinding.ViewBinding {
    private static final int BINDING_NUMBER_START = 8;
    public static final java.lang.String BINDING_TAG_PREFIX = "binding_";
    private static final androidx.databinding.ViewDataBinding.CreateWeakListener CREATE_LIST_LISTENER;
    private static final androidx.databinding.ViewDataBinding.CreateWeakListener CREATE_LIVE_DATA_LISTENER;
    private static final androidx.databinding.ViewDataBinding.CreateWeakListener CREATE_MAP_LISTENER;
    private static final androidx.databinding.ViewDataBinding.CreateWeakListener CREATE_PROPERTY_LISTENER;
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final androidx.databinding.CallbackRegistry.NotifierCallback<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> REBIND_NOTIFIER;
    private static final int REBOUND = 3;
    private static final android.view.View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER;
    static int SDK_INT;
    private static final boolean USE_CHOREOGRAPHER;
    private static final java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> sReferenceQueue;
    protected final androidx.databinding.DataBindingComponent mBindingComponent;
    private android.view.Choreographer mChoreographer;
    private androidx.databinding.ViewDataBinding mContainingBinding;
    private final android.view.Choreographer.FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private androidx.lifecycle.LifecycleOwner mLifecycleOwner;
    private androidx.databinding.ViewDataBinding.WeakListener[] mLocalFieldObservers;
    private androidx.databinding.ViewDataBinding.OnStartListener mOnStartListener;
    private boolean mPendingRebind;
    private androidx.databinding.CallbackRegistry<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> mRebindCallbacks;
    private boolean mRebindHalted;
    private final java.lang.Runnable mRebindRunnable;
    private final android.view.View mRoot;
    private android.os.Handler mUIThreadHandler;

    private interface CreateWeakListener {
        androidx.databinding.ViewDataBinding.WeakListener create(androidx.databinding.ViewDataBinding viewDataBinding, int i);
    }

    private interface ObservableReference<T> {
        void addListener(T t);

        androidx.databinding.ViewDataBinding.WeakListener<T> getListener();

        void removeListener(T t);

        void setLifecycleOwner(androidx.lifecycle.LifecycleOwner lifecycleOwner);
    }

    protected abstract void executeBindings();

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    protected abstract boolean onFieldChange(int i, java.lang.Object obj, int i2);

    public abstract boolean setVariable(int i, java.lang.Object obj);

    static {
        int i = android.os.Build.VERSION.SDK_INT;
        SDK_INT = i;
        USE_CHOREOGRAPHER = i >= 16;
        CREATE_PROPERTY_LISTENER = new androidx.databinding.ViewDataBinding.CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.1
            @Override // androidx.databinding.ViewDataBinding.CreateWeakListener
            public androidx.databinding.ViewDataBinding.WeakListener create(androidx.databinding.ViewDataBinding viewDataBinding, int i2) {
                return new androidx.databinding.ViewDataBinding.WeakPropertyListener(viewDataBinding, i2).getListener();
            }
        };
        CREATE_LIST_LISTENER = new androidx.databinding.ViewDataBinding.CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.2
            @Override // androidx.databinding.ViewDataBinding.CreateWeakListener
            public androidx.databinding.ViewDataBinding.WeakListener create(androidx.databinding.ViewDataBinding viewDataBinding, int i2) {
                return new androidx.databinding.ViewDataBinding.WeakListListener(viewDataBinding, i2).getListener();
            }
        };
        CREATE_MAP_LISTENER = new androidx.databinding.ViewDataBinding.CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.3
            @Override // androidx.databinding.ViewDataBinding.CreateWeakListener
            public androidx.databinding.ViewDataBinding.WeakListener create(androidx.databinding.ViewDataBinding viewDataBinding, int i2) {
                return new androidx.databinding.ViewDataBinding.WeakMapListener(viewDataBinding, i2).getListener();
            }
        };
        CREATE_LIVE_DATA_LISTENER = new androidx.databinding.ViewDataBinding.CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.4
            @Override // androidx.databinding.ViewDataBinding.CreateWeakListener
            public androidx.databinding.ViewDataBinding.WeakListener create(androidx.databinding.ViewDataBinding viewDataBinding, int i2) {
                return new androidx.databinding.ViewDataBinding.LiveDataListener(viewDataBinding, i2).getListener();
            }
        };
        REBIND_NOTIFIER = new androidx.databinding.CallbackRegistry.NotifierCallback<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void>() { // from class: androidx.databinding.ViewDataBinding.5
            @Override // androidx.databinding.CallbackRegistry.NotifierCallback
            public void onNotifyCallback(androidx.databinding.OnRebindCallback onRebindCallback, androidx.databinding.ViewDataBinding viewDataBinding, int i2, java.lang.Void r4) {
                if (i2 == 1) {
                    if (onRebindCallback.onPreBind(viewDataBinding)) {
                        return;
                    }
                    viewDataBinding.mRebindHalted = true;
                } else if (i2 == 2) {
                    onRebindCallback.onCanceled(viewDataBinding);
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    onRebindCallback.onBound(viewDataBinding);
                }
            }
        };
        sReferenceQueue = new java.lang.ref.ReferenceQueue<>();
        if (android.os.Build.VERSION.SDK_INT < 19) {
            ROOT_REATTACHED_LISTENER = null;
        } else {
            ROOT_REATTACHED_LISTENER = new android.view.View.OnAttachStateChangeListener() { // from class: androidx.databinding.ViewDataBinding.6
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(android.view.View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(android.view.View view) {
                    androidx.databinding.ViewDataBinding.getBinding(view).mRebindRunnable.run();
                    view.removeOnAttachStateChangeListener(this);
                }
            };
        }
    }

    protected ViewDataBinding(androidx.databinding.DataBindingComponent dataBindingComponent, android.view.View view, int i) {
        this.mRebindRunnable = new java.lang.Runnable() { // from class: androidx.databinding.ViewDataBinding.7
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    androidx.databinding.ViewDataBinding.this.mPendingRebind = false;
                }
                androidx.databinding.ViewDataBinding.processReferenceQueue();
                if (android.os.Build.VERSION.SDK_INT >= 19 && !androidx.databinding.ViewDataBinding.this.mRoot.isAttachedToWindow()) {
                    androidx.databinding.ViewDataBinding.this.mRoot.removeOnAttachStateChangeListener(androidx.databinding.ViewDataBinding.ROOT_REATTACHED_LISTENER);
                    androidx.databinding.ViewDataBinding.this.mRoot.addOnAttachStateChangeListener(androidx.databinding.ViewDataBinding.ROOT_REATTACHED_LISTENER);
                } else {
                    androidx.databinding.ViewDataBinding.this.executePendingBindings();
                }
            }
        };
        this.mPendingRebind = false;
        this.mRebindHalted = false;
        this.mBindingComponent = dataBindingComponent;
        this.mLocalFieldObservers = new androidx.databinding.ViewDataBinding.WeakListener[i];
        this.mRoot = view;
        if (android.os.Looper.myLooper() == null) {
            throw new java.lang.IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (USE_CHOREOGRAPHER) {
            this.mChoreographer = android.view.Choreographer.getInstance();
            this.mFrameCallback = new android.view.Choreographer.FrameCallback() { // from class: androidx.databinding.ViewDataBinding.8
                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j) {
                    androidx.databinding.ViewDataBinding.this.mRebindRunnable.run();
                }
            };
        } else {
            this.mFrameCallback = null;
            this.mUIThreadHandler = new android.os.Handler(android.os.Looper.myLooper());
        }
    }

    protected ViewDataBinding(java.lang.Object obj, android.view.View view, int i) {
        this(checkAndCastToBindingComponent(obj), view, i);
    }

    private static androidx.databinding.DataBindingComponent checkAndCastToBindingComponent(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof androidx.databinding.DataBindingComponent)) {
            throw new java.lang.IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
        }
        return (androidx.databinding.DataBindingComponent) obj;
    }

    protected void setRootTag(android.view.View view) {
        view.setTag(androidx.databinding.library.R.id.dataBinding, this);
    }

    protected void setRootTag(android.view.View[] viewArr) {
        for (android.view.View view : viewArr) {
            view.setTag(androidx.databinding.library.R.id.dataBinding, this);
        }
    }

    public static int getBuildSdkInt() {
        return SDK_INT;
    }

    public void setLifecycleOwner(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.LifecycleOwner lifecycleOwner2 = this.mLifecycleOwner;
        if (lifecycleOwner2 == lifecycleOwner) {
            return;
        }
        if (lifecycleOwner2 != null) {
            lifecycleOwner2.getLifecycle().removeObserver(this.mOnStartListener);
        }
        this.mLifecycleOwner = lifecycleOwner;
        if (lifecycleOwner != null) {
            if (this.mOnStartListener == null) {
                this.mOnStartListener = new androidx.databinding.ViewDataBinding.OnStartListener();
            }
            lifecycleOwner.getLifecycle().addObserver(this.mOnStartListener);
        }
        for (androidx.databinding.ViewDataBinding.WeakListener weakListener : this.mLocalFieldObservers) {
            if (weakListener != null) {
                weakListener.setLifecycleOwner(lifecycleOwner);
            }
        }
    }

    public androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
        return this.mLifecycleOwner;
    }

    public void addOnRebindCallback(androidx.databinding.OnRebindCallback onRebindCallback) {
        if (this.mRebindCallbacks == null) {
            this.mRebindCallbacks = new androidx.databinding.CallbackRegistry<>(REBIND_NOTIFIER);
        }
        this.mRebindCallbacks.add(onRebindCallback);
    }

    public void removeOnRebindCallback(androidx.databinding.OnRebindCallback onRebindCallback) {
        androidx.databinding.CallbackRegistry<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> callbackRegistry = this.mRebindCallbacks;
        if (callbackRegistry != null) {
            callbackRegistry.remove(onRebindCallback);
        }
    }

    public void executePendingBindings() {
        androidx.databinding.ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding == null) {
            executeBindingsInternal();
        } else {
            viewDataBinding.executePendingBindings();
        }
    }

    private void executeBindingsInternal() {
        if (this.mIsExecutingPendingBindings) {
            requestRebind();
            return;
        }
        if (hasPendingBindings()) {
            this.mIsExecutingPendingBindings = true;
            this.mRebindHalted = false;
            androidx.databinding.CallbackRegistry<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> callbackRegistry = this.mRebindCallbacks;
            if (callbackRegistry != null) {
                callbackRegistry.notifyCallbacks(this, 1, null);
                if (this.mRebindHalted) {
                    this.mRebindCallbacks.notifyCallbacks(this, 2, null);
                }
            }
            if (!this.mRebindHalted) {
                executeBindings();
                androidx.databinding.CallbackRegistry<androidx.databinding.OnRebindCallback, androidx.databinding.ViewDataBinding, java.lang.Void> callbackRegistry2 = this.mRebindCallbacks;
                if (callbackRegistry2 != null) {
                    callbackRegistry2.notifyCallbacks(this, 3, null);
                }
            }
            this.mIsExecutingPendingBindings = false;
        }
    }

    protected static void executeBindingsOn(androidx.databinding.ViewDataBinding viewDataBinding) {
        viewDataBinding.executeBindingsInternal();
    }

    void forceExecuteBindings() {
        executeBindings();
    }

    public void unbind() {
        for (androidx.databinding.ViewDataBinding.WeakListener weakListener : this.mLocalFieldObservers) {
            if (weakListener != null) {
                weakListener.unregister();
            }
        }
    }

    static androidx.databinding.ViewDataBinding getBinding(android.view.View view) {
        if (view != null) {
            return (androidx.databinding.ViewDataBinding) view.getTag(androidx.databinding.library.R.id.dataBinding);
        }
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.mRoot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFieldChange(int i, java.lang.Object obj, int i2) {
        if (!this.mInLiveDataRegisterObserver && onFieldChange(i, obj, i2)) {
            requestRebind();
        }
    }

    protected boolean unregisterFrom(int i) {
        androidx.databinding.ViewDataBinding.WeakListener weakListener = this.mLocalFieldObservers[i];
        if (weakListener != null) {
            return weakListener.unregister();
        }
        return false;
    }

    protected void requestRebind() {
        androidx.databinding.ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding != null) {
            viewDataBinding.requestRebind();
            return;
        }
        androidx.lifecycle.LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
        if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
            synchronized (this) {
                if (this.mPendingRebind) {
                    return;
                }
                this.mPendingRebind = true;
                if (USE_CHOREOGRAPHER) {
                    this.mChoreographer.postFrameCallback(this.mFrameCallback);
                } else {
                    this.mUIThreadHandler.post(this.mRebindRunnable);
                }
            }
        }
    }

    protected java.lang.Object getObservedField(int i) {
        androidx.databinding.ViewDataBinding.WeakListener weakListener = this.mLocalFieldObservers[i];
        if (weakListener == null) {
            return null;
        }
        return weakListener.getTarget();
    }

    private boolean updateRegistration(int i, java.lang.Object obj, androidx.databinding.ViewDataBinding.CreateWeakListener createWeakListener) {
        if (obj == null) {
            return unregisterFrom(i);
        }
        androidx.databinding.ViewDataBinding.WeakListener weakListener = this.mLocalFieldObservers[i];
        if (weakListener == null) {
            registerTo(i, obj, createWeakListener);
            return true;
        }
        if (weakListener.getTarget() == obj) {
            return false;
        }
        unregisterFrom(i);
        registerTo(i, obj, createWeakListener);
        return true;
    }

    protected boolean updateRegistration(int i, androidx.databinding.Observable observable) {
        return updateRegistration(i, observable, CREATE_PROPERTY_LISTENER);
    }

    protected boolean updateRegistration(int i, androidx.databinding.ObservableList observableList) {
        return updateRegistration(i, observableList, CREATE_LIST_LISTENER);
    }

    protected boolean updateRegistration(int i, androidx.databinding.ObservableMap observableMap) {
        return updateRegistration(i, observableMap, CREATE_MAP_LISTENER);
    }

    protected boolean updateLiveDataRegistration(int i, androidx.lifecycle.LiveData<?> liveData) {
        this.mInLiveDataRegisterObserver = true;
        try {
            return updateRegistration(i, liveData, CREATE_LIVE_DATA_LISTENER);
        } finally {
            this.mInLiveDataRegisterObserver = false;
        }
    }

    protected void ensureBindingComponentIsNotNull(java.lang.Class<?> cls) {
        if (this.mBindingComponent != null) {
            return;
        }
        throw new java.lang.IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    protected void registerTo(int i, java.lang.Object obj, androidx.databinding.ViewDataBinding.CreateWeakListener createWeakListener) {
        if (obj == null) {
            return;
        }
        androidx.databinding.ViewDataBinding.WeakListener weakListener = this.mLocalFieldObservers[i];
        if (weakListener == null) {
            weakListener = createWeakListener.create(this, i);
            this.mLocalFieldObservers[i] = weakListener;
            androidx.lifecycle.LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            if (lifecycleOwner != null) {
                weakListener.setLifecycleOwner(lifecycleOwner);
            }
        }
        weakListener.setTarget(obj);
    }

    protected static androidx.databinding.ViewDataBinding bind(java.lang.Object obj, android.view.View view, int i) {
        return androidx.databinding.DataBindingUtil.bind(checkAndCastToBindingComponent(obj), view, i);
    }

    protected static java.lang.Object[] mapBindings(androidx.databinding.DataBindingComponent dataBindingComponent, android.view.View view, int i, androidx.databinding.ViewDataBinding.IncludedLayouts includedLayouts, android.util.SparseIntArray sparseIntArray) {
        java.lang.Object[] objArr = new java.lang.Object[i];
        mapBindings(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        return objArr;
    }

    protected static boolean parse(java.lang.String str, boolean z) {
        return str == null ? z : java.lang.Boolean.parseBoolean(str);
    }

    protected static byte parse(java.lang.String str, byte b) {
        try {
            return java.lang.Byte.parseByte(str);
        } catch (java.lang.NumberFormatException unused) {
            return b;
        }
    }

    protected static short parse(java.lang.String str, short s) {
        try {
            return java.lang.Short.parseShort(str);
        } catch (java.lang.NumberFormatException unused) {
            return s;
        }
    }

    protected static int parse(java.lang.String str, int i) {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return i;
        }
    }

    protected static long parse(java.lang.String str, long j) {
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused) {
            return j;
        }
    }

    protected static float parse(java.lang.String str, float f) {
        try {
            return java.lang.Float.parseFloat(str);
        } catch (java.lang.NumberFormatException unused) {
            return f;
        }
    }

    protected static double parse(java.lang.String str, double d) {
        try {
            return java.lang.Double.parseDouble(str);
        } catch (java.lang.NumberFormatException unused) {
            return d;
        }
    }

    protected static char parse(java.lang.String str, char c) {
        return (str == null || str.isEmpty()) ? c : str.charAt(0);
    }

    protected static int getColorFromResource(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return view.getContext().getColor(i);
        }
        return view.getResources().getColor(i);
    }

    protected static android.content.res.ColorStateList getColorStateListFromResource(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return view.getContext().getColorStateList(i);
        }
        return view.getResources().getColorStateList(i);
    }

    protected static android.graphics.drawable.Drawable getDrawableFromResource(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return view.getContext().getDrawable(i);
        }
        return view.getResources().getDrawable(i);
    }

    protected static <T> T getFromArray(T[] tArr, int i) {
        if (tArr == null || i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    protected static <T> void setTo(T[] tArr, int i, T t) {
        if (tArr == null || i < 0 || i >= tArr.length) {
            return;
        }
        tArr[i] = t;
    }

    protected static boolean getFromArray(boolean[] zArr, int i) {
        if (zArr == null || i < 0 || i >= zArr.length) {
            return false;
        }
        return zArr[i];
    }

    protected static void setTo(boolean[] zArr, int i, boolean z) {
        if (zArr == null || i < 0 || i >= zArr.length) {
            return;
        }
        zArr[i] = z;
    }

    protected static byte getFromArray(byte[] bArr, int i) {
        if (bArr == null || i < 0 || i >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i];
    }

    protected static void setTo(byte[] bArr, int i, byte b) {
        if (bArr == null || i < 0 || i >= bArr.length) {
            return;
        }
        bArr[i] = b;
    }

    protected static short getFromArray(short[] sArr, int i) {
        if (sArr == null || i < 0 || i >= sArr.length) {
            return (short) 0;
        }
        return sArr[i];
    }

    protected static void setTo(short[] sArr, int i, short s) {
        if (sArr == null || i < 0 || i >= sArr.length) {
            return;
        }
        sArr[i] = s;
    }

    protected static char getFromArray(char[] cArr, int i) {
        if (cArr == null || i < 0 || i >= cArr.length) {
            return (char) 0;
        }
        return cArr[i];
    }

    protected static void setTo(char[] cArr, int i, char c) {
        if (cArr == null || i < 0 || i >= cArr.length) {
            return;
        }
        cArr[i] = c;
    }

    protected static int getFromArray(int[] iArr, int i) {
        if (iArr == null || i < 0 || i >= iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    protected static void setTo(int[] iArr, int i, int i2) {
        if (iArr == null || i < 0 || i >= iArr.length) {
            return;
        }
        iArr[i] = i2;
    }

    protected static long getFromArray(long[] jArr, int i) {
        if (jArr == null || i < 0 || i >= jArr.length) {
            return 0L;
        }
        return jArr[i];
    }

    protected static void setTo(long[] jArr, int i, long j) {
        if (jArr == null || i < 0 || i >= jArr.length) {
            return;
        }
        jArr[i] = j;
    }

    protected static float getFromArray(float[] fArr, int i) {
        if (fArr == null || i < 0 || i >= fArr.length) {
            return 0.0f;
        }
        return fArr[i];
    }

    protected static void setTo(float[] fArr, int i, float f) {
        if (fArr == null || i < 0 || i >= fArr.length) {
            return;
        }
        fArr[i] = f;
    }

    protected static double getFromArray(double[] dArr, int i) {
        if (dArr == null || i < 0 || i >= dArr.length) {
            return 0.0d;
        }
        return dArr[i];
    }

    protected static void setTo(double[] dArr, int i, double d) {
        if (dArr == null || i < 0 || i >= dArr.length) {
            return;
        }
        dArr[i] = d;
    }

    protected static <T> T getFromList(java.util.List<T> list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    protected static <T> void setTo(java.util.List<T> list, int i, T t) {
        if (list == null || i < 0 || i >= list.size()) {
            return;
        }
        list.set(i, t);
    }

    protected static <T> T getFromList(android.util.SparseArray<T> sparseArray, int i) {
        if (sparseArray == null || i < 0) {
            return null;
        }
        return sparseArray.get(i);
    }

    protected static <T> void setTo(android.util.SparseArray<T> sparseArray, int i, T t) {
        if (sparseArray == null || i < 0 || i >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i, t);
    }

    protected static <T> T getFromList(android.util.LongSparseArray<T> longSparseArray, int i) {
        if (longSparseArray == null || i < 0) {
            return null;
        }
        return longSparseArray.get(i);
    }

    protected static <T> void setTo(android.util.LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray == null || i < 0 || i >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i, t);
    }

    protected static <T> T getFromList(androidx.collection.LongSparseArray<T> longSparseArray, int i) {
        if (longSparseArray == null || i < 0) {
            return null;
        }
        return longSparseArray.get(i);
    }

    protected static <T> void setTo(androidx.collection.LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray == null || i < 0 || i >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i, t);
    }

    protected static boolean getFromList(android.util.SparseBooleanArray sparseBooleanArray, int i) {
        if (sparseBooleanArray == null || i < 0) {
            return false;
        }
        return sparseBooleanArray.get(i);
    }

    protected static void setTo(android.util.SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        if (sparseBooleanArray == null || i < 0 || i >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i, z);
    }

    protected static int getFromList(android.util.SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray == null || i < 0) {
            return 0;
        }
        return sparseIntArray.get(i);
    }

    protected static void setTo(android.util.SparseIntArray sparseIntArray, int i, int i2) {
        if (sparseIntArray == null || i < 0 || i >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i, i2);
    }

    protected static long getFromList(android.util.SparseLongArray sparseLongArray, int i) {
        if (sparseLongArray == null || i < 0) {
            return 0L;
        }
        return sparseLongArray.get(i);
    }

    protected static void setTo(android.util.SparseLongArray sparseLongArray, int i, long j) {
        if (sparseLongArray == null || i < 0 || i >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i, j);
    }

    protected static <K, T> T getFrom(java.util.Map<K, T> map, K k) {
        if (map == null) {
            return null;
        }
        return map.get(k);
    }

    protected static <K, T> void setTo(java.util.Map<K, T> map, K k, T t) {
        if (map == null) {
            return;
        }
        map.put(k, t);
    }

    protected static void setBindingInverseListener(androidx.databinding.ViewDataBinding viewDataBinding, androidx.databinding.InverseBindingListener inverseBindingListener, androidx.databinding.ViewDataBinding.PropertyChangedInverseListener propertyChangedInverseListener) {
        if (inverseBindingListener != propertyChangedInverseListener) {
            if (inverseBindingListener != null) {
                viewDataBinding.removeOnPropertyChangedCallback((androidx.databinding.ViewDataBinding.PropertyChangedInverseListener) inverseBindingListener);
            }
            if (propertyChangedInverseListener != null) {
                viewDataBinding.addOnPropertyChangedCallback(propertyChangedInverseListener);
            }
        }
    }

    protected static int safeUnbox(java.lang.Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    protected static long safeUnbox(java.lang.Long l) {
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    protected static short safeUnbox(java.lang.Short sh) {
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    protected static byte safeUnbox(java.lang.Byte b) {
        if (b == null) {
            return (byte) 0;
        }
        return b.byteValue();
    }

    protected static char safeUnbox(java.lang.Character ch) {
        if (ch == null) {
            return (char) 0;
        }
        return ch.charValue();
    }

    protected static double safeUnbox(java.lang.Double d) {
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    protected static float safeUnbox(java.lang.Float f) {
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    protected static boolean safeUnbox(java.lang.Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected void setContainedBinding(androidx.databinding.ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.mContainingBinding = this;
        }
    }

    protected static java.lang.Object[] mapBindings(androidx.databinding.DataBindingComponent dataBindingComponent, android.view.View[] viewArr, int i, androidx.databinding.ViewDataBinding.IncludedLayouts includedLayouts, android.util.SparseIntArray sparseIntArray) {
        java.lang.Object[] objArr = new java.lang.Object[i];
        for (android.view.View view : viewArr) {
            mapBindings(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        }
        return objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void mapBindings(androidx.databinding.DataBindingComponent r16, android.view.View r17, java.lang.Object[] r18, androidx.databinding.ViewDataBinding.IncludedLayouts r19, android.util.SparseIntArray r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.mapBindings(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$IncludedLayouts, android.util.SparseIntArray, boolean):void");
    }

    private static int findIncludeIndex(java.lang.String str, int i, androidx.databinding.ViewDataBinding.IncludedLayouts includedLayouts, int i2) {
        java.lang.CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        java.lang.String[] strArr = includedLayouts.layouts[i2];
        int length = strArr.length;
        while (i < length) {
            if (android.text.TextUtils.equals(subSequence, strArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static int findLastMatching(android.view.ViewGroup viewGroup, int i) {
        java.lang.String str = (java.lang.String) viewGroup.getChildAt(i).getTag();
        java.lang.String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            android.view.View childAt = viewGroup.getChildAt(i2);
            java.lang.String str2 = childAt.getTag() instanceof java.lang.String ? (java.lang.String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i;
                }
                if (isNumeric(str2, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    private static boolean isNumeric(java.lang.String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!java.lang.Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static int parseTagInt(java.lang.String str, int i) {
        int i2 = 0;
        while (i < str.length()) {
            i2 = (i2 * 10) + (str.charAt(i) - '0');
            i++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processReferenceQueue() {
        while (true) {
            java.lang.ref.Reference<? extends androidx.databinding.ViewDataBinding> poll = sReferenceQueue.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof androidx.databinding.ViewDataBinding.WeakListener) {
                ((androidx.databinding.ViewDataBinding.WeakListener) poll).unregister();
            }
        }
    }

    protected static <T extends androidx.databinding.ViewDataBinding> T inflateInternal(android.view.LayoutInflater layoutInflater, int i, android.view.ViewGroup viewGroup, boolean z, java.lang.Object obj) {
        return (T) androidx.databinding.DataBindingUtil.inflate(layoutInflater, i, viewGroup, z, checkAndCastToBindingComponent(obj));
    }

    private static class WeakListener<T> extends java.lang.ref.WeakReference<androidx.databinding.ViewDataBinding> {
        protected final int mLocalFieldId;
        private final androidx.databinding.ViewDataBinding.ObservableReference<T> mObservable;
        private T mTarget;

        public WeakListener(androidx.databinding.ViewDataBinding viewDataBinding, int i, androidx.databinding.ViewDataBinding.ObservableReference<T> observableReference) {
            super(viewDataBinding, androidx.databinding.ViewDataBinding.sReferenceQueue);
            this.mLocalFieldId = i;
            this.mObservable = observableReference;
        }

        public void setLifecycleOwner(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
            this.mObservable.setLifecycleOwner(lifecycleOwner);
        }

        public void setTarget(T t) {
            unregister();
            this.mTarget = t;
            if (t != null) {
                this.mObservable.addListener(t);
            }
        }

        public boolean unregister() {
            boolean z;
            T t = this.mTarget;
            if (t != null) {
                this.mObservable.removeListener(t);
                z = true;
            } else {
                z = false;
            }
            this.mTarget = null;
            return z;
        }

        public T getTarget() {
            return this.mTarget;
        }

        protected androidx.databinding.ViewDataBinding getBinder() {
            androidx.databinding.ViewDataBinding viewDataBinding = (androidx.databinding.ViewDataBinding) get();
            if (viewDataBinding == null) {
                unregister();
            }
            return viewDataBinding;
        }
    }

    private static class WeakPropertyListener extends androidx.databinding.Observable.OnPropertyChangedCallback implements androidx.databinding.ViewDataBinding.ObservableReference<androidx.databinding.Observable> {
        final androidx.databinding.ViewDataBinding.WeakListener<androidx.databinding.Observable> mListener;

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void setLifecycleOwner(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        }

        public WeakPropertyListener(androidx.databinding.ViewDataBinding viewDataBinding, int i) {
            this.mListener = new androidx.databinding.ViewDataBinding.WeakListener<>(viewDataBinding, i, this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public androidx.databinding.ViewDataBinding.WeakListener<androidx.databinding.Observable> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void addListener(androidx.databinding.Observable observable) {
            observable.addOnPropertyChangedCallback(this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void removeListener(androidx.databinding.Observable observable) {
            observable.removeOnPropertyChangedCallback(this);
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable observable, int i) {
            androidx.databinding.ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && this.mListener.getTarget() == observable) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, observable, i);
            }
        }
    }

    private static class WeakListListener extends androidx.databinding.ObservableList.OnListChangedCallback implements androidx.databinding.ViewDataBinding.ObservableReference<androidx.databinding.ObservableList> {
        final androidx.databinding.ViewDataBinding.WeakListener<androidx.databinding.ObservableList> mListener;

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void setLifecycleOwner(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        }

        public WeakListListener(androidx.databinding.ViewDataBinding viewDataBinding, int i) {
            this.mListener = new androidx.databinding.ViewDataBinding.WeakListener<>(viewDataBinding, i, this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public androidx.databinding.ViewDataBinding.WeakListener<androidx.databinding.ObservableList> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void addListener(androidx.databinding.ObservableList observableList) {
            observableList.addOnListChangedCallback(this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void removeListener(androidx.databinding.ObservableList observableList) {
            observableList.removeOnListChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onChanged(androidx.databinding.ObservableList observableList) {
            androidx.databinding.ObservableList target;
            androidx.databinding.ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && (target = this.mListener.getTarget()) == observableList) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, target, 0);
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeChanged(androidx.databinding.ObservableList observableList, int i, int i2) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeInserted(androidx.databinding.ObservableList observableList, int i, int i2) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeMoved(androidx.databinding.ObservableList observableList, int i, int i2, int i3) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeRemoved(androidx.databinding.ObservableList observableList, int i, int i2) {
            onChanged(observableList);
        }
    }

    private static class WeakMapListener extends androidx.databinding.ObservableMap.OnMapChangedCallback implements androidx.databinding.ViewDataBinding.ObservableReference<androidx.databinding.ObservableMap> {
        final androidx.databinding.ViewDataBinding.WeakListener<androidx.databinding.ObservableMap> mListener;

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void setLifecycleOwner(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        }

        public WeakMapListener(androidx.databinding.ViewDataBinding viewDataBinding, int i) {
            this.mListener = new androidx.databinding.ViewDataBinding.WeakListener<>(viewDataBinding, i, this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public androidx.databinding.ViewDataBinding.WeakListener<androidx.databinding.ObservableMap> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void addListener(androidx.databinding.ObservableMap observableMap) {
            observableMap.addOnMapChangedCallback(this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void removeListener(androidx.databinding.ObservableMap observableMap) {
            observableMap.removeOnMapChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableMap.OnMapChangedCallback
        public void onMapChanged(androidx.databinding.ObservableMap observableMap, java.lang.Object obj) {
            androidx.databinding.ViewDataBinding binder = this.mListener.getBinder();
            if (binder == null || observableMap != this.mListener.getTarget()) {
                return;
            }
            binder.handleFieldChange(this.mListener.mLocalFieldId, observableMap, 0);
        }
    }

    private static class LiveDataListener implements androidx.lifecycle.Observer, androidx.databinding.ViewDataBinding.ObservableReference<androidx.lifecycle.LiveData<?>> {
        androidx.lifecycle.LifecycleOwner mLifecycleOwner;
        final androidx.databinding.ViewDataBinding.WeakListener<androidx.lifecycle.LiveData<?>> mListener;

        public LiveDataListener(androidx.databinding.ViewDataBinding viewDataBinding, int i) {
            this.mListener = new androidx.databinding.ViewDataBinding.WeakListener<>(viewDataBinding, i, this);
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void setLifecycleOwner(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.LiveData<?> target = this.mListener.getTarget();
            if (target != null) {
                if (this.mLifecycleOwner != null) {
                    target.removeObserver(this);
                }
                if (lifecycleOwner != null) {
                    target.observe(lifecycleOwner, this);
                }
            }
            this.mLifecycleOwner = lifecycleOwner;
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public androidx.databinding.ViewDataBinding.WeakListener<androidx.lifecycle.LiveData<?>> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void addListener(androidx.lifecycle.LiveData<?> liveData) {
            androidx.lifecycle.LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            if (lifecycleOwner != null) {
                liveData.observe(lifecycleOwner, this);
            }
        }

        @Override // androidx.databinding.ViewDataBinding.ObservableReference
        public void removeListener(androidx.lifecycle.LiveData<?> liveData) {
            liveData.removeObserver(this);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(java.lang.Object obj) {
            androidx.databinding.ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, this.mListener.getTarget(), 0);
            }
        }
    }

    protected static class IncludedLayouts {
        public final int[][] indexes;
        public final int[][] layoutIds;
        public final java.lang.String[][] layouts;

        public IncludedLayouts(int i) {
            this.layouts = new java.lang.String[i][];
            this.indexes = new int[i][];
            this.layoutIds = new int[i][];
        }

        public void setIncludes(int i, java.lang.String[] strArr, int[] iArr, int[] iArr2) {
            this.layouts[i] = strArr;
            this.indexes[i] = iArr;
            this.layoutIds[i] = iArr2;
        }
    }

    protected static abstract class PropertyChangedInverseListener extends androidx.databinding.Observable.OnPropertyChangedCallback implements androidx.databinding.InverseBindingListener {
        final int mPropertyId;

        public PropertyChangedInverseListener(int i) {
            this.mPropertyId = i;
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable observable, int i) {
            if (i == this.mPropertyId || i == 0) {
                onChange();
            }
        }
    }

    static class OnStartListener implements androidx.lifecycle.LifecycleObserver {
        final java.lang.ref.WeakReference<androidx.databinding.ViewDataBinding> mBinding;

        private OnStartListener(androidx.databinding.ViewDataBinding viewDataBinding) {
            this.mBinding = new java.lang.ref.WeakReference<>(viewDataBinding);
        }

        @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
        public void onStart() {
            androidx.databinding.ViewDataBinding viewDataBinding = this.mBinding.get();
            if (viewDataBinding != null) {
                viewDataBinding.executePendingBindings();
            }
        }
    }
}
