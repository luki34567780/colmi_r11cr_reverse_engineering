package coil;

/* compiled from: ImageLoader.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u001dJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcoil/ImageLoader;", "", "components", "Lcoil/ComponentRegistry;", "getComponents", "()Lcoil/ComponentRegistry;", "defaults", "Lcoil/request/DefaultRequestOptions;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "diskCache", "Lcoil/disk/DiskCache;", "getDiskCache", "()Lcoil/disk/DiskCache;", "memoryCache", "Lcoil/memory/MemoryCache;", "getMemoryCache", "()Lcoil/memory/MemoryCache;", "enqueue", "Lcoil/request/Disposable;", "request", "Lcoil/request/ImageRequest;", "execute", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newBuilder", "Lcoil/ImageLoader$Builder;", "shutdown", "", "Builder", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ImageLoader {
    coil.request.Disposable enqueue(coil.request.ImageRequest request);

    java.lang.Object execute(coil.request.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil.request.ImageResult> continuation);

    coil.ComponentRegistry getComponents();

    coil.request.DefaultRequestOptions getDefaults();

    coil.disk.DiskCache getDiskCache();

    coil.memory.MemoryCache getMemoryCache();

    coil.ImageLoader.Builder newBuilder();

    void shutdown();

    /* compiled from: ImageLoader.kt */
    @kotlin.Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010 \u001a\u00020!H\u0007J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020(J\u0014\u0010\t\u001a\u00020\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0*J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\rH\u0007J!\u0010\f\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-¢\u0006\u0002\b0H\u0007J\u000e\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020\rJ\"\u00101\u001a\u00020\u00002\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-¢\u0006\u0002\b0H\u0086\bJ\u000e\u00102\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020&J\u000e\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u000206J\u0016\u0010\u0010\u001a\u00020\u00002\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110*J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u000209J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u000206J\u0010\u0010:\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010<J\u0010\u0010:\u001a\u00020\u00002\b\b\u0001\u0010=\u001a\u00020&J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020@J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0013J\u0010\u0010B\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010<J\u0010\u0010B\u001a\u00020\u00002\b\b\u0001\u0010=\u001a\u00020&J\u000e\u0010C\u001a\u00020\u00002\u0006\u00105\u001a\u000206J\u000e\u0010D\u001a\u00020\u00002\u0006\u00105\u001a\u000206J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0016\u0010\u0016\u001a\u00020\u00002\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170*J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u0010F\u001a\u00020\u00002\u0006\u00108\u001a\u000209J\u000e\u0010G\u001a\u00020\u00002\u0006\u00108\u001a\u000209J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010I\u001a\u00020\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00020J0*J\u000e\u0010I\u001a\u00020\u00002\u0006\u0010I\u001a\u00020JJ\u0010\u0010K\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010<J\u0010\u0010K\u001a\u00020\u00002\b\b\u0001\u0010=\u001a\u00020&J\u000e\u0010L\u001a\u00020\u00002\u0006\u0010L\u001a\u00020MJ\u000e\u0010N\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010O\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u000e\u0010P\u001a\u00020\u00002\u0006\u00105\u001a\u000206J\u0010\u0010Q\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020RH\u0007J\u000e\u0010S\u001a\u00020\u00002\u0006\u0010A\u001a\u00020TR\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcoil/ImageLoader$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "imageLoader", "Lcoil/RealImageLoader;", "(Lcoil/RealImageLoader;)V", "applicationContext", "callFactory", "Lkotlin/Lazy;", "Lokhttp3/Call$Factory;", "componentRegistry", "Lcoil/ComponentRegistry;", "defaults", "Lcoil/request/DefaultRequestOptions;", "diskCache", "Lcoil/disk/DiskCache;", "eventListenerFactory", "Lcoil/EventListener$Factory;", "logger", "Lcoil/util/Logger;", "memoryCache", "Lcoil/memory/MemoryCache;", "options", "Lcoil/util/ImageLoaderOptions;", "addLastModifiedToFileCacheKey", "enable", "", "allowHardware", "allowRgb565", "availableMemoryPercentage", "percent", "", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "bitmapFactoryMaxParallelism", "maxParallelism", "", "build", "Lcoil/ImageLoader;", "initializer", "Lkotlin/Function0;", "registry", "builder", "Lkotlin/Function1;", "Lcoil/ComponentRegistry$Builder;", "", "Lkotlin/ExtensionFunctionType;", "components", "crossfade", "durationMillis", "decoderDispatcher", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "diskCachePolicy", "policy", "Lcoil/request/CachePolicy;", "error", "drawable", "Landroid/graphics/drawable/Drawable;", "drawableResId", "eventListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/EventListener;", "factory", "fallback", "fetcherDispatcher", "interceptorDispatcher", "launchInterceptorChainOnMainThread", "memoryCachePolicy", "networkCachePolicy", "networkObserverEnabled", "okHttpClient", "Lokhttp3/OkHttpClient;", "placeholder", "precision", "Lcoil/size/Precision;", "respectCacheHeaders", "trackWeakReferences", "transformationDispatcher", "transition", "Lcoil/transition/Transition;", "transitionFactory", "Lcoil/transition/Transition$Factory;", "coil-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        private final android.content.Context applicationContext;
        private kotlin.Lazy<? extends okhttp3.Call.Factory> callFactory;
        private coil.ComponentRegistry componentRegistry;
        private coil.request.DefaultRequestOptions defaults;
        private kotlin.Lazy<? extends coil.disk.DiskCache> diskCache;
        private coil.EventListener.Factory eventListenerFactory;
        private coil.util.Logger logger;
        private kotlin.Lazy<? extends coil.memory.MemoryCache> memoryCache;
        private coil.util.ImageLoaderOptions options;

        public Builder(android.content.Context context) {
            this.applicationContext = context.getApplicationContext();
            this.defaults = coil.util.Requests.getDEFAULT_REQUEST_OPTIONS();
            this.memoryCache = null;
            this.diskCache = null;
            this.callFactory = null;
            this.eventListenerFactory = null;
            this.componentRegistry = null;
            this.options = new coil.util.ImageLoaderOptions(false, false, false, 0, 15, null);
            this.logger = null;
        }

        public Builder(coil.RealImageLoader realImageLoader) {
            this.applicationContext = realImageLoader.getContext().getApplicationContext();
            this.defaults = realImageLoader.getDefaults();
            this.memoryCache = realImageLoader.getMemoryCacheLazy();
            this.diskCache = realImageLoader.getDiskCacheLazy();
            this.callFactory = realImageLoader.getCallFactoryLazy();
            this.eventListenerFactory = realImageLoader.getEventListenerFactory();
            this.componentRegistry = realImageLoader.getComponentRegistry();
            this.options = realImageLoader.getOptions();
            this.logger = realImageLoader.getLogger();
        }

        public final coil.ImageLoader.Builder okHttpClient(okhttp3.OkHttpClient okHttpClient) {
            return callFactory(okHttpClient);
        }

        public final coil.ImageLoader.Builder okHttpClient(kotlin.jvm.functions.Function0<? extends okhttp3.OkHttpClient> initializer) {
            return callFactory(initializer);
        }

        public final coil.ImageLoader.Builder callFactory(okhttp3.Call.Factory callFactory) {
            this.callFactory = kotlin.LazyKt.lazyOf(callFactory);
            return this;
        }

        public final coil.ImageLoader.Builder callFactory(kotlin.jvm.functions.Function0<? extends okhttp3.Call.Factory> initializer) {
            this.callFactory = kotlin.LazyKt.lazy(initializer);
            return this;
        }

        public final /* synthetic */ coil.ImageLoader.Builder components(kotlin.jvm.functions.Function1<? super coil.ComponentRegistry.Builder, kotlin.Unit> builder) {
            coil.ComponentRegistry.Builder builder2 = new coil.ComponentRegistry.Builder();
            builder.invoke(builder2);
            return components(builder2.build());
        }

        public final coil.ImageLoader.Builder components(coil.ComponentRegistry components) {
            this.componentRegistry = components;
            return this;
        }

        public final coil.ImageLoader.Builder memoryCache(coil.memory.MemoryCache memoryCache) {
            this.memoryCache = kotlin.LazyKt.lazyOf(memoryCache);
            return this;
        }

        public final coil.ImageLoader.Builder memoryCache(kotlin.jvm.functions.Function0<? extends coil.memory.MemoryCache> initializer) {
            this.memoryCache = kotlin.LazyKt.lazy(initializer);
            return this;
        }

        public final coil.ImageLoader.Builder diskCache(coil.disk.DiskCache diskCache) {
            this.diskCache = kotlin.LazyKt.lazyOf(diskCache);
            return this;
        }

        public final coil.ImageLoader.Builder diskCache(kotlin.jvm.functions.Function0<? extends coil.disk.DiskCache> initializer) {
            this.diskCache = kotlin.LazyKt.lazy(initializer);
            return this;
        }

        public final coil.ImageLoader.Builder allowHardware(boolean enable) {
            coil.request.DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.interceptorDispatcher : null, (r32 & 2) != 0 ? r1.fetcherDispatcher : null, (r32 & 4) != 0 ? r1.decoderDispatcher : null, (r32 & 8) != 0 ? r1.transformationDispatcher : null, (r32 & 16) != 0 ? r1.transitionFactory : null, (r32 & 32) != 0 ? r1.precision : null, (r32 & 64) != 0 ? r1.bitmapConfig : null, (r32 & 128) != 0 ? r1.allowHardware : enable, (r32 & 256) != 0 ? r1.allowRgb565 : false, (r32 & 512) != 0 ? r1.placeholder : null, (r32 & 1024) != 0 ? r1.error : null, (r32 & 2048) != 0 ? r1.fallback : null, (r32 & 4096) != 0 ? r1.memoryCachePolicy : null, (r32 & 8192) != 0 ? r1.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder allowRgb565(boolean enable) {
            coil.request.DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.interceptorDispatcher : null, (r32 & 2) != 0 ? r1.fetcherDispatcher : null, (r32 & 4) != 0 ? r1.decoderDispatcher : null, (r32 & 8) != 0 ? r1.transformationDispatcher : null, (r32 & 16) != 0 ? r1.transitionFactory : null, (r32 & 32) != 0 ? r1.precision : null, (r32 & 64) != 0 ? r1.bitmapConfig : null, (r32 & 128) != 0 ? r1.allowHardware : false, (r32 & 256) != 0 ? r1.allowRgb565 : enable, (r32 & 512) != 0 ? r1.placeholder : null, (r32 & 1024) != 0 ? r1.error : null, (r32 & 2048) != 0 ? r1.fallback : null, (r32 & 4096) != 0 ? r1.memoryCachePolicy : null, (r32 & 8192) != 0 ? r1.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder addLastModifiedToFileCacheKey(boolean enable) {
            this.options = coil.util.ImageLoaderOptions.copy$default(this.options, enable, false, false, 0, 14, null);
            return this;
        }

        public final coil.ImageLoader.Builder networkObserverEnabled(boolean enable) {
            this.options = coil.util.ImageLoaderOptions.copy$default(this.options, false, enable, false, 0, 13, null);
            return this;
        }

        public final coil.ImageLoader.Builder respectCacheHeaders(boolean enable) {
            this.options = coil.util.ImageLoaderOptions.copy$default(this.options, false, false, enable, 0, 11, null);
            return this;
        }

        public final coil.ImageLoader.Builder bitmapFactoryMaxParallelism(int maxParallelism) {
            if (!(maxParallelism > 0)) {
                throw new java.lang.IllegalArgumentException("maxParallelism must be > 0.".toString());
            }
            this.options = coil.util.ImageLoaderOptions.copy$default(this.options, false, false, false, maxParallelism, 7, null);
            return this;
        }

        public final coil.ImageLoader.Builder eventListener(final coil.EventListener listener) {
            return eventListenerFactory(new coil.EventListener.Factory() { // from class: coil.ImageLoader$Builder$eventListener$1
                @Override // coil.EventListener.Factory
                public final coil.EventListener create(coil.request.ImageRequest imageRequest) {
                    return coil.EventListener.this;
                }
            });
        }

        public final coil.ImageLoader.Builder eventListenerFactory(coil.EventListener.Factory factory) {
            this.eventListenerFactory = factory;
            return this;
        }

        public final coil.ImageLoader.Builder crossfade(boolean enable) {
            return crossfade(enable ? 100 : 0);
        }

        public final coil.ImageLoader.Builder crossfade(int durationMillis) {
            coil.transition.CrossfadeTransition.Factory factory;
            if (durationMillis > 0) {
                factory = new coil.transition.CrossfadeTransition.Factory(durationMillis, false, 2, null);
            } else {
                factory = coil.transition.Transition.Factory.NONE;
            }
            transitionFactory(factory);
            return this;
        }

        public final coil.ImageLoader.Builder transitionFactory(coil.transition.Transition.Factory factory) {
            coil.request.DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.interceptorDispatcher : null, (r32 & 2) != 0 ? r1.fetcherDispatcher : null, (r32 & 4) != 0 ? r1.decoderDispatcher : null, (r32 & 8) != 0 ? r1.transformationDispatcher : null, (r32 & 16) != 0 ? r1.transitionFactory : factory, (r32 & 32) != 0 ? r1.precision : null, (r32 & 64) != 0 ? r1.bitmapConfig : null, (r32 & 128) != 0 ? r1.allowHardware : false, (r32 & 256) != 0 ? r1.allowRgb565 : false, (r32 & 512) != 0 ? r1.placeholder : null, (r32 & 1024) != 0 ? r1.error : null, (r32 & 2048) != 0 ? r1.fallback : null, (r32 & 4096) != 0 ? r1.memoryCachePolicy : null, (r32 & 8192) != 0 ? r1.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder precision(coil.size.Precision precision) {
            coil.request.DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.interceptorDispatcher : null, (r32 & 2) != 0 ? r1.fetcherDispatcher : null, (r32 & 4) != 0 ? r1.decoderDispatcher : null, (r32 & 8) != 0 ? r1.transformationDispatcher : null, (r32 & 16) != 0 ? r1.transitionFactory : null, (r32 & 32) != 0 ? r1.precision : precision, (r32 & 64) != 0 ? r1.bitmapConfig : null, (r32 & 128) != 0 ? r1.allowHardware : false, (r32 & 256) != 0 ? r1.allowRgb565 : false, (r32 & 512) != 0 ? r1.placeholder : null, (r32 & 1024) != 0 ? r1.error : null, (r32 & 2048) != 0 ? r1.fallback : null, (r32 & 4096) != 0 ? r1.memoryCachePolicy : null, (r32 & 8192) != 0 ? r1.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder bitmapConfig(android.graphics.Bitmap.Config bitmapConfig) {
            coil.request.DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.interceptorDispatcher : null, (r32 & 2) != 0 ? r1.fetcherDispatcher : null, (r32 & 4) != 0 ? r1.decoderDispatcher : null, (r32 & 8) != 0 ? r1.transformationDispatcher : null, (r32 & 16) != 0 ? r1.transitionFactory : null, (r32 & 32) != 0 ? r1.precision : null, (r32 & 64) != 0 ? r1.bitmapConfig : bitmapConfig, (r32 & 128) != 0 ? r1.allowHardware : false, (r32 & 256) != 0 ? r1.allowRgb565 : false, (r32 & 512) != 0 ? r1.placeholder : null, (r32 & 1024) != 0 ? r1.error : null, (r32 & 2048) != 0 ? r1.fallback : null, (r32 & 4096) != 0 ? r1.memoryCachePolicy : null, (r32 & 8192) != 0 ? r1.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder dispatcher(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
            coil.request.DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.interceptorDispatcher : null, (r32 & 2) != 0 ? r1.fetcherDispatcher : dispatcher, (r32 & 4) != 0 ? r1.decoderDispatcher : dispatcher, (r32 & 8) != 0 ? r1.transformationDispatcher : dispatcher, (r32 & 16) != 0 ? r1.transitionFactory : null, (r32 & 32) != 0 ? r1.precision : null, (r32 & 64) != 0 ? r1.bitmapConfig : null, (r32 & 128) != 0 ? r1.allowHardware : false, (r32 & 256) != 0 ? r1.allowRgb565 : false, (r32 & 512) != 0 ? r1.placeholder : null, (r32 & 1024) != 0 ? r1.error : null, (r32 & 2048) != 0 ? r1.fallback : null, (r32 & 4096) != 0 ? r1.memoryCachePolicy : null, (r32 & 8192) != 0 ? r1.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder interceptorDispatcher(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
            coil.request.DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.interceptorDispatcher : dispatcher, (r32 & 2) != 0 ? r1.fetcherDispatcher : null, (r32 & 4) != 0 ? r1.decoderDispatcher : null, (r32 & 8) != 0 ? r1.transformationDispatcher : null, (r32 & 16) != 0 ? r1.transitionFactory : null, (r32 & 32) != 0 ? r1.precision : null, (r32 & 64) != 0 ? r1.bitmapConfig : null, (r32 & 128) != 0 ? r1.allowHardware : false, (r32 & 256) != 0 ? r1.allowRgb565 : false, (r32 & 512) != 0 ? r1.placeholder : null, (r32 & 1024) != 0 ? r1.error : null, (r32 & 2048) != 0 ? r1.fallback : null, (r32 & 4096) != 0 ? r1.memoryCachePolicy : null, (r32 & 8192) != 0 ? r1.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder fetcherDispatcher(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
            coil.request.DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.interceptorDispatcher : null, (r32 & 2) != 0 ? r1.fetcherDispatcher : dispatcher, (r32 & 4) != 0 ? r1.decoderDispatcher : null, (r32 & 8) != 0 ? r1.transformationDispatcher : null, (r32 & 16) != 0 ? r1.transitionFactory : null, (r32 & 32) != 0 ? r1.precision : null, (r32 & 64) != 0 ? r1.bitmapConfig : null, (r32 & 128) != 0 ? r1.allowHardware : false, (r32 & 256) != 0 ? r1.allowRgb565 : false, (r32 & 512) != 0 ? r1.placeholder : null, (r32 & 1024) != 0 ? r1.error : null, (r32 & 2048) != 0 ? r1.fallback : null, (r32 & 4096) != 0 ? r1.memoryCachePolicy : null, (r32 & 8192) != 0 ? r1.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder decoderDispatcher(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
            coil.request.DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.interceptorDispatcher : null, (r32 & 2) != 0 ? r1.fetcherDispatcher : null, (r32 & 4) != 0 ? r1.decoderDispatcher : dispatcher, (r32 & 8) != 0 ? r1.transformationDispatcher : null, (r32 & 16) != 0 ? r1.transitionFactory : null, (r32 & 32) != 0 ? r1.precision : null, (r32 & 64) != 0 ? r1.bitmapConfig : null, (r32 & 128) != 0 ? r1.allowHardware : false, (r32 & 256) != 0 ? r1.allowRgb565 : false, (r32 & 512) != 0 ? r1.placeholder : null, (r32 & 1024) != 0 ? r1.error : null, (r32 & 2048) != 0 ? r1.fallback : null, (r32 & 4096) != 0 ? r1.memoryCachePolicy : null, (r32 & 8192) != 0 ? r1.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder transformationDispatcher(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
            coil.request.DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.interceptorDispatcher : null, (r32 & 2) != 0 ? r1.fetcherDispatcher : null, (r32 & 4) != 0 ? r1.decoderDispatcher : null, (r32 & 8) != 0 ? r1.transformationDispatcher : dispatcher, (r32 & 16) != 0 ? r1.transitionFactory : null, (r32 & 32) != 0 ? r1.precision : null, (r32 & 64) != 0 ? r1.bitmapConfig : null, (r32 & 128) != 0 ? r1.allowHardware : false, (r32 & 256) != 0 ? r1.allowRgb565 : false, (r32 & 512) != 0 ? r1.placeholder : null, (r32 & 1024) != 0 ? r1.error : null, (r32 & 2048) != 0 ? r1.fallback : null, (r32 & 4096) != 0 ? r1.memoryCachePolicy : null, (r32 & 8192) != 0 ? r1.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder placeholder(int drawableResId) {
            return placeholder(coil.util.Contexts.getDrawableCompat(this.applicationContext, drawableResId));
        }

        public final coil.ImageLoader.Builder placeholder(android.graphics.drawable.Drawable drawable) {
            coil.request.DefaultRequestOptions copy;
            copy = r2.copy((r32 & 1) != 0 ? r2.interceptorDispatcher : null, (r32 & 2) != 0 ? r2.fetcherDispatcher : null, (r32 & 4) != 0 ? r2.decoderDispatcher : null, (r32 & 8) != 0 ? r2.transformationDispatcher : null, (r32 & 16) != 0 ? r2.transitionFactory : null, (r32 & 32) != 0 ? r2.precision : null, (r32 & 64) != 0 ? r2.bitmapConfig : null, (r32 & 128) != 0 ? r2.allowHardware : false, (r32 & 256) != 0 ? r2.allowRgb565 : false, (r32 & 512) != 0 ? r2.placeholder : drawable == null ? null : drawable.mutate(), (r32 & 1024) != 0 ? r2.error : null, (r32 & 2048) != 0 ? r2.fallback : null, (r32 & 4096) != 0 ? r2.memoryCachePolicy : null, (r32 & 8192) != 0 ? r2.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder error(int drawableResId) {
            return error(coil.util.Contexts.getDrawableCompat(this.applicationContext, drawableResId));
        }

        public final coil.ImageLoader.Builder error(android.graphics.drawable.Drawable drawable) {
            coil.request.DefaultRequestOptions copy;
            copy = r2.copy((r32 & 1) != 0 ? r2.interceptorDispatcher : null, (r32 & 2) != 0 ? r2.fetcherDispatcher : null, (r32 & 4) != 0 ? r2.decoderDispatcher : null, (r32 & 8) != 0 ? r2.transformationDispatcher : null, (r32 & 16) != 0 ? r2.transitionFactory : null, (r32 & 32) != 0 ? r2.precision : null, (r32 & 64) != 0 ? r2.bitmapConfig : null, (r32 & 128) != 0 ? r2.allowHardware : false, (r32 & 256) != 0 ? r2.allowRgb565 : false, (r32 & 512) != 0 ? r2.placeholder : null, (r32 & 1024) != 0 ? r2.error : drawable == null ? null : drawable.mutate(), (r32 & 2048) != 0 ? r2.fallback : null, (r32 & 4096) != 0 ? r2.memoryCachePolicy : null, (r32 & 8192) != 0 ? r2.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder fallback(int drawableResId) {
            return fallback(coil.util.Contexts.getDrawableCompat(this.applicationContext, drawableResId));
        }

        public final coil.ImageLoader.Builder fallback(android.graphics.drawable.Drawable drawable) {
            coil.request.DefaultRequestOptions copy;
            copy = r2.copy((r32 & 1) != 0 ? r2.interceptorDispatcher : null, (r32 & 2) != 0 ? r2.fetcherDispatcher : null, (r32 & 4) != 0 ? r2.decoderDispatcher : null, (r32 & 8) != 0 ? r2.transformationDispatcher : null, (r32 & 16) != 0 ? r2.transitionFactory : null, (r32 & 32) != 0 ? r2.precision : null, (r32 & 64) != 0 ? r2.bitmapConfig : null, (r32 & 128) != 0 ? r2.allowHardware : false, (r32 & 256) != 0 ? r2.allowRgb565 : false, (r32 & 512) != 0 ? r2.placeholder : null, (r32 & 1024) != 0 ? r2.error : null, (r32 & 2048) != 0 ? r2.fallback : drawable == null ? null : drawable.mutate(), (r32 & 4096) != 0 ? r2.memoryCachePolicy : null, (r32 & 8192) != 0 ? r2.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder memoryCachePolicy(coil.request.CachePolicy policy) {
            coil.request.DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.interceptorDispatcher : null, (r32 & 2) != 0 ? r1.fetcherDispatcher : null, (r32 & 4) != 0 ? r1.decoderDispatcher : null, (r32 & 8) != 0 ? r1.transformationDispatcher : null, (r32 & 16) != 0 ? r1.transitionFactory : null, (r32 & 32) != 0 ? r1.precision : null, (r32 & 64) != 0 ? r1.bitmapConfig : null, (r32 & 128) != 0 ? r1.allowHardware : false, (r32 & 256) != 0 ? r1.allowRgb565 : false, (r32 & 512) != 0 ? r1.placeholder : null, (r32 & 1024) != 0 ? r1.error : null, (r32 & 2048) != 0 ? r1.fallback : null, (r32 & 4096) != 0 ? r1.memoryCachePolicy : policy, (r32 & 8192) != 0 ? r1.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder diskCachePolicy(coil.request.CachePolicy policy) {
            coil.request.DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.interceptorDispatcher : null, (r32 & 2) != 0 ? r1.fetcherDispatcher : null, (r32 & 4) != 0 ? r1.decoderDispatcher : null, (r32 & 8) != 0 ? r1.transformationDispatcher : null, (r32 & 16) != 0 ? r1.transitionFactory : null, (r32 & 32) != 0 ? r1.precision : null, (r32 & 64) != 0 ? r1.bitmapConfig : null, (r32 & 128) != 0 ? r1.allowHardware : false, (r32 & 256) != 0 ? r1.allowRgb565 : false, (r32 & 512) != 0 ? r1.placeholder : null, (r32 & 1024) != 0 ? r1.error : null, (r32 & 2048) != 0 ? r1.fallback : null, (r32 & 4096) != 0 ? r1.memoryCachePolicy : null, (r32 & 8192) != 0 ? r1.diskCachePolicy : policy, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : null);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder networkCachePolicy(coil.request.CachePolicy policy) {
            coil.request.DefaultRequestOptions copy;
            copy = r1.copy((r32 & 1) != 0 ? r1.interceptorDispatcher : null, (r32 & 2) != 0 ? r1.fetcherDispatcher : null, (r32 & 4) != 0 ? r1.decoderDispatcher : null, (r32 & 8) != 0 ? r1.transformationDispatcher : null, (r32 & 16) != 0 ? r1.transitionFactory : null, (r32 & 32) != 0 ? r1.precision : null, (r32 & 64) != 0 ? r1.bitmapConfig : null, (r32 & 128) != 0 ? r1.allowHardware : false, (r32 & 256) != 0 ? r1.allowRgb565 : false, (r32 & 512) != 0 ? r1.placeholder : null, (r32 & 1024) != 0 ? r1.error : null, (r32 & 2048) != 0 ? r1.fallback : null, (r32 & 4096) != 0 ? r1.memoryCachePolicy : null, (r32 & 8192) != 0 ? r1.diskCachePolicy : null, (r32 & 16384) != 0 ? this.defaults.networkCachePolicy : policy);
            this.defaults = copy;
            return this;
        }

        public final coil.ImageLoader.Builder logger(coil.util.Logger logger) {
            this.logger = logger;
            return this;
        }

        public final coil.ImageLoader build() {
            android.content.Context context = this.applicationContext;
            coil.request.DefaultRequestOptions defaultRequestOptions = this.defaults;
            kotlin.Lazy<? extends coil.memory.MemoryCache> lazy = this.memoryCache;
            if (lazy == null) {
                lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<coil.memory.MemoryCache>() { // from class: coil.ImageLoader$Builder$build$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final coil.memory.MemoryCache invoke() {
                        android.content.Context context2;
                        context2 = coil.ImageLoader.Builder.this.applicationContext;
                        return new coil.memory.MemoryCache.Builder(context2).build();
                    }
                });
            }
            kotlin.Lazy<? extends coil.memory.MemoryCache> lazy2 = lazy;
            kotlin.Lazy<? extends coil.disk.DiskCache> lazy3 = this.diskCache;
            if (lazy3 == null) {
                lazy3 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<coil.disk.DiskCache>() { // from class: coil.ImageLoader$Builder$build$2
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final coil.disk.DiskCache invoke() {
                        android.content.Context context2;
                        coil.util.SingletonDiskCache singletonDiskCache = coil.util.SingletonDiskCache.INSTANCE;
                        context2 = coil.ImageLoader.Builder.this.applicationContext;
                        return singletonDiskCache.get(context2);
                    }
                });
            }
            kotlin.Lazy<? extends coil.disk.DiskCache> lazy4 = lazy3;
            kotlin.Lazy<? extends okhttp3.Call.Factory> lazy5 = this.callFactory;
            if (lazy5 == null) {
                lazy5 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<okhttp3.OkHttpClient>() { // from class: coil.ImageLoader$Builder$build$3
                    @Override // kotlin.jvm.functions.Function0
                    public final okhttp3.OkHttpClient invoke() {
                        return new okhttp3.OkHttpClient();
                    }
                });
            }
            kotlin.Lazy<? extends okhttp3.Call.Factory> lazy6 = lazy5;
            coil.EventListener.Factory factory = this.eventListenerFactory;
            if (factory == null) {
                factory = coil.EventListener.Factory.NONE;
            }
            coil.EventListener.Factory factory2 = factory;
            coil.ComponentRegistry componentRegistry = this.componentRegistry;
            if (componentRegistry == null) {
                componentRegistry = new coil.ComponentRegistry();
            }
            return new coil.RealImageLoader(context, defaultRequestOptions, lazy2, lazy4, lazy6, factory2, componentRegistry, this.options, this.logger);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Migrate to 'memoryCache'.", replaceWith = @kotlin.ReplaceWith(expression = "memoryCache { MemoryCache.Builder(context).maxSizePercent(percent).build() }", imports = {"coil.memory.MemoryCache"}))
        public final coil.ImageLoader.Builder availableMemoryPercentage(double percent) {
            coil.util.Utils.unsupported();
            throw new kotlin.KotlinNothingValueException();
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Migrate to 'memoryCache'.", replaceWith = @kotlin.ReplaceWith(expression = "memoryCache { MemoryCache.Builder(context).weakReferencesEnabled(enable).build() }", imports = {"coil.memory.MemoryCache"}))
        public final coil.ImageLoader.Builder trackWeakReferences(boolean enable) {
            coil.util.Utils.unsupported();
            throw new kotlin.KotlinNothingValueException();
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Migrate to 'interceptorDispatcher'.", replaceWith = @kotlin.ReplaceWith(expression = "interceptorDispatcher(if (enable) Dispatchers.Main.immediate else Dispatchers.IO)", imports = {"kotlinx.coroutines.Dispatchers"}))
        public final coil.ImageLoader.Builder launchInterceptorChainOnMainThread(boolean enable) {
            coil.util.Utils.unsupported();
            throw new kotlin.KotlinNothingValueException();
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Replace with 'components'.", replaceWith = @kotlin.ReplaceWith(expression = "components(builder)", imports = {}))
        public final /* synthetic */ coil.ImageLoader.Builder componentRegistry(kotlin.jvm.functions.Function1 builder) {
            coil.util.Utils.unsupported();
            throw new kotlin.KotlinNothingValueException();
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Replace with 'components'.", replaceWith = @kotlin.ReplaceWith(expression = "components(registry)", imports = {}))
        public final coil.ImageLoader.Builder componentRegistry(coil.ComponentRegistry registry) {
            coil.util.Utils.unsupported();
            throw new kotlin.KotlinNothingValueException();
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Migrate to 'transitionFactory'.", replaceWith = @kotlin.ReplaceWith(expression = "transitionFactory { _, _ -> transition }", imports = {}))
        public final coil.ImageLoader.Builder transition(coil.transition.Transition transition) {
            coil.util.Utils.unsupported();
            throw new kotlin.KotlinNothingValueException();
        }
    }
}
