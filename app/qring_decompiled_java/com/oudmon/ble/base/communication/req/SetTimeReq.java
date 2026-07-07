package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class SetTimeReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    private byte[] mData;
    private byte mLanguage;
    private java.util.Map<java.lang.String, java.lang.Integer> mLocaleMap;

    @java.lang.Deprecated
    public SetTimeReq() {
        super((byte) 1);
        this.mLanguage = (byte) 0;
        this.mData = new byte[7];
        this.mLocaleMap = new java.util.HashMap();
        initMap();
        setLanguage();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.mData[0] = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(calendar.get(1) % 2000);
        this.mData[1] = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(calendar.get(2) + 1);
        this.mData[2] = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(calendar.get(5));
        this.mData[3] = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(calendar.get(11));
        this.mData[4] = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(calendar.get(12));
        this.mData[5] = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(calendar.get(13));
    }

    public SetTimeReq(int i) {
        super((byte) 1);
        this.mLanguage = (byte) 0;
        this.mData = new byte[7];
        this.mLocaleMap = new java.util.HashMap();
        initMap();
        setLanguage();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.add(13, i);
        this.mData[0] = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(calendar.get(1) % 2000);
        this.mData[1] = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(calendar.get(2) + 1);
        this.mData[2] = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(calendar.get(5));
        this.mData[3] = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(calendar.get(11));
        this.mData[4] = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(calendar.get(12));
        this.mData[5] = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(calendar.get(13));
    }

    private void initMap() {
        this.mLocaleMap.put("zh_CN", 0);
        this.mLocaleMap.put("en", 1);
        this.mLocaleMap.put("zh_HK", 2);
        this.mLocaleMap.put("zh_TW", 2);
        this.mLocaleMap.put("el", 3);
        this.mLocaleMap.put(com.qcwireless.qcwatch.base.view.Localization.language, 4);
        this.mLocaleMap.put("de", 5);
        this.mLocaleMap.put("it", 6);
        this.mLocaleMap.put("es", 7);
        this.mLocaleMap.put("nl", 8);
        this.mLocaleMap.put("pt", 9);
        this.mLocaleMap.put("ru", 10);
        this.mLocaleMap.put("tr", 11);
        this.mLocaleMap.put("ja", 12);
        this.mLocaleMap.put("ko", 13);
        this.mLocaleMap.put("pl", 14);
        this.mLocaleMap.put("ro", 15);
        this.mLocaleMap.put("ar", 16);
        this.mLocaleMap.put("th", 17);
        this.mLocaleMap.put("vi", 18);
        this.mLocaleMap.put("in", 19);
        this.mLocaleMap.put("hi", 20);
        this.mLocaleMap.put("cs", 21);
        this.mLocaleMap.put("sk", 22);
        this.mLocaleMap.put("hu", 23);
        this.mLocaleMap.put("iw", 24);
        this.mLocaleMap.put("hr", 25);
        this.mLocaleMap.put("sl", 26);
        this.mLocaleMap.put("ur", 35);
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        byte[] bArr = this.mData;
        bArr[6] = this.mLanguage;
        return bArr;
    }

    public void setLanguage() {
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        if (language.startsWith("zh")) {
            language = java.util.Locale.getDefault().getLanguage() + "_" + java.util.Locale.getDefault().getCountry().toUpperCase();
        }
        java.lang.Integer num = this.mLocaleMap.get(language);
        int intValue = num == null ? 1 : num.intValue();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "SetTimeReq -> mLanguage: " + language + ", value: " + num + ", result: " + intValue);
        this.mLanguage = (byte) intValue;
    }
}
