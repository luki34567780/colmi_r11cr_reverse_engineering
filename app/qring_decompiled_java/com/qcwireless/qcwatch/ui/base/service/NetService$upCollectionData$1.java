package com.qcwireless.qcwatch.ui.base.service;

/* compiled from: NetService.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.service.NetService$upCollectionData$1", f = "NetService.kt", i = {}, l = {359}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class NetService$upCollectionData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;

    NetService$upCollectionData$1(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.service.NetService$upCollectionData$1> continuation) {
        super(2, continuation);
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.base.service.NetService$upCollectionData$1(continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String country = java.util.Locale.getDefault().getCountry();
                java.lang.String str = android.os.Build.BRAND;
                java.lang.String str2 = android.os.Build.MODEL;
                java.lang.String str3 = android.os.Build.VERSION.RELEASE;
                java.lang.String str4 = com.qcwireless.qcwatch.base.view.GlobalKt.getAppName(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()) + '-' + com.qcwireless.qcwatch.base.view.GlobalKt.getVersionName(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT());
                java.lang.String deviceNameNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceNameNoClear();
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(country, "country");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "model");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "brand");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "system");
                com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest collectionRequest = new com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest(deviceNameNoClear, deviceAddressNoClear, country, str2, str, str3, str4, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion(), com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion(), com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUserEmail(), com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid());
                this.label = 1;
                if (com.qcwireless.qcwatch.ui.base.api.QcRetrofitClient.INSTANCE.service().collectionData(collectionRequest, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion().length() > 0) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastCollectionTime(new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp() + 21600);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        }
        return kotlin.Unit.INSTANCE;
    }
}
