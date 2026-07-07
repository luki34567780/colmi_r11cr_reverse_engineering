package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class PhoneNotifyRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private int action = 0;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        this.action = bArr[0] & 255;
        return false;
    }

    public int getAction() {
        return this.action;
    }

    public boolean isReject() {
        return this.action == 1;
    }
}
