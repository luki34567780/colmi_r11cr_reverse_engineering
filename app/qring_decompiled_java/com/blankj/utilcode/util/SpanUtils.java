package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class SpanUtils {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_TOP = 3;
    private static final int COLOR_DEFAULT = -16777217;
    private static final java.lang.String LINE_SEPARATOR = java.lang.System.getProperty("line.separator");
    private int alignImage;
    private int alignLine;
    private android.text.Layout.Alignment alignment;
    private int backgroundColor;
    private float blurRadius;
    private int bulletColor;
    private int bulletGapWidth;
    private int bulletRadius;
    private android.text.style.ClickableSpan clickSpan;
    private int first;
    private int flag;
    private java.lang.String fontFamily;
    private int fontSize;
    private boolean fontSizeIsDp;
    private int foregroundColor;
    private android.graphics.Bitmap imageBitmap;
    private android.graphics.drawable.Drawable imageDrawable;
    private int imageResourceId;
    private android.net.Uri imageUri;
    private boolean isBold;
    private boolean isBoldItalic;
    private boolean isCreated;
    private boolean isItalic;
    private boolean isStrikethrough;
    private boolean isSubscript;
    private boolean isSuperscript;
    private boolean isUnderline;
    private int lineHeight;
    private com.blankj.utilcode.util.SpanUtils.SerializableSpannableStringBuilder mBuilder;
    private java.lang.CharSequence mText;
    private android.widget.TextView mTextView;
    private int mType;
    private final int mTypeCharSequence;
    private final int mTypeImage;
    private final int mTypeSpace;
    private float proportion;
    private int quoteColor;
    private int quoteGapWidth;
    private int rest;
    private android.graphics.Shader shader;
    private int shadowColor;
    private float shadowDx;
    private float shadowDy;
    private float shadowRadius;
    private int spaceColor;
    private int spaceSize;
    private java.lang.Object[] spans;
    private int stripeWidth;
    private android.graphics.BlurMaskFilter.Blur style;
    private android.graphics.Typeface typeface;
    private java.lang.String url;
    private int verticalAlign;
    private float xProportion;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Align {
    }

    public static com.blankj.utilcode.util.SpanUtils with(android.widget.TextView textView) {
        return new com.blankj.utilcode.util.SpanUtils(textView);
    }

    private SpanUtils(android.widget.TextView textView) {
        this();
        this.mTextView = textView;
    }

    public SpanUtils() {
        this.mTypeCharSequence = 0;
        this.mTypeImage = 1;
        this.mTypeSpace = 2;
        this.mBuilder = new com.blankj.utilcode.util.SpanUtils.SerializableSpannableStringBuilder();
        this.mText = "";
        this.mType = -1;
        setDefault();
    }

    private void setDefault() {
        this.flag = 33;
        this.foregroundColor = COLOR_DEFAULT;
        this.backgroundColor = COLOR_DEFAULT;
        this.lineHeight = -1;
        this.quoteColor = COLOR_DEFAULT;
        this.first = -1;
        this.bulletColor = COLOR_DEFAULT;
        this.fontSize = -1;
        this.proportion = -1.0f;
        this.xProportion = -1.0f;
        this.isStrikethrough = false;
        this.isUnderline = false;
        this.isSuperscript = false;
        this.isSubscript = false;
        this.isBold = false;
        this.isItalic = false;
        this.isBoldItalic = false;
        this.fontFamily = null;
        this.typeface = null;
        this.alignment = null;
        this.verticalAlign = -1;
        this.clickSpan = null;
        this.url = null;
        this.blurRadius = -1.0f;
        this.shader = null;
        this.shadowRadius = -1.0f;
        this.spans = null;
        this.imageBitmap = null;
        this.imageDrawable = null;
        this.imageUri = null;
        this.imageResourceId = -1;
        this.spaceSize = -1;
    }

    public com.blankj.utilcode.util.SpanUtils setFlag(int i) {
        this.flag = i;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setForegroundColor(int i) {
        this.foregroundColor = i;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setBackgroundColor(int i) {
        this.backgroundColor = i;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setLineHeight(int i) {
        return setLineHeight(i, 2);
    }

    public com.blankj.utilcode.util.SpanUtils setLineHeight(int i, int i2) {
        this.lineHeight = i;
        this.alignLine = i2;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setQuoteColor(int i) {
        return setQuoteColor(i, 2, 2);
    }

    public com.blankj.utilcode.util.SpanUtils setQuoteColor(int i, int i2, int i3) {
        this.quoteColor = i;
        this.stripeWidth = i2;
        this.quoteGapWidth = i3;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setLeadingMargin(int i, int i2) {
        this.first = i;
        this.rest = i2;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setBullet(int i) {
        return setBullet(0, 3, i);
    }

    public com.blankj.utilcode.util.SpanUtils setBullet(int i, int i2, int i3) {
        this.bulletColor = i;
        this.bulletRadius = i2;
        this.bulletGapWidth = i3;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setFontSize(int i) {
        return setFontSize(i, false);
    }

    public com.blankj.utilcode.util.SpanUtils setFontSize(int i, boolean z) {
        this.fontSize = i;
        this.fontSizeIsDp = z;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setFontProportion(float f) {
        this.proportion = f;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setFontXProportion(float f) {
        this.xProportion = f;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setStrikethrough() {
        this.isStrikethrough = true;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setUnderline() {
        this.isUnderline = true;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setSuperscript() {
        this.isSuperscript = true;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setSubscript() {
        this.isSubscript = true;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setBold() {
        this.isBold = true;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setItalic() {
        this.isItalic = true;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setBoldItalic() {
        this.isBoldItalic = true;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setFontFamily(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'fontFamily' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        this.fontFamily = str;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setTypeface(android.graphics.Typeface typeface) {
        java.util.Objects.requireNonNull(typeface, "Argument 'typeface' of type Typeface (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        this.typeface = typeface;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setHorizontalAlign(android.text.Layout.Alignment alignment) {
        java.util.Objects.requireNonNull(alignment, "Argument 'alignment' of type Alignment (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        this.alignment = alignment;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setVerticalAlign(int i) {
        this.verticalAlign = i;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setClickSpan(android.text.style.ClickableSpan clickableSpan) {
        java.util.Objects.requireNonNull(clickableSpan, "Argument 'clickSpan' of type ClickableSpan (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        setMovementMethodIfNeed();
        this.clickSpan = clickableSpan;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setClickSpan(final int i, final boolean z, final android.view.View.OnClickListener onClickListener) {
        setMovementMethodIfNeed();
        this.clickSpan = new android.text.style.ClickableSpan() { // from class: com.blankj.utilcode.util.SpanUtils.1
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(android.text.TextPaint textPaint) {
                java.util.Objects.requireNonNull(textPaint, "Argument 'paint' of type TextPaint (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
                textPaint.setColor(i);
                textPaint.setUnderlineText(z);
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(android.view.View view) {
                java.util.Objects.requireNonNull(view, "Argument 'widget' of type View (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
                android.view.View.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }
        };
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setUrl(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'url' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        setMovementMethodIfNeed();
        this.url = str;
        return this;
    }

    private void setMovementMethodIfNeed() {
        android.widget.TextView textView = this.mTextView;
        if (textView == null || textView.getMovementMethod() != null) {
            return;
        }
        this.mTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public com.blankj.utilcode.util.SpanUtils setBlur(float f, android.graphics.BlurMaskFilter.Blur blur) {
        this.blurRadius = f;
        this.style = blur;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setShader(android.graphics.Shader shader) {
        java.util.Objects.requireNonNull(shader, "Argument 'shader' of type Shader (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        this.shader = shader;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setShadow(float f, float f2, float f3, int i) {
        this.shadowRadius = f;
        this.shadowDx = f2;
        this.shadowDy = f3;
        this.shadowColor = i;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils setSpans(java.lang.Object... objArr) {
        java.util.Objects.requireNonNull(objArr, "Argument 'spans' of type Object[] (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        if (objArr.length > 0) {
            this.spans = objArr;
        }
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils append(java.lang.CharSequence charSequence) {
        java.util.Objects.requireNonNull(charSequence, "Argument 'text' of type CharSequence (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        apply(0);
        this.mText = charSequence;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils appendLine() {
        apply(0);
        this.mText = LINE_SEPARATOR;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils appendLine(java.lang.CharSequence charSequence) {
        java.util.Objects.requireNonNull(charSequence, "Argument 'text' of type CharSequence (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        apply(0);
        this.mText = ((java.lang.Object) charSequence) + LINE_SEPARATOR;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils appendImage(android.graphics.Bitmap bitmap) {
        java.util.Objects.requireNonNull(bitmap, "Argument 'bitmap' of type Bitmap (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return appendImage(bitmap, 0);
    }

    public com.blankj.utilcode.util.SpanUtils appendImage(android.graphics.Bitmap bitmap, int i) {
        java.util.Objects.requireNonNull(bitmap, "Argument 'bitmap' of type Bitmap (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        apply(1);
        this.imageBitmap = bitmap;
        this.alignImage = i;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils appendImage(android.graphics.drawable.Drawable drawable) {
        java.util.Objects.requireNonNull(drawable, "Argument 'drawable' of type Drawable (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return appendImage(drawable, 0);
    }

    public com.blankj.utilcode.util.SpanUtils appendImage(android.graphics.drawable.Drawable drawable, int i) {
        java.util.Objects.requireNonNull(drawable, "Argument 'drawable' of type Drawable (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        apply(1);
        this.imageDrawable = drawable;
        this.alignImage = i;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils appendImage(android.net.Uri uri) {
        java.util.Objects.requireNonNull(uri, "Argument 'uri' of type Uri (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return appendImage(uri, 0);
    }

    public com.blankj.utilcode.util.SpanUtils appendImage(android.net.Uri uri, int i) {
        java.util.Objects.requireNonNull(uri, "Argument 'uri' of type Uri (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        apply(1);
        this.imageUri = uri;
        this.alignImage = i;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils appendImage(int i) {
        return appendImage(i, 0);
    }

    public com.blankj.utilcode.util.SpanUtils appendImage(int i, int i2) {
        apply(1);
        this.imageResourceId = i;
        this.alignImage = i2;
        return this;
    }

    public com.blankj.utilcode.util.SpanUtils appendSpace(int i) {
        return appendSpace(i, 0);
    }

    public com.blankj.utilcode.util.SpanUtils appendSpace(int i, int i2) {
        apply(2);
        this.spaceSize = i;
        this.spaceColor = i2;
        return this;
    }

    private void apply(int i) {
        applyLast();
        this.mType = i;
    }

    public android.text.SpannableStringBuilder get() {
        return this.mBuilder;
    }

    public android.text.SpannableStringBuilder create() {
        applyLast();
        android.widget.TextView textView = this.mTextView;
        if (textView != null) {
            textView.setText(this.mBuilder);
        }
        this.isCreated = true;
        return this.mBuilder;
    }

    private void applyLast() {
        if (this.isCreated) {
            return;
        }
        int i = this.mType;
        if (i == 0) {
            updateCharCharSequence();
        } else if (i == 1) {
            updateImage();
        } else if (i == 2) {
            updateSpace();
        }
        setDefault();
    }

    private void updateCharCharSequence() {
        if (this.mText.length() == 0) {
            return;
        }
        int length = this.mBuilder.length();
        if (length == 0 && this.lineHeight != -1) {
            this.mBuilder.append((java.lang.CharSequence) java.lang.Character.toString((char) 2)).append((java.lang.CharSequence) "\n").setSpan(new android.text.style.AbsoluteSizeSpan(0), 0, 2, 33);
            length = 2;
        }
        this.mBuilder.append(this.mText);
        int length2 = this.mBuilder.length();
        if (this.verticalAlign != -1) {
            this.mBuilder.setSpan(new com.blankj.utilcode.util.SpanUtils.VerticalAlignSpan(this.verticalAlign), length, length2, this.flag);
        }
        if (this.foregroundColor != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.foregroundColor), length, length2, this.flag);
        }
        if (this.backgroundColor != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new android.text.style.BackgroundColorSpan(this.backgroundColor), length, length2, this.flag);
        }
        if (this.first != -1) {
            this.mBuilder.setSpan(new android.text.style.LeadingMarginSpan.Standard(this.first, this.rest), length, length2, this.flag);
        }
        int i = this.quoteColor;
        if (i != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new com.blankj.utilcode.util.SpanUtils.CustomQuoteSpan(i, this.stripeWidth, this.quoteGapWidth), length, length2, this.flag);
        }
        int i2 = this.bulletColor;
        if (i2 != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new com.blankj.utilcode.util.SpanUtils.CustomBulletSpan(i2, this.bulletRadius, this.bulletGapWidth), length, length2, this.flag);
        }
        if (this.fontSize != -1) {
            this.mBuilder.setSpan(new android.text.style.AbsoluteSizeSpan(this.fontSize, this.fontSizeIsDp), length, length2, this.flag);
        }
        if (this.proportion != -1.0f) {
            this.mBuilder.setSpan(new android.text.style.RelativeSizeSpan(this.proportion), length, length2, this.flag);
        }
        if (this.xProportion != -1.0f) {
            this.mBuilder.setSpan(new android.text.style.ScaleXSpan(this.xProportion), length, length2, this.flag);
        }
        int i3 = this.lineHeight;
        if (i3 != -1) {
            this.mBuilder.setSpan(new com.blankj.utilcode.util.SpanUtils.CustomLineHeightSpan(i3, this.alignLine), length, length2, this.flag);
        }
        if (this.isStrikethrough) {
            this.mBuilder.setSpan(new android.text.style.StrikethroughSpan(), length, length2, this.flag);
        }
        if (this.isUnderline) {
            this.mBuilder.setSpan(new android.text.style.UnderlineSpan(), length, length2, this.flag);
        }
        if (this.isSuperscript) {
            this.mBuilder.setSpan(new android.text.style.SuperscriptSpan(), length, length2, this.flag);
        }
        if (this.isSubscript) {
            this.mBuilder.setSpan(new android.text.style.SubscriptSpan(), length, length2, this.flag);
        }
        if (this.isBold) {
            this.mBuilder.setSpan(new android.text.style.StyleSpan(1), length, length2, this.flag);
        }
        if (this.isItalic) {
            this.mBuilder.setSpan(new android.text.style.StyleSpan(2), length, length2, this.flag);
        }
        if (this.isBoldItalic) {
            this.mBuilder.setSpan(new android.text.style.StyleSpan(3), length, length2, this.flag);
        }
        if (this.fontFamily != null) {
            this.mBuilder.setSpan(new android.text.style.TypefaceSpan(this.fontFamily), length, length2, this.flag);
        }
        if (this.typeface != null) {
            this.mBuilder.setSpan(new com.blankj.utilcode.util.SpanUtils.CustomTypefaceSpan(this.typeface), length, length2, this.flag);
        }
        if (this.alignment != null) {
            this.mBuilder.setSpan(new android.text.style.AlignmentSpan.Standard(this.alignment), length, length2, this.flag);
        }
        android.text.style.ClickableSpan clickableSpan = this.clickSpan;
        if (clickableSpan != null) {
            this.mBuilder.setSpan(clickableSpan, length, length2, this.flag);
        }
        if (this.url != null) {
            this.mBuilder.setSpan(new android.text.style.URLSpan(this.url), length, length2, this.flag);
        }
        if (this.blurRadius != -1.0f) {
            this.mBuilder.setSpan(new android.text.style.MaskFilterSpan(new android.graphics.BlurMaskFilter(this.blurRadius, this.style)), length, length2, this.flag);
        }
        if (this.shader != null) {
            this.mBuilder.setSpan(new com.blankj.utilcode.util.SpanUtils.ShaderSpan(this.shader), length, length2, this.flag);
        }
        if (this.shadowRadius != -1.0f) {
            this.mBuilder.setSpan(new com.blankj.utilcode.util.SpanUtils.ShadowSpan(this.shadowRadius, this.shadowDx, this.shadowDy, this.shadowColor), length, length2, this.flag);
        }
        java.lang.Object[] objArr = this.spans;
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                this.mBuilder.setSpan(obj, length, length2, this.flag);
            }
        }
    }

    private void updateImage() {
        int length = this.mBuilder.length();
        this.mText = "<img>";
        updateCharCharSequence();
        int length2 = this.mBuilder.length();
        if (this.imageBitmap != null) {
            this.mBuilder.setSpan(new com.blankj.utilcode.util.SpanUtils.CustomImageSpan(this.imageBitmap, this.alignImage), length, length2, this.flag);
            return;
        }
        if (this.imageDrawable != null) {
            this.mBuilder.setSpan(new com.blankj.utilcode.util.SpanUtils.CustomImageSpan(this.imageDrawable, this.alignImage), length, length2, this.flag);
        } else if (this.imageUri != null) {
            this.mBuilder.setSpan(new com.blankj.utilcode.util.SpanUtils.CustomImageSpan(this.imageUri, this.alignImage), length, length2, this.flag);
        } else if (this.imageResourceId != -1) {
            this.mBuilder.setSpan(new com.blankj.utilcode.util.SpanUtils.CustomImageSpan(this.imageResourceId, this.alignImage), length, length2, this.flag);
        }
    }

    private void updateSpace() {
        int length = this.mBuilder.length();
        this.mText = "< >";
        updateCharCharSequence();
        this.mBuilder.setSpan(new com.blankj.utilcode.util.SpanUtils.SpaceSpan(this.spaceSize, this.spaceColor), length, this.mBuilder.length(), this.flag);
    }

    static class VerticalAlignSpan extends android.text.style.ReplacementSpan {
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        final int mVerticalAlignment;

        VerticalAlignSpan(int i) {
            this.mVerticalAlignment = i;
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
            java.util.Objects.requireNonNull(paint, "Argument 'paint' of type Paint (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            return (int) paint.measureText(charSequence.subSequence(i, i2).toString());
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
            java.util.Objects.requireNonNull(canvas, "Argument 'canvas' of type Canvas (#0 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            java.util.Objects.requireNonNull(paint, "Argument 'paint' of type Paint (#8 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            java.lang.CharSequence subSequence = charSequence.subSequence(i, i2);
            android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            canvas.drawText(subSequence.toString(), f, i4 - (((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - ((i5 + i3) / 2)), paint);
        }
    }

    static class CustomLineHeightSpan implements android.text.style.LineHeightSpan {
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        static android.graphics.Paint.FontMetricsInt sfm;
        private final int height;
        final int mVerticalAlignment;

        CustomLineHeightSpan(int i, int i2) {
            this.height = i;
            this.mVerticalAlignment = i2;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(java.lang.CharSequence charSequence, int i, int i2, int i3, int i4, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt2 = sfm;
            if (fontMetricsInt2 == null) {
                android.graphics.Paint.FontMetricsInt fontMetricsInt3 = new android.graphics.Paint.FontMetricsInt();
                sfm = fontMetricsInt3;
                fontMetricsInt3.top = fontMetricsInt.top;
                sfm.ascent = fontMetricsInt.ascent;
                sfm.descent = fontMetricsInt.descent;
                sfm.bottom = fontMetricsInt.bottom;
                sfm.leading = fontMetricsInt.leading;
            } else {
                fontMetricsInt.top = fontMetricsInt2.top;
                fontMetricsInt.ascent = sfm.ascent;
                fontMetricsInt.descent = sfm.descent;
                fontMetricsInt.bottom = sfm.bottom;
                fontMetricsInt.leading = sfm.leading;
            }
            int i5 = this.height - (((fontMetricsInt.descent + i4) - fontMetricsInt.ascent) - i3);
            if (i5 > 0) {
                int i6 = this.mVerticalAlignment;
                if (i6 == 3) {
                    fontMetricsInt.descent += i5;
                } else if (i6 == 2) {
                    int i7 = i5 / 2;
                    fontMetricsInt.descent += i7;
                    fontMetricsInt.ascent -= i7;
                } else {
                    fontMetricsInt.ascent -= i5;
                }
            }
            int i8 = this.height - (((i4 + fontMetricsInt.bottom) - fontMetricsInt.top) - i3);
            if (i8 > 0) {
                int i9 = this.mVerticalAlignment;
                if (i9 == 3) {
                    fontMetricsInt.bottom += i8;
                } else if (i9 == 2) {
                    int i10 = i8 / 2;
                    fontMetricsInt.bottom += i10;
                    fontMetricsInt.top -= i10;
                } else {
                    fontMetricsInt.top -= i8;
                }
            }
            if (i2 == ((android.text.Spanned) charSequence).getSpanEnd(this)) {
                sfm = null;
            }
        }
    }

    static class SpaceSpan extends android.text.style.ReplacementSpan {
        private final android.graphics.Paint paint;
        private final int width;

        private SpaceSpan(int i) {
            this(i, 0);
        }

        private SpaceSpan(int i, int i2) {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.paint = paint;
            this.width = i;
            paint.setColor(i2);
            paint.setStyle(android.graphics.Paint.Style.FILL);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
            java.util.Objects.requireNonNull(paint, "Argument 'paint' of type Paint (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            return this.width;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
            java.util.Objects.requireNonNull(canvas, "Argument 'canvas' of type Canvas (#0 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            java.util.Objects.requireNonNull(paint, "Argument 'paint' of type Paint (#8 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            canvas.drawRect(f, i3, f + this.width, i5, this.paint);
        }
    }

    static class CustomQuoteSpan implements android.text.style.LeadingMarginSpan {
        private final int color;
        private final int gapWidth;
        private final int stripeWidth;

        private CustomQuoteSpan(int i, int i2, int i3) {
            this.color = i;
            this.stripeWidth = i2;
            this.gapWidth = i3;
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z) {
            return this.stripeWidth + this.gapWidth;
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence, int i6, int i7, boolean z, android.text.Layout layout) {
            android.graphics.Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.color);
            canvas.drawRect(i, i3, i + (this.stripeWidth * i2), i5, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }
    }

    static class CustomBulletSpan implements android.text.style.LeadingMarginSpan {
        private final int color;
        private final int gapWidth;
        private final int radius;
        private android.graphics.Path sBulletPath;

        private CustomBulletSpan(int i, int i2, int i3) {
            this.sBulletPath = null;
            this.color = i;
            this.radius = i2;
            this.gapWidth = i3;
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z) {
            return (this.radius * 2) + this.gapWidth;
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence, int i6, int i7, boolean z, android.text.Layout layout) {
            if (((android.text.Spanned) charSequence).getSpanStart(this) == i6) {
                android.graphics.Paint.Style style = paint.getStyle();
                int color = paint.getColor();
                paint.setColor(this.color);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                if (canvas.isHardwareAccelerated()) {
                    if (this.sBulletPath == null) {
                        android.graphics.Path path = new android.graphics.Path();
                        this.sBulletPath = path;
                        path.addCircle(0.0f, 0.0f, this.radius, android.graphics.Path.Direction.CW);
                    }
                    canvas.save();
                    canvas.translate(i + (i2 * this.radius), (i3 + i5) / 2.0f);
                    canvas.drawPath(this.sBulletPath, paint);
                    canvas.restore();
                } else {
                    canvas.drawCircle(i + (i2 * r10), (i3 + i5) / 2.0f, this.radius, paint);
                }
                paint.setColor(color);
                paint.setStyle(style);
            }
        }
    }

    static class CustomTypefaceSpan extends android.text.style.TypefaceSpan {
        private final android.graphics.Typeface newType;

        private CustomTypefaceSpan(android.graphics.Typeface typeface) {
            super("");
            this.newType = typeface;
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            apply(textPaint, this.newType);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
        public void updateMeasureState(android.text.TextPaint textPaint) {
            apply(textPaint, this.newType);
        }

        private void apply(android.graphics.Paint paint, android.graphics.Typeface typeface) {
            android.graphics.Typeface typeface2 = paint.getTypeface();
            int style = (typeface2 == null ? 0 : typeface2.getStyle()) & (~typeface.getStyle());
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.getShader();
            paint.setTypeface(typeface);
        }
    }

    static class CustomImageSpan extends com.blankj.utilcode.util.SpanUtils.CustomDynamicDrawableSpan {
        private android.net.Uri mContentUri;
        private android.graphics.drawable.Drawable mDrawable;
        private int mResourceId;

        private CustomImageSpan(android.graphics.Bitmap bitmap, int i) {
            super(i);
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.blankj.utilcode.util.Utils.getApp().getResources(), bitmap);
            this.mDrawable = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }

        private CustomImageSpan(android.graphics.drawable.Drawable drawable, int i) {
            super(i);
            this.mDrawable = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }

        private CustomImageSpan(android.net.Uri uri, int i) {
            super(i);
            this.mContentUri = uri;
        }

        private CustomImageSpan(int i, int i2) {
            super(i2);
            this.mResourceId = i;
        }

        @Override // com.blankj.utilcode.util.SpanUtils.CustomDynamicDrawableSpan
        public android.graphics.drawable.Drawable getDrawable() {
            android.graphics.drawable.Drawable drawable;
            android.graphics.drawable.Drawable drawable2 = this.mDrawable;
            if (drawable2 != null) {
                return drawable2;
            }
            android.graphics.drawable.BitmapDrawable bitmapDrawable = null;
            if (this.mContentUri != null) {
                try {
                    java.io.InputStream openInputStream = com.blankj.utilcode.util.Utils.getApp().getContentResolver().openInputStream(this.mContentUri);
                    android.graphics.drawable.BitmapDrawable bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(com.blankj.utilcode.util.Utils.getApp().getResources(), android.graphics.BitmapFactory.decodeStream(openInputStream));
                    try {
                        bitmapDrawable2.setBounds(0, 0, bitmapDrawable2.getIntrinsicWidth(), bitmapDrawable2.getIntrinsicHeight());
                        if (openInputStream != null) {
                            openInputStream.close();
                        }
                        return bitmapDrawable2;
                    } catch (java.lang.Exception e) {
                        e = e;
                        bitmapDrawable = bitmapDrawable2;
                        android.util.Log.e("sms", "Failed to loaded content " + this.mContentUri, e);
                        return bitmapDrawable;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                }
            } else {
                try {
                    drawable = androidx.core.content.ContextCompat.getDrawable(com.blankj.utilcode.util.Utils.getApp(), this.mResourceId);
                    try {
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        return drawable;
                    } catch (java.lang.Exception unused) {
                        android.util.Log.e("sms", "Unable to find resource: " + this.mResourceId);
                        return drawable;
                    }
                } catch (java.lang.Exception unused2) {
                    drawable = null;
                }
            }
        }
    }

    static abstract class CustomDynamicDrawableSpan extends android.text.style.ReplacementSpan {
        static final int ALIGN_BASELINE = 1;
        static final int ALIGN_BOTTOM = 0;
        static final int ALIGN_CENTER = 2;
        static final int ALIGN_TOP = 3;
        private java.lang.ref.WeakReference<android.graphics.drawable.Drawable> mDrawableRef;
        final int mVerticalAlignment;

        public abstract android.graphics.drawable.Drawable getDrawable();

        private CustomDynamicDrawableSpan() {
            this.mVerticalAlignment = 0;
        }

        private CustomDynamicDrawableSpan(int i) {
            this.mVerticalAlignment = i;
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
            int i3;
            java.util.Objects.requireNonNull(paint, "Argument 'paint' of type Paint (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            android.graphics.Rect bounds = getCachedDrawable().getBounds();
            if (fontMetricsInt != null && (i3 = fontMetricsInt.bottom - fontMetricsInt.top) < bounds.height()) {
                int i4 = this.mVerticalAlignment;
                if (i4 == 3) {
                    fontMetricsInt.top = fontMetricsInt.top;
                    fontMetricsInt.bottom = bounds.height() + fontMetricsInt.top;
                } else if (i4 == 2) {
                    int i5 = i3 / 4;
                    fontMetricsInt.top = ((-bounds.height()) / 2) - i5;
                    fontMetricsInt.bottom = (bounds.height() / 2) - i5;
                } else {
                    fontMetricsInt.top = (-bounds.height()) + fontMetricsInt.bottom;
                    fontMetricsInt.bottom = fontMetricsInt.bottom;
                }
                fontMetricsInt.ascent = fontMetricsInt.top;
                fontMetricsInt.descent = fontMetricsInt.bottom;
            }
            return bounds.right;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
            int height;
            float height2;
            java.util.Objects.requireNonNull(canvas, "Argument 'canvas' of type Canvas (#0 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            java.util.Objects.requireNonNull(paint, "Argument 'paint' of type Paint (#8 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            android.graphics.drawable.Drawable cachedDrawable = getCachedDrawable();
            android.graphics.Rect bounds = cachedDrawable.getBounds();
            canvas.save();
            if (bounds.height() < i5 - i3) {
                int i6 = this.mVerticalAlignment;
                if (i6 == 3) {
                    height2 = i3;
                } else {
                    if (i6 == 2) {
                        height = ((i5 + i3) - bounds.height()) / 2;
                    } else if (i6 == 1) {
                        height2 = i4 - bounds.height();
                    } else {
                        height = i5 - bounds.height();
                    }
                    height2 = height;
                }
                canvas.translate(f, height2);
            } else {
                canvas.translate(f, i3);
            }
            cachedDrawable.draw(canvas);
            canvas.restore();
        }

        private android.graphics.drawable.Drawable getCachedDrawable() {
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> weakReference = this.mDrawableRef;
            android.graphics.drawable.Drawable drawable = weakReference != null ? weakReference.get() : null;
            if (drawable != null) {
                return drawable;
            }
            android.graphics.drawable.Drawable drawable2 = getDrawable();
            this.mDrawableRef = new java.lang.ref.WeakReference<>(drawable2);
            return drawable2;
        }
    }

    static class ShaderSpan extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
        private android.graphics.Shader mShader;

        private ShaderSpan(android.graphics.Shader shader) {
            this.mShader = shader;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            textPaint.setShader(this.mShader);
        }
    }

    static class ShadowSpan extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
        private float dx;
        private float dy;
        private float radius;
        private int shadowColor;

        private ShadowSpan(float f, float f2, float f3, int i) {
            this.radius = f;
            this.dx = f2;
            this.dy = f3;
            this.shadowColor = i;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            textPaint.setShadowLayer(this.radius, this.dx, this.dy, this.shadowColor);
        }
    }

    private static class SerializableSpannableStringBuilder extends android.text.SpannableStringBuilder implements java.io.Serializable {
        private static final long serialVersionUID = 4909567650765875771L;

        private SerializableSpannableStringBuilder() {
        }
    }
}
