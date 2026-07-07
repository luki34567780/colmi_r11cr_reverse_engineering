package com.androidnetworking.interfaces;

/* loaded from: classes.dex */
public interface Parser<F, T> {

    public static abstract class Factory {
        public java.lang.Object getObject(java.lang.String str, java.lang.reflect.Type type) {
            return null;
        }

        public java.lang.String getString(java.lang.Object obj) {
            return null;
        }

        public java.util.HashMap<java.lang.String, java.lang.String> getStringMap(java.lang.Object obj) {
            return null;
        }

        public com.androidnetworking.interfaces.Parser<?, okhttp3.RequestBody> requestBodyParser(java.lang.reflect.Type type) {
            return null;
        }

        public com.androidnetworking.interfaces.Parser<okhttp3.ResponseBody, ?> responseBodyParser(java.lang.reflect.Type type) {
            return null;
        }
    }

    T convert(F f) throws java.io.IOException;
}
