package androidx.core.view;

/* loaded from: classes.dex */
public final class ViewPropertyAnimatorCompat {
    static final int LISTENER_TAG_ID = 2113929216;
    private java.lang.ref.WeakReference<android.view.View> mView;
    java.lang.Runnable mStartAction = null;
    java.lang.Runnable mEndAction = null;
    int mOldLayerType = -1;

    ViewPropertyAnimatorCompat(android.view.View view) {
        this.mView = new java.lang.ref.WeakReference<>(view);
    }

    static class ViewPropertyAnimatorListenerApi14 implements androidx.core.view.ViewPropertyAnimatorListener {
        boolean mAnimEndCalled;
        androidx.core.view.ViewPropertyAnimatorCompat mVpa;

        ViewPropertyAnimatorListenerApi14(androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
            this.mVpa = viewPropertyAnimatorCompat;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(android.view.View view) {
            this.mAnimEndCalled = false;
            if (this.mVpa.mOldLayerType > -1) {
                view.setLayerType(2, null);
            }
            if (this.mVpa.mStartAction != null) {
                java.lang.Runnable runnable = this.mVpa.mStartAction;
                this.mVpa.mStartAction = null;
                runnable.run();
            }
            java.lang.Object tag = view.getTag(androidx.core.view.ViewPropertyAnimatorCompat.LISTENER_TAG_ID);
            androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener = tag instanceof androidx.core.view.ViewPropertyAnimatorListener ? (androidx.core.view.ViewPropertyAnimatorListener) tag : null;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationStart(view);
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(android.view.View view) {
            if (this.mVpa.mOldLayerType > -1) {
                view.setLayerType(this.mVpa.mOldLayerType, null);
                this.mVpa.mOldLayerType = -1;
            }
            if (android.os.Build.VERSION.SDK_INT >= 16 || !this.mAnimEndCalled) {
                if (this.mVpa.mEndAction != null) {
                    java.lang.Runnable runnable = this.mVpa.mEndAction;
                    this.mVpa.mEndAction = null;
                    runnable.run();
                }
                java.lang.Object tag = view.getTag(androidx.core.view.ViewPropertyAnimatorCompat.LISTENER_TAG_ID);
                androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener = tag instanceof androidx.core.view.ViewPropertyAnimatorListener ? (androidx.core.view.ViewPropertyAnimatorListener) tag : null;
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.onAnimationEnd(view);
                }
                this.mAnimEndCalled = true;
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(android.view.View view) {
            java.lang.Object tag = view.getTag(androidx.core.view.ViewPropertyAnimatorCompat.LISTENER_TAG_ID);
            androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener = tag instanceof androidx.core.view.ViewPropertyAnimatorListener ? (androidx.core.view.ViewPropertyAnimatorListener) tag : null;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationCancel(view);
            }
        }
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setDuration(long j) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat alpha(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat alphaBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationX(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationY(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat withEndAction(java.lang.Runnable runnable) {
        android.view.View view = this.mView.get();
        if (view != null) {
            if (android.os.Build.VERSION.SDK_INT >= 16) {
                view.animate().withEndAction(runnable);
            } else {
                setListenerInternal(view, new androidx.core.view.ViewPropertyAnimatorCompat.ViewPropertyAnimatorListenerApi14(this));
                this.mEndAction = runnable;
            }
        }
        return this;
    }

    public long getDuration() {
        android.view.View view = this.mView.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setInterpolator(android.view.animation.Interpolator interpolator) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public android.view.animation.Interpolator getInterpolator() {
        android.view.View view = this.mView.get();
        if (view == null || android.os.Build.VERSION.SDK_INT < 18) {
            return null;
        }
        return (android.view.animation.Interpolator) view.animate().getInterpolator();
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setStartDelay(long j) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public long getStartDelay() {
        android.view.View view = this.mView.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotation(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationX(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationXBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationY(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationYBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleX(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleXBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleY(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleYBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    public void cancel() {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public androidx.core.view.ViewPropertyAnimatorCompat x(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat xBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat y(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat yBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationXBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationYBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationZBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null && android.os.Build.VERSION.SDK_INT >= 21) {
            view.animate().translationZBy(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationZ(float f) {
        android.view.View view = this.mView.get();
        if (view != null && android.os.Build.VERSION.SDK_INT >= 21) {
            view.animate().translationZ(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat z(float f) {
        android.view.View view = this.mView.get();
        if (view != null && android.os.Build.VERSION.SDK_INT >= 21) {
            view.animate().z(f);
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat zBy(float f) {
        android.view.View view = this.mView.get();
        if (view != null && android.os.Build.VERSION.SDK_INT >= 21) {
            view.animate().zBy(f);
        }
        return this;
    }

    public void start() {
        android.view.View view = this.mView.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public androidx.core.view.ViewPropertyAnimatorCompat withLayer() {
        android.view.View view = this.mView.get();
        if (view != null) {
            if (android.os.Build.VERSION.SDK_INT >= 16) {
                view.animate().withLayer();
            } else {
                this.mOldLayerType = view.getLayerType();
                setListenerInternal(view, new androidx.core.view.ViewPropertyAnimatorCompat.ViewPropertyAnimatorListenerApi14(this));
            }
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat withStartAction(java.lang.Runnable runnable) {
        android.view.View view = this.mView.get();
        if (view != null) {
            if (android.os.Build.VERSION.SDK_INT >= 16) {
                view.animate().withStartAction(runnable);
            } else {
                setListenerInternal(view, new androidx.core.view.ViewPropertyAnimatorCompat.ViewPropertyAnimatorListenerApi14(this));
                this.mStartAction = runnable;
            }
        }
        return this;
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setListener(androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        android.view.View view = this.mView.get();
        if (view != null) {
            if (android.os.Build.VERSION.SDK_INT >= 16) {
                setListenerInternal(view, viewPropertyAnimatorListener);
            } else {
                view.setTag(LISTENER_TAG_ID, viewPropertyAnimatorListener);
                setListenerInternal(view, new androidx.core.view.ViewPropertyAnimatorCompat.ViewPropertyAnimatorListenerApi14(this));
            }
        }
        return this;
    }

    private void setListenerInternal(final android.view.View view, final androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.core.view.ViewPropertyAnimatorCompat.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(android.animation.Animator animator) {
                    viewPropertyAnimatorListener.onAnimationCancel(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    viewPropertyAnimatorListener.onAnimationEnd(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator) {
                    viewPropertyAnimatorListener.onAnimationStart(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setUpdateListener(final androidx.core.view.ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        final android.view.View view = this.mView.get();
        if (view != null && android.os.Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(viewPropertyAnimatorUpdateListener != null ? new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.ViewPropertyAnimatorCompat.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    viewPropertyAnimatorUpdateListener.onAnimationUpdate(view);
                }
            } : null);
        }
        return this;
    }
}
