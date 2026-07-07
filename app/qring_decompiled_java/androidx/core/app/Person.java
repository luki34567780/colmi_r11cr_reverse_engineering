package androidx.core.app;

/* loaded from: classes.dex */
public class Person {
    private static final java.lang.String ICON_KEY = "icon";
    private static final java.lang.String IS_BOT_KEY = "isBot";
    private static final java.lang.String IS_IMPORTANT_KEY = "isImportant";
    private static final java.lang.String KEY_KEY = "key";
    private static final java.lang.String NAME_KEY = "name";
    private static final java.lang.String URI_KEY = "uri";
    androidx.core.graphics.drawable.IconCompat mIcon;
    boolean mIsBot;
    boolean mIsImportant;
    java.lang.String mKey;
    java.lang.CharSequence mName;
    java.lang.String mUri;

    public static androidx.core.app.Person fromBundle(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle(ICON_KEY);
        return new androidx.core.app.Person.Builder().setName(bundle.getCharSequence(NAME_KEY)).setIcon(bundle2 != null ? androidx.core.graphics.drawable.IconCompat.createFromBundle(bundle2) : null).setUri(bundle.getString(URI_KEY)).setKey(bundle.getString(KEY_KEY)).setBot(bundle.getBoolean(IS_BOT_KEY)).setImportant(bundle.getBoolean(IS_IMPORTANT_KEY)).build();
    }

    public static androidx.core.app.Person fromPersistableBundle(android.os.PersistableBundle persistableBundle) {
        return new androidx.core.app.Person.Builder().setName(persistableBundle.getString(NAME_KEY)).setUri(persistableBundle.getString(URI_KEY)).setKey(persistableBundle.getString(KEY_KEY)).setBot(persistableBundle.getBoolean(IS_BOT_KEY)).setImportant(persistableBundle.getBoolean(IS_IMPORTANT_KEY)).build();
    }

    public static androidx.core.app.Person fromAndroidPerson(android.app.Person person) {
        return new androidx.core.app.Person.Builder().setName(person.getName()).setIcon(person.getIcon() != null ? androidx.core.graphics.drawable.IconCompat.createFromIcon(person.getIcon()) : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
    }

    Person(androidx.core.app.Person.Builder builder) {
        this.mName = builder.mName;
        this.mIcon = builder.mIcon;
        this.mUri = builder.mUri;
        this.mKey = builder.mKey;
        this.mIsBot = builder.mIsBot;
        this.mIsImportant = builder.mIsImportant;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence(NAME_KEY, this.mName);
        androidx.core.graphics.drawable.IconCompat iconCompat = this.mIcon;
        bundle.putBundle(ICON_KEY, iconCompat != null ? iconCompat.toBundle() : null);
        bundle.putString(URI_KEY, this.mUri);
        bundle.putString(KEY_KEY, this.mKey);
        bundle.putBoolean(IS_BOT_KEY, this.mIsBot);
        bundle.putBoolean(IS_IMPORTANT_KEY, this.mIsImportant);
        return bundle;
    }

    public android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        java.lang.CharSequence charSequence = this.mName;
        persistableBundle.putString(NAME_KEY, charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString(URI_KEY, this.mUri);
        persistableBundle.putString(KEY_KEY, this.mKey);
        persistableBundle.putBoolean(IS_BOT_KEY, this.mIsBot);
        persistableBundle.putBoolean(IS_IMPORTANT_KEY, this.mIsImportant);
        return persistableBundle;
    }

    public androidx.core.app.Person.Builder toBuilder() {
        return new androidx.core.app.Person.Builder(this);
    }

    public android.app.Person toAndroidPerson() {
        return new android.app.Person.Builder().setName(getName()).setIcon(getIcon() != null ? getIcon().toIcon() : null).setUri(getUri()).setKey(getKey()).setBot(isBot()).setImportant(isImportant()).build();
    }

    public java.lang.CharSequence getName() {
        return this.mName;
    }

    public androidx.core.graphics.drawable.IconCompat getIcon() {
        return this.mIcon;
    }

    public java.lang.String getUri() {
        return this.mUri;
    }

    public java.lang.String getKey() {
        return this.mKey;
    }

    public boolean isBot() {
        return this.mIsBot;
    }

    public boolean isImportant() {
        return this.mIsImportant;
    }

    public java.lang.String resolveToLegacyUri() {
        java.lang.String str = this.mUri;
        if (str != null) {
            return str;
        }
        if (this.mName == null) {
            return "";
        }
        return "name:" + ((java.lang.Object) this.mName);
    }

    public static class Builder {
        androidx.core.graphics.drawable.IconCompat mIcon;
        boolean mIsBot;
        boolean mIsImportant;
        java.lang.String mKey;
        java.lang.CharSequence mName;
        java.lang.String mUri;

        public Builder() {
        }

        Builder(androidx.core.app.Person person) {
            this.mName = person.mName;
            this.mIcon = person.mIcon;
            this.mUri = person.mUri;
            this.mKey = person.mKey;
            this.mIsBot = person.mIsBot;
            this.mIsImportant = person.mIsImportant;
        }

        public androidx.core.app.Person.Builder setName(java.lang.CharSequence charSequence) {
            this.mName = charSequence;
            return this;
        }

        public androidx.core.app.Person.Builder setIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
            this.mIcon = iconCompat;
            return this;
        }

        public androidx.core.app.Person.Builder setUri(java.lang.String str) {
            this.mUri = str;
            return this;
        }

        public androidx.core.app.Person.Builder setKey(java.lang.String str) {
            this.mKey = str;
            return this;
        }

        public androidx.core.app.Person.Builder setBot(boolean z) {
            this.mIsBot = z;
            return this;
        }

        public androidx.core.app.Person.Builder setImportant(boolean z) {
            this.mIsImportant = z;
            return this;
        }

        public androidx.core.app.Person build() {
            return new androidx.core.app.Person(this);
        }
    }
}
