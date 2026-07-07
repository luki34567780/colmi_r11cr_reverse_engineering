package com.liulishuo.okdownload.core.breakpoint;

/* loaded from: /tmp/dex/classes2.dex */
public class BreakpointInfoRow {
    private final boolean chunked;
    private final java.lang.String etag;
    private final java.lang.String filename;
    private final int id;
    private final java.lang.String parentPath;
    private final boolean taskOnlyProvidedParentPath;
    private final java.lang.String url;

    public BreakpointInfoRow(android.database.Cursor cursor) {
        this.id = cursor.getInt(cursor.getColumnIndex(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID));
        this.url = cursor.getString(cursor.getColumnIndex("url"));
        this.etag = cursor.getString(cursor.getColumnIndex(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ETAG));
        this.parentPath = cursor.getString(cursor.getColumnIndex(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.PARENT_PATH));
        this.filename = cursor.getString(cursor.getColumnIndex(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.FILENAME));
        this.taskOnlyProvidedParentPath = cursor.getInt(cursor.getColumnIndex(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.TASK_ONLY_PARENT_PATH)) == 1;
        this.chunked = cursor.getInt(cursor.getColumnIndex("chunked")) == 1;
    }

    public int getId() {
        return this.id;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public java.lang.String getEtag() {
        return this.etag;
    }

    public java.lang.String getParentPath() {
        return this.parentPath;
    }

    public java.lang.String getFilename() {
        return this.filename;
    }

    public boolean isTaskOnlyProvidedParentPath() {
        return this.taskOnlyProvidedParentPath;
    }

    public boolean isChunked() {
        return this.chunked;
    }

    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo toInfo() {
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo = new com.liulishuo.okdownload.core.breakpoint.BreakpointInfo(this.id, this.url, new java.io.File(this.parentPath), this.filename, this.taskOnlyProvidedParentPath);
        breakpointInfo.setEtag(this.etag);
        breakpointInfo.setChunked(this.chunked);
        return breakpointInfo;
    }
}
