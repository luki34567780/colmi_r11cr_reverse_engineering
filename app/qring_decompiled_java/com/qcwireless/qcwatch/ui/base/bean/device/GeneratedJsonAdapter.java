package com.qcwireless.qcwatch.ui.base.bean.device;

/* compiled from: DeviceSettingJsonAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSettingJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "arrayOfDrinkBeanAdapter", "", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DrinkBean;", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "intAdapter", "", "mutableListOfAlarmBeanAdapter", "", "Lcom/qcwireless/qcwatch/ui/base/bean/device/AlarmBean;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.qcwireless.qcwatch.ui.base.bean.device.DeviceSettingJsonAdapter, reason: from toString */
/* loaded from: /tmp/dex/classes2.dex */
public final class GeneratedJsonAdapter extends com.squareup.moshi.JsonAdapter<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> {
    private final com.squareup.moshi.JsonAdapter<com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[]> arrayOfDrinkBeanAdapter;
    private final com.squareup.moshi.JsonAdapter<java.lang.Boolean> booleanAdapter;
    private volatile java.lang.reflect.Constructor<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> constructorRef;
    private final com.squareup.moshi.JsonAdapter<java.lang.Integer> intAdapter;
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean>> mutableListOfAlarmBeanAdapter;
    private final com.squareup.moshi.JsonReader.Options options;
    private final com.squareup.moshi.JsonAdapter<java.lang.String> stringAdapter;

    public GeneratedJsonAdapter(com.squareup.moshi.Moshi moshi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moshi, "moshi");
        com.squareup.moshi.JsonReader.Options of = com.squareup.moshi.JsonReader.Options.of(new java.lang.String[]{"callSwitch", "messagePushSwitch", "smsPushSwitch", "bpSwitch", "bpStart", "bpEnd", "bpInterval", "hrDetection", "hrInterval", "bo2Detection", "pressureDetection", "wristSense", "wristSenseHand", "timeFormat", "weatherFormat", "metricUnit", "disturbSwitch", "disturbManualSwitch", "disturbStart", "disturbEnd", "firmwareVersion", "screenLight", "longSitSwitch", "longSitStart", "longSitEnd", "longSitDuring", "longSitWeek", "drinkSwitch", "drinkWeek", "drinkArray", "alarmList", "avatarScreen", "avatarWidth", "avatarHeight"});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(of, "of(\"callSwitch\", \"messag…arWidth\", \"avatarHeight\")");
        this.options = of;
        com.squareup.moshi.JsonAdapter<java.lang.Boolean> adapter = moshi.adapter(java.lang.Boolean.TYPE, kotlin.collections.SetsKt.emptySet(), "callSwitch");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshi.adapter(Boolean::c…et(),\n      \"callSwitch\")");
        this.booleanAdapter = adapter;
        com.squareup.moshi.JsonAdapter<java.lang.Integer> adapter2 = moshi.adapter(java.lang.Integer.TYPE, kotlin.collections.SetsKt.emptySet(), "bpStart");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter2, "moshi.adapter(Int::class…a, emptySet(), \"bpStart\")");
        this.intAdapter = adapter2;
        com.squareup.moshi.JsonAdapter<java.lang.String> adapter3 = moshi.adapter(java.lang.String.class, kotlin.collections.SetsKt.emptySet(), "firmwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter3, "moshi.adapter(String::cl…\n      \"firmwareVersion\")");
        this.stringAdapter = adapter3;
        com.squareup.moshi.JsonAdapter<com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[]> adapter4 = moshi.adapter(com.squareup.moshi.Types.arrayOf(com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean.class), kotlin.collections.SetsKt.emptySet(), "drinkArray");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter4, "moshi.adapter(Types.arra…emptySet(), \"drinkArray\")");
        this.arrayOfDrinkBeanAdapter = adapter4;
        com.squareup.moshi.JsonAdapter<java.util.List<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean>> adapter5 = moshi.adapter(com.squareup.moshi.Types.newParameterizedType(java.util.List.class, new java.lang.reflect.Type[]{com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean.class}), kotlin.collections.SetsKt.emptySet(), "alarmList");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter5, "moshi.adapter(Types.newP… emptySet(), \"alarmList\")");
        this.mutableListOfAlarmBeanAdapter = adapter5;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DeviceSetting");
        sb.append(')');
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: fromJson, reason: merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting m513fromJson(com.squareup.moshi.JsonReader reader) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        java.lang.Boolean bool = false;
        reader.beginObject();
        java.lang.Boolean bool2 = bool;
        java.lang.Boolean bool3 = bool2;
        java.lang.Boolean bool4 = bool3;
        java.lang.Boolean bool5 = bool4;
        java.lang.Boolean bool6 = bool5;
        java.lang.Boolean bool7 = bool6;
        java.lang.Boolean bool8 = bool7;
        java.lang.Boolean bool9 = bool8;
        java.lang.Boolean bool10 = bool9;
        java.lang.Boolean bool11 = bool10;
        java.lang.Integer num = 0;
        java.lang.Integer num2 = null;
        java.lang.Integer num3 = null;
        java.lang.Integer num4 = null;
        java.lang.Integer num5 = null;
        java.lang.Integer num6 = null;
        java.lang.Integer num7 = null;
        java.lang.Integer num8 = null;
        java.lang.Integer num9 = null;
        java.lang.Integer num10 = null;
        java.lang.Integer num11 = null;
        java.lang.Integer num12 = null;
        java.lang.Integer num13 = null;
        java.lang.Integer num14 = null;
        java.lang.Integer num15 = null;
        java.lang.Integer num16 = null;
        java.lang.Integer num17 = null;
        java.lang.Integer num18 = null;
        java.lang.Integer num19 = null;
        int i3 = -1;
        int i4 = -1;
        java.lang.String str = null;
        com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[] drinkBeanArr = null;
        java.util.List list = null;
        java.lang.Boolean bool12 = bool11;
        while (reader.hasNext()) {
            java.lang.Boolean bool13 = bool10;
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    bool10 = bool13;
                case 0:
                    bool = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        java.lang.Throwable unexpectedNull = com.squareup.moshi.internal.Util.unexpectedNull("callSwitch", "callSwitch", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull, "unexpectedNull(\"callSwit…    \"callSwitch\", reader)");
                        throw unexpectedNull;
                    }
                    i4 &= -2;
                    bool10 = bool13;
                case 1:
                    bool12 = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool12 == null) {
                        java.lang.Throwable unexpectedNull2 = com.squareup.moshi.internal.Util.unexpectedNull("messagePushSwitch", "messagePushSwitch", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull2, "unexpectedNull(\"messageP…ssagePushSwitch\", reader)");
                        throw unexpectedNull2;
                    }
                    i4 &= -3;
                    bool10 = bool13;
                case 2:
                    bool2 = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        java.lang.Throwable unexpectedNull3 = com.squareup.moshi.internal.Util.unexpectedNull("smsPushSwitch", "smsPushSwitch", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull3, "unexpectedNull(\"smsPushS… \"smsPushSwitch\", reader)");
                        throw unexpectedNull3;
                    }
                    i4 &= -5;
                    bool10 = bool13;
                case 3:
                    bool3 = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        java.lang.Throwable unexpectedNull4 = com.squareup.moshi.internal.Util.unexpectedNull("bpSwitch", "bpSwitch", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull4, "unexpectedNull(\"bpSwitch…      \"bpSwitch\", reader)");
                        throw unexpectedNull4;
                    }
                    i4 &= -9;
                    bool10 = bool13;
                case 4:
                    num = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        java.lang.Throwable unexpectedNull5 = com.squareup.moshi.internal.Util.unexpectedNull("bpStart", "bpStart", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull5, "unexpectedNull(\"bpStart\"…t\",\n              reader)");
                        throw unexpectedNull5;
                    }
                    i4 &= -17;
                    bool10 = bool13;
                case 5:
                    num2 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        java.lang.Throwable unexpectedNull6 = com.squareup.moshi.internal.Util.unexpectedNull("bpEnd", "bpEnd", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull6, "unexpectedNull(\"bpEnd\", \"bpEnd\", reader)");
                        throw unexpectedNull6;
                    }
                    i4 &= -33;
                    bool10 = bool13;
                case 6:
                    num3 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        java.lang.Throwable unexpectedNull7 = com.squareup.moshi.internal.Util.unexpectedNull("bpInterval", "bpInterval", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull7, "unexpectedNull(\"bpInterv…    \"bpInterval\", reader)");
                        throw unexpectedNull7;
                    }
                    i4 &= -65;
                    bool10 = bool13;
                case 7:
                    bool4 = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        java.lang.Throwable unexpectedNull8 = com.squareup.moshi.internal.Util.unexpectedNull("hrDetection", "hrDetection", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull8, "unexpectedNull(\"hrDetect…   \"hrDetection\", reader)");
                        throw unexpectedNull8;
                    }
                    i4 &= -129;
                    bool10 = bool13;
                case 8:
                    num4 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        java.lang.Throwable unexpectedNull9 = com.squareup.moshi.internal.Util.unexpectedNull("hrInterval", "hrInterval", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull9, "unexpectedNull(\"hrInterv…    \"hrInterval\", reader)");
                        throw unexpectedNull9;
                    }
                    i4 &= -257;
                    bool10 = bool13;
                case 9:
                    bool5 = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool5 == null) {
                        java.lang.Throwable unexpectedNull10 = com.squareup.moshi.internal.Util.unexpectedNull("bo2Detection", "bo2Detection", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull10, "unexpectedNull(\"bo2Detec…, \"bo2Detection\", reader)");
                        throw unexpectedNull10;
                    }
                    i4 &= -513;
                    bool10 = bool13;
                case 10:
                    bool6 = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool6 == null) {
                        java.lang.Throwable unexpectedNull11 = com.squareup.moshi.internal.Util.unexpectedNull("pressureDetection", "pressureDetection", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull11, "unexpectedNull(\"pressure…essureDetection\", reader)");
                        throw unexpectedNull11;
                    }
                    i4 &= -1025;
                    bool10 = bool13;
                case 11:
                    bool7 = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool7 == null) {
                        java.lang.Throwable unexpectedNull12 = com.squareup.moshi.internal.Util.unexpectedNull("wristSense", "wristSense", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull12, "unexpectedNull(\"wristSen…    \"wristSense\", reader)");
                        throw unexpectedNull12;
                    }
                    i4 &= -2049;
                    bool10 = bool13;
                case 12:
                    num5 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num5 == null) {
                        java.lang.Throwable unexpectedNull13 = com.squareup.moshi.internal.Util.unexpectedNull("wristSenseHand", "wristSenseHand", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull13, "unexpectedNull(\"wristSen…\"wristSenseHand\", reader)");
                        throw unexpectedNull13;
                    }
                    i4 &= -4097;
                    bool10 = bool13;
                case 13:
                    num6 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num6 == null) {
                        java.lang.Throwable unexpectedNull14 = com.squareup.moshi.internal.Util.unexpectedNull("timeFormat", "timeFormat", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull14, "unexpectedNull(\"timeForm…    \"timeFormat\", reader)");
                        throw unexpectedNull14;
                    }
                    i4 &= -8193;
                    bool10 = bool13;
                case 14:
                    num7 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num7 == null) {
                        java.lang.Throwable unexpectedNull15 = com.squareup.moshi.internal.Util.unexpectedNull("weatherFormat", "weatherFormat", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull15, "unexpectedNull(\"weatherF… \"weatherFormat\", reader)");
                        throw unexpectedNull15;
                    }
                    i4 &= -16385;
                    bool10 = bool13;
                case 15:
                    num8 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num8 == null) {
                        java.lang.Throwable unexpectedNull16 = com.squareup.moshi.internal.Util.unexpectedNull("metricUnit", "metricUnit", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull16, "unexpectedNull(\"metricUn…    \"metricUnit\", reader)");
                        throw unexpectedNull16;
                    }
                    i2 = -32769;
                    i4 &= i2;
                    bool10 = bool13;
                case 16:
                    bool8 = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool8 == null) {
                        java.lang.Throwable unexpectedNull17 = com.squareup.moshi.internal.Util.unexpectedNull("disturbSwitch", "disturbSwitch", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull17, "unexpectedNull(\"disturbS… \"disturbSwitch\", reader)");
                        throw unexpectedNull17;
                    }
                    i2 = -65537;
                    i4 &= i2;
                    bool10 = bool13;
                case 17:
                    bool9 = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool9 == null) {
                        java.lang.Throwable unexpectedNull18 = com.squareup.moshi.internal.Util.unexpectedNull("disturbManualSwitch", "disturbManualSwitch", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull18, "unexpectedNull(\"disturbM…urbManualSwitch\", reader)");
                        throw unexpectedNull18;
                    }
                    i2 = -131073;
                    i4 &= i2;
                    bool10 = bool13;
                case 18:
                    num9 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num9 == null) {
                        java.lang.Throwable unexpectedNull19 = com.squareup.moshi.internal.Util.unexpectedNull("disturbStart", "disturbStart", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull19, "unexpectedNull(\"disturbS…  \"disturbStart\", reader)");
                        throw unexpectedNull19;
                    }
                    i2 = -262145;
                    i4 &= i2;
                    bool10 = bool13;
                case 19:
                    num10 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num10 == null) {
                        java.lang.Throwable unexpectedNull20 = com.squareup.moshi.internal.Util.unexpectedNull("disturbEnd", "disturbEnd", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull20, "unexpectedNull(\"disturbE…    \"disturbEnd\", reader)");
                        throw unexpectedNull20;
                    }
                    i2 = -524289;
                    i4 &= i2;
                    bool10 = bool13;
                case 20:
                    str = (java.lang.String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        java.lang.Throwable unexpectedNull21 = com.squareup.moshi.internal.Util.unexpectedNull("firmwareVersion", "firmwareVersion", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull21, "unexpectedNull(\"firmware…firmwareVersion\", reader)");
                        throw unexpectedNull21;
                    }
                    i2 = -1048577;
                    i4 &= i2;
                    bool10 = bool13;
                case 21:
                    num11 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num11 == null) {
                        java.lang.Throwable unexpectedNull22 = com.squareup.moshi.internal.Util.unexpectedNull("screenLight", "screenLight", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull22, "unexpectedNull(\"screenLi…   \"screenLight\", reader)");
                        throw unexpectedNull22;
                    }
                    i2 = -2097153;
                    i4 &= i2;
                    bool10 = bool13;
                case 22:
                    bool10 = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool10 == null) {
                        java.lang.Throwable unexpectedNull23 = com.squareup.moshi.internal.Util.unexpectedNull("longSitSwitch", "longSitSwitch", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull23, "unexpectedNull(\"longSitS… \"longSitSwitch\", reader)");
                        throw unexpectedNull23;
                    }
                    i4 &= -4194305;
                case 23:
                    num12 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num12 == null) {
                        java.lang.Throwable unexpectedNull24 = com.squareup.moshi.internal.Util.unexpectedNull("longSitStart", "longSitStart", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull24, "unexpectedNull(\"longSitS…  \"longSitStart\", reader)");
                        throw unexpectedNull24;
                    }
                    i2 = -8388609;
                    i4 &= i2;
                    bool10 = bool13;
                case 24:
                    num13 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num13 == null) {
                        java.lang.Throwable unexpectedNull25 = com.squareup.moshi.internal.Util.unexpectedNull("longSitEnd", "longSitEnd", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull25, "unexpectedNull(\"longSitE…    \"longSitEnd\", reader)");
                        throw unexpectedNull25;
                    }
                    i2 = -16777217;
                    i4 &= i2;
                    bool10 = bool13;
                case 25:
                    num14 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num14 == null) {
                        java.lang.Throwable unexpectedNull26 = com.squareup.moshi.internal.Util.unexpectedNull("longSitDuring", "longSitDuring", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull26, "unexpectedNull(\"longSitD… \"longSitDuring\", reader)");
                        throw unexpectedNull26;
                    }
                    i2 = -33554433;
                    i4 &= i2;
                    bool10 = bool13;
                case 26:
                    num15 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num15 == null) {
                        java.lang.Throwable unexpectedNull27 = com.squareup.moshi.internal.Util.unexpectedNull("longSitWeek", "longSitWeek", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull27, "unexpectedNull(\"longSitW…   \"longSitWeek\", reader)");
                        throw unexpectedNull27;
                    }
                    i2 = -67108865;
                    i4 &= i2;
                    bool10 = bool13;
                case 27:
                    bool11 = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool11 == null) {
                        java.lang.Throwable unexpectedNull28 = com.squareup.moshi.internal.Util.unexpectedNull("drinkSwitch", "drinkSwitch", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull28, "unexpectedNull(\"drinkSwi…   \"drinkSwitch\", reader)");
                        throw unexpectedNull28;
                    }
                    i2 = -134217729;
                    i4 &= i2;
                    bool10 = bool13;
                case 28:
                    num16 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num16 == null) {
                        java.lang.Throwable unexpectedNull29 = com.squareup.moshi.internal.Util.unexpectedNull("drinkWeek", "drinkWeek", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull29, "unexpectedNull(\"drinkWee…     \"drinkWeek\", reader)");
                        throw unexpectedNull29;
                    }
                    i2 = -268435457;
                    i4 &= i2;
                    bool10 = bool13;
                case 29:
                    drinkBeanArr = (com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[]) this.arrayOfDrinkBeanAdapter.fromJson(reader);
                    if (drinkBeanArr == null) {
                        java.lang.Throwable unexpectedNull30 = com.squareup.moshi.internal.Util.unexpectedNull("drinkArray", "drinkArray", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull30, "unexpectedNull(\"drinkArray\", \"drinkArray\", reader)");
                        throw unexpectedNull30;
                    }
                    i2 = -536870913;
                    i4 &= i2;
                    bool10 = bool13;
                case 30:
                    list = (java.util.List) this.mutableListOfAlarmBeanAdapter.fromJson(reader);
                    if (list == null) {
                        java.lang.Throwable unexpectedNull31 = com.squareup.moshi.internal.Util.unexpectedNull("alarmList", "alarmList", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull31, "unexpectedNull(\"alarmList\", \"alarmList\", reader)");
                        throw unexpectedNull31;
                    }
                    i2 = -1073741825;
                    i4 &= i2;
                    bool10 = bool13;
                case 31:
                    num17 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num17 == null) {
                        java.lang.Throwable unexpectedNull32 = com.squareup.moshi.internal.Util.unexpectedNull("avatarScreen", "avatarScreen", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull32, "unexpectedNull(\"avatarSc…  \"avatarScreen\", reader)");
                        throw unexpectedNull32;
                    }
                    i2 = com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    i4 &= i2;
                    bool10 = bool13;
                case 32:
                    num18 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num18 == null) {
                        java.lang.Throwable unexpectedNull33 = com.squareup.moshi.internal.Util.unexpectedNull("avatarWidth", "avatarWidth", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull33, "unexpectedNull(\"avatarWi…   \"avatarWidth\", reader)");
                        throw unexpectedNull33;
                    }
                    i3 &= -2;
                    bool10 = bool13;
                case 33:
                    num19 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                    if (num19 == null) {
                        java.lang.Throwable unexpectedNull34 = com.squareup.moshi.internal.Util.unexpectedNull("avatarHeight", "avatarHeight", reader);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull34, "unexpectedNull(\"avatarHe…  \"avatarHeight\", reader)");
                        throw unexpectedNull34;
                    }
                    i3 &= -3;
                    bool10 = bool13;
                default:
                    bool10 = bool13;
            }
        }
        java.lang.Boolean bool14 = bool10;
        reader.endObject();
        if (i4 == 0 && i3 == -4) {
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool12.booleanValue();
            boolean booleanValue3 = bool2.booleanValue();
            boolean booleanValue4 = bool3.booleanValue();
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            int intValue3 = num3.intValue();
            boolean booleanValue5 = bool4.booleanValue();
            int intValue4 = num4.intValue();
            boolean booleanValue6 = bool5.booleanValue();
            boolean booleanValue7 = bool6.booleanValue();
            boolean booleanValue8 = bool7.booleanValue();
            int intValue5 = num5.intValue();
            int intValue6 = num6.intValue();
            int intValue7 = num7.intValue();
            int intValue8 = num8.intValue();
            boolean booleanValue9 = bool8.booleanValue();
            boolean booleanValue10 = bool9.booleanValue();
            int intValue9 = num9.intValue();
            int intValue10 = num10.intValue();
            java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            int intValue11 = num11.intValue();
            boolean booleanValue11 = bool14.booleanValue();
            int intValue12 = num12.intValue();
            int intValue13 = num13.intValue();
            int intValue14 = num14.intValue();
            int intValue15 = num15.intValue();
            boolean booleanValue12 = bool11.booleanValue();
            int intValue16 = num16.intValue();
            com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[] drinkBeanArr2 = drinkBeanArr;
            java.util.Objects.requireNonNull(drinkBeanArr2, "null cannot be cast to non-null type kotlin.Array<com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean>");
            java.util.List list2 = list;
            java.util.Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean>");
            return new com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting(booleanValue, booleanValue2, booleanValue3, booleanValue4, intValue, intValue2, intValue3, booleanValue5, intValue4, booleanValue6, booleanValue7, booleanValue8, intValue5, intValue6, intValue7, intValue8, booleanValue9, booleanValue10, intValue9, intValue10, str, intValue11, booleanValue11, intValue12, intValue13, intValue14, intValue15, booleanValue12, intValue16, drinkBeanArr2, kotlin.jvm.internal.TypeIntrinsics.asMutableList(list2), num17.intValue(), num18.intValue(), num19.intValue());
        }
        com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[] drinkBeanArr3 = drinkBeanArr;
        java.lang.reflect.Constructor<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> constructor = this.constructorRef;
        int i5 = i3;
        if (constructor == null) {
            i = i4;
            constructor = com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting.class.getDeclaredConstructor(java.lang.Boolean.TYPE, java.lang.Boolean.TYPE, java.lang.Boolean.TYPE, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, java.lang.Boolean.TYPE, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.String.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[].class, java.util.List.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, com.squareup.moshi.internal.Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructor, "DeviceSetting::class.jav…his.constructorRef = it }");
        } else {
            i = i4;
        }
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting newInstance = constructor.newInstance(bool, bool12, bool2, bool3, num, num2, num3, bool4, num4, bool5, bool6, bool7, num5, num6, num7, num8, bool8, bool9, num9, num10, str, num11, bool14, num12, num13, num14, num15, bool11, num16, drinkBeanArr3, list, num17, num18, num19, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i5), null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(com.squareup.moshi.JsonWriter writer, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting value_) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
        java.util.Objects.requireNonNull(value_, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.beginObject();
        writer.name("callSwitch");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getCallSwitch()));
        writer.name("messagePushSwitch");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getMessagePushSwitch()));
        writer.name("smsPushSwitch");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getSmsPushSwitch()));
        writer.name("bpSwitch");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getBpSwitch()));
        writer.name("bpStart");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getBpStart()));
        writer.name("bpEnd");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getBpEnd()));
        writer.name("bpInterval");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getBpInterval()));
        writer.name("hrDetection");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getHrDetection()));
        writer.name("hrInterval");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getHrInterval()));
        writer.name("bo2Detection");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getBo2Detection()));
        writer.name("pressureDetection");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getPressureDetection()));
        writer.name("wristSense");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getWristSense()));
        writer.name("wristSenseHand");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getWristSenseHand()));
        writer.name("timeFormat");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getTimeFormat()));
        writer.name("weatherFormat");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getWeatherFormat()));
        writer.name("metricUnit");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getMetricUnit()));
        writer.name("disturbSwitch");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getDisturbSwitch()));
        writer.name("disturbManualSwitch");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getDisturbManualSwitch()));
        writer.name("disturbStart");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getDisturbStart()));
        writer.name("disturbEnd");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getDisturbEnd()));
        writer.name("firmwareVersion");
        this.stringAdapter.toJson(writer, value_.getFirmwareVersion());
        writer.name("screenLight");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getScreenLight()));
        writer.name("longSitSwitch");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getLongSitSwitch()));
        writer.name("longSitStart");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getLongSitStart()));
        writer.name("longSitEnd");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getLongSitEnd()));
        writer.name("longSitDuring");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getLongSitDuring()));
        writer.name("longSitWeek");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getLongSitWeek()));
        writer.name("drinkSwitch");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getDrinkSwitch()));
        writer.name("drinkWeek");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getDrinkWeek()));
        writer.name("drinkArray");
        this.arrayOfDrinkBeanAdapter.toJson(writer, value_.getDrinkArray());
        writer.name("alarmList");
        this.mutableListOfAlarmBeanAdapter.toJson(writer, value_.getAlarmList());
        writer.name("avatarScreen");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getAvatarScreen()));
        writer.name("avatarWidth");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getAvatarWidth()));
        writer.name("avatarHeight");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getAvatarHeight()));
        writer.endObject();
    }
}
