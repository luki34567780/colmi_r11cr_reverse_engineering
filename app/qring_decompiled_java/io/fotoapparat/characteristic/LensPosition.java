package io.fotoapparat.characteristic;

/* compiled from: LensPosition.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lio/fotoapparat/characteristic/LensPosition;", "Lio/fotoapparat/characteristic/Characteristic;", "()V", "Back", "External", "Front", "Lio/fotoapparat/characteristic/LensPosition$Back;", "Lio/fotoapparat/characteristic/LensPosition$Front;", "Lio/fotoapparat/characteristic/LensPosition$External;", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public abstract class LensPosition implements io.fotoapparat.characteristic.Characteristic {
    private LensPosition() {
    }

    public /* synthetic */ LensPosition(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: LensPosition.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/fotoapparat/characteristic/LensPosition$Back;", "Lio/fotoapparat/characteristic/LensPosition;", "()V", "toString", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
    public static final class Back extends io.fotoapparat.characteristic.LensPosition {
        public static final io.fotoapparat.characteristic.LensPosition.Back INSTANCE = new io.fotoapparat.characteristic.LensPosition.Back();

        public java.lang.String toString() {
            return "LensPosition.Back";
        }

        private Back() {
            super(null);
        }
    }

    /* compiled from: LensPosition.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/fotoapparat/characteristic/LensPosition$Front;", "Lio/fotoapparat/characteristic/LensPosition;", "()V", "toString", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
    public static final class Front extends io.fotoapparat.characteristic.LensPosition {
        public static final io.fotoapparat.characteristic.LensPosition.Front INSTANCE = new io.fotoapparat.characteristic.LensPosition.Front();

        public java.lang.String toString() {
            return "LensPosition.Front";
        }

        private Front() {
            super(null);
        }
    }

    /* compiled from: LensPosition.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/fotoapparat/characteristic/LensPosition$External;", "Lio/fotoapparat/characteristic/LensPosition;", "()V", "toString", "", "fotoapparat_release"}, k = 1, mv = {1, 1, 13})
    public static final class External extends io.fotoapparat.characteristic.LensPosition {
        public static final io.fotoapparat.characteristic.LensPosition.External INSTANCE = new io.fotoapparat.characteristic.LensPosition.External();

        public java.lang.String toString() {
            return "LensPosition.External";
        }

        private External() {
            super(null);
        }
    }
}
