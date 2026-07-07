package com.squareup.moshi;

/* loaded from: classes3.dex */
public abstract class JsonReader implements java.io.Closeable {
    boolean failOnUnknown;
    boolean lenient;
    int[] pathIndices;
    java.lang.String[] pathNames;
    int[] scopes;
    int stackSize;
    private java.util.Map<java.lang.Class<?>, java.lang.Object> tags;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public abstract void beginArray() throws java.io.IOException;

    public abstract void beginObject() throws java.io.IOException;

    public abstract void endArray() throws java.io.IOException;

    public abstract void endObject() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract boolean hasNext() throws java.io.IOException;

    public abstract boolean nextBoolean() throws java.io.IOException;

    public abstract double nextDouble() throws java.io.IOException;

    public abstract int nextInt() throws java.io.IOException;

    public abstract long nextLong() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract java.lang.String nextName() throws java.io.IOException;

    @javax.annotation.Nullable
    public abstract <T> T nextNull() throws java.io.IOException;

    public abstract okio.BufferedSource nextSource() throws java.io.IOException;

    public abstract java.lang.String nextString() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract com.squareup.moshi.JsonReader.Token peek() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract com.squareup.moshi.JsonReader peekJson();

    public abstract void promoteNameToValue() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract int selectName(com.squareup.moshi.JsonReader.Options options) throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract int selectString(com.squareup.moshi.JsonReader.Options options) throws java.io.IOException;

    public abstract void skipName() throws java.io.IOException;

    public abstract void skipValue() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public static com.squareup.moshi.JsonReader of(okio.BufferedSource bufferedSource) {
        return new com.squareup.moshi.JsonUtf8Reader(bufferedSource);
    }

    JsonReader() {
        this.scopes = new int[32];
        this.pathNames = new java.lang.String[32];
        this.pathIndices = new int[32];
    }

    JsonReader(com.squareup.moshi.JsonReader jsonReader) {
        this.stackSize = jsonReader.stackSize;
        this.scopes = (int[]) jsonReader.scopes.clone();
        this.pathNames = (java.lang.String[]) jsonReader.pathNames.clone();
        this.pathIndices = (int[]) jsonReader.pathIndices.clone();
        this.lenient = jsonReader.lenient;
        this.failOnUnknown = jsonReader.failOnUnknown;
    }

    final void pushScope(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.scopes;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new com.squareup.moshi.JsonDataException("Nesting too deep at " + getPath());
            }
            this.scopes = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            java.lang.String[] strArr = this.pathNames;
            this.pathNames = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.pathIndices;
            this.pathIndices = java.util.Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.scopes;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr3[i3] = i;
    }

    final com.squareup.moshi.JsonEncodingException syntaxError(java.lang.String str) throws com.squareup.moshi.JsonEncodingException {
        throw new com.squareup.moshi.JsonEncodingException(str + " at path " + getPath());
    }

    final com.squareup.moshi.JsonDataException typeMismatch(@javax.annotation.Nullable java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return new com.squareup.moshi.JsonDataException("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new com.squareup.moshi.JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    public final void setLenient(boolean z) {
        this.lenient = z;
    }

    @javax.annotation.CheckReturnValue
    public final boolean isLenient() {
        return this.lenient;
    }

    public final void setFailOnUnknown(boolean z) {
        this.failOnUnknown = z;
    }

    @javax.annotation.CheckReturnValue
    public final boolean failOnUnknown() {
        return this.failOnUnknown;
    }

    /* renamed from: com.squareup.moshi.JsonReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$moshi$JsonReader$Token;

        static {
            int[] iArr = new int[com.squareup.moshi.JsonReader.Token.values().length];
            $SwitchMap$com$squareup$moshi$JsonReader$Token = iArr;
            try {
                iArr[com.squareup.moshi.JsonReader.Token.BEGIN_ARRAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[com.squareup.moshi.JsonReader.Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[com.squareup.moshi.JsonReader.Token.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[com.squareup.moshi.JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[com.squareup.moshi.JsonReader.Token.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$squareup$moshi$JsonReader$Token[com.squareup.moshi.JsonReader.Token.NULL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    @javax.annotation.Nullable
    public final java.lang.Object readJsonValue() throws java.io.IOException {
        switch (com.squareup.moshi.JsonReader.AnonymousClass1.$SwitchMap$com$squareup$moshi$JsonReader$Token[peek().ordinal()]) {
            case 1:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                beginArray();
                while (hasNext()) {
                    arrayList.add(readJsonValue());
                }
                endArray();
                return arrayList;
            case 2:
                com.squareup.moshi.LinkedHashTreeMap linkedHashTreeMap = new com.squareup.moshi.LinkedHashTreeMap();
                beginObject();
                while (hasNext()) {
                    java.lang.String nextName = nextName();
                    java.lang.Object readJsonValue = readJsonValue();
                    java.lang.Object put = linkedHashTreeMap.put(nextName, readJsonValue);
                    if (put != null) {
                        throw new com.squareup.moshi.JsonDataException("Map key '" + nextName + "' has multiple values at path " + getPath() + ": " + put + " and " + readJsonValue);
                    }
                }
                endObject();
                return linkedHashTreeMap;
            case 3:
                return nextString();
            case 4:
                return java.lang.Double.valueOf(nextDouble());
            case 5:
                return java.lang.Boolean.valueOf(nextBoolean());
            case 6:
                return nextNull();
            default:
                throw new java.lang.IllegalStateException("Expected a value but was " + peek() + " at path " + getPath());
        }
    }

    @javax.annotation.CheckReturnValue
    public final java.lang.String getPath() {
        return com.squareup.moshi.JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    @javax.annotation.CheckReturnValue
    @javax.annotation.Nullable
    public final <T> T tag(java.lang.Class<T> cls) {
        java.util.Map<java.lang.Class<?>, java.lang.Object> map = this.tags;
        if (map == null) {
            return null;
        }
        return (T) map.get(cls);
    }

    public final <T> void setTag(java.lang.Class<T> cls, T t) {
        if (!cls.isAssignableFrom(t.getClass())) {
            throw new java.lang.IllegalArgumentException("Tag value must be of type " + cls.getName());
        }
        if (this.tags == null) {
            this.tags = new java.util.LinkedHashMap();
        }
        this.tags.put(cls, t);
    }

    public static final class Options {
        final okio.Options doubleQuoteSuffix;
        final java.lang.String[] strings;

        private Options(java.lang.String[] strArr, okio.Options options) {
            this.strings = strArr;
            this.doubleQuoteSuffix = options;
        }

        public java.util.List<java.lang.String> strings() {
            return java.util.Collections.unmodifiableList(java.util.Arrays.asList(this.strings));
        }

        @javax.annotation.CheckReturnValue
        public static com.squareup.moshi.JsonReader.Options of(java.lang.String... strArr) {
            try {
                okio.ByteString[] byteStringArr = new okio.ByteString[strArr.length];
                okio.Buffer buffer = new okio.Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    com.squareup.moshi.JsonUtf8Writer.string(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.readByteString();
                }
                return new com.squareup.moshi.JsonReader.Options((java.lang.String[]) strArr.clone(), okio.Options.of(byteStringArr));
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }
    }
}
