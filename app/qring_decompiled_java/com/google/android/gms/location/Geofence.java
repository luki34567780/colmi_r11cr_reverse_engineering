package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    /* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private java.lang.String zza = null;
        private int zzb = 0;
        private long zzc = Long.MIN_VALUE;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        public com.google.android.gms.location.Geofence build() {
            if (this.zza == null) {
                throw new java.lang.IllegalArgumentException("Request ID not set.");
            }
            int i = this.zzb;
            if (i == 0) {
                throw new java.lang.IllegalArgumentException("Transitions types not set.");
            }
            if ((i & 4) != 0 && this.zzi < 0) {
                throw new java.lang.IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
            }
            if (this.zzc == Long.MIN_VALUE) {
                throw new java.lang.IllegalArgumentException("Expiration not set.");
            }
            if (this.zzd == -1) {
                throw new java.lang.IllegalArgumentException("Geofence region not set.");
            }
            if (this.zzh >= 0) {
                return new com.google.android.gms.internal.location.zzbj(this.zza, this.zzb, (short) 1, this.zze, this.zzf, this.zzg, this.zzc, this.zzh, this.zzi);
            }
            throw new java.lang.IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        public com.google.android.gms.location.Geofence.Builder setCircularRegion(double d, double d2, float f) {
            boolean z = d >= -90.0d && d <= 90.0d;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(42);
            sb.append("Invalid latitude: ");
            sb.append(d);
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
            boolean z2 = d2 >= -180.0d && d2 <= 180.0d;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(43);
            sb2.append("Invalid longitude: ");
            sb2.append(d2);
            com.google.android.gms.common.internal.Preconditions.checkArgument(z2, sb2.toString());
            boolean z3 = f > 0.0f;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(31);
            sb3.append("Invalid radius: ");
            sb3.append(f);
            com.google.android.gms.common.internal.Preconditions.checkArgument(z3, sb3.toString());
            this.zzd = (short) 1;
            this.zze = d;
            this.zzf = d2;
            this.zzg = f;
            return this;
        }

        public com.google.android.gms.location.Geofence.Builder setExpirationDuration(long j) {
            if (j < 0) {
                this.zzc = -1L;
            } else {
                this.zzc = com.google.android.gms.common.util.DefaultClock.getInstance().elapsedRealtime() + j;
            }
            return this;
        }

        public com.google.android.gms.location.Geofence.Builder setLoiteringDelay(int i) {
            this.zzi = i;
            return this;
        }

        public com.google.android.gms.location.Geofence.Builder setNotificationResponsiveness(int i) {
            this.zzh = i;
            return this;
        }

        public com.google.android.gms.location.Geofence.Builder setRequestId(java.lang.String str) {
            this.zza = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        public com.google.android.gms.location.Geofence.Builder setTransitionTypes(int i) {
            this.zzb = i;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
    public @interface GeofenceTransition {
    }

    /* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
    public @interface TransitionTypes {
    }

    long getExpirationTime();

    double getLatitude();

    int getLoiteringDelay();

    double getLongitude();

    int getNotificationResponsiveness();

    float getRadius();

    java.lang.String getRequestId();

    int getTransitionTypes();
}
