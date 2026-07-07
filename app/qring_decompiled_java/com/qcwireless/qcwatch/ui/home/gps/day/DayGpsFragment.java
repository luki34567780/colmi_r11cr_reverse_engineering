package com.qcwireless.qcwatch.ui.home.gps.day;

/* compiled from: DayGpsFragment.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/day/DayGpsFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/gps/adapter/GpsDetailAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentDayGpsBinding;", "viewModel", "Lcom/qcwireless/qcwatch/ui/home/gps/day/DayGpsFragmentViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/home/gps/day/DayGpsFragmentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "loadDataOnce", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DayGpsFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment.Companion(null);
    private com.qcwireless.qcwatch.ui.home.gps.adapter.GpsDetailAdapter adapter;
    private com.qcwireless.qcwatch.databinding.FragmentDayGpsBinding binding;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public DayGpsFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel m1019invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel.class), qualifier, qualifier);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel) this.viewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentDayGpsBinding inflate = com.qcwireless.qcwatch.databinding.FragmentDayGpsBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        com.qcwireless.qcwatch.databinding.FragmentDayGpsBinding fragmentDayGpsBinding = this.binding;
        if (fragmentDayGpsBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayGpsBinding = null;
        }
        return fragmentDayGpsBinding.getRoot();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        getViewModel().getUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment.m1017loadDataOnce$lambda1(com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment.this, (com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel.GpsDetailUI) obj);
            }
        });
        getViewModel().queryDetailByDate(new com.qcwireless.qc_utils.date.DateUtil());
        final com.qcwireless.qcwatch.databinding.FragmentDayGpsBinding fragmentDayGpsBinding = this.binding;
        com.qcwireless.qcwatch.ui.home.gps.adapter.GpsDetailAdapter gpsDetailAdapter = null;
        if (fragmentDayGpsBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayGpsBinding = null;
        }
        fragmentDayGpsBinding.qcDateChange.setDateUtil(new com.qcwireless.qc_utils.date.DateUtil());
        fragmentDayGpsBinding.qcDateChange.setDateListener(new com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore() { // from class: com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment$loadDataOnce$2$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QDateSwitchView.QDateBefore
            public void clickBefore(boolean r1, com.qcwireless.qc_utils.date.DateUtil dateUtil) {
                com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel viewModel;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
                com.qcwireless.qcwatch.databinding.FragmentDayGpsBinding.this.qcDateChange.setDateUtil(dateUtil);
                viewModel = this.getViewModel();
                viewModel.queryDetailByDate(dateUtil);
            }
        });
        this.adapter = new com.qcwireless.qcwatch.ui.home.gps.adapter.GpsDetailAdapter(getActivity(), getViewModel().getGpsDetailList());
        fragmentDayGpsBinding.gpsDetailRcv.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
        androidx.recyclerview.widget.RecyclerView recyclerView = fragmentDayGpsBinding.gpsDetailRcv;
        com.qcwireless.qcwatch.ui.home.gps.adapter.GpsDetailAdapter gpsDetailAdapter2 = this.adapter;
        if (gpsDetailAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            gpsDetailAdapter2 = null;
        }
        recyclerView.setAdapter(gpsDetailAdapter2);
        com.qcwireless.qcwatch.ui.home.gps.adapter.GpsDetailAdapter gpsDetailAdapter3 = this.adapter;
        if (gpsDetailAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            gpsDetailAdapter3 = null;
        }
        gpsDetailAdapter3.notifyDataSetChanged();
        com.qcwireless.qcwatch.ui.home.gps.adapter.GpsDetailAdapter gpsDetailAdapter4 = this.adapter;
        if (gpsDetailAdapter4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            gpsDetailAdapter = gpsDetailAdapter4;
        }
        gpsDetailAdapter.setOnItemClickListener(new com.chad.library.adapter.base.listener.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment$$ExternalSyntheticLambda1
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
                com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment.m1018loadDataOnce$lambda3(com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment.this, baseQuickAdapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-1, reason: not valid java name */
    public static final void m1017loadDataOnce$lambda1(com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment dayGpsFragment, com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel.GpsDetailUI gpsDetailUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayGpsFragment, "this$0");
        com.qcwireless.qcwatch.databinding.FragmentDayGpsBinding fragmentDayGpsBinding = dayGpsFragment.binding;
        com.qcwireless.qcwatch.ui.home.gps.adapter.GpsDetailAdapter gpsDetailAdapter = null;
        if (fragmentDayGpsBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDayGpsBinding = null;
        }
        fragmentDayGpsBinding.todayTotalDuring.setText(gpsDetailUI.getTotalDuring());
        fragmentDayGpsBinding.totalDistance.setItemTitle(gpsDetailUI.getTotalDistance());
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView = fragmentDayGpsBinding.totalDistance;
            java.lang.String string = dayGpsFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_88);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_88)");
            qSportItemView.setItemUnit(string);
        } else {
            com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView2 = fragmentDayGpsBinding.totalDistance;
            java.lang.String string2 = dayGpsFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_358);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_358)");
            qSportItemView2.setItemUnit(string2);
        }
        fragmentDayGpsBinding.totalCal.setItemTitle(gpsDetailUI.getTotalCalorie());
        fragmentDayGpsBinding.totalTimes.setItemTitle(gpsDetailUI.getTotalTime());
        com.qcwireless.qcwatch.ui.home.gps.adapter.GpsDetailAdapter gpsDetailAdapter2 = dayGpsFragment.adapter;
        if (gpsDetailAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            gpsDetailAdapter = gpsDetailAdapter2;
        }
        gpsDetailAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-3, reason: not valid java name */
    public static final void m1018loadDataOnce$lambda3(com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment dayGpsFragment, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayGpsFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        final com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail gpsDetail = dayGpsFragment.getViewModel().getGpsDetailList().get(i);
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(dayGpsFragment, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment$loadDataOnce$3$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment dayGpsFragment2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayGpsFragment2, "$this$ktxRunOnBgSingle");
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail.this);
                com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail queryByTypeAndStartTime = com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.INSTANCE.getGetInstance().queryByTypeAndStartTime(com.luck.picture.lib.utils.AnimUtils.DURATION, com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail.this.getStartTime());
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, queryByTypeAndStartTime);
                if (queryByTypeAndStartTime != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("sport_type", com.luck.picture.lib.utils.AnimUtils.DURATION);
                    bundle.putLong("start_time", queryByTypeAndStartTime.getStartTime());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment dayGpsFragment3 = dayGpsFragment2;
                    android.content.Context activity = dayGpsFragment3.getActivity();
                    if (activity != null) {
                        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.sport.SportDetailDistanceActivity.class);
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
                        dayGpsFragment3.startActivity(intent);
                        kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                        kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                        return;
                    }
                    return;
                }
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putLong("start", com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail.this.getStartTime());
                kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                if (com.qcwireless.qc_utils.date.LanguageUtil.isChina()) {
                    com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment dayGpsFragment4 = dayGpsFragment2;
                    android.content.Context activity2 = dayGpsFragment4.getActivity();
                    if (activity2 != null) {
                        java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity2, "it");
                        android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.gps.GpsCNMapActivity.class);
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
                        dayGpsFragment4.startActivity(intent2);
                        kotlin.Unit unit13 = kotlin.Unit.INSTANCE;
                        kotlin.Unit unit14 = kotlin.Unit.INSTANCE;
                        return;
                    }
                    return;
                }
                com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment dayGpsFragment5 = dayGpsFragment2;
                android.content.Context activity3 = dayGpsFragment5.getActivity();
                if (activity3 != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList3 = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity3, "it");
                    android.content.Intent intent3 = new android.content.Intent(activity3, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.gps.GpsMapActivity.class);
                    intent3.setFlags(1);
                    intent3.putExtras(bundle2);
                    for (kotlin.Pair pair3 : arrayList3) {
                        if (pair3 != null) {
                            java.lang.String str3 = (java.lang.String) pair3.getFirst();
                            java.lang.Object second3 = pair3.getSecond();
                            if (second3 instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).intValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).byteValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Character) second3).charValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).shortValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Boolean) second3).booleanValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).longValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).floatValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, ((java.lang.Number) second3).doubleValue()), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.lang.String) second3), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.lang.CharSequence) second3), "putExtra(name, value)");
                            } else if (second3 instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (android.os.Parcelable) second3), "putExtra(name, value)");
                            } else if (second3 instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.io.Serializable) second3), "putExtra(name, value)");
                            } else if (second3 instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.io.Serializable) second3), "putExtra(name, value)");
                            } else if (second3 instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (java.io.Serializable) second3), "putExtra(name, value)");
                            } else if (second3 instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (boolean[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (byte[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (short[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (char[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (int[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (long[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (float[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (double[]) second3), "putExtra(name, value)");
                            } else if (second3 instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (android.os.Bundle) second3), "putExtra(name, value)");
                            } else if (second3 instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str3, (android.os.Parcelable) second3), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit15 = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    kotlin.Unit unit16 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit17 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit18 = kotlin.Unit.INSTANCE;
                    dayGpsFragment5.startActivity(intent3);
                    kotlin.Unit unit19 = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit20 = kotlin.Unit.INSTANCE;
                }
            }
        });
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.OnDeviceGPSEvent) {
            getViewModel().queryDetailByDate(new com.qcwireless.qc_utils.date.DateUtil());
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    /* compiled from: DayGpsFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/day/DayGpsFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/home/gps/day/DayGpsFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragment();
        }
    }
}
