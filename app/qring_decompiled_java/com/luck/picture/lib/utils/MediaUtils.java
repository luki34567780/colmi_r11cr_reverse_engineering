package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class MediaUtils {
    public static final java.lang.String QUERY_ARG_SQL_LIMIT = "android:query-arg-sql-limit";

    public static boolean isLongImage(int i, int i2) {
        return i > 0 && i2 > 0 && i2 > i * 3;
    }

    public static java.lang.String getRealPathUri(long j, java.lang.String str) {
        android.net.Uri contentUri;
        if (com.luck.picture.lib.config.PictureMimeType.isHasImage(str)) {
            contentUri = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(str)) {
            contentUri = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else if (com.luck.picture.lib.config.PictureMimeType.isHasAudio(str)) {
            contentUri = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentUri = android.provider.MediaStore.Files.getContentUri("external");
        }
        return android.content.ContentUris.withAppendedId(contentUri, j).toString();
    }

    public static java.lang.String getMimeTypeFromMediaUrl(java.lang.String str) {
        java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(android.webkit.MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase());
        if (android.text.TextUtils.isEmpty(mimeTypeFromExtension)) {
            mimeTypeFromExtension = getMimeType(new java.io.File(str));
        }
        return android.text.TextUtils.isEmpty(mimeTypeFromExtension) ? "image/jpeg" : mimeTypeFromExtension;
    }

    public static java.lang.String getMimeTypeFromMediaHttpUrl(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.toLowerCase().endsWith(com.luck.picture.lib.config.PictureMimeType.JPG) || str.toLowerCase().endsWith(com.luck.picture.lib.config.PictureMimeType.JPEG)) {
            return "image/jpeg";
        }
        if (str.toLowerCase().endsWith(com.luck.picture.lib.config.PictureMimeType.PNG)) {
            return com.luck.picture.lib.config.PictureMimeType.PNG_Q;
        }
        if (str.toLowerCase().endsWith(com.luck.picture.lib.config.PictureMimeType.GIF)) {
            return "image/gif";
        }
        if (str.toLowerCase().endsWith(com.luck.picture.lib.config.PictureMimeType.WEBP)) {
            return "image/webp";
        }
        if (str.toLowerCase().endsWith(com.luck.picture.lib.config.PictureMimeType.BMP)) {
            return "image/bmp";
        }
        if (str.toLowerCase().endsWith(com.luck.picture.lib.config.PictureMimeType.MP4)) {
            return "video/mp4";
        }
        if (str.toLowerCase().endsWith(com.luck.picture.lib.config.PictureMimeType.AVI)) {
            return com.luck.picture.lib.config.PictureMimeType.AVI_Q;
        }
        if (str.toLowerCase().endsWith(com.luck.picture.lib.config.PictureMimeType.MP3)) {
            return "audio/mpeg";
        }
        if (str.toLowerCase().endsWith(com.luck.picture.lib.config.PictureMimeType.AMR)) {
            return "audio/amr";
        }
        if (str.toLowerCase().endsWith(".m4a")) {
            return "audio/mpeg";
        }
        return null;
    }

    private static java.lang.String getMimeType(java.io.File file) {
        return java.net.URLConnection.getFileNameMap().getContentTypeFor(file.getName());
    }

    public static java.lang.String generateCameraFolderName(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        return file.getParentFile() != null ? file.getParentFile().getName() : com.luck.picture.lib.config.PictureMimeType.CAMERA;
    }

    @java.lang.Deprecated
    public static com.luck.picture.lib.entity.MediaExtraInfo getImageSize(java.lang.String str) {
        android.graphics.BitmapFactory.Options options;
        java.io.InputStream fileInputStream;
        com.luck.picture.lib.entity.MediaExtraInfo mediaExtraInfo = new com.luck.picture.lib.entity.MediaExtraInfo();
        java.io.InputStream inputStream = null;
        try {
            try {
                options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if (com.luck.picture.lib.config.PictureMimeType.isContent(str)) {
                    fileInputStream = com.luck.picture.lib.basic.PictureContentResolver.openInputStream(com.luck.picture.lib.app.PictureAppMaster.getInstance().getAppContext(), android.net.Uri.parse(str));
                } else {
                    fileInputStream = new java.io.FileInputStream(str);
                }
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            android.graphics.BitmapFactory.decodeStream(fileInputStream, null, options);
            mediaExtraInfo.setWidth(options.outWidth);
            mediaExtraInfo.setHeight(options.outHeight);
            com.luck.picture.lib.utils.PictureFileUtils.close(fileInputStream);
        } catch (java.lang.Exception e2) {
            inputStream = fileInputStream;
            e = e2;
            e.printStackTrace();
            com.luck.picture.lib.utils.PictureFileUtils.close(inputStream);
            return mediaExtraInfo;
        } catch (java.lang.Throwable th2) {
            inputStream = fileInputStream;
            th = th2;
            com.luck.picture.lib.utils.PictureFileUtils.close(inputStream);
            throw th;
        }
        return mediaExtraInfo;
    }

    public static com.luck.picture.lib.entity.MediaExtraInfo getImageSize(android.content.Context context, java.lang.String str) {
        android.graphics.BitmapFactory.Options options;
        java.io.InputStream fileInputStream;
        com.luck.picture.lib.entity.MediaExtraInfo mediaExtraInfo = new com.luck.picture.lib.entity.MediaExtraInfo();
        if (com.luck.picture.lib.config.PictureMimeType.isHasHttp(str)) {
            return mediaExtraInfo;
        }
        java.io.InputStream inputStream = null;
        try {
            try {
                options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if (com.luck.picture.lib.config.PictureMimeType.isContent(str)) {
                    fileInputStream = com.luck.picture.lib.basic.PictureContentResolver.openInputStream(context, android.net.Uri.parse(str));
                } else {
                    fileInputStream = new java.io.FileInputStream(str);
                }
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            android.graphics.BitmapFactory.decodeStream(fileInputStream, null, options);
            mediaExtraInfo.setWidth(options.outWidth);
            mediaExtraInfo.setHeight(options.outHeight);
            com.luck.picture.lib.utils.PictureFileUtils.close(fileInputStream);
        } catch (java.lang.Exception e2) {
            inputStream = fileInputStream;
            e = e2;
            e.printStackTrace();
            com.luck.picture.lib.utils.PictureFileUtils.close(inputStream);
            return mediaExtraInfo;
        } catch (java.lang.Throwable th2) {
            inputStream = fileInputStream;
            th = th2;
            com.luck.picture.lib.utils.PictureFileUtils.close(inputStream);
            throw th;
        }
        return mediaExtraInfo;
    }

    public static void getImageSize(final android.content.Context context, final java.lang.String str, final com.luck.picture.lib.interfaces.OnCallbackListener<com.luck.picture.lib.entity.MediaExtraInfo> onCallbackListener) {
        com.luck.picture.lib.thread.PictureThreadUtils.executeByIo(new com.luck.picture.lib.thread.PictureThreadUtils.SimpleTask<com.luck.picture.lib.entity.MediaExtraInfo>() { // from class: com.luck.picture.lib.utils.MediaUtils.1
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public com.luck.picture.lib.entity.MediaExtraInfo doInBackground() {
                return com.luck.picture.lib.utils.MediaUtils.getImageSize(context, str);
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(com.luck.picture.lib.entity.MediaExtraInfo mediaExtraInfo) {
                com.luck.picture.lib.thread.PictureThreadUtils.cancel(this);
                com.luck.picture.lib.interfaces.OnCallbackListener onCallbackListener2 = onCallbackListener;
                if (onCallbackListener2 != null) {
                    onCallbackListener2.onCall(mediaExtraInfo);
                }
            }
        });
    }

    public static void getVideoSize(final android.content.Context context, final java.lang.String str, final com.luck.picture.lib.interfaces.OnCallbackListener<com.luck.picture.lib.entity.MediaExtraInfo> onCallbackListener) {
        com.luck.picture.lib.thread.PictureThreadUtils.executeByIo(new com.luck.picture.lib.thread.PictureThreadUtils.SimpleTask<com.luck.picture.lib.entity.MediaExtraInfo>() { // from class: com.luck.picture.lib.utils.MediaUtils.2
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public com.luck.picture.lib.entity.MediaExtraInfo doInBackground() {
                return com.luck.picture.lib.utils.MediaUtils.getVideoSize(context, str);
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(com.luck.picture.lib.entity.MediaExtraInfo mediaExtraInfo) {
                com.luck.picture.lib.thread.PictureThreadUtils.cancel(this);
                com.luck.picture.lib.interfaces.OnCallbackListener onCallbackListener2 = onCallbackListener;
                if (onCallbackListener2 != null) {
                    onCallbackListener2.onCall(mediaExtraInfo);
                }
            }
        });
    }

    public static com.luck.picture.lib.entity.MediaExtraInfo getVideoSize(android.content.Context context, java.lang.String str) {
        java.lang.String extractMetadata;
        int i;
        int i2;
        com.luck.picture.lib.entity.MediaExtraInfo mediaExtraInfo = new com.luck.picture.lib.entity.MediaExtraInfo();
        if (com.luck.picture.lib.config.PictureMimeType.isHasHttp(str)) {
            return mediaExtraInfo;
        }
        android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
        try {
            try {
                try {
                    if (com.luck.picture.lib.config.PictureMimeType.isContent(str)) {
                        mediaMetadataRetriever.setDataSource(context, android.net.Uri.parse(str));
                    } else {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                    extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    mediaMetadataRetriever.release();
                }
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
            if (!android.text.TextUtils.equals("90", extractMetadata) && !android.text.TextUtils.equals("270", extractMetadata)) {
                i2 = com.luck.picture.lib.utils.ValueOf.toInt(mediaMetadataRetriever.extractMetadata(18));
                i = com.luck.picture.lib.utils.ValueOf.toInt(mediaMetadataRetriever.extractMetadata(19));
                mediaExtraInfo.setWidth(i2);
                mediaExtraInfo.setHeight(i);
                mediaExtraInfo.setOrientation(extractMetadata);
                mediaExtraInfo.setDuration(com.luck.picture.lib.utils.ValueOf.toLong(mediaMetadataRetriever.extractMetadata(9)));
                mediaMetadataRetriever.release();
                return mediaExtraInfo;
            }
            int i3 = com.luck.picture.lib.utils.ValueOf.toInt(mediaMetadataRetriever.extractMetadata(18));
            i = i3;
            i2 = com.luck.picture.lib.utils.ValueOf.toInt(mediaMetadataRetriever.extractMetadata(19));
            mediaExtraInfo.setWidth(i2);
            mediaExtraInfo.setHeight(i);
            mediaExtraInfo.setOrientation(extractMetadata);
            mediaExtraInfo.setDuration(com.luck.picture.lib.utils.ValueOf.toLong(mediaMetadataRetriever.extractMetadata(9)));
            mediaMetadataRetriever.release();
            return mediaExtraInfo;
        } catch (java.lang.Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (java.lang.Exception e3) {
                e3.printStackTrace();
            }
            throw th;
        }
    }

    public static com.luck.picture.lib.entity.MediaExtraInfo getAudioSize(android.content.Context context, java.lang.String str) {
        com.luck.picture.lib.entity.MediaExtraInfo mediaExtraInfo = new com.luck.picture.lib.entity.MediaExtraInfo();
        if (com.luck.picture.lib.config.PictureMimeType.isHasHttp(str)) {
            return mediaExtraInfo;
        }
        android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
        try {
            try {
                try {
                    if (com.luck.picture.lib.config.PictureMimeType.isContent(str)) {
                        mediaMetadataRetriever.setDataSource(context, android.net.Uri.parse(str));
                    } else {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                    mediaExtraInfo.setDuration(com.luck.picture.lib.utils.ValueOf.toLong(mediaMetadataRetriever.extractMetadata(9)));
                    mediaMetadataRetriever.release();
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
                mediaMetadataRetriever.release();
            }
            return mediaExtraInfo;
        } catch (java.lang.Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (java.lang.Exception e3) {
                e3.printStackTrace();
            }
            throw th;
        }
    }

    public static void removeMedia(android.content.Context context, int i) {
        try {
            context.getApplicationContext().getContentResolver().delete(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new java.lang.String[]{java.lang.Long.toString(i)});
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static int getDCIMLastImageId(android.content.Context context, java.lang.String str) {
        android.database.Cursor query;
        android.database.Cursor cursor = null;
        try {
            try {
                java.lang.String[] strArr = {"%" + str + "%"};
                if (com.luck.picture.lib.utils.SdkVersionUtils.isR()) {
                    query = context.getApplicationContext().getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, createQueryArgsBundle("_data like ?", strArr, 1, 0, "_id DESC"), null);
                } else {
                    query = context.getApplicationContext().getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, "_data like ?", strArr, "_id DESC limit 1 offset 0");
                }
                cursor = query;
                if (cursor == null || cursor.getCount() <= 0 || !cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1;
                }
                int i = com.luck.picture.lib.utils.DateUtils.dateDiffer(cursor.getLong(cursor.getColumnIndex("date_added"))) <= 1 ? cursor.getInt(cursor.getColumnIndex("_id")) : -1;
                if (cursor != null) {
                    cursor.close();
                }
                return i;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
        } catch (java.lang.Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if (r2 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Long[] getPathMediaBucketId(android.content.Context r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "%"
            r1 = 2
            java.lang.Long[] r1 = new java.lang.Long[r1]
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            r4 = 1
            r1[r4] = r2
            r2 = 0
            java.lang.String r8 = "_data like ?"
            java.lang.String[] r9 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r5.<init>()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r5.append(r0)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r5.append(r12)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r5.append(r0)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.String r12 = r5.toString()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r9[r3] = r12     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            boolean r12 = com.luck.picture.lib.utils.SdkVersionUtils.isR()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.String r0 = "external"
            if (r12 == 0) goto L45
            java.lang.String r12 = "_id DESC"
            android.os.Bundle r12 = createQueryArgsBundle(r8, r9, r4, r3, r12)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            android.net.Uri r0 = android.provider.MediaStore.Files.getContentUri(r0)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            android.database.Cursor r11 = r11.query(r0, r2, r12, r2)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            goto L54
        L45:
            java.lang.String r10 = "_id DESC limit 1 offset 0"
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            android.net.Uri r6 = android.provider.MediaStore.Files.getContentUri(r0)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r7 = 0
            android.database.Cursor r11 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
        L54:
            r2 = r11
            if (r2 == 0) goto L83
            int r11 = r2.getCount()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            if (r11 <= 0) goto L83
            boolean r11 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            if (r11 == 0) goto L83
            java.lang.String r11 = "_id"
            int r11 = r2.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            long r11 = r2.getLong(r11)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r1[r3] = r11     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.String r11 = "bucket_id"
            int r11 = r2.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            long r11 = r2.getLong(r11)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            r1[r4] = r11     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
        L83:
            if (r2 == 0) goto L91
            goto L8e
        L86:
            r11 = move-exception
            goto L92
        L88:
            r11 = move-exception
            r11.printStackTrace()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L91
        L8e:
            r2.close()
        L91:
            return r1
        L92:
            if (r2 == 0) goto L97
            r2.close()
        L97:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.utils.MediaUtils.getPathMediaBucketId(android.content.Context, java.lang.String):java.lang.Long[]");
    }

    public static android.os.Bundle createQueryArgsBundle(java.lang.String str, java.lang.String[] strArr, int i, int i2, java.lang.String str2) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            bundle.putString("android:query-arg-sql-selection", str);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
            bundle.putString("android:query-arg-sql-sort-order", str2);
            if (com.luck.picture.lib.utils.SdkVersionUtils.isR()) {
                bundle.putString(QUERY_ARG_SQL_LIMIT, i + " offset " + i2);
            }
        }
        return bundle;
    }

    public static void getAsyncVideoThumbnail(final android.content.Context context, final java.lang.String str, final com.luck.picture.lib.interfaces.OnCallbackListener<com.luck.picture.lib.entity.MediaExtraInfo> onCallbackListener) {
        com.luck.picture.lib.thread.PictureThreadUtils.executeByIo(new com.luck.picture.lib.thread.PictureThreadUtils.SimpleTask<com.luck.picture.lib.entity.MediaExtraInfo>() { // from class: com.luck.picture.lib.utils.MediaUtils.3
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public com.luck.picture.lib.entity.MediaExtraInfo doInBackground() {
                return com.luck.picture.lib.utils.MediaUtils.getVideoThumbnail(context, str);
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(com.luck.picture.lib.entity.MediaExtraInfo mediaExtraInfo) {
                com.luck.picture.lib.thread.PictureThreadUtils.cancel(this);
                com.luck.picture.lib.interfaces.OnCallbackListener onCallbackListener2 = onCallbackListener;
                if (onCallbackListener2 != null) {
                    onCallbackListener2.onCall(mediaExtraInfo);
                }
            }
        });
    }

    public static com.luck.picture.lib.entity.MediaExtraInfo getVideoThumbnail(android.content.Context context, java.lang.String str) {
        java.io.FileOutputStream fileOutputStream;
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap frameAtTime;
        java.io.FileOutputStream fileOutputStream2;
        com.luck.picture.lib.entity.MediaExtraInfo mediaExtraInfo = new com.luck.picture.lib.entity.MediaExtraInfo();
        java.io.ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
            if (com.luck.picture.lib.config.PictureMimeType.isContent(str)) {
                mediaMetadataRetriever.setDataSource(context, android.net.Uri.parse(str));
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        } catch (java.io.IOException e) {
            e = e;
            fileOutputStream = null;
            bitmap = null;
        } catch (java.lang.Throwable th) {
            th = th;
            fileOutputStream = null;
            bitmap = null;
        }
        if (frameAtTime != null) {
            try {
            } catch (java.io.IOException e2) {
                e = e2;
                bitmap = frameAtTime;
                fileOutputStream = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                bitmap = frameAtTime;
                fileOutputStream = null;
            }
            if (!frameAtTime.isRecycled()) {
                java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                try {
                    frameAtTime.compress(android.graphics.Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream2);
                    java.io.File file = new java.io.File(com.luck.picture.lib.utils.PictureFileUtils.getVideoThumbnailDir(context), com.luck.picture.lib.utils.DateUtils.getCreateFileName("vid_") + "_thumb.jpg");
                    fileOutputStream2 = new java.io.FileOutputStream(file);
                    try {
                        fileOutputStream2.write(byteArrayOutputStream2.toByteArray());
                        fileOutputStream2.flush();
                        mediaExtraInfo.setVideoThumbnail(file.getAbsolutePath());
                        mediaExtraInfo.setWidth(frameAtTime.getWidth());
                        mediaExtraInfo.setHeight(frameAtTime.getHeight());
                        byteArrayOutputStream = byteArrayOutputStream2;
                        com.luck.picture.lib.utils.PictureFileUtils.close(byteArrayOutputStream);
                        com.luck.picture.lib.utils.PictureFileUtils.close(fileOutputStream2);
                        if (frameAtTime != null && !frameAtTime.isRecycled()) {
                            frameAtTime.recycle();
                        }
                    } catch (java.io.IOException e3) {
                        fileOutputStream = fileOutputStream2;
                        e = e3;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        bitmap = frameAtTime;
                        try {
                            e.printStackTrace();
                            com.luck.picture.lib.utils.PictureFileUtils.close(byteArrayOutputStream);
                            com.luck.picture.lib.utils.PictureFileUtils.close(fileOutputStream);
                            if (bitmap != null && !bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                            return mediaExtraInfo;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            com.luck.picture.lib.utils.PictureFileUtils.close(byteArrayOutputStream);
                            com.luck.picture.lib.utils.PictureFileUtils.close(fileOutputStream);
                            if (bitmap != null && !bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th4) {
                        byteArrayOutputStream = byteArrayOutputStream2;
                        bitmap = frameAtTime;
                        fileOutputStream = fileOutputStream2;
                        th = th4;
                        com.luck.picture.lib.utils.PictureFileUtils.close(byteArrayOutputStream);
                        com.luck.picture.lib.utils.PictureFileUtils.close(fileOutputStream);
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                } catch (java.io.IOException e4) {
                    e = e4;
                    bitmap = frameAtTime;
                    fileOutputStream = null;
                    byteArrayOutputStream = byteArrayOutputStream2;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    bitmap = frameAtTime;
                    fileOutputStream = null;
                    byteArrayOutputStream = byteArrayOutputStream2;
                }
                return mediaExtraInfo;
            }
        }
        fileOutputStream2 = null;
        com.luck.picture.lib.utils.PictureFileUtils.close(byteArrayOutputStream);
        com.luck.picture.lib.utils.PictureFileUtils.close(fileOutputStream2);
        if (frameAtTime != null) {
            frameAtTime.recycle();
        }
        return mediaExtraInfo;
    }

    public static void deleteUri(android.content.Context context, java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str) || !com.luck.picture.lib.config.PictureMimeType.isContent(str)) {
                return;
            }
            context.getContentResolver().delete(android.net.Uri.parse(str), null, null);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
