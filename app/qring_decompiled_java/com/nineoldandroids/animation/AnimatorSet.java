package com.nineoldandroids.animation;

/* loaded from: /tmp/dex/classes2.dex */
public final class AnimatorSet extends com.nineoldandroids.animation.Animator {
    private java.util.ArrayList<com.nineoldandroids.animation.Animator> mPlayingSet = new java.util.ArrayList<>();
    private java.util.HashMap<com.nineoldandroids.animation.Animator, com.nineoldandroids.animation.AnimatorSet.Node> mNodeMap = new java.util.HashMap<>();
    private java.util.ArrayList<com.nineoldandroids.animation.AnimatorSet.Node> mNodes = new java.util.ArrayList<>();
    private java.util.ArrayList<com.nineoldandroids.animation.AnimatorSet.Node> mSortedNodes = new java.util.ArrayList<>();
    private boolean mNeedsSort = true;
    private com.nineoldandroids.animation.AnimatorSet.AnimatorSetListener mSetListener = null;
    boolean mTerminated = false;
    private boolean mStarted = false;
    private long mStartDelay = 0;
    private com.nineoldandroids.animation.ValueAnimator mDelayAnim = null;
    private long mDuration = -1;

    public void playTogether(com.nineoldandroids.animation.Animator... animatorArr) {
        if (animatorArr != null) {
            this.mNeedsSort = true;
            com.nineoldandroids.animation.AnimatorSet.Builder play = play(animatorArr[0]);
            for (int i = 1; i < animatorArr.length; i++) {
                play.with(animatorArr[i]);
            }
        }
    }

    public void playTogether(java.util.Collection<com.nineoldandroids.animation.Animator> collection) {
        if (collection == null || collection.size() <= 0) {
            return;
        }
        this.mNeedsSort = true;
        com.nineoldandroids.animation.AnimatorSet.Builder builder = null;
        for (com.nineoldandroids.animation.Animator animator : collection) {
            if (builder == null) {
                builder = play(animator);
            } else {
                builder.with(animator);
            }
        }
    }

    public void playSequentially(com.nineoldandroids.animation.Animator... animatorArr) {
        if (animatorArr != null) {
            this.mNeedsSort = true;
            int i = 0;
            if (animatorArr.length == 1) {
                play(animatorArr[0]);
                return;
            }
            while (i < animatorArr.length - 1) {
                com.nineoldandroids.animation.AnimatorSet.Builder play = play(animatorArr[i]);
                i++;
                play.before(animatorArr[i]);
            }
        }
    }

    public void playSequentially(java.util.List<com.nineoldandroids.animation.Animator> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.mNeedsSort = true;
        int i = 0;
        if (list.size() == 1) {
            play(list.get(0));
            return;
        }
        while (i < list.size() - 1) {
            com.nineoldandroids.animation.AnimatorSet.Builder play = play(list.get(i));
            i++;
            play.before(list.get(i));
        }
    }

    public java.util.ArrayList<com.nineoldandroids.animation.Animator> getChildAnimations() {
        java.util.ArrayList<com.nineoldandroids.animation.Animator> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.nineoldandroids.animation.AnimatorSet.Node> it = this.mNodes.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().animation);
        }
        return arrayList;
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setTarget(java.lang.Object obj) {
        java.util.Iterator<com.nineoldandroids.animation.AnimatorSet.Node> it = this.mNodes.iterator();
        while (it.hasNext()) {
            com.nineoldandroids.animation.Animator animator = it.next().animation;
            if (animator instanceof com.nineoldandroids.animation.AnimatorSet) {
                ((com.nineoldandroids.animation.AnimatorSet) animator).setTarget(obj);
            } else if (animator instanceof com.nineoldandroids.animation.ObjectAnimator) {
                ((com.nineoldandroids.animation.ObjectAnimator) animator).setTarget(obj);
            }
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setInterpolator(android.view.animation.Interpolator interpolator) {
        java.util.Iterator<com.nineoldandroids.animation.AnimatorSet.Node> it = this.mNodes.iterator();
        while (it.hasNext()) {
            it.next().animation.setInterpolator(interpolator);
        }
    }

    public com.nineoldandroids.animation.AnimatorSet.Builder play(com.nineoldandroids.animation.Animator animator) {
        if (animator == null) {
            return null;
        }
        this.mNeedsSort = true;
        return new com.nineoldandroids.animation.AnimatorSet.Builder(animator);
    }

    @Override // com.nineoldandroids.animation.Animator
    public void cancel() {
        this.mTerminated = true;
        if (isStarted()) {
            java.util.ArrayList arrayList = null;
            if (this.mListeners != null) {
                arrayList = (java.util.ArrayList) this.mListeners.clone();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.nineoldandroids.animation.Animator.AnimatorListener) it.next()).onAnimationCancel(this);
                }
            }
            com.nineoldandroids.animation.ValueAnimator valueAnimator = this.mDelayAnim;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mDelayAnim.cancel();
            } else if (this.mSortedNodes.size() > 0) {
                java.util.Iterator<com.nineoldandroids.animation.AnimatorSet.Node> it2 = this.mSortedNodes.iterator();
                while (it2.hasNext()) {
                    it2.next().animation.cancel();
                }
            }
            if (arrayList != null) {
                java.util.Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((com.nineoldandroids.animation.Animator.AnimatorListener) it3.next()).onAnimationEnd(this);
                }
            }
            this.mStarted = false;
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    public void end() {
        this.mTerminated = true;
        if (isStarted()) {
            if (this.mSortedNodes.size() != this.mNodes.size()) {
                sortNodes();
                java.util.Iterator<com.nineoldandroids.animation.AnimatorSet.Node> it = this.mSortedNodes.iterator();
                while (it.hasNext()) {
                    com.nineoldandroids.animation.AnimatorSet.Node next = it.next();
                    if (this.mSetListener == null) {
                        this.mSetListener = new com.nineoldandroids.animation.AnimatorSet.AnimatorSetListener(this);
                    }
                    next.animation.addListener(this.mSetListener);
                }
            }
            com.nineoldandroids.animation.ValueAnimator valueAnimator = this.mDelayAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.mSortedNodes.size() > 0) {
                java.util.Iterator<com.nineoldandroids.animation.AnimatorSet.Node> it2 = this.mSortedNodes.iterator();
                while (it2.hasNext()) {
                    it2.next().animation.end();
                }
            }
            if (this.mListeners != null) {
                java.util.Iterator it3 = ((java.util.ArrayList) this.mListeners.clone()).iterator();
                while (it3.hasNext()) {
                    ((com.nineoldandroids.animation.Animator.AnimatorListener) it3.next()).onAnimationEnd(this);
                }
            }
            this.mStarted = false;
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    public boolean isRunning() {
        java.util.Iterator<com.nineoldandroids.animation.AnimatorSet.Node> it = this.mNodes.iterator();
        while (it.hasNext()) {
            if (it.next().animation.isRunning()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.nineoldandroids.animation.Animator
    public boolean isStarted() {
        return this.mStarted;
    }

    @Override // com.nineoldandroids.animation.Animator
    public long getStartDelay() {
        return this.mStartDelay;
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setStartDelay(long j) {
        this.mStartDelay = j;
    }

    @Override // com.nineoldandroids.animation.Animator
    public long getDuration() {
        return this.mDuration;
    }

    @Override // com.nineoldandroids.animation.Animator
    public com.nineoldandroids.animation.AnimatorSet setDuration(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("duration must be a value of zero or greater");
        }
        java.util.Iterator<com.nineoldandroids.animation.AnimatorSet.Node> it = this.mNodes.iterator();
        while (it.hasNext()) {
            it.next().animation.setDuration(j);
        }
        this.mDuration = j;
        return this;
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setupStartValues() {
        java.util.Iterator<com.nineoldandroids.animation.AnimatorSet.Node> it = this.mNodes.iterator();
        while (it.hasNext()) {
            it.next().animation.setupStartValues();
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setupEndValues() {
        java.util.Iterator<com.nineoldandroids.animation.AnimatorSet.Node> it = this.mNodes.iterator();
        while (it.hasNext()) {
            it.next().animation.setupEndValues();
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    public void start() {
        this.mTerminated = false;
        this.mStarted = true;
        sortNodes();
        int size = this.mSortedNodes.size();
        for (int i = 0; i < size; i++) {
            com.nineoldandroids.animation.AnimatorSet.Node node = this.mSortedNodes.get(i);
            java.util.ArrayList<com.nineoldandroids.animation.Animator.AnimatorListener> listeners = node.animation.getListeners();
            if (listeners != null && listeners.size() > 0) {
                java.util.Iterator it = new java.util.ArrayList(listeners).iterator();
                while (it.hasNext()) {
                    com.nineoldandroids.animation.Animator.AnimatorListener animatorListener = (com.nineoldandroids.animation.Animator.AnimatorListener) it.next();
                    if ((animatorListener instanceof com.nineoldandroids.animation.AnimatorSet.DependencyListener) || (animatorListener instanceof com.nineoldandroids.animation.AnimatorSet.AnimatorSetListener)) {
                        node.animation.removeListener(animatorListener);
                    }
                }
            }
        }
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            com.nineoldandroids.animation.AnimatorSet.Node node2 = this.mSortedNodes.get(i2);
            if (this.mSetListener == null) {
                this.mSetListener = new com.nineoldandroids.animation.AnimatorSet.AnimatorSetListener(this);
            }
            if (node2.dependencies == null || node2.dependencies.size() == 0) {
                arrayList.add(node2);
            } else {
                int size2 = node2.dependencies.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    com.nineoldandroids.animation.AnimatorSet.Dependency dependency = node2.dependencies.get(i3);
                    dependency.node.animation.addListener(new com.nineoldandroids.animation.AnimatorSet.DependencyListener(this, node2, dependency.rule));
                }
                node2.tmpDependencies = (java.util.ArrayList) node2.dependencies.clone();
            }
            node2.animation.addListener(this.mSetListener);
        }
        if (this.mStartDelay <= 0) {
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.nineoldandroids.animation.AnimatorSet.Node node3 = (com.nineoldandroids.animation.AnimatorSet.Node) it2.next();
                node3.animation.start();
                this.mPlayingSet.add(node3.animation);
            }
        } else {
            com.nineoldandroids.animation.ValueAnimator ofFloat = com.nineoldandroids.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            this.mDelayAnim = ofFloat;
            ofFloat.setDuration(this.mStartDelay);
            this.mDelayAnim.addListener(new com.nineoldandroids.animation.AnimatorListenerAdapter() { // from class: com.nineoldandroids.animation.AnimatorSet.1
                boolean canceled = false;

                @Override // com.nineoldandroids.animation.AnimatorListenerAdapter, com.nineoldandroids.animation.Animator.AnimatorListener
                public void onAnimationCancel(com.nineoldandroids.animation.Animator animator) {
                    this.canceled = true;
                }

                @Override // com.nineoldandroids.animation.AnimatorListenerAdapter, com.nineoldandroids.animation.Animator.AnimatorListener
                public void onAnimationEnd(com.nineoldandroids.animation.Animator animator) {
                    if (this.canceled) {
                        return;
                    }
                    int size3 = arrayList.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        com.nineoldandroids.animation.AnimatorSet.Node node4 = (com.nineoldandroids.animation.AnimatorSet.Node) arrayList.get(i4);
                        node4.animation.start();
                        com.nineoldandroids.animation.AnimatorSet.this.mPlayingSet.add(node4.animation);
                    }
                }
            });
            this.mDelayAnim.start();
        }
        if (this.mListeners != null) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.mListeners.clone();
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((com.nineoldandroids.animation.Animator.AnimatorListener) arrayList2.get(i4)).onAnimationStart(this);
            }
        }
        if (this.mNodes.size() == 0 && this.mStartDelay == 0) {
            this.mStarted = false;
            if (this.mListeners != null) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) this.mListeners.clone();
                int size4 = arrayList3.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((com.nineoldandroids.animation.Animator.AnimatorListener) arrayList3.get(i5)).onAnimationEnd(this);
                }
            }
        }
    }

    @Override // com.nineoldandroids.animation.Animator
    /* renamed from: clone */
    public com.nineoldandroids.animation.AnimatorSet mo106clone() {
        com.nineoldandroids.animation.AnimatorSet animatorSet = (com.nineoldandroids.animation.AnimatorSet) super.mo106clone();
        animatorSet.mNeedsSort = true;
        animatorSet.mTerminated = false;
        animatorSet.mStarted = false;
        animatorSet.mPlayingSet = new java.util.ArrayList<>();
        animatorSet.mNodeMap = new java.util.HashMap<>();
        animatorSet.mNodes = new java.util.ArrayList<>();
        animatorSet.mSortedNodes = new java.util.ArrayList<>();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<com.nineoldandroids.animation.AnimatorSet.Node> it = this.mNodes.iterator();
        while (it.hasNext()) {
            com.nineoldandroids.animation.AnimatorSet.Node next = it.next();
            com.nineoldandroids.animation.AnimatorSet.Node m107clone = next.m107clone();
            hashMap.put(next, m107clone);
            animatorSet.mNodes.add(m107clone);
            animatorSet.mNodeMap.put(m107clone.animation, m107clone);
            java.util.ArrayList arrayList = null;
            m107clone.dependencies = null;
            m107clone.tmpDependencies = null;
            m107clone.nodeDependents = null;
            m107clone.nodeDependencies = null;
            java.util.ArrayList<com.nineoldandroids.animation.Animator.AnimatorListener> listeners = m107clone.animation.getListeners();
            if (listeners != null) {
                java.util.Iterator<com.nineoldandroids.animation.Animator.AnimatorListener> it2 = listeners.iterator();
                while (it2.hasNext()) {
                    com.nineoldandroids.animation.Animator.AnimatorListener next2 = it2.next();
                    if (next2 instanceof com.nineoldandroids.animation.AnimatorSet.AnimatorSetListener) {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(next2);
                    }
                }
                if (arrayList != null) {
                    java.util.Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        listeners.remove((com.nineoldandroids.animation.Animator.AnimatorListener) it3.next());
                    }
                }
            }
        }
        java.util.Iterator<com.nineoldandroids.animation.AnimatorSet.Node> it4 = this.mNodes.iterator();
        while (it4.hasNext()) {
            com.nineoldandroids.animation.AnimatorSet.Node next3 = it4.next();
            com.nineoldandroids.animation.AnimatorSet.Node node = (com.nineoldandroids.animation.AnimatorSet.Node) hashMap.get(next3);
            if (next3.dependencies != null) {
                java.util.Iterator<com.nineoldandroids.animation.AnimatorSet.Dependency> it5 = next3.dependencies.iterator();
                while (it5.hasNext()) {
                    com.nineoldandroids.animation.AnimatorSet.Dependency next4 = it5.next();
                    node.addDependency(new com.nineoldandroids.animation.AnimatorSet.Dependency((com.nineoldandroids.animation.AnimatorSet.Node) hashMap.get(next4.node), next4.rule));
                }
            }
        }
        return animatorSet;
    }

    private static class DependencyListener implements com.nineoldandroids.animation.Animator.AnimatorListener {
        private com.nineoldandroids.animation.AnimatorSet mAnimatorSet;
        private com.nineoldandroids.animation.AnimatorSet.Node mNode;
        private int mRule;

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationCancel(com.nineoldandroids.animation.Animator animator) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationRepeat(com.nineoldandroids.animation.Animator animator) {
        }

        public DependencyListener(com.nineoldandroids.animation.AnimatorSet animatorSet, com.nineoldandroids.animation.AnimatorSet.Node node, int i) {
            this.mAnimatorSet = animatorSet;
            this.mNode = node;
            this.mRule = i;
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationEnd(com.nineoldandroids.animation.Animator animator) {
            if (this.mRule == 1) {
                startIfReady(animator);
            }
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationStart(com.nineoldandroids.animation.Animator animator) {
            if (this.mRule == 0) {
                startIfReady(animator);
            }
        }

        private void startIfReady(com.nineoldandroids.animation.Animator animator) {
            if (this.mAnimatorSet.mTerminated) {
                return;
            }
            com.nineoldandroids.animation.AnimatorSet.Dependency dependency = null;
            int size = this.mNode.tmpDependencies.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                com.nineoldandroids.animation.AnimatorSet.Dependency dependency2 = this.mNode.tmpDependencies.get(i);
                if (dependency2.rule == this.mRule && dependency2.node.animation == animator) {
                    animator.removeListener(this);
                    dependency = dependency2;
                    break;
                }
                i++;
            }
            this.mNode.tmpDependencies.remove(dependency);
            if (this.mNode.tmpDependencies.size() == 0) {
                this.mNode.animation.start();
                this.mAnimatorSet.mPlayingSet.add(this.mNode.animation);
            }
        }
    }

    private class AnimatorSetListener implements com.nineoldandroids.animation.Animator.AnimatorListener {
        private com.nineoldandroids.animation.AnimatorSet mAnimatorSet;

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationRepeat(com.nineoldandroids.animation.Animator animator) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationStart(com.nineoldandroids.animation.Animator animator) {
        }

        AnimatorSetListener(com.nineoldandroids.animation.AnimatorSet animatorSet) {
            this.mAnimatorSet = animatorSet;
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationCancel(com.nineoldandroids.animation.Animator animator) {
            if (com.nineoldandroids.animation.AnimatorSet.this.mTerminated || com.nineoldandroids.animation.AnimatorSet.this.mPlayingSet.size() != 0 || com.nineoldandroids.animation.AnimatorSet.this.mListeners == null) {
                return;
            }
            int size = com.nineoldandroids.animation.AnimatorSet.this.mListeners.size();
            for (int i = 0; i < size; i++) {
                com.nineoldandroids.animation.AnimatorSet.this.mListeners.get(i).onAnimationCancel(this.mAnimatorSet);
            }
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationEnd(com.nineoldandroids.animation.Animator animator) {
            animator.removeListener(this);
            com.nineoldandroids.animation.AnimatorSet.this.mPlayingSet.remove(animator);
            boolean z = true;
            ((com.nineoldandroids.animation.AnimatorSet.Node) this.mAnimatorSet.mNodeMap.get(animator)).done = true;
            if (com.nineoldandroids.animation.AnimatorSet.this.mTerminated) {
                return;
            }
            java.util.ArrayList arrayList = this.mAnimatorSet.mSortedNodes;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (!((com.nineoldandroids.animation.AnimatorSet.Node) arrayList.get(i)).done) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                if (com.nineoldandroids.animation.AnimatorSet.this.mListeners != null) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) com.nineoldandroids.animation.AnimatorSet.this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((com.nineoldandroids.animation.Animator.AnimatorListener) arrayList2.get(i2)).onAnimationEnd(this.mAnimatorSet);
                    }
                }
                this.mAnimatorSet.mStarted = false;
            }
        }
    }

    private void sortNodes() {
        if (this.mNeedsSort) {
            this.mSortedNodes.clear();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = this.mNodes.size();
            for (int i = 0; i < size; i++) {
                com.nineoldandroids.animation.AnimatorSet.Node node = this.mNodes.get(i);
                if (node.dependencies == null || node.dependencies.size() == 0) {
                    arrayList.add(node);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (arrayList.size() > 0) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    com.nineoldandroids.animation.AnimatorSet.Node node2 = (com.nineoldandroids.animation.AnimatorSet.Node) arrayList.get(i2);
                    this.mSortedNodes.add(node2);
                    if (node2.nodeDependents != null) {
                        int size3 = node2.nodeDependents.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            com.nineoldandroids.animation.AnimatorSet.Node node3 = node2.nodeDependents.get(i3);
                            node3.nodeDependencies.remove(node2);
                            if (node3.nodeDependencies.size() == 0) {
                                arrayList2.add(node3);
                            }
                        }
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                arrayList2.clear();
            }
            this.mNeedsSort = false;
            if (this.mSortedNodes.size() != this.mNodes.size()) {
                throw new java.lang.IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
            }
            return;
        }
        int size4 = this.mNodes.size();
        for (int i4 = 0; i4 < size4; i4++) {
            com.nineoldandroids.animation.AnimatorSet.Node node4 = this.mNodes.get(i4);
            if (node4.dependencies != null && node4.dependencies.size() > 0) {
                int size5 = node4.dependencies.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    com.nineoldandroids.animation.AnimatorSet.Dependency dependency = node4.dependencies.get(i5);
                    if (node4.nodeDependencies == null) {
                        node4.nodeDependencies = new java.util.ArrayList<>();
                    }
                    if (!node4.nodeDependencies.contains(dependency.node)) {
                        node4.nodeDependencies.add(dependency.node);
                    }
                }
            }
            node4.done = false;
        }
    }

    private static class Dependency {
        static final int AFTER = 1;
        static final int WITH = 0;
        public com.nineoldandroids.animation.AnimatorSet.Node node;
        public int rule;

        public Dependency(com.nineoldandroids.animation.AnimatorSet.Node node, int i) {
            this.node = node;
            this.rule = i;
        }
    }

    private static class Node implements java.lang.Cloneable {
        public com.nineoldandroids.animation.Animator animation;
        public java.util.ArrayList<com.nineoldandroids.animation.AnimatorSet.Dependency> dependencies = null;
        public java.util.ArrayList<com.nineoldandroids.animation.AnimatorSet.Dependency> tmpDependencies = null;
        public java.util.ArrayList<com.nineoldandroids.animation.AnimatorSet.Node> nodeDependencies = null;
        public java.util.ArrayList<com.nineoldandroids.animation.AnimatorSet.Node> nodeDependents = null;
        public boolean done = false;

        public Node(com.nineoldandroids.animation.Animator animator) {
            this.animation = animator;
        }

        public void addDependency(com.nineoldandroids.animation.AnimatorSet.Dependency dependency) {
            if (this.dependencies == null) {
                this.dependencies = new java.util.ArrayList<>();
                this.nodeDependencies = new java.util.ArrayList<>();
            }
            this.dependencies.add(dependency);
            if (!this.nodeDependencies.contains(dependency.node)) {
                this.nodeDependencies.add(dependency.node);
            }
            com.nineoldandroids.animation.AnimatorSet.Node node = dependency.node;
            if (node.nodeDependents == null) {
                node.nodeDependents = new java.util.ArrayList<>();
            }
            node.nodeDependents.add(this);
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.nineoldandroids.animation.AnimatorSet.Node m107clone() {
            try {
                com.nineoldandroids.animation.AnimatorSet.Node node = (com.nineoldandroids.animation.AnimatorSet.Node) super.clone();
                node.animation = this.animation.mo106clone();
                return node;
            } catch (java.lang.CloneNotSupportedException unused) {
                throw new java.lang.AssertionError();
            }
        }
    }

    public class Builder {
        private com.nineoldandroids.animation.AnimatorSet.Node mCurrentNode;

        Builder(com.nineoldandroids.animation.Animator animator) {
            com.nineoldandroids.animation.AnimatorSet.Node node = (com.nineoldandroids.animation.AnimatorSet.Node) com.nineoldandroids.animation.AnimatorSet.this.mNodeMap.get(animator);
            this.mCurrentNode = node;
            if (node == null) {
                this.mCurrentNode = new com.nineoldandroids.animation.AnimatorSet.Node(animator);
                com.nineoldandroids.animation.AnimatorSet.this.mNodeMap.put(animator, this.mCurrentNode);
                com.nineoldandroids.animation.AnimatorSet.this.mNodes.add(this.mCurrentNode);
            }
        }

        public com.nineoldandroids.animation.AnimatorSet.Builder with(com.nineoldandroids.animation.Animator animator) {
            com.nineoldandroids.animation.AnimatorSet.Node node = (com.nineoldandroids.animation.AnimatorSet.Node) com.nineoldandroids.animation.AnimatorSet.this.mNodeMap.get(animator);
            if (node == null) {
                node = new com.nineoldandroids.animation.AnimatorSet.Node(animator);
                com.nineoldandroids.animation.AnimatorSet.this.mNodeMap.put(animator, node);
                com.nineoldandroids.animation.AnimatorSet.this.mNodes.add(node);
            }
            node.addDependency(new com.nineoldandroids.animation.AnimatorSet.Dependency(this.mCurrentNode, 0));
            return this;
        }

        public com.nineoldandroids.animation.AnimatorSet.Builder before(com.nineoldandroids.animation.Animator animator) {
            com.nineoldandroids.animation.AnimatorSet.Node node = (com.nineoldandroids.animation.AnimatorSet.Node) com.nineoldandroids.animation.AnimatorSet.this.mNodeMap.get(animator);
            if (node == null) {
                node = new com.nineoldandroids.animation.AnimatorSet.Node(animator);
                com.nineoldandroids.animation.AnimatorSet.this.mNodeMap.put(animator, node);
                com.nineoldandroids.animation.AnimatorSet.this.mNodes.add(node);
            }
            node.addDependency(new com.nineoldandroids.animation.AnimatorSet.Dependency(this.mCurrentNode, 1));
            return this;
        }

        public com.nineoldandroids.animation.AnimatorSet.Builder after(com.nineoldandroids.animation.Animator animator) {
            com.nineoldandroids.animation.AnimatorSet.Node node = (com.nineoldandroids.animation.AnimatorSet.Node) com.nineoldandroids.animation.AnimatorSet.this.mNodeMap.get(animator);
            if (node == null) {
                node = new com.nineoldandroids.animation.AnimatorSet.Node(animator);
                com.nineoldandroids.animation.AnimatorSet.this.mNodeMap.put(animator, node);
                com.nineoldandroids.animation.AnimatorSet.this.mNodes.add(node);
            }
            this.mCurrentNode.addDependency(new com.nineoldandroids.animation.AnimatorSet.Dependency(node, 1));
            return this;
        }

        public com.nineoldandroids.animation.AnimatorSet.Builder after(long j) {
            com.nineoldandroids.animation.ValueAnimator ofFloat = com.nineoldandroids.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(j);
            after(ofFloat);
            return this;
        }
    }
}
