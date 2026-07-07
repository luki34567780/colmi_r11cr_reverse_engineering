package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class TargetSettingRsp extends com.oudmon.ble.base.communication.rsp.MixtureRsp {
    private int mCalorie;
    private int mDistance;
    private int mSleep;
    private int mSport;
    private int mStep;

    @Override // com.oudmon.ble.base.communication.rsp.MixtureRsp
    protected void readSubData(byte[] bArr) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(bArr));
        this.mStep = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 1, 4));
        this.mCalorie = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 4, 7));
        this.mDistance = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 7, 10));
        this.mSport = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 10, 12));
        this.mSleep = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 12, 14));
    }

    public int getStep() {
        return this.mStep;
    }

    public int getCalorie() {
        return this.mCalorie;
    }

    public int getDistance() {
        return this.mDistance;
    }

    public int getmSport() {
        return this.mSport;
    }

    public int getmSleep() {
        return this.mSleep;
    }
}
