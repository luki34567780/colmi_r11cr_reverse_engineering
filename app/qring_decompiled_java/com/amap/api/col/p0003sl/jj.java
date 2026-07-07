package com.amap.api.col.p0003sl;

/* compiled from: FileStorageModel.java */
/* loaded from: classes.dex */
public final class jj {
    public static final java.lang.String a = com.amap.api.col.p0003sl.ir.c("SYmFja3Vwcw");
    public static final java.lang.String b = com.amap.api.col.p0003sl.ir.c("SLmFkaXU");
    public static final java.lang.String c = com.amap.api.col.p0003sl.ir.c("JIw");

    public static synchronized void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.nio.channels.FileChannel fileChannel;
        java.io.RandomAccessFile randomAccessFile;
        synchronized (com.amap.api.col.p0003sl.jj.class) {
            if (android.os.Build.VERSION.SDK_INT >= 19 && (context == null || context.checkCallingOrSelfPermission(com.amap.api.col.p0003sl.ir.c("EYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX0VYVEVSTkFMX1NUT1JBR0U=")) != 0 || context.checkCallingOrSelfPermission(com.amap.api.col.p0003sl.ir.c("EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfRVhURVJOQUxfU1RPUkFHRQ==")) != 0)) {
                return;
            }
            java.lang.String a2 = a(context);
            if (android.text.TextUtils.isEmpty(a2)) {
                return;
            }
            java.lang.String str3 = str + c + str2;
            java.io.File file = new java.io.File(a2 + java.io.File.separator + a);
            java.io.File file2 = new java.io.File(file, b);
            java.nio.channels.FileLock fileLock = null;
            try {
                if (!file.exists() || file.isDirectory()) {
                    file.mkdirs();
                }
                file2.createNewFile();
                randomAccessFile = new java.io.RandomAccessFile(file2, "rws");
                try {
                    fileChannel = randomAccessFile.getChannel();
                    try {
                        fileLock = fileChannel.tryLock();
                        if (fileLock != null) {
                            fileChannel.write(java.nio.ByteBuffer.wrap(str3.getBytes(com.bumptech.glide.load.Key.STRING_CHARSET_NAME)));
                        }
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                            } catch (java.io.IOException unused) {
                            }
                        }
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                        a(randomAccessFile);
                    } catch (java.lang.Throwable unused3) {
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                            } catch (java.io.IOException unused4) {
                            }
                        }
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (java.io.IOException unused5) {
                            }
                        }
                        a(randomAccessFile);
                    }
                } catch (java.lang.Throwable unused6) {
                    fileChannel = null;
                }
            } catch (java.lang.Throwable unused7) {
                fileChannel = null;
                randomAccessFile = null;
            }
        }
    }

    private static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    private static java.lang.String a(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 31 || (context.getApplicationInfo().targetSdkVersion >= 30 && android.os.Build.VERSION.SDK_INT >= 30)) {
            return context.getApplicationContext().getExternalFilesDir("").getAbsolutePath();
        }
        android.os.storage.StorageManager storageManager = android.os.Build.VERSION.SDK_INT >= 9 ? (android.os.storage.StorageManager) context.getSystemService("storage") : null;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(com.amap.api.col.p0003sl.ir.c("SYW5kcm9pZC5vcy5zdG9yYWdlLlN0b3JhZ2VWb2x1bWU"));
            java.lang.reflect.Method method = storageManager.getClass().getMethod(com.amap.api.col.p0003sl.ir.c("FZ2V0Vm9sdW1lTGlzdA"), new java.lang.Class[0]);
            java.lang.reflect.Method method2 = cls.getMethod(com.amap.api.col.p0003sl.ir.c("ZZ2V0UGF0aA"), new java.lang.Class[0]);
            java.lang.reflect.Method method3 = cls.getMethod(com.amap.api.col.p0003sl.ir.c("AaXNSZW1vdmFibGUK"), new java.lang.Class[0]);
            java.lang.Object invoke = method.invoke(storageManager, new java.lang.Object[0]);
            int length = java.lang.reflect.Array.getLength(invoke);
            for (int i = 0; i < length; i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(invoke, i);
                java.lang.String str = (java.lang.String) method2.invoke(obj, new java.lang.Object[0]);
                if (!((java.lang.Boolean) method3.invoke(obj, new java.lang.Object[0])).booleanValue()) {
                    return str;
                }
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        }
    }
}
