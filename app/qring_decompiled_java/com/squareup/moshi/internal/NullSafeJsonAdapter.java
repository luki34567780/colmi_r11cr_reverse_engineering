package com.squareup.moshi.internal;

/* loaded from: classes3.dex */
public final class NullSafeJsonAdapter<T> extends com.squareup.moshi.JsonAdapter<T> {
    private final com.squareup.moshi.JsonAdapter<T> delegate;

    public NullSafeJsonAdapter(com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    public com.squareup.moshi.JsonAdapter<T> delegate() {
        return this.delegate;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @javax.annotation.Nullable
    public T fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.squareup.moshi.JsonReader.Token.NULL) {
            return (T) jsonReader.nextNull();
        }
        return this.delegate.fromJson(jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable T t) throws java.io.IOException {
        if (t == null) {
            jsonWriter.nullValue();
        } else {
            this.delegate.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) t);
        }
    }

    public java.lang.String toString() {
        return this.delegate + ".nullSafe()";
    }
}
