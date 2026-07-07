package com.king.zxing.util;

/* loaded from: /tmp/dex/classes2.dex */
public final class CodeUtils {
    public static final int DEFAULT_REQ_HEIGHT = 640;
    public static final int DEFAULT_REQ_WIDTH = 480;

    private CodeUtils() {
        throw new java.lang.AssertionError();
    }

    public static android.graphics.Bitmap createQRCode(java.lang.String str, int i) {
        return createQRCode(str, i, (android.graphics.Bitmap) null);
    }

    public static android.graphics.Bitmap createQRCode(java.lang.String str, int i, int i2) {
        return createQRCode(str, i, (android.graphics.Bitmap) null, i2);
    }

    public static android.graphics.Bitmap createQRCode(java.lang.String str, int i, android.graphics.Bitmap bitmap) {
        return createQRCode(str, i, bitmap, -16777216);
    }

    public static android.graphics.Bitmap createQRCode(java.lang.String str, int i, android.graphics.Bitmap bitmap, int i2) {
        return createQRCode(str, i, bitmap, 0.2f, i2);
    }

    public static android.graphics.Bitmap createQRCode(java.lang.String str, int i, android.graphics.Bitmap bitmap, float f) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.google.zxing.EncodeHintType.CHARACTER_SET, "utf-8");
        hashMap.put(com.google.zxing.EncodeHintType.ERROR_CORRECTION, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.H);
        hashMap.put(com.google.zxing.EncodeHintType.MARGIN, 1);
        return createQRCode(str, i, bitmap, f, hashMap);
    }

    public static android.graphics.Bitmap createQRCode(java.lang.String str, int i, android.graphics.Bitmap bitmap, float f, int i2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.google.zxing.EncodeHintType.CHARACTER_SET, "utf-8");
        hashMap.put(com.google.zxing.EncodeHintType.ERROR_CORRECTION, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.H);
        hashMap.put(com.google.zxing.EncodeHintType.MARGIN, 1);
        return createQRCode(str, i, bitmap, f, hashMap, i2);
    }

    public static android.graphics.Bitmap createQRCode(java.lang.String str, int i, android.graphics.Bitmap bitmap, float f, java.util.Map<com.google.zxing.EncodeHintType, ?> map) {
        return createQRCode(str, i, bitmap, f, map, -16777216);
    }

    public static android.graphics.Bitmap createQRCode(java.lang.String str, int i, android.graphics.Bitmap bitmap, float f, java.util.Map<com.google.zxing.EncodeHintType, ?> map, int i2) {
        try {
            com.google.zxing.common.BitMatrix encode = new com.google.zxing.qrcode.QRCodeWriter().encode(str, com.google.zxing.BarcodeFormat.QR_CODE, i, i, map);
            int[] iArr = new int[i * i];
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i; i4++) {
                    if (encode.get(i4, i3)) {
                        iArr[(i3 * i) + i4] = i2;
                    } else {
                        iArr[(i3 * i) + i4] = -1;
                    }
                }
            }
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, i, 0, 0, i, i);
            return bitmap != null ? addLogo(createBitmap, bitmap, f) : createBitmap;
        } catch (java.lang.Exception e) {
            com.king.zxing.util.LogUtils.w(e.getMessage());
            return null;
        }
    }

    private static android.graphics.Bitmap addLogo(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, float f) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap2 == null) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        if (width == 0 || height == 0) {
            return null;
        }
        if (width2 == 0 || height2 == 0) {
            return bitmap;
        }
        float f2 = (width * f) / width2;
        try {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
            canvas.scale(f2, f2, width / 2, height / 2);
            canvas.drawBitmap(bitmap2, (width - width2) / 2, (height - height2) / 2, (android.graphics.Paint) null);
            canvas.save();
            canvas.restore();
            return createBitmap;
        } catch (java.lang.Exception e) {
            com.king.zxing.util.LogUtils.w(e.getMessage());
            return null;
        }
    }

    public static java.lang.String parseQRCode(java.lang.String str) {
        com.google.zxing.Result parseQRCodeResult = parseQRCodeResult(str);
        if (parseQRCodeResult != null) {
            return parseQRCodeResult.getText();
        }
        return null;
    }

    public static com.google.zxing.Result parseQRCodeResult(java.lang.String str) {
        return parseQRCodeResult(str, DEFAULT_REQ_WIDTH, DEFAULT_REQ_HEIGHT);
    }

    public static com.google.zxing.Result parseQRCodeResult(java.lang.String str, int i, int i2) {
        return parseCodeResult(str, i, i2, com.king.zxing.DecodeFormatManager.QR_CODE_HINTS);
    }

    public static java.lang.String parseCode(java.lang.String str) {
        return parseCode(str, com.king.zxing.DecodeFormatManager.ALL_HINTS);
    }

    public static java.lang.String parseCode(java.lang.String str, java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> map) {
        com.google.zxing.Result parseCodeResult = parseCodeResult(str, map);
        if (parseCodeResult != null) {
            return parseCodeResult.getText();
        }
        return null;
    }

    public static java.lang.String parseQRCode(android.graphics.Bitmap bitmap) {
        return parseCode(bitmap, com.king.zxing.DecodeFormatManager.QR_CODE_HINTS);
    }

    public static java.lang.String parseCode(android.graphics.Bitmap bitmap) {
        return parseCode(bitmap, com.king.zxing.DecodeFormatManager.ALL_HINTS);
    }

    public static java.lang.String parseCode(android.graphics.Bitmap bitmap, java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> map) {
        com.google.zxing.Result parseCodeResult = parseCodeResult(bitmap, map);
        if (parseCodeResult != null) {
            return parseCodeResult.getText();
        }
        return null;
    }

    public static com.google.zxing.Result parseCodeResult(java.lang.String str, java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> map) {
        return parseCodeResult(str, DEFAULT_REQ_WIDTH, DEFAULT_REQ_HEIGHT, map);
    }

    public static com.google.zxing.Result parseCodeResult(java.lang.String str, int i, int i2, java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> map) {
        return parseCodeResult(compressBitmap(str, i, i2), map);
    }

    public static com.google.zxing.Result parseCodeResult(android.graphics.Bitmap bitmap) {
        return parseCodeResult(getRGBLuminanceSource(bitmap), com.king.zxing.DecodeFormatManager.ALL_HINTS);
    }

    public static com.google.zxing.Result parseCodeResult(android.graphics.Bitmap bitmap, java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> map) {
        return parseCodeResult(getRGBLuminanceSource(bitmap), map);
    }

    public static com.google.zxing.Result parseCodeResult(com.google.zxing.LuminanceSource luminanceSource, java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> map) {
        com.google.zxing.MultiFormatReader multiFormatReader = new com.google.zxing.MultiFormatReader();
        com.google.zxing.Result result = null;
        try {
            try {
                multiFormatReader.setHints(map);
                if (luminanceSource != null) {
                    result = decodeInternal(multiFormatReader, luminanceSource);
                    if (result == null) {
                        result = decodeInternal(multiFormatReader, luminanceSource.invert());
                    }
                    if (result == null && luminanceSource.isRotateSupported()) {
                        result = decodeInternal(multiFormatReader, luminanceSource.rotateCounterClockwise());
                    }
                }
            } catch (java.lang.Exception e) {
                com.king.zxing.util.LogUtils.w(e.getMessage());
            }
            return result;
        } finally {
            multiFormatReader.reset();
        }
    }

    private static com.google.zxing.Result decodeInternal(com.google.zxing.MultiFormatReader multiFormatReader, com.google.zxing.LuminanceSource luminanceSource) {
        com.google.zxing.Result result;
        try {
            result = multiFormatReader.decodeWithState(new com.google.zxing.BinaryBitmap(new com.google.zxing.common.HybridBinarizer(luminanceSource)));
        } catch (java.lang.Exception unused) {
            result = null;
        }
        if (result != null) {
            return result;
        }
        try {
            return multiFormatReader.decodeWithState(new com.google.zxing.BinaryBitmap(new com.google.zxing.common.GlobalHistogramBinarizer(luminanceSource)));
        } catch (java.lang.Exception unused2) {
            return result;
        }
    }

    private static android.graphics.Bitmap compressBitmap(java.lang.String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.BitmapFactory.decodeFile(str, options);
            float f = options.outWidth;
            float f2 = options.outHeight;
            float f3 = i;
            float f4 = i2;
            int max = java.lang.Math.max(f > f3 ? (int) (f / f3) : 1, f2 > f4 ? (int) (f2 / f4) : 1);
            options.inSampleSize = max > 0 ? max : 1;
            options.inJustDecodeBounds = false;
            return android.graphics.BitmapFactory.decodeFile(str, options);
        }
        return android.graphics.BitmapFactory.decodeFile(str);
    }

    private static com.google.zxing.RGBLuminanceSource getRGBLuminanceSource(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return new com.google.zxing.RGBLuminanceSource(width, height, iArr);
    }

    public static android.graphics.Bitmap createBarCode(java.lang.String str, int i, int i2) {
        return createBarCode(str, com.google.zxing.BarcodeFormat.CODE_128, i, i2, (java.util.Map<com.google.zxing.EncodeHintType, ?>) null);
    }

    public static android.graphics.Bitmap createBarCode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2) {
        return createBarCode(str, barcodeFormat, i, i2, (java.util.Map<com.google.zxing.EncodeHintType, ?>) null);
    }

    public static android.graphics.Bitmap createBarCode(java.lang.String str, int i, int i2, boolean z) {
        return createBarCode(str, com.google.zxing.BarcodeFormat.CODE_128, i, i2, null, z, 40, -16777216);
    }

    public static android.graphics.Bitmap createBarCode(java.lang.String str, int i, int i2, boolean z, int i3) {
        return createBarCode(str, com.google.zxing.BarcodeFormat.CODE_128, i, i2, null, z, 40, i3);
    }

    public static android.graphics.Bitmap createBarCode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, java.util.Map<com.google.zxing.EncodeHintType, ?> map) {
        return createBarCode(str, barcodeFormat, i, i2, map, false, 40, -16777216);
    }

    public static android.graphics.Bitmap createBarCode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, java.util.Map<com.google.zxing.EncodeHintType, ?> map, boolean z) {
        return createBarCode(str, barcodeFormat, i, i2, map, z, 40, -16777216);
    }

    public static android.graphics.Bitmap createBarCode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, boolean z, int i3) {
        return createBarCode(str, barcodeFormat, i, i2, null, z, 40, i3);
    }

    public static android.graphics.Bitmap createBarCode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, java.util.Map<com.google.zxing.EncodeHintType, ?> map, boolean z, int i3) {
        return createBarCode(str, barcodeFormat, i, i2, map, z, 40, i3);
    }

    public static android.graphics.Bitmap createBarCode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, java.util.Map<com.google.zxing.EncodeHintType, ?> map, boolean z, int i3, int i4) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            com.google.zxing.common.BitMatrix encode = new com.google.zxing.MultiFormatWriter().encode(str, barcodeFormat, i, i2, map);
            int width = encode.getWidth();
            int height = encode.getHeight();
            int[] iArr = new int[width * height];
            for (int i5 = 0; i5 < height; i5++) {
                int i6 = i5 * width;
                for (int i7 = 0; i7 < width; i7++) {
                    iArr[i6 + i7] = encode.get(i7, i5) ? i4 : -1;
                }
            }
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return z ? addCode(createBitmap, str, i3, i4, i3 / 2) : createBitmap;
        } catch (com.google.zxing.WriterException e) {
            com.king.zxing.util.LogUtils.w(e.getMessage());
            return null;
        }
    }

    private static android.graphics.Bitmap addCode(android.graphics.Bitmap bitmap, java.lang.String str, int i, int i2, int i3) {
        if (bitmap == null) {
            return null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        try {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height + i + (i3 * 2), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
            android.text.TextPaint textPaint = new android.text.TextPaint();
            textPaint.setTextSize(i);
            textPaint.setColor(i2);
            textPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
            canvas.drawText(str, width / 2, height + (i / 2) + i3, textPaint);
            canvas.save();
            canvas.restore();
            return createBitmap;
        } catch (java.lang.Exception e) {
            com.king.zxing.util.LogUtils.w(e.getMessage());
            return null;
        }
    }
}
