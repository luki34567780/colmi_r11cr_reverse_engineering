package com.qcwireless.qcwatch.ui.base.bean.device;

/* compiled from: DeviceSetting.kt */
@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b|\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\b\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&\u0012\b\b\u0002\u0010(\u001a\u00020\b\u0012\b\b\u0002\u0010)\u001a\u00020\b\u0012\b\b\u0002\u0010*\u001a\u00020\b¢\u0006\u0002\u0010+J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\bHÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020$0#HÆ\u0003¢\u0006\u0002\u0010OJ\u0010\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020'0&HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\bHÆ\u0003Jð\u0002\u0010\u009d\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\b2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\bHÆ\u0001¢\u0006\u0003\u0010\u009e\u0001J\u0015\u0010\u009f\u0001\u001a\u00020\u00032\t\u0010 \u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010¡\u0001\u001a\u00020\bH\u0016J\n\u0010¢\u0001\u001a\u00020\u0019HÖ\u0001R \u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010*\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010(\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00101\"\u0004\b5\u00103R\u001a\u0010)\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00101\"\u0004\b=\u00103R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00101\"\u0004\b?\u00103R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00101\"\u0004\bA\u00103R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00109\"\u0004\bC\u0010;R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00109\"\u0004\bE\u0010;R\u001a\u0010\u0017\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00101\"\u0004\bG\u00103R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00109\"\u0004\bI\u0010;R\u001a\u0010\u0016\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00101\"\u0004\bK\u00103R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00109\"\u0004\bM\u0010;R\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0086\u000e¢\u0006\u0010\n\u0002\u0010R\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u00109\"\u0004\bT\u0010;R\u001a\u0010!\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u00101\"\u0004\bV\u00103R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u00109\"\u0004\b\\\u0010;R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u00101\"\u0004\b^\u00103R\u001a\u0010\u001e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u00101\"\u0004\b`\u00103R\u001a\u0010\u001d\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u00101\"\u0004\bb\u00103R\u001a\u0010\u001c\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u00101\"\u0004\bd\u00103R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u00109\"\u0004\bf\u0010;R\u001a\u0010\u001f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u00101\"\u0004\bh\u00103R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u00109\"\u0004\bj\u0010;R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u00101\"\u0004\bl\u00103R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u00109\"\u0004\bn\u0010;R\u001a\u0010\u001a\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u00101\"\u0004\bp\u00103R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u00109\"\u0004\br\u0010;R\u001a\u0010\u0011\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u00101\"\u0004\bt\u00103R\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u00101\"\u0004\bv\u00103R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u00109\"\u0004\bx\u0010;R\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u00101\"\u0004\bz\u00103¨\u0006£\u0001"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "", "callSwitch", "", "messagePushSwitch", "smsPushSwitch", "bpSwitch", "bpStart", "", "bpEnd", "bpInterval", "hrDetection", "hrInterval", "bo2Detection", "pressureDetection", "wristSense", "wristSenseHand", "timeFormat", "weatherFormat", "metricUnit", "disturbSwitch", "disturbManualSwitch", "disturbStart", "disturbEnd", "firmwareVersion", "", "screenLight", "longSitSwitch", "longSitStart", "longSitEnd", "longSitDuring", "longSitWeek", "drinkSwitch", "drinkWeek", "drinkArray", "", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DrinkBean;", "alarmList", "", "Lcom/qcwireless/qcwatch/ui/base/bean/device/AlarmBean;", "avatarScreen", "avatarWidth", "avatarHeight", "(ZZZZIIIZIZZZIIIIZZIILjava/lang/String;IZIIIIZI[Lcom/qcwireless/qcwatch/ui/base/bean/device/DrinkBean;Ljava/util/List;III)V", "getAlarmList", "()Ljava/util/List;", "setAlarmList", "(Ljava/util/List;)V", "getAvatarHeight", "()I", "setAvatarHeight", "(I)V", "getAvatarScreen", "setAvatarScreen", "getAvatarWidth", "setAvatarWidth", "getBo2Detection", "()Z", "setBo2Detection", "(Z)V", "getBpEnd", "setBpEnd", "getBpInterval", "setBpInterval", "getBpStart", "setBpStart", "getBpSwitch", "setBpSwitch", "getCallSwitch", "setCallSwitch", "getDisturbEnd", "setDisturbEnd", "getDisturbManualSwitch", "setDisturbManualSwitch", "getDisturbStart", "setDisturbStart", "getDisturbSwitch", "setDisturbSwitch", "getDrinkArray", "()[Lcom/qcwireless/qcwatch/ui/base/bean/device/DrinkBean;", "setDrinkArray", "([Lcom/qcwireless/qcwatch/ui/base/bean/device/DrinkBean;)V", "[Lcom/qcwireless/qcwatch/ui/base/bean/device/DrinkBean;", "getDrinkSwitch", "setDrinkSwitch", "getDrinkWeek", "setDrinkWeek", "getFirmwareVersion", "()Ljava/lang/String;", "setFirmwareVersion", "(Ljava/lang/String;)V", "getHrDetection", "setHrDetection", "getHrInterval", "setHrInterval", "getLongSitDuring", "setLongSitDuring", "getLongSitEnd", "setLongSitEnd", "getLongSitStart", "setLongSitStart", "getLongSitSwitch", "setLongSitSwitch", "getLongSitWeek", "setLongSitWeek", "getMessagePushSwitch", "setMessagePushSwitch", "getMetricUnit", "setMetricUnit", "getPressureDetection", "setPressureDetection", "getScreenLight", "setScreenLight", "getSmsPushSwitch", "setSmsPushSwitch", "getTimeFormat", "setTimeFormat", "getWeatherFormat", "setWeatherFormat", "getWristSense", "setWristSense", "getWristSenseHand", "setWristSenseHand", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZZZIIIZIZZZIIIIZZIILjava/lang/String;IZIIIIZI[Lcom/qcwireless/qcwatch/ui/base/bean/device/DrinkBean;Ljava/util/List;III)Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final /* data */ class DeviceSetting {
    private java.util.List<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean> alarmList;
    private int avatarHeight;
    private int avatarScreen;
    private int avatarWidth;
    private boolean bo2Detection;
    private int bpEnd;
    private int bpInterval;
    private int bpStart;
    private boolean bpSwitch;
    private boolean callSwitch;
    private int disturbEnd;
    private boolean disturbManualSwitch;
    private int disturbStart;
    private boolean disturbSwitch;
    private com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[] drinkArray;
    private boolean drinkSwitch;
    private int drinkWeek;
    private java.lang.String firmwareVersion;
    private boolean hrDetection;
    private int hrInterval;
    private int longSitDuring;
    private int longSitEnd;
    private int longSitStart;
    private boolean longSitSwitch;
    private int longSitWeek;
    private boolean messagePushSwitch;
    private int metricUnit;
    private boolean pressureDetection;
    private int screenLight;
    private boolean smsPushSwitch;
    private int timeFormat;
    private int weatherFormat;
    private boolean wristSense;
    private int wristSenseHand;

    public DeviceSetting() {
        this(false, false, false, false, 0, 0, 0, false, 0, false, false, false, 0, 0, 0, 0, false, false, 0, 0, null, 0, false, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, -1, 3, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCallSwitch() {
        return this.callSwitch;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getBo2Detection() {
        return this.bo2Detection;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getPressureDetection() {
        return this.pressureDetection;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getWristSense() {
        return this.wristSense;
    }

    /* renamed from: component13, reason: from getter */
    public final int getWristSenseHand() {
        return this.wristSenseHand;
    }

    /* renamed from: component14, reason: from getter */
    public final int getTimeFormat() {
        return this.timeFormat;
    }

    /* renamed from: component15, reason: from getter */
    public final int getWeatherFormat() {
        return this.weatherFormat;
    }

    /* renamed from: component16, reason: from getter */
    public final int getMetricUnit() {
        return this.metricUnit;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getDisturbSwitch() {
        return this.disturbSwitch;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getDisturbManualSwitch() {
        return this.disturbManualSwitch;
    }

    /* renamed from: component19, reason: from getter */
    public final int getDisturbStart() {
        return this.disturbStart;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMessagePushSwitch() {
        return this.messagePushSwitch;
    }

    /* renamed from: component20, reason: from getter */
    public final int getDisturbEnd() {
        return this.disturbEnd;
    }

    /* renamed from: component21, reason: from getter */
    public final java.lang.String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* renamed from: component22, reason: from getter */
    public final int getScreenLight() {
        return this.screenLight;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getLongSitSwitch() {
        return this.longSitSwitch;
    }

    /* renamed from: component24, reason: from getter */
    public final int getLongSitStart() {
        return this.longSitStart;
    }

    /* renamed from: component25, reason: from getter */
    public final int getLongSitEnd() {
        return this.longSitEnd;
    }

    /* renamed from: component26, reason: from getter */
    public final int getLongSitDuring() {
        return this.longSitDuring;
    }

    /* renamed from: component27, reason: from getter */
    public final int getLongSitWeek() {
        return this.longSitWeek;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getDrinkSwitch() {
        return this.drinkSwitch;
    }

    /* renamed from: component29, reason: from getter */
    public final int getDrinkWeek() {
        return this.drinkWeek;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSmsPushSwitch() {
        return this.smsPushSwitch;
    }

    /* renamed from: component30, reason: from getter */
    public final com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[] getDrinkArray() {
        return this.drinkArray;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean> component31() {
        return this.alarmList;
    }

    /* renamed from: component32, reason: from getter */
    public final int getAvatarScreen() {
        return this.avatarScreen;
    }

    /* renamed from: component33, reason: from getter */
    public final int getAvatarWidth() {
        return this.avatarWidth;
    }

    /* renamed from: component34, reason: from getter */
    public final int getAvatarHeight() {
        return this.avatarHeight;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getBpSwitch() {
        return this.bpSwitch;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBpStart() {
        return this.bpStart;
    }

    /* renamed from: component6, reason: from getter */
    public final int getBpEnd() {
        return this.bpEnd;
    }

    /* renamed from: component7, reason: from getter */
    public final int getBpInterval() {
        return this.bpInterval;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHrDetection() {
        return this.hrDetection;
    }

    /* renamed from: component9, reason: from getter */
    public final int getHrInterval() {
        return this.hrInterval;
    }

    public final com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting copy(boolean callSwitch, boolean messagePushSwitch, boolean smsPushSwitch, boolean bpSwitch, int bpStart, int bpEnd, int bpInterval, boolean hrDetection, int hrInterval, boolean bo2Detection, boolean pressureDetection, boolean wristSense, int wristSenseHand, int timeFormat, int weatherFormat, int metricUnit, boolean disturbSwitch, boolean disturbManualSwitch, int disturbStart, int disturbEnd, java.lang.String firmwareVersion, int screenLight, boolean longSitSwitch, int longSitStart, int longSitEnd, int longSitDuring, int longSitWeek, boolean drinkSwitch, int drinkWeek, com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[] drinkArray, java.util.List<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean> alarmList, int avatarScreen, int avatarWidth, int avatarHeight) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drinkArray, "drinkArray");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarmList, "alarmList");
        return new com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting(callSwitch, messagePushSwitch, smsPushSwitch, bpSwitch, bpStart, bpEnd, bpInterval, hrDetection, hrInterval, bo2Detection, pressureDetection, wristSense, wristSenseHand, timeFormat, weatherFormat, metricUnit, disturbSwitch, disturbManualSwitch, disturbStart, disturbEnd, firmwareVersion, screenLight, longSitSwitch, longSitStart, longSitEnd, longSitDuring, longSitWeek, drinkSwitch, drinkWeek, drinkArray, alarmList, avatarScreen, avatarWidth, avatarHeight);
    }

    public java.lang.String toString() {
        return "DeviceSetting(callSwitch=" + this.callSwitch + ", messagePushSwitch=" + this.messagePushSwitch + ", smsPushSwitch=" + this.smsPushSwitch + ", bpSwitch=" + this.bpSwitch + ", bpStart=" + this.bpStart + ", bpEnd=" + this.bpEnd + ", bpInterval=" + this.bpInterval + ", hrDetection=" + this.hrDetection + ", hrInterval=" + this.hrInterval + ", bo2Detection=" + this.bo2Detection + ", pressureDetection=" + this.pressureDetection + ", wristSense=" + this.wristSense + ", wristSenseHand=" + this.wristSenseHand + ", timeFormat=" + this.timeFormat + ", weatherFormat=" + this.weatherFormat + ", metricUnit=" + this.metricUnit + ", disturbSwitch=" + this.disturbSwitch + ", disturbManualSwitch=" + this.disturbManualSwitch + ", disturbStart=" + this.disturbStart + ", disturbEnd=" + this.disturbEnd + ", firmwareVersion=" + this.firmwareVersion + ", screenLight=" + this.screenLight + ", longSitSwitch=" + this.longSitSwitch + ", longSitStart=" + this.longSitStart + ", longSitEnd=" + this.longSitEnd + ", longSitDuring=" + this.longSitDuring + ", longSitWeek=" + this.longSitWeek + ", drinkSwitch=" + this.drinkSwitch + ", drinkWeek=" + this.drinkWeek + ", drinkArray=" + java.util.Arrays.toString(this.drinkArray) + ", alarmList=" + this.alarmList + ", avatarScreen=" + this.avatarScreen + ", avatarWidth=" + this.avatarWidth + ", avatarHeight=" + this.avatarHeight + ')';
    }

    public DeviceSetting(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, boolean z5, int i4, boolean z6, boolean z7, boolean z8, int i5, int i6, int i7, int i8, boolean z9, boolean z10, int i9, int i10, java.lang.String str, int i11, boolean z11, int i12, int i13, int i14, int i15, boolean z12, int i16, com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[] drinkBeanArr, java.util.List<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean> list, int i17, int i18, int i19) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "firmwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drinkBeanArr, "drinkArray");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "alarmList");
        this.callSwitch = z;
        this.messagePushSwitch = z2;
        this.smsPushSwitch = z3;
        this.bpSwitch = z4;
        this.bpStart = i;
        this.bpEnd = i2;
        this.bpInterval = i3;
        this.hrDetection = z5;
        this.hrInterval = i4;
        this.bo2Detection = z6;
        this.pressureDetection = z7;
        this.wristSense = z8;
        this.wristSenseHand = i5;
        this.timeFormat = i6;
        this.weatherFormat = i7;
        this.metricUnit = i8;
        this.disturbSwitch = z9;
        this.disturbManualSwitch = z10;
        this.disturbStart = i9;
        this.disturbEnd = i10;
        this.firmwareVersion = str;
        this.screenLight = i11;
        this.longSitSwitch = z11;
        this.longSitStart = i12;
        this.longSitEnd = i13;
        this.longSitDuring = i14;
        this.longSitWeek = i15;
        this.drinkSwitch = z12;
        this.drinkWeek = i16;
        this.drinkArray = drinkBeanArr;
        this.alarmList = list;
        this.avatarScreen = i17;
        this.avatarWidth = i18;
        this.avatarHeight = i19;
    }

    public final boolean getCallSwitch() {
        return this.callSwitch;
    }

    public final void setCallSwitch(boolean z) {
        this.callSwitch = z;
    }

    public final boolean getMessagePushSwitch() {
        return this.messagePushSwitch;
    }

    public final void setMessagePushSwitch(boolean z) {
        this.messagePushSwitch = z;
    }

    public final boolean getSmsPushSwitch() {
        return this.smsPushSwitch;
    }

    public final void setSmsPushSwitch(boolean z) {
        this.smsPushSwitch = z;
    }

    public final boolean getBpSwitch() {
        return this.bpSwitch;
    }

    public final void setBpSwitch(boolean z) {
        this.bpSwitch = z;
    }

    public final int getBpStart() {
        return this.bpStart;
    }

    public final void setBpStart(int i) {
        this.bpStart = i;
    }

    public final int getBpEnd() {
        return this.bpEnd;
    }

    public final void setBpEnd(int i) {
        this.bpEnd = i;
    }

    public final int getBpInterval() {
        return this.bpInterval;
    }

    public final void setBpInterval(int i) {
        this.bpInterval = i;
    }

    public final boolean getHrDetection() {
        return this.hrDetection;
    }

    public final void setHrDetection(boolean z) {
        this.hrDetection = z;
    }

    public final int getHrInterval() {
        return this.hrInterval;
    }

    public final void setHrInterval(int i) {
        this.hrInterval = i;
    }

    public final boolean getBo2Detection() {
        return this.bo2Detection;
    }

    public final void setBo2Detection(boolean z) {
        this.bo2Detection = z;
    }

    public final boolean getPressureDetection() {
        return this.pressureDetection;
    }

    public final void setPressureDetection(boolean z) {
        this.pressureDetection = z;
    }

    public final boolean getWristSense() {
        return this.wristSense;
    }

    public final void setWristSense(boolean z) {
        this.wristSense = z;
    }

    public final int getWristSenseHand() {
        return this.wristSenseHand;
    }

    public final void setWristSenseHand(int i) {
        this.wristSenseHand = i;
    }

    public final int getTimeFormat() {
        return this.timeFormat;
    }

    public final void setTimeFormat(int i) {
        this.timeFormat = i;
    }

    public final int getWeatherFormat() {
        return this.weatherFormat;
    }

    public final void setWeatherFormat(int i) {
        this.weatherFormat = i;
    }

    public final int getMetricUnit() {
        return this.metricUnit;
    }

    public final void setMetricUnit(int i) {
        this.metricUnit = i;
    }

    public final boolean getDisturbSwitch() {
        return this.disturbSwitch;
    }

    public final void setDisturbSwitch(boolean z) {
        this.disturbSwitch = z;
    }

    public final boolean getDisturbManualSwitch() {
        return this.disturbManualSwitch;
    }

    public final void setDisturbManualSwitch(boolean z) {
        this.disturbManualSwitch = z;
    }

    public final int getDisturbStart() {
        return this.disturbStart;
    }

    public final void setDisturbStart(int i) {
        this.disturbStart = i;
    }

    public final int getDisturbEnd() {
        return this.disturbEnd;
    }

    public final void setDisturbEnd(int i) {
        this.disturbEnd = i;
    }

    public final java.lang.String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final void setFirmwareVersion(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firmwareVersion = str;
    }

    public final int getScreenLight() {
        return this.screenLight;
    }

    public final void setScreenLight(int i) {
        this.screenLight = i;
    }

    public final boolean getLongSitSwitch() {
        return this.longSitSwitch;
    }

    public final void setLongSitSwitch(boolean z) {
        this.longSitSwitch = z;
    }

    public final int getLongSitStart() {
        return this.longSitStart;
    }

    public final void setLongSitStart(int i) {
        this.longSitStart = i;
    }

    public final int getLongSitEnd() {
        return this.longSitEnd;
    }

    public final void setLongSitEnd(int i) {
        this.longSitEnd = i;
    }

    public final int getLongSitDuring() {
        return this.longSitDuring;
    }

    public final void setLongSitDuring(int i) {
        this.longSitDuring = i;
    }

    public final int getLongSitWeek() {
        return this.longSitWeek;
    }

    public final void setLongSitWeek(int i) {
        this.longSitWeek = i;
    }

    public final boolean getDrinkSwitch() {
        return this.drinkSwitch;
    }

    public final void setDrinkSwitch(boolean z) {
        this.drinkSwitch = z;
    }

    public final int getDrinkWeek() {
        return this.drinkWeek;
    }

    public final void setDrinkWeek(int i) {
        this.drinkWeek = i;
    }

    public final com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[] getDrinkArray() {
        return this.drinkArray;
    }

    public final void setDrinkArray(com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[] drinkBeanArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drinkBeanArr, "<set-?>");
        this.drinkArray = drinkBeanArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DeviceSetting(boolean r38, boolean r39, boolean r40, boolean r41, int r42, int r43, int r44, boolean r45, int r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, boolean r54, boolean r55, int r56, int r57, java.lang.String r58, int r59, boolean r60, int r61, int r62, int r63, int r64, boolean r65, int r66, com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[] r67, java.util.List r68, int r69, int r70, int r71, int r72, int r73, kotlin.jvm.internal.DefaultConstructorMarker r74) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting.<init>(boolean, boolean, boolean, boolean, int, int, int, boolean, int, boolean, boolean, boolean, int, int, int, int, boolean, boolean, int, int, java.lang.String, int, boolean, int, int, int, int, boolean, int, com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean[], java.util.List, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean> getAlarmList() {
        return this.alarmList;
    }

    public final void setAlarmList(java.util.List<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.alarmList = list;
    }

    public final int getAvatarScreen() {
        return this.avatarScreen;
    }

    public final void setAvatarScreen(int i) {
        this.avatarScreen = i;
    }

    public final int getAvatarWidth() {
        return this.avatarWidth;
    }

    public final void setAvatarWidth(int i) {
        this.avatarWidth = i;
    }

    public final int getAvatarHeight() {
        return this.avatarHeight;
    }

    public final void setAvatarHeight(int i) {
        this.avatarHeight = i;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        java.util.Objects.requireNonNull(other, "null cannot be cast to non-null type com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = (com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) other;
        return this.callSwitch == deviceSetting.callSwitch && this.messagePushSwitch == deviceSetting.messagePushSwitch && this.smsPushSwitch == deviceSetting.smsPushSwitch && this.bpSwitch == deviceSetting.bpSwitch && this.bpStart == deviceSetting.bpStart && this.bpEnd == deviceSetting.bpEnd && this.bpInterval == deviceSetting.bpInterval && this.hrDetection == deviceSetting.hrDetection && this.wristSense == deviceSetting.wristSense && this.wristSenseHand == deviceSetting.wristSenseHand && this.timeFormat == deviceSetting.timeFormat && this.weatherFormat == deviceSetting.weatherFormat && this.metricUnit == deviceSetting.metricUnit && this.disturbSwitch == deviceSetting.disturbSwitch && this.disturbStart == deviceSetting.disturbStart && this.disturbEnd == deviceSetting.disturbEnd && kotlin.jvm.internal.Intrinsics.areEqual(this.firmwareVersion, deviceSetting.firmwareVersion) && this.screenLight == deviceSetting.screenLight && this.longSitSwitch == deviceSetting.longSitSwitch && this.longSitStart == deviceSetting.longSitStart && this.longSitEnd == deviceSetting.longSitEnd && this.longSitDuring == deviceSetting.longSitDuring && this.longSitWeek == deviceSetting.longSitWeek && this.drinkSwitch == deviceSetting.drinkSwitch && this.drinkWeek == deviceSetting.drinkWeek && java.util.Arrays.equals(this.drinkArray, deviceSetting.drinkArray) && kotlin.jvm.internal.Intrinsics.areEqual(this.alarmList, deviceSetting.alarmList);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting$$ExternalSyntheticBackport0.m(this.callSwitch) * 31) + com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting$$ExternalSyntheticBackport0.m(this.messagePushSwitch)) * 31) + com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting$$ExternalSyntheticBackport0.m(this.smsPushSwitch)) * 31) + com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting$$ExternalSyntheticBackport0.m(this.bpSwitch)) * 31) + this.bpStart) * 31) + this.bpEnd) * 31) + this.bpInterval) * 31) + com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting$$ExternalSyntheticBackport0.m(this.hrDetection)) * 31) + com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting$$ExternalSyntheticBackport0.m(this.wristSense)) * 31) + this.wristSenseHand) * 31) + this.timeFormat) * 31) + this.weatherFormat) * 31) + this.metricUnit) * 31) + com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting$$ExternalSyntheticBackport0.m(this.disturbSwitch)) * 31) + this.disturbStart) * 31) + this.disturbEnd) * 31) + this.firmwareVersion.hashCode()) * 31) + this.screenLight) * 31) + com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting$$ExternalSyntheticBackport0.m(this.longSitSwitch)) * 31) + this.longSitStart) * 31) + this.longSitEnd) * 31) + this.longSitDuring) * 31) + this.longSitWeek) * 31) + com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting$$ExternalSyntheticBackport0.m(this.drinkSwitch)) * 31) + this.drinkWeek) * 31) + java.util.Arrays.hashCode(this.drinkArray)) * 31) + this.alarmList.hashCode();
    }
}
