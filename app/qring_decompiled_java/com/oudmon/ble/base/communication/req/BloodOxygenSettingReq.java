package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class BloodOxygenSettingReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private BloodOxygenSettingReq() {
        super((byte) 44);
        this.subData = new byte[]{1};
    }

    private BloodOxygenSettingReq(boolean z) {
        super((byte) 44);
        this.subData = new byte[]{2, z ? (byte) 1 : (byte) 0};
    }

    public static com.oudmon.ble.base.communication.req.BloodOxygenSettingReq getReadInstance() {
        return new com.oudmon.ble.base.communication.req.BloodOxygenSettingReq();
    }

    public static com.oudmon.ble.base.communication.req.BloodOxygenSettingReq getWriteInstance(boolean z) {
        return new com.oudmon.ble.base.communication.req.BloodOxygenSettingReq(z);
    }
}
