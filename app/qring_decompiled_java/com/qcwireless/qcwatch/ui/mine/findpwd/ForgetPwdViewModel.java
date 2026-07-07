package com.qcwireless.qcwatch.ui.mine.findpwd;

/* compiled from: ForgetPwdViewModel.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/findpwd/ForgetPwdViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "findPwdRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/FindPwdRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/mine/FindPwdRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/mine/findpwd/ForgetPwdViewModel$ForgetPwdUI;", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "resetPwd", "", "code", "", "account", "password", "sendVerifyCode", "ForgetPwdUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class ForgetPwdViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel.ForgetPwdUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository findPwdRepository;

    public ForgetPwdViewModel(com.qcwireless.qcwatch.ui.base.repository.mine.FindPwdRepository findPwdRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(findPwdRepository, "findPwdRepository");
        this.findPwdRepository = findPwdRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel.ForgetPwdUI> getUiState() {
        return this._uiState;
    }

    public final void sendVerifyCode(java.lang.String account) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(account, "account");
        launchOnUI(new com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel$sendVerifyCode$1(this, account, null));
    }

    public final void resetPwd(java.lang.String code, java.lang.String account, java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "code");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(account, "account");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
        launchOnUI(new com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel$resetPwd$1(this, code, account, password, null));
    }

    /* compiled from: ForgetPwdViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/findpwd/ForgetPwdViewModel$ForgetPwdUI;", "", "isLoading", "", "type", "", "(ZI)V", "()Z", "getType", "()I", "component1", "component2", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class ForgetPwdUI {
        private final boolean isLoading;
        private final int type;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel.ForgetPwdUI copy$default(com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel.ForgetPwdUI forgetPwdUI, boolean z, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                z = forgetPwdUI.isLoading;
            }
            if ((i2 & 2) != 0) {
                i = forgetPwdUI.type;
            }
            return forgetPwdUI.copy(z, i);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component2, reason: from getter */
        public final int getType() {
            return this.type;
        }

        public final com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel.ForgetPwdUI copy(boolean isLoading, int type) {
            return new com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel.ForgetPwdUI(isLoading, type);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel.ForgetPwdUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel.ForgetPwdUI forgetPwdUI = (com.qcwireless.qcwatch.ui.mine.findpwd.ForgetPwdViewModel.ForgetPwdUI) other;
            return this.isLoading == forgetPwdUI.isLoading && this.type == forgetPwdUI.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.isLoading;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + this.type;
        }

        public java.lang.String toString() {
            return "ForgetPwdUI(isLoading=" + this.isLoading + ", type=" + this.type + ')';
        }

        public ForgetPwdUI(boolean z, int i) {
            this.isLoading = z;
            this.type = i;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final int getType() {
            return this.type;
        }
    }
}
