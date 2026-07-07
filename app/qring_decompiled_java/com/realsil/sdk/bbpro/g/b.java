package com.realsil.sdk.bbpro.g;

/* loaded from: /tmp/dex/classes2.dex */
public final class b {
    public com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo a;

    public b(com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo llAptScenarioGroupInfo) {
        this.a = llAptScenarioGroupInfo;
    }

    public static com.realsil.sdk.bbpro.g.b a(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            com.realsil.sdk.core.logger.ZLogger.d("invalid packet");
            return null;
        }
        com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo builder = com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo.builder(bArr);
        if (builder == null) {
            return null;
        }
        return new com.realsil.sdk.bbpro.g.b(builder);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetLlAptScenarioChooseInfoRsp {");
        sb.append("\n\tgroupNum=" + this.a.getGroupNum());
        sb.append("\n\tgroupScenario=" + com.realsil.sdk.core.utility.DataConverter.bytes2Hex(this.a.getGroupSenario()));
        sb.append("\n}");
        return sb.toString();
    }

    public com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo a() {
        return this.a;
    }
}
