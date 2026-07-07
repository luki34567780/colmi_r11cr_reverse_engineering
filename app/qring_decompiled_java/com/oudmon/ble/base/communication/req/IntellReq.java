package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class IntellReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private byte delaySecond;
    private boolean isEnable;

    private IntellReq() {
        super((byte) 9);
        this.subData = new byte[]{1};
    }

    private IntellReq(boolean z, byte b) {
        super((byte) 9);
        byte[] bArr = new byte[3];
        bArr[0] = 2;
        bArr[1] = (byte) (z ? 1 : 2);
        bArr[2] = b;
        this.subData = bArr;
    }

    public static com.oudmon.ble.base.communication.req.IntellReq getReadInstance() {
        return new com.oudmon.ble.base.communication.req.IntellReq();
    }

    public static com.oudmon.ble.base.communication.req.IntellReq getWriteInstance(boolean z, byte b) {
        return new com.oudmon.ble.base.communication.req.IntellReq(z, b);
    }
}
