package io.fotoapparat.log;

/* compiled from: LogcatLogger.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lio/fotoapparat/log/LogcatLogger;", "Lio/fotoapparat/log/Logger;", "()V", "log", "", "message", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class LogcatLogger implements io.fotoapparat.log.Logger {
    @Override // io.fotoapparat.log.Logger
    public void recordMethod() {
        io.fotoapparat.log.Logger.DefaultImpls.recordMethod(this);
    }

    @Override // io.fotoapparat.log.Logger
    public void log(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(message, "message");
        android.util.Log.d("Fotoapparat", message);
    }
}
