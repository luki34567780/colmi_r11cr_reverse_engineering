package com.realsil.sdk.bbpro.model;

/* loaded from: /tmp/dex/classes2.dex */
public final class RwsInfo {
    public int caseBatteryValue;
    public boolean isRws;
    public int leftBatteryValue;
    public boolean leftConnected;
    public int rightBatteryValue;
    public boolean rightConnected;
    public int activeBud = 0;
    public byte leftActiveChannel = 0;
    public byte rightActiveChannel = 0;
    public boolean caseBatterySupported = false;

    public int getActiveBatteryValue() {
        return this.isRws ? this.activeBud == 0 ? this.leftBatteryValue : this.rightBatteryValue : this.leftBatteryValue;
    }

    public boolean isRwsEngaged() {
        return this.isRws && this.leftConnected && this.rightConnected;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RwsInfo{");
        boolean z = this.isRws;
        if (z) {
            java.util.Locale locale = java.util.Locale.US;
            sb.append(java.lang.String.format(locale, "isRws=%b, activeBud=%d", java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(this.activeBud)));
            sb.append(java.lang.String.format(locale, "\n\tL: connected=%b, channel=%d, battery=%d\n\tR: connected=%b, channel=%d, battery=%d", java.lang.Boolean.valueOf(this.leftConnected), java.lang.Byte.valueOf(this.leftActiveChannel), java.lang.Integer.valueOf(this.leftBatteryValue), java.lang.Boolean.valueOf(this.rightConnected), java.lang.Byte.valueOf(this.rightActiveChannel), java.lang.Integer.valueOf(this.rightBatteryValue)));
        }
        if (this.caseBatterySupported) {
            sb.append(java.lang.String.format(java.util.Locale.US, "\n\tcaseBatteryValue=%d", java.lang.Integer.valueOf(this.caseBatteryValue)));
        }
        sb.append("\n}");
        return sb.toString();
    }
}
