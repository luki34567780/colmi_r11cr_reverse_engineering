package retrofit2;

/* loaded from: classes3.dex */
public class HttpException extends java.lang.RuntimeException {
    private final int code;
    private final java.lang.String message;
    private final transient retrofit2.Response<?> response;

    private static java.lang.String getMessage(retrofit2.Response<?> response) {
        java.util.Objects.requireNonNull(response, "response == null");
        return "HTTP " + response.code() + " " + response.message();
    }

    public HttpException(retrofit2.Response<?> response) {
        super(getMessage(response));
        this.code = response.code();
        this.message = response.message();
        this.response = response;
    }

    public int code() {
        return this.code;
    }

    public java.lang.String message() {
        return this.message;
    }

    @javax.annotation.Nullable
    public retrofit2.Response<?> response() {
        return this.response;
    }
}
