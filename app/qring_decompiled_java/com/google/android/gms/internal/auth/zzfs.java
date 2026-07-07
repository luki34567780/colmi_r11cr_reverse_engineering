package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzfs {
    static java.lang.String zza(com.google.android.gms.internal.auth.zzfq zzfqVar, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzfqVar, sb, 0);
        return sb.toString();
    }

    static final void zzb(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.auth.zzgn.zza(com.google.android.gms.internal.auth.zzeb.zzl((java.lang.String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.auth.zzeb) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.auth.zzgn.zza((com.google.android.gms.internal.auth.zzeb) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.auth.zzeq) {
            sb.append(" {");
            zzd((com.google.android.gms.internal.auth.zzeq) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        int i4 = i + 2;
        zzb(sb, i4, "key", entry.getKey());
        zzb(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    private static final java.lang.String zzc(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(java.lang.Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void zzd(com.google.android.gms.internal.auth.zzfq zzfqVar, java.lang.StringBuilder sb, int i) {
        boolean equals;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.TreeSet<java.lang.String> treeSet = new java.util.TreeSet();
        for (java.lang.reflect.Method method : zzfqVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (java.lang.String str : treeSet) {
            java.lang.String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                java.lang.String valueOf = java.lang.String.valueOf(substring.substring(0, 1).toLowerCase());
                java.lang.String valueOf2 = java.lang.String.valueOf(substring.substring(1, substring.length() - 4));
                java.lang.String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf);
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(java.util.List.class)) {
                    zzb(sb, i, zzc(concat), com.google.android.gms.internal.auth.zzeq.zzf(method2, zzfqVar, new java.lang.Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                java.lang.String valueOf3 = java.lang.String.valueOf(substring.substring(0, 1).toLowerCase());
                java.lang.String valueOf4 = java.lang.String.valueOf(substring.substring(1, substring.length() - 3));
                java.lang.String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new java.lang.String(valueOf3);
                java.lang.reflect.Method method3 = (java.lang.reflect.Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(java.util.Map.class) && !method3.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i, zzc(concat2), com.google.android.gms.internal.auth.zzeq.zzf(method3, zzfqVar, new java.lang.Object[0]));
                }
            }
            java.lang.String valueOf5 = java.lang.String.valueOf(substring);
            if (((java.lang.reflect.Method) hashMap2.get(valueOf5.length() != 0 ? "set".concat(valueOf5) : new java.lang.String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    java.lang.String valueOf6 = java.lang.String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf6.length() != 0 ? "get".concat(valueOf6) : new java.lang.String("get"))) {
                    }
                }
                java.lang.String valueOf7 = java.lang.String.valueOf(substring.substring(0, 1).toLowerCase());
                java.lang.String valueOf8 = java.lang.String.valueOf(substring.substring(1));
                java.lang.String concat3 = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new java.lang.String(valueOf7);
                java.lang.String valueOf9 = java.lang.String.valueOf(substring);
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) hashMap.get(valueOf9.length() != 0 ? "get".concat(valueOf9) : new java.lang.String("get"));
                java.lang.String valueOf10 = java.lang.String.valueOf(substring);
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get(valueOf10.length() != 0 ? "has".concat(valueOf10) : new java.lang.String("has"));
                if (method4 != null) {
                    java.lang.Object zzf = com.google.android.gms.internal.auth.zzeq.zzf(method4, zzfqVar, new java.lang.Object[0]);
                    if (method5 == null) {
                        if (zzf instanceof java.lang.Boolean) {
                            if (((java.lang.Boolean) zzf).booleanValue()) {
                                zzb(sb, i, zzc(concat3), zzf);
                            }
                        } else if (zzf instanceof java.lang.Integer) {
                            if (((java.lang.Integer) zzf).intValue() != 0) {
                                zzb(sb, i, zzc(concat3), zzf);
                            }
                        } else if (zzf instanceof java.lang.Float) {
                            if (((java.lang.Float) zzf).floatValue() != 0.0f) {
                                zzb(sb, i, zzc(concat3), zzf);
                            }
                        } else if (!(zzf instanceof java.lang.Double)) {
                            if (zzf instanceof java.lang.String) {
                                equals = zzf.equals("");
                            } else if (zzf instanceof com.google.android.gms.internal.auth.zzeb) {
                                equals = zzf.equals(com.google.android.gms.internal.auth.zzeb.zzb);
                            } else if (!(zzf instanceof com.google.android.gms.internal.auth.zzfq)) {
                                if ((zzf instanceof java.lang.Enum) && ((java.lang.Enum) zzf).ordinal() == 0) {
                                }
                                zzb(sb, i, zzc(concat3), zzf);
                            } else if (zzf != ((com.google.android.gms.internal.auth.zzfq) zzf).zzh()) {
                                zzb(sb, i, zzc(concat3), zzf);
                            }
                            if (!equals) {
                                zzb(sb, i, zzc(concat3), zzf);
                            }
                        } else if (((java.lang.Double) zzf).doubleValue() != 0.0d) {
                            zzb(sb, i, zzc(concat3), zzf);
                        }
                    } else if (((java.lang.Boolean) com.google.android.gms.internal.auth.zzeq.zzf(method5, zzfqVar, new java.lang.Object[0])).booleanValue()) {
                        zzb(sb, i, zzc(concat3), zzf);
                    }
                }
            }
        }
        if (zzfqVar instanceof com.google.android.gms.internal.auth.zzep) {
            com.google.android.gms.internal.auth.zzel zzelVar = ((com.google.android.gms.internal.auth.zzep) zzfqVar).zzb;
            throw null;
        }
        com.google.android.gms.internal.auth.zzgq zzgqVar = ((com.google.android.gms.internal.auth.zzeq) zzfqVar).zzc;
        if (zzgqVar != null) {
            zzgqVar.zze(sb, i);
        }
    }
}
