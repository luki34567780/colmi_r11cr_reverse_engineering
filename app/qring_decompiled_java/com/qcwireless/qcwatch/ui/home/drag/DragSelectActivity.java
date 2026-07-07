package com.qcwireless.qcwatch.ui.home.drag;

/* compiled from: DragSelectActivity.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\u0016\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/drag/DragSelectActivity;", "Lcom/qcwireless/qcwatch/ui/base/BaseActivity;", "Lcom/qcwireless/qcwatch/ui/home/drag/helper/OnStartDragListener;", "()V", "adapter", "Lcom/qcwireless/qcwatch/ui/home/drag/helper/DragRecyclerViewAdapter;", "binding", "Lcom/qcwireless/qcwatch/databinding/ActivityDragSelectBinding;", "mItemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "mList", "", "Lcom/qcwireless/qcwatch/ui/home/drag/helper/ItemEntity;", "map", "", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEndDrag", "list", "onStartDrag", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "refreshSupportUi", "setupViews", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DragSelectActivity extends com.qcwireless.qcwatch.ui.base.BaseActivity implements com.qcwireless.qcwatch.ui.home.drag.helper.OnStartDragListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.home.drag.DragSelectActivity.Companion INSTANCE = new com.qcwireless.qcwatch.ui.home.drag.DragSelectActivity.Companion(null);
    private com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter adapter;
    private com.qcwireless.qcwatch.databinding.ActivityDragSelectBinding binding;
    private androidx.recyclerview.widget.ItemTouchHelper mItemTouchHelper;
    private java.util.List<com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> mList = new java.util.ArrayList();
    private java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> map;

    @Override // com.qcwireless.qcwatch.ui.home.drag.helper.OnStartDragListener
    public void onEndDrag(java.util.List<com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.qcwireless.qcwatch.databinding.ActivityDragSelectBinding inflate = com.qcwireless.qcwatch.databinding.ActivityDragSelectBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        androidx.constraintlayout.widget.ConstraintLayout root = inflate.getRoot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        setContentView((android.view.View) root);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qcwireless.qcwatch.ui.base.BaseActivity
    protected void setupViews() {
        super.setupViews();
        refreshSupportUi();
        this.adapter = new com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter(this.mList, this);
        com.qcwireless.qcwatch.databinding.ActivityDragSelectBinding activityDragSelectBinding = this.binding;
        com.qcwireless.qcwatch.databinding.ActivityDragSelectBinding activityDragSelectBinding2 = null;
        if (activityDragSelectBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityDragSelectBinding = null;
        }
        activityDragSelectBinding.titleBar.tvTitle.setText(getString(com.qcwireless.qcwatch.R.string.qc_text_6));
        activityDragSelectBinding.dragRcv.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager((android.content.Context) this, 1, false));
        androidx.recyclerview.widget.RecyclerView recyclerView = activityDragSelectBinding.dragRcv;
        com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter = this.adapter;
        if (dragRecyclerViewAdapter == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dragRecyclerViewAdapter = null;
        }
        recyclerView.setAdapter(dragRecyclerViewAdapter);
        com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter2 = this.adapter;
        if (dragRecyclerViewAdapter2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dragRecyclerViewAdapter2 = null;
        }
        dragRecyclerViewAdapter2.setOnClickSwitchListener(new com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter.OnClickSwitchListener() { // from class: com.qcwireless.qcwatch.ui.home.drag.DragSelectActivity$setupViews$2
            @Override // com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter.OnClickSwitchListener
            public void onClick(int position, boolean isChecked) {
                java.util.List list;
                java.util.List list2;
                java.util.Map map;
                java.util.List<com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> list3;
                java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> map2;
                java.util.Map map3;
                list = com.qcwireless.qcwatch.ui.home.drag.DragSelectActivity.this.mList;
                com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity itemEntity = (com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity) list.get(position);
                itemEntity.setChecked(isChecked);
                list2 = com.qcwireless.qcwatch.ui.home.drag.DragSelectActivity.this.mList;
                list2.set(position, itemEntity);
                map = com.qcwireless.qcwatch.ui.home.drag.DragSelectActivity.this.map;
                java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> map4 = null;
                if (map == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("map");
                    map = null;
                }
                map.clear();
                list3 = com.qcwireless.qcwatch.ui.home.drag.DragSelectActivity.this.mList;
                com.qcwireless.qcwatch.ui.home.drag.DragSelectActivity dragSelectActivity = com.qcwireless.qcwatch.ui.home.drag.DragSelectActivity.this;
                for (com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity itemEntity2 : list3) {
                    map3 = dragSelectActivity.map;
                    if (map3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("map");
                        map3 = null;
                    }
                    map3.put(java.lang.Integer.valueOf(itemEntity2.getModelType()), itemEntity2);
                }
                com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository getInstance = com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository.INSTANCE.getGetInstance();
                map2 = com.qcwireless.qcwatch.ui.home.drag.DragSelectActivity.this.map;
                if (map2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("map");
                } else {
                    map4 = map2;
                }
                getInstance.saveDeviceSupport(map4);
            }
        });
        com.qcwireless.qcwatch.ui.home.drag.helper.DragRecyclerViewAdapter dragRecyclerViewAdapter3 = this.adapter;
        if (dragRecyclerViewAdapter3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dragRecyclerViewAdapter3 = null;
        }
        androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = new androidx.recyclerview.widget.ItemTouchHelper(new com.qcwireless.qcwatch.ui.home.drag.helper.MyItemTouchHelperCallback(dragRecyclerViewAdapter3));
        this.mItemTouchHelper = itemTouchHelper;
        kotlin.jvm.internal.Intrinsics.checkNotNull(itemTouchHelper);
        com.qcwireless.qcwatch.databinding.ActivityDragSelectBinding activityDragSelectBinding3 = this.binding;
        if (activityDragSelectBinding3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityDragSelectBinding2 = activityDragSelectBinding3;
        }
        itemTouchHelper.attachToRecyclerView(activityDragSelectBinding2.dragRcv);
    }

    private final void refreshSupportUi() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.drag.DragSelectActivity$refreshSupportUi$1(this, null), 3, (java.lang.Object) null);
    }

    @Override // com.qcwireless.qcwatch.ui.home.drag.helper.OnStartDragListener
    public void onStartDrag(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = this.mItemTouchHelper;
        kotlin.jvm.internal.Intrinsics.checkNotNull(itemTouchHelper);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewHolder);
        itemTouchHelper.startDrag(viewHolder);
    }

    @Override // com.qcwireless.qcwatch.ui.base.BaseThemeActivity
    protected void onDestroy() {
        super.onDestroy();
        java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> map = this.map;
        java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> map2 = null;
        if (map == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("map");
            map = null;
        }
        map.clear();
        for (com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity itemEntity : this.mList) {
            java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> map3 = this.map;
            if (map3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("map");
                map3 = null;
            }
            map3.put(java.lang.Integer.valueOf(itemEntity.getModelType()), itemEntity);
        }
        java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> map4 = this.map;
        if (map4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("map");
            map4 = null;
        }
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, map4);
        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository getInstance = com.qcwireless.qcwatch.ui.base.repository.device.DeviceSupportRepository.INSTANCE.getGetInstance();
        java.util.Map<java.lang.Integer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> map5 = this.map;
        if (map5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("map");
        } else {
            map2 = map5;
        }
        getInstance.saveDragSelectDeviceSupport(map2);
    }

    /* compiled from: DragSelectActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/drag/DragSelectActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) com.qcwireless.qcwatch.ui.home.drag.DragSelectActivity.class));
        }
    }
}
