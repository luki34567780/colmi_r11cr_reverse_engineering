package com.google.gson;

/* loaded from: /tmp/dex/classes2.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public com.google.gson.JsonElement serialize(java.lang.Long l) {
            if (l == null) {
                return com.google.gson.JsonNull.INSTANCE;
            }
            return new com.google.gson.JsonPrimitive(l);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public com.google.gson.JsonElement serialize(java.lang.Long l) {
            if (l == null) {
                return com.google.gson.JsonNull.INSTANCE;
            }
            return new com.google.gson.JsonPrimitive(l.toString());
        }
    };

    public abstract com.google.gson.JsonElement serialize(java.lang.Long l);
}
