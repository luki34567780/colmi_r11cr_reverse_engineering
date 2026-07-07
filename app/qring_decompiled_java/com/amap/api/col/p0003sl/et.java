package com.amap.api.col.p0003sl;

/* compiled from: BottomDialog.java */
/* loaded from: classes.dex */
public final class et extends com.amap.api.col.p0003sl.eu implements android.view.View.OnClickListener {
    private com.amap.api.maps.offlinemap.OfflineMapManager a;
    private android.view.View b;
    private android.widget.TextView c;
    private android.widget.TextView d;
    private android.widget.TextView e;
    private android.widget.TextView f;
    private int g;
    private java.lang.String h;

    public et(android.content.Context context, com.amap.api.maps.offlinemap.OfflineMapManager offlineMapManager) {
        super(context);
        this.a = offlineMapManager;
    }

    @Override // com.amap.api.col.p0003sl.eu
    protected final void a() {
        android.view.View a = com.amap.api.col.p0003sl.ez.a(getContext(), com.qcwireless.ring.R.array.branch_string_array);
        this.b = a;
        setContentView(a);
        this.b.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.amap.api.col.3sl.et.1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.amap.api.col.p0003sl.et.this.dismiss();
            }
        });
        this.c = (android.widget.TextView) this.b.findViewById(com.qcwireless.ring.R.dimen.abc_action_bar_overflow_padding_end_material);
        android.widget.TextView textView = (android.widget.TextView) this.b.findViewById(com.qcwireless.ring.R.dimen.abc_action_bar_overflow_padding_start_material);
        this.d = textView;
        textView.setText("暂停下载");
        this.e = (android.widget.TextView) this.b.findViewById(com.qcwireless.ring.R.dimen.abc_action_bar_stacked_max_height);
        this.f = (android.widget.TextView) this.b.findViewById(com.qcwireless.ring.R.dimen.abc_action_bar_stacked_tab_max_width);
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
    }

    public final void a(int i, java.lang.String str) {
        this.c.setText(str);
        if (i == 0) {
            this.d.setText("暂停下载");
            this.d.setVisibility(0);
            this.e.setText("取消下载");
        }
        if (i == 2) {
            this.d.setVisibility(8);
            this.e.setText("取消下载");
        } else if (i == -1 || i == 101 || i == 102 || i == 103) {
            this.d.setText("继续下载");
            this.d.setVisibility(0);
        } else if (i == 3) {
            this.d.setVisibility(0);
            this.d.setText("继续下载");
            this.e.setText("取消下载");
        } else if (i == 4) {
            this.e.setText("删除");
            this.d.setVisibility(8);
        }
        this.g = i;
        this.h = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        try {
            int id = view.getId();
            if (id != com.qcwireless.ring.R.dimen.abc_action_bar_overflow_padding_start_material) {
                if (id != com.qcwireless.ring.R.dimen.abc_action_bar_stacked_max_height) {
                    if (id == com.qcwireless.ring.R.dimen.abc_action_bar_stacked_tab_max_width) {
                        dismiss();
                        return;
                    }
                    return;
                } else {
                    if (android.text.TextUtils.isEmpty(this.h)) {
                        return;
                    }
                    this.a.remove(this.h);
                    dismiss();
                    return;
                }
            }
            int i = this.g;
            if (i == 0) {
                this.d.setText("继续下载");
                this.a.pauseByName(this.h);
            } else if (i == 3 || i == -1 || i == 101 || i == 102 || i == 103) {
                this.d.setText("暂停下载");
                this.a.downloadByCityName(this.h);
            }
            dismiss();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
