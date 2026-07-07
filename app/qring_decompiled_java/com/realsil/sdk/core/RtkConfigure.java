package com.realsil.sdk.core;

/* loaded from: classes3.dex */
public final class RtkConfigure {
    public boolean a;
    public boolean b;
    public java.lang.String c;
    public int d;

    public static class Builder {
        public com.realsil.sdk.core.RtkConfigure a = new com.realsil.sdk.core.RtkConfigure();

        public com.realsil.sdk.core.RtkConfigure build() {
            return this.a;
        }

        public com.realsil.sdk.core.RtkConfigure.Builder debugEnabled(boolean z) {
            this.a.setDebugEnabled(z);
            return this;
        }

        public com.realsil.sdk.core.RtkConfigure.Builder globalLogLevel(int i) {
            this.a.setGlobalLogLevel(i);
            return this;
        }

        public com.realsil.sdk.core.RtkConfigure.Builder logTag(java.lang.String str) {
            this.a.setLogTag(str);
            return this;
        }

        public com.realsil.sdk.core.RtkConfigure.Builder printLog(boolean z) {
            this.a.setPrintLog(z);
            return this;
        }
    }

    public int getGlobalLogLevel() {
        return this.d;
    }

    public java.lang.String getLogTag() {
        return this.c;
    }

    public boolean isDebugEnabled() {
        return this.a;
    }

    public boolean isPrintLog() {
        return this.b;
    }

    public void setDebugEnabled(boolean z) {
        this.a = z;
    }

    public void setGlobalLogLevel(int i) {
        this.d = i;
    }

    public void setLogTag(java.lang.String str) {
        this.c = str;
    }

    public void setPrintLog(boolean z) {
        this.b = z;
    }

    public java.lang.String toString() {
        return "RtkConfigure{" + java.lang.String.format("\n\tdebugEnabled=%b, printLog=%b, logTag=%s, globalLogLevel=0x%02X", java.lang.Boolean.valueOf(this.a), java.lang.Boolean.valueOf(this.b), this.c, java.lang.Integer.valueOf(this.d)) + "\n}";
    }

    public RtkConfigure() {
        this.a = true;
        this.b = true;
        this.c = "Realtek";
        this.d = 1;
    }
}
