package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class BatteryRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private int batteryValue;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        this.batteryValue = bArr[0];
        return false;
    }

    public int getBatteryValue() {
        return this.batteryValue;
    }
}
