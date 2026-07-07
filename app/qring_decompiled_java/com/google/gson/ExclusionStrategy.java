package com.google.gson;

/* loaded from: /tmp/dex/classes2.dex */
public interface ExclusionStrategy {
    boolean shouldSkipClass(java.lang.Class<?> cls);

    boolean shouldSkipField(com.google.gson.FieldAttributes fieldAttributes);
}
