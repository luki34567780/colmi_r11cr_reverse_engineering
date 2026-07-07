package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class SetANCSReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    public SetANCSReq() {
        super((byte) 96);
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return new byte[]{-1, -97};
    }
}
