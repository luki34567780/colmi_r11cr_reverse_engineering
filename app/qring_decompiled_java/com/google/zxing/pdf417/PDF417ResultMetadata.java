package com.google.zxing.pdf417;

/* loaded from: /tmp/dex/classes2.dex */
public final class PDF417ResultMetadata {
    private java.lang.String addressee;
    private java.lang.String fileId;
    private java.lang.String fileName;
    private boolean lastSegment;
    private int[] optionalData;
    private int segmentIndex;
    private java.lang.String sender;
    private int segmentCount = -1;
    private long fileSize = -1;
    private long timestamp = -1;
    private int checksum = -1;

    public int getSegmentIndex() {
        return this.segmentIndex;
    }

    public void setSegmentIndex(int i) {
        this.segmentIndex = i;
    }

    public java.lang.String getFileId() {
        return this.fileId;
    }

    public void setFileId(java.lang.String str) {
        this.fileId = str;
    }

    @java.lang.Deprecated
    public int[] getOptionalData() {
        return this.optionalData;
    }

    @java.lang.Deprecated
    public void setOptionalData(int[] iArr) {
        this.optionalData = iArr;
    }

    public boolean isLastSegment() {
        return this.lastSegment;
    }

    public void setLastSegment(boolean z) {
        this.lastSegment = z;
    }

    public int getSegmentCount() {
        return this.segmentCount;
    }

    public void setSegmentCount(int i) {
        this.segmentCount = i;
    }

    public java.lang.String getSender() {
        return this.sender;
    }

    public void setSender(java.lang.String str) {
        this.sender = str;
    }

    public java.lang.String getAddressee() {
        return this.addressee;
    }

    public void setAddressee(java.lang.String str) {
        this.addressee = str;
    }

    public java.lang.String getFileName() {
        return this.fileName;
    }

    public void setFileName(java.lang.String str) {
        this.fileName = str;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(long j) {
        this.fileSize = j;
    }

    public int getChecksum() {
        return this.checksum;
    }

    public void setChecksum(int i) {
        this.checksum = i;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }
}
