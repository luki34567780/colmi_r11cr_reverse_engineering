package androidx.databinding;

/* loaded from: classes.dex */
public class ViewStubProxy {
    private androidx.databinding.ViewDataBinding mContainingBinding;
    private android.view.ViewStub.OnInflateListener mOnInflateListener;
    private android.view.ViewStub.OnInflateListener mProxyListener;
    private android.view.View mRoot;
    private androidx.databinding.ViewDataBinding mViewDataBinding;
    private android.view.ViewStub mViewStub;

    public ViewStubProxy(android.view.ViewStub viewStub) {
        android.view.ViewStub.OnInflateListener onInflateListener = new android.view.ViewStub.OnInflateListener() { // from class: androidx.databinding.ViewStubProxy.1
            @Override // android.view.ViewStub.OnInflateListener
            public void onInflate(android.view.ViewStub viewStub2, android.view.View view) {
                androidx.databinding.ViewStubProxy.this.mRoot = view;
                androidx.databinding.ViewStubProxy viewStubProxy = androidx.databinding.ViewStubProxy.this;
                viewStubProxy.mViewDataBinding = androidx.databinding.DataBindingUtil.bind(viewStubProxy.mContainingBinding.mBindingComponent, view, viewStub2.getLayoutResource());
                androidx.databinding.ViewStubProxy.this.mViewStub = null;
                if (androidx.databinding.ViewStubProxy.this.mOnInflateListener != null) {
                    androidx.databinding.ViewStubProxy.this.mOnInflateListener.onInflate(viewStub2, view);
                    androidx.databinding.ViewStubProxy.this.mOnInflateListener = null;
                }
                androidx.databinding.ViewStubProxy.this.mContainingBinding.invalidateAll();
                androidx.databinding.ViewStubProxy.this.mContainingBinding.forceExecuteBindings();
            }
        };
        this.mProxyListener = onInflateListener;
        this.mViewStub = viewStub;
        viewStub.setOnInflateListener(onInflateListener);
    }

    public void setContainingBinding(androidx.databinding.ViewDataBinding viewDataBinding) {
        this.mContainingBinding = viewDataBinding;
    }

    public boolean isInflated() {
        return this.mRoot != null;
    }

    public android.view.View getRoot() {
        return this.mRoot;
    }

    public androidx.databinding.ViewDataBinding getBinding() {
        return this.mViewDataBinding;
    }

    public android.view.ViewStub getViewStub() {
        return this.mViewStub;
    }

    public void setOnInflateListener(android.view.ViewStub.OnInflateListener onInflateListener) {
        if (this.mViewStub != null) {
            this.mOnInflateListener = onInflateListener;
        }
    }
}
