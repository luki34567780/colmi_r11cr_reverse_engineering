package retrofit2;

/* loaded from: classes3.dex */
public interface Converter<F, T> {
    @javax.annotation.Nullable
    T convert(F f) throws java.io.IOException;

    public static abstract class Factory {
        @javax.annotation.Nullable
        public retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation[] annotationArr2, retrofit2.Retrofit retrofit) {
            return null;
        }

        @javax.annotation.Nullable
        public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
            return null;
        }

        @javax.annotation.Nullable
        public retrofit2.Converter<?, java.lang.String> stringConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
            return null;
        }

        protected static java.lang.reflect.Type getParameterUpperBound(int i, java.lang.reflect.ParameterizedType parameterizedType) {
            return retrofit2.Utils.getParameterUpperBound(i, parameterizedType);
        }

        protected static java.lang.Class<?> getRawType(java.lang.reflect.Type type) {
            return retrofit2.Utils.getRawType(type);
        }
    }
}
