package androidx.core.text;

/* loaded from: classes.dex */
public final class ICUCompat {
    private static final java.lang.String TAG = "ICUCompat";
    private static java.lang.reflect.Method sAddLikelySubtagsMethod;
    private static java.lang.reflect.Method sGetScriptMethod;

    static {
        if (android.os.Build.VERSION.SDK_INT < 21) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    sGetScriptMethod = cls.getMethod("getScript", java.lang.String.class);
                    sAddLikelySubtagsMethod = cls.getMethod("addLikelySubtags", java.lang.String.class);
                    return;
                }
                return;
            } catch (java.lang.Exception e) {
                sGetScriptMethod = null;
                sAddLikelySubtagsMethod = null;
                android.util.Log.w(TAG, e);
                return;
            }
        }
        if (android.os.Build.VERSION.SDK_INT < 24) {
            try {
                sAddLikelySubtagsMethod = java.lang.Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", java.util.Locale.class);
            } catch (java.lang.Exception e2) {
                throw new java.lang.IllegalStateException(e2);
            }
        }
    }

    public static java.lang.String maximizeAndGetScript(java.util.Locale locale) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return android.icu.util.ULocale.addLikelySubtags(android.icu.util.ULocale.forLocale(locale)).getScript();
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            try {
                return ((java.util.Locale) sAddLikelySubtagsMethod.invoke(null, locale)).getScript();
            } catch (java.lang.IllegalAccessException e) {
                android.util.Log.w(TAG, e);
                return locale.getScript();
            } catch (java.lang.reflect.InvocationTargetException e2) {
                android.util.Log.w(TAG, e2);
                return locale.getScript();
            }
        }
        java.lang.String addLikelySubtags = addLikelySubtags(locale);
        if (addLikelySubtags != null) {
            return getScript(addLikelySubtags);
        }
        return null;
    }

    private static java.lang.String getScript(java.lang.String str) {
        try {
            java.lang.reflect.Method method = sGetScriptMethod;
            if (method != null) {
                return (java.lang.String) method.invoke(null, str);
            }
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.w(TAG, e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.w(TAG, e2);
        }
        return null;
    }

    private static java.lang.String addLikelySubtags(java.util.Locale locale) {
        java.lang.String locale2 = locale.toString();
        try {
            java.lang.reflect.Method method = sAddLikelySubtagsMethod;
            if (method != null) {
                return (java.lang.String) method.invoke(null, locale2);
            }
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.w(TAG, e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            android.util.Log.w(TAG, e2);
        }
        return locale2;
    }

    private ICUCompat() {
    }
}
