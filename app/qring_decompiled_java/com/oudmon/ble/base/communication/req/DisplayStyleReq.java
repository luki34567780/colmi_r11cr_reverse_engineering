package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class DisplayStyleReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private DisplayStyleReq() {
        super((byte) 42);
        this.subData = new byte[]{1};
    }

    private DisplayStyleReq(int i) {
        super((byte) 42);
        this.subData = new byte[]{2, (byte) i};
    }

    public static com.oudmon.ble.base.communication.req.DisplayStyleReq getReadInstance() {
        return new com.oudmon.ble.base.communication.req.DisplayStyleReq();
    }

    public static com.oudmon.ble.base.communication.req.DisplayStyleReq getWriteInstance(int i) {
        return new com.oudmon.ble.base.communication.req.DisplayStyleReq(i);
    }
}
