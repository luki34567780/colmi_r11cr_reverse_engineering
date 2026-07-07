package androidx.camera.core.impl;

/* loaded from: classes.dex */
public abstract class MultiValueSet<C> {
    private java.util.Set<C> mSet = new java.util.HashSet();

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract androidx.camera.core.impl.MultiValueSet<C> mo2clone();

    public void addAll(java.util.List<C> value) {
        this.mSet.addAll(value);
    }

    public java.util.List<C> getAllItems() {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(this.mSet));
    }
}
