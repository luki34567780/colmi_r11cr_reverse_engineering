package com.qcwireless.qcwatch.base.pref;

/* compiled from: SharedPreferencesExt.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\u001a\u001d\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0002\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0002¢\u0006\u0002\u0010\u0007\u001a3\u0010\b\u001a\u00020\t*\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0002\b\u0010H\u0086\bø\u0001\u0000\u001a/\u0010\u0011\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u0002H\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u0016\u001a/\u0010\u0011\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u0002H\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u0018\u001a/\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u0002H\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u001b\u001a/\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u0002H\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u001c\u001a\u001e\u0010\u001d\u001a\u00020\n*\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u001a\u001e\u0010\u001d\u001a\u00020\n*\u00020\u00172\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"deSerialization", "T", "str", "", "(Ljava/lang/String;)Ljava/lang/Object;", "serialize", "obj", "(Ljava/lang/Object;)Ljava/lang/String;", "edit", "", "Landroid/content/SharedPreferences;", "commit", "", "action", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lkotlin/ExtensionFunctionType;", "getSpValue", "Landroid/app/Activity;", "key", "default", "name", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "putSpValue", "value", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "sp", "mode", "", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SharedPreferencesExtKt {
    public static /* synthetic */ void edit$default(android.content.SharedPreferences sharedPreferences, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "action");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(edit, "editor");
        function1.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static final void edit(android.content.SharedPreferences sharedPreferences, boolean z, kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "action");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(edit, "editor");
        function1.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ android.content.SharedPreferences sp$default(android.content.Context context, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = context.getPackageName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "packageName");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return sp(context, str, i);
    }

    public static final android.content.SharedPreferences sp(android.content.Context context, java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(str, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(name, mode)");
        return sharedPreferences;
    }

    public static /* synthetic */ android.content.SharedPreferences sp$default(android.app.Activity activity, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = activity.getPackageName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "packageName");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return sp(activity, str, i);
    }

    public static final android.content.SharedPreferences sp(android.app.Activity activity, java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        android.content.SharedPreferences sharedPreferences = activity.getSharedPreferences(str, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(name, mode)");
        return sharedPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void putSpValue(android.content.Context context, java.lang.String str, T t, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "name");
        android.content.SharedPreferences.Editor edit = sp$default(context, str2, 0, 2, (java.lang.Object) null).edit();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(edit, "editor");
        if (t instanceof java.lang.Long) {
            edit.putLong(str, ((java.lang.Number) t).longValue());
        } else if (t instanceof java.lang.String) {
            edit.putString(str, (java.lang.String) t);
        } else if (t instanceof java.lang.Integer) {
            edit.putInt(str, ((java.lang.Number) t).intValue());
        } else if (t instanceof java.lang.Boolean) {
            edit.putBoolean(str, ((java.lang.Boolean) t).booleanValue());
        } else if (t instanceof java.lang.Float) {
            edit.putFloat(str, ((java.lang.Number) t).floatValue());
        } else {
            edit.putString(str, serialize(t));
        }
        edit.apply();
    }

    public static /* synthetic */ void putSpValue$default(android.content.Context context, java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            str2 = context.getPackageName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "packageName");
        }
        putSpValue(context, str, obj, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void putSpValue(android.app.Activity activity, java.lang.String str, T t, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "name");
        android.content.SharedPreferences.Editor edit = sp$default(activity, str2, 0, 2, (java.lang.Object) null).edit();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(edit, "editor");
        if (t instanceof java.lang.Long) {
            edit.putLong(str, ((java.lang.Number) t).longValue());
        } else if (t instanceof java.lang.String) {
            edit.putString(str, (java.lang.String) t);
        } else if (t instanceof java.lang.Integer) {
            edit.putInt(str, ((java.lang.Number) t).intValue());
        } else if (t instanceof java.lang.Boolean) {
            edit.putBoolean(str, ((java.lang.Boolean) t).booleanValue());
        } else if (t instanceof java.lang.Float) {
            edit.putFloat(str, ((java.lang.Number) t).floatValue());
        } else {
            edit.putString(str, serialize(t));
        }
        edit.apply();
    }

    public static /* synthetic */ void putSpValue$default(android.app.Activity activity, java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            str2 = activity.getPackageName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "packageName");
        }
        putSpValue(activity, str, obj, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T getSpValue(android.content.Context context, java.lang.String str, T t, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "name");
        android.content.SharedPreferences sp$default = sp$default(context, str2, 0, 2, (java.lang.Object) null);
        return t instanceof java.lang.Long ? (T) java.lang.Long.valueOf(sp$default.getLong(str, ((java.lang.Number) t).longValue())) : t instanceof java.lang.String ? (T) sp$default.getString(str, (java.lang.String) t) : t instanceof java.lang.Integer ? (T) java.lang.Integer.valueOf(sp$default.getInt(str, ((java.lang.Number) t).intValue())) : t instanceof java.lang.Boolean ? (T) java.lang.Boolean.valueOf(sp$default.getBoolean(str, ((java.lang.Boolean) t).booleanValue())) : t instanceof java.lang.Float ? (T) java.lang.Float.valueOf(sp$default.getFloat(str, ((java.lang.Number) t).floatValue())) : (T) deSerialization(sp$default.getString(str, serialize(t)));
    }

    public static /* synthetic */ java.lang.Object getSpValue$default(android.content.Context context, java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            str2 = context.getPackageName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "packageName");
        }
        return getSpValue(context, str, obj, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T getSpValue(android.app.Activity activity, java.lang.String str, T t, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "name");
        android.content.SharedPreferences sp$default = sp$default(activity, str2, 0, 2, (java.lang.Object) null);
        return t instanceof java.lang.Long ? (T) java.lang.Long.valueOf(sp$default.getLong(str, ((java.lang.Number) t).longValue())) : t instanceof java.lang.String ? (T) sp$default.getString(str, (java.lang.String) t) : t instanceof java.lang.Integer ? (T) java.lang.Integer.valueOf(sp$default.getInt(str, ((java.lang.Number) t).intValue())) : t instanceof java.lang.Boolean ? (T) java.lang.Boolean.valueOf(sp$default.getBoolean(str, ((java.lang.Boolean) t).booleanValue())) : t instanceof java.lang.Float ? (T) java.lang.Float.valueOf(sp$default.getFloat(str, ((java.lang.Number) t).floatValue())) : (T) deSerialization(sp$default.getString(str, serialize(t)));
    }

    public static /* synthetic */ java.lang.Object getSpValue$default(android.app.Activity activity, java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            str2 = activity.getPackageName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "packageName");
        }
        return getSpValue(activity, str, obj, str2);
    }

    private static final <T> java.lang.String serialize(T t) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(t);
        java.lang.String encode = java.net.URLEncoder.encode(byteArrayOutputStream.toString("ISO-8859-1"), "UTF-8");
        objectOutputStream.close();
        byteArrayOutputStream.close();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encode, "serStr");
        return encode;
    }

    private static final <T> T deSerialization(java.lang.String str) {
        java.lang.String decode = java.net.URLDecoder.decode(str, "UTF-8");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "redStr");
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(charsetName)");
        byte[] bytes = decode.getBytes(forName);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
        java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
        T t = (T) objectInputStream.readObject();
        objectInputStream.close();
        byteArrayInputStream.close();
        return t;
    }
}
