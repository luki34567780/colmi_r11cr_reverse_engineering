package androidx.work;

/* loaded from: classes.dex */
public interface Operation {
    public static final androidx.work.Operation.State.IN_PROGRESS IN_PROGRESS;
    public static final androidx.work.Operation.State.SUCCESS SUCCESS;

    com.google.common.util.concurrent.ListenableFuture<androidx.work.Operation.State.SUCCESS> getResult();

    androidx.lifecycle.LiveData<androidx.work.Operation.State> getState();

    static {
        SUCCESS = new androidx.work.Operation.State.SUCCESS();
        IN_PROGRESS = new androidx.work.Operation.State.IN_PROGRESS();
    }

    public static abstract class State {
        State() {
        }

        public static final class SUCCESS extends androidx.work.Operation.State {
            public java.lang.String toString() {
                return "SUCCESS";
            }

            private SUCCESS() {
            }
        }

        public static final class IN_PROGRESS extends androidx.work.Operation.State {
            public java.lang.String toString() {
                return "IN_PROGRESS";
            }

            private IN_PROGRESS() {
            }
        }

        public static final class FAILURE extends androidx.work.Operation.State {
            private final java.lang.Throwable mThrowable;

            public FAILURE(java.lang.Throwable exception) {
                this.mThrowable = exception;
            }

            public java.lang.Throwable getThrowable() {
                return this.mThrowable;
            }

            public java.lang.String toString() {
                return java.lang.String.format("FAILURE (%s)", this.mThrowable.getMessage());
            }
        }
    }
}
