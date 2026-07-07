package com.qcwireless.qcwatch.ui.base.util;

/* loaded from: /tmp/dex/classes2.dex */
public class MapUtils {
    public static java.util.Map<java.lang.String, java.lang.Integer> sortMapByValue(java.util.Map<java.lang.String, java.lang.Integer> oriMap) {
        if (oriMap == null || oriMap.isEmpty()) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList<java.util.Map.Entry> arrayList = new java.util.ArrayList(oriMap.entrySet());
        java.util.Collections.sort(arrayList, new com.qcwireless.qcwatch.ui.base.util.MapUtils.MapValueComparator());
        for (java.util.Map.Entry entry : arrayList) {
            linkedHashMap.put((java.lang.String) entry.getKey(), (java.lang.Integer) entry.getValue());
        }
        return linkedHashMap;
    }

    static class MapValueComparator implements java.util.Comparator<java.util.Map.Entry<java.lang.String, java.lang.Integer>> {
        MapValueComparator() {
        }

        @Override // java.util.Comparator
        public int compare(java.util.Map.Entry<java.lang.String, java.lang.Integer> me1, java.util.Map.Entry<java.lang.String, java.lang.Integer> me2) {
            return me2.getValue().compareTo(me1.getValue());
        }
    }
}
