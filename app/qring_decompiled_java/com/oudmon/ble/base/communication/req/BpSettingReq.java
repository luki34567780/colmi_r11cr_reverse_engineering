package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class BpSettingReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private BpSettingReq() {
        super((byte) 12);
        this.subData = new byte[]{1};
    }

    private BpSettingReq(boolean z, com.oudmon.ble.base.communication.entity.StartEndTimeEntity startEndTimeEntity, int i) {
        super((byte) 12);
        this.subData = new byte[]{2, z ? (byte) 1 : (byte) 0, (byte) (startEndTimeEntity.getStartHour() & 255), (byte) (startEndTimeEntity.getStartMinute() & 255), (byte) (startEndTimeEntity.getEndHour() & 255), (byte) (startEndTimeEntity.getEndMinute() & 255), (byte) (i & 255)};
    }

    public static com.oudmon.ble.base.communication.req.BpSettingReq getReadInstance() {
        return new com.oudmon.ble.base.communication.req.BpSettingReq();
    }

    public static com.oudmon.ble.base.communication.req.BpSettingReq getWriteInstance(boolean z, com.oudmon.ble.base.communication.entity.StartEndTimeEntity startEndTimeEntity, int i) {
        return new com.oudmon.ble.base.communication.req.BpSettingReq(z, startEndTimeEntity, i);
    }
}
