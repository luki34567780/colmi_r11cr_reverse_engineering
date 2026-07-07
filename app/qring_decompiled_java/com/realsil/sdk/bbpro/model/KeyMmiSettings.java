package com.realsil.sdk.bbpro.model;

/* loaded from: /tmp/dex/classes2.dex */
public class KeyMmiSettings implements android.os.Parcelable {
    public static final byte BUD_PHYSICAL_DEFAULT_CHANNEL = 0;
    public static final byte BUD_PHYSICAL_L_CHANNEL = 1;
    public static final byte BUD_PHYSICAL_R_CHANNEL = 2;
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.model.KeyMmiSettings> CREATOR = new android.os.Parcelable.Creator<com.realsil.sdk.bbpro.model.KeyMmiSettings>() { // from class: com.realsil.sdk.bbpro.model.KeyMmiSettings.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.bbpro.model.KeyMmiSettings createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.model.KeyMmiSettings(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.bbpro.model.KeyMmiSettings[] newArray(int i) {
            return new com.realsil.sdk.bbpro.model.KeyMmiSettings[i];
        }
    };
    public static final byte KEY_CALL_STATUS_CALL_IDLE = 0;
    public static final byte KEY_CALL_STATUS_NOT_CALL_IDLE = 1;
    public static final byte KEY_CLICK_LONG_PRESS = 4;
    public static final byte KEY_CLICK_MULTI_2 = 2;
    public static final byte KEY_CLICK_MULTI_3 = 3;
    public static final byte KEY_CLICK_SINGLE = 1;
    public static final byte KEY_CLICK_UTRAL_LONG_PRESS = 5;
    public byte a;
    public byte b;
    public byte c;
    public byte d;

    public KeyMmiSettings() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte getBud() {
        return this.a;
    }

    public byte getClickType() {
        return this.c;
    }

    public byte getMmiIndex() {
        return this.d;
    }

    public byte getScenario() {
        return this.b;
    }

    public void setBud(byte b) {
        this.a = b;
    }

    public void setClickType(byte b) {
        this.c = b;
    }

    public void setMmiIndex(byte b) {
        this.d = b;
    }

    public void setScenario(byte b) {
        this.b = b;
    }

    public java.lang.String toString() {
        return java.lang.String.format("bud=0x%02X,call=0x%02X,clickType=0x%02X,mmiIndex=0x%02X\n", java.lang.Byte.valueOf(this.a), java.lang.Byte.valueOf(this.b), java.lang.Byte.valueOf(this.c), java.lang.Byte.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByte(this.a);
        parcel.writeByte(this.b);
        parcel.writeByte(this.c);
        parcel.writeByte(this.d);
    }

    public KeyMmiSettings(android.os.Parcel parcel) {
        this.a = parcel.readByte();
        this.b = parcel.readByte();
        this.c = parcel.readByte();
        this.d = parcel.readByte();
    }
}
