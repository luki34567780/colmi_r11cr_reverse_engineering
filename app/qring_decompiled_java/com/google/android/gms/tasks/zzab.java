package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzab implements com.google.android.gms.tasks.Continuation<java.lang.Void, com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tasks.Task<?>>>> {
    final /* synthetic */ java.util.Collection zza;

    zzab(java.util.Collection collection) {
        this.zza = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tasks.Task<?>>> then(com.google.android.gms.tasks.Task<java.lang.Void> task) throws java.lang.Exception {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.zza);
        return com.google.android.gms.tasks.Tasks.forResult(arrayList);
    }
}
