package com.airbnb.lottie;

/* loaded from: classes.dex */
public class LottieComposition {
    private android.graphics.Rect bounds;
    private androidx.collection.SparseArrayCompat<com.airbnb.lottie.model.FontCharacter> characters;
    private float endFrame;
    private java.util.Map<java.lang.String, com.airbnb.lottie.model.Font> fonts;
    private float frameRate;
    private boolean hasDashPattern;
    private java.util.Map<java.lang.String, com.airbnb.lottie.LottieImageAsset> images;
    private androidx.collection.LongSparseArray<com.airbnb.lottie.model.layer.Layer> layerMap;
    private java.util.List<com.airbnb.lottie.model.layer.Layer> layers;
    private java.util.List<com.airbnb.lottie.model.Marker> markers;
    private java.util.Map<java.lang.String, java.util.List<com.airbnb.lottie.model.layer.Layer>> precomps;
    private float startFrame;
    private final com.airbnb.lottie.PerformanceTracker performanceTracker = new com.airbnb.lottie.PerformanceTracker();
    private final java.util.HashSet<java.lang.String> warnings = new java.util.HashSet<>();
    private int maskAndMatteCount = 0;

    public void init(android.graphics.Rect rect, float f, float f2, float f3, java.util.List<com.airbnb.lottie.model.layer.Layer> list, androidx.collection.LongSparseArray<com.airbnb.lottie.model.layer.Layer> longSparseArray, java.util.Map<java.lang.String, java.util.List<com.airbnb.lottie.model.layer.Layer>> map, java.util.Map<java.lang.String, com.airbnb.lottie.LottieImageAsset> map2, androidx.collection.SparseArrayCompat<com.airbnb.lottie.model.FontCharacter> sparseArrayCompat, java.util.Map<java.lang.String, com.airbnb.lottie.model.Font> map3, java.util.List<com.airbnb.lottie.model.Marker> list2) {
        this.bounds = rect;
        this.startFrame = f;
        this.endFrame = f2;
        this.frameRate = f3;
        this.layers = list;
        this.layerMap = longSparseArray;
        this.precomps = map;
        this.images = map2;
        this.characters = sparseArrayCompat;
        this.fonts = map3;
        this.markers = list2;
    }

    public void addWarning(java.lang.String str) {
        com.airbnb.lottie.utils.Logger.warning(str);
        this.warnings.add(str);
    }

    public void setHasDashPattern(boolean z) {
        this.hasDashPattern = z;
    }

    public void incrementMatteOrMaskCount(int i) {
        this.maskAndMatteCount += i;
    }

    public boolean hasDashPattern() {
        return this.hasDashPattern;
    }

    public int getMaskAndMatteCount() {
        return this.maskAndMatteCount;
    }

    public java.util.ArrayList<java.lang.String> getWarnings() {
        java.util.HashSet<java.lang.String> hashSet = this.warnings;
        return new java.util.ArrayList<>(java.util.Arrays.asList(hashSet.toArray(new java.lang.String[hashSet.size()])));
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.performanceTracker.setEnabled(z);
    }

    public com.airbnb.lottie.PerformanceTracker getPerformanceTracker() {
        return this.performanceTracker;
    }

    public com.airbnb.lottie.model.layer.Layer layerModelForId(long j) {
        return this.layerMap.get(j);
    }

    public android.graphics.Rect getBounds() {
        return this.bounds;
    }

    public float getDuration() {
        return (long) ((getDurationFrames() / this.frameRate) * 1000.0f);
    }

    public float getStartFrame() {
        return this.startFrame;
    }

    public float getEndFrame() {
        return this.endFrame;
    }

    public float getFrameRate() {
        return this.frameRate;
    }

    public java.util.List<com.airbnb.lottie.model.layer.Layer> getLayers() {
        return this.layers;
    }

    public java.util.List<com.airbnb.lottie.model.layer.Layer> getPrecomps(java.lang.String str) {
        return this.precomps.get(str);
    }

    public androidx.collection.SparseArrayCompat<com.airbnb.lottie.model.FontCharacter> getCharacters() {
        return this.characters;
    }

    public java.util.Map<java.lang.String, com.airbnb.lottie.model.Font> getFonts() {
        return this.fonts;
    }

    public java.util.List<com.airbnb.lottie.model.Marker> getMarkers() {
        return this.markers;
    }

    public com.airbnb.lottie.model.Marker getMarker(java.lang.String str) {
        int size = this.markers.size();
        for (int i = 0; i < size; i++) {
            com.airbnb.lottie.model.Marker marker = this.markers.get(i);
            if (marker.matchesName(str)) {
                return marker;
            }
        }
        return null;
    }

    public boolean hasImages() {
        return !this.images.isEmpty();
    }

    public java.util.Map<java.lang.String, com.airbnb.lottie.LottieImageAsset> getImages() {
        return this.images;
    }

    public float getDurationFrames() {
        return this.endFrame - this.startFrame;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LottieComposition:\n");
        java.util.Iterator<com.airbnb.lottie.model.layer.Layer> it = this.layers.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString("\t"));
        }
        return sb.toString();
    }

    @java.lang.Deprecated
    public static class Factory {
        private Factory() {
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.Cancellable fromAssetFileName(android.content.Context context, java.lang.String str, com.airbnb.lottie.OnCompositionLoadedListener onCompositionLoadedListener) {
            com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter listenerAdapter = new com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter(onCompositionLoadedListener);
            com.airbnb.lottie.LottieCompositionFactory.fromAsset(context, str).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.Cancellable fromRawFile(android.content.Context context, int i, com.airbnb.lottie.OnCompositionLoadedListener onCompositionLoadedListener) {
            com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter listenerAdapter = new com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter(onCompositionLoadedListener);
            com.airbnb.lottie.LottieCompositionFactory.fromRawRes(context, i).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.Cancellable fromInputStream(java.io.InputStream inputStream, com.airbnb.lottie.OnCompositionLoadedListener onCompositionLoadedListener) {
            com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter listenerAdapter = new com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter(onCompositionLoadedListener);
            com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStream(inputStream, null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.Cancellable fromJsonString(java.lang.String str, com.airbnb.lottie.OnCompositionLoadedListener onCompositionLoadedListener) {
            com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter listenerAdapter = new com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter(onCompositionLoadedListener);
            com.airbnb.lottie.LottieCompositionFactory.fromJsonString(str, null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.Cancellable fromJsonReader(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, com.airbnb.lottie.OnCompositionLoadedListener onCompositionLoadedListener) {
            com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter listenerAdapter = new com.airbnb.lottie.LottieComposition.Factory.ListenerAdapter(onCompositionLoadedListener);
            com.airbnb.lottie.LottieCompositionFactory.fromJsonReader(jsonReader, null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.LottieComposition fromFileSync(android.content.Context context, java.lang.String str) {
            return com.airbnb.lottie.LottieCompositionFactory.fromAssetSync(context, str).getValue();
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.LottieComposition fromInputStreamSync(java.io.InputStream inputStream) {
            return com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.LottieComposition fromInputStreamSync(java.io.InputStream inputStream, boolean z) {
            if (z) {
                com.airbnb.lottie.utils.Logger.warning("Lottie now auto-closes input stream!");
            }
            return com.airbnb.lottie.LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.LottieComposition fromJsonSync(android.content.res.Resources resources, org.json.JSONObject jSONObject) {
            return com.airbnb.lottie.LottieCompositionFactory.fromJsonSync(jSONObject, null).getValue();
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.LottieComposition fromJsonSync(java.lang.String str) {
            return com.airbnb.lottie.LottieCompositionFactory.fromJsonStringSync(str, null).getValue();
        }

        @java.lang.Deprecated
        public static com.airbnb.lottie.LottieComposition fromJsonSync(com.airbnb.lottie.parser.moshi.JsonReader jsonReader) {
            return com.airbnb.lottie.LottieCompositionFactory.fromJsonReaderSync(jsonReader, null).getValue();
        }

        private static final class ListenerAdapter implements com.airbnb.lottie.LottieListener<com.airbnb.lottie.LottieComposition>, com.airbnb.lottie.Cancellable {
            private boolean cancelled;
            private final com.airbnb.lottie.OnCompositionLoadedListener listener;

            private ListenerAdapter(com.airbnb.lottie.OnCompositionLoadedListener onCompositionLoadedListener) {
                this.cancelled = false;
                this.listener = onCompositionLoadedListener;
            }

            @Override // com.airbnb.lottie.LottieListener
            public void onResult(com.airbnb.lottie.LottieComposition lottieComposition) {
                if (this.cancelled) {
                    return;
                }
                this.listener.onCompositionLoaded(lottieComposition);
            }

            @Override // com.airbnb.lottie.Cancellable
            public void cancel() {
                this.cancelled = true;
            }
        }
    }
}
