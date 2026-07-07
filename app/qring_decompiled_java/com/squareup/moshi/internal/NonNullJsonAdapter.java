package com.squareup.moshi.internal;

/* loaded from: classes3.dex */
public final class NonNullJsonAdapter<T> extends com.squareup.moshi.JsonAdapter<T> {
    private final com.squareup.moshi.JsonAdapter<T> delegate;

    public NonNullJsonAdapter(com.squareup.moshi.JsonAdapter<T> jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    public com.squareup.moshi.JsonAdapter<T> delegate() {
        return this.delegate;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @javax.annotation.Nullable
    public T fromJson(com.squareup.moshi.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.squareup.moshi.JsonReader.Token.NULL) {
            throw new com.squareup.moshi.JsonDataException("Unexpected null at " + jsonReader.getPath());
        }
        return this.delegate.fromJson(jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(com.squareup.moshi.JsonWriter jsonWriter, @javax.annotation.Nullable T t) throws java.io.IOException {
        if (t == null) {
            throw new com.squareup.moshi.JsonDataException("Unexpected null at " + jsonWriter.getPath());
        }
        this.delegate.toJson(jsonWriter, (com.squareup.moshi.JsonWriter) t);
    }

    public java.lang.String toString() {
        return this.delegate + ".nonNull()";
    }
}
