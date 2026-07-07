package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzaj {
    public static final double zza = 10.0d / java.util.concurrent.TimeUnit.SECONDS.toNanos(1);
    public static final double zzb = 2000.0d / java.util.concurrent.TimeUnit.HOURS.toNanos(1);
    public static final double zzc = 100.0d / java.util.concurrent.TimeUnit.SECONDS.toNanos(1);
    public static final java.util.Set zzd = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("altitude", "duration", "food_item", "meal_type", "repetitions", "resistance", "resistance_type")));
    private static final com.google.android.gms.fitness.data.zzaj zze = new com.google.android.gms.fitness.data.zzaj();
    private final java.util.Map zzf;
    private final java.util.Map zzg;

    private zzaj() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("latitude", new com.google.android.gms.fitness.data.zzai(-90.0d, 90.0d, null));
        hashMap.put("longitude", new com.google.android.gms.fitness.data.zzai(-180.0d, 180.0d, null));
        hashMap.put("accuracy", new com.google.android.gms.fitness.data.zzai(0.0d, 10000.0d, null));
        hashMap.put("bpm", new com.google.android.gms.fitness.data.zzai(0.0d, 1000.0d, null));
        hashMap.put("altitude", new com.google.android.gms.fitness.data.zzai(-100000.0d, 100000.0d, null));
        hashMap.put("percentage", new com.google.android.gms.fitness.data.zzai(0.0d, 100.0d, null));
        hashMap.put("confidence", new com.google.android.gms.fitness.data.zzai(0.0d, 100.0d, null));
        hashMap.put("duration", new com.google.android.gms.fitness.data.zzai(0.0d, 9.223372036854776E18d, null));
        hashMap.put("height", new com.google.android.gms.fitness.data.zzai(0.0d, 3.0d, null));
        hashMap.put("weight", new com.google.android.gms.fitness.data.zzai(0.0d, 1000.0d, null));
        hashMap.put("speed", new com.google.android.gms.fitness.data.zzai(0.0d, 11000.0d, null));
        this.zzg = java.util.Collections.unmodifiableMap(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("com.google.step_count.delta", zzd("steps", new com.google.android.gms.fitness.data.zzai(0.0d, zza, null)));
        hashMap2.put("com.google.calories.expended", zzd(com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES, new com.google.android.gms.fitness.data.zzai(0.0d, zzb, null)));
        hashMap2.put("com.google.distance.delta", zzd("distance", new com.google.android.gms.fitness.data.zzai(0.0d, zzc, null)));
        this.zzf = java.util.Collections.unmodifiableMap(hashMap2);
    }

    public static com.google.android.gms.fitness.data.zzaj zzc() {
        return zze;
    }

    private static java.util.Map zzd(java.lang.Object obj, java.lang.Object obj2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(obj, obj2);
        return hashMap;
    }

    public final com.google.android.gms.fitness.data.zzai zza(java.lang.String str) {
        return (com.google.android.gms.fitness.data.zzai) this.zzg.get(str);
    }

    public final com.google.android.gms.fitness.data.zzai zzb(java.lang.String str, java.lang.String str2) {
        java.util.Map map = (java.util.Map) this.zzf.get(str);
        if (map != null) {
            return (com.google.android.gms.fitness.data.zzai) map.get(str2);
        }
        return null;
    }
}
