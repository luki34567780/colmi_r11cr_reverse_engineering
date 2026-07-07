package com.qcwireless.qcwatch.ui.home.gps.vm;

/* compiled from: GPSRunActivityViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/vm/GPSRunActivityViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "gpsRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/gps/GpsRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/gps/GpsRepository;)V", "saveGpsDetail", "", "entity", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/GpsDetail;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GPSRunActivityViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository gpsRepository;

    public GPSRunActivityViewModel(com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository gpsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRepository, "gpsRepository");
        this.gpsRepository = gpsRepository;
    }

    public final void saveGpsDetail(final com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel$saveGpsDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.gps.vm.GPSRunActivityViewModel gPSRunActivityViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository gpsRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gPSRunActivityViewModel, "$this$ktxRunOnBgSingle");
                gpsRepository = gPSRunActivityViewModel.gpsRepository;
                gpsRepository.saveGpsDetail(com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail.this);
            }
        });
    }
}
