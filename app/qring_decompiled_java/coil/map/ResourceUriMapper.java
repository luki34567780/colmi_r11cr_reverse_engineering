package coil.map;

/* compiled from: ResourceUriMapper.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcoil/map/ResourceUriMapper;", "Lcoil/map/Mapper;", "Landroid/net/Uri;", "()V", "isApplicable", "", com.autonavi.base.amap.mapcore.AeUtil.ROOT_DATA_PATH_OLD_NAME, "map", "options", "Lcoil/request/Options;", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResourceUriMapper implements coil.map.Mapper<android.net.Uri, android.net.Uri> {
    @Override // coil.map.Mapper
    public android.net.Uri map(android.net.Uri data, coil.request.Options options) {
        if (!isApplicable(data)) {
            return null;
        }
        java.lang.String authority = data.getAuthority();
        if (authority == null) {
            authority = "";
        }
        android.content.res.Resources resourcesForApplication = options.getContext().getPackageManager().getResourcesForApplication(authority);
        java.util.List<java.lang.String> pathSegments = data.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (!(identifier != 0)) {
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.Intrinsics.stringPlus("Invalid android.resource URI: ", data).toString());
        }
        android.net.Uri parse = android.net.Uri.parse("android.resource://" + authority + '/' + identifier);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        return parse;
    }

    private final boolean isApplicable(android.net.Uri data) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), "android.resource")) {
            java.lang.String authority = data.getAuthority();
            if (!(authority == null || kotlin.text.StringsKt.isBlank(authority)) && data.getPathSegments().size() == 2) {
                return true;
            }
        }
        return false;
    }
}
