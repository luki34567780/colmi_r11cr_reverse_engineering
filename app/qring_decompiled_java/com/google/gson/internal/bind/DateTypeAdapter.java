package com.google.gson.internal.bind;

/* loaded from: /tmp/dex/classes2.dex */
public final class DateTypeAdapter extends com.google.gson.TypeAdapter<java.util.Date> {
    public static final com.google.gson.TypeAdapterFactory FACTORY = new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
            if (typeToken.getRawType() == java.util.Date.class) {
                return new com.google.gson.internal.bind.DateTypeAdapter();
            }
            return null;
        }
    };
    private final java.util.List<java.text.DateFormat> dateFormats;

    public DateTypeAdapter() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.dateFormats = arrayList;
        arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2, java.util.Locale.US));
        if (!java.util.Locale.getDefault().equals(java.util.Locale.US)) {
            arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.google.gson.internal.JavaVersion.isJava9OrLater()) {
            arrayList.add(com.google.gson.internal.PreJava9DateFormatProvider.getUSDateTimeFormat(2, 2));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public java.util.Date read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return deserializeToDate(jsonReader.nextString());
    }

    private synchronized java.util.Date deserializeToDate(java.lang.String str) {
        java.util.Iterator<java.text.DateFormat> it = this.dateFormats.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (java.text.ParseException unused) {
            }
        }
        try {
            return com.google.gson.internal.bind.util.ISO8601Utils.parse(str, new java.text.ParsePosition(0));
        } catch (java.text.ParseException e) {
            throw new com.google.gson.JsonSyntaxException(str, e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public synchronized void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.Date date) throws java.io.IOException {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.dateFormats.get(0).format(date));
        }
    }
}
