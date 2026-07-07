package com.airbnb.lottie;

/* loaded from: classes.dex */
public class PerformanceTracker {
    private boolean enabled = false;
    private final java.util.Set<com.airbnb.lottie.PerformanceTracker.FrameListener> frameListeners = new androidx.collection.ArraySet();
    private final java.util.Map<java.lang.String, com.airbnb.lottie.utils.MeanCalculator> layerRenderTimes = new java.util.HashMap();
    private final java.util.Comparator<androidx.core.util.Pair<java.lang.String, java.lang.Float>> floatComparator = new java.util.Comparator<androidx.core.util.Pair<java.lang.String, java.lang.Float>>() { // from class: com.airbnb.lottie.PerformanceTracker.1
        @Override // java.util.Comparator
        public int compare(androidx.core.util.Pair<java.lang.String, java.lang.Float> pair, androidx.core.util.Pair<java.lang.String, java.lang.Float> pair2) {
            float floatValue = pair.second.floatValue();
            float floatValue2 = pair2.second.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };

    public interface FrameListener {
        void onFrameRendered(float f);
    }

    void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void recordRenderTime(java.lang.String str, float f) {
        if (this.enabled) {
            com.airbnb.lottie.utils.MeanCalculator meanCalculator = this.layerRenderTimes.get(str);
            if (meanCalculator == null) {
                meanCalculator = new com.airbnb.lottie.utils.MeanCalculator();
                this.layerRenderTimes.put(str, meanCalculator);
            }
            meanCalculator.add(f);
            if (str.equals("__container")) {
                java.util.Iterator<com.airbnb.lottie.PerformanceTracker.FrameListener> it = this.frameListeners.iterator();
                while (it.hasNext()) {
                    it.next().onFrameRendered(f);
                }
            }
        }
    }

    public void addFrameListener(com.airbnb.lottie.PerformanceTracker.FrameListener frameListener) {
        this.frameListeners.add(frameListener);
    }

    public void removeFrameListener(com.airbnb.lottie.PerformanceTracker.FrameListener frameListener) {
        this.frameListeners.remove(frameListener);
    }

    public void clearRenderTimes() {
        this.layerRenderTimes.clear();
    }

    public void logRenderTimes() {
        if (this.enabled) {
            java.util.List<androidx.core.util.Pair<java.lang.String, java.lang.Float>> sortedRenderTimes = getSortedRenderTimes();
            android.util.Log.d(com.airbnb.lottie.L.TAG, "Render times:");
            for (int i = 0; i < sortedRenderTimes.size(); i++) {
                androidx.core.util.Pair<java.lang.String, java.lang.Float> pair = sortedRenderTimes.get(i);
                android.util.Log.d(com.airbnb.lottie.L.TAG, java.lang.String.format("\t\t%30s:%.2f", pair.first, pair.second));
            }
        }
    }

    public java.util.List<androidx.core.util.Pair<java.lang.String, java.lang.Float>> getSortedRenderTimes() {
        if (!this.enabled) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.layerRenderTimes.size());
        for (java.util.Map.Entry<java.lang.String, com.airbnb.lottie.utils.MeanCalculator> entry : this.layerRenderTimes.entrySet()) {
            arrayList.add(new androidx.core.util.Pair(entry.getKey(), java.lang.Float.valueOf(entry.getValue().getMean())));
        }
        java.util.Collections.sort(arrayList, this.floatComparator);
        return arrayList;
    }
}
