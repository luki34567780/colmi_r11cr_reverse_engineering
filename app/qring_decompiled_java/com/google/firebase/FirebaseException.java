package com.google.firebase;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class FirebaseException extends java.lang.Exception {
    @java.lang.Deprecated
    protected FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(java.lang.String str) {
        super(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
