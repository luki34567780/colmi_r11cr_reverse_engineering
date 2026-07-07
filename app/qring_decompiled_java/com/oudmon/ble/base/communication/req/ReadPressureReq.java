package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadPressureReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    private byte[] data;

    public ReadPressureReq(long j) {
        super((byte) 20);
        byte[] intToByteArray = com.oudmon.ble.base.communication.utils.DataParseUtils.intToByteArray((int) j);
        byte[] bArr = new byte[intToByteArray.length + 2];
        this.data = bArr;
        java.lang.System.arraycopy(intToByteArray, 0, bArr, 0, intToByteArray.length);
        byte[] bArr2 = this.data;
        bArr2[4] = 0;
        bArr2[5] = 50;
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return this.data;
    }
}
