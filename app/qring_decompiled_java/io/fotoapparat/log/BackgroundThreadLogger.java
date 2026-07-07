package io.fotoapparat.log;

/* compiled from: BackgroundThreadLogger.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lio/fotoapparat/log/BackgroundThreadLogger;", "Lio/fotoapparat/log/Logger;", "logger", "(Lio/fotoapparat/log/Logger;)V", "log", "", "message", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class BackgroundThreadLogger implements io.fotoapparat.log.Logger {
    private final io.fotoapparat.log.Logger logger;

    public BackgroundThreadLogger(io.fotoapparat.log.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(logger, "logger");
        this.logger = logger;
    }

    @Override // io.fotoapparat.log.Logger
    public void recordMethod() {
        io.fotoapparat.log.Logger.DefaultImpls.recordMethod(this);
    }

    @Override // io.fotoapparat.log.Logger
    public void log(final java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(message, "message");
        io.fotoapparat.hardware.ExecutorKt.executeLoggingThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: io.fotoapparat.log.BackgroundThreadLogger$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                io.fotoapparat.log.Logger logger;
                logger = io.fotoapparat.log.BackgroundThreadLogger.this.logger;
                logger.log(message);
            }
        });
    }
}
