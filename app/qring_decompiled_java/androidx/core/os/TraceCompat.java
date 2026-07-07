package androidx.core.os;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class TraceCompat {
    private static final java.lang.String TAG = "TraceCompat";
    private static java.lang.reflect.Method sAsyncTraceBeginMethod;
    private static java.lang.reflect.Method sAsyncTraceEndMethod;
    private static java.lang.reflect.Method sIsTagEnabledMethod;
    private static java.lang.reflect.Method sTraceCounterMethod;
    private static long sTraceTagApp;

    static {
        if (android.os.Build.VERSION.SDK_INT < 18 || android.os.Build.VERSION.SDK_INT >= 29) {
            return;
        }
        try {
            sTraceTagApp = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
            sIsTagEnabledMethod = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
            sAsyncTraceBeginMethod = android.os.Trace.class.getMethod("asyncTraceBegin", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            sAsyncTraceEndMethod = android.os.Trace.class.getMethod("asyncTraceEnd", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            sTraceCounterMethod = android.os.Trace.class.getMethod("traceCounter", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
        } catch (java.lang.Exception e) {
            android.util.Log.i(TAG, "Unable to initialize via reflection.", e);
        }
    }

    public static boolean isEnabled() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return android.os.Trace.isEnabled();
        }
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            try {
                return ((java.lang.Boolean) sIsTagEnabledMethod.invoke(null, java.lang.Long.valueOf(sTraceTagApp))).booleanValue();
            } catch (java.lang.Exception unused) {
                android.util.Log.v(TAG, "Unable to invoke isTagEnabled() via reflection.");
            }
        }
        return false;
    }

    public static void beginSection(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            android.os.Trace.beginSection(str);
        }
    }

    public static void endSection() {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            android.os.Trace.endSection();
        }
    }

    public static void beginAsyncSection(java.lang.String str, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.os.Trace.beginAsyncSection(str, i);
        } else if (android.os.Build.VERSION.SDK_INT >= 18) {
            try {
                sAsyncTraceBeginMethod.invoke(null, java.lang.Long.valueOf(sTraceTagApp), str, java.lang.Integer.valueOf(i));
            } catch (java.lang.Exception unused) {
                android.util.Log.v(TAG, "Unable to invoke asyncTraceBegin() via reflection.");
            }
        }
    }

    public static void endAsyncSection(java.lang.String str, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.os.Trace.endAsyncSection(str, i);
        } else if (android.os.Build.VERSION.SDK_INT >= 18) {
            try {
                sAsyncTraceEndMethod.invoke(null, java.lang.Long.valueOf(sTraceTagApp), str, java.lang.Integer.valueOf(i));
            } catch (java.lang.Exception unused) {
                android.util.Log.v(TAG, "Unable to invoke endAsyncSection() via reflection.");
            }
        }
    }

    public static void setCounter(java.lang.String str, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.os.Trace.setCounter(str, i);
        } else if (android.os.Build.VERSION.SDK_INT >= 18) {
            try {
                sTraceCounterMethod.invoke(null, java.lang.Long.valueOf(sTraceTagApp), str, java.lang.Integer.valueOf(i));
            } catch (java.lang.Exception unused) {
                android.util.Log.v(TAG, "Unable to invoke traceCounter() via reflection.");
            }
        }
    }

    private TraceCompat() {
    }
}
