package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatCardView extends androidx.cardview.widget.CardView implements skin.support.widget.SkinCompatSupportable {
    private static final int[] COLOR_BACKGROUND_ATTR = {android.R.attr.colorBackground};
    private int mBackgroundColorResId;
    private int mThemeColorBackgroundResId;

    public SkinCompatCardView(android.content.Context context) {
        this(context, null);
    }

    public SkinCompatCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinCompatCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mThemeColorBackgroundResId = 0;
        this.mBackgroundColorResId = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, skin.support.cardview.R.styleable.CardView, i, skin.support.cardview.R.style.CardView);
        if (obtainStyledAttributes.hasValue(skin.support.cardview.R.styleable.CardView_cardBackgroundColor)) {
            this.mBackgroundColorResId = obtainStyledAttributes.getResourceId(skin.support.cardview.R.styleable.CardView_cardBackgroundColor, 0);
        } else {
            android.content.res.TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            this.mThemeColorBackgroundResId = obtainStyledAttributes2.getResourceId(0, 0);
            obtainStyledAttributes2.recycle();
        }
        obtainStyledAttributes.recycle();
        applyBackgroundColorResource();
    }

    private void applyBackgroundColorResource() {
        int color;
        this.mBackgroundColorResId = skin.support.widget.SkinCompatHelper.checkResourceId(this.mBackgroundColorResId);
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.mThemeColorBackgroundResId);
        this.mThemeColorBackgroundResId = checkResourceId;
        if (this.mBackgroundColorResId != 0) {
            setCardBackgroundColor(skin.support.content.res.SkinCompatResources.getColorStateList(getContext(), this.mBackgroundColorResId));
            return;
        }
        if (checkResourceId != 0) {
            float[] fArr = new float[3];
            android.graphics.Color.colorToHSV(skin.support.content.res.SkinCompatResources.getColor(getContext(), this.mThemeColorBackgroundResId), fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(skin.support.cardview.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(skin.support.cardview.R.color.cardview_dark_background);
            }
            setCardBackgroundColor(android.content.res.ColorStateList.valueOf(color));
        }
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        applyBackgroundColorResource();
    }
}
