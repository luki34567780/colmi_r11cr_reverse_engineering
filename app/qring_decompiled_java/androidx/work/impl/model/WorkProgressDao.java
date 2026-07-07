package androidx.work.impl.model;

/* loaded from: classes.dex */
public interface WorkProgressDao {
    void delete(java.lang.String workSpecId);

    void deleteAll();

    androidx.work.Data getProgressForWorkSpecId(java.lang.String workSpecId);

    java.util.List<androidx.work.Data> getProgressForWorkSpecIds(java.util.List<java.lang.String> workSpecIds);

    void insert(androidx.work.impl.model.WorkProgress progress);
}
