package com.luck.picture.lib.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureAlbumAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.luck.picture.lib.adapter.PictureAlbumAdapter.ViewHolder> {
    private java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> albumList;
    private com.luck.picture.lib.interfaces.OnAlbumItemClickListener onAlbumItemClickListener;
    private final com.luck.picture.lib.config.SelectorConfig selectorConfig;

    public PictureAlbumAdapter(com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        this.selectorConfig = selectorConfig;
    }

    public void bindAlbumData(java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
        this.albumList = new java.util.ArrayList(list);
    }

    public java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> getAlbumList() {
        java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list = this.albumList;
        return list != null ? list : new java.util.ArrayList();
    }

    public com.luck.picture.lib.adapter.PictureAlbumAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        int layoutResource = com.luck.picture.lib.config.InjectResourceSource.getLayoutResource(viewGroup.getContext(), 6, this.selectorConfig);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
        if (layoutResource == 0) {
            layoutResource = com.luck.picture.lib.R.layout.ps_album_folder_item;
        }
        return new com.luck.picture.lib.adapter.PictureAlbumAdapter.ViewHolder(from.inflate(layoutResource, viewGroup, false));
    }

    public void onBindViewHolder(com.luck.picture.lib.adapter.PictureAlbumAdapter.ViewHolder viewHolder, final int i) {
        final com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder = this.albumList.get(i);
        java.lang.String folderName = localMediaFolder.getFolderName();
        int folderTotalNum = localMediaFolder.getFolderTotalNum();
        java.lang.String firstImagePath = localMediaFolder.getFirstImagePath();
        viewHolder.tvSelectTag.setVisibility(localMediaFolder.isSelectTag() ? 0 : 4);
        com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder2 = this.selectorConfig.currentLocalMediaFolder;
        viewHolder.itemView.setSelected(localMediaFolder2 != null && localMediaFolder.getBucketId() == localMediaFolder2.getBucketId());
        if (com.luck.picture.lib.config.PictureMimeType.isHasAudio(localMediaFolder.getFirstMimeType())) {
            viewHolder.ivFirstImage.setImageResource(com.luck.picture.lib.R.drawable.ps_audio_placeholder);
        } else if (this.selectorConfig.imageEngine != null) {
            this.selectorConfig.imageEngine.loadAlbumCover(viewHolder.itemView.getContext(), firstImagePath, viewHolder.ivFirstImage);
        }
        viewHolder.tvFolderName.setText(viewHolder.itemView.getContext().getString(com.luck.picture.lib.R.string.ps_camera_roll_num, folderName, java.lang.Integer.valueOf(folderTotalNum)));
        viewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.adapter.PictureAlbumAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.luck.picture.lib.adapter.PictureAlbumAdapter.this.onAlbumItemClickListener == null) {
                    return;
                }
                com.luck.picture.lib.adapter.PictureAlbumAdapter.this.onAlbumItemClickListener.onItemClick(i, localMediaFolder);
            }
        });
    }

    public int getItemCount() {
        return this.albumList.size();
    }

    public class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        android.widget.ImageView ivFirstImage;
        android.widget.TextView tvFolderName;
        android.widget.TextView tvSelectTag;

        public ViewHolder(android.view.View view) {
            super(view);
            this.ivFirstImage = (android.widget.ImageView) view.findViewById(com.luck.picture.lib.R.id.first_image);
            this.tvFolderName = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.tv_folder_name);
            this.tvSelectTag = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.tv_select_tag);
            com.luck.picture.lib.style.AlbumWindowStyle albumWindowStyle = com.luck.picture.lib.adapter.PictureAlbumAdapter.this.selectorConfig.selectorStyle.getAlbumWindowStyle();
            int albumAdapterItemBackground = albumWindowStyle.getAlbumAdapterItemBackground();
            if (albumAdapterItemBackground != 0) {
                view.setBackgroundResource(albumAdapterItemBackground);
            }
            int albumAdapterItemSelectStyle = albumWindowStyle.getAlbumAdapterItemSelectStyle();
            if (albumAdapterItemSelectStyle != 0) {
                this.tvSelectTag.setBackgroundResource(albumAdapterItemSelectStyle);
            }
            int albumAdapterItemTitleColor = albumWindowStyle.getAlbumAdapterItemTitleColor();
            if (albumAdapterItemTitleColor != 0) {
                this.tvFolderName.setTextColor(albumAdapterItemTitleColor);
            }
            int albumAdapterItemTitleSize = albumWindowStyle.getAlbumAdapterItemTitleSize();
            if (albumAdapterItemTitleSize > 0) {
                this.tvFolderName.setTextSize(albumAdapterItemTitleSize);
            }
        }
    }

    public void setOnIBridgeAlbumWidget(com.luck.picture.lib.interfaces.OnAlbumItemClickListener onAlbumItemClickListener) {
        this.onAlbumItemClickListener = onAlbumItemClickListener;
    }
}
