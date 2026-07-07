package com.google.zxing.datamatrix.detector;

/* loaded from: /tmp/dex/classes2.dex */
public final class Detector {
    private final com.google.zxing.common.BitMatrix image;
    private final com.google.zxing.common.detector.WhiteRectangleDetector rectangleDetector;

    public Detector(com.google.zxing.common.BitMatrix bitMatrix) throws com.google.zxing.NotFoundException {
        this.image = bitMatrix;
        this.rectangleDetector = new com.google.zxing.common.detector.WhiteRectangleDetector(bitMatrix);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.google.zxing.ResultPoint] */
    /* JADX WARN: Type inference failed for: r16v3, types: [com.google.zxing.ResultPoint] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.zxing.ResultPoint] */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.google.zxing.datamatrix.detector.Detector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.zxing.ResultPoint[]] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.zxing.ResultPoint[]] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.zxing.ResultPoint] */
    public com.google.zxing.common.DetectorResult detect() throws com.google.zxing.NotFoundException {
        com.google.zxing.ResultPoint resultPoint;
        com.google.zxing.ResultPoint resultPoint2;
        com.google.zxing.common.BitMatrix sampleGrid;
        com.google.zxing.ResultPoint[] detect = this.rectangleDetector.detect();
        com.google.zxing.ResultPoint resultPoint3 = detect[0];
        com.google.zxing.ResultPoint resultPoint4 = detect[1];
        com.google.zxing.ResultPoint resultPoint5 = detect[2];
        com.google.zxing.ResultPoint resultPoint6 = detect[3];
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(transitionsBetween(resultPoint3, resultPoint4));
        arrayList.add(transitionsBetween(resultPoint3, resultPoint5));
        arrayList.add(transitionsBetween(resultPoint4, resultPoint6));
        arrayList.add(transitionsBetween(resultPoint5, resultPoint6));
        com.google.zxing.datamatrix.detector.Detector.AnonymousClass1 anonymousClass1 = null;
        java.util.Collections.sort(arrayList, new com.google.zxing.datamatrix.detector.Detector.ResultPointsAndTransitionsComparator());
        com.google.zxing.datamatrix.detector.Detector.ResultPointsAndTransitions resultPointsAndTransitions = (com.google.zxing.datamatrix.detector.Detector.ResultPointsAndTransitions) arrayList.get(0);
        com.google.zxing.datamatrix.detector.Detector.ResultPointsAndTransitions resultPointsAndTransitions2 = (com.google.zxing.datamatrix.detector.Detector.ResultPointsAndTransitions) arrayList.get(1);
        java.util.HashMap hashMap = new java.util.HashMap();
        increment(hashMap, resultPointsAndTransitions.getFrom());
        increment(hashMap, resultPointsAndTransitions.getTo());
        increment(hashMap, resultPointsAndTransitions2.getFrom());
        increment(hashMap, resultPointsAndTransitions2.getTo());
        java.lang.Object obj = null;
        java.lang.Object obj2 = null;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            ?? r16 = (com.google.zxing.ResultPoint) entry.getKey();
            if (((java.lang.Integer) entry.getValue()).intValue() == 2) {
                obj = r16;
            } else if (anonymousClass1 == null) {
                anonymousClass1 = r16;
            } else {
                obj2 = r16;
            }
        }
        if (anonymousClass1 == null || obj == null || obj2 == null) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        ?? r4 = {anonymousClass1, obj, obj2};
        com.google.zxing.ResultPoint.orderBestPatterns(r4);
        ?? r14 = r4[0];
        ?? r22 = r4[1];
        ?? r6 = r4[2];
        if (!hashMap.containsKey(resultPoint3)) {
            resultPoint = resultPoint3;
        } else if (hashMap.containsKey(resultPoint4)) {
            resultPoint = !hashMap.containsKey(resultPoint5) ? resultPoint5 : resultPoint6;
        } else {
            resultPoint = resultPoint4;
        }
        int transitions = transitionsBetween(r6, resultPoint).getTransitions();
        int transitions2 = transitionsBetween(r14, resultPoint).getTransitions();
        if ((transitions & 1) == 1) {
            transitions++;
        }
        int i = transitions + 2;
        if ((transitions2 & 1) == 1) {
            transitions2++;
        }
        int i2 = transitions2 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            resultPoint2 = r6;
            com.google.zxing.ResultPoint correctTopRightRectangular = correctTopRightRectangular(r22, r14, r6, resultPoint, i, i2);
            if (correctTopRightRectangular != null) {
                resultPoint = correctTopRightRectangular;
            }
            int transitions3 = transitionsBetween(resultPoint2, resultPoint).getTransitions();
            int transitions4 = transitionsBetween(r14, resultPoint).getTransitions();
            if ((transitions3 & 1) == 1) {
                transitions3++;
            }
            int i3 = transitions3;
            if ((transitions4 & 1) == 1) {
                transitions4++;
            }
            sampleGrid = sampleGrid(this.image, resultPoint2, r22, r14, resultPoint, i3, transitions4);
        } else {
            com.google.zxing.ResultPoint correctTopRight = correctTopRight(r22, r14, r6, resultPoint, java.lang.Math.min(i2, i));
            if (correctTopRight != null) {
                resultPoint = correctTopRight;
            }
            int max = java.lang.Math.max(transitionsBetween(r6, resultPoint).getTransitions(), transitionsBetween(r14, resultPoint).getTransitions()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            int i4 = max;
            sampleGrid = sampleGrid(this.image, r6, r22, r14, resultPoint, i4, i4);
            resultPoint2 = r6;
        }
        return new com.google.zxing.common.DetectorResult(sampleGrid, new com.google.zxing.ResultPoint[]{resultPoint2, r22, r14, resultPoint});
    }

    private com.google.zxing.ResultPoint correctTopRightRectangular(com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2, com.google.zxing.ResultPoint resultPoint3, com.google.zxing.ResultPoint resultPoint4, int i, int i2) {
        float distance = distance(resultPoint, resultPoint2) / i;
        float distance2 = distance(resultPoint3, resultPoint4);
        com.google.zxing.ResultPoint resultPoint5 = new com.google.zxing.ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / distance2) * distance), resultPoint4.getY() + (distance * ((resultPoint4.getY() - resultPoint3.getY()) / distance2)));
        float distance3 = distance(resultPoint, resultPoint3) / i2;
        float distance4 = distance(resultPoint2, resultPoint4);
        com.google.zxing.ResultPoint resultPoint6 = new com.google.zxing.ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / distance4) * distance3), resultPoint4.getY() + (distance3 * ((resultPoint4.getY() - resultPoint2.getY()) / distance4)));
        if (isValid(resultPoint5)) {
            return (isValid(resultPoint6) && java.lang.Math.abs(i - transitionsBetween(resultPoint3, resultPoint5).getTransitions()) + java.lang.Math.abs(i2 - transitionsBetween(resultPoint2, resultPoint5).getTransitions()) > java.lang.Math.abs(i - transitionsBetween(resultPoint3, resultPoint6).getTransitions()) + java.lang.Math.abs(i2 - transitionsBetween(resultPoint2, resultPoint6).getTransitions())) ? resultPoint6 : resultPoint5;
        }
        if (isValid(resultPoint6)) {
            return resultPoint6;
        }
        return null;
    }

    private com.google.zxing.ResultPoint correctTopRight(com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2, com.google.zxing.ResultPoint resultPoint3, com.google.zxing.ResultPoint resultPoint4, int i) {
        float f = i;
        float distance = distance(resultPoint, resultPoint2) / f;
        float distance2 = distance(resultPoint3, resultPoint4);
        com.google.zxing.ResultPoint resultPoint5 = new com.google.zxing.ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint3.getX()) / distance2) * distance), resultPoint4.getY() + (distance * ((resultPoint4.getY() - resultPoint3.getY()) / distance2)));
        float distance3 = distance(resultPoint, resultPoint3) / f;
        float distance4 = distance(resultPoint2, resultPoint4);
        com.google.zxing.ResultPoint resultPoint6 = new com.google.zxing.ResultPoint(resultPoint4.getX() + (((resultPoint4.getX() - resultPoint2.getX()) / distance4) * distance3), resultPoint4.getY() + (distance3 * ((resultPoint4.getY() - resultPoint2.getY()) / distance4)));
        if (isValid(resultPoint5)) {
            return (isValid(resultPoint6) && java.lang.Math.abs(transitionsBetween(resultPoint3, resultPoint5).getTransitions() - transitionsBetween(resultPoint2, resultPoint5).getTransitions()) > java.lang.Math.abs(transitionsBetween(resultPoint3, resultPoint6).getTransitions() - transitionsBetween(resultPoint2, resultPoint6).getTransitions())) ? resultPoint6 : resultPoint5;
        }
        if (isValid(resultPoint6)) {
            return resultPoint6;
        }
        return null;
    }

    private boolean isValid(com.google.zxing.ResultPoint resultPoint) {
        return resultPoint.getX() >= 0.0f && resultPoint.getX() < ((float) this.image.getWidth()) && resultPoint.getY() > 0.0f && resultPoint.getY() < ((float) this.image.getHeight());
    }

    private static int distance(com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2) {
        return com.google.zxing.common.detector.MathUtils.round(com.google.zxing.ResultPoint.distance(resultPoint, resultPoint2));
    }

    private static void increment(java.util.Map<com.google.zxing.ResultPoint, java.lang.Integer> map, com.google.zxing.ResultPoint resultPoint) {
        java.lang.Integer num = map.get(resultPoint);
        map.put(resultPoint, java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    private static com.google.zxing.common.BitMatrix sampleGrid(com.google.zxing.common.BitMatrix bitMatrix, com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2, com.google.zxing.ResultPoint resultPoint3, com.google.zxing.ResultPoint resultPoint4, int i, int i2) throws com.google.zxing.NotFoundException {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return com.google.zxing.common.GridSampler.getInstance().sampleGrid(bitMatrix, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private com.google.zxing.datamatrix.detector.Detector.ResultPointsAndTransitions transitionsBetween(com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2) {
        int x = (int) resultPoint.getX();
        int y = (int) resultPoint.getY();
        int x2 = (int) resultPoint2.getX();
        int y2 = (int) resultPoint2.getY();
        int i = 0;
        boolean z = java.lang.Math.abs(y2 - y) > java.lang.Math.abs(x2 - x);
        if (z) {
            y = x;
            x = y;
            y2 = x2;
            x2 = y2;
        }
        int abs = java.lang.Math.abs(x2 - x);
        int abs2 = java.lang.Math.abs(y2 - y);
        int i2 = (-abs) / 2;
        int i3 = y < y2 ? 1 : -1;
        int i4 = x >= x2 ? -1 : 1;
        boolean z2 = this.image.get(z ? y : x, z ? x : y);
        while (x != x2) {
            boolean z3 = this.image.get(z ? y : x, z ? x : y);
            if (z3 != z2) {
                i++;
                z2 = z3;
            }
            i2 += abs2;
            if (i2 > 0) {
                if (y == y2) {
                    break;
                }
                y += i3;
                i2 -= abs;
            }
            x += i4;
        }
        return new com.google.zxing.datamatrix.detector.Detector.ResultPointsAndTransitions(resultPoint, resultPoint2, i);
    }

    private static final class ResultPointsAndTransitions {
        private final com.google.zxing.ResultPoint from;
        private final com.google.zxing.ResultPoint to;
        private final int transitions;

        private ResultPointsAndTransitions(com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2, int i) {
            this.from = resultPoint;
            this.to = resultPoint2;
            this.transitions = i;
        }

        com.google.zxing.ResultPoint getFrom() {
            return this.from;
        }

        com.google.zxing.ResultPoint getTo() {
            return this.to;
        }

        int getTransitions() {
            return this.transitions;
        }

        public java.lang.String toString() {
            return this.from + "/" + this.to + '/' + this.transitions;
        }
    }

    private static final class ResultPointsAndTransitionsComparator implements java.io.Serializable, java.util.Comparator<com.google.zxing.datamatrix.detector.Detector.ResultPointsAndTransitions> {
        private ResultPointsAndTransitionsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(com.google.zxing.datamatrix.detector.Detector.ResultPointsAndTransitions resultPointsAndTransitions, com.google.zxing.datamatrix.detector.Detector.ResultPointsAndTransitions resultPointsAndTransitions2) {
            return resultPointsAndTransitions.getTransitions() - resultPointsAndTransitions2.getTransitions();
        }
    }
}
