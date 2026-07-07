package io.reactivex.internal.util;

/* loaded from: classes3.dex */
public class LinkedArrayList {
    final int capacityHint;
    java.lang.Object[] head;
    int indexInTail;
    volatile int size;
    java.lang.Object[] tail;

    public LinkedArrayList(int i) {
        this.capacityHint = i;
    }

    public void add(java.lang.Object obj) {
        if (this.size == 0) {
            java.lang.Object[] objArr = new java.lang.Object[this.capacityHint + 1];
            this.head = objArr;
            this.tail = objArr;
            objArr[0] = obj;
            this.indexInTail = 1;
            this.size = 1;
            return;
        }
        int i = this.indexInTail;
        int i2 = this.capacityHint;
        if (i == i2) {
            java.lang.Object[] objArr2 = new java.lang.Object[i2 + 1];
            objArr2[0] = obj;
            this.tail[i2] = objArr2;
            this.tail = objArr2;
            this.indexInTail = 1;
            this.size++;
            return;
        }
        this.tail[i] = obj;
        this.indexInTail = i + 1;
        this.size++;
    }

    public java.lang.Object[] head() {
        return this.head;
    }

    public int size() {
        return this.size;
    }

    public java.lang.String toString() {
        int i = this.capacityHint;
        int i2 = this.size;
        java.util.ArrayList arrayList = new java.util.ArrayList(i2 + 1);
        java.lang.Object[] head = head();
        int i3 = 0;
        while (true) {
            int i4 = 0;
            while (i3 < i2) {
                arrayList.add(head[i4]);
                i3++;
                i4++;
                if (i4 == i) {
                    break;
                }
            }
            return arrayList.toString();
            head = head[i];
        }
    }
}
