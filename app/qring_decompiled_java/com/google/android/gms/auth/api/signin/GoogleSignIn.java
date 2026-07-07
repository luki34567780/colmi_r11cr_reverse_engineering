package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class GoogleSignIn {
    private GoogleSignIn() {
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount getAccountForExtension(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "please provide a valid Context object");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptionsExtension, "please provide valid GoogleSignInOptionsExtension");
        com.google.android.gms.auth.api.signin.GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context);
        if (lastSignedInAccount == null) {
            lastSignedInAccount = com.google.android.gms.auth.api.signin.GoogleSignInAccount.createDefault();
        }
        return lastSignedInAccount.requestExtraScopes(zbb(googleSignInOptionsExtension.getImpliedScopes()));
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount getAccountForScopes(android.content.Context context, com.google.android.gms.common.api.Scope scope, com.google.android.gms.common.api.Scope... scopeArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "please provide a valid Context object");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(scope, "please provide at least one valid scope");
        com.google.android.gms.auth.api.signin.GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context);
        if (lastSignedInAccount == null) {
            lastSignedInAccount = com.google.android.gms.auth.api.signin.GoogleSignInAccount.createDefault();
        }
        lastSignedInAccount.requestExtraScopes(scope);
        lastSignedInAccount.requestExtraScopes(scopeArr);
        return lastSignedInAccount;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInClient getClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInClient(activity, (com.google.android.gms.auth.api.signin.GoogleSignInOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions));
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount getLastSignedInAccount(android.content.Context context) {
        return com.google.android.gms.auth.api.signin.internal.zbn.zbc(context).zba();
    }

    public static com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> getSignedInAccountFromIntent(android.content.Intent intent) {
        com.google.android.gms.auth.api.signin.GoogleSignInResult zbd = com.google.android.gms.auth.api.signin.internal.zbm.zbd(intent);
        com.google.android.gms.auth.api.signin.GoogleSignInAccount signInAccount = zbd.getSignInAccount();
        return (!zbd.getStatus().isSuccess() || signInAccount == null) ? com.google.android.gms.tasks.Tasks.forException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(zbd.getStatus())) : com.google.android.gms.tasks.Tasks.forResult(signInAccount);
    }

    public static boolean hasPermissions(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
        return hasPermissions(googleSignInAccount, zbb(googleSignInOptionsExtension.getImpliedScopes()));
    }

    public static void requestPermissions(android.app.Activity activity, int i, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Please provide a non-null Activity");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
        requestPermissions(activity, i, googleSignInAccount, zbb(googleSignInOptionsExtension.getImpliedScopes()));
    }

    private static android.content.Intent zba(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Scope... scopeArr) {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder builder = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder();
        if (scopeArr.length > 0) {
            builder.requestScopes(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !android.text.TextUtils.isEmpty(googleSignInAccount.getEmail())) {
            builder.setAccountName((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInAccount.getEmail()));
        }
        return new com.google.android.gms.auth.api.signin.GoogleSignInClient(activity, builder.build()).getSignInIntent();
    }

    private static com.google.android.gms.common.api.Scope[] zbb(java.util.List list) {
        return list == null ? new com.google.android.gms.common.api.Scope[0] : (com.google.android.gms.common.api.Scope[]) list.toArray(new com.google.android.gms.common.api.Scope[list.size()]);
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInClient getClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInClient(context, (com.google.android.gms.auth.api.signin.GoogleSignInOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions));
    }

    public static boolean hasPermissions(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Scope... scopeArr) {
        if (googleSignInAccount == null) {
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Collections.addAll(hashSet, scopeArr);
        return googleSignInAccount.getGrantedScopes().containsAll(hashSet);
    }

    public static void requestPermissions(android.app.Activity activity, int i, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Scope... scopeArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Please provide a non-null Activity");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(zba(activity, googleSignInAccount, scopeArr), i);
    }

    public static void requestPermissions(androidx.fragment.app.Fragment fragment, int i, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(fragment, "Please provide a non-null Fragment");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
        requestPermissions(fragment, i, googleSignInAccount, zbb(googleSignInOptionsExtension.getImpliedScopes()));
    }

    public static void requestPermissions(androidx.fragment.app.Fragment fragment, int i, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Scope... scopeArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(fragment, "Please provide a non-null Fragment");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(scopeArr, "Please provide at least one scope");
        fragment.startActivityForResult(zba(fragment.getActivity(), googleSignInAccount, scopeArr), i);
    }
}
