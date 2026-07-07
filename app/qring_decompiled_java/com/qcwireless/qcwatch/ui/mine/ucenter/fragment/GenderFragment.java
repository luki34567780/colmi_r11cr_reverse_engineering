package com.qcwireless.qcwatch.ui.mine.ucenter.fragment;

/* compiled from: GenderFragment.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J&\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/ucenter/fragment/GenderFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentGenderBinding;", "loadDataOnce", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GenderFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {
    private com.qcwireless.qcwatch.databinding.FragmentGenderBinding binding;

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentGenderBinding inflate = com.qcwireless.qcwatch.databinding.FragmentGenderBinding.inflate(inflater, container, false);
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
        android.view.View[] viewArr = new android.view.View[3];
        com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding2 = null;
        if (fragmentGenderBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGenderBinding = null;
        }
        viewArr[0] = fragmentGenderBinding.imageBoy;
        com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding3 = this.binding;
        if (fragmentGenderBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentGenderBinding3 = null;
        }
        viewArr[1] = fragmentGenderBinding3.imageGirl;
        com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding4 = this.binding;
        if (fragmentGenderBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentGenderBinding2 = fragmentGenderBinding4;
        }
        viewArr[2] = fragmentGenderBinding2.btnNext;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment$loadDataOnce$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding5;
                com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding6;
                com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding7;
                com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding8;
                com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding9;
                com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding10;
                com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding11;
                com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding12;
                com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding13;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                fragmentGenderBinding5 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this.binding;
                com.qcwireless.qcwatch.databinding.FragmentGenderBinding fragmentGenderBinding14 = null;
                if (fragmentGenderBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentGenderBinding5 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentGenderBinding5.imageBoy)) {
                    fragmentGenderBinding11 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this.binding;
                    if (fragmentGenderBinding11 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentGenderBinding11 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentGenderBinding11.imageBoySelect);
                    fragmentGenderBinding12 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this.binding;
                    if (fragmentGenderBinding12 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentGenderBinding12 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentGenderBinding12.imageGirlSelect);
                    fragmentGenderBinding13 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this.binding;
                    if (fragmentGenderBinding13 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentGenderBinding14 = fragmentGenderBinding13;
                    }
                    fragmentGenderBinding14.btnNext.setEnabled(true);
                    com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity activity = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this.getActivity();
                    java.util.Objects.requireNonNull(activity, "null cannot be cast to non-null type com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity");
                    activity.getViewModel().getUserEntity().setGender(1);
                    return;
                }
                fragmentGenderBinding6 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this.binding;
                if (fragmentGenderBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentGenderBinding6 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentGenderBinding6.imageGirl)) {
                    fragmentGenderBinding8 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this.binding;
                    if (fragmentGenderBinding8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentGenderBinding8 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentGenderBinding8.imageGirlSelect);
                    fragmentGenderBinding9 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this.binding;
                    if (fragmentGenderBinding9 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentGenderBinding9 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentGenderBinding9.imageBoySelect);
                    fragmentGenderBinding10 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this.binding;
                    if (fragmentGenderBinding10 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentGenderBinding14 = fragmentGenderBinding10;
                    }
                    fragmentGenderBinding14.btnNext.setEnabled(true);
                    com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity activity2 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this.getActivity();
                    java.util.Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity");
                    activity2.getViewModel().getUserEntity().setGender(2);
                    return;
                }
                fragmentGenderBinding7 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this.binding;
                if (fragmentGenderBinding7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentGenderBinding7 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentGenderBinding7.btnNext)) {
                    kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment$loadDataOnce$1.AnonymousClass1(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this, null), 3, (java.lang.Object) null);
                    com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity activity3 = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this.getActivity();
                    java.util.Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity");
                    activity3.setCurrItem(2);
                }
            }

            /* compiled from: GenderFragment.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment$loadDataOnce$1$1", f = "GenderFragment.kt", i = {}, l = {57, 58}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment$loadDataOnce$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int label;
                final /* synthetic */ com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment genderFragment, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment$loadDataOnce$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = genderFragment;
                }

                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment$loadDataOnce$1.AnonymousClass1(this.this$0, continuation);
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
                        obj = com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository.Companion.getGetInstance().getDeviceSupport(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), (kotlin.coroutines.Continuation) this);
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
                    final com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment genderFragment = this.this$0;
                    this.label = 2;
                    if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.loadDataOnce.1.1.1
                        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                            return emit((java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                        }

                        public final java.lang.Object emit(java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity activity = com.qcwireless.qcwatch.ui.mine.ucenter.fragment.GenderFragment.this.getActivity();
                            java.util.Objects.requireNonNull(activity, "null cannot be cast to non-null type com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity");
                            com.qcwireless.qcwatch.ui.mine.ucenter.FirstProfileActivity firstProfileActivity = activity;
                            if (firstProfileActivity.getViewModel().getUserEntity().getGender() == 1) {
                                if (map != null) {
                                    com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity itemEntity = map.get(kotlin.coroutines.jvm.internal.Boxing.boxInt(5));
                                    if (itemEntity != null) {
                                        itemEntity.setChecked(false);
                                    }
                                    com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository.Companion.getGetInstance().saveDeviceSupport(map);
                                }
                            } else if (firstProfileActivity.getViewModel().getUserEntity().getGender() == 2 && map != null) {
                                com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity itemEntity2 = map.get(kotlin.coroutines.jvm.internal.Boxing.boxInt(5));
                                if (itemEntity2 != null) {
                                    itemEntity2.setChecked(true);
                                }
                                com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository.Companion.getGetInstance().saveDeviceSupport(map);
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
}
