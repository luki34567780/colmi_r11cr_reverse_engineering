package com.amap.api.col.p0003sl;

/* compiled from: ContourLineOptions.java */
/* loaded from: classes.dex */
public final class eo extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.col.p0003sl.eo> CREATOR = new android.os.Parcelable.Creator<com.amap.api.col.p0003sl.eo>() { // from class: com.amap.api.col.3sl.eo.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.col.p0003sl.eo createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.col.p0003sl.eo[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.col.p0003sl.eo a(android.os.Parcel parcel) {
            return new com.amap.api.col.p0003sl.eo(parcel);
        }

        private static com.amap.api.col.p0003sl.eo[] a(int i) {
            return new com.amap.api.col.p0003sl.eo[i];
        }
    };
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private boolean f;
    private int g;
    private double h;
    private java.util.List<com.amap.api.col.p0003sl.en> i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public eo() {
        this.a = 3.0f;
        this.b = 20.0f;
        this.c = Float.MIN_VALUE;
        this.d = Float.MAX_VALUE;
        this.e = 200.0f;
        this.f = true;
        this.g = -3355444;
        this.h = 3.0d;
        this.i = new java.util.ArrayList();
        this.type = "ContourLineOptions";
    }

    protected eo(android.os.Parcel parcel) {
        this.a = 3.0f;
        this.b = 20.0f;
        this.c = Float.MIN_VALUE;
        this.d = Float.MAX_VALUE;
        this.e = 200.0f;
        this.f = true;
        this.g = -3355444;
        this.h = 3.0d;
        this.i = new java.util.ArrayList();
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f = zArr[0];
        this.g = parcel.readInt();
        this.h = parcel.readDouble();
        this.i = parcel.readArrayList(com.amap.api.col.p0003sl.en.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeBooleanArray(new boolean[]{this.f});
        parcel.writeInt(this.g);
        parcel.writeDouble(this.h);
        parcel.writeList(this.i);
    }
}
