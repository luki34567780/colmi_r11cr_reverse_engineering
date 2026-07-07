package com.google.android.gms.auth.api.proxy;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public class ProxyRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int VERSION_CODE = 2;
    public final byte[] body;
    public final int httpMethod;
    public final long timeoutMillis;
    public final java.lang.String url;
    final int zza;
    android.os.Bundle zzb;
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.proxy.ProxyRequest> CREATOR = new com.google.android.gms.auth.api.proxy.zza();
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int LAST_CODE = 7;

    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
    public static class Builder {
        private final java.lang.String zza;
        private int zzb = com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_GET;
        private long zzc = 3000;
        private byte[] zzd = new byte[0];
        private final android.os.Bundle zze = new android.os.Bundle();

        public Builder(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            if (android.util.Patterns.WEB_URL.matcher(str).matches()) {
                this.zza = str;
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 51);
            sb.append("The supplied url [ ");
            sb.append(str);
            sb.append("] is not match Patterns.WEB_URL!");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest build() {
            if (this.zzd == null) {
                this.zzd = new byte[0];
            }
            return new com.google.android.gms.auth.api.proxy.ProxyRequest(2, this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder putHeader(java.lang.String str, java.lang.String str2) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Header name cannot be null or empty!");
            android.os.Bundle bundle = this.zze;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            return this;
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder setBody(byte[] bArr) {
            this.zzd = bArr;
            return this;
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder setHttpMethod(int i) {
            boolean z = false;
            if (i >= 0 && i <= com.google.android.gms.auth.api.proxy.ProxyRequest.LAST_CODE) {
                z = true;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Unrecognized http method code.");
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder setTimeoutMillis(long j) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "The specified timeout must be non-negative.");
            this.zzc = j;
            return this;
        }
    }

    ProxyRequest(int i, java.lang.String str, int i2, long j, byte[] bArr, android.os.Bundle bundle) {
        this.zza = i;
        this.url = str;
        this.httpMethod = i2;
        this.timeoutMillis = j;
        this.body = bArr;
        this.zzb = bundle;
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaderMap() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(this.zzb.size());
        for (java.lang.String str : this.zzb.keySet()) {
            java.lang.String string = this.zzb.getString(str);
            if (string == null) {
                string = "";
            }
            linkedHashMap.put(str, string);
        }
        return java.util.Collections.unmodifiableMap(linkedHashMap);
    }

    public java.lang.String toString() {
        java.lang.String str = this.url;
        int i = this.httpMethod;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.url, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.httpMethod);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.timeoutMillis);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, this.body, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 5, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
