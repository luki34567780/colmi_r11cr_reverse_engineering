package com.luck.picture.lib.basic;

/* loaded from: /tmp/dex/classes2.dex */
public interface IBridgeViewLifecycle {
    void onDestroy(androidx.fragment.app.Fragment fragment);

    void onViewCreated(androidx.fragment.app.Fragment fragment, android.view.View view, android.os.Bundle bundle);
}
