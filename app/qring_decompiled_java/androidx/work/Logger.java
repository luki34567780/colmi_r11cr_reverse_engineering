package androidx.work;

/* loaded from: classes.dex */
public abstract class Logger {
    private static final int MAX_PREFIXED_TAG_LENGTH = 20;
    private static final int MAX_TAG_LENGTH = 23;
    private static final java.lang.String TAG_PREFIX = "WM-";
    private static androidx.work.Logger sLogger;

    public abstract void debug(java.lang.String tag, java.lang.String message, java.lang.Throwable... throwables);

    public abstract void error(java.lang.String tag, java.lang.String message, java.lang.Throwable... throwables);

    public abstract void info(java.lang.String tag, java.lang.String message, java.lang.Throwable... throwables);

    public abstract void verbose(java.lang.String tag, java.lang.String message, java.lang.Throwable... throwables);

    public abstract void warning(java.lang.String tag, java.lang.String message, java.lang.Throwable... throwables);

    public static synchronized void setLogger(androidx.work.Logger logger) {
        synchronized (androidx.work.Logger.class) {
            sLogger = logger;
        }
    }

    public static java.lang.String tagWithPrefix(java.lang.String tag) {
        int length = tag.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(23);
        sb.append(TAG_PREFIX);
        int i = MAX_PREFIXED_TAG_LENGTH;
        if (length >= i) {
            sb.append(tag.substring(0, i));
        } else {
            sb.append(tag);
        }
        return sb.toString();
    }

    public static synchronized androidx.work.Logger get() {
        androidx.work.Logger logger;
        synchronized (androidx.work.Logger.class) {
            if (sLogger == null) {
                sLogger = new androidx.work.Logger.LogcatLogger(3);
            }
            logger = sLogger;
        }
        return logger;
    }

    public Logger(int loggingLevel) {
    }

    public static class LogcatLogger extends androidx.work.Logger {
        private int mLoggingLevel;

        public LogcatLogger(int loggingLevel) {
            super(loggingLevel);
            this.mLoggingLevel = loggingLevel;
        }

        @Override // androidx.work.Logger
        public void verbose(java.lang.String tag, java.lang.String message, java.lang.Throwable... throwables) {
            if (this.mLoggingLevel <= 2) {
                if (throwables != null && throwables.length >= 1) {
                    android.util.Log.v(tag, message, throwables[0]);
                } else {
                    android.util.Log.v(tag, message);
                }
            }
        }

        @Override // androidx.work.Logger
        public void debug(java.lang.String tag, java.lang.String message, java.lang.Throwable... throwables) {
            if (this.mLoggingLevel <= 3) {
                if (throwables != null && throwables.length >= 1) {
                    android.util.Log.d(tag, message, throwables[0]);
                } else {
                    android.util.Log.d(tag, message);
                }
            }
        }

        @Override // androidx.work.Logger
        public void info(java.lang.String tag, java.lang.String message, java.lang.Throwable... throwables) {
            if (this.mLoggingLevel <= 4) {
                if (throwables != null && throwables.length >= 1) {
                    android.util.Log.i(tag, message, throwables[0]);
                } else {
                    android.util.Log.i(tag, message);
                }
            }
        }

        @Override // androidx.work.Logger
        public void warning(java.lang.String tag, java.lang.String message, java.lang.Throwable... throwables) {
            if (this.mLoggingLevel <= 5) {
                if (throwables != null && throwables.length >= 1) {
                    android.util.Log.w(tag, message, throwables[0]);
                } else {
                    android.util.Log.w(tag, message);
                }
            }
        }

        @Override // androidx.work.Logger
        public void error(java.lang.String tag, java.lang.String message, java.lang.Throwable... throwables) {
            if (this.mLoggingLevel <= 6) {
                if (throwables != null && throwables.length >= 1) {
                    android.util.Log.e(tag, message, throwables[0]);
                } else {
                    android.util.Log.e(tag, message);
                }
            }
        }
    }
}
