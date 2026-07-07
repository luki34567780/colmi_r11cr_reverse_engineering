package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class DeviceAvatarRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private int avatarHeight;
    private int avatarWidth;
    private int screenType;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        this.screenType = bArr[0];
        this.avatarWidth = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 1, 3));
        this.avatarHeight = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 3, 5));
        return false;
    }

    public int getScreenType() {
        return this.screenType;
    }

    public int getAvatarWidth() {
        return this.avatarWidth;
    }

    public int getAvatarHeight() {
        return this.avatarHeight;
    }
}
