package com.amap.api.col.p0003sl;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AutoCompleteTextView;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.amap.api.maps.offlinemap.DownLoadExpandListView;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.amap.api.offlineservice.a;
import com.qcwireless.ring.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: OfflineMapPage.java */
/* loaded from: classes.dex */
public final class ex extends a implements TextWatcher, View.OnTouchListener, AbsListView.OnScrollListener, OfflineMapManager.OfflineLoadedListener, OfflineMapManager.OfflineMapDownloadListener {
    private ImageView b;
    private RelativeLayout c;
    private DownLoadExpandListView d;
    private ListView e;
    private ExpandableListView f;
    private ImageView g;
    private ImageView h;
    private AutoCompleteTextView i;
    private RelativeLayout j;
    private RelativeLayout k;
    private ImageView l;
    private ImageView m;
    private RelativeLayout n;
    private er p;
    private eq r;
    private es s;
    private et x;
    private List<OfflineMapProvince> o = new ArrayList();
    private OfflineMapManager q = null;
    private boolean t = true;
    private boolean u = true;
    private int v = -1;
    private long w = 0;
    private boolean y = true;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onCheckUpdate(boolean z, String str) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // com.amap.api.offlineservice.a
    public final void b() {
        View a = ez.a(this.a, R.array.branch_integer_array);
        DownLoadExpandListView downLoadExpandListView = (DownLoadExpandListView) a.findViewById(R.dimen.abc_action_bar_default_padding_end_material);
        this.d = downLoadExpandListView;
        downLoadExpandListView.setOnTouchListener(this);
        this.j = (RelativeLayout) a.findViewById(R.dimen.abc_action_bar_content_inset_material);
        this.g = (ImageView) a.findViewById(R.dimen.abc_action_bar_default_height_material);
        this.j.setOnClickListener(this.a);
        this.k = (RelativeLayout) a.findViewById(R.dimen.abc_action_bar_elevation_material);
        this.h = (ImageView) a.findViewById(R.dimen.abc_action_bar_icon_vertical_padding_material);
        this.k.setOnClickListener(this.a);
        this.n = (RelativeLayout) a.findViewById(R.dimen.abc_action_bar_default_padding_start_material);
        ImageView imageView = (ImageView) this.c.findViewById(R.dimen.abc_button_padding_vertical_material);
        this.b = imageView;
        imageView.setOnClickListener(this.a);
        this.m = (ImageView) this.c.findViewById(R.dimen.abc_config_prefDialogWidth);
        ImageView imageView2 = (ImageView) this.c.findViewById(R.dimen.abc_control_inset_material);
        this.l = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.amap.api.col.3sl.ex.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    ex.this.i.setText("");
                    ex.this.l.setVisibility(8);
                    ex.this.a(false);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ex.this.m.getLayoutParams();
                    layoutParams.leftMargin = ex.this.a(95.0f);
                    ex.this.m.setLayoutParams(layoutParams);
                    ex.this.i.setPadding(ex.this.a(105.0f), 0, 0, 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.c.findViewById(R.dimen.abc_control_padding_material).setOnTouchListener(this);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.c.findViewById(R.dimen.abc_control_corner_material);
        this.i = autoCompleteTextView;
        autoCompleteTextView.addTextChangedListener(this);
        this.i.setOnTouchListener(this);
        this.e = (ListView) this.c.findViewById(R.dimen.abc_dialog_fixed_height_major);
        ExpandableListView expandableListView = (ExpandableListView) this.c.findViewById(R.dimen.abc_dialog_corner_radius_material);
        this.f = expandableListView;
        expandableListView.addHeaderView(a);
        this.f.setOnTouchListener(this);
        this.f.setOnScrollListener(this);
        try {
            OfflineMapManager offlineMapManager = new OfflineMapManager(this.a, this);
            this.q = offlineMapManager;
            offlineMapManager.setOnOfflineLoadedListener(this);
        } catch (Exception e) {
            Log.e("OfflineMapPage", "e=".concat(String.valueOf(e)));
        }
        i();
        er erVar = new er(this.o, this.q, this.a);
        this.p = erVar;
        this.f.setAdapter(erVar);
        this.f.setOnGroupCollapseListener(this.p);
        this.f.setOnGroupExpandListener(this.p);
        this.f.setGroupIndicator(null);
        if (this.t) {
            this.h.setBackgroundResource(R.animator.design_appbar_state_list_animator);
            this.f.setVisibility(0);
        } else {
            this.h.setBackgroundResource(R.animator.focus_outer);
            this.f.setVisibility(8);
        }
        if (this.u) {
            this.g.setBackgroundResource(R.animator.design_appbar_state_list_animator);
            this.d.setVisibility(0);
        } else {
            this.g.setBackgroundResource(R.animator.focus_outer);
            this.d.setVisibility(8);
        }
    }

    private void f() {
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
            layoutParams.leftMargin = a(18.0f);
            this.m.setLayoutParams(layoutParams);
            this.i.setPadding(a(30.0f), 0, 0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.offlineservice.a
    public final void a(View view) {
        try {
            int id = view.getId();
            if (id == R.dimen.abc_button_padding_vertical_material) {
                this.a.closeScr();
                return;
            }
            if (id == R.dimen.abc_action_bar_content_inset_material) {
                if (this.u) {
                    this.d.setVisibility(8);
                    this.g.setBackgroundResource(R.animator.focus_outer);
                    this.u = false;
                    return;
                } else {
                    this.d.setVisibility(0);
                    this.g.setBackgroundResource(R.animator.design_appbar_state_list_animator);
                    this.u = true;
                    return;
                }
            }
            if (id == R.dimen.abc_action_bar_elevation_material) {
                if (this.t) {
                    this.p.b();
                    this.h.setBackgroundResource(R.animator.focus_outer);
                    this.t = false;
                } else {
                    this.p.a();
                    this.h.setBackgroundResource(R.animator.design_appbar_state_list_animator);
                    this.t = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.offlineservice.a
    public final RelativeLayout d() {
        if (this.c == null) {
            this.c = (RelativeLayout) ez.a(this.a, R.array.month_string_array);
        }
        return this.c;
    }

    @Override // com.amap.api.offlineservice.a
    public final void e() {
        this.q.destroy();
    }

    private void g() {
        i();
        es esVar = new es(this.q, this.a);
        this.s = esVar;
        this.e.setAdapter((ListAdapter) esVar);
    }

    private void h() {
        eq eqVar = new eq(this.a, this, this.q, this.o);
        this.r = eqVar;
        this.d.setAdapter(eqVar);
        this.r.notifyDataSetChanged();
    }

    public final void a(OfflineMapCity offlineMapCity) {
        try {
            if (this.x == null) {
                this.x = new et(this.a, this.q);
            }
            this.x.a(offlineMapCity.getState(), offlineMapCity.getCity());
            this.x.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void i() {
        ArrayList<OfflineMapProvince> offlineMapProvinceList = this.q.getOfflineMapProvinceList();
        this.o.clear();
        this.o.add(null);
        ArrayList<OfflineMapCity> arrayList = new ArrayList<>();
        ArrayList<OfflineMapCity> arrayList2 = new ArrayList<>();
        ArrayList<OfflineMapCity> arrayList3 = new ArrayList<>();
        for (int i = 0; i < offlineMapProvinceList.size(); i++) {
            OfflineMapProvince offlineMapProvince = offlineMapProvinceList.get(i);
            if (offlineMapProvince.getCityList().size() != 1) {
                this.o.add(i + 1, offlineMapProvince);
            } else {
                String provinceName = offlineMapProvince.getProvinceName();
                if (provinceName.contains("香港")) {
                    arrayList2.addAll(offlineMapProvince.getCityList());
                } else if (provinceName.contains("澳门")) {
                    arrayList2.addAll(offlineMapProvince.getCityList());
                } else if (provinceName.contains("全国概要图")) {
                    arrayList3.addAll(0, offlineMapProvince.getCityList());
                } else {
                    arrayList3.addAll(offlineMapProvince.getCityList());
                }
            }
        }
        OfflineMapProvince offlineMapProvince2 = new OfflineMapProvince();
        offlineMapProvince2.setProvinceName("基本功能包+直辖市");
        offlineMapProvince2.setCityList(arrayList3);
        this.o.set(0, offlineMapProvince2);
        OfflineMapProvince offlineMapProvince3 = new OfflineMapProvince();
        offlineMapProvince3.setProvinceName("直辖市");
        offlineMapProvince3.setCityList(arrayList);
        OfflineMapProvince offlineMapProvince4 = new OfflineMapProvince();
        offlineMapProvince4.setProvinceName("港澳");
        offlineMapProvince4.setCityList(arrayList2);
        this.o.add(offlineMapProvince4);
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onDownload(int i, int i2, String str) {
        if (i == 101) {
            try {
                Toast.makeText(this.a, "网络异常", 0).show();
                this.q.pause();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (i == 2) {
            this.r.a();
        }
        if (this.v == i) {
            if (System.currentTimeMillis() - this.w > 1200) {
                if (this.y) {
                    this.r.notifyDataSetChanged();
                }
                this.w = System.currentTimeMillis();
                return;
            }
            return;
        }
        er erVar = this.p;
        if (erVar != null) {
            erVar.notifyDataSetChanged();
        }
        eq eqVar = this.r;
        if (eqVar != null) {
            eqVar.notifyDataSetChanged();
        }
        es esVar = this.s;
        if (esVar != null) {
            esVar.notifyDataSetChanged();
        }
        this.v = i;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public final void onRemove(boolean z, String str, String str2) {
        eq eqVar = this.r;
        if (eqVar != null) {
            eqVar.b();
        }
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener
    public final void onVerifyComplete() {
        g();
        h();
    }

    @Override // com.amap.api.offlineservice.a
    public final boolean c() {
        try {
            if (this.e.getVisibility() == 0) {
                this.i.setText("");
                this.l.setVisibility(8);
                a(false);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.c();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j();
        if (view.getId() != R.dimen.abc_control_corner_material) {
            return false;
        }
        f();
        return false;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(charSequence)) {
            a(false);
            this.l.setVisibility(8);
            return;
        }
        this.l.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        List<OfflineMapProvince> list = this.o;
        if (list != null && list.size() > 0) {
            ArrayList<OfflineMapCity> arrayList2 = new ArrayList();
            Iterator<OfflineMapProvince> it = this.o.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next().getCityList());
            }
            for (OfflineMapCity offlineMapCity : arrayList2) {
                String city = offlineMapCity.getCity();
                String pinyin = offlineMapCity.getPinyin();
                String jianpin = offlineMapCity.getJianpin();
                if (charSequence.length() == 1) {
                    if (jianpin.startsWith(String.valueOf(charSequence))) {
                        arrayList.add(offlineMapCity);
                    }
                } else if (jianpin.startsWith(String.valueOf(charSequence)) || pinyin.startsWith(String.valueOf(charSequence)) || city.startsWith(String.valueOf(charSequence))) {
                    arrayList.add(offlineMapCity);
                }
            }
        }
        if (arrayList.size() > 0) {
            a(true);
            Collections.sort(arrayList, new Comparator<OfflineMapCity>() { // from class: com.amap.api.col.3sl.ex.2
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(OfflineMapCity offlineMapCity2, OfflineMapCity offlineMapCity3) {
                    return a(offlineMapCity2, offlineMapCity3);
                }

                private static int a(OfflineMapCity offlineMapCity2, OfflineMapCity offlineMapCity3) {
                    char[] charArray = offlineMapCity2.getJianpin().toCharArray();
                    char[] charArray2 = offlineMapCity3.getJianpin().toCharArray();
                    return (charArray[0] >= charArray2[0] && charArray[1] >= charArray2[1]) ? 0 : 1;
                }
            });
            es esVar = this.s;
            if (esVar != null) {
                esVar.a(arrayList);
                this.s.notifyDataSetChanged();
                return;
            }
            return;
        }
        Toast.makeText(this.a, "未找到相关城市", 0).show();
    }

    public final void a(boolean z) {
        if (z) {
            this.j.setVisibility(8);
            this.k.setVisibility(8);
            this.d.setVisibility(8);
            this.f.setVisibility(8);
            this.n.setVisibility(8);
            this.e.setVisibility(0);
            return;
        }
        this.j.setVisibility(0);
        this.k.setVisibility(0);
        this.n.setVisibility(0);
        this.d.setVisibility(this.u ? 0 : 8);
        this.f.setVisibility(this.t ? 0 : 8);
        this.e.setVisibility(8);
    }

    private void j() {
        AutoCompleteTextView autoCompleteTextView = this.i;
        if (autoCompleteTextView == null || !autoCompleteTextView.isFocused()) {
            return;
        }
        this.i.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
        if (inputMethodManager != null ? inputMethodManager.isActive() : false) {
            inputMethodManager.hideSoftInputFromWindow(this.i.getWindowToken(), 2);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 2) {
            this.y = false;
        } else {
            this.y = true;
        }
    }
}
