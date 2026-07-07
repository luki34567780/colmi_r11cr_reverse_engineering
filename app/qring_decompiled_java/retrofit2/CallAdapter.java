package retrofit2;

/* loaded from: classes3.dex */
public interface CallAdapter<R, T> {
    T adapt(retrofit2.Call<R> call);

    java.lang.reflect.Type responseType();

    public static abstract class Factory {
        @javax.annotation.Nullable
        public abstract retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit);

        protected static java.lang.reflect.Type getParameterUpperBound(int i, java.lang.reflect.ParameterizedType parameterizedType) {
            return retrofit2.Utils.getParameterUpperBound(i, parameterizedType);
        }

        protected static java.lang.Class<?> getRawType(java.lang.reflect.Type type) {
            return retrofit2.Utils.getRawType(type);
        }
    }
}
