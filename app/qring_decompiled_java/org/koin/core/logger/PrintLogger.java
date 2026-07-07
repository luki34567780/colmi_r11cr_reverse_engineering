package org.koin.core.logger;

/* compiled from: PrintLogger.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016¨\u0006\n"}, d2 = {"Lorg/koin/core/logger/PrintLogger;", "Lorg/koin/core/logger/Logger;", "level", "Lorg/koin/core/logger/Level;", "(Lorg/koin/core/logger/Level;)V", "log", "", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "", "Lorg/koin/core/logger/MESSAGE;", "koin-core"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class PrintLogger extends org.koin.core.logger.Logger {
    /* JADX WARN: Multi-variable type inference failed */
    public PrintLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrintLogger(org.koin.core.logger.Level level) {
        super(level);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(level, "level");
    }

    public /* synthetic */ PrintLogger(org.koin.core.logger.Level level, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? org.koin.core.logger.Level.INFO : level);
    }

    @Override // org.koin.core.logger.Logger
    public void log(org.koin.core.logger.Level level, java.lang.String msg) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(level, "level");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(msg, "msg");
        java.io.PrintStream printStream = level.compareTo(org.koin.core.logger.Level.ERROR) >= 0 ? java.lang.System.err : java.lang.System.out;
        if (getLevel().compareTo(level) <= 0) {
            printStream.println('[' + level + "] [Koin] " + msg);
        }
    }
}
