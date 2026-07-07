package com.bumptech.glide.module;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class AppGlideModule extends com.bumptech.glide.module.LibraryGlideModule implements com.bumptech.glide.module.AppliesOptions {
    @Override // com.bumptech.glide.module.AppliesOptions
    public void applyOptions(android.content.Context context, com.bumptech.glide.GlideBuilder glideBuilder) {
    }

    public boolean isManifestParsingEnabled() {
        return true;
    }
}
