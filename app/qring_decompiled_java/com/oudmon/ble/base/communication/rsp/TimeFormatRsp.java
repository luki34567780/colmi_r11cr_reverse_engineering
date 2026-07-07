package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class TimeFormatRsp extends com.oudmon.ble.base.communication.rsp.MixtureRsp {
    public int age;
    public int dbp;
    public int gender;
    public int height;
    private boolean is24;
    private boolean isMetric;
    public int open = 2;
    public int sbp;
    public int warmingHeart;
    public int weight;

    @Override // com.oudmon.ble.base.communication.rsp.MixtureRsp
    protected void readSubData(byte[] bArr) {
        this.is24 = bArr[1] == 0;
        this.isMetric = bArr[2] == 0;
        this.gender = bArr[3];
        this.age = bArr[4];
        this.height = bArr[5];
        this.weight = bArr[6];
        this.sbp = bArr[7];
        this.dbp = bArr[8];
        this.warmingHeart = com.oudmon.ble.base.communication.utils.ByteUtil.byteToInt(bArr[9]);
        this.open = bArr[10];
    }

    public boolean is24() {
        return this.is24;
    }

    public boolean isMetric() {
        return this.isMetric;
    }

    public java.lang.String toString() {
        return "TimeFormatRsp{is24=" + this.is24 + '}';
    }
}
