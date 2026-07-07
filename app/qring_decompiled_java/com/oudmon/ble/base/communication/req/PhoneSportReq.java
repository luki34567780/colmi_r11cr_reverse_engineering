package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class PhoneSportReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private PhoneSportReq() {
        super((byte) 119);
    }

    public static com.oudmon.ble.base.communication.req.PhoneSportReq getSportStatus(byte b, byte b2) {
        return new com.oudmon.ble.base.communication.req.PhoneSportReq(b, b2) { // from class: com.oudmon.ble.base.communication.req.PhoneSportReq.1
            final /* synthetic */ byte val$sportType;
            final /* synthetic */ byte val$status;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.val$status = b;
                this.val$sportType = b2;
                this.subData = new byte[]{b, b2};
            }
        };
    }
}
