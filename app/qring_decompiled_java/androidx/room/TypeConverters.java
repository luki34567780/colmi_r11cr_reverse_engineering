package androidx.room;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface TypeConverters {
    androidx.room.BuiltInTypeConverters builtInTypeConverters() default @androidx.room.BuiltInTypeConverters;

    java.lang.Class<?>[] value() default {};
}
