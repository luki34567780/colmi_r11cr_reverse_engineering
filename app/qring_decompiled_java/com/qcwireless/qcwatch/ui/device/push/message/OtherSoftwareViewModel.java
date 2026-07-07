package com.qcwireless.qcwatch.ui.device.push.message;

/* compiled from: OtherSoftwareViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/message/OtherSoftwareViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "mpRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/MessagePushRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/MessagePushRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/device/push/message/MessagePushViewModel$MessagePushUI;", "softList", "", "Lcom/qcwireless/qcwatch/ui/device/push/bean/SoftwarePush;", "getSoftList", "()Ljava/util/List;", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "queryOpenSoftWare", "", "activity", "Landroid/app/Activity;", "saveBean", "entity", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class OtherSoftwareViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI> _uiState;
    private com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository mpRepository;
    private final java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> softList;

    public OtherSoftwareViewModel(com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messagePushRepository, "mpRepository");
        this.mpRepository = messagePushRepository;
        this.softList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> getSoftList() {
        return this.softList;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI> getUiState() {
        return this._uiState;
    }

    public final void queryOpenSoftWare(final android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel$queryOpenSoftWare$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel otherSoftwareViewModel) {
                androidx.lifecycle.MutableLiveData mutableLiveData;
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otherSoftwareViewModel, "$this$ktxRunOnBgSingle");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                android.content.pm.PackageManager packageManager = activity.getPackageManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "activity.packageManager");
                android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
                for (android.content.pm.ResolveInfo resolveInfo : queryIntentActivities) {
                    java.lang.String obj = resolveInfo.activityInfo.loadLabel(packageManager).toString();
                    java.lang.String str = resolveInfo.activityInfo.packageName;
                    android.graphics.drawable.Drawable loadIcon = resolveInfo.activityInfo.loadIcon(packageManager);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "packageName");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loadIcon, "icon");
                    arrayList2.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(obj, str, false, loadIcon));
                }
                java.util.Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush softwarePush = (com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush) it.next();
                        messagePushRepository = otherSoftwareViewModel.mpRepository;
                        com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity queryByPackageName = messagePushRepository.queryByPackageName(softwarePush.getPackageName());
                        if (queryByPackageName == null) {
                            arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(softwarePush.getName(), softwarePush.getPackageName(), false, softwarePush.getIcon()));
                        } else if (queryByPackageName.getOpen() == 3) {
                            arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(softwarePush.getName(), softwarePush.getPackageName(), queryByPackageName.getOpen() == 3, softwarePush.getIcon()));
                        }
                    } else {
                        mutableLiveData = otherSoftwareViewModel._uiState;
                        mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI(true, arrayList));
                        return;
                    }
                }
            }
        });
    }

    public final void saveBean(final com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel$saveBean$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.push.message.OtherSoftwareViewModel otherSoftwareViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository;
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otherSoftwareViewModel, "$this$ktxRunOnBgSingle");
                if (com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush.this.getSwitch()) {
                    messagePushRepository2 = otherSoftwareViewModel.mpRepository;
                    messagePushRepository2.saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush.this.getPackageName(), 3));
                } else {
                    messagePushRepository = otherSoftwareViewModel.mpRepository;
                    messagePushRepository.deleteByPackageName(com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush.this.getPackageName());
                }
            }
        });
    }
}
