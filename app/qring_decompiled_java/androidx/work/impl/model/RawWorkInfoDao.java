package androidx.work.impl.model;

/* loaded from: classes.dex */
public interface RawWorkInfoDao {
    java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkInfoPojos(androidx.sqlite.db.SupportSQLiteQuery query);

    androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(androidx.sqlite.db.SupportSQLiteQuery query);
}
