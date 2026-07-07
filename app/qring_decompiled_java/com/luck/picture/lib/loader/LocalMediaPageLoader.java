package com.luck.picture.lib.loader;

/* loaded from: /tmp/dex/classes2.dex */
public final class LocalMediaPageLoader extends com.luck.picture.lib.loader.IBridgeMediaLoader {
    public LocalMediaPageLoader(android.content.Context context, com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        super(context, selectorConfig);
    }

    private java.lang.String getSelectionArgsForAllMediaCondition(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("media_type");
        sb.append("=?");
        sb.append(str3);
        sb.append(" OR ");
        sb.append("media_type");
        sb.append("=? AND ");
        sb.append(str);
        sb.append(") AND ");
        sb.append(str2);
        if (isWithAllQuery()) {
            return sb.toString();
        }
        sb.append(")");
        sb.append(" GROUP BY (bucket_id");
        return sb.toString();
    }

    private java.lang.String getSelectionArgsForImageMediaCondition(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (isWithAllQuery()) {
            sb.append("media_type");
            sb.append("=?");
            sb.append(str2);
            sb.append(" AND ");
            sb.append(str);
            return sb.toString();
        }
        sb.append("(");
        sb.append("media_type");
        sb.append("=?");
        sb.append(str2);
        sb.append(") AND ");
        sb.append(str);
        sb.append(")");
        sb.append(" GROUP BY (bucket_id");
        return sb.toString();
    }

    private java.lang.String getSelectionArgsForVideoMediaCondition(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (isWithAllQuery()) {
            sb.append("media_type");
            sb.append("=?");
            sb.append(str2);
            sb.append(" AND ");
            sb.append(str);
            return sb.toString();
        }
        sb.append("(");
        sb.append("media_type");
        sb.append("=?");
        sb.append(str2);
        sb.append(") AND ");
        sb.append(str);
        sb.append(")");
        sb.append(" GROUP BY (bucket_id");
        return sb.toString();
    }

    private java.lang.String getSelectionArgsForAudioMediaCondition(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (isWithAllQuery()) {
            sb.append("media_type");
            sb.append("=?");
            sb.append(str2);
            sb.append(" AND ");
            sb.append(str);
            return sb.toString();
        }
        sb.append("(");
        sb.append("media_type");
        sb.append("=?");
        sb.append(str2);
        sb.append(") AND ");
        sb.append(str);
        sb.append(")");
        sb.append(" GROUP BY (bucket_id");
        return sb.toString();
    }

    private static java.lang.String[] getSelectionArgsForPageSingleMediaType(int i, long j) {
        return j == -1 ? new java.lang.String[]{java.lang.String.valueOf(i)} : new java.lang.String[]{java.lang.String.valueOf(i), com.luck.picture.lib.utils.ValueOf.toString(java.lang.Long.valueOf(j))};
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public java.lang.String getAlbumFirstCover(long j) {
        android.database.Cursor cursor;
        android.database.Cursor query;
        android.database.Cursor cursor2 = null;
        try {
            if (com.luck.picture.lib.utils.SdkVersionUtils.isR()) {
                query = getContext().getContentResolver().query(QUERY_URI, new java.lang.String[]{"_id", "mime_type", "_data"}, com.luck.picture.lib.utils.MediaUtils.createQueryArgsBundle(getPageSelection(j), getPageSelectionArgs(j), 1, 0, getSortOrder()), null);
            } else {
                query = getContext().getContentResolver().query(QUERY_URI, new java.lang.String[]{"_id", "mime_type", "_data"}, getPageSelection(j), getPageSelectionArgs(j), getSortOrder() + " limit 1 offset 0");
            }
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        if (!query.moveToFirst()) {
                            if (query != null && !query.isClosed()) {
                                query.close();
                            }
                            return null;
                        }
                        java.lang.String realPathUri = com.luck.picture.lib.utils.SdkVersionUtils.isQ() ? com.luck.picture.lib.utils.MediaUtils.getRealPathUri(query.getLong(query.getColumnIndexOrThrow("_id")), query.getString(query.getColumnIndexOrThrow("mime_type"))) : query.getString(query.getColumnIndexOrThrow("_data"));
                        if (query != null && !query.isClosed()) {
                            query.close();
                        }
                        return realPathUri;
                    }
                } catch (java.lang.Exception e) {
                    cursor = query;
                    e = e;
                    try {
                        e.printStackTrace();
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return null;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null && !cursor2.isClosed()) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    cursor2 = query;
                    th = th2;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            if (query != null && !query.isClosed()) {
                query.close();
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            cursor = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        return null;
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadPageMediaData(final long j, final int i, final int i2, final com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia> onQueryDataResultListener) {
        com.luck.picture.lib.thread.PictureThreadUtils.executeByIo(new com.luck.picture.lib.thread.PictureThreadUtils.SimpleTask<com.luck.picture.lib.entity.MediaData>() { // from class: com.luck.picture.lib.loader.LocalMediaPageLoader.1
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public com.luck.picture.lib.entity.MediaData doInBackground() {
                java.lang.String str;
                java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> loadInAppSandboxFile;
                android.database.Cursor cursor = null;
                try {
                    try {
                        boolean z = true;
                        if (com.luck.picture.lib.utils.SdkVersionUtils.isR()) {
                            java.lang.String pageSelection = com.luck.picture.lib.loader.LocalMediaPageLoader.this.getPageSelection(j);
                            java.lang.String[] pageSelectionArgs = com.luck.picture.lib.loader.LocalMediaPageLoader.this.getPageSelectionArgs(j);
                            int i3 = i2;
                            cursor = com.luck.picture.lib.loader.LocalMediaPageLoader.this.getContext().getContentResolver().query(com.luck.picture.lib.loader.IBridgeMediaLoader.QUERY_URI, com.luck.picture.lib.loader.IBridgeMediaLoader.PROJECTION, com.luck.picture.lib.utils.MediaUtils.createQueryArgsBundle(pageSelection, pageSelectionArgs, i3, (i - 1) * i3, com.luck.picture.lib.loader.LocalMediaPageLoader.this.getSortOrder()), null);
                        } else {
                            if (i == -1) {
                                str = com.luck.picture.lib.loader.LocalMediaPageLoader.this.getSortOrder();
                            } else {
                                str = com.luck.picture.lib.loader.LocalMediaPageLoader.this.getSortOrder() + " limit " + i2 + " offset " + ((i - 1) * i2);
                            }
                            cursor = com.luck.picture.lib.loader.LocalMediaPageLoader.this.getContext().getContentResolver().query(com.luck.picture.lib.loader.IBridgeMediaLoader.QUERY_URI, com.luck.picture.lib.loader.IBridgeMediaLoader.PROJECTION, com.luck.picture.lib.loader.LocalMediaPageLoader.this.getPageSelection(j), com.luck.picture.lib.loader.LocalMediaPageLoader.this.getPageSelectionArgs(j), str);
                        }
                        if (cursor == null) {
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            return new com.luck.picture.lib.entity.MediaData();
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        if (cursor.getCount() > 0) {
                            cursor.moveToFirst();
                            do {
                                com.luck.picture.lib.entity.LocalMedia parseLocalMedia = com.luck.picture.lib.loader.LocalMediaPageLoader.this.parseLocalMedia(cursor, false);
                                if (parseLocalMedia != null) {
                                    arrayList.add(parseLocalMedia);
                                }
                            } while (cursor.moveToNext());
                        }
                        if (j == -1 && i == 1 && (loadInAppSandboxFile = com.luck.picture.lib.loader.SandboxFileLoader.loadInAppSandboxFile(com.luck.picture.lib.loader.LocalMediaPageLoader.this.getContext(), com.luck.picture.lib.loader.LocalMediaPageLoader.this.getConfig().sandboxDir)) != null) {
                            arrayList.addAll(loadInAppSandboxFile);
                            com.luck.picture.lib.utils.SortUtils.sortLocalMediaAddedTime(arrayList);
                        }
                        if (cursor.getCount() <= 0) {
                            z = false;
                        }
                        com.luck.picture.lib.entity.MediaData mediaData = new com.luck.picture.lib.entity.MediaData(z, arrayList);
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return mediaData;
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                        android.util.Log.i(com.luck.picture.lib.loader.IBridgeMediaLoader.TAG, "loadMedia Page Data Error: " + e.getMessage());
                        com.luck.picture.lib.entity.MediaData mediaData2 = new com.luck.picture.lib.entity.MediaData();
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return mediaData2;
                    }
                } catch (java.lang.Throwable th) {
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(com.luck.picture.lib.entity.MediaData mediaData) {
                com.luck.picture.lib.thread.PictureThreadUtils.cancel(this);
                com.luck.picture.lib.interfaces.OnQueryDataResultListener onQueryDataResultListener2 = onQueryDataResultListener;
                if (onQueryDataResultListener2 != null) {
                    onQueryDataResultListener2.onComplete(mediaData.data != null ? mediaData.data : new java.util.ArrayList<>(), mediaData.isHasNextMore);
                }
            }
        });
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadOnlyInAppDirAllMedia(final com.luck.picture.lib.interfaces.OnQueryAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder> onQueryAlbumListener) {
        com.luck.picture.lib.thread.PictureThreadUtils.executeByIo(new com.luck.picture.lib.thread.PictureThreadUtils.SimpleTask<com.luck.picture.lib.entity.LocalMediaFolder>() { // from class: com.luck.picture.lib.loader.LocalMediaPageLoader.2
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public com.luck.picture.lib.entity.LocalMediaFolder doInBackground() {
                return com.luck.picture.lib.loader.SandboxFileLoader.loadInAppSandboxFolderFile(com.luck.picture.lib.loader.LocalMediaPageLoader.this.getContext(), com.luck.picture.lib.loader.LocalMediaPageLoader.this.getConfig().sandboxDir);
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder) {
                com.luck.picture.lib.thread.PictureThreadUtils.cancel(this);
                com.luck.picture.lib.interfaces.OnQueryAlbumListener onQueryAlbumListener2 = onQueryAlbumListener;
                if (onQueryAlbumListener2 != null) {
                    onQueryAlbumListener2.onComplete(localMediaFolder);
                }
            }
        });
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadAllAlbum(final com.luck.picture.lib.interfaces.OnQueryAllAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder> onQueryAllAlbumListener) {
        com.luck.picture.lib.thread.PictureThreadUtils.executeByIo(new com.luck.picture.lib.thread.PictureThreadUtils.SimpleTask<java.util.List<com.luck.picture.lib.entity.LocalMediaFolder>>() { // from class: com.luck.picture.lib.loader.LocalMediaPageLoader.3
            /* JADX WARN: Code restructure failed: missing block: B:10:0x030e, code lost:
            
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:115:0x02f7, code lost:
            
                if (r2.isClosed() == false) goto L104;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x030c, code lost:
            
                if (r2.isClosed() == false) goto L104;
             */
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> doInBackground() {
                /*
                    Method dump skipped, instructions count: 791
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.loader.LocalMediaPageLoader.AnonymousClass3.doInBackground():java.util.List");
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
                com.luck.picture.lib.thread.PictureThreadUtils.cancel(this);
                com.luck.picture.lib.entity.LocalMedia.destroyPool();
                com.luck.picture.lib.interfaces.OnQueryAllAlbumListener onQueryAllAlbumListener2 = onQueryAllAlbumListener;
                if (onQueryAllAlbumListener2 != null) {
                    onQueryAllAlbumListener2.onComplete(list);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void synchronousFirstCover(java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
        for (int i = 0; i < list.size(); i++) {
            com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder = list.get(i);
            if (localMediaFolder != null) {
                java.lang.String albumFirstCover = getAlbumFirstCover(localMediaFolder.getBucketId());
                if (!android.text.TextUtils.isEmpty(albumFirstCover)) {
                    localMediaFolder.setFirstImagePath(albumFirstCover);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getFirstUri(android.database.Cursor cursor) {
        return com.luck.picture.lib.utils.MediaUtils.getRealPathUri(cursor.getLong(cursor.getColumnIndexOrThrow("_id")), cursor.getString(cursor.getColumnIndexOrThrow("mime_type")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getFirstCoverMimeType(android.database.Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getFirstUrl(android.database.Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("_data"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String getPageSelection(long j) {
        java.lang.String durationCondition = getDurationCondition();
        java.lang.String fileSizeCondition = getFileSizeCondition();
        java.lang.String queryMimeCondition = getQueryMimeCondition();
        int i = getConfig().chooseMode;
        if (i == 0) {
            return getPageSelectionArgsForAllMediaCondition(j, queryMimeCondition, durationCondition, fileSizeCondition);
        }
        if (i == 1) {
            return getPageSelectionArgsForImageMediaCondition(j, queryMimeCondition, fileSizeCondition);
        }
        if (i == 2) {
            return getPageSelectionArgsForVideoMediaCondition(j, queryMimeCondition, durationCondition, fileSizeCondition);
        }
        if (i != 3) {
            return null;
        }
        return getPageSelectionArgsForAudioMediaCondition(j, queryMimeCondition, durationCondition, fileSizeCondition);
    }

    private static java.lang.String getPageSelectionArgsForAllMediaCondition(long j, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("media_type");
        sb.append("=?");
        sb.append(str);
        sb.append(" OR ");
        sb.append("media_type");
        sb.append("=? AND ");
        sb.append(str2);
        sb.append(") AND ");
        if (j == -1) {
            sb.append(str3);
            return sb.toString();
        }
        sb.append("bucket_id");
        sb.append("=? AND ");
        sb.append(str3);
        return sb.toString();
    }

    private static java.lang.String getPageSelectionArgsForImageMediaCondition(long j, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("media_type");
        sb.append("=?");
        if (j == -1) {
            sb.append(str);
            sb.append(") AND ");
            sb.append(str2);
            return sb.toString();
        }
        sb.append(str);
        sb.append(") AND ");
        sb.append("bucket_id");
        sb.append("=? AND ");
        sb.append(str2);
        return sb.toString();
    }

    private static java.lang.String getPageSelectionArgsForVideoMediaCondition(long j, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("media_type");
        sb.append("=?");
        sb.append(str);
        sb.append(" AND ");
        sb.append(str2);
        sb.append(") AND ");
        if (j == -1) {
            sb.append(str3);
            return sb.toString();
        }
        sb.append("bucket_id");
        sb.append("=? AND ");
        sb.append(str3);
        return sb.toString();
    }

    private static java.lang.String getPageSelectionArgsForAudioMediaCondition(long j, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("media_type");
        sb.append("=?");
        sb.append(str);
        sb.append(" AND ");
        sb.append(str2);
        sb.append(") AND ");
        if (j == -1) {
            sb.append(str3);
            return sb.toString();
        }
        sb.append("bucket_id");
        sb.append("=? AND ");
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String[] getPageSelectionArgs(long j) {
        int i = getConfig().chooseMode;
        if (i == 0) {
            return j == -1 ? new java.lang.String[]{java.lang.String.valueOf(1), java.lang.String.valueOf(3)} : new java.lang.String[]{java.lang.String.valueOf(1), java.lang.String.valueOf(3), com.luck.picture.lib.utils.ValueOf.toString(java.lang.Long.valueOf(j))};
        }
        if (i == 1) {
            return getSelectionArgsForPageSingleMediaType(1, j);
        }
        if (i == 2) {
            return getSelectionArgsForPageSingleMediaType(3, j);
        }
        if (i != 3) {
            return null;
        }
        return getSelectionArgsForPageSingleMediaType(2, j);
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    protected java.lang.String getSelection() {
        java.lang.String durationCondition = getDurationCondition();
        java.lang.String fileSizeCondition = getFileSizeCondition();
        java.lang.String queryMimeCondition = getQueryMimeCondition();
        int i = getConfig().chooseMode;
        if (i == 0) {
            return getSelectionArgsForAllMediaCondition(durationCondition, fileSizeCondition, queryMimeCondition);
        }
        if (i == 1) {
            return getSelectionArgsForImageMediaCondition(fileSizeCondition, queryMimeCondition);
        }
        if (i == 2) {
            return getSelectionArgsForVideoMediaCondition(durationCondition, queryMimeCondition);
        }
        if (i != 3) {
            return null;
        }
        return getSelectionArgsForAudioMediaCondition(durationCondition, queryMimeCondition);
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    protected java.lang.String[] getSelectionArgs() {
        int i = getConfig().chooseMode;
        if (i == 0) {
            return new java.lang.String[]{java.lang.String.valueOf(1), java.lang.String.valueOf(3)};
        }
        if (i == 1) {
            return new java.lang.String[]{java.lang.String.valueOf(1)};
        }
        if (i == 2) {
            return new java.lang.String[]{java.lang.String.valueOf(3)};
        }
        if (i != 3) {
            return null;
        }
        return new java.lang.String[]{java.lang.String.valueOf(2)};
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    protected java.lang.String getSortOrder() {
        return android.text.TextUtils.isEmpty(getConfig().sortOrder) ? "date_modified DESC" : getConfig().sortOrder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isWithAllQuery() {
        if (com.luck.picture.lib.utils.SdkVersionUtils.isQ()) {
            return true;
        }
        return getConfig().isPageSyncAsCount;
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    protected com.luck.picture.lib.entity.LocalMedia parseLocalMedia(android.database.Cursor cursor, boolean z) {
        java.lang.String str;
        int i;
        long j;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(PROJECTION[0]);
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(PROJECTION[1]);
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(PROJECTION[2]);
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow(PROJECTION[3]);
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow(PROJECTION[4]);
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow(PROJECTION[5]);
        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow(PROJECTION[6]);
        int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow(PROJECTION[7]);
        int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow(PROJECTION[8]);
        int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow(PROJECTION[9]);
        int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow(PROJECTION[10]);
        int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow(PROJECTION[11]);
        long j2 = cursor.getLong(columnIndexOrThrow);
        java.lang.String string = cursor.getString(columnIndexOrThrow3);
        java.lang.String string2 = cursor.getString(columnIndexOrThrow2);
        java.lang.String realPathUri = com.luck.picture.lib.utils.SdkVersionUtils.isQ() ? com.luck.picture.lib.utils.MediaUtils.getRealPathUri(j2, string) : string2;
        if (android.text.TextUtils.isEmpty(string)) {
            string = com.luck.picture.lib.config.PictureMimeType.ofJPEG();
        }
        if (getConfig().isFilterInvalidFile) {
            if (com.luck.picture.lib.config.PictureMimeType.isHasImage(string)) {
                if (!android.text.TextUtils.isEmpty(string2) && !com.luck.picture.lib.utils.PictureFileUtils.isImageFileExists(string2)) {
                    return null;
                }
            } else if (!com.luck.picture.lib.utils.PictureFileUtils.isFileExists(string2)) {
                return null;
            }
        }
        if (string.endsWith(com.luck.picture.lib.config.SelectMimeType.SYSTEM_IMAGE)) {
            string = com.luck.picture.lib.utils.MediaUtils.getMimeTypeFromMediaUrl(string2);
            str = realPathUri;
            if (!getConfig().isGif && com.luck.picture.lib.config.PictureMimeType.isHasGif(string)) {
                return null;
            }
        } else {
            str = realPathUri;
        }
        if (string.endsWith(com.luck.picture.lib.config.SelectMimeType.SYSTEM_IMAGE)) {
            return null;
        }
        if (!getConfig().isWebp && string.startsWith(com.luck.picture.lib.config.PictureMimeType.ofWEBP())) {
            return null;
        }
        if (!getConfig().isBmp && com.luck.picture.lib.config.PictureMimeType.isHasBmp(string)) {
            return null;
        }
        int i2 = cursor.getInt(columnIndexOrThrow4);
        int i3 = cursor.getInt(columnIndexOrThrow5);
        int i4 = cursor.getInt(columnIndexOrThrow12);
        if (i4 == 90 || i4 == 270) {
            i = cursor.getInt(columnIndexOrThrow5);
            i3 = cursor.getInt(columnIndexOrThrow4);
        } else {
            i = i2;
        }
        long j3 = cursor.getLong(columnIndexOrThrow6);
        long j4 = cursor.getLong(columnIndexOrThrow7);
        java.lang.String string3 = cursor.getString(columnIndexOrThrow8);
        java.lang.String string4 = cursor.getString(columnIndexOrThrow9);
        long j5 = cursor.getLong(columnIndexOrThrow10);
        long j6 = cursor.getLong(columnIndexOrThrow11);
        if (android.text.TextUtils.isEmpty(string4)) {
            string4 = com.luck.picture.lib.config.PictureMimeType.getUrlToFileName(string2);
        }
        if (getConfig().isFilterSizeDuration && j4 > 0 && j4 < com.luck.picture.lib.config.FileSizeUnit.KB) {
            return null;
        }
        if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(string) || com.luck.picture.lib.config.PictureMimeType.isHasAudio(string)) {
            if (getConfig().filterVideoMinSecond > 0) {
                j = j6;
                if (j3 < getConfig().filterVideoMinSecond) {
                    return null;
                }
            } else {
                j = j6;
            }
            if (getConfig().filterVideoMaxSecond > 0 && j3 > getConfig().filterVideoMaxSecond) {
                return null;
            }
            if (getConfig().isFilterSizeDuration && j3 <= 0) {
                return null;
            }
        } else {
            j = j6;
        }
        com.luck.picture.lib.entity.LocalMedia obtain = z ? com.luck.picture.lib.entity.LocalMedia.obtain() : com.luck.picture.lib.entity.LocalMedia.create();
        obtain.setId(j2);
        obtain.setBucketId(j5);
        obtain.setPath(str);
        obtain.setRealPath(string2);
        obtain.setFileName(string4);
        obtain.setParentFolderName(string3);
        obtain.setDuration(j3);
        obtain.setChooseModel(getConfig().chooseMode);
        obtain.setMimeType(string);
        obtain.setWidth(i);
        obtain.setHeight(i3);
        obtain.setSize(j4);
        obtain.setDateAddedTime(j);
        if (this.mConfig.onQueryFilterListener == null || !this.mConfig.onQueryFilterListener.onFilter(obtain)) {
            return obtain;
        }
        return null;
    }
}
