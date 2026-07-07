package io.reactivex.schedulers;

/* loaded from: classes3.dex */
public final class Timed<T> {
    final long time;
    final java.util.concurrent.TimeUnit unit;
    final T value;

    public Timed(T t, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.value = t;
        this.time = j;
        this.unit = (java.util.concurrent.TimeUnit) io.reactivex.internal.functions.ObjectHelper.requireNonNull(timeUnit, "unit is null");
    }

    public T value() {
        return this.value;
    }

    public java.util.concurrent.TimeUnit unit() {
        return this.unit;
    }

    public long time() {
        return this.time;
    }

    public long time(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.time, this.unit);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof io.reactivex.schedulers.Timed)) {
            return false;
        }
        io.reactivex.schedulers.Timed timed = (io.reactivex.schedulers.Timed) obj;
        return io.reactivex.internal.functions.ObjectHelper.equals(this.value, timed.value) && this.time == timed.time && io.reactivex.internal.functions.ObjectHelper.equals(this.unit, timed.unit);
    }

    public int hashCode() {
        T t = this.value;
        int hashCode = t != null ? t.hashCode() : 0;
        long j = this.time;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.unit.hashCode();
    }

    public java.lang.String toString() {
        return "Timed[time=" + this.time + ", unit=" + this.unit + ", value=" + this.value + "]";
    }
}
