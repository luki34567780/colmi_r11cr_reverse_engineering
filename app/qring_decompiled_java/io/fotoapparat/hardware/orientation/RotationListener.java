package io.fotoapparat.hardware.orientation;

/* compiled from: RotationListener.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\u000f\u001a\u00060\u0007j\u0002`\bH\u0016R*\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lio/fotoapparat/hardware/orientation/RotationListener;", "Landroid/view/OrientationEventListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "orientationChanged", "Lkotlin/Function1;", "", "Lio/fotoapparat/hardware/orientation/DeviceRotationDegrees;", "", "getOrientationChanged", "()Lkotlin/jvm/functions/Function1;", "setOrientationChanged", "(Lkotlin/jvm/functions/Function1;)V", "onOrientationChanged", "orientation", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public class RotationListener extends android.view.OrientationEventListener {
    public kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> orientationChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RotationListener(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOrientationChanged() {
        kotlin.jvm.functions.Function1 function1 = this.orientationChanged;
        if (function1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("orientationChanged");
        }
        return function1;
    }

    public final void setOrientationChanged(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.orientationChanged = function1;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int orientation) {
        if (canDetectOrientation()) {
            kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1 = this.orientationChanged;
            if (function1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("orientationChanged");
            }
            function1.invoke(java.lang.Integer.valueOf(orientation));
        }
    }
}
