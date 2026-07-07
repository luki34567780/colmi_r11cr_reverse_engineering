package com.liulishuo.okdownload.core;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class IdentifiedTask {
    public static final java.io.File EMPTY_FILE = new java.io.File("");
    public static final java.lang.String EMPTY_URL = "";

    public abstract java.lang.String getFilename();

    public abstract int getId();

    public abstract java.io.File getParentFile();

    protected abstract java.io.File getProvidedPathFile();

    public abstract java.lang.String getUrl();

    public boolean compareIgnoreId(com.liulishuo.okdownload.core.IdentifiedTask identifiedTask) {
        if (!getUrl().equals(identifiedTask.getUrl()) || getUrl().equals("") || getParentFile().equals(EMPTY_FILE)) {
            return false;
        }
        if (getProvidedPathFile().equals(identifiedTask.getProvidedPathFile())) {
            return true;
        }
        if (!getParentFile().equals(identifiedTask.getParentFile())) {
            return false;
        }
        java.lang.String filename = getFilename();
        java.lang.String filename2 = identifiedTask.getFilename();
        return (filename2 == null || filename == null || !filename2.equals(filename)) ? false : true;
    }
}
