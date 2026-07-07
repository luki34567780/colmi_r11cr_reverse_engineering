package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzu implements java.util.Comparator {
    zzu() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.location.DetectedActivity detectedActivity = (com.google.android.gms.location.DetectedActivity) obj;
        com.google.android.gms.location.DetectedActivity detectedActivity2 = (com.google.android.gms.location.DetectedActivity) obj2;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(detectedActivity);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(detectedActivity2);
        int compareTo = java.lang.Integer.valueOf(detectedActivity2.getConfidence()).compareTo(java.lang.Integer.valueOf(detectedActivity.getConfidence()));
        return compareTo == 0 ? java.lang.Integer.valueOf(detectedActivity.getType()).compareTo(java.lang.Integer.valueOf(detectedActivity2.getType())) : compareTo;
    }
}
