package com.androidnetworking.error;

/* loaded from: classes.dex */
public class ANError extends java.lang.Exception {
    private java.lang.String errorBody;
    private int errorCode;
    private java.lang.String errorDetail;
    private okhttp3.Response response;

    public ANError() {
        this.errorCode = 0;
    }

    public ANError(okhttp3.Response response) {
        this.errorCode = 0;
        this.response = response;
    }

    public ANError(java.lang.String str) {
        super(str);
        this.errorCode = 0;
    }

    public ANError(java.lang.String str, okhttp3.Response response) {
        super(str);
        this.errorCode = 0;
        this.response = response;
    }

    public ANError(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.errorCode = 0;
    }

    public ANError(java.lang.String str, okhttp3.Response response, java.lang.Throwable th) {
        super(str, th);
        this.errorCode = 0;
        this.response = response;
    }

    public ANError(okhttp3.Response response, java.lang.Throwable th) {
        super(th);
        this.errorCode = 0;
        this.response = response;
    }

    public ANError(java.lang.Throwable th) {
        super(th);
        this.errorCode = 0;
    }

    public okhttp3.Response getResponse() {
        return this.response;
    }

    public void setErrorDetail(java.lang.String str) {
        this.errorDetail = str;
    }

    public java.lang.String getErrorDetail() {
        return this.errorDetail;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setCancellationMessageInError() {
        this.errorDetail = com.androidnetworking.common.ANConstants.REQUEST_CANCELLED_ERROR;
    }

    public java.lang.String getErrorBody() {
        return this.errorBody;
    }

    public void setErrorBody(java.lang.String str) {
        this.errorBody = str;
    }

    public <T> T getErrorAsObject(java.lang.Class<T> cls) {
        try {
            return (T) com.androidnetworking.utils.ParseUtil.getParserFactory().getObject(this.errorBody, cls);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
