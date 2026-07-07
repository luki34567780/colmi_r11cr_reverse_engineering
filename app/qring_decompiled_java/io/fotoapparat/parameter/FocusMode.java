package io.fotoapparat.parameter;

/* compiled from: FocusMode.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lio/fotoapparat/parameter/FocusMode;", "Lio/fotoapparat/parameter/Parameter;", "()V", "Auto", "ContinuousFocusPicture", "ContinuousFocusVideo", "Edof", "Fixed", "Infinity", "Macro", "Lio/fotoapparat/parameter/FocusMode$Fixed;", "Lio/fotoapparat/parameter/FocusMode$Infinity;", "Lio/fotoapparat/parameter/FocusMode$Macro;", "Lio/fotoapparat/parameter/FocusMode$Auto;", "Lio/fotoapparat/parameter/FocusMode$ContinuousFocusPicture;", "Lio/fotoapparat/parameter/FocusMode$ContinuousFocusVideo;", "Lio/fotoapparat/parameter/FocusMode$Edof;", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public abstract class FocusMode implements io.fotoapparat.parameter.Parameter {
    private FocusMode() {
    }

    public /* synthetic */ FocusMode(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: FocusMode.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/fotoapparat/parameter/FocusMode$Fixed;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
    public static final class Fixed extends io.fotoapparat.parameter.FocusMode {
        public static final io.fotoapparat.parameter.FocusMode.Fixed INSTANCE = new io.fotoapparat.parameter.FocusMode.Fixed();

        public java.lang.String toString() {
            return "FocusMode.Fixed";
        }

        private Fixed() {
            super(null);
        }
    }

    /* compiled from: FocusMode.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/fotoapparat/parameter/FocusMode$Infinity;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
    public static final class Infinity extends io.fotoapparat.parameter.FocusMode {
        public static final io.fotoapparat.parameter.FocusMode.Infinity INSTANCE = new io.fotoapparat.parameter.FocusMode.Infinity();

        public java.lang.String toString() {
            return "FocusMode.Infinity";
        }

        private Infinity() {
            super(null);
        }
    }

    /* compiled from: FocusMode.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/fotoapparat/parameter/FocusMode$Macro;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
    public static final class Macro extends io.fotoapparat.parameter.FocusMode {
        public static final io.fotoapparat.parameter.FocusMode.Macro INSTANCE = new io.fotoapparat.parameter.FocusMode.Macro();

        public java.lang.String toString() {
            return "FocusMode.Macro";
        }

        private Macro() {
            super(null);
        }
    }

    /* compiled from: FocusMode.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/fotoapparat/parameter/FocusMode$Auto;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
    public static final class Auto extends io.fotoapparat.parameter.FocusMode {
        public static final io.fotoapparat.parameter.FocusMode.Auto INSTANCE = new io.fotoapparat.parameter.FocusMode.Auto();

        public java.lang.String toString() {
            return "FocusMode.Auto";
        }

        private Auto() {
            super(null);
        }
    }

    /* compiled from: FocusMode.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/fotoapparat/parameter/FocusMode$ContinuousFocusPicture;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
    public static final class ContinuousFocusPicture extends io.fotoapparat.parameter.FocusMode {
        public static final io.fotoapparat.parameter.FocusMode.ContinuousFocusPicture INSTANCE = new io.fotoapparat.parameter.FocusMode.ContinuousFocusPicture();

        public java.lang.String toString() {
            return "FocusMode.ContinuousFocusPicture";
        }

        private ContinuousFocusPicture() {
            super(null);
        }
    }

    /* compiled from: FocusMode.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/fotoapparat/parameter/FocusMode$ContinuousFocusVideo;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
    public static final class ContinuousFocusVideo extends io.fotoapparat.parameter.FocusMode {
        public static final io.fotoapparat.parameter.FocusMode.ContinuousFocusVideo INSTANCE = new io.fotoapparat.parameter.FocusMode.ContinuousFocusVideo();

        public java.lang.String toString() {
            return "FocusMode.ContinuousFocusVideo";
        }

        private ContinuousFocusVideo() {
            super(null);
        }
    }

    /* compiled from: FocusMode.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/fotoapparat/parameter/FocusMode$Edof;", "Lio/fotoapparat/parameter/FocusMode;", "()V", "toString", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
    public static final class Edof extends io.fotoapparat.parameter.FocusMode {
        public static final io.fotoapparat.parameter.FocusMode.Edof INSTANCE = new io.fotoapparat.parameter.FocusMode.Edof();

        public java.lang.String toString() {
            return "FocusMode.Edof";
        }

        private Edof() {
            super(null);
        }
    }
}
