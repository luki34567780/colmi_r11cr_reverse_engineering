package com.iwown.awlog.file;

/* loaded from: /tmp/dex/classes2.dex */
public class JavaIoFileImpl implements com.iwown.awlog.file.IFileEngine {
    private android.content.Context context;

    @Override // com.iwown.awlog.file.IFileEngine
    public void flushAsync() {
    }

    @Override // com.iwown.awlog.file.IFileEngine
    public void release() {
    }

    public JavaIoFileImpl(android.content.Context context) {
        this.context = context;
    }

    @Override // com.iwown.awlog.file.IFileEngine
    public void writeToFile(java.io.File file, java.lang.String str) {
        java.io.FileWriter fileWriter;
        java.io.FileWriter fileWriter2 = null;
        try {
            try {
                try {
                    fileWriter = new java.io.FileWriter(file, true);
                } catch (java.lang.Exception e) {
                    e = e;
                }
            } catch (java.lang.Throwable th) {
                th = th;
            }
            try {
                fileWriter.write(str);
                fileWriter.write("\r\n");
                fileWriter.flush();
                fileWriter.close();
            } catch (java.lang.Exception e2) {
                e = e2;
                fileWriter2 = fileWriter;
                e.printStackTrace();
                if (fileWriter2 != null) {
                    fileWriter2.close();
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                if (fileWriter2 != null) {
                    try {
                        fileWriter2.close();
                    } catch (java.lang.Exception e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception e4) {
            e4.printStackTrace();
        }
    }
}
