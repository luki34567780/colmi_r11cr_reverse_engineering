package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class LocationResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    private final java.util.List zzb;
    static final java.util.List zza = java.util.Collections.emptyList();
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationResult> CREATOR = new com.google.android.gms.location.zzbp();

    LocationResult(java.util.List list) {
        this.zzb = list;
    }

    public static com.google.android.gms.location.LocationResult create(java.util.List<android.location.Location> list) {
        if (list == null) {
            list = zza;
        }
        return new com.google.android.gms.location.LocationResult(list);
    }

    public static com.google.android.gms.location.LocationResult extractResult(android.content.Intent intent) {
        if (hasResult(intent)) {
            return (com.google.android.gms.location.LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
        }
        return null;
    }

    public static boolean hasResult(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.LocationResult)) {
            return false;
        }
        com.google.android.gms.location.LocationResult locationResult = (com.google.android.gms.location.LocationResult) obj;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return this.zzb.equals(locationResult.zzb);
        }
        if (this.zzb.size() != locationResult.zzb.size()) {
            return false;
        }
        java.util.Iterator it = locationResult.zzb.iterator();
        for (android.location.Location location : this.zzb) {
            android.location.Location location2 = (android.location.Location) it.next();
            if (java.lang.Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || java.lang.Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !com.google.android.gms.common.internal.Objects.equal(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public android.location.Location getLastLocation() {
        int size = this.zzb.size();
        if (size == 0) {
            return null;
        }
        return (android.location.Location) this.zzb.get(size - 1);
    }

    public java.util.List<android.location.Location> getLocations() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb);
    }

    public java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.String.valueOf(valueOf).length();
        return "LocationResult".concat(java.lang.String.valueOf(valueOf));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getLocations(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
