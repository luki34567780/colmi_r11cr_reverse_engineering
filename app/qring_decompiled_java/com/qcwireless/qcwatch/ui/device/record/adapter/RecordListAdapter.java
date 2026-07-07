package com.qcwireless.qcwatch.ui.device.record.adapter;

/* compiled from: RecordListAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/record/adapter/RecordListAdapter;", "Lcom/qcwireless/qcwatch/base/dialog/adapter/EasyAdapter;", "Lcom/qcwireless/qcwatch/ui/device/record/adapter/RecordListAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "data", "", "Lcom/oudmon/ble/base/communication/entity/RecordEntity;", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "mInflater", "Landroid/view/LayoutInflater;", "getItemCount", "", "getItemId", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "whenBindViewHolder", "", "holder", "MyViewHolder", "PopWindowUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class RecordListAdapter extends com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter<com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter.MyViewHolder> {
    private final android.content.Context context;
    private java.util.List<com.oudmon.ble.base.communication.entity.RecordEntity> data;
    private android.view.LayoutInflater mInflater;

    public long getItemId(int position) {
        return position;
    }

    public RecordListAdapter(android.content.Context context, java.util.List<com.oudmon.ble.base.communication.entity.RecordEntity> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
        this.context = context;
        this.data = list;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final java.util.List<com.oudmon.ble.base.communication.entity.RecordEntity> getData() {
        return this.data;
    }

    public final void setData(java.util.List<com.oudmon.ble.base.communication.entity.RecordEntity> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public int getItemCount() {
        return this.data.size();
    }

    @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter
    public void whenBindViewHolder(com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter.MyViewHolder holder, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            com.oudmon.ble.base.communication.entity.RecordEntity recordEntity = this.data.get(position);
            android.widget.TextView name = holder.getName();
            java.lang.String fileName = recordEntity.getFileName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileName, "bean.fileName");
            name.setText((java.lang.CharSequence) kotlin.text.StringsKt.split$default(fileName, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null).get(0));
            holder.getTime().setText(com.qcwireless.qc_utils.date.DateUtil.secondToStr(recordEntity.getLength() / 32000));
        } catch (java.lang.Exception unused) {
        }
    }

    /* compiled from: RecordListAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/record/adapter/RecordListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "setName", "(Landroid/widget/TextView;)V", "time", "getTime", "setTime", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView name;
        private android.widget.TextView time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyViewHolder(android.view.View view) {
            super(view);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "itemView");
            android.view.View findViewById = view.findViewById(com.qcwireless.qcwatch.R.id.rcv_device_name);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.rcv_device_name)");
            this.name = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = view.findViewById(com.qcwireless.qcwatch.R.id.rcv_device_address);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.rcv_device_address)");
            this.time = (android.widget.TextView) findViewById2;
        }

        public final android.widget.TextView getName() {
            return this.name;
        }

        public final void setName(android.widget.TextView textView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.name = textView;
        }

        public final android.widget.TextView getTime() {
            return this.time;
        }

        public final void setTime(android.widget.TextView textView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.time = textView;
        }
    }

    public com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter.MyViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.context);
        this.mInflater = from;
        kotlin.jvm.internal.Intrinsics.checkNotNull(from);
        android.view.View inflate = from.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_manager_record, parent, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "view");
        return new com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter.MyViewHolder(inflate);
    }

    /* compiled from: RecordListAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/record/adapter/RecordListAdapter$PopWindowUI;", "", "view", "Landroid/view/View;", "position", "", "(Landroid/view/View;I)V", "getPosition", "()I", "setPosition", "(I)V", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class PopWindowUI {
        private int position;
        private android.view.View view;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PopWindowUI() {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                r2 = 3
                r3.<init>(r0, r1, r2, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter.PopWindowUI.<init>():void");
        }

        public static /* synthetic */ com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter.PopWindowUI copy$default(com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter.PopWindowUI popWindowUI, android.view.View view, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                view = popWindowUI.view;
            }
            if ((i2 & 2) != 0) {
                i = popWindowUI.position;
            }
            return popWindowUI.copy(view, i);
        }

        /* renamed from: component1, reason: from getter */
        public final android.view.View getView() {
            return this.view;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        public final com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter.PopWindowUI copy(android.view.View view, int position) {
            return new com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter.PopWindowUI(view, position);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter.PopWindowUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter.PopWindowUI popWindowUI = (com.qcwireless.qcwatch.ui.device.record.adapter.RecordListAdapter.PopWindowUI) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.view, popWindowUI.view) && this.position == popWindowUI.position;
        }

        public int hashCode() {
            android.view.View view = this.view;
            return ((view == null ? 0 : view.hashCode()) * 31) + this.position;
        }

        public java.lang.String toString() {
            return "PopWindowUI(view=" + this.view + ", position=" + this.position + ')';
        }

        public PopWindowUI(android.view.View view, int i) {
            this.view = view;
            this.position = i;
        }

        public /* synthetic */ PopWindowUI(android.view.View view, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : view, (i2 & 2) != 0 ? 0 : i);
        }

        public final android.view.View getView() {
            return this.view;
        }

        public final void setView(android.view.View view) {
            this.view = view;
        }

        public final int getPosition() {
            return this.position;
        }

        public final void setPosition(int i) {
            this.position = i;
        }
    }
}
