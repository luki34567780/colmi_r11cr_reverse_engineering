package com.iwown.awlog.file;

/* loaded from: /tmp/dex/classes2.dex */
public class LogFileEngineFactory implements com.iwown.awlog.file.IFileEngine {
    private android.content.Context context;
    private java.util.Map<java.lang.String, me.pqpo.librarylog4a.LogBuffer> logBufferMap;

    @Override // com.iwown.awlog.file.IFileEngine
    public void flushAsync() {
    }

    @Override // com.iwown.awlog.file.IFileEngine
    public void release() {
    }

    public LogFileEngineFactory(android.content.Context context) {
        java.util.Objects.requireNonNull(context, "Context must not null!");
        this.logBufferMap = new java.util.HashMap();
        this.context = context.getApplicationContext();
    }

    @Override // com.iwown.awlog.file.IFileEngine
    public void writeToFile(java.io.File file, java.lang.String str) {
        if (this.logBufferMap.size() > 10) {
            this.logBufferMap.clear();
        }
        if (this.logBufferMap.containsKey(file.getName())) {
            this.logBufferMap.get(file.getName()).write(str);
            this.logBufferMap.get(file.getName()).flushAsync();
        } else {
            me.pqpo.librarylog4a.LogBuffer logBuffer = new me.pqpo.librarylog4a.LogBuffer(new java.io.File(this.context.getFilesDir(), ".log4aCache").getAbsolutePath(), 8192, file.getAbsolutePath(), false);
            this.logBufferMap.put(file.getName(), logBuffer);
            logBuffer.write(str);
            logBuffer.flushAsync();
        }
    }
}
