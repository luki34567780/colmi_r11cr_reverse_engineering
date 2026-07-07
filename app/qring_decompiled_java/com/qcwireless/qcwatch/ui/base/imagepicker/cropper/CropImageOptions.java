package com.qcwireless.qcwatch.ui.base.imagepicker.cropper;

/* loaded from: /tmp/dex/classes2.dex */
public class CropImageOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions> CREATOR = new android.os.Parcelable.Creator<com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions>() { // from class: com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions createFromParcel(android.os.Parcel in) {
            return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions[] newArray(int size) {
            return new com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageOptions[size];
        }
    };
    public int activityMenuIconColor;
    public java.lang.String activityTitle;
    public boolean allowCounterRotation;
    public boolean allowRotation;
    public int aspectRatioX;
    public int aspectRatioY;
    public boolean autoZoomEnabled;
    public int backgroundColor;
    public int borderCornerColor;
    public float borderCornerLength;
    public float borderCornerOffset;
    public float borderCornerThickness;
    public int borderLineColor;
    public float borderLineThickness;
    public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape cropShape;
    public boolean fixAspectRatio;
    public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines guidelines;
    public int guidelinesColor;
    public float guidelinesThickness;
    public float initialCropWindowPaddingRatio;
    public android.graphics.Rect initialCropWindowRectangle;
    public int initialRotation;
    public int maxCropResultHeight;
    public int maxCropResultWidth;
    public int maxZoom;
    public int minCropResultHeight;
    public int minCropResultWidth;
    public int minCropWindowHeight;
    public int minCropWindowWidth;
    public boolean multiTouchEnabled;
    public boolean noOutputImage;
    public android.graphics.Bitmap.CompressFormat outputCompressFormat;
    public int outputCompressQuality;
    public int outputRequestHeight;
    public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions outputRequestSizeOptions;
    public int outputRequestWidth;
    public android.net.Uri outputUri;
    public int rotationDegrees;
    public com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.ScaleType scaleType;
    public boolean showCropOverlay;
    public boolean showProgressBar;
    public float snapRadius;
    public float touchRadius;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CropImageOptions() {
        android.util.DisplayMetrics displayMetrics = android.content.res.Resources.getSystem().getDisplayMetrics();
        this.cropShape = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape.RECTANGLE;
        this.snapRadius = android.util.TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.touchRadius = android.util.TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.guidelines = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines.ON_TOUCH;
        this.scaleType = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.ScaleType.FIT_CENTER;
        this.showCropOverlay = true;
        this.showProgressBar = true;
        this.autoZoomEnabled = true;
        this.multiTouchEnabled = false;
        this.maxZoom = 4;
        this.initialCropWindowPaddingRatio = 0.1f;
        this.fixAspectRatio = false;
        this.aspectRatioX = 1;
        this.aspectRatioY = 1;
        this.borderLineThickness = android.util.TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.borderLineColor = android.graphics.Color.argb(170, 255, 255, 255);
        this.borderCornerThickness = android.util.TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.borderCornerOffset = android.util.TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.borderCornerLength = android.util.TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.borderCornerColor = -1;
        this.guidelinesThickness = android.util.TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.guidelinesColor = android.graphics.Color.argb(170, 255, 255, 255);
        this.backgroundColor = android.graphics.Color.argb(58, 0, 0, 0);
        this.minCropWindowWidth = (int) android.util.TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.minCropWindowHeight = (int) android.util.TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.minCropResultWidth = 40;
        this.minCropResultHeight = 40;
        this.maxCropResultWidth = 99999;
        this.maxCropResultHeight = 99999;
        this.activityTitle = "";
        this.activityMenuIconColor = 0;
        this.outputUri = android.net.Uri.EMPTY;
        this.outputCompressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
        this.outputCompressQuality = 90;
        this.outputRequestWidth = 0;
        this.outputRequestHeight = 0;
        this.outputRequestSizeOptions = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.NONE;
        this.noOutputImage = false;
        this.initialCropWindowRectangle = null;
        this.initialRotation = -1;
        this.allowRotation = true;
        this.allowCounterRotation = false;
        this.rotationDegrees = 90;
    }

    protected CropImageOptions(android.os.Parcel in) {
        this.cropShape = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.CropShape.values()[in.readInt()];
        this.snapRadius = in.readFloat();
        this.touchRadius = in.readFloat();
        this.guidelines = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.Guidelines.values()[in.readInt()];
        this.scaleType = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.ScaleType.values()[in.readInt()];
        this.showCropOverlay = in.readByte() != 0;
        this.showProgressBar = in.readByte() != 0;
        this.autoZoomEnabled = in.readByte() != 0;
        this.multiTouchEnabled = in.readByte() != 0;
        this.maxZoom = in.readInt();
        this.initialCropWindowPaddingRatio = in.readFloat();
        this.fixAspectRatio = in.readByte() != 0;
        this.aspectRatioX = in.readInt();
        this.aspectRatioY = in.readInt();
        this.borderLineThickness = in.readFloat();
        this.borderLineColor = in.readInt();
        this.borderCornerThickness = in.readFloat();
        this.borderCornerOffset = in.readFloat();
        this.borderCornerLength = in.readFloat();
        this.borderCornerColor = in.readInt();
        this.guidelinesThickness = in.readFloat();
        this.guidelinesColor = in.readInt();
        this.backgroundColor = in.readInt();
        this.minCropWindowWidth = in.readInt();
        this.minCropWindowHeight = in.readInt();
        this.minCropResultWidth = in.readInt();
        this.minCropResultHeight = in.readInt();
        this.maxCropResultWidth = in.readInt();
        this.maxCropResultHeight = in.readInt();
        this.activityTitle = in.readString();
        this.activityMenuIconColor = in.readInt();
        this.outputUri = (android.net.Uri) in.readParcelable(android.net.Uri.class.getClassLoader());
        this.outputCompressFormat = android.graphics.Bitmap.CompressFormat.valueOf(in.readString());
        this.outputCompressQuality = in.readInt();
        this.outputRequestWidth = in.readInt();
        this.outputRequestHeight = in.readInt();
        this.outputRequestSizeOptions = com.qcwireless.qcwatch.ui.base.imagepicker.cropper.CropImageView.RequestSizeOptions.values()[in.readInt()];
        this.noOutputImage = in.readByte() != 0;
        this.initialCropWindowRectangle = (android.graphics.Rect) in.readParcelable(android.graphics.Rect.class.getClassLoader());
        this.initialRotation = in.readInt();
        this.allowRotation = in.readByte() != 0;
        this.allowCounterRotation = in.readByte() != 0;
        this.rotationDegrees = in.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.cropShape.ordinal());
        parcel.writeFloat(this.snapRadius);
        parcel.writeFloat(this.touchRadius);
        parcel.writeInt(this.guidelines.ordinal());
        parcel.writeInt(this.scaleType.ordinal());
        parcel.writeByte(this.showCropOverlay ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showProgressBar ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.autoZoomEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.multiTouchEnabled ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.maxZoom);
        parcel.writeFloat(this.initialCropWindowPaddingRatio);
        parcel.writeByte(this.fixAspectRatio ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.aspectRatioX);
        parcel.writeInt(this.aspectRatioY);
        parcel.writeFloat(this.borderLineThickness);
        parcel.writeInt(this.borderLineColor);
        parcel.writeFloat(this.borderCornerThickness);
        parcel.writeFloat(this.borderCornerOffset);
        parcel.writeFloat(this.borderCornerLength);
        parcel.writeInt(this.borderCornerColor);
        parcel.writeFloat(this.guidelinesThickness);
        parcel.writeInt(this.guidelinesColor);
        parcel.writeInt(this.backgroundColor);
        parcel.writeInt(this.minCropWindowWidth);
        parcel.writeInt(this.minCropWindowHeight);
        parcel.writeInt(this.minCropResultWidth);
        parcel.writeInt(this.minCropResultHeight);
        parcel.writeInt(this.maxCropResultWidth);
        parcel.writeInt(this.maxCropResultHeight);
        parcel.writeString(this.activityTitle);
        parcel.writeInt(this.activityMenuIconColor);
        parcel.writeParcelable(this.outputUri, i);
        parcel.writeString(this.outputCompressFormat.name());
        parcel.writeInt(this.outputCompressQuality);
        parcel.writeInt(this.outputRequestWidth);
        parcel.writeInt(this.outputRequestHeight);
        parcel.writeInt(this.outputRequestSizeOptions.ordinal());
        parcel.writeInt(this.noOutputImage ? 1 : 0);
        parcel.writeParcelable(this.initialCropWindowRectangle, i);
        parcel.writeInt(this.initialRotation);
        parcel.writeByte(this.allowRotation ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.allowCounterRotation ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.rotationDegrees);
    }

    public void validate() {
        if (this.maxZoom < 0) {
            throw new java.lang.IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (this.touchRadius < 0.0f) {
            throw new java.lang.IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        float f = this.initialCropWindowPaddingRatio;
        if (f < 0.0f || f >= 0.5d) {
            throw new java.lang.IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (this.aspectRatioX <= 0) {
            throw new java.lang.IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.aspectRatioY <= 0) {
            throw new java.lang.IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.borderLineThickness < 0.0f) {
            throw new java.lang.IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (this.borderCornerThickness < 0.0f) {
            throw new java.lang.IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (this.guidelinesThickness < 0.0f) {
            throw new java.lang.IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (this.minCropWindowHeight < 0) {
            throw new java.lang.IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        int i = this.minCropResultWidth;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        int i2 = this.minCropResultHeight;
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (this.maxCropResultWidth < i) {
            throw new java.lang.IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (this.maxCropResultHeight < i2) {
            throw new java.lang.IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (this.outputRequestWidth < 0) {
            throw new java.lang.IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (this.outputRequestHeight < 0) {
            throw new java.lang.IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        int i3 = this.rotationDegrees;
        if (i3 < 0 || i3 > 360) {
            throw new java.lang.IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }
}
