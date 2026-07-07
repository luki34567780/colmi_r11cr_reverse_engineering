package com.qcwireless.qcwatch.ui.device.music.adapter;

/* compiled from: MusicManagerListAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003()*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001dH\u0016J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001dH\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001dH\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00158F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017¨\u0006+"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicManagerListAdapter;", "Lcom/qcwireless/qcwatch/base/dialog/adapter/EasyAdapter;", "Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicManagerListAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "data", "", "Lcom/qcwireless/qcwatch/ui/device/music/bean/Song;", "(Landroid/content/Context;Ljava/util/List;)V", "_itemState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicManagerListAdapter$PopWindowUI;", "_music", "Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicManagerListAdapter$MusicUI;", "getContext", "()Landroid/content/Context;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "itemState", "Landroidx/lifecycle/LiveData;", "getItemState", "()Landroidx/lifecycle/LiveData;", "mInflater", "Landroid/view/LayoutInflater;", "music", "getMusic", "getItemCount", "", "getItemId", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "whenBindViewHolder", "", "holder", "MusicUI", "MyViewHolder", "PopWindowUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MusicManagerListAdapter extends com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter<com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MyViewHolder> {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI> _itemState;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MusicUI> _music;
    private final android.content.Context context;
    private java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> data;
    private android.view.LayoutInflater mInflater;

    public long getItemId(int position) {
        return position;
    }

    public MusicManagerListAdapter(android.content.Context context, java.util.List<com.qcwireless.qcwatch.ui.device.music.bean.Song> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
        this.context = context;
        this.data = list;
        this._itemState = new androidx.lifecycle.MutableLiveData<>();
        this._music = new androidx.lifecycle.MutableLiveData<>();
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

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI> getItemState() {
        return this._itemState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MusicUI> getMusic() {
        return this._music;
    }

    public int getItemCount() {
        return this.data.size();
    }

    @Override // com.qcwireless.qcwatch.base.dialog.adapter.EasyAdapter
    public void whenBindViewHolder(com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MyViewHolder holder, final int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        final com.qcwireless.qcwatch.ui.device.music.bean.Song song = this.data.get(position);
        holder.getName().setText(song.getName());
        if (song.getEditMusic()) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(holder.getSelectImage());
            com.qcwireless.qcwatch.base.view.ViewKt.gone(holder.getShowPop());
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(holder.getSelectImage());
            com.qcwireless.qcwatch.base.view.ViewKt.visible(holder.getShowPop());
        }
        if (song.getSelect()) {
            holder.getSelectImage().setImageDrawable(skin.support.content.res.SkinCompatResources.getDrawable(this.context, com.qcwireless.qcwatch.R.mipmap.music_select));
        } else {
            holder.getSelectImage().setImageDrawable(skin.support.content.res.SkinCompatResources.getDrawable(this.context, com.qcwireless.qcwatch.R.mipmap.music_unselect));
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getJieLiMusic()) {
            com.qcwireless.qcwatch.base.view.ViewKt.visible(holder.getLyrics());
        } else {
            com.qcwireless.qcwatch.base.view.ViewKt.gone(holder.getLyrics());
        }
        holder.getShowPop().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.m830whenBindViewHolder$lambda0(com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.this, position, view);
            }
        });
        holder.getLyrics().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.m831whenBindViewHolder$lambda1(com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.this, song, position, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: whenBindViewHolder$lambda-0, reason: not valid java name */
    public static final void m830whenBindViewHolder$lambda0(com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter, int i, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerListAdapter, "this$0");
        musicManagerListAdapter._itemState.postValue(new com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI(view, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: whenBindViewHolder$lambda-1, reason: not valid java name */
    public static final void m831whenBindViewHolder$lambda1(com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter musicManagerListAdapter, com.qcwireless.qcwatch.ui.device.music.bean.Song song, int i, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicManagerListAdapter, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(song, "$bean");
        musicManagerListAdapter._music.postValue(new com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MusicUI(song.getName(), i));
    }

    /* compiled from: MusicManagerListAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicManagerListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "lyrics", "Landroid/widget/TextView;", "getLyrics", "()Landroid/widget/TextView;", "setLyrics", "(Landroid/widget/TextView;)V", "name", "getName", "setName", "selectImage", "Landroid/widget/ImageView;", "getSelectImage", "()Landroid/widget/ImageView;", "setSelectImage", "(Landroid/widget/ImageView;)V", "showPop", "getShowPop", "setShowPop", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView lyrics;
        private android.widget.TextView name;
        private android.widget.ImageView selectImage;
        private android.widget.ImageView showPop;

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
            android.view.View findViewById3 = view.findViewById(com.qcwireless.qcwatch.R.id.image_show_pop);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.image_show_pop)");
            this.showPop = (android.widget.ImageView) findViewById3;
            android.view.View findViewById4 = view.findViewById(com.qcwireless.qcwatch.R.id.tv_lyrics);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.id.tv_lyrics)");
            this.lyrics = (android.widget.TextView) findViewById4;
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

        public final android.widget.ImageView getShowPop() {
            return this.showPop;
        }

        public final void setShowPop(android.widget.ImageView imageView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.showPop = imageView;
        }

        public final android.widget.TextView getLyrics() {
            return this.lyrics;
        }

        public final void setLyrics(android.widget.TextView textView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.lyrics = textView;
        }
    }

    public com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MyViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.context);
        this.mInflater = from;
        kotlin.jvm.internal.Intrinsics.checkNotNull(from);
        android.view.View inflate = from.inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_manager_music, parent, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "view");
        return new com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MyViewHolder(inflate);
    }

    /* compiled from: MusicManagerListAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicManagerListAdapter$PopWindowUI;", "", "view", "Landroid/view/View;", "position", "", "(Landroid/view/View;I)V", "getPosition", "()I", "setPosition", "(I)V", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class PopWindowUI {
        private int position;
        private android.view.View view;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PopWindowUI() {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                r2 = 3
                r3.<init>(r0, r1, r2, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI.<init>():void");
        }

        public static /* synthetic */ com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI copy$default(com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI popWindowUI, android.view.View view, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                view = popWindowUI.view;
            }
            if ((i2 & 2) != 0) {
                i = popWindowUI.position;
            }
            return popWindowUI.copy(view, i);
        }

        /* renamed from: component1, reason: from getter */
        public final android.view.View getView() {
            return this.view;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        public final com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI copy(android.view.View view, int position) {
            return new com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI(view, position);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI popWindowUI = (com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.PopWindowUI) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.view, popWindowUI.view) && this.position == popWindowUI.position;
        }

        public int hashCode() {
            android.view.View view = this.view;
            return ((view == null ? 0 : view.hashCode()) * 31) + this.position;
        }

        public java.lang.String toString() {
            return "PopWindowUI(view=" + this.view + ", position=" + this.position + ')';
        }

        public PopWindowUI(android.view.View view, int i) {
            this.view = view;
            this.position = i;
        }

        public /* synthetic */ PopWindowUI(android.view.View view, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : view, (i2 & 2) != 0 ? 0 : i);
        }

        public final android.view.View getView() {
            return this.view;
        }

        public final void setView(android.view.View view) {
            this.view = view;
        }

        public final int getPosition() {
            return this.position;
        }

        public final void setPosition(int i) {
            this.position = i;
        }
    }

    /* compiled from: MusicManagerListAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/music/adapter/MusicManagerListAdapter$MusicUI;", "", "musicName", "", "position", "", "(Ljava/lang/String;I)V", "getMusicName", "()Ljava/lang/String;", "setMusicName", "(Ljava/lang/String;)V", "getPosition", "()I", "setPosition", "(I)V", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class MusicUI {
        private java.lang.String musicName;
        private int position;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MusicUI copy$default(com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MusicUI musicUI, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = musicUI.musicName;
            }
            if ((i2 & 2) != 0) {
                i = musicUI.position;
            }
            return musicUI.copy(str, i);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMusicName() {
            return this.musicName;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        public final com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MusicUI copy(java.lang.String musicName, int position) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(musicName, "musicName");
            return new com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MusicUI(musicName, position);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MusicUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MusicUI musicUI = (com.qcwireless.qcwatch.ui.device.music.adapter.MusicManagerListAdapter.MusicUI) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.musicName, musicUI.musicName) && this.position == musicUI.position;
        }

        public int hashCode() {
            return (this.musicName.hashCode() * 31) + this.position;
        }

        public java.lang.String toString() {
            return "MusicUI(musicName=" + this.musicName + ", position=" + this.position + ')';
        }

        public MusicUI(java.lang.String str, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "musicName");
            this.musicName = str;
            this.position = i;
        }

        public /* synthetic */ MusicUI(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? 0 : i);
        }

        public final java.lang.String getMusicName() {
            return this.musicName;
        }

        public final void setMusicName(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.musicName = str;
        }

        public final int getPosition() {
            return this.position;
        }

        public final void setPosition(int i) {
            this.position = i;
        }
    }
}
