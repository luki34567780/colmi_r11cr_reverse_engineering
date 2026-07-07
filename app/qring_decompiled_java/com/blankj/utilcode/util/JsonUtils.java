package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class JsonUtils {
    private static final byte TYPE_BOOLEAN = 0;
    private static final byte TYPE_DOUBLE = 3;
    private static final byte TYPE_INT = 1;
    private static final byte TYPE_JSON_ARRAY = 6;
    private static final byte TYPE_JSON_OBJECT = 5;
    private static final byte TYPE_LONG = 2;
    private static final byte TYPE_STRING = 4;

    private JsonUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean getBoolean(org.json.JSONObject jSONObject, java.lang.String str) {
        return getBoolean(jSONObject, str, false);
    }

    public static boolean getBoolean(org.json.JSONObject jSONObject, java.lang.String str, boolean z) {
        return ((java.lang.Boolean) getValueByType(jSONObject, str, java.lang.Boolean.valueOf(z), (byte) 0)).booleanValue();
    }

    public static boolean getBoolean(java.lang.String str, java.lang.String str2) {
        return getBoolean(str, str2, false);
    }

    public static boolean getBoolean(java.lang.String str, java.lang.String str2, boolean z) {
        return ((java.lang.Boolean) getValueByType(str, str2, java.lang.Boolean.valueOf(z), (byte) 0)).booleanValue();
    }

    public static int getInt(org.json.JSONObject jSONObject, java.lang.String str) {
        return getInt(jSONObject, str, -1);
    }

    public static int getInt(org.json.JSONObject jSONObject, java.lang.String str, int i) {
        return ((java.lang.Integer) getValueByType(jSONObject, str, java.lang.Integer.valueOf(i), (byte) 1)).intValue();
    }

    public static int getInt(java.lang.String str, java.lang.String str2) {
        return getInt(str, str2, -1);
    }

    public static int getInt(java.lang.String str, java.lang.String str2, int i) {
        return ((java.lang.Integer) getValueByType(str, str2, java.lang.Integer.valueOf(i), (byte) 1)).intValue();
    }

    public static long getLong(org.json.JSONObject jSONObject, java.lang.String str) {
        return getLong(jSONObject, str, -1L);
    }

    public static long getLong(org.json.JSONObject jSONObject, java.lang.String str, long j) {
        return ((java.lang.Long) getValueByType(jSONObject, str, java.lang.Long.valueOf(j), (byte) 2)).longValue();
    }

    public static long getLong(java.lang.String str, java.lang.String str2) {
        return getLong(str, str2, -1L);
    }

    public static long getLong(java.lang.String str, java.lang.String str2, long j) {
        return ((java.lang.Long) getValueByType(str, str2, java.lang.Long.valueOf(j), (byte) 2)).longValue();
    }

    public static double getDouble(org.json.JSONObject jSONObject, java.lang.String str) {
        return getDouble(jSONObject, str, -1.0d);
    }

    public static double getDouble(org.json.JSONObject jSONObject, java.lang.String str, double d) {
        return ((java.lang.Double) getValueByType(jSONObject, str, java.lang.Double.valueOf(d), (byte) 3)).doubleValue();
    }

    public static double getDouble(java.lang.String str, java.lang.String str2) {
        return getDouble(str, str2, -1.0d);
    }

    public static double getDouble(java.lang.String str, java.lang.String str2, double d) {
        return ((java.lang.Double) getValueByType(str, str2, java.lang.Double.valueOf(d), (byte) 3)).doubleValue();
    }

    public static java.lang.String getString(org.json.JSONObject jSONObject, java.lang.String str) {
        return getString(jSONObject, str, "");
    }

    public static java.lang.String getString(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        return (java.lang.String) getValueByType(jSONObject, str, str2, (byte) 4);
    }

    public static java.lang.String getString(java.lang.String str, java.lang.String str2) {
        return getString(str, str2, "");
    }

    public static java.lang.String getString(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return (java.lang.String) getValueByType(str, str2, str3, (byte) 4);
    }

    public static org.json.JSONObject getJSONObject(org.json.JSONObject jSONObject, java.lang.String str, org.json.JSONObject jSONObject2) {
        return (org.json.JSONObject) getValueByType(jSONObject, str, jSONObject2, (byte) 5);
    }

    public static org.json.JSONObject getJSONObject(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        return (org.json.JSONObject) getValueByType(str, str2, jSONObject, (byte) 5);
    }

    public static org.json.JSONArray getJSONArray(org.json.JSONObject jSONObject, java.lang.String str, org.json.JSONArray jSONArray) {
        return (org.json.JSONArray) getValueByType(jSONObject, str, jSONArray, (byte) 6);
    }

    public static org.json.JSONArray getJSONArray(java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray) {
        return (org.json.JSONArray) getValueByType(str, str2, jSONArray, (byte) 6);
    }

    private static <T> T getValueByType(org.json.JSONObject jSONObject, java.lang.String str, T t, byte b) {
        T t2;
        if (jSONObject != null && str != null && str.length() != 0) {
            try {
                if (b == 0) {
                    t2 = (T) java.lang.Boolean.valueOf(jSONObject.getBoolean(str));
                } else if (b == 1) {
                    t2 = (T) java.lang.Integer.valueOf(jSONObject.getInt(str));
                } else if (b == 2) {
                    t2 = (T) java.lang.Long.valueOf(jSONObject.getLong(str));
                } else if (b == 3) {
                    t2 = (T) java.lang.Double.valueOf(jSONObject.getDouble(str));
                } else if (b == 4) {
                    t2 = (T) jSONObject.getString(str);
                } else if (b == 5) {
                    t2 = (T) jSONObject.getJSONObject(str);
                } else if (b == 6) {
                    t2 = (T) jSONObject.getJSONArray(str);
                }
                return t2;
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        return t;
    }

    private static <T> T getValueByType(java.lang.String str, java.lang.String str2, T t, byte b) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            try {
                return (T) getValueByType(new org.json.JSONObject(str), str2, t, b);
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        return t;
    }

    public static java.lang.String formatJson(java.lang.String str) {
        return formatJson(str, 4);
    }

    public static java.lang.String formatJson(java.lang.String str, int i) {
        try {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt == '{') {
                    return new org.json.JSONObject(str).toString(i);
                }
                if (charAt == '[') {
                    return new org.json.JSONArray(str).toString(i);
                }
                if (!java.lang.Character.isWhitespace(charAt)) {
                    return str;
                }
            }
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        return str;
    }
}
