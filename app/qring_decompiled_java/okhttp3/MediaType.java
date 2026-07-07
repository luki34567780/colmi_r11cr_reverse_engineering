package okhttp3;

/* compiled from: MediaType.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0019"}, d2 = {"Lokhttp3/MediaType;", "", "mediaType", "", "type", "subtype", "parameterNamesAndValues", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "[Ljava/lang/String;", "()Ljava/lang/String;", "charset", "Ljava/nio/charset/Charset;", "defaultValue", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "parameter", "name", "-deprecated_subtype", "toString", "-deprecated_type", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class MediaType {
    private static final java.lang.String QUOTED = "\"([^\"]*)\"";
    private static final java.lang.String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final java.lang.String mediaType;
    private final java.lang.String[] parameterNamesAndValues;
    private final java.lang.String subtype;
    private final java.lang.String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.MediaType.Companion INSTANCE = new okhttp3.MediaType.Companion(null);
    private static final java.util.regex.Pattern TYPE_SUBTYPE = java.util.regex.Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final java.util.regex.Pattern PARAMETER = java.util.regex.Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    @kotlin.jvm.JvmStatic
    public static final okhttp3.MediaType get(java.lang.String str) {
        return INSTANCE.get(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.MediaType parse(java.lang.String str) {
        return INSTANCE.parse(str);
    }

    public final java.nio.charset.Charset charset() {
        return charset$default(this, null, 1, null);
    }

    private MediaType(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public /* synthetic */ MediaType(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    public final java.lang.String type() {
        return this.type;
    }

    public final java.lang.String subtype() {
        return this.subtype;
    }

    public static /* synthetic */ java.nio.charset.Charset charset$default(okhttp3.MediaType mediaType, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public final java.nio.charset.Charset charset(java.nio.charset.Charset defaultValue) {
        java.lang.String parameter = parameter("charset");
        if (parameter == null) {
            return defaultValue;
        }
        try {
            return java.nio.charset.Charset.forName(parameter);
        } catch (java.lang.IllegalArgumentException unused) {
            return defaultValue;
        }
    }

    public final java.lang.String parameter(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.collections.ArraysKt.getIndices(this.parameterNamesAndValues), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if (step2 >= 0) {
            if (first > last) {
                return null;
            }
        } else if (first < last) {
            return null;
        }
        while (!kotlin.text.StringsKt.equals(this.parameterNamesAndValues[first], name, true)) {
            if (first == last) {
                return null;
            }
            first += step2;
        }
        return this.parameterNamesAndValues[first + 1];
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "type", imports = {}))
    /* renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "subtype", imports = {}))
    /* renamed from: -deprecated_subtype, reason: not valid java name and from getter */
    public final java.lang.String getSubtype() {
        return this.subtype;
    }

    /* renamed from: toString, reason: from getter */
    public java.lang.String getMediaType() {
        return this.mediaType;
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof okhttp3.MediaType) && kotlin.jvm.internal.Intrinsics.areEqual(((okhttp3.MediaType) other).mediaType, this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    /* compiled from: MediaType.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u000fJ\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\nJ\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\u000eR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "()V", "PARAMETER", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "QUOTED", "", "TOKEN", "TYPE_SUBTYPE", "get", "Lokhttp3/MediaType;", "mediaType", "-deprecated_get", "parse", "-deprecated_parse", "toMediaType", "toMediaTypeOrNull", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.MediaType get(java.lang.String toMediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toMediaType, "$this$toMediaType");
            java.lang.String str = toMediaType;
            java.util.regex.Matcher matcher = okhttp3.MediaType.TYPE_SUBTYPE.matcher(str);
            if (!matcher.lookingAt()) {
                throw new java.lang.IllegalArgumentException(("No subtype found for: \"" + toMediaType + kotlin.text.Typography.quote).toString());
            }
            java.lang.String group = matcher.group(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "typeSubtype.group(1)");
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            java.util.Objects.requireNonNull(group, "null cannot be cast to non-null type java.lang.String");
            java.lang.String lowerCase = group.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            java.lang.String group2 = matcher.group(2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group2, "typeSubtype.group(2)");
            java.util.Locale locale2 = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "Locale.US");
            java.util.Objects.requireNonNull(group2, "null cannot be cast to non-null type java.lang.String");
            java.lang.String lowerCase2 = group2.toLowerCase(locale2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.regex.Matcher matcher2 = okhttp3.MediaType.PARAMETER.matcher(str);
            int end = matcher.end();
            while (end < toMediaType.length()) {
                matcher2.region(end, toMediaType.length());
                if (!matcher2.lookingAt()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    java.lang.String substring = toMediaType.substring(end);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    sb.append("\" for: \"");
                    sb.append(toMediaType);
                    sb.append(kotlin.text.Typography.quote);
                    throw new java.lang.IllegalArgumentException(sb.toString().toString());
                }
                java.lang.String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    java.lang.String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else if (kotlin.text.StringsKt.startsWith$default(group4, "'", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.endsWith$default(group4, "'", false, 2, (java.lang.Object) null) && group4.length() > 2) {
                        group4 = group4.substring(1, group4.length() - 1);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    arrayList2.add(group3);
                    arrayList2.add(group4);
                    end = matcher2.end();
                }
            }
            java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
            java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new okhttp3.MediaType(toMediaType, lowerCase, lowerCase2, (java.lang.String[]) array, null);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.MediaType parse(java.lang.String toMediaTypeOrNull) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toMediaTypeOrNull, "$this$toMediaTypeOrNull");
            try {
                okhttp3.MediaType.Companion companion = this;
                return get(toMediaTypeOrNull);
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.MediaType m2663deprecated_get(java.lang.String mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            return get(mediaType);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final okhttp3.MediaType m2664deprecated_parse(java.lang.String mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            return parse(mediaType);
        }
    }
}
