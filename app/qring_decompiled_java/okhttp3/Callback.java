package okhttp3;

/* compiled from: Callback.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lokhttp3/Callback;", "", "onFailure", "", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", com.amap.api.col.p0003sl.js.h, "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface Callback {
    void onFailure(okhttp3.Call call, java.io.IOException e);

    void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException;
}
