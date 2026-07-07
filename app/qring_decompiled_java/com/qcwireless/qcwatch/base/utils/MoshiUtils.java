package com.qcwireless.qcwatch.base.utils;

/* compiled from: MoshiUtils.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\b\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ#\u0010\b\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u0011J#\u0010\b\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u0014J \u0010\u0015\u001a\u0004\u0018\u0001H\t\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0086\b¢\u0006\u0002\u0010\u0016J \u0010\u0015\u001a\u0004\u0018\u0001H\t\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\b¢\u0006\u0002\u0010\u0017J$\u0010\u0015\u001a\u0004\u0018\u0001H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0086\b¢\u0006\u0002\u0010\u001aJ#\u0010\u0015\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u001bJ \u0010\u0015\u001a\u0004\u0018\u0001H\t\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\b¢\u0006\u0002\u0010\u001cJ\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\t0\u001e\"\u0006\b\u0000\u0010\t\u0018\u0001H\u0086\bJ\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\t0\u001e\"\u0004\b\u0000\u0010\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\t0 \"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0086\bJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\t0 \"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\bJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\t0 \"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0086\bJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\t0 \"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\bJ-\u0010!\u001a\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H$0\"\"\u0006\b\u0000\u0010#\u0018\u0001\"\u0006\b\u0001\u0010$\u0018\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0086\bJ-\u0010!\u001a\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H$0\"\"\u0006\b\u0000\u0010#\u0018\u0001\"\u0006\b\u0001\u0010$\u0018\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\bJ-\u0010!\u001a\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H$0\"\"\u0006\b\u0000\u0010#\u0018\u0001\"\u0006\b\u0001\u0010$\u0018\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0086\bJ-\u0010!\u001a\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H$0\"\"\u0006\b\u0000\u0010#\u0018\u0001\"\u0006\b\u0001\u0010$\u0018\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\bJ\u001e\u0010%\u001a\u00020\u0019\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010&\u001a\u0002H\tH\u0086\b¢\u0006\u0002\u0010'R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006("}, d2 = {"Lcom/qcwireless/qcwatch/base/utils/MoshiUtils;", "", "()V", "moshiBuild", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "getMoshiBuild", "()Lcom/squareup/moshi/Moshi;", "fromJons", "T", "reader", "Lcom/squareup/moshi/JsonReader;", "type", "Ljava/lang/reflect/Type;", "(Lcom/squareup/moshi/JsonReader;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "is", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "buffer", "Lokio/BufferedSource;", "(Lokio/BufferedSource;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "(Ljava/io/InputStream;)Ljava/lang/Object;", "json", "", "(Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "(Lokio/BufferedSource;)Ljava/lang/Object;", "getAdapter", "Lcom/squareup/moshi/JsonAdapter;", "listFromJson", "", "mapFromJson", "", "K", "V", "toJson", "t", "(Ljava/lang/Object;)Ljava/lang/String;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MoshiUtils {
    public static final com.qcwireless.qcwatch.base.utils.MoshiUtils INSTANCE = new com.qcwireless.qcwatch.base.utils.MoshiUtils();
    private static final com.squareup.moshi.Moshi moshiBuild = new com.squareup.moshi.Moshi.Builder().build();

    private MoshiUtils() {
    }

    public final com.squareup.moshi.Moshi getMoshiBuild() {
        return moshiBuild;
    }

    public final <T> T fromJson(java.lang.String json, java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return (T) getAdapter(type).fromJson(json);
    }

    public final <T> T fromJons(okio.BufferedSource buffer, java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return (T) getAdapter(type).fromJson(buffer);
    }

    public final <T> T fromJons(java.io.InputStream is, java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(is, "is");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return (T) getAdapter(type).fromJson(new okio.Buffer().readFrom(is));
    }

    public final <T> T fromJons(com.squareup.moshi.JsonReader reader, java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return (T) getAdapter(type).fromJson(reader);
    }

    public final /* synthetic */ <T> java.util.List<T> listFromJson(java.lang.String json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.lang.reflect.ParameterizedType newParameterizedType = com.squareup.moshi.Types.newParameterizedType(java.util.List.class, new java.lang.reflect.Type[]{java.lang.Object.class});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newParameterizedType, "newParameterizedType(Mut…lass.java, T::class.java)");
        java.util.List<T> list = (java.util.List) fromJson(json, newParameterizedType);
        return list != null ? list : new java.util.ArrayList();
    }

    public final /* synthetic */ <T> java.util.List<T> listFromJson(okio.BufferedSource buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.lang.reflect.ParameterizedType newParameterizedType = com.squareup.moshi.Types.newParameterizedType(java.util.List.class, new java.lang.reflect.Type[]{java.lang.Object.class});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newParameterizedType, "newParameterizedType(Mut…lass.java, T::class.java)");
        java.util.List<T> list = (java.util.List) fromJons(buffer, newParameterizedType);
        return list != null ? list : new java.util.ArrayList();
    }

    public final /* synthetic */ <T> java.util.List<T> listFromJson(java.io.InputStream is) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(is, "is");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.lang.reflect.ParameterizedType newParameterizedType = com.squareup.moshi.Types.newParameterizedType(java.util.List.class, new java.lang.reflect.Type[]{java.lang.Object.class});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newParameterizedType, "newParameterizedType(Mut…lass.java, T::class.java)");
        java.util.List<T> list = (java.util.List) fromJons(is, newParameterizedType);
        return list != null ? list : new java.util.ArrayList();
    }

    public final /* synthetic */ <T> java.util.List<T> listFromJson(com.squareup.moshi.JsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.lang.reflect.ParameterizedType newParameterizedType = com.squareup.moshi.Types.newParameterizedType(java.util.List.class, new java.lang.reflect.Type[]{java.lang.Object.class});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newParameterizedType, "newParameterizedType(Mut…lass.java, T::class.java)");
        java.util.List<T> list = (java.util.List) fromJons(reader, newParameterizedType);
        return list != null ? list : new java.util.ArrayList();
    }

    public final /* synthetic */ <K, V> java.util.Map<K, V> mapFromJson(java.lang.String json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "K");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "V");
        java.lang.reflect.ParameterizedType newParameterizedType = com.squareup.moshi.Types.newParameterizedType(java.util.Map.class, new java.lang.reflect.Type[]{java.lang.Object.class, java.lang.Object.class});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newParameterizedType, "newParameterizedType(Mut…lass.java, V::class.java)");
        java.util.Map<K, V> map = (java.util.Map) fromJson(json, newParameterizedType);
        return map != null ? map : new java.util.LinkedHashMap();
    }

    public final /* synthetic */ <K, V> java.util.Map<K, V> mapFromJson(okio.BufferedSource buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "K");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "V");
        java.lang.reflect.ParameterizedType newParameterizedType = com.squareup.moshi.Types.newParameterizedType(java.util.Map.class, new java.lang.reflect.Type[]{java.lang.Object.class, java.lang.Object.class});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newParameterizedType, "newParameterizedType(Mut…lass.java, V::class.java)");
        java.util.Map<K, V> map = (java.util.Map) fromJons(buffer, newParameterizedType);
        return map != null ? map : new java.util.LinkedHashMap();
    }

    public final /* synthetic */ <K, V> java.util.Map<K, V> mapFromJson(java.io.InputStream is) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(is, "is");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "K");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "V");
        java.lang.reflect.ParameterizedType newParameterizedType = com.squareup.moshi.Types.newParameterizedType(java.util.Map.class, new java.lang.reflect.Type[]{java.lang.Object.class, java.lang.Object.class});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newParameterizedType, "newParameterizedType(Mut…lass.java, V::class.java)");
        java.util.Map<K, V> map = (java.util.Map) fromJons(is, newParameterizedType);
        return map != null ? map : new java.util.LinkedHashMap();
    }

    public final /* synthetic */ <K, V> java.util.Map<K, V> mapFromJson(com.squareup.moshi.JsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "K");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "V");
        java.lang.reflect.ParameterizedType newParameterizedType = com.squareup.moshi.Types.newParameterizedType(java.util.Map.class, new java.lang.reflect.Type[]{java.lang.Object.class, java.lang.Object.class});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newParameterizedType, "newParameterizedType(Mut…lass.java, V::class.java)");
        java.util.Map<K, V> map = (java.util.Map) fromJons(reader, newParameterizedType);
        return map != null ? map : new java.util.LinkedHashMap();
    }

    private final <T> com.squareup.moshi.JsonAdapter<T> getAdapter(java.lang.reflect.Type type) {
        com.squareup.moshi.JsonAdapter<T> adapter = moshiBuild.adapter(type);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(type)");
        return adapter;
    }

    public final /* synthetic */ <T> com.squareup.moshi.JsonAdapter<T> getAdapter() {
        com.squareup.moshi.Moshi moshiBuild2 = getMoshiBuild();
        kotlin.jvm.internal.Intrinsics.needClassReification();
        com.squareup.moshi.JsonAdapter<T> adapter = moshiBuild2.adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<T>() { // from class: com.qcwireless.qcwatch.base.utils.MoshiUtils$getAdapter$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
        return adapter;
    }

    public final /* synthetic */ <T> T fromJson(java.lang.String json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        com.squareup.moshi.Moshi moshiBuild2 = getMoshiBuild();
        kotlin.jvm.internal.Intrinsics.needClassReification();
        com.squareup.moshi.JsonAdapter adapter = moshiBuild2.adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<T>() { // from class: com.qcwireless.qcwatch.base.utils.MoshiUtils$fromJson$$inlined$getAdapter$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
        return (T) adapter.fromJson(json);
    }

    public final /* synthetic */ <T> T fromJson(okio.BufferedSource buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        com.squareup.moshi.Moshi moshiBuild2 = getMoshiBuild();
        kotlin.jvm.internal.Intrinsics.needClassReification();
        com.squareup.moshi.JsonAdapter adapter = moshiBuild2.adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<T>() { // from class: com.qcwireless.qcwatch.base.utils.MoshiUtils$fromJson$$inlined$getAdapter$2
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
        return (T) adapter.fromJson(buffer);
    }

    public final /* synthetic */ <T> T fromJson(java.io.InputStream is) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(is, "is");
        com.squareup.moshi.Moshi moshiBuild2 = getMoshiBuild();
        kotlin.jvm.internal.Intrinsics.needClassReification();
        com.squareup.moshi.JsonAdapter adapter = moshiBuild2.adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<T>() { // from class: com.qcwireless.qcwatch.base.utils.MoshiUtils$fromJson$$inlined$getAdapter$3
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
        return (T) adapter.fromJson(new okio.Buffer().readFrom(is));
    }

    public final /* synthetic */ <T> T fromJson(com.squareup.moshi.JsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        com.squareup.moshi.Moshi moshiBuild2 = getMoshiBuild();
        kotlin.jvm.internal.Intrinsics.needClassReification();
        com.squareup.moshi.JsonAdapter adapter = moshiBuild2.adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<T>() { // from class: com.qcwireless.qcwatch.base.utils.MoshiUtils$fromJson$$inlined$getAdapter$4
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
        return (T) adapter.fromJson(reader);
    }

    public final /* synthetic */ <T> java.lang.String toJson(T t) {
        com.squareup.moshi.Moshi moshiBuild2 = getMoshiBuild();
        kotlin.jvm.internal.Intrinsics.needClassReification();
        com.squareup.moshi.JsonAdapter adapter = moshiBuild2.adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<T>() { // from class: com.qcwireless.qcwatch.base.utils.MoshiUtils$toJson$$inlined$getAdapter$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
        java.lang.String json = adapter.toJson(t);
        return json == null ? "" : json;
    }
}
