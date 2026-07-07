package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class GoogleSignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> CREATOR = new com.google.android.gms.auth.api.signin.zab();
    public static com.google.android.gms.common.util.Clock zaa = com.google.android.gms.common.util.DefaultClock.getInstance();
    final int zab;
    java.util.List<com.google.android.gms.common.api.Scope> zac;
    private java.lang.String zad;
    private java.lang.String zae;
    private java.lang.String zaf;
    private java.lang.String zag;
    private android.net.Uri zah;
    private java.lang.String zai;
    private long zaj;
    private java.lang.String zak;
    private java.lang.String zal;
    private java.lang.String zam;
    private java.util.Set<com.google.android.gms.common.api.Scope> zan = new java.util.HashSet();

    GoogleSignInAccount(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, long j, java.lang.String str6, java.util.List<com.google.android.gms.common.api.Scope> list, java.lang.String str7, java.lang.String str8) {
        this.zab = i;
        this.zad = str;
        this.zae = str2;
        this.zaf = str3;
        this.zag = str4;
        this.zah = uri;
        this.zai = str5;
        this.zaj = j;
        this.zak = str6;
        this.zac = list;
        this.zal = str7;
        this.zam = str8;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount createDefault() {
        return zae(new android.accounts.Account("<<default account>>", "com.google"), new java.util.HashSet());
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount fromAccount(android.accounts.Account account) {
        return zae(account, new androidx.collection.ArraySet());
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount zaa(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, android.net.Uri uri, java.lang.Long l, java.lang.String str7, java.util.Set<com.google.android.gms.common.api.Scope> set) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str7), new java.util.ArrayList((java.util.Collection) com.google.android.gms.common.internal.Preconditions.checkNotNull(set)), str5, str6);
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount zab(java.lang.String str) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String optString = jSONObject.optString("photoUrl");
        android.net.Uri parse = !android.text.TextUtils.isEmpty(optString) ? android.net.Uri.parse(optString) : null;
        long parseLong = java.lang.Long.parseLong(jSONObject.getString("expirationTime"));
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(jSONArray.getString(i)));
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount zaa2 = zaa(jSONObject.optString(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has(com.google.android.gms.common.Scopes.EMAIL) ? jSONObject.optString(com.google.android.gms.common.Scopes.EMAIL) : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, java.lang.Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        zaa2.zai = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return zaa2;
    }

    private static com.google.android.gms.auth.api.signin.GoogleSignInAccount zae(android.accounts.Account account, java.util.Set<com.google.android.gms.common.api.Scope> set) {
        return zaa(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) obj;
        return googleSignInAccount.zak.equals(this.zak) && googleSignInAccount.getRequestedScopes().equals(getRequestedScopes());
    }

    public android.accounts.Account getAccount() {
        java.lang.String str = this.zaf;
        if (str == null) {
            return null;
        }
        return new android.accounts.Account(str, "com.google");
    }

    public java.lang.String getDisplayName() {
        return this.zag;
    }

    public java.lang.String getEmail() {
        return this.zaf;
    }

    public java.lang.String getFamilyName() {
        return this.zam;
    }

    public java.lang.String getGivenName() {
        return this.zal;
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getGrantedScopes() {
        return new java.util.HashSet(this.zac);
    }

    public java.lang.String getId() {
        return this.zad;
    }

    public java.lang.String getIdToken() {
        return this.zae;
    }

    public android.net.Uri getPhotoUrl() {
        return this.zah;
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getRequestedScopes() {
        java.util.HashSet hashSet = new java.util.HashSet(this.zac);
        hashSet.addAll(this.zan);
        return hashSet;
    }

    public java.lang.String getServerAuthCode() {
        return this.zai;
    }

    public int hashCode() {
        return ((this.zak.hashCode() + 527) * 31) + getRequestedScopes().hashCode();
    }

    public boolean isExpired() {
        return zaa.currentTimeMillis() / 1000 >= this.zaj + (-300);
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount requestExtraScopes(com.google.android.gms.common.api.Scope... scopeArr) {
        if (scopeArr != null) {
            java.util.Collections.addAll(this.zan, scopeArr);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zab);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, getPhotoUrl(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 8, this.zaj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.zak, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 10, this.zac, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zac() {
        return this.zak;
    }

    public final java.lang.String zad() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID, getId());
            }
            if (getIdToken() != null) {
                jSONObject.put("tokenId", getIdToken());
            }
            if (getEmail() != null) {
                jSONObject.put(com.google.android.gms.common.Scopes.EMAIL, getEmail());
            }
            if (getDisplayName() != null) {
                jSONObject.put("displayName", getDisplayName());
            }
            if (getGivenName() != null) {
                jSONObject.put("givenName", getGivenName());
            }
            if (getFamilyName() != null) {
                jSONObject.put("familyName", getFamilyName());
            }
            android.net.Uri photoUrl = getPhotoUrl();
            if (photoUrl != null) {
                jSONObject.put("photoUrl", photoUrl.toString());
            }
            if (getServerAuthCode() != null) {
                jSONObject.put("serverAuthCode", getServerAuthCode());
            }
            jSONObject.put("expirationTime", this.zaj);
            jSONObject.put("obfuscatedIdentifier", this.zak);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.List<com.google.android.gms.common.api.Scope> list = this.zac;
            com.google.android.gms.common.api.Scope[] scopeArr = (com.google.android.gms.common.api.Scope[]) list.toArray(new com.google.android.gms.common.api.Scope[list.size()]);
            java.util.Arrays.sort(scopeArr, new java.util.Comparator() { // from class: com.google.android.gms.auth.api.signin.zaa
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> creator = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR;
                    return ((com.google.android.gms.common.api.Scope) obj).getScopeUri().compareTo(((com.google.android.gms.common.api.Scope) obj2).getScopeUri());
                }
            });
            for (com.google.android.gms.common.api.Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
