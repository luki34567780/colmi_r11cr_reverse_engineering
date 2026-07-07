package com.luck.picture.lib.adapter.holder;

/* loaded from: /tmp/dex/classes2.dex */
public class PreviewGalleryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.ViewHolder> {
    private final boolean isBottomPreview;
    private com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.OnItemClickListener listener;
    private final java.util.List<com.luck.picture.lib.entity.LocalMedia> mData;
    private com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.OnItemLongClickListener mItemLongClickListener;
    private final com.luck.picture.lib.config.SelectorConfig selectorConfig;

    public interface OnItemClickListener {
        void onItemClick(int i, com.luck.picture.lib.entity.LocalMedia localMedia, android.view.View view);
    }

    public interface OnItemLongClickListener {
        void onItemLongClick(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, android.view.View view);
    }

    public PreviewGalleryAdapter(com.luck.picture.lib.config.SelectorConfig selectorConfig, boolean z) {
        this.selectorConfig = selectorConfig;
        this.isBottomPreview = z;
        this.mData = new java.util.ArrayList(selectorConfig.getSelectedResult());
        for (int i = 0; i < this.mData.size(); i++) {
            com.luck.picture.lib.entity.LocalMedia localMedia = this.mData.get(i);
            localMedia.setGalleryEnabledMask(false);
            localMedia.setChecked(false);
        }
    }

    public com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        int layoutResource = com.luck.picture.lib.config.InjectResourceSource.getLayoutResource(viewGroup.getContext(), 9, this.selectorConfig);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
        if (layoutResource == 0) {
            layoutResource = com.luck.picture.lib.R.layout.ps_preview_gallery_item;
        }
        return new com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.ViewHolder(from.inflate(layoutResource, viewGroup, false));
    }

    public java.util.List<com.luck.picture.lib.entity.LocalMedia> getData() {
        return this.mData;
    }

    public void clear() {
        this.mData.clear();
    }

    public void addGalleryData(com.luck.picture.lib.entity.LocalMedia localMedia) {
        int lastCheckPosition = getLastCheckPosition();
        if (lastCheckPosition != -1) {
            this.mData.get(lastCheckPosition).setChecked(false);
            notifyItemChanged(lastCheckPosition);
        }
        if (this.isBottomPreview && this.mData.contains(localMedia)) {
            int currentPosition = getCurrentPosition(localMedia);
            com.luck.picture.lib.entity.LocalMedia localMedia2 = this.mData.get(currentPosition);
            localMedia2.setGalleryEnabledMask(false);
            localMedia2.setChecked(true);
            notifyItemChanged(currentPosition);
            return;
        }
        localMedia.setChecked(true);
        this.mData.add(localMedia);
        notifyItemChanged(this.mData.size() - 1);
    }

    public void removeGalleryData(com.luck.picture.lib.entity.LocalMedia localMedia) {
        int currentPosition = getCurrentPosition(localMedia);
        if (currentPosition != -1) {
            if (this.isBottomPreview) {
                this.mData.get(currentPosition).setGalleryEnabledMask(true);
                notifyItemChanged(currentPosition);
            } else {
                this.mData.remove(currentPosition);
                notifyItemRemoved(currentPosition);
            }
        }
    }

    public void isSelectMedia(com.luck.picture.lib.entity.LocalMedia localMedia) {
        int lastCheckPosition = getLastCheckPosition();
        if (lastCheckPosition != -1) {
            this.mData.get(lastCheckPosition).setChecked(false);
            notifyItemChanged(lastCheckPosition);
        }
        int currentPosition = getCurrentPosition(localMedia);
        if (currentPosition != -1) {
            this.mData.get(currentPosition).setChecked(true);
            notifyItemChanged(currentPosition);
        }
    }

    public int getLastCheckPosition() {
        for (int i = 0; i < this.mData.size(); i++) {
            if (this.mData.get(i).isChecked()) {
                return i;
            }
        }
        return -1;
    }

    private int getCurrentPosition(com.luck.picture.lib.entity.LocalMedia localMedia) {
        for (int i = 0; i < this.mData.size(); i++) {
            com.luck.picture.lib.entity.LocalMedia localMedia2 = this.mData.get(i);
            if (android.text.TextUtils.equals(localMedia2.getPath(), localMedia.getPath()) || localMedia2.getId() == localMedia.getId()) {
                return i;
            }
        }
        return -1;
    }

    public void onBindViewHolder(final com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.ViewHolder viewHolder, int i) {
        final com.luck.picture.lib.entity.LocalMedia localMedia = this.mData.get(i);
        android.graphics.ColorFilter colorFilter = com.luck.picture.lib.utils.StyleUtils.getColorFilter(viewHolder.itemView.getContext(), localMedia.isGalleryEnabledMask() ? com.luck.picture.lib.R.color.ps_color_half_white : com.luck.picture.lib.R.color.ps_color_transparent);
        if (localMedia.isChecked() && localMedia.isGalleryEnabledMask()) {
            viewHolder.viewBorder.setVisibility(0);
        } else {
            viewHolder.viewBorder.setVisibility(localMedia.isChecked() ? 0 : 8);
        }
        java.lang.String path = localMedia.getPath();
        if (localMedia.isEditorImage() && !android.text.TextUtils.isEmpty(localMedia.getCutPath())) {
            path = localMedia.getCutPath();
            viewHolder.ivEditor.setVisibility(0);
        } else {
            viewHolder.ivEditor.setVisibility(8);
        }
        viewHolder.ivImage.setColorFilter(colorFilter);
        if (this.selectorConfig.imageEngine != null) {
            this.selectorConfig.imageEngine.loadGridImage(viewHolder.itemView.getContext(), path, viewHolder.ivImage);
        }
        viewHolder.ivPlay.setVisibility(com.luck.picture.lib.config.PictureMimeType.isHasVideo(localMedia.getMimeType()) ? 0 : 8);
        viewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.this.listener != null) {
                    com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.this.listener.onItemClick(viewHolder.getAbsoluteAdapterPosition(), localMedia, view);
                }
            }
        });
        viewHolder.itemView.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(android.view.View view) {
                if (com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.this.mItemLongClickListener == null) {
                    return true;
                }
                com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.this.mItemLongClickListener.onItemLongClick(viewHolder, viewHolder.getAbsoluteAdapterPosition(), view);
                return true;
            }
        });
    }

    public class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        android.widget.ImageView ivEditor;
        android.widget.ImageView ivImage;
        android.widget.ImageView ivPlay;
        android.view.View viewBorder;

        public ViewHolder(android.view.View view) {
            super(view);
            this.ivImage = (android.widget.ImageView) view.findViewById(com.luck.picture.lib.R.id.ivImage);
            this.ivPlay = (android.widget.ImageView) view.findViewById(com.luck.picture.lib.R.id.ivPlay);
            this.ivEditor = (android.widget.ImageView) view.findViewById(com.luck.picture.lib.R.id.ivEditor);
            this.viewBorder = view.findViewById(com.luck.picture.lib.R.id.viewBorder);
            com.luck.picture.lib.style.SelectMainStyle selectMainStyle = com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.this.selectorConfig.selectorStyle.getSelectMainStyle();
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectMainStyle.getAdapterImageEditorResources())) {
                this.ivEditor.setImageResource(selectMainStyle.getAdapterImageEditorResources());
            }
            if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectMainStyle.getAdapterPreviewGalleryFrameResource())) {
                this.viewBorder.setBackgroundResource(selectMainStyle.getAdapterPreviewGalleryFrameResource());
            }
            int adapterPreviewGalleryItemSize = selectMainStyle.getAdapterPreviewGalleryItemSize();
            if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(adapterPreviewGalleryItemSize)) {
                view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(adapterPreviewGalleryItemSize, adapterPreviewGalleryItemSize));
            }
        }
    }

    public int getItemCount() {
        return this.mData.size();
    }

    public void setItemClickListener(com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.OnItemClickListener onItemClickListener) {
        this.listener = onItemClickListener;
    }

    public void setItemLongClickListener(com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.OnItemLongClickListener onItemLongClickListener) {
        this.mItemLongClickListener = onItemLongClickListener;
    }
}
