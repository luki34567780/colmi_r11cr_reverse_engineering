package com.chad.library.adapter.base.diff;

/* compiled from: BrvahListUpdateCallback.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahListUpdateCallback;", "Landroidx/recyclerview/widget/ListUpdateCallback;", "mAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "onChanged", "", "position", "", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BrvahListUpdateCallback implements androidx.recyclerview.widget.ListUpdateCallback {
    private final com.chad.library.adapter.base.BaseQuickAdapter<?, ?> mAdapter;

    public BrvahListUpdateCallback(com.chad.library.adapter.base.BaseQuickAdapter<?, ?> baseQuickAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseQuickAdapter, "mAdapter");
        this.mAdapter = baseQuickAdapter;
    }

    public void onInserted(int position, int count) {
        com.chad.library.adapter.base.BaseQuickAdapter<?, ?> baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemRangeInserted(position + baseQuickAdapter.getHeaderLayoutCount(), count);
    }

    public void onRemoved(int position, int count) {
        com.chad.library.adapter.base.module.BaseLoadMoreModule mLoadMoreModule = this.mAdapter.getMLoadMoreModule();
        boolean z = false;
        if (mLoadMoreModule != null && mLoadMoreModule.hasLoadMoreView()) {
            z = true;
        }
        if (z && this.mAdapter.getItemCount() == 0) {
            com.chad.library.adapter.base.BaseQuickAdapter<?, ?> baseQuickAdapter = this.mAdapter;
            baseQuickAdapter.notifyItemRangeRemoved(position + baseQuickAdapter.getHeaderLayoutCount(), count + 1);
        } else {
            com.chad.library.adapter.base.BaseQuickAdapter<?, ?> baseQuickAdapter2 = this.mAdapter;
            baseQuickAdapter2.notifyItemRangeRemoved(position + baseQuickAdapter2.getHeaderLayoutCount(), count);
        }
    }

    public void onMoved(int fromPosition, int toPosition) {
        com.chad.library.adapter.base.BaseQuickAdapter<?, ?> baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemMoved(fromPosition + baseQuickAdapter.getHeaderLayoutCount(), toPosition + this.mAdapter.getHeaderLayoutCount());
    }

    public void onChanged(int position, int count, java.lang.Object payload) {
        com.chad.library.adapter.base.BaseQuickAdapter<?, ?> baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemRangeChanged(position + baseQuickAdapter.getHeaderLayoutCount(), count, payload);
    }
}
