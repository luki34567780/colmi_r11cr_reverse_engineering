package androidx.databinding;

/* loaded from: classes.dex */
public class ObservableFloat extends androidx.databinding.BaseObservableField implements android.os.Parcelable, java.io.Serializable {
    public static final android.os.Parcelable.Creator<androidx.databinding.ObservableFloat> CREATOR = new android.os.Parcelable.Creator<androidx.databinding.ObservableFloat>() { // from class: androidx.databinding.ObservableFloat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.databinding.ObservableFloat createFromParcel(android.os.Parcel parcel) {
            return new androidx.databinding.ObservableFloat(parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.databinding.ObservableFloat[] newArray(int i) {
            return new androidx.databinding.ObservableFloat[i];
        }
    };
    static final long serialVersionUID = 1;
    private float mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableFloat(float f) {
        this.mValue = f;
    }

    public ObservableFloat() {
    }

    public ObservableFloat(androidx.databinding.Observable... observableArr) {
        super(observableArr);
    }

    public float get() {
        return this.mValue;
    }

    public void set(float f) {
        if (f != this.mValue) {
            this.mValue = f;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.mValue);
    }
}
