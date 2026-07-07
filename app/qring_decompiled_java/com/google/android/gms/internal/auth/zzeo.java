package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public class zzeo<MessageType extends com.google.android.gms.internal.auth.zzeq<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.auth.zzeo<MessageType, BuilderType>> extends com.google.android.gms.internal.auth.zzdl<MessageType, BuilderType> {
    protected MessageType zza;
    protected boolean zzb = false;
    private final MessageType zzc;

    protected zzeo(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (MessageType) messagetype.zzj(4, null, null);
    }

    private static final void zzj(MessageType messagetype, MessageType messagetype2) {
        com.google.android.gms.internal.auth.zzfy.zza().zzb(messagetype.getClass()).zzf(messagetype, messagetype2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdl
    protected final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzdl zzb(com.google.android.gms.internal.auth.zzdm zzdmVar) {
        zze((com.google.android.gms.internal.auth.zzeq) zzdmVar);
        return this;
    }

    @Override // com.google.android.gms.internal.auth.zzdl
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.zzc.zzj(5, null, null);
        buildertype.zze(zzg());
        return buildertype;
    }

    public final BuilderType zze(MessageType messagetype) {
        if (this.zzb) {
            zzi();
            this.zzb = false;
        }
        zzj(this.zza, messagetype);
        return this;
    }

    @Override // com.google.android.gms.internal.auth.zzfp
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public MessageType zzg() {
        if (this.zzb) {
            return this.zza;
        }
        MessageType messagetype = this.zza;
        com.google.android.gms.internal.auth.zzfy.zza().zzb(messagetype.getClass()).zze(messagetype);
        this.zzb = true;
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzfr
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzfq zzh() {
        return this.zzc;
    }

    protected void zzi() {
        MessageType messagetype = (MessageType) this.zza.zzj(4, null, null);
        zzj(messagetype, this.zza);
        this.zza = messagetype;
    }
}
