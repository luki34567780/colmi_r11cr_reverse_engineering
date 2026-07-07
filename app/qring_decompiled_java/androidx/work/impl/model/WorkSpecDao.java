package androidx.work.impl.model;

/* loaded from: classes.dex */
public interface WorkSpecDao {
    void delete(java.lang.String id);

    java.util.List<androidx.work.impl.model.WorkSpec> getAllEligibleWorkSpecsForScheduling(int maxLimit);

    java.util.List<java.lang.String> getAllUnfinishedWork();

    java.util.List<java.lang.String> getAllWorkSpecIds();

    androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getAllWorkSpecIdsLiveData();

    java.util.List<androidx.work.impl.model.WorkSpec> getEligibleWorkForScheduling(int schedulerLimit);

    java.util.List<androidx.work.Data> getInputsFromPrerequisites(java.lang.String id);

    java.util.List<androidx.work.impl.model.WorkSpec> getRecentlyCompletedWork(long startingAt);

    java.util.List<androidx.work.impl.model.WorkSpec> getRunningWork();

    androidx.lifecycle.LiveData<java.lang.Long> getScheduleRequestedAtLiveData(java.lang.String id);

    java.util.List<androidx.work.impl.model.WorkSpec> getScheduledWork();

    androidx.work.WorkInfo.State getState(java.lang.String id);

    java.util.List<java.lang.String> getUnfinishedWorkWithName(java.lang.String name);

    java.util.List<java.lang.String> getUnfinishedWorkWithTag(java.lang.String tag);

    androidx.work.impl.model.WorkSpec getWorkSpec(java.lang.String id);

    java.util.List<androidx.work.impl.model.WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(java.lang.String name);

    androidx.work.impl.model.WorkSpec[] getWorkSpecs(java.util.List<java.lang.String> ids);

    androidx.work.impl.model.WorkSpec.WorkInfoPojo getWorkStatusPojoForId(java.lang.String id);

    java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(java.util.List<java.lang.String> ids);

    java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(java.lang.String name);

    java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(java.lang.String tag);

    androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(java.util.List<java.lang.String> ids);

    androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(java.lang.String name);

    androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(java.lang.String tag);

    boolean hasUnfinishedWork();

    int incrementWorkSpecRunAttemptCount(java.lang.String id);

    void insertWorkSpec(androidx.work.impl.model.WorkSpec workSpec);

    int markWorkSpecScheduled(java.lang.String id, long startTime);

    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    int resetScheduledState();

    int resetWorkSpecRunAttemptCount(java.lang.String id);

    void setOutput(java.lang.String id, androidx.work.Data output);

    void setPeriodStartTime(java.lang.String id, long periodStartTime);

    int setState(androidx.work.WorkInfo.State state, java.lang.String... ids);
}
