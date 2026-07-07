package io.reactivex;

/* loaded from: classes3.dex */
public final class Notification<T> {
    static final io.reactivex.Notification<java.lang.Object> COMPLETE = new io.reactivex.Notification<>(null);
    final java.lang.Object value;

    private Notification(java.lang.Object obj) {
        this.value = obj;
    }

    public boolean isOnComplete() {
        return this.value == null;
    }

    public boolean isOnError() {
        return io.reactivex.internal.util.NotificationLite.isError(this.value);
    }

    public boolean isOnNext() {
        java.lang.Object obj = this.value;
        return (obj == null || io.reactivex.internal.util.NotificationLite.isError(obj)) ? false : true;
    }

    public T getValue() {
        java.lang.Object obj = this.value;
        if (obj == null || io.reactivex.internal.util.NotificationLite.isError(obj)) {
            return null;
        }
        return (T) this.value;
    }

    public java.lang.Throwable getError() {
        java.lang.Object obj = this.value;
        if (io.reactivex.internal.util.NotificationLite.isError(obj)) {
            return io.reactivex.internal.util.NotificationLite.getError(obj);
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof io.reactivex.Notification) {
            return io.reactivex.internal.functions.ObjectHelper.equals(this.value, ((io.reactivex.Notification) obj).value);
        }
        return false;
    }

    public int hashCode() {
        java.lang.Object obj = this.value;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        java.lang.Object obj = this.value;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (io.reactivex.internal.util.NotificationLite.isError(obj)) {
            return "OnErrorNotification[" + io.reactivex.internal.util.NotificationLite.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.value + "]";
    }

    public static <T> io.reactivex.Notification<T> createOnNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "value is null");
        return new io.reactivex.Notification<>(t);
    }

    public static <T> io.reactivex.Notification<T> createOnError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "error is null");
        return new io.reactivex.Notification<>(io.reactivex.internal.util.NotificationLite.error(th));
    }

    public static <T> io.reactivex.Notification<T> createOnComplete() {
        return (io.reactivex.Notification<T>) COMPLETE;
    }
}
