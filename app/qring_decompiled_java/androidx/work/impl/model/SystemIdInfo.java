package androidx.work.impl.model;

/* loaded from: classes.dex */
public class SystemIdInfo {
    public final int systemId;
    public final java.lang.String workSpecId;

    public SystemIdInfo(java.lang.String workSpecId, int systemId) {
        this.workSpecId = workSpecId;
        this.systemId = systemId;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof androidx.work.impl.model.SystemIdInfo)) {
            return false;
        }
        androidx.work.impl.model.SystemIdInfo systemIdInfo = (androidx.work.impl.model.SystemIdInfo) o;
        if (this.systemId != systemIdInfo.systemId) {
            return false;
        }
        return this.workSpecId.equals(systemIdInfo.workSpecId);
    }

    public int hashCode() {
        return (this.workSpecId.hashCode() * 31) + this.systemId;
    }
}
