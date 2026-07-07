package com.qcwireless.qcwatch.ui.device.contact;

import com.qcwireless.qcwatch.ui.device.contact.ContactActivity.CallPermissionCallback;

/* compiled from: ContactActivity.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
final class ContactActivity$setupViews$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> {
    final /* synthetic */ com.qcwireless.qcwatch.ui.device.contact.ContactActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactActivity$setupViews$2(com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity) {
        super(1);
        this.this$0 = contactActivity;
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((android.view.View) obj);
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(android.view.View view) {
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding2;
        boolean areEqual;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding3;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding4;
        int i;
        int i2;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding5;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding6;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding7;
        int i3;
        int i4;
        int i5;
        androidx.fragment.app.FragmentActivity activity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
        activityContactBinding = this.this$0.binding;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding8 = null;
        if (activityContactBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding = null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityContactBinding.btnAddContact)) {
            areEqual = true;
        } else {
            activityContactBinding2 = this.this$0.binding;
            if (activityContactBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityContactBinding2 = null;
            }
            areEqual = kotlin.jvm.internal.Intrinsics.areEqual(view, activityContactBinding2.titleBar.tvRightText);
        }
        if (areEqual) {
            int size = this.this$0.getViewModel().getLocalList().size();
            i4 = this.this$0.maxContacts;
            if (size <= i4) {
                activity = this.this$0.getActivity();
                java.util.Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                com.qcwireless.qcwatch.base.permission.PermissionUtilKt.requestCallPhonePermission(activity, this.this$0.new CallPermissionCallback());
                return;
            }
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string = this.this$0.getString(com.qcwireless.qcwatch.R.string.qc_text_463);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_463)");
            i5 = this.this$0.maxContacts;
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i5)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(format, 0, 1, null);
            return;
        }
        activityContactBinding3 = this.this$0.binding;
        if (activityContactBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding3 = null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityContactBinding3.btnToDevice)) {
            int size2 = this.this$0.getViewModel().getLocalList().size();
            i = this.this$0.maxContacts;
            if (size2 > i) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String string2 = this.this$0.getString(com.qcwireless.qcwatch.R.string.qc_text_463);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_463)");
                i3 = this.this$0.maxContacts;
                java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i3)}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(format2, 0, 1, null);
                return;
            }
            if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                i2 = this.this$0.maxContacts;
                if (i2 <= 20) {
                    byte[] bArr = new byte[0];
                    for (com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity contactsEntity : this.this$0.getViewModel().getLocalList()) {
                        contactsEntity.setStatus(1);
                        java.lang.String contactName = contactsEntity.getContactName();
                        byte[] bytes = contactName.getBytes(kotlin.text.Charsets.UTF_8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                        if (bytes.length > 32) {
                            contactName = this.this$0.getWholeText(contactName, 32);
                        }
                        byte[] bytes2 = contactName.getBytes(kotlin.text.Charsets.UTF_8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                        int length = bytes2.length;
                        byte[] bytes3 = contactName.getBytes(kotlin.text.Charsets.UTF_8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
                        byte[] concat = com.oudmon.ble.base.communication.utils.ByteUtil.concat(bArr, com.oudmon.ble.base.communication.utils.ByteUtil.concat(new byte[]{(byte) length}, bytes3));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(concat, "concat(data, byteArray)");
                        java.lang.String phoneNumber = contactsEntity.getPhoneNumber();
                        byte[] bytes4 = phoneNumber.getBytes(kotlin.text.Charsets.UTF_8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes4, "this as java.lang.String).getBytes(charset)");
                        if (bytes4.length > 18) {
                            phoneNumber = this.this$0.getWholeText(phoneNumber, 18);
                        }
                        byte[] bytes5 = phoneNumber.getBytes(kotlin.text.Charsets.UTF_8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes5, "this as java.lang.String).getBytes(charset)");
                        int length2 = bytes5.length;
                        byte[] bytes6 = phoneNumber.getBytes(kotlin.text.Charsets.UTF_8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes6, "this as java.lang.String).getBytes(charset)");
                        bArr = com.oudmon.ble.base.communication.utils.ByteUtil.concat(concat, com.oudmon.ble.base.communication.utils.ByteUtil.concat(new byte[]{(byte) length2}, bytes6));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArr, "concat(data, phoneArray)");
                    }
                    com.oudmon.ble.base.communication.LargeDataHandler.getInstance().syncContact(bArr);
                    this.this$0.showLoadingDialogTimeoutNotCancel(1000);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (com.qcwireless.qcwatch.ui.base.repository.entity.ContactsEntity contactsEntity2 : this.this$0.getViewModel().getLocalList()) {
                        com.oudmon.ble.base.communication.bigData.bean.ContactBean contactBean = new com.oudmon.ble.base.communication.bigData.bean.ContactBean();
                        contactBean.setContactName(contactsEntity2.getContactName());
                        contactBean.setPhoneNumber(contactsEntity2.getPhoneNumber());
                        arrayList.add(contactBean);
                    }
                    this.this$0.showLoadingDialogTimeoutNotCancel(com.google.android.gms.fitness.FitnessStatusCodes.NEEDS_OAUTH_PERMISSIONS);
                    com.oudmon.ble.base.communication.LargeDataHandler largeDataHandler = com.oudmon.ble.base.communication.LargeDataHandler.getInstance();
                    final com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity = this.this$0;
                    largeDataHandler.syncContactMore(arrayList, new com.oudmon.ble.base.communication.bigData.resp.ILargeDataBaseResponse() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity$setupViews$2$$ExternalSyntheticLambda0
                        @Override // com.oudmon.ble.base.communication.bigData.resp.ILargeDataBaseResponse
                        public final void resp(com.oudmon.ble.base.communication.bigData.bean.BaseBean baseBean) {
                            com.qcwireless.qcwatch.ui.device.contact.ContactActivity$setupViews$2.m672invoke$lambda0(com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this, baseBean);
                        }
                    });
                }
                this.this$0.getViewModel().addContact(this.this$0.getViewModel().getLocalList());
                activityContactBinding5 = this.this$0.binding;
                if (activityContactBinding5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityContactBinding5 = null;
                }
                activityContactBinding5.btnToDevice.reset();
                activityContactBinding6 = this.this$0.binding;
                if (activityContactBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityContactBinding6 = null;
                }
                activityContactBinding6.btnToDevice.setProgress(30);
                activityContactBinding7 = this.this$0.binding;
                if (activityContactBinding7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityContactBinding8 = activityContactBinding7;
                }
                activityContactBinding8.btnToDevice.setText(this.this$0.getString(com.qcwireless.qcwatch.R.string.qc_text_468));
                android.os.Handler handler = view.getHandler();
                final com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity2 = this.this$0;
                handler.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity$setupViews$2$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.qcwireless.qcwatch.ui.device.contact.ContactActivity$setupViews$2.m673invoke$lambda1(com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this);
                    }
                }, 500L);
                android.os.Handler handler2 = view.getHandler();
                final com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity3 = this.this$0;
                handler2.postDelayed(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.device.contact.ContactActivity$setupViews$2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.qcwireless.qcwatch.ui.device.contact.ContactActivity$setupViews$2.m674invoke$lambda2(com.qcwireless.qcwatch.ui.device.contact.ContactActivity.this);
                    }
                }, 1000L);
                return;
            }
            java.lang.String string3 = this.this$0.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_75)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string3, 0, 1, null);
            return;
        }
        activityContactBinding4 = this.this$0.binding;
        if (activityContactBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityContactBinding8 = activityContactBinding4;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityContactBinding8.tvTitle)) {
            this.this$0.showContactDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m672invoke$lambda0(com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity, com.oudmon.ble.base.communication.bigData.bean.BaseBean baseBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactActivity, "this$0");
        contactActivity.dismissLoadingDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final void m673invoke$lambda1(com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity) {
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding2;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactActivity, "this$0");
        activityContactBinding = contactActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding4 = null;
        if (activityContactBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding = null;
        }
        activityContactBinding.btnToDevice.reset();
        activityContactBinding2 = contactActivity.binding;
        if (activityContactBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding2 = null;
        }
        activityContactBinding2.btnToDevice.setProgress(60);
        activityContactBinding3 = contactActivity.binding;
        if (activityContactBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityContactBinding4 = activityContactBinding3;
        }
        activityContactBinding4.btnToDevice.setText(contactActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_468));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2, reason: not valid java name */
    public static final void m674invoke$lambda2(com.qcwireless.qcwatch.ui.device.contact.ContactActivity contactActivity) {
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding2;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding3;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding4;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactActivity, "this$0");
        activityContactBinding = contactActivity.binding;
        com.qcwireless.qcwatch.databinding.ActivityContactBinding activityContactBinding6 = null;
        if (activityContactBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding = null;
        }
        activityContactBinding.btnToDevice.reset();
        activityContactBinding2 = contactActivity.binding;
        if (activityContactBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding2 = null;
        }
        activityContactBinding2.btnToDevice.setProgress(100);
        activityContactBinding3 = contactActivity.binding;
        if (activityContactBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding3 = null;
        }
        activityContactBinding3.btnToDevice.setText(contactActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_465));
        activityContactBinding4 = contactActivity.binding;
        if (activityContactBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityContactBinding4 = null;
        }
        activityContactBinding4.btnToDevice.setEnabled(false);
        activityContactBinding5 = contactActivity.binding;
        if (activityContactBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityContactBinding6 = activityContactBinding5;
        }
        activityContactBinding6.btnToDevice.setButtonColor(false);
    }
}
