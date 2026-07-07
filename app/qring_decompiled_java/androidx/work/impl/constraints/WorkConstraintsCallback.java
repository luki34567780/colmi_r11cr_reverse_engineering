package androidx.work.impl.constraints;

/* loaded from: classes.dex */
public interface WorkConstraintsCallback {
    void onAllConstraintsMet(java.util.List<java.lang.String> workSpecIds);

    void onAllConstraintsNotMet(java.util.List<java.lang.String> workSpecIds);
}
