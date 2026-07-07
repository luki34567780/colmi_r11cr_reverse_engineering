package androidx.work;

/* loaded from: classes.dex */
public final class ForegroundInfo {
    private final int mForegroundServiceType;
    private final android.app.Notification mNotification;
    private final int mNotificationId;

    public ForegroundInfo(int notificationId, android.app.Notification notification) {
        this(notificationId, notification, 0);
    }

    public ForegroundInfo(int notificationId, android.app.Notification notification, int foregroundServiceType) {
        this.mNotificationId = notificationId;
        this.mNotification = notification;
        this.mForegroundServiceType = foregroundServiceType;
    }

    public int getNotificationId() {
        return this.mNotificationId;
    }

    public int getForegroundServiceType() {
        return this.mForegroundServiceType;
    }

    public android.app.Notification getNotification() {
        return this.mNotification;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        androidx.work.ForegroundInfo foregroundInfo = (androidx.work.ForegroundInfo) o;
        if (this.mNotificationId == foregroundInfo.mNotificationId && this.mForegroundServiceType == foregroundInfo.mForegroundServiceType) {
            return this.mNotification.equals(foregroundInfo.mNotification);
        }
        return false;
    }

    public int hashCode() {
        return (((this.mNotificationId * 31) + this.mForegroundServiceType) * 31) + this.mNotification.hashCode();
    }

    public java.lang.String toString() {
        return "ForegroundInfo{mNotificationId=" + this.mNotificationId + ", mForegroundServiceType=" + this.mForegroundServiceType + ", mNotification=" + this.mNotification + '}';
    }
}
