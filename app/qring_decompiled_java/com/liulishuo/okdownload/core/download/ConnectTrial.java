package com.liulishuo.okdownload.core.download;

/* loaded from: /tmp/dex/classes2.dex */
public class ConnectTrial {
    private static final java.lang.String TAG = "ConnectTrial";
    private boolean acceptRange;
    private final com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info;
    private long instanceLength;
    private int responseCode;
    private java.lang.String responseEtag;
    private java.lang.String responseFilename;
    private final com.liulishuo.okdownload.DownloadTask task;
    private static final java.util.regex.Pattern CONTENT_DISPOSITION_QUOTED_PATTERN = java.util.regex.Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
    private static final java.util.regex.Pattern CONTENT_DISPOSITION_NON_QUOTED_PATTERN = java.util.regex.Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");

    public ConnectTrial(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        this.task = downloadTask;
        this.info = breakpointInfo;
    }

    public void executeTrial() throws java.io.IOException {
        com.liulishuo.okdownload.OkDownload.with().downloadStrategy().inspectNetworkOnWifi(this.task);
        com.liulishuo.okdownload.OkDownload.with().downloadStrategy().inspectNetworkAvailable();
        com.liulishuo.okdownload.core.connection.DownloadConnection create = com.liulishuo.okdownload.OkDownload.with().connectionFactory().create(this.task.getUrl());
        try {
            if (!com.liulishuo.okdownload.core.Util.isEmpty(this.info.getEtag())) {
                create.addHeader(com.liulishuo.okdownload.core.Util.IF_MATCH, this.info.getEtag());
            }
            create.addHeader(com.liulishuo.okdownload.core.Util.RANGE, "bytes=0-0");
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerMapFields = this.task.getHeaderMapFields();
            if (headerMapFields != null) {
                com.liulishuo.okdownload.core.Util.addUserRequestHeaderField(headerMapFields, create);
            }
            com.liulishuo.okdownload.DownloadListener dispatch = com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().dispatch();
            dispatch.connectTrialStart(this.task, create.getRequestProperties());
            com.liulishuo.okdownload.core.connection.DownloadConnection.Connected execute = create.execute();
            this.task.setRedirectLocation(execute.getRedirectLocation());
            com.liulishuo.okdownload.core.Util.d(TAG, "task[" + this.task.getId() + "] redirect location: " + this.task.getRedirectLocation());
            this.responseCode = execute.getResponseCode();
            this.acceptRange = isAcceptRange(execute);
            this.instanceLength = findInstanceLength(execute);
            this.responseEtag = findEtag(execute);
            this.responseFilename = findFilename(execute);
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaderFields = execute.getResponseHeaderFields();
            if (responseHeaderFields == null) {
                responseHeaderFields = new java.util.HashMap<>();
            }
            dispatch.connectTrialEnd(this.task, this.responseCode, responseHeaderFields);
            if (isNeedTrialHeadMethodForInstanceLength(this.instanceLength, execute)) {
                trialHeadMethodForInstanceLength();
            }
        } finally {
            create.release();
        }
    }

    public long getInstanceLength() {
        return this.instanceLength;
    }

    public boolean isAcceptRange() {
        return this.acceptRange;
    }

    public boolean isChunked() {
        return this.instanceLength == -1;
    }

    public java.lang.String getResponseEtag() {
        return this.responseEtag;
    }

    public java.lang.String getResponseFilename() {
        return this.responseFilename;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public boolean isEtagOverdue() {
        return (this.info.getEtag() == null || this.info.getEtag().equals(this.responseEtag)) ? false : true;
    }

    private static boolean isAcceptRange(com.liulishuo.okdownload.core.connection.DownloadConnection.Connected connected) throws java.io.IOException {
        if (connected.getResponseCode() == 206) {
            return true;
        }
        return "bytes".equals(connected.getResponseHeaderField(com.liulishuo.okdownload.core.Util.ACCEPT_RANGES));
    }

    private static java.lang.String findFilename(com.liulishuo.okdownload.core.connection.DownloadConnection.Connected connected) throws java.io.IOException {
        return parseContentDisposition(connected.getResponseHeaderField(com.liulishuo.okdownload.core.Util.CONTENT_DISPOSITION));
    }

    private static java.lang.String parseContentDisposition(java.lang.String str) throws java.io.IOException {
        java.lang.String group;
        if (str == null) {
            return null;
        }
        try {
            java.util.regex.Matcher matcher = CONTENT_DISPOSITION_QUOTED_PATTERN.matcher(str);
            if (matcher.find()) {
                group = matcher.group(1);
            } else {
                java.util.regex.Matcher matcher2 = CONTENT_DISPOSITION_NON_QUOTED_PATTERN.matcher(str);
                group = matcher2.find() ? matcher2.group(1) : null;
            }
            if (group != null && group.contains("../")) {
                throw new com.liulishuo.okdownload.core.exception.DownloadSecurityException("The filename [" + group + "] from the response is not allowable, because it contains '../', which can raise the directory traversal vulnerability");
            }
            return group;
        } catch (java.lang.IllegalStateException unused) {
            return null;
        }
    }

    private static java.lang.String findEtag(com.liulishuo.okdownload.core.connection.DownloadConnection.Connected connected) {
        return connected.getResponseHeaderField(com.liulishuo.okdownload.core.Util.ETAG);
    }

    private static long findInstanceLength(com.liulishuo.okdownload.core.connection.DownloadConnection.Connected connected) {
        long parseContentRangeFoInstanceLength = parseContentRangeFoInstanceLength(connected.getResponseHeaderField(com.liulishuo.okdownload.core.Util.CONTENT_RANGE));
        if (parseContentRangeFoInstanceLength != -1) {
            return parseContentRangeFoInstanceLength;
        }
        if (!parseTransferEncoding(connected.getResponseHeaderField(com.liulishuo.okdownload.core.Util.TRANSFER_ENCODING))) {
            com.liulishuo.okdownload.core.Util.w(TAG, "Transfer-Encoding isn't chunked but there is no valid instance length found either!");
        }
        return -1L;
    }

    boolean isNeedTrialHeadMethodForInstanceLength(long j, com.liulishuo.okdownload.core.connection.DownloadConnection.Connected connected) {
        java.lang.String responseHeaderField;
        if (j != -1) {
            return false;
        }
        java.lang.String responseHeaderField2 = connected.getResponseHeaderField(com.liulishuo.okdownload.core.Util.CONTENT_RANGE);
        return (responseHeaderField2 == null || responseHeaderField2.length() <= 0) && !parseTransferEncoding(connected.getResponseHeaderField(com.liulishuo.okdownload.core.Util.TRANSFER_ENCODING)) && (responseHeaderField = connected.getResponseHeaderField(com.liulishuo.okdownload.core.Util.CONTENT_LENGTH)) != null && responseHeaderField.length() > 0;
    }

    void trialHeadMethodForInstanceLength() throws java.io.IOException {
        com.liulishuo.okdownload.core.connection.DownloadConnection create = com.liulishuo.okdownload.OkDownload.with().connectionFactory().create(this.task.getUrl());
        com.liulishuo.okdownload.DownloadListener dispatch = com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().dispatch();
        try {
            create.setRequestMethod(com.liulishuo.okdownload.core.Util.METHOD_HEAD);
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerMapFields = this.task.getHeaderMapFields();
            if (headerMapFields != null) {
                com.liulishuo.okdownload.core.Util.addUserRequestHeaderField(headerMapFields, create);
            }
            dispatch.connectTrialStart(this.task, create.getRequestProperties());
            com.liulishuo.okdownload.core.connection.DownloadConnection.Connected execute = create.execute();
            dispatch.connectTrialEnd(this.task, execute.getResponseCode(), execute.getResponseHeaderFields());
            this.instanceLength = com.liulishuo.okdownload.core.Util.parseContentLength(execute.getResponseHeaderField(com.liulishuo.okdownload.core.Util.CONTENT_LENGTH));
        } finally {
            create.release();
        }
    }

    private static boolean parseTransferEncoding(java.lang.String str) {
        return str != null && str.equals("chunked");
    }

    private static long parseContentRangeFoInstanceLength(java.lang.String str) {
        if (str == null) {
            return -1L;
        }
        java.lang.String[] split = str.split("/");
        if (split.length >= 2) {
            try {
                return java.lang.Long.parseLong(split[1]);
            } catch (java.lang.NumberFormatException unused) {
                com.liulishuo.okdownload.core.Util.w(TAG, "parse instance length failed with " + str);
            }
        }
        return -1L;
    }
}
