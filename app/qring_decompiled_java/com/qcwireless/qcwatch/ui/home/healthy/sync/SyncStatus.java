package com.qcwireless.qcwatch.ui.home.healthy.sync;

/* compiled from: SyncStatus.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/sync/SyncStatus;", "", "()V", "sync", "", "getSync", "()Z", "setSync", "(Z)V", "syncSportPlus", "getSyncSportPlus", "setSyncSportPlus", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SyncStatus {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus>() { // from class: com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus m1077invoke() {
            return new com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus();
        }
    });
    private boolean sync;
    private boolean syncSportPlus;

    public final boolean getSync() {
        return this.sync;
    }

    public final void setSync(boolean z) {
        this.sync = z;
    }

    /* compiled from: SyncStatus.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/sync/SyncStatus$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/home/healthy/sync/SyncStatus;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/home/healthy/sync/SyncStatus;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus getGetInstance() {
            return (com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus) com.qcwireless.qcwatch.ui.home.healthy.sync.SyncStatus.getInstance$delegate.getValue();
        }
    }

    public final boolean getSyncSportPlus() {
        return this.syncSportPlus;
    }

    public final void setSyncSportPlus(boolean z) {
        this.syncSportPlus = z;
    }
}
