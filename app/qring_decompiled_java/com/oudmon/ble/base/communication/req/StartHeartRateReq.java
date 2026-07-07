package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class StartHeartRateReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    public static final byte ACTION_CONTINUE = 3;
    public static final byte ACTION_PAUSE = 2;
    public static final byte ACTION_START = 1;
    public static final byte ACTION_STOP = 4;
    public static final byte TYPE_BLOODOXYGEN = 3;
    public static final byte TYPE_BLOODPRESSURE = 2;
    public static final byte TYPE_BLOOD_SUGAR = 9;
    public static final byte TYPE_ECG = 7;
    public static final byte TYPE_FATIGUE = 4;
    public static final byte TYPE_HEALTHCHECK = 5;
    public static final byte TYPE_HEARTRATE = 1;
    public static final byte TYPE_PRESSURE = 8;
    public static final byte TYPE_REALTIMEHEARTRATE = 6;
    private byte sub;
    private byte type;

    private StartHeartRateReq(byte b, byte b2) {
        super((byte) 105);
        this.type = b;
        this.sub = b2;
    }

    public static com.oudmon.ble.base.communication.req.StartHeartRateReq getSimpleReq(byte b) {
        return new com.oudmon.ble.base.communication.req.StartHeartRateReq(b, b < 3 ? (byte) 0 : com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.decimalToBCD(25));
    }

    public static com.oudmon.ble.base.communication.req.StartHeartRateReq getRealtimeHeartRate(byte b) {
        return new com.oudmon.ble.base.communication.req.StartHeartRateReq((byte) 6, b);
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return new byte[]{this.type, this.sub};
    }
}
