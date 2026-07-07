package com.liulishuo.okdownload.kotlin.listener;

/* compiled from: DownloadListener3Extension.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¤\u0004\u0010\u0000\u001a\u00020\u00012+\b\u0002\u0010\u0002\u001a%\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003j\u0004\u0018\u0001`\t2j\b\u0002\u0010\n\u001ad\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112U\b\u0002\u0010\u0012\u001aO\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142+\b\u0002\u0010\u0015\u001a%\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003j\u0004\u0018\u0001`\u00162+\b\u0002\u0010\u0017\u001a%\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003j\u0004\u0018\u0001`\u00182+\b\u0002\u0010\u0019\u001a%\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003j\u0004\u0018\u0001`\u001a2@\b\u0002\u0010\u001b\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u001cj\u0004\u0018\u0001`\u001f2S\b\u0002\u0010 \u001aM\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012&\u0012$0!j\u0011`\"¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(#¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\b\u0018\u00010\u001cj\u0004\u0018\u0001`$2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0&*%\u0010\u0017\"\u0002`'2\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003*%\u0010\u0015\"\u0002`'2\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003*}\u0010 \"2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u0011`\"¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\b0\u001c2E\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012&\u0012$0!j\u0011`\"¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(#¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\b0\u001c*%\u0010\u0002\"\u0002`'2\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003*%\u0010\u0019\"\u0002`'2\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003*@\u0010(\"\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¨\u0006)"}, d2 = {"createListener3", "Lcom/liulishuo/okdownload/core/listener/DownloadListener3;", "onStarted", "Lkotlin/Function1;", "Lcom/liulishuo/okdownload/DownloadTask;", "Lkotlin/ParameterName;", "name", "task", "", "Lcom/liulishuo/okdownload/kotlin/listener/onStarted;", "onConnected", "Lkotlin/Function4;", "", "blockCount", "", "currentOffset", "totalLength", "Lcom/liulishuo/okdownload/kotlin/listener/onConnected;", "onProgress", "Lkotlin/Function3;", "Lcom/liulishuo/okdownload/kotlin/listener/onProgress;", "onCompleted", "Lcom/liulishuo/okdownload/kotlin/listener/onCompleted;", "onCanceled", "Lcom/liulishuo/okdownload/kotlin/listener/onCanceled;", "onWarn", "Lcom/liulishuo/okdownload/kotlin/listener/onWarn;", "onRetry", "Lkotlin/Function2;", "Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;", "cause", "Lcom/liulishuo/okdownload/kotlin/listener/onRetry;", "onError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Lcom/liulishuo/okdownload/kotlin/listener/onError;", "onTerminal", "Lkotlin/Function0;", "Lcom/liulishuo/okdownload/kotlin/listener/taskCallback;", "taskCallback", "kotlin_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: /tmp/dex/classes2.dex */
public final class DownloadListener3ExtensionKt {
    public static /* synthetic */ com.liulishuo.okdownload.core.listener.DownloadListener3 createListener3$default(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function15;
        kotlin.jvm.functions.Function4 function42;
        kotlin.jvm.functions.Function3 function32;
        kotlin.jvm.functions.Function1 function16;
        kotlin.jvm.functions.Function1 function17;
        kotlin.jvm.functions.Function1 function18;
        kotlin.jvm.functions.Function2 function23;
        kotlin.jvm.functions.Function2 function24 = null;
        if ((i & 1) != 0) {
            function15 = null;
        } else {
            function15 = function1;
        }
        if ((i & 2) != 0) {
            function42 = null;
        } else {
            function42 = function4;
        }
        if ((i & 4) != 0) {
            function32 = null;
        } else {
            function32 = function3;
        }
        if ((i & 8) != 0) {
            function16 = null;
        } else {
            function16 = function12;
        }
        if ((i & 16) != 0) {
            function17 = null;
        } else {
            function17 = function13;
        }
        if ((i & 32) != 0) {
            function18 = null;
        } else {
            function18 = function14;
        }
        if ((i & 64) != 0) {
            function23 = null;
        } else {
            function23 = function2;
        }
        if ((i & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4) != 0) {
        } else {
            function24 = function22;
        }
        return createListener3(function15, function42, function32, function16, function17, function18, function23, function24, (i & 256) != 0 ? new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListener3ExtensionKt$createListener3$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                m97invoke();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m97invoke() {
            }
        } : function0);
    }

    public static final com.liulishuo.okdownload.core.listener.DownloadListener3 createListener3(final kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, final kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function4, final kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> function3, final kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function13, final kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function14, final kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.ResumeFailedCause, kotlin.Unit> function2, final kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Exception, kotlin.Unit> function22, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function0, "onTerminal");
        return new com.liulishuo.okdownload.core.listener.DownloadListener3() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListener3ExtensionKt$createListener3$2
            @Override // com.liulishuo.okdownload.core.listener.DownloadListener3
            protected void warn(com.liulishuo.okdownload.DownloadTask task) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.functions.Function1 function15 = function14;
                if (function15 != null) {
                }
                function0.invoke();
            }

            @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
            public void retry(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.ResumeFailedCause cause) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cause, "cause");
                kotlin.jvm.functions.Function2 function23 = function2;
                if (function23 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
            public void connected(com.liulishuo.okdownload.DownloadTask task, int blockCount, long currentOffset, long totalLength) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.functions.Function4 function42 = function4;
                if (function42 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.core.listener.DownloadListener3
            protected void started(com.liulishuo.okdownload.DownloadTask task) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.functions.Function1 function15 = function1;
                if (function15 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.core.listener.DownloadListener3
            protected void completed(com.liulishuo.okdownload.DownloadTask task) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.functions.Function1 function15 = function12;
                if (function15 != null) {
                }
                function0.invoke();
            }

            @Override // com.liulishuo.okdownload.core.listener.DownloadListener3
            protected void canceled(com.liulishuo.okdownload.DownloadTask task) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.functions.Function1 function15 = function13;
                if (function15 != null) {
                }
                function0.invoke();
            }

            @Override // com.liulishuo.okdownload.core.listener.DownloadListener3
            protected void error(com.liulishuo.okdownload.DownloadTask task, java.lang.Exception e) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(e, "e");
                kotlin.jvm.functions.Function2 function23 = function22;
                if (function23 != null) {
                }
                function0.invoke();
            }

            @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
            public void progress(com.liulishuo.okdownload.DownloadTask task, long currentOffset, long totalLength) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.functions.Function3 function32 = function3;
                if (function32 != null) {
                }
            }
        };
    }
}
