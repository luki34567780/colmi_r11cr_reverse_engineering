package coil.fetch;

/* compiled from: FetchResult.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcoil/fetch/SourceResult;", "Lcoil/fetch/FetchResult;", "source", "Lcoil/decode/ImageSource;", "mimeType", "", "dataSource", "Lcoil/decode/DataSource;", "(Lcoil/decode/ImageSource;Ljava/lang/String;Lcoil/decode/DataSource;)V", "getDataSource", "()Lcoil/decode/DataSource;", "getMimeType", "()Ljava/lang/String;", "getSource", "()Lcoil/decode/ImageSource;", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SourceResult extends coil.fetch.FetchResult {
    private final coil.decode.DataSource dataSource;
    private final java.lang.String mimeType;
    private final coil.decode.ImageSource source;

    public final coil.decode.ImageSource getSource() {
        return this.source;
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final coil.decode.DataSource getDataSource() {
        return this.dataSource;
    }

    public SourceResult(coil.decode.ImageSource imageSource, java.lang.String str, coil.decode.DataSource dataSource) {
        super(null);
        this.source = imageSource;
        this.mimeType = str;
        this.dataSource = dataSource;
    }

    public static /* synthetic */ coil.fetch.SourceResult copy$default(coil.fetch.SourceResult sourceResult, coil.decode.ImageSource imageSource, java.lang.String str, coil.decode.DataSource dataSource, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            imageSource = sourceResult.source;
        }
        if ((i & 2) != 0) {
            str = sourceResult.mimeType;
        }
        if ((i & 4) != 0) {
            dataSource = sourceResult.dataSource;
        }
        return sourceResult.copy(imageSource, str, dataSource);
    }

    public final coil.fetch.SourceResult copy(coil.decode.ImageSource source, java.lang.String mimeType, coil.decode.DataSource dataSource) {
        return new coil.fetch.SourceResult(source, mimeType, dataSource);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof coil.fetch.SourceResult) {
            coil.fetch.SourceResult sourceResult = (coil.fetch.SourceResult) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.source, sourceResult.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, sourceResult.mimeType) && this.dataSource == sourceResult.dataSource) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.source.hashCode() * 31;
        java.lang.String str = this.mimeType;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.dataSource.hashCode();
    }
}
