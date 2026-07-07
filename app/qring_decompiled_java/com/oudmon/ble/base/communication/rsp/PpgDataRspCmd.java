package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class PpgDataRspCmd extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    public int mPpgValue;
    public int mRate;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        this.mRate = bArr[0];
        this.mPpgValue = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToInt(bArr, 1);
        return false;
    }
}
