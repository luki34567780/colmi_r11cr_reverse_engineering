package skin.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import skin.support.appcompat.R;
import skin.support.content.res.SkinCompatResources;
import skin.support.content.res.SkinCompatVectorResources;

/* loaded from: classes3.dex */
public class SkinCompatToolbar extends Toolbar implements SkinCompatSupportable {
    private SkinCompatBackgroundHelper mBackgroundTintHelper;
    private int mNavigationIconResId;
    private int mSubtitleTextColorResId;
    private int mTitleTextColorResId;

    public SkinCompatToolbar(Context context) {
        this(context, null);
    }

    public SkinCompatToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public SkinCompatToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTitleTextColorResId = 0;
        this.mSubtitleTextColorResId = 0;
        this.mNavigationIconResId = 0;
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = new SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Toolbar, i, 0);
        this.mNavigationIconResId = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_navigationIcon, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_titleTextAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_subtitleTextAppearance, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, R.styleable.SkinTextAppearance);
            this.mTitleTextColorResId = obtainStyledAttributes2.getResourceId(R.styleable.SkinTextAppearance_android_textColor, 0);
            obtainStyledAttributes2.recycle();
        }
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId2, R.styleable.SkinTextAppearance);
            this.mSubtitleTextColorResId = obtainStyledAttributes3.getResourceId(R.styleable.SkinTextAppearance_android_textColor, 0);
            obtainStyledAttributes3.recycle();
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, R.styleable.Toolbar, i, 0);
        if (obtainStyledAttributes4.hasValue(R.styleable.Toolbar_titleTextColor)) {
            this.mTitleTextColorResId = obtainStyledAttributes4.getResourceId(R.styleable.Toolbar_titleTextColor, 0);
        }
        if (obtainStyledAttributes4.hasValue(R.styleable.Toolbar_subtitleTextColor)) {
            this.mSubtitleTextColorResId = obtainStyledAttributes4.getResourceId(R.styleable.Toolbar_subtitleTextColor, 0);
        }
        obtainStyledAttributes4.recycle();
        applyTitleTextColor();
        applySubtitleTextColor();
        applyNavigationIcon();
    }

    private void applyTitleTextColor() {
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mTitleTextColorResId);
        this.mTitleTextColorResId = checkResourceId;
        if (checkResourceId != 0) {
            setTitleTextColor(SkinCompatResources.getColor(getContext(), this.mTitleTextColorResId));
        }
    }

    private void applySubtitleTextColor() {
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mSubtitleTextColorResId);
        this.mSubtitleTextColorResId = checkResourceId;
        if (checkResourceId != 0) {
            setSubtitleTextColor(SkinCompatResources.getColor(getContext(), this.mSubtitleTextColorResId));
        }
    }

    private void applyNavigationIcon() {
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mNavigationIconResId);
        this.mNavigationIconResId = checkResourceId;
        if (checkResourceId != 0) {
            setNavigationIcon(SkinCompatVectorResources.getDrawableCompat(getContext(), this.mNavigationIconResId));
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.onSetBackgroundResource(i);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(int i) {
        super.setNavigationIcon(i);
        this.mNavigationIconResId = i;
        applyNavigationIcon();
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
        applyTitleTextColor();
        applySubtitleTextColor();
        applyNavigationIcon();
    }
}
