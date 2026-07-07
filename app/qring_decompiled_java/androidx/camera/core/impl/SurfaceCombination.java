package androidx.camera.core.impl;

/* loaded from: classes.dex */
public final class SurfaceCombination {
    private final java.util.List<androidx.camera.core.impl.SurfaceConfig> mSurfaceConfigList = new java.util.ArrayList();

    private static void generateArrangements(java.util.List<int[]> arrangementsResultList, int n, int[] result, int index) {
        boolean z;
        if (index >= result.length) {
            arrangementsResultList.add((int[]) result.clone());
            return;
        }
        for (int i = 0; i < n; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= index) {
                    z = false;
                    break;
                } else {
                    if (i == result[i2]) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (!z) {
                result[index] = i;
                generateArrangements(arrangementsResultList, n, result, index + 1);
            }
        }
    }

    public boolean addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    public boolean removeSurfaceConfig(androidx.camera.core.impl.SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.remove(surfaceConfig);
    }

    public java.util.List<androidx.camera.core.impl.SurfaceConfig> getSurfaceConfigList() {
        return this.mSurfaceConfigList;
    }

    public boolean isSupported(java.util.List<androidx.camera.core.impl.SurfaceConfig> configList) {
        if (configList.isEmpty()) {
            return true;
        }
        if (configList.size() > this.mSurfaceConfigList.size()) {
            return false;
        }
        for (int[] iArr : getElementsArrangements(this.mSurfaceConfigList.size())) {
            boolean z = true;
            for (int i = 0; i < this.mSurfaceConfigList.size() && (iArr[i] >= configList.size() || ((z = z & this.mSurfaceConfigList.get(i).isSupported(configList.get(iArr[i]))))); i++) {
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private java.util.List<int[]> getElementsArrangements(int n) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        generateArrangements(arrayList, n, new int[n], 0);
        return arrayList;
    }
}
