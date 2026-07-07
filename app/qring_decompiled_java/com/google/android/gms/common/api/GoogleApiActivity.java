package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface.OnCancelListener {
    protected int zaa = 0;

    public static android.content.Intent zaa(android.content.Context context, android.app.PendingIntent pendingIntent, int i, boolean z) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.gms.common.api.GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    private final void zab() {
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            android.util.Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) extras.get("pending_intent");
        java.lang.Integer num = (java.lang.Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            android.util.Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            com.google.android.gms.common.GoogleApiAvailability.getInstance().showErrorDialogFragment(this, ((java.lang.Integer) com.google.android.gms.common.internal.Preconditions.checkNotNull(num)).intValue(), 2, this);
            this.zaa = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.zaa = 1;
        } catch (android.content.ActivityNotFoundException e) {
            if (extras.getBoolean("notify_manager", true)) {
                com.google.android.gms.common.api.internal.GoogleApiManager.zam(this).zaz(new com.google.android.gms.common.ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                java.lang.String obj = pendingIntent.toString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 36);
                sb.append("Activity not found while launching ");
                sb.append(obj);
                sb.append(".");
                java.lang.String sb2 = sb.toString();
                if (android.os.Build.FINGERPRINT.contains("generic")) {
                    sb2 = sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                android.util.Log.e("GoogleApiActivity", sb2, e);
            }
            this.zaa = 1;
            finish();
        } catch (android.content.IntentSender.SendIntentException e2) {
            android.util.Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.zaa = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.GoogleApiManager zam = com.google.android.gms.common.api.internal.GoogleApiManager.zam(this);
                if (i2 == -1) {
                    zam.zaA();
                } else if (i2 == 0) {
                    zam.zaz(new com.google.android.gms.common.ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.zaa = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.zaa = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zaa = bundle.getInt("resolution");
        }
        if (this.zaa != 1) {
            zab();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putInt("resolution", this.zaa);
        super.onSaveInstanceState(bundle);
    }
}
