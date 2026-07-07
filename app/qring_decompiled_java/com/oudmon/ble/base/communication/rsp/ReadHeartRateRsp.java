package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadHeartRateRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private byte[] mHeartRateArray;
    private int mUtcTime;
    private int size = 0;
    private int index = 0;
    private boolean endFlag = false;
    private int range = 5;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        try {
            byte b = bArr[0];
            int i = b & 255;
            if (i != 255 && (!new com.oudmon.ble.base.util.DateUtil(getmUtcTime(), true).isToday() || b != 23)) {
                if (i == 0) {
                    this.endFlag = false;
                    int i2 = bArr[1];
                    this.size = i2;
                    this.range = bArr[2];
                    this.mHeartRateArray = new byte[i2 * 13];
                    android.util.Log.i("Jxr35", "0x00.. size: " + this.size);
                } else if (i == 1) {
                    this.mUtcTime = com.qcwireless.qc_utils.bytes.DataTransferUtils.bytesToInt(new byte[]{bArr[1], bArr[2], bArr[3], bArr[4]}, 0);
                    this.mUtcTime -= (int) (getTimeZone() * 3600.0f);
                    java.lang.System.arraycopy(bArr, 5, this.mHeartRateArray, 0, bArr.length - 5);
                    this.index += bArr.length - 5;
                } else {
                    java.lang.System.arraycopy(bArr, 1, this.mHeartRateArray, this.index, bArr.length - 1);
                    this.index += 13;
                    if (b == this.size - 1) {
                        this.endFlag = true;
                        return false;
                    }
                }
                return true;
            }
            this.endFlag = true;
            return false;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isEndFlag() {
        return this.endFlag;
    }

    public byte[] getmHeartRateArray() {
        byte[] bArr = this.mHeartRateArray;
        if (bArr != null) {
            byte[] bArr2 = new byte[288];
            if (bArr.length > 288) {
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, 288);
                return bArr2;
            }
            if (bArr.length < 288) {
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                return bArr2;
            }
            com.oudmon.ble.base.util.DateUtil dateUtil = new com.oudmon.ble.base.util.DateUtil(this.mUtcTime, true);
            if (dateUtil.isToday()) {
                int todayMin = dateUtil.getTodayMin() / 5;
                int i = 0;
                while (true) {
                    byte[] bArr3 = this.mHeartRateArray;
                    if (i >= bArr3.length) {
                        break;
                    }
                    if (i > todayMin) {
                        bArr3[i] = 0;
                    }
                    i++;
                }
            }
        }
        byte[] bArr4 = this.mHeartRateArray;
        return bArr4 == null ? new byte[0] : bArr4;
    }

    public int getRange() {
        return this.range;
    }

    public int getmUtcTime() {
        return this.mUtcTime;
    }

    public static float getTimeZone() {
        return java.util.TimeZone.getDefault().getOffset(java.lang.System.currentTimeMillis()) / 3600000.0f;
    }
}
