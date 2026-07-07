package androidx.work.impl.model;

/* loaded from: classes.dex */
public class Preference {
    public java.lang.String mKey;
    public java.lang.Long mValue;

    public Preference(java.lang.String key, boolean value) {
        this(key, value ? 1L : 0L);
    }

    public Preference(java.lang.String key, long value) {
        this.mKey = key;
        this.mValue = java.lang.Long.valueOf(value);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof androidx.work.impl.model.Preference)) {
            return false;
        }
        androidx.work.impl.model.Preference preference = (androidx.work.impl.model.Preference) o;
        if (!this.mKey.equals(preference.mKey)) {
            return false;
        }
        java.lang.Long l = this.mValue;
        java.lang.Long l2 = preference.mValue;
        return l != null ? l.equals(l2) : l2 == null;
    }

    public int hashCode() {
        int hashCode = this.mKey.hashCode() * 31;
        java.lang.Long l = this.mValue;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
