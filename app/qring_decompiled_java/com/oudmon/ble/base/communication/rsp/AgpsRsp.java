package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class AgpsRsp extends com.oudmon.ble.base.communication.rsp.MixtureRsp {
    private boolean mEnable;

    @Override // com.oudmon.ble.base.communication.rsp.MixtureRsp
    protected void readSubData(byte[] bArr) {
        this.mEnable = bArr[1] == 1;
    }

    public boolean isEnable() {
        return this.mEnable;
    }
}
