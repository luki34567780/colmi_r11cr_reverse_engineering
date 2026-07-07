package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class ProcessUtils {

    @javax.annotation.Nullable
    private static java.lang.String zza;
    private static int zzb;

    private ProcessUtils() {
    }

    public static java.lang.String getMyProcessName() {
        java.io.BufferedReader bufferedReader;
        if (zza == null) {
            int i = zzb;
            if (i == 0) {
                i = android.os.Process.myPid();
                zzb = i;
            }
            java.lang.String str = null;
            str = null;
            str = null;
            java.io.BufferedReader bufferedReader2 = null;
            if (i > 0) {
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(25);
                    sb.append("/proc/");
                    sb.append(i);
                    sb.append("/cmdline");
                    java.lang.String sb2 = sb.toString();
                    android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new java.io.BufferedReader(new java.io.FileReader(sb2));
                        try {
                            java.lang.String readLine = bufferedReader.readLine();
                            com.google.android.gms.common.internal.Preconditions.checkNotNull(readLine);
                            str = readLine.trim();
                        } catch (java.io.IOException unused) {
                        } catch (java.lang.Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedReader2);
                            throw th;
                        }
                    } finally {
                        android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (java.io.IOException unused2) {
                    bufferedReader = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
                com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedReader);
            }
            zza = str;
        }
        return zza;
    }
}
