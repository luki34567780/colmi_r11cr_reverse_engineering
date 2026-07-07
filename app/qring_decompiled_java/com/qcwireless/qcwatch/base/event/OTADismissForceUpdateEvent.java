package com.qcwireless.qcwatch.base.event;

/* compiled from: OTADismissForceUpdateEvent.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/base/event/OTADismissForceUpdateEvent;", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "listString", "", "(Ljava/lang/String;)V", "getListString", "()Ljava/lang/String;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public class OTADismissForceUpdateEvent extends com.qcwireless.qcwatch.base.event.MessageEvent {
    private final java.lang.String listString;

    public OTADismissForceUpdateEvent(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "listString");
        this.listString = str;
    }

    public final java.lang.String getListString() {
        return this.listString;
    }
}
