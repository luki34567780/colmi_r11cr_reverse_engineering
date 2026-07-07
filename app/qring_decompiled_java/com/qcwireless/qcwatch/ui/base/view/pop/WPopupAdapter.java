package com.qcwireless.qcwatch.ui.base.view.pop;

/* compiled from: WPopupAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001&B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0014\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u000eJ\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0007R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopupAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopupAdapter$ViewHolder;", "popup", "Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopup;", "(Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopup;)V", "direction", "", "Ljava/lang/Integer;", "drawablePadding", "mData", "", "Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopupModel;", "mWItemClickListener", "Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopup$Builder$OnItemClickListener;", "textColor", "textSize", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "p1", "setData", "data", "setDirection", "d", "setDrawablePadding", "padding", "setItemClickListener", "wItemClickListener", "setTextColor", "color", "setTextSize", "size", "ViewHolder", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WPopupAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter.ViewHolder> {
    private java.lang.Integer direction;
    private int drawablePadding;
    private java.util.List<com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel> mData;
    private com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.OnItemClickListener mWItemClickListener;
    private final com.qcwireless.qcwatch.ui.base.view.pop.WPopup popup;
    private int textColor;
    private int textSize;

    public WPopupAdapter(com.qcwireless.qcwatch.ui.base.view.pop.WPopup wPopup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wPopup, "popup");
        this.popup = wPopup;
        this.textColor = android.graphics.Color.parseColor("#ffffff");
        this.textSize = 14;
        this.drawablePadding = 10;
    }

    public final void setData(java.util.List<com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.mData = data;
        notifyDataSetChanged();
    }

    public final void setDirection(int d) {
        this.direction = java.lang.Integer.valueOf(d);
        notifyDataSetChanged();
    }

    public final void setTextColor(int color) {
        this.textColor = color;
        notifyDataSetChanged();
    }

    public final void setTextSize(int size) {
        this.textSize = size;
        notifyDataSetChanged();
    }

    public final void setDrawablePadding(int padding) {
        this.drawablePadding = padding;
        notifyDataSetChanged();
    }

    public final void setItemClickListener(com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.OnItemClickListener wItemClickListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wItemClickListener, "wItemClickListener");
        this.mWItemClickListener = wItemClickListener;
    }

    public com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.qcwireless.qcwatch.R.layout.adapter_common_item, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "view");
        return new com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter.ViewHolder(this, inflate);
    }

    public int getItemCount() {
        java.util.List<com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel> list = this.mData;
        if (list == null) {
            return 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        return list.size();
    }

    public void onBindViewHolder(final com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter.ViewHolder holder, final int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        android.widget.TextView tv = holder.getTv();
        java.util.List<com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel> list = this.mData;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        tv.setText(list.get(position).getText());
        holder.getTv().setTextColor(this.textColor);
        holder.getTv().setTextSize(this.textSize);
        holder.getView().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter.m604onBindViewHolder$lambda0(com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter.this, holder, position, view);
            }
        });
        java.util.List<com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel> list2 = this.mData;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
        if (list2.get(position).getImgRes() != -1) {
            android.content.res.Resources resources = this.popup.getContext().getResources();
            java.util.List<com.qcwireless.qcwatch.ui.base.view.pop.WPopupModel> list3 = this.mData;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list3);
            android.graphics.drawable.Drawable drawable = resources.getDrawable(list3.get(position).getImgRes());
            java.lang.Integer num = this.direction;
            if (num != null && num.intValue() == -3) {
                holder.getTv().setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable);
            } else if (num != null && num.intValue() == -4) {
                holder.getTv().setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            } else if (num != null && num.intValue() == -1) {
                holder.getTv().setCompoundDrawablesWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            } else if (num != null && num.intValue() == -2) {
                holder.getTv().setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
            }
            android.widget.TextView tv2 = holder.getTv();
            com.qcwireless.qcwatch.ui.base.view.pop.Utils utils = com.qcwireless.qcwatch.ui.base.view.pop.Utils.INSTANCE;
            android.content.Context context = holder.getTv().getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "holder.tv.context");
            tv2.setCompoundDrawablePadding(utils.dp2px(context, this.drawablePadding));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0, reason: not valid java name */
    public static final void m604onBindViewHolder$lambda0(com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter wPopupAdapter, com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter.ViewHolder viewHolder, int i, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wPopupAdapter, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHolder, "$holder");
        if (wPopupAdapter.mWItemClickListener != null) {
            wPopupAdapter.popup.dismiss();
            com.qcwireless.qcwatch.ui.base.view.pop.WPopup.Builder.OnItemClickListener onItemClickListener = wPopupAdapter.mWItemClickListener;
            kotlin.jvm.internal.Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onItemClick(viewHolder.getView(), i);
        }
    }

    /* compiled from: WPopupAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopupAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/qcwireless/qcwatch/ui/base/view/pop/WPopupAdapter;Landroid/view/View;)V", "tv", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getTv", "()Landroid/widget/TextView;", "getView", "()Landroid/view/View;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        final /* synthetic */ com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter this$0;
        private final android.widget.TextView tv;
        private final android.view.View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(com.qcwireless.qcwatch.ui.base.view.pop.WPopupAdapter wPopupAdapter, android.view.View view) {
            super(view);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = wPopupAdapter;
            this.view = view;
            this.tv = (android.widget.TextView) view.findViewById(com.qcwireless.qcwatch.R.id.mTvItem);
        }

        public final android.view.View getView() {
            return this.view;
        }

        public final android.widget.TextView getTv() {
            return this.tv;
        }
    }
}
