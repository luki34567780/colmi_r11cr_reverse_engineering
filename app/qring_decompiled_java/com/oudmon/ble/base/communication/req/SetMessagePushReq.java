package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class SetMessagePushReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return null;
    }

    public SetMessagePushReq() {
        super((byte) 97);
    }
}
