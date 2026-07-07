package com.qcwireless.qcwatch.ui.home.sport.day;

/* compiled from: DaySportFragment.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0002 !B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/day/DaySportFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/sport/adapter/SportDetailAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentDaySportBinding;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "dayViewModel", "Lcom/qcwireless/qcwatch/ui/home/sport/day/DaySportFragmentViewModel;", "getDayViewModel", "()Lcom/qcwireless/qcwatch/ui/home/sport/day/DaySportFragmentViewModel;", "dayViewModel$delegate", "Lkotlin/Lazy;", "deviceNotifyListener", "Lcom/qcwireless/qcwatch/ui/home/sport/day/DaySportFragment$MyDeviceNotifyListener;", "loadDataOnce", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "Companion", "MyDeviceNotifyListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DaySportFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment.Companion(null);
    private com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter adapter;
    private com.qcwireless.qcwatch.databinding.FragmentDaySportBinding binding;
    private com.qcwireless.qc_utils.date.DateUtil date = new com.qcwireless.qc_utils.date.DateUtil();

    /* renamed from: dayViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy dayViewModel;
    private com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment.MyDeviceNotifyListener deviceNotifyListener;

    public DaySportFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.dayViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel m1207invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel getDayViewModel() {
        return (com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel) this.dayViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentDaySportBinding inflate = com.qcwireless.qcwatch.databinding.FragmentDaySportBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        com.qcwireless.qcwatch.databinding.FragmentDaySportBinding fragmentDaySportBinding = this.binding;
        if (fragmentDaySportBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDaySportBinding = null;
        }
        return fragmentDaySportBinding.getRoot();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        getDayViewModel().queryLastData();
        final com.qcwireless.qcwatch.databinding.FragmentDaySportBinding fragmentDaySportBinding = this.binding;
        com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter sportDetailAdapter = null;
        if (fragmentDaySportBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDaySportBinding = null;
        }
        this.adapter = new com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter(getActivity(), getDayViewModel().getSportDetailList());
        fragmentDaySportBinding.sportDetailRcv.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
        androidx.recyclerview.widget.RecyclerView recyclerView = fragmentDaySportBinding.sportDetailRcv;
        com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter sportDetailAdapter2 = this.adapter;
        if (sportDetailAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            sportDetailAdapter2 = null;
        }
        recyclerView.setAdapter(sportDetailAdapter2);
        fragmentDaySportBinding.totalTimes.setItemTitle(java.lang.String.valueOf(getDayViewModel().getSportDetailList().size()));
        fragmentDaySportBinding.qcDateChange.setSportFlag(true);
        fragmentDaySportBinding.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment$loadDataOnce$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore
            public void clickBefore(boolean r5, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel dayViewModel;
                com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel dayViewModel2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                if (dateUtil.getZeroTime() <= new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()) {
                    this.date = dateUtil;
                    com.qcwireless.qcwatch.databinding.FragmentDaySportBinding.this.qcDateChange.setDateUtil(dateUtil);
                    dayViewModel = this.getDayViewModel();
                    dayViewModel.daySportPlusDetail(dateUtil);
                    return;
                }
                com.qcwireless.qcwatch.databinding.FragmentDaySportBinding.this.qcDateChange.setDateUtil(new com.qcwireless.qc_utils.date.DateUtil());
                dayViewModel2 = this.getDayViewModel();
                dayViewModel2.daySportPlusDetail(new com.qcwireless.qc_utils.date.DateUtil());
            }
        });
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getDayViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment.m1204loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment.this, (com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI) obj);
            }
        });
        getDayViewModel().getLastDate().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment.m1205loadDataOnce$lambda3(com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment.this, (com.qcwireless.qc_utils.date.DateUtil) obj);
            }
        });
        com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter sportDetailAdapter3 = this.adapter;
        if (sportDetailAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            sportDetailAdapter = sportDetailAdapter3;
        }
        sportDetailAdapter.setOnItemClickListener(new com.chad.library.adapter.base.listener.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment$$ExternalSyntheticLambda2
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
                com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment.m1206loadDataOnce$lambda7$lambda6(com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment.this, baseQuickAdapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-2, reason: not valid java name */
    public static final void m1204loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment daySportFragment, com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI daySportUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daySportFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentDaySportBinding fragmentDaySportBinding = daySportFragment.binding;
        com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter sportDetailAdapter = null;
        if (fragmentDaySportBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDaySportBinding = null;
        }
        fragmentDaySportBinding.weekTotal.setText(daySportUI.getSportTimes());
        fragmentDaySportBinding.totalTimes.setItemTitle(daySportUI.getSportCounts());
        fragmentDaySportBinding.totalCal.setItemTitle(daySportUI.getSportCalorie());
        fragmentDaySportBinding.totalDays.setItemTitle(daySportUI.getDays());
        if (daySportFragment.getDayViewModel().getSportDetailList().size() == 0) {
            com.qcwireless.qcwatch.databinding.FragmentDaySportBinding fragmentDaySportBinding2 = daySportFragment.binding;
            if (fragmentDaySportBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDaySportBinding2 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentDaySportBinding2.noDataLayout);
        } else {
            com.qcwireless.qcwatch.databinding.FragmentDaySportBinding fragmentDaySportBinding3 = daySportFragment.binding;
            if (fragmentDaySportBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentDaySportBinding3 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentDaySportBinding3.noDataLayout);
        }
        com.qcwireless.qcwatch.ui.home.sport.adapter.SportDetailAdapter sportDetailAdapter2 = daySportFragment.adapter;
        if (sportDetailAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            sportDetailAdapter = sportDetailAdapter2;
        }
        sportDetailAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-3, reason: not valid java name */
    public static final void m1205loadDataOnce$lambda3(com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment daySportFragment, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daySportFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dateUtil, "it");
        daySportFragment.date = dateUtil;
        daySportFragment.getDayViewModel().daySportPlusDetail(dateUtil);
        com.qcwireless.qcwatch.databinding.FragmentDaySportBinding fragmentDaySportBinding = daySportFragment.binding;
        if (fragmentDaySportBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDaySportBinding = null;
        }
        fragmentDaySportBinding.qcDateChange.setDateUtil(dateUtil);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-7$lambda-6, reason: not valid java name */
    public static final void m1206loadDataOnce$lambda7$lambda6(com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment daySportFragment, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daySportFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail sportDetail = daySportFragment.getDayViewModel().getSportDetailList().get(i);
        if (((int) sportDetail.getDistance()) == 0) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("sport_type", sportDetail.getSportType());
            bundle.putLong("start_time", sportDetail.getStartTime());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment daySportFragment2 = daySportFragment;
            android.content.Context activity = daySportFragment2.getActivity();
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
                daySportFragment2.startActivity(intent);
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
        com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment daySportFragment3 = daySportFragment;
        android.content.Context activity2 = daySportFragment3.getActivity();
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
            daySportFragment3.startActivity(intent2);
            kotlin.Unit unit13 = kotlin.Unit.INSTANCE;
            kotlin.Unit unit14 = kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onResume() {
        super.onResume();
        this.deviceNotifyListener = new com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment.MyDeviceNotifyListener();
        com.oudmon.ble.base.bluetooth.BleOperateManager bleOperateManager = com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance();
        com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment.MyDeviceNotifyListener myDeviceNotifyListener = this.deviceNotifyListener;
        if (myDeviceNotifyListener == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceNotifyListener");
            myDeviceNotifyListener = null;
        }
        bleOperateManager.addOutDeviceListener(7, myDeviceNotifyListener);
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.ManualRefreshEvent) && this.date.isToday()) {
            getDayViewModel().queryLastData();
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().removeOutDeviceListener(7);
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    /* compiled from: DaySportFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/day/DaySportFragment$MyDeviceNotifyListener;", "Lcom/oudmon/ble/base/communication/responseImpl/DeviceNotifyListener;", "(Lcom/qcwireless/qcwatch/ui/home/sport/day/DaySportFragment;)V", "onDataResponse", "", "resultEntity", "Lcom/oudmon/ble/base/communication/rsp/DeviceNotifyRsp;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyDeviceNotifyListener extends com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener {
        public MyDeviceNotifyListener() {
        }

        @Override // com.oudmon.ble.base.communication.responseImpl.DeviceNotifyListener, com.oudmon.ble.base.communication.ICommandResponse
        public void onDataResponse(com.oudmon.ble.base.communication.rsp.DeviceNotifyRsp resultEntity) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(resultEntity);
            if (resultEntity.getStatus() == 0 && resultEntity.getDataType() == 7) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.INSTANCE.getGetInstance().syncTodaySportPlus((com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult) new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<java.util.List<? extends com.oudmon.ble.base.communication.sport.SportPlusEntity>>() { // from class: com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment$MyDeviceNotifyListener$onDataResponse$1
                    @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
                    public void result(int errorCode, java.util.List<? extends com.oudmon.ble.base.communication.sport.SportPlusEntity> t) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "当天运动同步结束");
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
                    }
                });
            }
        }
    }

    /* compiled from: DaySportFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/day/DaySportFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/sport/day/DaySportFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragment();
        }
    }
}
