package skin.support.widget;

/* loaded from: classes3.dex */
public class SkinCompatSpinner extends androidx.appcompat.widget.AppCompatSpinner implements skin.support.widget.SkinCompatSupportable {
    private static final int[] ATTRS_ANDROID_SPINNERMODE = {android.R.attr.spinnerMode};
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final java.lang.String TAG = "SkinCompatSpinner";
    private skin.support.widget.SkinCompatBackgroundHelper mBackgroundTintHelper;
    private int mPopupBackgroundResId;

    public SkinCompatSpinner(android.content.Context context) {
        this(context, (android.util.AttributeSet) null);
    }

    public SkinCompatSpinner(android.content.Context context, int i) {
        this(context, null, skin.support.appcompat.R.attr.spinnerStyle, i);
    }

    public SkinCompatSpinner(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, skin.support.appcompat.R.attr.spinnerStyle);
    }

    public SkinCompatSpinner(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public SkinCompatSpinner(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r1 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SkinCompatSpinner(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8, r9, r10)
            r10 = 0
            r5.mPopupBackgroundResId = r10
            int[] r0 = skin.support.appcompat.R.styleable.Spinner
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r7, r0, r8, r10)
            android.content.Context r1 = r5.getPopupContext()
            if (r1 == 0) goto L5e
            r1 = -1
            r2 = 1
            if (r9 != r1) goto L47
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r1 < r3) goto L46
            r1 = 0
            int[] r3 = skin.support.widget.SkinCompatSpinner.ATTRS_ANDROID_SPINNERMODE     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r3, r8, r10)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            boolean r6 = r1.hasValue(r10)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            if (r6 == 0) goto L2d
            int r9 = r1.getInt(r10, r10)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
        L2d:
            if (r1 == 0) goto L47
        L2f:
            r1.recycle()
            goto L47
        L33:
            r6 = move-exception
            goto L40
        L35:
            r6 = move-exception
            java.lang.String r3 = skin.support.widget.SkinCompatSpinner.TAG     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "Could not read android:spinnerMode"
            android.util.Log.i(r3, r4, r6)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L47
            goto L2f
        L40:
            if (r1 == 0) goto L45
            r1.recycle()
        L45:
            throw r6
        L46:
            r9 = 1
        L47:
            if (r9 != r2) goto L5e
            android.content.Context r6 = r5.getPopupContext()
            int[] r9 = skin.support.appcompat.R.styleable.Spinner
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r9, r8, r10)
            int r9 = skin.support.appcompat.R.styleable.Spinner_android_popupBackground
            int r9 = r6.getResourceId(r9, r10)
            r5.mPopupBackgroundResId = r9
            r6.recycle()
        L5e:
            r0.recycle()
            skin.support.widget.SkinCompatBackgroundHelper r6 = new skin.support.widget.SkinCompatBackgroundHelper
            r6.<init>(r5)
            r5.mBackgroundTintHelper = r6
            r6.loadFromAttributes(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: skin.support.widget.SkinCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner, android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        super.setPopupBackgroundResource(i);
        this.mPopupBackgroundResId = i;
        applyPopupBackground();
    }

    private void applyPopupBackground() {
        int checkResourceId = skin.support.widget.SkinCompatHelper.checkResourceId(this.mPopupBackgroundResId);
        this.mPopupBackgroundResId = checkResourceId;
        if (checkResourceId != 0) {
            setPopupBackgroundDrawable(skin.support.content.res.SkinCompatVectorResources.getDrawableCompat(getContext(), this.mPopupBackgroundResId));
        }
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        skin.support.widget.SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
        applyPopupBackground();
    }
}
