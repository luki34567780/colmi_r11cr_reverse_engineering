package com.qcwireless.qcwatch.ui.mine.register;

/* compiled from: RegisterViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u001e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/register/RegisterViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "registerRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/RegisterRepository;", "userProfileRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/mine/RegisterRepository;Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "Lcom/qcwireless/qcwatch/ui/base/bean/response/mine/UserLoginResp;", "registerUI", "Landroidx/lifecycle/LiveData;", "getRegisterUI", "()Landroidx/lifecycle/LiveData;", "insertOrUpdateProfile", "", com.google.android.gms.common.Scopes.EMAIL, "", "register", "account", "password", "type", "", "registerChina", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class RegisterViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp>> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.mine.RegisterRepository registerRepository;
    private final com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;

    public RegisterViewModel(com.qcwireless.qcwatch.ui.base.repository.mine.RegisterRepository registerRepository, com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registerRepository, "registerRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        this.registerRepository = registerRepository;
        this.userProfileRepository = userProfileRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp>> getRegisterUI() {
        return this._uiState;
    }

    public final void register(java.lang.String account, java.lang.String password, int type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(account, "account");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
        launchOnUI(new com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel$register$1(this, account, password, type, null));
    }

    public final void registerChina(java.lang.String account, java.lang.String password, int type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(account, "account");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
        launchOnUI(new com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel$registerChina$1(this, account, password, type, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertOrUpdateProfile(final java.lang.String email, final com.qcwireless.qcwatch.ui.base.repository.mine.NetState<com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp> register) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel$insertOrUpdateProfile$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.mine.register.RegisterViewModel registerViewModel) {
                androidx.lifecycle.MutableLiveData mutableLiveData;
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;
                com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository2;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registerViewModel, "$this$ktxRunOnBgSingle");
                com.qcwireless.qcwatch.ui.base.bean.response.mine.UserLoginResp isSuccess = register.isSuccess();
                if (isSuccess == null || isSuccess.getRetCode() != 0) {
                    mutableLiveData = registerViewModel._uiState;
                    mutableLiveData.postValue(register);
                    return;
                }
                userProfileRepository = registerViewModel.userProfileRepository;
                if (userProfileRepository.queryUserByUid(isSuccess.getUid()) == null) {
                    com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity(isSuccess.getUid(), email, "", 1, 60.0f, 120, 175.0f, "1995-01", "", "", 10000, 200.0f, 5.0f, 1.5f, 8.0f, isSuccess.getRegisterDate(), 0);
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setUserToken(isSuccess.getToken());
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setUserEmail(email);
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setUid(isSuccess.getUid());
                    com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
                    userProfileRepository2 = registerViewModel.userProfileRepository;
                    userProfileRepository2.insertUser(userEntity);
                    mutableLiveData2 = registerViewModel._uiState;
                    mutableLiveData2.postValue(register);
                }
            }
        });
    }
}
