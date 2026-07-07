package com.qcwireless.qcwatch.ui.mine.ucenter.fragment;

/* compiled from: HeightFragment.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J2\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010#\u001a\u00020\u0017J\b\u0010$\u001a\u00020\u001eH\u0002J\b\u0010%\u001a\u00020\u001eH\u0016J&\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0016\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/ucenter/fragment/HeightFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "adapter", "Lcom/qcwireless/qcwatch/base/dialog/adapter/ArrayWheelAdapter;", "", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentHeightBinding;", "currNumber", "", "data", "", "iHeightList", "getIHeightList", "()Ljava/util/List;", "setIHeightList", "(Ljava/util/List;)V", "imperialList", "lastIndex", "mHeightList", "getMHeightList", "setMHeightList", "mOrI", "", "maxHeightImperial", "metricList", "minHeightImperial", "minInch", "minMetric", "initData", "", "context", "Landroid/content/Context;", "dataList", "dataList1", "metric", "initDialogData", "loadDataOnce", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setCurrItem", "number", "unit", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class HeightFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {
    private com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter<java.lang.String> adapter;
    private com.qcwireless.qcwatch.databinding.FragmentHeightBinding binding;
    private int currNumber;
    private boolean mOrI;
    private java.util.List<java.lang.String> data = new java.util.ArrayList();
    private java.util.List<java.lang.String> metricList = new java.util.ArrayList();
    private java.util.List<java.lang.String> imperialList = new java.util.ArrayList();
    private final int minInch = 13;
    private final int minMetric = 33;
    private int lastIndex = -1;
    private java.util.List<java.lang.String> iHeightList = new java.util.ArrayList();
    private java.util.List<java.lang.String> mHeightList = new java.util.ArrayList();
    private final int minHeightImperial = 13;
    private final int maxHeightImperial = 100;

    public final java.util.List<java.lang.String> getIHeightList() {
        return this.iHeightList;
    }

    public final void setIHeightList(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.iHeightList = list;
    }

    public final java.util.List<java.lang.String> getMHeightList() {
        return this.mHeightList;
    }

    public final void setMHeightList(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mHeightList = list;
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding inflate = com.qcwireless.qcwatch.databinding.FragmentHeightBinding.inflate(inflater, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        return inflate.getRoot();
    }

    private final void initDialogData() {
        int i = 33;
        while (true) {
            int i2 = i + 1;
            this.mHeightList.add(java.lang.String.valueOf(i));
            if (i2 > 255) {
                break;
            } else {
                i = i2;
            }
        }
        int i3 = this.minHeightImperial;
        int i4 = this.maxHeightImperial;
        if (i3 <= i4) {
            while (true) {
                java.util.List<java.lang.String> list = this.iHeightList;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format = java.lang.String.format("%d'%d''", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i3 / 12), java.lang.Integer.valueOf(i3 % 12)}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                list.add(format);
                if (i3 == i4) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        initData(getActivity(), this.mHeightList, this.iHeightList, true);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        initDialogData();
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding2 = null;
        if (fragmentHeightBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding = null;
        }
        fragmentHeightBinding.btnNext.setEnabled(true);
        android.view.View[] viewArr = new android.view.View[1];
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding3 = this.binding;
        if (fragmentHeightBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentHeightBinding2 = fragmentHeightBinding3;
        }
        viewArr[0] = fragmentHeightBinding2.btnNext;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.HeightFragment$loadDataOnce$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding4;
                int i;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                fragmentHeightBinding4 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.HeightFragment.this.binding;
                if (fragmentHeightBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentHeightBinding4 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentHeightBinding4.btnNext)) {
                    com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity activity = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.HeightFragment.this.getActivity();
                    java.util.Objects.requireNonNull(activity, "null cannot be cast to non-null type com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity");
                    com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity firstProfileActivity = activity;
                    com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = firstProfileActivity.getViewModel().getUserEntity();
                    i = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.HeightFragment.this.currNumber;
                    userEntity.setHeight(i);
                    firstProfileActivity.setCurrItem(4);
                }
            }
        });
        setCurrItem(175, true);
    }

    public final void initData(android.content.Context context, java.util.List<java.lang.String> dataList, java.util.List<java.lang.String> dataList1, boolean metric) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList, "dataList");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataList1, "dataList1");
        this.metricList.clear();
        this.imperialList.clear();
        this.metricList.addAll(dataList);
        this.imperialList.addAll(dataList1);
        if (metric) {
            this.mOrI = true;
            this.data = dataList;
        } else {
            this.mOrI = false;
            this.data = dataList1;
        }
        initData();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("cm");
        arrayList.add("Ft-in");
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding2 = null;
        if (fragmentHeightBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding = null;
        }
        fragmentHeightBinding.wheelViewUnit.setAdapter(new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter(arrayList));
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding3 = this.binding;
        if (fragmentHeightBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding3 = null;
        }
        fragmentHeightBinding3.wheelViewUnit.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding4 = this.binding;
        if (fragmentHeightBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding4 = null;
        }
        fragmentHeightBinding4.wheelViewUnit.setTextSize(30.0f);
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding5 = this.binding;
        if (fragmentHeightBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding5 = null;
        }
        fragmentHeightBinding5.wheelViewUnit.setDividerColor(androidx.core.content.ContextCompat.getColor(requireContext(), com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding6 = this.binding;
        if (fragmentHeightBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding6 = null;
        }
        fragmentHeightBinding6.wheelViewUnit.setTextColorOut(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding7 = this.binding;
        if (fragmentHeightBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding7 = null;
        }
        fragmentHeightBinding7.wheelViewUnit.setItemsVisibleCount(2);
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding8 = this.binding;
        if (fragmentHeightBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding8 = null;
        }
        fragmentHeightBinding8.wheelViewUnit.setCyclic(false);
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding9 = this.binding;
        if (fragmentHeightBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentHeightBinding2 = fragmentHeightBinding9;
        }
        fragmentHeightBinding2.wheelViewUnit.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.HeightFragment$$ExternalSyntheticLambda1
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i) {
                com.qcwireless.qcwatch.ui.mine.ucenter.fragment.HeightFragment.m1367initData$lambda0(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.HeightFragment.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initData$lambda-0, reason: not valid java name */
    public static final void m1367initData$lambda0(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.HeightFragment heightFragment, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heightFragment, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(i));
        if (i == heightFragment.lastIndex) {
            return;
        }
        heightFragment.lastIndex = i;
        if (i == 0) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(true);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            heightFragment.mOrI = true;
            heightFragment.data = heightFragment.metricList;
            heightFragment.initData();
            return;
        }
        if (i != 1) {
            return;
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(false);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        heightFragment.data = heightFragment.imperialList;
        heightFragment.mOrI = false;
        heightFragment.initData();
    }

    public final void setCurrItem(int number, boolean unit) {
        this.currNumber = number;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(number));
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding = null;
        if (unit) {
            com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding2 = this.binding;
            if (fragmentHeightBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentHeightBinding2 = null;
            }
            fragmentHeightBinding2.wheelView.setCurrentItem(number - this.minMetric);
            com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding3 = this.binding;
            if (fragmentHeightBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentHeightBinding = fragmentHeightBinding3;
            }
            fragmentHeightBinding.wheelViewUnit.setCurrentItem(0);
            return;
        }
        int cm2Inch = (int) com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.cm2Inch(number);
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding4 = this.binding;
        if (fragmentHeightBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding4 = null;
        }
        fragmentHeightBinding4.wheelView.setCurrentItem(cm2Inch - this.minInch);
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding5 = this.binding;
        if (fragmentHeightBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentHeightBinding = fragmentHeightBinding5;
        }
        fragmentHeightBinding.wheelViewUnit.setCurrentItem(1);
    }

    private final void initData() {
        this.adapter = new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter<>(this.data);
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding2 = null;
        if (fragmentHeightBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding = null;
        }
        com.contrarywind.view.WheelView wheelView = fragmentHeightBinding.wheelView;
        com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter<java.lang.String> arrayWheelAdapter = this.adapter;
        if (arrayWheelAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            arrayWheelAdapter = null;
        }
        wheelView.setAdapter(arrayWheelAdapter);
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding3 = this.binding;
        if (fragmentHeightBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding3 = null;
        }
        fragmentHeightBinding3.wheelView.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(getContext(), com.qcwireless.qcwatch.R.color.color_FF6A00));
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding4 = this.binding;
        if (fragmentHeightBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding4 = null;
        }
        fragmentHeightBinding4.wheelView.setTextSize(30.0f);
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding5 = this.binding;
        if (fragmentHeightBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding5 = null;
        }
        fragmentHeightBinding5.wheelView.setDividerColor(androidx.core.content.ContextCompat.getColor(requireContext(), com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding6 = this.binding;
        if (fragmentHeightBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding6 = null;
        }
        fragmentHeightBinding6.wheelView.setTextColorOut(androidx.core.content.ContextCompat.getColor(requireContext(), com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding7 = this.binding;
        if (fragmentHeightBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding7 = null;
        }
        fragmentHeightBinding7.wheelView.setItemsVisibleCount(5);
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding8 = this.binding;
        if (fragmentHeightBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHeightBinding8 = null;
        }
        fragmentHeightBinding8.wheelView.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.HeightFragment$$ExternalSyntheticLambda0
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i) {
                com.qcwireless.qcwatch.ui.mine.ucenter.fragment.HeightFragment.m1368initData$lambda1(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.HeightFragment.this, i);
            }
        });
        if (this.mOrI) {
            com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding9 = this.binding;
            if (fragmentHeightBinding9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentHeightBinding2 = fragmentHeightBinding9;
            }
            fragmentHeightBinding2.wheelView.setCurrentItem(this.currNumber - this.minMetric);
            return;
        }
        com.qcwireless.qcwatch.databinding.FragmentHeightBinding fragmentHeightBinding10 = this.binding;
        if (fragmentHeightBinding10 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentHeightBinding2 = fragmentHeightBinding10;
        }
        fragmentHeightBinding2.wheelView.setCurrentItem(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.cmToIn(this.currNumber) - this.minInch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initData$lambda-1, reason: not valid java name */
    public static final void m1368initData$lambda1(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.HeightFragment heightFragment, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heightFragment, "this$0");
        if (heightFragment.mOrI) {
            heightFragment.currNumber = java.lang.Integer.parseInt(heightFragment.data.get(i));
        } else {
            java.lang.String str = heightFragment.data.get(i);
            if (str.length() == 5) {
                java.lang.String substring = str.substring(0, 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                java.lang.String substring2 = str.substring(2, 3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf((java.lang.Integer.parseInt(substring) * 12) + java.lang.Integer.parseInt(substring2)));
                heightFragment.currNumber = (int) com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.inch2Cm((java.lang.Integer.parseInt(substring) * 12) + java.lang.Integer.parseInt(substring2));
            } else if (str.length() == 6) {
                java.lang.String substring3 = str.substring(0, 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                java.lang.String substring4 = str.substring(2, 4);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf((java.lang.Integer.parseInt(substring3) * 12) + java.lang.Integer.parseInt(substring4)));
                heightFragment.currNumber = (int) com.qcwireless.qcwatch.base.dialog.BottomHeightWeightDialog.inch2Cm((java.lang.Integer.parseInt(substring3) * 12) + java.lang.Integer.parseInt(substring4));
            }
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(heightFragment.currNumber));
    }
}
