package androidx.work;

/* loaded from: classes.dex */
public final class WorkQuery {
    private final java.util.List<java.util.UUID> mIds;
    private final java.util.List<androidx.work.WorkInfo.State> mStates;
    private final java.util.List<java.lang.String> mTags;
    private final java.util.List<java.lang.String> mUniqueWorkNames;

    WorkQuery(androidx.work.WorkQuery.Builder builder) {
        this.mIds = builder.mIds;
        this.mUniqueWorkNames = builder.mUniqueWorkNames;
        this.mTags = builder.mTags;
        this.mStates = builder.mStates;
    }

    public java.util.List<java.util.UUID> getIds() {
        return this.mIds;
    }

    public java.util.List<java.lang.String> getUniqueWorkNames() {
        return this.mUniqueWorkNames;
    }

    public java.util.List<java.lang.String> getTags() {
        return this.mTags;
    }

    public java.util.List<androidx.work.WorkInfo.State> getStates() {
        return this.mStates;
    }

    public static final class Builder {
        java.util.List<java.util.UUID> mIds = new java.util.ArrayList();
        java.util.List<java.lang.String> mUniqueWorkNames = new java.util.ArrayList();
        java.util.List<java.lang.String> mTags = new java.util.ArrayList();
        java.util.List<androidx.work.WorkInfo.State> mStates = new java.util.ArrayList();

        private Builder() {
        }

        public static androidx.work.WorkQuery.Builder fromIds(java.util.List<java.util.UUID> ids) {
            androidx.work.WorkQuery.Builder builder = new androidx.work.WorkQuery.Builder();
            builder.addIds(ids);
            return builder;
        }

        public static androidx.work.WorkQuery.Builder fromUniqueWorkNames(java.util.List<java.lang.String> uniqueWorkNames) {
            androidx.work.WorkQuery.Builder builder = new androidx.work.WorkQuery.Builder();
            builder.addUniqueWorkNames(uniqueWorkNames);
            return builder;
        }

        public static androidx.work.WorkQuery.Builder fromTags(java.util.List<java.lang.String> tags) {
            androidx.work.WorkQuery.Builder builder = new androidx.work.WorkQuery.Builder();
            builder.addTags(tags);
            return builder;
        }

        public static androidx.work.WorkQuery.Builder fromStates(java.util.List<androidx.work.WorkInfo.State> states) {
            androidx.work.WorkQuery.Builder builder = new androidx.work.WorkQuery.Builder();
            builder.addStates(states);
            return builder;
        }

        public androidx.work.WorkQuery.Builder addIds(java.util.List<java.util.UUID> ids) {
            this.mIds.addAll(ids);
            return this;
        }

        public androidx.work.WorkQuery.Builder addUniqueWorkNames(java.util.List<java.lang.String> uniqueWorkNames) {
            this.mUniqueWorkNames.addAll(uniqueWorkNames);
            return this;
        }

        public androidx.work.WorkQuery.Builder addTags(java.util.List<java.lang.String> tags) {
            this.mTags.addAll(tags);
            return this;
        }

        public androidx.work.WorkQuery.Builder addStates(java.util.List<androidx.work.WorkInfo.State> states) {
            this.mStates.addAll(states);
            return this;
        }

        public androidx.work.WorkQuery build() {
            if (this.mIds.isEmpty() && this.mUniqueWorkNames.isEmpty() && this.mTags.isEmpty() && this.mStates.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new androidx.work.WorkQuery(this);
        }
    }
}
