package com.qcwireless.qcwatch.ui.device.push.message;

/* compiled from: MessagePushViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000f¨\u0006#"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/message/MessagePushViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "mpRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/MessagePushRepository;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/MessagePushRepository;Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_deviceSetting", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "_uiState", "Lcom/qcwireless/qcwatch/ui/device/push/message/MessagePushViewModel$MessagePushUI;", "deviceSetting", "Landroidx/lifecycle/LiveData;", "getDeviceSetting", "()Landroidx/lifecycle/LiveData;", "softList", "", "Lcom/qcwireless/qcwatch/ui/device/push/bean/SoftwarePush;", "getSoftList", "()Ljava/util/List;", "uiState", "getUiState", "initData", "", "initDeviceSetting", "queryOpenSoftWare", "activity", "Landroid/app/Activity;", "saveBean", "entity", "saveDeviceSetting", "deviceSettingEntity", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/DeviceSettingEntity;", "MessagePushUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MessagePushViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> _deviceSetting;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
    private com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository mpRepository;
    private final java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> softList;

    public MessagePushViewModel(com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository, com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messagePushRepository, "mpRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.mpRepository = messagePushRepository;
        this.deviceSettingRepository = deviceSettingRepository;
        this.softList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._deviceSetting = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> getSoftList() {
        return this.softList;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> getDeviceSetting() {
        return this._deviceSetting;
    }

    public final void initData() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingleAnother(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel$initData$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel messagePushViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messagePushViewModel, "$this$ktxRunOnBgSingleAnother");
                messagePushRepository = messagePushViewModel.mpRepository;
                messagePushRepository.initData();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.SetANCSReq());
                mutableLiveData = messagePushViewModel._uiState;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI(false, arrayList));
            }
        });
    }

    public final void initDeviceSetting() {
        launchOnUI(new com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel$initDeviceSetting$1(this, null));
    }

    public final void queryOpenSoftWare(final android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel$queryOpenSoftWare$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
             */
            public final void invoke(com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel messagePushViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository;
                boolean z;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messagePushViewModel, "$this$ktxRunOnBgSingle");
                final java.util.ArrayList arrayList = new java.util.ArrayList();
                messagePushRepository = messagePushViewModel.mpRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity> queryByOpen = messagePushRepository.queryByOpen(3);
                if (queryByOpen != null) {
                    for (com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity messagePushEntity : queryByOpen) {
                        java.lang.String packageName = messagePushEntity.getPackageName();
                        switch (packageName.hashCode()) {
                            case -1901151293:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.ZALO)) {
                                    java.lang.String string = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_597);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.zalo);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.ZALO, z, drawable));
                                    break;
                                } else {
                                    break;
                                }
                            case -1897170512:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Telegram)) {
                                    java.lang.String string2 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_427);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.telegram);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable2);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string2, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Telegram, z, drawable2));
                                    break;
                                } else {
                                    break;
                                }
                            case -1651733025:
                                if (packageName.equals("com.viber.voip")) {
                                    java.lang.String string3 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_423);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable3 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.viber);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable3);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string3, "com.viber.voip", z, drawable3));
                                    break;
                                } else {
                                    break;
                                }
                            case -1547699361:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.whatsapp)) {
                                    java.lang.String string4 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_419);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable4 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.whatsap);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable4);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string4, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.whatsapp, z, drawable4));
                                    break;
                                } else {
                                    break;
                                }
                            case -1521143749:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.LINE)) {
                                    java.lang.String string5 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_431);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable5 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.line);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable5);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string5, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.LINE, z, drawable5));
                                    break;
                                } else {
                                    break;
                                }
                            case -973170826:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.wechat)) {
                                    java.lang.String string6 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_434);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable6 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.wechat);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable6);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string6, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.wechat, z, drawable6));
                                    break;
                                } else {
                                    break;
                                }
                            case -662003450:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.instagram)) {
                                    java.lang.String string7 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_422);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable7 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.instagram);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable7);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string7, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.instagram, z, drawable7));
                                    break;
                                } else {
                                    break;
                                }
                            case -583737491:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Pinterest)) {
                                    java.lang.String string8 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_432);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable8 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.pinterest);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable8);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string8, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Pinterest, z, drawable8));
                                    break;
                                } else {
                                    break;
                                }
                            case -543674259:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Gmail)) {
                                    java.lang.String string9 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_428);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable9 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.gmail);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable9);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string9, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Gmail, z, drawable9));
                                    break;
                                } else {
                                    break;
                                }
                            case 10619783:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.TWITTER)) {
                                    java.lang.String string10 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_424);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable10 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.twitter);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable10);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string10, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.TWITTER, z, drawable10));
                                    break;
                                } else {
                                    break;
                                }
                            case 361910168:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.qq)) {
                                    java.lang.String string11 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_433);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable11 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.qq);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable11);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string11, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.qq, z, drawable11));
                                    break;
                                } else {
                                    break;
                                }
                            case 714499313:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.FACEBOOK_1)) {
                                    java.lang.String string12 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_421);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable12 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.facebook);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable12);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string12, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.FACEBOOK_1, z, drawable12));
                                    break;
                                } else {
                                    break;
                                }
                            case 908140028:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.FACEBOOK)) {
                                    java.lang.String string13 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_425);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable13 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.messenger);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable13);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string13, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.FACEBOOK, z, drawable13));
                                    break;
                                } else {
                                    break;
                                }
                            case 1120358242:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE3)) {
                                    java.lang.String string14 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_418);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable14 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.skype);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable14);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string14, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE3, z, drawable14));
                                    break;
                                } else {
                                    break;
                                }
                            case 1153658444:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.linkedin)) {
                                    java.lang.String string15 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_420);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable15 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.linkedln);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable15);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string15, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.linkedin, z, drawable15));
                                    break;
                                } else {
                                    break;
                                }
                            case 1249065348:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.KAKAOTALK)) {
                                    java.lang.String string16 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_430);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable16 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.kakaotalk);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable16);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string16, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.KAKAOTALK, z, drawable16));
                                    break;
                                } else {
                                    break;
                                }
                            case 1256689897:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Tumblr)) {
                                    java.lang.String string17 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_426);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable17 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.tumblr);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable17);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string17, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.Tumblr, z, drawable17));
                                    break;
                                } else {
                                    break;
                                }
                            case 2094270320:
                                if (packageName.equals(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.snapchat)) {
                                    java.lang.String string18 = com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_429);
                                    z = messagePushEntity.getOpen() == 1;
                                    android.graphics.drawable.Drawable drawable18 = androidx.core.content.ContextCompat.getDrawable(activity, com.qcwireless.qcwatch.R.mipmap.snapchat);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(drawable18);
                                    arrayList.add(new com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush(string18, com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.snapchat, z, drawable18));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                if (arrayList.size() > 1) {
                    kotlin.collections.CollectionsKt.sortWith(arrayList, new java.util.Comparator() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel$queryOpenSoftWare$1$invoke$$inlined$sortByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Boolean.valueOf(((com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush) t2).getSwitch()), java.lang.Boolean.valueOf(((com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush) t).getSwitch()));
                        }
                    });
                }
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(messagePushViewModel, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel$queryOpenSoftWare$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel messagePushViewModel2) {
                        androidx.lifecycle.MutableLiveData mutableLiveData;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messagePushViewModel2, "$this$ktxRunOnUi");
                        mutableLiveData = messagePushViewModel2._uiState;
                        mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI(true, arrayList));
                    }
                });
            }
        });
    }

    public final void saveBean(final com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel$saveBean$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel messagePushViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository;
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository2;
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository3;
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository4;
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository5;
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository6;
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository7;
                com.qcwireless.qcwatch.ui.base.repository.device.MessagePushRepository messagePushRepository8;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messagePushViewModel, "$this$ktxRunOnBgSingle");
                if (com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush.this.getSwitch()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush.this.getPackageName(), com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE3)) {
                        messagePushRepository6 = messagePushViewModel.mpRepository;
                        messagePushRepository6.saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE3, 1));
                        messagePushRepository7 = messagePushViewModel.mpRepository;
                        messagePushRepository7.saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE2, 1));
                        messagePushRepository8 = messagePushViewModel.mpRepository;
                        messagePushRepository8.saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE1, 1));
                        return;
                    }
                    messagePushRepository5 = messagePushViewModel.mpRepository;
                    messagePushRepository5.saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush.this.getPackageName(), 1));
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush.this.getPackageName(), com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE3)) {
                    messagePushRepository2 = messagePushViewModel.mpRepository;
                    messagePushRepository2.saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE3, 2));
                    messagePushRepository3 = messagePushViewModel.mpRepository;
                    messagePushRepository3.saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE2, 2));
                    messagePushRepository4 = messagePushViewModel.mpRepository;
                    messagePushRepository4.saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.utils.SoftwarePackageAction.SKYPE1, 2));
                    return;
                }
                messagePushRepository = messagePushViewModel.mpRepository;
                messagePushRepository.saveData(new com.qcwireless.qcwatch.ui.base.repository.entity.MessagePushEntity(com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush.this.getPackageName(), 2));
            }
        });
    }

    public final void saveDeviceSetting(com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity deviceSettingEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingEntity, "deviceSettingEntity");
        launchOnUI(new com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel$saveDeviceSetting$1(this, deviceSettingEntity, null));
    }

    /* compiled from: MessagePushViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/push/message/MessagePushViewModel$MessagePushUI;", "", "initFlag", "", "data", "", "Lcom/qcwireless/qcwatch/ui/device/push/bean/SoftwarePush;", "(ZLjava/util/List;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getInitFlag", "()Z", "component1", "component2", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class MessagePushUI {
        private java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> data;
        private final boolean initFlag;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MessagePushUI() {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                r2 = 3
                r3.<init>(r0, r1, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI.<init>():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI copy$default(com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI messagePushUI, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = messagePushUI.initFlag;
            }
            if ((i & 2) != 0) {
                list = messagePushUI.data;
            }
            return messagePushUI.copy(z, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getInitFlag() {
            return this.initFlag;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> component2() {
            return this.data;
        }

        public final com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI copy(boolean initFlag, java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> data) {
            return new com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI(initFlag, data);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI messagePushUI = (com.qcwireless.qcwatch.ui.device.push.message.MessagePushViewModel.MessagePushUI) other;
            return this.initFlag == messagePushUI.initFlag && kotlin.jvm.internal.Intrinsics.areEqual(this.data, messagePushUI.data);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.initFlag;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> list = this.data;
            return i + (list == null ? 0 : list.hashCode());
        }

        public java.lang.String toString() {
            return "MessagePushUI(initFlag=" + this.initFlag + ", data=" + this.data + ')';
        }

        public MessagePushUI(boolean z, java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> list) {
            this.initFlag = z;
            this.data = list;
        }

        public /* synthetic */ MessagePushUI(boolean z, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list);
        }

        public final boolean getInitFlag() {
            return this.initFlag;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> getData() {
            return this.data;
        }

        public final void setData(java.util.List<com.qcwireless.qcwatch.ui.device.push.bean.SoftwarePush> list) {
            this.data = list;
        }
    }
}
