package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class FindDeviceReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    public FindDeviceReq() {
        super((byte) 80);
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return new byte[]{com.realsil.sdk.bbpro.params.Mmi.AU_MMI_DEV_POWER_ON_BUTTON_RELEASE, -86};
    }
}
