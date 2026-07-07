package kotlin.io;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a*\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", com.google.android.gms.fitness.FitnessActivities.OTHER, "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, k = 5, mv = {1, 6, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes3.dex */
public class FilesKt__UtilsKt extends kotlin.io.FilesKt__FileTreeWalkKt {
    public static /* synthetic */ java.io.File createTempDir$default(java.lang.String str, java.lang.String str2, java.io.File file, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return kotlin.io.FilesKt.createTempDir(str, str2, file);
    }

    @kotlin.Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final java.io.File createTempDir(java.lang.String prefix, java.lang.String str, java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        java.io.File dir = java.io.File.createTempFile(prefix, str, file);
        dir.delete();
        if (dir.mkdir()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dir, "dir");
            return dir;
        }
        throw new java.io.IOException("Unable to create temporary directory " + dir + '.');
    }

    public static /* synthetic */ java.io.File createTempFile$default(java.lang.String str, java.lang.String str2, java.io.File file, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return kotlin.io.FilesKt.createTempFile(str, str2, file);
    }

    @kotlin.Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final java.io.File createTempFile(java.lang.String prefix, java.lang.String str, java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        java.io.File createTempFile = java.io.File.createTempFile(prefix, str, file);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    public static final java.lang.String getExtension(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        java.lang.String name = file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
        return kotlin.text.StringsKt.substringAfterLast(name, '.', "");
    }

    public static final java.lang.String getInvariantSeparatorsPath(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        if (java.io.File.separatorChar != '/') {
            java.lang.String path = file.getPath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "path");
            return kotlin.text.StringsKt.replace$default(path, java.io.File.separatorChar, '/', false, 4, (java.lang.Object) null);
        }
        java.lang.String path2 = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "path");
        return path2;
    }

    public static final java.lang.String getNameWithoutExtension(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        java.lang.String name = file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
        return kotlin.text.StringsKt.substringBeforeLast$default(name, ".", (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final java.lang.String toRelativeString(java.io.File file, java.io.File base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        java.lang.String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return relativeStringOrNull$FilesKt__UtilsKt;
        }
        throw new java.lang.IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    public static final java.io.File relativeTo(java.io.File file, java.io.File base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        return new java.io.File(kotlin.io.FilesKt.toRelativeString(file, base));
    }

    public static final java.io.File relativeToOrSelf(java.io.File file, java.io.File base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        java.lang.String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        return relativeStringOrNull$FilesKt__UtilsKt != null ? new java.io.File(relativeStringOrNull$FilesKt__UtilsKt) : file;
    }

    public static final java.io.File relativeToOrNull(java.io.File file, java.io.File base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        java.lang.String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return new java.io.File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return null;
    }

    private static final java.lang.String toRelativeStringOrNull$FilesKt__UtilsKt(java.io.File file, java.io.File file2) {
        kotlin.io.FilePathComponents normalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(kotlin.io.FilesKt.toComponents(file));
        kotlin.io.FilePathComponents normalize$FilesKt__UtilsKt2 = normalize$FilesKt__UtilsKt(kotlin.io.FilesKt.toComponents(file2));
        if (!kotlin.jvm.internal.Intrinsics.areEqual(normalize$FilesKt__UtilsKt.getRoot(), normalize$FilesKt__UtilsKt2.getRoot())) {
            return null;
        }
        int size = normalize$FilesKt__UtilsKt2.getSize();
        int size2 = normalize$FilesKt__UtilsKt.getSize();
        int i = 0;
        int min = java.lang.Math.min(size2, size);
        while (i < min && kotlin.jvm.internal.Intrinsics.areEqual(normalize$FilesKt__UtilsKt.getSegments().get(i), normalize$FilesKt__UtilsKt2.getSegments().get(i))) {
            i++;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = size - 1;
        if (i <= i2) {
            while (!kotlin.jvm.internal.Intrinsics.areEqual(normalize$FilesKt__UtilsKt2.getSegments().get(i2).getName(), "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(java.io.File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < size2) {
            if (i < size) {
                sb.append(java.io.File.separatorChar);
            }
            java.lang.String separator = java.io.File.separator;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(separator, "separator");
            kotlin.collections.CollectionsKt.joinTo(kotlin.collections.CollectionsKt.drop(normalize$FilesKt__UtilsKt.getSegments(), i), sb, (r14 & 2) != 0 ? ", " : separator, (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        }
        return sb.toString();
    }

    public static /* synthetic */ java.io.File copyTo$default(java.io.File file, java.io.File file2, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return kotlin.io.FilesKt.copyTo(file, file2, z, i);
    }

    public static final java.io.File copyTo(java.io.File file, java.io.File target, boolean z, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new kotlin.io.NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z) {
                throw new kotlin.io.FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new kotlin.io.FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new kotlin.io.FileSystemException(file, target, "Failed to create target directory.");
            }
        } else {
            java.io.File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            java.io.FileOutputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                java.io.FileInputStream fileInputStream2 = fileInputStream;
                fileInputStream = new java.io.FileOutputStream(target);
                try {
                    kotlin.io.ByteStreamsKt.copyTo(fileInputStream2, fileInputStream, i);
                    kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                    kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        }
        return target;
    }

    public static /* synthetic */ boolean copyRecursively$default(java.io.File file, java.io.File file2, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: kotlin.io.FilesKt__UtilsKt$copyRecursively$1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Void invoke(java.io.File file3, java.io.IOException exception) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file3, "<anonymous parameter 0>");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        return kotlin.io.FilesKt.copyRecursively(file, file2, z, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean copyRecursively(java.io.File r11, java.io.File r12, boolean r13, final kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.OnErrorAction> r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2e
            kotlin.io.NoSuchFileException r12 = new kotlin.io.NoSuchFileException
            r5 = 0
            r7 = 2
            r8 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.invoke(r11, r12)
            kotlin.io.OnErrorAction r12 = kotlin.io.OnErrorAction.TERMINATE
            if (r11 == r12) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            return r1
        L2e:
            kotlin.io.FileTreeWalk r0 = kotlin.io.FilesKt.walkTopDown(r11)     // Catch: kotlin.io.TerminateException -> Lde
            kotlin.io.FilesKt__UtilsKt$copyRecursively$2 r3 = new kotlin.io.FilesKt__UtilsKt$copyRecursively$2     // Catch: kotlin.io.TerminateException -> Lde
            r3.<init>()     // Catch: kotlin.io.TerminateException -> Lde
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3     // Catch: kotlin.io.TerminateException -> Lde
            kotlin.io.FileTreeWalk r0 = r0.onFail(r3)     // Catch: kotlin.io.TerminateException -> Lde
            java.util.Iterator r0 = r0.iterator()     // Catch: kotlin.io.TerminateException -> Lde
        L41:
            boolean r3 = r0.hasNext()     // Catch: kotlin.io.TerminateException -> Lde
            if (r3 == 0) goto Ldd
            java.lang.Object r3 = r0.next()     // Catch: kotlin.io.TerminateException -> Lde
            java.io.File r3 = (java.io.File) r3     // Catch: kotlin.io.TerminateException -> Lde
            boolean r4 = r3.exists()     // Catch: kotlin.io.TerminateException -> Lde
            if (r4 != 0) goto L68
            kotlin.io.NoSuchFileException r10 = new kotlin.io.NoSuchFileException     // Catch: kotlin.io.TerminateException -> Lde
            r6 = 0
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: kotlin.io.TerminateException -> Lde
            java.lang.Object r3 = r14.invoke(r3, r10)     // Catch: kotlin.io.TerminateException -> Lde
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> Lde
            if (r3 != r4) goto L41
            return r2
        L68:
            java.lang.String r4 = kotlin.io.FilesKt.toRelativeString(r3, r11)     // Catch: kotlin.io.TerminateException -> Lde
            java.io.File r5 = new java.io.File     // Catch: kotlin.io.TerminateException -> Lde
            r5.<init>(r12, r4)     // Catch: kotlin.io.TerminateException -> Lde
            boolean r4 = r5.exists()     // Catch: kotlin.io.TerminateException -> Lde
            if (r4 == 0) goto Lae
            boolean r4 = r3.isDirectory()     // Catch: kotlin.io.TerminateException -> Lde
            if (r4 == 0) goto L83
            boolean r4 = r5.isDirectory()     // Catch: kotlin.io.TerminateException -> Lde
            if (r4 != 0) goto Lae
        L83:
            if (r13 != 0) goto L87
        L85:
            r4 = 1
            goto L9c
        L87:
            boolean r4 = r5.isDirectory()     // Catch: kotlin.io.TerminateException -> Lde
            if (r4 == 0) goto L94
            boolean r4 = kotlin.io.FilesKt.deleteRecursively(r5)     // Catch: kotlin.io.TerminateException -> Lde
            if (r4 != 0) goto L9b
            goto L85
        L94:
            boolean r4 = r5.delete()     // Catch: kotlin.io.TerminateException -> Lde
            if (r4 != 0) goto L9b
            goto L85
        L9b:
            r4 = 0
        L9c:
            if (r4 == 0) goto Lae
            kotlin.io.FileAlreadyExistsException r4 = new kotlin.io.FileAlreadyExistsException     // Catch: kotlin.io.TerminateException -> Lde
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch: kotlin.io.TerminateException -> Lde
            java.lang.Object r3 = r14.invoke(r5, r4)     // Catch: kotlin.io.TerminateException -> Lde
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> Lde
            if (r3 != r4) goto L41
            return r2
        Lae:
            boolean r4 = r3.isDirectory()     // Catch: kotlin.io.TerminateException -> Lde
            if (r4 == 0) goto Lb8
            r5.mkdirs()     // Catch: kotlin.io.TerminateException -> Lde
            goto L41
        Lb8:
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = kotlin.io.FilesKt.copyTo$default(r4, r5, r6, r7, r8, r9)     // Catch: kotlin.io.TerminateException -> Lde
            long r4 = r4.length()     // Catch: kotlin.io.TerminateException -> Lde
            long r6 = r3.length()     // Catch: kotlin.io.TerminateException -> Lde
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L41
            java.io.IOException r4 = new java.io.IOException     // Catch: kotlin.io.TerminateException -> Lde
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch: kotlin.io.TerminateException -> Lde
            java.lang.Object r3 = r14.invoke(r3, r4)     // Catch: kotlin.io.TerminateException -> Lde
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> Lde
            if (r3 != r4) goto L41
            return r2
        Ldd:
            return r1
        Lde:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__UtilsKt.copyRecursively(java.io.File, java.io.File, boolean, kotlin.jvm.functions.Function2):boolean");
    }

    public static final boolean deleteRecursively(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z = true;
            for (java.io.File file2 : kotlin.io.FilesKt.walkBottomUp(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static final boolean startsWith(java.io.File file, java.io.File other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(file);
        kotlin.io.FilePathComponents components2 = kotlin.io.FilesKt.toComponents(other);
        if (kotlin.jvm.internal.Intrinsics.areEqual(components.getRoot(), components2.getRoot()) && components.getSize() >= components2.getSize()) {
            return components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
        }
        return false;
    }

    public static final boolean startsWith(java.io.File file, java.lang.String other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return kotlin.io.FilesKt.startsWith(file, new java.io.File(other));
    }

    public static final boolean endsWith(java.io.File file, java.io.File other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(file);
        kotlin.io.FilePathComponents components2 = kotlin.io.FilesKt.toComponents(other);
        if (components2.isRooted()) {
            return kotlin.jvm.internal.Intrinsics.areEqual(file, other);
        }
        int size = components.getSize() - components2.getSize();
        if (size < 0) {
            return false;
        }
        return components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    public static final boolean endsWith(java.io.File file, java.lang.String other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return kotlin.io.FilesKt.endsWith(file, new java.io.File(other));
    }

    public static final java.io.File normalize(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(file);
        java.io.File root = components.getRoot();
        java.util.List<java.io.File> normalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(components.getSegments());
        java.lang.String separator = java.io.File.separator;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(separator, "separator");
        return kotlin.io.FilesKt.resolve(root, kotlin.collections.CollectionsKt.joinToString$default(normalize$FilesKt__UtilsKt, separator, null, null, 0, null, null, 62, null));
    }

    private static final kotlin.io.FilePathComponents normalize$FilesKt__UtilsKt(kotlin.io.FilePathComponents filePathComponents) {
        return new kotlin.io.FilePathComponents(filePathComponents.getRoot(), normalize$FilesKt__UtilsKt(filePathComponents.getSegments()));
    }

    private static final java.util.List<java.io.File> normalize$FilesKt__UtilsKt(java.util.List<? extends java.io.File> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.io.File file : list) {
            java.lang.String name = file.getName();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(name, ".")) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || kotlin.jvm.internal.Intrinsics.areEqual(((java.io.File) kotlin.collections.CollectionsKt.last((java.util.List) arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    public static final java.io.File resolve(java.io.File file, java.io.File relative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relative, "relative");
        if (kotlin.io.FilesKt.isRooted(relative)) {
            return relative;
        }
        java.lang.String file2 = file.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(file2, "this.toString()");
        java.lang.String str = file2;
        if ((str.length() == 0) || kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str, java.io.File.separatorChar, false, 2, (java.lang.Object) null)) {
            return new java.io.File(file2 + relative);
        }
        return new java.io.File(file2 + java.io.File.separatorChar + relative);
    }

    public static final java.io.File resolve(java.io.File file, java.lang.String relative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relative, "relative");
        return kotlin.io.FilesKt.resolve(file, new java.io.File(relative));
    }

    public static final java.io.File resolveSibling(java.io.File file, java.io.File relative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relative, "relative");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(file);
        return kotlin.io.FilesKt.resolve(kotlin.io.FilesKt.resolve(components.getRoot(), components.getSize() == 0 ? new java.io.File("..") : components.subPath(0, components.getSize() - 1)), relative);
    }

    public static final java.io.File resolveSibling(java.io.File file, java.lang.String relative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relative, "relative");
        return kotlin.io.FilesKt.resolveSibling(file, new java.io.File(relative));
    }
}
