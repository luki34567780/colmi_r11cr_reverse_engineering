package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzq implements java.util.Comparator {
    zzq() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.location.ActivityTransition activityTransition = (com.google.android.gms.location.ActivityTransition) obj;
        com.google.android.gms.location.ActivityTransition activityTransition2 = (com.google.android.gms.location.ActivityTransition) obj2;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activityTransition);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activityTransition2);
        int activityType = activityTransition.getActivityType();
        int activityType2 = activityTransition2.getActivityType();
        if (activityType != activityType2) {
            return activityType >= activityType2 ? 1 : -1;
        }
        int transitionType = activityTransition.getTransitionType();
        int transitionType2 = activityTransition2.getTransitionType();
        if (transitionType == transitionType2) {
            return 0;
        }
        return transitionType < transitionType2 ? -1 : 1;
    }
}
