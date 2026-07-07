package com.qcwireless.qcwatch.base.view;

/* compiled from: Global.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007\u001a\u000e\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e\u001a\u000e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0007\u001a<\u0010\u0012\u001a\u00020\u00132\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00160\u0015\"\u0004\u0018\u00010\u00162\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0018¢\u0006\u0002\b\u0019¢\u0006\u0002\u0010\u001a\u001a+\u0010\u0012\u001a\u00020\u00132\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00160\u0015\"\u0004\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001d\u001a\u0014\u0010\u001e\u001a\u00020\u0013*\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u000e\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006!"}, d2 = {"appName", "", "getAppName", "()Ljava/lang/String;", "dateLocalization", "", "dp2px", "", "context", "Landroid/content/Context;", "dp", "getPackageName", "getString", "resId", "", "getVersionName", "px2dp", "px", "setOnClickListener", "", "v", "", "Landroid/view/View;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "([Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "([Landroid/view/View;Landroid/view/View$OnClickListener;)V", "showToast", "", "duration", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GlobalKt {
    public static final void setOnClickListener(android.view.View[] viewArr, final kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewArr, "v");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "block");
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.base.view.GlobalKt$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.base.view.GlobalKt.m236setOnClickListener$lambda0(function1, view);
            }
        };
        for (android.view.View view : viewArr) {
            if (view != null) {
                view.setOnClickListener(onClickListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setOnClickListener$lambda-0, reason: not valid java name */
    public static final void m236setOnClickListener$lambda0(kotlin.jvm.functions.Function1 function1, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "$block");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "it");
        function1.invoke(view);
    }

    public static final java.lang.String getString(int i) {
        java.lang.String string = com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getResources().getString(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "QCApplication.CONTEXT.resources.getString(resId)");
        return string;
    }

    public static final java.lang.String getAppName() {
        java.lang.String string = com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getResources().getString(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT().getApplicationInfo().labelRes);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "QCApplication.CONTEXT.re…applicationInfo.labelRes)");
        return string;
    }

    public static /* synthetic */ void showToast$default(java.lang.CharSequence charSequence, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        showToast(charSequence, i);
    }

    public static final void showToast(java.lang.CharSequence charSequence, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        android.widget.Toast.makeText(com.qcwireless.qcwatch.QCApplication.INSTANCE.getApplication(), charSequence, i).show();
    }

    public static final float px2dp(android.content.Context context, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return (f / context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static final float dp2px(android.content.Context context, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static final java.lang.String getVersionName(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        try {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageInfo, "pm.getPackageInfo(context.packageName, 0)");
            java.lang.String str = packageInfo.versionName;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "packageInfo.versionName");
            return str;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "1.0.0.0";
        }
    }

    public static final boolean dateLocalization() {
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "language");
        return kotlin.text.StringsKt.contains$default(com.qcwireless.qcwatch.base.view.Localization.language, language, false, 2, (java.lang.Object) null);
    }

    public static final java.lang.String getPackageName(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        try {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageInfo, "pm.getPackageInfo(context.packageName, 0)");
            java.lang.String str = packageInfo.packageName;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "packageInfo.packageName");
            return str;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "com.qc";
        }
    }

    public static final java.lang.String getAppName(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        try {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageInfo, "pm.getPackageInfo(context.packageName, 0)");
            java.lang.String string = context.getResources().getString(packageInfo.applicationInfo.labelRes);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.resources.getString(labelRes)");
            return string;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "others";
        }
    }

    public static final void setOnClickListener(android.view.View[] viewArr, android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewArr, "v");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClickListener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        for (android.view.View view : viewArr) {
            if (view != null) {
                view.setOnClickListener(onClickListener);
            }
        }
    }
}
