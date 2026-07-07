package com.qcwireless.qcwatch.ui.mine.ucenter.fragment;

/* compiled from: BirthdayFragment.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0016\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/ucenter/fragment/BirthdayFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "adapter", "Lcom/qcwireless/qcwatch/base/dialog/adapter/ArrayWheelAdapter;", "", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentBirthdayBinding;", "currMonth", "", "currYear", "map", "", "minYear", "monthAdapter", "Lcom/qcwireless/qcwatch/base/dialog/adapter/MonthArrayWheelAdapter;", "monthData", "", "yearData", "initData", "", "context", "Landroid/content/Context;", "loadDataOnce", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setCurrItem", "year", "month", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BirthdayFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {
    private com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter<java.lang.String> adapter;
    private com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding binding;
    private com.qcwireless.qcwatch.base.dialog.adapter.MonthArrayWheelAdapter<java.lang.String> monthAdapter;
    private java.util.List<java.lang.String> yearData = new java.util.ArrayList();
    private java.util.List<java.lang.String> monthData = new java.util.ArrayList();
    private final int minYear = 1920;
    private int currYear = 1995;
    private int currMonth = 1;
    private final java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap();

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding inflate = com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding.inflate(inflater, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
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
        java.util.Map<java.lang.Integer, java.lang.String> map = this.map;
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_435);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_435)");
        map.put(1, string);
        java.util.Map<java.lang.Integer, java.lang.String> map2 = this.map;
        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_436);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_436)");
        map2.put(2, string2);
        java.util.Map<java.lang.Integer, java.lang.String> map3 = this.map;
        java.lang.String string3 = getString(com.qcwireless.qcwatch.R.string.qc_text_437);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_437)");
        map3.put(3, string3);
        java.util.Map<java.lang.Integer, java.lang.String> map4 = this.map;
        java.lang.String string4 = getString(com.qcwireless.qcwatch.R.string.qc_text_438);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_438)");
        map4.put(4, string4);
        java.util.Map<java.lang.Integer, java.lang.String> map5 = this.map;
        java.lang.String string5 = getString(com.qcwireless.qcwatch.R.string.qc_text_439);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_439)");
        map5.put(5, string5);
        java.util.Map<java.lang.Integer, java.lang.String> map6 = this.map;
        java.lang.String string6 = getString(com.qcwireless.qcwatch.R.string.qc_text_440);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.qc_text_440)");
        map6.put(6, string6);
        java.util.Map<java.lang.Integer, java.lang.String> map7 = this.map;
        java.lang.String string7 = getString(com.qcwireless.qcwatch.R.string.qc_text_441);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.qc_text_441)");
        map7.put(7, string7);
        java.util.Map<java.lang.Integer, java.lang.String> map8 = this.map;
        java.lang.String string8 = getString(com.qcwireless.qcwatch.R.string.qc_text_442);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.qc_text_442)");
        map8.put(8, string8);
        java.util.Map<java.lang.Integer, java.lang.String> map9 = this.map;
        java.lang.String string9 = getString(com.qcwireless.qcwatch.R.string.qc_text_443);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "getString(R.string.qc_text_443)");
        map9.put(9, string9);
        java.util.Map<java.lang.Integer, java.lang.String> map10 = this.map;
        java.lang.String string10 = getString(com.qcwireless.qcwatch.R.string.qc_text_444);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string10, "getString(R.string.qc_text_444)");
        map10.put(10, string10);
        java.util.Map<java.lang.Integer, java.lang.String> map11 = this.map;
        java.lang.String string11 = getString(com.qcwireless.qcwatch.R.string.qc_text_445);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string11, "getString(R.string.qc_text_445)");
        map11.put(11, string11);
        java.util.Map<java.lang.Integer, java.lang.String> map12 = this.map;
        java.lang.String string12 = getString(com.qcwireless.qcwatch.R.string.qc_text_446);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string12, "getString(R.string.qc_text_446)");
        map12.put(12, string12);
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding2 = null;
        if (fragmentBirthdayBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding = null;
        }
        fragmentBirthdayBinding.btnNext.setEnabled(true);
        initData(getActivity());
        android.view.View[] viewArr = new android.view.View[1];
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding3 = this.binding;
        if (fragmentBirthdayBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentBirthdayBinding2 = fragmentBirthdayBinding3;
        }
        viewArr[0] = fragmentBirthdayBinding2.btnNext;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment$loadDataOnce$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding4;
                int i;
                int i2;
                int i3;
                int i4;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                fragmentBirthdayBinding4 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment.this.binding;
                if (fragmentBirthdayBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentBirthdayBinding4 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentBirthdayBinding4.btnNext)) {
                    i = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment.this.currYear;
                    i2 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment.this.currMonth;
                    if (new com.oudmon.ble.base.util.DateUtil(i, i2, 1).getUnixTimestamp() > new com.oudmon.ble.base.util.DateUtil().getUnixTimestamp()) {
                        java.lang.String string13 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_229);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string13, "getString(R.string.qc_text_229)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string13, 0, 1, null);
                        return;
                    }
                    com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity activity = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment.this.getActivity();
                    java.util.Objects.requireNonNull(activity, "null cannot be cast to non-null type com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity");
                    com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity firstProfileActivity = activity;
                    com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = firstProfileActivity.getViewModel().getUserEntity();
                    i3 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment.this.currYear;
                    i4 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment.this.currMonth;
                    java.lang.String yyyyMMDate = new com.oudmon.ble.base.util.DateUtil(i3, i4, 1).getYyyyMMDate();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(yyyyMMDate, "DateUtil(currYear,currMonth,1).yyyyMMDate");
                    userEntity.setBirthday(yyyyMMDate);
                    firstProfileActivity.setCurrItem(3);
                }
            }
        });
        setCurrItem(1995, 1);
    }

    public final void setCurrItem(int year, int month) {
        int size = this.yearData.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (kotlin.text.StringsKt.equals(year + "", this.yearData.get(i2), true)) {
                this.currYear = java.lang.Integer.parseInt(this.yearData.get(i2));
                break;
            }
            i2++;
        }
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding2 = null;
        if (fragmentBirthdayBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding = null;
        }
        fragmentBirthdayBinding.wheelViewYear.setCurrentItem(this.currYear - this.minYear);
        int size2 = this.monthData.size();
        while (true) {
            if (i >= size2) {
                break;
            }
            if (month == java.lang.Integer.parseInt(this.monthData.get(i))) {
                this.currMonth = java.lang.Integer.parseInt(this.monthData.get(i));
                break;
            }
            i++;
        }
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding3 = this.binding;
        if (fragmentBirthdayBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentBirthdayBinding2 = fragmentBirthdayBinding3;
        }
        fragmentBirthdayBinding2.wheelViewMonth.setCurrentItem(this.currMonth - 1);
    }

    public final void initData(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        int i = this.minYear;
        int year = new com.oudmon.ble.base.util.DateUtil().getYear();
        if (i <= year) {
            while (true) {
                this.yearData.add(i + "");
                if (i == year) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.adapter = new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter<>(this.yearData);
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding2 = null;
        if (fragmentBirthdayBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding = null;
        }
        com.contrarywind.view.WheelView wheelView = fragmentBirthdayBinding.wheelViewYear;
        com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter<java.lang.String> arrayWheelAdapter = this.adapter;
        if (arrayWheelAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            arrayWheelAdapter = null;
        }
        wheelView.setAdapter(arrayWheelAdapter);
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding3 = this.binding;
        if (fragmentBirthdayBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding3 = null;
        }
        fragmentBirthdayBinding3.wheelViewYear.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding4 = this.binding;
        if (fragmentBirthdayBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding4 = null;
        }
        fragmentBirthdayBinding4.wheelViewYear.setTextSize(30.0f);
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding5 = this.binding;
        if (fragmentBirthdayBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding5 = null;
        }
        fragmentBirthdayBinding5.wheelViewYear.setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding6 = this.binding;
        if (fragmentBirthdayBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding6 = null;
        }
        fragmentBirthdayBinding6.wheelViewYear.setTextColorOut(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding7 = this.binding;
        if (fragmentBirthdayBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding7 = null;
        }
        fragmentBirthdayBinding7.wheelViewYear.setItemsVisibleCount(5);
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding8 = this.binding;
        if (fragmentBirthdayBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding8 = null;
        }
        fragmentBirthdayBinding8.wheelViewYear.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment$$ExternalSyntheticLambda1
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i2) {
                com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment.m1364initData$lambda0(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment.this, i2);
            }
        });
        this.monthData = new java.util.ArrayList();
        for (int i2 = 1; i2 < 13; i2++) {
            if (i2 < 10) {
                java.util.List<java.lang.String> list = this.monthData;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append('0');
                sb.append(i2);
                list.add(sb.toString());
            } else {
                this.monthData.add(i2 + "");
            }
        }
        this.monthAdapter = new com.qcwireless.qcwatch.base.dialog.adapter.MonthArrayWheelAdapter<>(this.monthData, this.map);
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding9 = this.binding;
        if (fragmentBirthdayBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding9 = null;
        }
        com.contrarywind.view.WheelView wheelView2 = fragmentBirthdayBinding9.wheelViewMonth;
        com.qcwireless.qcwatch.base.dialog.adapter.MonthArrayWheelAdapter<java.lang.String> monthArrayWheelAdapter = this.monthAdapter;
        if (monthArrayWheelAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("monthAdapter");
            monthArrayWheelAdapter = null;
        }
        wheelView2.setAdapter(monthArrayWheelAdapter);
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding10 = this.binding;
        if (fragmentBirthdayBinding10 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding10 = null;
        }
        fragmentBirthdayBinding10.wheelViewMonth.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding11 = this.binding;
        if (fragmentBirthdayBinding11 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding11 = null;
        }
        fragmentBirthdayBinding11.wheelViewMonth.setTextSize(30.0f);
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding12 = this.binding;
        if (fragmentBirthdayBinding12 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding12 = null;
        }
        fragmentBirthdayBinding12.wheelViewMonth.setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding13 = this.binding;
        if (fragmentBirthdayBinding13 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding13 = null;
        }
        fragmentBirthdayBinding13.wheelViewMonth.setTextColorOut(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding14 = this.binding;
        if (fragmentBirthdayBinding14 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentBirthdayBinding14 = null;
        }
        fragmentBirthdayBinding14.wheelViewMonth.setItemsVisibleCount(5);
        com.qcwireless.qcwatch.databinding.FragmentBirthdayBinding fragmentBirthdayBinding15 = this.binding;
        if (fragmentBirthdayBinding15 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentBirthdayBinding2 = fragmentBirthdayBinding15;
        }
        fragmentBirthdayBinding2.wheelViewMonth.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment$$ExternalSyntheticLambda0
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i3) {
                com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment.m1365initData$lambda1(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment.this, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initData$lambda-0, reason: not valid java name */
    public static final void m1364initData$lambda0(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment birthdayFragment, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(birthdayFragment, "this$0");
        birthdayFragment.currYear = java.lang.Integer.parseInt(birthdayFragment.yearData.get(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initData$lambda-1, reason: not valid java name */
    public static final void m1365initData$lambda1(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.BirthdayFragment birthdayFragment, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(birthdayFragment, "this$0");
        birthdayFragment.currMonth = java.lang.Integer.parseInt(birthdayFragment.monthData.get(i));
    }
}
