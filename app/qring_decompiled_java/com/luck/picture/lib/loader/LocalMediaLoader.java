package com.luck.picture.lib.loader;

/* loaded from: /tmp/dex/classes2.dex */
public final class LocalMediaLoader extends com.luck.picture.lib.loader.IBridgeMediaLoader {
    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public java.lang.String getAlbumFirstCover(long j) {
        return null;
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadPageMediaData(long j, int i, int i2, com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia> onQueryDataResultListener) {
    }

    public LocalMediaLoader(android.content.Context context, com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        super(context, selectorConfig);
    }

    private static java.lang.String getSelectionArgsForVideoMediaCondition(java.lang.String str, java.lang.String str2) {
        return "media_type=?" + str2 + " AND " + str;
    }

    private static java.lang.String getSelectionArgsForAudioMediaCondition(java.lang.String str, java.lang.String str2) {
        return "media_type=?" + str2 + " AND " + str;
    }

    private static java.lang.String getSelectionArgsForAllMediaCondition(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return "(media_type=?" + str3 + " OR media_type=? AND " + str + ") AND " + str2;
    }

    private static java.lang.String getSelectionArgsForImageMediaCondition(java.lang.String str, java.lang.String str2) {
        return "media_type=?" + str2 + " AND " + str;
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadAllAlbum(final com.luck.picture.lib.interfaces.OnQueryAllAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder> onQueryAllAlbumListener) {
        com.luck.picture.lib.thread.PictureThreadUtils.executeByIo(new com.luck.picture.lib.thread.PictureThreadUtils.SimpleTask<java.util.List<com.luck.picture.lib.entity.LocalMediaFolder>>() { // from class: com.luck.picture.lib.loader.LocalMediaLoader.1
            /* JADX WARN: Code restructure failed: missing block: B:46:0x014c, code lost:
            
                if (r1.isClosed() == false) goto L49;
             */
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> doInBackground() {
                /*
                    Method dump skipped, instructions count: 359
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.loader.LocalMediaLoader.AnonymousClass1.doInBackground():java.util.List");
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
                com.luck.picture.lib.thread.PictureThreadUtils.cancel(this);
                com.luck.picture.lib.interfaces.OnQueryAllAlbumListener onQueryAllAlbumListener2 = onQueryAllAlbumListener;
                if (onQueryAllAlbumListener2 != null) {
                    onQueryAllAlbumListener2.onComplete(list);
                }
            }
        });
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadOnlyInAppDirAllMedia(final com.luck.picture.lib.interfaces.OnQueryAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder> onQueryAlbumListener) {
        com.luck.picture.lib.thread.PictureThreadUtils.executeByIo(new com.luck.picture.lib.thread.PictureThreadUtils.SimpleTask<com.luck.picture.lib.entity.LocalMediaFolder>() { // from class: com.luck.picture.lib.loader.LocalMediaLoader.2
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public com.luck.picture.lib.entity.LocalMediaFolder doInBackground() {
                return com.luck.picture.lib.loader.SandboxFileLoader.loadInAppSandboxFolderFile(com.luck.picture.lib.loader.LocalMediaLoader.this.getContext(), com.luck.picture.lib.loader.LocalMediaLoader.this.getConfig().sandboxDir);
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

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    protected com.luck.picture.lib.entity.LocalMedia parseLocalMedia(android.database.Cursor cursor, boolean z) {
        long j;
        long j2;
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
        long j3 = cursor.getLong(columnIndexOrThrow);
        long j4 = cursor.getLong(columnIndexOrThrow11);
        java.lang.String string = cursor.getString(columnIndexOrThrow3);
        java.lang.String string2 = cursor.getString(columnIndexOrThrow2);
        java.lang.String realPathUri = com.luck.picture.lib.utils.SdkVersionUtils.isQ() ? com.luck.picture.lib.utils.MediaUtils.getRealPathUri(j3, string) : string2;
        if (android.text.TextUtils.isEmpty(string)) {
            string = com.luck.picture.lib.config.PictureMimeType.ofJPEG();
        }
        if (string.endsWith(com.luck.picture.lib.config.SelectMimeType.SYSTEM_IMAGE)) {
            string = com.luck.picture.lib.utils.MediaUtils.getMimeTypeFromMediaUrl(string2);
            j = j4;
            if (!getConfig().isGif && com.luck.picture.lib.config.PictureMimeType.isHasGif(string)) {
                return null;
            }
        } else {
            j = j4;
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
        int i = cursor.getInt(columnIndexOrThrow4);
        int i2 = cursor.getInt(columnIndexOrThrow5);
        int i3 = cursor.getInt(columnIndexOrThrow12);
        if (i3 == 90 || i3 == 270) {
            i = cursor.getInt(columnIndexOrThrow5);
            i2 = cursor.getInt(columnIndexOrThrow4);
        }
        long j5 = cursor.getLong(columnIndexOrThrow6);
        long j6 = cursor.getLong(columnIndexOrThrow7);
        java.lang.String string3 = cursor.getString(columnIndexOrThrow8);
        java.lang.String string4 = cursor.getString(columnIndexOrThrow9);
        long j7 = cursor.getLong(columnIndexOrThrow10);
        if (android.text.TextUtils.isEmpty(string4)) {
            string4 = com.luck.picture.lib.config.PictureMimeType.getUrlToFileName(string2);
        }
        if (getConfig().isFilterSizeDuration && j6 > 0 && j6 < com.luck.picture.lib.config.FileSizeUnit.KB) {
            return null;
        }
        if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(string) || com.luck.picture.lib.config.PictureMimeType.isHasAudio(string)) {
            if (getConfig().filterVideoMinSecond > 0) {
                j2 = j6;
                if (j5 < getConfig().filterVideoMinSecond) {
                    return null;
                }
            } else {
                j2 = j6;
            }
            if (getConfig().filterVideoMaxSecond > 0 && j5 > getConfig().filterVideoMaxSecond) {
                return null;
            }
            if (getConfig().isFilterSizeDuration && j5 <= 0) {
                return null;
            }
        } else {
            j2 = j6;
        }
        com.luck.picture.lib.entity.LocalMedia create = com.luck.picture.lib.entity.LocalMedia.create();
        create.setId(j3);
        create.setBucketId(j7);
        create.setPath(realPathUri);
        create.setRealPath(string2);
        create.setFileName(string4);
        create.setParentFolderName(string3);
        create.setDuration(j5);
        create.setChooseModel(getConfig().chooseMode);
        create.setMimeType(string);
        create.setWidth(i);
        create.setHeight(i2);
        create.setSize(j2);
        create.setDateAddedTime(j);
        if (this.mConfig.onQueryFilterListener == null || !this.mConfig.onQueryFilterListener.onFilter(create)) {
            return create;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.luck.picture.lib.entity.LocalMediaFolder getImageFolder(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
        for (com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder : list) {
            java.lang.String folderName = localMediaFolder.getFolderName();
            if (!android.text.TextUtils.isEmpty(folderName) && android.text.TextUtils.equals(folderName, str3)) {
                return localMediaFolder;
            }
        }
        com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder2 = new com.luck.picture.lib.entity.LocalMediaFolder();
        localMediaFolder2.setFolderName(str3);
        localMediaFolder2.setFirstImagePath(str);
        localMediaFolder2.setFirstMimeType(str2);
        list.add(localMediaFolder2);
        return localMediaFolder2;
    }
}
