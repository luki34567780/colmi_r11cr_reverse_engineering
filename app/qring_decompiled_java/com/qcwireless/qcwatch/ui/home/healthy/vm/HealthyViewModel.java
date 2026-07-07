package com.qcwireless.qcwatch.ui.home.healthy.vm;

/* compiled from: HealthyViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 a2\u00020\u0001:\u0005`abcdB]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\u000e\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001cJ\u0006\u0010:\u001a\u000208J\b\u0010;\u001a\u000208H\u0002J\u0010\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020\u001cH\u0002J\u0006\u0010>\u001a\u000208J\u0006\u0010?\u001a\u000208J\u0006\u0010@\u001a\u000208J\u0006\u0010A\u001a\u000208J\u0006\u0010B\u001a\u000208J\b\u0010C\u001a\u000208H\u0002J\b\u0010D\u001a\u000208H\u0002J\b\u0010E\u001a\u000208H\u0002J\u0006\u0010F\u001a\u000208J\b\u0010G\u001a\u000208H\u0002J\b\u0010H\u001a\u000208H\u0002J\b\u0010I\u001a\u000208H\u0002J\b\u0010J\u001a\u000208H\u0002J\b\u0010K\u001a\u000208H\u0002J\b\u0010L\u001a\u000208H\u0002J\b\u0010M\u001a\u000208H\u0002J\b\u0010N\u001a\u000208H\u0002J\u000e\u0010O\u001a\u0002082\u0006\u0010P\u001a\u00020QJ\u0006\u0010R\u001a\u000208J\u0006\u0010S\u001a\u000208J\u0006\u0010T\u001a\u000208J\u0006\u0010U\u001a\u000208J\u000e\u0010V\u001a\u0002082\u0006\u0010P\u001a\u00020QJ\u0006\u0010W\u001a\u000208J\u0006\u0010X\u001a\u000208J\b\u0010Y\u001a\u000208H\u0002J\u0006\u0010Z\u001a\u000208J\u0006\u0010[\u001a\u000208J\u0006\u0010\\\u001a\u000208J\b\u0010]\u001a\u000208H\u0002J\u0006\u0010^\u001a\u000208J\u0006\u0010_\u001a\u000208R$\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00060!R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u00060#R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010$\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d0%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0012\u00101\u001a\u000602R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u001f0%8F¢\u0006\u0006\u001a\u0004\b6\u0010'R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "healthyRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/HealthyRepository;", "stepDetailRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/StepDetailRepository;", "sleepDetailRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SleepDetailRepository;", "heartDetailRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/HeartRateDetailRepository;", "sportPlusRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SportPlusRepository;", "watchFaceRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceRepository;", "bloodPressureRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodPressureRepository;", "bloodOxygenRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodOxygenRepository;", "temperatureRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/TemperatureRepository;", "bloodSugarRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodSugarRepository;", "pressureRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/PressureRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/HealthyRepository;Lcom/qcwireless/qcwatch/ui/base/repository/healthy/StepDetailRepository;Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SleepDetailRepository;Lcom/qcwireless/qcwatch/ui/base/repository/healthy/HeartRateDetailRepository;Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SportPlusRepository;Lcom/qcwireless/qcwatch/ui/base/repository/watchface/WatchFaceRepository;Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodPressureRepository;Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodOxygenRepository;Lcom/qcwireless/qcwatch/ui/base/repository/healthy/TemperatureRepository;Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodSugarRepository;Lcom/qcwireless/qcwatch/ui/base/repository/healthy/PressureRepository;)V", "_fileDismissStatue", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "_uiState", "Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel$HealthUI;", "callback", "Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel$Callback;", "detailBarRunnable", "Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel$DetailBarStatus;", "fileDismissStatue", "Landroidx/lifecycle/LiveData;", "getFileDismissStatue", "()Landroidx/lifecycle/LiveData;", "handler", "Landroid/os/Handler;", "itemList", "", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "getItemList", "()Ljava/util/List;", "setItemList", "(Ljava/util/List;)V", "myRunnable", "Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel$MyRunnable;", "support", "Lcom/qcwireless/qcwatch/ui/base/bean/device/OneKeySupport;", "uiState", "getUiState", "checkWatchFaceDownload", "", "version", "getTokenNotLogin", "getWatchDismissFile", "getWatchFaceFromService", "hardwareVersion", "initSupportFunction", "queryHealthData", "queryInitHealthData", "queryNotificationHealthData", "queryStepAndDetail", "syncBloodOxygen", "syncBloodPressure", "syncBloodSugar", "syncBpSingle", "syncHistoryData", "syncHistoryHeartDetail", "syncHistoryPressure", "syncHistorySleepDetail", "syncHistoryStepDetail", "syncManualHeart", "syncTemperatureAuto", "syncTemperatureSingleCheck", "syncTodayBloodSugar", "offset", "", "syncTodayHeartRateDetail", "syncTodayHeartSingleData", "syncTodayPressure", "syncTodaySleepDetail", "syncTodaySpo2Single", "syncTodaySportPlusDetail", "syncTodaySportPlusDetailSingle", "syncTodayStep", "syncTodayStepDetail", "syncTodayStepDetailSingle", "syncTodayStepNotification", "syncTodayStepTotal", "syncTodayTemperatureSingle", "syncWatchData", "Callback", "Companion", "DetailBarStatus", "HealthUI", "MyRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class HealthyViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    public static final int Type_Sync_BloodOxygen = 10;
    public static final int Type_Sync_BloodPressure = 9;
    public static final int Type_Sync_File = 1;
    public static final int Type_Sync_Heart = 4;
    public static final int Type_Sync_HistoryHeart = 8;
    public static final int Type_Sync_HistoryPressure = 21;
    public static final int Type_Sync_HistorySleep = 7;
    public static final int Type_Sync_HistoryStep = 6;
    public static final int Type_Sync_ManualHeart = 13;
    public static final int Type_Sync_Pressure = 20;
    public static final int Type_Sync_Sleep = 3;
    public static final int Type_Sync_SportPlus = 12;
    public static final int Type_Sync_Step = 2;
    public static final int Type_Sync_StepDetail = 5;
    public static final int Type_Sync_Temperature = 11;
    public static final int Type_Sync_TimeOut = 888;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> _fileDismissStatue;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository bloodPressureRepository;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository bloodSugarRepository;
    private final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.Callback callback;
    private final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.DetailBarStatus detailBarRunnable;
    private final android.os.Handler handler;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.HealthyRepository healthyRepository;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartDetailRepository;
    private java.util.List<com.chad.library.adapter.base.entity.MultiItemEntity> itemList;
    private final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.MyRunnable myRunnable;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository;
    private com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport support;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository temperatureRepository;
    private final com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository;

    public HealthyViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.HealthyRepository healthyRepository, com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository, com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository, com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository, com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository, com.qcwireless.qcwatch.ui.base.repository.watchface.WatchFaceRepository watchFaceRepository, com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository bloodPressureRepository, com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository, com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository temperatureRepository, com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository bloodSugarRepository, com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyRepository, "healthyRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepDetailRepository, "stepDetailRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDetailRepository, "sleepDetailRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRateDetailRepository, "heartDetailRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportPlusRepository, "sportPlusRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchFaceRepository, "watchFaceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureRepository, "bloodPressureRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenRepository, "bloodOxygenRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(temperatureRepository, "temperatureRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarRepository, "bloodSugarRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pressureRepository, "pressureRepository");
        this.healthyRepository = healthyRepository;
        this.stepDetailRepository = stepDetailRepository;
        this.sleepDetailRepository = sleepDetailRepository;
        this.heartDetailRepository = heartRateDetailRepository;
        this.sportPlusRepository = sportPlusRepository;
        this.watchFaceRepository = watchFaceRepository;
        this.bloodPressureRepository = bloodPressureRepository;
        this.bloodOxygenRepository = bloodOxygenRepository;
        this.temperatureRepository = temperatureRepository;
        this.bloodSugarRepository = bloodSugarRepository;
        this.pressureRepository = pressureRepository;
        this.itemList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this.callback = new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.Callback();
        this.detailBarRunnable = new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.DetailBarStatus();
        this._fileDismissStatue = new androidx.lifecycle.MutableLiveData<>();
        this.myRunnable = new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.MyRunnable();
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "sync action:-->" + msg.what);
                if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                    int i = msg.what;
                    if (i == 12) {
                        com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().setSyncSportPlus(false);
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.initSupportFunction();
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncHistoryStepDetail();
                        return;
                    }
                    if (i == 888) {
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "------Type_Sync_HistorySleep");
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncHistorySleepDetail();
                        return;
                    }
                    if (i == 20) {
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncTodayHeartRateDetail();
                        return;
                    }
                    if (i != 21) {
                        switch (i) {
                            case 1:
                                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncTodayStep();
                                break;
                            case 2:
                                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncTodayStepDetail();
                                break;
                            case 3:
                                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncTodayPressure();
                                break;
                            case 4:
                                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncTodaySportPlusDetail();
                                break;
                            case 5:
                                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncTodaySleepDetail();
                                break;
                            case 6:
                                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncHistorySleepDetail();
                                break;
                            case 7:
                                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncHistoryPressure();
                                break;
                        }
                    }
                    com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncHistoryHeartDetail();
                }
            }
        };
    }

    public final java.util.List<com.chad.library.adapter.base.entity.MultiItemEntity> getItemList() {
        return this.itemList;
    }

    public final void setItemList(java.util.List<com.chad.library.adapter.base.entity.MultiItemEntity> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.itemList = list;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<java.util.ArrayList<java.lang.String>> getFileDismissStatue() {
        return this._fileDismissStatue;
    }

    public final void syncWatchData() {
        syncTodayStep();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncTodayStep() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayStep$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "$this$ktxRunOnBgSingle");
                stepDetailRepository = healthyViewModel.stepDetailRepository;
                stepDetailRepository.syncTodayStep(new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.TodaySportDataRsp>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayStep$1$1$1
                    @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
                    public void result(int errorCode, com.oudmon.ble.base.communication.rsp.TodaySportDataRsp t) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.removeMessages(2);
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncTodayStepDetail();
                        com.oudmon.ble.base.util.LogToFile.getInstance().wtf("开始同步详情");
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.sendEmptyMessageDelayed(5, 3000L);
                    }
                });
            }
        });
    }

    public final void syncTodayStepNotification() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayStepNotification$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository unused;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "$this$ktxRunOnBgSingle");
                if (com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() != 1 && com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() != 2 && com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() != 3 && com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() != 4) {
                    unused = healthyViewModel.stepDetailRepository;
                    healthyViewModel.syncTodayStepTotal();
                } else {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "正在固件升级");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncTodayStepTotal() {
        this.stepDetailRepository.syncTodayStep(new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.TodaySportDataRsp>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayStepTotal$1$1
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.TodaySportDataRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                try {
                    com.qcwireless.qcwatch.base.pref.PreUtil.putInt(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Today_Steps, t.getSportTotal().getTotalSteps());
                    new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
                    com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.queryNotificationHealthData();
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public final void syncTodayStepDetail() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayStepDetail$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "$this$ktxRunOnBgSingle");
                stepDetailRepository = healthyViewModel.stepDetailRepository;
                stepDetailRepository.syncTodayStepDetail(0, new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayStepDetail$1$1$1
                    @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
                    public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp t) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.removeMessages(5);
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncTodaySleepDetail();
                        com.oudmon.ble.base.util.LogToFile.getInstance().wtf("开始同步睡眠详情");
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.sendEmptyMessageDelayed(3, 3000L);
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.DeviceSyncTodayStepsAndDetailEvent());
                    }
                });
            }
        });
    }

    public final void syncTodaySleepDetail() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodaySleepDetail$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "$this$ktxRunOnBgSingle");
                sleepDetailRepository = healthyViewModel.sleepDetailRepository;
                sleepDetailRepository.syncTodaySleepDetail(0, new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodaySleepDetail$1$1$1
                    @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
                    public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp t) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.removeMessages(3);
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncTodayPressure();
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "开始同步压力详情");
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.sendEmptyMessageDelayed(20, 3000L);
                    }
                });
            }
        });
    }

    public final void syncTodayHeartRateDetail() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayHeartRateDetail$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "$this$ktxRunOnBgSingle");
                heartRateDetailRepository = healthyViewModel.heartDetailRepository;
                heartRateDetailRepository.syncTodayHeartRate(new com.qcwireless.qc_utils.date.DateUtil(), new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayHeartRateDetail$1$1$1
                    @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
                    public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp t) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.removeMessages(4);
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.sendEmptyMessageDelayed(12, 7000L);
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncTodaySportPlusDetail();
                        com.oudmon.ble.base.util.LogToFile.getInstance().wtf("开始同步运动详情");
                        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getGoogleFit()) {
                            com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.GoogleFitSync.INSTANCE.getGetInstance().syncGoogleFit();
                        }
                    }
                });
            }
        });
    }

    public final void initSupportFunction() {
        try {
            java.lang.String oneKeySupport = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getOneKeySupport();
            com.oudmon.ble.base.util.LogToFile.getInstance().wtf("查询手表支持的功能列表" + oneKeySupport);
            com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$initSupportFunction$$inlined$fromJson$1
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport oneKeySupport2 = (com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport) adapter.fromJson(oneKeySupport);
            if (oneKeySupport2 != null) {
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, oneKeySupport2);
                this.support = oneKeySupport2;
            }
            com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport oneKeySupport3 = this.support;
            if (oneKeySupport3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("support");
                oneKeySupport3 = null;
            }
            if (oneKeySupport3.getSupportBloodOxygen()) {
                syncBloodOxygen();
                com.oudmon.ble.base.util.LogToFile.getInstance().wtf("同步血氧");
            }
            com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport oneKeySupport4 = this.support;
            if (oneKeySupport4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("support");
                oneKeySupport4 = null;
            }
            if (oneKeySupport4.getSupportBloodPressure()) {
                this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.m1079initSupportFunction$lambda1(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this);
                    }
                }, 500L);
            }
            com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport oneKeySupport5 = this.support;
            if (oneKeySupport5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("support");
                oneKeySupport5 = null;
            }
            if (oneKeySupport5.getSupportTemp()) {
                this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.m1080initSupportFunction$lambda2(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this);
                    }
                }, 1000L);
                this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.m1081initSupportFunction$lambda3(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this);
                    }
                }, 1500L);
            }
            com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport oneKeySupport6 = this.support;
            if (oneKeySupport6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("support");
                oneKeySupport6 = null;
            }
            if (oneKeySupport6.getSupportManualHeart()) {
                this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.m1082initSupportFunction$lambda4(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this);
                    }
                }, 800L);
            }
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBloodSugarSupport()) {
                this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.m1083initSupportFunction$lambda5(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this);
                    }
                }, 1000L);
            }
            com.qcwireless.qcwatch.ui.base.bean.device.OneKeySupport oneKeySupport7 = this.support;
            if (oneKeySupport7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("support");
                oneKeySupport7 = null;
            }
            if (oneKeySupport7.getSupportLocation()) {
                kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$initSupportFunction$6(null), 3, (java.lang.Object) null);
            }
            syncHistoryData();
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.DataSyncEvent(false));
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.TodayDataSyncEvent(false));
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "当天数据同步结束");
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastTenMinSyncTime(600 + new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            this.handler.removeCallbacks(this.detailBarRunnable);
            this.handler.postDelayed(this.detailBarRunnable, 1000L);
            this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.m1084initSupportFunction$lambda6();
                }
            }, 4000L);
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initSupportFunction$lambda-1, reason: not valid java name */
    public static final void m1079initSupportFunction$lambda1(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "this$0");
        healthyViewModel.syncBloodPressure();
        com.oudmon.ble.base.util.LogToFile.getInstance().wtf("同步血压");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initSupportFunction$lambda-2, reason: not valid java name */
    public static final void m1080initSupportFunction$lambda2(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "this$0");
        healthyViewModel.syncTemperatureAuto();
        com.oudmon.ble.base.util.LogToFile.getInstance().wtf("同步自动体温");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initSupportFunction$lambda-3, reason: not valid java name */
    public static final void m1081initSupportFunction$lambda3(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "this$0");
        healthyViewModel.syncTemperatureSingleCheck();
        com.oudmon.ble.base.util.LogToFile.getInstance().wtf("同步手动体温");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initSupportFunction$lambda-4, reason: not valid java name */
    public static final void m1082initSupportFunction$lambda4(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "this$0");
        healthyViewModel.syncManualHeart();
        com.oudmon.ble.base.util.LogToFile.getInstance().wtf("同步手动心率");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initSupportFunction$lambda-5, reason: not valid java name */
    public static final void m1083initSupportFunction$lambda5(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "this$0");
        healthyViewModel.syncBloodSugar();
        com.oudmon.ble.base.util.LogToFile.getInstance().wtf("同步血糖数据");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initSupportFunction$lambda-6, reason: not valid java name */
    public static final void m1084initSupportFunction$lambda6() {
        com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().setSync(false);
    }

    /* compiled from: HealthyViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel$DetailBarStatus;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class DetailBarStatus implements java.lang.Runnable {
        public DetailBarStatus() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.queryHealthData();
        }
    }

    /* compiled from: HealthyViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel$MyRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyRunnable implements java.lang.Runnable {
        public MyRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().setSync(false);
        }
    }

    public final void syncTodaySportPlusDetail() {
        com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().setSyncSportPlus(true);
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodaySportPlusDetail$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(final com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "$this$ktxRunOnBgSingle");
                sportPlusRepository = healthyViewModel.sportPlusRepository;
                sportPlusRepository.syncTodaySportPlus((com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult) new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<java.util.List<? extends com.oudmon.ble.base.communication.sport.SportPlusEntity>>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodaySportPlusDetail$1$1$1
                    @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
                    public void result(int errorCode, java.util.List<? extends com.oudmon.ble.base.communication.sport.SportPlusEntity> t) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "运动同步结束");
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.removeMessages(12);
                        com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().setSyncSportPlus(false);
                        com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.initSupportFunction();
                        com.oudmon.ble.base.util.LogToFile.getInstance().wtf("运动同步结束");
                    }
                });
            }
        });
    }

    private final void syncHistoryData() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistoryData$1(this, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncHistoryStepDetail() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "同步所有历史数据");
        com.oudmon.ble.base.util.LogToFile.getInstance().wtf("同步所有历史数据");
        com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().setSync(true);
        this.handler.postDelayed(this.myRunnable, 13000L);
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistoryStepDetail$1(this, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncHistorySleepDetail() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistorySleepDetail$1(this, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncHistoryPressure() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistoryPressure$1(this, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncHistoryHeartDetail() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncHistoryHeartDetail$1(this, null), 3, (java.lang.Object) null);
    }

    public final void syncTodayPressure() {
        this.pressureRepository.syncTodayPressure(new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.PressureRsp>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayPressure$1
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.PressureRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.removeMessages(20);
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncTodayHeartRateDetail();
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "开始同步心率详情");
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.sendEmptyMessageDelayed(4, 3000L);
            }
        });
    }

    public final void syncTodayHeartSingleData() {
        this.heartDetailRepository.syncTodayHeartRate(new com.qcwireless.qc_utils.date.DateUtil(), new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayHeartSingleData$1$1
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayHeartSingleData$1$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayHeartSingleData$1$1$result$1
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayHeartSingleData$1$1) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayHeartSingleData$1$1 healthyViewModel$syncTodayHeartSingleData$1$1) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel$syncTodayHeartSingleData$1$1, "$this$ktxRunOnBgSingle");
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
                    }
                });
            }
        });
    }

    public final void syncBpSingle() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncBpSingle$1(this, null), 3, (java.lang.Object) null);
    }

    public final void syncTodaySpo2Single(int offset) {
        this.bloodOxygenRepository.syncAutoBloodOxygen(offset, new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodaySpo2Single$1$1
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
            }
        });
    }

    public final void syncTodayBloodSugar(int offset) {
        this.bloodSugarRepository.syncBloodSugar(offset, new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayBloodSugar$1$1
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
            }
        });
    }

    public final void syncTodayStepDetailSingle() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayStepDetailSingle$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "$this$ktxRunOnBgSingle");
                stepDetailRepository = healthyViewModel.stepDetailRepository;
                stepDetailRepository.syncTodayStepDetail(0, new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayStepDetailSingle$1$1$1
                    @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
                    public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp t) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
                    }
                });
            }
        });
    }

    private final void syncBloodPressure() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncBloodPressure$1(this, null), 3, (java.lang.Object) null);
    }

    private final void syncBloodOxygen() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncBloodOxygen$1(this, null), 3, (java.lang.Object) null);
    }

    private final void syncBloodSugar() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncBloodSugar$1(this, null), 3, (java.lang.Object) null);
    }

    private final void syncManualHeart() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncManualHeart$1(this, null), 3, (java.lang.Object) null);
    }

    private final void syncTemperatureAuto() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTemperatureAuto$1(this, null), 3, (java.lang.Object) null);
    }

    private final void syncTemperatureSingleCheck() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTemperatureSingleCheck$1(this, null), 3, (java.lang.Object) null);
    }

    public final void syncTodayTemperatureSingle() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodayTemperatureSingle$1(this, null), 3, (java.lang.Object) null);
    }

    public final void syncTodaySportPlusDetailSingle() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodaySportPlusDetailSingle$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "$this$ktxRunOnBgSingle");
                sportPlusRepository = healthyViewModel.sportPlusRepository;
                sportPlusRepository.syncTodaySportPlus((com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult) new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<java.util.List<? extends com.oudmon.ble.base.communication.sport.SportPlusEntity>>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$syncTodaySportPlusDetailSingle$1$1$1
                    @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
                    public void result(int errorCode, java.util.List<? extends com.oudmon.ble.base.communication.sport.SportPlusEntity> t) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
                    }
                });
            }
        });
    }

    private final void getWatchDismissFile() {
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().initRegister();
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().removeCallback(this.callback);
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().registerCallback(this.callback);
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().start();
    }

    public final void queryHealthData() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$queryHealthData$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository;
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository2;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "$this$ktxRunOnBgSingle");
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI healthUI = new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI();
                stepDetailRepository = healthyViewModel.stepDetailRepository;
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                healthUI.setTotalSteps(stepDetailRepository.queryStepTotal(y_m_d));
                stepDetailRepository2 = healthyViewModel.stepDetailRepository;
                java.lang.String y_m_d2 = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "DateUtil().y_M_D");
                healthUI.setStepHourData(stepDetailRepository2.queryStepDetail(y_m_d2));
                healthUI.setRefreshType(1);
                mutableLiveData = healthyViewModel._uiState;
                mutableLiveData.postValue(healthUI);
            }
        });
    }

    public final void queryInitHealthData() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$queryInitHealthData$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository;
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository2;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "$this$ktxRunOnBgSingle");
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI healthUI = new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI();
                stepDetailRepository = healthyViewModel.stepDetailRepository;
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                healthUI.setTotalSteps(stepDetailRepository.queryStepTotal(y_m_d));
                stepDetailRepository2 = healthyViewModel.stepDetailRepository;
                java.lang.String y_m_d2 = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "DateUtil().y_M_D");
                healthUI.setStepHourData(stepDetailRepository2.queryStepDetail(y_m_d2));
                healthUI.setRefreshType(2);
                mutableLiveData = healthyViewModel._uiState;
                mutableLiveData.postValue(healthUI);
            }
        });
    }

    public final void queryNotificationHealthData() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$queryNotificationHealthData$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository;
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository2;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "$this$ktxRunOnBgSingle");
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI healthUI = new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI();
                stepDetailRepository = healthyViewModel.stepDetailRepository;
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                healthUI.setTotalSteps(stepDetailRepository.queryStepTotal(y_m_d));
                stepDetailRepository2 = healthyViewModel.stepDetailRepository;
                java.lang.String y_m_d2 = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "DateUtil().y_M_D");
                healthUI.setStepHourData(stepDetailRepository2.queryStepDetail(y_m_d2));
                healthUI.setRefreshType(3);
                mutableLiveData = healthyViewModel._uiState;
                mutableLiveData.postValue(healthUI);
            }
        });
    }

    public final void queryStepAndDetail() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$queryStepAndDetail$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel healthyViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository;
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository2;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthyViewModel, "$this$ktxRunOnBgSingle");
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI healthUI = new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.HealthUI();
                stepDetailRepository = healthyViewModel.stepDetailRepository;
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                healthUI.setTotalSteps(stepDetailRepository.queryStepTotal(y_m_d));
                stepDetailRepository2 = healthyViewModel.stepDetailRepository;
                java.lang.String y_m_d2 = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "DateUtil().y_M_D");
                healthUI.setStepHourData(stepDetailRepository2.queryStepDetail(y_m_d2));
                healthUI.setRefreshType(4);
                mutableLiveData = healthyViewModel._uiState;
                mutableLiveData.postValue(healthUI);
            }
        });
    }

    public final void checkWatchFaceDownload(java.lang.String version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$checkWatchFaceDownload$1(this, version, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getWatchFaceFromService(java.lang.String hardwareVersion) {
        launchOnUI(new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$getWatchFaceFromService$1(this, hardwareVersion, null));
    }

    public final void getTokenNotLogin() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$getTokenNotLogin$1(this, null), 3, (java.lang.Object) null);
    }

    /* compiled from: HealthyViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0016¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel$Callback;", "Lcom/oudmon/ble/base/communication/file/SimpleCallback;", "(Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel;)V", "onFileNames", "", "fileNames", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Callback extends com.oudmon.ble.base.communication.file.SimpleCallback {
        public Callback() {
        }

        @Override // com.oudmon.ble.base.communication.file.SimpleCallback, com.oudmon.ble.base.communication.file.ICallback
        public void onFileNames(java.util.ArrayList<java.lang.String> fileNames) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileNames, "fileNames");
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, fileNames);
            com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.removeMessages(1);
            if (!fileNames.isEmpty()) {
                com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.launchOnUI(new com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel$Callback$onFileNames$1(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this, fileNames, null));
                return;
            }
            com.oudmon.ble.base.util.LogToFile.getInstance().wtf("手表不缺文件，开始同步总步数");
            com.oudmon.ble.base.communication.file.FileHandle.getInstance().removeCallback(com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.callback);
            com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.syncTodayStep();
            com.qcwireless.qcwatch.ui.home.healthy.vm.HealthyViewModel.this.handler.sendEmptyMessageDelayed(2, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
            com.oudmon.ble.base.util.LogToFile.getInstance();
        }
    }

    /* compiled from: HealthyViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/vm/HealthyViewModel$HealthUI;", "", "()V", "errorCode", "", "total", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/StepTotal;", "stepHourData", "", "Lcom/qcwireless/qcwatch/ui/base/view/QStepBarChart$StepDataBean;", "(ILcom/qcwireless/qcwatch/ui/base/repository/entity/StepTotal;Ljava/util/List;)V", "getErrorCode", "()I", "setErrorCode", "(I)V", "refreshType", "getRefreshType", "setRefreshType", "getStepHourData", "()Ljava/util/List;", "setStepHourData", "(Ljava/util/List;)V", "totalSteps", "getTotalSteps", "()Lcom/qcwireless/qcwatch/ui/base/repository/entity/StepTotal;", "setTotalSteps", "(Lcom/qcwireless/qcwatch/ui/base/repository/entity/StepTotal;)V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class HealthUI {
        private int errorCode;
        private int refreshType;
        private java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean> stepHourData;
        private com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal totalSteps;

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final void setErrorCode(int i) {
            this.errorCode = i;
        }

        public final com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal getTotalSteps() {
            return this.totalSteps;
        }

        public final void setTotalSteps(com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal stepTotal) {
            this.totalSteps = stepTotal;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean> getStepHourData() {
            return this.stepHourData;
        }

        public final void setStepHourData(java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean> list) {
            this.stepHourData = list;
        }

        public final int getRefreshType() {
            return this.refreshType;
        }

        public final void setRefreshType(int i) {
            this.refreshType = i;
        }

        public HealthUI() {
        }

        public HealthUI(int i, com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal stepTotal, java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepTotal, "total");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "stepHourData");
            this.errorCode = i;
            this.totalSteps = stepTotal;
            this.stepHourData = list;
        }
    }
}
