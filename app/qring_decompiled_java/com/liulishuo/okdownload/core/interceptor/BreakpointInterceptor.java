package com.liulishuo.okdownload.core.interceptor;

/* loaded from: /tmp/dex/classes2.dex */
public class BreakpointInterceptor implements com.liulishuo.okdownload.core.interceptor.Interceptor.Connect, com.liulishuo.okdownload.core.interceptor.Interceptor.Fetch {
    private static final java.util.regex.Pattern CONTENT_RANGE_RIGHT_VALUE = java.util.regex.Pattern.compile(".*\\d+ *- *(\\d+) */ *\\d+");
    private static final java.lang.String TAG = "BreakpointInterceptor";

    @Override // com.liulishuo.okdownload.core.interceptor.Interceptor.Connect
    public com.liulishuo.okdownload.core.connection.DownloadConnection.Connected interceptConnect(com.liulishuo.okdownload.core.download.DownloadChain downloadChain) throws java.io.IOException {
        com.liulishuo.okdownload.core.connection.DownloadConnection.Connected processConnect = downloadChain.processConnect();
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info = downloadChain.getInfo();
        if (downloadChain.getCache().isInterrupt()) {
            throw com.liulishuo.okdownload.core.exception.InterruptException.SIGNAL;
        }
        if (info.getBlockCount() == 1 && !info.isChunked()) {
            long exactContentLengthRangeFrom0 = getExactContentLengthRangeFrom0(processConnect);
            long totalLength = info.getTotalLength();
            if (exactContentLengthRangeFrom0 > 0 && exactContentLengthRangeFrom0 != totalLength) {
                com.liulishuo.okdownload.core.Util.d(TAG, "SingleBlock special check: the response instance-length[" + exactContentLengthRangeFrom0 + "] isn't equal to the instance length from trial-connection[" + totalLength + "]");
                boolean z = info.getBlock(0).getRangeLeft() != 0;
                com.liulishuo.okdownload.core.breakpoint.BlockInfo blockInfo = new com.liulishuo.okdownload.core.breakpoint.BlockInfo(0L, exactContentLengthRangeFrom0);
                info.resetBlockInfos();
                info.addBlock(blockInfo);
                if (z) {
                    com.liulishuo.okdownload.core.Util.w(TAG, "Discard breakpoint because of on this special case, we have to download from beginning");
                    throw new com.liulishuo.okdownload.core.exception.RetryException("Discard breakpoint because of on this special case, we have to download from beginning");
                }
                com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().dispatch().downloadFromBeginning(downloadChain.getTask(), info, com.liulishuo.okdownload.core.cause.ResumeFailedCause.CONTENT_LENGTH_CHANGED);
            }
        }
        try {
            if (downloadChain.getDownloadStore().update(info)) {
                return processConnect;
            }
            throw new java.io.IOException("Update store failed!");
        } catch (java.lang.Exception e) {
            throw new java.io.IOException("Update store failed!", e);
        }
    }

    @Override // com.liulishuo.okdownload.core.interceptor.Interceptor.Fetch
    public long interceptFetch(com.liulishuo.okdownload.core.download.DownloadChain downloadChain) throws java.io.IOException {
        long responseContentLength = downloadChain.getResponseContentLength();
        int blockIndex = downloadChain.getBlockIndex();
        boolean z = responseContentLength != -1;
        long j = 0;
        com.liulishuo.okdownload.core.file.MultiPointOutputStream outputStream = downloadChain.getOutputStream();
        while (true) {
            try {
                long loopFetch = downloadChain.loopFetch();
                if (loopFetch == -1) {
                    break;
                }
                j += loopFetch;
            } finally {
                downloadChain.flushNoCallbackIncreaseBytes();
                if (!downloadChain.getCache().isUserCanceled()) {
                    outputStream.done(blockIndex);
                }
            }
        }
        if (z) {
            outputStream.inspectComplete(blockIndex);
            if (j != responseContentLength) {
                throw new java.io.IOException("Fetch-length isn't equal to the response content-length, " + j + "!= " + responseContentLength);
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    long getExactContentLengthRangeFrom0(com.liulishuo.okdownload.core.connection.DownloadConnection.Connected r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Content-Range"
            java.lang.String r0 = r7.getResponseHeaderField(r0)
            boolean r1 = com.liulishuo.okdownload.core.Util.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L1a
            long r0 = getRangeRightFromContentRange(r0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1a
            r4 = 1
            long r0 = r0 + r4
            goto L1c
        L1a:
            r0 = -1
        L1c:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L30
            java.lang.String r2 = "Content-Length"
            java.lang.String r7 = r7.getResponseHeaderField(r2)
            boolean r2 = com.liulishuo.okdownload.core.Util.isEmpty(r7)
            if (r2 != 0) goto L30
            long r0 = java.lang.Long.parseLong(r7)
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.okdownload.core.interceptor.BreakpointInterceptor.getExactContentLengthRangeFrom0(com.liulishuo.okdownload.core.connection.DownloadConnection$Connected):long");
    }

    static long getRangeRightFromContentRange(java.lang.String str) {
        java.util.regex.Matcher matcher = CONTENT_RANGE_RIGHT_VALUE.matcher(str);
        if (matcher.find()) {
            return java.lang.Long.parseLong(matcher.group(1));
        }
        return -1L;
    }
}
