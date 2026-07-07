package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class PhoneGpsReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private PhoneGpsReq() {
        super((byte) 116);
    }

    public static com.oudmon.ble.base.communication.req.PhoneGpsReq getGpsStatus(byte b) {
        return new com.oudmon.ble.base.communication.req.PhoneGpsReq(b) { // from class: com.oudmon.ble.base.communication.req.PhoneGpsReq.1
            final /* synthetic */ byte val$status;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.val$status = b;
                this.subData = new byte[]{b, 0};
            }
        };
    }

    public static com.oudmon.ble.base.communication.req.PhoneGpsReq setPhoneDataReq(int i, int i2) {
        return new com.oudmon.ble.base.communication.req.PhoneGpsReq(i, i2) { // from class: com.oudmon.ble.base.communication.req.PhoneGpsReq.2
            final /* synthetic */ int val$calorie;
            final /* synthetic */ int val$distance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.val$distance = i;
                this.val$calorie = i2;
                byte[] intToByte = com.oudmon.ble.base.communication.utils.ByteUtil.intToByte(i, 4);
                this.subData = com.oudmon.ble.base.communication.utils.ByteUtil.concat(com.oudmon.ble.base.communication.utils.ByteUtil.concat(new byte[]{5, 0}, intToByte), com.oudmon.ble.base.communication.utils.ByteUtil.intToByte(i2, 4));
            }
        };
    }
}
