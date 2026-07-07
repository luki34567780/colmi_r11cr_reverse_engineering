package com.luck.picture.lib.adapter.holder;

/* loaded from: /tmp/dex/classes2.dex */
public class BaseRecyclerMediaHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    public android.view.View btnCheck;
    private android.graphics.ColorFilter defaultColorFilter;
    public boolean isHandleMask;
    public boolean isSelectNumberStyle;
    public android.widget.ImageView ivPicture;
    private com.luck.picture.lib.adapter.PictureImageGridAdapter.OnItemClickListener listener;
    public android.content.Context mContext;
    private android.graphics.ColorFilter maskWhiteColorFilter;
    private android.graphics.ColorFilter selectColorFilter;
    public com.luck.picture.lib.config.SelectorConfig selectorConfig;
    public android.widget.TextView tvCheck;

    public static com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder generate(android.view.ViewGroup viewGroup, int i, int i2, com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        if (i == 1) {
            return new com.luck.picture.lib.adapter.holder.CameraViewHolder(inflate);
        }
        if (i == 3) {
            return new com.luck.picture.lib.adapter.holder.VideoViewHolder(inflate, selectorConfig);
        }
        if (i == 4) {
            return new com.luck.picture.lib.adapter.holder.AudioViewHolder(inflate, selectorConfig);
        }
        return new com.luck.picture.lib.adapter.holder.ImageViewHolder(inflate, selectorConfig);
    }

    public BaseRecyclerMediaHolder(android.view.View view) {
        super(view);
    }

    public BaseRecyclerMediaHolder(android.view.View view, com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        super(view);
        this.selectorConfig = selectorConfig;
        android.content.Context context = view.getContext();
        this.mContext = context;
        this.defaultColorFilter = com.luck.picture.lib.utils.StyleUtils.getColorFilter(context, com.luck.picture.lib.R.color.ps_color_20);
        this.selectColorFilter = com.luck.picture.lib.utils.StyleUtils.getColorFilter(this.mContext, com.luck.picture.lib.R.color.ps_color_80);
        this.maskWhiteColorFilter = com.luck.picture.lib.utils.StyleUtils.getColorFilter(this.mContext, com.luck.picture.lib.R.color.ps_color_half_white);
        com.luck.picture.lib.style.SelectMainStyle selectMainStyle = this.selectorConfig.selectorStyle.getSelectMainStyle();
        this.isSelectNumberStyle = selectMainStyle.isSelectNumberStyle();
        this.ivPicture = (android.widget.ImageView) view.findViewById(com.luck.picture.lib.R.id.ivPicture);
        this.tvCheck = (android.widget.TextView) view.findViewById(com.luck.picture.lib.R.id.tvCheck);
        this.btnCheck = view.findViewById(com.luck.picture.lib.R.id.btnCheck);
        boolean z = true;
        if (selectorConfig.selectionMode == 1 && selectorConfig.isDirectReturnSingle) {
            this.tvCheck.setVisibility(8);
            this.btnCheck.setVisibility(8);
        } else {
            this.tvCheck.setVisibility(0);
            this.btnCheck.setVisibility(0);
        }
        if (selectorConfig.isDirectReturnSingle || (selectorConfig.selectionMode != 1 && selectorConfig.selectionMode != 2)) {
            z = false;
        }
        this.isHandleMask = z;
        int adapterSelectTextSize = selectMainStyle.getAdapterSelectTextSize();
        if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(adapterSelectTextSize)) {
            this.tvCheck.setTextSize(adapterSelectTextSize);
        }
        int adapterSelectTextColor = selectMainStyle.getAdapterSelectTextColor();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(adapterSelectTextColor)) {
            this.tvCheck.setTextColor(adapterSelectTextColor);
        }
        int selectBackground = selectMainStyle.getSelectBackground();
        if (com.luck.picture.lib.utils.StyleUtils.checkStyleValidity(selectBackground)) {
            this.tvCheck.setBackgroundResource(selectBackground);
        }
        int[] adapterSelectStyleGravity = selectMainStyle.getAdapterSelectStyleGravity();
        if (com.luck.picture.lib.utils.StyleUtils.checkArrayValidity(adapterSelectStyleGravity)) {
            if (this.tvCheck.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
                ((android.widget.RelativeLayout.LayoutParams) this.tvCheck.getLayoutParams()).removeRule(21);
                for (int i : adapterSelectStyleGravity) {
                    ((android.widget.RelativeLayout.LayoutParams) this.tvCheck.getLayoutParams()).addRule(i);
                }
            }
            if (this.btnCheck.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
                ((android.widget.RelativeLayout.LayoutParams) this.btnCheck.getLayoutParams()).removeRule(21);
                for (int i2 : adapterSelectStyleGravity) {
                    ((android.widget.RelativeLayout.LayoutParams) this.btnCheck.getLayoutParams()).addRule(i2);
                }
            }
            int adapterSelectClickArea = selectMainStyle.getAdapterSelectClickArea();
            if (com.luck.picture.lib.utils.StyleUtils.checkSizeValidity(adapterSelectClickArea)) {
                android.view.ViewGroup.LayoutParams layoutParams = this.btnCheck.getLayoutParams();
                layoutParams.width = adapterSelectClickArea;
                layoutParams.height = adapterSelectClickArea;
            }
        }
    }

    public void bindData(final com.luck.picture.lib.entity.LocalMedia localMedia, final int i) {
        localMedia.position = getAbsoluteAdapterPosition();
        selectedMedia(isSelected(localMedia));
        if (this.isSelectNumberStyle) {
            notifySelectNumberStyle(localMedia);
        }
        if (this.isHandleMask && this.selectorConfig.isMaxSelectEnabledMask) {
            dispatchHandleMask(localMedia);
        }
        java.lang.String path = localMedia.getPath();
        if (localMedia.isEditorImage()) {
            path = localMedia.getCutPath();
        }
        loadCover(path);
        this.tvCheck.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.btnCheck.performClick();
            }
        });
        this.btnCheck.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                int onSelected;
                if (localMedia.isMaxSelectEnabledMask() || com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.listener == null || (onSelected = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.listener.onSelected(com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.tvCheck, i, localMedia)) == -1) {
                    return;
                }
                if (onSelected == 0) {
                    if (com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.selectorConfig.isSelectZoomAnim) {
                        if (com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.selectorConfig.onItemSelectAnimListener != null) {
                            com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.selectorConfig.onItemSelectAnimListener.onSelectItemAnim(com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.ivPicture, true);
                        } else {
                            com.luck.picture.lib.utils.AnimUtils.selectZoom(com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.ivPicture);
                        }
                    }
                } else if (onSelected == 1 && com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.selectorConfig.isSelectZoomAnim && com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.selectorConfig.onItemSelectAnimListener != null) {
                    com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.selectorConfig.onItemSelectAnimListener.onSelectItemAnim(com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.ivPicture, false);
                }
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder baseRecyclerMediaHolder = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this;
                baseRecyclerMediaHolder.selectedMedia(baseRecyclerMediaHolder.isSelected(localMedia));
            }
        });
        this.itemView.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.3
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(android.view.View view) {
                if (com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.listener == null) {
                    return false;
                }
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.listener.onItemLongClick(view, i);
                return false;
            }
        });
        this.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (localMedia.isMaxSelectEnabledMask() || com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.listener == null) {
                    return;
                }
                boolean z = true;
                if ((!com.luck.picture.lib.config.PictureMimeType.isHasImage(localMedia.getMimeType()) || !com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.selectorConfig.isEnablePreviewImage) && !com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.selectorConfig.isDirectReturnSingle && ((!com.luck.picture.lib.config.PictureMimeType.isHasVideo(localMedia.getMimeType()) || (!com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.selectorConfig.isEnablePreviewVideo && com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.selectorConfig.selectionMode != 1)) && (!com.luck.picture.lib.config.PictureMimeType.isHasAudio(localMedia.getMimeType()) || (!com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.selectorConfig.isEnablePreviewAudio && com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.selectorConfig.selectionMode != 1)))) {
                    z = false;
                }
                if (z) {
                    com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.listener.onItemClick(com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.tvCheck, i, localMedia);
                } else {
                    com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this.btnCheck.performClick();
                }
            }
        });
    }

    protected void loadCover(java.lang.String str) {
        if (this.selectorConfig.imageEngine != null) {
            this.selectorConfig.imageEngine.loadGridImage(this.ivPicture.getContext(), str, this.ivPicture);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (com.luck.picture.lib.config.PictureMimeType.isHasImage(r5.getMimeType()) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        if (com.luck.picture.lib.config.PictureMimeType.isHasVideo(r5.getMimeType()) == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void dispatchHandleMask(com.luck.picture.lib.entity.LocalMedia r5) {
        /*
            r4 = this;
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            int r0 = r0.getSelectCount()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L90
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            java.util.ArrayList r0 = r0.getSelectedResult()
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L90
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            boolean r0 = r0.isWithVideoImage
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L3c
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            int r0 = r0.selectionMode
            if (r0 != r2) goto L2f
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            int r0 = r0.getSelectCount()
            if (r0 != r3) goto L90
        L2d:
            r0 = 1
            goto L91
        L2f:
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            int r0 = r0.getSelectCount()
            com.luck.picture.lib.config.SelectorConfig r3 = r4.selectorConfig
            int r3 = r3.maxSelectNum
            if (r0 != r3) goto L90
            goto L2d
        L3c:
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            java.lang.String r0 = r0.getResultFirstMimeType()
            boolean r0 = com.luck.picture.lib.config.PictureMimeType.isHasVideo(r0)
            if (r0 == 0) goto L72
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            int r0 = r0.selectionMode
            if (r0 != r2) goto L4f
            goto L5f
        L4f:
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            int r0 = r0.maxVideoSelectNum
            if (r0 <= 0) goto L5a
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            int r0 = r0.maxVideoSelectNum
            goto L5e
        L5a:
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            int r0 = r0.maxSelectNum
        L5e:
            r3 = r0
        L5f:
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            int r0 = r0.getSelectCount()
            if (r0 == r3) goto L2d
            java.lang.String r0 = r5.getMimeType()
            boolean r0 = com.luck.picture.lib.config.PictureMimeType.isHasImage(r0)
            if (r0 == 0) goto L90
            goto L2d
        L72:
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            int r0 = r0.selectionMode
            if (r0 != r2) goto L79
            goto L7d
        L79:
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            int r3 = r0.maxSelectNum
        L7d:
            com.luck.picture.lib.config.SelectorConfig r0 = r4.selectorConfig
            int r0 = r0.getSelectCount()
            if (r0 == r3) goto L2d
            java.lang.String r0 = r5.getMimeType()
            boolean r0 = com.luck.picture.lib.config.PictureMimeType.isHasVideo(r0)
            if (r0 == 0) goto L90
            goto L2d
        L90:
            r0 = 0
        L91:
            if (r0 == 0) goto L9e
            android.widget.ImageView r0 = r4.ivPicture
            android.graphics.ColorFilter r1 = r4.maskWhiteColorFilter
            r0.setColorFilter(r1)
            r5.setMaxSelectEnabledMask(r2)
            goto La1
        L9e:
            r5.setMaxSelectEnabledMask(r1)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.dispatchHandleMask(com.luck.picture.lib.entity.LocalMedia):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectedMedia(boolean z) {
        if (this.tvCheck.isSelected() != z) {
            this.tvCheck.setSelected(z);
        }
        if (this.selectorConfig.isDirectReturnSingle) {
            this.ivPicture.setColorFilter(this.defaultColorFilter);
        } else {
            this.ivPicture.setColorFilter(z ? this.selectColorFilter : this.defaultColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSelected(com.luck.picture.lib.entity.LocalMedia localMedia) {
        com.luck.picture.lib.entity.LocalMedia compareLocalMedia;
        boolean contains = this.selectorConfig.getSelectedResult().contains(localMedia);
        if (contains && (compareLocalMedia = localMedia.getCompareLocalMedia()) != null && compareLocalMedia.isEditorImage()) {
            localMedia.setCutPath(compareLocalMedia.getCutPath());
            localMedia.setCut(!android.text.TextUtils.isEmpty(compareLocalMedia.getCutPath()));
            localMedia.setEditorImage(compareLocalMedia.isEditorImage());
        }
        return contains;
    }

    private void notifySelectNumberStyle(com.luck.picture.lib.entity.LocalMedia localMedia) {
        this.tvCheck.setText("");
        for (int i = 0; i < this.selectorConfig.getSelectCount(); i++) {
            com.luck.picture.lib.entity.LocalMedia localMedia2 = this.selectorConfig.getSelectedResult().get(i);
            if (android.text.TextUtils.equals(localMedia2.getPath(), localMedia.getPath()) || localMedia2.getId() == localMedia.getId()) {
                localMedia.setNum(localMedia2.getNum());
                localMedia2.setPosition(localMedia.getPosition());
                this.tvCheck.setText(com.luck.picture.lib.utils.ValueOf.toString(java.lang.Integer.valueOf(localMedia.getNum())));
            }
        }
    }

    public void setOnItemClickListener(com.luck.picture.lib.adapter.PictureImageGridAdapter.OnItemClickListener onItemClickListener) {
        this.listener = onItemClickListener;
    }
}
