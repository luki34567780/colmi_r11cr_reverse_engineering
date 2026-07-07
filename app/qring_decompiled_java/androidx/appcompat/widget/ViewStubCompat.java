package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class ViewStubCompat extends android.view.View {
    private androidx.appcompat.widget.ViewStubCompat.OnInflateListener mInflateListener;
    private int mInflatedId;
    private java.lang.ref.WeakReference<android.view.View> mInflatedViewRef;
    private android.view.LayoutInflater mInflater;
    private int mLayoutResource;

    public interface OnInflateListener {
        void onInflate(androidx.appcompat.widget.ViewStubCompat viewStubCompat, android.view.View view);
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
    }

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLayoutResource = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.ViewStubCompat, i, 0);
        this.mInflatedId = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ViewStubCompat_android_inflatedId, -1);
        this.mLayoutResource = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.mInflatedId;
    }

    public void setInflatedId(int i) {
        this.mInflatedId = i;
    }

    public int getLayoutResource() {
        return this.mLayoutResource;
    }

    public void setLayoutResource(int i) {
        this.mLayoutResource = i;
    }

    public void setLayoutInflater(android.view.LayoutInflater layoutInflater) {
        this.mInflater = layoutInflater;
    }

    public android.view.LayoutInflater getLayoutInflater() {
        return this.mInflater;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        java.lang.ref.WeakReference<android.view.View> weakReference = this.mInflatedViewRef;
        if (weakReference != null) {
            android.view.View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new java.lang.IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            inflate();
        }
    }

    public android.view.View inflate() {
        android.view.ViewParent parent = getParent();
        if (parent instanceof android.view.ViewGroup) {
            if (this.mLayoutResource != 0) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                android.view.LayoutInflater layoutInflater = this.mInflater;
                if (layoutInflater == null) {
                    layoutInflater = android.view.LayoutInflater.from(getContext());
                }
                android.view.View inflate = layoutInflater.inflate(this.mLayoutResource, viewGroup, false);
                int i = this.mInflatedId;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.mInflatedViewRef = new java.lang.ref.WeakReference<>(inflate);
                androidx.appcompat.widget.ViewStubCompat.OnInflateListener onInflateListener = this.mInflateListener;
                if (onInflateListener != null) {
                    onInflateListener.onInflate(this, inflate);
                }
                return inflate;
            }
            throw new java.lang.IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new java.lang.IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public void setOnInflateListener(androidx.appcompat.widget.ViewStubCompat.OnInflateListener onInflateListener) {
        this.mInflateListener = onInflateListener;
    }
}
