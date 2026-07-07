package com.airbnb.lottie.network;

/* loaded from: classes.dex */
public class NetworkCache {
    private final com.airbnb.lottie.network.LottieNetworkCacheProvider cacheProvider;

    public NetworkCache(com.airbnb.lottie.network.LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        this.cacheProvider = lottieNetworkCacheProvider;
    }

    public void clear() {
        java.io.File parentDir = parentDir();
        if (parentDir.exists()) {
            java.io.File[] listFiles = parentDir.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (java.io.File file : parentDir.listFiles()) {
                    file.delete();
                }
            }
            parentDir.delete();
        }
    }

    android.util.Pair<com.airbnb.lottie.network.FileExtension, java.io.InputStream> fetch(java.lang.String str) {
        com.airbnb.lottie.network.FileExtension fileExtension;
        try {
            java.io.File cachedFile = getCachedFile(str);
            if (cachedFile == null) {
                return null;
            }
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(cachedFile);
            if (cachedFile.getAbsolutePath().endsWith(".zip")) {
                fileExtension = com.airbnb.lottie.network.FileExtension.ZIP;
            } else {
                fileExtension = com.airbnb.lottie.network.FileExtension.JSON;
            }
            com.airbnb.lottie.utils.Logger.debug("Cache hit for " + str + " at " + cachedFile.getAbsolutePath());
            return new android.util.Pair<>(fileExtension, fileInputStream);
        } catch (java.io.FileNotFoundException unused) {
            return null;
        }
    }

    java.io.File writeTempCacheFile(java.lang.String str, java.io.InputStream inputStream, com.airbnb.lottie.network.FileExtension fileExtension) throws java.io.IOException {
        java.io.File file = new java.io.File(parentDir(), filenameForUrl(str, fileExtension, true));
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    void renameTempFile(java.lang.String str, com.airbnb.lottie.network.FileExtension fileExtension) {
        java.io.File file = new java.io.File(parentDir(), filenameForUrl(str, fileExtension, true));
        java.io.File file2 = new java.io.File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        com.airbnb.lottie.utils.Logger.debug("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        com.airbnb.lottie.utils.Logger.warning("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    private java.io.File getCachedFile(java.lang.String str) throws java.io.FileNotFoundException {
        java.io.File file = new java.io.File(parentDir(), filenameForUrl(str, com.airbnb.lottie.network.FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        java.io.File file2 = new java.io.File(parentDir(), filenameForUrl(str, com.airbnb.lottie.network.FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private java.io.File parentDir() {
        java.io.File cacheDir = this.cacheProvider.getCacheDir();
        if (cacheDir.isFile()) {
            cacheDir.delete();
        }
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        return cacheDir;
    }

    private static java.lang.String filenameForUrl(java.lang.String str, com.airbnb.lottie.network.FileExtension fileExtension, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? fileExtension.tempExtension() : fileExtension.extension);
        return sb.toString();
    }
}
