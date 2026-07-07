package com.amap.api.col.p0003sl;

/* compiled from: PrivacyError.java */
/* loaded from: classes.dex */
public final class io {
    public final com.amap.api.col.3sl.in.c a;
    public final java.lang.String b;

    io(com.amap.api.col.3sl.in.c cVar, com.amap.api.col.p0003sl.iq iqVar) {
        java.lang.String format;
        this.a = cVar;
        switch (com.amap.api.col.p0003sl.io.AnonymousClass1.a[cVar.ordinal()]) {
            case 1:
                format = java.lang.String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请设置隐私权政策是否弹窗告知用户", iqVar.a());
                break;
            case 2:
                format = java.lang.String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已弹窗告知用户", iqVar.a());
                break;
            case 3:
                format = java.lang.String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保设置隐私权政策是否包含高德开平隐私权政策", iqVar.a());
                break;
            case 4:
                format = java.lang.String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已经包含高德开平隐私权政策", iqVar.a());
                break;
            case 5:
                format = java.lang.String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保设置隐私权政策是否取得用户同意", iqVar.a());
                break;
            case 6:
                format = java.lang.String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能前请确保隐私权政策已取得用户同意", iqVar.a());
                break;
            case 7:
                format = java.lang.String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n使用%s SDK 功能使用前请确保已经正确设置apiKey，如有疑问请在高德开放平台官网中搜索【INVALID_USER_KEY】相关内容进行解决。", iqVar.a());
                break;
            case 8:
                format = java.lang.String.format("***确保调用SDK任何接口前先调用更新隐私合规updatePrivacyShow、updatePrivacyAgree两个接口并且参数值都为true，若未正确设置有崩溃风险***\n参数非法，context 或 sdkInfo为空", new java.lang.Object[0]);
                break;
            case 9:
                format = java.lang.String.format("设置隐私政策成功", new java.lang.Object[0]);
                break;
            default:
                format = "";
                break;
        }
        this.b = format;
    }

    /* compiled from: PrivacyError.java */
    /* renamed from: com.amap.api.col.3sl.io$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amap.api.col.3sl.in.c.values().length];
            a = iArr;
            try {
                iArr[com.amap.api.col.3sl.in.c.ShowUnknowCode.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                a[com.amap.api.col.3sl.in.c.ShowNoShowCode.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                a[com.amap.api.col.3sl.in.c.InfoUnknowCode.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                a[com.amap.api.col.3sl.in.c.InfoNotContainCode.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                a[com.amap.api.col.3sl.in.c.AgreeUnknowCode.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                a[com.amap.api.col.3sl.in.c.AgreeNotAgreeCode.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                a[com.amap.api.col.3sl.in.c.InvaildUserKeyCode.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                a[com.amap.api.col.3sl.in.c.IllegalArgument.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                a[com.amap.api.col.3sl.in.c.SuccessCode.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }
}
