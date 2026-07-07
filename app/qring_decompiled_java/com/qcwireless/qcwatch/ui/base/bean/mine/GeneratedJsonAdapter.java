package com.qcwireless.qcwatch.ui.base.bean.mine;

/* compiled from: GoogleFitDataBeanJsonAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/bean/mine/GoogleFitDataBeanJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qcwireless/qcwatch/ui/base/bean/mine/GoogleFitDataBean;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "intAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBeanJsonAdapter, reason: from toString */
/* loaded from: /tmp/dex/classes2.dex */
public final class GeneratedJsonAdapter extends com.squareup.moshi.JsonAdapter<com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean> {
    private final com.squareup.moshi.JsonAdapter<java.lang.Integer> intAdapter;
    private final com.squareup.moshi.JsonReader.Options options;

    public GeneratedJsonAdapter(com.squareup.moshi.Moshi moshi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moshi, "moshi");
        com.squareup.moshi.JsonReader.Options of = com.squareup.moshi.JsonReader.Options.of(new java.lang.String[]{"calorie", "step", "time"});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(of, "of(\"calorie\", \"step\", \"time\")");
        this.options = of;
        com.squareup.moshi.JsonAdapter<java.lang.Integer> adapter = moshi.adapter(java.lang.Integer.TYPE, kotlin.collections.SetsKt.emptySet(), "calorie");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshi.adapter(Int::class…a, emptySet(), \"calorie\")");
        this.intAdapter = adapter;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GoogleFitDataBean");
        sb.append(')');
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: fromJson, reason: merged with bridge method [inline-methods] */
    public com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean m516fromJson(com.squareup.moshi.JsonReader reader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        java.lang.Integer num = null;
        java.lang.Integer num2 = null;
        java.lang.Integer num3 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                num = (java.lang.Integer) this.intAdapter.fromJson(reader);
                if (num == null) {
                    java.lang.Throwable unexpectedNull = com.squareup.moshi.internal.Util.unexpectedNull("calorie", "calorie", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull, "unexpectedNull(\"calorie\"…       \"calorie\", reader)");
                    throw unexpectedNull;
                }
            } else if (selectName == 1) {
                num2 = (java.lang.Integer) this.intAdapter.fromJson(reader);
                if (num2 == null) {
                    java.lang.Throwable unexpectedNull2 = com.squareup.moshi.internal.Util.unexpectedNull("step", "step", reader);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull2, "unexpectedNull(\"step\", \"step\", reader)");
                    throw unexpectedNull2;
                }
            } else if (selectName == 2 && (num3 = (java.lang.Integer) this.intAdapter.fromJson(reader)) == null) {
                java.lang.Throwable unexpectedNull3 = com.squareup.moshi.internal.Util.unexpectedNull("time", "time", reader);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unexpectedNull3, "unexpectedNull(\"time\", \"time\", reader)");
                throw unexpectedNull3;
            }
        }
        reader.endObject();
        com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean googleFitDataBean = new com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean();
        googleFitDataBean.setCalorie(num != null ? num.intValue() : googleFitDataBean.getCalorie());
        googleFitDataBean.setStep(num2 != null ? num2.intValue() : googleFitDataBean.getStep());
        googleFitDataBean.setTime(num3 != null ? num3.intValue() : googleFitDataBean.getTime());
        return googleFitDataBean;
    }

    public void toJson(com.squareup.moshi.JsonWriter writer, com.qcwireless.qcwatch.ui.base.bean.mine.GoogleFitDataBean value_) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "writer");
        java.util.Objects.requireNonNull(value_, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.beginObject();
        writer.name("calorie");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getCalorie()));
        writer.name("step");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getStep()));
        writer.name("time");
        this.intAdapter.toJson(writer, java.lang.Integer.valueOf(value_.getTime()));
        writer.endObject();
    }
}
