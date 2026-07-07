package androidx.work.impl.model;

/* loaded from: classes.dex */
public interface WorkNameDao {
    java.util.List<java.lang.String> getNamesForWorkSpecId(java.lang.String workSpecId);

    java.util.List<java.lang.String> getWorkSpecIdsWithName(java.lang.String name);

    void insert(androidx.work.impl.model.WorkName workName);
}
