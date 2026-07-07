package com.airbnb.lottie.network;

/* loaded from: classes.dex */
public class DefaultLottieFetchResult implements com.airbnb.lottie.network.LottieFetchResult {
    private final java.net.HttpURLConnection connection;

    public DefaultLottieFetchResult(java.net.HttpURLConnection httpURLConnection) {
        this.connection = httpURLConnection;
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public boolean isSuccessful() {
        try {
            return this.connection.getResponseCode() / 100 == 2;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public java.io.InputStream bodyByteStream() throws java.io.IOException {
        return this.connection.getInputStream();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public java.lang.String contentType() {
        return this.connection.getContentType();
    }

    @Override // com.airbnb.lottie.network.LottieFetchResult
    public java.lang.String error() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.connection.getURL() + ". Failed with " + this.connection.getResponseCode() + "\n" + getErrorFromConnection(this.connection);
        } catch (java.io.IOException e) {
            com.airbnb.lottie.utils.Logger.warning("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.connection.disconnect();
    }

    private java.lang.String getErrorFromConnection(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getErrorStream()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            try {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append('\n');
                    } else {
                        try {
                            break;
                        } catch (java.lang.Exception unused) {
                        }
                    }
                } catch (java.lang.Exception e) {
                    throw e;
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (java.lang.Exception unused2) {
                }
            }
        }
        return sb.toString();
    }
}
