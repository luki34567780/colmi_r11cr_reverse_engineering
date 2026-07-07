package androidx.databinding;

/* loaded from: classes.dex */
public class ObservableDouble extends androidx.databinding.BaseObservableField implements android.os.Parcelable, java.io.Serializable {
    public static final android.os.Parcelable.Creator<androidx.databinding.ObservableDouble> CREATOR = new android.os.Parcelable.Creator<androidx.databinding.ObservableDouble>() { // from class: androidx.databinding.ObservableDouble.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.databinding.ObservableDouble createFromParcel(android.os.Parcel parcel) {
            return new androidx.databinding.ObservableDouble(parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.databinding.ObservableDouble[] newArray(int i) {
            return new androidx.databinding.ObservableDouble[i];
        }
    };
    static final long serialVersionUID = 1;
    private double mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableDouble(double d) {
        this.mValue = d;
    }

    public ObservableDouble() {
    }

    public ObservableDouble(androidx.databinding.Observable... observableArr) {
        super(observableArr);
    }

    public double get() {
        return this.mValue;
    }

    public void set(double d) {
        if (d != this.mValue) {
            this.mValue = d;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeDouble(this.mValue);
    }
}
