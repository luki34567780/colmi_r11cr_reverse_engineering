package com.qcwireless.qcwatch.base.dialog.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class ArrayWheelAdapter<T> implements com.contrarywind.adapter.WheelAdapter {
    public static final int DEFAULT_LENGTH = 4;
    private java.util.List<T> items;
    private int length;

    public ArrayWheelAdapter(java.util.List<T> items, int length) {
        this.items = items;
        this.length = length;
    }

    public ArrayWheelAdapter(java.util.List<T> items) {
        this(items, 4);
    }

    @Override // com.contrarywind.adapter.WheelAdapter
    public java.lang.Object getItem(int index) {
        return (index < 0 || index >= this.items.size()) ? "" : this.items.get(index);
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
