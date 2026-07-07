package com.bumptech.glide.manager;

/* loaded from: /tmp/dex/classes2.dex */
final class EmptyRequestManagerTreeNode implements com.bumptech.glide.manager.RequestManagerTreeNode {
    EmptyRequestManagerTreeNode() {
    }

    @Override // com.bumptech.glide.manager.RequestManagerTreeNode
    public java.util.Set<com.bumptech.glide.RequestManager> getDescendants() {
        return java.util.Collections.emptySet();
    }
}
