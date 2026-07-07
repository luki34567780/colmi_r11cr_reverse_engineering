package com.qcwireless.qcwatch.ui.plate.adapter;

/* compiled from: MyFragmentStateAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/adapter/MyFragmentStateAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "list", "", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V", "createFragment", "position", "", "getItemCount", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MyFragmentStateAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    private final java.util.List<androidx.fragment.app.Fragment> list;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyFragmentStateAdapter(androidx.fragment.app.FragmentActivity fragmentActivity, java.util.List<? extends androidx.fragment.app.Fragment> list) {
        super(fragmentActivity);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    public androidx.fragment.app.Fragment createFragment(int position) {
        return this.list.get(position);
    }

    public int getItemCount() {
        return this.list.size();
    }
}
