package io.fotoapparat.hardware.orientation;

/* compiled from: OrientationSensor.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u001c\u0010\u0016\u001a\u00020\u00122\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lio/fotoapparat/hardware/orientation/OrientationSensor;", "", "context", "Landroid/content/Context;", "device", "Lio/fotoapparat/hardware/Device;", "(Landroid/content/Context;Lio/fotoapparat/hardware/Device;)V", "rotationListener", "Lio/fotoapparat/hardware/orientation/RotationListener;", "(Lio/fotoapparat/hardware/orientation/RotationListener;Lio/fotoapparat/hardware/Device;)V", "lastKnownOrientationState", "Lio/fotoapparat/hardware/orientation/OrientationState;", "getLastKnownOrientationState", "()Lio/fotoapparat/hardware/orientation/OrientationState;", "setLastKnownOrientationState", "(Lio/fotoapparat/hardware/orientation/OrientationState;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "onOrientationChanged", "", "Lio/fotoapparat/hardware/orientation/DeviceRotationDegrees;", "start", "stop", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public class OrientationSensor {
    private final io.fotoapparat.hardware.Device device;
    private io.fotoapparat.hardware.orientation.OrientationState lastKnownOrientationState;
    private kotlin.jvm.functions.Function1<? super io.fotoapparat.hardware.orientation.OrientationState, kotlin.Unit> listener;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onOrientationChanged;
    private final io.fotoapparat.hardware.orientation.RotationListener rotationListener;

    public OrientationSensor(io.fotoapparat.hardware.orientation.RotationListener rotationListener, io.fotoapparat.hardware.Device device) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(rotationListener, "rotationListener");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(device, "device");
        this.rotationListener = rotationListener;
        this.device = device;
        kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit>() { // from class: io.fotoapparat.hardware.orientation.OrientationSensor$onOrientationChanged$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num) {
                invoke(num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(int i) {
                io.fotoapparat.hardware.Device device2;
                io.fotoapparat.hardware.orientation.Orientation orientation = io.fotoapparat.hardware.orientation.OrientationKt.toOrientation(io.fotoapparat.hardware.orientation.RotationKt.toClosestRightAngle(i));
                device2 = io.fotoapparat.hardware.orientation.OrientationSensor.this.device;
                io.fotoapparat.hardware.orientation.OrientationState orientationState = new io.fotoapparat.hardware.orientation.OrientationState(orientation, device2.getScreenOrientation());
                if (!kotlin.jvm.internal.Intrinsics.areEqual(orientationState, io.fotoapparat.hardware.orientation.OrientationSensor.this.getLastKnownOrientationState())) {
                    io.fotoapparat.hardware.orientation.OrientationSensor.this.setLastKnownOrientationState(orientationState);
                    io.fotoapparat.hardware.orientation.OrientationSensor.access$getListener$p(io.fotoapparat.hardware.orientation.OrientationSensor.this).invoke(orientationState);
                }
            }
        };
        this.onOrientationChanged = function1;
        this.lastKnownOrientationState = new io.fotoapparat.hardware.orientation.OrientationState(io.fotoapparat.hardware.orientation.Orientation.Vertical.Portrait.INSTANCE, device.getScreenOrientation());
        rotationListener.setOrientationChanged(function1);
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$getListener$p(io.fotoapparat.hardware.orientation.OrientationSensor orientationSensor) {
        kotlin.jvm.functions.Function1<? super io.fotoapparat.hardware.orientation.OrientationState, kotlin.Unit> function1 = orientationSensor.listener;
        if (function1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        return function1;
    }

    public io.fotoapparat.hardware.orientation.OrientationState getLastKnownOrientationState() {
        return this.lastKnownOrientationState;
    }

    public void setLastKnownOrientationState(io.fotoapparat.hardware.orientation.OrientationState orientationState) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(orientationState, "<set-?>");
        this.lastKnownOrientationState = orientationState;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrientationSensor(android.content.Context context, io.fotoapparat.hardware.Device device) {
        this(new io.fotoapparat.hardware.orientation.RotationListener(context), device);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(device, "device");
    }

    public void start(kotlin.jvm.functions.Function1<? super io.fotoapparat.hardware.orientation.OrientationState, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(listener, "listener");
        this.listener = listener;
        this.rotationListener.enable();
    }

    public void stop() {
        this.rotationListener.disable();
    }
}
