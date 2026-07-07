package com.hp.hpl.sparta;

/* compiled from: Document.java */
/* loaded from: /tmp/dex/classes2.dex */
class EmptyEnumeration implements java.util.Enumeration {
    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return false;
    }

    EmptyEnumeration() {
    }

    @Override // java.util.Enumeration
    public java.lang.Object nextElement() {
        throw new java.util.NoSuchElementException();
    }
}
