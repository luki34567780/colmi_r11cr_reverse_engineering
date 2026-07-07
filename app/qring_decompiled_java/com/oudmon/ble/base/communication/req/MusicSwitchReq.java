package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class MusicSwitchReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    protected byte[] data;

    private MusicSwitchReq() {
        super(com.oudmon.ble.base.communication.Constants.CMD_GET_MUSIC_SWITCH);
    }

    public static com.oudmon.ble.base.communication.req.MusicSwitchReq getReadInstance() {
        return new com.oudmon.ble.base.communication.req.MusicSwitchReq() { // from class: com.oudmon.ble.base.communication.req.MusicSwitchReq.1
            {
                this.data = new byte[]{1};
            }
        };
    }

    public static com.oudmon.ble.base.communication.req.MusicSwitchReq getWriteInstance(boolean z) {
        return new com.oudmon.ble.base.communication.req.MusicSwitchReq(z) { // from class: com.oudmon.ble.base.communication.req.MusicSwitchReq.2
            final /* synthetic */ boolean val$enable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.val$enable = z;
                byte[] bArr = new byte[2];
                bArr[0] = 2;
                bArr[1] = (byte) (z ? 1 : 2);
                this.data = bArr;
            }
        };
    }

    public static com.oudmon.ble.base.communication.req.MusicSwitchReq getNewWriteInstance(boolean z, int i, int i2, java.lang.String str) {
        return new com.oudmon.ble.base.communication.req.MusicSwitchReq(str, z, i, i2) { // from class: com.oudmon.ble.base.communication.req.MusicSwitchReq.3
            final /* synthetic */ java.lang.String val$name;
            final /* synthetic */ boolean val$playing;
            final /* synthetic */ int val$progress;
            final /* synthetic */ int val$volume;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.val$name = str;
                this.val$playing = z;
                this.val$progress = i;
                this.val$volume = i2;
                byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                byte[] bArr = new byte[bytes.length + 3];
                bArr[0] = (byte) (!z ? 1 : 0);
                bArr[1] = (byte) i;
                bArr[2] = (byte) i2;
                java.lang.System.arraycopy(bytes, 0, bArr, 3, bytes.length);
                this.data = bArr;
            }
        };
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        return this.data;
    }
}
