package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class DisplayClockRsp extends com.oudmon.ble.base.communication.rsp.MixtureRsp {
    private boolean isClock;

    @Override // com.oudmon.ble.base.communication.rsp.MixtureRsp
    protected void readSubData(byte[] bArr) {
        this.isClock = bArr[1] == 1;
    }

    public boolean isClock() {
        return this.isClock;
    }

    public void setClock(boolean z) {
        this.isClock = z;
    }
}
