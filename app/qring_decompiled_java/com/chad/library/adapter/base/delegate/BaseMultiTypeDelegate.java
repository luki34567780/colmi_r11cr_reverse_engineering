package com.chad.library.adapter.base.delegate;

/* compiled from: BaseMultiTypeDelegate.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bJ\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\b\u0001\u0010\u000e\u001a\u00020\u000f\"\u00020\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u001e\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0016\u001a\u00020\u000bH&J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bJ\u001a\u0010\u0019\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/chad/library/adapter/base/delegate/BaseMultiTypeDelegate;", "T", "", "layouts", "Landroid/util/SparseIntArray;", "(Landroid/util/SparseIntArray;)V", "autoMode", "", "selfMode", "addItemType", "type", "", "layoutResId", "addItemTypeAutoIncrease", "layoutResIds", "", "checkMode", "", "mode", "getItemType", "data", "", "position", "getLayoutId", "viewType", "registerItemType", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public abstract class BaseMultiTypeDelegate<T> {
    private boolean autoMode;
    private android.util.SparseIntArray layouts;
    private boolean selfMode;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseMultiTypeDelegate() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chad.library.adapter.base.delegate.BaseMultiTypeDelegate.<init>():void");
    }

    public abstract int getItemType(java.util.List<? extends T> data, int position);

    public BaseMultiTypeDelegate(android.util.SparseIntArray sparseIntArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sparseIntArray, "layouts");
        this.layouts = sparseIntArray;
    }

    public /* synthetic */ BaseMultiTypeDelegate(android.util.SparseIntArray sparseIntArray, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new android.util.SparseIntArray() : sparseIntArray);
    }

    public final int getLayoutId(int viewType) {
        int i = this.layouts.get(viewType);
        if (i != 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(("ViewType: " + viewType + " found layoutResId，please use registerItemType() first!").toString());
    }

    private final void registerItemType(int type, int layoutResId) {
        this.layouts.put(type, layoutResId);
    }

    public final com.chad.library.adapter.base.delegate.BaseMultiTypeDelegate<T> addItemTypeAutoIncrease(int... layoutResIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutResIds, "layoutResIds");
        this.autoMode = true;
        checkMode(this.selfMode);
        int length = layoutResIds.length;
        for (int i = 0; i < length; i++) {
            registerItemType(i, layoutResIds[i]);
        }
        return this;
    }

    public final com.chad.library.adapter.base.delegate.BaseMultiTypeDelegate<T> addItemType(int type, int layoutResId) {
        this.selfMode = true;
        checkMode(this.autoMode);
        registerItemType(type, layoutResId);
        return this;
    }

    private final void checkMode(boolean mode) {
        if (!(!mode)) {
            throw new java.lang.IllegalArgumentException("Don't mess two register mode".toString());
        }
    }
}
