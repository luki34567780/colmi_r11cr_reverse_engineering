package com.qcwireless.qcwatch.ui.mine;

import com.qcwireless.qcwatch.ui.mine.MineFragment.BluetoothPermissionCallback;
import com.qcwireless.qcwatch.ui.mine.MineFragment.CameraPermissionCallback;
import com.qcwireless.qcwatch.ui.mine.MineFragment.ScanLocationPermissionCallback;

/* compiled from: MineFragment.kt */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 :2\u00020\u0001:\u000589:;<B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\"\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u0019H\u0016J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020-H\u0007J\b\u0010.\u001a\u00020\u0019H\u0016J\b\u0010/\u001a\u00020\u0019H\u0003J\b\u00100\u001a\u00020\u0019H\u0002J\u0016\u00101\u001a\u00020\u00192\f\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0002J\b\u00105\u001a\u00020\u0019H\u0002J\u0006\u00106\u001a\u00020\u0019J\b\u00107\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016¨\u0006="}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/MineFragment;", "Lcom/qcwireless/qcwatch/ui/base/BaseFragment;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/FragmentMineBinding;", "deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "deviceViewModel", "Lcom/qcwireless/qcwatch/ui/device/vm/DeviceViewModel;", "getDeviceViewModel", "()Lcom/qcwireless/qcwatch/ui/device/vm/DeviceViewModel;", "deviceViewModel$delegate", "Lkotlin/Lazy;", "imagePicker", "Lcom/qcwireless/qcwatch/ui/base/imagepicker/ImagePicker;", "myFwRunnable", "Lcom/qcwireless/qcwatch/ui/mine/MineFragment$MyFwRunnable;", "userEntity", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/UserEntity;", "viewModel", "Lcom/qcwireless/qcwatch/ui/mine/ucenter/UserProfileViewModel;", "getViewModel", "()Lcom/qcwireless/qcwatch/ui/mine/ucenter/UserProfileViewModel;", "viewModel$delegate", "initDeviceSetting", "", "it", "loadDataOnce", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMessageEvent", "messageEvent", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "onResume", "readBattery", "refreshUI", "showPermissionWarmingDialog", "permissions", "", "", "showUnbindDialog", "showUnitDialog", "unBindDevice", "BluetoothPermissionCallback", "CameraPermissionCallback", "Companion", "MyFwRunnable", "ScanLocationPermissionCallback", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MineFragment extends com.qcwireless.qcwatch.ui.base.BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.mine.MineFragment.Companion INSTANCE = new com.qcwireless.qcwatch.ui.mine.MineFragment.Companion(null);
    private com.qcwireless.qcwatch.databinding.FragmentMineBinding binding;
    private com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting;

    /* renamed from: deviceViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy deviceViewModel;
    private final com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker imagePicker = new com.qcwireless.qcwatch.ui.base.imagepicker.ImagePicker();
    private final com.qcwireless.qcwatch.ui.mine.MineFragment.MyFwRunnable myFwRunnable = new com.qcwireless.qcwatch.ui.mine.MineFragment.MyFwRunnable();
    private com.qcwireless.qcwatch.ui.base.repository.entity.UserEntity userEntity;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    public MineFragment() {
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        final org.koin.core.qualifier.Qualifier qualifier = null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel>() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel m1256invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.class), qualifier, qualifier);
            }
        });
        this.deviceViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel>() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel] */
            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel m1257invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.class), qualifier, qualifier);
            }
        });
    }

    private final com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel getViewModel() {
        return (com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel) this.viewModel.getValue();
    }

    private final com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel getDeviceViewModel() {
        return (com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel) this.deviceViewModel.getValue();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.qcwireless.qcwatch.databinding.FragmentMineBinding inflate = com.qcwireless.qcwatch.databinding.FragmentMineBinding.inflate(inflater, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding = this.binding;
        if (fragmentMineBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMineBinding = null;
        }
        return fragmentMineBinding.getRoot();
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void loadDataOnce() {
        super.loadDataOnce();
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding2 = null;
        if (fragmentMineBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMineBinding = null;
        }
        fragmentMineBinding.qcUserProfile.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                if (!com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLoginStatus()) {
                    java.lang.String string = com.qcwireless.qcwatch.ui.mine.MineFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_245);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_245)");
                    com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                    com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                    android.content.Context activity = mineFragment.getActivity();
                    if (activity != null) {
                        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.login.LoginActivity.class);
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
                        mineFragment.startActivity(intent);
                        return;
                    }
                    return;
                }
                com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment2 = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                android.content.Context activity2 = mineFragment2.getActivity();
                if (activity2 != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity2, "it");
                    android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileActivity.class);
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
                    mineFragment2.startActivity(intent2);
                }
            }
        });
        fragmentMineBinding.qcGoalSetting.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$2
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                android.content.Context activity = mineFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.goal.GoalSettingActivity.class);
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
                    mineFragment.startActivity(intent);
                }
            }
        });
        fragmentMineBinding.qcAboutUs.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$3
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                android.content.Context activity = mineFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.about.AboutActivity.class);
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
                    mineFragment.startActivity(intent);
                }
            }
        });
        fragmentMineBinding.qcSettingCamera.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$4
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestCameraPermission(com.qcwireless.qcwatch.ui.mine.MineFragment.this.getActivity(), com.qcwireless.qcwatch.ui.mine.MineFragment.this.new CameraPermissionCallback());
            }
        });
        fragmentMineBinding.qcSettingSystem.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$5
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                android.content.Context activity = mineFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.more.SystemSettingActivity.class);
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
                    mineFragment.startActivity(intent);
                }
            }
        });
        fragmentMineBinding.qcSettingDfu.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$6
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                    if (!com.qcwireless.qcwatch.ui.base.util.NetWorkUtils.INSTANCE.isNetworkAvailable(com.qcwireless.qcwatch.ui.mine.MineFragment.this.getActivity())) {
                        java.lang.String string = com.qcwireless.qcwatch.ui.mine.MineFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_223);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_223)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                        return;
                    }
                    kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$6$click$1(com.qcwireless.qcwatch.ui.mine.MineFragment.this, null), 3, (java.lang.Object) null);
                    return;
                }
                java.lang.String string2 = com.qcwireless.qcwatch.ui.mine.MineFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_75)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
            }
        });
        fragmentMineBinding.qcThird.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$7
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                android.content.Context activity = mineFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.thirdSync.googlefit.ThirdPathSyncActivity.class);
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
                    mineFragment.startActivity(intent);
                }
            }
        });
        fragmentMineBinding.qcOtherSetting.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$8
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                android.content.Context activity = mineFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.remind.AiReminderActivity.class);
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
                    mineFragment.startActivity(intent);
                }
            }
        });
        fragmentMineBinding.qcBgRunning.setmOnLSettingItemWithClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick.OnLSettingItemWithClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$9
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClick.OnLSettingItemWithClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                android.content.Context activity = mineFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.guide.BackgroundRunningGuideOneActivity.class);
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
                    mineFragment.startActivity(intent);
                }
            }
        });
        fragmentMineBinding.qcSettingHealthyCheck.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$10
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                android.content.Context activity = mineFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.more.HealthyCheckActivity.class);
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
                    mineFragment.startActivity(intent);
                }
            }
        });
        fragmentMineBinding.qcSettingUnit.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$11
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.MineFragment.this.showUnitDialog();
            }
        });
        fragmentMineBinding.qcSkin.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$12
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                android.content.Context activity = mineFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.skin.SkinSelectActivity.class);
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
                    mineFragment.startActivity(intent);
                }
            }
        });
        fragmentMineBinding.qcHelp.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$13
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                java.lang.String str;
                java.lang.String language = java.util.Locale.getDefault().getLanguage();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "language");
                java.lang.String str2 = language;
                if (kotlin.text.StringsKt.contains$default(str2, "zh", false, 2, (java.lang.Object) null)) {
                    str = "https://api2.qcwxkjvip.com/questionWeb/c033/index.html#/q_cn";
                } else if (kotlin.text.StringsKt.contains$default(str2, "es", false, 2, (java.lang.Object) null)) {
                    str = "https://api2.qcwxkjvip.com/questionWeb/c033/index.html#/q_es";
                } else if (kotlin.text.StringsKt.contains$default(str2, "ja", false, 2, (java.lang.Object) null)) {
                    str = "https://api2.qcwxkjvip.com/questionWeb/c033/index.html#/q_ja";
                } else if (kotlin.text.StringsKt.contains$default(str2, "de", false, 2, (java.lang.Object) null)) {
                    str = "https://api2.qcwxkjvip.com/questionWeb/c033/index.html#/q_de";
                } else if (kotlin.text.StringsKt.contains$default(str2, com.qcwireless.qcwatch.base.view.Localization.language, false, 2, (java.lang.Object) null)) {
                    str = "https://api2.qcwxkjvip.com/questionWeb/c033/index.html#/q_fr";
                } else if (kotlin.text.StringsKt.contains$default(str2, "cs", false, 2, (java.lang.Object) null)) {
                    str = "https://api2.qcwxkjvip.com/questionWeb/c033/index.html#/q_cs";
                } else if (kotlin.text.StringsKt.contains$default(str2, "sk", false, 2, (java.lang.Object) null)) {
                    str = "https://api2.qcwxkjvip.com/questionWeb/c033/index.html#/q_sk";
                } else if (kotlin.text.StringsKt.contains$default(str2, "hu", false, 2, (java.lang.Object) null)) {
                    str = "https://api2.qcwxkjvip.com/questionWeb/c033/index.html#/q_hu";
                } else {
                    str = kotlin.text.StringsKt.contains$default(str2, "pt", false, 2, (java.lang.Object) null) ? "https://api2.qcwxkjvip.com/questionWeb/c033/index.html#/q_pt" : "https://api2.qcwxkjvip.com/questionWeb/c033/index.html#/q_en";
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("url", str);
                com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                android.content.Context activity = mineFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.question.FQuestionActivity.class);
                    intent.setFlags(1);
                    intent.putExtras(bundle);
                    for (kotlin.Pair pair : arrayList) {
                        if (pair != null) {
                            java.lang.String str3 = (java.lang.String) pair.getFirst();
                            java.lang.Object second = pair.getSecond();
                            if (second instanceof java.lang.Integer) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Byte) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Character) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Short) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Boolean) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Long) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Float) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Double) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                            } else if (second instanceof java.lang.String) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (java.lang.String) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.CharSequence) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (java.lang.CharSequence) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Parcelable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else if (second instanceof java.lang.Object[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.util.ArrayList) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof java.io.Serializable) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (java.io.Serializable) second), "putExtra(name, value)");
                            } else if (second instanceof boolean[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (boolean[]) second), "putExtra(name, value)");
                            } else if (second instanceof byte[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (byte[]) second), "putExtra(name, value)");
                            } else if (second instanceof short[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (short[]) second), "putExtra(name, value)");
                            } else if (second instanceof char[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (char[]) second), "putExtra(name, value)");
                            } else if (second instanceof int[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (int[]) second), "putExtra(name, value)");
                            } else if (second instanceof long[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (long[]) second), "putExtra(name, value)");
                            } else if (second instanceof float[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (float[]) second), "putExtra(name, value)");
                            } else if (second instanceof double[]) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (double[]) second), "putExtra(name, value)");
                            } else if (second instanceof android.os.Bundle) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (android.os.Bundle) second), "putExtra(name, value)");
                            } else if (second instanceof android.content.Intent) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (android.os.Parcelable) second), "putExtra(name, value)");
                            } else {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    mineFragment.startActivity(intent);
                }
            }
        });
        fragmentMineBinding.qcFeedback.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$1$14
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                android.content.Context activity = mineFragment.getActivity();
                if (activity != null) {
                    java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.feedback.FeedbackActivity.class);
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
                    mineFragment.startActivity(intent);
                }
            }
        });
        getViewModel().queryUserByUidUI();
        this.imagePicker.setTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_183));
        this.imagePicker.setCropImage(true);
        getViewModel().initData(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) this;
        getViewModel().getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$$ExternalSyntheticLambda8
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.mine.MineFragment.m1245loadDataOnce$lambda1(com.qcwireless.qcwatch.ui.mine.MineFragment.this, (com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI) obj);
            }
        });
        android.view.View[] viewArr = new android.view.View[3];
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding3 = this.binding;
        if (fragmentMineBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMineBinding3 = null;
        }
        viewArr[0] = fragmentMineBinding3.tvDeviceUnbind;
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding4 = this.binding;
        if (fragmentMineBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMineBinding4 = null;
        }
        viewArr[1] = fragmentMineBinding4.btnAddDevice;
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding5 = this.binding;
        if (fragmentMineBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentMineBinding2 = fragmentMineBinding5;
        }
        viewArr[2] = fragmentMineBinding2.imageWarming;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$loadDataOnce$3
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding6;
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding7;
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding8;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                fragmentMineBinding6 = com.qcwireless.qcwatch.ui.mine.MineFragment.this.binding;
                if (fragmentMineBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMineBinding6 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentMineBinding6.tvDeviceUnbind)) {
                    fragmentMineBinding7 = com.qcwireless.qcwatch.ui.mine.MineFragment.this.binding;
                    if (fragmentMineBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMineBinding7 = null;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentMineBinding7.imageWarming)) {
                        fragmentMineBinding8 = com.qcwireless.qcwatch.ui.mine.MineFragment.this.binding;
                        if (fragmentMineBinding8 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            fragmentMineBinding8 = null;
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(view, fragmentMineBinding8.btnAddDevice)) {
                            if (com.qcwireless.qcwatch.ui.base.util.LocationUtils.isGPSEnable(com.qcwireless.qcwatch.ui.mine.MineFragment.this.getActivity())) {
                                if (kotlin.text.StringsKt.equals(android.os.Build.BRAND, "oppo", true)) {
                                    if (com.qcwireless.qcwatch.base.utils.AndroidVersion.isAndroid12()) {
                                        com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                                        android.content.Context activity = mineFragment.getActivity();
                                        if (activity != null) {
                                            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                                            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.class);
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
                                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                            mineFragment.startActivity(intent);
                                            kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                            return;
                                        }
                                        return;
                                    }
                                    com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestLocationPermission(com.qcwireless.qcwatch.ui.mine.MineFragment.this.getActivity(), com.qcwireless.qcwatch.ui.mine.MineFragment.this.new ScanLocationPermissionCallback());
                                    return;
                                }
                                com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestLocationPermission(com.qcwireless.qcwatch.ui.mine.MineFragment.this.getActivity(), com.qcwireless.qcwatch.ui.mine.MineFragment.this.new ScanLocationPermissionCallback());
                                return;
                            }
                            java.lang.String string = com.qcwireless.qcwatch.ui.mine.MineFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_291);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_291)");
                            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                            com.qcwireless.qcwatch.ui.mine.MineFragment.this.startActivity(new android.content.Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                            return;
                        }
                        return;
                    }
                    com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment2 = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                    android.content.Context activity2 = mineFragment2.getActivity();
                    if (activity2 != null) {
                        java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity2, "it");
                        android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.connect.DeviceConnectWarmingActivity.class);
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
                                    kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                                }
                            }
                        }
                        kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                        kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                        kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                        mineFragment2.startActivity(intent2);
                        kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                        kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
                        return;
                    }
                    return;
                }
                if (!com.qcwireless.qcwatch.base.utils.AndroidVersion.isAndroid12()) {
                    com.qcwireless.qcwatch.ui.mine.MineFragment.this.showUnbindDialog();
                } else {
                    com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestBluetoothPermission(com.qcwireless.qcwatch.ui.mine.MineFragment.this.getActivity(), com.qcwireless.qcwatch.ui.mine.MineFragment.this.new BluetoothPermissionCallback());
                }
            }
        });
        getViewModel().getUiDeviceSettingState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$$ExternalSyntheticLambda5
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.mine.MineFragment.m1246loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.mine.MineFragment.this, (com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting) obj);
            }
        });
        com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel deviceViewModel = getDeviceViewModel();
        deviceViewModel.init();
        deviceViewModel.getUiState().observe(lifecycleOwner, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$$ExternalSyntheticLambda6
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.mine.MineFragment.m1247loadDataOnce$lambda4$lambda3(com.qcwireless.qcwatch.ui.mine.MineFragment.this, (com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-1, reason: not valid java name */
    public static final void m1245loadDataOnce$lambda1(com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment, com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.ProfileUI profileUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mineFragment, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, profileUI.getEntity());
        mineFragment.userEntity = profileUI.getEntity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-2, reason: not valid java name */
    public static final void m1246loadDataOnce$lambda2(com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mineFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceSetting, "it");
        mineFragment.deviceSetting = deviceSetting;
        mineFragment.initDeviceSetting(deviceSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadDataOnce$lambda-4$lambda-3, reason: not valid java name */
    public static final void m1247loadDataOnce$lambda4$lambda3(com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment, com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI deviceFragmentUI) {
        com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment2;
        android.content.Context activity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mineFragment, "this$0");
        if (deviceFragmentUI.getRefreshType() == 2) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, deviceFragmentUI);
            com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding = null;
            if (deviceFragmentUI.getShowDfuButton() && com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding2 = mineFragment.binding;
                if (fragmentMineBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMineBinding2 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentMineBinding2.btnFirmwareUpdate);
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding3 = mineFragment.binding;
                if (fragmentMineBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMineBinding3 = null;
                }
                fragmentMineBinding3.qcSettingDfu.setErrorIcon(true);
            } else {
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding4 = mineFragment.binding;
                if (fragmentMineBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMineBinding4 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentMineBinding4.btnFirmwareUpdate);
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding5 = mineFragment.binding;
                if (fragmentMineBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMineBinding5 = null;
                }
                fragmentMineBinding5.qcSettingDfu.setErrorIcon(false);
            }
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDevelopment()) {
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding6 = mineFragment.binding;
                if (fragmentMineBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentMineBinding = fragmentMineBinding6;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentMineBinding.imageDebugBg);
            } else {
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding7 = mineFragment.binding;
                if (fragmentMineBinding7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentMineBinding = fragmentMineBinding7;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentMineBinding.imageDebugBg);
            }
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected() && deviceFragmentUI.getDfuType() == 2 && (activity = (mineFragment2 = mineFragment).getActivity()) != null) {
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.dfu.DeviceFirmwareUpdateActivity.class);
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
                mineFragment2.startActivity(intent);
            }
        }
    }

    private final void initDeviceSetting(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting it) {
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding = this.binding;
        if (fragmentMineBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMineBinding = null;
        }
        if (it.getMetricUnit() == 0) {
            fragmentMineBinding.qcSettingUnit.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_23));
        } else {
            fragmentMineBinding.qcSettingUnit.setRightText(getString(com.qcwireless.qcwatch.R.string.qc_text_24));
        }
    }

    /* compiled from: MineFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/MineFragment$ScanLocationPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/mine/MineFragment;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ScanLocationPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public ScanLocationPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getLocationOnce(com.qcwireless.qcwatch.QCApplication.INSTANCE.getApplication());
            com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
            android.content.Context activity = mineFragment.getActivity();
            if (activity != null) {
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.connect.DeviceBindActivity.class);
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
                mineFragment.startActivity(intent);
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, permissions);
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, permissions);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(never));
            if (never) {
                try {
                    com.qcwireless.qcwatch.ui.mine.MineFragment.this.showPermissionWarmingDialog(permissions);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private final void readBattery() {
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SimpleKeyReq((byte) 3), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$$ExternalSyntheticLambda10
                @Override // com.oudmon.ble.base.communication.ICommandResponse
                public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                    com.qcwireless.qcwatch.ui.mine.MineFragment.m1248readBattery$lambda6(com.qcwireless.qcwatch.ui.mine.MineFragment.this, (com.oudmon.ble.base.communication.rsp.BatteryRsp) baseRspCmd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: readBattery$lambda-6, reason: not valid java name */
    public static final void m1248readBattery$lambda6(com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment, com.oudmon.ble.base.communication.rsp.BatteryRsp batteryRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mineFragment, "this$0");
        try {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBattery(java.lang.String.valueOf(batteryRsp.getBatteryValue()));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
            if (mineFragment.getActivity() == null) {
                return;
            }
            com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding = mineFragment.binding;
            if (fragmentMineBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMineBinding = null;
            }
            fragmentMineBinding.tvDeviceBattery.setText(mineFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_33, new java.lang.Object[]{com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBattery()}) + '%');
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onResume() {
        super.onResume();
        try {
            boolean z = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress().length() == 0;
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(z));
            com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding = null;
            if (z) {
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding2 = this.binding;
                if (fragmentMineBinding2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMineBinding2 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentMineBinding2.dataNoBinding);
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding3 = this.binding;
                if (fragmentMineBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentMineBinding = fragmentMineBinding3;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.invisible(fragmentMineBinding.topDeviceLayout);
            } else {
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding4 = this.binding;
                if (fragmentMineBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMineBinding4 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentMineBinding4.dataNoBinding);
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding5 = this.binding;
                if (fragmentMineBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentMineBinding = fragmentMineBinding5;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentMineBinding.topDeviceLayout);
            }
            refreshUI();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public final void showUnitDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomListDialog create = new com.qcwireless.qcwatch.base.dialog.BottomListDialog.Builder(getActivity()).create();
        create.show();
        create.initView();
        create.setSubTitle(getString(com.qcwireless.qcwatch.R.string.qc_text_34));
        create.setData(getViewModel().getUnitList());
        create.setListener(new com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$$ExternalSyntheticLambda1
            @Override // com.qcwireless.qcwatch.base.dialog.BottomListDialog.DialogItemClickListener
            public final void onSelected(int i) {
                com.qcwireless.qcwatch.ui.mine.MineFragment.m1255showUnitDialog$lambda8(com.qcwireless.qcwatch.ui.mine.MineFragment.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showUnitDialog$lambda-8, reason: not valid java name */
    public static final void m1255showUnitDialog$lambda8(com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mineFragment, "this$0");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting = null;
        if (i == 0) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting2 = mineFragment.deviceSetting;
            if (deviceSetting2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting2 = null;
            }
            deviceSetting2.setMetricUnit(0);
            com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding = mineFragment.binding;
            if (fragmentMineBinding == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMineBinding = null;
            }
            fragmentMineBinding.qcSettingUnit.setRightText(mineFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_23));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(true);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        } else if (i == 1) {
            com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting3 = mineFragment.deviceSetting;
            if (deviceSetting3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
                deviceSetting3 = null;
            }
            deviceSetting3.setMetricUnit(1);
            com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding2 = mineFragment.binding;
            if (fragmentMineBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentMineBinding2 = null;
            }
            fragmentMineBinding2.qcSettingUnit.setRightText(mineFragment.getString(com.qcwireless.qcwatch.R.string.qc_text_24));
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(false);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        }
        com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel viewModel = mineFragment.getViewModel();
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting4 = mineFragment.deviceSetting;
        if (deviceSetting4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting4 = null;
        }
        viewModel.execUnit(1, deviceSetting4);
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting5 = mineFragment.deviceSetting;
        if (deviceSetting5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
            deviceSetting5 = null;
        }
        viewModel.initDialogData(deviceSetting5);
        java.lang.String deviceAddress = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress();
        kotlin.jvm.internal.Intrinsics.checkNotNull(deviceAddress);
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting6 = mineFragment.deviceSetting;
        if (deviceSetting6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("deviceSetting");
        } else {
            deviceSetting = deviceSetting6;
        }
        viewModel.saveDeviceSetting(deviceAddress, deviceSetting);
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.ui.base.bean.event.HealthItemRefreshEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPermissionWarmingDialog(final java.util.List<java.lang.String> permissions) {
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_permission_warming);
        final com.qcwireless.qcwatch.base.dialog.BottomDialog create = builder.create();
        kotlin.jvm.internal.Intrinsics.checkNotNull(create);
        create.show();
        android.view.View contentView = create.getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomWarmingDialog!!.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.MineFragment.m1252showPermissionWarmingDialog$lambda9(com.qcwireless.qcwatch.base.dialog.BottomDialog.this, this, permissions, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.MineFragment.m1251showPermissionWarmingDialog$lambda10(com.qcwireless.qcwatch.base.dialog.BottomDialog.this, this, permissions, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPermissionWarmingDialog$lambda-9, reason: not valid java name */
    public static final void m1252showPermissionWarmingDialog$lambda9(com.qcwireless.qcwatch.base.dialog.BottomDialog bottomDialog, com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment, java.util.List list, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mineFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "$permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNull(bottomDialog);
        bottomDialog.dismiss();
        com.hjq.permissions.XXPermissions.startPermissionActivity(mineFragment.getActivity(), (java.util.List<java.lang.String>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPermissionWarmingDialog$lambda-10, reason: not valid java name */
    public static final void m1251showPermissionWarmingDialog$lambda10(com.qcwireless.qcwatch.base.dialog.BottomDialog bottomDialog, com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment, java.util.List list, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mineFragment, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "$permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNull(bottomDialog);
        bottomDialog.dismiss();
        com.hjq.permissions.XXPermissions.startPermissionActivity(mineFragment.getActivity(), (java.util.List<java.lang.String>) list);
    }

    /* compiled from: MineFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/MineFragment$BluetoothPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/mine/MineFragment;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class BluetoothPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public BluetoothPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            if (all) {
                com.qcwireless.qcwatch.ui.mine.MineFragment.this.showUnbindDialog();
                return;
            }
            java.lang.String string = com.qcwireless.qcwatch.ui.mine.MineFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                com.hjq.permissions.XXPermissions.startPermissionActivity(com.qcwireless.qcwatch.ui.mine.MineFragment.this.getActivity(), permissions);
                java.lang.String string = com.qcwireless.qcwatch.ui.mine.MineFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_458);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_458)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            }
        }
    }

    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(com.qcwireless.qcwatch.base.event.MessageEvent messageEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.RefreshEvent) && kotlin.jvm.internal.Intrinsics.areEqual(getClass(), ((com.qcwireless.qcwatch.base.event.RefreshEvent) messageEvent).getActivityClass())) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "----1");
            readBattery();
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.BatteryLowEvent());
            getViewModel().queryUserByUidUI();
            getViewModel().initData(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion().length() > 0) {
                getDeviceViewModel().checkOta();
            }
        }
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding = null;
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.BluetoothEvent) {
            try {
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress().length() != 0) {
                    r1 = false;
                }
                if (r1) {
                    com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding2 = this.binding;
                    if (fragmentMineBinding2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMineBinding2 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentMineBinding2.dataNoBinding);
                    com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding3 = this.binding;
                    if (fragmentMineBinding3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentMineBinding = fragmentMineBinding3;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.invisible(fragmentMineBinding.topDeviceLayout);
                } else {
                    com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding4 = this.binding;
                    if (fragmentMineBinding4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMineBinding4 = null;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentMineBinding4.dataNoBinding);
                    com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding5 = this.binding;
                    if (fragmentMineBinding5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentMineBinding = fragmentMineBinding5;
                    }
                    com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentMineBinding.topDeviceLayout);
                }
                refreshUI();
                return;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.BatteryLowEvent) {
            try {
                if (getActivity() == null) {
                    return;
                }
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding6 = this.binding;
                if (fragmentMineBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentMineBinding = fragmentMineBinding6;
                }
                fragmentMineBinding.tvDeviceBattery.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_33, new java.lang.Object[]{com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBattery()}) + '%');
                return;
            } catch (java.lang.Exception unused) {
                return;
            }
        }
        if (messageEvent instanceof com.qcwireless.qcwatch.base.event.DataSyncEvent) {
            if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected() || ((com.qcwireless.qcwatch.base.event.DataSyncEvent) messageEvent).getStatus()) {
                return;
            }
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion().length() > 0) {
                getDeviceViewModel().checkOta();
                return;
            }
            return;
        }
        if ((messageEvent instanceof com.qcwireless.qcwatch.base.event.LoginSuccessEvent) && com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected() && com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAvatarSupport()) {
            getViewModel().queryUserByUidUILoginSuccess();
        }
    }

    private final void refreshUI() {
        final com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding = this.binding;
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding2 = null;
        if (fragmentMineBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMineBinding = null;
        }
        java.lang.String deviceName = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceName();
        if (kotlin.text.StringsKt.startsWith$default(deviceName, "O_", false, 2, (java.lang.Object) null)) {
            deviceName = deviceName.substring(2, deviceName.length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceName, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        fragmentMineBinding.tvDeviceName.setText(deviceName);
        fragmentMineBinding.tvDeviceAddress.setText(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress());
        if ((com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion().length() == 0) && com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected() && com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isReady()) {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "重新获取固件件版本号");
            fragmentMineBinding.tvFirmwareVersion.removeCallbacks(this.myFwRunnable);
            fragmentMineBinding.tvFirmwareVersion.postDelayed(this.myFwRunnable, 1000L);
        } else {
            fragmentMineBinding.qcSettingDfu.setErrorIcon(false);
        }
        java.lang.String fmVersion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion();
        java.util.List split$default = kotlin.text.StringsKt.split$default(fmVersion, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null);
        if (split$default.size() >= 2) {
            fmVersion = (java.lang.String) split$default.get(1);
        }
        fragmentMineBinding.tvFirmwareVersion.setText(fmVersion);
        java.lang.String hwVersion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion();
        if (hwVersion.length() > 0) {
            getViewModel().devicePicture(hwVersion);
        }
        java.lang.String battery = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBattery();
        if (battery == null || battery.length() == 0) {
            try {
                com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SimpleKeyReq((byte) 3), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$$ExternalSyntheticLambda9
                    @Override // com.oudmon.ble.base.communication.ICommandResponse
                    public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                        com.qcwireless.qcwatch.ui.mine.MineFragment.m1249refreshUI$lambda12$lambda11(com.qcwireless.qcwatch.databinding.FragmentMineBinding.this, (com.oudmon.ble.base.communication.rsp.BatteryRsp) baseRspCmd);
                    }
                });
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        } else if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            fragmentMineBinding.tvDeviceBattery.setText(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getString(com.qcwireless.qcwatch.R.string.qc_text_33, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getBattery()) + '%');
        } else {
            fragmentMineBinding.tvDeviceBattery.setText("--");
        }
        boolean z = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress().length() == 0;
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.ui.base.thread.ThreadManager.getInstance().wakeUp();
        }
        if (z) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentMineBinding.dataNoBinding);
            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentMineBinding.topDeviceLayout);
        } else {
            if (!(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion().length() > 0)) {
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding3 = this.binding;
                if (fragmentMineBinding3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentMineBinding3 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentMineBinding3.btnFirmwareUpdate);
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentMineBinding.dataNoBinding);
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentMineBinding.topDeviceLayout);
            if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding4 = this.binding;
                if (fragmentMineBinding4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentMineBinding2 = fragmentMineBinding4;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentMineBinding2.btnFirmwareUpdate);
            }
        }
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentMineBinding.imageWarming);
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentMineBinding.imageWarming);
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "开发者模式:" + com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDevelopment());
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDevelopment()) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentMineBinding.imageDebugBg);
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentMineBinding.imageDebugBg);
        }
        getViewModel().getPicUiState().observe((androidx.lifecycle.LifecycleOwner) this, new androidx.lifecycle.Observer() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$$ExternalSyntheticLambda7
            public final void onChanged(java.lang.Object obj) {
                com.qcwireless.qcwatch.ui.mine.MineFragment.m1250refreshUI$lambda13(com.qcwireless.qcwatch.ui.mine.MineFragment.this, (com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshUI$lambda-12$lambda-11, reason: not valid java name */
    public static final void m1249refreshUI$lambda12$lambda11(com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding, com.oudmon.ble.base.communication.rsp.BatteryRsp batteryRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentMineBinding, "$this_run");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBattery(java.lang.String.valueOf(batteryRsp.getBatteryValue()));
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        fragmentMineBinding.tvDeviceBattery.setText(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getString(com.qcwireless.qcwatch.R.string.qc_text_33, java.lang.String.valueOf(batteryRsp.getBatteryValue())) + '%');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshUI$lambda-13, reason: not valid java name */
    public static final void m1250refreshUI$lambda13(final com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment, final com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI devicePictureUI) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mineFragment, "this$0");
        if (devicePictureUI.getLocalUrl().length() > 0) {
            com.qcwireless.qcwatch.base.glide.GlideApp.with(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).asBitmap().m164load("file://" + devicePictureUI.getLocalUrl()).into(new com.bumptech.glide.request.target.CustomTarget<android.graphics.Bitmap>() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$refreshUI$2$1
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(android.graphics.drawable.Drawable placeholder) {
                }

                @Override // com.bumptech.glide.request.target.Target
                public /* bridge */ /* synthetic */ void onResourceReady(java.lang.Object obj, com.bumptech.glide.request.transition.Transition transition) {
                    onResourceReady((android.graphics.Bitmap) obj, (com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap>) transition);
                }

                public void onResourceReady(android.graphics.Bitmap resource, com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap> transition) {
                    com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "resource");
                    fragmentMineBinding = com.qcwireless.qcwatch.ui.mine.MineFragment.this.binding;
                    if (fragmentMineBinding == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentMineBinding = null;
                    }
                    fragmentMineBinding.imageWatch.setImageBitmap(resource);
                }

                @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                public void onLoadFailed(android.graphics.drawable.Drawable errorDrawable) {
                    super.onLoadFailed(errorDrawable);
                    final com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI devicePictureUI2 = devicePictureUI;
                    final com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment2 = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.MineFragment$refreshUI$2$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$refreshUI$2$1$onLoadFailed$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.mine.MineFragment$refreshUI$2$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.mine.MineFragment$refreshUI$2$1 mineFragment$refreshUI$2$1) {
                            com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mineFragment$refreshUI$2$1, "$this$ktxRunOnUi");
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI.this.getUrl());
                            com.bumptech.glide.RequestBuilder load = com.bumptech.glide.Glide.with(mineFragment2.getActivity()).load(com.qcwireless.qcwatch.ui.mine.ucenter.UserProfileViewModel.DevicePictureUI.this.getUrl());
                            fragmentMineBinding = mineFragment2.binding;
                            if (fragmentMineBinding == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                fragmentMineBinding = null;
                            }
                            load.into(fragmentMineBinding.imageWatch);
                        }
                    });
                }
            });
            return;
        }
        com.bumptech.glide.RequestBuilder load = com.bumptech.glide.Glide.with(mineFragment).load(devicePictureUI.getUrl());
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding = mineFragment.binding;
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding2 = null;
        if (fragmentMineBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMineBinding = null;
        }
        com.bumptech.glide.RequestBuilder error = load.placeholder(fragmentMineBinding.imageWatch.getDrawable()).dontAnimate().error(com.qcwireless.qcwatch.R.mipmap.device_icon_1);
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding3 = mineFragment.binding;
        if (fragmentMineBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentMineBinding2 = fragmentMineBinding3;
        }
        error.into(fragmentMineBinding2.imageWatch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showUnbindDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_unbind);
        final com.qcwireless.qcwatch.base.dialog.BottomDialog create = builder.create();
        create.show();
        android.view.View contentView = create.getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "bottomDialog.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_confirm);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.base.dialog.BottomDialog.this.dismiss();
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.MineFragment.m1254showUnbindDialog$lambda15(com.qcwireless.qcwatch.base.dialog.BottomDialog.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showUnbindDialog$lambda-15, reason: not valid java name */
    public static final void m1254showUnbindDialog$lambda15(com.qcwireless.qcwatch.base.dialog.BottomDialog bottomDialog, com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mineFragment, "this$0");
        bottomDialog.dismiss();
        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().saveSyncHistoryDataInfo(0L);
        mineFragment.unBindDevice();
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding = mineFragment.binding;
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding2 = null;
        if (fragmentMineBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMineBinding = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.invisible(fragmentMineBinding.topDeviceLayout);
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding3 = mineFragment.binding;
        if (fragmentMineBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentMineBinding3 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(fragmentMineBinding3.btnFirmwareUpdate);
        com.qcwireless.qcwatch.databinding.FragmentMineBinding fragmentMineBinding4 = mineFragment.binding;
        if (fragmentMineBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentMineBinding2 = fragmentMineBinding4;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(fragmentMineBinding2.dataNoBinding);
    }

    private final void unBindDevice() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().disconnectRtkSPP();
        com.oudmon.ble.base.bluetooth.DeviceManager.getInstance().reSet();
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGpsLocationTime(0L);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastDeviceAddress(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress());
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setServerMarketSize(0);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBatteryLow(false);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setDeviceName("");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setDeviceAddress("");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setHwVersion("");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setFmVersion("");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setRtkMcuSupport(false);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMusicSupport(false);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBattery("100");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastCollectionTime(0L);
        com.qcwireless.qcwatch.base.pref.PreUtil.putString(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Device_Address, "");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMaxWatchFace(6);
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().endAndRelease();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().unBindDevice();
        com.qcwireless.qcwatch.QJavaApplication.getInstance().clear();
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUiDelay(this, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.MineFragment, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.MineFragment$unBindDevice$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.mine.MineFragment) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mineFragment, "$this$ktxRunOnUiDelay");
                com.oudmon.ble.base.scan.BleScannerHelper.getInstance().removeSystemBle();
                com.oudmon.ble.base.scan.BleScannerHelper.getInstance().removeMacSystemBond(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getClassicBluetoothMac());
            }
        });
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.UnbindDeviceEvent());
        new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
    }

    /* compiled from: MineFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/MineFragment$MyFwRunnable;", "Ljava/lang/Runnable;", "(Lcom/qcwireless/qcwatch/ui/mine/MineFragment;)V", "run", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyFwRunnable implements java.lang.Runnable {
        public MyFwRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "获取固件件版本号");
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion().length() == 0) {
                com.oudmon.ble.base.communication.CommandHandle.getInstance().execReadCmd(com.oudmon.ble.base.communication.CommandHandle.getInstance().getReadFmRequest());
            }
        }
    }

    public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.imagePicker.onActivityResult(this, requestCode, resultCode, data);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    /* compiled from: MineFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/MineFragment$CameraPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/mine/MineFragment;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class CameraPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public CameraPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            if (!all) {
                java.lang.String string = com.qcwireless.qcwatch.ui.mine.MineFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                return;
            }
            com.qcwireless.qcwatch.ui.mine.MineFragment mineFragment = com.qcwireless.qcwatch.ui.mine.MineFragment.this;
            android.content.Context activity = mineFragment.getActivity();
            if (activity != null) {
                java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "it");
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.camera.CameraActivity.class);
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
                mineFragment.startActivity(intent);
            }
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                java.lang.String string = com.qcwireless.qcwatch.ui.mine.MineFragment.this.getString(com.qcwireless.qcwatch.R.string.qc_text_77);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_77)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
                com.hjq.permissions.XXPermissions.startPermissionActivity(com.qcwireless.qcwatch.ui.mine.MineFragment.this.getActivity(), permissions);
            }
        }
    }

    /* compiled from: MineFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/MineFragment$Companion;", "", "()V", "newInstance", "Lcom/qcwireless/qcwatch/ui/mine/MineFragment;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.mine.MineFragment newInstance() {
            return new com.qcwireless.qcwatch.ui.mine.MineFragment();
        }
    }
}
