package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class ZipUtils {
    private static final int BUFFER_LEN = 8192;

    private ZipUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean zipFiles(java.util.Collection<java.lang.String> collection, java.lang.String str) throws java.io.IOException {
        return zipFiles(collection, str, (java.lang.String) null);
    }

    public static boolean zipFiles(java.util.Collection<java.lang.String> collection, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        if (collection == null || str == null) {
            return false;
        }
        java.util.zip.ZipOutputStream zipOutputStream = null;
        try {
            java.util.zip.ZipOutputStream zipOutputStream2 = new java.util.zip.ZipOutputStream(new java.io.FileOutputStream(str));
            try {
                java.util.Iterator<java.lang.String> it = collection.iterator();
                while (it.hasNext()) {
                    if (!zipFile(com.blankj.utilcode.util.UtilsBridge.getFileByPath(it.next()), "", zipOutputStream2, str2)) {
                        zipOutputStream2.finish();
                        zipOutputStream2.close();
                        return false;
                    }
                }
                zipOutputStream2.finish();
                zipOutputStream2.close();
                return true;
            } catch (java.lang.Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                if (zipOutputStream != null) {
                    zipOutputStream.finish();
                    zipOutputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static boolean zipFiles(java.util.Collection<java.io.File> collection, java.io.File file) throws java.io.IOException {
        return zipFiles(collection, file, (java.lang.String) null);
    }

    public static boolean zipFiles(java.util.Collection<java.io.File> collection, java.io.File file, java.lang.String str) throws java.io.IOException {
        if (collection == null || file == null) {
            return false;
        }
        java.util.zip.ZipOutputStream zipOutputStream = null;
        try {
            java.util.zip.ZipOutputStream zipOutputStream2 = new java.util.zip.ZipOutputStream(new java.io.FileOutputStream(file));
            try {
                java.util.Iterator<java.io.File> it = collection.iterator();
                while (it.hasNext()) {
                    if (!zipFile(it.next(), "", zipOutputStream2, str)) {
                        zipOutputStream2.finish();
                        zipOutputStream2.close();
                        return false;
                    }
                }
                zipOutputStream2.finish();
                zipOutputStream2.close();
                return true;
            } catch (java.lang.Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                if (zipOutputStream != null) {
                    zipOutputStream.finish();
                    zipOutputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static boolean zipFile(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        return zipFile(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), com.blankj.utilcode.util.UtilsBridge.getFileByPath(str2), (java.lang.String) null);
    }

    public static boolean zipFile(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.io.IOException {
        return zipFile(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), com.blankj.utilcode.util.UtilsBridge.getFileByPath(str2), str3);
    }

    public static boolean zipFile(java.io.File file, java.io.File file2) throws java.io.IOException {
        return zipFile(file, file2, (java.lang.String) null);
    }

    public static boolean zipFile(java.io.File file, java.io.File file2, java.lang.String str) throws java.io.IOException {
        if (file == null || file2 == null) {
            return false;
        }
        java.util.zip.ZipOutputStream zipOutputStream = null;
        try {
            java.util.zip.ZipOutputStream zipOutputStream2 = new java.util.zip.ZipOutputStream(new java.io.FileOutputStream(file2));
            try {
                boolean zipFile = zipFile(file, "", zipOutputStream2, str);
                zipOutputStream2.close();
                return zipFile;
            } catch (java.lang.Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                if (zipOutputStream != null) {
                    zipOutputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private static boolean zipFile(java.io.File file, java.lang.String str, java.util.zip.ZipOutputStream zipOutputStream, java.lang.String str2) throws java.io.IOException {
        java.io.BufferedInputStream bufferedInputStream;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(com.blankj.utilcode.util.UtilsBridge.isSpace(str) ? "" : java.io.File.separator);
        sb.append(file.getName());
        java.lang.String sb2 = sb.toString();
        if (file.isDirectory()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry(sb2 + '/');
                zipEntry.setComment(str2);
                zipOutputStream.putNextEntry(zipEntry);
                zipOutputStream.closeEntry();
                return true;
            }
            for (java.io.File file2 : listFiles) {
                if (!zipFile(file2, sb2, zipOutputStream, str2)) {
                    return false;
                }
            }
            return true;
        }
        java.io.BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            java.util.zip.ZipEntry zipEntry2 = new java.util.zip.ZipEntry(sb2);
            zipEntry2.setComment(str2);
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 8192);
                if (read != -1) {
                    zipOutputStream.write(bArr, 0, read);
                } else {
                    zipOutputStream.closeEntry();
                    bufferedInputStream.close();
                    return true;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            throw th;
        }
    }

    public static java.util.List<java.io.File> unzipFile(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        return unzipFileByKeyword(str, str2, (java.lang.String) null);
    }

    public static java.util.List<java.io.File> unzipFile(java.io.File file, java.io.File file2) throws java.io.IOException {
        return unzipFileByKeyword(file, file2, (java.lang.String) null);
    }

    public static java.util.List<java.io.File> unzipFileByKeyword(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.io.IOException {
        return unzipFileByKeyword(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), com.blankj.utilcode.util.UtilsBridge.getFileByPath(str2), str3);
    }

    public static java.util.List<java.io.File> unzipFileByKeyword(java.io.File file, java.io.File file2, java.lang.String str) throws java.io.IOException {
        if (file == null || file2 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(file);
        java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
        try {
            if (com.blankj.utilcode.util.UtilsBridge.isSpace(str)) {
                while (entries.hasMoreElements()) {
                    java.util.zip.ZipEntry nextElement = entries.nextElement();
                    java.lang.String replace = nextElement.getName().replace("\\", "/");
                    if (replace.contains("../")) {
                        android.util.Log.e("ZipUtils", "entryName: " + replace + " is dangerous!");
                    } else if (!unzipChildFile(file2, arrayList, zipFile, nextElement, replace)) {
                        return arrayList;
                    }
                }
            } else {
                while (entries.hasMoreElements()) {
                    java.util.zip.ZipEntry nextElement2 = entries.nextElement();
                    java.lang.String replace2 = nextElement2.getName().replace("\\", "/");
                    if (replace2.contains("../")) {
                        android.util.Log.e("ZipUtils", "entryName: " + replace2 + " is dangerous!");
                    } else if (replace2.contains(str) && !unzipChildFile(file2, arrayList, zipFile, nextElement2, replace2)) {
                        return arrayList;
                    }
                }
            }
            return arrayList;
        } finally {
            zipFile.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean unzipChildFile(java.io.File r1, java.util.List<java.io.File> r2, java.util.zip.ZipFile r3, java.util.zip.ZipEntry r4, java.lang.String r5) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r5)
            r2.add(r0)
            boolean r1 = r4.isDirectory()
            if (r1 == 0) goto L13
            boolean r1 = com.blankj.utilcode.util.UtilsBridge.createOrExistsDir(r0)
            return r1
        L13:
            boolean r1 = com.blankj.utilcode.util.UtilsBridge.createOrExistsFile(r0)
            r2 = 0
            if (r1 != 0) goto L1b
            return r2
        L1b:
            r1 = 0
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4b
            java.io.InputStream r3 = r3.getInputStream(r4)     // Catch: java.lang.Throwable -> L4b
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4b
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L48
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L48
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L48
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L46
        L33:
            int r4 = r5.read(r1)     // Catch: java.lang.Throwable -> L46
            r0 = -1
            if (r4 == r0) goto L3e
            r3.write(r1, r2, r4)     // Catch: java.lang.Throwable -> L46
            goto L33
        L3e:
            r5.close()
            r3.close()
            r1 = 1
            return r1
        L46:
            r1 = move-exception
            goto L4f
        L48:
            r2 = move-exception
            r3 = r1
            goto L4e
        L4b:
            r2 = move-exception
            r3 = r1
            r5 = r3
        L4e:
            r1 = r2
        L4f:
            if (r5 == 0) goto L54
            r5.close()
        L54:
            if (r3 == 0) goto L59
            r3.close()
        L59:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.ZipUtils.unzipChildFile(java.io.File, java.util.List, java.util.zip.ZipFile, java.util.zip.ZipEntry, java.lang.String):boolean");
    }

    public static java.util.List<java.lang.String> getFilesPath(java.lang.String str) throws java.io.IOException {
        return getFilesPath(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str));
    }

    public static java.util.List<java.lang.String> getFilesPath(java.io.File file) throws java.io.IOException {
        if (file == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(file);
        java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            java.lang.String replace = entries.nextElement().getName().replace("\\", "/");
            if (replace.contains("../")) {
                android.util.Log.e("ZipUtils", "entryName: " + replace + " is dangerous!");
                arrayList.add(replace);
            } else {
                arrayList.add(replace);
            }
        }
        zipFile.close();
        return arrayList;
    }

    public static java.util.List<java.lang.String> getComments(java.lang.String str) throws java.io.IOException {
        return getComments(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str));
    }

    public static java.util.List<java.lang.String> getComments(java.io.File file) throws java.io.IOException {
        if (file == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(file);
        java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            arrayList.add(entries.nextElement().getComment());
        }
        zipFile.close();
        return arrayList;
    }
}
