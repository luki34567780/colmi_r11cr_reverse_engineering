package retrofit2;

/* loaded from: classes3.dex */
public final class Response<T> {

    @javax.annotation.Nullable
    private final T body;

    @javax.annotation.Nullable
    private final okhttp3.ResponseBody errorBody;
    private final okhttp3.Response rawResponse;

    public static <T> retrofit2.Response<T> success(@javax.annotation.Nullable T t) {
        return success(t, new okhttp3.Response.Builder().code(200).message("OK").protocol(okhttp3.Protocol.HTTP_1_1).request(new okhttp3.Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> retrofit2.Response<T> success(int i, @javax.annotation.Nullable T t) {
        if (i < 200 || i >= 300) {
            throw new java.lang.IllegalArgumentException("code < 200 or >= 300: " + i);
        }
        return success(t, new okhttp3.Response.Builder().code(i).message("Response.success()").protocol(okhttp3.Protocol.HTTP_1_1).request(new okhttp3.Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> retrofit2.Response<T> success(@javax.annotation.Nullable T t, okhttp3.Headers headers) {
        java.util.Objects.requireNonNull(headers, "headers == null");
        return success(t, new okhttp3.Response.Builder().code(200).message("OK").protocol(okhttp3.Protocol.HTTP_1_1).headers(headers).request(new okhttp3.Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> retrofit2.Response<T> success(@javax.annotation.Nullable T t, okhttp3.Response response) {
        java.util.Objects.requireNonNull(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            throw new java.lang.IllegalArgumentException("rawResponse must be successful response");
        }
        return new retrofit2.Response<>(response, t, null);
    }

    public static <T> retrofit2.Response<T> error(int i, okhttp3.ResponseBody responseBody) {
        java.util.Objects.requireNonNull(responseBody, "body == null");
        if (i < 400) {
            throw new java.lang.IllegalArgumentException("code < 400: " + i);
        }
        return error(responseBody, new okhttp3.Response.Builder().body(new retrofit2.OkHttpCall.NoContentResponseBody(responseBody.contentType(), responseBody.contentLength())).code(i).message("Response.error()").protocol(okhttp3.Protocol.HTTP_1_1).request(new okhttp3.Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> retrofit2.Response<T> error(okhttp3.ResponseBody responseBody, okhttp3.Response response) {
        java.util.Objects.requireNonNull(responseBody, "body == null");
        java.util.Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            throw new java.lang.IllegalArgumentException("rawResponse should not be successful response");
        }
        return new retrofit2.Response<>(response, null, responseBody);
    }

    private Response(okhttp3.Response response, @javax.annotation.Nullable T t, @javax.annotation.Nullable okhttp3.ResponseBody responseBody) {
        this.rawResponse = response;
        this.body = t;
        this.errorBody = responseBody;
    }

    public okhttp3.Response raw() {
        return this.rawResponse;
    }

    public int code() {
        return this.rawResponse.code();
    }

    public java.lang.String message() {
        return this.rawResponse.message();
    }

    public okhttp3.Headers headers() {
        return this.rawResponse.headers();
    }

    public boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    @javax.annotation.Nullable
    public T body() {
        return this.body;
    }

    @javax.annotation.Nullable
    public okhttp3.ResponseBody errorBody() {
        return this.errorBody;
    }

    public java.lang.String toString() {
        return this.rawResponse.toString();
    }
}
