package com.qcwireless.qcwatch.ui.home.gps.vm;

/* compiled from: GPSActivityViewModel.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSActivityViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "gpsRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/gps/GpsRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/gps/GpsRepository;)V", "_gpsDetail", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/GpsDetail;", "_uiState", "", "gpsDetail", "Landroidx/lifecycle/LiveData;", "getGpsDetail", "()Landroidx/lifecycle/LiveData;", "uiState", "getUiState", "queryByStartTime", "", "startTime", "", "queryTotalDistance", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GPSActivityViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> _gpsDetail;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository gpsRepository;

    public GPSActivityViewModel(com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository gpsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRepository, "gpsRepository");
        this.gpsRepository = gpsRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._gpsDetail = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<java.lang.String> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> getGpsDetail() {
        return this._gpsDetail;
    }

    public final void queryTotalDistance() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel$queryTotalDistance$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel gPSActivityViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository gpsRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gPSActivityViewModel, "$this$ktxRunOnBgSingle");
                gpsRepository = gPSActivityViewModel.gpsRepository;
                java.lang.String queryTotalDistance = gpsRepository.queryTotalDistance();
                mutableLiveData = gPSActivityViewModel._uiState;
                mutableLiveData.postValue(queryTotalDistance);
            }
        });
    }

    public final void queryByStartTime(final long startTime) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel$queryByStartTime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.gps.vm.GPSActivityViewModel gPSActivityViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository gpsRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gPSActivityViewModel, "$this$ktxRunOnBgSingle");
                gpsRepository = gPSActivityViewModel.gpsRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail queryGpsDetailByStartTime = gpsRepository.queryGpsDetailByStartTime(startTime);
                if (queryGpsDetailByStartTime != null) {
                    mutableLiveData = gPSActivityViewModel._gpsDetail;
                    mutableLiveData.postValue(queryGpsDetailByStartTime);
                }
            }
        });
    }
}
