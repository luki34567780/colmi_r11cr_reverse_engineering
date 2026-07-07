package com.qcwireless.qcwatch.ui.base.repository.watchface;

/* compiled from: QueueIndexPageListener.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J0\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/watchface/QueueIndexPageListener;", "Lcom/liulishuo/okdownload/core/listener/DownloadListener1;", "()V", "watchFaceIndexDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcWatchFaceIndexDao;", "connected", "", "task", "Lcom/liulishuo/okdownload/DownloadTask;", "blockCount", "", "currentOffset", "", "totalLength", "progress", "retry", "cause", "Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;", "taskEnd", "Lcom/liulishuo/okdownload/core/cause/EndCause;", "realCause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "model", "Lcom/liulishuo/okdownload/core/listener/assist/Listener1Assist$Listener1Model;", "taskStart", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QueueIndexPageListener extends com.liulishuo.okdownload.core.listener.DownloadListener1 {
    private static final java.lang.String TAG = "QueueIndexPageListener";
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceIndexDao watchFaceIndexDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcWatchFaceIndexDao();

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public void connected(com.liulishuo.okdownload.DownloadTask task, int blockCount, long currentOffset, long totalLength) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public void progress(com.liulishuo.okdownload.DownloadTask task, long currentOffset, long totalLength) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public void taskStart(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public void retry(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.ResumeFailedCause cause) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, task.getTag() + "---" + cause);
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public void taskEnd(final com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.EndCause cause, java.lang.Exception realCause, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
        if (cause == com.liulishuo.okdownload.core.cause.EndCause.COMPLETED) {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.watchface.QueueIndexPageListener, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.watchface.QueueIndexPageListener$taskEnd$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.base.repository.watchface.QueueIndexPageListener) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.base.repository.watchface.QueueIndexPageListener queueIndexPageListener) {
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceIndexDao qcWatchFaceIndexDao;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceIndexDao qcWatchFaceIndexDao2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queueIndexPageListener, "$this$ktxRunOnBgSingle");
                    java.lang.String substringAfter$default = kotlin.text.StringsKt.substringAfter$default(com.liulishuo.okdownload.DownloadTask.this.getTag().toString(), "temp_", (java.lang.String) null, 2, (java.lang.Object) null);
                    com.blankj.utilcode.util.FileUtils.rename(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getWatchFaceDirFile().getAbsolutePath() + '/' + com.liulishuo.okdownload.DownloadTask.this.getTag(), substringAfter$default);
                    qcWatchFaceIndexDao = queueIndexPageListener.watchFaceIndexDao;
                    com.qcwireless.qcwatch.ui.base.repository.entity.WatchFaceIndexEntity queryWatchFaceByName = qcWatchFaceIndexDao.queryWatchFaceByName(substringAfter$default);
                    if (queryWatchFaceByName != null) {
                        queryWatchFaceByName.setLocalBinUrl(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getWatchFaceDirFile().getAbsolutePath() + '/' + substringAfter$default);
                        qcWatchFaceIndexDao2 = queueIndexPageListener.watchFaceIndexDao;
                        qcWatchFaceIndexDao2.insert(queryWatchFaceByName);
                    }
                }
            });
            return;
        }
        try {
            com.qcwireless.qcwatch.base.utils.FileUtils fileUtils = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE;
            java.io.File file = task.getFile();
            fileUtils.deleteFile(java.lang.String.valueOf(file != null ? file.getAbsolutePath() : null));
        } catch (java.lang.Exception unused) {
        }
    }
}
