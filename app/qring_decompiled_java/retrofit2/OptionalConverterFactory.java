package retrofit2;

/* loaded from: classes3.dex */
final class OptionalConverterFactory extends retrofit2.Converter.Factory {
    static final retrofit2.Converter.Factory INSTANCE = new retrofit2.OptionalConverterFactory();

    OptionalConverterFactory() {
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        if (getRawType(type) != java.util.Optional.class) {
            return null;
        }
        return new retrofit2.OptionalConverterFactory.OptionalConverter(retrofit.responseBodyConverter(getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type), annotationArr));
    }

    static final class OptionalConverter<T> implements retrofit2.Converter<okhttp3.ResponseBody, java.util.Optional<T>> {
        final retrofit2.Converter<okhttp3.ResponseBody, T> delegate;

        OptionalConverter(retrofit2.Converter<okhttp3.ResponseBody, T> converter) {
            this.delegate = converter;
        }

        @Override // retrofit2.Converter
        public java.util.Optional<T> convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            return java.util.Optional.ofNullable(this.delegate.convert(responseBody));
        }
    }
}
