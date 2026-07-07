package com.qcwireless.qcwatch.ui.mine.ucenter;

/* compiled from: UserProfileActivity.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\"H\u0014J\b\u0010&\u001a\u00020\"H\u0014J\b\u0010'\u001a\u00020\"H\u0014J\b\u0010(\u001a\u00020\"H\u0002J\u000e\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020\"H\u0014J\u0006\u0010-\u001a\u00020\"J\u0006\u0010.\u001a\u00020\"J\u0006\u0010/\u001a\u00020\"J\u0006\u00100\u001a\u00020\"J\u0006\u00101\u001a\u00020\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u00062"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/ucenter/UserProfileActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityUserProfileBinding;", "birthdayDialog", "Lcom/qcwireless/qcwatch/base/dialog/BottomBirthdayDialog;", "bottomDialog", "Lcom/qcwireless/qcwatch/base/dialog/BottomHeightWeightDialog;", "deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "genderDialog", "Lcom/qcwireless/qcwatch/base/dialog/BottomListDialog;", "heightDialog", "<set-?>", "", "metric", "getMetric", "()Z", "setMetric", "(Z)V", "metric$delegate", "Lkotlin/properties/ReadWriteProperty;", "nickNameDialog", "Lcom/qcwireless/qcwatch/base/dialog/EditTextDialog;", "userEntity", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;", "viewModel", "Lcom/qcwireless/qcwatch/ui/mine/ucenter/UserProfileViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/mine/ucenter/UserProfileViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStop", "refreshHeightAndWeight", "setNickNameDialog", "text", "", "setupViews", "showBirthdayDialog", "showGenderDialog", "showHeightDialog", "showLogOffDialog", "showWeightDialog", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class UserProfileActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] $$delegatedProperties = {(kotlin.reflect.KProperty) kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.class, "metric", "getMetric()Z", 0))};
    private com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding binding;
    private com.qcwireless.qcwatch.base.dialog.BottomBirthdayDialog birthdayDialog;
    private com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomDialog;
    private com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;
    private com.qcwireless.qcwatch.base.dialog.BottomListDialog genderDialog;
    private com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog heightDialog;

    /* renamed from: metric$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ReadWriteProperty metric = kotlin.properties.Delegates.INSTANCE.notNull();
    private com.qcwireless.qcwatch.base.dialog.EditTextDialog nickNameDialog;
    private com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public UserProfileActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel>() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel m1357invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getMetric() {
        return ((java.lang.Boolean) this.metric.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setMetric(boolean z) {
        this.metric.setValue(this, $$delegatedProperties[0], java.lang.Boolean.valueOf(z));
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding inflate = com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        androidx.constraintlayout.widget.ConstraintLayout root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView((android.view.View) root);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        showLoadingDialogTimeout(1000);
        getViewModel().queryUserByUidUI();
        getViewModel().initDialogData();
        setMetric(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric());
        com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding = this.binding;
        if (activityUserProfileBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityUserProfileBinding = null;
        }
        activityUserProfileBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_151));
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityUserProfileBinding.titleBar.tvRightText);
        activityUserProfileBinding.titleBar.tvRightText.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_79));
        activityUserProfileBinding.userCenterHeight.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$setupViews$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this.showHeightDialog();
            }
        });
        activityUserProfileBinding.userCenterWeight.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$setupViews$1$2
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this.showWeightDialog();
            }
        });
        activityUserProfileBinding.userCenterBirthday.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$setupViews$1$3
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this.showBirthdayDialog();
            }
        });
        activityUserProfileBinding.userCenterGender.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$setupViews$1$4
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this.showGenderDialog();
            }
        });
        activityUserProfileBinding.userLogOff.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$setupViews$1$5
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this.showLogOffDialog();
            }
        });
        activityUserProfileBinding.userCenterName.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$setupViews$1$6
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity;
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity2;
                userEntity = com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this.userEntity;
                if (userEntity != null) {
                    com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity userProfileActivity = com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this;
                    userEntity2 = userProfileActivity.userEntity;
                    if (userEntity2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                        userEntity2 = null;
                    }
                    userProfileActivity.setNickNameDialog(userEntity2.getNickName());
                    return;
                }
                long uid = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid();
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this.userEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity(uid, "", "", 1, 60.0f, 120, 175.0f, "1995-01", "", "", 10000, 200.0f, 5.0f, 1.5f, 8.0f, y_m_d, 0);
            }
        });
        activityUserProfileBinding.btnExit.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.m1348setupViews$lambda2$lambda0(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this, view);
            }
        });
        activityUserProfileBinding.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.m1349setupViews$lambda2$lambda1(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this, view);
            }
        });
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.m1350setupViews$lambda4(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this, (com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI) obj);
            }
        });
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$setupViews$3(this, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2$lambda-0, reason: not valid java name */
    public static final void m1348setupViews$lambda2$lambda0(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity userProfileActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLoginStatus(false);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.ui.mine.MineFragment.class));
        userProfileActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2$lambda-1, reason: not valid java name */
    public static final void m1349setupViews$lambda2$lambda1(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity userProfileActivity, android.view.View view) {
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        if (userProfileActivity.userEntity != null) {
            com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel viewModel = userProfileActivity.getViewModel();
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = userProfileActivity.userEntity;
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity2 = null;
            if (userEntity == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                userEntity = null;
            }
            viewModel.saveUserEntity(userEntity);
            com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel viewModel2 = userProfileActivity.getViewModel();
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity3 = userProfileActivity.userEntity;
            if (userEntity3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                userEntity3 = null;
            }
            viewModel2.updateUserProfile(userEntity3);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(userProfileActivity.getMetric());
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$setupViews$1$8$2(userProfileActivity, null), 3, (java.lang.Object) null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity4 = userProfileActivity.userEntity;
            if (userEntity4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                userEntity4 = null;
            }
            sb.append(userEntity4.getBirthday());
            sb.append("-01");
            int ageByBirthday = com.qcwireless.qc_utils.date.DateUtil.getAgeByBirthday(com.qcwireless.qc_utils.date.DateUtil.String2Date("yyyy-MM-dd", sb.toString()));
            com.oudmon.ble.base.communication.LargeDataHandler largeDataHandler = com.oudmon.ble.base.communication.LargeDataHandler.getInstance();
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity5 = userProfileActivity.userEntity;
            if (userEntity5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                userEntity5 = null;
            }
            largeDataHandler.setDeviceNickName(userEntity5.getNickName());
            com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel viewModel3 = userProfileActivity.getViewModel();
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = userProfileActivity.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting = null;
            } else {
                deviceSetting = deviceSetting2;
            }
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity6 = userProfileActivity.userEntity;
            if (userEntity6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                userEntity6 = null;
            }
            int gender = userEntity6.getGender() - 1;
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity7 = userProfileActivity.userEntity;
            if (userEntity7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                userEntity7 = null;
            }
            int height = (int) userEntity7.getHeight();
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity8 = userProfileActivity.userEntity;
            if (userEntity8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
            } else {
                userEntity2 = userEntity8;
            }
            viewModel3.execUserInfoToDevice(deviceSetting, gender, ageByBirthday, height, (int) userEntity2.getWeight());
        }
        userProfileActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m1350setupViews$lambda4(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity userProfileActivity, com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI profileUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding = userProfileActivity.binding;
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = null;
        if (activityUserProfileBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityUserProfileBinding = null;
        }
        userProfileActivity.userEntity = profileUI.getEntity();
        activityUserProfileBinding.userCenterName.setRightText(profileUI.getNick());
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity2 = userProfileActivity.userEntity;
        if (userEntity2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
            userEntity2 = null;
        }
        if (userEntity2.getGender() == 0) {
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity3 = userProfileActivity.userEntity;
            if (userEntity3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                userEntity3 = null;
            }
            userEntity3.setGender(1);
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(profileUI.getGender()));
        int gender = profileUI.getGender();
        if (gender == 1) {
            activityUserProfileBinding.userCenterGender.setRightText(userProfileActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_152));
        } else if (gender == 2) {
            activityUserProfileBinding.userCenterGender.setRightText(userProfileActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_153));
        } else if (gender == 3) {
            activityUserProfileBinding.userCenterGender.setRightText(userProfileActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_6666039));
        }
        java.lang.String birthday = profileUI.getBirthday();
        if (birthday.length() == 0) {
            birthday = new com.qcwireless.qc_utils.date.DateUtil().getYyyyMMDate();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(birthday, "DateUtil().yyyyMMDate");
        }
        com.qcwireless.qc_utils.date.DateUtil parse = com.qcwireless.qc_utils.date.DateUtil.parse(birthday, com.qcwireless.qc_utils.date.DateUtil.DateFormater.yyyyMM);
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = activityUserProfileBinding.userCenterBirthday;
        com.qcwireless.qcwatch.base.utils.QcDateUtil getInstance = com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "d");
        qSettingItem.setRightText(getInstance.localDateNoDayFormat(parse));
        if (userProfileActivity.getMetric()) {
            activityUserProfileBinding.userCenterWeight.setRightText(profileUI.getWeight() + "kg");
            activityUserProfileBinding.userCenterHeight.setRightText(profileUI.getHeight() + "cm");
            return;
        }
        int cmToIn = com.qcwireless.qcwatch.base.utils.MetricUtilsKt.cmToIn(profileUI.getHeight());
        activityUserProfileBinding.userCenterHeight.setRightText((cmToIn / 12) + "ft" + (cmToIn % 12) + "in");
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem2 = activityUserProfileBinding.userCenterWeight;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(profileUI.getWeightLbs());
        sb.append("lbs");
        qSettingItem2.setRightText(sb.toString());
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity4 = userProfileActivity.userEntity;
        if (userEntity4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
        } else {
            userEntity = userEntity4;
        }
        userEntity.setWeightLbs(profileUI.getWeightLbs());
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding = null;
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLoginStatus()) {
            com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding2 = this.binding;
            if (activityUserProfileBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityUserProfileBinding = activityUserProfileBinding2;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityUserProfileBinding.btnExit);
        } else {
            com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding3 = this.binding;
            if (activityUserProfileBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityUserProfileBinding = activityUserProfileBinding3;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityUserProfileBinding.btnExit);
        }
        if (this.userEntity == null) {
            getViewModel().queryUserByUidUI();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onStop() {
        super.onStop();
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$onStop$1(this, null), 3, (java.lang.Object) null);
    }

    private final void refreshHeightAndWeight() {
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = null;
        if (getMetric()) {
            com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding = this.binding;
            if (activityUserProfileBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityUserProfileBinding = null;
            }
            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = activityUserProfileBinding.userCenterWeight;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity2 = this.userEntity;
            if (userEntity2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                userEntity2 = null;
            }
            sb.append((int) userEntity2.getWeight());
            sb.append("kg");
            qSettingItem.setRightText(sb.toString());
            com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding2 = this.binding;
            if (activityUserProfileBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityUserProfileBinding2 = null;
            }
            com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem2 = activityUserProfileBinding2.userCenterHeight;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity3 = this.userEntity;
            if (userEntity3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
            } else {
                userEntity = userEntity3;
            }
            sb2.append((int) userEntity.getHeight());
            sb2.append("cm");
            qSettingItem2.setRightText(sb2.toString());
            return;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity4 = this.userEntity;
        if (userEntity4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
            userEntity4 = null;
        }
        int cmToIn = com.qcwireless.qcwatch.base.utils.MetricUtilsKt.cmToIn((int) userEntity4.getHeight());
        java.lang.String str = (cmToIn / 12) + "ft" + (cmToIn % 12) + "in";
        com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding3 = this.binding;
        if (activityUserProfileBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityUserProfileBinding3 = null;
        }
        activityUserProfileBinding3.userCenterHeight.setRightText(str);
        com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding4 = this.binding;
        if (activityUserProfileBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityUserProfileBinding4 = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem3 = activityUserProfileBinding4.userCenterWeight;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity5 = this.userEntity;
        if (userEntity5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
        } else {
            userEntity = userEntity5;
        }
        sb3.append(userEntity.getWeightLbs());
        sb3.append("lbs");
        qSettingItem3.setRightText(sb3.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showHeightDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog;
        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog create = new com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.Builder(getActivity()).create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
        this.heightDialog = create;
        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog2 = null;
        if (create == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heightDialog");
            bottomHeightWeightDialog = null;
        } else {
            bottomHeightWeightDialog = create;
        }
        bottomHeightWeightDialog.initData((android.content.Context) this, getViewModel().getMHeightList(), getViewModel().getIHeightList(), getMetric(), true);
        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog3 = this.heightDialog;
        if (bottomHeightWeightDialog3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heightDialog");
            bottomHeightWeightDialog3 = null;
        }
        bottomHeightWeightDialog3.setDialogTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_145));
        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog4 = this.heightDialog;
        if (bottomHeightWeightDialog4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heightDialog");
            bottomHeightWeightDialog4 = null;
        }
        bottomHeightWeightDialog4.setListener(new com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.DialogSaveClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$$ExternalSyntheticLambda6
            @Override // com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.DialogSaveClickListener
            public final void itemClick(int i, boolean z, boolean z2) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.m1353showHeightDialog$lambda5(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this, i, z, z2);
            }
        });
        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog5 = this.heightDialog;
        if (bottomHeightWeightDialog5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heightDialog");
            bottomHeightWeightDialog5 = null;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = this.userEntity;
        if (userEntity == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
            userEntity = null;
        }
        bottomHeightWeightDialog5.setCurrItem((int) userEntity.getHeight(), getMetric());
        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog6 = this.heightDialog;
        if (bottomHeightWeightDialog6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heightDialog");
        } else {
            bottomHeightWeightDialog2 = bottomHeightWeightDialog6;
        }
        bottomHeightWeightDialog2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showHeightDialog$lambda-5, reason: not valid java name */
    public static final void m1353showHeightDialog$lambda5(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity userProfileActivity, int i, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        if (z2) {
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = userProfileActivity.userEntity;
            if (userEntity == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                userEntity = null;
            }
            userEntity.setHeight(i);
            userProfileActivity.refreshHeightAndWeight();
            return;
        }
        userProfileActivity.setMetric(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showWeightDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog;
        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog create = new com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.Builder(getActivity()).create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
        this.bottomDialog = create;
        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog2 = null;
        if (create == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bottomDialog");
            bottomHeightWeightDialog = null;
        } else {
            bottomHeightWeightDialog = create;
        }
        bottomHeightWeightDialog.initData((android.content.Context) this, getViewModel().getMWeightList(), getViewModel().getIWeightList(), getMetric(), false);
        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog3 = this.bottomDialog;
        if (bottomHeightWeightDialog3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bottomDialog");
            bottomHeightWeightDialog3 = null;
        }
        bottomHeightWeightDialog3.setDialogTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_146));
        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog4 = this.bottomDialog;
        if (bottomHeightWeightDialog4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bottomDialog");
            bottomHeightWeightDialog4 = null;
        }
        bottomHeightWeightDialog4.setListener(new com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.DialogSaveClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$$ExternalSyntheticLambda7
            @Override // com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.DialogSaveClickListener
            public final void itemClick(int i, boolean z, boolean z2) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.m1356showWeightDialog$lambda6(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this, i, z, z2);
            }
        });
        if (getMetric()) {
            com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog5 = this.bottomDialog;
            if (bottomHeightWeightDialog5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bottomDialog");
                bottomHeightWeightDialog5 = null;
            }
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = this.userEntity;
            if (userEntity == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                userEntity = null;
            }
            bottomHeightWeightDialog5.setCurrItem((int) userEntity.getWeight(), getMetric());
        } else {
            com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog6 = this.bottomDialog;
            if (bottomHeightWeightDialog6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bottomDialog");
                bottomHeightWeightDialog6 = null;
            }
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity2 = this.userEntity;
            if (userEntity2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                userEntity2 = null;
            }
            bottomHeightWeightDialog6.setCurrItem(userEntity2.getWeightLbs(), getMetric());
        }
        com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog7 = this.bottomDialog;
        if (bottomHeightWeightDialog7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bottomDialog");
        } else {
            bottomHeightWeightDialog2 = bottomHeightWeightDialog7;
        }
        bottomHeightWeightDialog2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showWeightDialog$lambda-6, reason: not valid java name */
    public static final void m1356showWeightDialog$lambda6(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity userProfileActivity, int i, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        if (z2) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(i));
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = null;
            if (z) {
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity2 = userProfileActivity.userEntity;
                if (userEntity2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                    userEntity2 = null;
                }
                userEntity2.setWeight(i);
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity3 = userProfileActivity.userEntity;
                if (userEntity3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                } else {
                    userEntity = userEntity3;
                }
                userEntity.setWeightLbs(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kgToLbs(i));
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Float.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kgToLbs(i)));
            } else {
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity4 = userProfileActivity.userEntity;
                if (userEntity4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                    userEntity4 = null;
                }
                userEntity4.setWeightLbs(i);
                com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity5 = userProfileActivity.userEntity;
                if (userEntity5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                } else {
                    userEntity = userEntity5;
                }
                userEntity.setWeight(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.lbsToKg(i));
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Float.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.lbsToKg(i)));
            }
            userProfileActivity.refreshHeightAndWeight();
            return;
        }
        userProfileActivity.setMetric(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showBirthdayDialog() {
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = this.userEntity;
        com.qcwireless.qcwatch.base.dialog.BottomBirthdayDialog bottomBirthdayDialog = null;
        if (userEntity == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
            userEntity = null;
        }
        java.lang.String birthday = userEntity.getBirthday();
        if (birthday.length() == 0) {
            birthday = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(birthday, "DateUtil().y_M_D");
        }
        com.qcwireless.qc_utils.date.DateUtil parse = com.qcwireless.qc_utils.date.DateUtil.parse(birthday, com.qcwireless.qc_utils.date.DateUtil.DateFormater.yyyyMM);
        com.qcwireless.qcwatch.base.dialog.BottomBirthdayDialog create = new com.qcwireless.qcwatch.base.dialog.BottomBirthdayDialog.Builder(getActivity()).create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
        this.birthdayDialog = create;
        if (create == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("birthdayDialog");
            create = null;
        }
        create.initData((android.content.Context) this);
        com.qcwireless.qcwatch.base.dialog.BottomBirthdayDialog bottomBirthdayDialog2 = this.birthdayDialog;
        if (bottomBirthdayDialog2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("birthdayDialog");
            bottomBirthdayDialog2 = null;
        }
        bottomBirthdayDialog2.setDialogTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_144));
        com.qcwireless.qcwatch.base.dialog.BottomBirthdayDialog bottomBirthdayDialog3 = this.birthdayDialog;
        if (bottomBirthdayDialog3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("birthdayDialog");
            bottomBirthdayDialog3 = null;
        }
        bottomBirthdayDialog3.setListener(new com.qcwireless.qcwatch.base.dialog.BottomBirthdayDialog.DialogSaveClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$$ExternalSyntheticLambda5
            @Override // com.qcwireless.qcwatch.base.dialog.BottomBirthdayDialog.DialogSaveClickListener
            public final void itemClick(int i, int i2) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.m1351showBirthdayDialog$lambda7(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this, i, i2);
            }
        });
        com.qcwireless.qcwatch.base.dialog.BottomBirthdayDialog bottomBirthdayDialog4 = this.birthdayDialog;
        if (bottomBirthdayDialog4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("birthdayDialog");
            bottomBirthdayDialog4 = null;
        }
        bottomBirthdayDialog4.setCurrItem(parse.getYear(), parse.getMonth());
        com.qcwireless.qcwatch.base.dialog.BottomBirthdayDialog bottomBirthdayDialog5 = this.birthdayDialog;
        if (bottomBirthdayDialog5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("birthdayDialog");
        } else {
            bottomBirthdayDialog = bottomBirthdayDialog5;
        }
        bottomBirthdayDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showBirthdayDialog$lambda-7, reason: not valid java name */
    public static final void m1351showBirthdayDialog$lambda7(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity userProfileActivity, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(i, i2, 1);
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = null;
        if (dateUtil.getUnixTimestamp() > new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()) {
            java.lang.String string = userProfileActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_229);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_229)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding = userProfileActivity.binding;
        if (activityUserProfileBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityUserProfileBinding = null;
        }
        activityUserProfileBinding.userCenterBirthday.setRightText(com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateNoDayFormat(dateUtil));
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity2 = userProfileActivity.userEntity;
        if (userEntity2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
        } else {
            userEntity = userEntity2;
        }
        java.lang.String yyyyMMDate = dateUtil.getYyyyMMDate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(yyyyMMDate, "d.yyyyMMDate");
        userEntity.setBirthday(yyyyMMDate);
    }

    public final void showGenderDialog() {
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = this.userEntity;
        com.qcwireless.qcwatch.base.dialog.BottomListDialog bottomListDialog = null;
        if (userEntity == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
            userEntity = null;
        }
        int gender = userEntity.getGender();
        getViewModel().getGenderList().clear();
        getViewModel().getGenderList().add(0, new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_152), gender == 1));
        getViewModel().getGenderList().add(1, new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_153), gender == 2));
        com.qcwireless.qcwatch.base.dialog.BottomListDialog create = new com.qcwireless.qcwatch.base.dialog.BottomListDialog.Builder(getActivity()).create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "builder.create()");
        this.genderDialog = create;
        if (create == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("genderDialog");
            create = null;
        }
        create.show();
        com.qcwireless.qcwatch.base.dialog.BottomListDialog bottomListDialog2 = this.genderDialog;
        if (bottomListDialog2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("genderDialog");
            bottomListDialog2 = null;
        }
        bottomListDialog2.initView();
        com.qcwireless.qcwatch.base.dialog.BottomListDialog bottomListDialog3 = this.genderDialog;
        if (bottomListDialog3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("genderDialog");
            bottomListDialog3 = null;
        }
        bottomListDialog3.setSubTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_154));
        com.qcwireless.qcwatch.base.dialog.BottomListDialog bottomListDialog4 = this.genderDialog;
        if (bottomListDialog4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("genderDialog");
            bottomListDialog4 = null;
        }
        bottomListDialog4.setData(getViewModel().getGenderList());
        com.qcwireless.qcwatch.base.dialog.BottomListDialog bottomListDialog5 = this.genderDialog;
        if (bottomListDialog5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("genderDialog");
        } else {
            bottomListDialog = bottomListDialog5;
        }
        bottomListDialog.setListener(new com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$$ExternalSyntheticLambda8
            @Override // com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener
            public final void onSelected(int i) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.m1352showGenderDialog$lambda8(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGenderDialog$lambda-8, reason: not valid java name */
    public static final void m1352showGenderDialog$lambda8(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity userProfileActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = null;
        com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding = null;
        com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding2 = null;
        if (i == 0) {
            com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding3 = userProfileActivity.binding;
            if (activityUserProfileBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityUserProfileBinding3 = null;
            }
            activityUserProfileBinding3.userCenterGender.setRightText(userProfileActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_152));
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity2 = userProfileActivity.userEntity;
            if (userEntity2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
            } else {
                userEntity = userEntity2;
            }
            userEntity.setGender(1);
            return;
        }
        if (i == 1) {
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity3 = userProfileActivity.userEntity;
            if (userEntity3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
                userEntity3 = null;
            }
            userEntity3.setGender(2);
            com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding4 = userProfileActivity.binding;
            if (activityUserProfileBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityUserProfileBinding2 = activityUserProfileBinding4;
            }
            activityUserProfileBinding2.userCenterGender.setRightText(userProfileActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_153));
            return;
        }
        if (i != 2) {
            return;
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity4 = userProfileActivity.userEntity;
        if (userEntity4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
            userEntity4 = null;
        }
        userEntity4.setGender(3);
        com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding5 = userProfileActivity.binding;
        if (activityUserProfileBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityUserProfileBinding = activityUserProfileBinding5;
        }
        activityUserProfileBinding.userCenterGender.setRightText(userProfileActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_6666039));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setNickNameDialog(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        com.qcwireless.qcwatch.base.dialog.EditTextDialog editTextDialog = new com.qcwireless.qcwatch.base.dialog.EditTextDialog((android.content.Context) this, text);
        this.nickNameDialog = editTextDialog;
        editTextDialog.setOnTextConfirmListener(new com.qcwireless.qcwatch.base.dialog.EditTextDialog.OnTextConfirmListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$$ExternalSyntheticLambda9
            @Override // com.qcwireless.qcwatch.base.dialog.EditTextDialog.OnTextConfirmListener
            public final void OnConfirm(java.lang.String str) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.m1347setNickNameDialog$lambda9(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this, str);
            }
        });
        com.qcwireless.qcwatch.base.dialog.EditTextDialog editTextDialog2 = this.nickNameDialog;
        if (editTextDialog2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nickNameDialog");
            editTextDialog2 = null;
        }
        editTextDialog2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setNickNameDialog$lambda-9, reason: not valid java name */
    public static final void m1347setNickNameDialog$lambda9(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity userProfileActivity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "it");
        if (str.length() > 0) {
            com.qcwireless.qcwatch.databinding.ActivityUserProfileBinding activityUserProfileBinding = userProfileActivity.binding;
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = null;
            if (activityUserProfileBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityUserProfileBinding = null;
            }
            activityUserProfileBinding.userCenterName.setRightText(str);
            com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity2 = userProfileActivity.userEntity;
            if (userEntity2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("userEntity");
            } else {
                userEntity = userEntity2;
            }
            userEntity.setNickName(str);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, str);
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.ui.mine.MineFragment.class));
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onPause() {
        super.onPause();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "onPause");
        try {
            com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog = this.heightDialog;
            com.qcwireless.qcwatch.base.dialog.EditTextDialog editTextDialog = null;
            if (bottomHeightWeightDialog == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("heightDialog");
                bottomHeightWeightDialog = null;
            }
            bottomHeightWeightDialog.dismiss();
            com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog bottomHeightWeightDialog2 = this.bottomDialog;
            if (bottomHeightWeightDialog2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("bottomDialog");
                bottomHeightWeightDialog2 = null;
            }
            bottomHeightWeightDialog2.dismiss();
            com.qcwireless.qcwatch.base.dialog.BottomBirthdayDialog bottomBirthdayDialog = this.birthdayDialog;
            if (bottomBirthdayDialog == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("birthdayDialog");
                bottomBirthdayDialog = null;
            }
            bottomBirthdayDialog.dismiss();
            com.qcwireless.qcwatch.base.dialog.BottomListDialog bottomListDialog = this.genderDialog;
            if (bottomListDialog == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("genderDialog");
                bottomListDialog = null;
            }
            bottomListDialog.dismiss();
            com.qcwireless.qcwatch.base.dialog.EditTextDialog editTextDialog2 = this.nickNameDialog;
            if (editTextDialog2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nickNameDialog");
            } else {
                editTextDialog = editTextDialog2;
            }
            editTextDialog.dismiss();
        } catch (java.lang.Exception unused) {
        }
    }

    public final void showLogOffDialog() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_log_off);
        objectRef.element = builder.create();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).show();
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.m1354showLogOffDialog$lambda10(objectRef, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.m1355showLogOffDialog$lambda11(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.this, objectRef, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLogOffDialog$lambda-10, reason: not valid java name */
    public static final void m1354showLogOffDialog$lambda10(kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLogOffDialog$lambda-11, reason: not valid java name */
    public static final void m1355showLogOffDialog$lambda11(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity userProfileActivity, kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$bottomDialog");
        userProfileActivity.getViewModel().logOff();
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) objectRef.element).dismiss();
        userProfileActivity.finish();
    }
}
