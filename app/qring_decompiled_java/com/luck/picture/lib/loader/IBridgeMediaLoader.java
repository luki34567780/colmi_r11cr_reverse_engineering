package com.luck.picture.lib.loader;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class IBridgeMediaLoader {
    protected static final java.lang.String COLUMN_COUNT = "count";
    protected static final java.lang.String DISTINCT_BUCKET_Id = "DISTINCT bucket_id";
    protected static final java.lang.String GROUP_BY_BUCKET_Id = " GROUP BY (bucket_id";
    protected static final int MAX_SORT_SIZE = 60;
    protected static final java.lang.String NOT_GIF = " AND (mime_type!='image/gif')";
    protected static final java.lang.String ORDER_BY = "date_modified DESC";
    protected static final java.lang.String TAG = "IBridgeMediaLoader";
    protected final com.luck.picture.lib.config.SelectorConfig mConfig;
    private final android.content.Context mContext;
    protected static final android.net.Uri QUERY_URI = android.provider.MediaStore.Files.getContentUri("external");
    protected static final java.lang.String COLUMN_DURATION = "duration";
    protected static final java.lang.String COLUMN_BUCKET_DISPLAY_NAME = "bucket_display_name";
    protected static final java.lang.String COLUMN_BUCKET_ID = "bucket_id";
    protected static final java.lang.String COLUMN_ORIENTATION = "orientation";
    protected static final java.lang.String[] PROJECTION = {"_id", "_data", "mime_type", "width", "height", COLUMN_DURATION, "_size", COLUMN_BUCKET_DISPLAY_NAME, "_display_name", COLUMN_BUCKET_ID, "date_added", COLUMN_ORIENTATION};
    protected static final java.lang.String[] ALL_PROJECTION = {"_id", "_data", "mime_type", "width", "height", COLUMN_DURATION, "_size", COLUMN_BUCKET_DISPLAY_NAME, "_display_name", COLUMN_BUCKET_ID, "date_added", COLUMN_ORIENTATION, "COUNT(*) AS count"};

    public abstract java.lang.String getAlbumFirstCover(long j);

    protected abstract java.lang.String getSelection();

    protected abstract java.lang.String[] getSelectionArgs();

    protected abstract java.lang.String getSortOrder();

    public abstract void loadAllAlbum(com.luck.picture.lib.interfaces.OnQueryAllAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder> onQueryAllAlbumListener);

    public abstract void loadOnlyInAppDirAllMedia(com.luck.picture.lib.interfaces.OnQueryAlbumListener<com.luck.picture.lib.entity.LocalMediaFolder> onQueryAlbumListener);

    public abstract void loadPageMediaData(long j, int i, int i2, com.luck.picture.lib.interfaces.OnQueryDataResultListener<com.luck.picture.lib.entity.LocalMedia> onQueryDataResultListener);

    protected abstract com.luck.picture.lib.entity.LocalMedia parseLocalMedia(android.database.Cursor cursor, boolean z);

    public IBridgeMediaLoader(android.content.Context context, com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        this.mContext = context;
        this.mConfig = selectorConfig;
    }

    protected android.content.Context getContext() {
        return this.mContext;
    }

    protected com.luck.picture.lib.config.SelectorConfig getConfig() {
        return this.mConfig;
    }

    protected java.lang.String getDurationCondition() {
        return java.lang.String.format(java.util.Locale.CHINA, "%d <%s duration and duration <= %d", java.lang.Long.valueOf(java.lang.Math.max(0L, getConfig().filterVideoMinSecond)), "=", java.lang.Long.valueOf(getConfig().filterVideoMaxSecond == 0 ? Long.MAX_VALUE : getConfig().filterVideoMaxSecond));
    }

    protected java.lang.String getFileSizeCondition() {
        return java.lang.String.format(java.util.Locale.CHINA, "%d <%s _size and _size <= %d", java.lang.Long.valueOf(java.lang.Math.max(0L, getConfig().filterMinFileSize)), "=", java.lang.Long.valueOf(getConfig().filterMaxFileSize == 0 ? Long.MAX_VALUE : getConfig().filterMaxFileSize));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.String getQueryMimeCondition() {
        /*
            r10 = this;
            com.luck.picture.lib.config.SelectorConfig r0 = r10.getConfig()
            java.util.List<java.lang.String> r0 = r0.queryOnlyList
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = -1
        L15:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L99
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L28
            goto L15
        L28:
            com.luck.picture.lib.config.SelectorConfig r5 = r10.getConfig()
            int r5 = r5.chooseMode
            int r6 = com.luck.picture.lib.config.SelectMimeType.ofVideo()
            java.lang.String r7 = "audio"
            java.lang.String r8 = "image"
            if (r5 != r6) goto L45
            boolean r5 = r4.startsWith(r8)
            if (r5 != 0) goto L15
            boolean r5 = r4.startsWith(r7)
            if (r5 == 0) goto L79
            goto L15
        L45:
            com.luck.picture.lib.config.SelectorConfig r5 = r10.getConfig()
            int r5 = r5.chooseMode
            int r6 = com.luck.picture.lib.config.SelectMimeType.ofImage()
            java.lang.String r9 = "video"
            if (r5 != r6) goto L60
            boolean r5 = r4.startsWith(r7)
            if (r5 != 0) goto L15
            boolean r5 = r4.startsWith(r9)
            if (r5 == 0) goto L79
            goto L15
        L60:
            com.luck.picture.lib.config.SelectorConfig r5 = r10.getConfig()
            int r5 = r5.chooseMode
            int r6 = com.luck.picture.lib.config.SelectMimeType.ofAudio()
            if (r5 != r6) goto L79
            boolean r5 = r4.startsWith(r9)
            if (r5 != 0) goto L15
            boolean r5 = r4.startsWith(r8)
            if (r5 == 0) goto L79
            goto L15
        L79:
            int r3 = r3 + 1
            if (r3 != 0) goto L80
            java.lang.String r5 = " AND "
            goto L82
        L80:
            java.lang.String r5 = " OR "
        L82:
            r2.append(r5)
            java.lang.String r5 = "mime_type"
            r2.append(r5)
            java.lang.String r5 = "='"
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = "'"
            r2.append(r4)
            goto L15
        L99:
            com.luck.picture.lib.config.SelectorConfig r0 = r10.getConfig()
            int r0 = r0.chooseMode
            int r3 = com.luck.picture.lib.config.SelectMimeType.ofVideo()
            if (r0 == r3) goto Lbc
            com.luck.picture.lib.config.SelectorConfig r0 = r10.getConfig()
            boolean r0 = r0.isGif
            if (r0 != 0) goto Lbc
            java.lang.String r0 = com.luck.picture.lib.config.PictureMimeType.ofGIF()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lbc
            java.lang.String r0 = " AND (mime_type!='image/gif')"
            r2.append(r0)
        Lbc:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.loader.IBridgeMediaLoader.getQueryMimeCondition():java.lang.String");
    }
}
