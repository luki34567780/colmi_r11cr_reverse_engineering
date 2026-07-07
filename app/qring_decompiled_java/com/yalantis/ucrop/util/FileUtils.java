package com.yalantis.ucrop.util;

/* loaded from: classes3.dex */
public class FileUtils {
    public static final java.lang.String GIF = ".gif";
    public static final java.lang.String JPEG = ".jpeg";
    private static final java.lang.String TAG = "FileUtils";
    public static final java.lang.String WEBP = ".webp";
    private static final java.text.SimpleDateFormat sf = new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS");

    private FileUtils() {
    }

    public static boolean isContent(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("content://");
    }

    public static android.net.Uri replaceOutputUri(android.content.Context context, boolean z, android.net.Uri uri, android.net.Uri uri2) {
        try {
            java.lang.String postfixDefaultEmpty = getPostfixDefaultEmpty(context, z, uri);
            if (android.text.TextUtils.isEmpty(postfixDefaultEmpty)) {
                return uri2;
            }
            java.lang.String uri3 = isContent(uri2.toString()) ? uri2.toString() : uri2.getPath();
            java.lang.String replace = uri3.replace(uri3.substring(uri3.lastIndexOf(".")), postfixDefaultEmpty);
            return isContent(replace) ? android.net.Uri.parse(replace) : android.net.Uri.fromFile(new java.io.File(replace));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return uri2;
        }
    }

    public static java.lang.String getPostfixDefaultJPEG(android.content.Context context, boolean z, android.net.Uri uri) {
        if (z) {
            java.lang.String mimeTypeFromMediaContentUri = getMimeTypeFromMediaContentUri(context, uri);
            if (isGif(mimeTypeFromMediaContentUri)) {
                return ".gif";
            }
            if (isWebp(mimeTypeFromMediaContentUri)) {
                return ".webp";
            }
        }
        return ".jpeg";
    }

    public static java.lang.String getPostfixDefaultEmpty(android.content.Context context, boolean z, android.net.Uri uri) {
        if (z) {
            java.lang.String mimeTypeFromMediaContentUri = getMimeTypeFromMediaContentUri(context, uri);
            if (isGif(mimeTypeFromMediaContentUri)) {
                return ".gif";
            }
            if (isWebp(mimeTypeFromMediaContentUri)) {
                return ".webp";
            }
        }
        return "";
    }

    public static java.lang.String getInputPath(android.net.Uri uri) {
        return (isContent(uri.toString()) || isHasHttp(uri.toString())) ? uri.toString() : uri.getPath();
    }

    public static boolean isUrlHasVideo(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && str.toLowerCase().endsWith(com.luck.picture.lib.config.PictureMimeType.MP4);
    }

    public static boolean isHasVideo(java.lang.String str) {
        return str != null && str.startsWith(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_VIDEO);
    }

    public static boolean isHasAudio(java.lang.String str) {
        return str != null && str.startsWith(com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO);
    }

    public static boolean isHasHttp(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http") || str.startsWith("https") || str.startsWith("/http") || str.startsWith("/https");
    }

    public static boolean isGif(java.lang.String str) {
        return str != null && (str.equals("image/gif") || str.equals("image/GIF"));
    }

    public static boolean isWebp(java.lang.String str) {
        return str != null && (str.equals(coil.util.Utils.MIME_TYPE_WEBP) || str.equals("image/WEBP"));
    }

    public static java.lang.String getMimeTypeFromMediaContentUri(android.content.Context context, android.net.Uri uri) {
        if (uri.getScheme().equals("content")) {
            return context.getContentResolver().getType(uri);
        }
        return android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(android.webkit.MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
    }

    public static java.lang.String getCreateFileName(java.lang.String str) {
        return str + sf.format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public static java.lang.String getCreateFileName() {
        return sf.format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r8 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if (r8 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getDataColumn(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L31 java.lang.IllegalArgumentException -> L33
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L31 java.lang.IllegalArgumentException -> L33
            if (r8 == 0) goto L2b
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.IllegalArgumentException -> L29 java.lang.Throwable -> L52
            if (r9 == 0) goto L2b
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L29 java.lang.Throwable -> L52
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.IllegalArgumentException -> L29 java.lang.Throwable -> L52
            if (r8 == 0) goto L28
            r8.close()
        L28:
            return r9
        L29:
            r9 = move-exception
            goto L35
        L2b:
            if (r8 == 0) goto L51
        L2d:
            r8.close()
            goto L51
        L31:
            r9 = move-exception
            goto L54
        L33:
            r9 = move-exception
            r8 = r7
        L35:
            java.lang.String r10 = "FileUtils"
            java.util.Locale r11 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "getDataColumn: _data - [%s]"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L52
            r2 = 0
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L52
            r1[r2] = r9     // Catch: java.lang.Throwable -> L52
            java.lang.String r9 = java.lang.String.format(r11, r0, r1)     // Catch: java.lang.Throwable -> L52
            android.util.Log.i(r10, r9)     // Catch: java.lang.Throwable -> L52
            if (r8 == 0) goto L51
            goto L2d
        L51:
            return r7
        L52:
            r9 = move-exception
            r7 = r8
        L54:
            if (r7 == 0) goto L59
            r7.close()
        L59:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.util.FileUtils.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static java.lang.String getPath(android.content.Context context, android.net.Uri uri) {
        android.net.Uri uri2 = null;
        if ((android.os.Build.VERSION.SDK_INT >= 19) && android.provider.DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                java.lang.String[] split = android.provider.DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return android.os.Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else if (isDownloadsDocument(uri)) {
                java.lang.String documentId = android.provider.DocumentsContract.getDocumentId(uri);
                if (!android.text.TextUtils.isEmpty(documentId)) {
                    try {
                        return getDataColumn(context, android.content.ContentUris.withAppendedId(android.net.Uri.parse("content://downloads/public_downloads"), java.lang.Long.valueOf(documentId).longValue()), null, null);
                    } catch (java.lang.NumberFormatException e) {
                        android.util.Log.i(TAG, e.getMessage());
                        return null;
                    }
                }
            } else if (isMediaDocument(uri)) {
                java.lang.String[] split2 = android.provider.DocumentsContract.getDocumentId(uri).split(":");
                java.lang.String str = split2[0];
                if (com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_IMAGE.equals(str)) {
                    uri2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if (com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_VIDEO.equals(str)) {
                    uri2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (com.luck.picture.lib.config.PictureMimeType.MIME_TYPE_PREFIX_AUDIO.equals(str)) {
                    uri2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return getDataColumn(context, uri2, "_id=?", new java.lang.String[]{split2[1]});
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (isGooglePhotosUri(uri)) {
                    return uri.getLastPathSegment();
                }
                return getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static void copyFile(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        java.nio.channels.FileChannel fileChannel;
        if (str.equalsIgnoreCase(str2)) {
            return;
        }
        java.nio.channels.FileChannel fileChannel2 = null;
        try {
            java.nio.channels.FileChannel channel = new java.io.FileInputStream(new java.io.File(str)).getChannel();
            try {
                fileChannel2 = new java.io.FileOutputStream(new java.io.File(str2)).getChannel();
                channel.transferTo(0L, channel.size(), fileChannel2);
                if (channel != null) {
                    channel.close();
                }
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
            } catch (java.lang.Throwable th) {
                th = th;
                java.nio.channels.FileChannel fileChannel3 = fileChannel2;
                fileChannel2 = channel;
                fileChannel = fileChannel3;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileChannel = null;
        }
    }

    public static void copyFile(android.content.Context context, android.net.Uri uri, android.net.Uri uri2) throws java.io.IOException {
        java.io.OutputStream outputStream;
        if (uri.equals(uri2)) {
            return;
        }
        java.io.InputStream inputStream = null;
        try {
            java.io.InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                java.io.OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri2);
                if ((openInputStream instanceof java.io.FileInputStream) && (openOutputStream instanceof java.io.FileOutputStream)) {
                    java.nio.channels.FileChannel channel = ((java.io.FileInputStream) openInputStream).getChannel();
                    channel.transferTo(0L, channel.size(), ((java.io.FileOutputStream) openOutputStream).getChannel());
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    if (openOutputStream != null) {
                        openOutputStream.close();
                        return;
                    }
                    return;
                }
                throw new java.lang.IllegalArgumentException("The input or output URI don't represent a file. uCrop requires then to represent files in order to work properly.");
            } catch (java.lang.Throwable th) {
                th = th;
                inputStream = openInputStream;
                outputStream = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            outputStream = null;
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
                    com.yalantis.ucrop.util.BitmapLoadUtils.close(bufferedInputStream);
                    com.yalantis.ucrop.util.BitmapLoadUtils.close(bufferedOutputStream);
                    return true;
                }
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            bufferedInputStream2 = bufferedInputStream;
            try {
                e.printStackTrace();
                com.yalantis.ucrop.util.BitmapLoadUtils.close(bufferedInputStream2);
                com.yalantis.ucrop.util.BitmapLoadUtils.close(bufferedOutputStream);
                return false;
            } catch (java.lang.Throwable th3) {
                th = th3;
                com.yalantis.ucrop.util.BitmapLoadUtils.close(bufferedInputStream2);
                com.yalantis.ucrop.util.BitmapLoadUtils.close(bufferedOutputStream);
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            bufferedInputStream2 = bufferedInputStream;
            com.yalantis.ucrop.util.BitmapLoadUtils.close(bufferedInputStream2);
            com.yalantis.ucrop.util.BitmapLoadUtils.close(bufferedOutputStream);
            throw th;
        }
    }
}
