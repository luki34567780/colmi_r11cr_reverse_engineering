package com.google.android.gms.common.internal.safeparcel;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface SafeParcelable extends android.os.Parcelable {
    public static final java.lang.String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public @interface Class {
        java.lang.String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public @interface Constructor {
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public @interface Field {
        java.lang.String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        java.lang.String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        java.lang.String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public @interface Indicator {
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public @interface Param {
        int id();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public @interface Reserved {
        int[] value();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public @interface VersionField {
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        java.lang.String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
