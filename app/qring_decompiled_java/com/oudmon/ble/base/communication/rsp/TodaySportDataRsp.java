package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class TodaySportDataRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private com.oudmon.ble.base.communication.entity.BleStepTotal sportTotal;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        com.oudmon.ble.base.communication.entity.BleStepTotal bleStepTotal = new com.oudmon.ble.base.communication.entity.BleStepTotal();
        this.sportTotal = bleStepTotal;
        bleStepTotal.setTotalSteps(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[0], bArr[1], bArr[2]}));
        this.sportTotal.setRunningSteps(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[3], bArr[4], bArr[5]}));
        this.sportTotal.setCalorie(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[6], bArr[7], bArr[8]}));
        this.sportTotal.setWalkDistance(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[9], bArr[10], bArr[11]}));
        this.sportTotal.setSportDuration(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[12], bArr[13]}) * 60);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.sportTotal.setDaysAgo(0);
        this.sportTotal.setYear(calendar.get(1));
        this.sportTotal.setMonth(calendar.get(2) + 1);
        this.sportTotal.setDay(calendar.get(5));
        return false;
    }

    public com.oudmon.ble.base.communication.entity.BleStepTotal getSportTotal() {
        return this.sportTotal;
    }
}
