package com.oudmon.ble.base.communication.responseImpl;

/* loaded from: /tmp/dex/classes2.dex */
public class PackageLengthListener implements com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.PackageLengthRsp> {
    @Override // com.oudmon.ble.base.communication.ICommandResponse
    public void onDataResponse(com.oudmon.ble.base.communication.rsp.PackageLengthRsp packageLengthRsp) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "GpsOnlineListener.. onDataResponse.. mData: " + packageLengthRsp.mData);
        com.oudmon.ble.base.communication.JPackageManager.getInstance().setLength(java.lang.Math.max(packageLengthRsp.mData, 20));
        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().packageLength();
    }
}
