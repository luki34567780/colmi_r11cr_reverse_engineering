package com.google.android.gms.common.data;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class DataBufferSafeParcelable<T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> extends com.google.android.gms.common.data.AbstractDataBuffer<T> {
    private static final java.lang.String[] zaa = {"data"};
    private final android.os.Parcelable.Creator<T> zab;

    public DataBufferSafeParcelable(com.google.android.gms.common.data.DataHolder dataHolder, android.os.Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zab = creator;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void addValue(com.google.android.gms.common.data.DataHolder.Builder builder, T t) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        t.writeToParcel(obtain, 0);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("data", obtain.marshall());
        builder.withRow(contentValues);
        obtain.recycle();
    }

    public static com.google.android.gms.common.data.DataHolder.Builder buildDataHolder() {
        return com.google.android.gms.common.data.DataHolder.builder(zaa);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public T get(int i) {
        com.google.android.gms.common.data.DataHolder dataHolder = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.mDataHolder);
        byte[] byteArray = dataHolder.getByteArray("data", i, dataHolder.getWindowIndex(i));
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        T createFromParcel = this.zab.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
