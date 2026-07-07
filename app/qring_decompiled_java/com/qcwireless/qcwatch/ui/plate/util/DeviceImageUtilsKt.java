package com.qcwireless.qcwatch.ui.plate.util;

/* compiled from: DeviceImageUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"makeRectWithCornerAndLight", "Landroid/graphics/Bitmap;", "sourceImg", "light", "", "corner", "makeRoundAndLight", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceImageUtilsKt {
    public static final android.graphics.Bitmap makeRoundAndLight(android.graphics.Bitmap bitmap, int i) {
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "sourceImg");
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        for (int i6 = 0; i6 < width; i6++) {
            iArr[i6] = (((((iArr[i6] >> 0) & 255) * i) / 100) << 0) | (iArr[i6] & (-16777216)) | (((((iArr[i6] >> 8) & 255) * i) / 100) << 8) | (((((iArr[i6] >> 16) & 255) * i) / 100) << 16);
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(iArr, bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        int width2 = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        float f2 = height / 2;
        if (width2 > height) {
            i5 = (width2 - height) / 2;
            i3 = height;
            i2 = i5 + height;
            f = f2;
            i4 = 0;
        } else {
            if (height > width2) {
                i4 = (height - width2) / 2;
                f = width2 / 2;
                i2 = width2;
                i3 = i4 + width2;
            } else {
                i2 = width2;
                i3 = height;
                f = f2;
                i4 = 0;
            }
            i5 = 0;
        }
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(width2, height, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap2);
        android.graphics.Paint paint = new android.graphics.Paint();
        android.graphics.Rect rect = new android.graphics.Rect(i5, i4, i2, i3);
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(createBitmap, rect, rect, paint);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap2, "output");
        return createBitmap2;
    }

    public static final android.graphics.Bitmap makeRectWithCornerAndLight(android.graphics.Bitmap bitmap, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "sourceImg");
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        for (int i3 = 0; i3 < width; i3++) {
            iArr[i3] = (((((iArr[i3] >> 0) & 255) * i) / 100) << 0) | (iArr[i3] & (-16777216)) | (((((iArr[i3] >> 8) & 255) * i) / 100) << 8) | (((((iArr[i3] >> 16) & 255) * i) / 100) << 16);
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(iArr, bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        int width2 = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(width2, height, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap2);
        android.graphics.Paint paint = new android.graphics.Paint();
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, width2, height);
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        float f = i2;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(createBitmap, rect, rect, paint);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap2, "output");
        return createBitmap2;
    }
}
