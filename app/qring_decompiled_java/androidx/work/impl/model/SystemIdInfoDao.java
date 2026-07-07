package androidx.work.impl.model;

/* loaded from: classes.dex */
public interface SystemIdInfoDao {
    androidx.work.impl.model.SystemIdInfo getSystemIdInfo(java.lang.String workSpecId);

    java.util.List<java.lang.String> getWorkSpecIds();

    void insertSystemIdInfo(androidx.work.impl.model.SystemIdInfo systemIdInfo);

    void removeSystemIdInfo(java.lang.String workSpecId);
}
