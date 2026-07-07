package com.google.android.material.internal;

/* loaded from: /tmp/dex/classes2.dex */
final class StaticLayoutBuilderCompat {
    private static final java.lang.String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
    private static final java.lang.String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
    private static final java.lang.String TEXT_DIR_CLASS_LTR = "LTR";
    private static final java.lang.String TEXT_DIR_CLASS_RTL = "RTL";
    private static java.lang.reflect.Constructor<android.text.StaticLayout> constructor;
    private static boolean initialized;
    private static java.lang.Object textDirection;
    private int end;
    private boolean isRtl;
    private final android.text.TextPaint paint;
    private java.lang.CharSequence source;
    private final int width;
    private int start = 0;
    private android.text.Layout.Alignment alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
    private int maxLines = com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private boolean includePad = true;
    private android.text.TextUtils.TruncateAt ellipsize = null;

    private StaticLayoutBuilderCompat(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i) {
        this.source = charSequence;
        this.paint = textPaint;
        this.width = i;
        this.end = charSequence.length();
    }

    public static com.google.android.material.internal.StaticLayoutBuilderCompat obtain(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i) {
        return new com.google.android.material.internal.StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    public com.google.android.material.internal.StaticLayoutBuilderCompat setAlignment(android.text.Layout.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    public com.google.android.material.internal.StaticLayoutBuilderCompat setIncludePad(boolean z) {
        this.includePad = z;
        return this;
    }

    public com.google.android.material.internal.StaticLayoutBuilderCompat setStart(int i) {
        this.start = i;
        return this;
    }

    public com.google.android.material.internal.StaticLayoutBuilderCompat setEnd(int i) {
        this.end = i;
        return this;
    }

    public com.google.android.material.internal.StaticLayoutBuilderCompat setMaxLines(int i) {
        this.maxLines = i;
        return this;
    }

    public com.google.android.material.internal.StaticLayoutBuilderCompat setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        this.ellipsize = truncateAt;
        return this;
    }

    public android.text.StaticLayout build() throws com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException {
        if (this.source == null) {
            this.source = "";
        }
        int max = java.lang.Math.max(0, this.width);
        java.lang.CharSequence charSequence = this.source;
        if (this.maxLines == 1) {
            charSequence = android.text.TextUtils.ellipsize(charSequence, this.paint, max, this.ellipsize);
        }
        this.end = java.lang.Math.min(charSequence.length(), this.end);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            if (this.isRtl) {
                this.alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
            }
            android.text.StaticLayout.Builder obtain = android.text.StaticLayout.Builder.obtain(charSequence, this.start, this.end, this.paint, max);
            obtain.setAlignment(this.alignment);
            obtain.setIncludePad(this.includePad);
            obtain.setTextDirection(this.isRtl ? android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR);
            android.text.TextUtils.TruncateAt truncateAt = this.ellipsize;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.maxLines);
            return obtain.build();
        }
        createConstructorWithReflection();
        try {
            return (android.text.StaticLayout) ((java.lang.reflect.Constructor) androidx.core.util.Preconditions.checkNotNull(constructor)).newInstance(charSequence, java.lang.Integer.valueOf(this.start), java.lang.Integer.valueOf(this.end), this.paint, java.lang.Integer.valueOf(max), this.alignment, androidx.core.util.Preconditions.checkNotNull(textDirection), java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(0.0f), java.lang.Boolean.valueOf(this.includePad), null, java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(this.maxLines));
        } catch (java.lang.Exception e) {
            throw new com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException(e);
        }
    }

    private void createConstructorWithReflection() throws com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException {
        java.lang.Class<?> cls;
        if (initialized) {
            return;
        }
        try {
            boolean z = this.isRtl && android.os.Build.VERSION.SDK_INT >= 23;
            if (android.os.Build.VERSION.SDK_INT >= 18) {
                cls = android.text.TextDirectionHeuristic.class;
                textDirection = z ? android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR;
            } else {
                java.lang.ClassLoader classLoader = com.google.android.material.internal.StaticLayoutBuilderCompat.class.getClassLoader();
                java.lang.String str = this.isRtl ? TEXT_DIR_CLASS_RTL : TEXT_DIR_CLASS_LTR;
                java.lang.Class<?> loadClass = classLoader.loadClass(TEXT_DIR_CLASS);
                java.lang.Class<?> loadClass2 = classLoader.loadClass(TEXT_DIRS_CLASS);
                textDirection = loadClass2.getField(str).get(loadClass2);
                cls = loadClass;
            }
            java.lang.reflect.Constructor<android.text.StaticLayout> declaredConstructor = android.text.StaticLayout.class.getDeclaredConstructor(java.lang.CharSequence.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, android.text.TextPaint.class, java.lang.Integer.TYPE, android.text.Layout.Alignment.class, cls, java.lang.Float.TYPE, java.lang.Float.TYPE, java.lang.Boolean.TYPE, android.text.TextUtils.TruncateAt.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            constructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
            initialized = true;
        } catch (java.lang.Exception e) {
            throw new com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException(e);
        }
    }

    public com.google.android.material.internal.StaticLayoutBuilderCompat setIsRtl(boolean z) {
        this.isRtl = z;
        return this;
    }

    static class StaticLayoutBuilderCompatException extends java.lang.Exception {
        StaticLayoutBuilderCompatException(java.lang.Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }
}
