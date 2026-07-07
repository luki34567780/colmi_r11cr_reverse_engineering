package io.fotoapparat.view;

/* compiled from: Preview.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lio/fotoapparat/view/Preview;", "", "()V", "Surface", "Texture", "Lio/fotoapparat/view/Preview$Texture;", "Lio/fotoapparat/view/Preview$Surface;", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public abstract class Preview {
    private Preview() {
    }

    public /* synthetic */ Preview(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: Preview.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lio/fotoapparat/view/Preview$Texture;", "Lio/fotoapparat/view/Preview;", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "(Landroid/graphics/SurfaceTexture;)V", "getSurfaceTexture", "()Landroid/graphics/SurfaceTexture;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "toString", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
    public static final /* data */ class Texture extends io.fotoapparat.view.Preview {
        private final android.graphics.SurfaceTexture surfaceTexture;

        public static /* synthetic */ io.fotoapparat.view.Preview.Texture copy$default(io.fotoapparat.view.Preview.Texture texture, android.graphics.SurfaceTexture surfaceTexture, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                surfaceTexture = texture.surfaceTexture;
            }
            return texture.copy(surfaceTexture);
        }

        /* renamed from: component1, reason: from getter */
        public final android.graphics.SurfaceTexture getSurfaceTexture() {
            return this.surfaceTexture;
        }

        public final io.fotoapparat.view.Preview.Texture copy(android.graphics.SurfaceTexture surfaceTexture) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(surfaceTexture, "surfaceTexture");
            return new io.fotoapparat.view.Preview.Texture(surfaceTexture);
        }

        public boolean equals(java.lang.Object other) {
            if (this != other) {
                return (other instanceof io.fotoapparat.view.Preview.Texture) && kotlin.jvm.internal.Intrinsics.areEqual(this.surfaceTexture, ((io.fotoapparat.view.Preview.Texture) other).surfaceTexture);
            }
            return true;
        }

        public int hashCode() {
            android.graphics.SurfaceTexture surfaceTexture = this.surfaceTexture;
            if (surfaceTexture != null) {
                return surfaceTexture.hashCode();
            }
            return 0;
        }

        public java.lang.String toString() {
            return "Texture(surfaceTexture=" + this.surfaceTexture + ")";
        }

        public final android.graphics.SurfaceTexture getSurfaceTexture() {
            return this.surfaceTexture;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Texture(android.graphics.SurfaceTexture surfaceTexture) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(surfaceTexture, "surfaceTexture");
            this.surfaceTexture = surfaceTexture;
        }
    }

    /* compiled from: Preview.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lio/fotoapparat/view/Preview$Surface;", "Lio/fotoapparat/view/Preview;", "surfaceHolder", "Landroid/view/SurfaceHolder;", "(Landroid/view/SurfaceHolder;)V", "getSurfaceHolder", "()Landroid/view/SurfaceHolder;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "toString", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
    public static final /* data */ class Surface extends io.fotoapparat.view.Preview {
        private final android.view.SurfaceHolder surfaceHolder;

        public static /* synthetic */ io.fotoapparat.view.Preview.Surface copy$default(io.fotoapparat.view.Preview.Surface surface, android.view.SurfaceHolder surfaceHolder, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                surfaceHolder = surface.surfaceHolder;
            }
            return surface.copy(surfaceHolder);
        }

        /* renamed from: component1, reason: from getter */
        public final android.view.SurfaceHolder getSurfaceHolder() {
            return this.surfaceHolder;
        }

        public final io.fotoapparat.view.Preview.Surface copy(android.view.SurfaceHolder surfaceHolder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(surfaceHolder, "surfaceHolder");
            return new io.fotoapparat.view.Preview.Surface(surfaceHolder);
        }

        public boolean equals(java.lang.Object other) {
            if (this != other) {
                return (other instanceof io.fotoapparat.view.Preview.Surface) && kotlin.jvm.internal.Intrinsics.areEqual(this.surfaceHolder, ((io.fotoapparat.view.Preview.Surface) other).surfaceHolder);
            }
            return true;
        }

        public int hashCode() {
            android.view.SurfaceHolder surfaceHolder = this.surfaceHolder;
            if (surfaceHolder != null) {
                return surfaceHolder.hashCode();
            }
            return 0;
        }

        public java.lang.String toString() {
            return "Surface(surfaceHolder=" + this.surfaceHolder + ")";
        }

        public final android.view.SurfaceHolder getSurfaceHolder() {
            return this.surfaceHolder;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Surface(android.view.SurfaceHolder surfaceHolder) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(surfaceHolder, "surfaceHolder");
            this.surfaceHolder = surfaceHolder;
        }
    }
}
