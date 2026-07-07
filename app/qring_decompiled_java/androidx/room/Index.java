package androidx.room;

@java.lang.annotation.Target({})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface Index {

    public enum Order {
        ASC,
        DESC
    }

    java.lang.String name() default "";

    androidx.room.Index.Order[] orders() default {};

    boolean unique() default false;

    java.lang.String[] value();
}
