package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class DeviceAvatarReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return new byte[0];
    }

    public DeviceAvatarReq() {
        super((byte) 50);
    }
}
