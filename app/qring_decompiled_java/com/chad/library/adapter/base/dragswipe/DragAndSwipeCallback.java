package com.chad.library.adapter.base.dragswipe;

/* loaded from: /tmp/dex/classes2.dex */
public class DragAndSwipeCallback extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
    private com.chad.library.adapter.base.module.BaseDraggableModule mDraggableModule;
    private float mMoveThreshold = 0.1f;
    private float mSwipeThreshold = 0.7f;
    private int mDragMoveFlags = 15;
    private int mSwipeMoveFlags = 32;

    public DragAndSwipeCallback(com.chad.library.adapter.base.module.BaseDraggableModule baseDraggableModule) {
        this.mDraggableModule = baseDraggableModule;
    }

    public boolean isLongPressDragEnabled() {
        com.chad.library.adapter.base.module.BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        return (baseDraggableModule == null || !baseDraggableModule.getIsDragEnabled() || this.mDraggableModule.hasToggleView()) ? false : true;
    }

    public boolean isItemViewSwipeEnabled() {
        com.chad.library.adapter.base.module.BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            return baseDraggableModule.getIsSwipeEnabled();
        }
        return false;
    }

    public void onSelectedChanged(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        if (i == 2 && !isViewCreateByAdapter(viewHolder)) {
            com.chad.library.adapter.base.module.BaseDraggableModule baseDraggableModule = this.mDraggableModule;
            if (baseDraggableModule != null) {
                baseDraggableModule.onItemDragStart(viewHolder);
            }
            viewHolder.itemView.setTag(com.chad.library.R.id.BaseQuickAdapter_dragging_support, true);
        } else if (i == 1 && !isViewCreateByAdapter(viewHolder)) {
            com.chad.library.adapter.base.module.BaseDraggableModule baseDraggableModule2 = this.mDraggableModule;
            if (baseDraggableModule2 != null) {
                baseDraggableModule2.onItemSwipeStart(viewHolder);
            }
            viewHolder.itemView.setTag(com.chad.library.R.id.BaseQuickAdapter_swiping_support, true);
        }
        super.onSelectedChanged(viewHolder, i);
    }

    public void clearView(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        if (isViewCreateByAdapter(viewHolder)) {
            return;
        }
        if (viewHolder.itemView.getTag(com.chad.library.R.id.BaseQuickAdapter_dragging_support) != null && ((java.lang.Boolean) viewHolder.itemView.getTag(com.chad.library.R.id.BaseQuickAdapter_dragging_support)).booleanValue()) {
            com.chad.library.adapter.base.module.BaseDraggableModule baseDraggableModule = this.mDraggableModule;
            if (baseDraggableModule != null) {
                baseDraggableModule.onItemDragEnd(viewHolder);
            }
            viewHolder.itemView.setTag(com.chad.library.R.id.BaseQuickAdapter_dragging_support, false);
        }
        if (viewHolder.itemView.getTag(com.chad.library.R.id.BaseQuickAdapter_swiping_support) == null || !((java.lang.Boolean) viewHolder.itemView.getTag(com.chad.library.R.id.BaseQuickAdapter_swiping_support)).booleanValue()) {
            return;
        }
        com.chad.library.adapter.base.module.BaseDraggableModule baseDraggableModule2 = this.mDraggableModule;
        if (baseDraggableModule2 != null) {
            baseDraggableModule2.onItemSwipeClear(viewHolder);
        }
        viewHolder.itemView.setTag(com.chad.library.R.id.BaseQuickAdapter_swiping_support, false);
    }

    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (isViewCreateByAdapter(viewHolder)) {
            return makeMovementFlags(0, 0);
        }
        return makeMovementFlags(this.mDragMoveFlags, this.mSwipeMoveFlags);
    }

    public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2) {
        return viewHolder.getItemViewType() == viewHolder2.getItemViewType();
    }

    public void onMoved(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        super.onMoved(recyclerView, viewHolder, i, viewHolder2, i2, i3, i4);
        com.chad.library.adapter.base.module.BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.onItemDragMoving(viewHolder, viewHolder2);
        }
    }

    public void onSwiped(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        com.chad.library.adapter.base.module.BaseDraggableModule baseDraggableModule;
        if (isViewCreateByAdapter(viewHolder) || (baseDraggableModule = this.mDraggableModule) == null) {
            return;
        }
        baseDraggableModule.onItemSwiped(viewHolder);
    }

    public float getMoveThreshold(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return this.mMoveThreshold;
    }

    public float getSwipeThreshold(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return this.mSwipeThreshold;
    }

    public void setSwipeThreshold(float f) {
        this.mSwipeThreshold = f;
    }

    public void setMoveThreshold(float f) {
        this.mMoveThreshold = f;
    }

    public void setDragMoveFlags(int i) {
        this.mDragMoveFlags = i;
    }

    public void setSwipeMoveFlags(int i) {
        this.mSwipeMoveFlags = i;
    }

    public void onChildDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        super.onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, z);
        if (i != 1 || isViewCreateByAdapter(viewHolder)) {
            return;
        }
        android.view.View view = viewHolder.itemView;
        canvas.save();
        if (f > 0.0f) {
            canvas.clipRect(view.getLeft(), view.getTop(), view.getLeft() + f, view.getBottom());
            canvas.translate(view.getLeft(), view.getTop());
        } else {
            canvas.clipRect(view.getRight() + f, view.getTop(), view.getRight(), view.getBottom());
            canvas.translate(view.getRight() + f, view.getTop());
        }
        com.chad.library.adapter.base.module.BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.onItemSwiping(canvas, viewHolder, f, f2, z);
        }
        canvas.restore();
    }

    private boolean isViewCreateByAdapter(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 268435729 || itemViewType == 268436002 || itemViewType == 268436275 || itemViewType == 268436821;
    }
}
