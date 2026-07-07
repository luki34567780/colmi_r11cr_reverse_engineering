package okhttp3;

/* compiled from: Headers.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 '2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002&'B\u0015\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u0003H\u0007J\b\u0010\u0017\u001a\u00020\tH\u0016J\u001b\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0019H\u0096\u0002J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u001fJ\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"0!J\b\u0010#\u001a\u00020\u0003H\u0016J\u000e\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tJ\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\"2\u0006\u0010\u0012\u001a\u00020\u0003R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006("}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "namesAndValues", "", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "size", "", "()I", "byteCount", "", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "get", "name", "getDate", "Ljava/util/Date;", "getInstant", "Ljava/time/Instant;", "hashCode", "iterator", "", "index", "names", "", "newBuilder", "Lokhttp3/Headers$Builder;", "-deprecated_size", "toMultimap", "", "", "toString", "value", "values", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Headers implements java.lang.Iterable<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.Headers.Companion INSTANCE = new okhttp3.Headers.Companion(null);
    private final java.lang.String[] namesAndValues;

    @kotlin.jvm.JvmStatic
    public static final okhttp3.Headers of(java.util.Map<java.lang.String, java.lang.String> map) {
        return INSTANCE.of(map);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.Headers of(java.lang.String... strArr) {
        return INSTANCE.of(strArr);
    }

    private Headers(java.lang.String[] strArr) {
        this.namesAndValues = strArr;
    }

    public /* synthetic */ Headers(java.lang.String[] strArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public final java.lang.String get(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return INSTANCE.get(this.namesAndValues, name);
    }

    public final java.util.Date getDate(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.lang.String str = get(name);
        if (str != null) {
            return okhttp3.internal.http.DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    public final java.time.Instant getInstant(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.util.Date date = getDate(name);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m2635deprecated_size() {
        return size();
    }

    public final java.lang.String name(int index) {
        return this.namesAndValues[index * 2];
    }

    public final java.lang.String value(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    public final java.util.Set<java.lang.String> names() {
        java.util.TreeSet treeSet = new java.util.TreeSet(kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(kotlin.jvm.internal.StringCompanionObject.INSTANCE));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        java.util.Set<java.lang.String> unmodifiableSet = java.util.Collections.unmodifiableSet(treeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final java.util.List<java.lang.String> values(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.util.ArrayList arrayList = null;
        int size = size();
        for (int i = 0; i < size; i++) {
            if (kotlin.text.StringsKt.equals(name, name(i), true)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        if (arrayList != null) {
            java.util.List<java.lang.String> unmodifiableList = java.util.Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiableList(result)");
            return unmodifiableList;
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public final long byteCount() {
        java.lang.String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.namesAndValues[i].length();
        }
        return length;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>> iterator() {
        int size = size();
        kotlin.Pair[] pairArr = new kotlin.Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = kotlin.TuplesKt.to(name(i), value(i));
        }
        return kotlin.jvm.internal.ArrayIteratorKt.iterator(pairArr);
    }

    public final okhttp3.Headers.Builder newBuilder() {
        okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
        kotlin.collections.CollectionsKt.addAll(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof okhttp3.Headers) && java.util.Arrays.equals(this.namesAndValues, ((okhttp3.Headers) other).namesAndValues);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.namesAndValues);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            java.lang.String name = name(i);
            java.lang.String value = value(i);
            sb.append(name);
            sb.append(": ");
            if (okhttp3.internal.Util.isSensitiveHeader(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> toMultimap() {
        java.util.TreeMap treeMap = new java.util.TreeMap(kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(kotlin.jvm.internal.StringCompanionObject.INSTANCE));
        int size = size();
        for (int i = 0; i < size; i++) {
            java.lang.String name = name(i);
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            java.util.Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            java.lang.String lowerCase = name.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            java.util.ArrayList arrayList = (java.util.List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i));
        }
        return treeMap;
    }

    /* compiled from: Headers.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0010J\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0086\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lokhttp3/Headers$Builder;", "", "()V", "namesAndValues", "", "", "getNamesAndValues$okhttp", "()Ljava/util/List;", "add", "line", "name", "value", "Ljava/time/Instant;", "Ljava/util/Date;", "addAll", "headers", "Lokhttp3/Headers;", "addLenient", "addLenient$okhttp", "addUnsafeNonAscii", "build", "get", "removeAll", "set", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {
        private final java.util.List<java.lang.String> namesAndValues = new java.util.ArrayList(20);

        public final java.util.List<java.lang.String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final okhttp3.Headers.Builder addLenient$okhttp(java.lang.String line) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line, "line");
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) line, ':', 1, false, 4, (java.lang.Object) null);
            if (indexOf$default != -1) {
                java.lang.String substring = line.substring(0, indexOf$default);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                java.lang.String substring2 = line.substring(indexOf$default + 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
            } else if (line.charAt(0) == ':') {
                java.lang.String substring3 = line.substring(1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", substring3);
            } else {
                addLenient$okhttp("", line);
            }
            return this;
        }

        public final okhttp3.Headers.Builder add(java.lang.String line) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line, "line");
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) line, ':', 0, false, 6, (java.lang.Object) null);
            if (!(indexOf$default != -1)) {
                throw new java.lang.IllegalArgumentException(("Unexpected header: " + line).toString());
            }
            java.lang.String substring = line.substring(0, indexOf$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            java.util.Objects.requireNonNull(substring, "null cannot be cast to non-null type kotlin.CharSequence");
            java.lang.String obj = kotlin.text.StringsKt.trim((java.lang.CharSequence) substring).toString();
            java.lang.String substring2 = line.substring(indexOf$default + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
            add(obj, substring2);
            return this;
        }

        public final okhttp3.Headers.Builder add(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            okhttp3.Headers.INSTANCE.checkName(name);
            okhttp3.Headers.INSTANCE.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final okhttp3.Headers.Builder addUnsafeNonAscii(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            okhttp3.Headers.INSTANCE.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final okhttp3.Headers.Builder addAll(okhttp3.Headers headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return this;
        }

        public final okhttp3.Headers.Builder add(java.lang.String name, java.util.Date value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            add(name, okhttp3.internal.http.DatesKt.toHttpDateString(value));
            return this;
        }

        public final okhttp3.Headers.Builder add(java.lang.String name, java.time.Instant value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            add(name, new java.util.Date(value.toEpochMilli()));
            return this;
        }

        public final okhttp3.Headers.Builder set(java.lang.String name, java.util.Date value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            set(name, okhttp3.internal.http.DatesKt.toHttpDateString(value));
            return this;
        }

        public final okhttp3.Headers.Builder set(java.lang.String name, java.time.Instant value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            return set(name, new java.util.Date(value.toEpochMilli()));
        }

        public final okhttp3.Headers.Builder addLenient$okhttp(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(kotlin.text.StringsKt.trim((java.lang.CharSequence) value).toString());
            return this;
        }

        public final okhttp3.Headers.Builder removeAll(java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (kotlin.text.StringsKt.equals(name, this.namesAndValues.get(i), true)) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final okhttp3.Headers.Builder set(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            okhttp3.Headers.INSTANCE.checkName(name);
            okhttp3.Headers.INSTANCE.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final java.lang.String get(java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.downTo(this.namesAndValues.size() - 2, 0), 2);
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
            while (!kotlin.text.StringsKt.equals(name, this.namesAndValues.get(first), true)) {
                if (first == last) {
                    return null;
                }
                first += step2;
            }
            return this.namesAndValues.get(first + 1);
        }

        public final okhttp3.Headers build() {
            java.lang.Object[] array = this.namesAndValues.toArray(new java.lang.String[0]);
            java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new okhttp3.Headers((java.lang.String[]) array, null);
        }
    }

    /* compiled from: Headers.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J%\u0010\t\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u0011J\u001d\u0010\u0014\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u000f¨\u0006\u0015"}, d2 = {"Lokhttp3/Headers$Companion;", "", "()V", "checkName", "", "name", "", "checkValue", "value", "get", "namesAndValues", "", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "headersOf", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "-deprecated_of", "headers", "", "toHeaders", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String get(java.lang.String[] namesAndValues, java.lang.String name) {
            kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.downTo(namesAndValues.length - 2, 0), 2);
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
            while (!kotlin.text.StringsKt.equals(name, namesAndValues[first], true)) {
                if (first == last) {
                    return null;
                }
                first += step2;
            }
            return namesAndValues[first + 1];
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.Headers of(java.lang.String... namesAndValues) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (!(namesAndValues.length % 2 == 0)) {
                throw new java.lang.IllegalArgumentException("Expected alternating header names and values".toString());
            }
            java.lang.Object clone = namesAndValues.clone();
            java.util.Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            java.lang.String[] strArr = (java.lang.String[]) clone;
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (!(strArr[i] != null)) {
                    throw new java.lang.IllegalArgumentException("Headers cannot be null".toString());
                }
                java.lang.String str = strArr[i];
                java.util.Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                strArr[i] = kotlin.text.StringsKt.trim((java.lang.CharSequence) str).toString();
            }
            kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.collections.ArraysKt.getIndices(strArr), 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if (step2 < 0 ? first >= last : first <= last) {
                while (true) {
                    java.lang.String str2 = strArr[first];
                    java.lang.String str3 = strArr[first + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (first == last) {
                        break;
                    }
                    first += step2;
                }
            }
            return new okhttp3.Headers(strArr, null);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "function name changed", replaceWith = @kotlin.ReplaceWith(expression = "headersOf(*namesAndValues)", imports = {}))
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final okhttp3.Headers m2637deprecated_of(java.lang.String... namesAndValues) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            return of((java.lang.String[]) java.util.Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.Headers of(java.util.Map<java.lang.String, java.lang.String> toHeaders) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toHeaders, "$this$toHeaders");
            java.lang.String[] strArr = new java.lang.String[toHeaders.size() * 2];
            int i = 0;
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : toHeaders.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                java.util.Objects.requireNonNull(key, "null cannot be cast to non-null type kotlin.CharSequence");
                java.lang.String obj = kotlin.text.StringsKt.trim((java.lang.CharSequence) key).toString();
                java.util.Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.CharSequence");
                java.lang.String obj2 = kotlin.text.StringsKt.trim((java.lang.CharSequence) value).toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i] = obj;
                strArr[i + 1] = obj2;
                i += 2;
            }
            return new okhttp3.Headers(strArr, null);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "function moved to extension", replaceWith = @kotlin.ReplaceWith(expression = "headers.toHeaders()", imports = {}))
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final okhttp3.Headers m2636deprecated_of(java.util.Map<java.lang.String, java.lang.String> headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
            return of(headers);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(java.lang.String name) {
            java.lang.String str = name;
            if (!(str.length() > 0)) {
                throw new java.lang.IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = name.charAt(i);
                if (!('!' <= charAt && '~' >= charAt)) {
                    throw new java.lang.IllegalArgumentException(okhttp3.internal.Util.format("Unexpected char %#04x at %d in header name: %s", java.lang.Integer.valueOf(charAt), java.lang.Integer.valueOf(i), name).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(java.lang.String value, java.lang.String name) {
            int length = value.length();
            for (int i = 0; i < length; i++) {
                char charAt = value.charAt(i);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(okhttp3.internal.Util.format("Unexpected char %#04x at %d in %s value", java.lang.Integer.valueOf(charAt), java.lang.Integer.valueOf(i), name));
                    sb.append(okhttp3.internal.Util.isSensitiveHeader(name) ? "" : ": " + value);
                    throw new java.lang.IllegalArgumentException(sb.toString().toString());
                }
            }
        }
    }
}
