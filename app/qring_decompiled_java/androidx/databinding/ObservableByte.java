package androidx.databinding;

/* loaded from: classes.dex */
public class ObservableByte extends androidx.databinding.BaseObservableField implements android.os.Parcelable, java.io.Serializable {
    public static final android.os.Parcelable.Creator<androidx.databinding.ObservableByte> CREATOR = new android.os.Parcelable.Creator<androidx.databinding.ObservableByte>() { // from class: androidx.databinding.ObservableByte.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.databinding.ObservableByte createFromParcel(android.os.Parcel parcel) {
            return new androidx.databinding.ObservableByte(parcel.readByte());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.databinding.ObservableByte[] newArray(int i) {
            return new androidx.databinding.ObservableByte[i];
        }
    };
    static final long serialVersionUID = 1;
    private byte mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableByte(byte b) {
        this.mValue = b;
    }

    public ObservableByte() {
    }

    public ObservableByte(androidx.databinding.Observable... observableArr) {
        super(observableArr);
    }

    public byte get() {
        return this.mValue;
    }

    public void set(byte b) {
        if (b != this.mValue) {
            this.mValue = b;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByte(this.mValue);
    }
}
