package kotlin.internal;

/* compiled from: PlatformImplementations.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001\u001a\"\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0083\b¢\u0006\u0002\u0010\f\u001a\b\u0010\r\u001a\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getJavaVersion", "kotlin-stdlib"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatformImplementationsKt {
    public static final kotlin.internal.PlatformImplementations IMPLEMENTATIONS;

    static {
        kotlin.internal.PlatformImplementations platformImplementations;
        java.lang.Object newInstance;
        java.lang.Object newInstance2;
        int javaVersion = getJavaVersion();
        if (javaVersion >= 65544 || javaVersion < 65536) {
            try {
                try {
                    newInstance = java.lang.Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                    } catch (java.lang.ClassCastException e) {
                        java.lang.ClassLoader classLoader = newInstance.getClass().getClassLoader();
                        java.lang.ClassLoader classLoader2 = kotlin.internal.PlatformImplementations.class.getClassLoader();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(classLoader, classLoader2)) {
                            throw e;
                        }
                        throw new java.lang.ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                    }
                } catch (java.lang.ClassNotFoundException unused) {
                    java.lang.Object newInstance3 = java.lang.Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (newInstance3 == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        platformImplementations = (kotlin.internal.PlatformImplementations) newInstance3;
                    } catch (java.lang.ClassCastException e2) {
                        java.lang.ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                        java.lang.ClassLoader classLoader4 = kotlin.internal.PlatformImplementations.class.getClassLoader();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(classLoader3, classLoader4)) {
                            throw e2;
                        }
                        throw new java.lang.ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                    }
                }
            } catch (java.lang.ClassNotFoundException unused2) {
            }
            if (newInstance == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            platformImplementations = (kotlin.internal.PlatformImplementations) newInstance;
            IMPLEMENTATIONS = platformImplementations;
        }
        if (javaVersion >= 65543 || javaVersion < 65536) {
            try {
                try {
                    newInstance2 = java.lang.Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                } catch (java.lang.ClassNotFoundException unused3) {
                }
            } catch (java.lang.ClassNotFoundException unused4) {
                java.lang.Object newInstance4 = java.lang.Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance4 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    platformImplementations = (kotlin.internal.PlatformImplementations) newInstance4;
                } catch (java.lang.ClassCastException e3) {
                    java.lang.ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                    java.lang.ClassLoader classLoader6 = kotlin.internal.PlatformImplementations.class.getClassLoader();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(classLoader5, classLoader6)) {
                        throw e3;
                    }
                    throw new java.lang.ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                }
            }
            try {
                if (newInstance2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
                platformImplementations = (kotlin.internal.PlatformImplementations) newInstance2;
                IMPLEMENTATIONS = platformImplementations;
            } catch (java.lang.ClassCastException e4) {
                java.lang.ClassLoader classLoader7 = newInstance2.getClass().getClassLoader();
                java.lang.ClassLoader classLoader8 = kotlin.internal.PlatformImplementations.class.getClassLoader();
                if (kotlin.jvm.internal.Intrinsics.areEqual(classLoader7, classLoader8)) {
                    throw e4;
                }
                throw new java.lang.ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
            }
        }
        platformImplementations = new kotlin.internal.PlatformImplementations();
        IMPLEMENTATIONS = platformImplementations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T castToBaseType(java.lang.Object obj) {
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
            java.lang.Object obj2 = obj;
            return obj;
        } catch (java.lang.ClassCastException e) {
            java.lang.ClassLoader classLoader = obj.getClass().getClassLoader();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE);
            java.lang.ClassLoader classLoader2 = java.lang.Object.class.getClassLoader();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(classLoader, classLoader2)) {
                throw new java.lang.ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
            }
            throw e;
        }
    }

    private static final int getJavaVersion() {
        java.lang.String property = java.lang.System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        java.lang.String str = property;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, '.', 0, false, 6, (java.lang.Object) null);
        if (indexOf$default < 0) {
            try {
                return java.lang.Integer.parseInt(property) * 65536;
            } catch (java.lang.NumberFormatException unused) {
                return 65542;
            }
        }
        int i = indexOf$default + 1;
        int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, '.', i, false, 4, (java.lang.Object) null);
        if (indexOf$default2 < 0) {
            indexOf$default2 = property.length();
        }
        java.lang.String substring = property.substring(0, indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        java.lang.String substring2 = property.substring(i, indexOf$default2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (java.lang.Integer.parseInt(substring) * 65536) + java.lang.Integer.parseInt(substring2);
        } catch (java.lang.NumberFormatException unused2) {
            return 65542;
        }
    }

    public static final boolean apiVersionIsAtLeast(int i, int i2, int i3) {
        return kotlin.KotlinVersion.CURRENT.isAtLeast(i, i2, i3);
    }
}
