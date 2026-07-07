package com.liulishuo.okdownload.core.listener;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class DownloadListener3 extends com.liulishuo.okdownload.core.listener.DownloadListener1 {
    protected abstract void canceled(com.liulishuo.okdownload.DownloadTask downloadTask);

    protected abstract void completed(com.liulishuo.okdownload.DownloadTask downloadTask);

    protected abstract void error(com.liulishuo.okdownload.DownloadTask downloadTask, java.lang.Exception exc);

    protected abstract void started(com.liulishuo.okdownload.DownloadTask downloadTask);

    protected abstract void warn(com.liulishuo.okdownload.DownloadTask downloadTask);

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public final void taskStart(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model listener1Model) {
        started(downloadTask);
    }

    /* renamed from: com.liulishuo.okdownload.core.listener.DownloadListener3$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause;

        static {
            int[] iArr = new int[com.liulishuo.okdownload.core.cause.EndCause.values().length];
            $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause = iArr;
            try {
                iArr[com.liulishuo.okdownload.core.cause.EndCause.COMPLETED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause[com.liulishuo.okdownload.core.cause.EndCause.CANCELED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause[com.liulishuo.okdownload.core.cause.EndCause.ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause[com.liulishuo.okdownload.core.cause.EndCause.PRE_ALLOCATE_FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause[com.liulishuo.okdownload.core.cause.EndCause.FILE_BUSY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause[com.liulishuo.okdownload.core.cause.EndCause.SAME_TASK_BUSY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model listener1Model) {
        switch (com.liulishuo.okdownload.core.listener.DownloadListener3.AnonymousClass1.$SwitchMap$com$liulishuo$okdownload$core$cause$EndCause[endCause.ordinal()]) {
            case 1:
                completed(downloadTask);
                break;
            case 2:
                canceled(downloadTask);
                break;
            case 3:
            case 4:
                error(downloadTask, exc);
                break;
            case 5:
            case 6:
                warn(downloadTask);
                break;
            default:
                com.liulishuo.okdownload.core.Util.w("DownloadListener3", "Don't support " + endCause);
                break;
        }
    }
}
