package com.qcwireless.qcwatch.base.glide;

/* loaded from: /tmp/dex/classes2.dex */
public class MyGlideAppModule extends com.bumptech.glide.module.AppGlideModule {
    @Override // com.bumptech.glide.module.LibraryGlideModule, com.bumptech.glide.module.RegistersComponents
    public void registerComponents(android.content.Context context, com.bumptech.glide.Glide glide, com.bumptech.glide.Registry registry) {
        glide.getRegistry().replace(com.bumptech.glide.load.model.GlideUrl.class, java.io.InputStream.class, new com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader.Factory(new okhttp3.OkHttpClient.Builder().connectTimeout(120L, java.util.concurrent.TimeUnit.SECONDS).readTimeout(120L, java.util.concurrent.TimeUnit.SECONDS).writeTimeout(120L, java.util.concurrent.TimeUnit.SECONDS).build()));
    }

    @Override // com.bumptech.glide.module.AppGlideModule, com.bumptech.glide.module.AppliesOptions
    public void applyOptions(android.content.Context context, com.bumptech.glide.GlideBuilder builder) {
        super.applyOptions(context, builder);
        long j = 104857600;
        builder.setMemoryCache(new com.bumptech.glide.load.engine.cache.LruResourceCache(j));
        builder.setDiskCache(new com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory(context, j));
    }
}
