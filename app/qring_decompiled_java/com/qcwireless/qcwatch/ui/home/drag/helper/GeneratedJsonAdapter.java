package com.qcwireless.qcwatch.ui.home.drag.helper;

/* compiled from: ItemEntityJsonAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/drag/helper/ItemEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qcwireless/qcwatch/ui/home/drag/helper/ItemEntity;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "intAdapter", "", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntityJsonAdapter, reason: from toString */
/* loaded from: /tmp/dex/classes2.dex */
public final class GeneratedJsonAdapter extends com.squareup.moshi.JsonAdapter<com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> {
    private final com.squareup.moshi.JsonAdapter<java.lang.Boolean> booleanAdapter;
    private volatile java.lang.reflect.Constructor<com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> constructorRef;
    private final com.squareup.moshi.JsonAdapter<java.lang.Integer> intAdapter;
    private final com.squareup.moshi.JsonAdapter<java.lang.String> nullableStringAdapter;
    private final com.squareup.moshi.JsonReader.Options options;

    public GeneratedJsonAdapter(com.squareup.moshi.Moshi moshi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moshi, "moshi");
        com.squareup.moshi.JsonReader.Options of = com.squareup.moshi.JsonReader.Options.of(new java.lang.String[]{"text", "isChecked", "modelType", "showOrNot"});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(of, "of(\"text\", \"isChecked\", …Type\",\n      \"showOrNot\")");
        this.options = of;
        com.squareup.moshi.JsonAdapter<java.lang.String> adapter = moshi.adapter(java.lang.String.class, kotlin.collections.SetsKt.emptySet(), "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshi.adapter(String::cl…      emptySet(), \"text\")");
        this.nullableStringAdapter = adapter;
        com.squareup.moshi.JsonAdapter<java.lang.Boolean> adapter2 = moshi.adapter(java.lang.Boolean.TYPE, kotlin.collections.SetsKt.emptySet(), "isChecked");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter2, "moshi.adapter(Boolean::c…Set(),\n      \"isChecked\")");
        this.booleanAdapter = adapter2;
        com.squareup.moshi.JsonAdapter<java.lang.Integer> adapter3 = moshi.adapter(java.lang.Integer.TYPE, kotlin.collections.SetsKt.emptySet(), "modelType");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter3, "moshi.adapter(Int::class… emptySet(), \"modelType\")");
        this.intAdapter = adapter3;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ItemEntity");
        sb.append(')');
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: fromJson, reason: merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity m963fromJson(com.squareup.moshi.JsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        java.lang.Boolean bool = false;
        reader.beginObject();
        int i = -1;
        java.lang.String str = null;
        java.lang.Boolean bool2 = null;
        java.lang.Integer num = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (java.lang.String) this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 1) {
                bool2 = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                if (bool2 == null) {
                    java.lang.Throwable unexpectedNull = com.squareup.moshi.internal.Util.unexpectedNull("isChecked", "isChecked", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull, "unexpectedNull(\"isChecke…     \"isChecked\", reader)");
                    throw unexpectedNull;
                }
            } else if (selectName == 2) {
                num = (java.lang.Integer) this.intAdapter.fromJson(reader);
                if (num == null) {
                    java.lang.Throwable unexpectedNull2 = com.squareup.moshi.internal.Util.unexpectedNull("modelType", "modelType", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull2, "unexpectedNull(\"modelTyp…     \"modelType\", reader)");
                    throw unexpectedNull2;
                }
            } else if (selectName == 3) {
                bool = (java.lang.Boolean) this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    java.lang.Throwable unexpectedNull3 = com.squareup.moshi.internal.Util.unexpectedNull("showOrNot", "showOrNot", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull3, "unexpectedNull(\"showOrNo…     \"showOrNot\", reader)");
                    throw unexpectedNull3;
                }
                i &= -9;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i == -9) {
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                if (num != null) {
                    return new com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity(str, booleanValue, num.intValue(), bool.booleanValue());
                }
                java.lang.Throwable missingProperty = com.squareup.moshi.internal.Util.missingProperty("modelType", "modelType", reader);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty, "missingProperty(\"modelType\", \"modelType\", reader)");
                throw missingProperty;
            }
            java.lang.Throwable missingProperty2 = com.squareup.moshi.internal.Util.missingProperty("isChecked", "isChecked", reader);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty2, "missingProperty(\"isChecked\", \"isChecked\", reader)");
            throw missingProperty2;
        }
        java.lang.reflect.Constructor<com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity.class.getDeclaredConstructor(java.lang.String.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, com.squareup.moshi.internal.Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructor, "ItemEntity::class.java.g…his.constructorRef = it }");
        }
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = str;
        if (bool2 != null) {
            objArr[1] = java.lang.Boolean.valueOf(bool2.booleanValue());
            if (num == null) {
                java.lang.Throwable missingProperty3 = com.squareup.moshi.internal.Util.missingProperty("modelType", "modelType", reader);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty3, "missingProperty(\"modelType\", \"modelType\", reader)");
                throw missingProperty3;
            }
            objArr[2] = java.lang.Integer.valueOf(num.intValue());
            objArr[3] = bool;
            objArr[4] = java.lang.Integer.valueOf(i);
            objArr[5] = null;
            com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity newInstance = constructor.newInstance(objArr);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        java.lang.Throwable missingProperty4 = com.squareup.moshi.internal.Util.missingProperty("isChecked", "isChecked", reader);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty4, "missingProperty(\"isChecked\", \"isChecked\", reader)");
        throw missingProperty4;
    }

    public void toJson(com.squareup.moshi.JsonWriter writer, com.qcwireless.qcwatch.ui.home.drag.helper.ItemEntity value_) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
        java.util.Objects.requireNonNull(value_, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.beginObject();
        writer.name("text");
        this.nullableStringAdapter.toJson(writer, value_.getText());
        writer.name("isChecked");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.isChecked()));
        writer.name("modelType");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getModelType()));
        writer.name("showOrNot");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getShowOrNot()));
        writer.endObject();
    }
}
