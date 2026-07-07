package com.liulishuo.okdownload;

/* loaded from: /tmp/dex/classes2.dex */
public class RedirectUtil {
    static final int HTTP_PERMANENT_REDIRECT = 308;
    static final int HTTP_TEMPORARY_REDIRECT = 307;
    public static final int MAX_REDIRECT_TIMES = 10;

    public static boolean isRedirect(int i) {
        return i == 301 || i == 302 || i == 303 || i == 300 || i == HTTP_TEMPORARY_REDIRECT || i == HTTP_PERMANENT_REDIRECT;
    }

    public static java.lang.String getRedirectedUrl(com.liulishuo.okdownload.core.connection.DownloadConnection.Connected connected, int i) throws java.io.IOException {
        java.lang.String responseHeaderField = connected.getResponseHeaderField("Location");
        if (responseHeaderField != null) {
            return responseHeaderField;
        }
        throw new java.net.ProtocolException("Response code is " + i + " but can't find Location field");
    }
}
