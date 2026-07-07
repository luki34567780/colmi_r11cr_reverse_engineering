package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public final class EqUtils {
    public static java.util.ArrayList<com.realsil.sdk.bbpro.equalizer.EqIndex> getSupportedIndexs(int i) {
        java.util.ArrayList<com.realsil.sdk.bbpro.equalizer.EqIndex> arrayList = new java.util.ArrayList<>();
        if ((i & 1) == 1) {
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqIndex(0, 1, "EQ_OFF", false, (byte) 3, null));
        }
        if ((i & 2) == 2) {
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqIndex(0, 2, "CUSTOMER_EQ_1", false, (byte) 3, null));
        }
        if ((i & 4) == 4) {
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqIndex(0, 4, "CUSTOMER_EQ_2", false, (byte) 3, null));
        }
        if ((i & 8) == 8) {
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqIndex(0, 8, "CUSTOMER_EQ_3", false, (byte) 3, null));
        }
        if ((i & 16) == 16) {
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqIndex(0, 16, "BUILD_IN_EQ_1", false, (byte) 3, null));
        }
        if ((i & 32) == 32) {
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqIndex(0, 32, "BUILD_IN_EQ_2", false, (byte) 3, null));
        }
        if ((i & 64) == 64) {
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqIndex(0, 64, "BUILD_IN_EQ_3", false, (byte) 3, null));
        }
        if ((i & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4) == 128) {
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqIndex(0, com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4, "BUILD_IN_EQ_4", false, (byte) 3, null));
        }
        if ((i & 256) == 256) {
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqIndex(0, 256, "BUILD_IN_EQ_5", false, (byte) 3, null));
        }
        if ((i & 512) == 512) {
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqIndex(0, 512, "REALTIME_EQ_1", true, (byte) 3, null));
        }
        if ((i & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2) == 1024) {
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqIndex(0, com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2, "REALTIME_EQ_2", true, (byte) 3, null));
        }
        if ((i & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.GAMING_MODE_EQ) == 2048) {
            arrayList.add(new com.realsil.sdk.bbpro.equalizer.EqIndex(1, com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.GAMING_MODE_EQ, "GAMING_MODE_EQ", true, (byte) 3, null));
        }
        return arrayList;
    }

    public static boolean isEditable(int i) {
        return (i & 512) == 512 || (i & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2) == 1024 || (i & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.GAMING_MODE_EQ) == 2048;
    }
}
