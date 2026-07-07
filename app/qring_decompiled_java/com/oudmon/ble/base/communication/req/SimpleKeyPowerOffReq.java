package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class SimpleKeyPowerOffReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    public SimpleKeyPowerOffReq() {
        super((byte) 8);
        this.subData = new byte[]{1};
    }
}
