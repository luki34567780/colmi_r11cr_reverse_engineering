package com.qcwireless.qcwatch.ui.home.sport.month;

/* compiled from: MonthSportFragment.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/month/MonthSportFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/sport/adapter/ExpandableRecyclerViewAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentMonthSportBinding;", "firstDate", "Lcom/qcwireless/qc_utils/date/DateUtil;", "lastDate", "monthViewModel", "Lcom/qcwireless/qcwatch/ui/home/sport/month/MonthSportFragmentViewModel;", "getMonthViewModel", "()Lcom/qcwireless/qcwatch/ui/home/sport/month/MonthSportFragmentViewModel;", "monthViewModel$delegate", "Lkotlin/Lazy;", "loadDataOnce", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MonthSportFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment.Companion(null);
    private com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter adapter;
    private com.qcwireless.qcwatch.databinding.FragmentMonthSportBinding binding;
    private com.qcwireless.qc_utils.date.DateUtil firstDate;
    private com.qcwireless.qc_utils.date.DateUtil lastDate;

    /* renamed from: monthViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy monthViewModel;

    public MonthSportFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.monthViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel m1210invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel getMonthViewModel() {
        return (com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel) this.monthViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentMonthSportBinding inflate = com.qcwireless.qcwatch.databinding.FragmentMonthSportBinding.inflate(inflater, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        com.qcwireless.qcwatch.databinding.FragmentMonthSportBinding fragmentMonthSportBinding = this.binding;
        if (fragmentMonthSportBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMonthSportBinding = null;
        }
        return fragmentMonthSportBinding.getRoot();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        com.qcwireless.qc_utils.date.DateUtil firstDayOfMonth = com.qcwireless.qc_utils.date.DateUtil.getFirstDayOfMonth(new com.qcwireless.qc_utils.date.DateUtil());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfMonth, "getFirstDayOfMonth(DateUtil())");
        this.firstDate = firstDayOfMonth;
        com.qcwireless.qc_utils.date.DateUtil lastDayOfMonth = com.qcwireless.qc_utils.date.DateUtil.getLastDayOfMonth(new com.qcwireless.qc_utils.date.DateUtil());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastDayOfMonth, "getLastDayOfMonth(DateUtil())");
        this.lastDate = lastDayOfMonth;
        com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel monthViewModel = getMonthViewModel();
        com.qcwireless.qc_utils.date.DateUtil firstDayOfMonth2 = com.qcwireless.qc_utils.date.DateUtil.getFirstDayOfMonth(new com.qcwireless.qc_utils.date.DateUtil());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfMonth2, "getFirstDayOfMonth(DateUtil())");
        com.qcwireless.qc_utils.date.DateUtil lastDayOfMonth2 = com.qcwireless.qc_utils.date.DateUtil.getLastDayOfMonth(new com.qcwireless.qc_utils.date.DateUtil());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastDayOfMonth2, "getLastDayOfMonth(\n     … DateUtil()\n            )");
        monthViewModel.showMonthData(firstDayOfMonth2, lastDayOfMonth2);
        com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter expandableRecyclerViewAdapter = new com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter(getActivity());
        this.adapter = expandableRecyclerViewAdapter;
        expandableRecyclerViewAdapter.setListener(new com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.SubItemListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment$$ExternalSyntheticLambda1
            @Override // com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter.SubItemListener
            public final void itemClick(com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail sportDetail) {
                com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment.m1208loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment.this, sportDetail);
            }
        });
        com.qcwireless.qcwatch.databinding.FragmentMonthSportBinding fragmentMonthSportBinding = this.binding;
        if (fragmentMonthSportBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMonthSportBinding = null;
        }
        fragmentMonthSportBinding.qcDateChange.setMonth(new com.qcwireless.qc_utils.date.DateUtil());
        fragmentMonthSportBinding.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment$loadDataOnce$2$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateMonthSwitchView.QDateBefore
            public void clickBefore(boolean r3, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel monthViewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                com.qcwireless.qc_utils.date.DateUtil firstDayOfMonth3 = com.qcwireless.qc_utils.date.DateUtil.getFirstDayOfMonth(dateUtil);
                com.qcwireless.qc_utils.date.DateUtil lastDayOfMonth3 = com.qcwireless.qc_utils.date.DateUtil.getLastDayOfMonth(dateUtil);
                com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment monthSportFragment = com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment.this;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfMonth3, "first");
                monthSportFragment.firstDate = firstDayOfMonth3;
                com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment monthSportFragment2 = com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment.this;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastDayOfMonth3, "last");
                monthSportFragment2.lastDate = lastDayOfMonth3;
                monthViewModel2 = com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment.this.getMonthViewModel();
                monthViewModel2.showMonthData(firstDayOfMonth3, lastDayOfMonth3);
            }
        });
        getMonthViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment.m1209loadDataOnce$lambda6(com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment.this, (com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-2, reason: not valid java name */
    public static final void m1208loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment monthSportFragment, com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail sportDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthSportFragment, "this$0");
        if (((int) sportDetail.getDistance()) == 0) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("sport_type", sportDetail.getSportType());
            bundle.putLong("start_time", sportDetail.getStartTime());
            com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment monthSportFragment2 = monthSportFragment;
            android.content.Context activity = monthSportFragment2.getActivity();
            if (activity != null) {
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.sport.SportDetailCalorieActivity.class);
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
                monthSportFragment2.startActivity(intent);
                return;
            }
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("sport_type", sportDetail.getSportType());
        bundle2.putLong("start_time", sportDetail.getStartTime());
        com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment monthSportFragment3 = monthSportFragment;
        android.content.Context activity2 = monthSportFragment3.getActivity();
        if (activity2 != null) {
            java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity2, "it");
            android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.sport.SportDetailDistanceActivity.class);
            intent2.setFlags(1);
            intent2.putExtras(bundle2);
            for (kotlin.Pair pair2 : arrayList2) {
                if (pair2 != null) {
                    java.lang.String str2 = (java.lang.String) pair2.getFirst();
                    java.lang.Object second2 = pair2.getSecond();
                    if (second2 instanceof java.lang.Integer) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).intValue()), "putExtra(name, value)");
                    } else if (second2 instanceof java.lang.Byte) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).byteValue()), "putExtra(name, value)");
                    } else if (second2 instanceof java.lang.Character) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Character) second2).charValue()), "putExtra(name, value)");
                    } else if (second2 instanceof java.lang.Short) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).shortValue()), "putExtra(name, value)");
                    } else if (second2 instanceof java.lang.Boolean) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Boolean) second2).booleanValue()), "putExtra(name, value)");
                    } else if (second2 instanceof java.lang.Long) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).longValue()), "putExtra(name, value)");
                    } else if (second2 instanceof java.lang.Float) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).floatValue()), "putExtra(name, value)");
                    } else if (second2 instanceof java.lang.Double) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((java.lang.Number) second2).doubleValue()), "putExtra(name, value)");
                    } else if (second2 instanceof java.lang.String) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.lang.String) second2), "putExtra(name, value)");
                    } else if (second2 instanceof java.lang.CharSequence) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.lang.CharSequence) second2), "putExtra(name, value)");
                    } else if (second2 instanceof android.os.Parcelable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Parcelable) second2), "putExtra(name, value)");
                    } else if (second2 instanceof java.lang.Object[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                    } else if (second2 instanceof java.util.ArrayList) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                    } else if (second2 instanceof java.io.Serializable) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (java.io.Serializable) second2), "putExtra(name, value)");
                    } else if (second2 instanceof boolean[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (boolean[]) second2), "putExtra(name, value)");
                    } else if (second2 instanceof byte[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (byte[]) second2), "putExtra(name, value)");
                    } else if (second2 instanceof short[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (short[]) second2), "putExtra(name, value)");
                    } else if (second2 instanceof char[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (char[]) second2), "putExtra(name, value)");
                    } else if (second2 instanceof int[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (int[]) second2), "putExtra(name, value)");
                    } else if (second2 instanceof long[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (long[]) second2), "putExtra(name, value)");
                    } else if (second2 instanceof float[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (float[]) second2), "putExtra(name, value)");
                    } else if (second2 instanceof double[]) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (double[]) second2), "putExtra(name, value)");
                    } else if (second2 instanceof android.os.Bundle) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Bundle) second2), "putExtra(name, value)");
                    } else if (second2 instanceof android.content.Intent) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (android.os.Parcelable) second2), "putExtra(name, value)");
                    } else {
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                }
            }
            monthSportFragment3.startActivity(intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-6, reason: not valid java name */
    public static final void m1209loadDataOnce$lambda6(com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment monthSportFragment, com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI monthSportUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthSportFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentMonthSportBinding fragmentMonthSportBinding = monthSportFragment.binding;
        com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter expandableRecyclerViewAdapter = null;
        if (fragmentMonthSportBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMonthSportBinding = null;
        }
        fragmentMonthSportBinding.weekTotal.setText(monthSportUI.getSportTimes());
        fragmentMonthSportBinding.totalTimes.setItemTitle(monthSportUI.getSportCounts());
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, monthSportUI.getSportCalorie());
        fragmentMonthSportBinding.totalCal.setItemTitle(monthSportUI.getSportCalorie());
        fragmentMonthSportBinding.totalDays.setItemTitle(monthSportUI.getDays());
        com.qcwireless.qcwatch.databinding.FragmentMonthSportBinding fragmentMonthSportBinding2 = monthSportFragment.binding;
        if (fragmentMonthSportBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMonthSportBinding2 = null;
        }
        fragmentMonthSportBinding2.expList.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(monthSportFragment.getActivity()));
        androidx.recyclerview.widget.RecyclerView recyclerView = fragmentMonthSportBinding2.expList;
        com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter expandableRecyclerViewAdapter2 = monthSportFragment.adapter;
        if (expandableRecyclerViewAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            expandableRecyclerViewAdapter2 = null;
        }
        recyclerView.setAdapter(expandableRecyclerViewAdapter2);
        monthSportFragment.getMonthViewModel().getMDataListTreesBackup().clear();
        monthSportFragment.getMonthViewModel().getMDataListTreesBackup().addAll(monthSportFragment.getMonthViewModel().getMDataListTrees());
        com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter expandableRecyclerViewAdapter3 = monthSportFragment.adapter;
        if (expandableRecyclerViewAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            expandableRecyclerViewAdapter3 = null;
        }
        expandableRecyclerViewAdapter3.setData(monthSportFragment.getMonthViewModel().getMDataListTreesBackup(), com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric());
        if (monthSportFragment.getMonthViewModel().getMDataListTrees().size() == 0) {
            com.qcwireless.qcwatch.databinding.FragmentMonthSportBinding fragmentMonthSportBinding3 = monthSportFragment.binding;
            if (fragmentMonthSportBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthSportBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentMonthSportBinding3.noDataLayout);
        } else {
            com.qcwireless.qcwatch.databinding.FragmentMonthSportBinding fragmentMonthSportBinding4 = monthSportFragment.binding;
            if (fragmentMonthSportBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMonthSportBinding4 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentMonthSportBinding4.noDataLayout);
        }
        com.qcwireless.qcwatch.ui.home.sport.adapter.ExpandableRecyclerViewAdapter expandableRecyclerViewAdapter4 = monthSportFragment.adapter;
        if (expandableRecyclerViewAdapter4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            expandableRecyclerViewAdapter = expandableRecyclerViewAdapter4;
        }
        expandableRecyclerViewAdapter.notifyDataSetChanged();
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent) {
            com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel monthViewModel = getMonthViewModel();
            com.qcwireless.qc_utils.date.DateUtil dateUtil = this.firstDate;
            com.qcwireless.qc_utils.date.DateUtil dateUtil2 = null;
            if (dateUtil == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("firstDate");
                dateUtil = null;
            }
            com.qcwireless.qc_utils.date.DateUtil dateUtil3 = this.lastDate;
            if (dateUtil3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("lastDate");
            } else {
                dateUtil2 = dateUtil3;
            }
            monthViewModel.showMonthData(dateUtil, dateUtil2);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    /* compiled from: MonthSportFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/month/MonthSportFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/sport/month/MonthSportFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragment();
        }
    }
}
