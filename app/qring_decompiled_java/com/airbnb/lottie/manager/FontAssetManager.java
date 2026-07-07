package com.airbnb.lottie.manager;

/* loaded from: classes.dex */
public class FontAssetManager {
    private final android.content.res.AssetManager assetManager;
    private com.airbnb.lottie.FontAssetDelegate delegate;
    private final com.airbnb.lottie.model.MutablePair<java.lang.String> tempPair = new com.airbnb.lottie.model.MutablePair<>();
    private final java.util.Map<com.airbnb.lottie.model.MutablePair<java.lang.String>, android.graphics.Typeface> fontMap = new java.util.HashMap();
    private final java.util.Map<java.lang.String, android.graphics.Typeface> fontFamilies = new java.util.HashMap();
    private java.lang.String defaultFontFileExtension = ".ttf";

    public FontAssetManager(android.graphics.drawable.Drawable.Callback callback, com.airbnb.lottie.FontAssetDelegate fontAssetDelegate) {
        this.delegate = fontAssetDelegate;
        if (!(callback instanceof android.view.View)) {
            com.airbnb.lottie.utils.Logger.warning("LottieDrawable must be inside of a view for images to work.");
            this.assetManager = null;
        } else {
            this.assetManager = ((android.view.View) callback).getContext().getAssets();
        }
    }

    public void setDelegate(com.airbnb.lottie.FontAssetDelegate fontAssetDelegate) {
        this.delegate = fontAssetDelegate;
    }

    public void setDefaultFontFileExtension(java.lang.String str) {
        this.defaultFontFileExtension = str;
    }

    public android.graphics.Typeface getTypeface(java.lang.String str, java.lang.String str2) {
        this.tempPair.set(str, str2);
        android.graphics.Typeface typeface = this.fontMap.get(this.tempPair);
        if (typeface != null) {
            return typeface;
        }
        android.graphics.Typeface typefaceForStyle = typefaceForStyle(getFontFamily(str), str2);
        this.fontMap.put(this.tempPair, typefaceForStyle);
        return typefaceForStyle;
    }

    private android.graphics.Typeface getFontFamily(java.lang.String str) {
        java.lang.String fontPath;
        android.graphics.Typeface typeface = this.fontFamilies.get(str);
        if (typeface != null) {
            return typeface;
        }
        com.airbnb.lottie.FontAssetDelegate fontAssetDelegate = this.delegate;
        android.graphics.Typeface fetchFont = fontAssetDelegate != null ? fontAssetDelegate.fetchFont(str) : null;
        com.airbnb.lottie.FontAssetDelegate fontAssetDelegate2 = this.delegate;
        if (fontAssetDelegate2 != null && fetchFont == null && (fontPath = fontAssetDelegate2.getFontPath(str)) != null) {
            fetchFont = android.graphics.Typeface.createFromAsset(this.assetManager, fontPath);
        }
        if (fetchFont == null) {
            fetchFont = android.graphics.Typeface.createFromAsset(this.assetManager, "fonts/" + str + this.defaultFontFileExtension);
        }
        this.fontFamilies.put(str, fetchFont);
        return fetchFont;
    }

    private android.graphics.Typeface typefaceForStyle(android.graphics.Typeface typeface, java.lang.String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : android.graphics.Typeface.create(typeface, i);
    }
}
