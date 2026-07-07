package com.autonavi.aps.amapapi.security;

/* compiled from: Encrypt.java */
/* loaded from: classes.dex */
public final class a {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final byte[] b = {com.realsil.sdk.bbpro.params.Mmi.AU_MMI_DEV_SPK_MUTE, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_DEV_SPK_MUTE, 81, 65, 65, 69, 119, 65, com.oudmon.ble.base.communication.Constants.CMD_GET_STEP_SOMEDAY_DETAIL, 48, com.oudmon.ble.base.communication.LargeDataHandler.ACTION_AVATAR_Device, 80, 115, 116, 54, 75, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_OUTPUT_INDICATION_2, 76, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_ENTER_PAIRING_MODE_LONG_PRESS, 97, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_DEV_FACTORY_RESET_TO_DEFAULT, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_AUDIO_EFFECT_NEXT, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_AV_BWD, com.oudmon.ble.base.communication.LargeDataHandler.ACTION_Blood_Sugar, 49, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_ENTER_PAIRING_MODE_LONG_PRESS, com.oudmon.ble.base.communication.Constants.CMD_GET_SLEEP, com.oudmon.ble.base.communication.Constants.CMD_QUERY_DATA_DISTRIBUTION, 79, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_OUTPUT_INDICATION_2, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_RWS_LINKBACK, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_RWS_LINKBACK, 65, 97, 76, 54, 65, 66, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_DEV_POWER_OFF_BUTTON_RELEASE, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_AV_BWD, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_OUTPUT_INDICATION_1, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_DEV_POWER_ON_BUTTON_RELEASE, 84, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_RWS_LINKBACK, com.oudmon.ble.base.communication.LargeDataHandler.ACTION_Blood_Sugar, com.oudmon.ble.base.communication.Constants.CMD_GET_SLEEP, 69, 76, 80, 82, 106, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_AV_STOP, 66, 75, 75, 69, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_NFC_DETECT, 55, 84, 108, 115, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_ENTER_PAIRING_MODE_LONG_PRESS, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_AV_STOP, 106, 76, 55, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_DEV_FACTORY_RESET_TO_DEFAULT, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_ENTER_PAIRING_MODE_LONG_PRESS, com.oudmon.ble.base.communication.Constants.CMD_QUERY_DATA_DISTRIBUTION, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_RWS_SYNC_RINGTONE, 73, 75, com.realsil.sdk.bbpro.params.Mmi.AU_MMAU_MMI_AV_FWD, 50, com.oudmon.ble.base.communication.Constants.CMD_MENSTRUATION, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_AUDIO_PASS_THROUGH, com.oudmon.ble.base.communication.Constants.CMD_QUERY_DATA_DISTRIBUTION, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_RWS_SYNC_RINGTONE, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_AV_EQ_MODE_UP, 105, 115, 105, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_DEV_DISCONNECT_ALL_LINK, 120, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_RWS_BUNDLE_PAIRING, 112, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_AV_BWD, 48, 76, 81, com.oudmon.ble.base.communication.Constants.CMD_QUERY_DATA_DISTRIBUTION, 86, 108, com.oudmon.ble.base.communication.Constants.CMD_HEALTH_PPG_DATA, 73, 65, 66, com.oudmon.ble.base.communication.LargeDataHandler.ACTION_AVATAR_Device, 65, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_DEV_LINK_LAST_DEVICE, 119, 65, 119, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_DEV_LINK_LAST_DEVICE, com.oudmon.ble.base.communication.Constants.CMD_GET_SLEEP, 65, 81, 66, 66, 69, 81, 65, 78, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_AUDIO_EFFECT_NEXT, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_RWS_RESET_TO_DEFAULT, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_OUTPUT_INDICATION_2, 73, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_DEV_FACTORY_RESET_BY_SPP, 111, 75, com.oudmon.ble.base.communication.LargeDataHandler.ACTION_AVATAR_Device, com.realsil.sdk.bbpro.params.Mmi.AU_MMI_DEV_DISCONNECT_ALL_LINK, 81, com.oudmon.ble.base.communication.Constants.CMD_GET_SLEEP, 119, 119, com.oudmon.ble.base.communication.Constants.CMD_QUERY_DATA_DISTRIBUTION, 77};
    private static final byte[] c;
    private static final javax.crypto.spec.IvParameterSpec d;

    static {
        byte[] bArr = {0, 1, 1, 2, 3, 5, 8, 13, 8, 7, 6, 5, 4, 3, 2, 1};
        c = bArr;
        d = new javax.crypto.spec.IvParameterSpec(bArr);
    }

    public static byte[] a(byte[] bArr) throws java.lang.Exception {
        java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(com.amap.api.col.p0003sl.nv.a(new java.lang.StringBuilder(new java.lang.String(b)).reverse().toString().getBytes())));
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(com.amap.api.col.p0003sl.ir.c("WUlNBL0VDQi9PQUVQV0lUSFNIQS0xQU5ETUdGMVBBRERJTkc"));
        cipher.init(1, generatePublic);
        return cipher.doFinal(bArr);
    }

    public static byte[] a(byte[] bArr, java.lang.String str) {
        try {
            javax.crypto.spec.SecretKeySpec b2 = b(str);
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(a());
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, b2, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "Encrypt", "aesEncrypt");
            return null;
        }
    }

    public static byte[] b(byte[] bArr, java.lang.String str) {
        try {
            javax.crypto.spec.SecretKeySpec b2 = b(str);
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(a());
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, b2, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "Encrypt", "aesDecrypt");
            return null;
        }
    }

    private static javax.crypto.spec.SecretKeySpec b(java.lang.String str) {
        byte[] bArr;
        if (str == null) {
            str = "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(16);
        stringBuffer.append(str);
        while (stringBuffer.length() < 16) {
            stringBuffer.append("0");
        }
        if (stringBuffer.length() > 16) {
            stringBuffer.setLength(16);
        }
        try {
            bArr = stringBuffer.toString().getBytes(com.bumptech.glide.load.Key.STRING_CHARSET_NAME);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "Encrypt", "createKey");
            bArr = null;
        }
        return new javax.crypto.spec.SecretKeySpec(bArr, "AES");
    }

    public static java.lang.String a(java.lang.String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return a("MD5", a("SHA1", str) + str);
                }
            } catch (java.lang.Throwable th) {
                com.autonavi.aps.amapapi.utils.b.a(th, "Encrypt", "generatorKey");
            }
        }
        return null;
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return null;
        }
        try {
            return c(com.amap.api.col.p0003sl.im.a(str2.getBytes(com.bumptech.glide.load.Key.STRING_CHARSET_NAME), str));
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "Encrypt", "encode");
            return null;
        }
    }

    private static java.lang.String c(byte[] bArr) {
        int length = bArr.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            char[] cArr = a;
            sb.append(cArr[(bArr[i] >> 4) & 15]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    private static byte[] a() {
        return com.amap.api.col.p0003sl.ir.c();
    }

    public static byte[] b(byte[] bArr) {
        try {
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArr.length - 16];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, 16);
            java.lang.System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr2, "AES");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(com.amap.api.col.p0003sl.ir.c()));
            return cipher.doFinal(bArr3);
        } catch (java.lang.Throwable th) {
            com.autonavi.aps.amapapi.utils.b.a(th, "Encrypt", "decryptRsponse length = ".concat(java.lang.String.valueOf(bArr != null ? bArr.length : 0)));
            return null;
        }
    }
}
