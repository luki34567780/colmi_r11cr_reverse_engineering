package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class AppCompatToggleButton extends android.widget.ToggleButton {
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    public AppCompatToggleButton(android.content.Context context) {
        this(context, null);
    }

    public AppCompatToggleButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(this, getContext());
        androidx.appcompat.widget.AppCompatTextHelper appCompatTextHelper = new androidx.appcompat.widget.AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.loadFromAttributes(attributeSet, i);
    }
}
