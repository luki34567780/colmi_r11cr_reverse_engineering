package com.airbnb.lottie.model.content;

/* loaded from: classes.dex */
public class MergePaths implements com.airbnb.lottie.model.content.ContentModel {
    private final boolean hidden;
    private final com.airbnb.lottie.model.content.MergePaths.MergePathsMode mode;
    private final java.lang.String name;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static com.airbnb.lottie.model.content.MergePaths.MergePathsMode forId(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i == 5) {
                return EXCLUDE_INTERSECTIONS;
            }
            return MERGE;
        }
    }

    public MergePaths(java.lang.String str, com.airbnb.lottie.model.content.MergePaths.MergePathsMode mergePathsMode, boolean z) {
        this.name = str;
        this.mode = mergePathsMode;
        this.hidden = z;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public com.airbnb.lottie.model.content.MergePaths.MergePathsMode getMode() {
        return this.mode;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        if (!lottieDrawable.enableMergePathsForKitKatAndAbove()) {
            com.airbnb.lottie.utils.Logger.warning("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new com.airbnb.lottie.animation.content.MergePathsContent(this);
    }

    public java.lang.String toString() {
        return "MergePaths{mode=" + this.mode + '}';
    }
}
