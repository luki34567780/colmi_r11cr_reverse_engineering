package com.qcwireless.qcwatch.base.pref;

/* loaded from: /tmp/dex/classes2.dex */
public class PreUtil {
    public static final java.lang.String Action_Device_Address = "com.qc.Action_Device_Address";
    public static final java.lang.String Action_Device_Name = "com.qc.Action_DeviceName";
    public static final java.lang.String Action_Today_Steps = "com.qc.today_steps";
    private static final java.lang.String PREFERENCE_FILE_NAME = "UserConfig_Preferences_Qc_1.0";
    private static android.content.Context mContext;

    public static void init(android.content.Context context) {
        mContext = context;
    }

    public static int getSharedInt(java.lang.String file_name, java.lang.String key, int defaultValue) {
        return getSharedPreferences(file_name).getInt(key, defaultValue);
    }

    public static int getInt(java.lang.String key, int defaultValue) {
        return getSharedPreferences(PREFERENCE_FILE_NAME).getInt(key, defaultValue);
    }

    public static boolean getSharedBoolean(java.lang.String file_name, java.lang.String key, boolean defaultValue) {
        return getSharedPreferences(file_name).getBoolean(key, defaultValue);
    }

    public static float getSharedFloat(java.lang.String file_name, java.lang.String key, float defaultValue) {
        return getSharedPreferences(file_name).getFloat(key, defaultValue);
    }

    public static long getSharedLong(java.lang.String file_name, java.lang.String key, long defaultValue) {
        return getSharedPreferences(file_name).getLong(key, defaultValue);
    }

    public static java.lang.String getSharedString(java.lang.String file_name, java.lang.String key, java.lang.String defaultValue) {
        return getSharedPreferences(file_name).getString(key, defaultValue);
    }

    public static java.lang.String getSharedString(java.lang.String key, java.lang.String defaultValue) {
        return getSharedPreferences(PREFERENCE_FILE_NAME).getString(key, defaultValue);
    }

    public static java.util.Set<java.lang.String> getSharedSet(java.lang.String file_name, java.lang.String key, java.util.Set<java.lang.String> defaultValue) {
        return getSharedPreferences(file_name).getStringSet(key, defaultValue);
    }

    public static java.util.Map<java.lang.String, ?> getAll(java.lang.String file_name) {
        return getSharedPreferences(file_name).getAll();
    }

    public static boolean contain(java.lang.String file_name, java.lang.String key) {
        return getSharedPreferences(file_name).contains(key);
    }

    public static void putSharedInt(java.lang.String file_name, java.lang.String key, int value) {
        android.content.SharedPreferences.Editor edit = getSharedPreferences(file_name).edit();
        edit.putInt(key, value);
        edit.apply();
    }

    public static void putInt(java.lang.String key, int value) {
        android.content.SharedPreferences.Editor edit = getSharedPreferences(PREFERENCE_FILE_NAME).edit();
        edit.putInt(key, value);
        edit.apply();
    }

    public static void putString(java.lang.String key, java.lang.String value) {
        android.content.SharedPreferences.Editor edit = getSharedPreferences(PREFERENCE_FILE_NAME).edit();
        edit.putString(key, value);
        edit.apply();
    }

    public static void putSharedBoolean(java.lang.String file_name, java.lang.String key, boolean value) {
        android.content.SharedPreferences.Editor edit = getSharedPreferences(file_name).edit();
        edit.putBoolean(key, value);
        edit.apply();
    }

    public static void putSharedFloat(java.lang.String file_name, java.lang.String key, float value) {
        android.content.SharedPreferences.Editor edit = getSharedPreferences(file_name).edit();
        edit.putFloat(key, value);
        edit.apply();
    }

    public static void putSharedLong(java.lang.String file_name, java.lang.String key, long value) {
        android.content.SharedPreferences.Editor edit = getSharedPreferences(file_name).edit();
        edit.putLong(key, value);
        edit.apply();
    }

    public static void putSharedString(java.lang.String file_name, java.lang.String key, java.lang.String value) {
        android.content.SharedPreferences.Editor edit = getSharedPreferences(file_name).edit();
        edit.putString(key, value);
        edit.apply();
    }

    public static void putSharedSet(java.lang.String file_name, java.lang.String key, java.util.Set<java.lang.String> value) {
        android.content.SharedPreferences.Editor edit = getSharedPreferences(file_name).edit();
        edit.putStringSet(key, value);
        edit.apply();
    }

    public static void putAll(java.lang.String file_name, android.util.ArrayMap<java.lang.String, java.lang.Object> arrayMap) {
        android.content.SharedPreferences.Editor sharedEditor = getSharedEditor(file_name, mContext);
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : arrayMap.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (entry.getValue() instanceof java.lang.Integer) {
                sharedEditor.putInt(key, ((java.lang.Integer) value).intValue());
            } else if (value instanceof java.lang.Long) {
                sharedEditor.putLong(key, ((java.lang.Long) value).longValue());
            } else if (value instanceof java.lang.Boolean) {
                sharedEditor.putBoolean(key, ((java.lang.Boolean) value).booleanValue());
            } else if (value instanceof java.lang.Float) {
                sharedEditor.putFloat(key, ((java.lang.Float) value).floatValue());
            } else if (value instanceof java.util.Set) {
                sharedEditor.putStringSet(key, (java.util.Set) value);
            } else if (value instanceof java.lang.String) {
                sharedEditor.putString(key, java.lang.String.valueOf(value));
            }
        }
        sharedEditor.apply();
    }

    public static void putAll(java.lang.String file_name, java.util.HashMap<java.lang.String, java.lang.Object> arrayMap) {
        android.content.SharedPreferences.Editor sharedEditor = getSharedEditor(file_name, mContext);
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : arrayMap.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (entry.getValue() instanceof java.lang.Integer) {
                sharedEditor.putInt(key, ((java.lang.Integer) value).intValue());
            } else if (value instanceof java.lang.Long) {
                sharedEditor.putLong(key, ((java.lang.Long) value).longValue());
            } else if (value instanceof java.lang.Boolean) {
                sharedEditor.putBoolean(key, ((java.lang.Boolean) value).booleanValue());
            } else if (value instanceof java.lang.Float) {
                sharedEditor.putFloat(key, ((java.lang.Float) value).floatValue());
            } else if (value instanceof java.util.Set) {
                sharedEditor.putStringSet(key, (java.util.Set) value);
            } else if (value instanceof java.lang.String) {
                sharedEditor.putString(key, java.lang.String.valueOf(value));
            }
        }
        sharedEditor.apply();
    }

    public static void clear(java.lang.String file_name) {
        getSharedPreferences(file_name).edit().clear().apply();
    }

    public static void remove(java.lang.String file_name, java.lang.String... keys) {
        android.content.SharedPreferences.Editor edit = getSharedPreferences(file_name).edit();
        for (java.lang.String str : keys) {
            edit.remove(str);
        }
        edit.apply();
    }

    private static android.content.SharedPreferences getSharedPreferences(java.lang.String file_name) {
        android.content.Context context = mContext;
        if (context == null) {
            throw new java.lang.IllegalStateException("Please init PreUtil in Application");
        }
        return context.getSharedPreferences(file_name, 0);
    }

    public static android.content.SharedPreferences getSharedPreferences(java.lang.String name, android.content.Context context) {
        return context.getSharedPreferences(name, 0);
    }

    public static android.content.SharedPreferences.Editor getSharedEditor(java.lang.String name, android.content.Context context) {
        return context.getSharedPreferences(name, 0).edit();
    }
}
