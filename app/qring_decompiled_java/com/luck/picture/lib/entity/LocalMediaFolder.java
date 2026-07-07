package com.luck.picture.lib.entity;

/* loaded from: /tmp/dex/classes2.dex */
public class LocalMediaFolder implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.luck.picture.lib.entity.LocalMediaFolder> CREATOR = new android.os.Parcelable.Creator<com.luck.picture.lib.entity.LocalMediaFolder>() { // from class: com.luck.picture.lib.entity.LocalMediaFolder.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.luck.picture.lib.entity.LocalMediaFolder createFromParcel(android.os.Parcel parcel) {
            return new com.luck.picture.lib.entity.LocalMediaFolder(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.luck.picture.lib.entity.LocalMediaFolder[] newArray(int i) {
            return new com.luck.picture.lib.entity.LocalMediaFolder[i];
        }
    };
    private long bucketId;
    private int currentDataPage;
    private java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> data;
    private java.lang.String firstImagePath;
    private java.lang.String firstMimeType;
    private java.lang.String folderName;
    private int folderTotalNum;
    private boolean isHasMore;
    private boolean isSelectTag;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LocalMediaFolder() {
        this.bucketId = -1L;
        this.data = new java.util.ArrayList<>();
        this.currentDataPage = 1;
    }

    protected LocalMediaFolder(android.os.Parcel parcel) {
        this.bucketId = -1L;
        this.data = new java.util.ArrayList<>();
        this.currentDataPage = 1;
        this.bucketId = parcel.readLong();
        this.folderName = parcel.readString();
        this.firstImagePath = parcel.readString();
        this.firstMimeType = parcel.readString();
        this.folderTotalNum = parcel.readInt();
        this.isSelectTag = parcel.readByte() != 0;
        this.data = parcel.createTypedArrayList(com.luck.picture.lib.entity.LocalMedia.CREATOR);
        this.currentDataPage = parcel.readInt();
        this.isHasMore = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.bucketId);
        parcel.writeString(this.folderName);
        parcel.writeString(this.firstImagePath);
        parcel.writeString(this.firstMimeType);
        parcel.writeInt(this.folderTotalNum);
        parcel.writeByte(this.isSelectTag ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.data);
        parcel.writeInt(this.currentDataPage);
        parcel.writeByte(this.isHasMore ? (byte) 1 : (byte) 0);
    }

    public java.lang.String getFolderName() {
        return android.text.TextUtils.isEmpty(this.folderName) ? com.google.android.gms.fitness.FitnessActivities.UNKNOWN : this.folderName;
    }

    public void setFolderName(java.lang.String str) {
        this.folderName = str;
    }

    public int getFolderTotalNum() {
        return this.folderTotalNum;
    }

    public void setFolderTotalNum(int i) {
        this.folderTotalNum = i;
    }

    public boolean isSelectTag() {
        return this.isSelectTag;
    }

    public void setSelectTag(boolean z) {
        this.isSelectTag = z;
    }

    public long getBucketId() {
        return this.bucketId;
    }

    public void setBucketId(long j) {
        this.bucketId = j;
    }

    public java.lang.String getFirstImagePath() {
        return this.firstImagePath;
    }

    public void setFirstImagePath(java.lang.String str) {
        this.firstImagePath = str;
    }

    public java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> getData() {
        java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList = this.data;
        return arrayList != null ? arrayList : new java.util.ArrayList<>();
    }

    public void setData(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        this.data = arrayList;
    }

    public int getCurrentDataPage() {
        return this.currentDataPage;
    }

    public void setCurrentDataPage(int i) {
        this.currentDataPage = i;
    }

    public boolean isHasMore() {
        return this.isHasMore;
    }

    public void setHasMore(boolean z) {
        this.isHasMore = z;
    }

    public java.lang.String getFirstMimeType() {
        return this.firstMimeType;
    }

    public void setFirstMimeType(java.lang.String str) {
        this.firstMimeType = str;
    }
}
