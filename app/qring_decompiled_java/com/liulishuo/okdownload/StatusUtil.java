package com.liulishuo.okdownload;

/* loaded from: /tmp/dex/classes2.dex */
public class StatusUtil {

    public enum Status {
        PENDING,
        RUNNING,
        COMPLETED,
        IDLE,
        UNKNOWN
    }

    public static boolean isSameTaskPendingOrRunning(com.liulishuo.okdownload.DownloadTask downloadTask) {
        return com.liulishuo.okdownload.OkDownload.with().downloadDispatcher().findSameTask(downloadTask) != null;
    }

    public static com.liulishuo.okdownload.StatusUtil.Status getStatus(com.liulishuo.okdownload.DownloadTask downloadTask) {
        com.liulishuo.okdownload.StatusUtil.Status isCompletedOrUnknown = isCompletedOrUnknown(downloadTask);
        if (isCompletedOrUnknown == com.liulishuo.okdownload.StatusUtil.Status.COMPLETED) {
            return com.liulishuo.okdownload.StatusUtil.Status.COMPLETED;
        }
        com.liulishuo.okdownload.core.dispatcher.DownloadDispatcher downloadDispatcher = com.liulishuo.okdownload.OkDownload.with().downloadDispatcher();
        return downloadDispatcher.isPending(downloadTask) ? com.liulishuo.okdownload.StatusUtil.Status.PENDING : downloadDispatcher.isRunning(downloadTask) ? com.liulishuo.okdownload.StatusUtil.Status.RUNNING : isCompletedOrUnknown;
    }

    public static com.liulishuo.okdownload.StatusUtil.Status getStatus(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return getStatus(createFinder(str, str2, str3));
    }

    public static boolean isCompleted(com.liulishuo.okdownload.DownloadTask downloadTask) {
        return isCompletedOrUnknown(downloadTask) == com.liulishuo.okdownload.StatusUtil.Status.COMPLETED;
    }

    public static com.liulishuo.okdownload.StatusUtil.Status isCompletedOrUnknown(com.liulishuo.okdownload.DownloadTask downloadTask) {
        com.liulishuo.okdownload.core.breakpoint.BreakpointStore breakpointStore = com.liulishuo.okdownload.OkDownload.with().breakpointStore();
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo = breakpointStore.get(downloadTask.getId());
        java.lang.String filename = downloadTask.getFilename();
        java.io.File parentFile = downloadTask.getParentFile();
        java.io.File file = downloadTask.getFile();
        if (breakpointInfo != null) {
            if (!breakpointInfo.isChunked() && breakpointInfo.getTotalLength() <= 0) {
                return com.liulishuo.okdownload.StatusUtil.Status.UNKNOWN;
            }
            if (file != null && file.equals(breakpointInfo.getFile()) && file.exists() && breakpointInfo.getTotalOffset() == breakpointInfo.getTotalLength()) {
                return com.liulishuo.okdownload.StatusUtil.Status.COMPLETED;
            }
            if (filename == null && breakpointInfo.getFile() != null && breakpointInfo.getFile().exists()) {
                return com.liulishuo.okdownload.StatusUtil.Status.IDLE;
            }
            if (file != null && file.equals(breakpointInfo.getFile()) && file.exists()) {
                return com.liulishuo.okdownload.StatusUtil.Status.IDLE;
            }
        } else {
            if (breakpointStore.isOnlyMemoryCache() || breakpointStore.isFileDirty(downloadTask.getId())) {
                return com.liulishuo.okdownload.StatusUtil.Status.UNKNOWN;
            }
            if (file != null && file.exists()) {
                return com.liulishuo.okdownload.StatusUtil.Status.COMPLETED;
            }
            java.lang.String responseFilename = breakpointStore.getResponseFilename(downloadTask.getUrl());
            if (responseFilename != null && new java.io.File(parentFile, responseFilename).exists()) {
                return com.liulishuo.okdownload.StatusUtil.Status.COMPLETED;
            }
        }
        return com.liulishuo.okdownload.StatusUtil.Status.UNKNOWN;
    }

    public static boolean isCompleted(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return isCompleted(createFinder(str, str2, str3));
    }

    public static com.liulishuo.okdownload.core.breakpoint.BreakpointInfo getCurrentInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return getCurrentInfo(createFinder(str, str2, str3));
    }

    public static com.liulishuo.okdownload.core.breakpoint.BreakpointInfo getCurrentInfo(com.liulishuo.okdownload.DownloadTask downloadTask) {
        com.liulishuo.okdownload.core.breakpoint.BreakpointStore breakpointStore = com.liulishuo.okdownload.OkDownload.with().breakpointStore();
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo = breakpointStore.get(breakpointStore.findOrCreateId(downloadTask));
        if (breakpointInfo == null) {
            return null;
        }
        return breakpointInfo.copy();
    }

    static com.liulishuo.okdownload.DownloadTask createFinder(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new com.liulishuo.okdownload.DownloadTask.Builder(str, str2, str3).build();
    }
}
