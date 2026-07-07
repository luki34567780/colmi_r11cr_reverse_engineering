package com.liulishuo.okdownload.kotlin.listener;

/* compiled from: DownloadListener2Extension.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0082\u0001\u0010\u0000\u001a\u00020\u00012'\b\u0002\u0010\u0002\u001a!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t2Q\u0010\n\u001aM\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b0\u000bj\u0002`\u0010¨\u0006\u0011"}, d2 = {"createListener2", "Lcom/liulishuo/okdownload/core/listener/DownloadListener2;", "onTaskStart", "Lkotlin/Function1;", "Lcom/liulishuo/okdownload/DownloadTask;", "Lkotlin/ParameterName;", "name", "task", "", "Lcom/liulishuo/okdownload/kotlin/listener/onTaskStart;", "onTaskEnd", "Lkotlin/Function3;", "Lcom/liulishuo/okdownload/core/cause/EndCause;", "cause", "Ljava/lang/Exception;", "realCause", "Lcom/liulishuo/okdownload/kotlin/listener/onTaskEnd;", "kotlin_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: /tmp/dex/classes2.dex */
public final class DownloadListener2ExtensionKt {
    public static /* synthetic */ com.liulishuo.okdownload.core.listener.DownloadListener2 createListener2$default(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<com.liulishuo.okdownload.DownloadTask, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListener2ExtensionKt$createListener2$1
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj2);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "it");
                }
            };
        }
        return createListener2(function1, function3);
    }

    public static final com.liulishuo.okdownload.core.listener.DownloadListener2 createListener2(final kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, final kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, kotlin.Unit> function3) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function1, "onTaskStart");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function3, "onTaskEnd");
        return new com.liulishuo.okdownload.core.listener.DownloadListener2() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListener2ExtensionKt$createListener2$2
            @Override // com.liulishuo.okdownload.DownloadListener
            public void taskStart(com.liulishuo.okdownload.DownloadTask task) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                function1.invoke(task);
            }

            @Override // com.liulishuo.okdownload.DownloadListener
            public void taskEnd(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.EndCause cause, java.lang.Exception realCause) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cause, "cause");
                function3.invoke(task, cause, realCause);
            }
        };
    }
}
