package com.luck.picture.lib.style;

/* loaded from: /tmp/dex/classes2.dex */
public class PictureSelectorStyle {
    private com.luck.picture.lib.style.AlbumWindowStyle albumWindowStyle;
    private com.luck.picture.lib.style.BottomNavBarStyle bottomBarStyle;
    private com.luck.picture.lib.style.SelectMainStyle selectMainStyle;
    private com.luck.picture.lib.style.TitleBarStyle titleBarStyle;
    private com.luck.picture.lib.style.PictureWindowAnimationStyle windowAnimationStyle;

    public com.luck.picture.lib.style.TitleBarStyle getTitleBarStyle() {
        com.luck.picture.lib.style.TitleBarStyle titleBarStyle = this.titleBarStyle;
        return titleBarStyle == null ? new com.luck.picture.lib.style.TitleBarStyle() : titleBarStyle;
    }

    public void setTitleBarStyle(com.luck.picture.lib.style.TitleBarStyle titleBarStyle) {
        this.titleBarStyle = titleBarStyle;
    }

    public com.luck.picture.lib.style.SelectMainStyle getSelectMainStyle() {
        com.luck.picture.lib.style.SelectMainStyle selectMainStyle = this.selectMainStyle;
        return selectMainStyle == null ? new com.luck.picture.lib.style.SelectMainStyle() : selectMainStyle;
    }

    public void setSelectMainStyle(com.luck.picture.lib.style.SelectMainStyle selectMainStyle) {
        this.selectMainStyle = selectMainStyle;
    }

    public com.luck.picture.lib.style.BottomNavBarStyle getBottomBarStyle() {
        com.luck.picture.lib.style.BottomNavBarStyle bottomNavBarStyle = this.bottomBarStyle;
        return bottomNavBarStyle == null ? new com.luck.picture.lib.style.BottomNavBarStyle() : bottomNavBarStyle;
    }

    public void setBottomBarStyle(com.luck.picture.lib.style.BottomNavBarStyle bottomNavBarStyle) {
        this.bottomBarStyle = bottomNavBarStyle;
    }

    public com.luck.picture.lib.style.PictureWindowAnimationStyle getWindowAnimationStyle() {
        if (this.windowAnimationStyle == null) {
            this.windowAnimationStyle = com.luck.picture.lib.style.PictureWindowAnimationStyle.ofDefaultWindowAnimationStyle();
        }
        return this.windowAnimationStyle;
    }

    public void setWindowAnimationStyle(com.luck.picture.lib.style.PictureWindowAnimationStyle pictureWindowAnimationStyle) {
        this.windowAnimationStyle = pictureWindowAnimationStyle;
    }

    public com.luck.picture.lib.style.AlbumWindowStyle getAlbumWindowStyle() {
        com.luck.picture.lib.style.AlbumWindowStyle albumWindowStyle = this.albumWindowStyle;
        return albumWindowStyle == null ? new com.luck.picture.lib.style.AlbumWindowStyle() : albumWindowStyle;
    }

    public void setAlbumWindowStyle(com.luck.picture.lib.style.AlbumWindowStyle albumWindowStyle) {
        this.albumWindowStyle = albumWindowStyle;
    }
}
