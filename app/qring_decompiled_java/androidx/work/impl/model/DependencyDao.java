package androidx.work.impl.model;

/* loaded from: classes.dex */
public interface DependencyDao {
    java.util.List<java.lang.String> getDependentWorkIds(java.lang.String id);

    java.util.List<java.lang.String> getPrerequisites(java.lang.String id);

    boolean hasCompletedAllPrerequisites(java.lang.String id);

    boolean hasDependents(java.lang.String id);

    void insertDependency(androidx.work.impl.model.Dependency dependency);
}
