package com.google.android.gms.auth.api.credentials;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public final class CredentialPickerConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.CredentialPickerConfig> CREATOR = new com.google.android.gms.auth.api.credentials.zbb();
    final int zba;
    private final boolean zbb;
    private final boolean zbc;
    private final int zbd;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static class Builder {
        private boolean zba = false;
        private boolean zbb = true;
        private int zbc = 1;

        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig build() {
            return new com.google.android.gms.auth.api.credentials.CredentialPickerConfig(2, this.zba, this.zbb, false, this.zbc);
        }

        @java.lang.Deprecated
        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder setForNewAccount(boolean z) {
            this.zbc = true == z ? 3 : 1;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder setPrompt(int i) {
            this.zbc = i;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder setShowAddAccountButton(boolean z) {
            this.zba = z;
            return this;
        }

        public com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder setShowCancelButton(boolean z) {
            this.zbb = z;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.zba = i;
        this.zbb = z;
        this.zbc = z2;
        if (i < 2) {
            this.zbd = true == z3 ? 3 : 1;
        } else {
            this.zbd = i2;
        }
    }

    @java.lang.Deprecated
    public boolean isForNewAccount() {
        return this.zbd == 3;
    }

    public boolean shouldShowAddAccountButton() {
        return this.zbb;
    }

    public boolean shouldShowCancelButton() {
        return this.zbc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, shouldShowAddAccountButton());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, shouldShowCancelButton());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, isForNewAccount());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zbd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zba);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
