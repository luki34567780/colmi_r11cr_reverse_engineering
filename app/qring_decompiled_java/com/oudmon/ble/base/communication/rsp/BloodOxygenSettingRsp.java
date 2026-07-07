package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class BloodOxygenSettingRsp extends com.oudmon.ble.base.communication.rsp.MixtureRsp {
    private boolean isEnable;

    @Override // com.oudmon.ble.base.communication.rsp.MixtureRsp
    protected void readSubData(byte[] bArr) {
        this.isEnable = bArr[1] == 1;
    }

    public boolean isEnable() {
        return this.isEnable;
    }
}
