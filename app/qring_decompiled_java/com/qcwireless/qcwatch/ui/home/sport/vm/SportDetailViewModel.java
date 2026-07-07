package com.qcwireless.qcwatch.ui.home.sport.vm;

/* compiled from: SportDetailViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/vm/SportDetailViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "sportPlusRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SportPlusRepository;", "userProfileRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SportPlusRepository;Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;)V", "_age", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel$UserAge;", "_ui", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/SportPlusDetail;", "age", "Landroidx/lifecycle/LiveData;", "getAge", "()Landroidx/lifecycle/LiveData;", "ui", "getUi", "", "querySportDetail", "type", "", "startTime", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SportDetailViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge> _age;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail> _ui;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository;
    private final com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;

    public SportDetailViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository, com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportPlusRepository, "sportPlusRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        this.sportPlusRepository = sportPlusRepository;
        this.userProfileRepository = userProfileRepository;
        this._ui = new androidx.lifecycle.MutableLiveData<>();
        this._age = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail> getUi() {
        return this._ui;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge> getAge() {
        return this._age;
    }

    /* renamed from: getAge, reason: collision with other method in class */
    public final void m1211getAge() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel$getAge$1(this, null), 3, (java.lang.Object) null);
    }

    public final void querySportDetail(final int type, final long startTime) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel$querySportDetail$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.sport.vm.SportDetailViewModel sportDetailViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportDetailViewModel, "$this$ktxRunOnBgSingle");
                sportPlusRepository = sportDetailViewModel.sportPlusRepository;
                com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail queryByTypeAndStartTime = sportPlusRepository.queryByTypeAndStartTime(type, startTime);
                if (queryByTypeAndStartTime != null) {
                    mutableLiveData = sportDetailViewModel._ui;
                    mutableLiveData.postValue(queryByTypeAndStartTime);
                }
            }
        });
    }
}
