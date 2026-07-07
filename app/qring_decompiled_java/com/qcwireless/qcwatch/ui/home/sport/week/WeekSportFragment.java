package com.qcwireless.qcwatch.ui.home.sport.week;

/* compiled from: WeekSportFragment.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/week/WeekSportFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/sport/adapter/SportDetailAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentWeekSportBinding;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "weekViewModel", "Lcom/qcwireless/qcwatch/ui/home/sport/week/WeekSportViewModel;", "getWeekViewModel", "()Lcom/qcwireless/qcwatch/ui/home/sport/week/WeekSportViewModel;", "weekViewModel$delegate", "Lkotlin/Lazy;", "loadDataOnce", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WeekSportFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment.Companion(null);
    private com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter adapter;
    private com.qcwireless.qcwatch.databinding.FragmentWeekSportBinding binding;
    private com.qcwireless.qc_utils.date.DateUtil date;

    /* renamed from: weekViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy weekViewModel;

    public WeekSportFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.weekViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel m1215invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel getWeekViewModel() {
        return (com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel) this.weekViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentWeekSportBinding inflate = com.qcwireless.qcwatch.databinding.FragmentWeekSportBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        com.qcwireless.qcwatch.databinding.FragmentWeekSportBinding fragmentWeekSportBinding = this.binding;
        if (fragmentWeekSportBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekSportBinding = null;
        }
        return fragmentWeekSportBinding.getRoot();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        com.qcwireless.qc_utils.date.DateUtil firstDayOfWeek = com.qcwireless.qc_utils.date.DateUtil.firstDayOfWeek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfWeek, "firstDayOfWeek()");
        this.date = firstDayOfWeek;
        com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel weekViewModel = getWeekViewModel();
        com.qcwireless.qc_utils.date.DateUtil dateUtil = this.date;
        com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter sportDetailAdapter = null;
        if (dateUtil == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("date");
            dateUtil = null;
        }
        weekViewModel.weekSportPlusDetail(dateUtil);
        com.qcwireless.qcwatch.databinding.FragmentWeekSportBinding fragmentWeekSportBinding = this.binding;
        if (fragmentWeekSportBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekSportBinding = null;
        }
        this.adapter = new com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter(getActivity(), getWeekViewModel().getSportDetailList());
        fragmentWeekSportBinding.sportDetailRcv.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
        androidx.recyclerview.widget.RecyclerView recyclerView = fragmentWeekSportBinding.sportDetailRcv;
        com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter sportDetailAdapter2 = this.adapter;
        if (sportDetailAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            sportDetailAdapter2 = null;
        }
        recyclerView.setAdapter(sportDetailAdapter2);
        com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter sportDetailAdapter3 = this.adapter;
        if (sportDetailAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            sportDetailAdapter3 = null;
        }
        sportDetailAdapter3.notifyDataSetChanged();
        fragmentWeekSportBinding.totalTimes.setItemTitle(java.lang.String.valueOf(getWeekViewModel().getSportDetailList().size()));
        com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView qDateWeekSwitchView = fragmentWeekSportBinding.qcDateChange;
        com.qcwireless.qc_utils.date.DateUtil firstDayOfWeek2 = com.qcwireless.qc_utils.date.DateUtil.firstDayOfWeek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firstDayOfWeek2, "firstDayOfWeek()");
        qDateWeekSwitchView.setWeekDayStart(firstDayOfWeek2);
        fragmentWeekSportBinding.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment$loadDataOnce$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateWeekSwitchView.QDateBefore
            public void clickBefore(boolean r1, com.qcwireless.qc_utils.date.DateUtil dateUtil2) {
                com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel weekViewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil2, "dateUtil");
                com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment.this.date = dateUtil2;
                weekViewModel2 = com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment.this.getWeekViewModel();
                weekViewModel2.weekSportPlusDetail(dateUtil2);
            }
        });
        getWeekViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment.m1213loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment.this, (com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel.WeekSportUI) obj);
            }
        });
        com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter sportDetailAdapter4 = this.adapter;
        if (sportDetailAdapter4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            sportDetailAdapter = sportDetailAdapter4;
        }
        sportDetailAdapter.setOnItemClickListener(new com.chad.library.adapter.base.listener.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment$$ExternalSyntheticLambda1
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
                com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment.m1214loadDataOnce$lambda6$lambda5(com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment.this, baseQuickAdapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-2, reason: not valid java name */
    public static final void m1213loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment weekSportFragment, com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel.WeekSportUI weekSportUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekSportFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentWeekSportBinding fragmentWeekSportBinding = weekSportFragment.binding;
        com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter sportDetailAdapter = null;
        if (fragmentWeekSportBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeekSportBinding = null;
        }
        fragmentWeekSportBinding.weekTotal.setText(weekSportUI.getSportTimes());
        fragmentWeekSportBinding.totalTimes.setItemTitle(weekSportUI.getSportCounts());
        fragmentWeekSportBinding.totalCal.setItemTitle(weekSportUI.getSportCalorie());
        fragmentWeekSportBinding.totalDays.setItemTitle(weekSportUI.getDays());
        if (weekSportFragment.getWeekViewModel().getSportDetailList().size() == 0) {
            com.qcwireless.qcwatch.databinding.FragmentWeekSportBinding fragmentWeekSportBinding2 = weekSportFragment.binding;
            if (fragmentWeekSportBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekSportBinding2 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentWeekSportBinding2.noDataLayout);
        } else {
            com.qcwireless.qcwatch.databinding.FragmentWeekSportBinding fragmentWeekSportBinding3 = weekSportFragment.binding;
            if (fragmentWeekSportBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeekSportBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentWeekSportBinding3.noDataLayout);
        }
        com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter sportDetailAdapter2 = weekSportFragment.adapter;
        if (sportDetailAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            sportDetailAdapter = sportDetailAdapter2;
        }
        sportDetailAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-6$lambda-5, reason: not valid java name */
    public static final void m1214loadDataOnce$lambda6$lambda5(com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment weekSportFragment, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekSportFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail sportDetail = weekSportFragment.getWeekViewModel().getSportDetailList().get(i);
        if (((int) sportDetail.getDistance()) == 0) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("sport_type", sportDetail.getSportType());
            bundle.putLong("start_time", sportDetail.getStartTime());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment weekSportFragment2 = weekSportFragment;
            android.content.Context activity = weekSportFragment2.getActivity();
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
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        }
                    }
                }
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                weekSportFragment2.startActivity(intent);
                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                return;
            }
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("sport_type", sportDetail.getSportType());
        bundle2.putLong("start_time", sportDetail.getStartTime());
        kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
        com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment weekSportFragment3 = weekSportFragment;
        android.content.Context activity2 = weekSportFragment3.getActivity();
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
                        kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                    }
                }
            }
            kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
            weekSportFragment3.startActivity(intent2);
            kotlin.Unit unit13 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit14 = kotlin.Unit.INSTANCE;
        }
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-----week");
            com.qcwireless.qcwatch.ui.home.sport.week.WeekSportViewModel weekViewModel = getWeekViewModel();
            com.qcwireless.qc_utils.date.DateUtil dateUtil = this.date;
            if (dateUtil == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("date");
                dateUtil = null;
            }
            weekViewModel.weekSportPlusDetail(dateUtil);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    /* compiled from: WeekSportFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/week/WeekSportFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/sport/week/WeekSportFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.sport.week.WeekSportFragment();
        }
    }
}
