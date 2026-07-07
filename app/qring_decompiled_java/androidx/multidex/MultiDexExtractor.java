package androidx.multidex;

/* loaded from: classes.dex */
final class MultiDexExtractor implements java.io.Closeable {
    private static final int BUFFER_SIZE = 16384;
    private static final java.lang.String DEX_PREFIX = "classes";
    static final java.lang.String DEX_SUFFIX = ".dex";
    private static final java.lang.String EXTRACTED_NAME_EXT = ".classes";
    static final java.lang.String EXTRACTED_SUFFIX = ".zip";
    private static final java.lang.String KEY_CRC = "crc";
    private static final java.lang.String KEY_DEX_CRC = "dex.crc.";
    private static final java.lang.String KEY_DEX_NUMBER = "dex.number";
    private static final java.lang.String KEY_DEX_TIME = "dex.time.";
    private static final java.lang.String KEY_TIME_STAMP = "timestamp";
    private static final java.lang.String LOCK_FILENAME = "MultiDex.lock";
    private static final int MAX_EXTRACT_ATTEMPTS = 3;
    private static final long NO_VALUE = -1;
    private static final java.lang.String PREFS_FILE = "multidex.version";
    private static final java.lang.String TAG = "MultiDex";
    private final java.nio.channels.FileLock cacheLock;
    private final java.io.File dexDir;
    private final java.nio.channels.FileChannel lockChannel;
    private final java.io.RandomAccessFile lockRaf;
    private final java.io.File sourceApk;
    private final long sourceCrc;

    private static class ExtractedDex extends java.io.File {
        public long crc;

        public ExtractedDex(java.io.File file, java.lang.String str) {
            super(file, str);
            this.crc = -1L;
        }
    }

    MultiDexExtractor(java.io.File file, java.io.File file2) throws java.io.IOException {
        android.util.Log.i(TAG, "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.sourceApk = file;
        this.dexDir = file2;
        this.sourceCrc = getZipCrc(file);
        java.io.File file3 = new java.io.File(file2, LOCK_FILENAME);
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file3, "rw");
        this.lockRaf = randomAccessFile;
        try {
            java.nio.channels.FileChannel channel = randomAccessFile.getChannel();
            this.lockChannel = channel;
            try {
                android.util.Log.i(TAG, "Blocking on lock " + file3.getPath());
                this.cacheLock = channel.lock();
                android.util.Log.i(TAG, file3.getPath() + " locked");
            } catch (java.io.IOException e) {
                e = e;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (java.lang.Error e2) {
                e = e2;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (java.lang.RuntimeException e3) {
                e = e3;
                closeQuietly(this.lockChannel);
                throw e;
            }
        } catch (java.io.IOException | java.lang.Error | java.lang.RuntimeException e4) {
            closeQuietly(this.lockRaf);
            throw e4;
        }
    }

    java.util.List<? extends java.io.File> load(android.content.Context context, java.lang.String str, boolean z) throws java.io.IOException {
        java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> performExtractions;
        java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> list;
        android.util.Log.i(TAG, "MultiDexExtractor.load(" + this.sourceApk.getPath() + ", " + z + ", " + str + ")");
        if (!this.cacheLock.isValid()) {
            throw new java.lang.IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z && !isModified(context, this.sourceApk, this.sourceCrc, str)) {
            try {
                list = loadExistingExtractions(context, str);
            } catch (java.io.IOException e) {
                android.util.Log.w(TAG, "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                performExtractions = performExtractions();
                putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, performExtractions);
            }
            android.util.Log.i(TAG, "load found " + list.size() + " secondary dex files");
            return list;
        }
        if (z) {
            android.util.Log.i(TAG, "Forced extraction must be performed.");
        } else {
            android.util.Log.i(TAG, "Detected that extraction must be performed.");
        }
        performExtractions = performExtractions();
        putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, performExtractions);
        list = performExtractions;
        android.util.Log.i(TAG, "load found " + list.size() + " secondary dex files");
        return list;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.cacheLock.release();
        this.lockChannel.close();
        this.lockRaf.close();
    }

    private java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> loadExistingExtractions(android.content.Context context, java.lang.String str) throws java.io.IOException {
        android.util.Log.i(TAG, "loading existing secondary dex files");
        java.lang.String str2 = this.sourceApk.getName() + EXTRACTED_NAME_EXT;
        android.content.SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        int i = multiDexPreferences.getInt(str + KEY_DEX_NUMBER, 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            androidx.multidex.MultiDexExtractor.ExtractedDex extractedDex = new androidx.multidex.MultiDexExtractor.ExtractedDex(this.dexDir, str2 + i2 + EXTRACTED_SUFFIX);
            if (extractedDex.isFile()) {
                extractedDex.crc = getZipCrc(extractedDex);
                long j = multiDexPreferences.getLong(str + KEY_DEX_CRC + i2, -1L);
                long j2 = multiDexPreferences.getLong(str + KEY_DEX_TIME + i2, -1L);
                long lastModified = extractedDex.lastModified();
                if (j2 == lastModified) {
                    java.lang.String str3 = str2;
                    android.content.SharedPreferences sharedPreferences = multiDexPreferences;
                    if (j == extractedDex.crc) {
                        arrayList.add(extractedDex);
                        i2++;
                        multiDexPreferences = sharedPreferences;
                        str2 = str3;
                    }
                }
                throw new java.io.IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + extractedDex.crc);
            }
            throw new java.io.IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
        }
        return arrayList;
    }

    private static boolean isModified(android.content.Context context, java.io.File file, long j, java.lang.String str) {
        android.content.SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        if (multiDexPreferences.getLong(str + KEY_TIME_STAMP, -1L) == getTimeStamp(file)) {
            if (multiDexPreferences.getLong(str + KEY_CRC, -1L) == j) {
                return false;
            }
        }
        return true;
    }

    private static long getTimeStamp(java.io.File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long getZipCrc(java.io.File file) throws java.io.IOException {
        long zipCrc = androidx.multidex.ZipUtil.getZipCrc(file);
        return zipCrc == -1 ? zipCrc - 1 : zipCrc;
    }

    private java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> performExtractions() throws java.io.IOException {
        boolean z;
        java.lang.String str = this.sourceApk.getName() + EXTRACTED_NAME_EXT;
        clearDexDir();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(this.sourceApk);
        try {
            java.util.zip.ZipEntry entry = zipFile.getEntry(DEX_PREFIX + 2 + DEX_SUFFIX);
            int i = 2;
            while (entry != null) {
                androidx.multidex.MultiDexExtractor.ExtractedDex extractedDex = new androidx.multidex.MultiDexExtractor.ExtractedDex(this.dexDir, str + i + EXTRACTED_SUFFIX);
                arrayList.add(extractedDex);
                android.util.Log.i(TAG, "Extraction is needed for file " + extractedDex);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    int i3 = i2 + 1;
                    extract(zipFile, entry, extractedDex, str);
                    try {
                        extractedDex.crc = getZipCrc(extractedDex);
                        z = true;
                    } catch (java.io.IOException e) {
                        android.util.Log.w(TAG, "Failed to read crc from " + extractedDex.getAbsolutePath(), e);
                        z = false;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(extractedDex.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(extractedDex.length());
                    sb.append(" - crc: ");
                    sb.append(extractedDex.crc);
                    android.util.Log.i(TAG, sb.toString());
                    if (!z) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            android.util.Log.w(TAG, "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i2 = i3;
                }
                if (!z2) {
                    throw new java.io.IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                entry = zipFile.getEntry(DEX_PREFIX + i + DEX_SUFFIX);
            }
            try {
                zipFile.close();
            } catch (java.io.IOException e2) {
                android.util.Log.w(TAG, "Failed to close resource", e2);
            }
            return arrayList;
        } finally {
        }
    }

    private static void putStoredApkInfo(android.content.Context context, java.lang.String str, long j, long j2, java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> list) {
        android.content.SharedPreferences.Editor edit = getMultiDexPreferences(context).edit();
        edit.putLong(str + KEY_TIME_STAMP, j);
        edit.putLong(str + KEY_CRC, j2);
        edit.putInt(str + KEY_DEX_NUMBER, list.size() + 1);
        int i = 2;
        for (androidx.multidex.MultiDexExtractor.ExtractedDex extractedDex : list) {
            edit.putLong(str + KEY_DEX_CRC + i, extractedDex.crc);
            edit.putLong(str + KEY_DEX_TIME + i, extractedDex.lastModified());
            i++;
        }
        edit.commit();
    }

    private static android.content.SharedPreferences getMultiDexPreferences(android.content.Context context) {
        return context.getSharedPreferences(PREFS_FILE, android.os.Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private void clearDexDir() {
        java.io.File[] listFiles = this.dexDir.listFiles(new java.io.FileFilter() { // from class: androidx.multidex.MultiDexExtractor.1
            @Override // java.io.FileFilter
            public boolean accept(java.io.File file) {
                return !file.getName().equals(androidx.multidex.MultiDexExtractor.LOCK_FILENAME);
            }
        });
        if (listFiles == null) {
            android.util.Log.w(TAG, "Failed to list secondary dex dir content (" + this.dexDir.getPath() + ").");
            return;
        }
        for (java.io.File file : listFiles) {
            android.util.Log.i(TAG, "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                android.util.Log.i(TAG, "Deleted old file " + file.getPath());
            } else {
                android.util.Log.w(TAG, "Failed to delete old file " + file.getPath());
            }
        }
    }

    private static void extract(java.util.zip.ZipFile zipFile, java.util.zip.ZipEntry zipEntry, java.io.File file, java.lang.String str) throws java.io.IOException, java.io.FileNotFoundException {
        java.io.InputStream inputStream = zipFile.getInputStream(zipEntry);
        java.io.File createTempFile = java.io.File.createTempFile("tmp-" + str, EXTRACTED_SUFFIX, file.getParentFile());
        android.util.Log.i(TAG, "Extracting " + createTempFile.getPath());
        try {
            java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(createTempFile)));
            try {
                java.util.zip.ZipEntry zipEntry2 = new java.util.zip.ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!createTempFile.setReadOnly()) {
                    throw new java.io.IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                android.util.Log.i(TAG, "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    return;
                }
                throw new java.io.IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (java.lang.Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            closeQuietly(inputStream);
            createTempFile.delete();
        }
    }

    private static void closeQuietly(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException e) {
            android.util.Log.w(TAG, "Failed to close resource", e);
        }
    }
}
