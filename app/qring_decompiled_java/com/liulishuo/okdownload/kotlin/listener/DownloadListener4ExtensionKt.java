package com.liulishuo.okdownload.kotlin.listener;

/* compiled from: DownloadListener4Extension.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aó\u0005\u0010\u0000\u001a\u00020\u00012+\b\u0002\u0010\u0002\u001a%\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003j\u0004\u0018\u0001`\t2g\b\u0002\u0010\n\u001aa\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012%\u0012#\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00100\u000e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bj\u0004\u0018\u0001`\u00122|\b\u0002\u0010\u0013\u001av\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012%\u0012#\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00100\u000e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0014j\u0004\u0018\u0001`\u00172j\b\u0002\u0010\u0018\u001ad\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u0014j\u0004\u0018\u0001`\u001f2U\b\u0002\u0010 \u001aO\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bj\u0004\u0018\u0001`#2@\b\u0002\u0010$\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\b\u0018\u00010%j\u0004\u0018\u0001`'2U\b\u0002\u0010(\u001aO\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bj\u0004\u0018\u0001`*2{\u0010+\u001aw\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110,¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(-\u0012*\u0012(\u0018\u00010.j\u0013\u0018\u0001`/¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(0¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u0014j\u0002`1*\u0094\u0001\u0010(\"G\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b0\u000b2G\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110)¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\b0\u000b*¾\u0001\u0010\u0018\"\\\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u00142\\\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u0014*\u0094\u0001\u0010 \"G\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\b0\u000b2G\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\b0\u000b*j\u0010$\"2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\b0%22\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\b0%*×\u0001\u0010+\"^\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110,¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(-\u0012\u0015\u0012\u0013\u0018\u0001`/¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u00142s\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110,¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(-\u0012*\u0012(\u0018\u00010.j\u0013\u0018\u0001`/¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(0¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\b0\u0014¨\u00062"}, d2 = {"createListener4", "Lcom/liulishuo/okdownload/core/listener/DownloadListener4;", "onTaskStart", "Lkotlin/Function1;", "Lcom/liulishuo/okdownload/DownloadTask;", "Lkotlin/ParameterName;", "name", "task", "", "Lcom/liulishuo/okdownload/kotlin/listener/onTaskStart;", "onConnectStart", "Lkotlin/Function3;", "", "blockIndex", "", "", "", "requestHeaderFields", "Lcom/liulishuo/okdownload/kotlin/listener/onConnectStart;", "onConnectEnd", "Lkotlin/Function4;", "responseCode", "responseHeaderFields", "Lcom/liulishuo/okdownload/kotlin/listener/onConnectEnd;", "onInfoReady", "Lcom/liulishuo/okdownload/core/breakpoint/BreakpointInfo;", "info", "", "fromBreakpoint", "Lcom/liulishuo/okdownload/core/listener/assist/Listener4Assist$Listener4Model;", "model", "Lcom/liulishuo/okdownload/kotlin/listener/onInfoReady;", "onProgressBlock", "", "currentBlockOffset", "Lcom/liulishuo/okdownload/kotlin/listener/onProgressBlock;", "onProgressWithoutTotalLength", "Lkotlin/Function2;", "currentOffset", "Lcom/liulishuo/okdownload/kotlin/listener/onProgressWithoutTotalLength;", "onBlockEnd", "Lcom/liulishuo/okdownload/core/breakpoint/BlockInfo;", "Lcom/liulishuo/okdownload/kotlin/listener/onBlockEnd;", "onTaskEndWithListener4Model", "Lcom/liulishuo/okdownload/core/cause/EndCause;", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "realCause", "Lcom/liulishuo/okdownload/kotlin/listener/onTaskEndWithListener4Model;", "kotlin_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: /tmp/dex/classes2.dex */
public final class DownloadListener4ExtensionKt {
    public static /* synthetic */ com.liulishuo.okdownload.core.listener.DownloadListener4 createListener4$default(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function4 function42, kotlin.jvm.functions.Function3 function32, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function33, kotlin.jvm.functions.Function4 function43, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.functions.Function3 function34;
        kotlin.jvm.functions.Function4 function44;
        kotlin.jvm.functions.Function4 function45;
        kotlin.jvm.functions.Function3 function35;
        kotlin.jvm.functions.Function2 function22;
        kotlin.jvm.functions.Function3 function36;
        if ((i & 1) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if ((i & 2) != 0) {
            function34 = null;
        } else {
            function34 = function3;
        }
        if ((i & 4) != 0) {
            function44 = null;
        } else {
            function44 = function4;
        }
        if ((i & 8) != 0) {
            function45 = null;
        } else {
            function45 = function42;
        }
        if ((i & 16) != 0) {
            function35 = null;
        } else {
            function35 = function32;
        }
        if ((i & 32) != 0) {
            function22 = null;
        } else {
            function22 = function2;
        }
        if ((i & 64) != 0) {
            function36 = null;
        } else {
            function36 = function33;
        }
        return createListener4(function12, function34, function44, function45, function35, function22, function36, function43);
    }

    public static final com.liulishuo.okdownload.core.listener.DownloadListener4 createListener4(final kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, final kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function3, final kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function4, final kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, ? super java.lang.Boolean, ? super com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model, kotlin.Unit> function42, final kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function32, final kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Long, kotlin.Unit> function2, final kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super com.liulishuo.okdownload.core.breakpoint.BlockInfo, kotlin.Unit> function33, final kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, ? super com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model, kotlin.Unit> function43) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function43, "onTaskEndWithListener4Model");
        return new com.liulishuo.okdownload.core.listener.DownloadListener4() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListener4ExtensionKt$createListener4$1
            @Override // com.liulishuo.okdownload.DownloadListener
            public void taskStart(com.liulishuo.okdownload.DownloadTask task) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.functions.Function1 function12 = function1;
                if (function12 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback
            public void infoReady(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info, boolean fromBreakpoint, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model model) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(info, "info");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(model, "model");
                kotlin.jvm.functions.Function4 function44 = function42;
                if (function44 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback
            public void progressBlock(com.liulishuo.okdownload.DownloadTask task, int blockIndex, long currentBlockOffset) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.functions.Function3 function34 = function32;
                if (function34 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback
            public void progress(com.liulishuo.okdownload.DownloadTask task, long currentOffset) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.functions.Function2 function22 = function2;
                if (function22 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback
            public void blockEnd(com.liulishuo.okdownload.DownloadTask task, int blockIndex, com.liulishuo.okdownload.core.breakpoint.BlockInfo info) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(info, "info");
                kotlin.jvm.functions.Function3 function34 = function33;
                if (function34 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Callback
            public void taskEnd(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.EndCause cause, java.lang.Exception realCause, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model model) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cause, "cause");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(model, "model");
                function43.invoke(task, cause, realCause, model);
            }

            @Override // com.liulishuo.okdownload.DownloadListener
            public void connectStart(com.liulishuo.okdownload.DownloadTask task, int blockIndex, java.util.Map<java.lang.String, java.util.List<java.lang.String>> requestHeaderFields) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(requestHeaderFields, "requestHeaderFields");
                kotlin.jvm.functions.Function3 function34 = function3;
                if (function34 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.DownloadListener
            public void connectEnd(com.liulishuo.okdownload.DownloadTask task, int blockIndex, int responseCode, java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaderFields) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(responseHeaderFields, "responseHeaderFields");
                kotlin.jvm.functions.Function4 function44 = function4;
                if (function44 != null) {
                }
            }
        };
    }
}
