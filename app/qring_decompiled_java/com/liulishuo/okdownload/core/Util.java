package com.liulishuo.okdownload.core;

/* loaded from: /tmp/dex/classes2.dex */
public class Util {
    public static final java.lang.String ACCEPT_RANGES = "Accept-Ranges";
    public static final int CHUNKED_CONTENT_LENGTH = -1;
    public static final java.lang.String CONTENT_DISPOSITION = "Content-Disposition";
    public static final java.lang.String CONTENT_LENGTH = "Content-Length";
    public static final java.lang.String CONTENT_RANGE = "Content-Range";
    public static final java.lang.String ETAG = "Etag";
    public static final java.lang.String IF_MATCH = "If-Match";
    public static final java.lang.String METHOD_HEAD = "HEAD";
    public static final java.lang.String RANGE = "Range";
    public static final int RANGE_NOT_SATISFIABLE = 416;
    public static final java.lang.String TRANSFER_ENCODING = "Transfer-Encoding";
    public static final java.lang.String USER_AGENT = "User-Agent";
    public static final java.lang.String VALUE_CHUNKED = "chunked";
    private static com.liulishuo.okdownload.core.Util.Logger logger = new com.liulishuo.okdownload.core.Util.EmptyLogger();

    public static class EmptyLogger implements com.liulishuo.okdownload.core.Util.Logger {
        @Override // com.liulishuo.okdownload.core.Util.Logger
        public void d(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.liulishuo.okdownload.core.Util.Logger
        public void e(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        }

        @Override // com.liulishuo.okdownload.core.Util.Logger
        public void i(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.liulishuo.okdownload.core.Util.Logger
        public void w(java.lang.String str, java.lang.String str2) {
        }
    }

    public interface Logger {
        void d(java.lang.String str, java.lang.String str2);

        void e(java.lang.String str, java.lang.String str2, java.lang.Exception exc);

        void i(java.lang.String str, java.lang.String str2);

        void w(java.lang.String str, java.lang.String str2);
    }

    public static boolean isCorrectFull(long j, long j2) {
        return j == j2;
    }

    public static void enableConsoleLog() {
        logger = null;
    }

    public static void setLogger(com.liulishuo.okdownload.core.Util.Logger logger2) {
        logger = logger2;
    }

    public static com.liulishuo.okdownload.core.Util.Logger getLogger() {
        return logger;
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        com.liulishuo.okdownload.core.Util.Logger logger2 = logger;
        if (logger2 != null) {
            logger2.e(str, str2, exc);
        } else {
            android.util.Log.e(str, str2, exc);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        com.liulishuo.okdownload.core.Util.Logger logger2 = logger;
        if (logger2 != null) {
            logger2.w(str, str2);
        } else {
            android.util.Log.w(str, str2);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        com.liulishuo.okdownload.core.Util.Logger logger2 = logger;
        if (logger2 != null) {
            logger2.d(str, str2);
        } else {
            android.util.Log.d(str, str2);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        com.liulishuo.okdownload.core.Util.Logger logger2 = logger;
        if (logger2 != null) {
            logger2.i(str, str2);
        } else {
            android.util.Log.i(str, str2);
        }
    }

    public static boolean isEmpty(java.lang.CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static java.util.concurrent.ThreadFactory threadFactory(final java.lang.String str, final boolean z) {
        return new java.util.concurrent.ThreadFactory() { // from class: com.liulishuo.okdownload.core.Util.1
            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.Thread thread = new java.lang.Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static java.lang.String md5(java.lang.String str) {
        byte[] bArr;
        try {
            bArr = java.security.MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
        } catch (java.io.UnsupportedEncodingException | java.security.NoSuchAlgorithmException unused) {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(java.lang.Integer.toHexString(i));
        }
        return sb.toString();
    }

    public static void resetBlockIfDirty(com.liulishuo.okdownload.core.breakpoint.BlockInfo blockInfo) {
        boolean z = true;
        if (blockInfo.getCurrentOffset() >= 0 && blockInfo.getCurrentOffset() <= blockInfo.getContentLength()) {
            z = false;
        }
        if (z) {
            w("resetBlockIfDirty", "block is dirty so have to reset: " + blockInfo);
            blockInfo.resetBlock();
        }
    }

    public static long getFreeSpaceBytes(android.os.StatFs statFs) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            return statFs.getAvailableBytes();
        }
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    public static java.lang.String humanReadableBytes(long j, boolean z) {
        int i = z ? 1000 : com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2;
        if (j < i) {
            return j + " B";
        }
        double d = j;
        double d2 = i;
        int log = (int) (java.lang.Math.log(d) / java.lang.Math.log(d2));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((z ? "kMGTPE" : "KMGTPE").charAt(log - 1));
        sb.append(z ? "" : "i");
        return java.lang.String.format(java.util.Locale.ENGLISH, "%.1f %sB", java.lang.Double.valueOf(d / java.lang.Math.pow(d2, log)), sb.toString());
    }

    public static com.liulishuo.okdownload.core.breakpoint.DownloadStore createDefaultDatabase(android.content.Context context) {
        try {
            return (com.liulishuo.okdownload.core.breakpoint.DownloadStore) java.lang.Class.forName("com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnSQLite").getDeclaredConstructor(android.content.Context.class).newInstance(context);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return new com.liulishuo.okdownload.core.breakpoint.BreakpointStoreOnCache();
        }
    }

    public static com.liulishuo.okdownload.core.breakpoint.DownloadStore createRemitDatabase(com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore) {
        try {
            downloadStore = (com.liulishuo.okdownload.core.breakpoint.DownloadStore) downloadStore.getClass().getMethod("createRemitSelf", new java.lang.Class[0]).invoke(downloadStore, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        d("Util", "Get final download store is " + downloadStore);
        return downloadStore;
    }

    public static com.liulishuo.okdownload.core.connection.DownloadConnection.Factory createDefaultConnectionFactory() {
        try {
            return (com.liulishuo.okdownload.core.connection.DownloadConnection.Factory) java.lang.Class.forName("com.liulishuo.okdownload.core.connection.DownloadOkHttp3Connection$Factory").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return new com.liulishuo.okdownload.core.connection.DownloadUrlConnection.Factory();
        }
    }

    public static void assembleBlock(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, long j, boolean z) {
        int determineBlockCount = com.liulishuo.okdownload.OkDownload.with().downloadStrategy().isUseMultiBlock(z) ? com.liulishuo.okdownload.OkDownload.with().downloadStrategy().determineBlockCount(downloadTask, j) : 1;
        breakpointInfo.resetBlockInfos();
        long j2 = determineBlockCount;
        long j3 = j / j2;
        int i = 0;
        long j4 = 0;
        long j5 = 0;
        while (i < determineBlockCount) {
            j4 += j5;
            j5 = i == 0 ? (j % j2) + j3 : j3;
            breakpointInfo.addBlock(new com.liulishuo.okdownload.core.breakpoint.BlockInfo(j4, j5));
            i++;
        }
    }

    public static long parseContentLength(java.lang.String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused) {
            d("Util", "parseContentLength failed parse for '" + str + "'");
            return -1L;
        }
    }

    public static boolean isNetworkNotOnWifiType(android.net.ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            w("Util", "failed to get connectivity manager!");
            return true;
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null || activeNetworkInfo.getType() != 1;
    }

    public static boolean checkPermission(java.lang.String str) {
        return com.liulishuo.okdownload.OkDownload.with().context().checkCallingOrSelfPermission(str) == 0;
    }

    public static long parseContentLengthFromContentRange(java.lang.String str) {
        if (str != null && str.length() != 0) {
            try {
                java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(str);
                if (matcher.find()) {
                    return (java.lang.Long.parseLong(matcher.group(2)) - java.lang.Long.parseLong(matcher.group(1))) + 1;
                }
            } catch (java.lang.Exception e) {
                w("Util", "parse content-length from content-range failed " + e);
            }
        }
        return -1L;
    }

    public static boolean isUriContentScheme(android.net.Uri uri) {
        return uri.getScheme().equals("content");
    }

    public static boolean isUriFileScheme(android.net.Uri uri) {
        return uri.getScheme().equals("file");
    }

    public static java.lang.String getFilenameFromContentUri(android.net.Uri uri) {
        android.database.Cursor query = com.liulishuo.okdownload.OkDownload.with().context().getContentResolver().query(uri, null, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            query.moveToFirst();
            return query.getString(query.getColumnIndex("_display_name"));
        } finally {
            query.close();
        }
    }

    public static java.io.File getParentFile(java.io.File file) {
        java.io.File parentFile = file.getParentFile();
        return parentFile == null ? new java.io.File("/") : parentFile;
    }

    public static long getSizeFromContentUri(android.net.Uri uri) {
        android.database.Cursor query = com.liulishuo.okdownload.OkDownload.with().context().getContentResolver().query(uri, null, null, null, null);
        if (query == null) {
            return 0L;
        }
        try {
            query.moveToFirst();
            return query.getLong(query.getColumnIndex("_size"));
        } finally {
            query.close();
        }
    }

    public static boolean isNetworkAvailable(android.net.ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            w("Util", "failed to get connectivity manager!");
            return true;
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static void inspectUserHeader(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) throws java.io.IOException {
        if (map.containsKey(IF_MATCH) || map.containsKey(RANGE)) {
            throw new java.io.IOException("If-Match and Range only can be handle by internal!");
        }
    }

    public static void addUserRequestHeaderField(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, com.liulishuo.okdownload.core.connection.DownloadConnection downloadConnection) throws java.io.IOException {
        inspectUserHeader(map);
        addRequestHeaderFields(map, downloadConnection);
    }

    public static void addRequestHeaderFields(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, com.liulishuo.okdownload.core.connection.DownloadConnection downloadConnection) {
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.Iterator<java.lang.String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                downloadConnection.addHeader(key, it.next());
            }
        }
    }

    public static void addDefaultUserAgent(com.liulishuo.okdownload.core.connection.DownloadConnection downloadConnection) {
        downloadConnection.addHeader(USER_AGENT, "OkDownload/1.0.7");
    }
}
