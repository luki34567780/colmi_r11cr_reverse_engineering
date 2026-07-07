package androidx.databinding;

/* loaded from: classes.dex */
public class ObservableParcelable<T extends android.os.Parcelable> extends androidx.databinding.ObservableField<T> implements android.os.Parcelable, java.io.Serializable {
    public static final android.os.Parcelable.Creator<androidx.databinding.ObservableParcelable> CREATOR = new android.os.Parcelable.Creator<androidx.databinding.ObservableParcelable>() { // from class: androidx.databinding.ObservableParcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.databinding.ObservableParcelable createFromParcel(android.os.Parcel parcel) {
            return new androidx.databinding.ObservableParcelable(parcel.readParcelable(getClass().getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.databinding.ObservableParcelable[] newArray(int i) {
            return new androidx.databinding.ObservableParcelable[i];
        }
    };
    static final long serialVersionUID = 1;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableParcelable(T t) {
        super(t);
    }

    public ObservableParcelable() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable((android.os.Parcelable) get(), 0);
    }
}
