package com.google.android.material.canvas;

/* loaded from: /tmp/dex/classes2.dex */
public class CanvasCompat {
    private CanvasCompat() {
    }

    public static int saveLayerAlpha(android.graphics.Canvas canvas, android.graphics.RectF rectF, int i) {
        if (android.os.Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        return canvas.saveLayerAlpha(rectF, i, 31);
    }

    public static int saveLayerAlpha(android.graphics.Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (android.os.Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
