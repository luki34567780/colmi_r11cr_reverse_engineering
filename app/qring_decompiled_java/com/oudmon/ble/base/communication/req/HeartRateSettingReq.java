package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class HeartRateSettingReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private HeartRateSettingReq() {
        super((byte) 22);
        this.subData = new byte[]{1};
    }

    private HeartRateSettingReq(boolean z, int i) {
        super((byte) 22);
        byte[] bArr = new byte[3];
        bArr[0] = 2;
        bArr[1] = (byte) (z ? 1 : 2);
        bArr[2] = (byte) i;
        this.subData = bArr;
    }

    public static com.oudmon.ble.base.communication.req.HeartRateSettingReq getReadInstance() {
        return new com.oudmon.ble.base.communication.req.HeartRateSettingReq();
    }

    public static com.oudmon.ble.base.communication.req.HeartRateSettingReq getWriteInstance(boolean z, int i) {
        return new com.oudmon.ble.base.communication.req.HeartRateSettingReq(z, i);
    }
}
