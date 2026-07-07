package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class FileIOUtils {
    private static int sBufferSize = 524288;

    public interface OnProgressUpdateListener {
        void onProgressUpdate(double d);
    }

    private FileIOUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean writeFileFromIS(java.lang.String str, java.io.InputStream inputStream) {
        return writeFileFromIS(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), inputStream, false, (com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(java.lang.String str, java.io.InputStream inputStream, boolean z) {
        return writeFileFromIS(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), inputStream, z, (com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(java.io.File file, java.io.InputStream inputStream) {
        return writeFileFromIS(file, inputStream, false, (com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(java.io.File file, java.io.InputStream inputStream, boolean z) {
        return writeFileFromIS(file, inputStream, z, (com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(java.lang.String str, java.io.InputStream inputStream, com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromIS(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), inputStream, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromIS(java.lang.String str, java.io.InputStream inputStream, boolean z, com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromIS(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), inputStream, z, onProgressUpdateListener);
    }

    public static boolean writeFileFromIS(java.io.File file, java.io.InputStream inputStream, com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromIS(file, inputStream, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromIS(java.io.File file, java.io.InputStream inputStream, boolean z, com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener onProgressUpdateListener) {
        java.io.BufferedOutputStream bufferedOutputStream;
        if (inputStream == null || !com.blankj.utilcode.util.UtilsBridge.createOrExistsFile(file)) {
            android.util.Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        java.io.BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file, z), sBufferSize);
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.io.IOException e) {
            e = e;
        }
        try {
            if (onProgressUpdateListener == null) {
                byte[] bArr = new byte[sBufferSize];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                }
            } else {
                double available = inputStream.available();
                onProgressUpdateListener.onProgressUpdate(0.0d);
                byte[] bArr2 = new byte[sBufferSize];
                int i = 0;
                while (true) {
                    int read2 = inputStream.read(bArr2);
                    if (read2 == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr2, 0, read2);
                    i += read2;
                    onProgressUpdateListener.onProgressUpdate(i / available);
                }
            }
            try {
                inputStream.close();
            } catch (java.io.IOException e2) {
                e2.printStackTrace();
            }
            try {
                bufferedOutputStream.close();
            } catch (java.io.IOException e3) {
                e3.printStackTrace();
            }
            return true;
        } catch (java.io.IOException e4) {
            e = e4;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            try {
                inputStream.close();
            } catch (java.io.IOException e5) {
                e5.printStackTrace();
            }
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (java.io.IOException e6) {
                    e6.printStackTrace();
                }
            }
            return false;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            try {
                inputStream.close();
            } catch (java.io.IOException e7) {
                e7.printStackTrace();
            }
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                    throw th;
                } catch (java.io.IOException e8) {
                    e8.printStackTrace();
                    throw th;
                }
            }
            throw th;
        }
    }

    public static boolean writeFileFromBytesByStream(java.lang.String str, byte[] bArr) {
        return writeFileFromBytesByStream(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), bArr, false, (com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromBytesByStream(java.lang.String str, byte[] bArr, boolean z) {
        return writeFileFromBytesByStream(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), bArr, z, (com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromBytesByStream(java.io.File file, byte[] bArr) {
        return writeFileFromBytesByStream(file, bArr, false, (com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromBytesByStream(java.io.File file, byte[] bArr, boolean z) {
        return writeFileFromBytesByStream(file, bArr, z, (com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromBytesByStream(java.lang.String str, byte[] bArr, com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromBytesByStream(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), bArr, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromBytesByStream(java.lang.String str, byte[] bArr, boolean z, com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromBytesByStream(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), bArr, z, onProgressUpdateListener);
    }

    public static boolean writeFileFromBytesByStream(java.io.File file, byte[] bArr, com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromBytesByStream(file, bArr, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromBytesByStream(java.io.File file, byte[] bArr, boolean z, com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener onProgressUpdateListener) {
        if (bArr == null) {
            return false;
        }
        return writeFileFromIS(file, new java.io.ByteArrayInputStream(bArr), z, onProgressUpdateListener);
    }

    public static boolean writeFileFromBytesByChannel(java.lang.String str, byte[] bArr, boolean z) {
        return writeFileFromBytesByChannel(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), bArr, false, z);
    }

    public static boolean writeFileFromBytesByChannel(java.lang.String str, byte[] bArr, boolean z, boolean z2) {
        return writeFileFromBytesByChannel(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), bArr, z, z2);
    }

    public static boolean writeFileFromBytesByChannel(java.io.File file, byte[] bArr, boolean z) {
        return writeFileFromBytesByChannel(file, bArr, false, z);
    }

    public static boolean writeFileFromBytesByChannel(java.io.File file, byte[] bArr, boolean z, boolean z2) {
        if (bArr == null) {
            android.util.Log.e("FileIOUtils", "bytes is null.");
            return false;
        }
        if (!com.blankj.utilcode.util.UtilsBridge.createOrExistsFile(file)) {
            android.util.Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        java.nio.channels.FileChannel fileChannel = null;
        try {
            try {
                java.nio.channels.FileChannel channel = new java.io.FileOutputStream(file, z).getChannel();
                if (channel == null) {
                    android.util.Log.e("FileIOUtils", "fc is null.");
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (java.io.IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return false;
                }
                channel.position(channel.size());
                channel.write(java.nio.ByteBuffer.wrap(bArr));
                if (z2) {
                    channel.force(true);
                }
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (java.io.IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return true;
            } catch (java.io.IOException e3) {
                e3.printStackTrace();
                if (0 != 0) {
                    try {
                        fileChannel.close();
                    } catch (java.io.IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return false;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                try {
                    fileChannel.close();
                } catch (java.io.IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean writeFileFromBytesByMap(java.lang.String str, byte[] bArr, boolean z) {
        return writeFileFromBytesByMap(str, bArr, false, z);
    }

    public static boolean writeFileFromBytesByMap(java.lang.String str, byte[] bArr, boolean z, boolean z2) {
        return writeFileFromBytesByMap(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), bArr, z, z2);
    }

    public static boolean writeFileFromBytesByMap(java.io.File file, byte[] bArr, boolean z) {
        return writeFileFromBytesByMap(file, bArr, false, z);
    }

    public static boolean writeFileFromBytesByMap(java.io.File file, byte[] bArr, boolean z, boolean z2) {
        if (bArr == null || !com.blankj.utilcode.util.UtilsBridge.createOrExistsFile(file)) {
            android.util.Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        java.nio.channels.FileChannel fileChannel = null;
        try {
            try {
                java.nio.channels.FileChannel channel = new java.io.FileOutputStream(file, z).getChannel();
                if (channel == null) {
                    android.util.Log.e("FileIOUtils", "fc is null.");
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (java.io.IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return false;
                }
                java.nio.MappedByteBuffer map = channel.map(java.nio.channels.FileChannel.MapMode.READ_WRITE, channel.size(), bArr.length);
                map.put(bArr);
                if (z2) {
                    map.force();
                }
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (java.io.IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return true;
            } catch (java.lang.Throwable th) {
                if (0 != 0) {
                    try {
                        fileChannel.close();
                    } catch (java.io.IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e4) {
            e4.printStackTrace();
            if (0 != 0) {
                try {
                    fileChannel.close();
                } catch (java.io.IOException e5) {
                    e5.printStackTrace();
                }
            }
            return false;
        }
    }

    public static boolean writeFileFromString(java.lang.String str, java.lang.String str2) {
        return writeFileFromString(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), str2, false);
    }

    public static boolean writeFileFromString(java.lang.String str, java.lang.String str2, boolean z) {
        return writeFileFromString(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), str2, z);
    }

    public static boolean writeFileFromString(java.io.File file, java.lang.String str) {
        return writeFileFromString(file, str, false);
    }

    public static boolean writeFileFromString(java.io.File file, java.lang.String str, boolean z) {
        java.io.BufferedWriter bufferedWriter;
        if (file == null || str == null) {
            return false;
        }
        if (!com.blankj.utilcode.util.UtilsBridge.createOrExistsFile(file)) {
            android.util.Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        java.io.BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(file, z));
            } catch (java.io.IOException e) {
                e = e;
            }
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            try {
                bufferedWriter.close();
            } catch (java.io.IOException e2) {
                e2.printStackTrace();
            }
            return true;
        } catch (java.io.IOException e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (java.io.IOException e4) {
                    e4.printStackTrace();
                }
            }
            return false;
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (java.io.IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static java.util.List<java.lang.String> readFile2List(java.lang.String str) {
        return readFile2List(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), (java.lang.String) null);
    }

    public static java.util.List<java.lang.String> readFile2List(java.lang.String str, java.lang.String str2) {
        return readFile2List(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), str2);
    }

    public static java.util.List<java.lang.String> readFile2List(java.io.File file) {
        return readFile2List(file, 0, Integer.MAX_VALUE, (java.lang.String) null);
    }

    public static java.util.List<java.lang.String> readFile2List(java.io.File file, java.lang.String str) {
        return readFile2List(file, 0, Integer.MAX_VALUE, str);
    }

    public static java.util.List<java.lang.String> readFile2List(java.lang.String str, int i, int i2) {
        return readFile2List(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), i, i2, (java.lang.String) null);
    }

    public static java.util.List<java.lang.String> readFile2List(java.lang.String str, int i, int i2, java.lang.String str2) {
        return readFile2List(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), i, i2, str2);
    }

    public static java.util.List<java.lang.String> readFile2List(java.io.File file, int i, int i2) {
        return readFile2List(file, i, i2, (java.lang.String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> readFile2List(java.io.File r6, int r7, int r8, java.lang.String r9) {
        /*
            boolean r0 = com.blankj.utilcode.util.UtilsBridge.isFileExists(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r7 <= r8) goto Lb
            return r1
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r0.<init>()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            boolean r2 = com.blankj.utilcode.util.UtilsBridge.isSpace(r9)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r3 = 1
            if (r2 == 0) goto L27
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            goto L37
        L27:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r4.<init>(r5, r9)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r9 = r2
        L37:
            java.lang.String r6 = r9.readLine()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L69
            if (r6 == 0) goto L4a
            if (r3 <= r8) goto L40
            goto L4a
        L40:
            if (r7 > r3) goto L47
            if (r3 > r8) goto L47
            r0.add(r6)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L69
        L47:
            int r3 = r3 + 1
            goto L37
        L4a:
            if (r9 == 0) goto L54
            r9.close()     // Catch: java.io.IOException -> L50
            goto L54
        L50:
            r6 = move-exception
            r6.printStackTrace()
        L54:
            return r0
        L55:
            r6 = move-exception
            goto L5b
        L57:
            r6 = move-exception
            goto L6b
        L59:
            r6 = move-exception
            r9 = r1
        L5b:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L68
            r9.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r6 = move-exception
            r6.printStackTrace()
        L68:
            return r1
        L69:
            r6 = move-exception
            r1 = r9
        L6b:
            if (r1 == 0) goto L75
            r1.close()     // Catch: java.io.IOException -> L71
            goto L75
        L71:
            r7 = move-exception
            r7.printStackTrace()
        L75:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.FileIOUtils.readFile2List(java.io.File, int, int, java.lang.String):java.util.List");
    }

    public static java.lang.String readFile2String(java.lang.String str) {
        return readFile2String(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), (java.lang.String) null);
    }

    public static java.lang.String readFile2String(java.lang.String str, java.lang.String str2) {
        return readFile2String(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), str2);
    }

    public static java.lang.String readFile2String(java.io.File file) {
        return readFile2String(file, (java.lang.String) null);
    }

    public static java.lang.String readFile2String(java.io.File file, java.lang.String str) {
        byte[] readFile2BytesByStream = readFile2BytesByStream(file);
        if (readFile2BytesByStream == null) {
            return null;
        }
        if (com.blankj.utilcode.util.UtilsBridge.isSpace(str)) {
            return new java.lang.String(readFile2BytesByStream);
        }
        try {
            return new java.lang.String(readFile2BytesByStream, str);
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static byte[] readFile2BytesByStream(java.lang.String str) {
        return readFile2BytesByStream(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), (com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener) null);
    }

    public static byte[] readFile2BytesByStream(java.io.File file) {
        return readFile2BytesByStream(file, (com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener) null);
    }

    public static byte[] readFile2BytesByStream(java.lang.String str, com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener onProgressUpdateListener) {
        return readFile2BytesByStream(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str), onProgressUpdateListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[Catch: FileNotFoundException -> 0x0090, SYNTHETIC, TRY_LEAVE, TryCatch #0 {FileNotFoundException -> 0x0090, blocks: (B:6:0x0008, B:18:0x004e, B:20:0x0056, B:24:0x005b, B:27:0x0053, B:37:0x0069, B:41:0x0073, B:44:0x0078, B:47:0x006e, B:51:0x007d, B:54:0x0087, B:59:0x008f, B:58:0x008c, B:63:0x0082), top: B:5:0x0008, inners: #1, #3, #5, #6, #8, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] readFile2BytesByStream(java.io.File r10, com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener r11) {
        /*
            boolean r0 = com.blankj.utilcode.util.UtilsBridge.isFileExists(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L90
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L90
            r2.<init>(r10)     // Catch: java.io.FileNotFoundException -> L90
            int r10 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.io.FileNotFoundException -> L90
            r0.<init>(r2, r10)     // Catch: java.io.FileNotFoundException -> L90
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64
            r10.<init>()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64
            int r2 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            byte[] r2 = new byte[r2]     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            r3 = -1
            r4 = 0
            if (r11 != 0) goto L2d
        L21:
            int r11 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            int r11 = r0.read(r2, r4, r11)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            if (r11 == r3) goto L4a
            r10.write(r2, r4, r11)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            goto L21
        L2d:
            int r5 = r0.available()     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            double r5 = (double) r5     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            r7 = 0
            r11.onProgressUpdate(r7)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            r7 = 0
        L38:
            int r8 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            int r8 = r0.read(r2, r4, r8)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            if (r8 == r3) goto L4a
            r10.write(r2, r4, r8)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            int r7 = r7 + r8
            double r8 = (double) r7     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            double r8 = r8 / r5
            r11.onProgressUpdate(r8)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            goto L38
        L4a:
            byte[] r11 = r10.toByteArray()     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            r0.close()     // Catch: java.io.IOException -> L52 java.io.FileNotFoundException -> L90
            goto L56
        L52:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L90
        L56:
            r10.close()     // Catch: java.io.IOException -> L5a java.io.FileNotFoundException -> L90
            goto L5e
        L5a:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L90
        L5e:
            return r11
        L5f:
            r11 = move-exception
            goto L66
        L61:
            r11 = move-exception
            r10 = r1
            goto L7d
        L64:
            r11 = move-exception
            r10 = r1
        L66:
            r11.printStackTrace()     // Catch: java.lang.Throwable -> L7c
            r0.close()     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L90
            goto L71
        L6d:
            r11 = move-exception
            r11.printStackTrace()     // Catch: java.io.FileNotFoundException -> L90
        L71:
            if (r10 == 0) goto L7b
            r10.close()     // Catch: java.io.IOException -> L77 java.io.FileNotFoundException -> L90
            goto L7b
        L77:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L90
        L7b:
            return r1
        L7c:
            r11 = move-exception
        L7d:
            r0.close()     // Catch: java.io.IOException -> L81 java.io.FileNotFoundException -> L90
            goto L85
        L81:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L90
        L85:
            if (r10 == 0) goto L8f
            r10.close()     // Catch: java.io.IOException -> L8b java.io.FileNotFoundException -> L90
            goto L8f
        L8b:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L90
        L8f:
            throw r11     // Catch: java.io.FileNotFoundException -> L90
        L90:
            r10 = move-exception
            r10.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.FileIOUtils.readFile2BytesByStream(java.io.File, com.blankj.utilcode.util.FileIOUtils$OnProgressUpdateListener):byte[]");
    }

    public static byte[] readFile2BytesByChannel(java.lang.String str) {
        return readFile2BytesByChannel(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] readFile2BytesByChannel(java.io.File file) {
        java.nio.channels.FileChannel fileChannel;
        java.nio.channels.FileChannel fileChannel2 = 0;
        try {
            if (!com.blankj.utilcode.util.UtilsBridge.isFileExists(file)) {
                return null;
            }
            try {
                fileChannel = new java.io.RandomAccessFile(file, "r").getChannel();
                try {
                    if (fileChannel == null) {
                        android.util.Log.e("FileIOUtils", "fc is null.");
                        byte[] bArr = new byte[0];
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (java.io.IOException e) {
                                e.printStackTrace();
                            }
                        }
                        return bArr;
                    }
                    java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((int) fileChannel.size());
                    while (fileChannel.read(allocate) > 0) {
                    }
                    byte[] array = allocate.array();
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (java.io.IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    return array;
                } catch (java.io.IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (java.io.IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (java.io.IOException e5) {
                e = e5;
                fileChannel = null;
            } catch (java.lang.Throwable th) {
                th = th;
                if (fileChannel2 != 0) {
                    try {
                        fileChannel2.close();
                    } catch (java.io.IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileChannel2 = file;
        }
    }

    public static byte[] readFile2BytesByMap(java.lang.String str) {
        return readFile2BytesByMap(com.blankj.utilcode.util.UtilsBridge.getFileByPath(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] readFile2BytesByMap(java.io.File file) {
        java.nio.channels.FileChannel fileChannel;
        java.nio.channels.FileChannel fileChannel2 = 0;
        try {
            if (!com.blankj.utilcode.util.UtilsBridge.isFileExists(file)) {
                return null;
            }
            try {
                fileChannel = new java.io.RandomAccessFile(file, "r").getChannel();
                try {
                    if (fileChannel == null) {
                        android.util.Log.e("FileIOUtils", "fc is null.");
                        byte[] bArr = new byte[0];
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (java.io.IOException e) {
                                e.printStackTrace();
                            }
                        }
                        return bArr;
                    }
                    int size = (int) fileChannel.size();
                    byte[] bArr2 = new byte[size];
                    fileChannel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, size).load().get(bArr2, 0, size);
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (java.io.IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    return bArr2;
                } catch (java.io.IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (java.io.IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (java.io.IOException e5) {
                e = e5;
                fileChannel = null;
            } catch (java.lang.Throwable th) {
                th = th;
                if (fileChannel2 != 0) {
                    try {
                        fileChannel2.close();
                    } catch (java.io.IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileChannel2 = file;
        }
    }

    public static void setBufferSize(int i) {
        sBufferSize = i;
    }
}
