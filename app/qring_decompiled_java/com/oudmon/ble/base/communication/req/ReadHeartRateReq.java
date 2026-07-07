package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadHeartRateReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    private byte[] data;

    public ReadHeartRateReq(long j) {
        super((byte) 21);
        this.data = com.oudmon.ble.base.communication.utils.DataParseUtils.intToByteArray((int) j);
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return this.data;
    }
}
