package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class BlackListReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return new byte[]{1};
    }

    public BlackListReq() {
        super((byte) 45);
    }
}
