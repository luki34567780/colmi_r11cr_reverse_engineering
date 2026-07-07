package com.qcwireless.qcwatch.ui.plate.util;

/* loaded from: /tmp/dex/classes2.dex */
public class BitmapUtils {

    public interface CompressFileCallback {
        void onCompressFileFailed(java.lang.String errorMsg);

        void onCompressFileFinished(java.io.File file, android.graphics.Bitmap bitmap);
    }

    public static int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        int i3 = 1;
        if (i > reqHeight || i2 > reqWidth) {
            int i4 = i / 2;
            int i5 = i2 / 2;
            while (i4 / i3 > reqHeight && i5 / i3 > reqWidth) {
                i3 *= 2;
            }
        }
        return i3;
    }

    public static android.graphics.Bitmap cropBitmap(android.graphics.Bitmap bitmap, float hRatioW) {
        int width = bitmap.getWidth();
        bitmap.getHeight();
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, (int) (width * hRatioW), (android.graphics.Matrix) null, false);
    }

    public static android.graphics.Bitmap scaleBitmap(android.graphics.Bitmap origin, float ratio) {
        if (origin == null) {
            return null;
        }
        int width = origin.getWidth();
        int height = origin.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.preScale(ratio, ratio);
        return android.graphics.Bitmap.createBitmap(origin, 0, 0, width, height, matrix, false);
    }

    public static void compressFile(com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileBean compressFileBean, com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileCallback compressFileCallback) {
        new com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileThread(compressFileBean, compressFileCallback).start();
    }

    public static android.graphics.Bitmap decodeBitmapFromFilePath(java.lang.String path, int reqWidth, int reqHeight) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeFile(path, options);
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
        options.inJustDecodeBounds = false;
        return android.graphics.BitmapFactory.decodeFile(path, options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.io.File createFile(java.lang.String pathFile) throws java.io.IOException {
        java.io.File file = new java.io.File(pathFile.substring(0, pathFile.lastIndexOf(java.io.File.separator)));
        java.io.File file2 = new java.io.File(pathFile);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        return file2;
    }

    public static int getBitmapDegree(java.lang.String path) {
        try {
            int attributeInt = new android.media.ExifInterface(path).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static android.graphics.Bitmap rotateBitmapByDegree(android.graphics.Bitmap bm, int degree) {
        android.graphics.Bitmap bitmap;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(degree);
        try {
            bitmap = android.graphics.Bitmap.createBitmap(bm, 0, 0, bm.getWidth(), bm.getHeight(), matrix, true);
        } catch (java.lang.OutOfMemoryError unused) {
            bitmap = null;
        }
        if (bitmap == null) {
            bitmap = bm;
        }
        if (bm != bitmap) {
            bm.recycle();
        }
        return bitmap;
    }

    public static java.lang.Object[] captureViewToBitmap(android.view.View view) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        view.layout(0, 0, measuredWidth, measuredHeight);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(measuredWidth, measuredHeight, android.graphics.Bitmap.Config.ARGB_4444);
        view.draw(new android.graphics.Canvas(createBitmap));
        return new java.lang.Object[]{createBitmap, java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight)};
    }

    public static android.graphics.Bitmap captureViewToBitmap(android.view.View view, int reqWidth, int reqHeight) {
        view.layout(0, 0, reqWidth, reqHeight);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(reqWidth, reqHeight, android.graphics.Bitmap.Config.ARGB_4444);
        view.draw(new android.graphics.Canvas(createBitmap));
        return createBitmap;
    }

    public static android.graphics.Bitmap compressBitmap(android.graphics.Bitmap bitmap, int reqWidth, int reqHeight) {
        return android.graphics.Bitmap.createScaledBitmap(bitmap, reqWidth, reqHeight, true);
    }

    private static class CompressFileThread extends java.lang.Thread {
        private com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileBean compressFileBean;
        private com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileCallback compressFileCallback;
        private android.os.Handler handler_deliver = new android.os.Handler(android.os.Looper.getMainLooper());

        public CompressFileThread(com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileBean compressFileBean, com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileCallback compressFileCallback) {
            this.compressFileBean = compressFileBean;
            this.compressFileCallback = compressFileCallback;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            final android.graphics.Bitmap decodeBitmapFromFilePath = com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.decodeBitmapFromFilePath(this.compressFileBean.getPathSource(), this.compressFileBean.getReqWidth(), this.compressFileBean.getReqHeight());
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            int i = 80;
            decodeBitmapFromFilePath.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            while (byteArrayOutputStream.toByteArray().length / com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2 > this.compressFileBean.getKb_max() && i > this.compressFileBean.getQuality_max()) {
                byteArrayOutputStream.reset();
                i -= 10;
                decodeBitmapFromFilePath.compress(android.graphics.Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            }
            try {
                final java.io.File createFile = com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.createFile(this.compressFileBean.getPathCompressed());
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(createFile);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                fileOutputStream.close();
                byteArrayOutputStream.close();
                if (createFile == null || createFile.length() <= 0) {
                    return;
                }
                runOnUiThread(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileThread.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileThread.this.compressFileCallback.onCompressFileFinished(createFile, decodeBitmapFromFilePath);
                    }
                });
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                runOnUiThread(new java.lang.Runnable() { // from class: com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileThread.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileThread.this.compressFileCallback.onCompressFileFailed("压缩图片文件失败" + e.getMessage());
                    }
                });
            }
        }

        private void runOnUiThread(java.lang.Runnable run) {
            this.handler_deliver.post(run);
        }
    }

    public static class CompressFileBean {
        private int kb_max;
        private java.lang.String pathCompressed;
        private java.lang.String pathSource;
        private int quality_max;
        private int reqHeight;
        private int reqWidth;

        private CompressFileBean(com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileBean.Builder builder) {
            this.kb_max = 1000;
            this.quality_max = 80;
            this.reqWidth = 1000;
            this.reqHeight = 1000;
            this.pathSource = builder.getFileSource();
            this.pathCompressed = builder.getFileCompressed();
            this.kb_max = builder.getKb_max();
            this.quality_max = builder.getQuality_max();
            this.reqWidth = builder.getReqWidth();
            this.reqHeight = builder.getReqHeight();
        }

        public static class Builder {
            private java.lang.String pathCompressed;
            private java.lang.String pathSource;
            private int kb_max = 1000;
            private int quality_max = 80;
            private int reqWidth = 1000;
            private int reqHeight = 1000;

            public java.lang.String getFileSource() {
                return this.pathSource;
            }

            public com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileBean.Builder setFileSource(java.lang.String pathSource) {
                this.pathSource = pathSource;
                return this;
            }

            public java.lang.String getFileCompressed() {
                return this.pathCompressed;
            }

            public com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileBean.Builder setFileCompressed(java.lang.String pathCompressed) {
                this.pathCompressed = pathCompressed;
                return this;
            }

            public int getKb_max() {
                return this.kb_max;
            }

            public com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileBean.Builder setKb_max(int kb_max) {
                this.kb_max = kb_max;
                return this;
            }

            public int getQuality_max() {
                return this.quality_max;
            }

            public com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileBean.Builder setQuality_max(int quality_max) {
                this.quality_max = quality_max;
                return this;
            }

            public int getReqWidth() {
                return this.reqWidth;
            }

            public com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileBean.Builder setReqWidth(int reqWidth) {
                this.reqWidth = reqWidth;
                return this;
            }

            public int getReqHeight() {
                return this.reqHeight;
            }

            public com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileBean.Builder setReqHeight(int reqHeight) {
                this.reqHeight = reqHeight;
                return this;
            }

            public com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileBean build() {
                return new com.qcwireless.qcwatch.ui.plate.util.BitmapUtils.CompressFileBean(this);
            }
        }

        public java.lang.String getPathSource() {
            return this.pathSource;
        }

        public java.lang.String getPathCompressed() {
            return this.pathCompressed;
        }

        public int getKb_max() {
            return this.kb_max;
        }

        public int getQuality_max() {
            return this.quality_max;
        }

        public int getReqWidth() {
            return this.reqWidth;
        }

        public int getReqHeight() {
            return this.reqHeight;
        }
    }
}
