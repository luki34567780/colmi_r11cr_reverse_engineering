package coil.request;

/* compiled from: Options.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019¢\u0006\u0002\u0010\u001cJ \u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019J\u0013\u00108\u001a\u00020\r2\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010:\u001a\u00020;H\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u001a\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0011\u0010\u001b\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006<"}, d2 = {"Lcoil/request/Options;", "", "context", "Landroid/content/Context;", "config", "Landroid/graphics/Bitmap$Config;", "colorSpace", "Landroid/graphics/ColorSpace;", "size", "Lcoil/size/Size;", "scale", "Lcoil/size/Scale;", "allowInexactSize", "", "allowRgb565", "premultipliedAlpha", "diskCacheKey", "", "headers", "Lokhttp3/Headers;", "tags", "Lcoil/request/Tags;", "parameters", "Lcoil/request/Parameters;", "memoryCachePolicy", "Lcoil/request/CachePolicy;", "diskCachePolicy", "networkCachePolicy", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/Size;Lcoil/size/Scale;ZZZLjava/lang/String;Lokhttp3/Headers;Lcoil/request/Tags;Lcoil/request/Parameters;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "getAllowInexactSize", "()Z", "getAllowRgb565", "getColorSpace", "()Landroid/graphics/ColorSpace;", "getConfig", "()Landroid/graphics/Bitmap$Config;", "getContext", "()Landroid/content/Context;", "getDiskCacheKey", "()Ljava/lang/String;", "getDiskCachePolicy", "()Lcoil/request/CachePolicy;", "getHeaders", "()Lokhttp3/Headers;", "getMemoryCachePolicy", "getNetworkCachePolicy", "getParameters", "()Lcoil/request/Parameters;", "getPremultipliedAlpha", "getScale", "()Lcoil/size/Scale;", "getSize", "()Lcoil/size/Size;", "getTags", "()Lcoil/request/Tags;", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Options {
    private final boolean allowInexactSize;
    private final boolean allowRgb565;
    private final android.graphics.ColorSpace colorSpace;
    private final android.graphics.Bitmap.Config config;
    private final android.content.Context context;
    private final java.lang.String diskCacheKey;
    private final coil.request.CachePolicy diskCachePolicy;
    private final okhttp3.Headers headers;
    private final coil.request.CachePolicy memoryCachePolicy;
    private final coil.request.CachePolicy networkCachePolicy;
    private final coil.request.Parameters parameters;
    private final boolean premultipliedAlpha;
    private final coil.size.Scale scale;
    private final coil.size.Size size;
    private final coil.request.Tags tags;

    public Options(android.content.Context context, android.graphics.Bitmap.Config config, android.graphics.ColorSpace colorSpace, coil.size.Size size, coil.size.Scale scale, boolean z, boolean z2, boolean z3, java.lang.String str, okhttp3.Headers headers, coil.request.Tags tags, coil.request.Parameters parameters, coil.request.CachePolicy cachePolicy, coil.request.CachePolicy cachePolicy2, coil.request.CachePolicy cachePolicy3) {
        this.context = context;
        this.config = config;
        this.colorSpace = colorSpace;
        this.size = size;
        this.scale = scale;
        this.allowInexactSize = z;
        this.allowRgb565 = z2;
        this.premultipliedAlpha = z3;
        this.diskCacheKey = str;
        this.headers = headers;
        this.tags = tags;
        this.parameters = parameters;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public /* synthetic */ Options(android.content.Context context, android.graphics.Bitmap.Config config, android.graphics.ColorSpace colorSpace, coil.size.Size size, coil.size.Scale scale, boolean z, boolean z2, boolean z3, java.lang.String str, okhttp3.Headers headers, coil.request.Tags tags, coil.request.Parameters parameters, coil.request.CachePolicy cachePolicy, coil.request.CachePolicy cachePolicy2, coil.request.CachePolicy cachePolicy3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? android.graphics.Bitmap.Config.ARGB_8888 : config, (i & 4) != 0 ? coil.util.Utils.getNULL_COLOR_SPACE() : colorSpace, (i & 8) != 0 ? coil.size.Size.ORIGINAL : size, (i & 16) != 0 ? coil.size.Scale.FIT : scale, (i & 32) != 0 ? false : z, (i & 64) == 0 ? z2 : false, (i & 128) != 0 ? true : z3, (i & 256) != 0 ? null : str, (i & 512) != 0 ? coil.util.Utils.getEMPTY_HEADERS() : headers, (i & 1024) != 0 ? coil.request.Tags.EMPTY : tags, (i & 2048) != 0 ? coil.request.Parameters.EMPTY : parameters, (i & 4096) != 0 ? coil.request.CachePolicy.ENABLED : cachePolicy, (i & 8192) != 0 ? coil.request.CachePolicy.ENABLED : cachePolicy2, (i & 16384) != 0 ? coil.request.CachePolicy.ENABLED : cachePolicy3);
    }

    public final android.graphics.Bitmap.Config getConfig() {
        return this.config;
    }

    public final android.graphics.ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    public final coil.size.Size getSize() {
        return this.size;
    }

    public final coil.size.Scale getScale() {
        return this.scale;
    }

    public final boolean getAllowInexactSize() {
        return this.allowInexactSize;
    }

    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    public final boolean getPremultipliedAlpha() {
        return this.premultipliedAlpha;
    }

    public final java.lang.String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    public final okhttp3.Headers getHeaders() {
        return this.headers;
    }

    public final coil.request.Tags getTags() {
        return this.tags;
    }

    public final coil.request.Parameters getParameters() {
        return this.parameters;
    }

    public final coil.request.CachePolicy getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    public final coil.request.CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public final coil.request.CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    public final coil.request.Options copy(android.content.Context context, android.graphics.Bitmap.Config config, android.graphics.ColorSpace colorSpace, coil.size.Size size, coil.size.Scale scale, boolean allowInexactSize, boolean allowRgb565, boolean premultipliedAlpha, java.lang.String diskCacheKey, okhttp3.Headers headers, coil.request.Tags tags, coil.request.Parameters parameters, coil.request.CachePolicy memoryCachePolicy, coil.request.CachePolicy diskCachePolicy, coil.request.CachePolicy networkCachePolicy) {
        return new coil.request.Options(context, config, colorSpace, size, scale, allowInexactSize, allowRgb565, premultipliedAlpha, diskCacheKey, headers, tags, parameters, memoryCachePolicy, diskCachePolicy, networkCachePolicy);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof coil.request.Options) {
            coil.request.Options options = (coil.request.Options) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.context, options.context) && this.config == options.config && ((android.os.Build.VERSION.SDK_INT < 26 || kotlin.jvm.internal.Intrinsics.areEqual(this.colorSpace, options.colorSpace)) && kotlin.jvm.internal.Intrinsics.areEqual(this.size, options.size) && this.scale == options.scale && this.allowInexactSize == options.allowInexactSize && this.allowRgb565 == options.allowRgb565 && this.premultipliedAlpha == options.premultipliedAlpha && kotlin.jvm.internal.Intrinsics.areEqual(this.diskCacheKey, options.diskCacheKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, options.headers) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, options.tags) && kotlin.jvm.internal.Intrinsics.areEqual(this.parameters, options.parameters) && this.memoryCachePolicy == options.memoryCachePolicy && this.diskCachePolicy == options.diskCachePolicy && this.networkCachePolicy == options.networkCachePolicy)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.context.hashCode() * 31) + this.config.hashCode()) * 31;
        android.graphics.ColorSpace colorSpace = this.colorSpace;
        int hashCode2 = (((((((((((hashCode + (colorSpace == null ? 0 : colorSpace.hashCode())) * 31) + this.size.hashCode()) * 31) + this.scale.hashCode()) * 31) + coil.decode.DecodeResult$$ExternalSyntheticBackport0.m(this.allowInexactSize)) * 31) + coil.decode.DecodeResult$$ExternalSyntheticBackport0.m(this.allowRgb565)) * 31) + coil.decode.DecodeResult$$ExternalSyntheticBackport0.m(this.premultipliedAlpha)) * 31;
        java.lang.String str = this.diskCacheKey;
        return ((((((((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.headers.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode();
    }
}
