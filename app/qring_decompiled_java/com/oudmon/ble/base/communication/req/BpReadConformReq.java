package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class BpReadConformReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    private boolean isSuccess;

    public BpReadConformReq(boolean z) {
        super((byte) 14);
        this.isSuccess = z;
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        byte[] bArr = new byte[1];
        bArr[0] = (byte) (this.isSuccess ? 0 : 255);
        return bArr;
    }
}
