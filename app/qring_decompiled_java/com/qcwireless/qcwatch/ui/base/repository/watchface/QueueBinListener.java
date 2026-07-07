package com.qcwireless.qcwatch.ui.base.repository.watchface;

/* compiled from: QueueBinListener.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J0\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/watchface/QueueBinListener;", "Lcom/liulishuo/okdownload/core/listener/DownloadListener1;", "()V", "watchFaceDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcWatchFaceDao;", "connected", "", "task", "Lcom/liulishuo/okdownload/DownloadTask;", "blockCount", "", "currentOffset", "", "totalLength", "progress", "retry", "cause", "Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;", "taskEnd", "Lcom/liulishuo/okdownload/core/cause/EndCause;", "realCause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "model", "Lcom/liulishuo/okdownload/core/listener/assist/Listener1Assist$Listener1Model;", "taskStart", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class QueueBinListener extends com.liulishuo.okdownload.core.listener.DownloadListener1 {
    private static final java.lang.String TAG = "QueueListener";
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao watchFaceDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcWatchFaceDao();

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public void taskStart(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setDownloadWatchFace(true);
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public void retry(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.ResumeFailedCause cause) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, task.getTag() + "---" + cause);
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public void connected(com.liulishuo.okdownload.DownloadTask task, int blockCount, long currentOffset, long totalLength) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setDownloadWatchFace(true);
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public void progress(com.liulishuo.okdownload.DownloadTask task, long currentOffset, long totalLength) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setDownloadWatchFace(true);
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public void taskEnd(final com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.EndCause cause, java.lang.Exception realCause, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = task.getTag().toString();
        if (cause == com.liulishuo.okdownload.core.cause.EndCause.COMPLETED) {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.watchface.QueueBinListener, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.watchface.QueueBinListener$taskEnd$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.base.repository.watchface.QueueBinListener) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.base.repository.watchface.QueueBinListener queueBinListener) {
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao qcWatchFaceDao;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao qcWatchFaceDao2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queueBinListener, "$this$ktxRunOnBgSingle");
                    kotlin.jvm.internal.Ref.ObjectRef<java.lang.String> objectRef2 = objectRef;
                    objectRef2.element = kotlin.text.StringsKt.substringAfter$default((java.lang.String) objectRef2.element, "temp_", (java.lang.String) null, 2, (java.lang.Object) null);
                    com.blankj.utilcode.util.FileUtils.rename(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getWatchFaceDirFile().getAbsolutePath() + '/' + task.getTag(), (java.lang.String) objectRef.element);
                    qcWatchFaceDao = queueBinListener.watchFaceDao;
                    com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace queryWatchFaceByName = qcWatchFaceDao.queryWatchFaceByName((java.lang.String) objectRef.element, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion());
                    if (queryWatchFaceByName != null) {
                        queryWatchFaceByName.setLocalBinUrl(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getWatchFaceDirFile().getAbsolutePath() + '/' + ((java.lang.String) objectRef.element));
                        qcWatchFaceDao2 = queueBinListener.watchFaceDao;
                        qcWatchFaceDao2.insert(queryWatchFaceByName);
                    }
                }
            });
        } else if (cause == com.liulishuo.okdownload.core.cause.EndCause.ERROR) {
            try {
                com.qcwireless.qcwatch.base.utils.FileUtils fileUtils = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE;
                java.io.File file = task.getFile();
                fileUtils.deleteFile(java.lang.String.valueOf(file != null ? file.getAbsolutePath() : null));
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
