package com.amap.api.col.p0003sl;

/* compiled from: SearchListAdapter.java */
/* loaded from: classes.dex */
public final class es extends android.widget.BaseAdapter {
    private java.util.List<com.amap.api.maps.offlinemap.OfflineMapCity> a = new java.util.ArrayList();
    private com.amap.api.maps.offlinemap.OfflineMapManager b;
    private android.app.Activity c;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public es(com.amap.api.maps.offlinemap.OfflineMapManager offlineMapManager, com.amap.api.maps.offlinemap.OfflineMapActivity offlineMapActivity) {
        this.b = offlineMapManager;
        this.c = offlineMapActivity;
    }

    public final void a(java.util.List<com.amap.api.maps.offlinemap.OfflineMapCity> list) {
        this.a = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        final com.amap.api.col.3sl.es.a aVar;
        int state;
        try {
            final com.amap.api.maps.offlinemap.OfflineMapCity offlineMapCity = this.a.get(i);
            if (view == null) {
                aVar = new com.amap.api.col.3sl.es.a();
                view = com.amap.api.col.p0003sl.ez.a(this.c, com.qcwireless.ring.R.array.lunar_first_of_month);
                aVar.a = (android.widget.TextView) view.findViewById(com.qcwireless.ring.R.dimen.abc_action_bar_subtitle_bottom_margin_material);
                aVar.b = (android.widget.TextView) view.findViewById(com.qcwireless.ring.R.dimen.abc_action_button_min_width_overflow_material);
                aVar.c = (android.widget.TextView) view.findViewById(com.qcwireless.ring.R.dimen.abc_action_button_min_height_material);
                aVar.d = (android.widget.ImageView) view.findViewById(com.qcwireless.ring.R.dimen.abc_action_button_min_width_material);
                view.setTag(aVar);
            } else {
                aVar = (com.amap.api.col.3sl.es.a) view.getTag();
            }
            aVar.d.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.amap.api.col.3sl.es.1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    aVar.d.setVisibility(8);
                    aVar.c.setVisibility(0);
                    aVar.c.setText("下载中");
                    try {
                        com.amap.api.col.p0003sl.es.this.b.downloadByCityName(offlineMapCity.getCity());
                    } catch (com.amap.api.maps.AMapException e) {
                        e.printStackTrace();
                    }
                }
            });
            aVar.c.setVisibility(0);
            aVar.a.setText(offlineMapCity.getCity());
            android.widget.TextView textView = aVar.b;
            textView.setText(java.lang.String.valueOf(((int) (((offlineMapCity.getSize() / 1024.0d) / 1024.0d) * 100.0d)) / 100.0d) + " M");
            state = offlineMapCity.getState();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (state != -1) {
            if (state == 0 || state == 1) {
                aVar.d.setVisibility(8);
                aVar.c.setText("下载中");
            } else if (state == 2) {
                aVar.d.setVisibility(8);
                aVar.c.setText("等待下载");
            } else if (state == 3) {
                aVar.d.setVisibility(8);
                aVar.c.setText("暂停中");
            } else if (state == 4) {
                aVar.d.setVisibility(8);
                aVar.c.setText("已下载");
            } else if (state != 6) {
                switch (state) {
                }
            } else {
                aVar.d.setVisibility(0);
                aVar.c.setVisibility(8);
            }
            return view;
        }
        aVar.d.setVisibility(8);
        aVar.c.setText("下载失败");
        return view;
    }

    /* compiled from: SearchListAdapter.java */
    public final class a {
        public android.widget.TextView a;
        public android.widget.TextView b;
        public android.widget.TextView c;
        public android.widget.ImageView d;

        public a() {
        }
    }
}
