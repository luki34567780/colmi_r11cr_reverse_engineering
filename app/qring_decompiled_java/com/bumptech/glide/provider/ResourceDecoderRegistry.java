package com.bumptech.glide.provider;

/* loaded from: /tmp/dex/classes2.dex */
public class ResourceDecoderRegistry {
    private final java.util.List<java.lang.String> bucketPriorityList = new java.util.ArrayList();
    private final java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.provider.ResourceDecoderRegistry.Entry<?, ?>>> decoders = new java.util.HashMap();

    public synchronized void setBucketPriorityList(java.util.List<java.lang.String> list) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(this.bucketPriorityList);
        this.bucketPriorityList.clear();
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            this.bucketPriorityList.add(it.next());
        }
        for (java.lang.String str : arrayList) {
            if (!list.contains(str)) {
                this.bucketPriorityList.add(str);
            }
        }
    }

    public synchronized <T, R> java.util.List<com.bumptech.glide.load.ResourceDecoder<T, R>> getDecoders(java.lang.Class<T> cls, java.lang.Class<R> cls2) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = this.bucketPriorityList.iterator();
        while (it.hasNext()) {
            java.util.List<com.bumptech.glide.provider.ResourceDecoderRegistry.Entry<?, ?>> list = this.decoders.get(it.next());
            if (list != null) {
                for (com.bumptech.glide.provider.ResourceDecoderRegistry.Entry<?, ?> entry : list) {
                    if (entry.handles(cls, cls2)) {
                        arrayList.add(entry.decoder);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> java.util.List<java.lang.Class<R>> getResourceClasses(java.lang.Class<T> cls, java.lang.Class<R> cls2) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = this.bucketPriorityList.iterator();
        while (it.hasNext()) {
            java.util.List<com.bumptech.glide.provider.ResourceDecoderRegistry.Entry<?, ?>> list = this.decoders.get(it.next());
            if (list != null) {
                for (com.bumptech.glide.provider.ResourceDecoderRegistry.Entry<?, ?> entry : list) {
                    if (entry.handles(cls, cls2) && !arrayList.contains(entry.resourceClass)) {
                        arrayList.add(entry.resourceClass);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void append(java.lang.String str, com.bumptech.glide.load.ResourceDecoder<T, R> resourceDecoder, java.lang.Class<T> cls, java.lang.Class<R> cls2) {
        getOrAddEntryList(str).add(new com.bumptech.glide.provider.ResourceDecoderRegistry.Entry<>(cls, cls2, resourceDecoder));
    }

    public synchronized <T, R> void prepend(java.lang.String str, com.bumptech.glide.load.ResourceDecoder<T, R> resourceDecoder, java.lang.Class<T> cls, java.lang.Class<R> cls2) {
        getOrAddEntryList(str).add(0, new com.bumptech.glide.provider.ResourceDecoderRegistry.Entry<>(cls, cls2, resourceDecoder));
    }

    private synchronized java.util.List<com.bumptech.glide.provider.ResourceDecoderRegistry.Entry<?, ?>> getOrAddEntryList(java.lang.String str) {
        java.util.List<com.bumptech.glide.provider.ResourceDecoderRegistry.Entry<?, ?>> list;
        if (!this.bucketPriorityList.contains(str)) {
            this.bucketPriorityList.add(str);
        }
        list = this.decoders.get(str);
        if (list == null) {
            list = new java.util.ArrayList<>();
            this.decoders.put(str, list);
        }
        return list;
    }

    private static class Entry<T, R> {
        private final java.lang.Class<T> dataClass;
        final com.bumptech.glide.load.ResourceDecoder<T, R> decoder;
        final java.lang.Class<R> resourceClass;

        public Entry(java.lang.Class<T> cls, java.lang.Class<R> cls2, com.bumptech.glide.load.ResourceDecoder<T, R> resourceDecoder) {
            this.dataClass = cls;
            this.resourceClass = cls2;
            this.decoder = resourceDecoder;
        }

        public boolean handles(java.lang.Class<?> cls, java.lang.Class<?> cls2) {
            return this.dataClass.isAssignableFrom(cls) && cls2.isAssignableFrom(this.resourceClass);
        }
    }
}
