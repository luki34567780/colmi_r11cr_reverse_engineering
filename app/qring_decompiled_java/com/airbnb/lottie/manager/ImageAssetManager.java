package com.airbnb.lottie.manager;

/* loaded from: classes.dex */
public class ImageAssetManager {
    private static final java.lang.Object bitmapHashLock = new java.lang.Object();
    private final android.content.Context context;
    private com.airbnb.lottie.ImageAssetDelegate delegate;
    private final java.util.Map<java.lang.String, com.airbnb.lottie.LottieImageAsset> imageAssets;
    private java.lang.String imagesFolder;

    public ImageAssetManager(android.graphics.drawable.Drawable.Callback callback, java.lang.String str, com.airbnb.lottie.ImageAssetDelegate imageAssetDelegate, java.util.Map<java.lang.String, com.airbnb.lottie.LottieImageAsset> map) {
        this.imagesFolder = str;
        if (!android.text.TextUtils.isEmpty(str)) {
            if (this.imagesFolder.charAt(r4.length() - 1) != '/') {
                this.imagesFolder += '/';
            }
        }
        if (!(callback instanceof android.view.View)) {
            com.airbnb.lottie.utils.Logger.warning("LottieDrawable must be inside of a view for images to work.");
            this.imageAssets = new java.util.HashMap();
            this.context = null;
        } else {
            this.context = ((android.view.View) callback).getContext();
            this.imageAssets = map;
            setDelegate(imageAssetDelegate);
        }
    }

    public void setDelegate(com.airbnb.lottie.ImageAssetDelegate imageAssetDelegate) {
        this.delegate = imageAssetDelegate;
    }

    public android.graphics.Bitmap updateBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            com.airbnb.lottie.LottieImageAsset lottieImageAsset = this.imageAssets.get(str);
            android.graphics.Bitmap bitmap2 = lottieImageAsset.getBitmap();
            lottieImageAsset.setBitmap(null);
            return bitmap2;
        }
        android.graphics.Bitmap bitmap3 = this.imageAssets.get(str).getBitmap();
        putBitmap(str, bitmap);
        return bitmap3;
    }

    public android.graphics.Bitmap bitmapForId(java.lang.String str) {
        com.airbnb.lottie.LottieImageAsset lottieImageAsset = this.imageAssets.get(str);
        if (lottieImageAsset == null) {
            return null;
        }
        android.graphics.Bitmap bitmap = lottieImageAsset.getBitmap();
        if (bitmap != null) {
            return bitmap;
        }
        com.airbnb.lottie.ImageAssetDelegate imageAssetDelegate = this.delegate;
        if (imageAssetDelegate != null) {
            android.graphics.Bitmap fetchBitmap = imageAssetDelegate.fetchBitmap(lottieImageAsset);
            if (fetchBitmap != null) {
                putBitmap(str, fetchBitmap);
            }
            return fetchBitmap;
        }
        java.lang.String fileName = lottieImageAsset.getFileName();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = com.autonavi.amap.mapcore.tools.GlMapUtil.DEVICE_DISPLAY_DPI_NORMAL;
        if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
            try {
                byte[] decode = android.util.Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                return putBitmap(str, android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (java.lang.IllegalArgumentException e) {
                com.airbnb.lottie.utils.Logger.warning("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (android.text.TextUtils.isEmpty(this.imagesFolder)) {
                throw new java.lang.IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            return putBitmap(str, com.airbnb.lottie.utils.Utils.resizeBitmapIfNeeded(android.graphics.BitmapFactory.decodeStream(this.context.getAssets().open(this.imagesFolder + fileName), null, options), lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
        } catch (java.io.IOException e2) {
            com.airbnb.lottie.utils.Logger.warning("Unable to open asset.", e2);
            return null;
        }
    }

    public boolean hasSameContext(android.content.Context context) {
        return (context == null && this.context == null) || this.context.equals(context);
    }

    private android.graphics.Bitmap putBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
        synchronized (bitmapHashLock) {
            this.imageAssets.get(str).setBitmap(bitmap);
        }
        return bitmap;
    }
}
