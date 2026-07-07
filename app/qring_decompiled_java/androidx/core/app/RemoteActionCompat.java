package androidx.core.app;

/* loaded from: classes.dex */
public final class RemoteActionCompat implements androidx.versionedparcelable.VersionedParcelable {
    public android.app.PendingIntent mActionIntent;
    public java.lang.CharSequence mContentDescription;
    public boolean mEnabled;
    public androidx.core.graphics.drawable.IconCompat mIcon;
    public boolean mShouldShowIcon;
    public java.lang.CharSequence mTitle;

    public RemoteActionCompat(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.app.PendingIntent pendingIntent) {
        this.mIcon = (androidx.core.graphics.drawable.IconCompat) androidx.core.util.Preconditions.checkNotNull(iconCompat);
        this.mTitle = (java.lang.CharSequence) androidx.core.util.Preconditions.checkNotNull(charSequence);
        this.mContentDescription = (java.lang.CharSequence) androidx.core.util.Preconditions.checkNotNull(charSequence2);
        this.mActionIntent = (android.app.PendingIntent) androidx.core.util.Preconditions.checkNotNull(pendingIntent);
        this.mEnabled = true;
        this.mShouldShowIcon = true;
    }

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(androidx.core.app.RemoteActionCompat remoteActionCompat) {
        androidx.core.util.Preconditions.checkNotNull(remoteActionCompat);
        this.mIcon = remoteActionCompat.mIcon;
        this.mTitle = remoteActionCompat.mTitle;
        this.mContentDescription = remoteActionCompat.mContentDescription;
        this.mActionIntent = remoteActionCompat.mActionIntent;
        this.mEnabled = remoteActionCompat.mEnabled;
        this.mShouldShowIcon = remoteActionCompat.mShouldShowIcon;
    }

    public static androidx.core.app.RemoteActionCompat createFromRemoteAction(android.app.RemoteAction remoteAction) {
        androidx.core.util.Preconditions.checkNotNull(remoteAction);
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat(androidx.core.graphics.drawable.IconCompat.createFromIcon(remoteAction.getIcon()), remoteAction.getTitle(), remoteAction.getContentDescription(), remoteAction.getActionIntent());
        remoteActionCompat.setEnabled(remoteAction.isEnabled());
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.setShouldShowIcon(remoteAction.shouldShowIcon());
        }
        return remoteActionCompat;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setShouldShowIcon(boolean z) {
        this.mShouldShowIcon = z;
    }

    public boolean shouldShowIcon() {
        return this.mShouldShowIcon;
    }

    public androidx.core.graphics.drawable.IconCompat getIcon() {
        return this.mIcon;
    }

    public java.lang.CharSequence getTitle() {
        return this.mTitle;
    }

    public java.lang.CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    public android.app.PendingIntent getActionIntent() {
        return this.mActionIntent;
    }

    public android.app.RemoteAction toRemoteAction() {
        android.app.RemoteAction remoteAction = new android.app.RemoteAction(this.mIcon.toIcon(), this.mTitle, this.mContentDescription, this.mActionIntent);
        remoteAction.setEnabled(isEnabled());
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            remoteAction.setShouldShowIcon(shouldShowIcon());
        }
        return remoteAction;
    }
}
