package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzcb {
    static java.util.HashMap<java.lang.String, java.lang.String> zze;
    private static java.lang.Object zzl;
    private static boolean zzm;
    public static final android.net.Uri zza = android.net.Uri.parse("content://com.google.android.gsf.gservices");
    public static final android.net.Uri zzb = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final java.util.regex.Pattern zzd = java.util.regex.Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final java.util.concurrent.atomic.AtomicBoolean zzk = new java.util.concurrent.atomic.AtomicBoolean();
    static final java.util.HashMap<java.lang.String, java.lang.Boolean> zzf = new java.util.HashMap<>();
    static final java.util.HashMap<java.lang.String, java.lang.Integer> zzg = new java.util.HashMap<>();
    static final java.util.HashMap<java.lang.String, java.lang.Long> zzh = new java.util.HashMap<>();
    static final java.util.HashMap<java.lang.String, java.lang.Float> zzi = new java.util.HashMap<>();
    static final java.lang.String[] zzj = new java.lang.String[0];

    public static java.lang.String zza(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2) {
        synchronized (com.google.android.gms.internal.auth.zzcb.class) {
            if (zze == null) {
                zzk.set(false);
                zze = new java.util.HashMap<>();
                zzl = new java.lang.Object();
                zzm = false;
                contentResolver.registerContentObserver(zza, true, new com.google.android.gms.internal.auth.zzca(null));
            } else if (zzk.getAndSet(false)) {
                zze.clear();
                zzf.clear();
                zzg.clear();
                zzh.clear();
                zzi.clear();
                zzl = new java.lang.Object();
                zzm = false;
            }
            java.lang.Object obj = zzl;
            if (zze.containsKey(str)) {
                java.lang.String str3 = zze.get(str);
                if (str3 != null) {
                    r3 = str3;
                }
                return r3;
            }
            int length = zzj.length;
            android.database.Cursor query = contentResolver.query(zza, null, null, new java.lang.String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    zzc(obj, str, null);
                    return null;
                }
                java.lang.String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                zzc(obj, str, string);
                return string != null ? string : null;
            } finally {
                query.close();
            }
        }
    }

    private static void zzc(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        synchronized (com.google.android.gms.internal.auth.zzcb.class) {
            if (obj == zzl) {
                zze.put(str, str2);
            }
        }
    }
}
