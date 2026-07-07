package com.qcwireless.qcwatch.ui.mine.feedback;

/* compiled from: FeedbackViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019J\u001c\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/feedback/FeedbackViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "feedbackRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/FeedbackRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/mine/FeedbackRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/mine/feedback/FeedbackViewModel$FeedBackUI;", "featuresList", "", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/FeedbackEntity;", "getFeaturesList", "()Ljava/util/List;", "firmwareList", "getFirmwareList", "hardwareList", "getHardwareList", "imageList", "Lcom/qcwireless/qcwatch/ui/mine/feedback/bean/FeedbackImageBean;", "getImageList", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "downloadListFromServer", "", "language", "", "queryAll", "submitFeedback", "params", "Lcom/qcwireless/qcwatch/ui/base/bean/request/user/FeedbackRequest;", "files", "Ljava/io/File;", "FeedBackUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class FeedbackViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.FeedBackUI> _uiState;
    private final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity> featuresList;
    private final com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository feedbackRepository;
    private final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity> firmwareList;
    private final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity> hardwareList;
    private final java.util.List<com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean> imageList;

    public FeedbackViewModel(com.qcwireless.qcwatch.ui.base.repository.mine.FeedbackRepository feedbackRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feedbackRepository, "feedbackRepository");
        this.feedbackRepository = feedbackRepository;
        this.featuresList = new java.util.ArrayList();
        this.firmwareList = new java.util.ArrayList();
        this.hardwareList = new java.util.ArrayList();
        this.imageList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity> getFeaturesList() {
        return this.featuresList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity> getFirmwareList() {
        return this.firmwareList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.FeedbackEntity> getHardwareList() {
        return this.hardwareList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.mine.feedback.bean.FeedbackImageBean> getImageList() {
        return this.imageList;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.FeedBackUI> getUiState() {
        return this._uiState;
    }

    public final void queryAll() {
        this.featuresList.clear();
        this.firmwareList.clear();
        this.hardwareList.clear();
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$queryAll$1(this, null), 3, (java.lang.Object) null);
    }

    public final void downloadListFromServer(java.lang.String language) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$downloadListFromServer$1(this, language, null), 3, (java.lang.Object) null);
    }

    public final void submitFeedback(com.qcwireless.qcwatch.ui.base.bean.request.user.FeedbackRequest params, java.util.List<java.io.File> files) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(files, "files");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel$submitFeedback$1(this, params, files, null), 3, (java.lang.Object) null);
    }

    /* compiled from: FeedbackViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/feedback/FeedbackViewModel$FeedBackUI;", "", "success", "", "(Z)V", "getSuccess", "()Z", "component1", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class FeedBackUI {
        private final boolean success;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.FeedBackUI copy$default(com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.FeedBackUI feedBackUI, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = feedBackUI.success;
            }
            return feedBackUI.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public final com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.FeedBackUI copy(boolean success) {
            return new com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.FeedBackUI(success);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.FeedBackUI) && this.success == ((com.qcwireless.qcwatch.ui.mine.feedback.FeedbackViewModel.FeedBackUI) other).success;
        }

        public int hashCode() {
            boolean z = this.success;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public java.lang.String toString() {
            return "FeedBackUI(success=" + this.success + ')';
        }

        public FeedBackUI(boolean z) {
            this.success = z;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }
}
