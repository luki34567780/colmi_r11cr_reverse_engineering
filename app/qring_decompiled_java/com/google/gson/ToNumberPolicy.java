package com.google.gson;

/* loaded from: /tmp/dex/classes2.dex */
public enum ToNumberPolicy implements com.google.gson.ToNumberStrategy {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.ToNumberStrategy
        public java.lang.Double readNumber(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            return java.lang.Double.valueOf(jsonReader.nextDouble());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.ToNumberStrategy
        public java.lang.Number readNumber(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            return new com.google.gson.internal.LazilyParsedNumber(jsonReader.nextString());
        }
    },
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
        @Override // com.google.gson.ToNumberStrategy
        public java.lang.Number readNumber(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException, com.google.gson.JsonParseException {
            java.lang.String nextString = jsonReader.nextString();
            try {
                try {
                    return java.lang.Long.valueOf(java.lang.Long.parseLong(nextString));
                } catch (java.lang.NumberFormatException e) {
                    throw new com.google.gson.JsonParseException("Cannot parse " + nextString + "; at path " + jsonReader.getPath(), e);
                }
            } catch (java.lang.NumberFormatException unused) {
                java.lang.Double valueOf = java.lang.Double.valueOf(nextString);
                if ((!valueOf.isInfinite() && !valueOf.isNaN()) || jsonReader.isLenient()) {
                    return valueOf;
                }
                throw new com.google.gson.stream.MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPath());
            }
        }
    },
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.ToNumberStrategy
        public java.math.BigDecimal readNumber(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            java.lang.String nextString = jsonReader.nextString();
            try {
                return new java.math.BigDecimal(nextString);
            } catch (java.lang.NumberFormatException e) {
                throw new com.google.gson.JsonParseException("Cannot parse " + nextString + "; at path " + jsonReader.getPath(), e);
            }
        }
    }
}
