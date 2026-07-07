package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class TestResp extends com.oudmon.ble.base.communication.rsp.MixtureRsp {
    java.lang.String data;
    java.lang.StringBuilder sb = new java.lang.StringBuilder();

    @Override // com.oudmon.ble.base.communication.rsp.MixtureRsp
    protected void readSubData(byte[] bArr) {
        java.lang.StringBuilder sb = this.sb;
        sb.delete(0, sb.length());
        int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 0, 2));
        int bytesToInt2 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 2, 4));
        int bytesToInt3 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 4, 6));
        int bytesToInt4 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 6, 8));
        int bytesToInt5 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 8, 10));
        int bytesToInt6 = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 10, 12));
        java.lang.StringBuilder sb2 = this.sb;
        sb2.append(bytesToInt);
        sb2.append(",");
        java.lang.StringBuilder sb3 = this.sb;
        sb3.append(bytesToInt2);
        sb3.append(",");
        java.lang.StringBuilder sb4 = this.sb;
        sb4.append(bytesToInt3);
        sb4.append(",");
        java.lang.StringBuilder sb5 = this.sb;
        sb5.append(bytesToInt4);
        sb5.append(",");
        java.lang.StringBuilder sb6 = this.sb;
        sb6.append(bytesToInt5);
        sb6.append(",");
        java.lang.StringBuilder sb7 = this.sb;
        sb7.append(bytesToInt6);
        sb7.append("\n");
    }

    public java.lang.String getData() {
        return this.sb.toString();
    }
}
