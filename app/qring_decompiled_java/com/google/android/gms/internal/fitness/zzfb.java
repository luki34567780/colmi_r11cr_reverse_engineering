package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzfb extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzfc {
    public zzfb() {
        super("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.internal.fitness.zzex zzexVar = (com.google.android.gms.internal.fitness.zzex) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.internal.fitness.zzex.CREATOR);
            com.google.android.gms.internal.fitness.zzbq zzc = com.google.android.gms.internal.fitness.zzbp.zzc(parcel.readStrongBinder());
            com.google.android.gms.internal.fitness.zzc.zzb(parcel);
            zzb(zzexVar, zzc);
        } else if (i == 2) {
            com.google.android.gms.fitness.service.FitnessSensorServiceRequest fitnessSensorServiceRequest = (com.google.android.gms.fitness.service.FitnessSensorServiceRequest) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.fitness.service.FitnessSensorServiceRequest.CREATOR);
            com.google.android.gms.internal.fitness.zzcp zzb = com.google.android.gms.internal.fitness.zzco.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.fitness.zzc.zzb(parcel);
            zzc(fitnessSensorServiceRequest, zzb);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.internal.fitness.zzez zzezVar = (com.google.android.gms.internal.fitness.zzez) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.internal.fitness.zzez.CREATOR);
            com.google.android.gms.internal.fitness.zzcp zzb2 = com.google.android.gms.internal.fitness.zzco.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.fitness.zzc.zzb(parcel);
            zzd(zzezVar, zzb2);
        }
        return true;
    }
}
