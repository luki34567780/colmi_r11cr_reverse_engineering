package com.qcwireless.qcwatch.ui.device.more.ecard;

/* compiled from: CardActivity.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\"\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\u001dH\u0014J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010'\u001a\u00020\u001dH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/more/ecard/CardActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "REQUEST_CODE_PHOTO", "", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityCardBinding;", "link", "", "<set-?>", "", "supportCard", "getSupportCard", "()Z", "setSupportCard", "(Z)V", "supportCard$delegate", "Lkotlin/properties/ReadWriteProperty;", "type", "getType", "()I", "setType", "(I)V", "type$delegate", "getImageUri", "Landroid/net/Uri;", "inImage", "Landroid/graphics/Bitmap;", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "parsePhoto", "setupViews", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class CardActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] $$delegatedProperties = {(kotlin.reflect.KProperty) kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.class, "type", "getType()I", 0)), (kotlin.reflect.KProperty) kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.class, "supportCard", "getSupportCard()Z", 0))};
    private com.qcwireless.qcwatch.databinding.ActivityCardBinding binding;
    private java.lang.String link;
    private final int REQUEST_CODE_PHOTO = 2;

    /* renamed from: type$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ReadWriteProperty type = kotlin.properties.Delegates.INSTANCE.notNull();

    /* renamed from: supportCard$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ReadWriteProperty supportCard = kotlin.properties.Delegates.INSTANCE.notNull();

    /* JADX INFO: Access modifiers changed from: private */
    public final int getType() {
        return ((java.lang.Number) this.type.getValue(this, $$delegatedProperties[0])).intValue();
    }

    private final void setType(int i) {
        this.type.setValue(this, $$delegatedProperties[0], java.lang.Integer.valueOf(i));
    }

    private final boolean getSupportCard() {
        return ((java.lang.Boolean) this.supportCard.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setSupportCard(boolean z) {
        this.supportCard.setValue(this, $$delegatedProperties[1], java.lang.Boolean.valueOf(z));
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityCardBinding inflate = com.qcwireless.qcwatch.databinding.ActivityCardBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        androidx.constraintlayout.widget.ConstraintLayout root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView((android.view.View) root);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        android.os.Bundle extras = getIntent().getExtras();
        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding = null;
        java.lang.Integer valueOf = extras != null ? java.lang.Integer.valueOf(extras.getInt("type")) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
        setType(valueOf.intValue());
        android.os.Bundle extras2 = getIntent().getExtras();
        java.lang.String string = extras2 != null ? extras2.getString("name") : null;
        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding2 = this.binding;
        if (activityCardBinding2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityCardBinding2 = null;
        }
        android.widget.TextView textView = activityCardBinding2.titleBar.tvTitle;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String string2 = getString(com.qcwireless.qcwatch.R.string.qc_text_4503);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_4503)");
        java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{string}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView.setText(format);
        android.view.View[] viewArr = new android.view.View[5];
        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding3 = this.binding;
        if (activityCardBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityCardBinding3 = null;
        }
        viewArr[0] = activityCardBinding3.tvQrCode;
        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding4 = this.binding;
        if (activityCardBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityCardBinding4 = null;
        }
        viewArr[1] = activityCardBinding4.qrCodeIcon;
        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding5 = this.binding;
        if (activityCardBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityCardBinding5 = null;
        }
        viewArr[2] = activityCardBinding5.btnConfirm;
        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding6 = this.binding;
        if (activityCardBinding6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityCardBinding6 = null;
        }
        viewArr[3] = activityCardBinding6.userNotUse;
        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding7 = this.binding;
        if (activityCardBinding7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityCardBinding7 = null;
        }
        viewArr[4] = activityCardBinding7.btnConfirmCancel;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$setupViews$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding8;
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding9;
                boolean areEqual;
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding10;
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding11;
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding12;
                int type;
                int type2;
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding13;
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding14;
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding15;
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding16;
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding17;
                java.lang.String str;
                java.lang.String str2;
                int type3;
                java.lang.String str3;
                int i;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityCardBinding8 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding18 = null;
                if (activityCardBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityCardBinding8 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityCardBinding8.tvQrCode)) {
                    areEqual = true;
                } else {
                    activityCardBinding9 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                    if (activityCardBinding9 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityCardBinding9 = null;
                    }
                    areEqual = kotlin.jvm.internal.Intrinsics.areEqual(view, activityCardBinding9.qrCodeIcon);
                }
                if (!areEqual) {
                    activityCardBinding10 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                    if (activityCardBinding10 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityCardBinding10 = null;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityCardBinding10.btnConfirm)) {
                        str = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.link;
                        java.lang.String str4 = str;
                        if (!(str4 == null || str4.length() == 0)) {
                            str2 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.link;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
                            byte[] bytes = str2.getBytes(kotlin.text.Charsets.UTF_8);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                            if (bytes.length >= 160) {
                                java.lang.String string3 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_4504);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.qc_text_4504)");
                                com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string3, 0, 1, null);
                                return;
                            } else {
                                com.oudmon.ble.base.communication.bigData.bean.ECardEntity eCardEntity = new com.oudmon.ble.base.communication.bigData.bean.ECardEntity();
                                type3 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.getType();
                                eCardEntity.setType(type3);
                                str3 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.link;
                                eCardEntity.setUrl(str3);
                                com.oudmon.ble.base.communication.LargeDataHandler.getInstance().writeQrCode(eCardEntity);
                                return;
                            }
                        }
                        java.lang.String string4 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_4505);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.qc_text_4505)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string4, 0, 1, null);
                        return;
                    }
                    activityCardBinding11 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                    if (activityCardBinding11 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityCardBinding11 = null;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityCardBinding11.btnConfirmCancel)) {
                        activityCardBinding12 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                        if (activityCardBinding12 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityCardBinding18 = activityCardBinding12;
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityCardBinding18.userNotUse)) {
                            android.os.Bundle bundle = new android.os.Bundle();
                            type = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.getType();
                            bundle.putInt("type", type);
                            android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this;
                            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.device.more.ecard.ECardGuideActivity.class);
                            intent.setFlags(1);
                            intent.putExtras(bundle);
                            for (kotlin.Pair pair : arrayList) {
                                if (pair != null) {
                                    java.lang.String str5 = (java.lang.String) pair.getFirst();
                                    java.lang.Object second = pair.getSecond();
                                    if (second instanceof java.lang.Integer) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, ((java.lang.Number) second).intValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Byte) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, ((java.lang.Number) second).byteValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Character) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, ((java.lang.Character) second).charValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Short) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, ((java.lang.Number) second).shortValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Boolean) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, ((java.lang.Boolean) second).booleanValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Long) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, ((java.lang.Number) second).longValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Float) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, ((java.lang.Number) second).floatValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Double) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, ((java.lang.Number) second).doubleValue()), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.String) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (java.lang.String) second), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.CharSequence) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (java.lang.CharSequence) second), "putExtra(name, value)");
                                    } else if (second instanceof android.os.Parcelable) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (android.os.Parcelable) second), "putExtra(name, value)");
                                    } else if (second instanceof java.lang.Object[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (java.io.Serializable) second), "putExtra(name, value)");
                                    } else if (second instanceof java.util.ArrayList) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (java.io.Serializable) second), "putExtra(name, value)");
                                    } else if (second instanceof java.io.Serializable) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (java.io.Serializable) second), "putExtra(name, value)");
                                    } else if (second instanceof boolean[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (boolean[]) second), "putExtra(name, value)");
                                    } else if (second instanceof byte[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (byte[]) second), "putExtra(name, value)");
                                    } else if (second instanceof short[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (short[]) second), "putExtra(name, value)");
                                    } else if (second instanceof char[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (char[]) second), "putExtra(name, value)");
                                    } else if (second instanceof int[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (int[]) second), "putExtra(name, value)");
                                    } else if (second instanceof long[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (long[]) second), "putExtra(name, value)");
                                    } else if (second instanceof float[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (float[]) second), "putExtra(name, value)");
                                    } else if (second instanceof double[]) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (double[]) second), "putExtra(name, value)");
                                    } else if (second instanceof android.os.Bundle) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (android.os.Bundle) second), "putExtra(name, value)");
                                    } else if (second instanceof android.content.Intent) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent.putExtra(str5, (android.os.Parcelable) second), "putExtra(name, value)");
                                    } else {
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    }
                                }
                            }
                            activity.startActivity(intent);
                            return;
                        }
                        return;
                    }
                    if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
                        java.lang.String string5 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_75);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.qc_text_75)");
                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string5, 0, 1, null);
                    }
                    try {
                        com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.link = "";
                        com.oudmon.ble.base.communication.bigData.bean.ECardEntity eCardEntity2 = new com.oudmon.ble.base.communication.bigData.bean.ECardEntity();
                        type2 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.getType();
                        eCardEntity2.setType(type2 + com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4);
                        eCardEntity2.setUrl("");
                        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().writeQrCode(eCardEntity2);
                        activityCardBinding13 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                        if (activityCardBinding13 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityCardBinding13 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityCardBinding13.qrCodeIcon);
                        activityCardBinding14 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                        if (activityCardBinding14 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityCardBinding14 = null;
                        }
                        activityCardBinding14.tvQrCode.setBackground(skin.support.content.res.SkinCompatResources.getDrawable((android.content.Context) com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this, com.qcwireless.qcwatch.R.drawable.bg_rect_ffffff_corner_12));
                        activityCardBinding15 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                        if (activityCardBinding15 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityCardBinding15 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityCardBinding15.btnConfirm);
                        activityCardBinding16 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                        if (activityCardBinding16 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityCardBinding16 = null;
                        }
                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityCardBinding16.btnConfirmCancel);
                        activityCardBinding17 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                        if (activityCardBinding17 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityCardBinding18 = activityCardBinding17;
                        }
                        activityCardBinding18.btnConfirm.setEnabled(true);
                        return;
                    } catch (java.lang.Exception unused) {
                        return;
                    }
                }
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent2.setDataAndType(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, com.luck.picture.lib.config.SelectMimeType.SYSTEM_IMAGE);
                com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity cardActivity = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this;
                i = cardActivity.REQUEST_CODE_PHOTO;
                cardActivity.startActivityForResult(intent2, i);
            }
        });
        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().readQrCode(getType(), new com.oudmon.ble.base.communication.bigData.resp.ILargeDataQrCodeResponse() { // from class: com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.bigData.resp.ILargeDataQrCodeResponse
            public final void qrCode(com.oudmon.ble.base.communication.bigData.bean.ECardEntity eCardEntity) {
                com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.m763setupViews$lambda1(com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this, eCardEntity);
            }
        });
        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().writeQrCodeWithType();
        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding8 = this.binding;
        if (activityCardBinding8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityCardBinding = activityCardBinding8;
        }
        activityCardBinding.btnConfirm.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViews$lambda-1, reason: not valid java name */
    public static final void m763setupViews$lambda1(com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity cardActivity, com.oudmon.ble.base.communication.bigData.bean.ECardEntity eCardEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardActivity, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, eCardEntity);
        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding = null;
        if (eCardEntity.getDeviceError() == 1) {
            com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding2 = cardActivity.binding;
            if (activityCardBinding2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityCardBinding2 = null;
            }
            activityCardBinding2.btnConfirm.setText(cardActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_4502));
            com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding3 = cardActivity.binding;
            if (activityCardBinding3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityCardBinding3 = null;
            }
            activityCardBinding3.btnConfirm.setEnabled(true);
            com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding4 = cardActivity.binding;
            if (activityCardBinding4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityCardBinding4 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityCardBinding4.btnConfirm);
            com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding5 = cardActivity.binding;
            if (activityCardBinding5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityCardBinding5 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityCardBinding5.btnConfirmCancel);
            java.lang.String string = cardActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_4504);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_4504)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
            return;
        }
        if (eCardEntity.getDeviceError() == 0) {
            com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding6 = cardActivity.binding;
            if (activityCardBinding6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityCardBinding6 = null;
            }
            activityCardBinding6.btnConfirm.setEnabled(false);
            if (cardActivity.getSupportCard() && eCardEntity.getReadOrWrite() == 2 && eCardEntity.getType() < 128) {
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding7 = cardActivity.binding;
                if (activityCardBinding7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityCardBinding7 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityCardBinding7.btnConfirm);
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding8 = cardActivity.binding;
                if (activityCardBinding8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityCardBinding = activityCardBinding8;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityCardBinding.btnConfirmCancel);
                return;
            }
            if (eCardEntity.getType() >= 128) {
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding9 = cardActivity.binding;
                if (activityCardBinding9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityCardBinding9 = null;
                }
                activityCardBinding9.btnConfirm.setText(cardActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_4502));
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding10 = cardActivity.binding;
                if (activityCardBinding10 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityCardBinding10 = null;
                }
                activityCardBinding10.btnConfirm.setEnabled(true);
            } else {
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding11 = cardActivity.binding;
                if (activityCardBinding11 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityCardBinding11 = null;
                }
                activityCardBinding11.btnConfirm.setText(cardActivity.getString(com.qcwireless.qcwatch.R.string.qc_text_4508));
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding12 = cardActivity.binding;
                if (activityCardBinding12 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityCardBinding12 = null;
                }
                activityCardBinding12.btnConfirm.setEnabled(false);
            }
            com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding13 = cardActivity.binding;
            if (activityCardBinding13 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityCardBinding13 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityCardBinding13.btnConfirm);
            com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding14 = cardActivity.binding;
            if (activityCardBinding14 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityCardBinding = activityCardBinding14;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityCardBinding.btnConfirmCancel);
            return;
        }
        if (eCardEntity.getType() != 255) {
            java.lang.String url = eCardEntity.getUrl();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "it.url");
            if (url.length() == 0) {
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding15 = cardActivity.binding;
                if (activityCardBinding15 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityCardBinding15 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityCardBinding15.qrCodeIcon);
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding16 = cardActivity.binding;
                if (activityCardBinding16 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityCardBinding16 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityCardBinding16.btnConfirm);
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding17 = cardActivity.binding;
                if (activityCardBinding17 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityCardBinding = activityCardBinding17;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityCardBinding.btnConfirmCancel);
                cardActivity.link = "";
                return;
            }
            android.graphics.Bitmap createQRCode = com.king.zxing.util.CodeUtils.createQRCode(eCardEntity.getUrl(), 400, (android.graphics.Bitmap) null);
            com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding18 = cardActivity.binding;
            if (activityCardBinding18 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityCardBinding18 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityCardBinding18.qrCodeIcon);
            com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding19 = cardActivity.binding;
            if (activityCardBinding19 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityCardBinding19 = null;
            }
            activityCardBinding19.tvQrCode.setBackground(new android.graphics.drawable.BitmapDrawable(cardActivity.getResources(), createQRCode));
            cardActivity.link = eCardEntity.getUrl();
            com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding20 = cardActivity.binding;
            if (activityCardBinding20 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityCardBinding20 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityCardBinding20.btnConfirm);
            com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding21 = cardActivity.binding;
            if (activityCardBinding21 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityCardBinding = activityCardBinding21;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityCardBinding.btnConfirmCancel);
            return;
        }
        cardActivity.setSupportCard(eCardEntity.isSupport());
        if (eCardEntity.getType() == 255 && eCardEntity.isSupport()) {
            java.lang.String str = cardActivity.link;
            if (str == null || str.length() == 0) {
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding22 = cardActivity.binding;
                if (activityCardBinding22 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityCardBinding22 = null;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.visible(activityCardBinding22.btnConfirm);
                com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding23 = cardActivity.binding;
                if (activityCardBinding23 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityCardBinding = activityCardBinding23;
                }
                com.qcwireless.qcwatch.base.view.ViewKt.gone(activityCardBinding.btnConfirmCancel);
                return;
            }
            com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding24 = cardActivity.binding;
            if (activityCardBinding24 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityCardBinding24 = null;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.visible(activityCardBinding24.btnConfirmCancel);
            com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding25 = cardActivity.binding;
            if (activityCardBinding25 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityCardBinding = activityCardBinding25;
            }
            com.qcwireless.qcwatch.base.view.ViewKt.gone(activityCardBinding.btnConfirm);
            return;
        }
        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding26 = cardActivity.binding;
        if (activityCardBinding26 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityCardBinding26 = null;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityCardBinding26.btnConfirmCancel);
        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding27 = cardActivity.binding;
        if (activityCardBinding27 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityCardBinding = activityCardBinding27;
        }
        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityCardBinding.btnConfirm);
    }

    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && data != null && requestCode == this.REQUEST_CODE_PHOTO) {
            parsePhoto(data);
        }
    }

    private final void parsePhoto(android.content.Intent data) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.String.valueOf(data.getData()));
        if (data.getData() == null) {
            java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_4504);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_4504)");
            com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        } else {
            com.qcwireless.qcwatch.base.glide.GlideApp.with(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).asBitmap().m160load(data.getData()).signature((com.bumptech.glide.load.Key) new com.bumptech.glide.signature.ObjectKey(new com.oudmon.ble.base.util.DateUtil().getY_M_D_H_M())).into(new com.bumptech.glide.request.target.CustomTarget<android.graphics.Bitmap>() { // from class: com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$parsePhoto$1
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(android.graphics.drawable.Drawable placeholder) {
                }

                @Override // com.bumptech.glide.request.target.Target
                public /* bridge */ /* synthetic */ void onResourceReady(java.lang.Object obj, com.bumptech.glide.request.transition.Transition transition) {
                    onResourceReady((android.graphics.Bitmap) obj, (com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap>) transition);
                }

                public void onResourceReady(final android.graphics.Bitmap resource, com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap> transition) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "resource");
                    final com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity cardActivity = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this;
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$parsePhoto$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$parsePhoto$1$onResourceReady$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$parsePhoto$1) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$parsePhoto$1 cardActivity$parsePhoto$1) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardActivity$parsePhoto$1, "$this$ktxRunOnBgSingle");
                            try {
                                android.graphics.Matrix matrix = new android.graphics.Matrix();
                                matrix.setScale(0.5f, 0.5f);
                                android.graphics.Bitmap bitmap = resource;
                                final java.lang.String parseQRCode = com.king.zxing.util.CodeUtils.parseQRCode(android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), resource.getHeight(), matrix, true));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseQRCode, "parseQRCode(bmScaled)");
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, parseQRCode);
                                final android.graphics.Bitmap createQRCode = com.king.zxing.util.CodeUtils.createQRCode(parseQRCode, 400, (android.graphics.Bitmap) null);
                                final com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity cardActivity2 = cardActivity;
                                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(cardActivity$parsePhoto$1, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$parsePhoto$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$parsePhoto$1$onResourceReady$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                        invoke((com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$parsePhoto$1) obj);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$parsePhoto$1 cardActivity$parsePhoto$12) {
                                        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding;
                                        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding2;
                                        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding3;
                                        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding4;
                                        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding5;
                                        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding6;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardActivity$parsePhoto$12, "$this$ktxRunOnUi");
                                        activityCardBinding = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                                        com.qcwireless.qcwatch.databinding.ActivityCardBinding activityCardBinding7 = null;
                                        if (activityCardBinding == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            activityCardBinding = null;
                                        }
                                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityCardBinding.qrCodeIcon);
                                        activityCardBinding2 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                                        if (activityCardBinding2 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            activityCardBinding2 = null;
                                        }
                                        activityCardBinding2.tvQrCode.setBackground(new android.graphics.drawable.BitmapDrawable(com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.getResources(), createQRCode));
                                        com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.link = parseQRCode;
                                        activityCardBinding3 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                                        if (activityCardBinding3 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            activityCardBinding3 = null;
                                        }
                                        activityCardBinding3.btnConfirm.setText(com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_4502));
                                        activityCardBinding4 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                                        if (activityCardBinding4 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            activityCardBinding4 = null;
                                        }
                                        activityCardBinding4.btnConfirm.setEnabled(true);
                                        activityCardBinding5 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                                        if (activityCardBinding5 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            activityCardBinding5 = null;
                                        }
                                        com.qcwireless.qcwatch.base.view.ViewKt.visible(activityCardBinding5.btnConfirm);
                                        activityCardBinding6 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.binding;
                                        if (activityCardBinding6 == null) {
                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                        } else {
                                            activityCardBinding7 = activityCardBinding6;
                                        }
                                        com.qcwireless.qcwatch.base.view.ViewKt.gone(activityCardBinding7.btnConfirmCancel);
                                    }
                                });
                            } catch (java.lang.Exception e) {
                                e.printStackTrace();
                                final com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity cardActivity3 = cardActivity;
                                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUi(cardActivity$parsePhoto$1, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$parsePhoto$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$parsePhoto$1$onResourceReady$1.2
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                        invoke((com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$parsePhoto$1) obj);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity$parsePhoto$1 cardActivity$parsePhoto$12) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardActivity$parsePhoto$12, "$this$ktxRunOnUi");
                                        java.lang.String string2 = com.qcwireless.qcwatch.ui.device.more.ecard.CardActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_4504);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.qc_text_4504)");
                                        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string2, 0, 1, null);
                                    }
                                });
                            }
                        }
                    });
                }

                @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                public void onLoadFailed(android.graphics.drawable.Drawable errorDrawable) {
                    super.onLoadFailed(errorDrawable);
                }
            });
        }
    }

    public final android.net.Uri getImageUri(android.graphics.Bitmap inImage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inImage, "inImage");
        inImage.compress(android.graphics.Bitmap.CompressFormat.JPEG, 50, new java.io.ByteArrayOutputStream());
        android.net.Uri parse = android.net.Uri.parse(android.provider.MediaStore.Images.Media.insertImage(getContentResolver(), inImage, "Title", (java.lang.String) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(path)");
        return parse;
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
        if (com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            return;
        }
        java.lang.String string = getString(com.qcwireless.qcwatch.R.string.qc_text_75);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_75)");
        com.qcwireless.qcwatch.base.view.GlobalKt.showToast$default(string, 0, 1, null);
        finish();
    }
}
