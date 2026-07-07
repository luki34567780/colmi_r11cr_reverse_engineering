package com.androidnetworking.internal;

/* loaded from: classes.dex */
public class ANImageLoader {
    private static final int cacheSize;
    private static final int maxMemory;
    private static com.androidnetworking.internal.ANImageLoader sInstance;
    private final com.androidnetworking.internal.ANImageLoader.ImageCache mCache;
    private java.lang.Runnable mRunnable;
    private int mBatchResponseDelayMs = 100;
    private final java.util.HashMap<java.lang.String, com.androidnetworking.internal.ANImageLoader.BatchedImageRequest> mInFlightRequests = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, com.androidnetworking.internal.ANImageLoader.BatchedImageRequest> mBatchedResponses = new java.util.HashMap<>();
    private final android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private android.graphics.BitmapFactory.Options mBitmapOptions = new android.graphics.BitmapFactory.Options();

    public interface ImageCache {
        void evictAllBitmap();

        void evictBitmap(java.lang.String str);

        android.graphics.Bitmap getBitmap(java.lang.String str);

        void putBitmap(java.lang.String str, android.graphics.Bitmap bitmap);
    }

    public interface ImageListener {
        void onError(com.androidnetworking.error.ANError aNError);

        void onResponse(com.androidnetworking.internal.ANImageLoader.ImageContainer imageContainer, boolean z);
    }

    static {
        int maxMemory2 = (int) (java.lang.Runtime.getRuntime().maxMemory() / 1024);
        maxMemory = maxMemory2;
        cacheSize = maxMemory2 / 8;
    }

    public static void initialize() {
        getInstance();
    }

    public static com.androidnetworking.internal.ANImageLoader getInstance() {
        if (sInstance == null) {
            synchronized (com.androidnetworking.internal.ANImageLoader.class) {
                if (sInstance == null) {
                    sInstance = new com.androidnetworking.internal.ANImageLoader(new com.androidnetworking.cache.LruBitmapCache(cacheSize));
                }
            }
        }
        return sInstance;
    }

    public ANImageLoader(com.androidnetworking.internal.ANImageLoader.ImageCache imageCache) {
        this.mCache = imageCache;
    }

    public com.androidnetworking.internal.ANImageLoader.ImageCache getImageCache() {
        return this.mCache;
    }

    public static com.androidnetworking.internal.ANImageLoader.ImageListener getImageListener(final android.widget.ImageView imageView, final int i, final int i2) {
        return new com.androidnetworking.internal.ANImageLoader.ImageListener() { // from class: com.androidnetworking.internal.ANImageLoader.1
            @Override // com.androidnetworking.internal.ANImageLoader.ImageListener
            public void onResponse(com.androidnetworking.internal.ANImageLoader.ImageContainer imageContainer, boolean z) {
                if (imageContainer.getBitmap() != null) {
                    imageView.setImageBitmap(imageContainer.getBitmap());
                    return;
                }
                int i3 = i;
                if (i3 != 0) {
                    imageView.setImageResource(i3);
                }
            }

            @Override // com.androidnetworking.internal.ANImageLoader.ImageListener
            public void onError(com.androidnetworking.error.ANError aNError) {
                int i3 = i2;
                if (i3 != 0) {
                    imageView.setImageResource(i3);
                }
            }
        };
    }

    public boolean isCached(java.lang.String str, int i, int i2) {
        return isCached(str, i, i2, android.widget.ImageView.ScaleType.CENTER_INSIDE);
    }

    public boolean isCached(java.lang.String str, int i, int i2, android.widget.ImageView.ScaleType scaleType) {
        throwIfNotOnMainThread();
        return this.mCache.getBitmap(getCacheKey(str, i, i2, scaleType)) != null;
    }

    public com.androidnetworking.internal.ANImageLoader.ImageContainer get(java.lang.String str, com.androidnetworking.internal.ANImageLoader.ImageListener imageListener) {
        return get(str, imageListener, 0, 0);
    }

    public com.androidnetworking.internal.ANImageLoader.ImageContainer get(java.lang.String str, com.androidnetworking.internal.ANImageLoader.ImageListener imageListener, int i, int i2) {
        return get(str, imageListener, i, i2, android.widget.ImageView.ScaleType.CENTER_INSIDE);
    }

    public com.androidnetworking.internal.ANImageLoader.ImageContainer get(java.lang.String str, com.androidnetworking.internal.ANImageLoader.ImageListener imageListener, int i, int i2, android.widget.ImageView.ScaleType scaleType) {
        throwIfNotOnMainThread();
        java.lang.String cacheKey = getCacheKey(str, i, i2, scaleType);
        android.graphics.Bitmap bitmap = this.mCache.getBitmap(cacheKey);
        if (bitmap != null) {
            com.androidnetworking.internal.ANImageLoader.ImageContainer imageContainer = new com.androidnetworking.internal.ANImageLoader.ImageContainer(bitmap, str, null, null);
            imageListener.onResponse(imageContainer, true);
            return imageContainer;
        }
        com.androidnetworking.internal.ANImageLoader.ImageContainer imageContainer2 = new com.androidnetworking.internal.ANImageLoader.ImageContainer(null, str, cacheKey, imageListener);
        imageListener.onResponse(imageContainer2, true);
        com.androidnetworking.internal.ANImageLoader.BatchedImageRequest batchedImageRequest = this.mInFlightRequests.get(cacheKey);
        if (batchedImageRequest != null) {
            batchedImageRequest.addContainer(imageContainer2);
            return imageContainer2;
        }
        this.mInFlightRequests.put(cacheKey, new com.androidnetworking.internal.ANImageLoader.BatchedImageRequest(makeImageRequest(str, i, i2, scaleType, cacheKey), imageContainer2));
        return imageContainer2;
    }

    protected com.androidnetworking.common.ANRequest makeImageRequest(java.lang.String str, int i, int i2, android.widget.ImageView.ScaleType scaleType, final java.lang.String str2) {
        com.androidnetworking.common.ANRequest build = com.androidnetworking.AndroidNetworking.get(str).setTag((java.lang.Object) "ImageRequestTag").setBitmapMaxHeight(i2).setBitmapMaxWidth(i).setImageScaleType(scaleType).setBitmapConfig(android.graphics.Bitmap.Config.RGB_565).setBitmapOptions(this.mBitmapOptions).build();
        build.getAsBitmap(new com.androidnetworking.interfaces.BitmapRequestListener() { // from class: com.androidnetworking.internal.ANImageLoader.2
            @Override // com.androidnetworking.interfaces.BitmapRequestListener
            public void onResponse(android.graphics.Bitmap bitmap) {
                com.androidnetworking.internal.ANImageLoader.this.onGetImageSuccess(str2, bitmap);
            }

            @Override // com.androidnetworking.interfaces.BitmapRequestListener
            public void onError(com.androidnetworking.error.ANError aNError) {
                com.androidnetworking.internal.ANImageLoader.this.onGetImageError(str2, aNError);
            }
        });
        return build;
    }

    public void setBitmapDecodeOptions(android.graphics.BitmapFactory.Options options) {
        this.mBitmapOptions = options;
    }

    public void setBatchedResponseDelay(int i) {
        this.mBatchResponseDelayMs = i;
    }

    protected void onGetImageSuccess(java.lang.String str, android.graphics.Bitmap bitmap) {
        this.mCache.putBitmap(str, bitmap);
        com.androidnetworking.internal.ANImageLoader.BatchedImageRequest remove = this.mInFlightRequests.remove(str);
        if (remove != null) {
            remove.mResponseBitmap = bitmap;
            batchResponse(str, remove);
        }
    }

    protected void onGetImageError(java.lang.String str, com.androidnetworking.error.ANError aNError) {
        com.androidnetworking.internal.ANImageLoader.BatchedImageRequest remove = this.mInFlightRequests.remove(str);
        if (remove != null) {
            remove.setError(aNError);
            batchResponse(str, remove);
        }
    }

    public class ImageContainer {
        private android.graphics.Bitmap mBitmap;
        private final java.lang.String mCacheKey;
        private final com.androidnetworking.internal.ANImageLoader.ImageListener mListener;
        private final java.lang.String mRequestUrl;

        public ImageContainer(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, com.androidnetworking.internal.ANImageLoader.ImageListener imageListener) {
            this.mBitmap = bitmap;
            this.mRequestUrl = str;
            this.mCacheKey = str2;
            this.mListener = imageListener;
        }

        public void cancelRequest() {
            if (this.mListener == null) {
                return;
            }
            com.androidnetworking.internal.ANImageLoader.BatchedImageRequest batchedImageRequest = (com.androidnetworking.internal.ANImageLoader.BatchedImageRequest) com.androidnetworking.internal.ANImageLoader.this.mInFlightRequests.get(this.mCacheKey);
            if (batchedImageRequest == null) {
                com.androidnetworking.internal.ANImageLoader.BatchedImageRequest batchedImageRequest2 = (com.androidnetworking.internal.ANImageLoader.BatchedImageRequest) com.androidnetworking.internal.ANImageLoader.this.mBatchedResponses.get(this.mCacheKey);
                if (batchedImageRequest2 != null) {
                    batchedImageRequest2.removeContainerAndCancelIfNecessary(this);
                    if (batchedImageRequest2.mContainers.size() == 0) {
                        com.androidnetworking.internal.ANImageLoader.this.mBatchedResponses.remove(this.mCacheKey);
                        return;
                    }
                    return;
                }
                return;
            }
            if (batchedImageRequest.removeContainerAndCancelIfNecessary(this)) {
                com.androidnetworking.internal.ANImageLoader.this.mInFlightRequests.remove(this.mCacheKey);
            }
        }

        public android.graphics.Bitmap getBitmap() {
            return this.mBitmap;
        }

        public java.lang.String getRequestUrl() {
            return this.mRequestUrl;
        }
    }

    private class BatchedImageRequest {
        private com.androidnetworking.error.ANError mANError;
        private final java.util.LinkedList<com.androidnetworking.internal.ANImageLoader.ImageContainer> mContainers;
        private final com.androidnetworking.common.ANRequest mRequest;
        private android.graphics.Bitmap mResponseBitmap;

        public BatchedImageRequest(com.androidnetworking.common.ANRequest aNRequest, com.androidnetworking.internal.ANImageLoader.ImageContainer imageContainer) {
            java.util.LinkedList<com.androidnetworking.internal.ANImageLoader.ImageContainer> linkedList = new java.util.LinkedList<>();
            this.mContainers = linkedList;
            this.mRequest = aNRequest;
            linkedList.add(imageContainer);
        }

        public void setError(com.androidnetworking.error.ANError aNError) {
            this.mANError = aNError;
        }

        public com.androidnetworking.error.ANError getError() {
            return this.mANError;
        }

        public void addContainer(com.androidnetworking.internal.ANImageLoader.ImageContainer imageContainer) {
            this.mContainers.add(imageContainer);
        }

        public boolean removeContainerAndCancelIfNecessary(com.androidnetworking.internal.ANImageLoader.ImageContainer imageContainer) {
            this.mContainers.remove(imageContainer);
            if (this.mContainers.size() != 0) {
                return false;
            }
            this.mRequest.cancel(true);
            if (this.mRequest.isCanceled()) {
                this.mRequest.destroy();
                com.androidnetworking.internal.ANRequestQueue.getInstance().finish(this.mRequest);
            }
            return true;
        }
    }

    private void batchResponse(java.lang.String str, com.androidnetworking.internal.ANImageLoader.BatchedImageRequest batchedImageRequest) {
        this.mBatchedResponses.put(str, batchedImageRequest);
        if (this.mRunnable == null) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.androidnetworking.internal.ANImageLoader.3
                @Override // java.lang.Runnable
                public void run() {
                    for (com.androidnetworking.internal.ANImageLoader.BatchedImageRequest batchedImageRequest2 : com.androidnetworking.internal.ANImageLoader.this.mBatchedResponses.values()) {
                        java.util.Iterator it = batchedImageRequest2.mContainers.iterator();
                        while (it.hasNext()) {
                            com.androidnetworking.internal.ANImageLoader.ImageContainer imageContainer = (com.androidnetworking.internal.ANImageLoader.ImageContainer) it.next();
                            if (imageContainer.mListener != null) {
                                if (batchedImageRequest2.getError() == null) {
                                    imageContainer.mBitmap = batchedImageRequest2.mResponseBitmap;
                                    imageContainer.mListener.onResponse(imageContainer, false);
                                } else {
                                    imageContainer.mListener.onError(batchedImageRequest2.getError());
                                }
                            }
                        }
                    }
                    com.androidnetworking.internal.ANImageLoader.this.mBatchedResponses.clear();
                    com.androidnetworking.internal.ANImageLoader.this.mRunnable = null;
                }
            };
            this.mRunnable = runnable;
            this.mHandler.postDelayed(runnable, this.mBatchResponseDelayMs);
        }
    }

    private void throwIfNotOnMainThread() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("ImageLoader must be invoked from the main thread.");
        }
    }

    private static java.lang.String getCacheKey(java.lang.String str, int i, int i2, android.widget.ImageView.ScaleType scaleType) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i);
        sb.append("#H");
        sb.append(i2);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }
}
