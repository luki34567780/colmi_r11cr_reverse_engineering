package com.hp.hpl.sparta;

/* compiled from: ParseSource.java */
/* loaded from: /tmp/dex/classes2.dex */
class DefaultLog implements com.hp.hpl.sparta.ParseLog {
    DefaultLog() {
    }

    @Override // com.hp.hpl.sparta.ParseLog
    public void error(java.lang.String str, java.lang.String str2, int i) {
        java.lang.System.err.println(str2 + "(" + i + "): " + str + " (ERROR)");
    }

    @Override // com.hp.hpl.sparta.ParseLog
    public void warning(java.lang.String str, java.lang.String str2, int i) {
        java.lang.System.out.println(str2 + "(" + i + "): " + str + " (WARNING)");
    }

    @Override // com.hp.hpl.sparta.ParseLog
    public void note(java.lang.String str, java.lang.String str2, int i) {
        java.lang.System.out.println(str2 + "(" + i + "): " + str + " (NOTE)");
    }
}
