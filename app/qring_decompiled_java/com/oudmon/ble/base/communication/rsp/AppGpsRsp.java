package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class AppGpsRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private int gpsStatus;
    private int timeStamp = 0;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        byte b = bArr[0];
        this.gpsStatus = b;
        if (b == 6) {
            this.timeStamp = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 2, 6));
        }
        return false;
    }

    public int getTimeStamp() {
        return this.timeStamp;
    }

    public int getGpsStatus() {
        return this.gpsStatus;
    }
}
