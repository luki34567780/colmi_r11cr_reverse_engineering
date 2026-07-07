package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class MenstruationDataRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        android.util.Log.i("Jxr35", "acceptData.. data: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bArr));
        return true;
    }
}
