package com.qcwireless.qcwatch.ui.mine.goal;

/* compiled from: GoalSettingActivity.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0017J\b\u0010\u001e\u001a\u00020\u0017H\u0014J\u0006\u0010\u001f\u001a\u00020\u0017J\u0006\u0010 \u001a\u00020\u0017J\u0006\u0010!\u001a\u00020\u0017J\u0006\u0010\"\u001a\u00020\u0017J\u0006\u0010#\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/goal/GoalSettingActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityGoalSettingBinding;", "calorieList", "", "", "distanceList", "hList", "hSleepList", "stepsList", "target", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/TargetEntity;", "userEntity", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;", "viewModel", "Lcom/qcwireless/qcwatch/ui/mine/goal/GoalSettingViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/mine/goal/GoalSettingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "setupViews", "showCalorieDialog", "showDistanceDialog", "showSleepDialog", "showSportDialog", "showStepDialog", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GoalSettingActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding binding;
    private com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity target;
    private com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private java.util.List<java.lang.String> stepsList = new java.util.ArrayList();
    private java.util.List<java.lang.String> calorieList = new java.util.ArrayList();
    private java.util.List<java.lang.String> distanceList = new java.util.ArrayList();
    private java.util.List<java.lang.String> hList = new java.util.ArrayList();
    private java.util.List<java.lang.String> hSleepList = new java.util.ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-0, reason: not valid java name */
    public static final void m1298setupViews$lambda0(com.oudmon.ble.base.communication.rsp.SetTimeRsp setTimeRsp) {
    }

    public GoalSettingActivity() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel>() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel m1307invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.class), qualifier, qualifier);
            }
        });
        long uid = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid();
        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
        this.userEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity(uid, "", "", 1, 60.0f, 120, 175.0f, "1995-01", "", "", 10000, 200.0f, 5.0f, 1.5f, 8.0f, y_m_d, 0);
        this.target = new com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), 10000, 200.0f, 5.0f, 1.5f, 8.0f);
    }

    private final com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding inflate = com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding.inflate(getLayoutInflater());
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
        showLoadingDialog();
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SetTimeReq(0), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$$ExternalSyntheticLambda3
                @Override // com.oudmon.ble.base.communication.ICommandResponse
                public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                    com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.m1298setupViews$lambda0((com.oudmon.ble.base.communication.rsp.SetTimeRsp) baseRspCmd);
                }
            });
        }
        getViewModel().queryUserByUid();
        getViewModel().queryTargetByMac();
        initData();
        com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding activityGoalSettingBinding = this.binding;
        if (activityGoalSettingBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGoalSettingBinding = null;
        }
        activityGoalSettingBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_101));
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityGoalSettingBinding.titleBar.tvRightText);
        activityGoalSettingBinding.titleBar.tvRightText.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_79));
        activityGoalSettingBinding.goalSettingStep.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$setupViews$2$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.this.showStepDialog();
            }
        });
        activityGoalSettingBinding.goalSettingDistance.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$setupViews$2$2
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.this.showDistanceDialog();
            }
        });
        activityGoalSettingBinding.goalSettingCalorie.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$setupViews$2$3
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.this.showCalorieDialog();
            }
        });
        activityGoalSettingBinding.goalSettingSportTime.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$setupViews$2$4
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.this.showSportDialog();
            }
        });
        activityGoalSettingBinding.goalSettingSleepTime.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$setupViews$2$5
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.this.showSleepDialog();
            }
        });
        activityGoalSettingBinding.titleBar.tvRightText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.m1299setupViews$lambda2$lambda1(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.this, view);
            }
        });
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getUiTargetState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.m1300setupViews$lambda4(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.this, (com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingMacUI) obj);
            }
        });
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.m1301setupViews$lambda5(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.this, (com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-2$lambda-1, reason: not valid java name */
    public static final void m1299setupViews$lambda2$lambda1(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity goalSettingActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSettingActivity, "this$0");
        goalSettingActivity.getViewModel().saveUserEntity(goalSettingActivity.userEntity);
        goalSettingActivity.getViewModel().saveUserEntityTarget(goalSettingActivity.target);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setFirstUse(true);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.FinishFirstSettingEvent());
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.ui.mine.MineFragment.class));
        goalSettingActivity.getViewModel().updateGoalSettingToServer(goalSettingActivity.userEntity);
        goalSettingActivity.getViewModel().sendToDevice(goalSettingActivity.userEntity);
        goalSettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-4, reason: not valid java name */
    public static final void m1300setupViews$lambda4(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity goalSettingActivity, com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingMacUI goalSettingMacUI) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSettingActivity, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, goalSettingMacUI.getTarget());
        goalSettingActivity.target = goalSettingMacUI.getTarget();
        goalSettingActivity.dismissLoadingDialog();
        com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding activityGoalSettingBinding = goalSettingActivity.binding;
        if (activityGoalSettingBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGoalSettingBinding = null;
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            string = goalSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_88);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "{\n                    ge…ext_88)\n                }");
        } else {
            string = goalSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_358);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "{\n                    ge…xt_358)\n                }");
        }
        activityGoalSettingBinding.goalSettingStep.setRightText(goalSettingMacUI.getTarget().getGoalSteps() + goalSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_82));
        activityGoalSettingBinding.goalSettingDistance.setRightText(((int) goalSettingActivity.target.getGoalDistance()) + string);
        activityGoalSettingBinding.goalSettingCalorie.setRightText(((int) goalSettingActivity.target.getGoalCalorie()) + "kcal");
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = activityGoalSettingBinding.goalSettingSportTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(goalSettingActivity.target.getGoalSportTime());
        sb.append('h');
        qSettingItem.setRightText(sb.toString());
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem2 = activityGoalSettingBinding.goalSettingSleepTime;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(goalSettingActivity.target.getGoalSleepTime());
        sb2.append('h');
        qSettingItem2.setRightText(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-5, reason: not valid java name */
    public static final void m1301setupViews$lambda5(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity goalSettingActivity, com.qcwireless.qcwatch.ui.mine.goal.GoalSettingViewModel.GoalSettingUI goalSettingUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSettingActivity, "this$0");
        goalSettingActivity.userEntity = goalSettingUI.getUserEntity();
        goalSettingActivity.dismissLoadingDialog();
    }

    public final void initData() {
        int i = 1000;
        int progressionLastElement = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(1000, 30000, 1000);
        if (1000 <= progressionLastElement) {
            while (true) {
                this.stepsList.add(java.lang.String.valueOf(i));
                if (i == progressionLastElement) {
                    break;
                } else {
                    i += 1000;
                }
            }
        }
        int progressionLastElement2 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(100, 4000, 100);
        if (100 <= progressionLastElement2) {
            int i2 = 100;
            while (true) {
                this.calorieList.add(java.lang.String.valueOf(i2));
                if (i2 == progressionLastElement2) {
                    break;
                } else {
                    i2 += 100;
                }
            }
        }
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            this.distanceList.add(java.lang.String.valueOf(i3));
            if (i4 > 100) {
                break;
            } else {
                i3 = i4;
            }
        }
        java.util.Iterator it = kotlin.sequences.SequencesKt.takeWhile(kotlin.sequences.SequencesKt.generateSequence(java.lang.Double.valueOf(0.5d), new kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Double>() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$initData$1
            public final java.lang.Double invoke(double d) {
                return java.lang.Double.valueOf(d + 0.5d);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke(((java.lang.Number) obj).doubleValue());
            }
        }), new kotlin.jvm.functions.Function1<java.lang.Double, java.lang.Boolean>() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$initData$2
            public final java.lang.Boolean invoke(double d) {
                return java.lang.Boolean.valueOf(d < 12.0d);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke(((java.lang.Number) obj).doubleValue());
            }
        }).iterator();
        while (it.hasNext()) {
            this.hList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).doubleValue()));
        }
        int i5 = 5;
        while (true) {
            int i6 = i5 + 1;
            this.hSleepList.add(java.lang.String.valueOf(i5));
            if (i6 > 12) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        super.onMessageEvent(messageEvent);
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.DeviceNotifyTypeEvent) {
            getViewModel().queryUserByUid();
            getViewModel().queryTargetByMac();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showStepDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog create = new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.Builder(getActivity()).create();
        create.initData((android.content.Context) this, this.stepsList);
        create.setDialogTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_136));
        create.setUnitText(getString(com.qcwireless.qcwatch.R.string.qc_text_82));
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$$ExternalSyntheticLambda7
            @Override // com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener
            public final void itemClick(int i) {
                com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.m1306showStepDialog$lambda6(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.this, i);
            }
        });
        create.setCurrItemText(java.lang.String.valueOf(this.target.getGoalSteps()));
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showStepDialog$lambda-6, reason: not valid java name */
    public static final void m1306showStepDialog$lambda6(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity goalSettingActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSettingActivity, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(i));
        goalSettingActivity.userEntity.setGoalSteps(java.lang.Integer.parseInt(goalSettingActivity.stepsList.get(i)));
        goalSettingActivity.target.setGoalSteps(java.lang.Integer.parseInt(goalSettingActivity.stepsList.get(i)));
        com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding activityGoalSettingBinding = goalSettingActivity.binding;
        if (activityGoalSettingBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGoalSettingBinding = null;
        }
        activityGoalSettingBinding.goalSettingStep.setRightText(java.lang.Integer.parseInt(goalSettingActivity.stepsList.get(i)) + goalSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_82));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showCalorieDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog create = new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.Builder(getActivity()).create();
        create.initData((android.content.Context) this, this.calorieList);
        create.setDialogTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_137));
        create.setUnitText("kcal");
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$$ExternalSyntheticLambda4
            @Override // com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener
            public final void itemClick(int i) {
                com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.m1302showCalorieDialog$lambda7(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.this, i);
            }
        });
        create.setCurrItemText(java.lang.String.valueOf((int) this.target.getGoalCalorie()));
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showCalorieDialog$lambda-7, reason: not valid java name */
    public static final void m1302showCalorieDialog$lambda7(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity goalSettingActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSettingActivity, "this$0");
        goalSettingActivity.userEntity.setGoalCalorie(java.lang.Float.parseFloat(goalSettingActivity.calorieList.get(i)));
        goalSettingActivity.target.setGoalCalorie(java.lang.Float.parseFloat(goalSettingActivity.calorieList.get(i)));
        com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding activityGoalSettingBinding = goalSettingActivity.binding;
        if (activityGoalSettingBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGoalSettingBinding = null;
        }
        activityGoalSettingBinding.goalSettingCalorie.setRightText(java.lang.Integer.parseInt(goalSettingActivity.calorieList.get(i)) + "kcal");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showDistanceDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog create = new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.Builder(getActivity()).create();
        create.initData((android.content.Context) this, this.distanceList);
        create.setDialogTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_138));
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            create.setUnitText(getString(com.qcwireless.qcwatch.R.string.qc_text_88));
        } else {
            create.setUnitText(getString(com.qcwireless.qcwatch.R.string.qc_text_358));
        }
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$$ExternalSyntheticLambda8
            @Override // com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener
            public final void itemClick(int i) {
                com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.m1303showDistanceDialog$lambda8(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.this, i);
            }
        });
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf((int) this.userEntity.getGoalDistance()));
        create.setCurrItem(((int) this.target.getGoalDistance()) > 0 ? ((int) this.target.getGoalDistance()) - 1 : 5);
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDistanceDialog$lambda-8, reason: not valid java name */
    public static final void m1303showDistanceDialog$lambda8(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity goalSettingActivity, int i) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSettingActivity, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(i));
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(java.lang.Integer.parseInt(goalSettingActivity.distanceList.get(i))));
        int parseInt = java.lang.Integer.parseInt(goalSettingActivity.distanceList.get(i));
        float f = parseInt;
        goalSettingActivity.userEntity.setGoalDistance(f);
        goalSettingActivity.target.setGoalDistance(f);
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            string = goalSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_88);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "{\n                    ge…ext_88)\n                }");
        } else {
            string = goalSettingActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_358);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "{\n                    ge…xt_358)\n                }");
        }
        com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding activityGoalSettingBinding = goalSettingActivity.binding;
        if (activityGoalSettingBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGoalSettingBinding = null;
        }
        activityGoalSettingBinding.goalSettingDistance.setRightText(parseInt + string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showSportDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog create = new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.Builder(getActivity()).create();
        create.initData((android.content.Context) this, this.hList);
        create.setDialogTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_134));
        create.setUnitText("h");
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$$ExternalSyntheticLambda6
            @Override // com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener
            public final void itemClick(int i) {
                com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.m1305showSportDialog$lambda9(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.this, i);
            }
        });
        create.setCurrItemText(java.lang.String.valueOf(this.target.getGoalSportTime()));
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showSportDialog$lambda-9, reason: not valid java name */
    public static final void m1305showSportDialog$lambda9(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity goalSettingActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSettingActivity, "this$0");
        goalSettingActivity.userEntity.setGoalSportTime(java.lang.Float.parseFloat(goalSettingActivity.hList.get(i)));
        goalSettingActivity.target.setGoalSportTime(java.lang.Float.parseFloat(goalSettingActivity.hList.get(i)));
        com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding activityGoalSettingBinding = goalSettingActivity.binding;
        if (activityGoalSettingBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGoalSettingBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = activityGoalSettingBinding.goalSettingSportTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Float.parseFloat(goalSettingActivity.hList.get(i)));
        sb.append('h');
        qSettingItem.setRightText(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showSleepDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog create = new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.Builder(getActivity()).create();
        create.initData((android.content.Context) this, this.hSleepList);
        create.setDialogTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_139));
        create.setUnitText("h");
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity$$ExternalSyntheticLambda5
            @Override // com.qcwireless.qcwatch.base.dialog.BottomWheelViewDialog.SaveClickListener
            public final void itemClick(int i) {
                com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.m1304showSleepDialog$lambda10(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.this, i);
            }
        });
        create.setCurrItemText(java.lang.String.valueOf((int) this.target.getGoalSleepTime()));
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showSleepDialog$lambda-10, reason: not valid java name */
    public static final void m1304showSleepDialog$lambda10(com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity goalSettingActivity, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSettingActivity, "this$0");
        goalSettingActivity.userEntity.setGoalSleepTime(java.lang.Float.parseFloat(goalSettingActivity.hSleepList.get(i)));
        goalSettingActivity.target.setGoalSleepTime(java.lang.Float.parseFloat(goalSettingActivity.hSleepList.get(i)));
        com.qcwireless.qcwatch.databinding.ActivityGoalSettingBinding activityGoalSettingBinding = goalSettingActivity.binding;
        if (activityGoalSettingBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGoalSettingBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItem qSettingItem = activityGoalSettingBinding.goalSettingSleepTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Float.parseFloat(goalSettingActivity.hSleepList.get(i)));
        sb.append('h');
        qSettingItem.setRightText(sb.toString());
    }
}
