package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class TotalSportDataRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private com.oudmon.ble.base.communication.entity.BleStepTotal bleStepTotal;
    private int pocketCount = 2;
    private int curIndex = 0;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        byte b = bArr[0];
        int i = this.curIndex;
        if (b != i || b >= this.pocketCount) {
            android.util.Log.e("Jxr35", "acceptData: index 错误 need=" + this.curIndex + " received=" + ((int) b));
            this.bleStepTotal = null;
            return false;
        }
        if (bArr[2] == 0 && bArr[3] == 0 && bArr[4] == 0) {
            android.util.Log.d("Jxr35", "没有存储数据");
            this.bleStepTotal = null;
            return false;
        }
        if (i == 0) {
            com.oudmon.ble.base.communication.entity.BleStepTotal bleStepTotal = new com.oudmon.ble.base.communication.entity.BleStepTotal();
            this.bleStepTotal = bleStepTotal;
            bleStepTotal.setDaysAgo(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[1]));
            this.bleStepTotal.setYear(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[2]) + 2000);
            this.bleStepTotal.setMonth(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[3]));
            this.bleStepTotal.setDay(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[4]));
            this.bleStepTotal.setTotalSteps(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[5], bArr[6], bArr[7]}));
            this.bleStepTotal.setRunningSteps(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[8], bArr[9], bArr[10]}));
            this.bleStepTotal.setCalorie(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[11], bArr[12], bArr[13]}));
        } else if (i == 1) {
            int BCDToDecimal = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[1]);
            int BCDToDecimal2 = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[2]) + 2000;
            int BCDToDecimal3 = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[3]);
            int BCDToDecimal4 = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[4]);
            com.oudmon.ble.base.communication.entity.BleStepTotal bleStepTotal2 = this.bleStepTotal;
            if (bleStepTotal2 != null && bleStepTotal2.getDaysAgo() == BCDToDecimal && this.bleStepTotal.getYear() == BCDToDecimal2 && this.bleStepTotal.getMonth() == BCDToDecimal3 && this.bleStepTotal.getDay() == BCDToDecimal4) {
                this.bleStepTotal.setWalkDistance(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[5], bArr[6], bArr[7]}));
                this.bleStepTotal.setSportDuration(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[8], bArr[9]}) * 60);
                this.bleStepTotal.setSleepDuration(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[10], bArr[11]}) * 60);
            }
        }
        int i2 = this.curIndex + 1;
        this.curIndex = i2;
        return i2 != this.pocketCount;
    }

    public com.oudmon.ble.base.communication.entity.BleStepTotal getBleStepTotal() {
        return this.bleStepTotal;
    }
}
