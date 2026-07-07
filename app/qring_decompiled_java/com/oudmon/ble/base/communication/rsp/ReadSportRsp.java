package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadSportRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private byte[] valueData;
    private int size = 0;
    private int index = 0;
    private com.oudmon.ble.base.communication.entity.BleSport sport = new com.oudmon.ble.base.communication.entity.BleSport();
    private boolean endFlag = false;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        byte b = bArr[0];
        int i = b & 255;
        if (i == 255) {
            this.endFlag = true;
            return false;
        }
        if (i == 0) {
            this.endFlag = false;
            int i2 = bArr[1];
            this.size = i2;
            this.valueData = new byte[i2 * 13];
            android.util.Log.i("Jxr35", "0x00.. size: " + this.size + ", valueData: " + this.valueData);
        } else {
            for (int i3 = 1; i3 < bArr.length; i3++) {
                this.valueData[(this.index + i3) - 1] = bArr[i3];
            }
            android.util.Log.e("Jxr35", "valueData = " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(this.valueData));
            android.util.Log.i("Jxr35", "0x00.. size: " + this.size + ", valueData: " + this.valueData);
            this.index = this.index + 13;
            if (b == this.size - 1) {
                byte[] bArr2 = new byte[4];
                int i4 = 0;
                for (int i5 = 0; i5 < 7; i5++) {
                    for (int i6 = 0; i6 < 4; i6++) {
                        bArr2[i6] = this.valueData[(i5 * 4) + i6];
                    }
                    switch (i5) {
                        case 0:
                            this.sport.setStartTime(com.oudmon.ble.base.communication.utils.DataParseUtils.byteArrayToInt(bArr2));
                            break;
                        case 1:
                            this.sport.setDuration(com.oudmon.ble.base.communication.utils.DataParseUtils.byteArrayToInt(bArr2));
                            break;
                        case 2:
                            this.sport.setSportType(com.oudmon.ble.base.communication.utils.DataParseUtils.byteArrayToInt(bArr2));
                            break;
                        case 3:
                            this.sport.setStepCount(com.oudmon.ble.base.communication.utils.DataParseUtils.byteArrayToInt(bArr2));
                            break;
                        case 4:
                            this.sport.setDistance(com.oudmon.ble.base.communication.utils.DataParseUtils.byteArrayToInt(bArr2));
                            break;
                        case 5:
                            this.sport.setCalories(com.oudmon.ble.base.communication.utils.DataParseUtils.byteArrayToInt(bArr2));
                            break;
                        case 6:
                            i4 = com.oudmon.ble.base.communication.utils.DataParseUtils.byteArrayToInt(bArr2);
                            break;
                    }
                }
                android.util.Log.e("Jxr35", "rateCount = " + i4);
                int[] iArr = new int[i4];
                int i7 = 0;
                for (int i8 = 28; i8 < i4 + 28; i8++) {
                    iArr[i7] = this.valueData[i8] & 255;
                    i7++;
                }
                this.sport.setRateValue(iArr);
                return false;
            }
        }
        return true;
    }

    public com.oudmon.ble.base.communication.entity.BleSport getBleSport() {
        return this.sport;
    }

    public boolean isEndFlag() {
        return this.endFlag;
    }
}
