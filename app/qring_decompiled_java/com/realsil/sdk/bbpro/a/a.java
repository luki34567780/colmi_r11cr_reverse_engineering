package com.realsil.sdk.bbpro.a;

/* loaded from: /tmp/dex/classes2.dex */
public final class a {
    public com.realsil.sdk.bbpro.anc.AncScenarioGroupInfo a;

    public a(com.realsil.sdk.bbpro.anc.AncScenarioGroupInfo ancScenarioGroupInfo) {
        this.a = ancScenarioGroupInfo;
    }

    public static com.realsil.sdk.bbpro.a.a a(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        com.realsil.sdk.bbpro.anc.AncScenarioGroupInfo builder = com.realsil.sdk.bbpro.anc.AncScenarioGroupInfo.builder(bArr);
        if (builder == null) {
            return null;
        }
        return new com.realsil.sdk.bbpro.a.a(builder);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetAncScenarioChooseInfoRsp {");
        sb.append("\n\tgroupNum=" + this.a.getGroupNum());
        sb.append("\n\tgroupScenario=" + com.realsil.sdk.core.utility.DataConverter.bytes2Hex(this.a.getGroupScenario()));
        sb.append("\n}");
        return sb.toString();
    }

    public com.realsil.sdk.bbpro.anc.AncScenarioGroupInfo a() {
        return this.a;
    }
}
