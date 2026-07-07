package androidx.databinding;

/* loaded from: classes.dex */
public class ObservableChar extends androidx.databinding.BaseObservableField implements android.os.Parcelable, java.io.Serializable {
    public static final android.os.Parcelable.Creator<androidx.databinding.ObservableChar> CREATOR = new android.os.Parcelable.Creator<androidx.databinding.ObservableChar>() { // from class: androidx.databinding.ObservableChar.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.databinding.ObservableChar createFromParcel(android.os.Parcel parcel) {
            return new androidx.databinding.ObservableChar((char) parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.databinding.ObservableChar[] newArray(int i) {
            return new androidx.databinding.ObservableChar[i];
        }
    };
    static final long serialVersionUID = 1;
    private char mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ObservableChar(char c) {
        this.mValue = c;
    }

    public ObservableChar() {
    }

    public ObservableChar(androidx.databinding.Observable... observableArr) {
        super(observableArr);
    }

    public char get() {
        return this.mValue;
    }

    public void set(char c) {
        if (c != this.mValue) {
            this.mValue = c;
            notifyChange();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
