package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class BpSettingRsp extends com.oudmon.ble.base.communication.rsp.MixtureRsp {
    private boolean isEnable;
    private int multiple;
    private com.oudmon.ble.base.communication.entity.StartEndTimeEntity startEndTimeEntity;

    @Override // com.oudmon.ble.base.communication.rsp.MixtureRsp
    protected void readSubData(byte[] bArr) {
        this.isEnable = bArr[1] == 1;
        this.startEndTimeEntity = new com.oudmon.ble.base.communication.entity.StartEndTimeEntity(bArr[2], bArr[3], bArr[4], bArr[5]);
        this.multiple = bArr[6];
    }

    public boolean isEnable() {
        return this.isEnable;
    }

    public com.oudmon.ble.base.communication.entity.StartEndTimeEntity getStartEndTimeEntity() {
        return this.startEndTimeEntity;
    }

    public int getMultiple() {
        return this.multiple;
    }

    public void setEnable(boolean z) {
        this.isEnable = z;
    }
}
