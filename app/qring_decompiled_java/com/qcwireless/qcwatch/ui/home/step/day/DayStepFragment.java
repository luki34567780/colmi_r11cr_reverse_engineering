package com.qcwireless.qcwatch.ui.home.step.day;

/* compiled from: DayStepFragment.kt */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0002./B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010 \u001a\u00020\u0014H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#H\u0007J\b\u0010$\u001a\u00020\u0014H\u0016J(\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u00060"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/day/DayStepFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentDayStepBinding;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "deviceNotifyListener", "Lcom/qcwireless/qcwatch/ui/home/step/day/DayStepFragment$MyDeviceNotifyListener;", "df", "Ljava/text/DecimalFormat;", "target", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/TargetEntity;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/step/day/DayStepFragmentViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/step/day/DayStepFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "daySportPlusDetail", "", "start", "loadDataOnce", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "queryTarget", "step", "", "distanceSource", "", "distance", "calorie", "", "syncTodayStep", "Companion", "MyDeviceNotifyListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DayStepFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.Companion(null);
    private com.qcwireless.qcwatch.databinding.FragmentDayStepBinding binding;
    private com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.MyDeviceNotifyListener deviceNotifyListener;
    private java.text.DecimalFormat df;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;
    private com.qcwireless.qc_utils.date.DateUtil date = new com.qcwireless.qc_utils.date.DateUtil();
    private com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity target = new com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), 10000, 200.0f, 5.0f, 1.5f, 8.0f);

    public DayStepFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel m1222invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentDayStepBinding inflate = com.qcwireless.qcwatch.databinding.FragmentDayStepBinding.inflate(getLayoutInflater());
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
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.00");
        this.df = decimalFormat;
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel viewModel = getViewModel();
        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
        viewModel.queryStepDetailByDate(y_m_d);
        final com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding2 = null;
        if (fragmentDayStepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayStepBinding = null;
        }
        fragmentDayStepBinding.qcDateChange.setDateUtil(new com.qcwireless.qc_utils.date.DateUtil());
        fragmentDayStepBinding.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$loadDataOnce$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore
            public void clickBefore(boolean r3, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel viewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                com.qcwireless.qcwatch.databinding.FragmentDayStepBinding.this.qcDateChange.setDateUtil(dateUtil);
                viewModel2 = this.getViewModel();
                java.lang.String y_m_d2 = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "dateUtil.y_M_D");
                viewModel2.queryStepDetailByDate(y_m_d2);
                this.date = dateUtil;
            }
        });
        fragmentDayStepBinding.qcStepChart.setListener(new com.qcwireless.qcwatch.ui.base.view.QStepBarChart.OnSelectedListener() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$$ExternalSyntheticLambda2
            @Override // com.qcwireless.qcwatch.ui.base.view.QStepBarChart.OnSelectedListener
            public final void onSelected(com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean stepDataBean) {
                com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.m1219loadDataOnce$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.this, fragmentDayStepBinding, stepDataBean);
            }
        });
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.m1220loadDataOnce$lambda3(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.this, (com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.DayStepUI) obj);
            }
        });
        com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding3 = this.binding;
        if (fragmentDayStepBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentDayStepBinding2 = fragmentDayStepBinding3;
        }
        fragmentDayStepBinding2.tvMoreText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.m1221loadDataOnce$lambda4(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-1$lambda-0, reason: not valid java name */
    public static final void m1219loadDataOnce$lambda1$lambda0(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment dayStepFragment, com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding, com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean stepDataBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayStepFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentDayStepBinding, "$this_run");
        if (stepDataBean != null) {
            com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding2 = dayStepFragment.binding;
            if (fragmentDayStepBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDayStepBinding2 = null;
            }
            fragmentDayStepBinding2.tvStepRange.setText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr((int) (stepDataBean.getTimeStamp() / 60)));
            fragmentDayStepBinding.tvDayStep.setText(java.lang.String.valueOf(stepDataBean.getSteps()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.qcwireless.qcwatch.ui.base.view.QStepComponentView] */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.qcwireless.qcwatch.ui.base.view.QStepComponentView] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment, java.lang.Object] */
    /* renamed from: loadDataOnce$lambda-3, reason: not valid java name */
    public static final void m1220loadDataOnce$lambda3(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment dayStepFragment, com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel.DayStepUI dayStepUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) dayStepFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding = ((com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment) dayStepFragment).binding;
        if (fragmentDayStepBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayStepBinding = null;
        }
        fragmentDayStepBinding.qcStepChart.setData(dayStepUI.getData());
        fragmentDayStepBinding.stepTotal.setTitleValue(dayStepUI.getStepTotal());
        dayStepFragment.daySportPlusDetail(((com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment) dayStepFragment).date);
        int i = 0;
        java.util.Iterator<com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean> it = dayStepUI.getData().iterator();
        while (it.hasNext()) {
            if (it.next().getSteps() > 0) {
                i++;
            }
        }
        if (i > 0) {
            fragmentDayStepBinding.stepAvg.setTitleValue(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(java.lang.Float.parseFloat(dayStepUI.getStepTotal()) / i)));
        } else {
            fragmentDayStepBinding.stepAvg.setTitleValue("0");
        }
        java.lang.String str = "";
        ?? metric = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric();
        try {
            try {
                if (metric != 0) {
                    java.lang.String valueOf = java.lang.String.valueOf(new java.math.BigDecimal(java.lang.String.valueOf((java.lang.Float.parseFloat(dayStepUI.getDistanceTotal()) * 1.0f) / 1000)).setScale(2, java.math.RoundingMode.HALF_UP));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(bigDecimal.setSc…2, RoundingMode.HALF_UP))");
                    fragmentDayStepBinding.stepDistance.setTitleValue(valueOf);
                    ?? r1 = fragmentDayStepBinding.stepDistance;
                    java.lang.String string = dayStepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_88);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_88)");
                    r1.setTitleUnit(string);
                    str = r1;
                    metric = valueOf;
                } else {
                    java.lang.String valueOf2 = java.lang.String.valueOf(new java.math.BigDecimal(java.lang.String.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn((java.lang.Float.parseFloat(dayStepUI.getDistanceTotal()) * 1.0f) / 1000))).setScale(2, java.math.RoundingMode.HALF_UP));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(bigDecimal.setSc…2, RoundingMode.HALF_UP))");
                    fragmentDayStepBinding.stepDistance.setTitleValue(valueOf2);
                    ?? r12 = fragmentDayStepBinding.stepDistance;
                    java.lang.String string2 = dayStepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_358);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_358)");
                    r12.setTitleUnit(string2);
                    str = r12;
                    metric = valueOf2;
                }
            } catch (java.lang.Exception unused) {
                str = metric;
                metric = str;
                fragmentDayStepBinding.stepCalorie.setTitleValue(java.lang.String.valueOf(java.lang.Integer.parseInt(dayStepUI.getCalorieTotal()) / 1000));
                dayStepFragment.queryTarget(dayStepUI.getStepTotal(), (java.lang.Float.parseFloat(dayStepUI.getDistanceTotal()) * 1.0f) / 1000, metric, java.lang.Integer.parseInt(dayStepUI.getCalorieTotal()) / 1000);
            }
        } catch (java.lang.Exception unused2) {
            metric = str;
            fragmentDayStepBinding.stepCalorie.setTitleValue(java.lang.String.valueOf(java.lang.Integer.parseInt(dayStepUI.getCalorieTotal()) / 1000));
            dayStepFragment.queryTarget(dayStepUI.getStepTotal(), (java.lang.Float.parseFloat(dayStepUI.getDistanceTotal()) * 1.0f) / 1000, metric, java.lang.Integer.parseInt(dayStepUI.getCalorieTotal()) / 1000);
        }
        fragmentDayStepBinding.stepCalorie.setTitleValue(java.lang.String.valueOf(java.lang.Integer.parseInt(dayStepUI.getCalorieTotal()) / 1000));
        dayStepFragment.queryTarget(dayStepUI.getStepTotal(), (java.lang.Float.parseFloat(dayStepUI.getDistanceTotal()) * 1.0f) / 1000, metric, java.lang.Integer.parseInt(dayStepUI.getCalorieTotal()) / 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-4, reason: not valid java name */
    public static final void m1221loadDataOnce$lambda4(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment dayStepFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayStepFragment, "this$0");
        com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment dayStepFragment2 = dayStepFragment;
        android.content.Context activity = dayStepFragment2.getActivity();
        if (activity != null) {
            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.sport.SportActivity.class);
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
            dayStepFragment2.startActivity(intent);
        }
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent ? true : messageEvent instanceof com.qcwireless.qcwatch.base.event.HomeStepRefreshEvent) {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$onMessageEvent$1
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment dayStepFragment) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayStepFragment, "$this$ktxRunOnUi");
                    com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding = dayStepFragment.binding;
                    if (fragmentDayStepBinding == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentDayStepBinding = null;
                    }
                    fragmentDayStepBinding.qcDateChange.setDateUtil(dayStepFragment.date);
                }
            });
            if (this.date.isToday()) {
                syncTodayStep();
            } else {
                com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel viewModel = getViewModel();
                java.lang.String y_m_d = this.date.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
                viewModel.queryStepDetailByDate(y_m_d);
            }
            daySportPlusDetail(this.date);
        }
    }

    private final void syncTodayStep() {
        com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.INSTANCE.getGetInstance().syncTodayStep(new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.TodaySportDataRsp>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$syncTodayStep$1
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.TodaySportDataRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-----1");
            }
        });
        com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.INSTANCE.getGetInstance().syncTodayStepDetail(0, new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$syncTodayStep$2
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp t) {
                com.qcwireless.qcwatch.ui.home.step.day.DayStepFragmentViewModel viewModel;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingleAnother(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$syncTodayStep$2, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$syncTodayStep$2$result$1
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$syncTodayStep$2) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$syncTodayStep$2 dayStepFragment$syncTodayStep$2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayStepFragment$syncTodayStep$2, "$this$ktxRunOnBgSingleAnother");
                        com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository getInstance = com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.INSTANCE.getGetInstance();
                        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                        getInstance.queryStepDetail(y_m_d);
                    }
                });
                viewModel = com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.this.getViewModel();
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                viewModel.queryStepDetailByDate(y_m_d);
            }
        });
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onResume() {
        super.onResume();
        this.deviceNotifyListener = new com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.MyDeviceNotifyListener();
        com.oudmon.ble.base.bluetooth.BleOperateManager bleOperateManager = com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance();
        com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.MyDeviceNotifyListener myDeviceNotifyListener = this.deviceNotifyListener;
        if (myDeviceNotifyListener == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceNotifyListener");
            myDeviceNotifyListener = null;
        }
        bleOperateManager.addOutDeviceListener(11, myDeviceNotifyListener);
    }

    private final void queryTarget(final java.lang.String step, final float distanceSource, final java.lang.String distance, final int calorie) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$queryTarget$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(final com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment dayStepFragment) {
                java.lang.String string;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayStepFragment, "$this$ktxRunOnBgSingle");
                final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                objectRef.element = com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository.INSTANCE.getGetInstance().queryTarget();
                if (objectRef.element == null) {
                    objectRef.element = new com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), 10000, 200.0f, 5.0f, 1.5f, 8.0f);
                }
                dayStepFragment.target = (com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity) objectRef.element;
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, objectRef.element);
                com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding = dayStepFragment.binding;
                if (fragmentDayStepBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDayStepBinding = null;
                }
                com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding2 = fragmentDayStepBinding;
                final java.lang.String str = step;
                final float f = distanceSource;
                final int i = calorie;
                final java.lang.String str2 = distance;
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                    string = dayStepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_88);
                } else {
                    string = dayStepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_358);
                }
                final java.lang.String str3 = string;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "if (UserConfig.getInstan…xt_358)\n                }");
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(fragmentDayStepBinding2, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.databinding.FragmentDayStepBinding, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$queryTarget$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.databinding.FragmentDayStepBinding) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding3) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentDayStepBinding3, "$this$ktxRunOnUi");
                        fragmentDayStepBinding3.tvStep1.setText(str);
                        fragmentDayStepBinding3.tvStep2.setText('/' + ((com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity) objectRef.element).getGoalSteps() + dayStepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_82));
                        fragmentDayStepBinding3.pbStep.setProgress((java.lang.Integer.parseInt(str) * 100) / ((com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity) objectRef.element).getGoalSteps());
                        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                            fragmentDayStepBinding3.pbDistance.setProgress((int) ((f * 100) / ((com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity) objectRef.element).getGoalDistance()));
                        } else {
                            fragmentDayStepBinding3.pbDistance.setProgress((int) ((com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn(f) * 100) / ((com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity) objectRef.element).getGoalDistance()));
                        }
                        fragmentDayStepBinding3.pbCalorie.setProgress((i * 100) / ((int) ((com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity) objectRef.element).getGoalCalorie()));
                    }
                });
                try {
                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                        final int goalDistance = (int) ((com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity) objectRef.element).getGoalDistance();
                        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(fragmentDayStepBinding2, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.databinding.FragmentDayStepBinding, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$queryTarget$1$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                invoke((com.qcwireless.qcwatch.databinding.FragmentDayStepBinding) obj);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding3) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentDayStepBinding3, "$this$ktxRunOnUi");
                                fragmentDayStepBinding3.tvDistance1.setText(java.lang.String.valueOf(str2));
                                fragmentDayStepBinding3.tvDistance2.setText('/' + goalDistance + str3);
                            }
                        });
                    } else {
                        final int goalDistance2 = (int) ((com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity) objectRef.element).getGoalDistance();
                        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(fragmentDayStepBinding2, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.databinding.FragmentDayStepBinding, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$queryTarget$1$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                invoke((com.qcwireless.qcwatch.databinding.FragmentDayStepBinding) obj);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding3) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentDayStepBinding3, "$this$ktxRunOnUi");
                                fragmentDayStepBinding3.tvDistance1.setText(java.lang.String.valueOf(str2));
                                fragmentDayStepBinding3.tvDistance2.setText('/' + goalDistance2 + str3);
                            }
                        });
                    }
                } catch (java.lang.Exception unused) {
                }
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(fragmentDayStepBinding2, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.databinding.FragmentDayStepBinding, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$queryTarget$1$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.databinding.FragmentDayStepBinding) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding3) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentDayStepBinding3, "$this$ktxRunOnUi");
                        fragmentDayStepBinding3.tvCalorie1.setText(java.lang.String.valueOf(i));
                        fragmentDayStepBinding3.tvCalorie2.setText('/' + ((int) ((com.qcwireless.qcwatch.ui.base.repository.entity.TargetEntity) objectRef.element).getGoalCalorie()) + dayStepFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_110));
                    }
                });
            }
        });
    }

    private final void daySportPlusDetail(final com.qcwireless.qc_utils.date.DateUtil start) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$daySportPlusDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment dayStepFragment) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayStepFragment, "$this$ktxRunOnBgSingle");
                com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository getInstance = com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.INSTANCE.getGetInstance();
                com.qcwireless.qc_utils.date.DateUtil dateUtil = com.qcwireless.qc_utils.date.DateUtil.this;
                final com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail querySportByDate = getInstance.querySportByDate(dateUtil, dateUtil);
                if (querySportByDate != null) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(dayStepFragment, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$daySportPlusDetail$1.1
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:104:0x033c A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:110:0x0308 A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:114:0x02d2 A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:118:0x0298 A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x017f A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x0190 A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:34:0x01a1 A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:37:0x01b3 A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:40:0x01c4 A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x01d6 A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:46:0x01eb A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:61:0x0227 A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:80:0x027c A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:86:0x02b3 A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:92:0x02ec A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /* JADX WARN: Removed duplicated region for block: B:98:0x0325 A[Catch: Exception -> 0x0353, TryCatch #0 {Exception -> 0x0353, blocks: (B:6:0x0019, B:9:0x002a, B:11:0x0033, B:14:0x003e, B:16:0x0044, B:17:0x0048, B:18:0x0156, B:21:0x0165, B:23:0x016f, B:26:0x0179, B:28:0x017f, B:29:0x0183, B:31:0x0190, B:32:0x0194, B:34:0x01a1, B:35:0x01a5, B:37:0x01b3, B:38:0x01b7, B:40:0x01c4, B:41:0x01c8, B:43:0x01d6, B:44:0x01da, B:46:0x01eb, B:48:0x01f7, B:50:0x01fd, B:51:0x0202, B:55:0x020f, B:57:0x0215, B:58:0x021a, B:61:0x0227, B:63:0x022d, B:64:0x0231, B:66:0x0244, B:68:0x024a, B:69:0x024f, B:72:0x025c, B:74:0x0262, B:75:0x0267, B:78:0x0274, B:80:0x027c, B:82:0x0282, B:83:0x0286, B:84:0x02a9, B:86:0x02b3, B:88:0x02b9, B:89:0x02bd, B:90:0x02e4, B:92:0x02ec, B:94:0x02f2, B:95:0x02f6, B:96:0x0319, B:98:0x0325, B:100:0x032b, B:101:0x0330, B:104:0x033c, B:106:0x0342, B:107:0x0347, B:110:0x0308, B:112:0x030e, B:113:0x0312, B:114:0x02d2, B:116:0x02d8, B:117:0x02dc, B:118:0x0298, B:120:0x029e, B:121:0x02a2, B:122:0x0051, B:124:0x0060, B:126:0x0083, B:127:0x0087, B:129:0x0098, B:130:0x009c, B:132:0x00b4, B:134:0x00ba, B:135:0x00be, B:136:0x00c7, B:138:0x00cd, B:139:0x00d1, B:140:0x00db, B:142:0x0106, B:144:0x010c, B:145:0x0110, B:146:0x012b, B:148:0x0131, B:149:0x0135, B:151:0x0144, B:152:0x0148, B:153:0x0118, B:155:0x011e, B:156:0x0122), top: B:5:0x0019 }] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void invoke(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment r11) {
                            /*
                                Method dump skipped, instructions count: 856
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$daySportPlusDetail$1.AnonymousClass1.invoke(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment):void");
                        }
                    });
                } else {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(dayStepFragment, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment$daySportPlusDetail$1.2
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment dayStepFragment2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayStepFragment2, "$this$ktxRunOnUi");
                            com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding = dayStepFragment2.binding;
                            if (fragmentDayStepBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDayStepBinding = null;
                            }
                            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDayStepBinding.todayStepActivity);
                        }
                    });
                }
            }
        });
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    /* compiled from: DayStepFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/day/DayStepFragment$MyDeviceNotifyListener;", "Lcom/oudmon/ble/base/communication/responseImpl/DeviceNotifyListener;", "(Lcom/qcwireless/qcwatch/ui/home/step/day/DayStepFragment;)V", "onDataResponse", "", "resultEntity", "Lcom/oudmon/ble/base/communication/rsp/DeviceNotifyRsp;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyDeviceNotifyListener extends com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener {
        public MyDeviceNotifyListener() {
        }

        @Override // com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener, com.oudmon.ble.base.communication.ICommandResponse
        public void onDataResponse(com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp resultEntity) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(resultEntity);
            if (resultEntity.getStatus() == 0) {
                if (com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().getSync() || com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().getSyncSportPlus() || com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 1 || com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 2 || com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getUpdating() == 3) {
                    com.oudmon.ble.base.util.LogToFile.getInstance().wtf("设备刷新返回，没有同步");
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "正在数据同步或者固件升级...");
                    return;
                }
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "设备触发刷新，数据类型:" + resultEntity.getDataType());
                com.oudmon.ble.base.util.LogToFile.getInstance().wtf("设备触发刷新，数据类型:" + resultEntity.getDataType());
                com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeOthersListener();
                if (resultEntity.getDataType() == 18) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.oudmon.ble.base.communication.utils.ByteUtil.bytesToString(resultEntity.getLoadData()));
                    int bytes2Int = com.oudmon.ble.base.communication.utils.BLEDataFormatUtils.bytes2Int(new byte[]{resultEntity.getLoadData()[1], resultEntity.getLoadData()[2], resultEntity.getLoadData()[3]});
                    try {
                        if (com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.this.date.isToday()) {
                            com.qcwireless.qcwatch.databinding.FragmentDayStepBinding fragmentDayStepBinding = com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment.this.binding;
                            if (fragmentDayStepBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentDayStepBinding = null;
                            }
                            fragmentDayStepBinding.stepTotal.setTitleValue(java.lang.String.valueOf(bytes2Int));
                        }
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* compiled from: DayStepFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/day/DayStepFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/step/day/DayStepFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.step.day.DayStepFragment();
        }
    }
}
