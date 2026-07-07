package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class RealTimeHeartRate extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    private byte[] mData;
    private int type;

    public RealTimeHeartRate(int i) {
        super(com.oudmon.ble.base.communication.Constants.CMD_REAL_TIME_HEART_RATE);
        this.mData = new byte[]{(byte) i};
        this.type = i;
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return this.mData;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }
}
