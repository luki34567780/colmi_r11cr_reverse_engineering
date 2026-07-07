package com.qcwireless.qcwatch.ui.plate.market;

/* compiled from: WatchMarketFragmentViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0003ABCB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u00100\u001a\u000201J\u0010\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0015H\u0002J\u000e\u00104\u001a\u0002012\u0006\u00105\u001a\u00020\u0015J\u000e\u00106\u001a\u0002012\u0006\u00107\u001a\u00020\u001bJ\u000e\u00108\u001a\u0002012\u0006\u00107\u001a\u00020\u001bJ\u000e\u00109\u001a\u0002012\u0006\u00107\u001a\u00020\u001bJ\u0016\u0010:\u001a\u0002012\u0006\u00105\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u0015J\u000e\u0010<\u001a\u0002012\u0006\u00105\u001a\u00020\u0015J\u0006\u0010=\u001a\u000201J\u0006\u0010>\u001a\u000201J\u0006\u0010?\u001a\u000201J\u000e\u0010@\u001a\u0002012\u0006\u00105\u001a\u00020\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00060\u000eR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u00108F¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u00108F¢\u0006\u0006\u001a\u0004\b)\u0010\u0012R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d¨\u0006D"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragmentViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "watchFaceRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceRepository;)V", "_fileDownloadSuccess", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/base/repository/watchface/ListenerBean;", "_marketState", "Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragmentViewModel$WatchMarketUI;", "_progressValue", "Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragmentViewModel$ProgressUI;", "_uiState", "callback", "Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragmentViewModel$Callback;", "fileDownloadSuccess", "Landroidx/lifecycle/LiveData;", "getFileDownloadSuccess", "()Landroidx/lifecycle/LiveData;", "localWatchFace", "", "", "Lcom/qcwireless/qcwatch/ui/plate/bean/DeviceWatchFaceBean;", "getLocalWatchFace", "()Ljava/util/Map;", "marketList", "", "Lcom/qcwireless/qcwatch/ui/plate/bean/MarketWatchFaceBean;", "getMarketList", "()Ljava/util/List;", "marketListBackup", "getMarketListBackup", "marketState", "getMarketState", "progressValue", "getProgressValue", "storeList", "getStoreList", "storeListFromServer", "getStoreListFromServer", "uiState", "getUiState", "watchFaceDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcWatchFaceDao;", "watchList", "getWatchList", "watchListBackUp", "getWatchListBackUp", "checkCustomizeWatchFace", "", "customDeviceWatchFace", "hwVersion", "deleteWatchFaceToDevice", "name", "downloadWatchFaceImageFileNotExists", "item", "downloadWatchFaceNotExists", "downloadWatchFaceNotExistsNotRepeat", "execWatchFaceToDevice", "binPath", "execWatchFaceToDeviceByName", "getMarketWatchFace", "getWatchFaceFromDevice", "initCallback", "queryByName", "Callback", "ProgressUI", "WatchMarketUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WatchMarketFragmentViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.repository.watchface.ListenerBean> _fileDownloadSuccess;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.WatchMarketUI> _marketState;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI> _progressValue;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.WatchMarketUI> _uiState;
    private final com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.Callback callback;
    private final java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean> localWatchFace;
    private final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> marketList;
    private final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> marketListBackup;
    private final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> storeList;
    private final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> storeListFromServer;
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao watchFaceDao;
    private final com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository;
    private final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean> watchList;
    private final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean> watchListBackUp;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadWatchFaceNotExistsNotRepeat$lambda-1, reason: not valid java name */
    public static final void m1420downloadWatchFaceNotExistsNotRepeat$lambda1(long j, long j2) {
    }

    public WatchMarketFragmentViewModel(com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFaceRepository, "watchFaceRepository");
        this.watchFaceRepository = watchFaceRepository;
        this.watchFaceDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcWatchFaceDao();
        this.marketList = new java.util.ArrayList();
        this.marketListBackup = new java.util.ArrayList();
        this.storeList = new java.util.ArrayList();
        this.storeListFromServer = new java.util.ArrayList();
        this.watchList = new java.util.ArrayList();
        this.watchListBackUp = new java.util.ArrayList();
        this.localWatchFace = new java.util.LinkedHashMap();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this.callback = new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.Callback();
        this._progressValue = new androidx.lifecycle.MutableLiveData<>();
        this._marketState = new androidx.lifecycle.MutableLiveData<>();
        this._fileDownloadSuccess = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> getMarketList() {
        return this.marketList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> getMarketListBackup() {
        return this.marketListBackup;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> getStoreList() {
        return this.storeList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> getStoreListFromServer() {
        return this.storeListFromServer;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean> getWatchList() {
        return this.watchList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean> getWatchListBackUp() {
        return this.watchListBackUp;
    }

    public final java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean> getLocalWatchFace() {
        return this.localWatchFace;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.WatchMarketUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI> getProgressValue() {
        return this._progressValue;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.WatchMarketUI> getMarketState() {
        return this._marketState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.repository.watchface.ListenerBean> getFileDownloadSuccess() {
        return this._fileDownloadSuccess;
    }

    public final void getMarketWatchFace() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$getMarketWatchFace$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel watchMarketFragmentViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchMarketFragmentViewModel, "$this$ktxRunOnBgSingle");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                watchFaceRepository = watchMarketFragmentViewModel.watchFaceRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace> queryWatchFaceListByVersion = watchFaceRepository.queryWatchFaceListByVersion();
                if (queryWatchFaceListByVersion != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace : queryWatchFaceListByVersion) {
                        if (watchMarketFragmentViewModel.getLocalWatchFace().get(watchFace.getName()) == null) {
                            arrayList3.add(new com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean(watchFace, 0));
                        }
                    }
                    arrayList.addAll(arrayList3);
                }
                mutableLiveData = watchMarketFragmentViewModel._marketState;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.WatchMarketUI(arrayList, arrayList2));
            }
        });
    }

    public final void downloadWatchFaceImageFileNotExists(com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        this.watchFaceRepository.downloadWatchFaceImageFileNotExists(item);
    }

    public final void downloadWatchFaceNotExists(com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        final java.io.File watchFaceDirFile = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getWatchFaceDirFile();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = item.getWatchFace().getName();
        if (com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.fileExists(watchFaceDirFile.getAbsolutePath() + '/' + ((java.lang.String) objectRef.element))) {
            com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.deleteFile(watchFaceDirFile.getAbsolutePath() + '/' + ((java.lang.String) objectRef.element));
        }
        com.androidnetworking.AndroidNetworking.download(item.getWatchFace().getBinUrl(), watchFaceDirFile.toString(), "temp_" + ((java.lang.String) objectRef.element)).setTag(objectRef.element).setPriority(com.androidnetworking.common.Priority.MEDIUM).build().setDownloadProgressListener(new com.androidnetworking.interfaces.DownloadProgressListener() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$$ExternalSyntheticLambda1
            public final void onProgress(long j, long j2) {
                com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.m1419downloadWatchFaceNotExists$lambda0(j, j2);
            }
        }).startDownload(new com.androidnetworking.interfaces.DownloadListener() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$downloadWatchFaceNotExists$2
            public void onDownloadComplete() {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "temp_" + ((java.lang.String) objectRef.element));
                final kotlin.jvm.internal.Ref.ObjectRef<java.lang.String> objectRef2 = objectRef;
                final com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel watchMarketFragmentViewModel = this;
                final java.io.File file = watchFaceDirFile;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$downloadWatchFaceNotExists$2, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$downloadWatchFaceNotExists$2$onDownloadComplete$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$downloadWatchFaceNotExists$2) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$downloadWatchFaceNotExists$2 watchMarketFragmentViewModel$downloadWatchFaceNotExists$2) {
                        com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao qcWatchFaceDao;
                        com.qcwireless.qcwatch.ui.base.repository.dao.QcWatchFaceDao qcWatchFaceDao2;
                        androidx.lifecycle.MutableLiveData mutableLiveData;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchMarketFragmentViewModel$downloadWatchFaceNotExists$2, "$this$ktxRunOnBgSingle");
                        java.lang.String substringAfter$default = kotlin.text.StringsKt.substringAfter$default((java.lang.String) objectRef2.element, "temp_", (java.lang.String) null, 2, (java.lang.Object) null);
                        com.blankj.utilcode.util.FileUtils.rename(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getWatchFaceDirFile().getAbsolutePath() + "/temp_" + ((java.lang.String) objectRef2.element), substringAfter$default);
                        qcWatchFaceDao = watchMarketFragmentViewModel.watchFaceDao;
                        com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace queryWatchFaceByName = qcWatchFaceDao.queryWatchFaceByName(substringAfter$default, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion());
                        if (queryWatchFaceByName != null) {
                            queryWatchFaceByName.setLocalBinUrl(file.getAbsolutePath() + '/' + substringAfter$default);
                            qcWatchFaceDao2 = watchMarketFragmentViewModel.watchFaceDao;
                            qcWatchFaceDao2.insert(queryWatchFaceByName);
                            mutableLiveData = watchMarketFragmentViewModel._fileDownloadSuccess;
                            mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.base.repository.watchface.ListenerBean(true, substringAfter$default, 100));
                        }
                    }
                });
            }

            public void onError(com.androidnetworking.error.ANError anError) {
                androidx.lifecycle.MutableLiveData mutableLiveData;
                mutableLiveData = this._fileDownloadSuccess;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.base.repository.watchface.ListenerBean(false, kotlin.text.StringsKt.substringAfter$default((java.lang.String) objectRef.element, "temp_", (java.lang.String) null, 2, (java.lang.Object) null), -1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadWatchFaceNotExists$lambda-0, reason: not valid java name */
    public static final void m1419downloadWatchFaceNotExists$lambda0(long j, long j2) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Long.valueOf((j * 100) / j2));
    }

    public final void downloadWatchFaceNotExistsNotRepeat(com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        java.io.File watchFaceDirFile = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getWatchFaceDirFile();
        final java.lang.String name = item.getWatchFace().getName();
        if (com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.fileExists(watchFaceDirFile.getAbsolutePath() + '/' + name)) {
            com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.deleteFile(watchFaceDirFile.getAbsolutePath() + '/' + name);
        }
        com.androidnetworking.AndroidNetworking.download(item.getWatchFace().getBinUrl(), watchFaceDirFile.toString(), name).setTag(name).setPriority(com.androidnetworking.common.Priority.MEDIUM).build().setDownloadProgressListener(new com.androidnetworking.interfaces.DownloadProgressListener() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$$ExternalSyntheticLambda0
            public final void onProgress(long j, long j2) {
                com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.m1420downloadWatchFaceNotExistsNotRepeat$lambda1(j, j2);
            }
        }).startDownload(new com.androidnetworking.interfaces.DownloadListener() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$downloadWatchFaceNotExistsNotRepeat$2
            public void onError(com.androidnetworking.error.ANError anError) {
            }

            public void onDownloadComplete() {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.String.valueOf(name));
            }
        });
    }

    public final void checkCustomizeWatchFace() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$checkCustomizeWatchFace$1(this, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void customDeviceWatchFace(java.lang.String hwVersion) {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$customDeviceWatchFace$1(this, hwVersion, null), 3, (java.lang.Object) null);
    }

    public final void initCallback() {
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().registerCallback(this.callback);
    }

    public final void getWatchFaceFromDevice() {
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().registerCallback(this.callback);
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().initRegister();
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().startObtainPlate();
    }

    public final void deleteWatchFaceToDevice(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().setCurrFileType(1);
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().registerCallback(this.callback);
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().initRegister();
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().executeFileDelete(name);
    }

    public final void execWatchFaceToDeviceByName(final java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$execWatchFaceToDeviceByName$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel watchMarketFragmentViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchMarketFragmentViewModel, "$this$ktxRunOnBgSingle");
                watchFaceRepository = watchMarketFragmentViewModel.watchFaceRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace queryByName = watchFaceRepository.queryByName(name);
                if (queryByName != null) {
                    watchMarketFragmentViewModel.execWatchFaceToDevice(queryByName.getName(), queryByName.getLocalBinUrl());
                }
            }
        });
    }

    public final void queryByName(final java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$queryByName$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel watchMarketFragmentViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository;
                com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchMarketFragmentViewModel, "$this$ktxRunOnBgSingle");
                watchFaceRepository = watchMarketFragmentViewModel.watchFaceRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace queryByName = watchFaceRepository.queryByName(name);
                if (queryByName != null) {
                    queryByName.setLocalBinUrl("");
                    com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.deleteFile(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getWatchFaceDirFile().getAbsolutePath() + '/' + queryByName.getName());
                    watchFaceRepository2 = watchMarketFragmentViewModel.watchFaceRepository;
                    watchFaceRepository2.updateWatchFaceBean(queryByName);
                }
            }
        });
    }

    public final void execWatchFaceToDevice(java.lang.String name, java.lang.String binPath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binPath, "binPath");
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().setCurrFileType(1);
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().registerCallback(this.callback);
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().initRegister();
        if (com.oudmon.ble.base.communication.file.FileHandle.getInstance().executeFilePrepare(binPath)) {
            com.oudmon.ble.base.communication.file.FileHandle.getInstance().executeFileInit(name, 54);
        } else {
            this._progressValue.postValue(new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI(100, false, false, false, true));
        }
    }

    /* compiled from: WatchMarketFragmentViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00060\bj\b\u0012\u0004\u0012\u00020\u0006`\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragmentViewModel$WatchMarketUI;", "", "marketList", "", "Lcom/qcwireless/qcwatch/ui/plate/bean/MarketWatchFaceBean;", "watchList", "Lcom/qcwireless/qcwatch/ui/plate/bean/DeviceWatchFaceBean;", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getMarketList", "()Ljava/util/ArrayList;", "setMarketList", "(Ljava/util/ArrayList;)V", "getWatchList", "setWatchList", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class WatchMarketUI {
        private java.util.ArrayList<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> marketList;
        private java.util.ArrayList<com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean> watchList;

        public WatchMarketUI(java.util.List<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> list, java.util.List<com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "marketList");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "watchList");
            this.marketList = new java.util.ArrayList<>();
            this.watchList = new java.util.ArrayList<>();
            this.marketList = (java.util.ArrayList) list;
            this.watchList = (java.util.ArrayList) list2;
        }

        public final java.util.ArrayList<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> getMarketList() {
            return this.marketList;
        }

        public final void setMarketList(java.util.ArrayList<com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean> arrayList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
            this.marketList = arrayList;
        }

        public final java.util.ArrayList<com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean> getWatchList() {
            return this.watchList;
        }

        public final void setWatchList(java.util.ArrayList<com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean> arrayList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
            this.watchList = arrayList;
        }
    }

    /* compiled from: WatchMarketFragmentViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragmentViewModel$ProgressUI;", "", "progress", "", "success", "", "isRunning", "isDelete", "error", "(IZZZZ)V", "getError", "()Z", "getProgress", "()I", "setProgress", "(I)V", "getSuccess", "component1", "component2", "component3", "component4", "component5", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class ProgressUI {
        private final boolean error;
        private final boolean isDelete;
        private final boolean isRunning;
        private int progress;
        private final boolean success;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI copy$default(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI progressUI, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = progressUI.progress;
            }
            if ((i2 & 2) != 0) {
                z = progressUI.success;
            }
            boolean z5 = z;
            if ((i2 & 4) != 0) {
                z2 = progressUI.isRunning;
            }
            boolean z6 = z2;
            if ((i2 & 8) != 0) {
                z3 = progressUI.isDelete;
            }
            boolean z7 = z3;
            if ((i2 & 16) != 0) {
                z4 = progressUI.error;
            }
            return progressUI.copy(i, z5, z6, z7, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getProgress() {
            return this.progress;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRunning() {
            return this.isRunning;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsDelete() {
            return this.isDelete;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getError() {
            return this.error;
        }

        public final com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI copy(int progress, boolean success, boolean isRunning, boolean isDelete, boolean error) {
            return new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI(progress, success, isRunning, isDelete, error);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI progressUI = (com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI) other;
            return this.progress == progressUI.progress && this.success == progressUI.success && this.isRunning == progressUI.isRunning && this.isDelete == progressUI.isDelete && this.error == progressUI.error;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int i = this.progress * 31;
            boolean z = this.success;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            boolean z2 = this.isRunning;
            int i4 = z2;
            if (z2 != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            boolean z3 = this.isDelete;
            int i6 = z3;
            if (z3 != 0) {
                i6 = 1;
            }
            int i7 = (i5 + i6) * 31;
            boolean z4 = this.error;
            return i7 + (z4 ? 1 : z4 ? 1 : 0);
        }

        public java.lang.String toString() {
            return "ProgressUI(progress=" + this.progress + ", success=" + this.success + ", isRunning=" + this.isRunning + ", isDelete=" + this.isDelete + ", error=" + this.error + ')';
        }

        public ProgressUI(int i, boolean z, boolean z2, boolean z3, boolean z4) {
            this.progress = i;
            this.success = z;
            this.isRunning = z2;
            this.isDelete = z3;
            this.error = z4;
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

        public final boolean isRunning() {
            return this.isRunning;
        }

        public final boolean isDelete() {
            return this.isDelete;
        }

        public final boolean getError() {
            return this.error;
        }
    }

    /* compiled from: WatchMarketFragmentViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragmentViewModel$Callback;", "Lcom/oudmon/ble/base/communication/file/SimpleCallback;", "(Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragmentViewModel;)V", "onComplete", "", "onDeletePlate", "onDeletePlateError", "code", "", "onProgress", "percent", "onUpdatePlate", "array", "", "Lcom/oudmon/ble/base/communication/file/PlateEntity;", "onUpdatePlateError", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Callback extends com.oudmon.ble.base.communication.file.SimpleCallback {
        public Callback() {
        }

        @Override // com.oudmon.ble.base.communication.file.SimpleCallback, com.oudmon.ble.base.communication.file.ICallback
        public void onUpdatePlate(final java.util.List<com.oudmon.ble.base.communication.file.PlateEntity> array) {
            final com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel watchMarketFragmentViewModel = com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.this;
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.Callback, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel$Callback$onUpdatePlate$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.Callback) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.Callback callback) {
                    com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository;
                    androidx.lifecycle.MutableLiveData mutableLiveData;
                    com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "$this$ktxRunOnBgSingle");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    watchFaceRepository = com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.this.watchFaceRepository;
                    java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace> queryWatchFaceListByVersion = watchFaceRepository.queryWatchFaceListByVersion();
                    if (queryWatchFaceListByVersion != null) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---------" + ((int) com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWatchFaceMarketVersion()) + "----" + queryWatchFaceListByVersion.size());
                    }
                    if (queryWatchFaceListByVersion != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        for (com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace : queryWatchFaceListByVersion) {
                            if (watchFace.getLocalBinUrl().length() > 0) {
                                if (watchFace.getLocalImageUrl().length() > 0) {
                                    arrayList4.add(new com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean(watchFace, 0));
                                }
                            }
                            arrayList3.add(new com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean(watchFace, 0));
                        }
                        arrayList.addAll(arrayList3);
                    }
                    if (array != null) {
                        arrayList2.clear();
                        com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.this.getLocalWatchFace().clear();
                        for (com.oudmon.ble.base.communication.file.PlateEntity plateEntity : array) {
                            watchFaceRepository2 = com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.this.watchFaceRepository;
                            java.lang.String str = plateEntity.mPlateName;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "item.mPlateName");
                            com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace queryByName = watchFaceRepository2.queryByName(str);
                            if (queryByName != null) {
                                com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean deviceWatchFaceBean = new com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean(queryByName, plateEntity.mDelete);
                                arrayList2.add(deviceWatchFaceBean);
                                java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean> localWatchFace = com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.this.getLocalWatchFace();
                                java.lang.String str2 = plateEntity.mPlateName;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "item.mPlateName");
                                localWatchFace.put(str2, deviceWatchFaceBean);
                            } else {
                                java.lang.String str3 = plateEntity.mPlateName;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "item.mPlateName");
                                com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean deviceWatchFaceBean2 = new com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean(new com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace(str3, "", "", "", 2.0f, 1, "ui", "", "", (int) com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getWatchFaceMarketVersion(), 1), plateEntity.mDelete);
                                arrayList2.add(deviceWatchFaceBean2);
                                java.util.Map<java.lang.String, com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean> localWatchFace2 = com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.this.getLocalWatchFace();
                                java.lang.String str4 = plateEntity.mPlateName;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "item.mPlateName");
                                localWatchFace2.put(str4, deviceWatchFaceBean2);
                            }
                        }
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean marketWatchFaceBean = (com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean) it.next();
                            java.util.Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(marketWatchFaceBean.getWatchFace().getName(), ((com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean) it2.next()).getWatchFace().getName())) {
                                    it.remove();
                                }
                            }
                        }
                        mutableLiveData = com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.this._uiState;
                        mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.WatchMarketUI(arrayList, arrayList2));
                    }
                }
            });
        }

        @Override // com.oudmon.ble.base.communication.file.SimpleCallback, com.oudmon.ble.base.communication.file.ICallback
        public void onProgress(int percent) {
            if (com.oudmon.ble.base.communication.file.FileHandle.getInstance().getCurrFileType() == 1) {
                com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.this._progressValue.postValue(new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI(percent, false, true, false, false));
            }
        }

        @Override // com.oudmon.ble.base.communication.file.SimpleCallback, com.oudmon.ble.base.communication.file.ICallback
        public void onComplete() {
            if (com.oudmon.ble.base.communication.file.FileHandle.getInstance().getCurrFileType() == 1) {
                com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.this._progressValue.postValue(new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI(100, true, false, false, false));
            }
        }

        @Override // com.oudmon.ble.base.communication.file.SimpleCallback, com.oudmon.ble.base.communication.file.ICallback
        public void onDeletePlate() {
            com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.this._progressValue.postValue(new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI(100, false, false, true, false));
        }

        @Override // com.oudmon.ble.base.communication.file.SimpleCallback, com.oudmon.ble.base.communication.file.ICallback
        public void onDeletePlateError(int code) {
            com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.this._progressValue.postValue(new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI(code, false, false, false, true));
        }

        @Override // com.oudmon.ble.base.communication.file.SimpleCallback, com.oudmon.ble.base.communication.file.ICallback
        public void onUpdatePlateError(int code) {
            com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.this._progressValue.postValue(new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI(code, false, false, false, true));
        }
    }
}
