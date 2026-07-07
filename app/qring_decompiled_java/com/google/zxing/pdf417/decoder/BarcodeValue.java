package com.google.zxing.pdf417.decoder;

/* loaded from: /tmp/dex/classes2.dex */
final class BarcodeValue {
    private final java.util.Map<java.lang.Integer, java.lang.Integer> values = new java.util.HashMap();

    BarcodeValue() {
    }

    void setValue(int i) {
        java.lang.Integer num = this.values.get(java.lang.Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.values.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(num.intValue() + 1));
    }

    int[] getValue() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = -1;
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : this.values.entrySet()) {
            if (entry.getValue().intValue() > i) {
                i = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return com.google.zxing.pdf417.PDF417Common.toIntArray(arrayList);
    }

    java.lang.Integer getConfidence(int i) {
        return this.values.get(java.lang.Integer.valueOf(i));
    }
}
