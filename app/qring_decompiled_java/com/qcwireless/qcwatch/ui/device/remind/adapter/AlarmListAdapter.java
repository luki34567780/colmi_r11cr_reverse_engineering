package com.qcwireless.qcwatch.ui.device.remind.adapter;

/* compiled from: AlarmListAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/remind/adapter/AlarmListAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/qcwireless/qcwatch/ui/base/bean/device/AlarmBean;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "context", "Landroid/content/Context;", "data", "", "(Landroid/content/Context;Ljava/util/List;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/qcwireless/qcwatch/ui/device/remind/adapter/AlarmListAdapter$InitListener;", "convert", "", "holder", "item", "initListener", "InitListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class AlarmListAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.InitListener listener;

    /* compiled from: AlarmListAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/remind/adapter/AlarmListAdapter$InitListener;", "", "onCheckChange", "", "position", "", "checked", "", "onDeleteItem", "onItemClickListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface InitListener {
        void onCheckChange(int position, boolean checked);

        void onDeleteItem(int position);

        void onItemClickListener(int position);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlarmListAdapter(android.content.Context context, java.util.List<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean> list) {
        super(com.qcwireless.qcwatch.R.layout.recycleview_item_alarm, list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
    }

    public final void initListener(com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.InitListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, final com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        final int itemPosition = getItemPosition(item);
        com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem qSettingItemWithClickSystem = (com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem) holder.getView(com.qcwireless.qcwatch.R.id.alarm_detail);
        android.widget.Button button = (android.widget.Button) holder.getView(com.qcwireless.qcwatch.R.id.btn_delete);
        qSettingItemWithClickSystem.setLeftText(com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(item.getTime()));
        qSettingItemWithClickSystem.setLeftSubText(item.getTitle());
        qSettingItemWithClickSystem.setmOnLSettingItemWithClick(new com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem.OnLSettingItemWithClickSystem() { // from class: com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter$convert$1
            @Override // com.qcwireless.qcwatch.ui.base.view.QSettingItemWithClickSystem.OnLSettingItemWithClickSystem
            public void click(int id, boolean isChecked) {
                com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.InitListener initListener;
                initListener = com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.this.listener;
                if (initListener == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    initListener = null;
                }
                initListener.onItemClickListener(itemPosition);
            }
        });
        qSettingItemWithClickSystem.setQSettingItemCheckListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.m875convert$lambda0(com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.this, itemPosition, compoundButton, z);
            }
        });
        qSettingItemWithClickSystem.setChecked(item.getSwitch());
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.m876convert$lambda1(com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.this, item, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convert$lambda-0, reason: not valid java name */
    public static final void m875convert$lambda0(com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter alarmListAdapter, int i, android.widget.CompoundButton compoundButton, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarmListAdapter, "this$0");
        if (compoundButton.isPressed()) {
            com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.InitListener initListener = alarmListAdapter.listener;
            if (initListener == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                initListener = null;
            }
            initListener.onCheckChange(i, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convert$lambda-1, reason: not valid java name */
    public static final void m876convert$lambda1(com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter alarmListAdapter, com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean alarmBean, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarmListAdapter, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarmBean, "$item");
        int itemPosition = alarmListAdapter.getItemPosition(alarmBean);
        com.qcwireless.qcwatch.ui.device.remind.adapter.AlarmListAdapter.InitListener initListener = alarmListAdapter.listener;
        if (initListener == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            initListener = null;
        }
        initListener.onDeleteItem(itemPosition);
    }
}
