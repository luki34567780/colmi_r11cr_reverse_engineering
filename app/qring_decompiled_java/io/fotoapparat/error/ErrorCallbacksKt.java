package io.fotoapparat.error;

/* compiled from: ErrorCallbacks.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004*\"\u0010\u0005\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0006"}, d2 = {"onMainThread", "Lkotlin/Function1;", "Lio/fotoapparat/exception/camera/CameraException;", "", "Lio/fotoapparat/error/CameraErrorCallback;", "CameraErrorCallback", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class ErrorCallbacksKt {
    public static final kotlin.jvm.functions.Function1<io.fotoapparat.exception.camera.CameraException, kotlin.Unit> onMainThread(final kotlin.jvm.functions.Function1<? super io.fotoapparat.exception.camera.CameraException, kotlin.Unit> receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new kotlin.jvm.functions.Function1<io.fotoapparat.exception.camera.CameraException, kotlin.Unit>() { // from class: io.fotoapparat.error.ErrorCallbacksKt$onMainThread$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(io.fotoapparat.exception.camera.CameraException cameraException) {
                invoke2(cameraException);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final io.fotoapparat.exception.camera.CameraException cameraException) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cameraException, "cameraException");
                if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    kotlin.jvm.functions.Function1.this.invoke(cameraException);
                } else {
                    io.fotoapparat.hardware.ExecutorKt.executeMainThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: io.fotoapparat.error.ErrorCallbacksKt$onMainThread$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            invoke2();
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            kotlin.jvm.functions.Function1.this.invoke(cameraException);
                        }
                    });
                }
            }
        };
    }
}
