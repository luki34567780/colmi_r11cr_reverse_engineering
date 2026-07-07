package com.qcwireless.qcwatch.ui.plate.market;

/* compiled from: WatchMarketFragment.kt */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u0001:\u000267B\u0005¢\u0006\u0002\u0010\u0002J4\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"0!\u0018\u00010!\"\u0004\b\u0000\u0010\"2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u0002H\"\u0018\u00010!2\u0006\u0010$\u001a\u00020\bH\u0002J\b\u0010%\u001a\u00020&H\u0016J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020&H\u0016J\u0010\u00100\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0007J\b\u00103\u001a\u00020&H\u0016J\u0010\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u00068"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentWatchMarketBinding;", "currBean", "Lcom/qcwireless/qcwatch/ui/plate/bean/MarketWatchFaceBean;", "currDeletePosition", "", "currPage", "deviceAdapter", "Lcom/qcwireless/qcwatch/ui/plate/adapter/DeviceWatchFaceListAdapter;", "handler", "Landroid/os/Handler;", "isError", "", "marketAdapter", "Lcom/qcwireless/qcwatch/ui/plate/adapter/MarketWatchFaceListAdapter;", "marketItemClickPosition", "maxWatchFace", "ongoing", "pageCount", "pageIndex", "timeOutRunnable", "Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragment$TimeOutRunnable;", "totalPage", "watchFaceViewModel", "Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragmentViewModel;", "getWatchFaceViewModel", "()Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragmentViewModel;", "watchFaceViewModel$delegate", "Lkotlin/Lazy;", "fixedGrouping", "", "T", "source", "n", "loadDataOnce", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "toInstallActivity", "position", "Companion", "TimeOutRunnable", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WatchMarketFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.Companion(null);
    private com.qcwireless.qcwatch.databinding.FragmentWatchMarketBinding binding;
    private com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean currBean;
    private com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceAdapter;
    private final android.os.Handler handler;
    private boolean isError;
    private com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketAdapter;
    private boolean ongoing;
    private int pageIndex;

    /* renamed from: watchFaceViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy watchFaceViewModel;
    private int marketItemClickPosition = -1;
    private int currDeletePosition = -1;
    private final com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.TimeOutRunnable timeOutRunnable = new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.TimeOutRunnable();
    private int maxWatchFace = 6;
    private int totalPage = 320;
    private int currPage = 18;
    private final int pageCount = 18;

    public WatchMarketFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.watchFaceViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel>() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel m1417invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.class), qualifier, qualifier);
            }
        });
        final android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        this.handler = new android.os.Handler(mainLooper) { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment$handler$1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message msg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
            }
        };
    }

    private final com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel getWatchFaceViewModel() {
        return (com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel) this.watchFaceViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentWatchMarketBinding inflate = com.qcwireless.qcwatch.databinding.FragmentWatchMarketBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        com.qcwireless.qcwatch.databinding.FragmentWatchMarketBinding fragmentWatchMarketBinding = this.binding;
        if (fragmentWatchMarketBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWatchMarketBinding = null;
        }
        return fragmentWatchMarketBinding.getRoot();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        int maxWatchFace = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMaxWatchFace();
        this.maxWatchFace = maxWatchFace;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(maxWatchFace));
        getWatchFaceViewModel().getWatchFaceFromDevice();
        com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter = new com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter(getActivity());
        this.marketAdapter = marketWatchFaceListAdapter;
        marketWatchFaceListAdapter.setData$com_github_CymChad_brvah(getWatchFaceViewModel().getMarketList());
        com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter = new com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter(getActivity());
        this.deviceAdapter = deviceWatchFaceListAdapter;
        deviceWatchFaceListAdapter.setData$com_github_CymChad_brvah(getWatchFaceViewModel().getWatchList());
        com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter2 = null;
        android.view.View inflate = android.view.LayoutInflater.from(getActivity()).inflate(com.qcwireless.qcwatch.R.layout.recycleview_watch_market_header, (android.view.ViewGroup) null);
        androidx.recyclerview.widget.RecyclerView findViewById = inflate.findViewById(com.qcwireless.qcwatch.R.id.rcv_local_view);
        androidx.recyclerview.widget.SimpleItemAnimator itemAnimator = findViewById.getItemAnimator();
        java.util.Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        itemAnimator.setSupportsChangeAnimations(false);
        com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter2 = this.deviceAdapter;
        if (deviceWatchFaceListAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceAdapter");
            deviceWatchFaceListAdapter2 = null;
        }
        findViewById.setAdapter(deviceWatchFaceListAdapter2);
        findViewById.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(getActivity(), 3));
        com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter3 = this.marketAdapter;
        if (marketWatchFaceListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
            marketWatchFaceListAdapter3 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "headerView");
        com.chad.library.adapter.base.BaseQuickAdapter.addHeaderView$default(marketWatchFaceListAdapter3, inflate, 0, 0, 6, null);
        com.qcwireless.qcwatch.databinding.FragmentWatchMarketBinding fragmentWatchMarketBinding = this.binding;
        if (fragmentWatchMarketBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWatchMarketBinding = null;
        }
        com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter4 = this.marketAdapter;
        if (marketWatchFaceListAdapter4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
            marketWatchFaceListAdapter4 = null;
        }
        marketWatchFaceListAdapter4.setHasStableIds(true);
        androidx.recyclerview.widget.SimpleItemAnimator itemAnimator2 = fragmentWatchMarketBinding.rcvNetworkView.getItemAnimator();
        java.util.Objects.requireNonNull(itemAnimator2, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        itemAnimator2.setSupportsChangeAnimations(false);
        com.qcwireless.qcwatch.ui.base.view.MyRecycleView myRecycleView = fragmentWatchMarketBinding.rcvNetworkView;
        com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter5 = this.marketAdapter;
        if (marketWatchFaceListAdapter5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
            marketWatchFaceListAdapter5 = null;
        }
        myRecycleView.setAdapter(marketWatchFaceListAdapter5);
        final androidx.recyclerview.widget.RecyclerView.LayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(getActivity(), 3);
        fragmentWatchMarketBinding.rcvNetworkView.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setSpanSizeLookup(new androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment$loadDataOnce$1$1
            public int getSpanSize(int position) {
                if (position == 0) {
                    return gridLayoutManager.getSpanCount();
                }
                return 1;
            }
        });
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getWatchFaceViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment$$ExternalSyntheticLambda4
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.m1407loadDataOnce$lambda1(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.this, (com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.WatchMarketUI) obj);
            }
        });
        com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter3 = this.deviceAdapter;
        if (deviceWatchFaceListAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceAdapter");
            deviceWatchFaceListAdapter3 = null;
        }
        deviceWatchFaceListAdapter3.getDeletePosition().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment$$ExternalSyntheticLambda5
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.m1408loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.this, (java.lang.Integer) obj);
            }
        });
        com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter6 = this.marketAdapter;
        if (marketWatchFaceListAdapter6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
            marketWatchFaceListAdapter6 = null;
        }
        marketWatchFaceListAdapter6.setOnItemClickListener(new com.chad.library.adapter.base.listener.OnItemClickListener() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment$$ExternalSyntheticLambda6
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
                com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.m1409loadDataOnce$lambda4(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.this, baseQuickAdapter, view, i);
            }
        });
        getWatchFaceViewModel().getFileDownloadSuccess().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment$$ExternalSyntheticLambda0
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.m1411loadDataOnce$lambda5(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.this, (com.qcwireless.qcwatch.ui.base.repository.watchface.ListenerBean) obj);
            }
        });
        com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter7 = this.marketAdapter;
        if (marketWatchFaceListAdapter7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
        } else {
            marketWatchFaceListAdapter2 = marketWatchFaceListAdapter7;
        }
        marketWatchFaceListAdapter2.getFileNotExists().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment$$ExternalSyntheticLambda1
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.m1412loadDataOnce$lambda6(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.this, (com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean) obj);
            }
        });
        getWatchFaceViewModel().getProgressValue().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment$$ExternalSyntheticLambda2
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.m1413loadDataOnce$lambda7(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.this, (com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI) obj);
            }
        });
        getWatchFaceViewModel().getMarketState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment$$ExternalSyntheticLambda3
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.m1414loadDataOnce$lambda8(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.this, (com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.WatchMarketUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-1, reason: not valid java name */
    public static final void m1407loadDataOnce$lambda1(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment watchMarketFragment, com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.WatchMarketUI watchMarketUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchMarketFragment, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-------------do it-----------" + watchMarketUI.getMarketList().size());
        watchMarketFragment.getWatchFaceViewModel().getWatchList().clear();
        watchMarketFragment.getWatchFaceViewModel().getWatchList().addAll(watchMarketUI.getWatchList());
        com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter = watchMarketFragment.deviceAdapter;
        com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter = null;
        if (deviceWatchFaceListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceAdapter");
            deviceWatchFaceListAdapter = null;
        }
        deviceWatchFaceListAdapter.notifyDataSetChanged();
        if (watchMarketUI.getMarketList().size() != watchMarketFragment.getWatchFaceViewModel().getMarketListBackup().size() || watchMarketUI.getWatchList().size() != watchMarketFragment.getWatchFaceViewModel().getWatchListBackUp().size() || watchMarketFragment.getWatchFaceViewModel().getMarketList().size() == 0) {
            watchMarketFragment.getWatchFaceViewModel().getWatchListBackUp().clear();
            watchMarketFragment.getWatchFaceViewModel().getWatchListBackUp().addAll(watchMarketUI.getWatchList());
            watchMarketFragment.getWatchFaceViewModel().getMarketList().clear();
            watchMarketFragment.getWatchFaceViewModel().getMarketList().addAll(watchMarketUI.getMarketList());
            watchMarketFragment.getWatchFaceViewModel().getMarketListBackup().clear();
            watchMarketFragment.getWatchFaceViewModel().getMarketListBackup().addAll(watchMarketUI.getMarketList());
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-----刷新表盘");
            com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter2 = watchMarketFragment.marketAdapter;
            if (marketWatchFaceListAdapter2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
            } else {
                marketWatchFaceListAdapter = marketWatchFaceListAdapter2;
            }
            marketWatchFaceListAdapter.notifyDataSetChanged();
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "market size:" + watchMarketUI.getMarketList().size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-2, reason: not valid java name */
    public static final void m1408loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment watchMarketFragment, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchMarketFragment, "this$0");
        if (num != null) {
            try {
                if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                    java.lang.String string = watchMarketFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                } else if (watchMarketFragment.ongoing) {
                    java.lang.String string2 = watchMarketFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_249);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_249)");
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                } else {
                    if (watchMarketFragment.getWatchFaceViewModel().getWatchList().size() < num.intValue()) {
                        return;
                    }
                    watchMarketFragment.showLoadingDialogTimeout(15000);
                    watchMarketFragment.ongoing = false;
                    com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean deviceWatchFaceBean = watchMarketFragment.getWatchFaceViewModel().getWatchList().get(num.intValue());
                    watchMarketFragment.currDeletePosition = num.intValue();
                    watchMarketFragment.getWatchFaceViewModel().deleteWatchFaceToDevice(deviceWatchFaceBean.getWatchFace().getName());
                    watchMarketFragment.handler.postDelayed(watchMarketFragment.timeOutRunnable, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.LOCATION_UPDATE_INTERVAL);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-4, reason: not valid java name */
    public static final void m1409loadDataOnce$lambda4(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment watchMarketFragment, com.chad.library.adapter.base.BaseQuickAdapter baseQuickAdapter, android.view.View view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchMarketFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "<anonymous parameter 0>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        if (watchMarketFragment.getWatchFaceViewModel().getMarketList().size() * 2 < com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getServerMarketSize()) {
            watchMarketFragment.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.m1410loadDataOnce$lambda4$lambda3();
                }
            }, 6000L);
        } else {
            if (com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().getSync()) {
                java.lang.String string = watchMarketFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_236);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_236)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                return;
            }
            watchMarketFragment.toInstallActivity(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-4$lambda-3, reason: not valid java name */
    public static final void m1410loadDataOnce$lambda4$lambda3() {
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setServerMarketSize(0);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-5, reason: not valid java name */
    public static final void m1411loadDataOnce$lambda5(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment watchMarketFragment, com.qcwireless.qcwatch.ui.base.repository.watchface.ListenerBean listenerBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchMarketFragment, "this$0");
        if (listenerBean.getSuccess()) {
            if (watchMarketFragment.getWatchFaceViewModel().getWatchList().size() >= watchMarketFragment.maxWatchFace) {
                watchMarketFragment.ongoing = false;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string = watchMarketFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_268);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_268)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(watchMarketFragment.maxWatchFace)}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(format, 0, 1, null);
                return;
            }
            for (com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean marketWatchFaceBean : watchMarketFragment.getWatchFaceViewModel().getMarketList()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(marketWatchFaceBean.getWatchFace().getName(), listenerBean.getName())) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, listenerBean.getName());
                    watchMarketFragment.ongoing = false;
                    watchMarketFragment.getWatchFaceViewModel().execWatchFaceToDeviceByName(marketWatchFaceBean.getWatchFace().getName());
                    return;
                }
            }
            return;
        }
        if (com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isNetworkAvailable(watchMarketFragment.getActivity())) {
            return;
        }
        watchMarketFragment.dismissLoadingDialogDelay(1000);
        java.lang.String string2 = watchMarketFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_223);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_223)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-6, reason: not valid java name */
    public static final void m1412loadDataOnce$lambda6(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment watchMarketFragment, com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean marketWatchFaceBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchMarketFragment, "this$0");
        com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel watchFaceViewModel = watchMarketFragment.getWatchFaceViewModel();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(marketWatchFaceBean, "it");
        watchFaceViewModel.downloadWatchFaceImageFileNotExists(marketWatchFaceBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-7, reason: not valid java name */
    public static final void m1413loadDataOnce$lambda7(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment watchMarketFragment, com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.ProgressUI progressUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchMarketFragment, "this$0");
        watchMarketFragment.ongoing = progressUI.isRunning();
        com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter = null;
        if (watchMarketFragment.marketItemClickPosition >= 0 && progressUI != null && !progressUI.isDelete() && watchMarketFragment.marketItemClickPosition < watchMarketFragment.getWatchFaceViewModel().getMarketList().size()) {
            com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean marketWatchFaceBean = watchMarketFragment.getWatchFaceViewModel().getMarketList().get(watchMarketFragment.marketItemClickPosition);
            marketWatchFaceBean.setProgressBar(progressUI.getProgress());
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(3);
            if (!watchMarketFragment.isDialogShowing()) {
                watchMarketFragment.showLoadingDialogTimeout(60000);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "show dialog");
            }
            com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter2 = watchMarketFragment.marketAdapter;
            if (marketWatchFaceListAdapter2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
                marketWatchFaceListAdapter2 = null;
            }
            marketWatchFaceListAdapter2.notifyItemChanged(watchMarketFragment.marketItemClickPosition);
            if (progressUI.getProgress() == 100 && progressUI.getSuccess()) {
                watchMarketFragment.ongoing = false;
                com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
                watchMarketFragment.handler.removeCallbacks(watchMarketFragment.timeOutRunnable);
                com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean deviceWatchFaceBean = new com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean(marketWatchFaceBean.getWatchFace(), true);
                java.lang.String name = marketWatchFaceBean.getWatchFace().getName();
                com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean marketWatchFaceBean2 = watchMarketFragment.currBean;
                kotlin.jvm.internal.Intrinsics.checkNotNull(marketWatchFaceBean2);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(name, marketWatchFaceBean2.getWatchFace().getName())) {
                    watchMarketFragment.getWatchFaceViewModel().getWatchFaceFromDevice();
                } else {
                    watchMarketFragment.getWatchFaceViewModel().getWatchList().add(deviceWatchFaceBean);
                    watchMarketFragment.getWatchFaceViewModel().getMarketList().remove(marketWatchFaceBean);
                    watchMarketFragment.getWatchFaceViewModel().getLocalWatchFace().put(marketWatchFaceBean.getWatchFace().getName(), deviceWatchFaceBean);
                    com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter = watchMarketFragment.deviceAdapter;
                    if (deviceWatchFaceListAdapter == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceAdapter");
                        deviceWatchFaceListAdapter = null;
                    }
                    deviceWatchFaceListAdapter.notifyDataSetChanged();
                    com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter3 = watchMarketFragment.marketAdapter;
                    if (marketWatchFaceListAdapter3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
                        marketWatchFaceListAdapter3 = null;
                    }
                    marketWatchFaceListAdapter3.notifyDataSetChanged();
                }
                watchMarketFragment.dismissLoadingDialog();
            }
        }
        if (progressUI != null) {
            if (progressUI.isDelete()) {
                try {
                    watchMarketFragment.dismissLoadingDialog();
                    watchMarketFragment.handler.removeCallbacks(watchMarketFragment.timeOutRunnable);
                    watchMarketFragment.ongoing = false;
                    com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean deviceWatchFaceBean2 = watchMarketFragment.getWatchFaceViewModel().getWatchList().get(watchMarketFragment.currDeletePosition);
                    watchMarketFragment.getWatchFaceViewModel().getLocalWatchFace().remove(deviceWatchFaceBean2.getWatchFace().getName());
                    watchMarketFragment.getWatchFaceViewModel().getWatchList().remove(deviceWatchFaceBean2);
                    watchMarketFragment.getWatchFaceViewModel().getMarketList().add(new com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean(deviceWatchFaceBean2.getWatchFace(), 0));
                    com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter2 = watchMarketFragment.deviceAdapter;
                    if (deviceWatchFaceListAdapter2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceAdapter");
                        deviceWatchFaceListAdapter2 = null;
                    }
                    deviceWatchFaceListAdapter2.notifyDataSetChanged();
                    com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter4 = watchMarketFragment.marketAdapter;
                    if (marketWatchFaceListAdapter4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
                        marketWatchFaceListAdapter4 = null;
                    }
                    marketWatchFaceListAdapter4.notifyDataSetChanged();
                } catch (java.lang.Exception unused) {
                }
            }
            if (progressUI.getError()) {
                try {
                    watchMarketFragment.ongoing = false;
                    watchMarketFragment.dismissLoadingDialog();
                    com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean marketWatchFaceBean3 = watchMarketFragment.getWatchFaceViewModel().getMarketList().get(watchMarketFragment.marketItemClickPosition);
                    watchMarketFragment.getWatchFaceViewModel().queryByName(marketWatchFaceBean3.getWatchFace().getName());
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "------------------手表报错");
                    if (progressUI.getProgress() == 666) {
                        marketWatchFaceBean3.getWatchFace().setLocalBinUrl("");
                        watchMarketFragment.getWatchFaceViewModel().getMarketList().set(watchMarketFragment.marketItemClickPosition, marketWatchFaceBean3);
                        watchMarketFragment.getWatchFaceViewModel().downloadWatchFaceNotExistsNotRepeat(marketWatchFaceBean3);
                    }
                    com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter3 = watchMarketFragment.deviceAdapter;
                    if (deviceWatchFaceListAdapter3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceAdapter");
                        deviceWatchFaceListAdapter3 = null;
                    }
                    deviceWatchFaceListAdapter3.notifyDataSetChanged();
                    com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter5 = watchMarketFragment.marketAdapter;
                    if (marketWatchFaceListAdapter5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
                    } else {
                        marketWatchFaceListAdapter = marketWatchFaceListAdapter5;
                    }
                    marketWatchFaceListAdapter.notifyDataSetChanged();
                    return;
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            return;
        }
        watchMarketFragment.ongoing = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-8, reason: not valid java name */
    public static final void m1414loadDataOnce$lambda8(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment watchMarketFragment, com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragmentViewModel.WatchMarketUI watchMarketUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchMarketFragment, "this$0");
        watchMarketFragment.getWatchFaceViewModel().getMarketList().clear();
        watchMarketFragment.getWatchFaceViewModel().getMarketList().addAll(watchMarketUI.getMarketList());
        com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter = watchMarketFragment.marketAdapter;
        if (marketWatchFaceListAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
            marketWatchFaceListAdapter = null;
        }
        marketWatchFaceListAdapter.notifyDataSetChanged();
    }

    private final void toInstallActivity(int position) {
        if (getWatchFaceViewModel().getWatchList().size() >= this.maxWatchFace) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_268);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_268)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.maxWatchFace)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(format, 0, 1, null);
            return;
        }
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
            return;
        }
        com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean marketWatchFaceBean = getWatchFaceViewModel().getMarketList().get(position);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("dialName", marketWatchFaceBean.getWatchFace().getName());
        com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment watchMarketFragment = this;
        android.content.Context activity = watchMarketFragment.getActivity();
        if (activity != null) {
            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.plate.market.WatchFaceInstallActivity.class);
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
            watchMarketFragment.startActivity(intent);
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onResume() {
        super.onResume();
        getWatchFaceViewModel().initCallback();
        getWatchFaceViewModel().checkCustomizeWatchFace();
    }

    /* compiled from: WatchMarketFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragment$TimeOutRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragment;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TimeOutRunnable implements java.lang.Runnable {
        public TimeOutRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.this.ongoing = false;
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().setUpdating(0);
        }
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter = null;
        com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter = null;
        com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter2 = null;
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.RefreshEvent) && kotlin.jvm.internal.Intrinsics.areEqual(getClass(), ((com.qcwireless.qcwatch.base.event.RefreshEvent) messageEvent).getActivityClass())) {
            this.maxWatchFace = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMaxWatchFace();
            try {
                if (!this.ongoing) {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "----onMessageEvent WatchFaceRefreshEvent");
                    if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                        if (!com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().getSyncSportPlus()) {
                            getWatchFaceViewModel().getMarketListBackup().clear();
                            getWatchFaceViewModel().getWatchFaceFromDevice();
                        } else {
                            this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment$$ExternalSyntheticLambda8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.m1415onMessageEvent$lambda10(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.this);
                                }
                            }, 3000L);
                        }
                    } else {
                        com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter3 = this.marketAdapter;
                        if (marketWatchFaceListAdapter3 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
                            marketWatchFaceListAdapter3 = null;
                        }
                        marketWatchFaceListAdapter3.notifyDataSetChanged();
                        com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter2 = this.deviceAdapter;
                        if (deviceWatchFaceListAdapter2 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceAdapter");
                            deviceWatchFaceListAdapter2 = null;
                        }
                        deviceWatchFaceListAdapter2.notifyDataSetChanged();
                    }
                } else {
                    com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter4 = this.marketAdapter;
                    if (marketWatchFaceListAdapter4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
                        marketWatchFaceListAdapter4 = null;
                    }
                    marketWatchFaceListAdapter4.notifyDataSetChanged();
                    com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter3 = this.deviceAdapter;
                    if (deviceWatchFaceListAdapter3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceAdapter");
                        deviceWatchFaceListAdapter3 = null;
                    }
                    deviceWatchFaceListAdapter3.notifyDataSetChanged();
                }
            } catch (java.lang.Exception unused) {
            }
            java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
            if (deviceAddress == null || deviceAddress.length() == 0) {
                getWatchFaceViewModel().getWatchList().clear();
                getWatchFaceViewModel().getMarketList().clear();
                com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter4 = this.deviceAdapter;
                if (deviceWatchFaceListAdapter4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceAdapter");
                    deviceWatchFaceListAdapter4 = null;
                }
                deviceWatchFaceListAdapter4.notifyDataSetChanged();
                com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter5 = this.marketAdapter;
                if (marketWatchFaceListAdapter5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
                    marketWatchFaceListAdapter5 = null;
                }
                marketWatchFaceListAdapter5.notifyDataSetChanged();
            }
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.WatchFaceRefreshEvent) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---WatchFaceRefreshEvent");
            getWatchFaceViewModel().getWatchFaceFromDevice();
            return;
        }
        try {
            if (messageEvent instanceof com.qcwireless.qcwatch.base.event.WatchFaceInstallSuccessEvent) {
                if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                    if (!com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.INSTANCE.getGetInstance().getSyncSportPlus()) {
                        getWatchFaceViewModel().getMarketListBackup().clear();
                        getWatchFaceViewModel().getWatchFaceFromDevice();
                        return;
                    } else {
                        this.handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment$$ExternalSyntheticLambda7
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.m1416onMessageEvent$lambda11(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.this);
                            }
                        }, 3000L);
                        return;
                    }
                }
                com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter6 = this.marketAdapter;
                if (marketWatchFaceListAdapter6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
                    marketWatchFaceListAdapter6 = null;
                }
                marketWatchFaceListAdapter6.notifyDataSetChanged();
                com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter5 = this.deviceAdapter;
                if (deviceWatchFaceListAdapter5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceAdapter");
                } else {
                    deviceWatchFaceListAdapter = deviceWatchFaceListAdapter5;
                }
                deviceWatchFaceListAdapter.notifyDataSetChanged();
                return;
            }
            if (messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) {
                this.ongoing = false;
                if (((com.qcwireless.qcwatch.base.event.BluetoothEvent) messageEvent).getConnect()) {
                    return;
                }
                dismissLoadingDialog();
                com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter6 = this.deviceAdapter;
                if (deviceWatchFaceListAdapter6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceAdapter");
                    deviceWatchFaceListAdapter6 = null;
                }
                deviceWatchFaceListAdapter6.notifyDataSetChanged();
                com.qcwireless.qcwatch.ui.plate.bean.MarketWatchFaceBean marketWatchFaceBean = getWatchFaceViewModel().getMarketList().get(this.marketItemClickPosition);
                marketWatchFaceBean.setProgressBar(0);
                getWatchFaceViewModel().getMarketList().set(this.marketItemClickPosition, marketWatchFaceBean);
                com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter7 = this.marketAdapter;
                if (marketWatchFaceListAdapter7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
                    marketWatchFaceListAdapter7 = null;
                }
                marketWatchFaceListAdapter7.notifyItemChanged(this.marketItemClickPosition);
                com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter8 = this.marketAdapter;
                if (marketWatchFaceListAdapter8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
                } else {
                    marketWatchFaceListAdapter2 = marketWatchFaceListAdapter8;
                }
                marketWatchFaceListAdapter2.notifyDataSetChanged();
                return;
            }
            if (messageEvent instanceof com.qcwireless.qcwatch.base.event.WatchFaceDownloadProgressEvent) {
                com.qcwireless.qcwatch.base.event.WatchFaceDownloadProgressEvent watchFaceDownloadProgressEvent = (com.qcwireless.qcwatch.base.event.WatchFaceDownloadProgressEvent) messageEvent;
                if (watchFaceDownloadProgressEvent.getProgressValue() == 100) {
                    getWatchFaceViewModel().getMarketListBackup().clear();
                }
                getWatchFaceViewModel().getMarketWatchFace();
                com.oudmon.ble.base.util.LogToFile.getInstance().wtf("刷新表盘:" + watchFaceDownloadProgressEvent.getProgressValue());
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "刷新表盘:" + watchFaceDownloadProgressEvent.getProgressValue());
                return;
            }
            if (messageEvent instanceof com.qcwireless.qcwatch.base.event.UnbindDeviceEvent) {
                getWatchFaceViewModel().getWatchList().clear();
                getWatchFaceViewModel().getMarketList().clear();
                com.qcwireless.qcwatch.ui.plate.adapter.DeviceWatchFaceListAdapter deviceWatchFaceListAdapter7 = this.deviceAdapter;
                if (deviceWatchFaceListAdapter7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceAdapter");
                    deviceWatchFaceListAdapter7 = null;
                }
                deviceWatchFaceListAdapter7.notifyDataSetChanged();
                com.qcwireless.qcwatch.ui.plate.adapter.MarketWatchFaceListAdapter marketWatchFaceListAdapter9 = this.marketAdapter;
                if (marketWatchFaceListAdapter9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("marketAdapter");
                } else {
                    marketWatchFaceListAdapter = marketWatchFaceListAdapter9;
                }
                marketWatchFaceListAdapter.notifyDataSetChanged();
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "---UnbindDeviceEvent------");
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onMessageEvent$lambda-10, reason: not valid java name */
    public static final void m1415onMessageEvent$lambda10(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment watchMarketFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchMarketFragment, "this$0");
        watchMarketFragment.getWatchFaceViewModel().getWatchFaceFromDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onMessageEvent$lambda-11, reason: not valid java name */
    public static final void m1416onMessageEvent$lambda11(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment watchMarketFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchMarketFragment, "this$0");
        watchMarketFragment.getWatchFaceViewModel().getWatchFaceFromDevice();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    /* compiled from: WatchMarketFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/plate/market/WatchMarketFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment();
        }
    }

    private final <T> java.util.List<java.util.List<T>> fixedGrouping(java.util.List<? extends T> source, int n) {
        if (source == null || source.isEmpty() || n <= 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = source.size();
        int size2 = size % n == 0 ? size / n : (source.size() / n) + 1;
        int i = 0;
        while (i < size2) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            i++;
            int i2 = i * n;
            for (int i3 = i * n; i3 < i2; i3++) {
                if (i3 < size) {
                    arrayList2.add(source.get(i3));
                }
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }
}
