package androidx.work.impl.model;

/* loaded from: classes.dex */
public class Dependency {
    public final java.lang.String prerequisiteId;
    public final java.lang.String workSpecId;

    public Dependency(java.lang.String workSpecId, java.lang.String prerequisiteId) {
        this.workSpecId = workSpecId;
        this.prerequisiteId = prerequisiteId;
    }
}
