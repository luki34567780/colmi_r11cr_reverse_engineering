package com.qcwireless.qcwatch.base.dialog.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class MonthArrayWheelAdapter<T> implements com.contrarywind.adapter.WheelAdapter {
    public static final int DEFAULT_LENGTH = 4;
    private java.util.List<T> items;
    private int length;
    java.util.Map<java.lang.Integer, java.lang.String> map;

    public MonthArrayWheelAdapter(java.util.List<T> items, int length) {
        this.map = new java.util.HashMap();
        this.items = items;
        this.length = length;
    }

    public MonthArrayWheelAdapter(java.util.List<T> items, java.util.Map<java.lang.Integer, java.lang.String> map) {
        this(items, 4);
        this.map = map;
    }

    @Override // com.contrarywind.adapter.WheelAdapter
    public java.lang.Object getItem(int index) {
        if (index < 0 || index >= this.items.size()) {
            return "";
        }
        if (com.qcwireless.qc_utils.date.LanguageUtil.changeDateFormat()) {
            return this.map.get(java.lang.Integer.valueOf(index + 1));
        }
        return this.items.get(index);
    }

    @Override // com.contrarywind.adapter.WheelAdapter
    public int getItemsCount() {
        return this.items.size();
    }

    @Override // com.contrarywind.adapter.WheelAdapter
    public int indexOf(java.lang.Object o) {
        return this.items.indexOf(o);
    }
}
