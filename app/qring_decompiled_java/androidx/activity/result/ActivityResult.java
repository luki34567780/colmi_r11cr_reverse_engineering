package androidx.activity.result;

/* loaded from: classes.dex */
public final class ActivityResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.activity.result.ActivityResult> CREATOR = new android.os.Parcelable.Creator<androidx.activity.result.ActivityResult>() { // from class: androidx.activity.result.ActivityResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.activity.result.ActivityResult createFromParcel(android.os.Parcel in) {
            return new androidx.activity.result.ActivityResult(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.activity.result.ActivityResult[] newArray(int size) {
            return new androidx.activity.result.ActivityResult[size];
        }
    };
    private final android.content.Intent mData;
    private final int mResultCode;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ActivityResult(int resultCode, android.content.Intent data) {
        this.mResultCode = resultCode;
        this.mData = data;
    }

    ActivityResult(android.os.Parcel in) {
        this.mResultCode = in.readInt();
        this.mData = in.readInt() == 0 ? null : (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(in);
    }

    public int getResultCode() {
        return this.mResultCode;
    }

    public android.content.Intent getData() {
        return this.mData;
    }

    public java.lang.String toString() {
        return "ActivityResult{resultCode=" + resultCodeToString(this.mResultCode) + ", data=" + this.mData + '}';
    }

    public static java.lang.String resultCodeToString(int resultCode) {
        return resultCode != -1 ? resultCode != 0 ? java.lang.String.valueOf(resultCode) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeInt(this.mResultCode);
        dest.writeInt(this.mData == null ? 0 : 1);
        android.content.Intent intent = this.mData;
        if (intent != null) {
            intent.writeToParcel(dest, flags);
        }
    }
}
