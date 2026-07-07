package androidx.databinding;

/* loaded from: classes.dex */
public class ObservableShort extends androidx.databinding.BaseObservableField implements android.os.Parcelable, java.io.Serializable {
    public static final android.os.Parcelable.Creator<androidx.databinding.ObservableShort> CREATOR = new android.os.Parcelable.Creator<androidx.databinding.ObservableShort>() { // from class: androidx.databinding.ObservableShort.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.databinding.ObservableShort createFromParcel(android.os.Parcel parcel) {
            return new androidx.databinding.ObservableShort((short) parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.databinding.ObservableShort[] newArray(int i) {
            return new androidx.databinding.ObservableShort[i];
        }
    };
    static final long serialVersionUID = 1;
    private short mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableShort(short s) {
        this.mValue = s;
    }

    public ObservableShort() {
    }

    public ObservableShort(androidx.databinding.Observable... observableArr) {
        super(observableArr);
    }

    public short get() {
        return this.mValue;
    }

    public void set(short s) {
        if (s != this.mValue) {
            this.mValue = s;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
