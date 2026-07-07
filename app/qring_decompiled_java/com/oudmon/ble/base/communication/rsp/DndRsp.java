package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class DndRsp extends com.oudmon.ble.base.communication.rsp.MixtureRsp {
    private com.oudmon.ble.base.communication.entity.StartEndTimeEntity dndEntity;
    private boolean isEnable;
    private boolean manualDND;

    @Override // com.oudmon.ble.base.communication.rsp.MixtureRsp
    protected void readSubData(byte[] bArr) {
        this.isEnable = bArr[1] == 1;
        this.manualDND = bArr[6] == 1;
        this.dndEntity = new com.oudmon.ble.base.communication.entity.StartEndTimeEntity(bArr[2], bArr[3], bArr[4], bArr[5]);
    }

    public boolean isEnable() {
        return this.isEnable;
    }

    public boolean isManualDND() {
        return this.manualDND;
    }

    public com.oudmon.ble.base.communication.entity.StartEndTimeEntity getDndEntity() {
        return this.dndEntity;
    }

    public void setEnable(boolean z) {
        this.isEnable = z;
    }
}
