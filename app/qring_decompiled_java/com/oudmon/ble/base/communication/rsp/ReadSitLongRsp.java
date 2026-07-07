package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadSitLongRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private int cycle;
    private com.oudmon.ble.base.communication.entity.StartEndTimeEntity startEndTimeEntity;
    private byte weekMask;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        this.startEndTimeEntity = new com.oudmon.ble.base.communication.entity.StartEndTimeEntity(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[0]), com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[1]), com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[2]), com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[3]));
        this.weekMask = bArr[4];
        this.cycle = bArr[5];
        return false;
    }

    public com.oudmon.ble.base.communication.entity.StartEndTimeEntity getStartEndTimeEntity() {
        return this.startEndTimeEntity;
    }

    public byte getWeekMask() {
        return this.weekMask;
    }

    public int getCycle() {
        return this.cycle;
    }

    public boolean isEnable() {
        return this.weekMask != 0;
    }

    public void setEnableAll(boolean z) {
        this.weekMask = (byte) (z ? com.google.android.gms.internal.fitness.zzab.zzh : 0);
    }

    public com.oudmon.ble.base.communication.rsp.ReadSitLongRsp cloneMySelf() {
        com.oudmon.ble.base.communication.rsp.ReadSitLongRsp readSitLongRsp = new com.oudmon.ble.base.communication.rsp.ReadSitLongRsp();
        readSitLongRsp.weekMask = this.weekMask;
        readSitLongRsp.cycle = this.cycle;
        readSitLongRsp.startEndTimeEntity = new com.oudmon.ble.base.communication.entity.StartEndTimeEntity(this.startEndTimeEntity.getStartHour(), this.startEndTimeEntity.getStartMinute(), this.startEndTimeEntity.getEndHour(), this.startEndTimeEntity.getEndMinute());
        return readSitLongRsp;
    }

    public void enableTheWeek(int i, boolean z) {
        int i2 = 1 << i;
        byte b = (byte) ((~i2) & this.weekMask);
        this.weekMask = b;
        if (z) {
            this.weekMask = (byte) (i2 | b);
        }
    }

    public void setCycle(int i) {
        this.cycle = i;
    }
}
