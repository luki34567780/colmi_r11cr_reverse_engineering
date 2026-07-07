package io.fotoapparat.view;

/* compiled from: FocusView.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u000f\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u001c\u0010\u0019\u001a\u00020\r2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lio/fotoapparat/view/FocusView;", "Landroid/widget/FrameLayout;", "Lio/fotoapparat/view/FocalPointSelector;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "focusMeteringListener", "Lkotlin/Function1;", "Lio/fotoapparat/hardware/metering/FocalRequest;", "", "gestureDetectorListener", "io/fotoapparat/view/FocusView$gestureDetectorListener$1", "Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;", "tapDetector", "Landroid/view/GestureDetector;", "visualFeedbackCircle", "Lio/fotoapparat/view/FeedbackCircleView;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setFocalPointListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class FocusView extends android.widget.FrameLayout implements io.fotoapparat.view.FocalPointSelector {
    private kotlin.jvm.functions.Function1<? super io.fotoapparat.hardware.metering.FocalRequest, kotlin.Unit> focusMeteringListener;
    private final io.fotoapparat.view.FocusView$gestureDetectorListener$1 gestureDetectorListener;
    private final android.view.GestureDetector tapDetector;
    private final io.fotoapparat.view.FeedbackCircleView visualFeedbackCircle;

    public FocusView(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    public FocusView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ FocusView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            android.util.AttributeSet r5 = (android.util.AttributeSet) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.view.FocusView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.fotoapparat.view.FocusView$gestureDetectorListener$1] */
    public FocusView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        io.fotoapparat.view.FeedbackCircleView feedbackCircleView = new io.fotoapparat.view.FeedbackCircleView(context, attributeSet, i);
        this.visualFeedbackCircle = feedbackCircleView;
        setClipToPadding(false);
        setClipChildren(false);
        addView(feedbackCircleView);
        ?? r3 = new android.view.GestureDetector.SimpleOnGestureListener() { // from class: io.fotoapparat.view.FocusView$gestureDetectorListener$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(android.view.MotionEvent e) {
                kotlin.jvm.functions.Function1 function1;
                io.fotoapparat.view.FeedbackCircleView feedbackCircleView2;
                io.fotoapparat.view.FeedbackCircleView feedbackCircleView3;
                io.fotoapparat.view.FeedbackCircleView feedbackCircleView4;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(e, "e");
                function1 = io.fotoapparat.view.FocusView.this.focusMeteringListener;
                if (function1 != null) {
                    function1.invoke(new io.fotoapparat.hardware.metering.FocalRequest(new io.fotoapparat.hardware.metering.PointF(e.getX(), e.getY()), new io.fotoapparat.parameter.Resolution(io.fotoapparat.view.FocusView.this.getWidth(), io.fotoapparat.view.FocusView.this.getHeight())));
                    feedbackCircleView2 = io.fotoapparat.view.FocusView.this.visualFeedbackCircle;
                    float x = e.getX();
                    feedbackCircleView3 = io.fotoapparat.view.FocusView.this.visualFeedbackCircle;
                    float width = x - (feedbackCircleView3.getWidth() / 2);
                    float y = e.getY();
                    feedbackCircleView4 = io.fotoapparat.view.FocusView.this.visualFeedbackCircle;
                    feedbackCircleView2.showAt$fotoapparat_release(width, y - (feedbackCircleView4.getHeight() / 2));
                    io.fotoapparat.view.FocusView.this.performClick();
                    return true;
                }
                return super.onSingleTapUp(e);
            }
        };
        this.gestureDetectorListener = r3;
        this.tapDetector = new android.view.GestureDetector(context, (android.view.GestureDetector.OnGestureListener) r3);
    }

    @Override // io.fotoapparat.view.FocalPointSelector
    public void setFocalPointListener(kotlin.jvm.functions.Function1<? super io.fotoapparat.hardware.metering.FocalRequest, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(listener, "listener");
        this.focusMeteringListener = listener;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(event, "event");
        this.tapDetector.onTouchEvent(event);
        return true;
    }
}
