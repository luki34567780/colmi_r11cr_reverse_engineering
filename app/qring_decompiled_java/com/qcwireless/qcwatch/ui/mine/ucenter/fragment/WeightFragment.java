package com.qcwireless.qcwatch.ui.mine.ucenter.fragment;

/* compiled from: WeightFragment.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J2\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u001f\u001a\u00020\u0014J\b\u0010 \u001a\u00020\u001aH\u0002J\b\u0010!\u001a\u00020\u001aH\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0016\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/ucenter/fragment/WeightFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "adapter", "Lcom/qcwireless/qcwatch/base/dialog/adapter/ArrayWheelAdapter;", "", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentWeightBinding;", "currNumber", "", "data", "", "iWeightList", "getIWeightList", "()Ljava/util/List;", "setIWeightList", "(Ljava/util/List;)V", "imperialList", "lastIndex", "mOrI", "", "mWeightList", "getMWeightList", "setMWeightList", "metricList", "initData", "", "context", "Landroid/content/Context;", "dataList", "dataList1", "metric", "initWeightData", "loadDataOnce", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setCurrItem", "number", "unit", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WeightFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {
    private com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter<java.lang.String> adapter;
    private com.qcwireless.qcwatch.databinding.FragmentWeightBinding binding;
    private int currNumber;
    private boolean mOrI;
    private java.util.List<java.lang.String> mWeightList = new java.util.ArrayList();
    private java.util.List<java.lang.String> iWeightList = new java.util.ArrayList();
    private final java.util.List<java.lang.String> metricList = new java.util.ArrayList();
    private final java.util.List<java.lang.String> imperialList = new java.util.ArrayList();
    private java.util.List<java.lang.String> data = new java.util.ArrayList();
    private int lastIndex = -1;

    public final java.util.List<java.lang.String> getMWeightList() {
        return this.mWeightList;
    }

    public final void setMWeightList(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mWeightList = list;
    }

    public final java.util.List<java.lang.String> getIWeightList() {
        return this.iWeightList;
    }

    public final void setIWeightList(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.iWeightList = list;
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding inflate = com.qcwireless.qcwatch.databinding.FragmentWeightBinding.inflate(inflater, container, false);
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
        initWeightData();
        android.view.View[] viewArr = new android.view.View[1];
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding = this.binding;
        if (fragmentWeightBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding = null;
        }
        viewArr[0] = fragmentWeightBinding.btnNext;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment$loadDataOnce$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding2;
                int i;
                int i2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                fragmentWeightBinding2 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment.this.binding;
                if (fragmentWeightBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentWeightBinding2 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentWeightBinding2.btnNext)) {
                    com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity activity = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment.this.getActivity();
                    java.util.Objects.requireNonNull(activity, "null cannot be cast to non-null type com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity");
                    com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity firstProfileActivity = activity;
                    if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity = firstProfileActivity.getViewModel().getUserEntity();
                        i2 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment.this.currNumber;
                        userEntity.setWeight(i2);
                    } else {
                        com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity2 = firstProfileActivity.getViewModel().getUserEntity();
                        i = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment.this.currNumber;
                        userEntity2.setWeightLbs(i);
                    }
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("firstOrNot", 1);
                    kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment$loadDataOnce$1.AnonymousClass1(firstProfileActivity, null), 3, (java.lang.Object) null);
                    firstProfileActivity.getViewModel().saveUserEntity(firstProfileActivity.getViewModel().getUserEntity());
                    com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity3 = firstProfileActivity.getViewModel().getUserEntity();
                    int ageByBirthday = com.qcwireless.qc_utils.date.DateUtil.getAgeByBirthday(com.qcwireless.qc_utils.date.DateUtil.String2Date("yyyy-MM-dd", userEntity3.getBirthday() + "-01"));
                    if (userEntity3.getNickName().length() > 0) {
                        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().setDeviceNickName(userEntity3.getNickName());
                    }
                    firstProfileActivity.getViewModel().execUserInfoToDevice(userEntity3.getGender() - 1, ageByBirthday, (int) userEntity3.getHeight(), (int) userEntity3.getWeight());
                    com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment weightFragment = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment.this;
                    android.content.Context activity2 = weightFragment.getActivity();
                    if (activity2 != null) {
                        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity2, "it");
                        android.content.Intent intent = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.class);
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
                        weightFragment.startActivity(intent);
                    }
                }
            }

            /* compiled from: WeightFragment.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment$loadDataOnce$1$1", f = "WeightFragment.kt", i = {}, l = {77, 78}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment$loadDataOnce$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity $activity;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity firstProfileActivity, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment$loadDataOnce$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$activity = firstProfileActivity;
                }

                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment$loadDataOnce$1.AnonymousClass1(this.$activity, continuation);
                }

                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        obj = com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().getDeviceSetting(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), (kotlin.coroutines.Continuation) this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                return kotlin.Unit.INSTANCE;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    final com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity firstProfileActivity = this.$activity;
                    this.label = 2;
                    if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment.loadDataOnce.1.1.1
                        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                            return emit((com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                        }

                        public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            if (deviceSetting != null) {
                                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                                    deviceSetting.setMetricUnit(0);
                                } else {
                                    deviceSetting.setMetricUnit(1);
                                }
                                com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity.this.getViewModel().execUnit(deviceSetting);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        });
    }

    private final void initWeightData() {
        int i = 1;
        while (true) {
            int i2 = i + 1;
            this.mWeightList.add(java.lang.String.valueOf(i));
            if (i2 > 255) {
                break;
            } else {
                i = i2;
            }
        }
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            this.iWeightList.add(java.lang.String.valueOf(i3));
            if (i4 > 562) {
                break;
            } else {
                i3 = i4;
            }
        }
        initData(getActivity(), this.mWeightList, this.iWeightList, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric());
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            setCurrItem(75, true);
        } else {
            setCurrItem(165, false);
        }
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
        arrayList.add("kg");
        arrayList.add("lbs");
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding2 = null;
        if (fragmentWeightBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding = null;
        }
        fragmentWeightBinding.wheelViewUnit.setAdapter(new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter(arrayList));
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding3 = this.binding;
        if (fragmentWeightBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding3 = null;
        }
        fragmentWeightBinding3.wheelViewUnit.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.color_FF6A00));
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding4 = this.binding;
        if (fragmentWeightBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding4 = null;
        }
        fragmentWeightBinding4.wheelViewUnit.setTextSize(30.0f);
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding5 = this.binding;
        if (fragmentWeightBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding5 = null;
        }
        fragmentWeightBinding5.wheelViewUnit.setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding6 = this.binding;
        if (fragmentWeightBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding6 = null;
        }
        fragmentWeightBinding6.wheelViewUnit.setTextColorOut(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding7 = this.binding;
        if (fragmentWeightBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding7 = null;
        }
        fragmentWeightBinding7.wheelViewUnit.setItemsVisibleCount(2);
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding8 = this.binding;
        if (fragmentWeightBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding8 = null;
        }
        fragmentWeightBinding8.wheelViewUnit.setCyclic(false);
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding9 = this.binding;
        if (fragmentWeightBinding9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentWeightBinding2 = fragmentWeightBinding9;
        }
        fragmentWeightBinding2.wheelViewUnit.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment$$ExternalSyntheticLambda0
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i) {
                com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment.m1373initData$lambda0(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initData$lambda-0, reason: not valid java name */
    public static final void m1373initData$lambda0(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment weightFragment, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weightFragment, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(i));
        if (i == weightFragment.lastIndex) {
            return;
        }
        weightFragment.lastIndex = i;
        if (i == 0) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(true);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            weightFragment.mOrI = true;
            weightFragment.data = weightFragment.metricList;
            weightFragment.initData();
            return;
        }
        if (i != 1) {
            return;
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(false);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        weightFragment.data = weightFragment.imperialList;
        weightFragment.mOrI = false;
        weightFragment.initData();
    }

    private final void initData() {
        this.adapter = new com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter<>(this.data);
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding2 = null;
        if (fragmentWeightBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding = null;
        }
        com.contrarywind.view.WheelView wheelView = fragmentWeightBinding.wheelView;
        com.qcwireless.qcwatch.base.dialog.adapter.ArrayWheelAdapter<java.lang.String> arrayWheelAdapter = this.adapter;
        if (arrayWheelAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            arrayWheelAdapter = null;
        }
        wheelView.setAdapter(arrayWheelAdapter);
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding3 = this.binding;
        if (fragmentWeightBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding3 = null;
        }
        fragmentWeightBinding3.wheelView.setTextColorCenter(skin.support.content.res.SkinCompatResources.getColor(getContext(), com.qcwireless.qcwatch.R.color.color_FF6A00));
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding4 = this.binding;
        if (fragmentWeightBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding4 = null;
        }
        fragmentWeightBinding4.wheelView.setTextSize(30.0f);
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding5 = this.binding;
        if (fragmentWeightBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding5 = null;
        }
        com.contrarywind.view.WheelView wheelView2 = fragmentWeightBinding5.wheelView;
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        wheelView2.setDividerColor(androidx.core.content.ContextCompat.getColor(context, com.qcwireless.qcwatch.R.color.dialog_wheel_driver));
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding6 = this.binding;
        if (fragmentWeightBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding6 = null;
        }
        com.contrarywind.view.WheelView wheelView3 = fragmentWeightBinding6.wheelView;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
        wheelView3.setTextColorOut(androidx.core.content.ContextCompat.getColor(context2, com.qcwireless.qcwatch.R.color.dialog_wheel_text_out));
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding7 = this.binding;
        if (fragmentWeightBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding7 = null;
        }
        fragmentWeightBinding7.wheelView.setItemsVisibleCount(5);
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding8 = this.binding;
        if (fragmentWeightBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentWeightBinding8 = null;
        }
        fragmentWeightBinding8.wheelView.setOnItemSelectedListener(new com.contrarywind.listener.OnItemSelectedListener() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment$$ExternalSyntheticLambda1
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public final void onItemSelected(int i) {
                com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment.m1374initData$lambda1(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment.this, i);
            }
        });
        if (this.mOrI) {
            this.currNumber = com.qcwireless.qcwatch.base.utils.MetricUtilsKt.lbsToKg(this.currNumber);
            com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding9 = this.binding;
            if (fragmentWeightBinding9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentWeightBinding2 = fragmentWeightBinding9;
            }
            fragmentWeightBinding2.wheelView.setCurrentItem(this.currNumber - 1);
            return;
        }
        this.currNumber = com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kgToLbs(this.currNumber);
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding10 = this.binding;
        if (fragmentWeightBinding10 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentWeightBinding2 = fragmentWeightBinding10;
        }
        fragmentWeightBinding2.wheelView.setCurrentItem(this.currNumber - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initData$lambda-1, reason: not valid java name */
    public static final void m1374initData$lambda1(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.WeightFragment weightFragment, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weightFragment, "this$0");
        weightFragment.currNumber = java.lang.Integer.parseInt(weightFragment.data.get(i));
    }

    public final void setCurrItem(int number, boolean unit) {
        this.currNumber = number;
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(number));
        int i = 0;
        com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding = null;
        if (unit) {
            com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding2 = this.binding;
            if (fragmentWeightBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeightBinding2 = null;
            }
            fragmentWeightBinding2.wheelView.setCurrentItem(number - 1);
            com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding3 = this.binding;
            if (fragmentWeightBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentWeightBinding = fragmentWeightBinding3;
            }
            fragmentWeightBinding.wheelViewUnit.setCurrentItem(0);
        } else {
            com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding4 = this.binding;
            if (fragmentWeightBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentWeightBinding4 = null;
            }
            fragmentWeightBinding4.wheelView.setCurrentItem(number - 1);
            com.qcwireless.qcwatch.databinding.FragmentWeightBinding fragmentWeightBinding5 = this.binding;
            if (fragmentWeightBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentWeightBinding = fragmentWeightBinding5;
            }
            fragmentWeightBinding.wheelViewUnit.setCurrentItem(1);
            i = 1;
        }
        this.lastIndex = i;
    }
}
