package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadDetailSportDataRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private java.util.ArrayList<com.oudmon.ble.base.communication.entity.BleStepDetails> bleStepDetailses = new java.util.ArrayList<>();
    private int index = 0;
    private boolean calorieNewProtocol = false;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        byte b = bArr[0];
        int i = this.index;
        if (i == 0 && (b & 255) == 255) {
            this.bleStepDetailses.clear();
            return false;
        }
        if (i == 0 && (b & 255) == 240) {
            if (bArr[2] == 1) {
                this.calorieNewProtocol = true;
            }
            this.index = i + 1;
            this.bleStepDetailses.clear();
        } else {
            com.oudmon.ble.base.communication.entity.BleStepDetails bleStepDetails = new com.oudmon.ble.base.communication.entity.BleStepDetails();
            bleStepDetails.setYear(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[0]) + 2000);
            bleStepDetails.setMonth(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[1]));
            bleStepDetails.setDay(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.BCDToDecimal(bArr[2]));
            bleStepDetails.setTimeIndex(bArr[3]);
            int bytes2Int = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[7], bArr[6]});
            if (this.calorieNewProtocol) {
                bytes2Int *= 10;
            }
            bleStepDetails.setCalorie(bytes2Int);
            bleStepDetails.setWalkSteps(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[9], bArr[8]}));
            bleStepDetails.setDistance(com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[11], bArr[10]}));
            this.bleStepDetailses.add(bleStepDetails);
            this.index++;
            if (bArr[4] == bArr[5] - 1) {
                return false;
            }
        }
        return true;
    }

    public java.util.ArrayList<com.oudmon.ble.base.communication.entity.BleStepDetails> getBleStepDetailses() {
        return this.bleStepDetailses;
    }
}
