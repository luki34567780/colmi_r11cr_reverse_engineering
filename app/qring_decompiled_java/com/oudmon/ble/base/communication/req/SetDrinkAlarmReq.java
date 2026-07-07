package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class SetDrinkAlarmReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    private byte[] data;

    public SetDrinkAlarmReq(com.oudmon.ble.base.communication.entity.AlarmEntity alarmEntity) {
        super((byte) 39);
        if (alarmEntity.getAlarmIndex() > 7) {
            throw new java.lang.IllegalArgumentException("闹钟索引只能0 到 7");
        }
        if (alarmEntity.getEnable() > 2) {
            throw new java.lang.IllegalArgumentException("闹钟使能设置只能0 到 2");
        }
        byte weekMask = alarmEntity.getWeekMask();
        this.data = new byte[]{(byte) alarmEntity.getAlarmIndex(), (byte) alarmEntity.getEnable(), com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(alarmEntity.getHour()), com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(alarmEntity.getMinute()), (byte) ((weekMask >> 0) & 1), (byte) ((weekMask >> 1) & 1), (byte) ((weekMask >> 2) & 1), (byte) ((weekMask >> 3) & 1), (byte) ((weekMask >> 4) & 1), (byte) ((weekMask >> 5) & 1), (byte) ((weekMask >> 6) & 1)};
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return this.data;
    }
}
