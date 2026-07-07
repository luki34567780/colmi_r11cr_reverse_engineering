package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class FitnessOptions implements com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension {
    public static final int ACCESS_READ = 0;
    public static final int ACCESS_WRITE = 1;
    private final java.util.Set zza;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static final class Builder {
        private final java.util.Set zza = new java.util.HashSet();

        private Builder() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.google.android.gms.fitness.FitnessOptions.Builder accessSleepSessions(int r4) {
            /*
                r3 = this;
                r0 = 1
                if (r4 == 0) goto L9
                if (r4 != r0) goto L7
                r4 = 1
                goto L9
            L7:
                r1 = 0
                goto La
            L9:
                r1 = 1
            La:
                java.lang.String r2 = "valid access types are FitnessOptions.ACCESS_READ or FitnessOptions.ACCESS_WRITE"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r2)
                if (r4 != 0) goto L1e
                java.util.Set r4 = r3.zza
                com.google.android.gms.common.api.Scope r0 = new com.google.android.gms.common.api.Scope
                java.lang.String r1 = "https://www.googleapis.com/auth/fitness.sleep.read"
                r0.<init>(r1)
                r4.add(r0)
                goto L2c
            L1e:
                if (r4 != r0) goto L2c
                java.util.Set r4 = r3.zza
                com.google.android.gms.common.api.Scope r0 = new com.google.android.gms.common.api.Scope
                java.lang.String r1 = "https://www.googleapis.com/auth/fitness.sleep.write"
                r0.<init>(r1)
                r4.add(r0)
            L2c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.FitnessOptions.Builder.accessSleepSessions(int):com.google.android.gms.fitness.FitnessOptions$Builder");
        }

        public com.google.android.gms.fitness.FitnessOptions.Builder addDataType(com.google.android.gms.fitness.data.DataType dataType) {
            addDataType(dataType, 0);
            return this;
        }

        public com.google.android.gms.fitness.FitnessOptions build() {
            return new com.google.android.gms.fitness.FitnessOptions(this, null);
        }

        /* synthetic */ Builder(com.google.android.gms.fitness.zzg zzgVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.google.android.gms.fitness.FitnessOptions.Builder addDataType(com.google.android.gms.fitness.data.DataType r4, int r5) {
            /*
                r3 = this;
                r0 = 1
                if (r5 == 0) goto L9
                if (r5 != r0) goto L7
                r5 = 1
                goto L9
            L7:
                r1 = 0
                goto La
            L9:
                r1 = 1
            La:
                java.lang.String r2 = "valid access types are FitnessOptions.ACCESS_READ or FitnessOptions.ACCESS_WRITE"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r2)
                java.lang.String r1 = r4.zza()
                java.lang.String r4 = r4.zzb()
                if (r5 != 0) goto L26
                if (r1 == 0) goto L34
                java.util.Set r4 = r3.zza
                com.google.android.gms.common.api.Scope r5 = new com.google.android.gms.common.api.Scope
                r5.<init>(r1)
                r4.add(r5)
                goto L34
            L26:
                if (r5 != r0) goto L34
                if (r4 == 0) goto L34
                java.util.Set r5 = r3.zza
                com.google.android.gms.common.api.Scope r0 = new com.google.android.gms.common.api.Scope
                r0.<init>(r4)
                r5.add(r0)
            L34:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.FitnessOptions.Builder.addDataType(com.google.android.gms.fitness.data.DataType, int):com.google.android.gms.fitness.FitnessOptions$Builder");
        }

        public com.google.android.gms.fitness.FitnessOptions.Builder accessActivitySessions(int i) {
            if (i == 0) {
                this.zza.add(new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.activity.read"));
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalArgumentException("valid access types are FitnessOptions.ACCESS_READ or FitnessOptions.ACCESS_WRITE");
                }
                this.zza.add(new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/fitness.activity.write"));
            }
            return this;
        }
    }

    /* synthetic */ FitnessOptions(com.google.android.gms.fitness.FitnessOptions.Builder builder, com.google.android.gms.fitness.zzh zzhVar) {
        this.zza = builder.zza;
    }

    public static com.google.android.gms.fitness.FitnessOptions.Builder builder() {
        return new com.google.android.gms.fitness.FitnessOptions.Builder(null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.fitness.FitnessOptions) {
            return this.zza.equals(((com.google.android.gms.fitness.FitnessOptions) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    public int getExtensionType() {
        return 3;
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    public java.util.List<com.google.android.gms.common.api.Scope> getImpliedScopes() {
        return new java.util.ArrayList(this.zza);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    public android.os.Bundle toBundle() {
        return new android.os.Bundle();
    }
}
