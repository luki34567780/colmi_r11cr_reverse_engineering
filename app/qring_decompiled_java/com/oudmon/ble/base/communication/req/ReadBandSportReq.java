package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadBandSportReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    private byte[] data;

    public ReadBandSportReq(long j) {
        super((byte) 19);
        this.data = com.oudmon.ble.base.communication.utils.DataParseUtils.intToByteArray((int) j);
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return this.data;
    }
}
