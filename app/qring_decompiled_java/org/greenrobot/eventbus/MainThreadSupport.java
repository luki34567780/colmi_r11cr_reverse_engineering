package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
public interface MainThreadSupport {
    org.greenrobot.eventbus.Poster createPoster(org.greenrobot.eventbus.EventBus eventBus);

    boolean isMainThread();
}
