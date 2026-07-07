package com.google.gson.internal.sql;

/* loaded from: /tmp/dex/classes2.dex */
final class SqlDateTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Date> {
    static final com.google.gson.TypeAdapterFactory FACTORY = new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
            if (typeToken.getRawType() == java.sql.Date.class) {
                return new com.google.gson.internal.sql.SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final java.text.DateFormat format;

    private SqlDateTypeAdapter() {
        this.format = new java.text.SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.TypeAdapter
    public synchronized java.sql.Date read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new java.sql.Date(this.format.parse(jsonReader.nextString()).getTime());
        } catch (java.text.ParseException e) {
            throw new com.google.gson.JsonSyntaxException(e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public synchronized void write(com.google.gson.stream.JsonWriter jsonWriter, java.sql.Date date) throws java.io.IOException {
        jsonWriter.value(date == null ? null : this.format.format((java.util.Date) date));
    }
}
