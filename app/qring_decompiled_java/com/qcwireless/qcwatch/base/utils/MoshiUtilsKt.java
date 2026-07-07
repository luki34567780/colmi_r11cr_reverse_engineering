package com.qcwireless.qcwatch.base.utils;

/* compiled from: MoshiUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\u0004\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0002¨\u0006\u0006"}, d2 = {"fromJson", "T", "", "", "(Ljava/lang/String;)Ljava/lang/Object;", "toJson", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MoshiUtilsKt {
    public static final /* synthetic */ <T> T fromJson(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        com.squareup.moshi.Moshi moshiBuild = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild();
        kotlin.jvm.internal.Intrinsics.needClassReification();
        com.squareup.moshi.JsonAdapter adapter = moshiBuild.adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<T>() { // from class: com.qcwireless.qcwatch.base.utils.MoshiUtilsKt$fromJson$$inlined$fromJson$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
        return (T) adapter.fromJson(str);
    }

    public static final java.lang.String toJson(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<this>");
        com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.lang.Object>() { // from class: com.qcwireless.qcwatch.base.utils.MoshiUtilsKt$toJson$$inlined$toJson$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
        java.lang.String json = adapter.toJson(obj);
        if (json == null) {
            return "";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "getAdapter<T>().toJson(t) ?: \"\"");
        return json;
    }
}
