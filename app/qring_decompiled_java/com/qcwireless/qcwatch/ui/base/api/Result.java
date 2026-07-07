package com.qcwireless.qcwatch.ui.base.api;

/* compiled from: Result.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0002\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/api/Result;", "T", "", "()V", "toString", "", "Error", "Success", "Lcom/qcwireless/qcwatch/ui/base/api/Result$Success;", "Lcom/qcwireless/qcwatch/ui/base/api/Result$Error;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public abstract class Result<T> {
    public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Result() {
    }

    /* compiled from: Result.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/api/Result$Success;", "T", "", "Lcom/qcwireless/qcwatch/ui/base/api/Result;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/qcwireless/qcwatch/ui/base/api/Result$Success;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Success<T> extends com.qcwireless.qcwatch.ui.base.api.Result<T> {
        private final T data;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.base.api.Result.Success copy$default(com.qcwireless.qcwatch.ui.base.api.Result.Success success, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.data;
        }

        public final com.qcwireless.qcwatch.ui.base.api.Result.Success<T> copy(T data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            return new com.qcwireless.qcwatch.ui.base.api.Result.Success<>(data);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.base.api.Result.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.qcwireless.qcwatch.ui.base.api.Result.Success) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        @Override // com.qcwireless.qcwatch.ui.base.api.Result
        public java.lang.String toString() {
            return "Success(data=" + this.data + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(T t) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "data");
            this.data = t;
        }

        public final T getData() {
            return this.data;
        }
    }

    /* compiled from: Result.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/api/Result$Error;", "Lcom/qcwireless/qcwatch/ui/base/api/Result;", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Error extends com.qcwireless.qcwatch.ui.base.api.Result {
        private final java.lang.Exception exception;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.base.api.Result.Error copy$default(com.qcwireless.qcwatch.ui.base.api.Result.Error error, java.lang.Exception exc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Exception getException() {
            return this.exception;
        }

        public final com.qcwireless.qcwatch.ui.base.api.Result.Error copy(java.lang.Exception exception) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
            return new com.qcwireless.qcwatch.ui.base.api.Result.Error(exception);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.base.api.Result.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.exception, ((com.qcwireless.qcwatch.ui.base.api.Result.Error) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @Override // com.qcwireless.qcwatch.ui.base.api.Result
        public java.lang.String toString() {
            return "Error(exception=" + this.exception + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.Exception exc) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "exception");
            this.exception = exc;
        }

        public final java.lang.Exception getException() {
            return this.exception;
        }
    }

    public java.lang.String toString() {
        if (this instanceof com.qcwireless.qcwatch.ui.base.api.Result.Success) {
            return "Success[data=" + ((com.qcwireless.qcwatch.ui.base.api.Result.Success) this).getData() + ']';
        }
        if (!(this instanceof com.qcwireless.qcwatch.ui.base.api.Result.Error)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "Error[exception=" + ((com.qcwireless.qcwatch.ui.base.api.Result.Error) this).getException() + ']';
    }
}
