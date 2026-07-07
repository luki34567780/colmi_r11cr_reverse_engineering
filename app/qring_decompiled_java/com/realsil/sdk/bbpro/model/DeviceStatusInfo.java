package com.realsil.sdk.bbpro.model;

/* loaded from: /tmp/dex/classes2.dex */
public class DeviceStatusInfo implements android.os.Parcelable {
    public static final byte BUD_SIDE_LEFT = 1;
    public static final byte BUD_SIDE_RIGHT = 2;
    public static final byte BUD_TYPE_RWS = 1;
    public static final byte BUD_TYPE_STEREO = 0;
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.model.DeviceStatusInfo> CREATOR = new android.os.Parcelable.Creator<com.realsil.sdk.bbpro.model.DeviceStatusInfo>() { // from class: com.realsil.sdk.bbpro.model.DeviceStatusInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.bbpro.model.DeviceStatusInfo createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.model.DeviceStatusInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.bbpro.model.DeviceStatusInfo[] newArray(int i) {
            return new com.realsil.sdk.bbpro.model.DeviceStatusInfo[i];
        }
    };
    public byte a;
    public byte b;
    public byte c;
    public int d;
    public byte e;
    public int f;
    public boolean g;
    public int h;

    public DeviceStatusInfo() {
        this.a = (byte) 0;
        this.b = (byte) 1;
        this.c = (byte) 0;
        this.e = (byte) 0;
        this.g = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte getActiveBudSide() {
        return this.b;
    }

    public int getCaseBatteryValue() {
        return this.h;
    }

    public byte getLchActiveChannel() {
        return this.c;
    }

    public int getLchBatteryValue() {
        return this.d;
    }

    public byte getRchActiveChannel() {
        return this.e;
    }

    public int getRchBatteryValue() {
        return this.f;
    }

    public boolean isActiveConnected() {
        return this.d > 0;
    }

    public boolean isCaseBatterySupported() {
        return this.g;
    }

    public boolean isLchConnected() {
        return this.d > 0;
    }

    public boolean isRchConnected() {
        return this.f > 0;
    }

    public boolean isRws() {
        return this.a == 1;
    }

    public com.realsil.sdk.bbpro.model.RwsInfo toRwsInfo() {
        com.realsil.sdk.bbpro.model.RwsInfo rwsInfo = new com.realsil.sdk.bbpro.model.RwsInfo();
        rwsInfo.isRws = isRws();
        rwsInfo.activeBud = getActiveBudSide();
        rwsInfo.leftConnected = isLchConnected();
        rwsInfo.leftActiveChannel = this.c;
        rwsInfo.leftBatteryValue = this.d;
        rwsInfo.rightConnected = isRchConnected();
        rwsInfo.rightActiveChannel = this.e;
        rwsInfo.rightBatteryValue = this.f;
        rwsInfo.caseBatterySupported = this.g;
        rwsInfo.caseBatteryValue = this.h;
        return rwsInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByte(this.a);
        parcel.writeByte(this.b);
        parcel.writeByte(this.c);
        parcel.writeInt(this.d);
        parcel.writeByte(this.e);
        parcel.writeInt(this.f);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.h);
    }

    public DeviceStatusInfo(byte b, byte b2, byte b3, int i, byte b4, int i2, boolean z, int i3) {
        this.a = b;
        this.b = b2;
        this.c = b3;
        this.d = i;
        this.e = b4;
        this.f = i2;
        this.g = z;
        this.h = i3;
    }

    public DeviceStatusInfo(android.os.Parcel parcel) {
        this.a = (byte) 0;
        this.b = (byte) 1;
        this.c = (byte) 0;
        this.e = (byte) 0;
        this.g = false;
        this.a = parcel.readByte();
        this.b = parcel.readByte();
        this.c = parcel.readByte();
        this.d = parcel.readInt();
        this.e = parcel.readByte();
        this.f = parcel.readInt();
        this.g = parcel.readByte() != 0;
        this.h = parcel.readInt();
    }
}
