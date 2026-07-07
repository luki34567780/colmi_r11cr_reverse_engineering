package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class IntellRsp extends com.oudmon.ble.base.communication.rsp.MixtureRsp {
    private byte delaySecond;
    private boolean isEnable;

    @Override // com.oudmon.ble.base.communication.rsp.MixtureRsp
    protected void readSubData(byte[] bArr) {
        this.isEnable = bArr[1] == 1;
        this.delaySecond = bArr[2];
    }

    public boolean isEnable() {
        return this.isEnable;
    }

    public byte getDelaySecond() {
        return this.delaySecond;
    }
}
