package com.oudmon.ble.base.communication.rsp;

/* loaded from: /tmp/dex/classes2.dex */
public class FindPhoneRsp extends com.oudmon.ble.base.communication.rsp.BaseRspCmd {
    private int openOrClose;

    @Override // com.oudmon.ble.base.communication.rsp.BaseRspCmd
    public boolean acceptData(byte[] bArr) {
        this.openOrClose = bArr[0];
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.oudmon.ble.base.communication.utils.ByteUtil.byteArrayToString(bArr));
        return false;
    }

    public int getSwitchStatue() {
        return this.openOrClose;
    }
}
