package com.qcwireless.qcwatch.ui.home.gps.adapter;

/* compiled from: GpsDetailAdapter.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/adapter/GpsDetailAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/GpsDetail;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "context", "Landroid/content/Context;", "data", "", "(Landroid/content/Context;Ljava/util/List;)V", "df", "Ljava/text/DecimalFormat;", "pathPoint", "Lcom/qcwireless/qcwatch/ui/home/gps/bean/QLatLon;", "convert", "", "holder", "item", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class GpsDetailAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private java.text.DecimalFormat df;
    private java.util.List<com.qcwireless.qcwatch.ui.home.gps.bean.QLatLon> pathPoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsDetailAdapter(android.content.Context context, java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> list) {
        super(com.qcwireless.qcwatch.R.layout.recycleview_item_gps_detail, list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
        this.df = new java.text.DecimalFormat("0.00", new java.text.DecimalFormatSymbols(java.util.Locale.US));
        this.pathPoint = new java.util.ArrayList();
        this.df.setRoundingMode(java.math.RoundingMode.HALF_UP);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(com.chad.library.adapter.base.viewholder.BaseViewHolder holder, com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) holder.getView(com.qcwireless.qcwatch.R.id.detail_0);
        com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView2 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) holder.getView(com.qcwireless.qcwatch.R.id.detail_2);
        com.qcwireless.qcwatch.ui.base.view.QSportItemView qSportItemView3 = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) holder.getView(com.qcwireless.qcwatch.R.id.detail_1);
        android.widget.TextView textView = (android.widget.TextView) holder.getView(com.qcwireless.qcwatch.R.id.tv_gps_start_time);
        android.widget.TextView textView2 = (android.widget.TextView) holder.getView(com.qcwireless.qcwatch.R.id.sport_type_image);
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
            java.lang.String string = getContext().getString(com.qcwireless.qcwatch.R.string.qc_text_88);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.qc_text_88)");
            qSportItemView.setItemUnit(string);
            java.lang.String format = this.df.format(java.lang.Float.valueOf(item.getDistance() / 1000));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "df.format(item.distance/1000)");
            qSportItemView.setItemTitle(format);
        } else {
            java.lang.String string2 = getContext().getString(com.qcwireless.qcwatch.R.string.qc_text_358);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.qc_text_358)");
            qSportItemView.setItemUnit(string2);
            java.lang.String format2 = this.df.format(java.lang.Float.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn(item.getDistance() / 1000.0f)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "df.format(kmToIn(item.distance/1000f))");
            qSportItemView.setItemTitle(format2);
        }
        qSportItemView2.setItemTitle(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(item.getCalorie())));
        java.lang.String minsToHHmmdd = com.qcwireless.qc_utils.date.DateUtil.minsToHHmmdd(item.getDuration() / 1000);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(minsToHHmmdd, "minsToHHmmdd(item.duration/1000)");
        qSportItemView3.setItemTitle(minsToHHmmdd);
        textView.setText(new com.qcwireless.qc_utils.date.DateUtil(item.getStartTime(), true).getHHmmDate());
        int gpsType = item.getGpsType();
        if (gpsType == 0) {
            textView2.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_6666043));
        } else if (gpsType == 1) {
            textView2.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_6666044));
        } else {
            if (gpsType != 2) {
                return;
            }
            textView2.setText(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_6666045));
        }
    }
}
