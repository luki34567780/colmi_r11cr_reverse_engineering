package io.fotoapparat.log;

/* compiled from: Logger.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lio/fotoapparat/log/Logger;", "", "log", "", "message", "", "recordMethod", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public interface Logger {
    void log(java.lang.String message);

    void recordMethod();

    /* compiled from: Logger.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    public static final class DefaultImpls {
        public static void recordMethod(io.fotoapparat.log.Logger logger) {
            java.lang.StackTraceElement lastStacktrace = new java.lang.Exception().getStackTrace()[2];
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lastStacktrace, "lastStacktrace");
            java.lang.String className = lastStacktrace.getClassName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(className, "lastStacktrace.className");
            sb.append((java.lang.String) kotlin.collections.CollectionsKt.last(kotlin.text.StringsKt.split$default((java.lang.CharSequence) className, new char[]{'.'}, false, 0, 6, (java.lang.Object) null)));
            sb.append(": ");
            sb.append(lastStacktrace.getMethodName());
            logger.log(sb.toString());
        }
    }
}
