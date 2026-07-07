package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureFileUtils {
    private static final int BYTE_SIZE = 1024;
    private static final java.lang.String POSTFIX_AMR = ".amr";
    private static final java.lang.String POSTFIX_JPG = ".jpg";
    private static final java.lang.String POSTFIX_MP4 = ".mp4";
    static final java.lang.String TAG = "PictureFileUtils";

    public static java.io.File createCameraFile(android.content.Context context, int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return createMediaFile(context, i, str, str2, str3);
    }

    private static java.io.File createMediaFile(android.content.Context context, int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return createOutFile(context, i, str, str2, str3);
    }

    private static java.io.File createOutFile(android.content.Context context, int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.io.File file;
        java.io.File rootDirFile;
        android.content.Context applicationContext = context.getApplicationContext();
        if (android.text.TextUtils.isEmpty(str3)) {
            if (android.text.TextUtils.equals("mounted", android.os.Environment.getExternalStorageState())) {
                rootDirFile = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DCIM);
                file = new java.io.File(rootDirFile.getAbsolutePath() + java.io.File.separator + com.luck.picture.lib.config.PictureMimeType.CAMERA + java.io.File.separator);
            } else {
                rootDirFile = getRootDirFile(applicationContext, i);
                file = new java.io.File(rootDirFile.getAbsolutePath() + java.io.File.separator);
            }
            if (!rootDirFile.exists()) {
                rootDirFile.mkdirs();
            }
        } else {
            java.io.File file2 = new java.io.File(str3);
            java.io.File parentFile = file2.getParentFile();
            java.util.Objects.requireNonNull(parentFile);
            if (!parentFile.exists()) {
                file2.getParentFile().mkdirs();
            }
            file = file2;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        if (i == 2) {
            if (isEmpty) {
                str = com.luck.picture.lib.utils.DateUtils.getCreateFileName("VID_") + ".mp4";
            }
            return new java.io.File(file, str);
        }
        if (i == 3) {
            if (isEmpty) {
                str = com.luck.picture.lib.utils.DateUtils.getCreateFileName("AUD_") + ".amr";
            }
            return new java.io.File(file, str);
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = ".jpg";
        }
        if (isEmpty) {
            str = com.luck.picture.lib.utils.DateUtils.getCreateFileName("IMG_") + str2;
        }
        return new java.io.File(file, str);
    }

    private static java.io.File getRootDirFile(android.content.Context context, int i) {
        return new java.io.File(com.luck.picture.lib.utils.FileDirMap.getFileDirPath(context, i));
    }

    private PictureFileUtils() {
    }

    public static boolean isExternalStorageDocument(android.net.Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isDownloadsDocument(android.net.Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(android.net.Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean isGooglePhotosUri(android.net.Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static java.lang.String getDataColumn(android.content.Context context, android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new java.lang.String[]{"_data"}, str, strArr, null);
            } catch (java.lang.IllegalArgumentException e) {
                android.util.Log.i(TAG, java.lang.String.format(java.util.Locale.getDefault(), "getDataColumn: _data - [%s]", e.getMessage()));
                if (cursor == null) {
                    return "";
                }
            }
            if (cursor == null || !cursor.moveToFirst()) {
                if (cursor == null) {
                    return "";
                }
                cursor.close();
                return "";
            }
            java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
            if (cursor != null) {
                cursor.close();
            }
            return string;
        } catch (java.lang.Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static java.lang.String getPath(android.content.Context context, android.net.Uri uri) {
        android.content.Context applicationContext = context.getApplicationContext();
        android.net.Uri uri2 = null;
        if ((android.os.Build.VERSION.SDK_INT >= 19) && android.provider.DocumentsContract.isDocumentUri(applicationContext, uri)) {
            if (isExternalStorageDocument(uri)) {
                java.lang.String[] split = android.provider.DocumentsContract.getDocumentId(uri).split(":");
                if (!"primary".equalsIgnoreCase(split[0])) {
                    return "";
                }
                if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
                    return applicationContext.getExternalFilesDir(android.os.Environment.DIRECTORY_PICTURES) + "/" + split[1];
                }
                return android.os.Environment.getExternalStorageDirectory() + "/" + split[1];
            }
            if (isDownloadsDocument(uri)) {
                return getDataColumn(applicationContext, android.content.ContentUris.withAppendedId(android.net.Uri.parse("content://downloads/public_downloads"), com.luck.picture.lib.utils.ValueOf.toLong(android.provider.DocumentsContract.getDocumentId(uri))), null, null);
            }
            if (!isMediaDocument(uri)) {
                return "";
            }
            java.lang.String[] split2 = android.provider.DocumentsContract.getDocumentId(uri).split(":");
            java.lang.String str = split2[0];
            if (com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_IMAGE.equals(str)) {
                uri2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if (com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_VIDEO.equals(str)) {
                uri2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if (com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO.equals(str)) {
                uri2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return getDataColumn(applicationContext, uri2, "_id=?", new java.lang.String[]{split2[1]});
        }
        if (!"content".equalsIgnoreCase(uri.getScheme())) {
            return "file".equalsIgnoreCase(uri.getScheme()) ? uri.getPath() : "";
        }
        if (isGooglePhotosUri(uri)) {
            return uri.getLastPathSegment();
        }
        return getDataColumn(applicationContext, uri, null, null);
    }

    public static void copyFile(java.lang.String str, java.lang.String str2) {
        java.nio.channels.FileChannel fileChannel;
        java.nio.channels.FileChannel channel;
        if (str.equalsIgnoreCase(str2)) {
            return;
        }
        java.nio.channels.FileChannel fileChannel2 = null;
        try {
            channel = new java.io.FileInputStream(str).getChannel();
        } catch (java.lang.Exception e) {
            e = e;
            fileChannel = null;
        } catch (java.lang.Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            fileChannel2 = new java.io.FileOutputStream(str2).getChannel();
            channel.transferTo(0L, channel.size(), fileChannel2);
            close(channel);
            close(fileChannel2);
        } catch (java.lang.Exception e2) {
            e = e2;
            java.nio.channels.FileChannel fileChannel3 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel3;
            try {
                e.printStackTrace();
                close(fileChannel2);
                close(fileChannel);
            } catch (java.lang.Throwable th2) {
                th = th2;
                close(fileChannel2);
                close(fileChannel);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            java.nio.channels.FileChannel fileChannel4 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel4;
            close(fileChannel2);
            close(fileChannel);
            throw th;
        }
    }

    public static boolean writeFileFromIS(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        java.io.BufferedOutputStream bufferedOutputStream;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new java.io.BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new java.io.BufferedOutputStream(outputStream);
            } catch (java.lang.Exception e) {
                e = e;
                bufferedOutputStream = null;
            } catch (java.lang.Throwable th) {
                th = th;
                bufferedOutputStream = null;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            bufferedOutputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    close(bufferedInputStream);
                    close(bufferedOutputStream);
                    return true;
                }
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            bufferedInputStream2 = bufferedInputStream;
            try {
                e.printStackTrace();
                close(bufferedInputStream2);
                close(bufferedOutputStream);
                return false;
            } catch (java.lang.Throwable th3) {
                th = th3;
                close(bufferedInputStream2);
                close(bufferedOutputStream);
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            bufferedInputStream2 = bufferedInputStream;
            close(bufferedInputStream2);
            close(bufferedOutputStream);
            throw th;
        }
    }

    public static java.lang.String getVideoThumbnailDir(android.content.Context context) {
        java.io.File file = new java.io.File(context.getExternalFilesDir("").getAbsolutePath(), "VideoThumbnail");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + java.io.File.separator;
    }

    @java.lang.Deprecated
    public static void deleteCacheDirFile(android.content.Context context, int i) {
        java.io.File[] listFiles;
        java.io.File externalFilesDir = context.getExternalFilesDir(i == com.luck.picture.lib.config.SelectMimeType.ofImage() ? android.os.Environment.DIRECTORY_PICTURES : android.os.Environment.DIRECTORY_MOVIES);
        if (externalFilesDir == null || (listFiles = externalFilesDir.listFiles()) == null) {
            return;
        }
        for (java.io.File file : listFiles) {
            if (file.isFile()) {
                file.delete();
            }
        }
    }

    @java.lang.Deprecated
    public static void deleteAllCacheDirFile(android.content.Context context) {
        java.io.File[] listFiles;
        java.io.File[] listFiles2;
        java.io.File[] listFiles3;
        java.io.File externalFilesDir = context.getExternalFilesDir(android.os.Environment.DIRECTORY_PICTURES);
        if (externalFilesDir != null && (listFiles3 = externalFilesDir.listFiles()) != null) {
            for (java.io.File file : listFiles3) {
                if (file.isFile()) {
                    file.delete();
                }
            }
        }
        java.io.File externalFilesDir2 = context.getExternalFilesDir(android.os.Environment.DIRECTORY_MOVIES);
        if (externalFilesDir2 != null && (listFiles2 = externalFilesDir2.listFiles()) != null) {
            for (java.io.File file2 : listFiles2) {
                if (file2.isFile()) {
                    file2.delete();
                }
            }
        }
        java.io.File externalFilesDir3 = context.getExternalFilesDir(android.os.Environment.DIRECTORY_MUSIC);
        if (externalFilesDir3 == null || (listFiles = externalFilesDir3.listFiles()) == null) {
            return;
        }
        for (java.io.File file3 : listFiles) {
            if (file3.isFile()) {
                file3.delete();
            }
        }
    }

    public static android.net.Uri parUri(android.content.Context context, java.io.File file) {
        java.lang.String str = context.getPackageName() + ".luckProvider";
        if (android.os.Build.VERSION.SDK_INT > 23) {
            return androidx.core.content.FileProvider.getUriForFile(context, str, file);
        }
        return android.net.Uri.fromFile(file);
    }

    public static java.lang.String createFilePath(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.io.File rootDirFile;
        java.lang.String str3;
        java.lang.String lastSourceSuffix = com.luck.picture.lib.config.PictureMimeType.getLastSourceSuffix(str);
        if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(str)) {
            rootDirFile = getRootDirFile(context, 2);
            str3 = "VID_";
        } else if (com.luck.picture.lib.config.PictureMimeType.isHasAudio(str)) {
            rootDirFile = getRootDirFile(context, 3);
            str3 = "AUD_";
        } else {
            rootDirFile = getRootDirFile(context, 1);
            str3 = "IMG_";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(rootDirFile.getPath());
        sb.append(java.io.File.separator);
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = com.luck.picture.lib.utils.DateUtils.getCreateFileName(str3) + lastSourceSuffix;
        }
        sb.append(str2);
        return sb.toString();
    }

    public static boolean isImageFileExists(java.lang.String str) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 2;
        android.graphics.BitmapFactory.decodeFile(str, options);
        return options.outWidth > 0 && options.outHeight > 0;
    }

    public static boolean isFileExists(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && new java.io.File(str).exists();
    }

    public static java.lang.String formatFileSize(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j < com.luck.picture.lib.config.FileSizeUnit.KB) {
            java.lang.Object format = java.lang.String.format("%.2f", java.lang.Double.valueOf(j));
            double d = com.luck.picture.lib.utils.ValueOf.toDouble(format);
            long round = java.lang.Math.round(d);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (round - d == 0.0d) {
                format = java.lang.Long.valueOf(round);
            }
            sb.append(format);
            sb.append("B");
            return sb.toString();
        }
        if (j < com.luck.picture.lib.config.FileSizeUnit.MB) {
            java.lang.Object format2 = java.lang.String.format("%.2f", java.lang.Double.valueOf(j / 1024.0d));
            double d2 = com.luck.picture.lib.utils.ValueOf.toDouble(format2);
            long round2 = java.lang.Math.round(d2);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            if (round2 - d2 == 0.0d) {
                format2 = java.lang.Long.valueOf(round2);
            }
            sb2.append(format2);
            sb2.append("KB");
            return sb2.toString();
        }
        if (j < com.luck.picture.lib.config.FileSizeUnit.GB) {
            java.lang.Object format3 = java.lang.String.format("%.2f", java.lang.Double.valueOf(j / 1048576.0d));
            double d3 = com.luck.picture.lib.utils.ValueOf.toDouble(format3);
            long round3 = java.lang.Math.round(d3);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            if (round3 - d3 == 0.0d) {
                format3 = java.lang.Long.valueOf(round3);
            }
            sb3.append(format3);
            sb3.append("MB");
            return sb3.toString();
        }
        java.lang.Object format4 = java.lang.String.format("%.2f", java.lang.Double.valueOf(j / 1.073741824E9d));
        double d4 = com.luck.picture.lib.utils.ValueOf.toDouble(format4);
        long round4 = java.lang.Math.round(d4);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        if (round4 - d4 == 0.0d) {
            format4 = java.lang.Long.valueOf(round4);
        }
        sb4.append(format4);
        sb4.append("GB");
        return sb4.toString();
    }

    public static java.lang.String formatAccurateUnitFileSize(long j) {
        double d;
        java.lang.String str;
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j < 1000) {
            d = j;
            str = "";
        } else if (j < 1000000) {
            d = j / 1000.0d;
            str = "KB";
        } else if (j < 1000000000) {
            d = j / 1000000.0d;
            str = "MB";
        } else {
            d = j / 1.0E9d;
            str = "GB";
        }
        java.lang.Object format = java.lang.String.format(new java.util.Locale("zh"), "%.2f", java.lang.Double.valueOf(d));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (java.lang.Math.round(com.luck.picture.lib.utils.ValueOf.toDouble(format)) - com.luck.picture.lib.utils.ValueOf.toDouble(format) == 0.0d) {
            format = java.lang.Long.valueOf(java.lang.Math.round(com.luck.picture.lib.utils.ValueOf.toDouble(format)));
        }
        sb.append(format);
        sb.append(str);
        return sb.toString();
    }

    public static void close(java.io.Closeable closeable) {
        if (closeable instanceof java.io.Closeable) {
            try {
                closeable.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
