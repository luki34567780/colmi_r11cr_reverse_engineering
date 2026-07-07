package com.liulishuo.okdownload.core.breakpoint;

/* loaded from: /tmp/dex/classes2.dex */
public class BreakpointInfo {
    private final java.util.List<com.liulishuo.okdownload.core.breakpoint.BlockInfo> blockInfoList = new java.util.ArrayList();
    private boolean chunked;
    private java.lang.String etag;
    private final com.liulishuo.okdownload.core.download.DownloadStrategy.FilenameHolder filenameHolder;
    final int id;
    final java.io.File parentFile;
    private java.io.File targetFile;
    private final boolean taskOnlyProvidedParentPath;
    private final java.lang.String url;

    public BreakpointInfo(int i, java.lang.String str, java.io.File file, java.lang.String str2) {
        this.id = i;
        this.url = str;
        this.parentFile = file;
        if (com.liulishuo.okdownload.core.Util.isEmpty(str2)) {
            this.filenameHolder = new com.liulishuo.okdownload.core.download.DownloadStrategy.FilenameHolder();
            this.taskOnlyProvidedParentPath = true;
        } else {
            this.filenameHolder = new com.liulishuo.okdownload.core.download.DownloadStrategy.FilenameHolder(str2);
            this.taskOnlyProvidedParentPath = false;
            this.targetFile = new java.io.File(file, str2);
        }
    }

    BreakpointInfo(int i, java.lang.String str, java.io.File file, java.lang.String str2, boolean z) {
        this.id = i;
        this.url = str;
        this.parentFile = file;
        if (com.liulishuo.okdownload.core.Util.isEmpty(str2)) {
            this.filenameHolder = new com.liulishuo.okdownload.core.download.DownloadStrategy.FilenameHolder();
        } else {
            this.filenameHolder = new com.liulishuo.okdownload.core.download.DownloadStrategy.FilenameHolder(str2);
        }
        this.taskOnlyProvidedParentPath = z;
    }

    public int getId() {
        return this.id;
    }

    public void setChunked(boolean z) {
        this.chunked = z;
    }

    public void addBlock(com.liulishuo.okdownload.core.breakpoint.BlockInfo blockInfo) {
        this.blockInfoList.add(blockInfo);
    }

    public boolean isChunked() {
        return this.chunked;
    }

    public boolean isLastBlock(int i) {
        return i == this.blockInfoList.size() - 1;
    }

    public boolean isSingleBlock() {
        return this.blockInfoList.size() == 1;
    }

    boolean isTaskOnlyProvidedParentPath() {
        return this.taskOnlyProvidedParentPath;
    }

    public com.liulishuo.okdownload.core.breakpoint.BlockInfo getBlock(int i) {
        return this.blockInfoList.get(i);
    }

    public void resetInfo() {
        this.blockInfoList.clear();
        this.etag = null;
    }

    public void resetBlockInfos() {
        this.blockInfoList.clear();
    }

    public int getBlockCount() {
        return this.blockInfoList.size();
    }

    public void setEtag(java.lang.String str) {
        this.etag = str;
    }

    public long getTotalOffset() {
        java.lang.Object[] array = this.blockInfoList.toArray();
        long j = 0;
        if (array != null) {
            for (java.lang.Object obj : array) {
                if (obj instanceof com.liulishuo.okdownload.core.breakpoint.BlockInfo) {
                    j += ((com.liulishuo.okdownload.core.breakpoint.BlockInfo) obj).getCurrentOffset();
                }
            }
        }
        return j;
    }

    public long getTotalLength() {
        if (isChunked()) {
            return getTotalOffset();
        }
        long j = 0;
        java.lang.Object[] array = this.blockInfoList.toArray();
        if (array != null) {
            for (java.lang.Object obj : array) {
                if (obj instanceof com.liulishuo.okdownload.core.breakpoint.BlockInfo) {
                    j += ((com.liulishuo.okdownload.core.breakpoint.BlockInfo) obj).getContentLength();
                }
            }
        }
        return j;
    }

    public java.lang.String getEtag() {
        return this.etag;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public java.lang.String getFilename() {
        return this.filenameHolder.get();
    }

    public com.liulishuo.okdownload.core.download.DownloadStrategy.FilenameHolder getFilenameHolder() {
        return this.filenameHolder;
    }

    public java.io.File getFile() {
        java.lang.String str = this.filenameHolder.get();
        if (str == null) {
            return null;
        }
        if (this.targetFile == null) {
            this.targetFile = new java.io.File(this.parentFile, str);
        }
        return this.targetFile;
    }

    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo copy() {
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo = new com.liulishuo.okdownload.core.breakpoint.BreakpointInfo(this.id, this.url, this.parentFile, this.filenameHolder.get(), this.taskOnlyProvidedParentPath);
        breakpointInfo.chunked = this.chunked;
        java.util.Iterator<com.liulishuo.okdownload.core.breakpoint.BlockInfo> it = this.blockInfoList.iterator();
        while (it.hasNext()) {
            breakpointInfo.blockInfoList.add(it.next().copy());
        }
        return breakpointInfo;
    }

    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo copyWithReplaceId(int i) {
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo = new com.liulishuo.okdownload.core.breakpoint.BreakpointInfo(i, this.url, this.parentFile, this.filenameHolder.get(), this.taskOnlyProvidedParentPath);
        breakpointInfo.chunked = this.chunked;
        java.util.Iterator<com.liulishuo.okdownload.core.breakpoint.BlockInfo> it = this.blockInfoList.iterator();
        while (it.hasNext()) {
            breakpointInfo.blockInfoList.add(it.next().copy());
        }
        return breakpointInfo;
    }

    public void reuseBlocks(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        this.blockInfoList.clear();
        this.blockInfoList.addAll(breakpointInfo.blockInfoList);
    }

    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo copyWithReplaceIdAndUrl(int i, java.lang.String str) {
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo = new com.liulishuo.okdownload.core.breakpoint.BreakpointInfo(i, str, this.parentFile, this.filenameHolder.get(), this.taskOnlyProvidedParentPath);
        breakpointInfo.chunked = this.chunked;
        java.util.Iterator<com.liulishuo.okdownload.core.breakpoint.BlockInfo> it = this.blockInfoList.iterator();
        while (it.hasNext()) {
            breakpointInfo.blockInfoList.add(it.next().copy());
        }
        return breakpointInfo;
    }

    public boolean isSameFrom(com.liulishuo.okdownload.DownloadTask downloadTask) {
        if (!this.parentFile.equals(downloadTask.getParentFile()) || !this.url.equals(downloadTask.getUrl())) {
            return false;
        }
        java.lang.String filename = downloadTask.getFilename();
        if (filename != null && filename.equals(this.filenameHolder.get())) {
            return true;
        }
        if (this.taskOnlyProvidedParentPath && downloadTask.isFilenameFromResponse()) {
            return filename == null || filename.equals(this.filenameHolder.get());
        }
        return false;
    }

    public java.lang.String toString() {
        return "id[" + this.id + "] url[" + this.url + "] etag[" + this.etag + "] taskOnlyProvidedParentPath[" + this.taskOnlyProvidedParentPath + "] parent path[" + this.parentFile + "] filename[" + this.filenameHolder.get() + "] block(s):" + this.blockInfoList.toString();
    }
}
