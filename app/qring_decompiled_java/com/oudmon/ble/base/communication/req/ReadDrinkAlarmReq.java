package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadDrinkAlarmReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    private int alarmIndex;

    public ReadDrinkAlarmReq(int i) {
        super((byte) 40);
        if (i > 7) {
            throw new java.lang.IllegalArgumentException("闹钟索引只能0 到 7");
        }
        this.alarmIndex = i;
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return new byte[]{(byte) this.alarmIndex};
    }
}
