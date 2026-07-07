package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzfc extends com.google.android.gms.internal.auth.zzfe {
    private static final java.lang.Class<?> zza = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

    private zzfc() {
        super(null);
    }

    /* synthetic */ zzfc(com.google.android.gms.internal.auth.zzfb zzfbVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfe
    final void zza(java.lang.Object obj, long j) {
        java.lang.Object unmodifiableList;
        java.util.List list = (java.util.List) com.google.android.gms.internal.auth.zzgz.zzf(obj, j);
        if (list instanceof com.google.android.gms.internal.auth.zzfa) {
            unmodifiableList = ((com.google.android.gms.internal.auth.zzfa) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof com.google.android.gms.internal.auth.zzfx) && (list instanceof com.google.android.gms.internal.auth.zzeu)) {
                com.google.android.gms.internal.auth.zzeu zzeuVar = (com.google.android.gms.internal.auth.zzeu) list;
                if (zzeuVar.zzc()) {
                    zzeuVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        com.google.android.gms.internal.auth.zzgz.zzp(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzfe
    final <E> void zzb(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.auth.zzez zzezVar;
        java.util.List list = (java.util.List) com.google.android.gms.internal.auth.zzgz.zzf(obj2, j);
        int size = list.size();
        java.util.List list2 = (java.util.List) com.google.android.gms.internal.auth.zzgz.zzf(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof com.google.android.gms.internal.auth.zzfa ? new com.google.android.gms.internal.auth.zzez(size) : ((list2 instanceof com.google.android.gms.internal.auth.zzfx) && (list2 instanceof com.google.android.gms.internal.auth.zzeu)) ? ((com.google.android.gms.internal.auth.zzeu) list2).zzd(size) : new java.util.ArrayList(size);
            com.google.android.gms.internal.auth.zzgz.zzp(obj, j, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                java.util.ArrayList arrayList = new java.util.ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                com.google.android.gms.internal.auth.zzgz.zzp(obj, j, arrayList);
                zzezVar = arrayList;
            } else if (list2 instanceof com.google.android.gms.internal.auth.zzgu) {
                com.google.android.gms.internal.auth.zzez zzezVar2 = new com.google.android.gms.internal.auth.zzez(list2.size() + size);
                zzezVar2.addAll(zzezVar2.size(), (com.google.android.gms.internal.auth.zzgu) list2);
                com.google.android.gms.internal.auth.zzgz.zzp(obj, j, zzezVar2);
                zzezVar = zzezVar2;
            } else if ((list2 instanceof com.google.android.gms.internal.auth.zzfx) && (list2 instanceof com.google.android.gms.internal.auth.zzeu)) {
                com.google.android.gms.internal.auth.zzeu zzeuVar = (com.google.android.gms.internal.auth.zzeu) list2;
                if (!zzeuVar.zzc()) {
                    list2 = zzeuVar.zzd(list2.size() + size);
                    com.google.android.gms.internal.auth.zzgz.zzp(obj, j, list2);
                }
            }
            list2 = zzezVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        com.google.android.gms.internal.auth.zzgz.zzp(obj, j, list);
    }
}
