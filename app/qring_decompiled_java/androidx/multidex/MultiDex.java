package androidx.multidex;

/* loaded from: classes.dex */
public final class MultiDex {
    private static final java.lang.String CODE_CACHE_NAME = "code_cache";
    private static final java.lang.String CODE_CACHE_SECONDARY_FOLDER_NAME = "secondary-dexes";
    private static final int MAX_SUPPORTED_SDK_VERSION = 20;
    private static final int MIN_SDK_VERSION = 4;
    private static final java.lang.String NO_KEY_PREFIX = "";
    private static final java.lang.String OLD_SECONDARY_FOLDER_NAME = "secondary-dexes";
    static final java.lang.String TAG = "MultiDex";
    private static final int VM_WITH_MULTIDEX_VERSION_MAJOR = 2;
    private static final int VM_WITH_MULTIDEX_VERSION_MINOR = 1;
    private static final java.util.Set<java.io.File> installedApk = new java.util.HashSet();
    private static final boolean IS_VM_MULTIDEX_CAPABLE = isVMMultidexCapable(java.lang.System.getProperty("java.vm.version"));

    private MultiDex() {
    }

    public static void install(android.content.Context context) {
        android.util.Log.i(TAG, "Installing application");
        if (IS_VM_MULTIDEX_CAPABLE) {
            android.util.Log.i(TAG, "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 4) {
            throw new java.lang.RuntimeException("MultiDex installation failed. SDK " + android.os.Build.VERSION.SDK_INT + " is unsupported. Min SDK version is 4.");
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = getApplicationInfo(context);
            if (applicationInfo == null) {
                android.util.Log.i(TAG, "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                doInstallation(context, new java.io.File(applicationInfo.sourceDir), new java.io.File(applicationInfo.dataDir), "secondary-dexes", "", true);
                android.util.Log.i(TAG, "install done");
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "MultiDex installation failure", e);
            throw new java.lang.RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    public static void installInstrumentation(android.content.Context context, android.content.Context context2) {
        android.util.Log.i(TAG, "Installing instrumentation");
        if (IS_VM_MULTIDEX_CAPABLE) {
            android.util.Log.i(TAG, "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 4) {
            throw new java.lang.RuntimeException("MultiDex installation failed. SDK " + android.os.Build.VERSION.SDK_INT + " is unsupported. Min SDK version is 4.");
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = getApplicationInfo(context);
            if (applicationInfo == null) {
                android.util.Log.i(TAG, "No ApplicationInfo available for instrumentation, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            android.content.pm.ApplicationInfo applicationInfo2 = getApplicationInfo(context2);
            if (applicationInfo2 == null) {
                android.util.Log.i(TAG, "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            java.lang.String str = context.getPackageName() + ".";
            java.io.File file = new java.io.File(applicationInfo2.dataDir);
            doInstallation(context2, new java.io.File(applicationInfo.sourceDir), file, str + "secondary-dexes", str, false);
            doInstallation(context2, new java.io.File(applicationInfo2.sourceDir), file, "secondary-dexes", "", false);
            android.util.Log.i(TAG, "Installation done");
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "MultiDex installation failure", e);
            throw new java.lang.RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    private static void doInstallation(android.content.Context context, java.io.File file, java.io.File file2, java.lang.String str, java.lang.String str2, boolean z) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        java.util.Set<java.io.File> set = installedApk;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            if (android.os.Build.VERSION.SDK_INT > 20) {
                android.util.Log.w(TAG, "MultiDex is not guaranteed to work in SDK version " + android.os.Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + java.lang.System.getProperty("java.vm.version") + "\"");
            }
            java.lang.ClassLoader dexClassloader = getDexClassloader(context);
            if (dexClassloader == null) {
                return;
            }
            try {
                clearOldDexDir(context);
            } catch (java.lang.Throwable th) {
                android.util.Log.w(TAG, "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
            }
            java.io.File dexDir = getDexDir(context, file2, str);
            androidx.multidex.MultiDexExtractor multiDexExtractor = new androidx.multidex.MultiDexExtractor(file, dexDir);
            java.io.IOException e = null;
            try {
                try {
                    installSecondaryDexes(dexClassloader, dexDir, multiDexExtractor.load(context, str2, false));
                } catch (java.io.IOException e2) {
                    if (!z) {
                        throw e2;
                    }
                    android.util.Log.w(TAG, "Failed to install extracted secondary dex files, retrying with forced extraction", e2);
                    installSecondaryDexes(dexClassloader, dexDir, multiDexExtractor.load(context, str2, true));
                }
                try {
                } catch (java.io.IOException e3) {
                    e = e3;
                }
                if (e != null) {
                    throw e;
                }
            } finally {
                try {
                    multiDexExtractor.close();
                } catch (java.io.IOException unused) {
                }
            }
        }
    }

    private static java.lang.ClassLoader getDexClassloader(android.content.Context context) {
        try {
            java.lang.ClassLoader classLoader = context.getClassLoader();
            if (android.os.Build.VERSION.SDK_INT >= 14) {
                if (classLoader instanceof dalvik.system.BaseDexClassLoader) {
                    return classLoader;
                }
            } else if ((classLoader instanceof dalvik.system.DexClassLoader) || (classLoader instanceof dalvik.system.PathClassLoader)) {
                return classLoader;
            }
            android.util.Log.e(TAG, "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
            return null;
        } catch (java.lang.RuntimeException e) {
            android.util.Log.w(TAG, "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    private static android.content.pm.ApplicationInfo getApplicationInfo(android.content.Context context) {
        try {
            return context.getApplicationInfo();
        } catch (java.lang.RuntimeException e) {
            android.util.Log.w(TAG, "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    static boolean isVMMultidexCapable(java.lang.String str) {
        boolean z = false;
        if (str != null) {
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ".");
            java.lang.String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            java.lang.String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken != null && nextToken2 != null) {
                try {
                    int parseInt = java.lang.Integer.parseInt(nextToken);
                    int parseInt2 = java.lang.Integer.parseInt(nextToken2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        android.util.Log.i(TAG, sb.toString());
        return z;
    }

    private static void installSecondaryDexes(java.lang.ClassLoader classLoader, java.io.File file, java.util.List<? extends java.io.File> list) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.io.IOException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        if (list.isEmpty()) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            androidx.multidex.MultiDex.V19.install(classLoader, list, file);
        } else if (android.os.Build.VERSION.SDK_INT >= 14) {
            androidx.multidex.MultiDex.V14.install(classLoader, list);
        } else {
            androidx.multidex.MultiDex.V4.install(classLoader, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field findField(java.lang.Object obj, java.lang.String str) throws java.lang.NoSuchFieldException {
        for (java.lang.Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (java.lang.NoSuchFieldException unused) {
            }
        }
        throw new java.lang.NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Method findMethod(java.lang.Object obj, java.lang.String str, java.lang.Class<?>... clsArr) throws java.lang.NoSuchMethodException {
        for (java.lang.Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        throw new java.lang.NoSuchMethodException("Method " + str + " with parameters " + java.util.Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void expandFieldArray(java.lang.Object obj, java.lang.String str, java.lang.Object[] objArr) throws java.lang.NoSuchFieldException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException {
        java.lang.reflect.Field findField = findField(obj, str);
        java.lang.Object[] objArr2 = (java.lang.Object[]) findField.get(obj);
        java.lang.Object[] objArr3 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        java.lang.System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        java.lang.System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        findField.set(obj, objArr3);
    }

    private static void clearOldDexDir(android.content.Context context) throws java.lang.Exception {
        java.io.File file = new java.io.File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            android.util.Log.i(TAG, "Clearing old secondary dex dir (" + file.getPath() + ").");
            java.io.File[] listFiles = file.listFiles();
            if (listFiles == null) {
                android.util.Log.w(TAG, "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (java.io.File file2 : listFiles) {
                android.util.Log.i(TAG, "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (file2.delete()) {
                    android.util.Log.i(TAG, "Deleted old file " + file2.getPath());
                } else {
                    android.util.Log.w(TAG, "Failed to delete old file " + file2.getPath());
                }
            }
            if (!file.delete()) {
                android.util.Log.w(TAG, "Failed to delete secondary dex dir " + file.getPath());
                return;
            }
            android.util.Log.i(TAG, "Deleted old secondary dex dir " + file.getPath());
        }
    }

    private static java.io.File getDexDir(android.content.Context context, java.io.File file, java.lang.String str) throws java.io.IOException {
        java.io.File file2 = new java.io.File(file, CODE_CACHE_NAME);
        try {
            mkdirChecked(file2);
        } catch (java.io.IOException unused) {
            file2 = new java.io.File(context.getFilesDir(), CODE_CACHE_NAME);
            mkdirChecked(file2);
        }
        java.io.File file3 = new java.io.File(file2, str);
        mkdirChecked(file3);
        return file3;
    }

    private static void mkdirChecked(java.io.File file) throws java.io.IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile == null) {
            android.util.Log.e(TAG, "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            android.util.Log.e(TAG, "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new java.io.IOException("Failed to create directory " + file.getPath());
    }

    private static final class V19 {
        private V19() {
        }

        static void install(java.lang.ClassLoader classLoader, java.util.List<? extends java.io.File> list, java.io.File file) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.io.IOException {
            java.io.IOException[] iOExceptionArr;
            java.lang.Object obj = androidx.multidex.MultiDex.findField(classLoader, "pathList").get(classLoader);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            androidx.multidex.MultiDex.expandFieldArray(obj, "dexElements", makeDexElements(obj, new java.util.ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    android.util.Log.w(androidx.multidex.MultiDex.TAG, "Exception in makeDexElement", (java.io.IOException) it.next());
                }
                java.lang.reflect.Field findField = androidx.multidex.MultiDex.findField(obj, "dexElementsSuppressedExceptions");
                java.io.IOException[] iOExceptionArr2 = (java.io.IOException[]) findField.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (java.io.IOException[]) arrayList.toArray(new java.io.IOException[arrayList.size()]);
                } else {
                    java.io.IOException[] iOExceptionArr3 = new java.io.IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    java.lang.System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                findField.set(obj, iOExceptionArr);
                java.io.IOException iOException = new java.io.IOException("I/O exception during makeDexElement");
                iOException.initCause((java.lang.Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        private static java.lang.Object[] makeDexElements(java.lang.Object obj, java.util.ArrayList<java.io.File> arrayList, java.io.File file, java.util.ArrayList<java.io.IOException> arrayList2) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException {
            return (java.lang.Object[]) androidx.multidex.MultiDex.findMethod(obj, "makeDexElements", java.util.ArrayList.class, java.io.File.class, java.util.ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    private static final class V14 {
        private static final int EXTRACTED_SUFFIX_LENGTH = 4;
        private final androidx.multidex.MultiDex.V14.ElementConstructor elementConstructor;

        private interface ElementConstructor {
            java.lang.Object newInstance(java.io.File file, dalvik.system.DexFile dexFile) throws java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.io.IOException;
        }

        private static class ICSElementConstructor implements androidx.multidex.MultiDex.V14.ElementConstructor {
            private final java.lang.reflect.Constructor<?> elementConstructor;

            ICSElementConstructor(java.lang.Class<?> cls) throws java.lang.SecurityException, java.lang.NoSuchMethodException {
                java.lang.reflect.Constructor<?> constructor = cls.getConstructor(java.io.File.class, java.util.zip.ZipFile.class, dalvik.system.DexFile.class);
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public java.lang.Object newInstance(java.io.File file, dalvik.system.DexFile dexFile) throws java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.io.IOException {
                return this.elementConstructor.newInstance(file, new java.util.zip.ZipFile(file), dexFile);
            }
        }

        private static class JBMR11ElementConstructor implements androidx.multidex.MultiDex.V14.ElementConstructor {
            private final java.lang.reflect.Constructor<?> elementConstructor;

            JBMR11ElementConstructor(java.lang.Class<?> cls) throws java.lang.SecurityException, java.lang.NoSuchMethodException {
                java.lang.reflect.Constructor<?> constructor = cls.getConstructor(java.io.File.class, java.io.File.class, dalvik.system.DexFile.class);
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public java.lang.Object newInstance(java.io.File file, dalvik.system.DexFile dexFile) throws java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
                return this.elementConstructor.newInstance(file, file, dexFile);
            }
        }

        private static class JBMR2ElementConstructor implements androidx.multidex.MultiDex.V14.ElementConstructor {
            private final java.lang.reflect.Constructor<?> elementConstructor;

            JBMR2ElementConstructor(java.lang.Class<?> cls) throws java.lang.SecurityException, java.lang.NoSuchMethodException {
                java.lang.reflect.Constructor<?> constructor = cls.getConstructor(java.io.File.class, java.lang.Boolean.TYPE, java.io.File.class, dalvik.system.DexFile.class);
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public java.lang.Object newInstance(java.io.File file, dalvik.system.DexFile dexFile) throws java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
                return this.elementConstructor.newInstance(file, java.lang.Boolean.FALSE, file, dexFile);
            }
        }

        static void install(java.lang.ClassLoader classLoader, java.util.List<? extends java.io.File> list) throws java.io.IOException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchFieldException {
            java.lang.Object obj = androidx.multidex.MultiDex.findField(classLoader, "pathList").get(classLoader);
            java.lang.Object[] makeDexElements = new androidx.multidex.MultiDex.V14().makeDexElements(list);
            try {
                androidx.multidex.MultiDex.expandFieldArray(obj, "dexElements", makeDexElements);
            } catch (java.lang.NoSuchFieldException e) {
                android.util.Log.w(androidx.multidex.MultiDex.TAG, "Failed find field 'dexElements' attempting 'pathElements'", e);
                androidx.multidex.MultiDex.expandFieldArray(obj, "pathElements", makeDexElements);
            }
        }

        private V14() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
            androidx.multidex.MultiDex.V14.ElementConstructor jBMR2ElementConstructor;
            java.lang.Class<?> cls = java.lang.Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    jBMR2ElementConstructor = new androidx.multidex.MultiDex.V14.ICSElementConstructor(cls);
                } catch (java.lang.NoSuchMethodException unused) {
                    jBMR2ElementConstructor = new androidx.multidex.MultiDex.V14.JBMR11ElementConstructor(cls);
                }
            } catch (java.lang.NoSuchMethodException unused2) {
                jBMR2ElementConstructor = new androidx.multidex.MultiDex.V14.JBMR2ElementConstructor(cls);
            }
            this.elementConstructor = jBMR2ElementConstructor;
        }

        private java.lang.Object[] makeDexElements(java.util.List<? extends java.io.File> list) throws java.io.IOException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            int size = list.size();
            java.lang.Object[] objArr = new java.lang.Object[size];
            for (int i = 0; i < size; i++) {
                java.io.File file = list.get(i);
                objArr[i] = this.elementConstructor.newInstance(file, dalvik.system.DexFile.loadDex(file.getPath(), optimizedPathFor(file), 0));
            }
            return objArr;
        }

        private static java.lang.String optimizedPathFor(java.io.File file) {
            java.io.File parentFile = file.getParentFile();
            java.lang.String name = file.getName();
            return new java.io.File(parentFile, name.substring(0, name.length() - EXTRACTED_SUFFIX_LENGTH) + ".dex").getPath();
        }
    }

    private static final class V4 {
        private V4() {
        }

        static void install(java.lang.ClassLoader classLoader, java.util.List<? extends java.io.File> list) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.io.IOException {
            int size = list.size();
            java.lang.reflect.Field findField = androidx.multidex.MultiDex.findField(classLoader, "path");
            java.lang.StringBuilder sb = new java.lang.StringBuilder((java.lang.String) findField.get(classLoader));
            java.lang.String[] strArr = new java.lang.String[size];
            java.io.File[] fileArr = new java.io.File[size];
            java.util.zip.ZipFile[] zipFileArr = new java.util.zip.ZipFile[size];
            dalvik.system.DexFile[] dexFileArr = new dalvik.system.DexFile[size];
            java.util.ListIterator<? extends java.io.File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                java.io.File next = listIterator.next();
                java.lang.String absolutePath = next.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = next;
                zipFileArr[previousIndex] = new java.util.zip.ZipFile(next);
                dexFileArr[previousIndex] = dalvik.system.DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            findField.set(classLoader, sb.toString());
            androidx.multidex.MultiDex.expandFieldArray(classLoader, "mPaths", strArr);
            androidx.multidex.MultiDex.expandFieldArray(classLoader, "mFiles", fileArr);
            androidx.multidex.MultiDex.expandFieldArray(classLoader, "mZips", zipFileArr);
            androidx.multidex.MultiDex.expandFieldArray(classLoader, "mDexs", dexFileArr);
        }
    }
}
