package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: WatchFaceVersionBeanJsonAdapter.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/healthy/bean/WatchFaceVersionBeanJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qcwireless/qcwatch/ui/home/healthy/bean/WatchFaceVersionBean;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.qcwireless.qcwatch.ui.home.healthy.bean.WatchFaceVersionBeanJsonAdapter, reason: from toString */
/* loaded from: /tmp/dex/classes2.dex */
public final class GeneratedJsonAdapter extends com.squareup.moshi.JsonAdapter<com.qcwireless.qcwatch.ui.home.healthy.bean.WatchFaceVersionBean> {
    private final com.squareup.moshi.JsonReader.Options options;
    private final com.squareup.moshi.JsonAdapter<java.lang.String> stringAdapter;

    public GeneratedJsonAdapter(com.squareup.moshi.Moshi moshi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moshi, "moshi");
        com.squareup.moshi.JsonReader.Options of = com.squareup.moshi.JsonReader.Options.of(new java.lang.String[]{"hardwareVersion", "version"});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(of, "of(\"hardwareVersion\", \"version\")");
        this.options = of;
        com.squareup.moshi.JsonAdapter<java.lang.String> adapter = moshi.adapter(java.lang.String.class, kotlin.collections.SetsKt.emptySet(), "hardwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshi.adapter(String::cl…\n      \"hardwareVersion\")");
        this.stringAdapter = adapter;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("WatchFaceVersionBean");
        sb.append(')');
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: fromJson, reason: merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.ui.home.healthy.bean.WatchFaceVersionBean m1076fromJson(com.squareup.moshi.JsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        java.lang.String str = null;
        java.lang.String str2 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (java.lang.String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    java.lang.Throwable unexpectedNull = com.squareup.moshi.internal.Util.unexpectedNull("hardwareVersion", "hardwareVersion", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull, "unexpectedNull(\"hardware…hardwareVersion\", reader)");
                    throw unexpectedNull;
                }
            } else if (selectName == 1 && (str2 = (java.lang.String) this.stringAdapter.fromJson(reader)) == null) {
                java.lang.Throwable unexpectedNull2 = com.squareup.moshi.internal.Util.unexpectedNull("version", "version", reader);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull2, "unexpectedNull(\"version\"…       \"version\", reader)");
                throw unexpectedNull2;
            }
        }
        reader.endObject();
        if (str == null) {
            java.lang.Throwable missingProperty = com.squareup.moshi.internal.Util.missingProperty("hardwareVersion", "hardwareVersion", reader);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty, "missingProperty(\"hardwar…hardwareVersion\", reader)");
            throw missingProperty;
        }
        if (str2 != null) {
            return new com.qcwireless.qcwatch.ui.home.healthy.bean.WatchFaceVersionBean(str, str2);
        }
        java.lang.Throwable missingProperty2 = com.squareup.moshi.internal.Util.missingProperty("version", "version", reader);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(missingProperty2, "missingProperty(\"version\", \"version\", reader)");
        throw missingProperty2;
    }

    public void toJson(com.squareup.moshi.JsonWriter writer, com.qcwireless.qcwatch.ui.home.healthy.bean.WatchFaceVersionBean value_) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
        java.util.Objects.requireNonNull(value_, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.beginObject();
        writer.name("hardwareVersion");
        this.stringAdapter.toJson(writer, value_.getHardwareVersion());
        writer.name("version");
        this.stringAdapter.toJson(writer, value_.getVersion());
        writer.endObject();
    }
}
