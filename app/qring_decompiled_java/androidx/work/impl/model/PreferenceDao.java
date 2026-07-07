package androidx.work.impl.model;

/* loaded from: classes.dex */
public interface PreferenceDao {
    java.lang.Long getLongValue(java.lang.String key);

    androidx.lifecycle.LiveData<java.lang.Long> getObservableLongValue(java.lang.String key);

    void insertPreference(androidx.work.impl.model.Preference preference);
}
