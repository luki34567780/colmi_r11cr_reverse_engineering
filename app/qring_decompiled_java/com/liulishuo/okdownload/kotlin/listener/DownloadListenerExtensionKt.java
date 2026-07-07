package com.liulishuo.okdownload.kotlin.listener;

/* compiled from: DownloadListenerExtension.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÈ\u0007\u0010\u0000\u001a\u00020\u00012+\b\u0002\u0010\u0002\u001a%\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003j\u0004\u0018\u0001`\t2R\b\u0002\u0010\n\u001aL\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012%\u0012#\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bj\u0004\u0018\u0001`\u00102g\b\u0002\u0010\u0011\u001aa\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012%\u0012#\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012j\u0004\u0018\u0001`\u00162U\b\u0002\u0010\u0017\u001aO\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012j\u0004\u0018\u0001`\u001c2@\b\u0002\u0010\u001d\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bj\u0004\u0018\u0001`\u001e2g\b\u0002\u0010\u001f\u001aa\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012%\u0012#\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012j\u0004\u0018\u0001`!2|\b\u0002\u0010\"\u001av\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012%\u0012#\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010#j\u0004\u0018\u0001`$2U\b\u0002\u0010%\u001aO\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012\u0013\u0012\u00110&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012j\u0004\u0018\u0001`(2U\b\u0002\u0010)\u001aO\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012\u0013\u0012\u00110&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012j\u0004\u0018\u0001`+2U\b\u0002\u0010,\u001aO\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012\u0013\u0012\u00110&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012j\u0004\u0018\u0001`-2Q\u0010.\u001aM\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110/¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001b\u0012\u0015\u0012\u0013\u0018\u000100¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\b0\u0012j\u0002`2\u001a\n\u00103\u001a\u00020\u0001*\u00020\u0001*â\u0001\u0010\"\"n\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012%\u0012#\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\b0#2n\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012%\u0012#\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\b0#*¸\u0001\u0010\u001f\"Y\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012%\u0012#\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b0\u00122Y\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012%\u0012#\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b0\u0012*¸\u0001\u0010\u0011\"Y\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012%\u0012#\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\b0\u00122Y\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012%\u0012#\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\b0\u0012*\u008e\u0001\u0010\n\"D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012%\u0012#\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b0\u000b2D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012%\u0012#\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b0\u000b*\u0094\u0001\u0010\u0017\"G\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\b0\u00122G\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\b0\u0012*j\u0010\u001d\"2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\b0\u000b22\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\b0\u000b*O\u0010,\"\u0002`(2G\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012\u0013\u0012\u00110&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\b0\u0012*\u0094\u0001\u0010)\"G\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012\u0013\u0012\u00110&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\b0\u00122G\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012\u0013\u0012\u00110&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\b0\u0012*\u0094\u0001\u0010%\"G\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012\u0013\u0012\u00110&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\b0\u00122G\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b( \u0012\u0013\u0012\u00110&¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\b0\u0012*\u0098\u0001\u0010.\"I\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110/¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001b\u0012\u0015\u0012\u0013\u0018\u000100¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\b0\u00122I\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110/¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001b\u0012\u0015\u0012\u0013\u0018\u000100¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\b0\u0012*@\u0010\u0002\"\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¨\u00064"}, d2 = {"createListener", "Lcom/liulishuo/okdownload/DownloadListener;", "onTaskStart", "Lkotlin/Function1;", "Lcom/liulishuo/okdownload/DownloadTask;", "Lkotlin/ParameterName;", "name", "task", "", "Lcom/liulishuo/okdownload/kotlin/listener/onTaskStart;", "onConnectTrialStart", "Lkotlin/Function2;", "", "", "", "requestHeaderFields", "Lcom/liulishuo/okdownload/kotlin/listener/onConnectTrialStart;", "onConnectTrialEnd", "Lkotlin/Function3;", "", "responseCode", "responseHeaderFields", "Lcom/liulishuo/okdownload/kotlin/listener/onConnectTrialEnd;", "onDownloadFromBeginning", "Lcom/liulishuo/okdownload/core/breakpoint/BreakpointInfo;", "info", "Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;", "cause", "Lcom/liulishuo/okdownload/kotlin/listener/onDownloadFromBeginning;", "onDownloadFromBreakpoint", "Lcom/liulishuo/okdownload/kotlin/listener/onDownloadFromBreakpoint;", "onConnectStart", "blockIndex", "Lcom/liulishuo/okdownload/kotlin/listener/onConnectStart;", "onConnectEnd", "Lkotlin/Function4;", "Lcom/liulishuo/okdownload/kotlin/listener/onConnectEnd;", "onFetchStart", "", "contentLength", "Lcom/liulishuo/okdownload/kotlin/listener/onFetchStart;", "onFetchProgress", "increaseBytes", "Lcom/liulishuo/okdownload/kotlin/listener/onFetchProgress;", "onFetchEnd", "Lcom/liulishuo/okdownload/kotlin/listener/onFetchEnd;", "onTaskEnd", "Lcom/liulishuo/okdownload/core/cause/EndCause;", "Ljava/lang/Exception;", "realCause", "Lcom/liulishuo/okdownload/kotlin/listener/onTaskEnd;", "switchToExceptProgressListener", "kotlin_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: /tmp/dex/classes2.dex */
public final class DownloadListenerExtensionKt {
    public static /* synthetic */ com.liulishuo.okdownload.DownloadListener createListener$default(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function3 function32, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function3 function33, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function3 function34, kotlin.jvm.functions.Function3 function35, kotlin.jvm.functions.Function3 function36, kotlin.jvm.functions.Function3 function37, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function12;
        kotlin.jvm.functions.Function2 function23;
        kotlin.jvm.functions.Function3 function38;
        kotlin.jvm.functions.Function3 function39;
        kotlin.jvm.functions.Function2 function24;
        kotlin.jvm.functions.Function3 function310;
        kotlin.jvm.functions.Function4 function42;
        kotlin.jvm.functions.Function3 function311;
        kotlin.jvm.functions.Function3 function312;
        kotlin.jvm.functions.Function3 function313;
        if ((i & 1) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if ((i & 2) != 0) {
            function23 = null;
        } else {
            function23 = function2;
        }
        if ((i & 4) != 0) {
            function38 = null;
        } else {
            function38 = function3;
        }
        if ((i & 8) != 0) {
            function39 = null;
        } else {
            function39 = function32;
        }
        if ((i & 16) != 0) {
            function24 = null;
        } else {
            function24 = function22;
        }
        if ((i & 32) != 0) {
            function310 = null;
        } else {
            function310 = function33;
        }
        if ((i & 64) != 0) {
            function42 = null;
        } else {
            function42 = function4;
        }
        if ((i & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4) != 0) {
            function311 = null;
        } else {
            function311 = function34;
        }
        if ((i & 256) != 0) {
            function312 = null;
        } else {
            function312 = function35;
        }
        if ((i & 512) != 0) {
            function313 = null;
        } else {
            function313 = function36;
        }
        return createListener(function12, function23, function38, function39, function24, function310, function42, function311, function312, function313, function37);
    }

    public static final com.liulishuo.okdownload.DownloadListener createListener(final kotlin.jvm.functions.Function1<? super com.liulishuo.okdownload.DownloadTask, kotlin.Unit> function1, final kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function2, final kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function3, final kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, ? super com.liulishuo.okdownload.core.cause.ResumeFailedCause, kotlin.Unit> function32, final kotlin.jvm.functions.Function2<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, kotlin.Unit> function22, final kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function33, final kotlin.jvm.functions.Function4<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>, kotlin.Unit> function4, final kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function34, final kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function35, final kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> function36, final kotlin.jvm.functions.Function3<? super com.liulishuo.okdownload.DownloadTask, ? super com.liulishuo.okdownload.core.cause.EndCause, ? super java.lang.Exception, kotlin.Unit> function37) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function37, "onTaskEnd");
        return new com.liulishuo.okdownload.DownloadListener() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$createListener$1
            @Override // com.liulishuo.okdownload.DownloadListener
            public void taskStart(com.liulishuo.okdownload.DownloadTask task) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.functions.Function1 function12 = function1;
                if (function12 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.DownloadListener
            public void connectTrialStart(com.liulishuo.okdownload.DownloadTask task, java.util.Map<java.lang.String, java.util.List<java.lang.String>> requestHeaderFields) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(requestHeaderFields, "requestHeaderFields");
                kotlin.jvm.functions.Function2 function23 = function2;
                if (function23 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.DownloadListener
            public void connectTrialEnd(com.liulishuo.okdownload.DownloadTask task, int responseCode, java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaderFields) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(responseHeaderFields, "responseHeaderFields");
                kotlin.jvm.functions.Function3 function38 = function3;
                if (function38 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.DownloadListener
            public void downloadFromBeginning(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info, com.liulishuo.okdownload.core.cause.ResumeFailedCause cause) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(info, "info");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cause, "cause");
                kotlin.jvm.functions.Function3 function38 = function32;
                if (function38 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.DownloadListener
            public void downloadFromBreakpoint(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(info, "info");
                kotlin.jvm.functions.Function2 function23 = function22;
                if (function23 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.DownloadListener
            public void connectStart(com.liulishuo.okdownload.DownloadTask task, int blockIndex, java.util.Map<java.lang.String, java.util.List<java.lang.String>> requestHeaderFields) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(requestHeaderFields, "requestHeaderFields");
                kotlin.jvm.functions.Function3 function38 = function33;
                if (function38 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.DownloadListener
            public void connectEnd(com.liulishuo.okdownload.DownloadTask task, int blockIndex, int responseCode, java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaderFields) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(responseHeaderFields, "responseHeaderFields");
                kotlin.jvm.functions.Function4 function42 = function4;
                if (function42 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.DownloadListener
            public void fetchStart(com.liulishuo.okdownload.DownloadTask task, int blockIndex, long contentLength) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.functions.Function3 function38 = function34;
                if (function38 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.DownloadListener
            public void fetchProgress(com.liulishuo.okdownload.DownloadTask task, int blockIndex, long increaseBytes) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.functions.Function3 function38 = function35;
                if (function38 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.DownloadListener
            public void fetchEnd(com.liulishuo.okdownload.DownloadTask task, int blockIndex, long contentLength) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.functions.Function3 function38 = function36;
                if (function38 != null) {
                }
            }

            @Override // com.liulishuo.okdownload.DownloadListener
            public void taskEnd(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.EndCause cause, java.lang.Exception realCause) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(task, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cause, "cause");
                function37.invoke(task, cause, realCause);
            }
        };
    }

    public static final com.liulishuo.okdownload.DownloadListener switchToExceptProgressListener(final com.liulishuo.okdownload.DownloadListener downloadListener) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadListener, "$this$switchToExceptProgressListener");
        if (downloadListener instanceof com.liulishuo.okdownload.core.listener.DownloadListener4WithSpeed) {
            return com.liulishuo.okdownload.kotlin.listener.DownloadListener4WithSpeedExtensionKt.createListener4WithSpeed$default(new kotlin.jvm.functions.Function1<com.liulishuo.okdownload.DownloadTask, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "it");
                    com.liulishuo.okdownload.DownloadListener.this.taskStart(downloadTask);
                }
            }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$2
                {
                    super(3);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) obj3);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(map, "requestHeaderFields");
                    com.liulishuo.okdownload.DownloadListener.this.connectStart(downloadTask, i, map);
                }
            }, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.lang.Integer, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$3
                {
                    super(4);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).intValue(), (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) obj4);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, int i2, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(map, "responseHeaderFields");
                    com.liulishuo.okdownload.DownloadListener.this.connectEnd(downloadTask, i, i2, map);
                }
            }, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, java.lang.Boolean, com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$4
                {
                    super(4);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.breakpoint.BreakpointInfo) obj2, ((java.lang.Boolean) obj3).booleanValue(), (com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel) obj4);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, boolean z, com.liulishuo.okdownload.core.listener.assist.Listener4SpeedAssistExtend.Listener4SpeedModel listener4SpeedModel) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(breakpointInfo, "info");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(listener4SpeedModel, "model");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener4WithSpeed) com.liulishuo.okdownload.DownloadListener.this).infoReady(downloadTask, breakpointInfo, z, listener4SpeedModel);
                }
            }, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.lang.Long, com.liulishuo.okdownload.SpeedCalculator, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$5
                {
                    super(4);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).longValue(), (com.liulishuo.okdownload.SpeedCalculator) obj4);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j, com.liulishuo.okdownload.SpeedCalculator speedCalculator) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(speedCalculator, "blockSpeed");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener4WithSpeed) com.liulishuo.okdownload.DownloadListener.this).progressBlock(downloadTask, i, j, speedCalculator);
                }
            }, null, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, com.liulishuo.okdownload.core.breakpoint.BlockInfo, com.liulishuo.okdownload.SpeedCalculator, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$6
                {
                    super(4);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), (com.liulishuo.okdownload.core.breakpoint.BlockInfo) obj3, (com.liulishuo.okdownload.SpeedCalculator) obj4);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, com.liulishuo.okdownload.core.breakpoint.BlockInfo blockInfo, com.liulishuo.okdownload.SpeedCalculator speedCalculator) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(blockInfo, "info");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(speedCalculator, "blockSpeed");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener4WithSpeed) com.liulishuo.okdownload.DownloadListener.this).blockEnd(downloadTask, i, blockInfo, speedCalculator);
                }
            }, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.cause.EndCause, java.lang.Exception, com.liulishuo.okdownload.SpeedCalculator, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$7
                {
                    super(4);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.cause.EndCause) obj2, (java.lang.Exception) obj3, (com.liulishuo.okdownload.SpeedCalculator) obj4);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc, com.liulishuo.okdownload.SpeedCalculator speedCalculator) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(endCause, "cause");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(speedCalculator, "taskSpeed");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener4WithSpeed) com.liulishuo.okdownload.DownloadListener.this).taskEnd(downloadTask, endCause, exc, speedCalculator);
                }
            }, 32, null);
        }
        if (downloadListener instanceof com.liulishuo.okdownload.core.listener.DownloadListener4) {
            return com.liulishuo.okdownload.kotlin.listener.DownloadListener4ExtensionKt.createListener4$default(new kotlin.jvm.functions.Function1<com.liulishuo.okdownload.DownloadTask, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$8
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "it");
                    com.liulishuo.okdownload.DownloadListener.this.taskStart(downloadTask);
                }
            }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$9
                {
                    super(3);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) obj3);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(map, "requestHeaderFields");
                    com.liulishuo.okdownload.DownloadListener.this.connectStart(downloadTask, i, map);
                }
            }, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.lang.Integer, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$10
                {
                    super(4);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).intValue(), (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) obj4);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, int i2, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(map, "responseHeaderFields");
                    com.liulishuo.okdownload.DownloadListener.this.connectEnd(downloadTask, i, i2, map);
                }
            }, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, java.lang.Boolean, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$11
                {
                    super(4);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.breakpoint.BreakpointInfo) obj2, ((java.lang.Boolean) obj3).booleanValue(), (com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model) obj4);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, boolean z, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(breakpointInfo, "info");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(listener4Model, "model");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener4) com.liulishuo.okdownload.DownloadListener.this).infoReady(downloadTask, breakpointInfo, z, listener4Model);
                }
            }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.lang.Long, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$12
                {
                    super(3);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).longValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener4) com.liulishuo.okdownload.DownloadListener.this).progressBlock(downloadTask, i, j);
                }
            }, null, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, com.liulishuo.okdownload.core.breakpoint.BlockInfo, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$13
                {
                    super(3);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), (com.liulishuo.okdownload.core.breakpoint.BlockInfo) obj3);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, com.liulishuo.okdownload.core.breakpoint.BlockInfo blockInfo) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(blockInfo, "info");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener4) com.liulishuo.okdownload.DownloadListener.this).blockEnd(downloadTask, i, blockInfo);
                }
            }, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.cause.EndCause, java.lang.Exception, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$14
                {
                    super(4);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.cause.EndCause) obj2, (java.lang.Exception) obj3, (com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model) obj4);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc, com.liulishuo.okdownload.core.listener.assist.Listener4Assist.Listener4Model listener4Model) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(endCause, "cause");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(listener4Model, "model");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener4) com.liulishuo.okdownload.DownloadListener.this).taskEnd(downloadTask, endCause, exc, listener4Model);
                }
            }, 32, null);
        }
        if (downloadListener instanceof com.liulishuo.okdownload.core.listener.DownloadListener3) {
            return com.liulishuo.okdownload.kotlin.listener.DownloadListener3ExtensionKt.createListener3$default(new kotlin.jvm.functions.Function1<com.liulishuo.okdownload.DownloadTask, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$15
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "it");
                    com.liulishuo.okdownload.DownloadListener.this.taskStart(downloadTask);
                }
            }, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.lang.Long, java.lang.Long, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$16
                {
                    super(4);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).longValue(), ((java.lang.Number) obj4).longValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j, long j2) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener3) com.liulishuo.okdownload.DownloadListener.this).connected(downloadTask, i, j, j2);
                }
            }, null, new kotlin.jvm.functions.Function1<com.liulishuo.okdownload.DownloadTask, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$17
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "it");
                    com.liulishuo.okdownload.DownloadListener.this.taskEnd(downloadTask, com.liulishuo.okdownload.core.cause.EndCause.COMPLETED, null);
                }
            }, new kotlin.jvm.functions.Function1<com.liulishuo.okdownload.DownloadTask, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$18
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "it");
                    com.liulishuo.okdownload.DownloadListener.this.taskEnd(downloadTask, com.liulishuo.okdownload.core.cause.EndCause.CANCELED, null);
                }
            }, new kotlin.jvm.functions.Function1<com.liulishuo.okdownload.DownloadTask, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$19
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "it");
                    com.liulishuo.okdownload.DownloadListener.this.taskEnd(downloadTask, com.liulishuo.okdownload.core.cause.EndCause.SAME_TASK_BUSY, null);
                }
            }, new kotlin.jvm.functions.Function2<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.cause.ResumeFailedCause, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$20
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.cause.ResumeFailedCause) obj2);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(resumeFailedCause, "cause");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener3) com.liulishuo.okdownload.DownloadListener.this).retry(downloadTask, resumeFailedCause);
                }
            }, new kotlin.jvm.functions.Function2<com.liulishuo.okdownload.DownloadTask, java.lang.Exception, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$21
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, (java.lang.Exception) obj2);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, java.lang.Exception exc) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exc, "e");
                    com.liulishuo.okdownload.DownloadListener.this.taskEnd(downloadTask, com.liulishuo.okdownload.core.cause.EndCause.ERROR, exc);
                }
            }, null, 260, null);
        }
        if (downloadListener instanceof com.liulishuo.okdownload.core.listener.DownloadListener1) {
            return com.liulishuo.okdownload.kotlin.listener.DownloadListener1ExtensionKt.createListener1$default(new kotlin.jvm.functions.Function2<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$22
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model) obj2);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model listener1Model) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(listener1Model, "model");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener1) com.liulishuo.okdownload.DownloadListener.this).taskStart(downloadTask, listener1Model);
                }
            }, new kotlin.jvm.functions.Function2<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.cause.ResumeFailedCause, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$23
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.cause.ResumeFailedCause) obj2);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(resumeFailedCause, "cause");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener1) com.liulishuo.okdownload.DownloadListener.this).retry(downloadTask, resumeFailedCause);
                }
            }, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.lang.Long, java.lang.Long, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$24
                {
                    super(4);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).longValue(), ((java.lang.Number) obj4).longValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j, long j2) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener1) com.liulishuo.okdownload.DownloadListener.this).connected(downloadTask, i, j, j2);
                }
            }, null, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.cause.EndCause, java.lang.Exception, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$25
                {
                    super(4);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.cause.EndCause) obj2, (java.lang.Exception) obj3, (com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model) obj4);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model listener1Model) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(endCause, "cause");
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(listener1Model, "model");
                    ((com.liulishuo.okdownload.core.listener.DownloadListener1) com.liulishuo.okdownload.DownloadListener.this).taskEnd(downloadTask, endCause, exc, listener1Model);
                }
            }, 8, null);
        }
        return downloadListener instanceof com.liulishuo.okdownload.core.listener.DownloadListener2 ? downloadListener : createListener$default(new kotlin.jvm.functions.Function1<com.liulishuo.okdownload.DownloadTask, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$26
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "it");
                com.liulishuo.okdownload.DownloadListener.this.taskStart(downloadTask);
            }
        }, new kotlin.jvm.functions.Function2<com.liulishuo.okdownload.DownloadTask, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$27
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) obj2);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(map, "requestFields");
                com.liulishuo.okdownload.DownloadListener.this.connectTrialStart(downloadTask, map);
            }
        }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$28
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) obj3);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(map, "responseHeaderFields");
                com.liulishuo.okdownload.DownloadListener.this.connectTrialEnd(downloadTask, i, map);
            }
        }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, com.liulishuo.okdownload.core.cause.ResumeFailedCause, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$29
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.breakpoint.BreakpointInfo) obj2, (com.liulishuo.okdownload.core.cause.ResumeFailedCause) obj3);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(breakpointInfo, "info");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(resumeFailedCause, "cause");
                com.liulishuo.okdownload.DownloadListener.this.downloadFromBeginning(downloadTask, breakpointInfo, resumeFailedCause);
            }
        }, new kotlin.jvm.functions.Function2<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$30
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.breakpoint.BreakpointInfo) obj2);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(breakpointInfo, "info");
                com.liulishuo.okdownload.DownloadListener.this.downloadFromBreakpoint(downloadTask, breakpointInfo);
            }
        }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$31
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) obj3);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(map, "requestHeaderFields");
                com.liulishuo.okdownload.DownloadListener.this.connectStart(downloadTask, i, map);
            }
        }, new kotlin.jvm.functions.Function4<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.lang.Integer, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$32
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).intValue(), (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) obj4);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, int i2, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(map, "responseHeaderFields");
                com.liulishuo.okdownload.DownloadListener.this.connectEnd(downloadTask, i, i2, map);
            }
        }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.lang.Long, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$33
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                com.liulishuo.okdownload.DownloadListener.this.fetchStart(downloadTask, i, j);
            }
        }, null, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, java.lang.Integer, java.lang.Long, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$34
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                com.liulishuo.okdownload.DownloadListener.this.fetchEnd(downloadTask, i, j);
            }
        }, new kotlin.jvm.functions.Function3<com.liulishuo.okdownload.DownloadTask, com.liulishuo.okdownload.core.cause.EndCause, java.lang.Exception, kotlin.Unit>() { // from class: com.liulishuo.okdownload.kotlin.listener.DownloadListenerExtensionKt$switchToExceptProgressListener$35
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.liulishuo.okdownload.DownloadTask) obj, (com.liulishuo.okdownload.core.cause.EndCause) obj2, (java.lang.Exception) obj3);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(downloadTask, "task");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(endCause, "cause");
                com.liulishuo.okdownload.DownloadListener.this.taskEnd(downloadTask, endCause, exc);
            }
        }, 256, null);
    }
}
