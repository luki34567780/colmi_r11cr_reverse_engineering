package com.qcwireless.qcwatch.ui.home.step.day;

/* compiled from: DayStepFragmentViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/day/DayStepFragmentViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "stepDetailRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/StepDetailRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/StepDetailRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/home/step/day/DayStepFragmentViewModel$DayStepUI;", "again", "", "tagList", "", "Lcom/qcwireless/qcwatch/ui/home/step/StepTendBean;", "getTagList", "()Ljava/util/List;", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "queryStepDetailByDate", "", "date", "", "syncStepDetailAgain", "DayStepUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DayStepFragmentViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.DayStepUI> _uiState;
    private boolean again;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository;
    private final java.util.List<com.qcwireless.qcwatch.ui.home.step.StepTendBean> tagList;

    public DayStepFragmentViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepDetailRepository, "stepDetailRepository");
        this.stepDetailRepository = stepDetailRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this.tagList = new java.util.ArrayList();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.DayStepUI> getUiState() {
        return this._uiState;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.step.StepTendBean> getTagList() {
        return this.tagList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncStepDetailAgain(final java.lang.String date) {
        this.stepDetailRepository.syncTodayStepDetail(0, new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel$syncStepDetailAgain$1
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.this.queryStepDetailByDate(date);
            }
        });
    }

    public final void queryStepDetailByDate(final java.lang.String date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel$queryStepDetailByDate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel dayStepFragmentViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository;
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository2;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository3;
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository4;
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository5;
                boolean z;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayStepFragmentViewModel, "$this$ktxRunOnBgSingle");
                stepDetailRepository = dayStepFragmentViewModel.stepDetailRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean> queryStepDetail = stepDetailRepository.queryStepDetail(date);
                stepDetailRepository2 = dayStepFragmentViewModel.stepDetailRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal queryStepTotal = stepDetailRepository2.queryStepTotal(date);
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                for (com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean stepDataBean : queryStepDetail) {
                    i += stepDataBean.getSteps();
                    i2 += stepDataBean.getDistance();
                    i3 += stepDataBean.getCalorie();
                }
                if (queryStepTotal != null && i != queryStepTotal.getStep()) {
                    z = dayStepFragmentViewModel.again;
                    if (!z) {
                        dayStepFragmentViewModel.again = true;
                        dayStepFragmentViewModel.syncStepDetailAgain(date);
                    }
                }
                if (queryStepTotal != null && queryStepTotal.getCarolie() > 0 && queryStepTotal.getStep() != i) {
                    queryStepTotal.setStep(i);
                    queryStepTotal.setDistance(i2);
                    queryStepTotal.setCarolie(i3);
                    stepDetailRepository3 = dayStepFragmentViewModel.stepDetailRepository;
                    stepDetailRepository3.saveTotalDate(queryStepTotal);
                    stepDetailRepository4 = dayStepFragmentViewModel.stepDetailRepository;
                    com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail queryStepDetailError = stepDetailRepository4.queryStepDetailError(date);
                    if (queryStepDetailError != null && !kotlin.text.StringsKt.equals(queryStepDetailError.getDateStr(), new com.oudmon.ble.base.util.DateUtil().getY_M_D(), true)) {
                        stepDetailRepository5 = dayStepFragmentViewModel.stepDetailRepository;
                        stepDetailRepository5.deleteStepDetailError(queryStepDetailError);
                    }
                    com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().saveSyncHistoryDataInfo(0L);
                }
                if (queryStepTotal != null && queryStepTotal.getCarolie() != i3 && queryStepTotal.getCarolie() > i3) {
                    i3 = queryStepTotal.getCarolie();
                }
                mutableLiveData = dayStepFragmentViewModel._uiState;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.DayStepUI(queryStepDetail, java.lang.String.valueOf(i), java.lang.String.valueOf(i2), java.lang.String.valueOf(i3)));
            }
        });
    }

    /* compiled from: DayStepFragmentViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/day/DayStepFragmentViewModel$DayStepUI;", "", "data", "", "Lcom/qcwireless/qcwatch/ui/base/view/QStepBarChart$StepDataBean;", "stepTotal", "", "distanceTotal", "calorieTotal", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCalorieTotal", "()Ljava/lang/String;", "getData", "()Ljava/util/List;", "getDistanceTotal", "getStepTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class DayStepUI {
        private final java.lang.String calorieTotal;
        private final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean> data;
        private final java.lang.String distanceTotal;
        private final java.lang.String stepTotal;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.DayStepUI copy$default(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.DayStepUI dayStepUI, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = dayStepUI.data;
            }
            if ((i & 2) != 0) {
                str = dayStepUI.stepTotal;
            }
            if ((i & 4) != 0) {
                str2 = dayStepUI.distanceTotal;
            }
            if ((i & 8) != 0) {
                str3 = dayStepUI.calorieTotal;
            }
            return dayStepUI.copy(list, str, str2, str3);
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean> component1() {
            return this.data;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getStepTotal() {
            return this.stepTotal;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDistanceTotal() {
            return this.distanceTotal;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCalorieTotal() {
            return this.calorieTotal;
        }

        public final com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.DayStepUI copy(java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean> data, java.lang.String stepTotal, java.lang.String distanceTotal, java.lang.String calorieTotal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepTotal, "stepTotal");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distanceTotal, "distanceTotal");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calorieTotal, "calorieTotal");
            return new com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.DayStepUI(data, stepTotal, distanceTotal, calorieTotal);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.DayStepUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.DayStepUI dayStepUI = (com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.DayStepUI) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, dayStepUI.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.stepTotal, dayStepUI.stepTotal) && kotlin.jvm.internal.Intrinsics.areEqual(this.distanceTotal, dayStepUI.distanceTotal) && kotlin.jvm.internal.Intrinsics.areEqual(this.calorieTotal, dayStepUI.calorieTotal);
        }

        public int hashCode() {
            return (((((this.data.hashCode() * 31) + this.stepTotal.hashCode()) * 31) + this.distanceTotal.hashCode()) * 31) + this.calorieTotal.hashCode();
        }

        public java.lang.String toString() {
            return "DayStepUI(data=" + this.data + ", stepTotal=" + this.stepTotal + ", distanceTotal=" + this.distanceTotal + ", calorieTotal=" + this.calorieTotal + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DayStepUI(java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean> list, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "stepTotal");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "distanceTotal");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "calorieTotal");
            this.data = list;
            this.stepTotal = str;
            this.distanceTotal = str2;
            this.calorieTotal = str3;
        }

        public /* synthetic */ DayStepUI(java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? "0" : str, (i & 4) != 0 ? "0" : str2, str3);
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean> getData() {
            return this.data;
        }

        public final java.lang.String getStepTotal() {
            return this.stepTotal;
        }

        public final java.lang.String getDistanceTotal() {
            return this.distanceTotal;
        }

        public final java.lang.String getCalorieTotal() {
            return this.calorieTotal;
        }
    }
}
