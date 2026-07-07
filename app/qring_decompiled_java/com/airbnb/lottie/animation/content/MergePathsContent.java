package com.airbnb.lottie.animation.content;

/* loaded from: classes.dex */
public class MergePathsContent implements com.airbnb.lottie.animation.content.PathContent, com.airbnb.lottie.animation.content.GreedyContent {
    private final com.airbnb.lottie.model.content.MergePaths mergePaths;
    private final java.lang.String name;
    private final android.graphics.Path firstPath = new android.graphics.Path();
    private final android.graphics.Path remainderPath = new android.graphics.Path();
    private final android.graphics.Path path = new android.graphics.Path();
    private final java.util.List<com.airbnb.lottie.animation.content.PathContent> pathContents = new java.util.ArrayList();

    public MergePathsContent(com.airbnb.lottie.model.content.MergePaths mergePaths) {
        if (android.os.Build.VERSION.SDK_INT < 19) {
            throw new java.lang.IllegalStateException("Merge paths are not supported pre-KitKat.");
        }
        this.name = mergePaths.getName();
        this.mergePaths = mergePaths;
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    public void absorbContent(java.util.ListIterator<com.airbnb.lottie.animation.content.Content> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            com.airbnb.lottie.animation.content.Content previous = listIterator.previous();
            if (previous instanceof com.airbnb.lottie.animation.content.PathContent) {
                this.pathContents.add((com.airbnb.lottie.animation.content.PathContent) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
        for (int i = 0; i < this.pathContents.size(); i++) {
            this.pathContents.get(i).setContents(list, list2);
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public android.graphics.Path getPath() {
        this.path.reset();
        if (this.mergePaths.isHidden()) {
            return this.path;
        }
        int i = com.airbnb.lottie.animation.content.MergePathsContent.AnonymousClass1.$SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode[this.mergePaths.getMode().ordinal()];
        if (i == 1) {
            addPaths();
        } else if (i == 2) {
            opFirstPathWithRest(android.graphics.Path.Op.UNION);
        } else if (i == 3) {
            opFirstPathWithRest(android.graphics.Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            opFirstPathWithRest(android.graphics.Path.Op.INTERSECT);
        } else if (i == 5) {
            opFirstPathWithRest(android.graphics.Path.Op.XOR);
        }
        return this.path;
    }

    /* renamed from: com.airbnb.lottie.animation.content.MergePathsContent$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.content.MergePaths.MergePathsMode.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode = iArr;
            try {
                iArr[com.airbnb.lottie.model.content.MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode[com.airbnb.lottie.model.content.MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode[com.airbnb.lottie.model.content.MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode[com.airbnb.lottie.model.content.MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode[com.airbnb.lottie.model.content.MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.name;
    }

    private void addPaths() {
        for (int i = 0; i < this.pathContents.size(); i++) {
            this.path.addPath(this.pathContents.get(i).getPath());
        }
    }

    private void opFirstPathWithRest(android.graphics.Path.Op op) {
        this.remainderPath.reset();
        this.firstPath.reset();
        for (int size = this.pathContents.size() - 1; size >= 1; size--) {
            com.airbnb.lottie.animation.content.PathContent pathContent = this.pathContents.get(size);
            if (pathContent instanceof com.airbnb.lottie.animation.content.ContentGroup) {
                com.airbnb.lottie.animation.content.ContentGroup contentGroup = (com.airbnb.lottie.animation.content.ContentGroup) pathContent;
                java.util.List<com.airbnb.lottie.animation.content.PathContent> pathList = contentGroup.getPathList();
                for (int size2 = pathList.size() - 1; size2 >= 0; size2--) {
                    android.graphics.Path path = pathList.get(size2).getPath();
                    path.transform(contentGroup.getTransformationMatrix());
                    this.remainderPath.addPath(path);
                }
            } else {
                this.remainderPath.addPath(pathContent.getPath());
            }
        }
        com.airbnb.lottie.animation.content.PathContent pathContent2 = this.pathContents.get(0);
        if (pathContent2 instanceof com.airbnb.lottie.animation.content.ContentGroup) {
            com.airbnb.lottie.animation.content.ContentGroup contentGroup2 = (com.airbnb.lottie.animation.content.ContentGroup) pathContent2;
            java.util.List<com.airbnb.lottie.animation.content.PathContent> pathList2 = contentGroup2.getPathList();
            for (int i = 0; i < pathList2.size(); i++) {
                android.graphics.Path path2 = pathList2.get(i).getPath();
                path2.transform(contentGroup2.getTransformationMatrix());
                this.firstPath.addPath(path2);
            }
        } else {
            this.firstPath.set(pathContent2.getPath());
        }
        this.path.op(this.firstPath, this.remainderPath, op);
    }
}
