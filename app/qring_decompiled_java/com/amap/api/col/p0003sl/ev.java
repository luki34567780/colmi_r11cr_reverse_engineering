package com.amap.api.col.p0003sl;

/* compiled from: OfflineChild.java */
/* loaded from: classes.dex */
public final class ev implements android.view.View.OnClickListener {
    private android.content.Context b;
    private android.widget.TextView c;
    private android.widget.TextView d;
    private android.widget.ImageView e;
    private android.widget.TextView f;
    private com.amap.api.maps.offlinemap.OfflineMapManager g;
    private com.amap.api.maps.offlinemap.OfflineMapCity h;
    private android.view.View k;
    private com.amap.api.maps.offlinemap.DownloadProgressView l;
    private int a = 0;
    private boolean i = false;
    private android.os.Handler j = new android.os.Handler() { // from class: com.amap.api.col.3sl.ev.1
        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            super.handleMessage(message);
            try {
                com.amap.api.col.p0003sl.ev.this.a(message.arg1, message.arg2);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) throws java.lang.Exception {
        if (this.a == 2 && i2 > 3 && i2 < 100) {
            this.l.setVisibility(0);
            this.l.setProgress(i2);
        } else {
            this.l.setVisibility(8);
        }
        if (i == -1) {
            f();
            return;
        }
        if (i == 0) {
            if (this.a == 1) {
                this.e.setVisibility(8);
                this.f.setText("下载中");
                this.f.setTextColor(android.graphics.Color.parseColor("#4287ff"));
                return;
            }
            j();
            return;
        }
        if (i == 1) {
            i();
            return;
        }
        if (i == 2) {
            e();
            return;
        }
        if (i == 3) {
            g();
            return;
        }
        if (i == 4) {
            h();
            return;
        }
        if (i == 6) {
            c();
        } else {
            if (i != 7) {
                switch (i) {
                    case 101:
                    case 102:
                    case 103:
                        f();
                        break;
                }
                return;
            }
            d();
        }
    }

    public ev(android.content.Context context, com.amap.api.maps.offlinemap.OfflineMapManager offlineMapManager) {
        this.b = context;
        b();
        this.g = offlineMapManager;
    }

    public final void a(int i) {
        this.a = i;
    }

    public final android.view.View a() {
        return this.k;
    }

    private void b() {
        android.view.View a = com.amap.api.col.p0003sl.ez.a(this.b, com.qcwireless.ring.R.array.lunar_first_of_month);
        this.k = a;
        this.l = (com.amap.api.maps.offlinemap.DownloadProgressView) a.findViewById(com.qcwireless.ring.R.dimen.abc_alert_dialog_button_bar_height);
        this.c = (android.widget.TextView) this.k.findViewById(com.qcwireless.ring.R.dimen.abc_action_bar_subtitle_bottom_margin_material);
        this.d = (android.widget.TextView) this.k.findViewById(com.qcwireless.ring.R.dimen.abc_action_button_min_width_overflow_material);
        this.e = (android.widget.ImageView) this.k.findViewById(com.qcwireless.ring.R.dimen.abc_action_button_min_width_material);
        this.f = (android.widget.TextView) this.k.findViewById(com.qcwireless.ring.R.dimen.abc_action_button_min_height_material);
        this.e.setOnClickListener(this);
    }

    public final void a(com.amap.api.maps.offlinemap.OfflineMapCity offlineMapCity) {
        if (offlineMapCity != null) {
            this.h = offlineMapCity;
            this.c.setText(offlineMapCity.getCity());
            double size = ((int) (((offlineMapCity.getSize() / 1024.0d) / 1024.0d) * 100.0d)) / 100.0d;
            this.d.setText(java.lang.String.valueOf(size) + " M");
            b(this.h.getState(), this.h.getcompleteCode());
        }
    }

    private void b(int i, int i2) {
        com.amap.api.maps.offlinemap.OfflineMapCity offlineMapCity = this.h;
        if (offlineMapCity != null) {
            offlineMapCity.setState(i);
            this.h.setCompleteCode(i2);
        }
        android.os.Message message = new android.os.Message();
        message.arg1 = i;
        message.arg2 = i2;
        this.j.sendMessage(message);
    }

    private void c() {
        this.f.setVisibility(8);
        this.e.setVisibility(0);
        this.e.setImageResource(com.qcwireless.ring.R.animator.design_fab_show_motion_spec);
    }

    private void d() {
        this.f.setVisibility(0);
        this.e.setVisibility(0);
        this.e.setImageResource(com.qcwireless.ring.R.animator.design_fab_show_motion_spec);
        this.f.setText("已下载-有更新");
    }

    private void e() {
        if (this.a == 1) {
            this.e.setVisibility(8);
            this.f.setVisibility(0);
            this.f.setText("等待中");
            this.f.setTextColor(android.graphics.Color.parseColor("#4287ff"));
            return;
        }
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setTextColor(android.graphics.Color.parseColor("#4287ff"));
        this.f.setText("等待中");
    }

    private void f() {
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setTextColor(androidx.core.internal.view.SupportMenu.CATEGORY_MASK);
        this.f.setText("下载出现异常");
    }

    private void g() {
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setTextColor(-7829368);
        this.f.setText("暂停");
    }

    private void h() {
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setText("已下载");
        this.f.setTextColor(android.graphics.Color.parseColor("#898989"));
    }

    private void i() {
        if (this.a == 1) {
            return;
        }
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setText("解压中");
        this.f.setTextColor(android.graphics.Color.parseColor("#898989"));
    }

    private void j() {
        if (this.h == null) {
            return;
        }
        this.f.setVisibility(0);
        this.f.setText("下载中");
        this.e.setVisibility(8);
        this.f.setTextColor(android.graphics.Color.parseColor("#4287ff"));
    }

    private synchronized void k() {
        this.g.pause();
        this.g.restart();
    }

    private synchronized boolean l() {
        try {
            this.g.downloadByCityName(this.h.getCity());
        } catch (com.amap.api.maps.AMapException e) {
            e.printStackTrace();
            android.widget.Toast.makeText(this.b, e.getErrorMessage(), 0).show();
            return false;
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        try {
            if (!com.amap.api.col.p0003sl.dx.d(this.b)) {
                android.widget.Toast.makeText(this.b, "无网络连接", 0).show();
                return;
            }
            com.amap.api.maps.offlinemap.OfflineMapCity offlineMapCity = this.h;
            if (offlineMapCity != null) {
                int state = offlineMapCity.getState();
                this.h.getcompleteCode();
                if (state == 0) {
                    k();
                    g();
                } else {
                    if (state == 1 || state == 4) {
                        return;
                    }
                    if (l()) {
                        e();
                    } else {
                        f();
                    }
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
