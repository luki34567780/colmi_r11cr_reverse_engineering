package androidx.activity.result;

/* loaded from: classes.dex */
public final class IntentSenderRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.activity.result.IntentSenderRequest> CREATOR = new android.os.Parcelable.Creator<androidx.activity.result.IntentSenderRequest>() { // from class: androidx.activity.result.IntentSenderRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.activity.result.IntentSenderRequest createFromParcel(android.os.Parcel in) {
            return new androidx.activity.result.IntentSenderRequest(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.activity.result.IntentSenderRequest[] newArray(int size) {
            return new androidx.activity.result.IntentSenderRequest[size];
        }
    };
    private final android.content.Intent mFillInIntent;
    private final int mFlagsMask;
    private final int mFlagsValues;
    private final android.content.IntentSender mIntentSender;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    IntentSenderRequest(android.content.IntentSender intentSender, android.content.Intent intent, int flagsMask, int flagsValues) {
        this.mIntentSender = intentSender;
        this.mFillInIntent = intent;
        this.mFlagsMask = flagsMask;
        this.mFlagsValues = flagsValues;
    }

    public android.content.IntentSender getIntentSender() {
        return this.mIntentSender;
    }

    public android.content.Intent getFillInIntent() {
        return this.mFillInIntent;
    }

    public int getFlagsMask() {
        return this.mFlagsMask;
    }

    public int getFlagsValues() {
        return this.mFlagsValues;
    }

    IntentSenderRequest(android.os.Parcel in) {
        this.mIntentSender = (android.content.IntentSender) in.readParcelable(android.content.IntentSender.class.getClassLoader());
        this.mFillInIntent = (android.content.Intent) in.readParcelable(android.content.Intent.class.getClassLoader());
        this.mFlagsMask = in.readInt();
        this.mFlagsValues = in.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeParcelable(this.mIntentSender, flags);
        dest.writeParcelable(this.mFillInIntent, flags);
        dest.writeInt(this.mFlagsMask);
        dest.writeInt(this.mFlagsValues);
    }

    public static final class Builder {
        private android.content.Intent mFillInIntent;
        private int mFlagsMask;
        private int mFlagsValues;
        private android.content.IntentSender mIntentSender;

        public Builder(android.content.IntentSender intentSender) {
            this.mIntentSender = intentSender;
        }

        public Builder(android.app.PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }

        public androidx.activity.result.IntentSenderRequest.Builder setFillInIntent(android.content.Intent fillInIntent) {
            this.mFillInIntent = fillInIntent;
            return this;
        }

        public androidx.activity.result.IntentSenderRequest.Builder setFlags(int values, int mask) {
            this.mFlagsValues = values;
            this.mFlagsMask = mask;
            return this;
        }

        public androidx.activity.result.IntentSenderRequest build() {
            return new androidx.activity.result.IntentSenderRequest(this.mIntentSender, this.mFillInIntent, this.mFlagsMask, this.mFlagsValues);
        }
    }
}
