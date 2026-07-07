package com.amap.api.col.p0003sl;

/* compiled from: NativeCrashHandler.java */
/* loaded from: classes.dex */
public final class jy {

    /* compiled from: NativeCrashHandler.java */
    static class a {
        public static com.amap.api.col.p0003sl.jy a = new com.amap.api.col.p0003sl.jy();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(17:3|(3:6|(1:109)(2:17|(7:19|(1:21)|22|23|24|(2:26|(1:(3:30|(3:32|(3:35|(1:42)(2:39|40)|33)|44)(1:46)|45)(2:48|47)))(0)|(10:53|(1:55)|56|(4:59|(4:64|65|(5:68|(1:85)(1:76)|(2:80|81)|82|66)|86)|87|57)|90|91|92|93|94|(1:96)(3:97|98|(2:103|104)(2:101|102)))(1:51)))|4)|113|114|24|(0)(0)|(0)|53|(0)|56|(1:57)|90|91|92|93|94|(0)(0))|115|24|(0)(0)|(0)|53|(0)|56|(1:57)|90|91|92|93|94|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.util.List<com.amap.api.col.p0003sl.iq> r13, boolean r14, com.amap.api.col.p0003sl.iq r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.jy.a(android.content.Context, java.lang.String, java.lang.String, java.util.List, boolean, com.amap.api.col.3sl.iq):boolean");
    }

    private static org.json.JSONObject a(java.lang.Thread thread) {
        if (thread == null || thread.getStackTrace() == null) {
            return null;
        }
        java.lang.StackTraceElement[] stackTrace = thread.getStackTrace();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("threadId", thread.getId());
            jSONObject.put("threadName", thread.getName());
            jSONObject.put("threadGroup", thread.getThreadGroup());
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement);
                stringBuffer.append("<br />");
            }
            jSONObject.put("stacks", stringBuffer.toString());
        } catch (java.lang.Throwable unused) {
        }
        return jSONObject;
    }
}
