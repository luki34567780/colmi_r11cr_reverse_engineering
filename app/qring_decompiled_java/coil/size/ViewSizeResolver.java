package coil.size;

/* compiled from: ViewSizeResolver.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\"\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0002J\u0011\u0010\u0015\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcoil/size/ViewSizeResolver;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "Lcoil/size/SizeResolver;", "subtractPadding", "", "getSubtractPadding", "()Z", "view", "getView", "()Landroid/view/View;", "getDimension", "Lcoil/size/Dimension;", "paramSize", "", "viewSize", "paddingSize", "getHeight", "getSize", "Lcoil/size/Size;", "getWidth", "size", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removePreDrawListenerSafe", "", "Landroid/view/ViewTreeObserver;", "victim", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ViewSizeResolver<T extends android.view.View> extends coil.size.SizeResolver {
    boolean getSubtractPadding();

    T getView();

    @Override // coil.size.SizeResolver
    java.lang.Object size(kotlin.coroutines.Continuation<? super coil.size.Size> continuation);

    /* compiled from: ViewSizeResolver.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends android.view.View> boolean getSubtractPadding(coil.size.ViewSizeResolver<T> viewSizeResolver) {
            return true;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [coil.size.ViewSizeResolver$size$3$preDrawListener$1] */
        public static <T extends android.view.View> java.lang.Object size(final coil.size.ViewSizeResolver<T> viewSizeResolver, kotlin.coroutines.Continuation<? super coil.size.Size> continuation) {
            coil.size.Size size = getSize(viewSizeResolver);
            if (size != null) {
                return size;
            }
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            final android.view.ViewTreeObserver viewTreeObserver = viewSizeResolver.getView().getViewTreeObserver();
            final ?? r3 = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: coil.size.ViewSizeResolver$size$3$preDrawListener$1
                private boolean isResumed;

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    coil.size.Size size2;
                    size2 = coil.size.ViewSizeResolver.DefaultImpls.getSize(viewSizeResolver);
                    if (size2 != null) {
                        coil.size.ViewSizeResolver.DefaultImpls.removePreDrawListenerSafe(viewSizeResolver, viewTreeObserver, this);
                        if (!this.isResumed) {
                            this.isResumed = true;
                            kotlinx.coroutines.CancellableContinuation<coil.size.Size> cancellableContinuation = cancellableContinuationImpl2;
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            cancellableContinuation.resumeWith(kotlin.Result.m1091constructorimpl(size2));
                        }
                    }
                    return true;
                }
            };
            viewTreeObserver.addOnPreDrawListener((android.view.ViewTreeObserver.OnPreDrawListener) r3);
            cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: coil.size.ViewSizeResolver$size$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    invoke2(th);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Throwable th) {
                    coil.size.ViewSizeResolver.DefaultImpls.removePreDrawListenerSafe(viewSizeResolver, viewTreeObserver, r3);
                }
            });
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends android.view.View> coil.size.Size getSize(coil.size.ViewSizeResolver<T> viewSizeResolver) {
            coil.size.Dimension height;
            coil.size.Dimension width = getWidth(viewSizeResolver);
            if (width == null || (height = getHeight(viewSizeResolver)) == null) {
                return null;
            }
            return new coil.size.Size(width, height);
        }

        private static <T extends android.view.View> coil.size.Dimension getWidth(coil.size.ViewSizeResolver<T> viewSizeResolver) {
            android.view.ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            return getDimension(viewSizeResolver, layoutParams == null ? -1 : layoutParams.width, viewSizeResolver.getView().getWidth(), viewSizeResolver.getSubtractPadding() ? viewSizeResolver.getView().getPaddingLeft() + viewSizeResolver.getView().getPaddingRight() : 0);
        }

        private static <T extends android.view.View> coil.size.Dimension getHeight(coil.size.ViewSizeResolver<T> viewSizeResolver) {
            android.view.ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            return getDimension(viewSizeResolver, layoutParams == null ? -1 : layoutParams.height, viewSizeResolver.getView().getHeight(), viewSizeResolver.getSubtractPadding() ? viewSizeResolver.getView().getPaddingTop() + viewSizeResolver.getView().getPaddingBottom() : 0);
        }

        private static <T extends android.view.View> coil.size.Dimension getDimension(coil.size.ViewSizeResolver<T> viewSizeResolver, int i, int i2, int i3) {
            if (i == -2) {
                return coil.size.Dimension.Undefined.INSTANCE;
            }
            int i4 = i - i3;
            if (i4 > 0) {
                return coil.size.Dimensions.Dimension(i4);
            }
            int i5 = i2 - i3;
            if (i5 > 0) {
                return coil.size.Dimensions.Dimension(i5);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends android.view.View> void removePreDrawListenerSafe(coil.size.ViewSizeResolver<T> viewSizeResolver, android.view.ViewTreeObserver viewTreeObserver, android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                viewSizeResolver.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }
    }
}
