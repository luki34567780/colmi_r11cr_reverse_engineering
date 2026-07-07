package com.oudmon.ble.base.communication.req;

/* loaded from: /tmp/dex/classes2.dex */
public class BindAncsReq extends com.oudmon.ble.base.communication.req.BaseReqCmd {
    private byte[] mData;

    public BindAncsReq() {
        super((byte) 4);
        try {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "手机厂商: " + android.os.Build.BRAND + "手机型号: " + android.os.Build.MODEL + "SDK版本: " + android.os.Build.VERSION.SDK_INT + "系统版本: " + android.os.Build.VERSION.RELEASE);
            byte[] bytes = android.os.Build.MODEL.getBytes(java.nio.charset.StandardCharsets.UTF_8);
            bytes = bytes.length >= 14 ? java.util.Arrays.copyOf(bytes, 13) : bytes;
            byte b = 10;
            if (android.os.Build.VERSION.SDK_INT != 29) {
                if (android.os.Build.VERSION.SDK_INT == 28) {
                    b = 9;
                } else {
                    if (android.os.Build.VERSION.SDK_INT != 27 && android.os.Build.VERSION.SDK_INT != 26) {
                        if (android.os.Build.VERSION.SDK_INT != 25 && android.os.Build.VERSION.SDK_INT != 24) {
                            if (android.os.Build.VERSION.SDK_INT == 23) {
                                b = 6;
                            } else if (android.os.Build.VERSION.SDK_INT == 22 || android.os.Build.VERSION.SDK_INT == 21) {
                                b = 5;
                            }
                        }
                        b = 7;
                    }
                    b = 8;
                }
            }
            byte[] bArr = new byte[bytes.length + 2];
            this.mData = bArr;
            bArr[0] = 2;
            bArr[1] = b;
            java.lang.System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.oudmon.ble.base.communication.req.BaseReqCmd
    protected byte[] getSubData() {
        byte[] bArr = this.mData;
        return bArr == null ? new byte[]{2} : bArr;
    }
}
