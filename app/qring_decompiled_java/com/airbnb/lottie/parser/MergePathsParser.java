package com.airbnb.lottie.parser;

/* loaded from: classes.dex */
class MergePathsParser {
    private static final com.airbnb.lottie.parser.moshi.JsonReader.Options NAMES = com.airbnb.lottie.parser.moshi.JsonReader.Options.of("nm", "mm", "hd");

    private MergePathsParser() {
    }

    static com.airbnb.lottie.model.content.MergePaths parse(com.airbnb.lottie.parser.moshi.JsonReader jsonReader) throws java.io.IOException {
        java.lang.String str = null;
        com.airbnb.lottie.model.content.MergePaths.MergePathsMode mergePathsMode = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                str = jsonReader.nextString();
            } else if (selectName == 1) {
                mergePathsMode = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.forId(jsonReader.nextInt());
            } else if (selectName == 2) {
                z = jsonReader.nextBoolean();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        return new com.airbnb.lottie.model.content.MergePaths(str, mergePathsMode, z);
    }
}
