package com.qcwireless.qcwatch.databinding;

/* loaded from: /tmp/dex/classes2.dex */
public final class RecycleviewItemSkinBinding implements androidx.viewbinding.ViewBinding {
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final com.qcwireless.qcwatch.ui.base.view.skin.QSkinItemView skinItem;

    private RecycleviewItemSkinBinding(androidx.constraintlayout.widget.ConstraintLayout rootView, com.qcwireless.qcwatch.ui.base.view.skin.QSkinItemView skinItem) {
        this.rootView = rootView;
        this.skinItem = skinItem;
    }

    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemSkinBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemSkinBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup parent, boolean attachToParent) {
        android.view.View inflate = inflater.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_skin, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static com.qcwireless.qcwatch.databinding.RecycleviewItemSkinBinding bind(android.view.View rootView) {
        com.qcwireless.qcwatch.ui.base.view.skin.QSkinItemView qSkinItemView = (com.qcwireless.qcwatch.ui.base.view.skin.QSkinItemView) androidx.viewbinding.ViewBindings.findChildViewById(rootView, com.qcwireless.qcwatch.R.id.skin_item);
        if (qSkinItemView != null) {
            return new com.qcwireless.qcwatch.databinding.RecycleviewItemSkinBinding((androidx.constraintlayout.widget.ConstraintLayout) rootView, qSkinItemView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(com.qcwireless.qcwatch.R.id.skin_item)));
    }
}
