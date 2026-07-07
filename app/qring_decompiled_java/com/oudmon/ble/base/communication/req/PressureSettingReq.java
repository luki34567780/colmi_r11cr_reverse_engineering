package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class PressureSettingReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private PressureSettingReq(boolean z) {
        super((byte) 54);
        this.subData = new byte[]{2, z ? (byte) 1 : (byte) 0};
    }

    private PressureSettingReq() {
        super((byte) 54);
        this.subData = new byte[]{1};
    }

    public static com.oudmon.ble.base.communication.req.PressureSettingReq getWriteInstance(boolean z) {
        return new com.oudmon.ble.base.communication.req.PressureSettingReq(z);
    }

    public static com.oudmon.ble.base.communication.req.PressureSettingReq getReadInstance() {
        return new com.oudmon.ble.base.communication.req.PressureSettingReq();
    }
}
