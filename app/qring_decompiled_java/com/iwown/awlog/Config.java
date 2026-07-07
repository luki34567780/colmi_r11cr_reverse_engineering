package com.iwown.awlog;

/* loaded from: /tmp/dex/classes2.dex */
public interface Config {
    com.iwown.awlog.Config configFileEngine(com.iwown.awlog.file.IFileEngine iFileEngine);

    com.iwown.awlog.Config configGlobalLabelPrefix(java.lang.String str);

    com.iwown.awlog.Config configJsonFormat(com.iwown.awlog.parse.IJson iJson);

    com.iwown.awlog.Config configLogLevel(int i);

    com.iwown.awlog.Config configLogSwitch(boolean z);

    com.iwown.awlog.Config configMethodOffset(int i);

    com.iwown.awlog.Config configShowBorders(boolean z);
}
