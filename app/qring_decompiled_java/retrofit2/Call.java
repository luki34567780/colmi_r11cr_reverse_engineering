package retrofit2;

/* loaded from: classes3.dex */
public interface Call<T> extends java.lang.Cloneable {
    void cancel();

    retrofit2.Call<T> clone();

    void enqueue(retrofit2.Callback<T> callback);

    retrofit2.Response<T> execute() throws java.io.IOException;

    boolean isCanceled();

    boolean isExecuted();

    okhttp3.Request request();

    okio.Timeout timeout();
}
