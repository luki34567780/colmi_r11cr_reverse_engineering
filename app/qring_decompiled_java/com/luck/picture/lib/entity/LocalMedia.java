package com.luck.picture.lib.entity;

/* loaded from: /tmp/dex/classes2.dex */
public class LocalMedia implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.luck.picture.lib.entity.LocalMedia> CREATOR = new android.os.Parcelable.Creator<com.luck.picture.lib.entity.LocalMedia>() { // from class: com.luck.picture.lib.entity.LocalMedia.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.luck.picture.lib.entity.LocalMedia createFromParcel(android.os.Parcel parcel) {
            return new com.luck.picture.lib.entity.LocalMedia(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.luck.picture.lib.entity.LocalMedia[] newArray(int i) {
            return new com.luck.picture.lib.entity.LocalMedia[i];
        }
    };
    private static com.luck.picture.lib.obj.pool.ObjectPools.SynchronizedPool<com.luck.picture.lib.entity.LocalMedia> sPool;
    private long bucketId;
    private int chooseModel;
    private com.luck.picture.lib.entity.LocalMedia compareLocalMedia;
    private java.lang.String compressPath;
    private boolean compressed;
    private int cropImageHeight;
    private int cropImageWidth;
    private int cropOffsetX;
    private int cropOffsetY;
    private float cropResultAspectRatio;
    private java.lang.String customData;
    private java.lang.String cutPath;
    private long dateAddedTime;
    private long duration;
    private java.lang.String fileName;
    private int height;
    private long id;
    private boolean isCameraSource;
    private boolean isChecked;
    private boolean isCut;
    private boolean isEditorImage;
    private boolean isGalleryEnabledMask;
    private boolean isMaxSelectEnabledMask;
    private boolean isOriginal;
    private java.lang.String mimeType;
    private int num;
    private java.lang.String originalPath;
    private java.lang.String parentFolderName;
    private java.lang.String path;
    public int position;
    private java.lang.String realPath;
    private java.lang.String sandboxPath;
    private long size;
    private java.lang.String videoThumbnailPath;
    private java.lang.String watermarkPath;
    private int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LocalMedia() {
        this.bucketId = -1L;
    }

    protected LocalMedia(android.os.Parcel parcel) {
        this.bucketId = -1L;
        this.id = parcel.readLong();
        this.path = parcel.readString();
        this.realPath = parcel.readString();
        this.originalPath = parcel.readString();
        this.compressPath = parcel.readString();
        this.cutPath = parcel.readString();
        this.watermarkPath = parcel.readString();
        this.videoThumbnailPath = parcel.readString();
        this.sandboxPath = parcel.readString();
        this.duration = parcel.readLong();
        this.isChecked = parcel.readByte() != 0;
        this.isCut = parcel.readByte() != 0;
        this.position = parcel.readInt();
        this.num = parcel.readInt();
        this.mimeType = parcel.readString();
        this.chooseModel = parcel.readInt();
        this.isCameraSource = parcel.readByte() != 0;
        this.compressed = parcel.readByte() != 0;
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.cropImageWidth = parcel.readInt();
        this.cropImageHeight = parcel.readInt();
        this.cropOffsetX = parcel.readInt();
        this.cropOffsetY = parcel.readInt();
        this.cropResultAspectRatio = parcel.readFloat();
        this.size = parcel.readLong();
        this.isOriginal = parcel.readByte() != 0;
        this.fileName = parcel.readString();
        this.parentFolderName = parcel.readString();
        this.bucketId = parcel.readLong();
        this.dateAddedTime = parcel.readLong();
        this.customData = parcel.readString();
        this.isMaxSelectEnabledMask = parcel.readByte() != 0;
        this.isGalleryEnabledMask = parcel.readByte() != 0;
        this.isEditorImage = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.path);
        parcel.writeString(this.realPath);
        parcel.writeString(this.originalPath);
        parcel.writeString(this.compressPath);
        parcel.writeString(this.cutPath);
        parcel.writeString(this.watermarkPath);
        parcel.writeString(this.videoThumbnailPath);
        parcel.writeString(this.sandboxPath);
        parcel.writeLong(this.duration);
        parcel.writeByte(this.isChecked ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isCut ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.position);
        parcel.writeInt(this.num);
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.chooseModel);
        parcel.writeByte(this.isCameraSource ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.compressed ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.cropImageWidth);
        parcel.writeInt(this.cropImageHeight);
        parcel.writeInt(this.cropOffsetX);
        parcel.writeInt(this.cropOffsetY);
        parcel.writeFloat(this.cropResultAspectRatio);
        parcel.writeLong(this.size);
        parcel.writeByte(this.isOriginal ? (byte) 1 : (byte) 0);
        parcel.writeString(this.fileName);
        parcel.writeString(this.parentFolderName);
        parcel.writeLong(this.bucketId);
        parcel.writeLong(this.dateAddedTime);
        parcel.writeString(this.customData);
        parcel.writeByte(this.isMaxSelectEnabledMask ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isGalleryEnabledMask ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isEditorImage ? (byte) 1 : (byte) 0);
    }

    public static com.luck.picture.lib.entity.LocalMedia generateHttpAsLocalMedia(java.lang.String str) {
        com.luck.picture.lib.entity.LocalMedia create = create();
        create.setPath(str);
        create.setMimeType(com.luck.picture.lib.utils.MediaUtils.getMimeTypeFromMediaHttpUrl(str));
        return create;
    }

    public static com.luck.picture.lib.entity.LocalMedia generateHttpAsLocalMedia(java.lang.String str, java.lang.String str2) {
        com.luck.picture.lib.entity.LocalMedia create = create();
        create.setPath(str);
        create.setMimeType(str2);
        return create;
    }

    public static com.luck.picture.lib.entity.LocalMedia generateLocalMedia(android.content.Context context, java.lang.String str) {
        com.luck.picture.lib.entity.LocalMedia create = create();
        java.io.File file = com.luck.picture.lib.config.PictureMimeType.isContent(str) ? new java.io.File(com.luck.picture.lib.utils.PictureFileUtils.getPath(context, android.net.Uri.parse(str))) : new java.io.File(str);
        create.setPath(str);
        create.setRealPath(file.getAbsolutePath());
        create.setFileName(file.getName());
        create.setParentFolderName(com.luck.picture.lib.utils.MediaUtils.generateCameraFolderName(file.getAbsolutePath()));
        create.setMimeType(com.luck.picture.lib.utils.MediaUtils.getMimeTypeFromMediaUrl(file.getAbsolutePath()));
        create.setSize(file.length());
        create.setDateAddedTime(file.lastModified() / 1000);
        java.lang.String absolutePath = file.getAbsolutePath();
        if (absolutePath.contains("Android/data/") || absolutePath.contains("data/user/")) {
            create.setId(java.lang.System.currentTimeMillis());
            create.setBucketId(file.getParentFile() != null ? r1.getName().hashCode() : 0L);
        } else {
            java.lang.Long[] pathMediaBucketId = com.luck.picture.lib.utils.MediaUtils.getPathMediaBucketId(context, create.getRealPath());
            create.setId(pathMediaBucketId[0].longValue() == 0 ? java.lang.System.currentTimeMillis() : pathMediaBucketId[0].longValue());
            create.setBucketId(pathMediaBucketId[1].longValue());
        }
        if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(create.getMimeType())) {
            com.luck.picture.lib.entity.MediaExtraInfo videoSize = com.luck.picture.lib.utils.MediaUtils.getVideoSize(context, str);
            create.setWidth(videoSize.getWidth());
            create.setHeight(videoSize.getHeight());
            create.setDuration(videoSize.getDuration());
        } else if (com.luck.picture.lib.config.PictureMimeType.isHasAudio(create.getMimeType())) {
            create.setDuration(com.luck.picture.lib.utils.MediaUtils.getAudioSize(context, str).getDuration());
        } else {
            com.luck.picture.lib.entity.MediaExtraInfo imageSize = com.luck.picture.lib.utils.MediaUtils.getImageSize(context, str);
            create.setWidth(imageSize.getWidth());
            create.setHeight(imageSize.getHeight());
        }
        return create;
    }

    @java.lang.Deprecated
    public static com.luck.picture.lib.entity.LocalMedia generateLocalMedia(java.lang.String str, java.lang.String str2) {
        com.luck.picture.lib.entity.LocalMedia create = create();
        create.setPath(str);
        create.setMimeType(str2);
        return create;
    }

    public static com.luck.picture.lib.entity.LocalMedia create() {
        return new com.luck.picture.lib.entity.LocalMedia();
    }

    public com.luck.picture.lib.entity.LocalMedia getCompareLocalMedia() {
        return this.compareLocalMedia;
    }

    public boolean equals(java.lang.Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.luck.picture.lib.entity.LocalMedia)) {
            return false;
        }
        com.luck.picture.lib.entity.LocalMedia localMedia = (com.luck.picture.lib.entity.LocalMedia) obj;
        if (!android.text.TextUtils.equals(getPath(), localMedia.getPath()) && !android.text.TextUtils.equals(getRealPath(), localMedia.getRealPath()) && getId() != localMedia.getId()) {
            z = false;
        }
        if (!z) {
            localMedia = null;
        }
        this.compareLocalMedia = localMedia;
        return z;
    }

    public java.lang.String getAvailablePath() {
        java.lang.String path = getPath();
        if (isCut()) {
            path = getCutPath();
        }
        if (isCompressed()) {
            path = getCompressPath();
        }
        if (isToSandboxPath()) {
            path = getSandboxPath();
        }
        if (isOriginal()) {
            path = getOriginalPath();
        }
        return isWatermarkPath() ? getWatermarkPath() : path;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        this.id = j;
    }

    public java.lang.String getPath() {
        return this.path;
    }

    public void setPath(java.lang.String str) {
        this.path = str;
    }

    public java.lang.String getRealPath() {
        return this.realPath;
    }

    public void setRealPath(java.lang.String str) {
        this.realPath = str;
    }

    public java.lang.String getOriginalPath() {
        return this.originalPath;
    }

    public void setOriginalPath(java.lang.String str) {
        this.originalPath = str;
    }

    public java.lang.String getCompressPath() {
        return this.compressPath;
    }

    public void setCompressPath(java.lang.String str) {
        this.compressPath = str;
    }

    public java.lang.String getCutPath() {
        return this.cutPath;
    }

    public void setCutPath(java.lang.String str) {
        this.cutPath = str;
    }

    public java.lang.String getSandboxPath() {
        return this.sandboxPath;
    }

    public void setSandboxPath(java.lang.String str) {
        this.sandboxPath = str;
    }

    public long getDuration() {
        return this.duration;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setChecked(boolean z) {
        this.isChecked = z;
    }

    public boolean isCut() {
        return this.isCut && !android.text.TextUtils.isEmpty(getCutPath());
    }

    public void setCut(boolean z) {
        this.isCut = z;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int i) {
        this.num = i;
    }

    public java.lang.String getMimeType() {
        return this.mimeType;
    }

    public void setMimeType(java.lang.String str) {
        this.mimeType = str;
    }

    public int getChooseModel() {
        return this.chooseModel;
    }

    public void setChooseModel(int i) {
        this.chooseModel = i;
    }

    public boolean isCameraSource() {
        return this.isCameraSource;
    }

    public void setCameraSource(boolean z) {
        this.isCameraSource = z;
    }

    public boolean isCompressed() {
        return this.compressed && !android.text.TextUtils.isEmpty(getCompressPath());
    }

    public void setCompressed(boolean z) {
        this.compressed = z;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public int getCropImageWidth() {
        return this.cropImageWidth;
    }

    public void setCropImageWidth(int i) {
        this.cropImageWidth = i;
    }

    public int getCropImageHeight() {
        return this.cropImageHeight;
    }

    public void setCropImageHeight(int i) {
        this.cropImageHeight = i;
    }

    public int getCropOffsetX() {
        return this.cropOffsetX;
    }

    public void setCropOffsetX(int i) {
        this.cropOffsetX = i;
    }

    public int getCropOffsetY() {
        return this.cropOffsetY;
    }

    public void setCropOffsetY(int i) {
        this.cropOffsetY = i;
    }

    public float getCropResultAspectRatio() {
        return this.cropResultAspectRatio;
    }

    public void setCropResultAspectRatio(float f) {
        this.cropResultAspectRatio = f;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public boolean isOriginal() {
        return this.isOriginal && !android.text.TextUtils.isEmpty(getOriginalPath());
    }

    public void setOriginal(boolean z) {
        this.isOriginal = z;
    }

    public java.lang.String getFileName() {
        return this.fileName;
    }

    public void setFileName(java.lang.String str) {
        this.fileName = str;
    }

    public java.lang.String getParentFolderName() {
        return this.parentFolderName;
    }

    public void setParentFolderName(java.lang.String str) {
        this.parentFolderName = str;
    }

    public long getBucketId() {
        return this.bucketId;
    }

    public void setBucketId(long j) {
        this.bucketId = j;
    }

    public boolean isMaxSelectEnabledMask() {
        return this.isMaxSelectEnabledMask;
    }

    public void setMaxSelectEnabledMask(boolean z) {
        this.isMaxSelectEnabledMask = z;
    }

    public boolean isEditorImage() {
        return this.isEditorImage && !android.text.TextUtils.isEmpty(getCutPath());
    }

    public void setEditorImage(boolean z) {
        this.isEditorImage = z;
    }

    public long getDateAddedTime() {
        return this.dateAddedTime;
    }

    public void setDateAddedTime(long j) {
        this.dateAddedTime = j;
    }

    public java.lang.String getCustomData() {
        return this.customData;
    }

    public void setCustomData(java.lang.String str) {
        this.customData = str;
    }

    public boolean isToSandboxPath() {
        return !android.text.TextUtils.isEmpty(getSandboxPath());
    }

    public boolean isWatermarkPath() {
        return !android.text.TextUtils.isEmpty(getWatermarkPath());
    }

    public boolean isGalleryEnabledMask() {
        return this.isGalleryEnabledMask;
    }

    public void setGalleryEnabledMask(boolean z) {
        this.isGalleryEnabledMask = z;
    }

    public java.lang.String getWatermarkPath() {
        return this.watermarkPath;
    }

    public void setWatermarkPath(java.lang.String str) {
        this.watermarkPath = str;
    }

    public java.lang.String getVideoThumbnailPath() {
        return this.videoThumbnailPath;
    }

    public void setVideoThumbnailPath(java.lang.String str) {
        this.videoThumbnailPath = str;
    }

    public static com.luck.picture.lib.entity.LocalMedia obtain() {
        if (sPool == null) {
            sPool = new com.luck.picture.lib.obj.pool.ObjectPools.SynchronizedPool<>();
        }
        com.luck.picture.lib.entity.LocalMedia acquire = sPool.acquire();
        return acquire == null ? create() : acquire;
    }

    public void recycle() {
        com.luck.picture.lib.obj.pool.ObjectPools.SynchronizedPool<com.luck.picture.lib.entity.LocalMedia> synchronizedPool = sPool;
        if (synchronizedPool != null) {
            synchronizedPool.release(this);
        }
    }

    public static void destroyPool() {
        com.luck.picture.lib.obj.pool.ObjectPools.SynchronizedPool<com.luck.picture.lib.entity.LocalMedia> synchronizedPool = sPool;
        if (synchronizedPool != null) {
            synchronizedPool.destroy();
            sPool = null;
        }
    }
}
