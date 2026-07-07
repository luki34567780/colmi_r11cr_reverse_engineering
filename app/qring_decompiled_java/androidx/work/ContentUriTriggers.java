package androidx.work;

/* loaded from: classes.dex */
public final class ContentUriTriggers {
    private final java.util.Set<androidx.work.ContentUriTriggers.Trigger> mTriggers = new java.util.HashSet();

    public void add(android.net.Uri uri, boolean triggerForDescendants) {
        this.mTriggers.add(new androidx.work.ContentUriTriggers.Trigger(uri, triggerForDescendants));
    }

    public java.util.Set<androidx.work.ContentUriTriggers.Trigger> getTriggers() {
        return this.mTriggers;
    }

    public int size() {
        return this.mTriggers.size();
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return this.mTriggers.equals(((androidx.work.ContentUriTriggers) o).mTriggers);
    }

    public int hashCode() {
        return this.mTriggers.hashCode();
    }

    public static final class Trigger {
        private final boolean mTriggerForDescendants;
        private final android.net.Uri mUri;

        Trigger(android.net.Uri uri, boolean triggerForDescendants) {
            this.mUri = uri;
            this.mTriggerForDescendants = triggerForDescendants;
        }

        public android.net.Uri getUri() {
            return this.mUri;
        }

        public boolean shouldTriggerForDescendants() {
            return this.mTriggerForDescendants;
        }

        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            androidx.work.ContentUriTriggers.Trigger trigger = (androidx.work.ContentUriTriggers.Trigger) o;
            return this.mTriggerForDescendants == trigger.mTriggerForDescendants && this.mUri.equals(trigger.mUri);
        }

        public int hashCode() {
            return (this.mUri.hashCode() * 31) + (this.mTriggerForDescendants ? 1 : 0);
        }
    }
}
