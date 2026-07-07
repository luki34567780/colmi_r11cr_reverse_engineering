package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class StopHeartRateReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    private byte[] data;

    private StopHeartRateReq(byte b, byte b2, byte b3) {
        super((byte) 106);
        this.data = new byte[]{b, b2, b3};
    }

    public static com.oudmon.ble.base.communication.req.StopHeartRateReq stopHeartRate(byte b) {
        return new com.oudmon.ble.base.communication.req.StopHeartRateReq((byte) 1, b, (byte) 0);
    }

    public static com.oudmon.ble.base.communication.req.StopHeartRateReq stopBloodPressure(byte b, byte b2) {
        return new com.oudmon.ble.base.communication.req.StopHeartRateReq((byte) 2, b, b2);
    }

    public static com.oudmon.ble.base.communication.req.StopHeartRateReq stopBloodOxygen(byte b) {
        return new com.oudmon.ble.base.communication.req.StopHeartRateReq((byte) 3, b, (byte) 0);
    }

    public static com.oudmon.ble.base.communication.req.StopHeartRateReq stopFatigue(byte b) {
        return new com.oudmon.ble.base.communication.req.StopHeartRateReq((byte) 4, b, (byte) 0);
    }

    public static com.oudmon.ble.base.communication.req.StopHeartRateReq stopHealthCheck() {
        return new com.oudmon.ble.base.communication.req.StopHeartRateReq((byte) 5, (byte) 0, (byte) 0);
    }

    public static com.oudmon.ble.base.communication.req.StopHeartRateReq stopEcg(int i) {
        return new com.oudmon.ble.base.communication.req.StopHeartRateReq((byte) 7, (byte) i, (byte) 0);
    }

    public static com.oudmon.ble.base.communication.req.StopHeartRateReq stopPressure(byte b) {
        return new com.oudmon.ble.base.communication.req.StopHeartRateReq((byte) 8, b, (byte) 0);
    }

    public static com.oudmon.ble.base.communication.req.StopHeartRateReq stopBloodSugar(byte b) {
        return new com.oudmon.ble.base.communication.req.StopHeartRateReq((byte) 9, b, (byte) 0);
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return this.data;
    }
}
