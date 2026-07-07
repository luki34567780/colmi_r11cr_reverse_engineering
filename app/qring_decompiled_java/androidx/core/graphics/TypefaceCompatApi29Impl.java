package androidx.core.graphics;

/* loaded from: classes.dex */
public class TypefaceCompatApi29Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected androidx.core.provider.FontsContractCompat.FontInfo findBestInfo(androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected android.graphics.Typeface createFromInputStream(android.content.Context context, java.io.InputStream inputStream) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        int i2;
        android.os.ParcelFileDescriptor openFileDescriptor;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = fontInfoArr.length;
            android.graphics.fonts.FontFamily.Builder builder = null;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    if (builder == null) {
                        return null;
                    }
                    return new android.graphics.Typeface.CustomFallbackBuilder(builder.build()).setStyle(new android.graphics.fonts.FontStyle((i & 1) != 0 ? 700 : com.autonavi.base.ae.gmap.glyph.FontStyle.WEIGHT_NORMAL, (i & 2) != 0 ? 1 : 0)).build();
                }
                androidx.core.provider.FontsContractCompat.FontInfo fontInfo = fontInfoArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(fontInfo.getUri(), "r", cancellationSignal);
                } catch (java.io.IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                } else {
                    try {
                        android.graphics.fonts.Font.Builder weight = new android.graphics.fonts.Font.Builder(openFileDescriptor).setWeight(fontInfo.getWeight());
                        if (!fontInfo.isItalic()) {
                            i3 = 0;
                        }
                        android.graphics.fonts.Font build = weight.setSlant(i3).setTtcIndex(fontInfo.getTtcIndex()).build();
                        if (builder == null) {
                            builder = new android.graphics.fonts.FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                        if (openFileDescriptor == null) {
                        }
                    } catch (java.lang.Throwable th) {
                        if (openFileDescriptor != null) {
                            try {
                                openFileDescriptor.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                openFileDescriptor.close();
            }
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, android.content.res.Resources resources, int i) {
        try {
            androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] entries = fontFamilyFilesResourceEntry.getEntries();
            int length = entries.length;
            android.graphics.fonts.FontFamily.Builder builder = null;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    break;
                }
                androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry = entries[i2];
                try {
                    android.graphics.fonts.Font.Builder weight = new android.graphics.fonts.Font.Builder(resources, fontFileResourceEntry.getResourceId()).setWeight(fontFileResourceEntry.getWeight());
                    if (!fontFileResourceEntry.isItalic()) {
                        i3 = 0;
                    }
                    android.graphics.fonts.Font build = weight.setSlant(i3).setTtcIndex(fontFileResourceEntry.getTtcIndex()).setFontVariationSettings(fontFileResourceEntry.getVariationSettings()).build();
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (java.io.IOException unused) {
                }
                i2++;
            }
            if (builder == null) {
                return null;
            }
            return new android.graphics.Typeface.CustomFallbackBuilder(builder.build()).setStyle(new android.graphics.fonts.FontStyle((i & 1) != 0 ? 700 : com.autonavi.base.ae.gmap.glyph.FontStyle.WEIGHT_NORMAL, (i & 2) != 0 ? 1 : 0)).build();
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        try {
            android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(resources, i).build();
            return new android.graphics.Typeface.CustomFallbackBuilder(new android.graphics.fonts.FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
