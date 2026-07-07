package androidx.core.os;

/* loaded from: classes.dex */
public class UserHandleCompat {
    private static java.lang.reflect.Method sGetUserIdMethod;
    private static java.lang.reflect.Constructor<android.os.UserHandle> sUserHandleConstructor;

    private UserHandleCompat() {
    }

    public static android.os.UserHandle getUserHandleForUid(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.os.UserHandleCompat.Api24Impl.getUserHandleForUid(i);
        }
        try {
            return getUserHandleConstructor().newInstance((java.lang.Integer) getGetUserIdMethod().invoke(null, java.lang.Integer.valueOf(i)));
        } catch (java.lang.IllegalAccessException e) {
            java.lang.IllegalAccessError illegalAccessError = new java.lang.IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        } catch (java.lang.InstantiationException e2) {
            java.lang.InstantiationError instantiationError = new java.lang.InstantiationError();
            instantiationError.initCause(e2);
            throw instantiationError;
        } catch (java.lang.NoSuchMethodException e3) {
            java.lang.NoSuchMethodError noSuchMethodError = new java.lang.NoSuchMethodError();
            noSuchMethodError.initCause(e3);
            throw noSuchMethodError;
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw new java.lang.RuntimeException(e4);
        }
    }

    private static class Api24Impl {
        private Api24Impl() {
        }

        static android.os.UserHandle getUserHandleForUid(int i) {
            return android.os.UserHandle.getUserHandleForUid(i);
        }
    }

    private static java.lang.reflect.Method getGetUserIdMethod() throws java.lang.NoSuchMethodException {
        if (sGetUserIdMethod == null) {
            java.lang.reflect.Method declaredMethod = android.os.UserHandle.class.getDeclaredMethod("getUserId", java.lang.Integer.TYPE);
            sGetUserIdMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return sGetUserIdMethod;
    }

    private static java.lang.reflect.Constructor<android.os.UserHandle> getUserHandleConstructor() throws java.lang.NoSuchMethodException {
        if (sUserHandleConstructor == null) {
            java.lang.reflect.Constructor<android.os.UserHandle> declaredConstructor = android.os.UserHandle.class.getDeclaredConstructor(java.lang.Integer.TYPE);
            sUserHandleConstructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return sUserHandleConstructor;
    }
}
