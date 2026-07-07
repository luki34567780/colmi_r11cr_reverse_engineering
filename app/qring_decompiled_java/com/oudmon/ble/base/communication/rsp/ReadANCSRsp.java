package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadANCSRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private short stateMask;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        this.stateMask = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToShort(bArr, 0);
        return false;
    }

    public short getStateMask() {
        return this.stateMask;
    }

    public void setStateMask(short s) {
        this.stateMask = s;
    }
}
