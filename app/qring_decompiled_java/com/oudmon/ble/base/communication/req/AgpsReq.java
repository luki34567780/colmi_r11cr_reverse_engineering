package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class AgpsReq extends com.oudmon.ble.base.communication.req.MixtureReq {
    private AgpsReq() {
        super((byte) 48);
    }

    public static com.oudmon.ble.base.communication.req.AgpsReq getReadInstance() {
        return new com.oudmon.ble.base.communication.req.AgpsReq() { // from class: com.oudmon.ble.base.communication.req.AgpsReq.1
            {
                this.subData = new byte[]{1};
            }
        };
    }

    public static com.oudmon.ble.base.communication.req.AgpsReq getWriteInstance(boolean z) {
        return new com.oudmon.ble.base.communication.req.AgpsReq(z) { // from class: com.oudmon.ble.base.communication.req.AgpsReq.2
            final /* synthetic */ boolean val$enable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.val$enable = z;
                this.subData = new byte[]{2, z ? (byte) 1 : (byte) 0};
            }
        };
    }
}
