package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class HeartRateSettingRsp extends com.oudmon.ble.base.communication.rsp.MixtureRsp {
    private int heartInterval;
    private boolean isEnable;

    @Override // com.oudmon.ble.base.communication.rsp.MixtureRsp
    protected void readSubData(byte[] bArr) {
        this.isEnable = bArr[1] == 1;
        this.heartInterval = com.oudmon.ble.base.communication.utils.ByteUtil.byteToInt(bArr[2]);
    }

    public boolean isEnable() {
        return this.isEnable;
    }

    public int getHeartInterval() {
        return this.heartInterval;
    }
}
