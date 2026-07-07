package com.androidnetworking.common;

/* loaded from: classes.dex */
public class ANResponse<T> {
    private final com.androidnetworking.error.ANError mANError;
    private final T mResult;
    private okhttp3.Response response;

    public static <T> com.androidnetworking.common.ANResponse<T> success(T t) {
        return new com.androidnetworking.common.ANResponse<>(t);
    }

    public static <T> com.androidnetworking.common.ANResponse<T> failed(com.androidnetworking.error.ANError aNError) {
        return new com.androidnetworking.common.ANResponse<>(aNError);
    }

    public ANResponse(T t) {
        this.mResult = t;
        this.mANError = null;
    }

    public ANResponse(com.androidnetworking.error.ANError aNError) {
        this.mResult = null;
        this.mANError = aNError;
    }

    public T getResult() {
        return this.mResult;
    }

    public boolean isSuccess() {
        return this.mANError == null;
    }

    public com.androidnetworking.error.ANError getError() {
        return this.mANError;
    }

    public void setOkHttpResponse(okhttp3.Response response) {
        this.response = response;
    }

    public okhttp3.Response getOkHttpResponse() {
        return this.response;
    }
}
