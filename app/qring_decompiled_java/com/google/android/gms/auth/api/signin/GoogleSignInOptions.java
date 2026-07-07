package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class GoogleSignInOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Api.ApiOptions.Optional, com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInOptions> CREATOR;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions DEFAULT_SIGN_IN;
    public static final com.google.android.gms.common.api.Scope zaa = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.PROFILE);
    public static final com.google.android.gms.common.api.Scope zab = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.EMAIL);
    public static final com.google.android.gms.common.api.Scope zac = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.OPEN_ID);
    public static final com.google.android.gms.common.api.Scope zad;
    public static final com.google.android.gms.common.api.Scope zae;
    private static java.util.Comparator<com.google.android.gms.common.api.Scope> zag;
    final int zaf;
    private final java.util.ArrayList<com.google.android.gms.common.api.Scope> zah;
    private android.accounts.Account zai;
    private boolean zaj;
    private final boolean zak;
    private final boolean zal;
    private java.lang.String zam;
    private java.lang.String zan;
    private java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> zao;
    private java.lang.String zap;
    private java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> zaq;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class Builder {
        private java.util.Set<com.google.android.gms.common.api.Scope> zaa;
        private boolean zab;
        private boolean zac;
        private boolean zad;
        private java.lang.String zae;
        private android.accounts.Account zaf;
        private java.lang.String zag;
        private java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> zah;
        private java.lang.String zai;

        public Builder() {
            this.zaa = new java.util.HashSet();
            this.zah = new java.util.HashMap();
        }

        private final java.lang.String zaa(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            java.lang.String str2 = this.zae;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "two different server client ids provided");
            return str;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder addExtension(com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension googleSignInOptionsExtension) {
            if (this.zah.containsKey(java.lang.Integer.valueOf(googleSignInOptionsExtension.getExtensionType()))) {
                throw new java.lang.IllegalStateException("Only one extension per type may be added");
            }
            java.util.List<com.google.android.gms.common.api.Scope> impliedScopes = googleSignInOptionsExtension.getImpliedScopes();
            if (impliedScopes != null) {
                this.zaa.addAll(impliedScopes);
            }
            this.zah.put(java.lang.Integer.valueOf(googleSignInOptionsExtension.getExtensionType()), new com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable(googleSignInOptionsExtension));
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions build() {
            if (this.zaa.contains(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zae) && this.zaa.contains(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zad)) {
                this.zaa.remove(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zad);
            }
            if (this.zad && (this.zaf == null || !this.zaa.isEmpty())) {
                requestId();
            }
            return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(new java.util.ArrayList(this.zaa), this.zaf, this.zad, this.zab, this.zac, this.zae, this.zag, this.zah, this.zai);
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestEmail() {
            this.zaa.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zab);
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestId() {
            this.zaa.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zac);
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestIdToken(java.lang.String str) {
            this.zad = true;
            zaa(str);
            this.zae = str;
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestProfile() {
            this.zaa.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zaa);
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestScopes(com.google.android.gms.common.api.Scope scope, com.google.android.gms.common.api.Scope... scopeArr) {
            this.zaa.add(scope);
            this.zaa.addAll(java.util.Arrays.asList(scopeArr));
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestServerAuthCode(java.lang.String str) {
            requestServerAuthCode(str, false);
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder setAccountName(java.lang.String str) {
            this.zaf = new android.accounts.Account(com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str), "com.google");
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder setHostedDomain(java.lang.String str) {
            this.zag = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder setLogSessionId(java.lang.String str) {
            this.zai = str;
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestServerAuthCode(java.lang.String str, boolean z) {
            this.zab = true;
            zaa(str);
            this.zae = str;
            this.zac = z;
            return this;
        }

        public Builder(com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
            this.zaa = new java.util.HashSet();
            this.zah = new java.util.HashMap();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions);
            this.zaa = new java.util.HashSet(googleSignInOptions.zah);
            this.zab = googleSignInOptions.zak;
            this.zac = googleSignInOptions.zal;
            this.zad = googleSignInOptions.zaj;
            this.zae = googleSignInOptions.zam;
            this.zaf = googleSignInOptions.zai;
            this.zag = googleSignInOptions.zan;
            this.zah = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zam(googleSignInOptions.zao);
            this.zai = googleSignInOptions.zap;
        }
    }

    static {
        com.google.android.gms.common.api.Scope scope = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.GAMES_LITE);
        zad = scope;
        zae = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.GAMES);
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder builder = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder();
        builder.requestId();
        builder.requestProfile();
        DEFAULT_SIGN_IN = builder.build();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder builder2 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder();
        builder2.requestScopes(scope, new com.google.android.gms.common.api.Scope[0]);
        DEFAULT_GAMES_SIGN_IN = builder2.build();
        CREATOR = new com.google.android.gms.auth.api.signin.zae();
        zag = new com.google.android.gms.auth.api.signin.zac();
    }

    GoogleSignInOptions(int i, java.util.ArrayList<com.google.android.gms.common.api.Scope> arrayList, android.accounts.Account account, boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> arrayList2, java.lang.String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, zam(arrayList2), str3);
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInOptions zab(java.lang.String str) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(jSONArray.getString(i)));
        }
        java.lang.String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, (java.util.ArrayList<com.google.android.gms.common.api.Scope>) new java.util.ArrayList(hashSet), !android.text.TextUtils.isEmpty(optString) ? new android.accounts.Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new java.util.HashMap(), (java.lang.String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> zam(java.util.List<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (list == null) {
            return hashMap;
        }
        for (com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(java.lang.Integer.valueOf(googleSignInOptionsExtensionParcelable.getType()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.getAccount()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.zao     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 > 0) goto L90
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.zao     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 <= 0) goto L18
            goto L90
        L18:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.zah     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.getScopes()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.zah     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.getScopes()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.zai     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.zam     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.getServerClientId()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.zam     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.getServerClientId()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.zal     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.isForceCodeForRefreshToken()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.zaj     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.isIdTokenRequested()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.zak     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.isServerAuthCodeRequested()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.zap     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.getLogSessionId()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public android.accounts.Account getAccount() {
        return this.zai;
    }

    public java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> getExtensions() {
        return this.zao;
    }

    public java.lang.String getLogSessionId() {
        return this.zap;
    }

    public com.google.android.gms.common.api.Scope[] getScopeArray() {
        java.util.ArrayList<com.google.android.gms.common.api.Scope> arrayList = this.zah;
        return (com.google.android.gms.common.api.Scope[]) arrayList.toArray(new com.google.android.gms.common.api.Scope[arrayList.size()]);
    }

    public java.util.ArrayList<com.google.android.gms.common.api.Scope> getScopes() {
        return new java.util.ArrayList<>(this.zah);
    }

    public java.lang.String getServerClientId() {
        return this.zam;
    }

    public int hashCode() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList<com.google.android.gms.common.api.Scope> arrayList2 = this.zah;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).getScopeUri());
        }
        java.util.Collections.sort(arrayList);
        com.google.android.gms.auth.api.signin.internal.HashAccumulator hashAccumulator = new com.google.android.gms.auth.api.signin.internal.HashAccumulator();
        hashAccumulator.addObject(arrayList);
        hashAccumulator.addObject(this.zai);
        hashAccumulator.addObject(this.zam);
        hashAccumulator.zaa(this.zal);
        hashAccumulator.zaa(this.zaj);
        hashAccumulator.zaa(this.zak);
        hashAccumulator.addObject(this.zap);
        return hashAccumulator.hash();
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zal;
    }

    public boolean isIdTokenRequested() {
        return this.zaj;
    }

    public boolean isServerAuthCodeRequested() {
        return this.zak;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zaf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getScopes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, isIdTokenRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isServerAuthCodeRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, isForceCodeForRefreshToken());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getServerClientId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zan, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 9, getExtensions(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, getLogSessionId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zaf() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Collections.sort(this.zah, zag);
            java.util.Iterator<com.google.android.gms.common.api.Scope> it = this.zah.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getScopeUri());
            }
            jSONObject.put("scopes", jSONArray);
            android.accounts.Account account = this.zai;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.zaj);
            jSONObject.put("forceCodeForRefreshToken", this.zal);
            jSONObject.put("serverAuthRequested", this.zak);
            if (!android.text.TextUtils.isEmpty(this.zam)) {
                jSONObject.put("serverClientId", this.zam);
            }
            if (!android.text.TextUtils.isEmpty(this.zan)) {
                jSONObject.put("hostedDomain", this.zan);
            }
            return jSONObject.toString();
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private GoogleSignInOptions(int i, java.util.ArrayList<com.google.android.gms.common.api.Scope> arrayList, android.accounts.Account account, boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> map, java.lang.String str3) {
        this.zaf = i;
        this.zah = arrayList;
        this.zai = account;
        this.zaj = z;
        this.zak = z2;
        this.zal = z3;
        this.zam = str;
        this.zan = str2;
        this.zao = new java.util.ArrayList<>(map.values());
        this.zaq = map;
        this.zap = str3;
    }
}
