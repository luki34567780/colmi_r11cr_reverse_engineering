package com.qcwireless.qcwatch.ui.home.sport.bean;

/* loaded from: /tmp/dex/classes2.dex */
public class DataListTree<K, V> {
    private K mGroupItem;
    private java.util.List<V> mSubItem;

    public DataListTree(K groupItem, java.util.List<V> subItem) {
        this.mGroupItem = groupItem;
        this.mSubItem = subItem;
    }

    public K getGroupItem() {
        return this.mGroupItem;
    }

    public java.util.List<V> getSubItem() {
        return this.mSubItem;
    }
}
