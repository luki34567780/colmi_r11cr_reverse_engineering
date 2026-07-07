package androidx.camera.core;

/* loaded from: classes.dex */
public final class UseCaseGroup {
    private final java.util.List<androidx.camera.core.UseCase> mUseCases;
    private final androidx.camera.core.ViewPort mViewPort;

    UseCaseGroup(androidx.camera.core.ViewPort viewPort, java.util.List<androidx.camera.core.UseCase> useCases) {
        this.mViewPort = viewPort;
        this.mUseCases = useCases;
    }

    public androidx.camera.core.ViewPort getViewPort() {
        return this.mViewPort;
    }

    public java.util.List<androidx.camera.core.UseCase> getUseCases() {
        return this.mUseCases;
    }

    public static final class Builder {
        private final java.util.List<androidx.camera.core.UseCase> mUseCases = new java.util.ArrayList();
        private androidx.camera.core.ViewPort mViewPort;

        public androidx.camera.core.UseCaseGroup.Builder setViewPort(androidx.camera.core.ViewPort viewPort) {
            this.mViewPort = viewPort;
            return this;
        }

        public androidx.camera.core.UseCaseGroup.Builder addUseCase(androidx.camera.core.UseCase useCase) {
            this.mUseCases.add(useCase);
            return this;
        }

        public androidx.camera.core.UseCaseGroup build() {
            androidx.core.util.Preconditions.checkArgument(!this.mUseCases.isEmpty(), "UseCase must not be empty.");
            return new androidx.camera.core.UseCaseGroup(this.mViewPort, this.mUseCases);
        }
    }
}
