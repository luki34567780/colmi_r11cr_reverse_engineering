package androidx.work.impl.model;

/* loaded from: classes.dex */
public interface WorkTagDao {
    java.util.List<java.lang.String> getTagsForWorkSpecId(java.lang.String id);

    java.util.List<java.lang.String> getWorkSpecIdsWithTag(java.lang.String tag);

    void insert(androidx.work.impl.model.WorkTag workTag);
}
