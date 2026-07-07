package com.yalantis.ucrop;

/* loaded from: classes3.dex */
public class UCropGalleryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.yalantis.ucrop.UCropGalleryAdapter.ViewHolder> {
    private int currentSelectPosition;
    private final java.util.List<java.lang.String> list;
    private com.yalantis.ucrop.UCropGalleryAdapter.OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int i, android.view.View view);
    }

    public UCropGalleryAdapter(java.util.List<java.lang.String> list) {
        this.list = list;
    }

    public void setCurrentSelectPosition(int i) {
        this.currentSelectPosition = i;
    }

    public int getCurrentSelectPosition() {
        return this.currentSelectPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public com.yalantis.ucrop.UCropGalleryAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        return new com.yalantis.ucrop.UCropGalleryAdapter.ViewHolder(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.yalantis.ucrop.R.layout.ucrop_gallery_adapter_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final com.yalantis.ucrop.UCropGalleryAdapter.ViewHolder viewHolder, int i) {
        android.graphics.ColorFilter createBlendModeColorFilterCompat;
        java.lang.String str = this.list.get(i);
        if (com.yalantis.ucrop.UCropDevelopConfig.imageEngine != null) {
            com.yalantis.ucrop.UCropDevelopConfig.imageEngine.loadImage(viewHolder.itemView.getContext(), str, viewHolder.mIvPhoto);
        }
        if (this.currentSelectPosition == i) {
            viewHolder.mViewCurrentSelect.setVisibility(0);
            createBlendModeColorFilterCompat = androidx.core.graphics.BlendModeColorFilterCompat.createBlendModeColorFilterCompat(androidx.core.content.ContextCompat.getColor(viewHolder.itemView.getContext(), com.yalantis.ucrop.R.color.ucrop_color_80), androidx.core.graphics.BlendModeCompat.SRC_ATOP);
        } else {
            createBlendModeColorFilterCompat = androidx.core.graphics.BlendModeColorFilterCompat.createBlendModeColorFilterCompat(androidx.core.content.ContextCompat.getColor(viewHolder.itemView.getContext(), com.yalantis.ucrop.R.color.ucrop_color_20), androidx.core.graphics.BlendModeCompat.SRC_ATOP);
            viewHolder.mViewCurrentSelect.setVisibility(8);
        }
        viewHolder.mIvPhoto.setColorFilter(createBlendModeColorFilterCompat);
        viewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.yalantis.ucrop.UCropGalleryAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.yalantis.ucrop.UCropGalleryAdapter.this.listener != null) {
                    com.yalantis.ucrop.UCropGalleryAdapter.this.listener.onItemClick(viewHolder.getAbsoluteAdapterPosition(), view);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        java.util.List<java.lang.String> list = this.list;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        android.widget.ImageView mIvPhoto;
        android.view.View mViewCurrentSelect;

        public ViewHolder(android.view.View view) {
            super(view);
            this.mIvPhoto = (android.widget.ImageView) view.findViewById(com.yalantis.ucrop.R.id.iv_photo);
            this.mViewCurrentSelect = view.findViewById(com.yalantis.ucrop.R.id.view_current_select);
        }
    }

    public void setOnItemClickListener(com.yalantis.ucrop.UCropGalleryAdapter.OnItemClickListener onItemClickListener) {
        this.listener = onItemClickListener;
    }
}
