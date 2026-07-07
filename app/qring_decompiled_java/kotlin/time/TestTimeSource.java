package kotlin.time;

/* compiled from: TimeSources.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_DURATION, "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestTimeSource extends kotlin.time.AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(kotlin.time.DurationUnit.NANOSECONDS);
    }

    @Override // kotlin.time.AbstractLongTimeSource
    /* renamed from: read, reason: from getter */
    protected long getReading() {
        return this.reading;
    }

    /* renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m2503plusAssignLRDsOJo(long duration) {
        long j;
        long m2421toLongimpl = kotlin.time.Duration.m2421toLongimpl(duration, getUnit());
        if (m2421toLongimpl != Long.MIN_VALUE && m2421toLongimpl != Long.MAX_VALUE) {
            long j2 = this.reading;
            j = j2 + m2421toLongimpl;
            if ((m2421toLongimpl ^ j2) >= 0 && (j2 ^ j) < 0) {
                m2502overflowLRDsOJo(duration);
            }
        } else {
            double m2418toDoubleimpl = this.reading + kotlin.time.Duration.m2418toDoubleimpl(duration, getUnit());
            if (m2418toDoubleimpl > 9.223372036854776E18d || m2418toDoubleimpl < -9.223372036854776E18d) {
                m2502overflowLRDsOJo(duration);
            }
            j = (long) m2418toDoubleimpl;
        }
        this.reading = j;
    }

    /* renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m2502overflowLRDsOJo(long duration) {
        throw new java.lang.IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + "ns is advanced by " + ((java.lang.Object) kotlin.time.Duration.m2424toStringimpl(duration)) + '.');
    }
}
