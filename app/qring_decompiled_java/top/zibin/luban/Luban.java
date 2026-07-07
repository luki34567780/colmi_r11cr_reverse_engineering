package top.zibin.luban;

/* loaded from: classes3.dex */
public class Luban implements android.os.Handler.Callback {
    private static final java.lang.String DEFAULT_DISK_CACHE_DIR = "luban_disk_cache";
    private static final java.lang.String KEY_SOURCE = "source";
    private static final int MSG_COMPRESS_ERROR = 2;
    private static final int MSG_COMPRESS_START = 1;
    private static final int MSG_COMPRESS_SUCCESS = 0;
    private static final java.lang.String TAG = "Luban";
    private boolean focusAlpha;
    private boolean isUseIOBufferPool;
    private top.zibin.luban.OnCompressListener mCompressListener;
    private top.zibin.luban.CompressionPredicate mCompressionPredicate;
    private android.os.Handler mHandler;
    private int mLeastCompressSize;
    private top.zibin.luban.OnNewCompressListener mNewCompressListener;
    private top.zibin.luban.OnRenameListener mRenameListener;
    private java.util.List<top.zibin.luban.InputStreamProvider> mStreamProviders;
    private java.lang.String mTargetDir;

    private Luban(top.zibin.luban.Luban.Builder builder) {
        this.mTargetDir = builder.mTargetDir;
        this.focusAlpha = builder.focusAlpha;
        this.isUseIOBufferPool = builder.isUseBufferPool;
        this.mRenameListener = builder.mRenameListener;
        this.mStreamProviders = builder.mStreamProviders;
        this.mCompressListener = builder.mCompressListener;
        this.mNewCompressListener = builder.mNewCompressListener;
        this.mLeastCompressSize = builder.mLeastCompressSize;
        this.mCompressionPredicate = builder.mCompressionPredicate;
        this.mHandler = new android.os.Handler(android.os.Looper.getMainLooper(), this);
    }

    public static top.zibin.luban.Luban.Builder with(android.content.Context context) {
        return new top.zibin.luban.Luban.Builder(context);
    }

    private java.io.File getImageCacheFile(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(this.mTargetDir)) {
            this.mTargetDir = getImageCacheDir(context).getAbsolutePath();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.mTargetDir);
        sb.append("/");
        sb.append(java.lang.System.currentTimeMillis());
        sb.append((int) (java.lang.Math.random() * 1000.0d));
        if (android.text.TextUtils.isEmpty(str)) {
            str = com.luck.picture.lib.config.PictureMimeType.JPG;
        }
        sb.append(str);
        return new java.io.File(sb.toString());
    }

    private java.io.File getImageCustomFile(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(this.mTargetDir)) {
            this.mTargetDir = getImageCacheDir(context).getAbsolutePath();
        }
        return new java.io.File(this.mTargetDir + "/" + str);
    }

    private java.io.File getImageCacheDir(android.content.Context context) {
        return getImageCacheDir(context, DEFAULT_DISK_CACHE_DIR);
    }

    private static java.io.File getImageCacheDir(android.content.Context context, java.lang.String str) {
        java.io.File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            java.io.File file = new java.io.File(externalCacheDir, str);
            if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                return file;
            }
            return null;
        }
        if (android.util.Log.isLoggable(TAG, 6)) {
            android.util.Log.e(TAG, "default disk cache dir is null");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launch(final android.content.Context context) {
        java.util.List<top.zibin.luban.InputStreamProvider> list = this.mStreamProviders;
        if (list == null || list.size() == 0) {
            top.zibin.luban.OnCompressListener onCompressListener = this.mCompressListener;
            if (onCompressListener != null) {
                onCompressListener.onError(-1, new java.lang.NullPointerException("image file cannot be null"));
            }
            top.zibin.luban.OnNewCompressListener onNewCompressListener = this.mNewCompressListener;
            if (onNewCompressListener != null) {
                onNewCompressListener.onError("", new java.lang.NullPointerException("image file cannot be null"));
                return;
            }
            return;
        }
        java.util.Iterator<top.zibin.luban.InputStreamProvider> it = this.mStreamProviders.iterator();
        while (it.hasNext()) {
            final top.zibin.luban.InputStreamProvider next = it.next();
            android.os.AsyncTask.SERIAL_EXECUTOR.execute(new java.lang.Runnable() { // from class: top.zibin.luban.Luban.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        top.zibin.luban.Luban.this.mHandler.sendMessage(top.zibin.luban.Luban.this.mHandler.obtainMessage(1));
                        java.io.File compress = top.zibin.luban.Luban.this.compress(context, next);
                        android.os.Message obtainMessage = top.zibin.luban.Luban.this.mHandler.obtainMessage(0);
                        obtainMessage.arg1 = next.getIndex();
                        obtainMessage.obj = compress;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString(top.zibin.luban.Luban.KEY_SOURCE, next.getPath());
                        obtainMessage.setData(bundle);
                        top.zibin.luban.Luban.this.mHandler.sendMessage(obtainMessage);
                    } catch (java.lang.Exception unused) {
                        android.os.Message obtainMessage2 = top.zibin.luban.Luban.this.mHandler.obtainMessage(2);
                        obtainMessage2.arg1 = next.getIndex();
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putString(top.zibin.luban.Luban.KEY_SOURCE, next.getPath());
                        obtainMessage2.setData(bundle2);
                        top.zibin.luban.Luban.this.mHandler.sendMessage(obtainMessage2);
                    }
                }
            });
            it.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.io.File get(top.zibin.luban.InputStreamProvider inputStreamProvider, android.content.Context context) throws java.io.IOException {
        try {
            return new top.zibin.luban.Engine(inputStreamProvider, getImageCacheFile(context, top.zibin.luban.Checker.SINGLE.extSuffix(inputStreamProvider)), this.focusAlpha).compress();
        } finally {
            inputStreamProvider.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.List<java.io.File> get(android.content.Context context) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<top.zibin.luban.InputStreamProvider> it = this.mStreamProviders.iterator();
        while (it.hasNext()) {
            arrayList.add(compress(context, it.next()));
            it.remove();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.io.File compress(android.content.Context context, top.zibin.luban.InputStreamProvider inputStreamProvider) throws java.io.IOException {
        try {
            return compressReal(context, inputStreamProvider);
        } finally {
            inputStreamProvider.close();
        }
    }

    private java.io.File compressReal(android.content.Context context, top.zibin.luban.InputStreamProvider inputStreamProvider) throws java.io.IOException {
        java.io.File imageCacheFile = getImageCacheFile(context, top.zibin.luban.Checker.SINGLE.extSuffix(inputStreamProvider));
        java.lang.String path = top.zibin.luban.Checker.isContent(inputStreamProvider.getPath()) ? top.zibin.luban.LubanUtils.getPath(context, android.net.Uri.parse(inputStreamProvider.getPath())) : inputStreamProvider.getPath();
        top.zibin.luban.OnRenameListener onRenameListener = this.mRenameListener;
        if (onRenameListener != null) {
            imageCacheFile = getImageCustomFile(context, onRenameListener.rename(path));
        }
        top.zibin.luban.CompressionPredicate compressionPredicate = this.mCompressionPredicate;
        if (compressionPredicate != null) {
            if (compressionPredicate.apply(path) && top.zibin.luban.Checker.SINGLE.needCompress(this.mLeastCompressSize, path)) {
                return new top.zibin.luban.Engine(inputStreamProvider, imageCacheFile, this.focusAlpha).compress();
            }
            return new java.io.File(path);
        }
        if (top.zibin.luban.Checker.SINGLE.needCompress(this.mLeastCompressSize, path)) {
            return new top.zibin.luban.Engine(inputStreamProvider, imageCacheFile, this.focusAlpha).compress();
        }
        return new java.io.File(path);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 0) {
            top.zibin.luban.OnCompressListener onCompressListener = this.mCompressListener;
            if (onCompressListener != null) {
                onCompressListener.onSuccess(message.arg1, (java.io.File) message.obj);
            }
            top.zibin.luban.OnNewCompressListener onNewCompressListener = this.mNewCompressListener;
            if (onNewCompressListener == null) {
                return false;
            }
            onNewCompressListener.onSuccess(message.getData().getString(KEY_SOURCE), (java.io.File) message.obj);
            return false;
        }
        if (i == 1) {
            top.zibin.luban.OnCompressListener onCompressListener2 = this.mCompressListener;
            if (onCompressListener2 != null) {
                onCompressListener2.onStart();
            }
            top.zibin.luban.OnNewCompressListener onNewCompressListener2 = this.mNewCompressListener;
            if (onNewCompressListener2 == null) {
                return false;
            }
            onNewCompressListener2.onStart();
            return false;
        }
        if (i != 2) {
            return false;
        }
        top.zibin.luban.OnCompressListener onCompressListener3 = this.mCompressListener;
        if (onCompressListener3 != null) {
            onCompressListener3.onError(message.arg1, (java.lang.Throwable) message.obj);
        }
        top.zibin.luban.OnNewCompressListener onNewCompressListener3 = this.mNewCompressListener;
        if (onNewCompressListener3 == null) {
            return false;
        }
        onNewCompressListener3.onError(message.getData().getString(KEY_SOURCE), (java.lang.Throwable) message.obj);
        return false;
    }

    public static class Builder {
        private android.content.Context context;
        private boolean focusAlpha;
        private top.zibin.luban.OnCompressListener mCompressListener;
        private top.zibin.luban.CompressionPredicate mCompressionPredicate;
        private top.zibin.luban.OnNewCompressListener mNewCompressListener;
        private top.zibin.luban.OnRenameListener mRenameListener;
        private java.lang.String mTargetDir;
        private boolean isUseBufferPool = true;
        private int mLeastCompressSize = 100;
        private java.util.List<top.zibin.luban.InputStreamProvider> mStreamProviders = new java.util.ArrayList();

        @java.lang.Deprecated
        public top.zibin.luban.Luban.Builder putGear(int i) {
            return this;
        }

        Builder(android.content.Context context) {
            this.context = context;
        }

        private top.zibin.luban.Luban build() {
            return new top.zibin.luban.Luban(this);
        }

        public top.zibin.luban.Luban.Builder load(top.zibin.luban.InputStreamProvider inputStreamProvider) {
            this.mStreamProviders.add(inputStreamProvider);
            return this;
        }

        public <T> top.zibin.luban.Luban.Builder load(java.util.List<T> list) {
            int i = -1;
            for (T t : list) {
                i++;
                if (t instanceof java.lang.String) {
                    load((java.lang.String) t, i);
                } else if (t instanceof java.io.File) {
                    load((java.io.File) t, i);
                } else if (t instanceof android.net.Uri) {
                    load((android.net.Uri) t, i);
                } else {
                    throw new java.lang.IllegalArgumentException("Incoming data type exception, it must be String, File, Uri or Bitmap");
                }
            }
            return this;
        }

        public top.zibin.luban.Luban.Builder load(java.io.File file) {
            load(file, 0);
            return this;
        }

        private top.zibin.luban.Luban.Builder load(final java.io.File file, final int i) {
            this.mStreamProviders.add(new top.zibin.luban.InputStreamAdapter() { // from class: top.zibin.luban.Luban.Builder.1
                @Override // top.zibin.luban.InputStreamAdapter
                public java.io.InputStream openInternal() {
                    return top.zibin.luban.io.ArrayPoolProvide.getInstance().openInputStream(file.getAbsolutePath());
                }

                @Override // top.zibin.luban.InputStreamProvider
                public int getIndex() {
                    return i;
                }

                @Override // top.zibin.luban.InputStreamProvider
                public java.lang.String getPath() {
                    return file.getAbsolutePath();
                }
            });
            return this;
        }

        public top.zibin.luban.Luban.Builder load(java.lang.String str) {
            load(str, 0);
            return this;
        }

        private top.zibin.luban.Luban.Builder load(final java.lang.String str, final int i) {
            this.mStreamProviders.add(new top.zibin.luban.InputStreamAdapter() { // from class: top.zibin.luban.Luban.Builder.2
                @Override // top.zibin.luban.InputStreamAdapter
                public java.io.InputStream openInternal() {
                    return top.zibin.luban.io.ArrayPoolProvide.getInstance().openInputStream(str);
                }

                @Override // top.zibin.luban.InputStreamProvider
                public int getIndex() {
                    return i;
                }

                @Override // top.zibin.luban.InputStreamProvider
                public java.lang.String getPath() {
                    return str;
                }
            });
            return this;
        }

        public top.zibin.luban.Luban.Builder load(android.net.Uri uri) {
            load(uri, 0);
            return this;
        }

        private top.zibin.luban.Luban.Builder load(final android.net.Uri uri, final int i) {
            this.mStreamProviders.add(new top.zibin.luban.InputStreamAdapter() { // from class: top.zibin.luban.Luban.Builder.3
                @Override // top.zibin.luban.InputStreamAdapter
                public java.io.InputStream openInternal() throws java.io.IOException {
                    return top.zibin.luban.Luban.Builder.this.isUseBufferPool ? top.zibin.luban.io.ArrayPoolProvide.getInstance().openInputStream(top.zibin.luban.Luban.Builder.this.context.getContentResolver(), uri) : top.zibin.luban.Luban.Builder.this.context.getContentResolver().openInputStream(uri);
                }

                @Override // top.zibin.luban.InputStreamProvider
                public int getIndex() {
                    return i;
                }

                @Override // top.zibin.luban.InputStreamProvider
                public java.lang.String getPath() {
                    return top.zibin.luban.Checker.isContent(uri.toString()) ? uri.toString() : uri.getPath();
                }
            });
            return this;
        }

        public top.zibin.luban.Luban.Builder setRenameListener(top.zibin.luban.OnRenameListener onRenameListener) {
            this.mRenameListener = onRenameListener;
            return this;
        }

        public top.zibin.luban.Luban.Builder setCompressListener(top.zibin.luban.OnCompressListener onCompressListener) {
            this.mCompressListener = onCompressListener;
            return this;
        }

        public top.zibin.luban.Luban.Builder setCompressListener(top.zibin.luban.OnNewCompressListener onNewCompressListener) {
            this.mNewCompressListener = onNewCompressListener;
            return this;
        }

        public top.zibin.luban.Luban.Builder setTargetDir(java.lang.String str) {
            this.mTargetDir = str;
            return this;
        }

        @java.lang.Deprecated
        public top.zibin.luban.Luban.Builder setFocusAlpha(boolean z) {
            this.focusAlpha = z;
            return this;
        }

        public top.zibin.luban.Luban.Builder isUseIOBufferPool(boolean z) {
            this.isUseBufferPool = z;
            return this;
        }

        public top.zibin.luban.Luban.Builder ignoreBy(int i) {
            this.mLeastCompressSize = i;
            return this;
        }

        public top.zibin.luban.Luban.Builder filter(top.zibin.luban.CompressionPredicate compressionPredicate) {
            this.mCompressionPredicate = compressionPredicate;
            return this;
        }

        public void launch() {
            build().launch(this.context);
        }

        public java.io.File get(java.lang.String str) throws java.io.IOException {
            return get(str, 0);
        }

        public java.io.File get(final java.lang.String str, final int i) throws java.io.IOException {
            return build().get(new top.zibin.luban.InputStreamAdapter() { // from class: top.zibin.luban.Luban.Builder.4
                @Override // top.zibin.luban.InputStreamAdapter
                public java.io.InputStream openInternal() {
                    return top.zibin.luban.io.ArrayPoolProvide.getInstance().openInputStream(str);
                }

                @Override // top.zibin.luban.InputStreamProvider
                public int getIndex() {
                    return i;
                }

                @Override // top.zibin.luban.InputStreamProvider
                public java.lang.String getPath() {
                    return str;
                }
            }, this.context);
        }

        public java.util.List<java.io.File> get() throws java.io.IOException {
            return build().get(this.context);
        }
    }
}
