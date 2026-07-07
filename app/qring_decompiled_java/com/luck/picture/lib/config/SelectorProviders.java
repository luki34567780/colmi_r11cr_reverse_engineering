package com.luck.picture.lib.config;

/* loaded from: /tmp/dex/classes2.dex */
public class SelectorProviders {
    private static volatile com.luck.picture.lib.config.SelectorProviders selectorProviders;
    private final java.util.LinkedList<com.luck.picture.lib.config.SelectorConfig> selectionConfigsQueue = new java.util.LinkedList<>();

    public void addSelectorConfigQueue(com.luck.picture.lib.config.SelectorConfig selectorConfig) {
        this.selectionConfigsQueue.add(selectorConfig);
    }

    public com.luck.picture.lib.config.SelectorConfig getSelectorConfig() {
        return this.selectionConfigsQueue.size() > 0 ? this.selectionConfigsQueue.getLast() : new com.luck.picture.lib.config.SelectorConfig();
    }

    public void destroy() {
        com.luck.picture.lib.config.SelectorConfig selectorConfig = getSelectorConfig();
        if (selectorConfig != null) {
            selectorConfig.destroy();
            this.selectionConfigsQueue.remove(selectorConfig);
        }
    }

    public void reset() {
        for (int i = 0; i < this.selectionConfigsQueue.size(); i++) {
            com.luck.picture.lib.config.SelectorConfig selectorConfig = this.selectionConfigsQueue.get(i);
            if (selectorConfig != null) {
                selectorConfig.destroy();
            }
        }
        this.selectionConfigsQueue.clear();
    }

    public static com.luck.picture.lib.config.SelectorProviders getInstance() {
        if (selectorProviders == null) {
            synchronized (com.luck.picture.lib.config.SelectorProviders.class) {
                if (selectorProviders == null) {
                    selectorProviders = new com.luck.picture.lib.config.SelectorProviders();
                }
            }
        }
        return selectorProviders;
    }
}
