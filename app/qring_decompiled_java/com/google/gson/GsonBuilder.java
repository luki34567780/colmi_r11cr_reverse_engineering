package com.google.gson;

/* loaded from: /tmp/dex/classes2.dex */
public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private java.lang.String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private com.google.gson.internal.Excluder excluder;
    private final java.util.List<com.google.gson.TypeAdapterFactory> factories;
    private com.google.gson.FieldNamingStrategy fieldNamingPolicy;
    private boolean generateNonExecutableJson;
    private final java.util.List<com.google.gson.TypeAdapterFactory> hierarchyFactories;
    private final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;
    private boolean lenient;
    private com.google.gson.LongSerializationPolicy longSerializationPolicy;
    private com.google.gson.ToNumberStrategy numberToNumberStrategy;
    private com.google.gson.ToNumberStrategy objectToNumberStrategy;
    private boolean prettyPrinting;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private int timeStyle;

    public GsonBuilder() {
        this.excluder = com.google.gson.internal.Excluder.DEFAULT;
        this.longSerializationPolicy = com.google.gson.LongSerializationPolicy.DEFAULT;
        this.fieldNamingPolicy = com.google.gson.FieldNamingPolicy.IDENTITY;
        this.instanceCreators = new java.util.HashMap();
        this.factories = new java.util.ArrayList();
        this.hierarchyFactories = new java.util.ArrayList();
        this.serializeNulls = false;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.objectToNumberStrategy = com.google.gson.ToNumberPolicy.DOUBLE;
        this.numberToNumberStrategy = com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER;
    }

    GsonBuilder(com.google.gson.Gson gson) {
        this.excluder = com.google.gson.internal.Excluder.DEFAULT;
        this.longSerializationPolicy = com.google.gson.LongSerializationPolicy.DEFAULT;
        this.fieldNamingPolicy = com.google.gson.FieldNamingPolicy.IDENTITY;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.instanceCreators = hashMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.factories = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.hierarchyFactories = arrayList2;
        this.serializeNulls = false;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.prettyPrinting = false;
        this.generateNonExecutableJson = false;
        this.lenient = false;
        this.objectToNumberStrategy = com.google.gson.ToNumberPolicy.DOUBLE;
        this.numberToNumberStrategy = com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER;
        this.excluder = gson.excluder;
        this.fieldNamingPolicy = gson.fieldNamingStrategy;
        hashMap.putAll(gson.instanceCreators);
        this.serializeNulls = gson.serializeNulls;
        this.complexMapKeySerialization = gson.complexMapKeySerialization;
        this.generateNonExecutableJson = gson.generateNonExecutableJson;
        this.escapeHtmlChars = gson.htmlSafe;
        this.prettyPrinting = gson.prettyPrinting;
        this.lenient = gson.lenient;
        this.serializeSpecialFloatingPointValues = gson.serializeSpecialFloatingPointValues;
        this.longSerializationPolicy = gson.longSerializationPolicy;
        this.datePattern = gson.datePattern;
        this.dateStyle = gson.dateStyle;
        this.timeStyle = gson.timeStyle;
        arrayList.addAll(gson.builderFactories);
        arrayList2.addAll(gson.builderHierarchyFactories);
        this.objectToNumberStrategy = gson.objectToNumberStrategy;
        this.numberToNumberStrategy = gson.numberToNumberStrategy;
    }

    public com.google.gson.GsonBuilder setVersion(double d) {
        this.excluder = this.excluder.withVersion(d);
        return this;
    }

    public com.google.gson.GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        this.excluder = this.excluder.withModifiers(iArr);
        return this;
    }

    public com.google.gson.GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public com.google.gson.GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.excluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    public com.google.gson.GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    public com.google.gson.GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }

    public com.google.gson.GsonBuilder disableInnerClassSerialization() {
        this.excluder = this.excluder.disableInnerClassSerialization();
        return this;
    }

    public com.google.gson.GsonBuilder setLongSerializationPolicy(com.google.gson.LongSerializationPolicy longSerializationPolicy) {
        this.longSerializationPolicy = longSerializationPolicy;
        return this;
    }

    public com.google.gson.GsonBuilder setFieldNamingPolicy(com.google.gson.FieldNamingPolicy fieldNamingPolicy) {
        this.fieldNamingPolicy = fieldNamingPolicy;
        return this;
    }

    public com.google.gson.GsonBuilder setFieldNamingStrategy(com.google.gson.FieldNamingStrategy fieldNamingStrategy) {
        this.fieldNamingPolicy = fieldNamingStrategy;
        return this;
    }

    public com.google.gson.GsonBuilder setObjectToNumberStrategy(com.google.gson.ToNumberStrategy toNumberStrategy) {
        this.objectToNumberStrategy = toNumberStrategy;
        return this;
    }

    public com.google.gson.GsonBuilder setNumberToNumberStrategy(com.google.gson.ToNumberStrategy toNumberStrategy) {
        this.numberToNumberStrategy = toNumberStrategy;
        return this;
    }

    public com.google.gson.GsonBuilder setExclusionStrategies(com.google.gson.ExclusionStrategy... exclusionStrategyArr) {
        for (com.google.gson.ExclusionStrategy exclusionStrategy : exclusionStrategyArr) {
            this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, true);
        }
        return this;
    }

    public com.google.gson.GsonBuilder addSerializationExclusionStrategy(com.google.gson.ExclusionStrategy exclusionStrategy) {
        this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, false);
        return this;
    }

    public com.google.gson.GsonBuilder addDeserializationExclusionStrategy(com.google.gson.ExclusionStrategy exclusionStrategy) {
        this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, false, true);
        return this;
    }

    public com.google.gson.GsonBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    public com.google.gson.GsonBuilder setLenient() {
        this.lenient = true;
        return this;
    }

    public com.google.gson.GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public com.google.gson.GsonBuilder setDateFormat(java.lang.String str) {
        this.datePattern = str;
        return this;
    }

    public com.google.gson.GsonBuilder setDateFormat(int i) {
        this.dateStyle = i;
        this.datePattern = null;
        return this;
    }

    public com.google.gson.GsonBuilder setDateFormat(int i, int i2) {
        this.dateStyle = i;
        this.timeStyle = i2;
        this.datePattern = null;
        return this;
    }

    public com.google.gson.GsonBuilder registerTypeAdapter(java.lang.reflect.Type type, java.lang.Object obj) {
        boolean z = obj instanceof com.google.gson.JsonSerializer;
        com.google.gson.internal.C$Gson$Preconditions.checkArgument(z || (obj instanceof com.google.gson.JsonDeserializer) || (obj instanceof com.google.gson.InstanceCreator) || (obj instanceof com.google.gson.TypeAdapter));
        if (obj instanceof com.google.gson.InstanceCreator) {
            this.instanceCreators.put(type, (com.google.gson.InstanceCreator) obj);
        }
        if (z || (obj instanceof com.google.gson.JsonDeserializer)) {
            this.factories.add(com.google.gson.internal.bind.TreeTypeAdapter.newFactoryWithMatchRawType(com.google.gson.reflect.TypeToken.get(type), obj));
        }
        if (obj instanceof com.google.gson.TypeAdapter) {
            this.factories.add(com.google.gson.internal.bind.TypeAdapters.newFactory(com.google.gson.reflect.TypeToken.get(type), (com.google.gson.TypeAdapter) obj));
        }
        return this;
    }

    public com.google.gson.GsonBuilder registerTypeAdapterFactory(com.google.gson.TypeAdapterFactory typeAdapterFactory) {
        this.factories.add(typeAdapterFactory);
        return this;
    }

    public com.google.gson.GsonBuilder registerTypeHierarchyAdapter(java.lang.Class<?> cls, java.lang.Object obj) {
        boolean z = obj instanceof com.google.gson.JsonSerializer;
        com.google.gson.internal.C$Gson$Preconditions.checkArgument(z || (obj instanceof com.google.gson.JsonDeserializer) || (obj instanceof com.google.gson.TypeAdapter));
        if ((obj instanceof com.google.gson.JsonDeserializer) || z) {
            this.hierarchyFactories.add(com.google.gson.internal.bind.TreeTypeAdapter.newTypeHierarchyFactory(cls, obj));
        }
        if (obj instanceof com.google.gson.TypeAdapter) {
            this.factories.add(com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(cls, (com.google.gson.TypeAdapter) obj));
        }
        return this;
    }

    public com.google.gson.GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public com.google.gson.Gson create() {
        java.util.List<com.google.gson.TypeAdapterFactory> arrayList = new java.util.ArrayList<>(this.factories.size() + this.hierarchyFactories.size() + 3);
        arrayList.addAll(this.factories);
        java.util.Collections.reverse(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.hierarchyFactories);
        java.util.Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList);
        return new com.google.gson.Gson(this.excluder, this.fieldNamingPolicy, this.instanceCreators, this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.lenient, this.serializeSpecialFloatingPointValues, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, this.factories, this.hierarchyFactories, arrayList, this.objectToNumberStrategy, this.numberToNumberStrategy);
    }

    private void addTypeAdaptersForDate(java.lang.String str, int i, int i2, java.util.List<com.google.gson.TypeAdapterFactory> list) {
        com.google.gson.TypeAdapterFactory typeAdapterFactory;
        com.google.gson.TypeAdapterFactory typeAdapterFactory2;
        boolean z = com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES;
        com.google.gson.TypeAdapterFactory typeAdapterFactory3 = null;
        if (str != null && !str.trim().isEmpty()) {
            typeAdapterFactory = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(str);
            if (z) {
                typeAdapterFactory3 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(str);
                typeAdapterFactory2 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(str);
            }
            typeAdapterFactory2 = null;
        } else {
            if (i == 2 || i2 == 2) {
                return;
            }
            com.google.gson.TypeAdapterFactory createAdapterFactory = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(i, i2);
            if (z) {
                typeAdapterFactory3 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(i, i2);
                com.google.gson.TypeAdapterFactory createAdapterFactory2 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(i, i2);
                typeAdapterFactory = createAdapterFactory;
                typeAdapterFactory2 = createAdapterFactory2;
            } else {
                typeAdapterFactory = createAdapterFactory;
                typeAdapterFactory2 = null;
            }
        }
        list.add(typeAdapterFactory);
        if (z) {
            list.add(typeAdapterFactory3);
            list.add(typeAdapterFactory2);
        }
    }
}
