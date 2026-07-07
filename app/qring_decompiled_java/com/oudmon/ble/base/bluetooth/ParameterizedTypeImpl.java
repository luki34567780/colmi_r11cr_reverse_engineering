package com.oudmon.ble.base.bluetooth;

/* loaded from: /tmp/dex/classes2.dex */
public class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType {
    private final java.lang.reflect.Type rawType;
    private final java.lang.reflect.Type[] typeArguments;

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getOwnerType() {
        return null;
    }

    public static com.oudmon.ble.base.bluetooth.ParameterizedTypeImpl get(java.lang.reflect.Type type, java.lang.reflect.Type... typeArr) {
        return new com.oudmon.ble.base.bluetooth.ParameterizedTypeImpl(type, typeArr);
    }

    private ParameterizedTypeImpl(java.lang.reflect.Type type, java.lang.reflect.Type... typeArr) {
        this.rawType = type;
        this.typeArguments = canonicalize((java.lang.reflect.Type[]) typeArr.clone());
    }

    private java.lang.reflect.Type[] canonicalize(java.lang.reflect.Type[] typeArr) {
        if (typeArr == null || typeArr.length <= 1) {
            return typeArr;
        }
        java.lang.reflect.Type[] typeArr2 = new java.lang.reflect.Type[typeArr.length - 1];
        for (int i = 0; i < typeArr.length; i++) {
            if (i > 0) {
                typeArr2[i - 1] = typeArr[i];
            }
        }
        return new java.lang.reflect.Type[]{new com.oudmon.ble.base.bluetooth.ParameterizedTypeImpl(typeArr[0], typeArr2)};
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type[] getActualTypeArguments() {
        return (java.lang.reflect.Type[]) this.typeArguments.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getRawType() {
        return this.rawType;
    }

    public java.lang.String typeToString(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((this.typeArguments.length + 1) * 30);
        sb.append(typeToString(this.rawType));
        if (this.typeArguments.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(typeToString(this.typeArguments[0]));
        for (int i = 1; i < this.typeArguments.length; i++) {
            sb.append(", ");
            sb.append(typeToString(this.typeArguments[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
