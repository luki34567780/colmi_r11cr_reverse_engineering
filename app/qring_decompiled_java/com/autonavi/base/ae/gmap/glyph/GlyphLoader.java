package com.autonavi.base.ae.gmap.glyph;

/* loaded from: classes.dex */
public class GlyphLoader {
    private static java.util.Map<java.lang.String, android.graphics.Typeface> FontFaceMap = new java.util.HashMap();

    private static native long nativeCreateGlyphLoader();

    private static native void nativeDestroyGlyphLoader(long j);

    private static com.autonavi.base.ae.gmap.glyph.GlyphMetrics loadGlyphMetrics(java.lang.String str, com.autonavi.base.ae.gmap.glyph.FontStyle fontStyle, float f, java.lang.String str2, boolean z, float f2, boolean z2, boolean z3) {
        com.autonavi.base.ae.gmap.glyph.GlyphMetrics glyphMetrics = new com.autonavi.base.ae.gmap.glyph.GlyphMetrics();
        if (fontStyle == null || android.text.TextUtils.isEmpty(str)) {
            return glyphMetrics;
        }
        try {
            if (!z2) {
                android.text.TextPaint newTextPaint = newTextPaint(fontStyle, f, str2, z, f2);
                android.graphics.Rect rect = new android.graphics.Rect();
                newTextPaint.getTextBounds(str, 0, str.length(), rect);
                if (rect.width() == 0 && rect.height() == 0) {
                    float measureText = newTextPaint.measureText(" ", 0, 1);
                    float abs = java.lang.Math.abs(newTextPaint.getFontMetrics().ascent) + java.lang.Math.abs(newTextPaint.getFontMetrics().descent);
                    rect.top = 0;
                    rect.left = 0;
                    rect.right = (int) measureText;
                    rect.bottom = (int) abs;
                }
                if (z && f2 > 0.0f) {
                    float f3 = f2 / 2.0f;
                    rect.top = (int) (rect.top - f3);
                    rect.left = (int) (rect.left - f3);
                    rect.right = (int) (rect.right + f3);
                    rect.bottom = (int) (rect.bottom + f3);
                }
                glyphMetrics.bSuccess = true;
                glyphMetrics.fLeft = rect.left;
                glyphMetrics.fTop = java.lang.Math.abs(newTextPaint.getFontMetrics().ascent) - java.lang.Math.abs(rect.top);
                glyphMetrics.nWidth = rect.width();
                glyphMetrics.nHeight = rect.height();
                glyphMetrics.fAdvance = newTextPaint.measureText(str);
                newTextPaint.setTypeface(null);
            } else {
                glyphMetrics.bSuccess = true;
                glyphMetrics.fLeft = 0.0f;
                glyphMetrics.fTop = 0.0f;
                int i = (int) f;
                glyphMetrics.nWidth = i;
                glyphMetrics.nHeight = i;
                glyphMetrics.fAdvance = f;
            }
        } catch (java.lang.Exception unused) {
            glyphMetrics.bSuccess = false;
        }
        return glyphMetrics;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:8|9|10|(9:12|14|15|(1:19)|(1:23)|24|(9:26|(7:30|(1:32)(1:50)|33|(4:35|(4:37|(2:40|38)|41|42)|43|44)|45|(1:47)(1:49)|48)|51|(0)(0)|33|(0)|45|(0)(0)|48)|52|53)|56|14|15|(2:17|19)|(2:21|23)|24|(0)|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013a, code lost:
    
        r0.bSuccess = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7 A[Catch: Exception -> 0x013a, TryCatch #1 {Exception -> 0x013a, blocks: (B:15:0x0049, B:17:0x0060, B:19:0x0066, B:23:0x0092, B:24:0x00b1, B:26:0x00b7, B:33:0x00c8, B:35:0x0105, B:38:0x010b, B:40:0x010f, B:42:0x011d, B:45:0x0121, B:47:0x0127, B:48:0x012c, B:49:0x012a, B:51:0x00c0, B:52:0x0136), top: B:14:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105 A[Catch: Exception -> 0x013a, TryCatch #1 {Exception -> 0x013a, blocks: (B:15:0x0049, B:17:0x0060, B:19:0x0066, B:23:0x0092, B:24:0x00b1, B:26:0x00b7, B:33:0x00c8, B:35:0x0105, B:38:0x010b, B:40:0x010f, B:42:0x011d, B:45:0x0121, B:47:0x0127, B:48:0x012c, B:49:0x012a, B:51:0x00c0, B:52:0x0136), top: B:14:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127 A[Catch: Exception -> 0x013a, TryCatch #1 {Exception -> 0x013a, blocks: (B:15:0x0049, B:17:0x0060, B:19:0x0066, B:23:0x0092, B:24:0x00b1, B:26:0x00b7, B:33:0x00c8, B:35:0x0105, B:38:0x010b, B:40:0x010f, B:42:0x011d, B:45:0x0121, B:47:0x0127, B:48:0x012c, B:49:0x012a, B:51:0x00c0, B:52:0x0136), top: B:14:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a A[Catch: Exception -> 0x013a, TryCatch #1 {Exception -> 0x013a, blocks: (B:15:0x0049, B:17:0x0060, B:19:0x0066, B:23:0x0092, B:24:0x00b1, B:26:0x00b7, B:33:0x00c8, B:35:0x0105, B:38:0x010b, B:40:0x010f, B:42:0x011d, B:45:0x0121, B:47:0x0127, B:48:0x012c, B:49:0x012a, B:51:0x00c0, B:52:0x0136), top: B:14:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.autonavi.base.ae.gmap.glyph.GlyphRaster loadGlyphRaster(java.lang.String r8, com.autonavi.base.ae.gmap.glyph.FontStyle r9, float r10, java.lang.String r11, boolean r12, float r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.autonavi.base.ae.gmap.glyph.GlyphLoader.loadGlyphRaster(java.lang.String, com.autonavi.base.ae.gmap.glyph.FontStyle, float, java.lang.String, boolean, float, boolean, boolean):com.autonavi.base.ae.gmap.glyph.GlyphRaster");
    }

    private static com.autonavi.base.ae.gmap.glyph.GlyphRequestParam genGlyphRequestParam(byte[] bArr) {
        com.autonavi.base.ae.gmap.glyph.GlyphRequestParam glyphRequestParam = new com.autonavi.base.ae.gmap.glyph.GlyphRequestParam();
        int i = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, 0);
        glyphRequestParam.strBuffer = new java.lang.String(bArr, 4, i);
        int i2 = i + 4;
        com.autonavi.base.ae.gmap.glyph.Font font = new com.autonavi.base.ae.gmap.glyph.Font();
        font.nFontStyleCode = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i2);
        int i3 = i2 + 4;
        font.nFontSize = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i3);
        int i4 = i3 + 4;
        int i5 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i4);
        int i6 = i4 + 4;
        font.strName = new java.lang.String(bArr, i6, i5);
        int i7 = i6 + i5;
        com.autonavi.base.ae.gmap.glyph.FontMetrics fontMetrics = new com.autonavi.base.ae.gmap.glyph.FontMetrics();
        int i8 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i7);
        int i9 = i7 + 4;
        fontMetrics.fAscent = i8 * 0.001f;
        int i10 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i9);
        int i11 = i9 + 4;
        fontMetrics.fDescent = i10 * 0.001f;
        int i12 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i11);
        int i13 = i11 + 4;
        fontMetrics.fLeading = i12 * 0.001f;
        int i14 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i13);
        int i15 = i13 + 4;
        fontMetrics.fHeight = i14 * 0.001f;
        font.fontMetrics = fontMetrics;
        glyphRequestParam.font = font;
        glyphRequestParam.drawingMode = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i15);
        int i16 = i15 + 4;
        int i17 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i16);
        int i18 = i16 + 4;
        glyphRequestParam.strokeWidth = i17 * 0.001f;
        int i19 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i18);
        int i20 = i18 + 4;
        glyphRequestParam.languageArr = new java.lang.String(bArr, i20, i19);
        glyphRequestParam.isEmoji = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i20);
        int i21 = i20 + 4;
        glyphRequestParam.isSDF = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i21);
        int i22 = i21 + 4;
        int i23 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i22);
        int i24 = i22 + 4;
        if (1 == i23) {
            com.autonavi.base.ae.gmap.glyph.GlyphMetrics glyphMetrics = new com.autonavi.base.ae.gmap.glyph.GlyphMetrics();
            glyphMetrics.nWidth = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i24);
            int i25 = i24 + 4;
            glyphMetrics.nHeight = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i25);
            int i26 = i25 + 4;
            int i27 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i26);
            int i28 = i26 + 4;
            glyphMetrics.fLeft = i27 * 0.001f;
            glyphMetrics.fTop = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i28) * 0.001f;
            glyphMetrics.fAdvance = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i28 + 4) * 0.001f;
            glyphRequestParam.fGlyphMetrics = glyphMetrics;
        }
        return glyphRequestParam;
    }

    private static com.autonavi.base.ae.gmap.glyph.FontMetricsRequestParam genFontMetricsParam(byte[] bArr) {
        com.autonavi.base.ae.gmap.glyph.FontMetricsRequestParam fontMetricsRequestParam = new com.autonavi.base.ae.gmap.glyph.FontMetricsRequestParam();
        fontMetricsRequestParam.fFontSize = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, 0) * 0.001f;
        fontMetricsRequestParam.nFontStyleCode = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, 4);
        int i = 12;
        if (1 == com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, 8)) {
            int i2 = com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, 12);
            fontMetricsRequestParam.strName = new java.lang.String(bArr, 16, i2);
            i = i2 + 16;
        }
        fontMetricsRequestParam.languageArr = new java.lang.String(bArr, i + 4, com.autonavi.base.amap.mapcore.tools.GLConvertUtil.getInt(bArr, i));
        return fontMetricsRequestParam;
    }

    private static com.autonavi.base.ae.gmap.glyph.GlyphMetrics getGlyphMetrics(byte[] bArr) {
        com.autonavi.base.ae.gmap.glyph.GlyphRequestParam genGlyphRequestParam = genGlyphRequestParam(bArr);
        return loadGlyphMetrics(genGlyphRequestParam.strBuffer, new com.autonavi.base.ae.gmap.glyph.FontStyle(genGlyphRequestParam.font.nFontStyleCode), genGlyphRequestParam.font.nFontSize, genGlyphRequestParam.font.strName, genGlyphRequestParam.drawingMode != 0, genGlyphRequestParam.strokeWidth, genGlyphRequestParam.isEmoji > 0, genGlyphRequestParam.isSDF > 0);
    }

    private static com.autonavi.base.ae.gmap.glyph.GlyphRaster getGlyphRaster(byte[] bArr) {
        com.autonavi.base.ae.gmap.glyph.GlyphRequestParam genGlyphRequestParam = genGlyphRequestParam(bArr);
        com.autonavi.base.ae.gmap.glyph.FontStyle fontStyle = new com.autonavi.base.ae.gmap.glyph.FontStyle(genGlyphRequestParam.font.nFontStyleCode);
        boolean z = genGlyphRequestParam.drawingMode != 0;
        if (genGlyphRequestParam.drawingMode == 3) {
            return loadPathRaster(genGlyphRequestParam.strBuffer, fontStyle, genGlyphRequestParam.font.nFontSize, genGlyphRequestParam.font.strName, z, 2.0f * genGlyphRequestParam.strokeWidth);
        }
        return loadGlyphRaster(genGlyphRequestParam.strBuffer, fontStyle, genGlyphRequestParam.font.nFontSize, genGlyphRequestParam.font.strName, z, genGlyphRequestParam.strokeWidth, genGlyphRequestParam.isEmoji > 0, genGlyphRequestParam.isSDF > 0);
    }

    public static com.autonavi.base.ae.gmap.glyph.GlyphRaster loadPathRaster(java.lang.String str, com.autonavi.base.ae.gmap.glyph.FontStyle fontStyle, float f, java.lang.String str2, boolean z, float f2) {
        com.autonavi.base.ae.gmap.glyph.GlyphRaster glyphRaster = new com.autonavi.base.ae.gmap.glyph.GlyphRaster();
        if (fontStyle == null || android.text.TextUtils.isEmpty(str)) {
            return glyphRaster;
        }
        try {
            android.text.TextPaint newTextPaint = newTextPaint(fontStyle, f, str2, false, 0.0f);
            android.graphics.Rect rect = new android.graphics.Rect();
            newTextPaint.getTextBounds(str, 0, str.length(), rect);
            new android.graphics.Canvas(android.graphics.Bitmap.createBitmap(rect.width(), rect.height(), android.graphics.Bitmap.Config.ALPHA_8)).drawText(str, 0 - rect.left, 0 - rect.top, newTextPaint);
            android.text.TextPaint newTextPaint2 = newTextPaint(fontStyle, f, str2, z, f2);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            newTextPaint2.getTextBounds(str, 0, str.length(), rect2);
            if (z && f2 > 0.0f) {
                float f3 = 0.5f * f2;
                rect2.top = (int) (rect2.top - f3);
                rect2.left = (int) (rect2.left - f3);
                rect2.right = (int) (rect2.right + f3);
                rect2.bottom = (int) (rect2.bottom + f3);
            }
            if (!rect2.isEmpty()) {
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(rect2.width(), rect2.height(), android.graphics.Bitmap.Config.ALPHA_8);
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                float f4 = 0 - rect2.left;
                float f5 = 0 - rect2.top;
                android.graphics.Path path = new android.graphics.Path();
                newTextPaint.getTextPath(str, 0, str.length(), f4, f5, path);
                canvas.drawPath(path, newTextPaint2);
                int width = rect2.width() * rect2.height();
                byte[] bArr = new byte[width];
                java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
                glyphRaster.bitmapWidth = rect2.width();
                glyphRaster.bitmapHeight = rect2.height();
                glyphRaster.bitmapPixelMode = 0;
                glyphRaster.bitmapSize = width;
                createBitmap.copyPixelsToBuffer(wrap);
                createBitmap.recycle();
                glyphRaster.bitmapBuffer = bArr;
                glyphRaster.bSuccess = true;
            }
            newTextPaint.setTypeface(null);
            newTextPaint2.setTypeface(null);
        } catch (java.lang.Exception unused) {
            glyphRaster.bSuccess = false;
        }
        return glyphRaster;
    }

    private static com.autonavi.base.ae.gmap.glyph.FontMetrics getFontMetrics(byte[] bArr) {
        com.autonavi.base.ae.gmap.glyph.FontMetricsRequestParam genFontMetricsParam = genFontMetricsParam(bArr);
        android.text.TextPaint newTextPaint = newTextPaint(new com.autonavi.base.ae.gmap.glyph.FontStyle(genFontMetricsParam.nFontStyleCode), genFontMetricsParam.fFontSize, genFontMetricsParam.strName, false, 0.0f);
        android.graphics.Paint.FontMetrics fontMetrics = newTextPaint.getFontMetrics();
        com.autonavi.base.ae.gmap.glyph.FontMetrics fontMetrics2 = new com.autonavi.base.ae.gmap.glyph.FontMetrics();
        fontMetrics2.bSuccess = true;
        fontMetrics2.fAscent = java.lang.Math.abs(fontMetrics.ascent);
        fontMetrics2.fDescent = java.lang.Math.abs(fontMetrics.descent);
        fontMetrics2.fLeading = java.lang.Math.abs(fontMetrics.leading);
        fontMetrics2.fHeight = java.lang.Math.abs(fontMetrics.ascent) + java.lang.Math.abs(fontMetrics.descent);
        newTextPaint.setTypeface(null);
        return fontMetrics2;
    }

    private static java.lang.String decodeUnicode(short s) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append((char) s);
        return stringBuffer.toString();
    }

    private static java.lang.String decodeUnicode(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0054, code lost:
    
        if (r3 != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.text.TextPaint newTextPaint(com.autonavi.base.ae.gmap.glyph.FontStyle r2, float r3, java.lang.String r4, boolean r5, float r6) {
        /*
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            if (r2 != 0) goto L8
            return r0
        L8:
            r1 = -1
            r0.setColor(r1)
            r1 = 1
            r0.setAntiAlias(r1)
            r0.setFilterBitmap(r1)
            r0.setTextSize(r3)
            android.graphics.Paint$Align r3 = android.graphics.Paint.Align.LEFT
            r0.setTextAlign(r3)
            if (r5 == 0) goto L26
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r3)
            r0.setStrokeWidth(r6)
            goto L2b
        L26:
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r0.setStyle(r3)
        L2b:
            int r3 = r2.getSlant()
            r5 = 2
            r6 = 0
            if (r3 == 0) goto L3a
            if (r3 == r1) goto L38
            if (r3 == r5) goto L38
            goto L3a
        L38:
            r3 = 1
            goto L3b
        L3a:
            r3 = 0
        L3b:
            int r2 = r2.getWeight()
            switch(r2) {
                case 0: goto L45;
                case 100: goto L45;
                case 200: goto L45;
                case 300: goto L45;
                case 400: goto L45;
                case 500: goto L43;
                case 600: goto L43;
                case 700: goto L43;
                case 800: goto L43;
                case 900: goto L43;
                case 1000: goto L43;
                default: goto L42;
            }
        L42:
            goto L45
        L43:
            r2 = 1
            goto L46
        L45:
            r2 = 0
        L46:
            if (r2 == 0) goto L4e
            if (r3 == 0) goto L4e
            r0.setFakeBoldText(r1)
            goto L57
        L4e:
            if (r2 == 0) goto L54
            r0.setFakeBoldText(r1)
            goto L57
        L54:
            if (r3 == 0) goto L57
            goto L58
        L57:
            r5 = 0
        L58:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NumberFormatException -> L60
            r3 = 23
            if (r2 < r3) goto L61
            r1 = 0
            goto L61
        L60:
        L61:
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L8c
            if (r1 == 0) goto L6a
            goto L8c
        L6a:
            java.util.Map<java.lang.String, android.graphics.Typeface> r2 = com.autonavi.base.ae.gmap.glyph.GlyphLoader.FontFaceMap     // Catch: java.lang.Exception -> L85
            monitor-enter(r2)     // Catch: java.lang.Exception -> L85
            java.util.Map<java.lang.String, android.graphics.Typeface> r3 = com.autonavi.base.ae.gmap.glyph.GlyphLoader.FontFaceMap     // Catch: java.lang.Throwable -> L82
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L82
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3     // Catch: java.lang.Throwable -> L82
            if (r3 != 0) goto L80
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromFile(r4)     // Catch: java.lang.Throwable -> L82
            java.util.Map<java.lang.String, android.graphics.Typeface> r6 = com.autonavi.base.ae.gmap.glyph.GlyphLoader.FontFaceMap     // Catch: java.lang.Throwable -> L82
            r6.put(r4, r3)     // Catch: java.lang.Throwable -> L82
        L80:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L82
            goto L92
        L82:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L82
            throw r3     // Catch: java.lang.Exception -> L85
        L85:
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r2, r5)
            goto L92
        L8c:
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r2, r5)
        L92:
            r0.setTypeface(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.autonavi.base.ae.gmap.glyph.GlyphLoader.newTextPaint(com.autonavi.base.ae.gmap.glyph.FontStyle, float, java.lang.String, boolean, float):android.text.TextPaint");
    }

    public static long createGlyphLoader() {
        return nativeCreateGlyphLoader();
    }

    public static void destroyGlyphLoader(long j) {
        nativeDestroyGlyphLoader(j);
    }
}
