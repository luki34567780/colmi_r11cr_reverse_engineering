package com.qcwireless.qcwatch.ui.device.music.adapter;

/* compiled from: MusicSelectListAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicSelectListAdapter;", "Lcom/qcwireless/qcwatch/base/dialog/adapter/EasyAdapter;", "Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicSelectListAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "data", "", "Lcom/qcwireless/qcwatch/ui/device/music/bean/Song;", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "mInflater", "Landroid/view/LayoutInflater;", "getItemCount", "", "getItemId", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "whenBindViewHolder", "", "holder", "MyViewHolder", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MusicSelectListAdapter extends com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter<com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter.MyViewHolder> {
    private final android.content.Context context;
    private java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> data;
    private android.view.LayoutInflater mInflater;

    public long getItemId(int position) {
        return position;
    }

    public MusicSelectListAdapter(android.content.Context context, java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
        this.context = context;
        this.data = list;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> getData() {
        return this.data;
    }

    public final void setData(java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public int getItemCount() {
        return this.data.size();
    }

    @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter
    public void whenBindViewHolder(com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter.MyViewHolder holder, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        if (position == 0) {
            holder.getTvKey().setVisibility(0);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(this.data.get(holder.getLayoutPosition()).getFirstName(), this.data.get(holder.getLayoutPosition() - 1).getFirstName())) {
            holder.getTvKey().setVisibility(8);
        } else {
            holder.getTvKey().setVisibility(0);
        }
        com.qcwireless.qcwatch.ui.device.music.bean.Song song = this.data.get(position);
        android.widget.TextView tvKey = holder.getTvKey();
        java.lang.String upperCase = song.getFirstName().toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        tvKey.setText(upperCase);
        holder.getName().setText(song.getName());
        if (song.getSelect()) {
            holder.getSelectImage().setImageDrawable(skin.support.content.res.SkinCompatResources.getDrawable(this.context, com.qcwireless.qcwatch.R.mipmap.music_select));
        } else {
            holder.getSelectImage().setImageDrawable(skin.support.content.res.SkinCompatResources.getDrawable(this.context, com.qcwireless.qcwatch.R.mipmap.music_unselect));
        }
    }

    /* compiled from: MusicSelectListAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicSelectListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "setName", "(Landroid/widget/TextView;)V", "selectImage", "Landroid/widget/ImageView;", "getSelectImage", "()Landroid/widget/ImageView;", "setSelectImage", "(Landroid/widget/ImageView;)V", "tvKey", "getTvKey", "setTvKey", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView name;
        private android.widget.ImageView selectImage;
        private android.widget.TextView tvKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyViewHolder(android.view.View view) {
            super(view);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "itemView");
            android.view.View findViewById = view.findViewById(com.qcwireless.qcwatch.R.id.rcv_device_name);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.rcv_device_name)");
            this.name = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = view.findViewById(com.qcwireless.qcwatch.R.id.image_select);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.image_select)");
            this.selectImage = (android.widget.ImageView) findViewById2;
            android.view.View findViewById3 = view.findViewById(com.qcwireless.qcwatch.R.id.key_word);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.key_word)");
            this.tvKey = (android.widget.TextView) findViewById3;
        }

        public final android.widget.TextView getName() {
            return this.name;
        }

        public final void setName(android.widget.TextView textView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.name = textView;
        }

        public final android.widget.ImageView getSelectImage() {
            return this.selectImage;
        }

        public final void setSelectImage(android.widget.ImageView imageView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.selectImage = imageView;
        }

        public final android.widget.TextView getTvKey() {
            return this.tvKey;
        }

        public final void setTvKey(android.widget.TextView textView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.tvKey = textView;
        }
    }

    public com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter.MyViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.context);
        this.mInflater = from;
        kotlin.jvm.internal.Intrinsics.checkNotNull(from);
        android.view.View inflate = from.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_add_music, parent, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "view");
        return new com.qcwireless.qcwatch.ui.device.music.adapter.MusicSelectListAdapter.MyViewHolder(inflate);
    }
}
