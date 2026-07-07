package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadAlarmRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private com.oudmon.ble.base.communication.entity.AlarmEntity alarmEntity;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        byte b = 0;
        for (int i = 0; i < 7; i++) {
            b = (byte) ((bArr[i + 4] << i) | b);
        }
        this.alarmEntity = new com.oudmon.ble.base.communication.entity.AlarmEntity(bArr[0], bArr[1], com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[2]), com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[3]), b);
        return false;
    }

    public com.oudmon.ble.base.communication.entity.AlarmEntity getAlarmEntity() {
        return this.alarmEntity;
    }
}
