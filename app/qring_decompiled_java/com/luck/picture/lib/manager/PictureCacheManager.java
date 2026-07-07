package com.luck.picture.lib.manager;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureCacheManager {
    public static void deleteCacheDirFile(java.lang.String str) {
        deleteCacheDirFile(str, (com.luck.picture.lib.interfaces.OnCallbackListener<java.lang.String>) null);
    }

    public static void deleteCacheDirFile(java.lang.String str, com.luck.picture.lib.interfaces.OnCallbackListener<java.lang.String> onCallbackListener) {
        java.io.File[] listFiles = new java.io.File(str).listFiles();
        if (listFiles != null) {
            for (java.io.File file : listFiles) {
                if (file.isFile() && file.delete() && onCallbackListener != null) {
                    onCallbackListener.onCall(file.getAbsolutePath());
                }
            }
        }
    }

    public static void deleteCacheRefreshDirFile(android.content.Context context, int i) {
        deleteCacheDirFile(context, i, true, null);
    }

    public static void deleteCacheDirFile(android.content.Context context, int i) {
        deleteCacheDirFile(context, i, false, null);
    }

    public static void deleteCacheDirFile(android.content.Context context, int i, com.luck.picture.lib.interfaces.OnCallbackListener<java.lang.String> onCallbackListener) {
        deleteCacheDirFile(context, i, false, onCallbackListener);
    }

    private static void deleteCacheDirFile(final android.content.Context context, int i, boolean z, com.luck.picture.lib.interfaces.OnCallbackListener<java.lang.String> onCallbackListener) {
        java.io.File[] listFiles;
        java.io.File externalFilesDir = context.getExternalFilesDir(i == com.luck.picture.lib.config.SelectMimeType.ofImage() ? android.os.Environment.DIRECTORY_PICTURES : android.os.Environment.DIRECTORY_MOVIES);
        if (externalFilesDir == null || (listFiles = externalFilesDir.listFiles()) == null) {
            return;
        }
        for (final java.io.File file : listFiles) {
            if (file.isFile() && file.delete()) {
                if (z) {
                    com.luck.picture.lib.thread.PictureThreadUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.luck.picture.lib.manager.PictureCacheManager.1
                        @Override // java.lang.Runnable
                        public void run() {
                            new com.luck.picture.lib.basic.PictureMediaScannerConnection(context, file.getAbsolutePath());
                        }
                    });
                } else if (onCallbackListener != null) {
                    onCallbackListener.onCall(file.getAbsolutePath());
                }
            }
        }
    }

    public static void deleteAllCacheDirFile(android.content.Context context) {
        deleteAllCacheDirFile(context, false, null);
    }

    public static void deleteAllCacheDirFile(android.content.Context context, com.luck.picture.lib.interfaces.OnCallbackListener<java.lang.String> onCallbackListener) {
        deleteAllCacheDirFile(context, false, onCallbackListener);
    }

    public static void deleteAllCacheDirRefreshFile(android.content.Context context) {
        deleteAllCacheDirFile(context, true, null);
    }

    private static void deleteAllCacheDirFile(final android.content.Context context, boolean z, com.luck.picture.lib.interfaces.OnCallbackListener<java.lang.String> onCallbackListener) {
        java.io.File[] listFiles;
        java.io.File[] listFiles2;
        java.io.File[] listFiles3;
        java.io.File externalFilesDir = context.getExternalFilesDir(android.os.Environment.DIRECTORY_PICTURES);
        if (externalFilesDir != null && (listFiles3 = externalFilesDir.listFiles()) != null) {
            for (final java.io.File file : listFiles3) {
                if (file.isFile() && file.delete()) {
                    if (z) {
                        com.luck.picture.lib.thread.PictureThreadUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.luck.picture.lib.manager.PictureCacheManager.2
                            @Override // java.lang.Runnable
                            public void run() {
                                new com.luck.picture.lib.basic.PictureMediaScannerConnection(context, file.getAbsolutePath());
                            }
                        });
                    } else if (onCallbackListener != null) {
                        onCallbackListener.onCall(file.getAbsolutePath());
                    }
                }
            }
        }
        java.io.File externalFilesDir2 = context.getExternalFilesDir(android.os.Environment.DIRECTORY_MOVIES);
        if (externalFilesDir2 != null && (listFiles2 = externalFilesDir2.listFiles()) != null) {
            for (final java.io.File file2 : listFiles2) {
                if (file2.isFile() && file2.delete()) {
                    if (z) {
                        com.luck.picture.lib.thread.PictureThreadUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.luck.picture.lib.manager.PictureCacheManager.3
                            @Override // java.lang.Runnable
                            public void run() {
                                new com.luck.picture.lib.basic.PictureMediaScannerConnection(context, file2.getAbsolutePath());
                            }
                        });
                    } else if (onCallbackListener != null) {
                        onCallbackListener.onCall(file2.getAbsolutePath());
                    }
                }
            }
        }
        java.io.File externalFilesDir3 = context.getExternalFilesDir(android.os.Environment.DIRECTORY_MUSIC);
        if (externalFilesDir3 == null || (listFiles = externalFilesDir3.listFiles()) == null) {
            return;
        }
        for (final java.io.File file3 : listFiles) {
            if (file3.isFile() && file3.delete()) {
                if (z) {
                    com.luck.picture.lib.thread.PictureThreadUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.luck.picture.lib.manager.PictureCacheManager.4
                        @Override // java.lang.Runnable
                        public void run() {
                            new com.luck.picture.lib.basic.PictureMediaScannerConnection(context, file3.getAbsolutePath());
                        }
                    });
                } else if (onCallbackListener != null) {
                    onCallbackListener.onCall(file3.getAbsolutePath());
                }
            }
        }
    }
}
