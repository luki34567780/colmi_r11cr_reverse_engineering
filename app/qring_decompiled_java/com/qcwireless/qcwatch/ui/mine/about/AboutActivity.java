package com.qcwireless.qcwatch.ui.mine.about;

/* compiled from: AboutActivity.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\rH\u0014J\b\u0010\u0012\u001a\u00020\rH\u0014J\b\u0010\u0013\u001a\u00020\rH\u0002J\u0006\u0010\u0014\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/about/AboutActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "()V", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityAboutBinding;", "click_title_times", "", "is_title_clicked", "", "max_click_times", "text", "", "checkOta", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setupViews", "showCleanAppCacheDialog", "unBindDevice", "AllPermissionCallback", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class AboutActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity {
    private com.qcwireless.qcwatch.databinding.ActivityAboutBinding binding;
    private int click_title_times;
    private boolean is_title_clicked;
    private final int max_click_times = 5;
    private java.lang.String text = "1";

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityAboutBinding inflate = com.qcwireless.qcwatch.databinding.ActivityAboutBinding.inflate(getLayoutInflater());
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        com.qcwireless.qcwatch.databinding.ActivityAboutBinding activityAboutBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityAboutBinding activityAboutBinding2 = null;
        if (activityAboutBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityAboutBinding = null;
        }
        activityAboutBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_147));
        activityAboutBinding.tvAppName.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getAppName());
        activityAboutBinding.tvAppVersion.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getVersionName((android.content.Context) this));
        com.qcwireless.qcwatch.databinding.ActivityAboutBinding activityAboutBinding3 = this.binding;
        if (activityAboutBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityAboutBinding3 = null;
        }
        activityAboutBinding3.qcAppCache.setmOnLSettingItemClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick() { // from class: com.qcwireless.qcwatch.ui.mine.about.AboutActivity$setupViews$1$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItem.OnLSettingItemClick
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.showCleanAppCacheDialog();
            }
        });
        android.view.View[] viewArr = new android.view.View[2];
        com.qcwireless.qcwatch.databinding.ActivityAboutBinding activityAboutBinding4 = this.binding;
        if (activityAboutBinding4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityAboutBinding4 = null;
        }
        viewArr[0] = activityAboutBinding4.userPrivacy;
        com.qcwireless.qcwatch.databinding.ActivityAboutBinding activityAboutBinding5 = this.binding;
        if (activityAboutBinding5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityAboutBinding2 = activityAboutBinding5;
        }
        viewArr[1] = activityAboutBinding2.appIcon;
        com.qcwireless.qcwatch.base.view.GlobalKt.setOnClickListener(viewArr, new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.about.AboutActivity$setupViews$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((android.view.View) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(android.view.View view) {
                com.qcwireless.qcwatch.databinding.ActivityAboutBinding activityAboutBinding6;
                com.qcwireless.qcwatch.databinding.ActivityAboutBinding activityAboutBinding7;
                boolean z;
                int i;
                int i2;
                int i3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "$this$setOnClickListener");
                activityAboutBinding6 = com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.binding;
                com.qcwireless.qcwatch.databinding.ActivityAboutBinding activityAboutBinding8 = null;
                if (activityAboutBinding6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityAboutBinding6 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(view, activityAboutBinding6.userPrivacy)) {
                    activityAboutBinding7 = com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.binding;
                    if (activityAboutBinding7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityAboutBinding8 = activityAboutBinding7;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(view, activityAboutBinding8.appIcon)) {
                        z = com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.is_title_clicked;
                        if (!z) {
                            com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.is_title_clicked = true;
                            com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.click_title_times = 1;
                            java.util.Timer timer = new java.util.Timer();
                            final com.qcwireless.qcwatch.ui.mine.about.AboutActivity aboutActivity = com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this;
                            timer.schedule(new java.util.TimerTask() { // from class: com.qcwireless.qcwatch.ui.mine.about.AboutActivity$setupViews$2.1
                                @Override // java.util.TimerTask, java.lang.Runnable
                                public void run() {
                                    com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.is_title_clicked = false;
                                    com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.click_title_times = 0;
                                }
                            }, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL);
                            return;
                        }
                        com.qcwireless.qcwatch.ui.mine.about.AboutActivity aboutActivity2 = com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this;
                        i = aboutActivity2.click_title_times;
                        aboutActivity2.click_title_times = i + 1;
                        i2 = com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.click_title_times;
                        i3 = com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.max_click_times;
                        if (i2 == i3) {
                            com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.is_title_clicked = false;
                            com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.click_title_times = 0;
                            android.app.Activity activity = (android.app.Activity) com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this;
                            java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
                            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.about.DebugActivity.class);
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
                            activity.startActivity(intent);
                            return;
                        }
                        return;
                    }
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("url", com.qcwireless.qcwatch.ui.mine.privacy.LanguagePPMURLKt.getLanguagePPMUrl());
                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                android.app.Activity activity2 = (android.app.Activity) com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this;
                java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList();
                android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.mine.privacy.WebActivity.class);
                intent2.setFlags(1);
                intent2.putExtras(bundle);
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
                            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                        }
                    }
                }
                kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                activity2.startActivity(intent2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCleanAppCacheDialog() {
        com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder builder = new com.qcwireless.qcwatch.base.dialog.BottomDialog.Builder(getActivity());
        builder.setContentView(com.qcwireless.qcwatch.R.layout.layout_dialog_app_cache);
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = builder.create();
        java.lang.Object obj = objectRef.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) obj).show();
        java.lang.Object obj2 = objectRef.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
        android.view.View contentView = ((com.qcwireless.qcwatch.base.dialog.BottomDialog) obj2).getContentView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contentView, "cleanCacheDialog!!.contentView");
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_cancel);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.qcwireless.qcwatch.R.id.tv_dialog_confirm);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.about.AboutActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.about.AboutActivity.m1259showCleanAppCacheDialog$lambda1(objectRef, view);
            }
        });
        textView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.about.AboutActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.mine.about.AboutActivity.m1260showCleanAppCacheDialog$lambda2(objectRef, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showCleanAppCacheDialog$lambda-1, reason: not valid java name */
    public static final void m1259showCleanAppCacheDialog$lambda1(kotlin.jvm.internal.Ref.ObjectRef objectRef, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$cleanCacheDialog");
        java.lang.Object obj = objectRef.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) obj).dismiss();
        objectRef.element = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showCleanAppCacheDialog$lambda-2, reason: not valid java name */
    public static final void m1260showCleanAppCacheDialog$lambda2(kotlin.jvm.internal.Ref.ObjectRef objectRef, final com.qcwireless.qcwatch.ui.mine.about.AboutActivity aboutActivity, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectRef, "$cleanCacheDialog");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aboutActivity, "this$0");
        java.lang.Object obj = objectRef.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        ((com.qcwireless.qcwatch.base.dialog.BottomDialog) obj).dismiss();
        objectRef.element = null;
        com.oudmon.ble.base.util.ThreadUtils.postDelay(new com.oudmon.ble.base.util.ThreadUtils.TimeTask() { // from class: com.qcwireless.qcwatch.ui.mine.about.AboutActivity$showCleanAppCacheDialog$2$1
            @Override // com.oudmon.ble.base.util.ThreadUtils.TimeTask
            protected void task() {
                com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.unBindDevice();
                com.qcwireless.qcwatch.QJavaApplication.getInstance().clear();
                com.oudmon.ble.base.scan.BleScannerHelper.getInstance().removeMacSystemBond(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getClassicBluetoothMac());
                com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().clearAll();
                com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.deleteDir(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getAppRootFile(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).getAbsolutePath());
                com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.deleteDir(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getAppCacheRootFile(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).getAbsolutePath());
                com.bumptech.glide.Glide.get(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).clearMemory();
                com.bumptech.glide.Glide.get(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).clearDiskCache();
            }
        }, 10L);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void onResume() {
        super.onResume();
    }

    /* compiled from: AboutActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/mine/about/AboutActivity$AllPermissionCallback;", "Lcom/hjq/permissions/OnPermissionCallback;", "(Lcom/qcwireless/qcwatch/ui/mine/about/AboutActivity;)V", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class AllPermissionCallback implements com.hjq.permissions.OnPermissionCallback {
        public AllPermissionCallback() {
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onGranted(java.util.List<java.lang.String> permissions, boolean all) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            if (!all) {
                com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.text = "2";
                java.lang.String string = com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_44);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_44)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast(string, 1);
                return;
            }
            com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.text = "666";
        }

        @Override // com.hjq.permissions.OnPermissionCallback
        public void onDenied(java.util.List<java.lang.String> permissions, boolean never) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissions, "permissions");
            com.hjq.permissions.OnPermissionCallback.CC.$default$onDenied(this, permissions, never);
            if (never) {
                com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.text = "3";
                com.hjq.permissions.XXPermissions.startPermissionActivity((android.app.Activity) com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this, permissions);
                java.lang.String string = com.qcwireless.qcwatch.ui.mine.about.AboutActivity.this.getString(com.qcwireless.qcwatch.R.string.qc_text_387);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.qc_text_387)");
                com.qcwireless.qcwatch.base.view.GlobalKt.showToast(string, 1);
            }
        }
    }

    private final void checkOta() {
        boolean pingHwServer = com.qcwireless.qcwatch.QCApplication.INSTANCE.getGetInstance().getPingHwServer();
        java.lang.String hwVersion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion();
        java.lang.String fmVersion = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion();
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String country = java.util.Locale.getDefault().getCountry();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(country, "getDefault().country");
        com.qcwireless.qcwatch.ui.base.bean.request.device.LastOtaRequest lastOtaRequest = new com.qcwireless.qcwatch.ui.base.bean.request.device.LastOtaRequest(1, 1L, hwVersion, fmVersion, 1, deviceAddressNoClear, country, 2);
        com.qcwireless.qcwatch.databinding.ActivityAboutBinding activityAboutBinding = this.binding;
        if (activityAboutBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityAboutBinding = null;
        }
        activityAboutBinding.tv1.setText(lastOtaRequest + "----" + this.text);
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.mine.about.AboutActivity$checkOta$1(this, pingHwServer, null), 3, (java.lang.Object) null);
    }

    public final void unBindDevice() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().disconnectRtkSPP();
        com.oudmon.ble.base.bluetooth.DeviceManager.getInstance().reSet();
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGpsLocationTime(0L);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastDeviceAddress(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress());
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setServerMarketSize(0);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setDeviceName("");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setDeviceAddress("");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setHwVersion("");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setFmVersion("");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setRtkMcuSupport(false);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMusicSupport(false);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastCollectionTime(0L);
        com.qcwireless.qcwatch.base.pref.PreUtil.putString(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Device_Address, "");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMaxWatchFace(6);
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().endAndRelease();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().unBindDevice();
        com.qcwireless.qcwatch.QJavaApplication.getInstance().clear();
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUiDelay(this, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.mine.about.AboutActivity, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.mine.about.AboutActivity$unBindDevice$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.mine.about.AboutActivity) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.mine.about.AboutActivity aboutActivity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aboutActivity, "$this$ktxRunOnUiDelay");
                com.oudmon.ble.base.scan.BleScannerHelper.getInstance().removeSystemBle();
                com.oudmon.ble.base.scan.BleScannerHelper.getInstance().removeMacSystemBond(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getClassicBluetoothMac());
            }
        });
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.UnbindDeviceEvent());
        new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
    }
}
