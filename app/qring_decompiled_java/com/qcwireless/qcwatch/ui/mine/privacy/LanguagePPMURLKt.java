package com.qcwireless.qcwatch.ui.mine.privacy;

/* compiled from: LanguagePPMURL.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"getLanguagePPMUrl", "", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class LanguagePPMURLKt {
    public static final java.lang.String getLanguagePPMUrl() {
        try {
            kotlin.text.StringsKt.equals(java.util.Locale.getDefault().getLanguage(), "it", true);
            return "https://api2.qcwxkjvip.com/download/static/ppm/qc_ring.html";
        } catch (java.lang.Exception unused) {
            return "https://api2.qcwxkjvip.com/download/static/ppm/qc_ring.html";
        }
    }
}
