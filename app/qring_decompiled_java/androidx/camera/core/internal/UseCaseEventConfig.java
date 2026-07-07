package androidx.camera.core.internal;

/* loaded from: classes.dex */
public interface UseCaseEventConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.UseCase.EventCallback> OPTION_USE_CASE_EVENT_CALLBACK = androidx.camera.core.impl.Config.Option.create("camerax.core.useCaseEventCallback", androidx.camera.core.UseCase.EventCallback.class);

    public interface Builder<B> {
        B setUseCaseEventCallback(androidx.camera.core.UseCase.EventCallback eventCallback);
    }

    androidx.camera.core.UseCase.EventCallback getUseCaseEventCallback();

    androidx.camera.core.UseCase.EventCallback getUseCaseEventCallback(androidx.camera.core.UseCase.EventCallback valueIfMissing);

    /* renamed from: androidx.camera.core.internal.UseCaseEventConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static androidx.camera.core.UseCase.EventCallback $default$getUseCaseEventCallback(androidx.camera.core.internal.UseCaseEventConfig _this, androidx.camera.core.UseCase.EventCallback valueIfMissing) {
            return (androidx.camera.core.UseCase.EventCallback) _this.retrieveOption(androidx.camera.core.internal.UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, valueIfMissing);
        }

        public static androidx.camera.core.UseCase.EventCallback $default$getUseCaseEventCallback(androidx.camera.core.internal.UseCaseEventConfig _this) {
            return (androidx.camera.core.UseCase.EventCallback) _this.retrieveOption(androidx.camera.core.internal.UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK);
        }
    }
}
