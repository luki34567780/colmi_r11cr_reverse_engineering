package okhttp3;

/* compiled from: HttpUrl.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0002\b#J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b$J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b%J\r\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\bH\u0016J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020-J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b/J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b0J\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\b1J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b2J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0007¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u00020\bJ\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u00105\u001a\u00020\u0003J\r\u0010 \u001a\u00020\bH\u0007¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u0003H\u0016J\r\u0010@\u001a\u00020AH\u0007¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\b\rJ\b\u0010E\u001a\u0004\u0018\u00010\u0003J\r\u0010B\u001a\u00020AH\u0007¢\u0006\u0002\bFJ\r\u0010\r\u001a\u00020DH\u0007¢\u0006\u0002\bGJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\bHR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010¨\u0006K"}, d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", "username", "password", "host", "port", "", "pathSegments", "", "queryNamesAndValues", "fragment", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "encodedFragment", "()Ljava/lang/String;", "encodedPassword", "encodedPath", "encodedPathSegments", "()Ljava/util/List;", "encodedQuery", "encodedUsername", "isHttps", "", "()Z", "pathSize", "()I", com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, "queryParameterNames", "", "()Ljava/util/Set;", "querySize", "-deprecated_encodedFragment", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "-deprecated_fragment", "hashCode", "-deprecated_host", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "link", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", "name", "queryParameterName", "index", "-deprecated_queryParameterNames", "queryParameterValue", "queryParameterValues", "-deprecated_querySize", "redact", "resolve", "-deprecated_scheme", "toString", "toUri", "Ljava/net/URI;", "uri", "toUrl", "Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HttpUrl {
    public static final java.lang.String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final java.lang.String FRAGMENT_ENCODE_SET = "";
    public static final java.lang.String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final java.lang.String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final java.lang.String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final java.lang.String QUERY_ENCODE_SET = " \"'<>#";
    public static final java.lang.String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final java.lang.String fragment;
    private final java.lang.String host;
    private final boolean isHttps;
    private final java.lang.String password;
    private final java.util.List<java.lang.String> pathSegments;
    private final int port;
    private final java.util.List<java.lang.String> queryNamesAndValues;
    private final java.lang.String scheme;
    private final java.lang.String url;
    private final java.lang.String username;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.HttpUrl.Companion INSTANCE = new okhttp3.HttpUrl.Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @kotlin.jvm.JvmStatic
    public static final int defaultPort(java.lang.String str) {
        return INSTANCE.defaultPort(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl get(java.lang.String str) {
        return INSTANCE.get(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl get(java.net.URI uri) {
        return INSTANCE.get(uri);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl get(java.net.URL url) {
        return INSTANCE.get(url);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl parse(java.lang.String str) {
        return INSTANCE.parse(str);
    }

    public HttpUrl(java.lang.String scheme, java.lang.String username, java.lang.String password, java.lang.String host, int i, java.util.List<java.lang.String> pathSegments, java.util.List<java.lang.String> list, java.lang.String str, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = kotlin.jvm.internal.Intrinsics.areEqual(scheme, "https");
    }

    public final java.lang.String scheme() {
        return this.scheme;
    }

    public final java.lang.String username() {
        return this.username;
    }

    public final java.lang.String password() {
        return this.password;
    }

    public final java.lang.String host() {
        return this.host;
    }

    public final int port() {
        return this.port;
    }

    public final java.util.List<java.lang.String> pathSegments() {
        return this.pathSegments;
    }

    public final java.lang.String fragment() {
        return this.fragment;
    }

    /* renamed from: isHttps, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    public final java.net.URL url() {
        try {
            return new java.net.URL(this.url);
        } catch (java.net.MalformedURLException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public final java.net.URI uri() {
        java.lang.String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new java.net.URI(builder);
        } catch (java.net.URISyntaxException e) {
            try {
                java.net.URI create = java.net.URI.create(new kotlin.text.Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(builder, ""));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (java.lang.Exception unused) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    public final java.lang.String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        java.lang.String str = this.url;
        int delimiterOffset = okhttp3.internal.Util.delimiterOffset(str, ":@", length, str.length());
        java.lang.String str2 = this.url;
        java.util.Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        java.lang.String substring = str2.substring(length, delimiterOffset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final java.lang.String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, ':', this.scheme.length() + 3, false, 4, (java.lang.Object) null) + 1;
        int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, '@', 0, false, 6, (java.lang.Object) null);
        java.lang.String str = this.url;
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String substring = str.substring(indexOf$default, indexOf$default2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final java.lang.String encodedPath() {
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (java.lang.Object) null);
        java.lang.String str = this.url;
        int delimiterOffset = okhttp3.internal.Util.delimiterOffset(str, "?#", indexOf$default, str.length());
        java.lang.String str2 = this.url;
        java.util.Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        java.lang.String substring = str2.substring(indexOf$default, delimiterOffset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final java.util.List<java.lang.String> encodedPathSegments() {
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (java.lang.Object) null);
        java.lang.String str = this.url;
        int delimiterOffset = okhttp3.internal.Util.delimiterOffset(str, "?#", indexOf$default, str.length());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (indexOf$default < delimiterOffset) {
            int i = indexOf$default + 1;
            int delimiterOffset2 = okhttp3.internal.Util.delimiterOffset(this.url, '/', i, delimiterOffset);
            java.lang.String str2 = this.url;
            java.util.Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            java.lang.String substring = str2.substring(i, delimiterOffset2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            indexOf$default = delimiterOffset2;
        }
        return arrayList;
    }

    public final java.lang.String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, '?', 0, false, 6, (java.lang.Object) null) + 1;
        java.lang.String str = this.url;
        int delimiterOffset = okhttp3.internal.Util.delimiterOffset(str, '#', indexOf$default, str.length());
        java.lang.String str2 = this.url;
        java.util.Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        java.lang.String substring = str2.substring(indexOf$default, delimiterOffset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final java.lang.String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        INSTANCE.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final int querySize() {
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final java.lang.String queryParameter(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, list.size()), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if (step2 < 0 ? first >= last : first <= last) {
            while (!kotlin.jvm.internal.Intrinsics.areEqual(name, this.queryNamesAndValues.get(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            return this.queryNamesAndValues.get(first + 1);
        }
        return null;
    }

    public final java.util.Set<java.lang.String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if (step2 < 0 ? first >= last : first <= last) {
            while (true) {
                java.lang.String str = this.queryNamesAndValues.get(first);
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        java.util.Set<java.lang.String> unmodifiableSet = java.util.Collections.unmodifiableSet(linkedHashSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final java.util.List<java.lang.String> queryParameterValues(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        if (this.queryNamesAndValues == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if (step2 < 0 ? first >= last : first <= last) {
            while (true) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(name, this.queryNamesAndValues.get(first))) {
                    arrayList.add(this.queryNamesAndValues.get(first + 1));
                }
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        java.util.List<java.lang.String> unmodifiableList = java.util.Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final java.lang.String queryParameterName(int index) {
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        java.lang.String str = list.get(index * 2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        return str;
    }

    public final java.lang.String queryParameterValue(int index) {
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return list.get((index * 2) + 1);
    }

    public final java.lang.String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, '#', 0, false, 6, (java.lang.Object) null) + 1;
        java.lang.String str = this.url;
        java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String substring = str.substring(indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final java.lang.String redact() {
        okhttp3.HttpUrl.Builder newBuilder = newBuilder("/...");
        kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder);
        return newBuilder.username("").password("").build().getUrl();
    }

    public final okhttp3.HttpUrl resolve(java.lang.String link) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "link");
        okhttp3.HttpUrl.Builder newBuilder = newBuilder(link);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final okhttp3.HttpUrl.Builder newBuilder() {
        okhttp3.HttpUrl.Builder builder = new okhttp3.HttpUrl.Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != INSTANCE.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final okhttp3.HttpUrl.Builder newBuilder(java.lang.String link) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new okhttp3.HttpUrl.Builder().parse$okhttp(this, link);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof okhttp3.HttpUrl) && kotlin.jvm.internal.Intrinsics.areEqual(((okhttp3.HttpUrl) other).url, this.url);
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    /* renamed from: toString, reason: from getter */
    public java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String topPrivateDomain() {
        if (okhttp3.internal.Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return okhttp3.internal.publicsuffix.PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @kotlin.ReplaceWith(expression = "toUrl()", imports = {}))
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final java.net.URL m2655deprecated_url() {
        return url();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @kotlin.ReplaceWith(expression = "toUri()", imports = {}))
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final java.net.URI m2654deprecated_uri() {
        return uri();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "scheme", imports = {}))
    /* renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final java.lang.String getScheme() {
        return this.scheme;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedUsername", imports = {}))
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final java.lang.String m2643deprecated_encodedUsername() {
        return encodedUsername();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "username", imports = {}))
    /* renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPassword", imports = {}))
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final java.lang.String m2639deprecated_encodedPassword() {
        return encodedPassword();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "password", imports = {}))
    /* renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final java.lang.String getPassword() {
        return this.password;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "host", imports = {}))
    /* renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final java.lang.String getHost() {
        return this.host;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "port", imports = {}))
    /* renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pathSize", imports = {}))
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m2648deprecated_pathSize() {
        return pathSize();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPath", imports = {}))
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final java.lang.String m2640deprecated_encodedPath() {
        return encodedPath();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPathSegments", imports = {}))
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m2641deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pathSegments", imports = {}))
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m2647deprecated_pathSegments() {
        return this.pathSegments;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedQuery", imports = {}))
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final java.lang.String m2642deprecated_encodedQuery() {
        return encodedQuery();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, imports = {}))
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final java.lang.String m2650deprecated_query() {
        return query();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "querySize", imports = {}))
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m2652deprecated_querySize() {
        return querySize();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "queryParameterNames", imports = {}))
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final java.util.Set<java.lang.String> m2651deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedFragment", imports = {}))
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final java.lang.String m2638deprecated_encodedFragment() {
        return encodedFragment();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "fragment", imports = {}))
    /* renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final java.lang.String getFragment() {
        return this.fragment;
    }

    /* compiled from: HttpUrl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u0000 V2\u00020\u0001:\u0001VB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\u001bH\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0004J\u0010\u00106\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u00107\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004J\u0010\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u0010\u0010:\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u001f\u0010;\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u0001032\u0006\u00109\u001a\u00020\u0004H\u0000¢\u0006\u0002\b=J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0004J\b\u0010?\u001a\u00020@H\u0002J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ0\u0010A\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020.2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010E\u001a\u00020\u00002\b\u0010E\u001a\u0004\u0018\u00010\u0004J\r\u0010F\u001a\u00020\u0000H\u0000¢\u0006\u0002\bGJ\u0010\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020\u0004H\u0002J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010K\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0004J\u000e\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001bJ \u0010N\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001bH\u0002J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004J\u0016\u0010P\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0004J\u0018\u0010Q\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0016\u0010R\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0004J\u0018\u0010S\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\b\u0010T\u001a\u00020\u0004H\u0016J\u000e\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\b¨\u0006W"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "()V", "encodedFragment", "", "getEncodedFragment$okhttp", "()Ljava/lang/String;", "setEncodedFragment$okhttp", "(Ljava/lang/String;)V", "encodedPassword", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "encodedPathSegments", "", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedUsername", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "host", "getHost$okhttp", "setHost$okhttp", "port", "", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "scheme", "getScheme$okhttp", "setScheme$okhttp", "addEncodedPathSegment", "encodedPathSegment", "addEncodedPathSegments", "addEncodedQueryParameter", "encodedName", "encodedValue", "addPathSegment", "pathSegment", "addPathSegments", "pathSegments", "alreadyEncoded", "", "addQueryParameter", "name", "value", "build", "Lokhttp3/HttpUrl;", "effectivePort", "encodedPath", "encodedQuery", "fragment", "isDot", "input", "isDotDot", "parse", "base", "parse$okhttp", "password", "pop", "", "push", "pos", "limit", "addTrailingSlash", com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, "reencodeForUri", "reencodeForUri$okhttp", "removeAllCanonicalQueryParameters", "canonicalName", "removeAllEncodedQueryParameters", "removeAllQueryParameters", "removePathSegment", "index", "resolvePath", "startPos", "setEncodedPathSegment", "setEncodedQueryParameter", "setPathSegment", "setQueryParameter", "toString", "username", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final okhttp3.HttpUrl.Builder.Companion INSTANCE = new okhttp3.HttpUrl.Builder.Companion(null);
        public static final java.lang.String INVALID_HOST = "Invalid URL host";
        private java.lang.String encodedFragment;
        private final java.util.List<java.lang.String> encodedPathSegments;
        private java.util.List<java.lang.String> encodedQueryNamesAndValues;
        private java.lang.String host;
        private java.lang.String scheme;
        private java.lang.String encodedUsername = "";
        private java.lang.String encodedPassword = "";
        private int port = -1;

        public Builder() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        /* renamed from: getScheme$okhttp, reason: from getter */
        public final java.lang.String getScheme() {
            return this.scheme;
        }

        public final void setScheme$okhttp(java.lang.String str) {
            this.scheme = str;
        }

        /* renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final java.lang.String getEncodedUsername() {
            return this.encodedUsername;
        }

        public final void setEncodedUsername$okhttp(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedUsername = str;
        }

        /* renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final java.lang.String getEncodedPassword() {
            return this.encodedPassword;
        }

        public final void setEncodedPassword$okhttp(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedPassword = str;
        }

        /* renamed from: getHost$okhttp, reason: from getter */
        public final java.lang.String getHost() {
            return this.host;
        }

        public final void setHost$okhttp(java.lang.String str) {
            this.host = str;
        }

        /* renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final java.util.List<java.lang.String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final java.util.List<java.lang.String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(java.util.List<java.lang.String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        /* renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final java.lang.String getEncodedFragment() {
            return this.encodedFragment;
        }

        public final void setEncodedFragment$okhttp(java.lang.String str) {
            this.encodedFragment = str;
        }

        public final okhttp3.HttpUrl.Builder scheme(java.lang.String scheme) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (kotlin.text.StringsKt.equals(scheme, "http", true)) {
                this.scheme = "http";
            } else {
                if (!kotlin.text.StringsKt.equals(scheme, "https", true)) {
                    throw new java.lang.IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.scheme = "https";
            }
            return this;
        }

        public final okhttp3.HttpUrl.Builder username(java.lang.String username) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
            this.encodedUsername = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedUsername(java.lang.String encodedUsername) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedUsername, "encodedUsername");
            this.encodedUsername = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final okhttp3.HttpUrl.Builder password(java.lang.String password) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
            this.encodedPassword = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedPassword(java.lang.String encodedPassword) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPassword, "encodedPassword");
            this.encodedPassword = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final okhttp3.HttpUrl.Builder host(java.lang.String host) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
            java.lang.String canonicalHost = okhttp3.internal.HostnamesKt.toCanonicalHost(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, host, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new java.lang.IllegalArgumentException("unexpected host: " + host);
            }
            this.host = canonicalHost;
            return this;
        }

        public final okhttp3.HttpUrl.Builder port(int port) {
            if (!(1 <= port && 65535 >= port)) {
                throw new java.lang.IllegalArgumentException(("unexpected port: " + port).toString());
            }
            this.port = port;
            return this;
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            okhttp3.HttpUrl.Companion companion = okhttp3.HttpUrl.INSTANCE;
            java.lang.String str = this.scheme;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            return companion.defaultPort(str);
        }

        public final okhttp3.HttpUrl.Builder addPathSegment(java.lang.String pathSegment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final okhttp3.HttpUrl.Builder addPathSegments(java.lang.String pathSegments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        public final okhttp3.HttpUrl.Builder addEncodedPathSegment(java.lang.String encodedPathSegment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final okhttp3.HttpUrl.Builder addEncodedPathSegments(java.lang.String encodedPathSegments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        private final okhttp3.HttpUrl.Builder addPathSegments(java.lang.String pathSegments, boolean alreadyEncoded) {
            int i = 0;
            do {
                int delimiterOffset = okhttp3.internal.Util.delimiterOffset(pathSegments, "/\\", i, pathSegments.length());
                push(pathSegments, i, delimiterOffset, delimiterOffset < pathSegments.length(), alreadyEncoded);
                i = delimiterOffset + 1;
            } while (i <= pathSegments.length());
            return this;
        }

        public final okhttp3.HttpUrl.Builder setPathSegment(int index, java.lang.String pathSegment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            java.lang.String canonicalize$okhttp$default = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, pathSegment, 0, 0, okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (!((isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) ? false : true)) {
                throw new java.lang.IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
            }
            this.encodedPathSegments.set(index, canonicalize$okhttp$default);
            return this;
        }

        public final okhttp3.HttpUrl.Builder setEncodedPathSegment(int index, java.lang.String encodedPathSegment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            java.lang.String canonicalize$okhttp$default = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedPathSegment, 0, 0, okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(index, canonicalize$okhttp$default);
            if ((isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) ? false : true) {
                return this;
            }
            throw new java.lang.IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
        }

        public final okhttp3.HttpUrl.Builder removePathSegment(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedPath(java.lang.String encodedPath) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
            if (!kotlin.text.StringsKt.startsWith$default(encodedPath, "/", false, 2, (java.lang.Object) null)) {
                throw new java.lang.IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
            }
            resolvePath(encodedPath, 0, encodedPath.length());
            return this;
        }

        public final okhttp3.HttpUrl.Builder query(java.lang.String query) {
            java.lang.String canonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (query == null || (canonicalize$okhttp$default = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, query, 0, 0, okhttp3.HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null)) == null) ? null : okhttp3.HttpUrl.INSTANCE.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedQuery(java.lang.String encodedQuery) {
            java.lang.String canonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (encodedQuery == null || (canonicalize$okhttp$default = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedQuery, 0, 0, okhttp3.HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) == null) ? null : okhttp3.HttpUrl.INSTANCE.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
            return this;
        }

        public final okhttp3.HttpUrl.Builder addQueryParameter(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new java.util.ArrayList();
            }
            java.util.List<java.lang.String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            list.add(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, name, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
            list2.add(value != null ? okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, value, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final okhttp3.HttpUrl.Builder addEncodedQueryParameter(java.lang.String encodedName, java.lang.String encodedValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new java.util.ArrayList();
            }
            java.util.List<java.lang.String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            list.add(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedName, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
            list2.add(encodedValue != null ? okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedValue, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final okhttp3.HttpUrl.Builder setQueryParameter(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        public final okhttp3.HttpUrl.Builder setEncodedQueryParameter(java.lang.String encodedName, java.lang.String encodedValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final okhttp3.HttpUrl.Builder removeAllQueryParameters(java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, name, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final okhttp3.HttpUrl.Builder removeAllEncodedQueryParameters(java.lang.String encodedName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedName, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        private final void removeAllCanonicalQueryParameters(java.lang.String canonicalName) {
            java.util.List<java.lang.String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.downTo(list.size() - 2, 0), 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if (step2 >= 0) {
                if (first > last) {
                    return;
                }
            } else if (first < last) {
                return;
            }
            while (true) {
                java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
                kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                if (kotlin.jvm.internal.Intrinsics.areEqual(canonicalName, list2.get(first))) {
                    java.util.List<java.lang.String> list3 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list3);
                    list3.remove(first + 1);
                    java.util.List<java.lang.String> list4 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list4);
                    list4.remove(first);
                    java.util.List<java.lang.String> list5 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (first == last) {
                    return;
                } else {
                    first += step2;
                }
            }
        }

        public final okhttp3.HttpUrl.Builder fragment(java.lang.String fragment) {
            this.encodedFragment = fragment != null ? okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, fragment, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedFragment(java.lang.String encodedFragment) {
            this.encodedFragment = encodedFragment != null ? okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedFragment, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        public final okhttp3.HttpUrl.Builder reencodeForUri$okhttp() {
            java.lang.String str = this.host;
            this.host = str != null ? new kotlin.text.Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                this.encodedPathSegments.set(i, okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, this.encodedPathSegments.get(i), 0, 0, okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            java.util.List<java.lang.String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    java.lang.String str2 = list.get(i2);
                    list.set(i2, str2 != null ? okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, str2, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            java.lang.String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, str3, 0, 0, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final okhttp3.HttpUrl build() {
            java.util.ArrayList arrayList;
            java.lang.String str = this.scheme;
            if (str == null) {
                throw new java.lang.IllegalStateException("scheme == null");
            }
            java.lang.String percentDecode$okhttp$default = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, this.encodedUsername, 0, 0, false, 7, null);
            java.lang.String percentDecode$okhttp$default2 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, this.encodedPassword, 0, 0, false, 7, null);
            java.lang.String str2 = this.host;
            if (str2 == null) {
                throw new java.lang.IllegalStateException("host == null");
            }
            int effectivePort = effectivePort();
            java.util.List<java.lang.String> list = this.encodedPathSegments;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, (java.lang.String) it.next(), 0, 0, false, 7, null));
            }
            java.util.ArrayList arrayList3 = arrayList2;
            java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                java.util.List<java.lang.String> list3 = list2;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (java.lang.String str3 : list3) {
                    arrayList4.add(str3 != null ? okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            java.lang.String str4 = this.encodedFragment;
            return new okhttp3.HttpUrl(str, percentDecode$okhttp$default, percentDecode$okhttp$default2, str2, effectivePort, arrayList3, arrayList, str4 != null ? okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        
            if ((r6.encodedPassword.length() > 0) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
        
            if (r1 != r2.defaultPort(r3)) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.encodedUsername
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L25
                r1 = 1
                goto L26
            L25:
                r1 = 0
            L26:
                r4 = 58
                if (r1 != 0) goto L39
                java.lang.String r1 = r6.encodedPassword
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 <= 0) goto L36
                r1 = 1
                goto L37
            L36:
                r1 = 0
            L37:
                if (r1 == 0) goto L59
            L39:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 <= 0) goto L49
                goto L4a
            L49:
                r2 = 0
            L4a:
                if (r2 == 0) goto L54
                r0.append(r4)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L54:
                r1 = 64
                r0.append(r1)
            L59:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L7f
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r2 = 2
                r5 = 0
                boolean r1 = kotlin.text.StringsKt.contains$default(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L7a
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L7f
            L7a:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L7f:
                int r1 = r6.port
                r2 = -1
                if (r1 != r2) goto L88
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto La3
            L88:
                int r1 = r6.effectivePort()
                java.lang.String r2 = r6.scheme
                if (r2 == 0) goto L9d
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.INSTANCE
                java.lang.String r3 = r6.scheme
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r2 = r2.defaultPort(r3)
                if (r1 == r2) goto La3
            L9d:
                r0.append(r4)
                r0.append(r1)
            La3:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.INSTANCE
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r1 = r6.encodedQueryNamesAndValues
                if (r1 == 0) goto Lbd
                r1 = 63
                r0.append(r1)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.INSTANCE
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                r1.toQueryString$okhttp(r2, r0)
            Lbd:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lcb
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lcb:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final okhttp3.HttpUrl.Builder parse$okhttp(okhttp3.HttpUrl base, java.lang.String input) {
            int delimiterOffset;
            int i;
            int i2;
            java.lang.String str;
            int i3;
            java.lang.String str2;
            int i4;
            boolean z;
            boolean z2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
            int indexOfFirstNonAsciiWhitespace$default = okhttp3.internal.Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = okhttp3.internal.Util.indexOfLastNonAsciiWhitespace$default(input, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            okhttp3.HttpUrl.Builder.Companion companion = INSTANCE;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            java.lang.String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c = 65535;
            if (schemeDelimiterOffset != -1) {
                if (kotlin.text.StringsKt.startsWith(input, "https:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (kotlin.text.StringsKt.startsWith(input, "http:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    java.lang.String substring = input.substring(0, schemeDelimiterOffset);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append("'");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            } else if (base != null) {
                this.scheme = base.scheme();
            } else {
                throw new java.lang.IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int slashCount = companion.slashCount(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c2 = '?';
            char c3 = '#';
            if (slashCount >= 2 || base == null || (!kotlin.jvm.internal.Intrinsics.areEqual(base.scheme(), this.scheme))) {
                int i5 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    delimiterOffset = okhttp3.internal.Util.delimiterOffset(input, "@/\\?#", i5, indexOfLastNonAsciiWhitespace$default);
                    char charAt = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? input.charAt(delimiterOffset) : (char) 65535;
                    if (charAt == c || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        break;
                    }
                    if (charAt != '@') {
                        str2 = str3;
                        i3 = indexOfLastNonAsciiWhitespace$default;
                    } else {
                        if (!z3) {
                            int delimiterOffset2 = okhttp3.internal.Util.delimiterOffset(input, ':', i5, delimiterOffset);
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            java.lang.String str4 = str3;
                            java.lang.String canonicalize$okhttp$default = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, i5, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, com.autonavi.amap.mapcore.tools.GlMapUtil.DEVICE_DISPLAY_DPI_MEDIAN, null);
                            if (z4) {
                                canonicalize$okhttp$default = this.encodedUsername + "%40" + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                this.encodedPassword = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, com.autonavi.amap.mapcore.tools.GlMapUtil.DEVICE_DISPLAY_DPI_MEDIAN, null);
                                z2 = true;
                            } else {
                                z2 = z3;
                            }
                            z3 = z2;
                            str2 = str4;
                            z = true;
                            i4 = delimiterOffset;
                        } else {
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            str2 = str3;
                            i4 = delimiterOffset;
                            sb2.append(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, i5, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, com.autonavi.amap.mapcore.tools.GlMapUtil.DEVICE_DISPLAY_DPI_MEDIAN, null));
                            this.encodedPassword = sb2.toString();
                            z = z4;
                        }
                        i5 = i4 + 1;
                        z4 = z;
                    }
                    indexOfLastNonAsciiWhitespace$default = i3;
                    str3 = str2;
                    c3 = '#';
                    c2 = '?';
                    c = 65535;
                }
                java.lang.String str5 = str3;
                i = indexOfLastNonAsciiWhitespace$default;
                okhttp3.HttpUrl.Builder.Companion companion2 = INSTANCE;
                int portColonOffset = companion2.portColonOffset(input, i5, delimiterOffset);
                int i6 = portColonOffset + 1;
                if (i6 < delimiterOffset) {
                    i2 = i5;
                    this.host = okhttp3.internal.HostnamesKt.toCanonicalHost(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, i5, portColonOffset, false, 4, null));
                    int parsePort = companion2.parsePort(input, i6, delimiterOffset);
                    this.port = parsePort;
                    if (!(parsePort != -1)) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        java.lang.String substring2 = input.substring(i6, delimiterOffset);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, str5);
                        sb3.append(substring2);
                        sb3.append(kotlin.text.Typography.quote);
                        throw new java.lang.IllegalArgumentException(sb3.toString().toString());
                    }
                    str = str5;
                } else {
                    i2 = i5;
                    str = str5;
                    this.host = okhttp3.internal.HostnamesKt.toCanonicalHost(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, i2, portColonOffset, false, 4, null));
                    okhttp3.HttpUrl.Companion companion3 = okhttp3.HttpUrl.INSTANCE;
                    java.lang.String str6 = this.scheme;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str6);
                    this.port = companion3.defaultPort(str6);
                }
                if (!(this.host != null)) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    java.lang.String substring3 = input.substring(i2, portColonOffset);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, str);
                    sb4.append(substring3);
                    sb4.append(kotlin.text.Typography.quote);
                    throw new java.lang.IllegalArgumentException(sb4.toString().toString());
                }
                indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
            } else {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || input.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
                i = indexOfLastNonAsciiWhitespace$default;
            }
            int i7 = i;
            int delimiterOffset3 = okhttp3.internal.Util.delimiterOffset(input, "?#", indexOfFirstNonAsciiWhitespace$default, i7);
            resolvePath(input, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i7 && input.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = okhttp3.internal.Util.delimiterOffset(input, '#', delimiterOffset3, i7);
                this.encodedQueryNamesAndValues = okhttp3.HttpUrl.INSTANCE.toQueryNamesAndValues$okhttp(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, delimiterOffset3 + 1, delimiterOffset4, okhttp3.HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, com.realsil.sdk.bbpro.equalizer.AudioEq.SW_EQ_DATA_LENGTH, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i7 && input.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, delimiterOffset3 + 1, i7, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        private final void resolvePath(java.lang.String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char charAt = input.charAt(startPos);
            if (charAt == '/' || charAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                startPos++;
            } else {
                java.util.List<java.lang.String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i = startPos;
                if (i >= limit) {
                    return;
                }
                startPos = okhttp3.internal.Util.delimiterOffset(input, "/\\", i, limit);
                boolean z = startPos < limit;
                push(input, i, startPos, z, true);
                if (z) {
                    startPos++;
                }
            }
        }

        private final void push(java.lang.String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            java.lang.String canonicalize$okhttp$default = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, pos, limit, okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET, alreadyEncoded, false, false, false, null, com.autonavi.amap.mapcore.tools.GlMapUtil.DEVICE_DISPLAY_DPI_MEDIAN, null);
            if (isDot(canonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(canonicalize$okhttp$default)) {
                pop();
                return;
            }
            java.util.List<java.lang.String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                java.util.List<java.lang.String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, canonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(canonicalize$okhttp$default);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add("");
            }
        }

        private final boolean isDot(java.lang.String input) {
            return kotlin.jvm.internal.Intrinsics.areEqual(input, ".") || kotlin.text.StringsKt.equals(input, "%2e", true);
        }

        private final boolean isDotDot(java.lang.String input) {
            return kotlin.jvm.internal.Intrinsics.areEqual(input, "..") || kotlin.text.StringsKt.equals(input, "%2e.", true) || kotlin.text.StringsKt.equals(input, ".%2e", true) || kotlin.text.StringsKt.equals(input, "%2e%2e", true);
        }

        private final void pop() {
            java.util.List<java.lang.String> list = this.encodedPathSegments;
            if ((list.remove(list.size() - 1).length() == 0) && (!this.encodedPathSegments.isEmpty())) {
                java.util.List<java.lang.String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        /* compiled from: HttpUrl.kt */
        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "()V", "INVALID_HOST", "", "parsePort", "", "input", "pos", "limit", "portColonOffset", "schemeDelimiterOffset", "slashCount", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(java.lang.String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char charAt = input.charAt(pos);
                if ((kotlin.jvm.internal.Intrinsics.compare((int) charAt, 97) < 0 || kotlin.jvm.internal.Intrinsics.compare((int) charAt, 122) > 0) && (kotlin.jvm.internal.Intrinsics.compare((int) charAt, 65) < 0 || kotlin.jvm.internal.Intrinsics.compare((int) charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        return -1;
                    }
                    char charAt2 = input.charAt(pos);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return pos;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(java.lang.String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(java.lang.String input, int pos, int limit) {
                while (pos < limit) {
                    char charAt = input.charAt(pos);
                    if (charAt == ':') {
                        return pos;
                    }
                    if (charAt == '[') {
                        do {
                            pos++;
                            if (pos < limit) {
                            }
                        } while (input.charAt(pos) != ']');
                    }
                    pos++;
                }
                return limit;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(java.lang.String input, int pos, int limit) {
                try {
                    int parseInt = java.lang.Integer.parseInt(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, pos, limit, "", false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (java.lang.NumberFormatException unused) {
                    return -1;
                }
            }
        }
    }

    /* compiled from: HttpUrl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\b\u0018J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u001cJa\u0010\u001d\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0002\b(J\u001c\u0010)\u001a\u00020\"*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J/\u0010*\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\"H\u0000¢\u0006\u0002\b+J\u0011\u0010,\u001a\u00020\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0017H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u001aH\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u001bJ#\u0010.\u001a\u00020/*\b\u0012\u0004\u0012\u00020\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b4J\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000406*\u00020\u0004H\u0000¢\u0006\u0002\b7J%\u00108\u001a\u00020/*\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b9JV\u0010:\u001a\u00020/*\u00020;2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J,\u0010=\u001a\u00020/*\u00020;2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "()V", "FORM_ENCODE_SET", "", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "HEX_DIGITS", "", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "defaultPort", "", "scheme", "get", "Lokhttp3/HttpUrl;", "uri", "Ljava/net/URI;", "-deprecated_get", "url", "Ljava/net/URL;", "parse", "-deprecated_parse", "canonicalize", "pos", "limit", "encodeSet", "alreadyEncoded", "", "strict", "plusIsSpace", "unicodeAllowed", "charset", "Ljava/nio/charset/Charset;", "canonicalize$okhttp", "isPercentEncoded", "percentDecode", "percentDecode$okhttp", "toHttpUrl", "toHttpUrlOrNull", "toPathString", "", "", "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "toPathString$okhttp", "toQueryNamesAndValues", "", "toQueryNamesAndValues$okhttp", "toQueryString", "toQueryString$okhttp", "writeCanonicalized", "Lokio/Buffer;", "input", "writePercentDecoded", "encoded", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final int defaultPort(java.lang.String scheme) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
            int hashCode = scheme.hashCode();
            if (hashCode == 3213448) {
                if (scheme.equals("http")) {
                    return 80;
                }
            } else if (hashCode == 99617003 && scheme.equals("https")) {
                return 443;
            }
            return -1;
        }

        public final void toPathString$okhttp(java.util.List<java.lang.String> toPathString, java.lang.StringBuilder out) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toPathString, "$this$toPathString");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
            int size = toPathString.size();
            for (int i = 0; i < size; i++) {
                out.append('/');
                out.append(toPathString.get(i));
            }
        }

        public final void toQueryString$okhttp(java.util.List<java.lang.String> toQueryString, java.lang.StringBuilder out) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toQueryString, "$this$toQueryString");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
            kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, toQueryString.size()), 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if (step2 >= 0) {
                if (first > last) {
                    return;
                }
            } else if (first < last) {
                return;
            }
            while (true) {
                java.lang.String str = toQueryString.get(first);
                java.lang.String str2 = toQueryString.get(first + 1);
                if (first > 0) {
                    out.append(kotlin.text.Typography.amp);
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step2;
                }
            }
        }

        public final java.util.List<java.lang.String> toQueryNamesAndValues$okhttp(java.lang.String toQueryNamesAndValues) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = 0;
            while (i <= toQueryNamesAndValues.length()) {
                java.lang.String str = toQueryNamesAndValues;
                int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, kotlin.text.Typography.amp, i, false, 4, (java.lang.Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = toQueryNamesAndValues.length();
                }
                int i2 = indexOf$default;
                int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, '=', i, false, 4, (java.lang.Object) null);
                if (indexOf$default2 == -1 || indexOf$default2 > i2) {
                    java.lang.String substring = toQueryNamesAndValues.substring(i, i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    java.lang.String substring2 = toQueryNamesAndValues.substring(i, indexOf$default2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    java.lang.String substring3 = toQueryNamesAndValues.substring(indexOf$default2 + 1, i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl get(java.lang.String toHttpUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
            return new okhttp3.HttpUrl.Builder().parse$okhttp(null, toHttpUrl).build();
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl parse(java.lang.String toHttpUrlOrNull) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            try {
                okhttp3.HttpUrl.Companion companion = this;
                return get(toHttpUrlOrNull);
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl get(java.net.URL toHttpUrlOrNull) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            java.lang.String url = toHttpUrlOrNull.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "toString()");
            return parse(url);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl get(java.net.URI toHttpUrlOrNull) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            java.lang.String uri = toHttpUrlOrNull.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toString()");
            return parse(uri);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m2657deprecated_get(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            return get(url);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final okhttp3.HttpUrl m2660deprecated_parse(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            return parse(url);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m2659deprecated_get(java.net.URL url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            return get(url);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m2658deprecated_get(java.net.URI uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
            return get(uri);
        }

        public static /* synthetic */ java.lang.String percentDecode$okhttp$default(okhttp3.HttpUrl.Companion companion, java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        public final java.lang.String percentDecode$okhttp(java.lang.String percentDecode, int i, int i2, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentDecode, "$this$percentDecode");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = percentDecode.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    okio.Buffer buffer = new okio.Buffer();
                    buffer.writeUtf8(percentDecode, i, i3);
                    writePercentDecoded(buffer, percentDecode, i3, i2, z);
                    return buffer.readUtf8();
                }
            }
            java.lang.String substring = percentDecode.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        private final void writePercentDecoded(okio.Buffer buffer, java.lang.String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int parseHexDigit = okhttp3.internal.Util.parseHexDigit(str.charAt(i + 1));
                    int parseHexDigit2 = okhttp3.internal.Util.parseHexDigit(str.charAt(i3));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        buffer.writeByte((parseHexDigit << 4) + parseHexDigit2);
                        i = java.lang.Character.charCount(codePointAt) + i3;
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i += java.lang.Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z) {
                        buffer.writeByte(32);
                        i++;
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i += java.lang.Character.charCount(codePointAt);
                }
            }
        }

        private final boolean isPercentEncoded(java.lang.String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && okhttp3.internal.Util.parseHexDigit(str.charAt(i + 1)) != -1 && okhttp3.internal.Util.parseHexDigit(str.charAt(i3)) != -1;
        }

        public static /* synthetic */ java.lang.String canonicalize$okhttp$default(okhttp3.HttpUrl.Companion companion, java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
            java.nio.charset.Charset charset2;
            int i4 = (i3 & 1) != 0 ? 0 : i;
            int length = (i3 & 2) != 0 ? str.length() : i2;
            boolean z5 = (i3 & 8) != 0 ? false : z;
            boolean z6 = (i3 & 16) != 0 ? false : z2;
            boolean z7 = (i3 & 32) != 0 ? false : z3;
            boolean z8 = (i3 & 64) != 0 ? false : z4;
            if ((i3 & 128) != 0) {
                charset2 = null;
            } else {
                charset2 = charset;
            }
            return companion.canonicalize$okhttp(str, i4, length, str2, z5, z6, z7, z8, charset2);
        }

        public final java.lang.String canonicalize$okhttp(java.lang.String canonicalize, int i, int i2, java.lang.String encodeSet, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canonicalize, "$this$canonicalize");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = canonicalize.codePointAt(i3);
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) encodeSet, (char) codePointAt, false, 2, (java.lang.Object) null) || ((codePointAt == 37 && (!z || (z2 && !isPercentEncoded(canonicalize, i3, i2)))) || (codePointAt == 43 && z3)))) {
                    okio.Buffer buffer = new okio.Buffer();
                    buffer.writeUtf8(canonicalize, i, i3);
                    writeCanonicalized(buffer, canonicalize, i3, i2, encodeSet, z, z2, z3, z4, charset);
                    return buffer.readUtf8();
                }
                i3 += java.lang.Character.charCount(codePointAt);
            }
            java.lang.String substring = canonicalize.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        private final void writeCanonicalized(okio.Buffer buffer, java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset) {
            int i3 = i;
            okio.Buffer buffer2 = null;
            while (i3 < i2) {
                java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int codePointAt = str.codePointAt(i3);
                if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                    if (codePointAt == 43 && z3) {
                        buffer.writeUtf8(z ? "+" : "%2B");
                    } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (char) codePointAt, false, 2, (java.lang.Object) null) || (codePointAt == 37 && (!z || (z2 && !isPercentEncoded(str, i3, i2)))))) {
                        if (buffer2 == null) {
                            buffer2 = new okio.Buffer();
                        }
                        if (charset == null || kotlin.jvm.internal.Intrinsics.areEqual(charset, java.nio.charset.StandardCharsets.UTF_8)) {
                            buffer2.writeUtf8CodePoint(codePointAt);
                        } else {
                            buffer2.writeString(str, i3, java.lang.Character.charCount(codePointAt) + i3, charset);
                        }
                        while (!buffer2.exhausted()) {
                            int readByte = buffer2.readByte() & 255;
                            buffer.writeByte(37);
                            buffer.writeByte((int) okhttp3.HttpUrl.HEX_DIGITS[(readByte >> 4) & 15]);
                            buffer.writeByte((int) okhttp3.HttpUrl.HEX_DIGITS[readByte & 15]);
                        }
                    } else {
                        buffer.writeUtf8CodePoint(codePointAt);
                    }
                }
                i3 += java.lang.Character.charCount(codePointAt);
            }
        }
    }
}
