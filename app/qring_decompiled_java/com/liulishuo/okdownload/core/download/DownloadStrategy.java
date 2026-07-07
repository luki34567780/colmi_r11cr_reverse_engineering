package com.liulishuo.okdownload.core.download;

/* loaded from: /tmp/dex/classes2.dex */
public class DownloadStrategy {
    private static final long FOUR_CONNECTION_UPPER_LIMIT = 104857600;
    private static final long ONE_CONNECTION_UPPER_LIMIT = 1048576;
    private static final java.lang.String TAG = "DownloadStrategy";
    private static final long THREE_CONNECTION_UPPER_LIMIT = 52428800;
    private static final java.util.regex.Pattern TMP_FILE_NAME_PATTERN = java.util.regex.Pattern.compile(".*\\\\|/([^\\\\|/|?]*)\\??");
    private static final long TWO_CONNECTION_UPPER_LIMIT = 5242880;
    java.lang.Boolean isHasAccessNetworkStatePermission = null;
    private android.net.ConnectivityManager manager = null;

    public boolean isServerCanceled(int i, boolean z) {
        if (i == 206 || i == 200) {
            return i == 200 && z;
        }
        return true;
    }

    public long reuseIdledSameInfoThresholdBytes() {
        return 10240L;
    }

    public com.liulishuo.okdownload.core.download.DownloadStrategy.ResumeAvailableResponseCheck resumeAvailableResponseCheck(com.liulishuo.okdownload.core.connection.DownloadConnection.Connected connected, int i, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        return new com.liulishuo.okdownload.core.download.DownloadStrategy.ResumeAvailableResponseCheck(connected, i, breakpointInfo);
    }

    public int determineBlockCount(com.liulishuo.okdownload.DownloadTask downloadTask, long j) {
        if (downloadTask.getSetConnectionCount() != null) {
            return downloadTask.getSetConnectionCount().intValue();
        }
        if (j < 1048576) {
            return 1;
        }
        if (j < TWO_CONNECTION_UPPER_LIMIT) {
            return 2;
        }
        if (j < THREE_CONNECTION_UPPER_LIMIT) {
            return 3;
        }
        return j < FOUR_CONNECTION_UPPER_LIMIT ? 4 : 5;
    }

    public boolean inspectAnotherSameInfo(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, long j) {
        com.liulishuo.okdownload.core.breakpoint.BreakpointStore breakpointStore;
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo findAnotherInfoFromCompare;
        if (!downloadTask.isFilenameFromResponse() || (findAnotherInfoFromCompare = (breakpointStore = com.liulishuo.okdownload.OkDownload.with().breakpointStore()).findAnotherInfoFromCompare(downloadTask, breakpointInfo)) == null) {
            return false;
        }
        breakpointStore.remove(findAnotherInfoFromCompare.getId());
        if (findAnotherInfoFromCompare.getTotalOffset() <= com.liulishuo.okdownload.OkDownload.with().downloadStrategy().reuseIdledSameInfoThresholdBytes()) {
            return false;
        }
        if ((findAnotherInfoFromCompare.getEtag() != null && !findAnotherInfoFromCompare.getEtag().equals(breakpointInfo.getEtag())) || findAnotherInfoFromCompare.getTotalLength() != j || findAnotherInfoFromCompare.getFile() == null || !findAnotherInfoFromCompare.getFile().exists()) {
            return false;
        }
        breakpointInfo.reuseBlocks(findAnotherInfoFromCompare);
        com.liulishuo.okdownload.core.Util.d(TAG, "Reuse another same info: " + breakpointInfo);
        return true;
    }

    public boolean isUseMultiBlock(boolean z) {
        if (com.liulishuo.okdownload.OkDownload.with().outputStreamFactory().supportSeek()) {
            return z;
        }
        return false;
    }

    public void inspectFilenameFromResume(java.lang.String str, com.liulishuo.okdownload.DownloadTask downloadTask) {
        if (com.liulishuo.okdownload.core.Util.isEmpty(downloadTask.getFilename())) {
            downloadTask.getFilenameHolder().set(str);
        }
    }

    public void validFilenameFromResponse(java.lang.String str, com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) throws java.io.IOException {
        if (com.liulishuo.okdownload.core.Util.isEmpty(downloadTask.getFilename())) {
            java.lang.String determineFilename = determineFilename(str, downloadTask);
            if (com.liulishuo.okdownload.core.Util.isEmpty(downloadTask.getFilename())) {
                synchronized (downloadTask) {
                    if (com.liulishuo.okdownload.core.Util.isEmpty(downloadTask.getFilename())) {
                        downloadTask.getFilenameHolder().set(determineFilename);
                        breakpointInfo.getFilenameHolder().set(determineFilename);
                    }
                }
            }
        }
    }

    protected java.lang.String determineFilename(java.lang.String str, com.liulishuo.okdownload.DownloadTask downloadTask) throws java.io.IOException {
        if (!com.liulishuo.okdownload.core.Util.isEmpty(str)) {
            return str;
        }
        java.lang.String url = downloadTask.getUrl();
        java.util.regex.Matcher matcher = TMP_FILE_NAME_PATTERN.matcher(url);
        java.lang.String str2 = null;
        while (matcher.find()) {
            str2 = matcher.group(1);
        }
        if (com.liulishuo.okdownload.core.Util.isEmpty(str2)) {
            str2 = com.liulishuo.okdownload.core.Util.md5(url);
        }
        if (str2 != null) {
            return str2;
        }
        throw new java.io.IOException("Can't find valid filename.");
    }

    public boolean validFilenameFromStore(com.liulishuo.okdownload.DownloadTask downloadTask) {
        java.lang.String responseFilename = com.liulishuo.okdownload.OkDownload.with().breakpointStore().getResponseFilename(downloadTask.getUrl());
        if (responseFilename == null) {
            return false;
        }
        downloadTask.getFilenameHolder().set(responseFilename);
        return true;
    }

    public void validInfoOnCompleted(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore) {
        long length;
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo afterCompleted = downloadStore.getAfterCompleted(downloadTask.getId());
        if (afterCompleted == null) {
            afterCompleted = new com.liulishuo.okdownload.core.breakpoint.BreakpointInfo(downloadTask.getId(), downloadTask.getUrl(), downloadTask.getParentFile(), downloadTask.getFilename());
            if (com.liulishuo.okdownload.core.Util.isUriContentScheme(downloadTask.getUri())) {
                length = com.liulishuo.okdownload.core.Util.getSizeFromContentUri(downloadTask.getUri());
            } else {
                java.io.File file = downloadTask.getFile();
                if (file == null) {
                    length = 0;
                    com.liulishuo.okdownload.core.Util.w(TAG, "file is not ready on valid info for task on complete state " + downloadTask);
                } else {
                    length = file.length();
                }
            }
            long j = length;
            afterCompleted.addBlock(new com.liulishuo.okdownload.core.breakpoint.BlockInfo(0L, j, j));
        }
        com.liulishuo.okdownload.DownloadTask.TaskHideWrapper.setBreakpointInfo(downloadTask, afterCompleted);
    }

    public static class FilenameHolder {
        private volatile java.lang.String filename;
        private final boolean filenameProvidedByConstruct = false;

        public FilenameHolder() {
        }

        public FilenameHolder(java.lang.String str) {
            this.filename = str;
        }

        void set(java.lang.String str) {
            this.filename = str;
        }

        public java.lang.String get() {
            return this.filename;
        }

        public boolean isFilenameProvidedByConstruct() {
            return this.filenameProvidedByConstruct;
        }

        public boolean equals(java.lang.Object obj) {
            if (super.equals(obj)) {
                return true;
            }
            if (!(obj instanceof com.liulishuo.okdownload.core.download.DownloadStrategy.FilenameHolder)) {
                return false;
            }
            if (this.filename == null) {
                return ((com.liulishuo.okdownload.core.download.DownloadStrategy.FilenameHolder) obj).filename == null;
            }
            return this.filename.equals(((com.liulishuo.okdownload.core.download.DownloadStrategy.FilenameHolder) obj).filename);
        }

        public int hashCode() {
            if (this.filename == null) {
                return 0;
            }
            return this.filename.hashCode();
        }
    }

    public static class ResumeAvailableResponseCheck {
        private int blockIndex;
        private com.liulishuo.okdownload.core.connection.DownloadConnection.Connected connected;
        private com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info;

        protected ResumeAvailableResponseCheck(com.liulishuo.okdownload.core.connection.DownloadConnection.Connected connected, int i, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
            this.connected = connected;
            this.info = breakpointInfo;
            this.blockIndex = i;
        }

        public void inspect() throws java.io.IOException {
            com.liulishuo.okdownload.core.breakpoint.BlockInfo block = this.info.getBlock(this.blockIndex);
            int responseCode = this.connected.getResponseCode();
            com.liulishuo.okdownload.core.cause.ResumeFailedCause preconditionFailedCause = com.liulishuo.okdownload.OkDownload.with().downloadStrategy().getPreconditionFailedCause(responseCode, block.getCurrentOffset() != 0, this.info, this.connected.getResponseHeaderField(com.liulishuo.okdownload.core.Util.ETAG));
            if (preconditionFailedCause != null) {
                throw new com.liulishuo.okdownload.core.exception.ResumeFailedException(preconditionFailedCause);
            }
            if (com.liulishuo.okdownload.OkDownload.with().downloadStrategy().isServerCanceled(responseCode, block.getCurrentOffset() != 0)) {
                throw new com.liulishuo.okdownload.core.exception.ServerCanceledException(responseCode, block.getCurrentOffset());
            }
        }
    }

    public com.liulishuo.okdownload.core.cause.ResumeFailedCause getPreconditionFailedCause(int i, boolean z, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, java.lang.String str) {
        java.lang.String etag = breakpointInfo.getEtag();
        if (i == 412) {
            return com.liulishuo.okdownload.core.cause.ResumeFailedCause.RESPONSE_PRECONDITION_FAILED;
        }
        if (!com.liulishuo.okdownload.core.Util.isEmpty(etag) && !com.liulishuo.okdownload.core.Util.isEmpty(str) && !str.equals(etag)) {
            return com.liulishuo.okdownload.core.cause.ResumeFailedCause.RESPONSE_ETAG_CHANGED;
        }
        if (i == 201 && z) {
            return com.liulishuo.okdownload.core.cause.ResumeFailedCause.RESPONSE_CREATED_RANGE_NOT_FROM_0;
        }
        if (i == 205 && z) {
            return com.liulishuo.okdownload.core.cause.ResumeFailedCause.RESPONSE_RESET_RANGE_NOT_FROM_0;
        }
        return null;
    }

    public void inspectNetworkAvailable() throws java.net.UnknownHostException {
        if (this.isHasAccessNetworkStatePermission == null) {
            this.isHasAccessNetworkStatePermission = java.lang.Boolean.valueOf(com.liulishuo.okdownload.core.Util.checkPermission("android.permission.ACCESS_NETWORK_STATE"));
        }
        if (this.isHasAccessNetworkStatePermission.booleanValue()) {
            if (this.manager == null) {
                this.manager = (android.net.ConnectivityManager) com.liulishuo.okdownload.OkDownload.with().context().getSystemService("connectivity");
            }
            if (!com.liulishuo.okdownload.core.Util.isNetworkAvailable(this.manager)) {
                throw new java.net.UnknownHostException("network is not available!");
            }
        }
    }

    public void inspectNetworkOnWifi(com.liulishuo.okdownload.DownloadTask downloadTask) throws java.io.IOException {
        if (this.isHasAccessNetworkStatePermission == null) {
            this.isHasAccessNetworkStatePermission = java.lang.Boolean.valueOf(com.liulishuo.okdownload.core.Util.checkPermission("android.permission.ACCESS_NETWORK_STATE"));
        }
        if (downloadTask.isWifiRequired()) {
            if (!this.isHasAccessNetworkStatePermission.booleanValue()) {
                throw new java.io.IOException("required for access network state but don't have the permission of Manifest.permission.ACCESS_NETWORK_STATE, please declare this permission first on your AndroidManifest, so we can handle the case of downloading required wifi state.");
            }
            if (this.manager == null) {
                this.manager = (android.net.ConnectivityManager) com.liulishuo.okdownload.OkDownload.with().context().getSystemService("connectivity");
            }
            if (com.liulishuo.okdownload.core.Util.isNetworkNotOnWifiType(this.manager)) {
                throw new com.liulishuo.okdownload.core.exception.NetworkPolicyException();
            }
        }
    }
}
