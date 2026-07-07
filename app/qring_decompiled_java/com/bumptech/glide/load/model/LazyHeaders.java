package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public final class LazyHeaders implements com.bumptech.glide.load.model.Headers {
    private volatile java.util.Map<java.lang.String, java.lang.String> combinedHeaders;
    private final java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> headers;

    LazyHeaders(java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> map) {
        this.headers = java.util.Collections.unmodifiableMap(map);
    }

    @Override // com.bumptech.glide.load.model.Headers
    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        if (this.combinedHeaders == null) {
            synchronized (this) {
                if (this.combinedHeaders == null) {
                    this.combinedHeaders = java.util.Collections.unmodifiableMap(generateHeaders());
                }
            }
        }
        return this.combinedHeaders;
    }

    private java.util.Map<java.lang.String, java.lang.String> generateHeaders() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> entry : this.headers.entrySet()) {
            java.lang.String buildHeaderValue = buildHeaderValue(entry.getValue());
            if (!android.text.TextUtils.isEmpty(buildHeaderValue)) {
                hashMap.put(entry.getKey(), buildHeaderValue);
            }
        }
        return hashMap;
    }

    private java.lang.String buildHeaderValue(java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.String buildHeader = list.get(i).buildHeader();
            if (!android.text.TextUtils.isEmpty(buildHeader)) {
                sb.append(buildHeader);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    public java.lang.String toString() {
        return "LazyHeaders{headers=" + this.headers + '}';
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.bumptech.glide.load.model.LazyHeaders) {
            return this.headers.equals(((com.bumptech.glide.load.model.LazyHeaders) obj).headers);
        }
        return false;
    }

    public int hashCode() {
        return this.headers.hashCode();
    }

    public static final class Builder {
        private static final java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> DEFAULT_HEADERS;
        private static final java.lang.String DEFAULT_USER_AGENT;
        private static final java.lang.String USER_AGENT_HEADER = "User-Agent";
        private boolean copyOnModify = true;
        private java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> headers = DEFAULT_HEADERS;
        private boolean isUserAgentDefault = true;

        static {
            java.lang.String sanitizedUserAgent = getSanitizedUserAgent();
            DEFAULT_USER_AGENT = sanitizedUserAgent;
            java.util.HashMap hashMap = new java.util.HashMap(2);
            if (!android.text.TextUtils.isEmpty(sanitizedUserAgent)) {
                hashMap.put("User-Agent", java.util.Collections.singletonList(new com.bumptech.glide.load.model.LazyHeaders.StringHeaderFactory(sanitizedUserAgent)));
            }
            DEFAULT_HEADERS = java.util.Collections.unmodifiableMap(hashMap);
        }

        public com.bumptech.glide.load.model.LazyHeaders.Builder addHeader(java.lang.String str, java.lang.String str2) {
            return addHeader(str, new com.bumptech.glide.load.model.LazyHeaders.StringHeaderFactory(str2));
        }

        public com.bumptech.glide.load.model.LazyHeaders.Builder addHeader(java.lang.String str, com.bumptech.glide.load.model.LazyHeaderFactory lazyHeaderFactory) {
            if (this.isUserAgentDefault && "User-Agent".equalsIgnoreCase(str)) {
                return setHeader(str, lazyHeaderFactory);
            }
            copyIfNecessary();
            getFactories(str).add(lazyHeaderFactory);
            return this;
        }

        public com.bumptech.glide.load.model.LazyHeaders.Builder setHeader(java.lang.String str, java.lang.String str2) {
            return setHeader(str, str2 == null ? null : new com.bumptech.glide.load.model.LazyHeaders.StringHeaderFactory(str2));
        }

        public com.bumptech.glide.load.model.LazyHeaders.Builder setHeader(java.lang.String str, com.bumptech.glide.load.model.LazyHeaderFactory lazyHeaderFactory) {
            copyIfNecessary();
            if (lazyHeaderFactory == null) {
                this.headers.remove(str);
            } else {
                java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory> factories = getFactories(str);
                factories.clear();
                factories.add(lazyHeaderFactory);
            }
            if (this.isUserAgentDefault && "User-Agent".equalsIgnoreCase(str)) {
                this.isUserAgentDefault = false;
            }
            return this;
        }

        private java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory> getFactories(java.lang.String str) {
            java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory> list = this.headers.get(str);
            if (list != null) {
                return list;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.headers.put(str, arrayList);
            return arrayList;
        }

        private void copyIfNecessary() {
            if (this.copyOnModify) {
                this.copyOnModify = false;
                this.headers = copyHeaders();
            }
        }

        public com.bumptech.glide.load.model.LazyHeaders build() {
            this.copyOnModify = true;
            return new com.bumptech.glide.load.model.LazyHeaders(this.headers);
        }

        private java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> copyHeaders() {
            java.util.HashMap hashMap = new java.util.HashMap(this.headers.size());
            for (java.util.Map.Entry<java.lang.String, java.util.List<com.bumptech.glide.load.model.LazyHeaderFactory>> entry : this.headers.entrySet()) {
                hashMap.put(entry.getKey(), new java.util.ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        static java.lang.String getSanitizedUserAgent() {
            java.lang.String property = java.lang.System.getProperty("http.agent");
            if (android.text.TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }
    }

    static final class StringHeaderFactory implements com.bumptech.glide.load.model.LazyHeaderFactory {
        private final java.lang.String value;

        StringHeaderFactory(java.lang.String str) {
            this.value = str;
        }

        @Override // com.bumptech.glide.load.model.LazyHeaderFactory
        public java.lang.String buildHeader() {
            return this.value;
        }

        public java.lang.String toString() {
            return "StringHeaderFactory{value='" + this.value + "'}";
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof com.bumptech.glide.load.model.LazyHeaders.StringHeaderFactory) {
                return this.value.equals(((com.bumptech.glide.load.model.LazyHeaders.StringHeaderFactory) obj).value);
            }
            return false;
        }

        public int hashCode() {
            return this.value.hashCode();
        }
    }
}
