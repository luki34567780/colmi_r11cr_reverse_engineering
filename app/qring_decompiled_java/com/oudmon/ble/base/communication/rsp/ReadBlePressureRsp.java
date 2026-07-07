package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadBlePressureRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private int mCount = 0;
    private java.util.List<com.oudmon.ble.base.communication.entity.BlePressure> mValueList = new java.util.ArrayList();
    private java.util.Calendar mCalendar = java.util.Calendar.getInstance();

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        android.util.Log.i("Jxr35", "ReadBlePressureRsp -> acceptData -> data: " + com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(bArr));
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, 0, 4);
        if ("ffffffff".equalsIgnoreCase(com.qcwireless.qc_utils.bytes.DataTransferUtils.getHexString(copyOfRange))) {
            this.mCount = 0;
            return false;
        }
        this.mCount++;
        long byteArrayToInt = com.oudmon.ble.base.communication.utils.DataParseUtils.byteArrayToInt(copyOfRange);
        int timeZone = (int) (getTimeZone() * 3600.0f);
        long j = byteArrayToInt - timeZone;
        android.util.Log.i("Jxr35", "timeStamp: " + j + ", timeOffset: " + timeZone);
        this.mValueList.add(new com.oudmon.ble.base.communication.entity.BlePressure(j, bArr[5] & 255, bArr[4] & 255));
        if (this.mCount < 50) {
            return true;
        }
        this.mCount = 0;
        return false;
    }

    public java.util.List<com.oudmon.ble.base.communication.entity.BlePressure> getValueList() {
        return this.mValueList;
    }

    public static float getTimeZone() {
        return java.util.TimeZone.getDefault().getOffset(java.lang.System.currentTimeMillis()) / 3600000.0f;
    }
}
