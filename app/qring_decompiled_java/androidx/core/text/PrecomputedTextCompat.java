package androidx.core.text;

/* loaded from: classes.dex */
public class PrecomputedTextCompat implements android.text.Spannable {
    private static final char LINE_FEED = '\n';
    private static java.util.concurrent.Executor sExecutor;
    private static final java.lang.Object sLock = new java.lang.Object();
    private final int[] mParagraphEnds;
    private final androidx.core.text.PrecomputedTextCompat.Params mParams;
    private final android.text.Spannable mText;
    private final android.text.PrecomputedText mWrapped;

    public static final class Params {
        private final int mBreakStrategy;
        private final int mHyphenationFrequency;
        private final android.text.TextPaint mPaint;
        private final android.text.TextDirectionHeuristic mTextDir;
        final android.text.PrecomputedText.Params mWrapped;

        public static class Builder {
            private int mBreakStrategy;
            private int mHyphenationFrequency;
            private final android.text.TextPaint mPaint;
            private android.text.TextDirectionHeuristic mTextDir;

            public Builder(android.text.TextPaint textPaint) {
                this.mPaint = textPaint;
                if (android.os.Build.VERSION.SDK_INT >= 23) {
                    this.mBreakStrategy = 1;
                    this.mHyphenationFrequency = 1;
                } else {
                    this.mHyphenationFrequency = 0;
                    this.mBreakStrategy = 0;
                }
                if (android.os.Build.VERSION.SDK_INT >= 18) {
                    this.mTextDir = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.mTextDir = null;
                }
            }

            public androidx.core.text.PrecomputedTextCompat.Params.Builder setBreakStrategy(int i) {
                this.mBreakStrategy = i;
                return this;
            }

            public androidx.core.text.PrecomputedTextCompat.Params.Builder setHyphenationFrequency(int i) {
                this.mHyphenationFrequency = i;
                return this;
            }

            public androidx.core.text.PrecomputedTextCompat.Params.Builder setTextDirection(android.text.TextDirectionHeuristic textDirectionHeuristic) {
                this.mTextDir = textDirectionHeuristic;
                return this;
            }

            public androidx.core.text.PrecomputedTextCompat.Params build() {
                return new androidx.core.text.PrecomputedTextCompat.Params(this.mPaint, this.mTextDir, this.mBreakStrategy, this.mHyphenationFrequency);
            }
        }

        Params(android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                this.mWrapped = new android.text.PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.mWrapped = null;
            }
            this.mPaint = textPaint;
            this.mTextDir = textDirectionHeuristic;
            this.mBreakStrategy = i;
            this.mHyphenationFrequency = i2;
        }

        public Params(android.text.PrecomputedText.Params params) {
            this.mPaint = params.getTextPaint();
            this.mTextDir = params.getTextDirection();
            this.mBreakStrategy = params.getBreakStrategy();
            this.mHyphenationFrequency = params.getHyphenationFrequency();
            this.mWrapped = android.os.Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public android.text.TextPaint getTextPaint() {
            return this.mPaint;
        }

        public android.text.TextDirectionHeuristic getTextDirection() {
            return this.mTextDir;
        }

        public int getBreakStrategy() {
            return this.mBreakStrategy;
        }

        public int getHyphenationFrequency() {
            return this.mHyphenationFrequency;
        }

        public boolean equalsWithoutTextDirection(androidx.core.text.PrecomputedTextCompat.Params params) {
            if ((android.os.Build.VERSION.SDK_INT >= 23 && (this.mBreakStrategy != params.getBreakStrategy() || this.mHyphenationFrequency != params.getHyphenationFrequency())) || this.mPaint.getTextSize() != params.getTextPaint().getTextSize() || this.mPaint.getTextScaleX() != params.getTextPaint().getTextScaleX() || this.mPaint.getTextSkewX() != params.getTextPaint().getTextSkewX()) {
                return false;
            }
            if ((android.os.Build.VERSION.SDK_INT >= 21 && (this.mPaint.getLetterSpacing() != params.getTextPaint().getLetterSpacing() || !android.text.TextUtils.equals(this.mPaint.getFontFeatureSettings(), params.getTextPaint().getFontFeatureSettings()))) || this.mPaint.getFlags() != params.getTextPaint().getFlags()) {
                return false;
            }
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                if (!this.mPaint.getTextLocales().equals(params.getTextPaint().getTextLocales())) {
                    return false;
                }
            } else if (android.os.Build.VERSION.SDK_INT >= 17 && !this.mPaint.getTextLocale().equals(params.getTextPaint().getTextLocale())) {
                return false;
            }
            return this.mPaint.getTypeface() == null ? params.getTextPaint().getTypeface() == null : this.mPaint.getTypeface().equals(params.getTextPaint().getTypeface());
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof androidx.core.text.PrecomputedTextCompat.Params)) {
                return false;
            }
            androidx.core.text.PrecomputedTextCompat.Params params = (androidx.core.text.PrecomputedTextCompat.Params) obj;
            if (equalsWithoutTextDirection(params)) {
                return android.os.Build.VERSION.SDK_INT < 18 || this.mTextDir == params.getTextDirection();
            }
            return false;
        }

        public int hashCode() {
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                return androidx.core.util.ObjectsCompat.hash(java.lang.Float.valueOf(this.mPaint.getTextSize()), java.lang.Float.valueOf(this.mPaint.getTextScaleX()), java.lang.Float.valueOf(this.mPaint.getTextSkewX()), java.lang.Float.valueOf(this.mPaint.getLetterSpacing()), java.lang.Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocales(), this.mPaint.getTypeface(), java.lang.Boolean.valueOf(this.mPaint.isElegantTextHeight()), this.mTextDir, java.lang.Integer.valueOf(this.mBreakStrategy), java.lang.Integer.valueOf(this.mHyphenationFrequency));
            }
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                return androidx.core.util.ObjectsCompat.hash(java.lang.Float.valueOf(this.mPaint.getTextSize()), java.lang.Float.valueOf(this.mPaint.getTextScaleX()), java.lang.Float.valueOf(this.mPaint.getTextSkewX()), java.lang.Float.valueOf(this.mPaint.getLetterSpacing()), java.lang.Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocale(), this.mPaint.getTypeface(), java.lang.Boolean.valueOf(this.mPaint.isElegantTextHeight()), this.mTextDir, java.lang.Integer.valueOf(this.mBreakStrategy), java.lang.Integer.valueOf(this.mHyphenationFrequency));
            }
            if (android.os.Build.VERSION.SDK_INT >= 18) {
                return androidx.core.util.ObjectsCompat.hash(java.lang.Float.valueOf(this.mPaint.getTextSize()), java.lang.Float.valueOf(this.mPaint.getTextScaleX()), java.lang.Float.valueOf(this.mPaint.getTextSkewX()), java.lang.Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocale(), this.mPaint.getTypeface(), this.mTextDir, java.lang.Integer.valueOf(this.mBreakStrategy), java.lang.Integer.valueOf(this.mHyphenationFrequency));
            }
            if (android.os.Build.VERSION.SDK_INT >= 17) {
                return androidx.core.util.ObjectsCompat.hash(java.lang.Float.valueOf(this.mPaint.getTextSize()), java.lang.Float.valueOf(this.mPaint.getTextScaleX()), java.lang.Float.valueOf(this.mPaint.getTextSkewX()), java.lang.Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocale(), this.mPaint.getTypeface(), this.mTextDir, java.lang.Integer.valueOf(this.mBreakStrategy), java.lang.Integer.valueOf(this.mHyphenationFrequency));
            }
            return androidx.core.util.ObjectsCompat.hash(java.lang.Float.valueOf(this.mPaint.getTextSize()), java.lang.Float.valueOf(this.mPaint.getTextScaleX()), java.lang.Float.valueOf(this.mPaint.getTextSkewX()), java.lang.Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTypeface(), this.mTextDir, java.lang.Integer.valueOf(this.mBreakStrategy), java.lang.Integer.valueOf(this.mHyphenationFrequency));
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
            sb.append("textSize=" + this.mPaint.getTextSize());
            sb.append(", textScaleX=" + this.mPaint.getTextScaleX());
            sb.append(", textSkewX=" + this.mPaint.getTextSkewX());
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.mPaint.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.mPaint.isElegantTextHeight());
            }
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                sb.append(", textLocale=" + this.mPaint.getTextLocales());
            } else if (android.os.Build.VERSION.SDK_INT >= 17) {
                sb.append(", textLocale=" + this.mPaint.getTextLocale());
            }
            sb.append(", typeface=" + this.mPaint.getTypeface());
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.mPaint.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.mTextDir);
            sb.append(", breakStrategy=" + this.mBreakStrategy);
            sb.append(", hyphenationFrequency=" + this.mHyphenationFrequency);
            sb.append("}");
            return sb.toString();
        }
    }

    public static androidx.core.text.PrecomputedTextCompat create(java.lang.CharSequence charSequence, androidx.core.text.PrecomputedTextCompat.Params params) {
        androidx.core.util.Preconditions.checkNotNull(charSequence);
        androidx.core.util.Preconditions.checkNotNull(params);
        try {
            androidx.core.os.TraceCompat.beginSection("PrecomputedText");
            if (android.os.Build.VERSION.SDK_INT >= 29 && params.mWrapped != null) {
                return new androidx.core.text.PrecomputedTextCompat(android.text.PrecomputedText.create(charSequence, params.mWrapped), params);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int indexOf = android.text.TextUtils.indexOf(charSequence, LINE_FEED, i, length);
                i = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(java.lang.Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((java.lang.Integer) arrayList.get(i2)).intValue();
            }
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                android.text.StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), params.getTextPaint(), Integer.MAX_VALUE).setBreakStrategy(params.getBreakStrategy()).setHyphenationFrequency(params.getHyphenationFrequency()).setTextDirection(params.getTextDirection()).build();
            } else if (android.os.Build.VERSION.SDK_INT >= 21) {
                new android.text.StaticLayout(charSequence, params.getTextPaint(), Integer.MAX_VALUE, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return new androidx.core.text.PrecomputedTextCompat(charSequence, params, iArr);
        } finally {
            androidx.core.os.TraceCompat.endSection();
        }
    }

    private PrecomputedTextCompat(java.lang.CharSequence charSequence, androidx.core.text.PrecomputedTextCompat.Params params, int[] iArr) {
        this.mText = new android.text.SpannableString(charSequence);
        this.mParams = params;
        this.mParagraphEnds = iArr;
        this.mWrapped = null;
    }

    private PrecomputedTextCompat(android.text.PrecomputedText precomputedText, androidx.core.text.PrecomputedTextCompat.Params params) {
        this.mText = precomputedText;
        this.mParams = params;
        this.mParagraphEnds = null;
        this.mWrapped = android.os.Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public android.text.PrecomputedText getPrecomputedText() {
        android.text.Spannable spannable = this.mText;
        if (spannable instanceof android.text.PrecomputedText) {
            return (android.text.PrecomputedText) spannable;
        }
        return null;
    }

    public androidx.core.text.PrecomputedTextCompat.Params getParams() {
        return this.mParams;
    }

    public int getParagraphCount() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return this.mWrapped.getParagraphCount();
        }
        return this.mParagraphEnds.length;
    }

    public int getParagraphStart(int i) {
        androidx.core.util.Preconditions.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return this.mWrapped.getParagraphStart(i);
        }
        if (i == 0) {
            return 0;
        }
        return this.mParagraphEnds[i - 1];
    }

    public int getParagraphEnd(int i) {
        androidx.core.util.Preconditions.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return this.mWrapped.getParagraphEnd(i);
        }
        return this.mParagraphEnds[i];
    }

    private static class PrecomputedTextFutureTask extends java.util.concurrent.FutureTask<androidx.core.text.PrecomputedTextCompat> {

        private static class PrecomputedTextCallback implements java.util.concurrent.Callable<androidx.core.text.PrecomputedTextCompat> {
            private androidx.core.text.PrecomputedTextCompat.Params mParams;
            private java.lang.CharSequence mText;

            PrecomputedTextCallback(androidx.core.text.PrecomputedTextCompat.Params params, java.lang.CharSequence charSequence) {
                this.mParams = params;
                this.mText = charSequence;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public androidx.core.text.PrecomputedTextCompat call() throws java.lang.Exception {
                return androidx.core.text.PrecomputedTextCompat.create(this.mText, this.mParams);
            }
        }

        PrecomputedTextFutureTask(androidx.core.text.PrecomputedTextCompat.Params params, java.lang.CharSequence charSequence) {
            super(new androidx.core.text.PrecomputedTextCompat.PrecomputedTextFutureTask.PrecomputedTextCallback(params, charSequence));
        }
    }

    public static java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> getTextFuture(java.lang.CharSequence charSequence, androidx.core.text.PrecomputedTextCompat.Params params, java.util.concurrent.Executor executor) {
        androidx.core.text.PrecomputedTextCompat.PrecomputedTextFutureTask precomputedTextFutureTask = new androidx.core.text.PrecomputedTextCompat.PrecomputedTextFutureTask(params, charSequence);
        if (executor == null) {
            synchronized (sLock) {
                if (sExecutor == null) {
                    sExecutor = java.util.concurrent.Executors.newFixedThreadPool(1);
                }
                executor = sExecutor;
            }
        }
        executor.execute(precomputedTextFutureTask);
        return precomputedTextFutureTask;
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object obj, int i, int i2, int i3) {
        if (obj instanceof android.text.style.MetricAffectingSpan) {
            throw new java.lang.IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.mWrapped.setSpan(obj, i, i2, i3);
        } else {
            this.mText.setSpan(obj, i, i2, i3);
        }
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object obj) {
        if (obj instanceof android.text.style.MetricAffectingSpan) {
            throw new java.lang.IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.mWrapped.removeSpan(obj);
        } else {
            this.mText.removeSpan(obj);
        }
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.mWrapped.getSpans(i, i2, cls);
        }
        return (T[]) this.mText.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object obj) {
        return this.mText.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object obj) {
        return this.mText.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object obj) {
        return this.mText.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, java.lang.Class cls) {
        return this.mText.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.mText.length();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.mText.charAt(i);
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int i, int i2) {
        return this.mText.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        return this.mText.toString();
    }
}
