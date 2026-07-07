package com.realsil.sdk.core;

/* loaded from: classes3.dex */
public final class Constants {
    public static final java.lang.String FLAVOR_CUSTOMER = "customer";
    public static final java.lang.String FLAVOR_HOTFIX = "hotfix";
    public static final java.lang.String FLAVOR_QC = "qc";

    public boolean isLogEnabled(boolean z, java.lang.String str) {
        return z || FLAVOR_QC.equals(str);
    }
}
