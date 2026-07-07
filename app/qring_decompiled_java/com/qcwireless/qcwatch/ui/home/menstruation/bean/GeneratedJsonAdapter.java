package com.qcwireless.qcwatch.ui.home.menstruation.bean;

/* compiled from: MenstruationBeanJsonAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/menstruation/bean/MenstruationBeanJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qcwireless/qcwatch/ui/home/menstruation/bean/MenstruationBean;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "intAdapter", "", "longAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBeanJsonAdapter, reason: from toString */
/* loaded from: /tmp/dex/classes2.dex */
public final class GeneratedJsonAdapter extends com.squareup.moshi.JsonAdapter<com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean> {
    private final com.squareup.moshi.JsonAdapter<java.lang.Boolean> booleanAdapter;
    private volatile java.lang.reflect.Constructor<com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean> constructorRef;
    private final com.squareup.moshi.JsonAdapter<java.lang.Integer> intAdapter;
    private final com.squareup.moshi.JsonAdapter<java.lang.Long> longAdapter;
    private final com.squareup.moshi.JsonReader.Options options;

    public GeneratedJsonAdapter(com.squareup.moshi.Moshi moshi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moshi, "moshi");
        com.squareup.moshi.JsonReader.Options of = com.squareup.moshi.JsonReader.Options.of(new java.lang.String[]{"menstruationSwitch", "during", "cycle", "lastTime", "menstruationAlarm", "alarm1", "alarm2", "alarmMin"});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(of, "of(\"menstruationSwitch\",…1\", \"alarm2\", \"alarmMin\")");
        this.options = of;
        com.squareup.moshi.JsonAdapter<java.lang.Boolean> adapter = moshi.adapter(java.lang.Boolean.TYPE, kotlin.collections.SetsKt.emptySet(), "menstruationSwitch");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshi.adapter(Boolean::c…    \"menstruationSwitch\")");
        this.booleanAdapter = adapter;
        com.squareup.moshi.JsonAdapter<java.lang.Integer> adapter2 = moshi.adapter(java.lang.Integer.TYPE, kotlin.collections.SetsKt.emptySet(), "during");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter2, "moshi.adapter(Int::class…va, emptySet(), \"during\")");
        this.intAdapter = adapter2;
        com.squareup.moshi.JsonAdapter<java.lang.Long> adapter3 = moshi.adapter(java.lang.Long.TYPE, kotlin.collections.SetsKt.emptySet(), "lastTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter3, "moshi.adapter(Long::clas…ySet(),\n      \"lastTime\")");
        this.longAdapter = adapter3;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("MenstruationBean");
        sb.append(')');
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: fromJson, reason: merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean m1138fromJson(com.squareup.moshi.JsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        java.lang.Boolean bool = false;
        reader.beginObject();
        java.lang.Integer num = 0;
        java.lang.Integer num2 = null;
        java.lang.Integer num3 = null;
        java.lang.Integer num4 = null;
        java.lang.Long l = 0L;
        int i = -1;
        java.lang.Boolean bool2 = bool;
        java.lang.Integer num5 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    bool = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        java.lang.Throwable unexpectedNull = com.squareup.moshi.internal.Util.unexpectedNull("menstruationSwitch", "menstruationSwitch", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull, "unexpectedNull(\"menstrua…struationSwitch\", reader)");
                        throw unexpectedNull;
                    }
                    i &= -2;
                    break;
                case 1:
                    num5 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num5 == null) {
                        java.lang.Throwable unexpectedNull2 = com.squareup.moshi.internal.Util.unexpectedNull("during", "during", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull2, "unexpectedNull(\"during\",…g\",\n              reader)");
                        throw unexpectedNull2;
                    }
                    i &= -3;
                    break;
                case 2:
                    num = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        java.lang.Throwable unexpectedNull3 = com.squareup.moshi.internal.Util.unexpectedNull("cycle", "cycle", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull3, "unexpectedNull(\"cycle\", \"cycle\", reader)");
                        throw unexpectedNull3;
                    }
                    i &= -5;
                    break;
                case 3:
                    l = (java.lang.Long) this.longAdapter.fromJson(reader);
                    if (l == null) {
                        java.lang.Throwable unexpectedNull4 = com.squareup.moshi.internal.Util.unexpectedNull("lastTime", "lastTime", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull4, "unexpectedNull(\"lastTime…      \"lastTime\", reader)");
                        throw unexpectedNull4;
                    }
                    i &= -9;
                    break;
                case 4:
                    bool2 = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        java.lang.Throwable unexpectedNull5 = com.squareup.moshi.internal.Util.unexpectedNull("menstruationAlarm", "menstruationAlarm", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull5, "unexpectedNull(\"menstrua…nstruationAlarm\", reader)");
                        throw unexpectedNull5;
                    }
                    i &= -17;
                    break;
                case 5:
                    num2 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        java.lang.Throwable unexpectedNull6 = com.squareup.moshi.internal.Util.unexpectedNull("alarm1", "alarm1", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull6, "unexpectedNull(\"alarm1\",…1\",\n              reader)");
                        throw unexpectedNull6;
                    }
                    i &= -33;
                    break;
                case 6:
                    num3 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        java.lang.Throwable unexpectedNull7 = com.squareup.moshi.internal.Util.unexpectedNull("alarm2", "alarm2", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull7, "unexpectedNull(\"alarm2\",…2\",\n              reader)");
                        throw unexpectedNull7;
                    }
                    i &= -65;
                    break;
                case 7:
                    num4 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        java.lang.Throwable unexpectedNull8 = com.squareup.moshi.internal.Util.unexpectedNull("alarmMin", "alarmMin", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull8, "unexpectedNull(\"alarmMin…      \"alarmMin\", reader)");
                        throw unexpectedNull8;
                    }
                    i &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i == -256) {
            return new com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean(bool.booleanValue(), num5.intValue(), num.intValue(), l.longValue(), bool2.booleanValue(), num2.intValue(), num3.intValue(), num4.intValue());
        }
        java.lang.reflect.Constructor<com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean.class.getDeclaredConstructor(java.lang.Boolean.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Long.TYPE, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, com.squareup.moshi.internal.Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructor, "MenstruationBean::class.…his.constructorRef = it }");
        }
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean newInstance = constructor.newInstance(bool, num5, num, l, bool2, num2, num3, num4, java.lang.Integer.valueOf(i), null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(com.squareup.moshi.JsonWriter writer, com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean value_) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
        java.util.Objects.requireNonNull(value_, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.beginObject();
        writer.name("menstruationSwitch");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getMenstruationSwitch()));
        writer.name("during");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getDuring()));
        writer.name("cycle");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getCycle()));
        writer.name("lastTime");
        this.longAdapter.toJson(writer, java.lang.Long.valueOf(value_.getLastTime()));
        writer.name("menstruationAlarm");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getMenstruationAlarm()));
        writer.name("alarm1");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getAlarm1()));
        writer.name("alarm2");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getAlarm2()));
        writer.name("alarmMin");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getAlarmMin()));
        writer.endObject();
    }
}
