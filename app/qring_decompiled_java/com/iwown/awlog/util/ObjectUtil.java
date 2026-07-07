package com.iwown.awlog.util;

/* loaded from: /tmp/dex/classes2.dex */
public class ObjectUtil {
    public static final int LINE_MAX = 2800;
    static java.lang.String LINE_SEPARATOR = java.lang.System.getProperty("line.separator");
    private static final int MAX_CHILD_LEVEL = 2;
    private static final java.lang.String STRING_OBJECT_NULL = "Object[object is null]";

    public static java.lang.String objectToString(java.lang.Object obj) {
        return objectToString(obj, 0);
    }

    public static java.lang.String objectToString(java.lang.Object obj, int i) {
        if (obj == null) {
            return STRING_OBJECT_NULL;
        }
        if (i > 2) {
            return obj.toString();
        }
        if (com.iwown.awlog.util.ArrayUtil.isArray(obj)) {
            return com.iwown.awlog.util.ArrayUtil.parseArray(obj);
        }
        if (com.iwown.awlog.impl.LogConfigImpl.getInstance().getJson() != null) {
            return com.iwown.awlog.impl.LogConfigImpl.getInstance().getJson().toJson(obj);
        }
        return obj.toString();
    }

    private static void getClassFields(java.lang.Class cls, java.lang.StringBuilder sb, java.lang.Object obj, boolean z, int i) {
        if (cls.equals(java.lang.Object.class)) {
            return;
        }
        if (z) {
            sb.append(LINE_SEPARATOR);
            sb.append(LINE_SEPARATOR);
            sb.append("=> ");
        }
        sb.append(cls.getSimpleName() + " {");
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        for (int i2 = 0; i2 < declaredFields.length; i2++) {
            java.lang.reflect.Field field = declaredFields[i2];
            field.setAccessible(true);
            if (!cls.isMemberClass() || isStaticInnerClass(cls) || i2 != 0) {
                try {
                    java.lang.Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        if (isStaticInnerClass(cls) || (!field.getName().equals("$change") && !field.getName().equalsIgnoreCase("this$0"))) {
                            if (obj2 instanceof java.lang.String) {
                                obj2 = "\"" + obj2 + "\"";
                            } else if (obj2 instanceof java.lang.Character) {
                                obj2 = "'" + obj2 + "'";
                            }
                            if (i < 2) {
                                obj2 = objectToString(obj2, i + 1);
                            }
                        }
                    }
                    java.lang.String str = "%s = %s, ";
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = field.getName();
                    objArr[1] = obj2 == null ? "null" : obj2.toString();
                    sb.append(java.lang.String.format(str, objArr));
                } catch (java.lang.IllegalAccessException e) {
                    java.lang.Object obj3 = e;
                    if (isStaticInnerClass(cls) || (!field.getName().equals("$change") && !field.getName().equalsIgnoreCase("this$0"))) {
                        if (obj3 instanceof java.lang.String) {
                            obj3 = "\"" + obj3 + "\"";
                        } else if (obj3 instanceof java.lang.Character) {
                            obj3 = "'" + obj3 + "'";
                        }
                        if (i < 2) {
                            obj3 = objectToString(obj3, i + 1);
                        }
                        java.lang.String str2 = "%s = %s, ";
                        java.lang.Object[] objArr2 = new java.lang.Object[2];
                        objArr2[0] = field.getName();
                        objArr2[1] = obj3 == null ? "null" : obj3.toString();
                        sb.append(java.lang.String.format(str2, objArr2));
                    }
                } catch (java.lang.Throwable th) {
                    sb.append(java.lang.String.format("%s = %s, ", field.getName(), "null"));
                    throw th;
                }
            }
        }
        if (sb.toString().endsWith("{")) {
            sb.append("}");
            return;
        }
        sb.replace(sb.length() - 2, sb.length() - 1, "}");
    }

    private static boolean isStaticInnerClass(java.lang.Class cls) {
        return cls != null && cls.isMemberClass() && (cls.getModifiers() & 8) == 8;
    }

    public static java.util.List<java.lang.String> largeStringToList(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = str.length() / LINE_MAX;
        if (length > 0) {
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + LINE_MAX;
                arrayList.add(str.substring(i2, i3));
                i++;
                i2 = i3;
            }
            arrayList.add(str.substring(i2));
        } else {
            arrayList.add(str);
        }
        return arrayList;
    }
}
