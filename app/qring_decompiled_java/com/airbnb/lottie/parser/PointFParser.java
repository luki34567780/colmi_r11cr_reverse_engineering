package com.airbnb.lottie.parser;

/* loaded from: classes.dex */
public class PointFParser implements com.airbnb.lottie.parser.ValueParser<android.graphics.PointF> {
    public static final com.airbnb.lottie.parser.PointFParser INSTANCE = new com.airbnb.lottie.parser.PointFParser();

    private PointFParser() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.parser.ValueParser
    public android.graphics.PointF parse(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) throws java.io.IOException {
        com.airbnb.lottie.parser.moshi.JsonReader.Token peek = jsonReader.peek();
        if (peek == com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY) {
            return com.airbnb.lottie.parser.JsonUtils.jsonToPoint(jsonReader, f);
        }
        if (peek == com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT) {
            return com.airbnb.lottie.parser.JsonUtils.jsonToPoint(jsonReader, f);
        }
        if (peek == com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER) {
            android.graphics.PointF pointF = new android.graphics.PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new java.lang.IllegalArgumentException("Cannot convert json to point. Next token is " + peek);
    }
}
