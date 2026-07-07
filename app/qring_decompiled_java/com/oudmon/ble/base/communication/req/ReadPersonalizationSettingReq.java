package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class ReadPersonalizationSettingReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    private byte[] data;

    private ReadPersonalizationSettingReq() {
        super(com.oudmon.ble.base.communication.Constants.CMD_GET_PERSONALIZATION_SETTING);
        this.data = new byte[]{1, 2, 3};
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return this.data;
    }

    public static com.oudmon.ble.base.communication.req.ReadPersonalizationSettingReq getReadInstance() {
        return new com.oudmon.ble.base.communication.req.ReadPersonalizationSettingReq();
    }
}
