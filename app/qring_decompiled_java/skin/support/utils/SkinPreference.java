package skin.support.utils;

/* loaded from: classes3.dex */
public class SkinPreference {
    private static final java.lang.String FILE_NAME = "meta-data";
    private static final java.lang.String KEY_SKIN_NAME = "skin-name";
    private static final java.lang.String KEY_SKIN_STRATEGY = "skin-strategy";
    private static final java.lang.String KEY_SKIN_USER_THEME = "skin-user-theme-json";
    private static skin.support.utils.SkinPreference sInstance;
    private final android.content.Context mApp;
    private final android.content.SharedPreferences.Editor mEditor;
    private final android.content.SharedPreferences mPref;

    public static void init(android.content.Context context) {
        if (sInstance == null) {
            synchronized (skin.support.utils.SkinPreference.class) {
                if (sInstance == null) {
                    sInstance = new skin.support.utils.SkinPreference(context.getApplicationContext());
                }
            }
        }
    }

    public static skin.support.utils.SkinPreference getInstance() {
        return sInstance;
    }

    private SkinPreference(android.content.Context context) {
        this.mApp = context;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME, 0);
        this.mPref = sharedPreferences;
        this.mEditor = sharedPreferences.edit();
    }

    public skin.support.utils.SkinPreference setSkinName(java.lang.String str) {
        this.mEditor.putString(KEY_SKIN_NAME, str);
        return this;
    }

    public java.lang.String getSkinName() {
        return this.mPref.getString(KEY_SKIN_NAME, "");
    }

    public skin.support.utils.SkinPreference setSkinStrategy(int i) {
        this.mEditor.putInt(KEY_SKIN_STRATEGY, i);
        return this;
    }

    public int getSkinStrategy() {
        return this.mPref.getInt(KEY_SKIN_STRATEGY, -1);
    }

    public skin.support.utils.SkinPreference setUserTheme(java.lang.String str) {
        this.mEditor.putString(KEY_SKIN_USER_THEME, str);
        return this;
    }

    public java.lang.String getUserTheme() {
        return this.mPref.getString(KEY_SKIN_USER_THEME, "");
    }

    public void commitEditor() {
        this.mEditor.apply();
    }
}
