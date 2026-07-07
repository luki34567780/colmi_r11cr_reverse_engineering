package com.airbnb.lottie.parser;

/* loaded from: classes.dex */
class JsonUtils {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options POINT_NAMES = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("x", "y");

    private JsonUtils() {
    }

    static int jsonToColor(com.airbnb.lottie.parser.moshi.JsonReader jsonReader) throws java.io.IOException {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return android.graphics.Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    static java.util.List<android.graphics.PointF> jsonToPoints(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(jsonToPoint(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* renamed from: com.airbnb.lottie.parser.JsonUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token;

        static {
            int[] iArr = new int[com.airbnb.lottie.parser.moshi.JsonReader.Token.values().length];
            $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token = iArr;
            try {
                iArr[com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static android.graphics.PointF jsonToPoint(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) throws java.io.IOException {
        int i = com.airbnb.lottie.parser.JsonUtils.AnonymousClass1.$SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[jsonReader.peek().ordinal()];
        if (i == 1) {
            return jsonNumbersToPoint(jsonReader, f);
        }
        if (i == 2) {
            return jsonArrayToPoint(jsonReader, f);
        }
        if (i == 3) {
            return jsonObjectToPoint(jsonReader, f);
        }
        throw new java.lang.IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
    }

    private static android.graphics.PointF jsonNumbersToPoint(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) throws java.io.IOException {
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new android.graphics.PointF(nextDouble * f, nextDouble2 * f);
    }

    private static android.graphics.PointF jsonArrayToPoint(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) throws java.io.IOException {
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != com.airbnb.lottie.parser.moshi.JsonReader.Token.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new android.graphics.PointF(nextDouble * f, nextDouble2 * f);
    }

    private static android.graphics.PointF jsonObjectToPoint(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) throws java.io.IOException {
        jsonReader.beginObject();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(POINT_NAMES);
            if (selectName == 0) {
                f2 = valueFromObject(jsonReader);
            } else if (selectName == 1) {
                f3 = valueFromObject(jsonReader);
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new android.graphics.PointF(f2 * f, f3 * f);
    }

    static float valueFromObject(com.airbnb.lottie.parser.moshi.JsonReader jsonReader) throws java.io.IOException {
        com.airbnb.lottie.parser.moshi.JsonReader.Token peek = jsonReader.peek();
        int i = com.airbnb.lottie.parser.JsonUtils.AnonymousClass1.$SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token[peek.ordinal()];
        if (i == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i == 2) {
            jsonReader.beginArray();
            float nextDouble = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return nextDouble;
        }
        throw new java.lang.IllegalArgumentException("Unknown value for token of type " + peek);
    }
}
