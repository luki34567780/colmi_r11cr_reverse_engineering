package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class GeoResultParser extends com.google.zxing.client.result.ResultParser {
    private static final java.util.regex.Pattern GEO_URL_PATTERN = java.util.regex.Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    @Override // com.google.zxing.client.result.ResultParser
    public com.google.zxing.client.result.GeoParsedResult parse(com.google.zxing.Result result) {
        java.util.regex.Matcher matcher = GEO_URL_PATTERN.matcher(getMassagedText(result));
        if (!matcher.matches()) {
            return null;
        }
        java.lang.String group = matcher.group(4);
        try {
            double parseDouble = java.lang.Double.parseDouble(matcher.group(1));
            if (parseDouble <= 90.0d && parseDouble >= -90.0d) {
                double parseDouble2 = java.lang.Double.parseDouble(matcher.group(2));
                if (parseDouble2 <= 180.0d && parseDouble2 >= -180.0d) {
                    double d = 0.0d;
                    if (matcher.group(3) != null) {
                        double parseDouble3 = java.lang.Double.parseDouble(matcher.group(3));
                        if (parseDouble3 < 0.0d) {
                            return null;
                        }
                        d = parseDouble3;
                    }
                    return new com.google.zxing.client.result.GeoParsedResult(parseDouble, parseDouble2, d, group);
                }
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        return null;
    }
}
