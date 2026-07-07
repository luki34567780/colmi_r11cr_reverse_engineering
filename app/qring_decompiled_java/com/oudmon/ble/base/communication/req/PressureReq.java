package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class PressureReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private byte index;

    public PressureReq(byte b) {
        super((byte) 55);
        this.subData = new byte[]{b};
    }
}
