package com.qcwireless.qcwatch.ui.device.camera;

/* compiled from: CameraActivity.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B4\b\u0004\u0012#\u0010\u0002\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006¢\u0006\u0002\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR.\u0010\u0002\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006¢\u0006\u0002\b\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/camera/Camera;", "", "lensPosition", "Lkotlin/Function1;", "", "Lio/fotoapparat/characteristic/LensPosition;", "Lio/fotoapparat/selector/LensPositionSelector;", "Lkotlin/ExtensionFunctionType;", "configuration", "Lio/fotoapparat/configuration/CameraConfiguration;", "(Lkotlin/jvm/functions/Function1;Lio/fotoapparat/configuration/CameraConfiguration;)V", "getConfiguration", "()Lio/fotoapparat/configuration/CameraConfiguration;", "getLensPosition", "()Lkotlin/jvm/functions/Function1;", "Back", "Front", "Lcom/qcwireless/qcwatch/ui/device/camera/Camera$Back;", "Lcom/qcwireless/qcwatch/ui/device/camera/Camera$Front;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public abstract class Camera {
    private final io.fotoapparat.configuration.CameraConfiguration configuration;
    private final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.characteristic.LensPosition>, io.fotoapparat.characteristic.LensPosition> lensPosition;

    public /* synthetic */ Camera(kotlin.jvm.functions.Function1 function1, io.fotoapparat.configuration.CameraConfiguration cameraConfiguration, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, cameraConfiguration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Camera(kotlin.jvm.functions.Function1<? super java.lang.Iterable<? extends io.fotoapparat.characteristic.LensPosition>, ? extends io.fotoapparat.characteristic.LensPosition> function1, io.fotoapparat.configuration.CameraConfiguration cameraConfiguration) {
        this.lensPosition = function1;
        this.configuration = cameraConfiguration;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Iterable<? extends io.fotoapparat.characteristic.LensPosition>, io.fotoapparat.characteristic.LensPosition> getLensPosition() {
        return this.lensPosition;
    }

    public final io.fotoapparat.configuration.CameraConfiguration getConfiguration() {
        return this.configuration;
    }

    /* compiled from: CameraActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/camera/Camera$Back;", "Lcom/qcwireless/qcwatch/ui/device/camera/Camera;", "()V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Back extends com.qcwireless.qcwatch.ui.device.camera.Camera {
        public static final com.qcwireless.qcwatch.ui.device.camera.Camera.Back INSTANCE = new com.qcwireless.qcwatch.ui.device.camera.Camera.Back();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Back() {
            /*
                r21 = this;
                kotlin.jvm.functions.Function1 r0 = io.fotoapparat.selector.LensPositionSelectorsKt.back()
                r1 = 2
                kotlin.jvm.functions.Function1[] r2 = new kotlin.jvm.functions.Function1[r1]
                kotlin.jvm.functions.Function1 r3 = io.fotoapparat.selector.ResolutionSelectorsKt.highestResolution()
                r4 = 0
                r6 = 0
                kotlin.jvm.functions.Function1 r3 = io.fotoapparat.selector.AspectRatioSelectorsKt.wideRatio$default(r3, r4, r1, r6)
                r7 = 0
                r2[r7] = r3
                kotlin.jvm.functions.Function1 r3 = io.fotoapparat.selector.ResolutionSelectorsKt.highestResolution()
                kotlin.jvm.functions.Function1 r3 = io.fotoapparat.selector.AspectRatioSelectorsKt.standardRatio$default(r3, r4, r1, r6)
                r4 = 1
                r2[r4] = r3
                kotlin.jvm.functions.Function1 r18 = io.fotoapparat.selector.SelectorsKt.firstAvailable(r2)
                kotlin.jvm.functions.Function1 r14 = io.fotoapparat.selector.PreviewFpsRangeSelectorsKt.highestFps()
                kotlin.jvm.functions.Function1 r9 = io.fotoapparat.selector.FlashSelectorsKt.off()
                kotlin.jvm.functions.Function1[] r1 = new kotlin.jvm.functions.Function1[r1]
                kotlin.jvm.functions.Function1 r2 = io.fotoapparat.selector.FocusModeSelectorsKt.continuousFocusPicture()
                r1[r7] = r2
                kotlin.jvm.functions.Function1 r2 = io.fotoapparat.selector.FocusModeSelectorsKt.autoFocus()
                r1[r4] = r2
                kotlin.jvm.functions.Function1 r10 = io.fotoapparat.selector.SelectorsKt.firstAvailable(r1)
                io.fotoapparat.configuration.CameraConfiguration r1 = new io.fotoapparat.configuration.CameraConfiguration
                com.qcwireless.qcwatch.ui.device.camera.Camera$Back$1 r2 = new kotlin.jvm.functions.Function1<io.fotoapparat.preview.Frame, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.camera.Camera.Back.1
                    static {
                        /*
                            com.qcwireless.qcwatch.ui.device.camera.Camera$Back$1 r0 = new com.qcwireless.qcwatch.ui.device.camera.Camera$Back$1
                            r0.<init>()
                            
                            // error: 0x0005: SPUT (r0 I:com.qcwireless.qcwatch.ui.device.camera.Camera$Back$1) com.qcwireless.qcwatch.ui.device.camera.Camera.Back.1.INSTANCE com.qcwireless.qcwatch.ui.device.camera.Camera$Back$1
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.camera.Camera.Back.AnonymousClass1.<clinit>():void");
                    }

                    {
                        /*
                            r1 = this;
                            r0 = 1
                            r1.<init>(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.camera.Camera.Back.AnonymousClass1.<init>():void");
                    }

                    public final void invoke(io.fotoapparat.preview.Frame r2) {
                        /*
                            r1 = this;
                            java.lang.String r0 = "it"
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.camera.Camera.Back.AnonymousClass1.invoke(io.fotoapparat.preview.Frame):void");
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                        /*
                            r0 = this;
                            io.fotoapparat.preview.Frame r1 = (io.fotoapparat.preview.Frame) r1
                            r0.invoke(r1)
                            kotlin.Unit r1 = kotlin.Unit.INSTANCE
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.camera.Camera.Back.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                    }
                }
                r13 = r2
                kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
                r11 = 0
                r12 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r19 = 460(0x1cc, float:6.45E-43)
                r20 = 0
                r8 = r1
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                r2 = r21
                r2.<init>(r0, r1, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.camera.Camera.Back.<init>():void");
        }
    }

    /* compiled from: CameraActivity.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/camera/Camera$Front;", "Lcom/qcwireless/qcwatch/ui/device/camera/Camera;", "()V", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Front extends com.qcwireless.qcwatch.ui.device.camera.Camera {
        public static final com.qcwireless.qcwatch.ui.device.camera.Camera.Front INSTANCE = new com.qcwireless.qcwatch.ui.device.camera.Camera.Front();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Front() {
            /*
                r21 = this;
                kotlin.jvm.functions.Function1 r0 = io.fotoapparat.selector.LensPositionSelectorsKt.front()
                r1 = 2
                kotlin.jvm.functions.Function1[] r2 = new kotlin.jvm.functions.Function1[r1]
                kotlin.jvm.functions.Function1 r3 = io.fotoapparat.selector.ResolutionSelectorsKt.highestResolution()
                r4 = 0
                r6 = 0
                kotlin.jvm.functions.Function1 r3 = io.fotoapparat.selector.AspectRatioSelectorsKt.wideRatio$default(r3, r4, r1, r6)
                r7 = 0
                r2[r7] = r3
                kotlin.jvm.functions.Function1 r3 = io.fotoapparat.selector.ResolutionSelectorsKt.highestResolution()
                kotlin.jvm.functions.Function1 r3 = io.fotoapparat.selector.AspectRatioSelectorsKt.standardRatio$default(r3, r4, r1, r6)
                r4 = 1
                r2[r4] = r3
                kotlin.jvm.functions.Function1 r18 = io.fotoapparat.selector.SelectorsKt.firstAvailable(r2)
                kotlin.jvm.functions.Function1 r14 = io.fotoapparat.selector.PreviewFpsRangeSelectorsKt.highestFps()
                kotlin.jvm.functions.Function1 r9 = io.fotoapparat.selector.FlashSelectorsKt.off()
                kotlin.jvm.functions.Function1[] r1 = new kotlin.jvm.functions.Function1[r1]
                kotlin.jvm.functions.Function1 r2 = io.fotoapparat.selector.FocusModeSelectorsKt.fixed()
                r1[r7] = r2
                kotlin.jvm.functions.Function1 r2 = io.fotoapparat.selector.FocusModeSelectorsKt.autoFocus()
                r1[r4] = r2
                kotlin.jvm.functions.Function1 r10 = io.fotoapparat.selector.SelectorsKt.firstAvailable(r1)
                io.fotoapparat.configuration.CameraConfiguration r1 = new io.fotoapparat.configuration.CameraConfiguration
                r11 = 0
                r12 = 0
                r13 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r19 = 476(0x1dc, float:6.67E-43)
                r20 = 0
                r8 = r1
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                r2 = r21
                r2.<init>(r0, r1, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.camera.Camera.Front.<init>():void");
        }
    }
}
