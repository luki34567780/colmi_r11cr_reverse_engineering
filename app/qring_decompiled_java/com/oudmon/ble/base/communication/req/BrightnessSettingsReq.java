package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class BrightnessSettingsReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private BrightnessSettingsReq() {
        super(com.oudmon.ble.base.communication.Constants.CMD_GET_BRIGHTNESS);
    }

    public static com.oudmon.ble.base.communication.req.BrightnessSettingsReq getReadInstance() {
        return new com.oudmon.ble.base.communication.req.BrightnessSettingsReq() { // from class: com.oudmon.ble.base.communication.req.BrightnessSettingsReq.1
            {
                this.subData = new byte[]{1};
            }
        };
    }

    public static com.oudmon.ble.base.communication.req.BrightnessSettingsReq getWriteInstance(int i) {
        return new com.oudmon.ble.base.communication.req.BrightnessSettingsReq(i) { // from class: com.oudmon.ble.base.communication.req.BrightnessSettingsReq.2
            final /* synthetic */ int val$level;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.val$level = i;
                this.subData = new byte[]{2, (byte) i};
            }
        };
    }
}
