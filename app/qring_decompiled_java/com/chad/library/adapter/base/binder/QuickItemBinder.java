package com.chad.library.adapter.base.binder;

/* compiled from: QuickItemBinder.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/chad/library/adapter/base/binder/QuickItemBinder;", "T", "Lcom/chad/library/adapter/base/binder/BaseItemBinder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "()V", "getLayoutId", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public abstract class QuickItemBinder<T> extends com.chad.library.adapter.base.binder.BaseItemBinder<T, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    public abstract int getLayoutId();

    @Override // com.chad.library.adapter.base.binder.BaseItemBinder
    public com.chad.library.adapter.base.viewholder.BaseViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        return new com.chad.library.adapter.base.viewholder.BaseViewHolder(com.chad.library.adapter.base.util.AdapterUtilsKt.getItemView(parent, getLayoutId()));
    }
}
