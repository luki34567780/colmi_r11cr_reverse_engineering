package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadSleepDetailsReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    private byte[] data;

    public ReadSleepDetailsReq(int i, int i2, int i3) {
        super(com.oudmon.ble.base.communication.Constants.CMD_GET_SLEEP);
        if (i > 29) {
            throw new java.lang.IllegalArgumentException("dayOffset 最大只到29");
        }
        if (i2 > i3 || i3 > 95) {
            throw new java.lang.IllegalArgumentException("数据段索引值异常");
        }
        android.util.Log.i(getClass().getSimpleName(), "ReadSleepDetailsReq: dayOffset=" + i);
        this.data = new byte[]{(byte) i, 15, (byte) i2, (byte) i3};
        android.util.Log.i(getClass().getSimpleName(), "ReadSleepDetailsReq: data=" + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(this.data));
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return this.data;
    }
}
