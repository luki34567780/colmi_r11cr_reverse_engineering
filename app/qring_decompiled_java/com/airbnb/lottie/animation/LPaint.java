package com.airbnb.lottie.animation;

/* loaded from: classes.dex */
public class LPaint extends android.graphics.Paint {
    @Override // android.graphics.Paint
    public void setTextLocales(android.os.LocaleList localeList) {
    }

    public LPaint() {
    }

    public LPaint(int i) {
        super(i);
    }

    public LPaint(android.graphics.PorterDuff.Mode mode) {
        setXfermode(new android.graphics.PorterDuffXfermode(mode));
    }

    public LPaint(int i, android.graphics.PorterDuff.Mode mode) {
        super(i);
        setXfermode(new android.graphics.PorterDuffXfermode(mode));
    }
}
