package skin.support.design.widget;

/* loaded from: classes3.dex */
public class SkinMaterialTabLayout extends com.google.android.material.tabs.TabLayout implements skin.support.widget.SkinCompatSupportable {
    private int mTabIndicatorColorResId;
    private int mTabSelectedTextColorResId;
    private int mTabTextColorsResId;

    public SkinMaterialTabLayout(android.content.Context context) {
        this(context, null);
    }

    public SkinMaterialTabLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinMaterialTabLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTabIndicatorColorResId = 0;
        this.mTabTextColorsResId = 0;
        this.mTabSelectedTextColorResId = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, skin.support.design.R.styleable.TabLayout, i, 0);
        this.mTabIndicatorColorResId = obtainStyledAttributes.getResourceId(skin.support.design.R.styleable.TabLayout_tabIndicatorColor, 0);
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(obtainStyledAttributes.getResourceId(skin.support.design.R.styleable.TabLayout_tabTextAppearance, skin.support.design.R.style.TextAppearance_Design_Tab), skin.support.design.R.styleable.SkinTextAppearance);
        try {
            this.mTabTextColorsResId = obtainStyledAttributes2.getResourceId(skin.support.design.R.styleable.SkinTextAppearance_android_textColor, 0);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(skin.support.design.R.styleable.TabLayout_tabTextColor)) {
                this.mTabTextColorsResId = obtainStyledAttributes.getResourceId(skin.support.design.R.styleable.TabLayout_tabTextColor, 0);
            }
            if (obtainStyledAttributes.hasValue(skin.support.design.R.styleable.TabLayout_tabSelectedTextColor)) {
                this.mTabSelectedTextColorResId = obtainStyledAttributes.getResourceId(skin.support.design.R.styleable.TabLayout_tabSelectedTextColor, 0);
            }
            obtainStyledAttributes.recycle();
            applySkin();
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.mTabIndicatorColorResId);
        this.mTabIndicatorColorResId = checkResourceId;
        if (checkResourceId != 0) {
            setSelectedTabIndicatorColor(skin.support.content.res.SkinCompatResources.getColor(getContext(), this.mTabIndicatorColorResId));
        }
        int checkResourceId2 = skin.support.widget.SkinCompatHelper.checkResourceId(this.mTabTextColorsResId);
        this.mTabTextColorsResId = checkResourceId2;
        if (checkResourceId2 != 0) {
            setTabTextColors(skin.support.content.res.SkinCompatResources.getColorStateList(getContext(), this.mTabTextColorsResId));
        }
        int checkResourceId3 = skin.support.widget.SkinCompatHelper.checkResourceId(this.mTabSelectedTextColorResId);
        this.mTabSelectedTextColorResId = checkResourceId3;
        if (checkResourceId3 != 0) {
            int color = skin.support.content.res.SkinCompatResources.getColor(getContext(), this.mTabSelectedTextColorResId);
            if (getTabTextColors() != null) {
                setTabTextColors(getTabTextColors().getDefaultColor(), color);
            }
        }
    }
}
