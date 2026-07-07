package com.squareup.moshi;

/* loaded from: classes3.dex */
public abstract class JsonWriter implements java.io.Closeable, java.io.Flushable {
    java.lang.String indent;
    boolean lenient;
    boolean promoteValueToName;
    boolean serializeNulls;
    private java.util.Map<java.lang.Class<?>, java.lang.Object> tags;
    int stackSize = 0;
    int[] scopes = new int[32];
    java.lang.String[] pathNames = new java.lang.String[32];
    int[] pathIndices = new int[32];
    int flattenStackSize = -1;

    public abstract com.squareup.moshi.JsonWriter beginArray() throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter beginObject() throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter endArray() throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter endObject() throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter name(java.lang.String str) throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter nullValue() throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter value(double d) throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter value(long j) throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter value(@javax.annotation.Nullable java.lang.Boolean bool) throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter value(@javax.annotation.Nullable java.lang.Number number) throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter value(@javax.annotation.Nullable java.lang.String str) throws java.io.IOException;

    public abstract com.squareup.moshi.JsonWriter value(boolean z) throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public abstract okio.BufferedSink valueSink() throws java.io.IOException;

    @javax.annotation.CheckReturnValue
    public static com.squareup.moshi.JsonWriter of(okio.BufferedSink bufferedSink) {
        return new com.squareup.moshi.JsonUtf8Writer(bufferedSink);
    }

    JsonWriter() {
    }

    final int peekScope() {
        int i = this.stackSize;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        return this.scopes[i - 1];
    }

    final boolean checkStack() {
        int i = this.stackSize;
        int[] iArr = this.scopes;
        if (i != iArr.length) {
            return false;
        }
        if (i == 256) {
            throw new com.squareup.moshi.JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.scopes = java.util.Arrays.copyOf(iArr, iArr.length * 2);
        java.lang.String[] strArr = this.pathNames;
        this.pathNames = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.pathIndices;
        this.pathIndices = java.util.Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof com.squareup.moshi.JsonValueWriter)) {
            return true;
        }
        com.squareup.moshi.JsonValueWriter jsonValueWriter = (com.squareup.moshi.JsonValueWriter) this;
        jsonValueWriter.stack = java.util.Arrays.copyOf(jsonValueWriter.stack, jsonValueWriter.stack.length * 2);
        return true;
    }

    final void pushScope(int i) {
        int[] iArr = this.scopes;
        int i2 = this.stackSize;
        this.stackSize = i2 + 1;
        iArr[i2] = i;
    }

    final void replaceTop(int i) {
        this.scopes[this.stackSize - 1] = i;
    }

    public void setIndent(java.lang.String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.indent = str;
    }

    @javax.annotation.CheckReturnValue
    public final java.lang.String getIndent() {
        java.lang.String str = this.indent;
        return str != null ? str : "";
    }

    public final void setLenient(boolean z) {
        this.lenient = z;
    }

    @javax.annotation.CheckReturnValue
    public final boolean isLenient() {
        return this.lenient;
    }

    public final void setSerializeNulls(boolean z) {
        this.serializeNulls = z;
    }

    @javax.annotation.CheckReturnValue
    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final com.squareup.moshi.JsonWriter value(okio.BufferedSource bufferedSource) throws java.io.IOException {
        if (this.promoteValueToName) {
            throw new java.lang.IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + getPath());
        }
        okio.BufferedSink valueSink = valueSink();
        try {
            bufferedSource.readAll(valueSink);
            if (valueSink != null) {
                valueSink.close();
            }
            return this;
        } catch (java.lang.Throwable th) {
            if (valueSink != null) {
                try {
                    valueSink.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final com.squareup.moshi.JsonWriter jsonValue(@javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof java.util.Map) {
            beginObject();
            for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                java.lang.Object key = entry.getKey();
                if (!(key instanceof java.lang.String)) {
                    throw new java.lang.IllegalArgumentException(key == null ? "Map keys must be non-null" : "Map keys must be of type String: " + key.getClass().getName());
                }
                name((java.lang.String) key);
                jsonValue(entry.getValue());
            }
            endObject();
        } else if (obj instanceof java.util.List) {
            beginArray();
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                jsonValue(it.next());
            }
            endArray();
        } else if (obj instanceof java.lang.String) {
            value((java.lang.String) obj);
        } else if (obj instanceof java.lang.Boolean) {
            value(((java.lang.Boolean) obj).booleanValue());
        } else if (obj instanceof java.lang.Double) {
            value(((java.lang.Double) obj).doubleValue());
        } else if (obj instanceof java.lang.Long) {
            value(((java.lang.Long) obj).longValue());
        } else if (obj instanceof java.lang.Number) {
            value((java.lang.Number) obj);
        } else if (obj == null) {
            nullValue();
        } else {
            throw new java.lang.IllegalArgumentException("Unsupported type: " + obj.getClass().getName());
        }
        return this;
    }

    public final void promoteValueToName() throws java.io.IOException {
        int peekScope = peekScope();
        if (peekScope != 5 && peekScope != 3) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        this.promoteValueToName = true;
    }

    @javax.annotation.CheckReturnValue
    public final int beginFlatten() {
        int peekScope = peekScope();
        if (peekScope != 5 && peekScope != 3 && peekScope != 2 && peekScope != 1) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        int i = this.flattenStackSize;
        this.flattenStackSize = this.stackSize;
        return i;
    }

    public final void endFlatten(int i) {
        this.flattenStackSize = i;
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
}
