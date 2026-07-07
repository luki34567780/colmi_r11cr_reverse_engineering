package com.amap.api.col.p0003sl;

/* compiled from: OfflineListAdapter.java */
/* loaded from: classes.dex */
public final class er extends android.widget.BaseExpandableListAdapter implements android.widget.ExpandableListView.OnGroupCollapseListener, android.widget.ExpandableListView.OnGroupExpandListener {
    private boolean[] a;
    private int b = -1;
    private java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> c;
    private com.amap.api.maps.offlinemap.OfflineMapManager d;
    private android.content.Context e;

    @Override // android.widget.ExpandableListAdapter
    public final java.lang.Object getChild(int i, int i2) {
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public er(java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> list, com.amap.api.maps.offlinemap.OfflineMapManager offlineMapManager, android.content.Context context) {
        this.c = null;
        this.c = list;
        this.d = offlineMapManager;
        this.e = context;
        this.a = new boolean[list.size()];
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        int i = this.b;
        return i == -1 ? this.c.size() : i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final java.lang.Object getGroup(int i) {
        return this.c.get(i).getProvinceName();
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        if (a(i)) {
            return this.c.get(i).getCityList().size();
        }
        return this.c.get(i).getCityList().size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final android.view.View getGroupView(int i, boolean z, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = (android.widget.RelativeLayout) com.amap.api.col.p0003sl.ez.a(this.e, com.qcwireless.ring.R.array.lunar_str);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.qcwireless.ring.R.dimen.abc_alert_dialog_button_dimen);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.qcwireless.ring.R.dimen.abc_button_inset_horizontal_material);
        textView.setText(this.c.get(i).getProvinceName());
        if (this.a[i]) {
            imageView.setImageDrawable(com.amap.api.col.p0003sl.ez.a().getDrawable(com.qcwireless.ring.R.animator.fragment_close_enter));
        } else {
            imageView.setImageDrawable(com.amap.api.col.p0003sl.ez.a().getDrawable(com.qcwireless.ring.R.animator.fragment_close_exit));
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final android.view.View getChildView(int i, int i2, boolean z, android.view.View view, android.view.ViewGroup viewGroup) {
        com.amap.api.col.3sl.er.a aVar;
        if (view != null) {
            aVar = (com.amap.api.col.3sl.er.a) view.getTag();
        } else {
            aVar = new com.amap.api.col.3sl.er.a();
            com.amap.api.col.p0003sl.ev evVar = new com.amap.api.col.p0003sl.ev(this.e, this.d);
            evVar.a(1);
            android.view.View a2 = evVar.a();
            aVar.a = evVar;
            a2.setTag(aVar);
            view = a2;
        }
        aVar.a.a(this.c.get(i).getCityList().get(i2));
        return view;
    }

    private boolean a(int i) {
        return (i == 0 || i == getGroupCount() - 1) ? false : true;
    }

    public final void a() {
        this.b = -1;
        notifyDataSetChanged();
    }

    public final void b() {
        this.b = 0;
        notifyDataSetChanged();
    }

    /* compiled from: OfflineListAdapter.java */
    public final class a {
        public com.amap.api.col.p0003sl.ev a;

        public a() {
        }
    }

    @Override // android.widget.ExpandableListView.OnGroupCollapseListener
    public final void onGroupCollapse(int i) {
        this.a[i] = false;
    }

    @Override // android.widget.ExpandableListView.OnGroupExpandListener
    public final void onGroupExpand(int i) {
        this.a[i] = true;
    }
}
