package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class QueryDataDistributionRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private int distribution;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        this.distribution = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{bArr[0], bArr[1], bArr[2], bArr[3]});
        return false;
    }

    public boolean isTheDayHasData(int i) {
        return ((this.distribution >> i) & 1) != 0;
    }
}
