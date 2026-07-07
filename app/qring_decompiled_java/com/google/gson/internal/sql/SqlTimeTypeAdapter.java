package com.google.gson.internal.sql;

/* loaded from: /tmp/dex/classes2.dex */
final class SqlTimeTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Time> {
    static final com.google.gson.TypeAdapterFactory FACTORY = new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
            if (typeToken.getRawType() == java.sql.Time.class) {
                return new com.google.gson.internal.sql.SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final java.text.DateFormat format;

    private SqlTimeTypeAdapter() {
        this.format = new java.text.SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.TypeAdapter
    public synchronized java.sql.Time read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new java.sql.Time(this.format.parse(jsonReader.nextString()).getTime());
        } catch (java.text.ParseException e) {
            throw new com.google.gson.JsonSyntaxException(e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public synchronized void write(com.google.gson.stream.JsonWriter jsonWriter, java.sql.Time time) throws java.io.IOException {
        jsonWriter.value(time == null ? null : this.format.format((java.util.Date) time));
    }
}
