package com.qcwireless.qcwatch.ui.home.pressure.day;

/* compiled from: DayPressureFragment.kt */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010+\u001a\u00020,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u00020,H\u0016J\u0010\u00106\u001a\u00020,2\u0006\u00107\u001a\u000208H\u0007J\b\u00109\u001a\u00020,H\u0016J\b\u0010:\u001a\u00020,H\u0016J\u0010\u0010;\u001a\u00020,2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010<\u001a\u00020,H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(¨\u0006>"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/pressure/day/DayPressureFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/pressure/adapter/ManualPressureDetailAdapter;", "alphaAnimation", "Landroid/view/animation/AlphaAnimation;", "animation", "Landroid/view/animation/ScaleAnimation;", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentDayPressureBinding;", "countDownTimer", "Landroid/os/CountDownTimer;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "handler", "Landroid/os/Handler;", "heartRunnable", "Ljava/lang/Runnable;", "getHeartRunnable", "()Ljava/lang/Runnable;", "setHeartRunnable", "(Ljava/lang/Runnable;)V", "maxPressure", "", "minPressure", "pressureValue", "getPressureValue", "()I", "setPressureValue", "(I)V", "startMeasure", "", "totalIndex", "totalPressure", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/pressure/day/DayPressureFragmentViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/pressure/day/DayPressureFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "loadDataOnce", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "onStop", "queryManualPressure", "secondsDown", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DayPressureFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.Companion(null);
    private com.qcwireless.qcwatch.ui.home.pressure.adapter.ManualPressureDetailAdapter adapter;
    private android.view.animation.AlphaAnimation alphaAnimation;
    private android.view.animation.ScaleAnimation animation;
    private com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding binding;
    private android.os.CountDownTimer countDownTimer;
    private com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;
    private final android.os.Handler handler;
    private java.lang.Runnable heartRunnable;
    private int maxPressure;
    private boolean startMeasure;
    private int totalIndex;
    private int totalPressure;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private com.qcwireless.qc_utils.date.DateUtil date = new com.qcwireless.qc_utils.date.DateUtil();
    private int minPressure = 100;
    private int pressureValue = 42;

    public DayPressureFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel m1157invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
        this.heartRunnable = new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.m1148heartRunnable$lambda11(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel) this.viewModel.getValue();
    }

    public final int getPressureValue() {
        return this.pressureValue;
    }

    public final void setPressureValue(int i) {
        this.pressureValue = i;
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding inflate = com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        return inflate.getRoot();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.3f, 1.0f, 1.3f, 1, 0.5f, 1, 0.5f);
        this.animation = scaleAnimation;
        scaleAnimation.setDuration(1500L);
        android.view.animation.ScaleAnimation scaleAnimation2 = this.animation;
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding = null;
        if (scaleAnimation2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("animation");
            scaleAnimation2 = null;
        }
        scaleAnimation2.setRepeatCount(-1);
        android.view.animation.ScaleAnimation scaleAnimation3 = this.animation;
        if (scaleAnimation3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("animation");
            scaleAnimation3 = null;
        }
        scaleAnimation3.setFillAfter(true);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        this.alphaAnimation = alphaAnimation;
        alphaAnimation.setDuration(500L);
        android.view.animation.AlphaAnimation alphaAnimation2 = this.alphaAnimation;
        if (alphaAnimation2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("alphaAnimation");
            alphaAnimation2 = null;
        }
        alphaAnimation2.setRepeatMode(2);
        android.view.animation.AlphaAnimation alphaAnimation3 = this.alphaAnimation;
        if (alphaAnimation3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("alphaAnimation");
            alphaAnimation3 = null;
        }
        alphaAnimation3.setRepeatCount(60);
        getViewModel().initData(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        this.adapter = new com.qcwireless.qcwatch.ui.home.pressure.adapter.ManualPressureDetailAdapter(getActivity(), getViewModel().getManualList());
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding2 = this.binding;
        if (fragmentDayPressureBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding2 = null;
        }
        fragmentDayPressureBinding2.rcvPressureDetail.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding3 = this.binding;
        if (fragmentDayPressureBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding3 = null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = fragmentDayPressureBinding3.rcvPressureDetail;
        com.qcwireless.qcwatch.ui.home.pressure.adapter.ManualPressureDetailAdapter manualPressureDetailAdapter = this.adapter;
        if (manualPressureDetailAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            manualPressureDetailAdapter = null;
        }
        recyclerView.setAdapter(manualPressureDetailAdapter);
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$$ExternalSyntheticLambda6
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.m1149loadDataOnce$lambda1(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this, (com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.DayPressureUI) obj);
            }
        });
        getViewModel().queryLastData();
        final com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding4 = this.binding;
        if (fragmentDayPressureBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding4 = null;
        }
        fragmentDayPressureBinding4.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$loadDataOnce$2$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore
            public void clickBefore(boolean r2, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel viewModel;
                com.qcwireless.qc_utils.date.DateUtil dateUtil2;
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding5;
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding6;
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding7;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding.this.qcDateChange.setDateUtil(dateUtil);
                viewModel = this.getViewModel();
                viewModel.queryPressureByDate(dateUtil);
                this.date = dateUtil;
                this.queryManualPressure(dateUtil);
                dateUtil2 = this.date;
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding8 = null;
                if (dateUtil2.isToday()) {
                    fragmentDayPressureBinding6 = this.binding;
                    if (fragmentDayPressureBinding6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentDayPressureBinding6 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDayPressureBinding6.btnMeasure);
                    fragmentDayPressureBinding7 = this.binding;
                    if (fragmentDayPressureBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentDayPressureBinding8 = fragmentDayPressureBinding7;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDayPressureBinding8.currHeartCtl);
                    return;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding.this.btnMeasure);
                fragmentDayPressureBinding5 = this.binding;
                if (fragmentDayPressureBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentDayPressureBinding8 = fragmentDayPressureBinding5;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDayPressureBinding8.currHeartCtl);
            }
        });
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding5 = this.binding;
        if (fragmentDayPressureBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding5 = null;
        }
        fragmentDayPressureBinding5.qcPressureChart.setListener(new com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$$ExternalSyntheticLambda7
            @Override // com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean pressureDataBean) {
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.m1151loadDataOnce$lambda3$lambda2(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this, pressureDataBean);
            }
        });
        getViewModel().getDeviceSetting().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$$ExternalSyntheticLambda5
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.m1152loadDataOnce$lambda4(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this, (com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding6 = this.binding;
        if (fragmentDayPressureBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding6 = null;
        }
        fragmentDayPressureBinding6.qcSettingPressure.setSubTitleClick(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.m1153loadDataOnce$lambda5(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this, view);
            }
        });
        getViewModel().getLastDate().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.m1154loadDataOnce$lambda6(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this, (com.qcwireless.qc_utils.date.DateUtil) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding7 = this.binding;
        if (fragmentDayPressureBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding7 = null;
        }
        fragmentDayPressureBinding7.qcSettingPressure.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$$ExternalSyntheticLambda3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.m1155loadDataOnce$lambda7(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this, compoundButton, z);
            }
        });
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding8 = this.binding;
        if (fragmentDayPressureBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding8 = null;
        }
        fragmentDayPressureBinding8.tvListDetail.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.m1156loadDataOnce$lambda9(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this, view);
            }
        });
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding9 = this.binding;
        if (fragmentDayPressureBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentDayPressureBinding = fragmentDayPressureBinding9;
        }
        fragmentDayPressureBinding.btnMeasure.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.m1150loadDataOnce$lambda10(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-1, reason: not valid java name */
    public static final void m1149loadDataOnce$lambda1(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment, com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.DayPressureUI dayPressureUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding = dayPressureFragment.binding;
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding2 = null;
        if (fragmentDayPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding = null;
        }
        fragmentDayPressureBinding.qcPressureChart.setData(dayPressureUI.getData());
        dayPressureFragment.totalIndex = 0;
        dayPressureFragment.totalPressure = 0;
        dayPressureFragment.minPressure = 100;
        dayPressureFragment.maxPressure = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean pressureDataBean : dayPressureUI.getData()) {
            if (pressureDataBean.getSteps() < dayPressureFragment.minPressure) {
                dayPressureFragment.minPressure = pressureDataBean.getSteps();
            }
            if (pressureDataBean.getSteps() > dayPressureFragment.maxPressure) {
                dayPressureFragment.maxPressure = pressureDataBean.getSteps();
            }
            dayPressureFragment.totalPressure += pressureDataBean.getSteps();
            if (pressureDataBean.getSteps() >= 80) {
                i++;
            } else {
                int steps = pressureDataBean.getSteps();
                if (60 <= steps && steps < 80) {
                    i2++;
                } else {
                    int steps2 = pressureDataBean.getSteps();
                    if (30 <= steps2 && steps2 < 60) {
                        i4++;
                    } else {
                        int steps3 = pressureDataBean.getSteps();
                        if (steps3 >= 0 && steps3 < 30) {
                            i3++;
                        }
                    }
                }
            }
            if (pressureDataBean.getSteps() > 0) {
                dayPressureFragment.totalIndex++;
            }
        }
        if (!dayPressureUI.getData().isEmpty()) {
            if (dayPressureFragment.totalIndex > 0) {
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding3 = dayPressureFragment.binding;
                if (fragmentDayPressureBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDayPressureBinding3 = null;
                }
                fragmentDayPressureBinding3.pressureTotal.setTitleValue(java.lang.String.valueOf(dayPressureFragment.totalPressure / dayPressureFragment.totalIndex));
            } else {
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding4 = dayPressureFragment.binding;
                if (fragmentDayPressureBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDayPressureBinding4 = null;
                }
                fragmentDayPressureBinding4.pressureTotal.setTitleValue("--");
            }
            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding5 = dayPressureFragment.binding;
            if (fragmentDayPressureBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDayPressureBinding5 = null;
            }
            com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView = fragmentDayPressureBinding5.pressureTotal;
            java.lang.String string = dayPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_6666562);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_6666562)");
            qStepComponentView.setTitleUnit(string);
            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding6 = dayPressureFragment.binding;
            if (fragmentDayPressureBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDayPressureBinding6 = null;
            }
            com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView2 = fragmentDayPressureBinding6.pressureAvg;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(dayPressureFragment.minPressure);
            sb.append('-');
            sb.append(dayPressureFragment.maxPressure);
            qStepComponentView2.setTitleValue(sb.toString());
            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding7 = dayPressureFragment.binding;
            if (fragmentDayPressureBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDayPressureBinding7 = null;
            }
            com.qcwireless.qcwatch.ui.base.view.QStepComponentView qStepComponentView3 = fragmentDayPressureBinding7.pressureAvg;
            java.lang.String string2 = dayPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_6666562);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_6666562)");
            qStepComponentView3.setTitleUnit(string2);
            int[] iArr = {0, 0, 0, 0, 0};
            iArr[0] = i3;
            iArr[1] = i4;
            iArr[2] = i2;
            iArr[3] = i;
            int i5 = i3 + i4 + i2 + i;
            if (i5 > 0) {
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding8 = dayPressureFragment.binding;
                if (fragmentDayPressureBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDayPressureBinding8 = null;
                }
                fragmentDayPressureBinding8.heartCircleView.dataPressureInit(iArr);
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding9 = dayPressureFragment.binding;
                if (fragmentDayPressureBinding9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDayPressureBinding9 = null;
                }
                android.widget.TextView textView = fragmentDayPressureBinding9.tvValue1;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                float f = i5;
                float f2 = 100;
                sb2.append(java.lang.Math.round(((i3 * 1.0f) / f) * f2));
                sb2.append('%');
                textView.setText(sb2.toString());
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding10 = dayPressureFragment.binding;
                if (fragmentDayPressureBinding10 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDayPressureBinding10 = null;
                }
                android.widget.TextView textView2 = fragmentDayPressureBinding10.tvValue2;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(java.lang.Math.round(((i4 * 1.0f) / f) * f2));
                sb3.append('%');
                textView2.setText(sb3.toString());
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding11 = dayPressureFragment.binding;
                if (fragmentDayPressureBinding11 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDayPressureBinding11 = null;
                }
                android.widget.TextView textView3 = fragmentDayPressureBinding11.tvValue4;
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(java.lang.Math.round(((i2 * 1.0f) / f) * f2));
                sb4.append('%');
                textView3.setText(sb4.toString());
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding12 = dayPressureFragment.binding;
                if (fragmentDayPressureBinding12 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentDayPressureBinding2 = fragmentDayPressureBinding12;
                }
                android.widget.TextView textView4 = fragmentDayPressureBinding2.tvValue5;
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(java.lang.Math.round(((i * 1.0f) / f) * f2));
                sb5.append('%');
                textView4.setText(sb5.toString());
                return;
            }
            return;
        }
        int[] iArr2 = {0, 0, 0, 0, 0};
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding13 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding13 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding13 = null;
        }
        fragmentDayPressureBinding13.heartCircleView.dataPressureInit(iArr2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 = 0; i6 < 48; i6++) {
            arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean(i6 * 1800, 0));
        }
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding14 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding14 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding14 = null;
        }
        fragmentDayPressureBinding14.qcPressureChart.setData(arrayList);
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding15 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding15 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding15 = null;
        }
        fragmentDayPressureBinding15.tvValue1.setText("--");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding16 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding16 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding16 = null;
        }
        fragmentDayPressureBinding16.tvValue2.setText("--");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding17 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding17 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding17 = null;
        }
        fragmentDayPressureBinding17.tvValue4.setText("--");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding18 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding18 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding18 = null;
        }
        fragmentDayPressureBinding18.tvValue5.setText("--");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding19 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding19 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding19 = null;
        }
        fragmentDayPressureBinding19.pressureTotal.setTitleValue("--");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding20 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding20 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding20 = null;
        }
        fragmentDayPressureBinding20.pressureTotal.setTitleUnit("--");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding21 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding21 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding21 = null;
        }
        fragmentDayPressureBinding21.pressureAvg.setTitleValue("--");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding22 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding22 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentDayPressureBinding2 = fragmentDayPressureBinding22;
        }
        fragmentDayPressureBinding2.pressureAvg.setTitleUnit("--");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-3$lambda-2, reason: not valid java name */
    public static final void m1151loadDataOnce$lambda3$lambda2(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment, com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean pressureDataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragment, "this$0");
        if (pressureDataBean != null) {
            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding = null;
            if (pressureDataBean.getSteps() > 0) {
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding2 = dayPressureFragment.binding;
                if (fragmentDayPressureBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDayPressureBinding2 = null;
                }
                fragmentDayPressureBinding2.tvPressureRange.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr((int) (pressureDataBean.getTimeStamp() / 60)));
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding3 = dayPressureFragment.binding;
                if (fragmentDayPressureBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDayPressureBinding3 = null;
                }
                fragmentDayPressureBinding3.tvDayPressure.setText(java.lang.String.valueOf(pressureDataBean.getSteps()));
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding4 = dayPressureFragment.binding;
                if (fragmentDayPressureBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentDayPressureBinding = fragmentDayPressureBinding4;
                }
                fragmentDayPressureBinding.tvDayPressureUnit.setText(dayPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_6666562));
                return;
            }
            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding5 = dayPressureFragment.binding;
            if (fragmentDayPressureBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDayPressureBinding5 = null;
            }
            fragmentDayPressureBinding5.tvDayPressure.setText("--");
            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding6 = dayPressureFragment.binding;
            if (fragmentDayPressureBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDayPressureBinding6 = null;
            }
            fragmentDayPressureBinding6.tvDayPressureUnit.setText("");
            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding7 = dayPressureFragment.binding;
            if (fragmentDayPressureBinding7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentDayPressureBinding = fragmentDayPressureBinding7;
            }
            fragmentDayPressureBinding.tvPressureRange.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr((int) (pressureDataBean.getTimeStamp() / 60)));
            return;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-----");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-4, reason: not valid java name */
    public static final void m1152loadDataOnce$lambda4(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceSetting, "it");
        dayPressureFragment.deviceSetting = deviceSetting;
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding = dayPressureFragment.binding;
        if (fragmentDayPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding = null;
        }
        fragmentDayPressureBinding.qcSettingPressure.setChecked(deviceSetting.getPressureDetection());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-5, reason: not valid java name */
    public static final void m1153loadDataOnce$lambda5(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding = dayPressureFragment.binding;
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding2 = null;
        if (fragmentDayPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding = null;
        }
        if (fragmentDayPressureBinding.qcSettingPressure.getTextLines() == 2) {
            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding3 = dayPressureFragment.binding;
            if (fragmentDayPressureBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDayPressureBinding3 = null;
            }
            fragmentDayPressureBinding3.qcSettingPressure.startAnim(180.0f);
            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding4 = dayPressureFragment.binding;
            if (fragmentDayPressureBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentDayPressureBinding2 = fragmentDayPressureBinding4;
            }
            fragmentDayPressureBinding2.qcSettingPressure.setTextLines(20);
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding5 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding5 = null;
        }
        fragmentDayPressureBinding5.qcSettingPressure.startAnim(360.0f);
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding6 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentDayPressureBinding2 = fragmentDayPressureBinding6;
        }
        fragmentDayPressureBinding2.qcSettingPressure.setTextLines(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-6, reason: not valid java name */
    public static final void m1154loadDataOnce$lambda6(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding = dayPressureFragment.binding;
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding2 = null;
        if (fragmentDayPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QDateSwitchView qDateSwitchView = fragmentDayPressureBinding.qcDateChange;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dateUtil, "it");
        qDateSwitchView.setDateUtil(dateUtil);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, dateUtil.getY_M_D());
        dayPressureFragment.getViewModel().queryPressureByDate(dateUtil);
        dayPressureFragment.queryManualPressure(dateUtil);
        if (dayPressureFragment.date.isToday()) {
            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding3 = dayPressureFragment.binding;
            if (fragmentDayPressureBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDayPressureBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDayPressureBinding3.btnMeasure);
            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding4 = dayPressureFragment.binding;
            if (fragmentDayPressureBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentDayPressureBinding2 = fragmentDayPressureBinding4;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDayPressureBinding2.currHeartCtl);
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding5 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding5 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDayPressureBinding5.btnMeasure);
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding6 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentDayPressureBinding2 = fragmentDayPressureBinding6;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDayPressureBinding2.currHeartCtl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-7, reason: not valid java name */
    public static final void m1155loadDataOnce$lambda7(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragment, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = dayPressureFragment.deviceSetting;
            if (deviceSetting2 != null) {
                if (deviceSetting2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                    deviceSetting2 = null;
                }
                deviceSetting2.setPressureDetection(z);
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel viewModel = dayPressureFragment.getViewModel();
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = dayPressureFragment.deviceSetting;
                if (deviceSetting3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                } else {
                    deviceSetting = deviceSetting3;
                }
                viewModel.saveDeviceSetting(deviceAddressNoClear, deviceSetting);
                return;
            }
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding = dayPressureFragment.binding;
        if (fragmentDayPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding = null;
        }
        com.qcwireless.qcwatch.ui.base.view.QSettingItemTitleSubTitleSystem qSettingItemTitleSubTitleSystem = fragmentDayPressureBinding.qcSettingPressure;
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = dayPressureFragment.deviceSetting;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting4 = null;
        }
        qSettingItemTitleSubTitleSystem.setChecked(deviceSetting4.getPressureDetection());
        java.lang.String string = dayPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-9, reason: not valid java name */
    public static final void m1156loadDataOnce$lambda9(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragment, "this$0");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("timestamp", (int) dayPressureFragment.date.getUnixTimestamp());
        com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment2 = dayPressureFragment;
        android.content.Context activity = dayPressureFragment2.getActivity();
        if (activity != null) {
            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.pressure.RingPressureDetailActivity.class);
            intent.setFlags(1);
            intent.putExtras(bundle);
            for (kotlin.Pair pair : arrayList) {
                if (pair != null) {
                    java.lang.String str = (java.lang.String) pair.getFirst();
                    java.lang.Object second = pair.getSecond();
                    if (second instanceof java.lang.Integer) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Byte) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Character) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Short) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Boolean) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Long) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Float) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Double) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                    } else if (second instanceof java.lang.String) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.String) second), "putExtra(name, value)");
                    } else if (second instanceof java.lang.CharSequence) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.lang.CharSequence) second), "putExtra(name, value)");
                    } else if (second instanceof android.os.Parcelable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                    } else if (second instanceof java.lang.Object[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof java.util.ArrayList) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof java.io.Serializable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (java.io.Serializable) second), "putExtra(name, value)");
                    } else if (second instanceof boolean[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (boolean[]) second), "putExtra(name, value)");
                    } else if (second instanceof byte[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) second), "putExtra(name, value)");
                    } else if (second instanceof short[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (short[]) second), "putExtra(name, value)");
                    } else if (second instanceof char[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) second), "putExtra(name, value)");
                    } else if (second instanceof int[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) second), "putExtra(name, value)");
                    } else if (second instanceof long[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) second), "putExtra(name, value)");
                    } else if (second instanceof float[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) second), "putExtra(name, value)");
                    } else if (second instanceof double[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) second), "putExtra(name, value)");
                    } else if (second instanceof android.os.Bundle) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Bundle) second), "putExtra(name, value)");
                    } else if (second instanceof android.content.Intent) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (android.os.Parcelable) second), "putExtra(name, value)");
                    } else {
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                }
            }
            dayPressureFragment2.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-10, reason: not valid java name */
    public static final void m1150loadDataOnce$lambda10(final com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding = null;
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            java.lang.String string = dayPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding2 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding2 = null;
        }
        fragmentDayPressureBinding2.tvCurrHeart.setText("--");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding3 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding3 = null;
        }
        fragmentDayPressureBinding3.tvHeartTime.setText("");
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding4 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding4 = null;
        }
        android.widget.ImageView imageView = fragmentDayPressureBinding4.imageHeart;
        android.view.animation.ScaleAnimation scaleAnimation = dayPressureFragment.animation;
        if (scaleAnimation == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("animation");
            scaleAnimation = null;
        }
        imageView.startAnimation(scaleAnimation);
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding5 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding5 = null;
        }
        android.widget.TextView textView = fragmentDayPressureBinding5.tvCurrHeart;
        android.view.animation.AlphaAnimation alphaAnimation = dayPressureFragment.alphaAnimation;
        if (alphaAnimation == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("alphaAnimation");
            alphaAnimation = null;
        }
        textView.startAnimation(alphaAnimation);
        if (!dayPressureFragment.startMeasure) {
            dayPressureFragment.startMeasure = true;
            dayPressureFragment.secondsDown();
            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding6 = dayPressureFragment.binding;
            if (fragmentDayPressureBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentDayPressureBinding = fragmentDayPressureBinding6;
            }
            fragmentDayPressureBinding.btnMeasure.setText(dayPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_76660011));
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StartHeartRateReq.getSimpleReq((byte) 8), new com.oudmon.ble.base.communication.ICommandResponse<com.oudmon.ble.base.communication.rsp.StartHeartRateRsp>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$loadDataOnce$8$1
                @Override // com.oudmon.ble.base.communication.ICommandResponse
                public void onDataResponse(com.oudmon.ble.base.communication.rsp.StartHeartRateRsp resultEntity) {
                    com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding7;
                    com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding8;
                    android.os.CountDownTimer countDownTimer;
                    com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding9;
                    android.os.Handler handler;
                    android.os.Handler handler2;
                    com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding10;
                    com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding11;
                    int value;
                    boolean z;
                    com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding12;
                    android.os.CountDownTimer countDownTimer2;
                    com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding13;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultEntity, "resultEntity");
                    com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding14 = null;
                    if (resultEntity.getErrCode() == 0 && resultEntity.getType() == 8) {
                        if (resultEntity.getValue() > 0) {
                            com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment2 = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this;
                            if (resultEntity.getValue() > 50) {
                                value = new java.util.Random().nextInt(20) + 30;
                            } else {
                                value = resultEntity.getValue();
                            }
                            dayPressureFragment2.setPressureValue(value);
                            z = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.startMeasure;
                            if (z) {
                                fragmentDayPressureBinding12 = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.binding;
                                if (fragmentDayPressureBinding12 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    fragmentDayPressureBinding12 = null;
                                }
                                fragmentDayPressureBinding12.tvCurrHeart.setText(java.lang.String.valueOf(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.getPressureValue()));
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Byte.valueOf(resultEntity.getValue()));
                                countDownTimer2 = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.countDownTimer;
                                if (countDownTimer2 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
                                    countDownTimer2 = null;
                                }
                                countDownTimer2.cancel();
                                fragmentDayPressureBinding13 = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.binding;
                                if (fragmentDayPressureBinding13 == null) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    fragmentDayPressureBinding14 = fragmentDayPressureBinding13;
                                }
                                fragmentDayPressureBinding14.tvCurrHeart.clearAnimation();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (resultEntity.getErrCode() == 1) {
                        java.lang.String string2 = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_6666064);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_6666064)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                    }
                    com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.startMeasure = false;
                    fragmentDayPressureBinding7 = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.binding;
                    if (fragmentDayPressureBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentDayPressureBinding7 = null;
                    }
                    fragmentDayPressureBinding7.imageHeart.clearAnimation();
                    fragmentDayPressureBinding8 = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.binding;
                    if (fragmentDayPressureBinding8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentDayPressureBinding8 = null;
                    }
                    fragmentDayPressureBinding8.tvCurrHeart.clearAnimation();
                    countDownTimer = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.countDownTimer;
                    if (countDownTimer == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
                        countDownTimer = null;
                    }
                    countDownTimer.cancel();
                    fragmentDayPressureBinding9 = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.binding;
                    if (fragmentDayPressureBinding9 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentDayPressureBinding9 = null;
                    }
                    fragmentDayPressureBinding9.btnMeasure.setText(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
                    handler = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.handler;
                    handler.removeCallbacks(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.getHeartRunnable());
                    if (resultEntity.getErrCode() != 0) {
                        handler2 = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.handler;
                        handler2.removeCallbacks(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.getHeartRunnable());
                        fragmentDayPressureBinding10 = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.binding;
                        if (fragmentDayPressureBinding10 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            fragmentDayPressureBinding10 = null;
                        }
                        fragmentDayPressureBinding10.tvCurrHeart.setText("--");
                        fragmentDayPressureBinding11 = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.binding;
                        if (fragmentDayPressureBinding11 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            fragmentDayPressureBinding14 = fragmentDayPressureBinding11;
                        }
                        fragmentDayPressureBinding14.tvHeartTime.setText("");
                    }
                }
            });
            dayPressureFragment.handler.removeCallbacks(dayPressureFragment.heartRunnable);
            dayPressureFragment.handler.postDelayed(dayPressureFragment.heartRunnable, 30000L);
            return;
        }
        dayPressureFragment.startMeasure = false;
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding7 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding7 = null;
        }
        fragmentDayPressureBinding7.btnMeasure.setText(dayPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
        dayPressureFragment.handler.removeCallbacks(dayPressureFragment.heartRunnable);
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding8 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding8 = null;
        }
        fragmentDayPressureBinding8.imageHeart.clearAnimation();
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding9 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding9 = null;
        }
        fragmentDayPressureBinding9.tvCurrHeart.clearAnimation();
        android.os.CountDownTimer countDownTimer = dayPressureFragment.countDownTimer;
        if (countDownTimer == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
            countDownTimer = null;
        }
        countDownTimer.cancel();
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StopHeartRateReq.stopPressure((byte) 0), null);
    }

    public final java.lang.Runnable getHeartRunnable() {
        return this.heartRunnable;
    }

    public final void setHeartRunnable(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "<set-?>");
        this.heartRunnable = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: heartRunnable$lambda-11, reason: not valid java name */
    public static final void m1148heartRunnable$lambda11(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragment, "this$0");
        dayPressureFragment.startMeasure = false;
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding = dayPressureFragment.binding;
        if (fragmentDayPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding = null;
        }
        fragmentDayPressureBinding.btnMeasure.setText(dayPressureFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding2 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding2 = null;
        }
        fragmentDayPressureBinding2.imageHeart.clearAnimation();
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding3 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding3 = null;
        }
        fragmentDayPressureBinding3.tvCurrHeart.clearAnimation();
        android.os.CountDownTimer countDownTimer = dayPressureFragment.countDownTimer;
        if (countDownTimer == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
            countDownTimer = null;
        }
        countDownTimer.cancel();
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding4 = dayPressureFragment.binding;
        if (fragmentDayPressureBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding4 = null;
        }
        fragmentDayPressureBinding4.tvHeartTime.setText(dateUtil.getY_M_D_H_M_S());
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StopHeartRateReq.stopPressure((byte) dayPressureFragment.pressureValue), null);
        com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.INSTANCE.getGetInstance().saveManualPressure(dateUtil.getUnixTimestamp(), dayPressureFragment.pressureValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryManualPressure(final com.qcwireless.qc_utils.date.DateUtil date) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgFix(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$queryManualPressure$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment) {
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel viewModel;
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel viewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragment, "$this$ktxRunOnBgFix");
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity> queryManualPressure = com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.INSTANCE.getGetInstance().queryManualPressure(com.qcwireless.qc_utils.date.DateUtil.this);
                viewModel = dayPressureFragment.getViewModel();
                viewModel.getManualList().clear();
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(queryManualPressure.size()));
                for (com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity pressureManualEntity : queryManualPressure) {
                    viewModel2 = dayPressureFragment.getViewModel();
                    viewModel2.getManualList().add(new com.qcwireless.qcwatch.ui.home.pressure.bean.PressureDetailBean(pressureManualEntity.getTimestamp(), pressureManualEntity.getPressure()));
                }
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(dayPressureFragment, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$queryManualPressure$1.2
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment2) {
                        com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel viewModel3;
                        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding;
                        com.qcwireless.qcwatch.ui.home.pressure.adapter.ManualPressureDetailAdapter manualPressureDetailAdapter;
                        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragment2, "$this$ktxRunOnUi");
                        viewModel3 = dayPressureFragment2.getViewModel();
                        com.qcwireless.qcwatch.ui.home.pressure.adapter.ManualPressureDetailAdapter manualPressureDetailAdapter2 = null;
                        if (viewModel3.getManualList().size() == 0) {
                            fragmentDayPressureBinding2 = dayPressureFragment2.binding;
                            if (fragmentDayPressureBinding2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDayPressureBinding2 = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDayPressureBinding2.rcvDetailLayout);
                        } else {
                            fragmentDayPressureBinding = dayPressureFragment2.binding;
                            if (fragmentDayPressureBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDayPressureBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDayPressureBinding.rcvDetailLayout);
                        }
                        manualPressureDetailAdapter = dayPressureFragment2.adapter;
                        if (manualPressureDetailAdapter == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        } else {
                            manualPressureDetailAdapter2 = manualPressureDetailAdapter;
                        }
                        manualPressureDetailAdapter2.notifyDataSetChanged();
                    }
                });
            }
        });
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent) {
            queryManualPressure(this.date);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onResume() {
        super.onResume();
        com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding = this.binding;
        if (fragmentDayPressureBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayPressureBinding = null;
        }
        fragmentDayPressureBinding.btnMeasure.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_76660010));
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onStop() {
        super.onStop();
        try {
            if (this.startMeasure) {
                this.startMeasure = false;
                this.handler.removeCallbacks(this.heartRunnable);
                android.os.CountDownTimer countDownTimer = this.countDownTimer;
                if (countDownTimer == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("countDownTimer");
                    countDownTimer = null;
                }
                countDownTimer.cancel();
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding = this.binding;
                if (fragmentDayPressureBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDayPressureBinding = null;
                }
                fragmentDayPressureBinding.tvCurrHeart.setText("--");
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding2 = this.binding;
                if (fragmentDayPressureBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDayPressureBinding2 = null;
                }
                fragmentDayPressureBinding2.tvCurrHeart.clearAnimation();
                com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding3 = this.binding;
                if (fragmentDayPressureBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDayPressureBinding3 = null;
                }
                fragmentDayPressureBinding3.imageHeart.clearAnimation();
                com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.StopHeartRateReq.stopPressure((byte) 0), null);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$secondsDown$1] */
    private final void secondsDown() {
        final long j = 25000;
        android.os.CountDownTimer start = new android.os.CountDownTimer(j) { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$secondsDown$1
            @Override // android.os.CountDownTimer
            public void onFinish() {
            }

            @Override // android.os.CountDownTimer
            public void onTick(long p0) {
                int i = ((int) (p0 / 500)) % 2;
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(i));
                if (i == 0) {
                    final com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$secondsDown$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$secondsDown$1$onTick$1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$secondsDown$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$secondsDown$1 dayPressureFragment$secondsDown$1) {
                            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragment$secondsDown$1, "$this$ktxRunOnUi");
                            fragmentDayPressureBinding = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.binding;
                            if (fragmentDayPressureBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDayPressureBinding = null;
                            }
                            fragmentDayPressureBinding.tvCurrHeart.setText("--");
                        }
                    });
                } else {
                    final com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment dayPressureFragment2 = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$secondsDown$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$secondsDown$1$onTick$2
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$secondsDown$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment$secondsDown$1 dayPressureFragment$secondsDown$1) {
                            com.qcwireless.qcwatch.databinding.FragmentDayPressureBinding fragmentDayPressureBinding;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragment$secondsDown$1, "$this$ktxRunOnUi");
                            fragmentDayPressureBinding = com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment.this.binding;
                            if (fragmentDayPressureBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDayPressureBinding = null;
                            }
                            fragmentDayPressureBinding.tvCurrHeart.setText("-");
                        }
                    });
                }
            }
        }.start();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(start, "private fun secondsDown(…\n\n        }.start()\n    }");
        this.countDownTimer = start;
    }

    /* compiled from: DayPressureFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/pressure/day/DayPressureFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/pressure/day/DayPressureFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragment();
        }
    }
}
