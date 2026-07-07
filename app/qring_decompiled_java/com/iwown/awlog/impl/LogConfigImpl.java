package com.iwown.awlog.impl;

/* loaded from: /tmp/dex/classes2.dex */
public class LogConfigImpl implements com.iwown.awlog.Config {
    private static com.iwown.awlog.impl.LogConfigImpl awLogConfig;
    private com.iwown.awlog.file.IFileEngine engine;
    private com.iwown.awlog.parse.IJson json;
    private java.lang.String prefix;
    private boolean logSwitch = true;
    private boolean showBorder = true;
    int logLevel = 2;
    private int methodOffset = 0;

    private LogConfigImpl() {
    }

    public static com.iwown.awlog.impl.LogConfigImpl getInstance() {
        synchronized (com.iwown.awlog.impl.LogConfigImpl.class) {
            if (awLogConfig == null) {
                awLogConfig = new com.iwown.awlog.impl.LogConfigImpl();
            }
        }
        return awLogConfig;
    }

    public java.lang.String getPrefix() {
        return this.prefix;
    }

    public boolean isShowBorder() {
        return this.showBorder;
    }

    public int getLogLevel() {
        return this.logLevel;
    }

    public int getMethodOffset() {
        return this.methodOffset;
    }

    public boolean isLogSwitch() {
        return this.logSwitch;
    }

    @Override // com.iwown.awlog.Config
    public com.iwown.awlog.Config configLogSwitch(boolean z) {
        this.logSwitch = z;
        return this;
    }

    @Override // com.iwown.awlog.Config
    public com.iwown.awlog.Config configGlobalLabelPrefix(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        this.prefix = str;
        return this;
    }

    @Override // com.iwown.awlog.Config
    public com.iwown.awlog.Config configShowBorders(boolean z) {
        this.showBorder = z;
        return this;
    }

    @Override // com.iwown.awlog.Config
    public com.iwown.awlog.Config configLogLevel(int i) {
        this.logLevel = i;
        return this;
    }

    @Override // com.iwown.awlog.Config
    public com.iwown.awlog.Config configJsonFormat(com.iwown.awlog.parse.IJson iJson) {
        this.json = iJson;
        return this;
    }

    @Override // com.iwown.awlog.Config
    public com.iwown.awlog.Config configFileEngine(com.iwown.awlog.file.IFileEngine iFileEngine) {
        this.engine = iFileEngine;
        return this;
    }

    @Override // com.iwown.awlog.Config
    public com.iwown.awlog.Config configMethodOffset(int i) {
        this.methodOffset = i;
        return this;
    }

    public com.iwown.awlog.parse.IJson getJson() {
        return this.json;
    }

    public com.iwown.awlog.file.IFileEngine getEngine() {
        return this.engine;
    }
}
