package com.realsil.sdk.bbpro;

/* loaded from: /tmp/dex/classes2.dex */
public class BeeProParams {
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public boolean f = false;
    public java.util.UUID g = com.realsil.sdk.bbpro.ConnectionParameters.g;
    public int h = 0;

    public static class Builder {
        public com.realsil.sdk.bbpro.BeeProParams a = new com.realsil.sdk.bbpro.BeeProParams();

        public com.realsil.sdk.bbpro.BeeProParams.Builder autoConnectOnStart(boolean z) {
            return this;
        }

        public com.realsil.sdk.bbpro.BeeProParams.Builder bindHfpDisconnection(boolean z) {
            this.a.a(z);
            return this;
        }

        public com.realsil.sdk.bbpro.BeeProParams build() {
            return this.a;
        }

        public com.realsil.sdk.bbpro.BeeProParams.Builder connectA2dp(boolean z) {
            this.a.b(z);
            return this;
        }

        public com.realsil.sdk.bbpro.BeeProParams.Builder eqModuleEnabled(boolean z) {
            return this;
        }

        public com.realsil.sdk.bbpro.BeeProParams.Builder functionModuleEnabled(boolean z) {
            return this;
        }

        public com.realsil.sdk.bbpro.BeeProParams.Builder listenA2dp(boolean z) {
            this.a.c(z);
            return this;
        }

        public com.realsil.sdk.bbpro.BeeProParams.Builder listenHfp(boolean z) {
            this.a.d(z);
            return this;
        }

        public com.realsil.sdk.bbpro.BeeProParams.Builder otaModuleEnabled(boolean z) {
            return this;
        }

        public com.realsil.sdk.bbpro.BeeProParams.Builder serverEnabled(boolean z) {
            this.a.e(z);
            return this;
        }

        public com.realsil.sdk.bbpro.BeeProParams.Builder syncDataWhenConnected(boolean z) {
            this.a.f(z);
            return this;
        }

        public com.realsil.sdk.bbpro.BeeProParams.Builder transport(int i) {
            this.a.a(i);
            return this;
        }

        public com.realsil.sdk.bbpro.BeeProParams.Builder ttsModuleEnabled(boolean z) {
            return this;
        }

        public com.realsil.sdk.bbpro.BeeProParams.Builder uuid(java.util.UUID uuid) {
            this.a.a(uuid);
            return this;
        }
    }

    public void d(boolean z) {
        this.c = z;
    }

    public final void e(boolean z) {
        this.a = z;
    }

    public boolean f() {
        return this.a;
    }

    public boolean g() {
        return this.e;
    }

    public java.lang.String toString() {
        return "BeeProParameters{" + java.lang.String.format("\n\tserverEnabled=%b,", java.lang.Boolean.valueOf(this.a)) + java.lang.String.format("\n\tconnectA2dp=%b,", java.lang.Boolean.valueOf(this.d)) + java.lang.String.format("\n\tlistenA2dp=%b, listenHfp=%b\n", java.lang.Boolean.valueOf(this.b), java.lang.Boolean.valueOf(this.c)) + java.lang.String.format("\n\tsyncDataWhenConnected=%b,", java.lang.Boolean.valueOf(this.e)) + "\n}";
    }

    public void b(boolean z) {
        this.d = z;
    }

    public final void c(boolean z) {
        this.b = z;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.c;
    }

    public final void f(boolean z) {
        this.e = z;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public java.util.UUID b() {
        return this.g;
    }

    public boolean c() {
        return this.f;
    }

    public void a(int i) {
        this.h = i;
    }

    public int a() {
        return this.h;
    }

    public final void a(java.util.UUID uuid) {
        this.g = uuid;
    }
}
