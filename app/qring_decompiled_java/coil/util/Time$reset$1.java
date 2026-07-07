package coil.util;

/* compiled from: Time.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class Time$reset$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Long> {
    public static final coil.util.Time$reset$1 INSTANCE = new coil.util.Time$reset$1();

    Time$reset$1() {
        super(0, java.lang.System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Long invoke() {
        return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
    }
}
