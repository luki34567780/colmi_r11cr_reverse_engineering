package androidx.camera.core.impl;

/* loaded from: classes.dex */
public class Quirks {
    private final java.util.List<androidx.camera.core.impl.Quirk> mQuirks;

    public Quirks(final java.util.List<androidx.camera.core.impl.Quirk> quirks) {
        this.mQuirks = new java.util.ArrayList(quirks);
    }

    public <T extends androidx.camera.core.impl.Quirk> T get(final java.lang.Class<T> quirkClass) {
        java.util.Iterator<androidx.camera.core.impl.Quirk> it = this.mQuirks.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == quirkClass) {
                return t;
            }
        }
        return null;
    }

    public boolean contains(java.lang.Class<? extends androidx.camera.core.impl.Quirk> quirkClass) {
        java.util.Iterator<androidx.camera.core.impl.Quirk> it = this.mQuirks.iterator();
        while (it.hasNext()) {
            if (quirkClass.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }
}
