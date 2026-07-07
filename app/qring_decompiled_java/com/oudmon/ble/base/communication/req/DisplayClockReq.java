package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class DisplayClockReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private DisplayClockReq() {
        super((byte) 18);
        this.subData = new byte[]{1};
    }

    private DisplayClockReq(boolean z) {
        super((byte) 18);
        byte[] bArr = new byte[2];
        bArr[0] = 2;
        bArr[1] = (byte) (z ? 1 : 2);
        this.subData = bArr;
    }

    public static com.oudmon.ble.base.communication.req.DisplayClockReq getReadInstance() {
        return new com.oudmon.ble.base.communication.req.DisplayClockReq();
    }

    public static com.oudmon.ble.base.communication.req.DisplayClockReq getWriteInstance(boolean z) {
        return new com.oudmon.ble.base.communication.req.DisplayClockReq(z);
    }
}
