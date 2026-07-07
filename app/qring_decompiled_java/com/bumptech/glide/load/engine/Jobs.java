package com.bumptech.glide.load.engine;

/* loaded from: classes.dex */
final class Jobs {
    private final java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.EngineJob<?>> jobs = new java.util.HashMap();
    private final java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.EngineJob<?>> onlyCacheJobs = new java.util.HashMap();

    Jobs() {
    }

    java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.EngineJob<?>> getAll() {
        return java.util.Collections.unmodifiableMap(this.jobs);
    }

    com.bumptech.glide.load.engine.EngineJob<?> get(com.bumptech.glide.load.Key key, boolean z) {
        return getJobMap(z).get(key);
    }

    void put(com.bumptech.glide.load.Key key, com.bumptech.glide.load.engine.EngineJob<?> engineJob) {
        getJobMap(engineJob.onlyRetrieveFromCache()).put(key, engineJob);
    }

    void removeIfCurrent(com.bumptech.glide.load.Key key, com.bumptech.glide.load.engine.EngineJob<?> engineJob) {
        java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.EngineJob<?>> jobMap = getJobMap(engineJob.onlyRetrieveFromCache());
        if (engineJob.equals(jobMap.get(key))) {
            jobMap.remove(key);
        }
    }

    private java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.EngineJob<?>> getJobMap(boolean z) {
        return z ? this.onlyCacheJobs : this.jobs;
    }
}
