package com.liulishuo.okdownload.core.breakpoint;

/* loaded from: /tmp/dex/classes2.dex */
public class BlockInfoRow {
    private final int breakpointId;
    private final long contentLength;
    private final long currentOffset;
    private final long startOffset;

    public BlockInfoRow(android.database.Cursor cursor) {
        this.breakpointId = cursor.getInt(cursor.getColumnIndex(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.HOST_ID));
        this.startOffset = cursor.getInt(cursor.getColumnIndex(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.START_OFFSET));
        this.contentLength = cursor.getInt(cursor.getColumnIndex(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.CONTENT_LENGTH));
        this.currentOffset = cursor.getInt(cursor.getColumnIndex(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.CURRENT_OFFSET));
    }

    public int getBreakpointId() {
        return this.breakpointId;
    }

    public long getStartOffset() {
        return this.startOffset;
    }

    public long getContentLength() {
        return this.contentLength;
    }

    public long getCurrentOffset() {
        return this.currentOffset;
    }

    public com.liulishuo.okdownload.core.breakpoint.BlockInfo toInfo() {
        return new com.liulishuo.okdownload.core.breakpoint.BlockInfo(this.startOffset, this.contentLength, this.currentOffset);
    }
}
