package org.koin.core.logger;

/* compiled from: EmptyLogger.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016¨\u0006\n"}, d2 = {"Lorg/koin/core/logger/EmptyLogger;", "Lorg/koin/core/logger/Logger;", "()V", "log", "", "level", "Lorg/koin/core/logger/Level;", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "", "Lorg/koin/core/logger/MESSAGE;", "koin-core"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class EmptyLogger extends org.koin.core.logger.Logger {
    @Override // org.koin.core.logger.Logger
    public void log(org.koin.core.logger.Level level, java.lang.String msg) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(level, "level");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(msg, "msg");
    }

    public EmptyLogger() {
        super(org.koin.core.logger.Level.ERROR);
    }
}
