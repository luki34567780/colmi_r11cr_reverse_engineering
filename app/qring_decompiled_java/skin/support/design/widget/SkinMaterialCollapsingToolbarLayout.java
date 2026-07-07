package skin.support.design.widget;

/* loaded from: classes3.dex */
public class SkinMaterialCollapsingToolbarLayout extends com.google.android.material.appbar.CollapsingToolbarLayout implements skin.support.widget.SkinCompatSupportable {
    private skin.support.widget.SkinCompatBackgroundHelper mBackgroundTintHelper;
    private int mContentScrimResId;
    private int mStatusBarScrimResId;

    public SkinMaterialCollapsingToolbarLayout(android.content.Context context) {
        this(context, null);
    }

    public SkinMaterialCollapsingToolbarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinMaterialCollapsingToolbarLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContentScrimResId = 0;
        this.mStatusBarScrimResId = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, skin.support.design.R.styleable.CollapsingToolbarLayout, i, skin.support.design.R.style.Widget_Design_CollapsingToolbar);
        this.mContentScrimResId = obtainStyledAttributes.getResourceId(skin.support.design.R.styleable.CollapsingToolbarLayout_contentScrim, 0);
        this.mStatusBarScrimResId = obtainStyledAttributes.getResourceId(skin.support.design.R.styleable.CollapsingToolbarLayout_statusBarScrim, 0);
        obtainStyledAttributes.recycle();
        applyContentScrimResource();
        applyStatusBarScrimResource();
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = new skin.support.widget.SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, 0);
    }

    private void applyStatusBarScrimResource() {
        android.graphics.drawable.Drawable drawableCompat;
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.mStatusBarScrimResId);
        this.mStatusBarScrimResId = checkResourceId;
        if (checkResourceId == 0 || (drawableCompat = skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(getContext(), this.mStatusBarScrimResId)) == null) {
            return;
        }
        setStatusBarScrim(drawableCompat);
    }

    private void applyContentScrimResource() {
        android.graphics.drawable.Drawable drawableCompat;
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.mContentScrimResId);
        this.mContentScrimResId = checkResourceId;
        if (checkResourceId == 0 || (drawableCompat = skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(getContext(), this.mContentScrimResId)) == null) {
            return;
        }
        setContentScrim(drawableCompat);
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        applyContentScrimResource();
        applyStatusBarScrimResource();
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
    }
}
