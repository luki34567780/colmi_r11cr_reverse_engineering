package com.qcwireless.qcwatch.ui.home.sport.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class CommonViewHolder {
    private android.view.View mConvertView;
    private android.util.SparseArray<android.view.View> mWidgetViews = new android.util.SparseArray<>();

    private CommonViewHolder(android.content.Context context, android.view.ViewGroup parent, int layoutId, int position) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(layoutId, parent, false);
        this.mConvertView = inflate;
        inflate.setTag(this);
    }

    public static com.qcwireless.qcwatch.ui.home.sport.adapter.CommonViewHolder get(android.view.View convertView, android.content.Context context, android.view.ViewGroup parent, int layoutId, int position) {
        if (convertView == null) {
            return new com.qcwireless.qcwatch.ui.home.sport.adapter.CommonViewHolder(context, parent, layoutId, position);
        }
        return (com.qcwireless.qcwatch.ui.home.sport.adapter.CommonViewHolder) convertView.getTag();
    }

    public <T extends android.view.View> T getView(int i) {
        T t = (T) this.mWidgetViews.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.mConvertView.findViewById(i);
        this.mWidgetViews.put(i, t2);
        return t2;
    }

    public void setText(int viewId, java.lang.String text) {
        ((android.widget.TextView) getView(viewId)).setText(text);
    }

    public void setImageResource(int viewId, int drawableId) {
        ((android.widget.ImageView) getView(viewId)).setImageResource(drawableId);
    }

    public void setBackgroundRes(int viewId, int drawableId) {
        ((android.widget.ImageView) getView(viewId)).setBackgroundResource(drawableId);
    }

    public void setImageBitmap(int viewId, android.graphics.Bitmap bm) {
        setImageBackground(viewId, new android.graphics.drawable.BitmapDrawable(bm));
    }

    public void setImageBackground(int viewId, android.graphics.drawable.Drawable drawable) {
        ((android.widget.ImageView) getView(viewId)).setBackground(drawable);
    }

    public android.view.View getConvertView() {
        return this.mConvertView;
    }
}
