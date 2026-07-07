package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzab implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.maps.model.CameraPosition cameraPosition = null;
        java.lang.Float f = null;
        java.lang.Float f2 = null;
        com.google.android.gms.maps.model.LatLngBounds latLngBounds = null;
        java.lang.Integer num = null;
        java.lang.String str = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    b = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 3:
                    b2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 4:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    cameraPosition = (com.google.android.gms.maps.model.CameraPosition) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.maps.model.CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 7:
                    b4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 8:
                    b5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 9:
                    b6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 10:
                    b7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 11:
                    b8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 12:
                    b9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 13:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 14:
                    b10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 15:
                    b11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 16:
                    f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloatObject(parcel, readHeader);
                    break;
                case 17:
                    f2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloatObject(parcel, readHeader);
                    break;
                case 18:
                    latLngBounds = (com.google.android.gms.maps.model.LatLngBounds) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.maps.model.LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 20:
                    num = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(parcel, readHeader);
                    break;
                case 21:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.maps.GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12, num, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.maps.GoogleMapOptions[i];
    }
}
