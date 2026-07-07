package com.liulishuo.okdownload.kotlin.listener;

/* compiled from: DownloadContextListenerExtension.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a±\u0001\u0010\u0000\u001a\u00020\u00012\u0081\u0001\b\u0002\u0010\u0002\u001a{\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003j\u0004\u0018\u0001`\u00112%\u0010\u0012\u001a!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u0014*@\u0010\u0012\"\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00100\u00132\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00100\u0013*ì\u0001\u0010\u0002\"s\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u00032s\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0003¨\u0006\u0015"}, d2 = {"createDownloadContextListener", "Lcom/liulishuo/okdownload/DownloadContextListener;", "onQueueTaskEnd", "Lkotlin/Function5;", "Lcom/liulishuo/okdownload/DownloadContext;", "Lkotlin/ParameterName;", "name", "context", "Lcom/liulishuo/okdownload/DownloadTask;", "task", "Lcom/liulishuo/okdownload/core/cause/EndCause;", "cause", "Ljava/lang/Exception;", "realException", "", "remainCount", "", "Lcom/liulishuo/okdownload/kotlin/listener/onQueueTaskEnd;", "onQueueEnd", "Lkotlin/Function1;", "Lcom/liulishuo/okdownload/kotlin/listener/onQueueEnd;", "kotlin_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: /tmp/dex/classes2.dex */
public final class DownloadContextListenerExtensionKt {
    public static /* synthetic */ com.liulishuo.okdownload.DownloadContextListener createDownloadContextListener$default(kotlin.jvm.functions.Function5 function5, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function5 = null;
        }
        return createDownloadContextListener(function5, function1);
    }

    public static final com.liulishuo.okdownload.DownloadContextListener createDownloadContextListener(final kotlin.jvm.functions.Function5<? super com.liulishuo.okdownload.DownloadContext, ? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, ? super java.lang.Integer, kotlin.Unit> function5, final kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadContext, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function1, "onQueueEnd");
        return new com.liulishuo.okdownload.DownloadContextListener() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadContextListenerExtensionKt$createDownloadContextListener$1
            @Override // com.liulishuo.okdownload.DownloadContextListener
            public void taskEnd(com.liulishuo.okdownload.DownloadContext context, com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.EndCause cause, java.lang.Exception realCause, int remainCount) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cause, "cause");
                kotlin.jvm.functions.Function5 function52 = function5;
                if (function52 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.DownloadContextListener
            public void queueEnd(com.liulishuo.okdownload.DownloadContext context) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
                function1.invoke(context);
            }
        };
    }
}
