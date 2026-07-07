package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class RealTimeHeartRateRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private int heart;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        this.heart = bArr[0];
        return false;
    }

    public int getHeart() {
        return this.heart;
    }
}
