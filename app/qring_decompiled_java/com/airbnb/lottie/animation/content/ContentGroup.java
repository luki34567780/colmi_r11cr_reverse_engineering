package com.airbnb.lottie.animation.content;

/* loaded from: classes.dex */
public class ContentGroup implements com.airbnb.lottie.animation.content.DrawingContent, com.airbnb.lottie.animation.content.PathContent, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener, com.airbnb.lottie.model.KeyPathElement {
    private final java.util.List<com.airbnb.lottie.animation.content.Content> contents;
    private final boolean hidden;
    private final com.airbnb.lottie.LottieDrawable lottieDrawable;
    private final android.graphics.Matrix matrix;
    private final java.lang.String name;
    private android.graphics.Paint offScreenPaint;
    private android.graphics.RectF offScreenRectF;
    private final android.graphics.Path path;
    private java.util.List<com.airbnb.lottie.animation.content.PathContent> pathContents;
    private final android.graphics.RectF rect;
    private com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation transformAnimation;

    private static java.util.List<com.airbnb.lottie.animation.content.Content> contentsFromModels(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, java.util.List<com.airbnb.lottie.model.content.ContentModel> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            com.airbnb.lottie.animation.content.Content content = list.get(i).toContent(lottieDrawable, baseLayer);
            if (content != null) {
                arrayList.add(content);
            }
        }
        return arrayList;
    }

    static com.airbnb.lottie.model.animatable.AnimatableTransform findTransform(java.util.List<com.airbnb.lottie.model.content.ContentModel> list) {
        for (int i = 0; i < list.size(); i++) {
            com.airbnb.lottie.model.content.ContentModel contentModel = list.get(i);
            if (contentModel instanceof com.airbnb.lottie.model.animatable.AnimatableTransform) {
                return (com.airbnb.lottie.model.animatable.AnimatableTransform) contentModel;
            }
        }
        return null;
    }

    public ContentGroup(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.ShapeGroup shapeGroup) {
        this(lottieDrawable, baseLayer, shapeGroup.getName(), shapeGroup.isHidden(), contentsFromModels(lottieDrawable, baseLayer, shapeGroup.getItems()), findTransform(shapeGroup.getItems()));
    }

    ContentGroup(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, java.lang.String str, boolean z, java.util.List<com.airbnb.lottie.animation.content.Content> list, com.airbnb.lottie.model.animatable.AnimatableTransform animatableTransform) {
        this.offScreenPaint = new com.airbnb.lottie.animation.LPaint();
        this.offScreenRectF = new android.graphics.RectF();
        this.matrix = new android.graphics.Matrix();
        this.path = new android.graphics.Path();
        this.rect = new android.graphics.RectF();
        this.name = str;
        this.lottieDrawable = lottieDrawable;
        this.hidden = z;
        this.contents = list;
        if (animatableTransform != null) {
            com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation createAnimation = animatableTransform.createAnimation();
            this.transformAnimation = createAnimation;
            createAnimation.addAnimationsToLayer(baseLayer);
            this.transformAnimation.addListener(this);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.animation.content.Content content = list.get(size);
            if (content instanceof com.airbnb.lottie.animation.content.GreedyContent) {
                arrayList.add((com.airbnb.lottie.animation.content.GreedyContent) content);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((com.airbnb.lottie.animation.content.GreedyContent) arrayList.get(size2)).absorbContent(list.listIterator(list.size()));
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + this.contents.size());
        arrayList.addAll(list);
        for (int size = this.contents.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.animation.content.Content content = this.contents.get(size);
            content.setContents(arrayList, this.contents.subList(0, size));
            arrayList.add(content);
        }
    }

    java.util.List<com.airbnb.lottie.animation.content.PathContent> getPathList() {
        if (this.pathContents == null) {
            this.pathContents = new java.util.ArrayList();
            for (int i = 0; i < this.contents.size(); i++) {
                com.airbnb.lottie.animation.content.Content content = this.contents.get(i);
                if (content instanceof com.airbnb.lottie.animation.content.PathContent) {
                    this.pathContents.add((com.airbnb.lottie.animation.content.PathContent) content);
                }
            }
        }
        return this.pathContents;
    }

    android.graphics.Matrix getTransformationMatrix() {
        com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation transformKeyframeAnimation = this.transformAnimation;
        if (transformKeyframeAnimation != null) {
            return transformKeyframeAnimation.getMatrix();
        }
        this.matrix.reset();
        return this.matrix;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public android.graphics.Path getPath() {
        this.matrix.reset();
        com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation transformKeyframeAnimation = this.transformAnimation;
        if (transformKeyframeAnimation != null) {
            this.matrix.set(transformKeyframeAnimation.getMatrix());
        }
        this.path.reset();
        if (this.hidden) {
            return this.path;
        }
        for (int size = this.contents.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.animation.content.Content content = this.contents.get(size);
            if (content instanceof com.airbnb.lottie.animation.content.PathContent) {
                this.path.addPath(((com.airbnb.lottie.animation.content.PathContent) content).getPath(), this.matrix);
            }
        }
        return this.path;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        if (this.hidden) {
            return;
        }
        this.matrix.set(matrix);
        com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation transformKeyframeAnimation = this.transformAnimation;
        if (transformKeyframeAnimation != null) {
            this.matrix.preConcat(transformKeyframeAnimation.getMatrix());
            i = (int) (((((this.transformAnimation.getOpacity() == null ? 100 : this.transformAnimation.getOpacity().getValue().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.lottieDrawable.isApplyingOpacityToLayersEnabled() && hasTwoOrMoreDrawableContent() && i != 255;
        if (z) {
            this.offScreenRectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            getBounds(this.offScreenRectF, this.matrix, true);
            this.offScreenPaint.setAlpha(i);
            com.airbnb.lottie.utils.Utils.saveLayerCompat(canvas, this.offScreenRectF, this.offScreenPaint);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.contents.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.animation.content.Content content = this.contents.get(size);
            if (content instanceof com.airbnb.lottie.animation.content.DrawingContent) {
                ((com.airbnb.lottie.animation.content.DrawingContent) content).draw(canvas, this.matrix, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    private boolean hasTwoOrMoreDrawableContent() {
        int i = 0;
        for (int i2 = 0; i2 < this.contents.size(); i2++) {
            if ((this.contents.get(i2) instanceof com.airbnb.lottie.animation.content.DrawingContent) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.matrix.set(matrix);
        com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation transformKeyframeAnimation = this.transformAnimation;
        if (transformKeyframeAnimation != null) {
            this.matrix.preConcat(transformKeyframeAnimation.getMatrix());
        }
        this.rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.contents.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.animation.content.Content content = this.contents.get(size);
            if (content instanceof com.airbnb.lottie.animation.content.DrawingContent) {
                ((com.airbnb.lottie.animation.content.DrawingContent) content).getBounds(this.rect, this.matrix, z);
                rectF.union(this.rect);
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
        if (keyPath.matches(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                keyPath2 = keyPath2.addKey(getName());
                if (keyPath.fullyResolvesTo(getName(), i)) {
                    list.add(keyPath2.resolve(this));
                }
            }
            if (keyPath.propagateToChildren(getName(), i)) {
                int incrementDepthBy = i + keyPath.incrementDepthBy(getName(), i);
                for (int i2 = 0; i2 < this.contents.size(); i2++) {
                    com.airbnb.lottie.animation.content.Content content = this.contents.get(i2);
                    if (content instanceof com.airbnb.lottie.model.KeyPathElement) {
                        ((com.airbnb.lottie.model.KeyPathElement) content).resolveKeyPath(keyPath, incrementDepthBy, list, keyPath2);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation transformKeyframeAnimation = this.transformAnimation;
        if (transformKeyframeAnimation != null) {
            transformKeyframeAnimation.applyValueCallback(t, lottieValueCallback);
        }
    }
}
