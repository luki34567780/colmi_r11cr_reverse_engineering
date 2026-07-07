package com.qcwireless.qcwatch.base.event;

/* compiled from: RefreshEvent.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R \u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/base/event/RefreshEvent;", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "activityClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getActivityClass", "()Ljava/lang/Class;", "setActivityClass", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public class RefreshEvent extends com.qcwireless.qcwatch.base.event.MessageEvent {
    private java.lang.Class<?> activityClass;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RefreshEvent() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.base.event.RefreshEvent.<init>():void");
    }

    public RefreshEvent(java.lang.Class<?> cls) {
        this.activityClass = cls;
    }

    public /* synthetic */ RefreshEvent(java.lang.Class cls, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cls);
    }

    public final java.lang.Class<?> getActivityClass() {
        return this.activityClass;
    }

    public final void setActivityClass(java.lang.Class<?> cls) {
        this.activityClass = cls;
    }
}
