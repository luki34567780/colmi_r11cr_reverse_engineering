package org.koin.android.logger;

/* compiled from: AndroidLogger.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0002J\u001c\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016¨\u0006\u000b"}, d2 = {"Lorg/koin/android/logger/AndroidLogger;", "Lorg/koin/core/logger/Logger;", "level", "Lorg/koin/core/logger/Level;", "(Lorg/koin/core/logger/Level;)V", "LogOnLevel", "", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "", "Lorg/koin/core/logger/MESSAGE;", "log", "koin-android_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class AndroidLogger extends org.koin.core.logger.Logger {

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[org.koin.core.logger.Level.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[org.koin.core.logger.Level.DEBUG.ordinal()] = 1;
            iArr[org.koin.core.logger.Level.INFO.ordinal()] = 2;
            iArr[org.koin.core.logger.Level.ERROR.ordinal()] = 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLogger(org.koin.core.logger.Level level) {
        super(level);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(level, "level");
    }

    public /* synthetic */ AndroidLogger(org.koin.core.logger.Level level, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? org.koin.core.logger.Level.INFO : level);
    }

    @Override // org.koin.core.logger.Logger
    public void log(org.koin.core.logger.Level level, java.lang.String msg) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(level, "level");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(msg, "msg");
        if (getLevel().compareTo(level) <= 0) {
            LogOnLevel(msg);
        }
    }

    private final void LogOnLevel(java.lang.String msg) {
        int i = org.koin.android.logger.AndroidLogger.WhenMappings.$EnumSwitchMapping$0[getLevel().ordinal()];
        if (i == 1) {
            android.util.Log.d(org.koin.core.logger.LoggerKt.KOIN_TAG, msg);
        } else if (i == 2) {
            android.util.Log.i(org.koin.core.logger.LoggerKt.KOIN_TAG, msg);
        } else {
            if (i != 3) {
                return;
            }
            android.util.Log.e(org.koin.core.logger.LoggerKt.KOIN_TAG, msg);
        }
    }
}
