package com.qcwireless.qcwatch.ui.plate.diy;

/* compiled from: DiyWatchFaceViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0002@AB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020!H\u0002J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020'J\u000e\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020!J\u0016\u00100\u001a\u00020'2\u0006\u0010/\u001a\u00020!2\u0006\u00101\u001a\u00020!J \u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020!H\u0002J\u0016\u00107\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020!J\u000e\u00108\u001a\u0002032\u0006\u00109\u001a\u000203J\u0016\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020\u00062\u0006\u0010)\u001a\u00020!J\u000e\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020\u000eJ\u000e\u0010>\u001a\u00020'2\u0006\u0010=\u001a\u00020\u000eJ\u000e\u0010?\u001a\u00020'2\u0006\u0010=\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00128F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006B"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/diy/DiyWatchFaceViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "watchFaceRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceRepository;)V", "FILE_NAME", "", "_localPics", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/CustomFaceEntity;", "_uiProgressState", "Lcom/qcwireless/qcwatch/ui/plate/diy/DiyWatchFaceViewModel$ProgressUI;", "_uiState", "Lcom/qcwireless/qcwatch/ui/plate/bean/DiyWatchFaceSettingBean;", "callback", "Lcom/qcwireless/qcwatch/ui/plate/diy/DiyWatchFaceViewModel$Callback;", "localPics", "Landroidx/lifecycle/LiveData;", "getLocalPics", "()Landroidx/lifecycle/LiveData;", "needleList", "", "Lcom/qcwireless/qcwatch/ui/plate/bean/WatchFaceTag;", "getNeedleList", "()Ljava/util/List;", "tagList", "getTagList", "uiProgressState", "getUiProgressState", "uiState", "getUiState", "zoom", "", "getZoom", "()I", "setZoom", "(I)V", "customDeviceWatchFace", "", "hwVersion", "width", "customToDevice", "imageArray", "", "customizePicFromLocal", "initData", "type", "initNeedle", "total", "makeRectWithCornerAndLight", "Landroid/graphics/Bitmap;", "sourceImg", "light", "corner", "makeRoundAndLight", "makeRoundCorner", "bitmap", "queryDiySetting", "mac", "saveImageAndSendToDevice", "watchFaceSettingBean", "saveLightAndDataType", "saveSetting", "Callback", "ProgressUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DiyWatchFaceViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final java.lang.String FILE_NAME;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity>> _localPics;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.ProgressUI> _uiProgressState;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean> _uiState;
    private final com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.Callback callback;
    private final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag> needleList;
    private final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag> tagList;
    private final com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository;
    private int zoom;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: saveLightAndDataType$lambda-0, reason: not valid java name */
    public static final void m1381saveLightAndDataType$lambda0(com.oudmon.ble.base.communication.rsp.DisplayTimeRsp displayTimeRsp) {
    }

    public DiyWatchFaceViewModel(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFaceRepository, "watchFaceRepository");
        this.watchFaceRepository = watchFaceRepository;
        this.FILE_NAME = "time2_bg_img.ui";
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._uiProgressState = new androidx.lifecycle.MutableLiveData<>();
        this._localPics = new androidx.lifecycle.MutableLiveData<>();
        this.tagList = new java.util.ArrayList();
        this.needleList = new java.util.ArrayList();
        this.callback = new com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.Callback();
        this.zoom = 2;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.ProgressUI> getUiProgressState() {
        return this._uiProgressState;
    }

    public final androidx.lifecycle.LiveData<java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.CustomFaceEntity>> getLocalPics() {
        return this._localPics;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag> getTagList() {
        return this.tagList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag> getNeedleList() {
        return this.needleList;
    }

    public final int getZoom() {
        return this.zoom;
    }

    public final void setZoom(int i) {
        this.zoom = i;
    }

    public final void initNeedle(int type, int total) {
        this.needleList.clear();
        if (total == 1) {
            if (type == 1) {
                this.needleList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_4512), true));
                return;
            } else {
                this.needleList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_4512), false));
                return;
            }
        }
        if (1 > total) {
            return;
        }
        int i = 1;
        while (true) {
            if (type == 1) {
                this.needleList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_4512), true));
            } else {
                this.needleList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_4512), false));
                if (type == i) {
                    java.util.List<com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag> list = this.needleList;
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String format = java.lang.String.format(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_4511), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                    list.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(format, true));
                } else {
                    java.util.List<com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag> list2 = this.needleList;
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String format2 = java.lang.String.format(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_4511), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
                    list2.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(format2, false));
                }
            }
            if (i == total) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void initData(int type) {
        this.tagList.clear();
        if (type == 1) {
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_131), true));
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_171), false));
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_17), false));
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_85), false));
            return;
        }
        if (type == 2) {
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_131), false));
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_171), true));
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_17), false));
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_85), false));
            return;
        }
        if (type == 3) {
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_131), false));
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_171), false));
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_17), true));
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_85), false));
            return;
        }
        if (type == 4) {
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_131), false));
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_171), false));
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_17), false));
            this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_85), true));
            return;
        }
        this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_131), false));
        this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_171), false));
        this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_17), false));
        this.tagList.add(new com.qcwireless.qcwatch.ui.plate.bean.WatchFaceTag(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_85), false));
    }

    public final void saveImageAndSendToDevice(com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean watchFaceSettingBean) {
        android.graphics.Bitmap makeRectWithCornerAndLight;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFaceSettingBean, "watchFaceSettingBean");
        saveLightAndDataType(watchFaceSettingBean);
        this.watchFaceRepository.saveWatchFaceSetting(watchFaceSettingBean);
        if (android.text.TextUtils.isEmpty(watchFaceSettingBean.getLocalImageUrl())) {
            return;
        }
        android.graphics.Bitmap scaleBitmap = com.qcwireless.qcwatch.ui.plate.util.ImageUtils.scaleBitmap(android.graphics.BitmapFactory.decodeFile(watchFaceSettingBean.getLocalImageUrl()), watchFaceSettingBean.getWatchWidth(), watchFaceSettingBean.getWatchHeight());
        int picLight = watchFaceSettingBean.getPicLight();
        if (picLight >= 90) {
            picLight = 90;
        }
        if (scaleBitmap != null) {
            if (watchFaceSettingBean.getWatchScreenType() == 2) {
                makeRectWithCornerAndLight = makeRoundAndLight(scaleBitmap, picLight);
            } else {
                makeRectWithCornerAndLight = makeRectWithCornerAndLight(scaleBitmap, picLight, watchFaceSettingBean.getRadius());
            }
            byte[] rgb565ByteArray = com.qcwireless.qcwatch.ui.plate.util.ImageUtils.getRgb565ByteArray(makeRectWithCornerAndLight, watchFaceSettingBean.getWatchWidth() / this.zoom, watchFaceSettingBean.getWatchHeight() / this.zoom);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rgb565ByteArray, "getRgb565ByteArray(\n    …oom\n                    )");
            customToDevice(rgb565ByteArray);
        }
    }

    public final void saveLightAndDataType(com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean watchFaceSettingBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFaceSettingBean, "watchFaceSettingBean");
        this.watchFaceRepository.saveWatchFaceSetting(watchFaceSettingBean);
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.DisplayTimeReq.getWriteInstance(0, watchFaceSettingBean.getDataType(), 100 - watchFaceSettingBean.getPicLight(), watchFaceSettingBean.getTotalNeedle(), watchFaceSettingBean.getCurrNeed()), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.m1381saveLightAndDataType$lambda0((com.oudmon.ble.base.communication.rsp.DisplayTimeRsp) baseRspCmd);
            }
        });
    }

    public final android.graphics.Bitmap makeRoundAndLight(android.graphics.Bitmap sourceImg, int light) {
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceImg, "sourceImg");
        int width = sourceImg.getWidth() * sourceImg.getHeight();
        int[] iArr = new int[width];
        sourceImg.getPixels(iArr, 0, sourceImg.getWidth(), 0, 0, sourceImg.getWidth(), sourceImg.getHeight());
        for (int i5 = 0; i5 < width; i5++) {
            iArr[i5] = (((((iArr[i5] >> 0) & 255) * light) / 100) << 0) | (iArr[i5] & (-16777216)) | (((((iArr[i5] >> 8) & 255) * light) / 100) << 8) | (((((iArr[i5] >> 16) & 255) * light) / 100) << 16);
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(iArr, sourceImg.getWidth(), sourceImg.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        int width2 = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        float f2 = height / 2;
        if (width2 > height) {
            i4 = (width2 - height) / 2;
            i2 = height;
            i = i4 + height;
            f = f2;
            i3 = 0;
        } else {
            if (height > width2) {
                i3 = (height - width2) / 2;
                f = width2 / 2;
                i = width2;
                i2 = i3 + width2;
            } else {
                i = width2;
                i2 = height;
                f = f2;
                i3 = 0;
            }
            i4 = 0;
        }
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(width2, height, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap2);
        android.graphics.Paint paint = new android.graphics.Paint();
        android.graphics.Rect rect = new android.graphics.Rect(i4, i3, i, i2);
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(createBitmap, rect, rect, paint);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap2, "output");
        return createBitmap2;
    }

    private final android.graphics.Bitmap makeRectWithCornerAndLight(android.graphics.Bitmap sourceImg, int light, int corner) {
        int width = sourceImg.getWidth() * sourceImg.getHeight();
        int[] iArr = new int[width];
        sourceImg.getPixels(iArr, 0, sourceImg.getWidth(), 0, 0, sourceImg.getWidth(), sourceImg.getHeight());
        for (int i = 0; i < width; i++) {
            iArr[i] = (((((iArr[i] >> 0) & 255) * light) / 100) << 0) | (iArr[i] & (-16777216)) | (((((iArr[i] >> 8) & 255) * light) / 100) << 8) | (((((iArr[i] >> 16) & 255) * light) / 100) << 16);
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(iArr, sourceImg.getWidth(), sourceImg.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        int width2 = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(width2, height, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap2);
        android.graphics.Paint paint = new android.graphics.Paint();
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, width2, height);
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        float f = corner;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(createBitmap, rect, rect, paint);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap2, "output");
        return createBitmap2;
    }

    public final android.graphics.Bitmap makeRoundCorner(android.graphics.Bitmap bitmap) {
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = height / 2;
        if (width > height) {
            i4 = (width - height) / 2;
            i2 = height;
            i = i4 + height;
            f = f2;
            i3 = 0;
        } else {
            if (height > width) {
                i3 = (height - width) / 2;
                f = width / 2;
                i = width;
                i2 = i3 + width;
            } else {
                i = width;
                i2 = height;
                f = f2;
                i3 = 0;
            }
            i4 = 0;
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        android.graphics.Rect rect = new android.graphics.Rect(i4, i3, i, i2);
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "output");
        return createBitmap;
    }

    public final void saveSetting(com.qcwireless.qcwatch.ui.plate.bean.DiyWatchFaceSettingBean watchFaceSettingBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFaceSettingBean, "watchFaceSettingBean");
        com.oudmon.ble.base.communication.bigData.CustomWatchFaceEntity customWatchFaceEntity = new com.oudmon.ble.base.communication.bigData.CustomWatchFaceEntity();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.oudmon.ble.base.communication.bigData.CustomWatchFaceEntity.CustomElement customElement = new com.oudmon.ble.base.communication.bigData.CustomWatchFaceEntity.CustomElement();
        customElement.setType(1);
        int hourLeft = watchFaceSettingBean.getHourLeft() / this.zoom;
        int hourTop = watchFaceSettingBean.getHourTop() / this.zoom;
        if (hourLeft < watchFaceSettingBean.getToDevicePx()) {
            hourLeft = watchFaceSettingBean.getToDevicePx();
            watchFaceSettingBean.setHourLeft(this.zoom * hourLeft);
        }
        if (hourTop < watchFaceSettingBean.getToDevicePx()) {
            hourTop = watchFaceSettingBean.getToDevicePx();
            watchFaceSettingBean.setHourTop(this.zoom * hourTop);
        }
        customElement.setX(hourLeft);
        customElement.setY(hourTop);
        customElement.setR(android.graphics.Color.red(watchFaceSettingBean.getTextColor()));
        customElement.setG(android.graphics.Color.green(watchFaceSettingBean.getTextColor()));
        customElement.setB(android.graphics.Color.blue(watchFaceSettingBean.getTextColor()));
        arrayList.add(customElement);
        com.oudmon.ble.base.communication.bigData.CustomWatchFaceEntity.CustomElement customElement2 = new com.oudmon.ble.base.communication.bigData.CustomWatchFaceEntity.CustomElement();
        customElement2.setType(2);
        int batteryLeft = watchFaceSettingBean.getBatteryLeft() / this.zoom;
        int batteryTop = watchFaceSettingBean.getBatteryTop() / this.zoom;
        if (batteryLeft < watchFaceSettingBean.getToDevicePx()) {
            batteryLeft = watchFaceSettingBean.getToDevicePx();
            watchFaceSettingBean.setBatteryLeft(this.zoom * batteryLeft);
        }
        if (batteryTop < watchFaceSettingBean.getToDevicePx()) {
            batteryTop = watchFaceSettingBean.getToDevicePx();
            watchFaceSettingBean.setBatteryHeight(this.zoom * batteryTop);
        }
        customElement2.setX(batteryLeft);
        customElement2.setY(batteryTop);
        customElement2.setR(android.graphics.Color.red(watchFaceSettingBean.getTextColor()));
        customElement2.setG(android.graphics.Color.green(watchFaceSettingBean.getTextColor()));
        customElement2.setB(android.graphics.Color.blue(watchFaceSettingBean.getTextColor()));
        arrayList.add(customElement2);
        com.oudmon.ble.base.communication.bigData.CustomWatchFaceEntity.CustomElement customElement3 = new com.oudmon.ble.base.communication.bigData.CustomWatchFaceEntity.CustomElement();
        customElement3.setType(3);
        int dataLeft = watchFaceSettingBean.getDataLeft() / this.zoom;
        int dataTop = watchFaceSettingBean.getDataTop() / this.zoom;
        if (dataLeft < watchFaceSettingBean.getToDevicePx()) {
            dataLeft = watchFaceSettingBean.getToDevicePx();
            watchFaceSettingBean.setDataLeft(this.zoom * dataLeft);
        }
        if (dataTop < watchFaceSettingBean.getToDevicePx()) {
            dataTop = watchFaceSettingBean.getToDevicePx();
            watchFaceSettingBean.setDataHeight(this.zoom * dataTop);
        }
        customElement3.setX(dataLeft);
        customElement3.setY(dataTop);
        customElement3.setR(android.graphics.Color.red(watchFaceSettingBean.getTextColor()));
        customElement3.setG(android.graphics.Color.green(watchFaceSettingBean.getTextColor()));
        customElement3.setB(android.graphics.Color.blue(watchFaceSettingBean.getTextColor()));
        arrayList.add(customElement3);
        customWatchFaceEntity.setData(arrayList);
        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().writeCustomWatch(customWatchFaceEntity);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, watchFaceSettingBean);
        this.watchFaceRepository.saveWatchFaceSetting(watchFaceSettingBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void customDeviceWatchFace(java.lang.String hwVersion, int width) {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel$customDeviceWatchFace$1(this, hwVersion, width, null), 3, (java.lang.Object) null);
    }

    public final void customizePicFromLocal() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel$customizePicFromLocal$1(this, null), 3, (java.lang.Object) null);
    }

    private final void customToDevice(byte[] imageArray) {
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().registerCallback(this.callback);
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().setCurrFileType(2);
        if (com.oudmon.ble.base.communication.file.FileHandle.getInstance().checkData(imageArray)) {
            com.oudmon.ble.base.communication.file.FileHandle.getInstance().cmdFileInit(this.FILE_NAME);
        }
    }

    /* compiled from: DiyWatchFaceViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/diy/DiyWatchFaceViewModel$Callback;", "Lcom/oudmon/ble/base/communication/file/SimpleCallback;", "(Lcom/qcwireless/qcwatch/ui/plate/diy/DiyWatchFaceViewModel;)V", "onComplete", "", "onProgress", "percent", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Callback extends com.oudmon.ble.base.communication.file.SimpleCallback {
        public Callback() {
        }

        @Override // com.oudmon.ble.base.communication.file.SimpleCallback, com.oudmon.ble.base.communication.file.ICallback
        public void onProgress(int percent) {
            if (com.oudmon.ble.base.communication.file.FileHandle.getInstance().getCurrFileType() == 2) {
                com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.this._uiProgressState.postValue(new com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.ProgressUI(percent, false));
                com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(3);
            }
        }

        @Override // com.oudmon.ble.base.communication.file.SimpleCallback, com.oudmon.ble.base.communication.file.ICallback
        public void onComplete() {
            if (com.oudmon.ble.base.communication.file.FileHandle.getInstance().getCurrFileType() == 2) {
                com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.this._uiProgressState.postValue(new com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.ProgressUI(100, true));
                com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
            }
        }
    }

    /* compiled from: DiyWatchFaceViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/diy/DiyWatchFaceViewModel$ProgressUI;", "", "progress", "", "success", "", "(IZ)V", "getProgress", "()I", "setProgress", "(I)V", "getSuccess", "()Z", "component1", "component2", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class ProgressUI {
        private int progress;
        private final boolean success;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.ProgressUI copy$default(com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.ProgressUI progressUI, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = progressUI.progress;
            }
            if ((i2 & 2) != 0) {
                z = progressUI.success;
            }
            return progressUI.copy(i, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getProgress() {
            return this.progress;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public final com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.ProgressUI copy(int progress, boolean success) {
            return new com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.ProgressUI(progress, success);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.ProgressUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.ProgressUI progressUI = (com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel.ProgressUI) other;
            return this.progress == progressUI.progress && this.success == progressUI.success;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int i = this.progress * 31;
            boolean z = this.success;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return i + i2;
        }

        public java.lang.String toString() {
            return "ProgressUI(progress=" + this.progress + ", success=" + this.success + ')';
        }

        public ProgressUI(int i, boolean z) {
            this.progress = i;
            this.success = z;
        }

        public final int getProgress() {
            return this.progress;
        }

        public final void setProgress(int i) {
            this.progress = i;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }

    public final void queryDiySetting(java.lang.String mac, int width) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        launchOnUI(new com.qcwireless.qcwatch.ui.plate.diy.DiyWatchFaceViewModel$queryDiySetting$1(this, mac, width, null));
    }
}
