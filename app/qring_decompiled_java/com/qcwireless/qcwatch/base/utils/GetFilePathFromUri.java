package com.qcwireless.qcwatch.base.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class GetFilePathFromUri {
    public static java.lang.String getFileAbsolutePath(android.content.Context context, android.net.Uri imageUri) {
        android.net.Uri uri = null;
        if (context != null && imageUri != null) {
            if (android.os.Build.VERSION.SDK_INT < 19) {
                return getRealFilePath(context, imageUri);
            }
            if (android.os.Build.VERSION.SDK_INT >= 19 && android.os.Build.VERSION.SDK_INT < 29 && android.provider.DocumentsContract.isDocumentUri(context, imageUri)) {
                if (isExternalStorageDocument(imageUri)) {
                    java.lang.String[] split = android.provider.DocumentsContract.getDocumentId(imageUri).split(":");
                    if ("primary".equalsIgnoreCase(split[0])) {
                        return android.os.Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                } else {
                    if (isDownloadsDocument(imageUri)) {
                        return getDataColumn(context, android.content.ContentUris.withAppendedId(android.net.Uri.parse("content://downloads/public_downloads"), java.lang.Long.valueOf(android.provider.DocumentsContract.getDocumentId(imageUri)).longValue()), null, null);
                    }
                    if (isMediaDocument(imageUri)) {
                        java.lang.String[] split2 = android.provider.DocumentsContract.getDocumentId(imageUri).split(":");
                        java.lang.String str = split2[0];
                        if (com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_IMAGE.equals(str)) {
                            uri = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        } else if (com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_VIDEO.equals(str)) {
                            uri = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        } else if (com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO.equals(str)) {
                            uri = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        }
                        return getDataColumn(context, uri, "_id=?", new java.lang.String[]{split2[1]});
                    }
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                return uriToFileApiQ(context, imageUri);
            }
            if ("content".equalsIgnoreCase(imageUri.getScheme())) {
                if (isGooglePhotosUri(imageUri)) {
                    return imageUri.getLastPathSegment();
                }
                if (android.os.Build.VERSION.SDK_INT >= 24) {
                    return getFilePathFromUri(context, imageUri);
                }
                return getDataColumn(context, imageUri, null, null);
            }
            if ("file".equalsIgnoreCase(imageUri.getScheme())) {
                return imageUri.getPath();
            }
        }
        return null;
    }

    private static java.lang.String getRealFilePath(final android.content.Context context, final android.net.Uri uri) {
        int columnIndex;
        java.lang.String str = null;
        if (uri == null) {
            return null;
        }
        java.lang.String scheme = uri.getScheme();
        if (scheme == null) {
            return uri.getPath();
        }
        if ("file".equals(scheme)) {
            return uri.getPath();
        }
        if (!"content".equals(scheme)) {
            return null;
        }
        android.database.Cursor query = context.getContentResolver().query(uri, new java.lang.String[]{"_data"}, null, null, null);
        if (query == null) {
            return null;
        }
        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) > -1) {
            str = query.getString(columnIndex);
        }
        query.close();
        return str;
    }

    private static boolean isExternalStorageDocument(android.net.Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isDownloadsDocument(android.net.Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static java.lang.String getDataColumn(android.content.Context context, android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) {
        android.database.Cursor cursor = null;
        try {
            android.database.Cursor query = context.getContentResolver().query(uri, new java.lang.String[]{"_data"}, selection, selectionArgs, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        java.lang.String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        if (query != null) {
                            query.close();
                        }
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

    private static boolean isMediaDocument(android.net.Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    private static boolean isGooglePhotosUri(android.net.Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    private static java.lang.String getFileFromContentUri(android.content.Context context, android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        java.lang.String[] strArr = {"_data", "_display_name"};
        android.database.Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
        if (query == null) {
            return "";
        }
        query.moveToFirst();
        try {
            return query.getString(query.getColumnIndex(strArr[0]));
        } catch (java.lang.Exception unused) {
            return "";
        } finally {
            query.close();
        }
    }

    private static java.lang.String uriToFileApiQ(android.content.Context context, android.net.Uri uri) {
        java.io.InputStream openInputStream;
        java.io.File file;
        java.io.FileOutputStream fileOutputStream;
        java.io.File file2 = null;
        if (uri.getScheme().equals("file")) {
            file2 = new java.io.File(uri.getPath());
        } else if (uri.getScheme().equals("content")) {
            android.content.ContentResolver contentResolver = context.getContentResolver();
            android.database.Cursor query = contentResolver.query(uri, null, null, null, null);
            if (query.moveToFirst()) {
                java.lang.String string = query.getString(query.getColumnIndex("_display_name"));
                try {
                    openInputStream = contentResolver.openInputStream(uri);
                    java.io.File file3 = new java.io.File(context.getExternalCacheDir().getAbsolutePath() + "/" + java.lang.System.currentTimeMillis());
                    if (!file3.exists()) {
                        file3.mkdir();
                    }
                    file = new java.io.File(file3.getPath(), string);
                    fileOutputStream = new java.io.FileOutputStream(file);
                    android.os.FileUtils.copy(openInputStream, fileOutputStream);
                } catch (java.io.IOException e) {
                    e = e;
                }
                try {
                    fileOutputStream.close();
                    openInputStream.close();
                    file2 = file;
                } catch (java.io.IOException e2) {
                    file2 = file;
                    e = e2;
                    e.printStackTrace();
                    return file2.getAbsolutePath();
                }
            }
        }
        return file2.getAbsolutePath();
    }

    private static java.lang.String getFilePathFromUri(android.content.Context context, android.net.Uri uri) {
        java.lang.String realFilePath = getRealFilePath(context, uri);
        if (!android.text.TextUtils.isEmpty(realFilePath)) {
            return realFilePath;
        }
        java.io.File filesDir = context.getApplicationContext().getFilesDir();
        java.lang.String fileName = getFileName(uri);
        if (android.text.TextUtils.isEmpty(fileName)) {
            return null;
        }
        java.io.File file = new java.io.File(filesDir + java.io.File.separator + fileName);
        copyFile(context, uri, file);
        return file.getAbsolutePath();
    }

    private static java.lang.String getFileName(android.net.Uri uri) {
        java.lang.String path;
        int lastIndexOf;
        if (uri == null || (lastIndexOf = (path = uri.getPath()).lastIndexOf(47)) == -1) {
            return null;
        }
        return path.substring(lastIndexOf + 1);
    }

    private static void copyFile(android.content.Context context, android.net.Uri srcUri, java.io.File dstFile) {
        try {
            java.io.InputStream openInputStream = context.getContentResolver().openInputStream(srcUri);
            if (openInputStream == null) {
                return;
            }
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(dstFile);
            copyStream(openInputStream, fileOutputStream);
            openInputStream.close();
            fileOutputStream.close();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private static int copyStream(java.io.InputStream input, java.io.OutputStream output) {
        byte[] bArr = new byte[com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.GAMING_MODE_EQ];
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(input, com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.GAMING_MODE_EQ);
        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(output, com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.GAMING_MODE_EQ);
        int i = 0;
        while (true) {
            try {
                int read = bufferedInputStream.read(bArr, 0, com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.GAMING_MODE_EQ);
                if (read == -1) {
                    break;
                }
                bufferedOutputStream.write(bArr, 0, read);
                i += read;
            } catch (java.lang.Exception unused) {
            } catch (java.lang.Throwable th) {
                try {
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                } catch (java.lang.Exception unused2) {
                }
                throw th;
            }
        }
        bufferedOutputStream.flush();
        try {
            bufferedOutputStream.close();
            bufferedInputStream.close();
        } catch (java.lang.Exception unused3) {
        }
        return i;
    }
}
