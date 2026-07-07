package com.google.android.gms.common.server.response;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class FastJsonResponse {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        O zac(I i);

        I zad(O o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static final <O, I> I zaD(com.google.android.gms.common.server.response.FastJsonResponse.Field<I, O> field, java.lang.Object obj) {
        return ((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null ? field.zaf(obj) : obj;
    }

    private final <I, O> void zaE(com.google.android.gms.common.server.response.FastJsonResponse.Field<I, O> field, I i) {
        java.lang.String str = field.zae;
        O zae = field.zae(i);
        int i2 = field.zac;
        switch (i2) {
            case 0:
                if (zae != null) {
                    setIntegerInternal(field, str, ((java.lang.Integer) zae).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(field, str, (java.math.BigInteger) zae);
                return;
            case 2:
                if (zae != null) {
                    setLongInternal(field, str, ((java.lang.Long) zae).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(i2);
                throw new java.lang.IllegalStateException(sb.toString());
            case 4:
                if (zae != null) {
                    zan(field, str, ((java.lang.Double) zae).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(field, str, (java.math.BigDecimal) zae);
                return;
            case 6:
                if (zae != null) {
                    setBooleanInternal(field, str, ((java.lang.Boolean) zae).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(field, str, (java.lang.String) zae);
                return;
            case 8:
            case 9:
                if (zae != null) {
                    setDecodedBytesInternal(field, str, (byte[]) zae);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(java.lang.StringBuilder sb, com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.Object obj) {
        int i = field.zaa;
        if (i == 11) {
            java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls = field.zag;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(cls);
            sb.append(cls.cast(obj).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(com.google.android.gms.common.util.JsonUtils.escapeString((java.lang.String) obj));
            sb.append("\"");
        }
    }

    private static final <O> void zaG(java.lang.String str) {
        if (android.util.Log.isLoggable("FastJsonResponse", 6)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 58);
            sb.append("Output field (");
            sb.append(str);
            sb.append(") has a null value, but expected a primitive");
            android.util.Log.e("FastJsonResponse", sb.toString());
        }
    }

    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList<T> arrayList) {
        throw new java.lang.UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, T t) {
        throw new java.lang.UnsupportedOperationException("Concrete type not supported");
    }

    public abstract java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings();

    protected abstract java.lang.Object getValueObject(java.lang.String str);

    protected abstract boolean isPrimitiveFieldSet(java.lang.String str);

    protected void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, boolean z) {
        throw new java.lang.UnsupportedOperationException("Boolean not supported");
    }

    protected void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, byte[] bArr) {
        throw new java.lang.UnsupportedOperationException("byte[] not supported");
    }

    protected void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, int i) {
        throw new java.lang.UnsupportedOperationException("Integer not supported");
    }

    protected void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, long j) {
        throw new java.lang.UnsupportedOperationException("Long not supported");
    }

    protected void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        throw new java.lang.UnsupportedOperationException("String not supported");
    }

    protected void setStringMapInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        throw new java.lang.UnsupportedOperationException("String map not supported");
    }

    protected void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        throw new java.lang.UnsupportedOperationException("String list not supported");
    }

    public java.lang.String toString() {
        java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = getFieldMappings();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
        for (java.lang.String str : fieldMappings.keySet()) {
            com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                java.lang.Object zaD = zaD(field, getFieldValue(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (zaD != null) {
                    switch (field.zac) {
                        case 8:
                            sb.append("\"");
                            sb.append(com.google.android.gms.common.util.Base64Utils.encode((byte[]) zaD));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafe((byte[]) zaD));
                            sb.append("\"");
                            break;
                        case 10:
                            com.google.android.gms.common.util.MapUtils.writeStringMapToJson(sb, (java.util.HashMap) zaD);
                            break;
                        default:
                            if (field.zab) {
                                java.util.ArrayList arrayList = (java.util.ArrayList) zaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    java.lang.Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        zaF(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                zaF(sb, field, zaD);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final <O> void zaA(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.String, O> field, java.lang.String str) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, str);
        } else {
            setStringInternal(field, field.zae, str);
        }
    }

    public final <O> void zaB(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.Map<java.lang.String, java.lang.String>, O> field, java.util.Map<java.lang.String, java.lang.String> map) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, map);
        } else {
            setStringMapInternal(field, field.zae, map);
        }
    }

    public final <O> void zaC(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.String>, O> field, java.util.ArrayList<java.lang.String> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            setStringsInternal(field, field.zae, arrayList);
        }
    }

    public final <O> void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.math.BigDecimal, O> field, java.math.BigDecimal bigDecimal) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, bigDecimal);
        } else {
            zab(field, field.zae, bigDecimal);
        }
    }

    protected void zab(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.math.BigDecimal bigDecimal) {
        throw new java.lang.UnsupportedOperationException("BigDecimal not supported");
    }

    public final <O> void zac(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.math.BigDecimal>, O> field, java.util.ArrayList<java.math.BigDecimal> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zad(field, field.zae, arrayList);
        }
    }

    protected void zad(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.math.BigDecimal> arrayList) {
        throw new java.lang.UnsupportedOperationException("BigDecimal list not supported");
    }

    public final <O> void zae(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.math.BigInteger, O> field, java.math.BigInteger bigInteger) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, bigInteger);
        } else {
            zaf(field, field.zae, bigInteger);
        }
    }

    protected void zaf(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.math.BigInteger bigInteger) {
        throw new java.lang.UnsupportedOperationException("BigInteger not supported");
    }

    public final <O> void zag(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.math.BigInteger>, O> field, java.util.ArrayList<java.math.BigInteger> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zah(field, field.zae, arrayList);
        }
    }

    protected void zah(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.math.BigInteger> arrayList) {
        throw new java.lang.UnsupportedOperationException("BigInteger list not supported");
    }

    public final <O> void zai(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Boolean, O> field, boolean z) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, java.lang.Boolean.valueOf(z));
        } else {
            setBooleanInternal(field, field.zae, z);
        }
    }

    public final <O> void zaj(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Boolean>, O> field, java.util.ArrayList<java.lang.Boolean> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zak(field, field.zae, arrayList);
        }
    }

    protected void zak(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Boolean> arrayList) {
        throw new java.lang.UnsupportedOperationException("Boolean list not supported");
    }

    public final <O> void zal(com.google.android.gms.common.server.response.FastJsonResponse.Field<byte[], O> field, byte[] bArr) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zae, bArr);
        }
    }

    public final <O> void zam(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Double, O> field, double d) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, java.lang.Double.valueOf(d));
        } else {
            zan(field, field.zae, d);
        }
    }

    protected void zan(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, double d) {
        throw new java.lang.UnsupportedOperationException("Double not supported");
    }

    public final <O> void zao(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Double>, O> field, java.util.ArrayList<java.lang.Double> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zap(field, field.zae, arrayList);
        }
    }

    protected void zap(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Double> arrayList) {
        throw new java.lang.UnsupportedOperationException("Double list not supported");
    }

    public final <O> void zaq(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Float, O> field, float f) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, java.lang.Float.valueOf(f));
        } else {
            zar(field, field.zae, f);
        }
    }

    protected void zar(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, float f) {
        throw new java.lang.UnsupportedOperationException("Float not supported");
    }

    public final <O> void zas(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Float>, O> field, java.util.ArrayList<java.lang.Float> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zat(field, field.zae, arrayList);
        }
    }

    protected void zat(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Float> arrayList) {
        throw new java.lang.UnsupportedOperationException("Float list not supported");
    }

    public final <O> void zau(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Integer, O> field, int i) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, java.lang.Integer.valueOf(i));
        } else {
            setIntegerInternal(field, field.zae, i);
        }
    }

    public final <O> void zav(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Integer>, O> field, java.util.ArrayList<java.lang.Integer> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zaw(field, field.zae, arrayList);
        }
    }

    protected void zaw(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList) {
        throw new java.lang.UnsupportedOperationException("Integer list not supported");
    }

    public final <O> void zax(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Long, O> field, long j) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, java.lang.Long.valueOf(j));
        } else {
            setLongInternal(field, field.zae, j);
        }
    }

    public final <O> void zay(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Long>, O> field, java.util.ArrayList<java.lang.Long> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zak != null) {
            zaE(field, arrayList);
        } else {
            zaz(field, field.zae, arrayList);
        }
    }

    protected void zaz(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList) {
        throw new java.lang.UnsupportedOperationException("Long list not supported");
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class Field<I, O> extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final com.google.android.gms.common.server.response.zaj CREATOR = new com.google.android.gms.common.server.response.zaj();
        protected final int zaa;
        protected final boolean zab;
        protected final int zac;
        protected final boolean zad;
        protected final java.lang.String zae;
        protected final int zaf;
        protected final java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> zag;
        protected final java.lang.String zah;
        private final int zai;
        private com.google.android.gms.common.server.response.zan zaj;
        private com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<I, O> zak;

        Field(int i, int i2, boolean z, int i3, boolean z2, java.lang.String str, int i4, java.lang.String str2, com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.zai = i;
            this.zaa = i2;
            this.zab = z;
            this.zac = i3;
            this.zad = z2;
            this.zae = str;
            this.zaf = i4;
            if (str2 == null) {
                this.zag = null;
                this.zah = null;
            } else {
                this.zag = com.google.android.gms.common.server.response.SafeParcelResponse.class;
                this.zah = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = (com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<I, O>) zaaVar.zab();
            }
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<byte[], byte[]> forBase64(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(8, false, 8, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Boolean, java.lang.Boolean> forBoolean(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(6, false, 6, false, str, i, null, null);
        }

        public static <T extends com.google.android.gms.common.server.response.FastJsonResponse> com.google.android.gms.common.server.response.FastJsonResponse.Field<T, T> forConcreteType(java.lang.String str, int i, java.lang.Class<T> cls) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(11, false, 11, false, str, i, cls, null);
        }

        public static <T extends com.google.android.gms.common.server.response.FastJsonResponse> com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<T>, java.util.ArrayList<T>> forConcreteTypeArray(java.lang.String str, int i, java.lang.Class<T> cls) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(11, true, 11, true, str, i, cls, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Double, java.lang.Double> forDouble(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(4, false, 4, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Float, java.lang.Float> forFloat(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(3, false, 3, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Integer, java.lang.Integer> forInteger(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(0, false, 0, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Long, java.lang.Long> forLong(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(2, false, 2, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.String, java.lang.String> forString(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(7, false, 7, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.HashMap<java.lang.String, java.lang.String>, java.util.HashMap<java.lang.String, java.lang.String>> forStringMap(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(10, false, 10, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>> forStrings(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(7, true, 7, true, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field withConverter(java.lang.String str, int i, com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<?, ?> fieldConverter, boolean z) {
            fieldConverter.zaa();
            fieldConverter.zab();
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field(7, z, 0, false, str, i, null, fieldConverter);
        }

        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        public final java.lang.String toString() {
            com.google.android.gms.common.internal.Objects.ToStringHelper add = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("versionCode", java.lang.Integer.valueOf(this.zai)).add("typeIn", java.lang.Integer.valueOf(this.zaa)).add("typeInArray", java.lang.Boolean.valueOf(this.zab)).add("typeOut", java.lang.Integer.valueOf(this.zac)).add("typeOutArray", java.lang.Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", java.lang.Integer.valueOf(this.zaf)).add("concreteTypeName", zag());
            java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls = this.zag;
            if (cls != null) {
                add.add("concreteType.class", cls.getCanonicalName());
            }
            com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<I, O> fieldConverter = this.zak;
            if (fieldConverter != null) {
                add.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return add.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zai);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zaa);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zab);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zac);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zad);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zae, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, zag(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, zaa(), i, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        final com.google.android.gms.common.server.converter.zaa zaa() {
            com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<I, O> fieldConverter = this.zak;
            if (fieldConverter == null) {
                return null;
            }
            return com.google.android.gms.common.server.converter.zaa.zaa(fieldConverter);
        }

        public final com.google.android.gms.common.server.response.FastJsonResponse.Field<I, O> zab() {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zaa());
        }

        public final com.google.android.gms.common.server.response.FastJsonResponse zad() throws java.lang.InstantiationException, java.lang.IllegalAccessException {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zag);
            java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls = this.zag;
            if (cls != com.google.android.gms.common.server.response.SafeParcelResponse.class) {
                return cls.newInstance();
            }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zah);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new com.google.android.gms.common.server.response.SafeParcelResponse(this.zaj, this.zah);
        }

        public final O zae(I i) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zak);
            return (O) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zak.zac(i));
        }

        public final I zaf(O o) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zak);
            return this.zak.zad(o);
        }

        final java.lang.String zag() {
            java.lang.String str = this.zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> zah() {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zah);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaj);
            return (java.util.Map) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaj.zab(this.zah));
        }

        public final void zai(com.google.android.gms.common.server.response.zan zanVar) {
            this.zaj = zanVar;
        }

        public final boolean zaj() {
            return this.zak != null;
        }

        protected Field(int i, boolean z, int i2, boolean z2, java.lang.String str, int i3, java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls, com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<I, O> fieldConverter) {
            this.zai = 1;
            this.zaa = i;
            this.zab = z;
            this.zac = i2;
            this.zad = z2;
            this.zae = str;
            this.zaf = i3;
            this.zag = cls;
            if (cls == null) {
                this.zah = null;
            } else {
                this.zah = cls.getCanonicalName();
            }
            this.zak = fieldConverter;
        }
    }

    protected java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        java.lang.String str = field.zae;
        if (field.zag == null) {
            return getValueObject(str);
        }
        com.google.android.gms.common.internal.Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", field.zae);
        boolean z = field.zad;
        try {
            char upperCase = java.lang.Character.toUpperCase(str.charAt(0));
            java.lang.String substring = str.substring(1);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new java.lang.Class[0]).invoke(this, new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    protected boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        if (field.zac != 11) {
            return isPrimitiveFieldSet(field.zae);
        }
        boolean z = field.zad;
        java.lang.String str = field.zae;
        if (z) {
            throw new java.lang.UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new java.lang.UnsupportedOperationException("Concrete types not supported");
    }
}
