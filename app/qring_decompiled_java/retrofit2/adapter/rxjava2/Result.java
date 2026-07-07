package retrofit2.adapter.rxjava2;

/* loaded from: classes3.dex */
public final class Result<T> {

    @javax.annotation.Nullable
    private final java.lang.Throwable error;

    @javax.annotation.Nullable
    private final retrofit2.Response<T> response;

    public static <T> retrofit2.adapter.rxjava2.Result<T> error(java.lang.Throwable th) {
        java.util.Objects.requireNonNull(th, "error == null");
        return new retrofit2.adapter.rxjava2.Result<>(null, th);
    }

    public static <T> retrofit2.adapter.rxjava2.Result<T> response(retrofit2.Response<T> response) {
        java.util.Objects.requireNonNull(response, "response == null");
        return new retrofit2.adapter.rxjava2.Result<>(response, null);
    }

    private Result(@javax.annotation.Nullable retrofit2.Response<T> response, @javax.annotation.Nullable java.lang.Throwable th) {
        this.response = response;
        this.error = th;
    }

    @javax.annotation.Nullable
    public retrofit2.Response<T> response() {
        return this.response;
    }

    @javax.annotation.Nullable
    public java.lang.Throwable error() {
        return this.error;
    }

    public boolean isError() {
        return this.error != null;
    }
}
