package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class HttpUtils {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private HttpUtils() {
    }

    public static java.util.Map<java.lang.String, java.lang.String> parse(java.net.URI uri, java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> emptyMap = java.util.Collections.emptyMap();
        java.lang.String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new java.util.HashMap<>();
            com.google.android.gms.internal.common.zzx zzc2 = com.google.android.gms.internal.common.zzx.zzc(com.google.android.gms.internal.common.zzo.zzb('='));
            java.util.Iterator<java.lang.String> it = com.google.android.gms.internal.common.zzx.zzc(com.google.android.gms.internal.common.zzo.zzb('&')).zzb().zzd(rawQuery).iterator();
            while (it.hasNext()) {
                java.util.List<java.lang.String> zzf = zzc2.zzf(it.next());
                if (zzf.isEmpty() || zzf.size() > 2) {
                    throw new java.lang.IllegalArgumentException("bad parameter");
                }
                emptyMap.put(zza(zzf.get(0), str), zzf.size() == 2 ? zza(zzf.get(1), str) : null);
            }
        }
        return emptyMap;
    }

    private static java.lang.String zza(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return java.net.URLDecoder.decode(str, str2);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }
}
