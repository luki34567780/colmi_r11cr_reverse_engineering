package com.liulishuo.okdownload.core.interceptor.connect;

/* loaded from: /tmp/dex/classes2.dex */
public class HeaderInterceptor implements com.liulishuo.okdownload.core.interceptor.Interceptor.Connect {
    private static final java.lang.String TAG = "HeaderInterceptor";

    @Override // com.liulishuo.okdownload.core.interceptor.Interceptor.Connect
    public com.liulishuo.okdownload.core.connection.DownloadConnection.Connected interceptConnect(com.liulishuo.okdownload.core.download.DownloadChain downloadChain) throws java.io.IOException {
        long parseContentLengthFromContentRange;
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info = downloadChain.getInfo();
        com.liulishuo.okdownload.core.connection.DownloadConnection connectionOrCreate = downloadChain.getConnectionOrCreate();
        com.liulishuo.okdownload.DownloadTask task = downloadChain.getTask();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerMapFields = task.getHeaderMapFields();
        if (headerMapFields != null) {
            com.liulishuo.okdownload.core.Util.addUserRequestHeaderField(headerMapFields, connectionOrCreate);
        }
        if (headerMapFields == null || !headerMapFields.containsKey(com.liulishuo.okdownload.core.Util.USER_AGENT)) {
            com.liulishuo.okdownload.core.Util.addDefaultUserAgent(connectionOrCreate);
        }
        int blockIndex = downloadChain.getBlockIndex();
        com.liulishuo.okdownload.core.breakpoint.BlockInfo block = info.getBlock(blockIndex);
        if (block == null) {
            throw new java.io.IOException("No block-info found on " + blockIndex);
        }
        connectionOrCreate.addHeader(com.liulishuo.okdownload.core.Util.RANGE, ("bytes=" + block.getRangeLeft() + "-") + block.getRangeRight());
        com.liulishuo.okdownload.core.Util.d(TAG, "AssembleHeaderRange (" + task.getId() + ") block(" + blockIndex + ") downloadFrom(" + block.getRangeLeft() + ") currentOffset(" + block.getCurrentOffset() + ")");
        java.lang.String etag = info.getEtag();
        if (!com.liulishuo.okdownload.core.Util.isEmpty(etag)) {
            connectionOrCreate.addHeader(com.liulishuo.okdownload.core.Util.IF_MATCH, etag);
        }
        if (downloadChain.getCache().isInterrupt()) {
            throw com.liulishuo.okdownload.core.exception.InterruptException.SIGNAL;
        }
        com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().dispatch().connectStart(task, blockIndex, connectionOrCreate.getRequestProperties());
        com.liulishuo.okdownload.core.connection.DownloadConnection.Connected processConnect = downloadChain.processConnect();
        if (downloadChain.getCache().isInterrupt()) {
            throw com.liulishuo.okdownload.core.exception.InterruptException.SIGNAL;
        }
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaderFields = processConnect.getResponseHeaderFields();
        if (responseHeaderFields == null) {
            responseHeaderFields = new java.util.HashMap<>();
        }
        com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().dispatch().connectEnd(task, blockIndex, processConnect.getResponseCode(), responseHeaderFields);
        com.liulishuo.okdownload.OkDownload.with().downloadStrategy().resumeAvailableResponseCheck(processConnect, blockIndex, info).inspect();
        java.lang.String responseHeaderField = processConnect.getResponseHeaderField(com.liulishuo.okdownload.core.Util.CONTENT_LENGTH);
        if (responseHeaderField == null || responseHeaderField.length() == 0) {
            parseContentLengthFromContentRange = com.liulishuo.okdownload.core.Util.parseContentLengthFromContentRange(processConnect.getResponseHeaderField(com.liulishuo.okdownload.core.Util.CONTENT_RANGE));
        } else {
            parseContentLengthFromContentRange = com.liulishuo.okdownload.core.Util.parseContentLength(responseHeaderField);
        }
        downloadChain.setResponseContentLength(parseContentLengthFromContentRange);
        return processConnect;
    }
}
