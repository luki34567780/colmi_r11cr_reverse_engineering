package com.qcwireless.qcwatch.ui.base.bean.response.weather;

/* compiled from: WeatherRespJsonAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/response/weather/WeatherRespJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qcwireless/qcwatch/ui/base/bean/response/weather/WeatherResp;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "intAdapter", "", "longAdapter", "", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherRespJsonAdapter, reason: from toString */
/* loaded from: /tmp/dex/classes2.dex */
public final class GeneratedJsonAdapter extends com.squareup.moshi.JsonAdapter<com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp> {
    private final com.squareup.moshi.JsonAdapter<java.lang.Boolean> booleanAdapter;
    private volatile java.lang.reflect.Constructor<com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp> constructorRef;
    private final com.squareup.moshi.JsonAdapter<java.lang.Integer> intAdapter;
    private final com.squareup.moshi.JsonAdapter<java.lang.Long> longAdapter;
    private final com.squareup.moshi.JsonAdapter<java.lang.String> nullableStringAdapter;
    private final com.squareup.moshi.JsonReader.Options options;

    public GeneratedJsonAdapter(com.squareup.moshi.Moshi moshi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moshi, "moshi");
        com.squareup.moshi.JsonReader.Options of = com.squareup.moshi.JsonReader.Options.of(new java.lang.String[]{"timeStamp", "digitType", "type", "lowTemp", "highTemp", "rainProd", "humidity", "isBringUmbrella"});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(of, "of(\"timeStamp\", \"digitTy…dity\", \"isBringUmbrella\")");
        this.options = of;
        com.squareup.moshi.JsonAdapter<java.lang.Long> adapter = moshi.adapter(java.lang.Long.TYPE, kotlin.collections.SetsKt.emptySet(), "timeStamp");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshi.adapter(Long::clas…Set(),\n      \"timeStamp\")");
        this.longAdapter = adapter;
        com.squareup.moshi.JsonAdapter<java.lang.Integer> adapter2 = moshi.adapter(java.lang.Integer.TYPE, kotlin.collections.SetsKt.emptySet(), "digitType");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter2, "moshi.adapter(Int::class… emptySet(), \"digitType\")");
        this.intAdapter = adapter2;
        com.squareup.moshi.JsonAdapter<java.lang.String> adapter3 = moshi.adapter(java.lang.String.class, kotlin.collections.SetsKt.emptySet(), "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter3, "moshi.adapter(String::cl…      emptySet(), \"type\")");
        this.nullableStringAdapter = adapter3;
        com.squareup.moshi.JsonAdapter<java.lang.Boolean> adapter4 = moshi.adapter(java.lang.Boolean.TYPE, kotlin.collections.SetsKt.emptySet(), "isBringUmbrella");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter4, "moshi.adapter(Boolean::c…\n      \"isBringUmbrella\")");
        this.booleanAdapter = adapter4;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("WeatherResp");
        sb.append(')');
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: fromJson, reason: merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp m519fromJson(com.squareup.moshi.JsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        java.lang.Long l = 0L;
        java.lang.Integer num = 0;
        reader.beginObject();
        java.lang.Integer num2 = num;
        java.lang.Integer num3 = num2;
        java.lang.Integer num4 = num3;
        java.lang.Boolean bool = false;
        int i = -1;
        java.lang.String str = null;
        java.lang.Integer num5 = num4;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    l = (java.lang.Long) this.longAdapter.fromJson(reader);
                    if (l == null) {
                        java.lang.Throwable unexpectedNull = com.squareup.moshi.internal.Util.unexpectedNull("timeStamp", "timeStamp", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull, "unexpectedNull(\"timeStam…     \"timeStamp\", reader)");
                        throw unexpectedNull;
                    }
                    i &= -2;
                    break;
                case 1:
                    num = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        java.lang.Throwable unexpectedNull2 = com.squareup.moshi.internal.Util.unexpectedNull("digitType", "digitType", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull2, "unexpectedNull(\"digitTyp…     \"digitType\", reader)");
                        throw unexpectedNull2;
                    }
                    i &= -3;
                    break;
                case 2:
                    str = (java.lang.String) this.nullableStringAdapter.fromJson(reader);
                    i &= -5;
                    break;
                case 3:
                    num5 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num5 == null) {
                        java.lang.Throwable unexpectedNull3 = com.squareup.moshi.internal.Util.unexpectedNull("lowTemp", "lowTemp", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull3, "unexpectedNull(\"lowTemp\"…p\",\n              reader)");
                        throw unexpectedNull3;
                    }
                    i &= -9;
                    break;
                case 4:
                    num2 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        java.lang.Throwable unexpectedNull4 = com.squareup.moshi.internal.Util.unexpectedNull("highTemp", "highTemp", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull4, "unexpectedNull(\"highTemp…      \"highTemp\", reader)");
                        throw unexpectedNull4;
                    }
                    i &= -17;
                    break;
                case 5:
                    num3 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        java.lang.Throwable unexpectedNull5 = com.squareup.moshi.internal.Util.unexpectedNull("rainProd", "rainProd", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull5, "unexpectedNull(\"rainProd…      \"rainProd\", reader)");
                        throw unexpectedNull5;
                    }
                    i &= -33;
                    break;
                case 6:
                    num4 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        java.lang.Throwable unexpectedNull6 = com.squareup.moshi.internal.Util.unexpectedNull("humidity", "humidity", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull6, "unexpectedNull(\"humidity…      \"humidity\", reader)");
                        throw unexpectedNull6;
                    }
                    i &= -65;
                    break;
                case 7:
                    bool = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        java.lang.Throwable unexpectedNull7 = com.squareup.moshi.internal.Util.unexpectedNull("isBringUmbrella", "isBringUmbrella", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull7, "unexpectedNull(\"isBringU…isBringUmbrella\", reader)");
                        throw unexpectedNull7;
                    }
                    i &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i == -256) {
            return new com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp(l.longValue(), num.intValue(), str, num5.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), bool.booleanValue());
        }
        java.lang.reflect.Constructor<com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp.class.getDeclaredConstructor(java.lang.Long.TYPE, java.lang.Integer.TYPE, java.lang.String.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, com.squareup.moshi.internal.Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructor, "WeatherResp::class.java.…his.constructorRef = it }");
        }
        com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp newInstance = constructor.newInstance(l, num, str, num5, num2, num3, num4, bool, java.lang.Integer.valueOf(i), null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(com.squareup.moshi.JsonWriter writer, com.qcwireless.qcwatch.ui.base.bean.response.weather.WeatherResp value_) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
        java.util.Objects.requireNonNull(value_, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.beginObject();
        writer.name("timeStamp");
        this.longAdapter.toJson(writer, java.lang.Long.valueOf(value_.getTimeStamp()));
        writer.name("digitType");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getDigitType()));
        writer.name("type");
        this.nullableStringAdapter.toJson(writer, value_.getType());
        writer.name("lowTemp");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getLowTemp()));
        writer.name("highTemp");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getHighTemp()));
        writer.name("rainProd");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getRainProd()));
        writer.name("humidity");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getHumidity()));
        writer.name("isBringUmbrella");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.isBringUmbrella()));
        writer.endObject();
    }
}
