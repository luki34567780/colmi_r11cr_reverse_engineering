package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class RestoreKeyReq extends com.oudmon.ble.base.communication.req.SimpleKeyReq {
    public RestoreKeyReq(byte b) {
        super(b);
    }

    @Override // com.oudmon.ble.base.communication.req.SimpleKeyReq, com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return new byte[]{com.realsil.sdk.bbpro.params.Mmi.AU_MMI_SWITCH_NEXT_VOICE_PROMPT_LANGUAGE, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_SWITCH_NEXT_VOICE_PROMPT_LANGUAGE};
    }
}
