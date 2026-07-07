package com.qcwireless.qcwatch.ui.home.gps.bean;

/* compiled from: QcLatLonJsonAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/bean/QcLatLonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qcwireless/qcwatch/ui/home/gps/bean/QcLatLon;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "constructorRef", "Ljava/lang/reflect/Constructor;", "doubleAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLonJsonAdapter, reason: from toString */
/* loaded from: /tmp/dex/classes2.dex */
public final class GeneratedJsonAdapter extends com.squareup.moshi.JsonAdapter<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon> {
    private volatile java.lang.reflect.Constructor<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon> constructorRef;
    private final com.squareup.moshi.JsonAdapter<java.lang.Double> doubleAdapter;
    private final com.squareup.moshi.JsonReader.Options options;

    public GeneratedJsonAdapter(com.squareup.moshi.Moshi moshi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moshi, "moshi");
        com.squareup.moshi.JsonReader.Options of = com.squareup.moshi.JsonReader.Options.of(new java.lang.String[]{"latitude", "longitude", "pace", "speed"});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(of, "of(\"latitude\", \"longitude\", \"pace\",\n      \"speed\")");
        this.options = of;
        com.squareup.moshi.JsonAdapter<java.lang.Double> adapter = moshi.adapter(java.lang.Double.TYPE, kotlin.collections.SetsKt.emptySet(), "latitude");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshi.adapter(Double::cl…ySet(),\n      \"latitude\")");
        this.doubleAdapter = adapter;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("QcLatLon");
        sb.append(')');
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: fromJson, reason: merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon m1015fromJson(com.squareup.moshi.JsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        java.lang.Double valueOf = java.lang.Double.valueOf(0.0d);
        reader.beginObject();
        java.lang.Double d = valueOf;
        int i = -1;
        java.lang.Double d2 = null;
        java.lang.Double d3 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                d2 = (java.lang.Double) this.doubleAdapter.fromJson(reader);
                if (d2 == null) {
                    java.lang.Throwable unexpectedNull = com.squareup.moshi.internal.Util.unexpectedNull("latitude", "latitude", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull, "unexpectedNull(\"latitude…      \"latitude\", reader)");
                    throw unexpectedNull;
                }
            } else if (selectName == 1) {
                d3 = (java.lang.Double) this.doubleAdapter.fromJson(reader);
                if (d3 == null) {
                    java.lang.Throwable unexpectedNull2 = com.squareup.moshi.internal.Util.unexpectedNull("longitude", "longitude", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull2, "unexpectedNull(\"longitud…     \"longitude\", reader)");
                    throw unexpectedNull2;
                }
            } else if (selectName == 2) {
                valueOf = (java.lang.Double) this.doubleAdapter.fromJson(reader);
                if (valueOf == null) {
                    java.lang.Throwable unexpectedNull3 = com.squareup.moshi.internal.Util.unexpectedNull("pace", "pace", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull3, "unexpectedNull(\"pace\", \"pace\", reader)");
                    throw unexpectedNull3;
                }
                i &= -5;
            } else if (selectName == 3) {
                d = (java.lang.Double) this.doubleAdapter.fromJson(reader);
                if (d == null) {
                    java.lang.Throwable unexpectedNull4 = com.squareup.moshi.internal.Util.unexpectedNull("speed", "speed", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull4, "unexpectedNull(\"speed\", …d\",\n              reader)");
                    throw unexpectedNull4;
                }
                i &= -9;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i == -13) {
            if (d2 != null) {
                double doubleValue = d2.doubleValue();
                if (d3 != null) {
                    return new com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon(doubleValue, d3.doubleValue(), valueOf.doubleValue(), d.doubleValue());
                }
                java.lang.Throwable missingProperty = com.squareup.moshi.internal.Util.missingProperty("longitude", "longitude", reader);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty, "missingProperty(\"longitude\", \"longitude\", reader)");
                throw missingProperty;
            }
            java.lang.Throwable missingProperty2 = com.squareup.moshi.internal.Util.missingProperty("latitude", "latitude", reader);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty2, "missingProperty(\"latitude\", \"latitude\", reader)");
            throw missingProperty2;
        }
        java.lang.reflect.Constructor<com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon.class.getDeclaredConstructor(java.lang.Double.TYPE, java.lang.Double.TYPE, java.lang.Double.TYPE, java.lang.Double.TYPE, java.lang.Integer.TYPE, com.squareup.moshi.internal.Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructor, "QcLatLon::class.java.get…his.constructorRef = it }");
        }
        java.lang.Object[] objArr = new java.lang.Object[6];
        if (d2 != null) {
            objArr[0] = java.lang.Double.valueOf(d2.doubleValue());
            if (d3 == null) {
                java.lang.Throwable missingProperty3 = com.squareup.moshi.internal.Util.missingProperty("longitude", "longitude", reader);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty3, "missingProperty(\"longitude\", \"longitude\", reader)");
                throw missingProperty3;
            }
            objArr[1] = java.lang.Double.valueOf(d3.doubleValue());
            objArr[2] = valueOf;
            objArr[3] = d;
            objArr[4] = java.lang.Integer.valueOf(i);
            objArr[5] = null;
            com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon newInstance = constructor.newInstance(objArr);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        java.lang.Throwable missingProperty4 = com.squareup.moshi.internal.Util.missingProperty("latitude", "latitude", reader);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty4, "missingProperty(\"latitude\", \"latitude\", reader)");
        throw missingProperty4;
    }

    public void toJson(com.squareup.moshi.JsonWriter writer, com.qcwireless.qcwatch.ui.home.gps.bean.QcLatLon value_) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
        java.util.Objects.requireNonNull(value_, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.beginObject();
        writer.name("latitude");
        this.doubleAdapter.toJson(writer, java.lang.Double.valueOf(value_.getLatitude()));
        writer.name("longitude");
        this.doubleAdapter.toJson(writer, java.lang.Double.valueOf(value_.getLongitude()));
        writer.name("pace");
        this.doubleAdapter.toJson(writer, java.lang.Double.valueOf(value_.getPace()));
        writer.name("speed");
        this.doubleAdapter.toJson(writer, java.lang.Double.valueOf(value_.getSpeed()));
        writer.endObject();
    }
}
