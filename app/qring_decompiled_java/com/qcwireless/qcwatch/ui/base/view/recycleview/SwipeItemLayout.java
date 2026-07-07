package com.qcwireless.qcwatch.ui.base.view.recycleview;

/* loaded from: /tmp/dex/classes2.dex */
public class SwipeItemLayout extends android.view.ViewGroup {
    private static final android.view.animation.Interpolator sInterpolator = new android.view.animation.Interpolator() { // from class: com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float t) {
            float f = t - 1.0f;
            return (f * f * f * f * f) + 1.0f;
        }
    };
    private boolean mInLayout;
    private boolean mIsLaidOut;
    private android.view.ViewGroup mMainView;
    private int mMaxScrollOffset;
    private int mScrollOffset;
    private com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.ScrollRunnable mScrollRunnable;
    private android.view.ViewGroup mSideView;
    private com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode mTouchMode;

    enum Mode {
        RESET,
        DRAG,
        FLING,
        TAP
    }

    public SwipeItemLayout(android.content.Context context) {
        this(context, null);
    }

    public SwipeItemLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mTouchMode = com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.RESET;
        this.mScrollOffset = 0;
        this.mIsLaidOut = false;
        this.mScrollRunnable = new com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.ScrollRunnable(context);
    }

    public boolean isOpen() {
        return this.mScrollOffset != 0;
    }

    com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode getTouchMode() {
        return this.mTouchMode;
    }

    /* renamed from: com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$qcwireless$qcwatch$ui$base$view$recycleview$SwipeItemLayout$Mode;

        static {
            int[] iArr = new int[com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.values().length];
            $SwitchMap$com$qcwireless$qcwatch$ui$base$view$recycleview$SwipeItemLayout$Mode = iArr;
            try {
                iArr[com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.FLING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$qcwireless$qcwatch$ui$base$view$recycleview$SwipeItemLayout$Mode[com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.RESET.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    void setTouchMode(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode mode) {
        if (com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.AnonymousClass2.$SwitchMap$com$qcwireless$qcwatch$ui$base$view$recycleview$SwipeItemLayout$Mode[this.mTouchMode.ordinal()] == 1) {
            this.mScrollRunnable.abort();
        }
        this.mTouchMode = mode;
    }

    public void open() {
        if (this.mScrollOffset != (-this.mMaxScrollOffset)) {
            if (this.mTouchMode == com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.FLING && this.mScrollRunnable.isScrollToLeft()) {
                return;
            }
            if (this.mTouchMode == com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.FLING) {
                this.mScrollRunnable.abort();
            }
            this.mScrollRunnable.startScroll(this.mScrollOffset, -this.mMaxScrollOffset);
        }
    }

    public void close() {
        if (this.mScrollOffset != 0) {
            if (this.mTouchMode != com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.FLING || this.mScrollRunnable.isScrollToLeft()) {
                if (this.mTouchMode == com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.FLING) {
                    this.mScrollRunnable.abort();
                }
                this.mScrollRunnable.startScroll(this.mScrollOffset, 0);
            }
        }
    }

    void fling(int xVel) {
        this.mScrollRunnable.startFling(this.mScrollOffset, xVel);
    }

    void revise() {
        if (this.mScrollOffset < (-this.mMaxScrollOffset) / 2) {
            open();
        } else {
            close();
        }
    }

    boolean trackMotionScroll(int deltaX) {
        boolean z = false;
        if (deltaX == 0) {
            return false;
        }
        int i = this.mScrollOffset + deltaX;
        if ((deltaX > 0 && i > 0) || (deltaX < 0 && i < (-this.mMaxScrollOffset))) {
            i = java.lang.Math.max(java.lang.Math.min(i, 0), -this.mMaxScrollOffset);
            z = true;
        }
        offsetChildrenLeftAndRight(i - this.mScrollOffset);
        this.mScrollOffset = i;
        return z;
    }

    private boolean ensureChildren() {
        if (getChildCount() != 2) {
            return false;
        }
        android.view.View childAt = getChildAt(0);
        if (!(childAt instanceof android.view.ViewGroup)) {
            return false;
        }
        this.mMainView = (android.view.ViewGroup) childAt;
        android.view.View childAt2 = getChildAt(1);
        if (!(childAt2 instanceof android.view.ViewGroup)) {
            return false;
        }
        this.mSideView = (android.view.ViewGroup) childAt2;
        return true;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!ensureChildren()) {
            throw new java.lang.RuntimeException("SwipeItemLayout的子视图不符合规定");
        }
        int mode = android.view.View.MeasureSpec.getMode(widthMeasureSpec);
        int size = android.view.View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = android.view.View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = android.view.View.MeasureSpec.getSize(heightMeasureSpec);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.mMainView.getLayoutParams();
        int i = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        int i2 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        measureChildWithMargins(this.mMainView, widthMeasureSpec, i + paddingLeft, heightMeasureSpec, i2 + paddingTop);
        if (mode == Integer.MIN_VALUE) {
            size = java.lang.Math.min(size, this.mMainView.getMeasuredWidth() + i + paddingLeft);
        } else if (mode == 0) {
            size = this.mMainView.getMeasuredWidth() + i + paddingLeft;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = java.lang.Math.min(size2, this.mMainView.getMeasuredHeight() + i2 + paddingTop);
        } else if (mode2 == 0) {
            size2 = this.mMainView.getMeasuredHeight() + i2 + paddingTop;
        }
        setMeasuredDimension(size, size2);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) this.mSideView.getLayoutParams();
        this.mSideView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - (marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin)) - paddingTop, 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        if (!ensureChildren()) {
            throw new java.lang.RuntimeException("SwipeItemLayout的子视图不符合规定");
        }
        this.mInLayout = true;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.mMainView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) this.mSideView.getLayoutParams();
        int i = paddingLeft + marginLayoutParams.leftMargin;
        int i2 = marginLayoutParams.topMargin + paddingTop;
        int width = getWidth() - (paddingRight + marginLayoutParams.rightMargin);
        this.mMainView.layout(i, i2, width, getHeight() - (marginLayoutParams.bottomMargin + paddingBottom));
        int i3 = width + marginLayoutParams2.leftMargin;
        this.mSideView.layout(i3, paddingTop + marginLayoutParams2.topMargin, marginLayoutParams2.leftMargin + i3 + marginLayoutParams2.rightMargin + this.mSideView.getMeasuredWidth(), getHeight() - (marginLayoutParams2.bottomMargin + paddingBottom));
        int width2 = this.mSideView.getWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
        this.mMaxScrollOffset = width2;
        int i4 = this.mScrollOffset < (-width2) / 2 ? -width2 : 0;
        this.mScrollOffset = i4;
        offsetChildrenLeftAndRight(i4);
        this.mInLayout = false;
        this.mIsLaidOut = true;
    }

    void offsetChildrenLeftAndRight(int delta) {
        androidx.core.view.ViewCompat.offsetLeftAndRight(this.mMainView, delta);
        androidx.core.view.ViewCompat.offsetLeftAndRight(this.mSideView, delta);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p) {
        return p instanceof android.view.ViewGroup.MarginLayoutParams ? p : new android.view.ViewGroup.MarginLayoutParams(p);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) {
        return (p instanceof android.view.ViewGroup.MarginLayoutParams) && super.checkLayoutParams(p);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.mScrollOffset;
        if (i != 0 && this.mIsLaidOut) {
            offsetChildrenLeftAndRight(-i);
            this.mScrollOffset = 0;
        } else {
            this.mScrollOffset = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.mScrollOffset;
        if (i != 0 && this.mIsLaidOut) {
            offsetChildrenLeftAndRight(-i);
            this.mScrollOffset = 0;
        } else {
            this.mScrollOffset = 0;
        }
        removeCallbacks(this.mScrollRunnable);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
        android.view.View findTopChildUnder;
        int actionMasked = ev.getActionMasked();
        if (actionMasked != 0) {
            return actionMasked == 1 && (findTopChildUnder = findTopChildUnder(this, (int) ev.getX(), (int) ev.getY())) != null && findTopChildUnder == this.mMainView && this.mTouchMode == com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.TAP && this.mScrollOffset != 0;
        }
        android.view.View findTopChildUnder2 = findTopChildUnder(this, (int) ev.getX(), (int) ev.getY());
        return (findTopChildUnder2 == null || findTopChildUnder2 != this.mMainView || this.mScrollOffset == 0) ? false : true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev) {
        android.view.View findTopChildUnder;
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            android.view.View findTopChildUnder2 = findTopChildUnder(this, (int) ev.getX(), (int) ev.getY());
            return (findTopChildUnder2 == null || findTopChildUnder2 != this.mMainView || this.mScrollOffset == 0) ? false : true;
        }
        if (actionMasked != 1 || (findTopChildUnder = findTopChildUnder(this, (int) ev.getX(), (int) ev.getY())) == null || findTopChildUnder != this.mMainView || this.mTouchMode != com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.TAP || this.mScrollOffset == 0) {
            return false;
        }
        close();
        return true;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        if (getVisibility() != 0) {
            this.mScrollOffset = 0;
            invalidate();
        }
    }

    class ScrollRunnable implements java.lang.Runnable {
        private static final int FLING_DURATION = 200;
        private int mMinVelocity;
        private android.widget.Scroller mScroller;
        private boolean mAbort = false;
        private boolean mScrollToLeft = false;

        ScrollRunnable(android.content.Context context) {
            this.mScroller = new android.widget.Scroller(context, com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.sInterpolator);
            this.mMinVelocity = android.view.ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        }

        void startScroll(int startX, int endX) {
            if (startX != endX) {
                com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this.setTouchMode(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.FLING);
                this.mAbort = false;
                this.mScrollToLeft = endX < startX;
                this.mScroller.startScroll(startX, 0, endX - startX, 0, 400);
                androidx.core.view.ViewCompat.postOnAnimation(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this, this);
            }
        }

        void startFling(int startX, int xVel) {
            int i = this.mMinVelocity;
            if (xVel <= i || startX == 0) {
                if (xVel >= (-i) || startX == (-com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this.mMaxScrollOffset)) {
                    startScroll(startX, startX <= (-com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this.mMaxScrollOffset) / 2 ? -com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this.mMaxScrollOffset : 0);
                    return;
                } else {
                    startScroll(startX, -com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this.mMaxScrollOffset);
                    return;
                }
            }
            startScroll(startX, 0);
        }

        void abort() {
            if (this.mAbort) {
                return;
            }
            this.mAbort = true;
            if (this.mScroller.isFinished()) {
                return;
            }
            this.mScroller.abortAnimation();
            com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this.removeCallbacks(this);
        }

        boolean isScrollToLeft() {
            return this.mScrollToLeft;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mAbort) {
                return;
            }
            boolean computeScrollOffset = this.mScroller.computeScrollOffset();
            int currX = this.mScroller.getCurrX();
            com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout swipeItemLayout = com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this;
            boolean trackMotionScroll = swipeItemLayout.trackMotionScroll(currX - swipeItemLayout.mScrollOffset);
            if (computeScrollOffset && !trackMotionScroll) {
                androidx.core.view.ViewCompat.postOnAnimation(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this, this);
                return;
            }
            if (trackMotionScroll) {
                com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this.removeCallbacks(this);
                if (!this.mScroller.isFinished()) {
                    this.mScroller.abortAnimation();
                }
                com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this.setTouchMode(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.RESET);
            }
            if (computeScrollOffset) {
                return;
            }
            com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this.setTouchMode(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.RESET);
            if (com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this.mScrollOffset != 0) {
                if (java.lang.Math.abs(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this.mScrollOffset) <= com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this.mMaxScrollOffset / 2) {
                    com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this.mScrollOffset = 0;
                } else {
                    com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout swipeItemLayout2 = com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this;
                    swipeItemLayout2.mScrollOffset = -swipeItemLayout2.mMaxScrollOffset;
                }
                androidx.core.view.ViewCompat.postOnAnimation(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.this, this);
            }
        }
    }

    public static class OnSwipeItemTouchListener implements androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {
        private int mActivePointerId;
        private com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout mCaptureItem;
        private boolean mDealByParent;
        private boolean mIsProbeParent;
        private float mLastMotionX;
        private float mLastMotionY;
        private int mMaximumVelocity;
        private int mTouchSlop;
        private android.view.VelocityTracker mVelocityTracker;

        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        }

        public OnSwipeItemTouchListener(android.content.Context context) {
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
            this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            this.mActivePointerId = -1;
            this.mDealByParent = false;
            this.mIsProbeParent = false;
        }

        public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView rv, android.view.MotionEvent ev) {
            com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout swipeItemLayout;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            android.view.ViewParent parent;
            com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout swipeItemLayout2;
            boolean z5 = false;
            if (this.mIsProbeParent) {
                return false;
            }
            int actionMasked = ev.getActionMasked();
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = android.view.VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(ev);
            if (actionMasked == 0) {
                this.mActivePointerId = ev.getPointerId(0);
                float x = ev.getX();
                float y = ev.getY();
                this.mLastMotionX = x;
                this.mLastMotionY = y;
                android.view.View findTopChildUnder = com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.findTopChildUnder(rv, (int) x, (int) y);
                if (findTopChildUnder == null || !(findTopChildUnder instanceof com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout)) {
                    swipeItemLayout = null;
                    z = true;
                } else {
                    swipeItemLayout = (com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout) findTopChildUnder;
                    z = false;
                }
                if (!z && ((swipeItemLayout2 = this.mCaptureItem) == null || swipeItemLayout2 != swipeItemLayout)) {
                    z = true;
                }
                if (!z) {
                    if (this.mCaptureItem.getTouchMode() == com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.FLING) {
                        this.mCaptureItem.setTouchMode(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.DRAG);
                        z4 = true;
                        z3 = true;
                    } else {
                        this.mCaptureItem.setTouchMode(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.TAP);
                        z4 = this.mCaptureItem.isOpen();
                        z3 = false;
                    }
                    if (z4 && (parent = rv.getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                } else {
                    com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout swipeItemLayout3 = this.mCaptureItem;
                    if (swipeItemLayout3 == null || !swipeItemLayout3.isOpen()) {
                        z2 = false;
                    } else {
                        this.mCaptureItem.close();
                        this.mCaptureItem = null;
                        z2 = true;
                    }
                    if (swipeItemLayout != null) {
                        this.mCaptureItem = swipeItemLayout;
                        swipeItemLayout.setTouchMode(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.TAP);
                    } else {
                        this.mCaptureItem = null;
                    }
                    z3 = z2;
                }
                this.mIsProbeParent = true;
                boolean onInterceptTouchEvent = rv.onInterceptTouchEvent(ev);
                this.mDealByParent = onInterceptTouchEvent;
                this.mIsProbeParent = false;
                if (onInterceptTouchEvent) {
                    return false;
                }
                return z3;
            }
            if (actionMasked == 1) {
                com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout swipeItemLayout4 = this.mCaptureItem;
                if (swipeItemLayout4 != null && swipeItemLayout4.getTouchMode() == com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.DRAG) {
                    android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
                    velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                    this.mCaptureItem.fling((int) velocityTracker.getXVelocity(this.mActivePointerId));
                    z5 = true;
                }
                cancel();
                return z5;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout swipeItemLayout5 = this.mCaptureItem;
                    if (swipeItemLayout5 != null) {
                        swipeItemLayout5.revise();
                    }
                    cancel();
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = ev.getActionIndex();
                    this.mActivePointerId = ev.getPointerId(actionIndex);
                    this.mLastMotionX = ev.getX(actionIndex);
                    this.mLastMotionY = ev.getY(actionIndex);
                    return false;
                }
                if (actionMasked != 6) {
                    return false;
                }
                int actionIndex2 = ev.getActionIndex();
                if (ev.getPointerId(actionIndex2) != this.mActivePointerId) {
                    return false;
                }
                int i = actionIndex2 != 0 ? 0 : 1;
                this.mActivePointerId = ev.getPointerId(i);
                this.mLastMotionX = ev.getX(i);
                this.mLastMotionY = ev.getY(i);
                return false;
            }
            int findPointerIndex = ev.findPointerIndex(this.mActivePointerId);
            if (findPointerIndex == -1) {
                return false;
            }
            if (this.mDealByParent) {
                com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout swipeItemLayout6 = this.mCaptureItem;
                if (swipeItemLayout6 != null && swipeItemLayout6.isOpen()) {
                    this.mCaptureItem.close();
                }
                return false;
            }
            int x2 = (int) (ev.getX(findPointerIndex) + 0.5f);
            float f = x2;
            int i2 = (int) (f - this.mLastMotionX);
            float y2 = (int) (((int) ev.getY(findPointerIndex)) + 0.5f);
            int i3 = (int) (y2 - this.mLastMotionY);
            int abs = java.lang.Math.abs(i2);
            int abs2 = java.lang.Math.abs(i3);
            com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout swipeItemLayout7 = this.mCaptureItem;
            if (swipeItemLayout7 == null || this.mDealByParent) {
                return false;
            }
            if (swipeItemLayout7.getTouchMode() == com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.TAP) {
                if (abs > this.mTouchSlop && abs > abs2) {
                    this.mCaptureItem.setTouchMode(com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.DRAG);
                    rv.getParent().requestDisallowInterceptTouchEvent(true);
                    int i4 = this.mTouchSlop;
                    i2 = i2 > 0 ? i2 - i4 : i2 + i4;
                } else {
                    this.mIsProbeParent = true;
                    boolean onInterceptTouchEvent2 = rv.onInterceptTouchEvent(ev);
                    this.mIsProbeParent = false;
                    if (onInterceptTouchEvent2) {
                        this.mDealByParent = true;
                        this.mCaptureItem.close();
                    }
                }
            }
            if (this.mCaptureItem.getTouchMode() != com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.DRAG) {
                return false;
            }
            this.mLastMotionX = f;
            this.mLastMotionY = y2;
            this.mCaptureItem.trackMotionScroll(i2);
            return true;
        }

        public void onTouchEvent(androidx.recyclerview.widget.RecyclerView rv, android.view.MotionEvent ev) {
            int actionMasked = ev.getActionMasked();
            int actionIndex = ev.getActionIndex();
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = android.view.VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(ev);
            if (actionMasked == 1) {
                com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout swipeItemLayout = this.mCaptureItem;
                if (swipeItemLayout != null && swipeItemLayout.getTouchMode() == com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.DRAG) {
                    android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
                    velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                    this.mCaptureItem.fling((int) velocityTracker.getXVelocity(this.mActivePointerId));
                }
                cancel();
                return;
            }
            if (actionMasked == 2) {
                int findPointerIndex = ev.findPointerIndex(this.mActivePointerId);
                if (findPointerIndex == -1) {
                    return;
                }
                float x = ev.getX(findPointerIndex);
                float y = (int) ev.getY(findPointerIndex);
                int i = (int) (x - this.mLastMotionX);
                com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout swipeItemLayout2 = this.mCaptureItem;
                if (swipeItemLayout2 == null || swipeItemLayout2.getTouchMode() != com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout.Mode.DRAG) {
                    return;
                }
                this.mLastMotionX = x;
                this.mLastMotionY = y;
                this.mCaptureItem.trackMotionScroll(i);
                return;
            }
            if (actionMasked == 3) {
                com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout swipeItemLayout3 = this.mCaptureItem;
                if (swipeItemLayout3 != null) {
                    swipeItemLayout3.revise();
                }
                cancel();
                return;
            }
            if (actionMasked == 5) {
                this.mActivePointerId = ev.getPointerId(actionIndex);
                this.mLastMotionX = ev.getX(actionIndex);
                this.mLastMotionY = ev.getY(actionIndex);
            } else if (actionMasked == 6 && ev.getPointerId(actionIndex) == this.mActivePointerId) {
                int i2 = actionIndex != 0 ? 0 : 1;
                this.mActivePointerId = ev.getPointerId(i2);
                this.mLastMotionX = ev.getX(i2);
                this.mLastMotionY = ev.getY(i2);
            }
        }

        void cancel() {
            this.mDealByParent = false;
            this.mActivePointerId = -1;
            android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.mVelocityTracker = null;
            }
        }
    }

    static android.view.View findTopChildUnder(android.view.ViewGroup parent, int x, int y) {
        for (int childCount = parent.getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = parent.getChildAt(childCount);
            if (x >= childAt.getLeft() && x < childAt.getRight() && y >= childAt.getTop() && y < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public static void closeAllItems(androidx.recyclerview.widget.RecyclerView recyclerView) {
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout) {
                com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout swipeItemLayout = (com.qcwireless.qcwatch.ui.base.view.recycleview.SwipeItemLayout) childAt;
                if (swipeItemLayout.isOpen()) {
                    swipeItemLayout.close();
                }
            }
        }
    }
}
