package com.google.android.gms.dynamic;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface IFragmentWrapper extends android.os.IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.dynamic.IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static com.google.android.gms.dynamic.IFragmentWrapper asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return queryLocalInterface instanceof com.google.android.gms.dynamic.IFragmentWrapper ? (com.google.android.gms.dynamic.IFragmentWrapper) queryLocalInterface : new com.google.android.gms.dynamic.zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            switch (i) {
                case 2:
                    com.google.android.gms.dynamic.IObjectWrapper zzg = zzg();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zzg);
                    return true;
                case 3:
                    android.os.Bundle zzd = zzd();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzd(parcel2, zzd);
                    return true;
                case 4:
                    int zzb = zzb();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzb);
                    return true;
                case 5:
                    com.google.android.gms.dynamic.IFragmentWrapper zze = zze();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zze);
                    return true;
                case 6:
                    com.google.android.gms.dynamic.IObjectWrapper zzh = zzh();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zzh);
                    return true;
                case 7:
                    boolean zzs = zzs();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzb(parcel2, zzs);
                    return true;
                case 8:
                    java.lang.String zzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeString(zzj);
                    return true;
                case 9:
                    com.google.android.gms.dynamic.IFragmentWrapper zzf = zzf();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zzf);
                    return true;
                case 10:
                    int zzc = zzc();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzc);
                    return true;
                case 11:
                    boolean zzt = zzt();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzb(parcel2, zzt);
                    return true;
                case 12:
                    com.google.android.gms.dynamic.IObjectWrapper zzi = zzi();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zzi);
                    return true;
                case 13:
                    boolean zzu = zzu();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzb(parcel2, zzu);
                    return true;
                case 14:
                    boolean zzv = zzv();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzb(parcel2, zzv);
                    return true;
                case 15:
                    boolean zzw = zzw();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzb(parcel2, zzw);
                    return true;
                case 16:
                    boolean zzx = zzx();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzb(parcel2, zzx);
                    return true;
                case 17:
                    boolean zzy = zzy();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzb(parcel2, zzy);
                    return true;
                case 18:
                    boolean zzz = zzz();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzb(parcel2, zzz);
                    return true;
                case 19:
                    boolean zzA = zzA();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzb(parcel2, zzA);
                    return true;
                case 20:
                    zzk(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    zzl(com.google.android.gms.internal.common.zzc.zzf(parcel));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    zzm(com.google.android.gms.internal.common.zzc.zzf(parcel));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    zzn(com.google.android.gms.internal.common.zzc.zzf(parcel));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    zzo(com.google.android.gms.internal.common.zzc.zzf(parcel));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    zzp((android.content.Intent) com.google.android.gms.internal.common.zzc.zza(parcel, android.content.Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    zzq((android.content.Intent) com.google.android.gms.internal.common.zzc.zza(parcel, android.content.Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    zzr(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean zzA() throws android.os.RemoteException;

    int zzb() throws android.os.RemoteException;

    int zzc() throws android.os.RemoteException;

    android.os.Bundle zzd() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IFragmentWrapper zze() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IFragmentWrapper zzf() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzg() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzh() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzi() throws android.os.RemoteException;

    java.lang.String zzj() throws android.os.RemoteException;

    void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    void zzl(boolean z) throws android.os.RemoteException;

    void zzm(boolean z) throws android.os.RemoteException;

    void zzn(boolean z) throws android.os.RemoteException;

    void zzo(boolean z) throws android.os.RemoteException;

    void zzp(android.content.Intent intent) throws android.os.RemoteException;

    void zzq(android.content.Intent intent, int i) throws android.os.RemoteException;

    void zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    boolean zzs() throws android.os.RemoteException;

    boolean zzt() throws android.os.RemoteException;

    boolean zzu() throws android.os.RemoteException;

    boolean zzv() throws android.os.RemoteException;

    boolean zzw() throws android.os.RemoteException;

    boolean zzx() throws android.os.RemoteException;

    boolean zzy() throws android.os.RemoteException;

    boolean zzz() throws android.os.RemoteException;
}
