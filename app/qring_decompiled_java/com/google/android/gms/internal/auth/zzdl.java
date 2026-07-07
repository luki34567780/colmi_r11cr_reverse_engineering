package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzdl<MessageType extends com.google.android.gms.internal.auth.zzdm<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.auth.zzdl<MessageType, BuilderType>> implements com.google.android.gms.internal.auth.zzfp {
    @Override // 
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    protected abstract BuilderType zzb(MessageType messagetype);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzfp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzfp zzc(com.google.android.gms.internal.auth.zzfq zzfqVar) {
        if (zzh().getClass().isInstance(zzfqVar)) {
            return zzb((com.google.android.gms.internal.auth.zzdm) zzfqVar);
        }
        throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
