package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class SetSitLongReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    private byte[] data;

    public SetSitLongReq(com.oudmon.ble.base.communication.entity.StartEndTimeEntity startEndTimeEntity, byte b, int i) {
        super(com.oudmon.ble.base.communication.Constants.CMD_SET_SIT_LONG);
        if (i != 30 && i != 60 && i != 90) {
            android.util.Log.i("Jxr35", "时间周期参数错误，已调整为正常的60s，原参数为: " + i);
            i = 60;
        }
        this.data = new byte[]{com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(startEndTimeEntity.getStartHour()), com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(startEndTimeEntity.getStartMinute()), com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(startEndTimeEntity.getEndHour()), com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(startEndTimeEntity.getEndMinute()), b, (byte) i};
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return this.data;
    }
}
