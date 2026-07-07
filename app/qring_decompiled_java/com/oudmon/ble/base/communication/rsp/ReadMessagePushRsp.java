package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadMessagePushRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private int deviceSupport1 = 0;
    private int deviceSupport2 = 0;
    private int deviceSupport3 = 0;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        this.deviceSupport1 = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToInt(bArr, 2);
        this.deviceSupport2 = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToInt(bArr, 4);
        this.deviceSupport3 = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToInt(bArr, 6);
        return false;
    }

    public int getDeviceSupport1() {
        return this.deviceSupport1;
    }

    public int getDeviceSupport2() {
        return this.deviceSupport2;
    }

    public int getDeviceSupport3() {
        return this.deviceSupport3;
    }
}
