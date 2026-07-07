package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class DndReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private DndReq() {
        super((byte) 6);
        this.subData = new byte[]{1};
    }

    private DndReq(boolean z, com.oudmon.ble.base.communication.entity.StartEndTimeEntity startEndTimeEntity) {
        super((byte) 6);
        byte[] bArr = new byte[6];
        bArr[0] = 2;
        bArr[1] = (byte) (z ? 1 : 2);
        bArr[2] = (byte) (startEndTimeEntity.getStartHour() & 255);
        bArr[3] = (byte) (startEndTimeEntity.getStartMinute() & 255);
        bArr[4] = (byte) (startEndTimeEntity.getEndHour() & 255);
        bArr[5] = (byte) (startEndTimeEntity.getEndMinute() & 255);
        this.subData = bArr;
    }

    public static com.oudmon.ble.base.communication.req.DndReq getReadInstance() {
        return new com.oudmon.ble.base.communication.req.DndReq();
    }

    public static com.oudmon.ble.base.communication.req.DndReq getWriteInstance(boolean z, com.oudmon.ble.base.communication.entity.StartEndTimeEntity startEndTimeEntity) {
        return new com.oudmon.ble.base.communication.req.DndReq(z, startEndTimeEntity);
    }
}
