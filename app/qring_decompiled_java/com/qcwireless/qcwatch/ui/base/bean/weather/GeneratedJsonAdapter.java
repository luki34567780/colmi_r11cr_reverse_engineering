package com.qcwireless.qcwatch.ui.base.bean.weather;

/* compiled from: MyLocationBeanJsonAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/weather/MyLocationBeanJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qcwireless/qcwatch/ui/base/bean/weather/MyLocationBean;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "floatAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBeanJsonAdapter, reason: from toString */
/* loaded from: /tmp/dex/classes2.dex */
public final class GeneratedJsonAdapter extends com.squareup.moshi.JsonAdapter<com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean> {
    private final com.squareup.moshi.JsonAdapter<java.lang.Float> floatAdapter;
    private final com.squareup.moshi.JsonReader.Options options;
    private final com.squareup.moshi.JsonAdapter<java.lang.String> stringAdapter;

    public GeneratedJsonAdapter(com.squareup.moshi.Moshi moshi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moshi, "moshi");
        com.squareup.moshi.JsonReader.Options of = com.squareup.moshi.JsonReader.Options.of(new java.lang.String[]{"longitude", "latitude", "language", "city", "address"});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(of, "of(\"longitude\", \"latitud…uage\", \"city\", \"address\")");
        this.options = of;
        com.squareup.moshi.JsonAdapter<java.lang.Float> adapter = moshi.adapter(java.lang.Float.TYPE, kotlin.collections.SetsKt.emptySet(), "longitude");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshi.adapter(Float::cla…Set(),\n      \"longitude\")");
        this.floatAdapter = adapter;
        com.squareup.moshi.JsonAdapter<java.lang.String> adapter2 = moshi.adapter(java.lang.String.class, kotlin.collections.SetsKt.emptySet(), "language");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter2, "moshi.adapter(String::cl…ySet(),\n      \"language\")");
        this.stringAdapter = adapter2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("MyLocationBean");
        sb.append(')');
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: fromJson, reason: merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean m520fromJson(com.squareup.moshi.JsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        java.lang.Float f = null;
        java.lang.Float f2 = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                f = (java.lang.Float) this.floatAdapter.fromJson(reader);
                if (f == null) {
                    java.lang.Throwable unexpectedNull = com.squareup.moshi.internal.Util.unexpectedNull("longitude", "longitude", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull, "unexpectedNull(\"longitud…     \"longitude\", reader)");
                    throw unexpectedNull;
                }
            } else if (selectName == 1) {
                f2 = (java.lang.Float) this.floatAdapter.fromJson(reader);
                if (f2 == null) {
                    java.lang.Throwable unexpectedNull2 = com.squareup.moshi.internal.Util.unexpectedNull("latitude", "latitude", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull2, "unexpectedNull(\"latitude…      \"latitude\", reader)");
                    throw unexpectedNull2;
                }
            } else if (selectName == 2) {
                str = (java.lang.String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    java.lang.Throwable unexpectedNull3 = com.squareup.moshi.internal.Util.unexpectedNull("language", "language", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull3, "unexpectedNull(\"language…      \"language\", reader)");
                    throw unexpectedNull3;
                }
            } else if (selectName == 3) {
                str2 = (java.lang.String) this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    java.lang.Throwable unexpectedNull4 = com.squareup.moshi.internal.Util.unexpectedNull("city", "city", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull4, "unexpectedNull(\"city\", \"city\",\n            reader)");
                    throw unexpectedNull4;
                }
            } else if (selectName == 4 && (str3 = (java.lang.String) this.stringAdapter.fromJson(reader)) == null) {
                java.lang.Throwable unexpectedNull5 = com.squareup.moshi.internal.Util.unexpectedNull("address", "address", reader);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull5, "unexpectedNull(\"address\"…       \"address\", reader)");
                throw unexpectedNull5;
            }
        }
        reader.endObject();
        if (f != null) {
            float floatValue = f.floatValue();
            if (f2 != null) {
                float floatValue2 = f2.floatValue();
                if (str == null) {
                    java.lang.Throwable missingProperty = com.squareup.moshi.internal.Util.missingProperty("language", "language", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty, "missingProperty(\"language\", \"language\", reader)");
                    throw missingProperty;
                }
                if (str2 == null) {
                    java.lang.Throwable missingProperty2 = com.squareup.moshi.internal.Util.missingProperty("city", "city", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty2, "missingProperty(\"city\", \"city\", reader)");
                    throw missingProperty2;
                }
                if (str3 != null) {
                    return new com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean(floatValue, floatValue2, str, str2, str3);
                }
                java.lang.Throwable missingProperty3 = com.squareup.moshi.internal.Util.missingProperty("address", "address", reader);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty3, "missingProperty(\"address\", \"address\", reader)");
                throw missingProperty3;
            }
            java.lang.Throwable missingProperty4 = com.squareup.moshi.internal.Util.missingProperty("latitude", "latitude", reader);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty4, "missingProperty(\"latitude\", \"latitude\", reader)");
            throw missingProperty4;
        }
        java.lang.Throwable missingProperty5 = com.squareup.moshi.internal.Util.missingProperty("longitude", "longitude", reader);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty5, "missingProperty(\"longitude\", \"longitude\", reader)");
        throw missingProperty5;
    }

    public void toJson(com.squareup.moshi.JsonWriter writer, com.qcwireless.qcwatch.ui.base.bean.weather.MyLocationBean value_) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
        java.util.Objects.requireNonNull(value_, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.beginObject();
        writer.name("longitude");
        this.floatAdapter.toJson(writer, java.lang.Float.valueOf(value_.getLongitude()));
        writer.name("latitude");
        this.floatAdapter.toJson(writer, java.lang.Float.valueOf(value_.getLatitude()));
        writer.name("language");
        this.stringAdapter.toJson(writer, value_.getLanguage());
        writer.name("city");
        this.stringAdapter.toJson(writer, value_.getCity());
        writer.name("address");
        this.stringAdapter.toJson(writer, value_.getAddress());
        writer.endObject();
    }
}
