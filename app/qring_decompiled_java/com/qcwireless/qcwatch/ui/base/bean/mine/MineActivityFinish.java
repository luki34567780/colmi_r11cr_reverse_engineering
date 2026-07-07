package com.qcwireless.qcwatch.ui.base.bean.mine;

/* compiled from: MineActivityFinish.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/mine/MineActivityFinish;", "Lcom/qcwireless/qcwatch/base/event/MessageEvent;", "type", "", "(I)V", "getType", "()I", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public class MineActivityFinish extends com.qcwireless.qcwatch.base.event.MessageEvent {
    private final int type;

    public MineActivityFinish(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }
}
