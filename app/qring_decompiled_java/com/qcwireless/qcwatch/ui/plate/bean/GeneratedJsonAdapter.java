package com.qcwireless.qcwatch.ui.plate.bean;

/* compiled from: DeviceWatchFaceBeanJsonAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/qcwireless/qcwatch/ui/plate/bean/DeviceWatchFaceBeanJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qcwireless/qcwatch/ui/plate/bean/DeviceWatchFaceBean;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "booleanAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "watchFaceAdapter", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/WatchFace;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBeanJsonAdapter, reason: from toString */
/* loaded from: /tmp/dex/classes2.dex */
public final class GeneratedJsonAdapter extends com.squareup.moshi.JsonAdapter<com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean> {
    private final com.squareup.moshi.JsonAdapter<java.lang.Boolean> booleanAdapter;
    private final com.squareup.moshi.JsonReader.Options options;
    private final com.squareup.moshi.JsonAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace> watchFaceAdapter;

    public GeneratedJsonAdapter(com.squareup.moshi.Moshi moshi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moshi, "moshi");
        com.squareup.moshi.JsonReader.Options of = com.squareup.moshi.JsonReader.Options.of(new java.lang.String[]{"watchFace", "delete"});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(of, "of(\"watchFace\", \"delete\")");
        this.options = of;
        com.squareup.moshi.JsonAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace> adapter = moshi.adapter(com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace.class, kotlin.collections.SetsKt.emptySet(), "watchFace");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshi.adapter(WatchFace:… emptySet(), \"watchFace\")");
        this.watchFaceAdapter = adapter;
        com.squareup.moshi.JsonAdapter<java.lang.Boolean> adapter2 = moshi.adapter(java.lang.Boolean.TYPE, kotlin.collections.SetsKt.emptySet(), "delete");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter2, "moshi.adapter(Boolean::c…ptySet(),\n      \"delete\")");
        this.booleanAdapter = adapter2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DeviceWatchFaceBean");
        sb.append(')');
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: fromJson, reason: merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean m1377fromJson(com.squareup.moshi.JsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace watchFace = null;
        java.lang.Boolean bool = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                watchFace = (com.qcwireless.qcwatch.ui.base.repository.entity.WatchFace) this.watchFaceAdapter.fromJson(reader);
                if (watchFace == null) {
                    java.lang.Throwable unexpectedNull = com.squareup.moshi.internal.Util.unexpectedNull("watchFace", "watchFace", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull, "unexpectedNull(\"watchFac…     \"watchFace\", reader)");
                    throw unexpectedNull;
                }
            } else if (selectName == 1 && (bool = (java.lang.Boolean) this.booleanAdapter.fromJson(reader)) == null) {
                java.lang.Throwable unexpectedNull2 = com.squareup.moshi.internal.Util.unexpectedNull("delete", "delete", reader);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull2, "unexpectedNull(\"delete\",…        \"delete\", reader)");
                throw unexpectedNull2;
            }
        }
        reader.endObject();
        if (watchFace == null) {
            java.lang.Throwable missingProperty = com.squareup.moshi.internal.Util.missingProperty("watchFace", "watchFace", reader);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty, "missingProperty(\"watchFace\", \"watchFace\", reader)");
            throw missingProperty;
        }
        if (bool != null) {
            return new com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean(watchFace, bool.booleanValue());
        }
        java.lang.Throwable missingProperty2 = com.squareup.moshi.internal.Util.missingProperty("delete", "delete", reader);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty2, "missingProperty(\"delete\", \"delete\", reader)");
        throw missingProperty2;
    }

    public void toJson(com.squareup.moshi.JsonWriter writer, com.qcwireless.qcwatch.ui.plate.bean.DeviceWatchFaceBean value_) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
        java.util.Objects.requireNonNull(value_, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.beginObject();
        writer.name("watchFace");
        this.watchFaceAdapter.toJson(writer, value_.getWatchFace());
        writer.name("delete");
        this.booleanAdapter.toJson(writer, java.lang.Boolean.valueOf(value_.getDelete()));
        writer.endObject();
    }
}
