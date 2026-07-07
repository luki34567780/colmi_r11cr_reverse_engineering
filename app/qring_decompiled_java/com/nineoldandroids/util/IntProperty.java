package com.nineoldandroids.util;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class IntProperty<T> extends com.nineoldandroids.util.Property<T, java.lang.Integer> {
    public abstract void setValue(T t, int i);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.nineoldandroids.util.Property
    public /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Integer num) {
        set2((com.nineoldandroids.util.IntProperty<T>) obj, num);
    }

    public IntProperty(java.lang.String str) {
        super(java.lang.Integer.class, str);
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public final void set2(T t, java.lang.Integer num) {
        set2((com.nineoldandroids.util.IntProperty<T>) t, java.lang.Integer.valueOf(num.intValue()));
    }
}
