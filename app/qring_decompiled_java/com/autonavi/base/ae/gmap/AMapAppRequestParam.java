package com.autonavi.base.ae.gmap;

/* loaded from: classes.dex */
public class AMapAppRequestParam {
    public static final int RESOURCE_TYPE_ABSPATH = 4;
    public static final int RESOURCE_TYPE_BINARY = 3;
    public static final int RESOURCE_TYPE_IMAGE = 1;
    public static final int RESOURCE_TYPE_NONE = 0;
    public static final int RESOURCE_TYPE_SVG = 2;
    private com.autonavi.base.ae.gmap.ResourceCallback callback;
    private java.lang.String url;
    private int resourceType = 0;
    private long contextId = 0;
    private int expectWidth = 0;
    private int expectHeight = 0;

    public com.autonavi.base.ae.gmap.ResourceCallback getCallback() {
        return this.callback;
    }

    public void setCallback(com.autonavi.base.ae.gmap.ResourceCallback resourceCallback) {
        this.callback = resourceCallback;
    }

    public void generateCallback(long j) {
        this.callback = new com.autonavi.base.ae.gmap.ResourceCallback(j);
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public void setUrl(java.lang.String str) {
        this.url = str;
    }

    public int getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(int i) {
        this.resourceType = i;
    }

    public long getContextId() {
        return this.contextId;
    }

    public void setContextId(long j) {
        this.contextId = j;
    }

    public int getExpectWidth() {
        return this.expectWidth;
    }

    public void setExpectWidth(int i) {
        this.expectWidth = i;
    }

    public int getExpectHeight() {
        return this.expectHeight;
    }

    public void setExpectHeight(int i) {
        this.expectHeight = i;
    }
}
