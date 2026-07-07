package com.bumptech.glide;

/* loaded from: classes.dex */
public class GlideExperiments {
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments.Experiment> experiments;

    interface Experiment {
    }

    GlideExperiments(com.bumptech.glide.GlideExperiments.Builder builder) {
        this.experiments = java.util.Collections.unmodifiableMap(new java.util.HashMap(builder.experiments));
    }

    <T extends com.bumptech.glide.GlideExperiments.Experiment> T get(java.lang.Class<T> cls) {
        return (T) this.experiments.get(cls);
    }

    public boolean isEnabled(java.lang.Class<? extends com.bumptech.glide.GlideExperiments.Experiment> cls) {
        return this.experiments.containsKey(cls);
    }

    static final class Builder {
        private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.GlideExperiments.Experiment> experiments = new java.util.HashMap();

        Builder() {
        }

        com.bumptech.glide.GlideExperiments.Builder update(com.bumptech.glide.GlideExperiments.Experiment experiment, boolean z) {
            if (z) {
                add(experiment);
            } else {
                this.experiments.remove(experiment.getClass());
            }
            return this;
        }

        com.bumptech.glide.GlideExperiments.Builder add(com.bumptech.glide.GlideExperiments.Experiment experiment) {
            this.experiments.put(experiment.getClass(), experiment);
            return this;
        }

        com.bumptech.glide.GlideExperiments build() {
            return new com.bumptech.glide.GlideExperiments(this);
        }
    }
}
