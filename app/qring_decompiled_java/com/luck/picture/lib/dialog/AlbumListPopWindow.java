package com.luck.picture.lib.dialog;

/* loaded from: /tmp/dex/classes2.dex */
public class AlbumListPopWindow extends android.widget.PopupWindow {
    private static final int ALBUM_MAX_COUNT = 8;
    private boolean isDismiss = false;
    private com.luck.picture.lib.adapter.PictureAlbumAdapter mAdapter;
    private final android.content.Context mContext;
    private androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private com.luck.picture.lib.config.SelectorConfig selectorConfig;
    private android.view.View windMask;
    private int windowMaxHeight;
    private com.luck.picture.lib.dialog.AlbumListPopWindow.OnPopupWindowStatusListener windowStatusListener;

    public interface OnPopupWindowStatusListener {
        void onDismissPopupWindow();

        void onShowPopupWindow();
    }

    public AlbumListPopWindow(android.content.Context context, com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        this.mContext = context;
        this.selectorConfig = selectorConfig;
        setContentView(android.view.LayoutInflater.from(context).inflate(com.luck.picture.lib.R.layout.ps_window_folder, (android.view.ViewGroup) null));
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(com.luck.picture.lib.R.style.PictureThemeWindowStyle);
        setFocusable(true);
        setOutsideTouchable(true);
        update();
        initViews();
    }

    private void initViews() {
        this.windowMaxHeight = (int) (com.luck.picture.lib.utils.DensityUtil.getScreenHeight(this.mContext) * 0.6d);
        this.mRecyclerView = getContentView().findViewById(com.luck.picture.lib.R.id.folder_list);
        this.windMask = getContentView().findViewById(com.luck.picture.lib.R.id.rootViewBg);
        this.mRecyclerView.setLayoutManager(new com.luck.picture.lib.decoration.WrapContentLinearLayoutManager(this.mContext));
        com.luck.picture.lib.adapter.PictureAlbumAdapter pictureAlbumAdapter = new com.luck.picture.lib.adapter.PictureAlbumAdapter(this.selectorConfig);
        this.mAdapter = pictureAlbumAdapter;
        this.mRecyclerView.setAdapter(pictureAlbumAdapter);
        this.windMask.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.dialog.AlbumListPopWindow.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.luck.picture.lib.dialog.AlbumListPopWindow.this.dismiss();
            }
        });
        getContentView().findViewById(com.luck.picture.lib.R.id.rootView).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.luck.picture.lib.dialog.AlbumListPopWindow.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.luck.picture.lib.utils.SdkVersionUtils.isMinM()) {
                    com.luck.picture.lib.dialog.AlbumListPopWindow.this.dismiss();
                }
            }
        });
    }

    public void bindAlbumData(java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> list) {
        this.mAdapter.bindAlbumData(list);
        this.mAdapter.notifyDataSetChanged();
        this.mRecyclerView.getLayoutParams().height = list.size() > 8 ? this.windowMaxHeight : -2;
    }

    public java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> getAlbumList() {
        return this.mAdapter.getAlbumList();
    }

    public com.luck.picture.lib.entity.LocalMediaFolder getFolder(int i) {
        if (this.mAdapter.getAlbumList().size() <= 0 || i >= this.mAdapter.getAlbumList().size()) {
            return null;
        }
        return this.mAdapter.getAlbumList().get(i);
    }

    public int getFirstAlbumImageCount() {
        if (getFolderCount() > 0) {
            return getFolder(0).getFolderTotalNum();
        }
        return 0;
    }

    public int getFolderCount() {
        return this.mAdapter.getAlbumList().size();
    }

    public void setOnIBridgeAlbumWidget(com.luck.picture.lib.interfaces.OnAlbumItemClickListener onAlbumItemClickListener) {
        this.mAdapter.setOnIBridgeAlbumWidget(onAlbumItemClickListener);
    }

    public static com.luck.picture.lib.dialog.AlbumListPopWindow buildPopWindow(android.content.Context context, com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        return new com.luck.picture.lib.dialog.AlbumListPopWindow(context, selectorConfig);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view) {
        if (getAlbumList() == null || getAlbumList().size() == 0) {
            return;
        }
        if (com.luck.picture.lib.utils.SdkVersionUtils.isN()) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            showAtLocation(view, 0, 0, iArr[1] + view.getHeight());
        } else {
            super.showAsDropDown(view);
        }
        this.isDismiss = false;
        com.luck.picture.lib.dialog.AlbumListPopWindow.OnPopupWindowStatusListener onPopupWindowStatusListener = this.windowStatusListener;
        if (onPopupWindowStatusListener != null) {
            onPopupWindowStatusListener.onShowPopupWindow();
        }
        this.windMask.animate().alpha(1.0f).setDuration(250L).setStartDelay(250L).start();
        changeSelectedAlbumStyle();
    }

    public void changeSelectedAlbumStyle() {
        java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> albumList = this.mAdapter.getAlbumList();
        for (int i = 0; i < albumList.size(); i++) {
            com.luck.picture.lib.entity.LocalMediaFolder localMediaFolder = albumList.get(i);
            localMediaFolder.setSelectTag(false);
            this.mAdapter.notifyItemChanged(i);
            for (int i2 = 0; i2 < this.selectorConfig.getSelectCount(); i2++) {
                if (android.text.TextUtils.equals(localMediaFolder.getFolderName(), this.selectorConfig.getSelectedResult().get(i2).getParentFolderName()) || localMediaFolder.getBucketId() == -1) {
                    localMediaFolder.setSelectTag(true);
                    this.mAdapter.notifyItemChanged(i);
                    break;
                }
            }
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (this.isDismiss) {
            return;
        }
        this.windMask.setAlpha(0.0f);
        com.luck.picture.lib.dialog.AlbumListPopWindow.OnPopupWindowStatusListener onPopupWindowStatusListener = this.windowStatusListener;
        if (onPopupWindowStatusListener != null) {
            onPopupWindowStatusListener.onDismissPopupWindow();
        }
        this.isDismiss = true;
        this.windMask.post(new java.lang.Runnable() { // from class: com.luck.picture.lib.dialog.AlbumListPopWindow.3
            @Override // java.lang.Runnable
            public void run() {
                com.luck.picture.lib.dialog.AlbumListPopWindow.super.dismiss();
                com.luck.picture.lib.dialog.AlbumListPopWindow.this.isDismiss = false;
            }
        });
    }

    public void setOnPopupWindowStatusListener(com.luck.picture.lib.dialog.AlbumListPopWindow.OnPopupWindowStatusListener onPopupWindowStatusListener) {
        this.windowStatusListener = onPopupWindowStatusListener;
    }
}
