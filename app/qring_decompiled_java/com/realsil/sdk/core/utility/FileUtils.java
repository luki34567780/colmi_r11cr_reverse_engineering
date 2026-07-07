package com.realsil.sdk.core.utility;

/* loaded from: classes3.dex */
public final class FileUtils {
    public static java.lang.String a(android.content.Context context, android.net.Uri uri) {
        if (isGooglePhotosUri(uri)) {
            com.realsil.sdk.core.logger.ZLogger.v("isGooglePhotosUri");
            return uri.getLastPathSegment();
        }
        if (isOppoUri(uri)) {
            com.realsil.sdk.core.logger.ZLogger.v("isOppoUri");
            java.lang.String path = uri.getPath();
            java.io.File file = new java.io.File(path);
            if (!file.exists()) {
                return path.contains("/file_share/") ? path.replace("/file_share", "") : path;
            }
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, ">>>> %s\n%s\n%d", file.getPath(), file.getName(), java.lang.Long.valueOf(file.length())));
            return path;
        }
        if (isHuaweiUri(uri) || isHuaweiShareUri(uri)) {
            com.realsil.sdk.core.logger.ZLogger.v("isHuaweiUri");
            java.lang.String path2 = uri.getPath();
            java.io.File file2 = new java.io.File(path2);
            if (!file2.exists()) {
                return path2.contains("/root/") ? path2.replace("/root", "") : path2;
            }
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, ">>>> %s\n%s\n%d", file2.getPath(), file2.getName(), java.lang.Long.valueOf(file2.length())));
            return path2;
        }
        if (isNokia(uri)) {
            com.realsil.sdk.core.logger.ZLogger.v("isNokia");
            java.lang.String path3 = uri.getPath();
            java.io.File file3 = new java.io.File(path3);
            if (!file3.exists()) {
                return path3.contains("/shared_files/") ? path3.replace("/shared_files", "") : path3;
            }
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, ">>>> %s\n%s\n%d", file3.getPath(), file3.getName(), java.lang.Long.valueOf(file3.length())));
            return path3;
        }
        if (!isTencentProvider(uri)) {
            java.lang.String dataColumn = getDataColumn(context, uri, null, null);
            com.realsil.sdk.core.logger.ZLogger.v("getDataColumn:" + dataColumn);
            return !android.text.TextUtils.isEmpty(dataColumn) ? dataColumn : uri.getPath();
        }
        com.realsil.sdk.core.logger.ZLogger.v("TencentProvider");
        java.lang.String path4 = uri.getPath();
        java.io.File file4 = new java.io.File(path4);
        if (file4.exists()) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, ">>>> %s\n%s\n%d", file4.getPath(), file4.getName(), java.lang.Long.valueOf(file4.length())));
            return path4;
        }
        if (!path4.contains("/QQBrowser/")) {
            return path4;
        }
        return android.os.Environment.getExternalStorageDirectory() + path4.replace("/QQBrowser", "");
    }

    public static java.lang.String b(android.content.Context context, android.net.Uri uri) {
        java.lang.String authority = uri.getAuthority();
        int i = "com.android.externalstorage.documents".equals(authority) ? 1 : "com.android.providers.downloads.documents".equals(authority) ? 2 : "com.android.providers.media.documents".equals(authority) ? 3 : "com.google.android.apps.docs.storage".equals(authority) ? 4 : 0;
        java.lang.String documentId = android.provider.DocumentsContract.getDocumentId(uri);
        java.lang.String[] split = documentId.split(":");
        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("getPathFromDocumentUri, type=0x%02X, docId=%s", java.lang.Integer.valueOf(i), documentId));
        if (i == 1) {
            if (split.length <= 0) {
                return documentId;
            }
            java.lang.String str = split[0];
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format("type=%s", str));
            if ("primary".equalsIgnoreCase(str)) {
                return android.os.Environment.getExternalStorageDirectory() + "/" + split[1];
            }
            return android.os.Environment.getExternalStorageDirectory() + "/" + split[1];
        }
        android.net.Uri uri2 = null;
        if (i == 2) {
            int length = split.length;
            if (length >= 2) {
                java.lang.String str2 = split[0];
                com.realsil.sdk.core.logger.ZLogger.v("type=" + str2);
                if ("raw".equalsIgnoreCase(str2)) {
                    return split[1];
                }
                if ("msf".equalsIgnoreCase(str2)) {
                    return getDataColumn(context, android.content.ContentUris.withAppendedId(android.net.Uri.parse("content://downloads/public_downloads"), java.lang.Long.parseLong(split[1])), null, null);
                }
                getDataColumn(context, android.content.ContentUris.withAppendedId(android.net.Uri.parse("content://downloads/public_downloads"), android.content.ContentUris.parseId(uri)), null, null);
            } else if (length == 1) {
                return getDataColumn(context, android.content.ContentUris.withAppendedId(android.net.Uri.parse("content://downloads/public_downloads"), java.lang.Long.parseLong(documentId)), null, null);
            }
        } else {
            if (i == 3) {
                java.lang.String str3 = split[0];
                if (com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_IMAGE.equalsIgnoreCase(str3)) {
                    uri2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if (com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_VIDEO.equalsIgnoreCase(str3)) {
                    uri2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO.equalsIgnoreCase(str3)) {
                    uri2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return getDataColumn(context, uri2, "_id=?", new java.lang.String[]{split[1]});
            }
            if (i == 4) {
                android.database.Cursor query = context.getContentResolver().query(uri, null, null, null, null);
                int columnIndex = query.getColumnIndex("_display_name");
                int columnIndex2 = query.getColumnIndex("_size");
                query.moveToFirst();
                java.lang.String string = query.getString(columnIndex);
                com.realsil.sdk.core.logger.ZLogger.e("name:" + string);
                com.realsil.sdk.core.logger.ZLogger.e("size:" + java.lang.Long.toString(query.getLong(columnIndex2)));
                java.io.File file = new java.io.File(context.getCacheDir(), string);
                try {
                    java.io.InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                    byte[] bArr = new byte[java.lang.Math.min(openInputStream.available(), 1048576)];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    openInputStream.close();
                    fileOutputStream.close();
                    com.realsil.sdk.core.logger.ZLogger.d("File Path: " + file.getPath());
                    com.realsil.sdk.core.logger.ZLogger.d("File Size: " + file.length());
                } catch (java.lang.Exception e) {
                    com.realsil.sdk.core.logger.ZLogger.e(e.getMessage());
                }
                return file.getPath();
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:12|13|14)|15|16|(2:26|27)|(1:25)|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
    
        com.realsil.sdk.core.logger.ZLogger.w(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
    
        if (r3 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        if (r2 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
    
        r3.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void copyFile(java.lang.String r5, java.lang.String r6) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L20
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = " not exist"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.realsil.sdk.core.logger.ZLogger.w(r5)
            return
        L20:
            java.io.File r1 = new java.io.File
            r1.<init>(r6)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L5d
            boolean r2 = r1.createNewFile()     // Catch: java.io.IOException -> L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L48
            r3.<init>()     // Catch: java.io.IOException -> L48
            java.lang.String r4 = "createNewFile: "
            r3.append(r4)     // Catch: java.io.IOException -> L48
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.io.IOException -> L48
            r3.append(r2)     // Catch: java.io.IOException -> L48
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L48
            com.realsil.sdk.core.logger.ZLogger.e(r2)     // Catch: java.io.IOException -> L48
            goto L5d
        L48:
            r2 = move-exception
            java.lang.String r3 = "createFile failed: "
            java.lang.StringBuilder r3 = com.realsil.sdk.core.a.a.a(r3)
            java.lang.String r2 = r2.toString()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.realsil.sdk.core.logger.ZLogger.e(r2)
        L5d:
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6c
            r3.<init>(r0)     // Catch: java.io.FileNotFoundException -> L6c
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L6a
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> L6a
            r2 = r0
            goto L75
        L6a:
            r0 = move-exception
            goto L6e
        L6c:
            r0 = move-exception
            r3 = r2
        L6e:
            java.lang.String r0 = r0.toString()
            com.realsil.sdk.core.logger.ZLogger.e(r0)
        L75:
            java.lang.String r0 = "copyFile from %s to %s"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L94 java.io.IOException -> L96
            r4 = 0
            r1[r4] = r5     // Catch: java.lang.Throwable -> L94 java.io.IOException -> L96
            r5 = 1
            r1[r5] = r6     // Catch: java.lang.Throwable -> L94 java.io.IOException -> L96
            java.lang.String r5 = java.lang.String.format(r0, r1)     // Catch: java.lang.Throwable -> L94 java.io.IOException -> L96
            com.realsil.sdk.core.logger.ZLogger.d(r5)     // Catch: java.lang.Throwable -> L94 java.io.IOException -> L96
            copyFile(r3, r2)     // Catch: java.lang.Throwable -> L94 java.io.IOException -> L96
            if (r3 == 0) goto L91
            r3.close()     // Catch: java.io.IOException -> L90
            goto L91
        L90:
        L91:
            if (r2 == 0) goto Laa
            goto La7
        L94:
            r5 = move-exception
            goto Lab
        L96:
            r5 = move-exception
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L94
            com.realsil.sdk.core.logger.ZLogger.w(r5)     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto La5
            r3.close()     // Catch: java.io.IOException -> La4
            goto La5
        La4:
        La5:
            if (r2 == 0) goto Laa
        La7:
            r2.close()     // Catch: java.io.IOException -> Laa
        Laa:
            return
        Lab:
            if (r3 == 0) goto Lb2
            r3.close()     // Catch: java.io.IOException -> Lb1
            goto Lb2
        Lb1:
        Lb2:
            if (r2 == 0) goto Lb7
            r2.close()     // Catch: java.io.IOException -> Lb7
        Lb7:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.core.utility.FileUtils.copyFile(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void copyFileStream(java.io.File r2, android.net.Uri r3, android.content.Context r4) throws java.io.IOException {
        /*
            r0 = 0
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            java.io.InputStream r3 = r4.openInputStream(r3)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L30
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L30
            if (r3 == 0) goto L23
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
        L14:
            int r0 = r3.read(r2)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            if (r0 <= 0) goto L23
            r1 = 0
            r4.write(r2, r1, r0)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            goto L14
        L1f:
            r2 = move-exception
            goto L49
        L21:
            r2 = move-exception
            goto L32
        L23:
            if (r3 == 0) goto L28
            r3.close()
        L28:
            r4.close()
            goto L46
        L2c:
            r2 = move-exception
            r4 = r0
            r0 = r3
            goto L48
        L30:
            r2 = move-exception
            r4 = r0
        L32:
            r0 = r3
            goto L39
        L34:
            r2 = move-exception
            r4 = r0
            goto L48
        L37:
            r2 = move-exception
            r4 = r0
        L39:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L41
            r0.close()
        L41:
            if (r4 == 0) goto L46
            r4.close()
        L46:
            return
        L47:
            r2 = move-exception
        L48:
            r3 = r0
        L49:
            if (r3 == 0) goto L4e
            r3.close()
        L4e:
            if (r4 == 0) goto L53
            r4.close()
        L53:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.realsil.sdk.core.utility.FileUtils.copyFileStream(java.io.File, android.net.Uri, android.content.Context):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x009b -> B:23:0x009e). Please report as a decompilation issue!!! */
    public static void copyFromAssetsToSdcard(android.content.Context context, boolean z, java.lang.String str, java.lang.String str2) {
        java.io.FileOutputStream fileOutputStream;
        java.io.IOException e;
        java.io.FileNotFoundException e2;
        ?? exists = new java.io.File(str2).exists();
        if (exists == 0 || z) {
            try {
                try {
                    try {
                        context = context.getAssets().open(str);
                    } catch (java.io.IOException e3) {
                        e3.printStackTrace();
                    }
                } catch (java.io.FileNotFoundException e4) {
                    fileOutputStream = null;
                    e2 = e4;
                    context = 0;
                } catch (java.io.IOException e5) {
                    fileOutputStream = null;
                    e = e5;
                    context = 0;
                } catch (java.lang.Throwable th) {
                    exists = 0;
                    th = th;
                    context = 0;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            try {
                fileOutputStream = new java.io.FileOutputStream(str2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = context.read(bArr, 0, 1024);
                        if (read < 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, read);
                        }
                    }
                    com.realsil.sdk.core.logger.ZLogger.v("source = " + str + ", dest = " + str2);
                    try {
                        fileOutputStream.close();
                    } catch (java.io.IOException e6) {
                        e6.printStackTrace();
                    }
                    context.close();
                } catch (java.io.FileNotFoundException e7) {
                    e2 = e7;
                    e2.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    if (context != 0) {
                        context.close();
                    }
                } catch (java.io.IOException e9) {
                    e = e9;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (context != 0) {
                        context.close();
                    }
                }
            } catch (java.io.FileNotFoundException e11) {
                fileOutputStream = null;
                e2 = e11;
            } catch (java.io.IOException e12) {
                fileOutputStream = null;
                e = e12;
            } catch (java.lang.Throwable th3) {
                exists = 0;
                th = th3;
                if (exists != 0) {
                    try {
                        exists.close();
                    } catch (java.io.IOException e13) {
                        e13.printStackTrace();
                    }
                }
                if (context == 0) {
                    throw th;
                }
                try {
                    context.close();
                    throw th;
                } catch (java.io.IOException e14) {
                    e14.printStackTrace();
                    throw th;
                }
            }
        }
    }

    public static java.io.File createDir(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean exists(java.lang.String str) {
        try {
            return new java.io.File(str).exists();
        } catch (java.lang.Exception e) {
            com.realsil.sdk.core.logger.ZLogger.e(e.getMessage());
            return false;
        }
    }

    public static java.lang.String getDataColumn(android.content.Context context, android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new java.lang.String[]{"_data"}, str, strArr, null);
                if (cursor != null && cursor.moveToFirst()) {
                    int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
                    if (columnIndexOrThrow >= 0) {
                        java.lang.String string = cursor.getString(columnIndexOrThrow);
                        cursor.close();
                        return string;
                    }
                    com.realsil.sdk.core.logger.ZLogger.w("column '_data' does not exist. ");
                }
                if (cursor == null) {
                    return "";
                }
            } catch (java.lang.Exception e) {
                com.realsil.sdk.core.logger.ZLogger.w(e.toString());
                if (0 == 0) {
                    return "";
                }
            }
            cursor.close();
            return "";
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public static java.lang.String getFileExtensionFromUrl(java.lang.String str) {
        int lastIndexOf;
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf2 = str.lastIndexOf(35);
        if (lastIndexOf2 > 0) {
            str = str.substring(0, lastIndexOf2);
        }
        int lastIndexOf3 = str.lastIndexOf(63);
        if (lastIndexOf3 > 0) {
            str = str.substring(0, lastIndexOf3);
        }
        int lastIndexOf4 = str.lastIndexOf(47);
        if (lastIndexOf4 >= 0) {
            str = str.substring(lastIndexOf4 + 1);
        }
        return (str.isEmpty() || (lastIndexOf = str.lastIndexOf(46)) < 0) ? "" : str.substring(lastIndexOf + 1);
    }

    public static java.lang.String getFileExtensionFromUrl2(java.lang.String str) {
        int lastIndexOf;
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf2 = str.lastIndexOf(35);
        com.realsil.sdk.core.logger.ZLogger.d("fragment=" + lastIndexOf2);
        if (lastIndexOf2 > 0) {
            str = str.substring(0, lastIndexOf2);
        }
        int lastIndexOf3 = str.lastIndexOf(63);
        com.realsil.sdk.core.logger.ZLogger.d("query=" + lastIndexOf3);
        if (lastIndexOf3 > 0) {
            str = str.substring(0, lastIndexOf3);
        }
        int lastIndexOf4 = str.lastIndexOf(47);
        if (lastIndexOf4 >= 0) {
            str = str.substring(lastIndexOf4 + 1);
        }
        return (str.isEmpty() || !java.util.regex.Pattern.matches("[a-zA-Z_0-9\\+\\.\\-\\(\\)\\%]+", str) || (lastIndexOf = str.lastIndexOf(46)) < 0) ? "" : str.substring(lastIndexOf + 1);
    }

    public static long getFileSize(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (!file.isDirectory()) {
            return file.length();
        }
        long j = 0;
        for (java.io.File file2 : file.listFiles()) {
            j += getFileSize(file2.getAbsolutePath());
        }
        return j;
    }

    public static java.lang.String getPath(android.content.Context context, android.net.Uri uri) {
        try {
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            com.realsil.sdk.core.logger.ZLogger.w(e.toString());
        }
        if ((android.os.Build.VERSION.SDK_INT >= 19) && android.provider.DocumentsContract.isDocumentUri(context, uri)) {
            return b(context, uri);
        }
        if (!"content".equalsIgnoreCase(uri.getScheme())) {
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                com.realsil.sdk.core.logger.ZLogger.v("file:" + uri.getPath());
                return uri.getPath();
            }
            return "";
        }
        java.lang.String a = a(context, uri);
        if (!android.text.TextUtils.isEmpty(a)) {
            java.io.File file = new java.io.File(a);
            if (file.exists()) {
                com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, ">> %s\n%s\n%d", file.getPath(), file.getName(), java.lang.Long.valueOf(file.length())));
                return a;
            }
            com.realsil.sdk.core.logger.ZLogger.d(">> file not exist");
            return a;
        }
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        java.io.File file2 = new java.io.File(lastPathSegment);
        if (file2.exists()) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, "> %s\n%s\n%d", file2.getPath(), file2.getName(), java.lang.Long.valueOf(file2.length())));
            return lastPathSegment;
        }
        java.lang.String path = uri.getPath();
        if (android.text.TextUtils.isEmpty(path)) {
            java.lang.String path2 = uri.getPath();
            java.io.File file3 = new java.io.File(path2);
            if (file3.exists()) {
                com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, ">>> %s\n%s\n%d", file3.getPath(), file3.getName(), java.lang.Long.valueOf(file3.length())));
                return path2;
            }
            com.realsil.sdk.core.logger.ZLogger.d(">>>file not exist");
            return path2;
        }
        java.io.File file4 = new java.io.File(path);
        if (file4.exists()) {
            com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, ">>>> %s\n%s\n%d", file4.getPath(), file4.getName(), java.lang.Long.valueOf(file4.length())));
            return path;
        }
        java.lang.String replace = path.replace("/file_share", "");
        java.io.File file5 = new java.io.File(replace);
        if (!file5.exists()) {
            return replace.replace("/file_share", "");
        }
        com.realsil.sdk.core.logger.ZLogger.v(java.lang.String.format(java.util.Locale.US, ">>> %s\n%s\n%d", file5.getPath(), file5.getName(), java.lang.Long.valueOf(file5.length())));
        return replace;
    }

    public static java.lang.String getSDCardAbsPath() {
        return android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static java.io.File getSaveFile(java.lang.String str, java.lang.String str2) {
        return getSaveFile(str, str2, true);
    }

    public static java.io.File getSaveFolder(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getSDCardAbsPath());
        java.lang.String str2 = java.io.File.separator;
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        java.io.File file = new java.io.File(sb.toString());
        file.mkdirs();
        return file;
    }

    public static java.lang.String getSavePath(java.lang.String str) {
        return getSaveFolder(str).getAbsolutePath();
    }

    public static java.lang.String getSavePathCompat(java.lang.String str) {
        return getSaveFolder(str).getAbsolutePath();
    }

    public static java.lang.String getSuffix(java.io.File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? "" : getSuffix(file.getName());
    }

    public static int getUrlFileSize(java.lang.String str) {
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setDoInput(true);
            int contentLength = httpURLConnection.getContentLength();
            httpURLConnection.disconnect();
            return contentLength;
        } catch (java.lang.Exception e) {
            com.realsil.sdk.core.logger.ZLogger.e(e.toString());
            return 0;
        }
    }

    public static boolean isDownloadsDocument(android.net.Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(android.net.Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isGoogleCloudDocument(android.net.Uri uri) {
        return "com.google.android.apps.docs.storage".equals(uri.getAuthority());
    }

    public static boolean isGooglePhotosUri(android.net.Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean isHuaweiShareUri(android.net.Uri uri) {
        return "com.huawei.filemanager.share.fileprovider".equals(uri.getAuthority());
    }

    public static boolean isHuaweiUri(android.net.Uri uri) {
        return "com.huawei.hidisk.fileprovider".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(android.net.Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean isNokia(android.net.Uri uri) {
        return "com.fihtdc.filemanager.provider".equals(uri.getAuthority());
    }

    public static boolean isOppoUri(android.net.Uri uri) {
        return "com.coloros.fileprovider".equals(uri.getAuthority());
    }

    public static boolean isTencentProvider(android.net.Uri uri) {
        return "com.tencent.mtt.fileprovider".equals(uri.getAuthority());
    }

    public static boolean makeDir(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }

    public static java.io.File getSaveFile(java.lang.String str, java.lang.String str2, boolean z) {
        return getSaveFile(getSavePath(str) + java.io.File.separator + str2, z);
    }

    public static java.io.File getSaveFile(java.lang.String str, boolean z) {
        java.io.File file = new java.io.File(str);
        try {
            if (!file.exists() && z) {
                file.createNewFile();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static java.lang.String getSuffix(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || str.endsWith(".")) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".");
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1).toLowerCase(java.util.Locale.US) : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0097 -> B:23:0x009a). Please report as a decompilation issue!!! */
    public static void copyFromAssetsToSdcard(android.content.res.AssetManager assetManager, boolean z, java.lang.String str, java.lang.String str2) {
        java.io.FileOutputStream fileOutputStream;
        java.io.IOException e;
        java.io.FileNotFoundException e2;
        ?? exists = new java.io.File(str2).exists();
        if (exists == 0 || z) {
            try {
                try {
                    try {
                        assetManager = assetManager.open(str);
                    } catch (java.io.IOException e3) {
                        e3.printStackTrace();
                    }
                } catch (java.io.FileNotFoundException e4) {
                    fileOutputStream = null;
                    e2 = e4;
                    assetManager = 0;
                } catch (java.io.IOException e5) {
                    fileOutputStream = null;
                    e = e5;
                    assetManager = 0;
                } catch (java.lang.Throwable th) {
                    exists = 0;
                    th = th;
                    assetManager = 0;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            try {
                fileOutputStream = new java.io.FileOutputStream(str2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = assetManager.read(bArr, 0, 1024);
                        if (read < 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, read);
                        }
                    }
                    com.realsil.sdk.core.logger.ZLogger.v("source = " + str + ", dest = " + str2);
                    try {
                        fileOutputStream.close();
                    } catch (java.io.IOException e6) {
                        e6.printStackTrace();
                    }
                    assetManager.close();
                } catch (java.io.FileNotFoundException e7) {
                    e2 = e7;
                    e2.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    if (assetManager != 0) {
                        assetManager.close();
                    }
                } catch (java.io.IOException e9) {
                    e = e9;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (assetManager != 0) {
                        assetManager.close();
                    }
                }
            } catch (java.io.FileNotFoundException e11) {
                fileOutputStream = null;
                e2 = e11;
            } catch (java.io.IOException e12) {
                fileOutputStream = null;
                e = e12;
            } catch (java.lang.Throwable th3) {
                exists = 0;
                th = th3;
                if (exists != 0) {
                    try {
                        exists.close();
                    } catch (java.io.IOException e13) {
                        e13.printStackTrace();
                    }
                }
                if (assetManager != 0) {
                    try {
                        assetManager.close();
                        throw th;
                    } catch (java.io.IOException e14) {
                        e14.printStackTrace();
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    public static void copyFile(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }
}
