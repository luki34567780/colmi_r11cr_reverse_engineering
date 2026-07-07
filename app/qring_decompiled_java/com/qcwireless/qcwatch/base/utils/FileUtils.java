package com.qcwireless.qcwatch.base.utils;

/* compiled from: FileUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001KB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010!\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010!\u001a\u00020\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\"\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J \u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020%J\u000e\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020%J\u0006\u0010+\u001a\u00020 J\u0006\u0010,\u001a\u00020 J\u001c\u0010-\u001a\u0004\u0018\u00010 2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010\u0004J\u000e\u00101\u001a\u0002022\u0006\u0010\u0007\u001a\u00020\u0004J\u001b\u00103\u001a\b\u0012\u0004\u0012\u00020\u0004042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00105J\u0010\u00106\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004J\u0006\u00107\u001a\u00020 J\u000e\u00108\u001a\u00020\u00042\u0006\u0010)\u001a\u00020%J\u0006\u00109\u001a\u00020\u0004J\u0006\u0010:\u001a\u00020 J\u0006\u0010;\u001a\u00020 J\u0006\u0010<\u001a\u00020 J\u0006\u0010=\u001a\u00020 J\u001a\u0010>\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0012\u0010?\u001a\u0004\u0018\u00010/2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u001c\u0010@\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010A\u001a\u0004\u0018\u00010\u0004J \u0010B\u001a\u00020\u00042\u0006\u0010)\u001a\u00020%2\u0006\u0010C\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010\u0004J\u0016\u0010D\u001a\u00020\u00062\u0006\u0010E\u001a\u00020 2\u0006\u0010F\u001a\u00020\u0004J\u001e\u0010G\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J\u001e\u0010I\u001a\u00020\u00062\u0006\u0010J\u001a\u00020/2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lcom/qcwireless/qcwatch/base/utils/FileUtils;", "", "()V", "DFU_BIN_NAME", "", "changeFileDirName", "", "path", "oldName", "newName", "copy", "", "from", "Ljava/io/InputStream;", "to", "Ljava/io/OutputStream;", "src", "dest", "copyFile", "oldPath", "newPath", "createDestDirectoryIfNecessary", "destParam", "createDirs", "", "folder", "createFile", "fileName", "deleteDir", "dir", "deleteDirWithFile", "file", "Ljava/io/File;", "deleteFile", "deleteOverdueFile", "drawableToFile", "mContext", "Landroid/content/Context;", "drawableId", "fileExists", "getAppCacheRootFile", "context", "getAppRootFile", "getBinDirFile", "getCustomDialDirFile", "getFileFromBytes", "bytes", "", "outputFile", "getFileLength", "", "getFilesList", "", "(Ljava/lang/String;)[Ljava/lang/String;", "getFilesNumber", "getGuideDirFile", "getInternalAppPath", "getInternalPath", "getLogDirFile", "getMusicDirFile", "getRecordDirFile", "getWatchFaceDirFile", "moveFile", "readBytes", "readContents", "format", "readResource", com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID, "saveFileToPath", "sourceFile", "destinationPath", "writeToFile", "content", "writeToFile1", "data", "UriUtil", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class FileUtils {
    public static final java.lang.String DFU_BIN_NAME = "T91_Application.bin";
    public static final com.qcwireless.qcwatch.base.utils.FileUtils INSTANCE = new com.qcwireless.qcwatch.base.utils.FileUtils();

    private FileUtils() {
    }

    public final java.io.File getAppRootFile(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (context.getExternalFilesDir("") != null) {
            java.io.File externalFilesDir = context.getExternalFilesDir("");
            kotlin.jvm.internal.Intrinsics.checkNotNull(externalFilesDir);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(externalFilesDir, "{\n            context.ge…lFilesDir(\"\")!!\n        }");
            return externalFilesDir;
        }
        java.io.File externalCacheDir = context.getExternalCacheDir();
        java.io.File cacheDir = externalCacheDir == null ? context.getCacheDir() : externalCacheDir;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cacheDir, "{\n            val extern…ontext.cacheDir\n        }");
        return cacheDir;
    }

    public final java.io.File getAppCacheRootFile(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (context.getExternalCacheDir() != null) {
            java.io.File externalCacheDir = context.getExternalCacheDir();
            kotlin.jvm.internal.Intrinsics.checkNotNull(externalCacheDir);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(externalCacheDir, "{\n            context.externalCacheDir!!\n        }");
            return externalCacheDir;
        }
        java.io.File externalCacheDir2 = context.getExternalCacheDir();
        java.io.File cacheDir = externalCacheDir2 == null ? context.getCacheDir() : externalCacheDir2;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cacheDir, "{\n            val extern…ontext.cacheDir\n        }");
        return cacheDir;
    }

    public final void deleteOverdueFile(java.lang.String path) {
        java.io.File[] listFiles;
        try {
            com.oudmon.ble.base.util.DateUtil dateUtil = new com.oudmon.ble.base.util.DateUtil();
            dateUtil.addDay(-3);
            java.io.File file = new java.io.File(path);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                int length = listFiles.length;
                for (int i = 0; i < length; i++) {
                    if (listFiles[i].lastModified() < dateUtil.getTimestamp()) {
                        deleteFile(listFiles[i]);
                    }
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private final boolean deleteFile(java.io.File file) {
        return file != null && file.delete();
    }

    public final java.io.File getCustomDialDirFile() {
        return new java.io.File(getAppRootFile(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()), "custom");
    }

    public final java.io.File getWatchFaceDirFile() {
        return new java.io.File(getAppRootFile(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()), "face");
    }

    public final java.io.File getBinDirFile() {
        return new java.io.File(getAppRootFile(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()), "dfu");
    }

    public final java.io.File getGuideDirFile() {
        return new java.io.File(getAppRootFile(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()), "guide");
    }

    public final java.io.File getMusicDirFile() {
        return new java.io.File(getAppRootFile(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()), "music");
    }

    public final java.io.File getLogDirFile() {
        return new java.io.File(getAppRootFile(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()), "log");
    }

    public final java.io.File getRecordDirFile() {
        return new java.io.File(getAppRootFile(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()), "record");
    }

    public final java.lang.String getInternalPath() {
        java.lang.String absolutePath = android.os.Environment.getDataDirectory().getAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "getDataDirectory().absolutePath");
        return absolutePath;
    }

    public final java.lang.String getInternalAppPath(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String absolutePath = context.getFilesDir().getAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "context.filesDir.absolutePath");
        return absolutePath;
    }

    public final boolean createFile(java.lang.String path, java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        java.io.File file = new java.io.File(path + '/' + fileName);
        if (file.exists()) {
            return false;
        }
        try {
            file.createNewFile();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public final boolean fileExists(java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        return new java.io.File(path).exists();
    }

    public final boolean createDirs(java.lang.String folder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(folder, "folder");
        java.io.File file = new java.io.File(folder);
        if (file.exists()) {
            return false;
        }
        file.mkdirs();
        return true;
    }

    public final void deleteDir(java.lang.String dir) {
        java.io.File file = new java.io.File(dir);
        if (file.exists()) {
            deleteDirWithFile(file);
        }
    }

    private final void deleteDirWithFile(java.io.File file) {
        if (file.isDirectory() && file.exists()) {
            java.lang.String[] list = file.list();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "file.list()");
            if (!(list.length == 0)) {
                java.io.File[] listFiles = file.listFiles();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listFiles, "file.listFiles()");
                for (java.io.File file2 : listFiles) {
                    if (file2.isFile()) {
                        file2.delete();
                    } else if (file2.isDirectory()) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(file2, "f");
                        deleteDirWithFile(file2);
                    }
                }
            }
            file.delete();
        }
    }

    public final boolean deleteFile(java.lang.String path) {
        java.io.File file = new java.io.File(path);
        if (!file.exists() || !file.isFile()) {
            return false;
        }
        file.delete();
        return true;
    }

    public final void copyFile(java.lang.String oldPath, java.lang.String newPath) {
        getFileFromBytes(readBytes(oldPath), newPath);
    }

    public final void moveFile(java.lang.String oldPath, java.lang.String newPath) {
        copyFile(oldPath, newPath);
        deleteFile(oldPath);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int copy(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L44
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L44
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L44
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            java.io.OutputStream r8 = (java.io.OutputStream) r8     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L72
        L15:
            r4 = r3
            java.io.FileInputStream r4 = (java.io.FileInputStream) r4     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L72
            int r4 = r4.read(r1)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L72
            if (r4 == r0) goto L25
            r5 = r8
            java.io.FileOutputStream r5 = (java.io.FileOutputStream) r5     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L72
            r5.write(r1, r2, r4)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L72
            goto L15
        L25:
            r3.close()     // Catch: java.io.IOException -> L29
            goto L2d
        L29:
            r0 = move-exception
            r0.printStackTrace()
        L2d:
            r8.close()     // Catch: java.io.IOException -> L31
            goto L35
        L31:
            r8 = move-exception
            r8.printStackTrace()
        L35:
            r0 = 0
            goto L5f
        L37:
            r1 = move-exception
            goto L48
        L39:
            r9 = move-exception
            r8 = r1
            goto L73
        L3c:
            r8 = move-exception
            r6 = r1
            r1 = r8
            r8 = r6
            goto L48
        L41:
            r9 = move-exception
            r8 = r1
            goto L74
        L44:
            r8 = move-exception
            r3 = r1
            r1 = r8
            r8 = r3
        L48:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L55
            r3.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r1 = move-exception
            r1.printStackTrace()
        L55:
            if (r8 == 0) goto L5f
            r8.close()     // Catch: java.io.IOException -> L5b
            goto L5f
        L5b:
            r8 = move-exception
            r8.printStackTrace()
        L5f:
            java.io.File r8 = new java.io.File
            r8.<init>(r9)
            boolean r9 = r8.exists()
            if (r9 == 0) goto L71
            long r1 = java.lang.System.currentTimeMillis()
            r8.setLastModified(r1)
        L71:
            return r0
        L72:
            r9 = move-exception
        L73:
            r1 = r3
        L74:
            if (r1 == 0) goto L7e
            r1.close()     // Catch: java.io.IOException -> L7a
            goto L7e
        L7a:
            r0 = move-exception
            r0.printStackTrace()
        L7e:
            if (r8 == 0) goto L88
            r8.close()     // Catch: java.io.IOException -> L84
            goto L88
        L84:
            r8 = move-exception
            r8.printStackTrace()
        L88:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.base.utils.FileUtils.copy(java.lang.String, java.lang.String):int");
    }

    public final int copy(java.io.InputStream from, java.io.OutputStream to) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "from");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(to, "to");
        try {
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = from.read(bArr);
                    if (read != -1) {
                        to.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (java.io.IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                from.close();
                try {
                    to.close();
                } catch (java.io.IOException e2) {
                    e2.printStackTrace();
                }
                return 0;
            } catch (java.lang.Exception e3) {
                e3.printStackTrace();
                try {
                    from.close();
                } catch (java.io.IOException e4) {
                    e4.printStackTrace();
                }
                try {
                    to.close();
                    return -1;
                } catch (java.io.IOException e5) {
                    e5.printStackTrace();
                    return -1;
                }
            }
        } finally {
        }
    }

    public final int getFilesNumber(java.lang.String dir) {
        return new java.io.File(dir).listFiles().length;
    }

    public final java.lang.String[] getFilesList(java.lang.String dir) {
        java.lang.String[] list = new java.io.File(dir).list();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "file.list()");
        return list;
    }

    public final void changeFileDirName(java.lang.String path, java.lang.String oldName, java.lang.String newName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldName, "oldName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newName, "newName");
        new java.io.File(path + '/' + oldName).renameTo(new java.io.File(path + '/' + newName));
    }

    public final void writeToFile(java.lang.String content, java.lang.String path, java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        java.io.File file = new java.io.File(path + fileName);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            createFile(path, fileName);
        }
        try {
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            byte[] bytes = content.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            randomAccessFile.write(bytes);
            randomAccessFile.close();
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
        }
    }

    public final void writeToFile1(byte[] data, java.lang.String path, java.lang.String fileName) {
        java.io.BufferedOutputStream bufferedOutputStream;
        java.io.File parentFile;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        java.io.File file = new java.io.File(path + '/' + fileName);
        java.io.File parentFile2 = file.getParentFile();
        java.io.BufferedOutputStream bufferedOutputStream2 = null;
        java.lang.Boolean valueOf = parentFile2 != null ? java.lang.Boolean.valueOf(parentFile2.exists()) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
        if (!valueOf.booleanValue() && (parentFile = file.getParentFile()) != null) {
            parentFile.mkdirs();
        }
        if (!file.exists()) {
            createFile(path, fileName);
        }
        try {
            try {
                try {
                    bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file, true));
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                    return;
                }
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
        try {
            bufferedOutputStream.write(data);
            bufferedOutputStream.close();
        } catch (java.lang.Exception e3) {
            e = e3;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (java.io.IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    public final java.io.File getFileFromBytes(byte[] bytes, java.lang.String outputFile) {
        java.io.File file;
        java.io.BufferedOutputStream bufferedOutputStream;
        java.io.BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                try {
                    file = new java.io.File(outputFile);
                    try {
                        bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
                    } catch (java.lang.Exception e) {
                        e = e;
                    }
                } catch (java.io.IOException e2) {
                    e2.printStackTrace();
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                file = null;
            }
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.close();
        } catch (java.lang.Exception e4) {
            e = e4;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            return file;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (java.io.IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
        return file;
    }

    public final java.lang.String readContents(java.lang.String path, java.lang.String format) {
        java.io.FileInputStream fileInputStream;
        if (format == null) {
            format = "utf-8";
        }
        java.io.File file = new java.io.File(path);
        java.io.InputStreamReader inputStreamReader = null;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new java.io.FileInputStream(file);
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
            fileInputStream = null;
        }
        try {
            inputStreamReader = new java.io.InputStreamReader(fileInputStream, format);
        } catch (java.io.UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        while (true) {
            try {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            } catch (java.io.IOException e3) {
                e3.printStackTrace();
            }
        }
        return sb.toString();
    }

    public final java.lang.String readResource(android.content.Context context, int id, java.lang.String format) {
        java.io.InputStreamReader inputStreamReader;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.io.InputStream openRawResource = context.getResources().openRawResource(id);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openRawResource, "context.getResources().openRawResource(id)");
        try {
            inputStreamReader = new java.io.InputStreamReader(openRawResource, format);
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
            inputStreamReader = null;
        }
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        while (true) {
            try {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            } catch (java.io.IOException e2) {
                e2.printStackTrace();
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    public final byte[] readBytes(java.lang.String path) {
        java.io.File file = new java.io.File(path);
        if (!file.exists()) {
            return null;
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            if (fileInputStream.getChannel().size() <= 0) {
                return null;
            }
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            return bArr;
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (java.io.IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final long getFileLength(java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        java.io.File file = new java.io.File(path);
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }

    private final void createDestDirectoryIfNecessary(java.lang.String destParam) {
        java.io.File file;
        java.lang.String str = java.io.File.separator;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "separator");
        if (kotlin.text.StringsKt.endsWith$default(destParam, str, false, 2, (java.lang.Object) null)) {
            file = new java.io.File(destParam);
        } else {
            java.lang.String str2 = java.io.File.separator;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "separator");
            java.lang.String substring = destParam.substring(0, kotlin.text.StringsKt.lastIndexOf$default(destParam, str2, 0, false, 6, (java.lang.Object) null));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            file = new java.io.File(substring);
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public final java.io.File drawableToFile(android.content.Context mContext, int drawableId, java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mContext, "mContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource(mContext.getResources(), drawableId);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decodeResource, "decodeResource(mContext.resources, drawableId)");
        java.lang.String str = mContext.getFilesDir().getAbsolutePath() + "/feedback";
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        java.io.File file2 = new java.io.File(str + '/' + fileName);
        try {
            file2.createNewFile();
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
            decodeResource.compress(android.graphics.Bitmap.CompressFormat.PNG, 20, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return file2;
    }

    /* compiled from: FileUtils.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0016"}, d2 = {"Lcom/qcwireless/qcwatch/base/utils/FileUtils$UriUtil;", "", "()V", "getDataColumn", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getImagePath", "getRealPathApi11to18", "contentUri", "getRealPathApi19Above", "isDownloadsDocument", "", "isExternalStorageDocument", "isGooglePhotosUri", "isMediaDocument", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class UriUtil {
        public static final com.qcwireless.qcwatch.base.utils.FileUtils.UriUtil INSTANCE = new com.qcwireless.qcwatch.base.utils.FileUtils.UriUtil();

        private UriUtil() {
        }

        private final java.lang.String getRealPathApi19Above(android.content.Context context, android.net.Uri uri) {
            try {
                android.net.Uri uri2 = null;
                if (!android.provider.DocumentsContract.isDocumentUri(context, uri)) {
                    return kotlin.text.StringsKt.equals("content", uri.getScheme(), true) ? isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(context, uri, null, null) : kotlin.text.StringsKt.equals("file", uri.getScheme(), true) ? uri.getPath() : "";
                }
                if (isExternalStorageDocument(uri)) {
                    java.lang.String documentId = android.provider.DocumentsContract.getDocumentId(uri);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(documentId, "docId");
                    java.lang.Object[] array = kotlin.text.StringsKt.split$default(documentId, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
                    if (array != null) {
                        java.lang.String[] strArr = (java.lang.String[]) array;
                        if (!kotlin.text.StringsKt.equals("primary", strArr[0], true)) {
                            return "";
                        }
                        return android.os.Environment.getExternalStorageDirectory().toString() + '/' + strArr[1];
                    }
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                if (isDownloadsDocument(uri)) {
                    java.lang.String documentId2 = android.provider.DocumentsContract.getDocumentId(uri);
                    android.net.Uri parse = android.net.Uri.parse("content://downloads/public_downloads");
                    java.lang.Long valueOf = java.lang.Long.valueOf(documentId2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(id)");
                    android.net.Uri withAppendedId = android.content.ContentUris.withAppendedId(parse, valueOf.longValue());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(withAppendedId, "withAppendedId(\n        …                        )");
                    return getDataColumn(context, withAppendedId, null, null);
                }
                if (!isMediaDocument(uri)) {
                    return "";
                }
                java.lang.String documentId3 = android.provider.DocumentsContract.getDocumentId(uri);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(documentId3, "docId");
                java.lang.Object[] array2 = kotlin.text.StringsKt.split$default(documentId3, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
                if (array2 != null) {
                    java.lang.String[] strArr2 = (java.lang.String[]) array2;
                    java.lang.String str = strArr2[0];
                    if (kotlin.jvm.internal.Intrinsics.areEqual(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_IMAGE, str)) {
                        uri2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_VIDEO, str)) {
                        uri2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO, str)) {
                        uri2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return getDataColumn(context, uri2, "_id=?", new java.lang.String[]{strArr2[1]});
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            } catch (java.lang.Exception unused) {
                return "";
            }
        }

        private final java.lang.String getDataColumn(android.content.Context context, android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) {
            android.database.Cursor cursor = null;
            try {
                android.content.ContentResolver contentResolver = context.getContentResolver();
                kotlin.jvm.internal.Intrinsics.checkNotNull(uri);
                android.database.Cursor query = contentResolver.query(uri, new java.lang.String[]{"_data"}, selection, selectionArgs, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            java.lang.String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            query.close();
                            return string;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }

        private final java.lang.String getRealPathApi11to18(android.content.Context context, android.net.Uri contentUri) {
            try {
                android.database.Cursor loadInBackground = new androidx.loader.content.CursorLoader(context, contentUri, new java.lang.String[]{"_data"}, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null).loadInBackground();
                if (loadInBackground == null) {
                    return null;
                }
                int columnIndexOrThrow = loadInBackground.getColumnIndexOrThrow("_data");
                loadInBackground.moveToFirst();
                return loadInBackground.getString(columnIndexOrThrow);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }

        public final java.lang.String getImagePath(android.content.Context context, android.net.Uri uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
            return android.os.Build.VERSION.SDK_INT < 19 ? getRealPathApi11to18(context, uri) : getRealPathApi19Above(context, uri);
        }

        private final boolean isExternalStorageDocument(android.net.Uri uri) {
            return kotlin.jvm.internal.Intrinsics.areEqual("com.android.externalstorage.documents", uri.getAuthority());
        }

        private final boolean isDownloadsDocument(android.net.Uri uri) {
            return kotlin.jvm.internal.Intrinsics.areEqual("com.android.providers.downloads.documents", uri.getAuthority());
        }

        private final boolean isMediaDocument(android.net.Uri uri) {
            return kotlin.jvm.internal.Intrinsics.areEqual("com.android.providers.media.documents", uri.getAuthority());
        }

        private final boolean isGooglePhotosUri(android.net.Uri uri) {
            return kotlin.jvm.internal.Intrinsics.areEqual("com.google.android.apps.photos.content", uri.getAuthority());
        }
    }

    public final void saveFileToPath(java.io.File sourceFile, java.lang.String destinationPath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceFile, "sourceFile");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        try {
            java.io.File file = new java.io.File(destinationPath);
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(sourceFile);
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            java.nio.channels.FileChannel channel = fileInputStream.getChannel();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(channel, "fileInputStream.channel");
            java.nio.channels.FileChannel channel2 = fileOutputStream.getChannel();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(channel2, "fileOutputStream.channel");
            channel2.transferFrom(channel, 0L, channel.size());
            channel.close();
            channel2.close();
            fileInputStream.close();
            fileOutputStream.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
