package com.luck.picture.lib.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureImageGridAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder> {
    public static final int ADAPTER_TYPE_AUDIO = 4;
    public static final int ADAPTER_TYPE_CAMERA = 1;
    public static final int ADAPTER_TYPE_IMAGE = 2;
    public static final int ADAPTER_TYPE_VIDEO = 3;
    private boolean isDisplayCamera;
    private com.luck.picture.lib.adapter.PictureImageGridAdapter.OnItemClickListener listener;
    private final com.luck.picture.lib.config.SelectorConfig mConfig;
    private final android.content.Context mContext;
    private java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> mData = new java.util.ArrayList<>();

    public interface OnItemClickListener {
        void onItemClick(android.view.View view, int i, com.luck.picture.lib.entity.LocalMedia localMedia);

        void onItemLongClick(android.view.View view, int i);

        int onSelected(android.view.View view, int i, com.luck.picture.lib.entity.LocalMedia localMedia);

        void openCameraClick();
    }

    public void notifyItemPositionChanged(int i) {
        notifyItemChanged(i);
    }

    public PictureImageGridAdapter(android.content.Context context, com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        this.mConfig = selectorConfig;
        this.mContext = context;
    }

    public void setDataAndDataSetChanged(java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> arrayList) {
        if (arrayList != null) {
            this.mData = arrayList;
            notifyDataSetChanged();
        }
    }

    public boolean isDisplayCamera() {
        return this.isDisplayCamera;
    }

    public void setDisplayCamera(boolean z) {
        this.isDisplayCamera = z;
    }

    public java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> getData() {
        return this.mData;
    }

    public boolean isDataEmpty() {
        return this.mData.size() == 0;
    }

    public int getItemViewType(int i) {
        boolean z = this.isDisplayCamera;
        if (z && i == 0) {
            return 1;
        }
        if (z) {
            i--;
        }
        java.lang.String mimeType = this.mData.get(i).getMimeType();
        if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(mimeType)) {
            return 3;
        }
        return com.luck.picture.lib.config.PictureMimeType.isHasAudio(mimeType) ? 4 : 2;
    }

    public com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        return com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.generate(viewGroup, i, getItemResourceId(i), this.mConfig);
    }

    private int getItemResourceId(int i) {
        if (i == 1) {
            return com.luck.picture.lib.R.layout.ps_item_grid_camera;
        }
        if (i == 3) {
            int layoutResource = com.luck.picture.lib.config.InjectResourceSource.getLayoutResource(this.mContext, 4, this.mConfig);
            return layoutResource != 0 ? layoutResource : com.luck.picture.lib.R.layout.ps_item_grid_video;
        }
        if (i == 4) {
            int layoutResource2 = com.luck.picture.lib.config.InjectResourceSource.getLayoutResource(this.mContext, 5, this.mConfig);
            return layoutResource2 != 0 ? layoutResource2 : com.luck.picture.lib.R.layout.ps_item_grid_audio;
        }
        int layoutResource3 = com.luck.picture.lib.config.InjectResourceSource.getLayoutResource(this.mContext, 3, this.mConfig);
        return layoutResource3 != 0 ? layoutResource3 : com.luck.picture.lib.R.layout.ps_item_grid_image;
    }

    public void onBindViewHolder(com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder baseRecyclerMediaHolder, int i) {
        if (getItemViewType(i) == 1) {
            baseRecyclerMediaHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.adapter.PictureImageGridAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (com.luck.picture.lib.adapter.PictureImageGridAdapter.this.listener != null) {
                        com.luck.picture.lib.adapter.PictureImageGridAdapter.this.listener.openCameraClick();
                    }
                }
            });
            return;
        }
        if (this.isDisplayCamera) {
            i--;
        }
        baseRecyclerMediaHolder.bindData(this.mData.get(i), i);
        baseRecyclerMediaHolder.setOnItemClickListener(this.listener);
    }

    public int getItemCount() {
        return this.isDisplayCamera ? this.mData.size() + 1 : this.mData.size();
    }

    public void setOnItemClickListener(com.luck.picture.lib.adapter.PictureImageGridAdapter.OnItemClickListener onItemClickListener) {
        this.listener = onItemClickListener;
    }
}
