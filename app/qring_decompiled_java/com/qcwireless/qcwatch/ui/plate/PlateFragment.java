package com.qcwireless.qcwatch.ui.plate;

/* compiled from: PlateFragment.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/PlateFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/plate/adapter/MyFragmentStateAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentPlateBinding;", "fragmentList", "", "Landroidx/fragment/app/Fragment;", "loadDataOnce", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class PlateFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.plate.PlateFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.plate.PlateFragment.Companion(null);
    private com.qcwireless.qcwatch.ui.plate.adapter.MyFragmentStateAdapter adapter;
    private com.qcwireless.qcwatch.databinding.FragmentPlateBinding binding;
    private java.util.List<androidx.fragment.app.Fragment> fragmentList;

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentPlateBinding inflate = com.qcwireless.qcwatch.databinding.FragmentPlateBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding = this.binding;
        if (fragmentPlateBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentPlateBinding = null;
        }
        return fragmentPlateBinding.getRoot();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.fragmentList = arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNull(arrayList);
        arrayList.add(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.INSTANCE.newInstance());
        java.util.List<androidx.fragment.app.Fragment> list = this.fragmentList;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        list.add(com.qcwireless.qcwatch.ui.plate.diy.WatchFaceDiyFragment.INSTANCE.newInstance());
        androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        java.util.List<androidx.fragment.app.Fragment> list2 = this.fragmentList;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
        this.adapter = new com.qcwireless.qcwatch.ui.plate.adapter.MyFragmentStateAdapter(requireActivity, list2);
        com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding2 = null;
        if (fragmentPlateBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentPlateBinding = null;
        }
        com.qcwireless.qcwatch.ui.plate.util.ViewPagerUtils.setSupportsChangeAnimations(fragmentPlateBinding.viewPager, false);
        android.view.View[] viewArr = new android.view.View[2];
        com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding3 = this.binding;
        if (fragmentPlateBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentPlateBinding3 = null;
        }
        viewArr[0] = fragmentPlateBinding3.tvTab1Title;
        com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding4 = this.binding;
        if (fragmentPlateBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentPlateBinding4 = null;
        }
        viewArr[1] = fragmentPlateBinding4.tvTab2Title;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.plate.PlateFragment$loadDataOnce$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding5;
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding6;
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding7;
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding8;
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding9;
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding10;
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding11;
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding12;
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding13;
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding14;
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding15;
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding16;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                fragmentPlateBinding5 = com.qcwireless.qcwatch.ui.plate.PlateFragment.this.binding;
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding17 = null;
                if (fragmentPlateBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentPlateBinding5 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentPlateBinding5.tvTab1Title)) {
                    fragmentPlateBinding12 = com.qcwireless.qcwatch.ui.plate.PlateFragment.this.binding;
                    if (fragmentPlateBinding12 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentPlateBinding12 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentPlateBinding12.tvLine2);
                    fragmentPlateBinding13 = com.qcwireless.qcwatch.ui.plate.PlateFragment.this.binding;
                    if (fragmentPlateBinding13 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentPlateBinding13 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentPlateBinding13.tvLine1);
                    fragmentPlateBinding14 = com.qcwireless.qcwatch.ui.plate.PlateFragment.this.binding;
                    if (fragmentPlateBinding14 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentPlateBinding14 = null;
                    }
                    fragmentPlateBinding14.tvTab1Title.setSelected(true);
                    fragmentPlateBinding15 = com.qcwireless.qcwatch.ui.plate.PlateFragment.this.binding;
                    if (fragmentPlateBinding15 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentPlateBinding15 = null;
                    }
                    fragmentPlateBinding15.tvTab2Title.setSelected(false);
                    fragmentPlateBinding16 = com.qcwireless.qcwatch.ui.plate.PlateFragment.this.binding;
                    if (fragmentPlateBinding16 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentPlateBinding17 = fragmentPlateBinding16;
                    }
                    fragmentPlateBinding17.viewPager.setCurrentItem(0, false);
                    org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.ui.plate.market.WatchMarketFragment.class));
                    return;
                }
                fragmentPlateBinding6 = com.qcwireless.qcwatch.ui.plate.PlateFragment.this.binding;
                if (fragmentPlateBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentPlateBinding6 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentPlateBinding6.tvTab2Title)) {
                    fragmentPlateBinding7 = com.qcwireless.qcwatch.ui.plate.PlateFragment.this.binding;
                    if (fragmentPlateBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentPlateBinding7 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentPlateBinding7.tvLine1);
                    fragmentPlateBinding8 = com.qcwireless.qcwatch.ui.plate.PlateFragment.this.binding;
                    if (fragmentPlateBinding8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentPlateBinding8 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentPlateBinding8.tvLine2);
                    fragmentPlateBinding9 = com.qcwireless.qcwatch.ui.plate.PlateFragment.this.binding;
                    if (fragmentPlateBinding9 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentPlateBinding9 = null;
                    }
                    fragmentPlateBinding9.tvTab1Title.setSelected(false);
                    fragmentPlateBinding10 = com.qcwireless.qcwatch.ui.plate.PlateFragment.this.binding;
                    if (fragmentPlateBinding10 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentPlateBinding10 = null;
                    }
                    fragmentPlateBinding10.tvTab2Title.setSelected(true);
                    fragmentPlateBinding11 = com.qcwireless.qcwatch.ui.plate.PlateFragment.this.binding;
                    if (fragmentPlateBinding11 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentPlateBinding17 = fragmentPlateBinding11;
                    }
                    fragmentPlateBinding17.viewPager.setCurrentItem(1, false);
                    org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.RefreshEvent(com.qcwireless.qcwatch.ui.plate.diy.WatchFaceDiyFragment.class));
                }
            }
        });
        com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding5 = this.binding;
        if (fragmentPlateBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentPlateBinding5 = null;
        }
        androidx.viewpager2.widget.ViewPager2 viewPager2 = fragmentPlateBinding5.viewPager;
        com.qcwireless.qcwatch.ui.plate.adapter.MyFragmentStateAdapter myFragmentStateAdapter = this.adapter;
        if (myFragmentStateAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            myFragmentStateAdapter = null;
        }
        viewPager2.setAdapter((androidx.recyclerview.widget.RecyclerView.Adapter) myFragmentStateAdapter);
        fragmentPlateBinding5.viewPager.setUserInputEnabled(false);
        com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding6 = this.binding;
        if (fragmentPlateBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentPlateBinding2 = fragmentPlateBinding6;
        }
        fragmentPlateBinding2.tvTab1Title.performClick();
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.RefreshEvent) && kotlin.jvm.internal.Intrinsics.areEqual(getClass(), ((com.qcwireless.qcwatch.base.event.RefreshEvent) messageEvent).getActivityClass())) {
            try {
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding = this.binding;
                com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding2 = null;
                if (fragmentPlateBinding == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentPlateBinding = null;
                }
                if (fragmentPlateBinding.viewPager.getCurrentItem() == 0) {
                    com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding3 = this.binding;
                    if (fragmentPlateBinding3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentPlateBinding2 = fragmentPlateBinding3;
                    }
                    fragmentPlateBinding2.tvTab1Title.performClick();
                } else {
                    com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding4 = this.binding;
                    if (fragmentPlateBinding4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentPlateBinding4 = null;
                    }
                    if (fragmentPlateBinding4.viewPager.getCurrentItem() == 1) {
                        com.qcwireless.qcwatch.databinding.FragmentPlateBinding fragmentPlateBinding5 = this.binding;
                        if (fragmentPlateBinding5 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            fragmentPlateBinding2 = fragmentPlateBinding5;
                        }
                        fragmentPlateBinding2.tvTab2Title.performClick();
                    }
                }
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.WatchFaceDownloadEvent(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion()));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    /* compiled from: PlateFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/PlateFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/plate/PlateFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.plate.PlateFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.plate.PlateFragment();
        }
    }
}
