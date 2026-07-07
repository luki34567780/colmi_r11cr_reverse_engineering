package com.google.gson.internal.bind;

/* loaded from: /tmp/dex/classes2.dex */
public final class NumberTypeAdapter extends com.google.gson.TypeAdapter<java.lang.Number> {
    private static final com.google.gson.TypeAdapterFactory LAZILY_PARSED_NUMBER_FACTORY = newFactory(com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER);
    private final com.google.gson.ToNumberStrategy toNumberStrategy;

    private NumberTypeAdapter(com.google.gson.ToNumberStrategy toNumberStrategy) {
        this.toNumberStrategy = toNumberStrategy;
    }

    private static com.google.gson.TypeAdapterFactory newFactory(com.google.gson.ToNumberStrategy toNumberStrategy) {
        return new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.TypeAdapterFactory
            public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
                if (typeToken.getRawType() == java.lang.Number.class) {
                    return com.google.gson.internal.bind.NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    public static com.google.gson.TypeAdapterFactory getFactory(com.google.gson.ToNumberStrategy toNumberStrategy) {
        if (toNumberStrategy == com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER) {
            return LAZILY_PARSED_NUMBER_FACTORY;
        }
        return newFactory(toNumberStrategy);
    }

    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[com.google.gson.stream.JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[com.google.gson.stream.JsonToken.NULL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.NUMBER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public java.lang.Number read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        com.google.gson.stream.JsonToken peek = jsonReader.peek();
        int i = com.google.gson.internal.bind.NumberTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()];
        if (i == 1) {
            jsonReader.nextNull();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.toNumberStrategy.readNumber(jsonReader);
        }
        throw new com.google.gson.JsonSyntaxException("Expecting number, got: " + peek);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
        jsonWriter.value(number);
    }
}
