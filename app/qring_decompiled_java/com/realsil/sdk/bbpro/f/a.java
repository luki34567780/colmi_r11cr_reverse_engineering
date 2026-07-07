package com.realsil.sdk.bbpro.f;

/* loaded from: /tmp/dex/classes2.dex */
public final class a {
    public static java.util.List<com.realsil.sdk.bbpro.model.KeyMmiSettings> a(byte[] bArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (bArr != null && bArr.length > 0) {
            int i = bArr[0] & 255;
            if (bArr.length >= (i * 4) + 1) {
                for (int i2 = 0; i2 < i; i2++) {
                    com.realsil.sdk.bbpro.model.KeyMmiSettings keyMmiSettings = new com.realsil.sdk.bbpro.model.KeyMmiSettings();
                    int i3 = i2 * 4;
                    keyMmiSettings.setBud(bArr[i3 + 1]);
                    keyMmiSettings.setScenario(bArr[i3 + 2]);
                    keyMmiSettings.setClickType(bArr[i3 + 3]);
                    keyMmiSettings.setMmiIndex(bArr[i3 + 4]);
                    arrayList.add(keyMmiSettings);
                }
            }
        }
        return arrayList;
    }
}
