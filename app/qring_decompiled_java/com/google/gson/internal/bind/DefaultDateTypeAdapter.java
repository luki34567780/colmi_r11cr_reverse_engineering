package com.google.gson.internal.bind;

/* loaded from: /tmp/dex/classes2.dex */
public final class DefaultDateTypeAdapter<T extends java.util.Date> extends com.google.gson.TypeAdapter<T> {
    private static final java.lang.String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final java.util.List<java.text.DateFormat> dateFormats;
    private final com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> dateType;

    public static abstract class DateType<T extends java.util.Date> {
        public static final com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<java.util.Date> DATE = new com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<java.util.Date>(java.util.Date.class) { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.1
            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
            protected java.util.Date deserialize(java.util.Date date) {
                return date;
            }
        };
        private final java.lang.Class<T> dateClass;

        protected abstract T deserialize(java.util.Date date);

        protected DateType(java.lang.Class<T> cls) {
            this.dateClass = cls;
        }

        private final com.google.gson.TypeAdapterFactory createFactory(com.google.gson.internal.bind.DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return com.google.gson.internal.bind.TypeAdapters.newFactory(this.dateClass, defaultDateTypeAdapter);
        }

        public final com.google.gson.TypeAdapterFactory createAdapterFactory(java.lang.String str) {
            return createFactory(new com.google.gson.internal.bind.DefaultDateTypeAdapter<>(this, str));
        }

        public final com.google.gson.TypeAdapterFactory createAdapterFactory(int i) {
            return createFactory(new com.google.gson.internal.bind.DefaultDateTypeAdapter<>(this, i));
        }

        public final com.google.gson.TypeAdapterFactory createAdapterFactory(int i, int i2) {
            return createFactory(new com.google.gson.internal.bind.DefaultDateTypeAdapter<>(this, i, i2));
        }

        public final com.google.gson.TypeAdapterFactory createDefaultsAdapterFactory() {
            int i = 2;
            return createFactory(new com.google.gson.internal.bind.DefaultDateTypeAdapter<>(this, i, i));
        }
    }

    private DefaultDateTypeAdapter(com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> dateType, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.dateFormats = arrayList;
        this.dateType = (com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType) com.google.gson.internal.C$Gson$Preconditions.checkNotNull(dateType);
        arrayList.add(new java.text.SimpleDateFormat(str, java.util.Locale.US));
        if (java.util.Locale.getDefault().equals(java.util.Locale.US)) {
            return;
        }
        arrayList.add(new java.text.SimpleDateFormat(str));
    }

    private DefaultDateTypeAdapter(com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> dateType, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.dateFormats = arrayList;
        this.dateType = (com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType) com.google.gson.internal.C$Gson$Preconditions.checkNotNull(dateType);
        arrayList.add(java.text.DateFormat.getDateInstance(i, java.util.Locale.US));
        if (!java.util.Locale.getDefault().equals(java.util.Locale.US)) {
            arrayList.add(java.text.DateFormat.getDateInstance(i));
        }
        if (com.google.gson.internal.JavaVersion.isJava9OrLater()) {
            arrayList.add(com.google.gson.internal.PreJava9DateFormatProvider.getUSDateFormat(i));
        }
    }

    private DefaultDateTypeAdapter(com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<T> dateType, int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.dateFormats = arrayList;
        this.dateType = (com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType) com.google.gson.internal.C$Gson$Preconditions.checkNotNull(dateType);
        arrayList.add(java.text.DateFormat.getDateTimeInstance(i, i2, java.util.Locale.US));
        if (!java.util.Locale.getDefault().equals(java.util.Locale.US)) {
            arrayList.add(java.text.DateFormat.getDateTimeInstance(i, i2));
        }
        if (com.google.gson.internal.JavaVersion.isJava9OrLater()) {
            arrayList.add(com.google.gson.internal.PreJava9DateFormatProvider.getUSDateTimeFormat(i, i2));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.Date date) throws java.io.IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.dateFormats) {
            jsonWriter.value(this.dateFormats.get(0).format(date));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public T read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.dateType.deserialize(deserializeToDate(jsonReader.nextString()));
    }

    private java.util.Date deserializeToDate(java.lang.String str) {
        synchronized (this.dateFormats) {
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
    }

    public java.lang.String toString() {
        java.text.DateFormat dateFormat = this.dateFormats.get(0);
        if (dateFormat instanceof java.text.SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((java.text.SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
