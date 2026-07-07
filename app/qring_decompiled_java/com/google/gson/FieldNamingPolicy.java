package com.google.gson;

/* loaded from: /tmp/dex/classes2.dex */
public enum FieldNamingPolicy implements com.google.gson.FieldNamingStrategy {
    IDENTITY { // from class: com.google.gson.FieldNamingPolicy.1
        @Override // com.google.gson.FieldNamingStrategy
        public java.lang.String translateName(java.lang.reflect.Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.google.gson.FieldNamingPolicy.2
        @Override // com.google.gson.FieldNamingStrategy
        public java.lang.String translateName(java.lang.reflect.Field field) {
            return upperCaseFirstLetter(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.google.gson.FieldNamingPolicy.3
        @Override // com.google.gson.FieldNamingStrategy
        public java.lang.String translateName(java.lang.reflect.Field field) {
            return upperCaseFirstLetter(separateCamelCase(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.4
        @Override // com.google.gson.FieldNamingStrategy
        public java.lang.String translateName(java.lang.reflect.Field field) {
            return separateCamelCase(field.getName(), "_").toLowerCase(java.util.Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.google.gson.FieldNamingPolicy.5
        @Override // com.google.gson.FieldNamingStrategy
        public java.lang.String translateName(java.lang.reflect.Field field) {
            return separateCamelCase(field.getName(), "-").toLowerCase(java.util.Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.google.gson.FieldNamingPolicy.6
        @Override // com.google.gson.FieldNamingStrategy
        public java.lang.String translateName(java.lang.reflect.Field field) {
            return separateCamelCase(field.getName(), ".").toLowerCase(java.util.Locale.ENGLISH);
        }
    };

    static java.lang.String separateCamelCase(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static java.lang.String upperCaseFirstLetter(java.lang.String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!java.lang.Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (java.lang.Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = java.lang.Character.toUpperCase(charAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }
}
