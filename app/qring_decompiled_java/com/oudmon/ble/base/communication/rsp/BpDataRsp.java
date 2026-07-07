package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class BpDataRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private com.oudmon.ble.base.communication.entity.BpDataEntity bpDataEntity;
    private int valueIndex = 0;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        android.util.Log.i("Jxr35", "acceptData.. data: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bArr));
        byte b = bArr[0];
        if (b == 0) {
            this.valueIndex = 0;
            this.bpDataEntity = new com.oudmon.ble.base.communication.entity.BpDataEntity(bArr[1] + com.realsil.sdk.bbpro.params.Mmi.AU_MMI_ANC_ON_OFF, bArr[2], bArr[3], bArr[4]);
            byte b2 = bArr[4];
            for (int i = 0; i < 6; i++) {
                byte b3 = bArr[i + 5];
                for (int i2 = 0; i2 < 8; i2++) {
                    if ((((byte) (b3 >>> i2)) & 1) == 1) {
                        this.bpDataEntity.addBpIndex(((i * 8) + i2) * b2);
                    }
                }
            }
        } else if (b == 1) {
            com.oudmon.ble.base.communication.entity.BpDataEntity bpDataEntity = this.bpDataEntity;
            if (bpDataEntity == null) {
                return true;
            }
            bpDataEntity.addRealValue(this.valueIndex * 13, java.util.Arrays.copyOfRange(bArr, 1, bArr.length));
            this.valueIndex++;
            android.util.Log.i("Jxr35", "acceptData: size=" + this.bpDataEntity.getBpValues().size() + " cur offset=" + (this.valueIndex * 13));
            if (this.valueIndex * 13 >= this.bpDataEntity.getBpValues().size()) {
                android.util.Log.i("Jxr35", "acceptData: 成功");
                return false;
            }
        } else if ((b & 255) == 255) {
            return false;
        }
        return true;
    }

    public com.oudmon.ble.base.communication.entity.BpDataEntity getBpDataEntity() {
        return this.bpDataEntity;
    }
}
