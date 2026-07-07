package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25f;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private static final float BLUR_FACTOR = 0.010416667f;
    static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667f;
    static final java.lang.String EXTRA_INT1 = "int1";
    static final java.lang.String EXTRA_INT2 = "int2";
    static final java.lang.String EXTRA_OBJ = "obj";
    static final java.lang.String EXTRA_STRING1 = "string1";
    static final java.lang.String EXTRA_TINT_LIST = "tint_list";
    static final java.lang.String EXTRA_TINT_MODE = "tint_mode";
    static final java.lang.String EXTRA_TYPE = "type";
    private static final float ICON_DIAMETER_FACTOR = 0.9166667f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334f;
    private static final java.lang.String TAG = "IconCompat";
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;
    public byte[] mData;
    public int mInt1;
    public int mInt2;
    java.lang.Object mObj1;
    public android.os.Parcelable mParcelable;
    public java.lang.String mString1;
    public android.content.res.ColorStateList mTintList;
    android.graphics.PorterDuff.Mode mTintMode;
    public java.lang.String mTintModeStr;
    public int mType;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    private static java.lang.String typeToString(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return com.oudmon.ble.base.bluetooth.BleAction.EXTRA_DATA;
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static androidx.core.graphics.drawable.IconCompat createWithResource(android.content.Context context, int i) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must not be null.");
        }
        return createWithResource(context.getResources(), context.getPackageName(), i);
    }

    public static androidx.core.graphics.drawable.IconCompat createWithResource(android.content.res.Resources resources, java.lang.String str, int i) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Package must not be null.");
        }
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Drawable resource ID must not be 0");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(2);
        iconCompat.mInt1 = i;
        if (resources != null) {
            try {
                iconCompat.mObj1 = resources.getResourceName(i);
            } catch (android.content.res.Resources.NotFoundException unused) {
                throw new java.lang.IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.mObj1 = str;
        }
        iconCompat.mString1 = str;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            throw new java.lang.IllegalArgumentException("Bitmap must not be null.");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(1);
        iconCompat.mObj1 = bitmap;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            throw new java.lang.IllegalArgumentException("Bitmap must not be null.");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(5);
        iconCompat.mObj1 = bitmap;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithData(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("Data must not be null.");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(3);
        iconCompat.mObj1 = bArr;
        iconCompat.mInt1 = i;
        iconCompat.mInt2 = i2;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Uri must not be null.");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(4);
        iconCompat.mObj1 = str;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithContentUri(android.net.Uri uri) {
        if (uri == null) {
            throw new java.lang.IllegalArgumentException("Uri must not be null.");
        }
        return createWithContentUri(uri.toString());
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Uri must not be null.");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(6);
        iconCompat.mObj1 = str;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createWithAdaptiveBitmapContentUri(android.net.Uri uri) {
        if (uri == null) {
            throw new java.lang.IllegalArgumentException("Uri must not be null.");
        }
        return createWithAdaptiveBitmapContentUri(uri.toString());
    }

    public IconCompat() {
        this.mType = -1;
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.mTintMode = DEFAULT_TINT_MODE;
        this.mTintModeStr = null;
    }

    private IconCompat(int i) {
        this.mType = -1;
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.mTintMode = DEFAULT_TINT_MODE;
        this.mTintModeStr = null;
        this.mType = i;
    }

    public int getType() {
        if (this.mType == -1 && android.os.Build.VERSION.SDK_INT >= 23) {
            return getType((android.graphics.drawable.Icon) this.mObj1);
        }
        return this.mType;
    }

    public java.lang.String getResPackage() {
        if (this.mType == -1 && android.os.Build.VERSION.SDK_INT >= 23) {
            return getResPackage((android.graphics.drawable.Icon) this.mObj1);
        }
        if (this.mType != 2) {
            throw new java.lang.IllegalStateException("called getResPackage() on " + this);
        }
        if (android.text.TextUtils.isEmpty(this.mString1)) {
            return ((java.lang.String) this.mObj1).split(":", -1)[0];
        }
        return this.mString1;
    }

    public int getResId() {
        if (this.mType == -1 && android.os.Build.VERSION.SDK_INT >= 23) {
            return getResId((android.graphics.drawable.Icon) this.mObj1);
        }
        if (this.mType != 2) {
            throw new java.lang.IllegalStateException("called getResId() on " + this);
        }
        return this.mInt1;
    }

    public android.graphics.Bitmap getBitmap() {
        if (this.mType == -1 && android.os.Build.VERSION.SDK_INT >= 23) {
            java.lang.Object obj = this.mObj1;
            if (obj instanceof android.graphics.Bitmap) {
                return (android.graphics.Bitmap) obj;
            }
            return null;
        }
        int i = this.mType;
        if (i == 1) {
            return (android.graphics.Bitmap) this.mObj1;
        }
        if (i == 5) {
            return createLegacyIconFromAdaptiveIcon((android.graphics.Bitmap) this.mObj1, true);
        }
        throw new java.lang.IllegalStateException("called getBitmap() on " + this);
    }

    public android.net.Uri getUri() {
        if (this.mType == -1 && android.os.Build.VERSION.SDK_INT >= 23) {
            return getUri((android.graphics.drawable.Icon) this.mObj1);
        }
        int i = this.mType;
        if (i != 4 && i != 6) {
            throw new java.lang.IllegalStateException("called getUri() on " + this);
        }
        return android.net.Uri.parse((java.lang.String) this.mObj1);
    }

    public androidx.core.graphics.drawable.IconCompat setTint(int i) {
        return setTintList(android.content.res.ColorStateList.valueOf(i));
    }

    public androidx.core.graphics.drawable.IconCompat setTintList(android.content.res.ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        return this;
    }

    public androidx.core.graphics.drawable.IconCompat setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.mTintMode = mode;
        return this;
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Icon toIcon() {
        return toIcon(null);
    }

    public android.graphics.drawable.Icon toIcon(android.content.Context context) {
        android.graphics.drawable.Icon createWithBitmap;
        switch (this.mType) {
            case -1:
                return (android.graphics.drawable.Icon) this.mObj1;
            case 0:
            default:
                throw new java.lang.IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = android.graphics.drawable.Icon.createWithBitmap((android.graphics.Bitmap) this.mObj1);
                break;
            case 2:
                createWithBitmap = android.graphics.drawable.Icon.createWithResource(getResPackage(), this.mInt1);
                break;
            case 3:
                createWithBitmap = android.graphics.drawable.Icon.createWithData((byte[]) this.mObj1, this.mInt1, this.mInt2);
                break;
            case 4:
                createWithBitmap = android.graphics.drawable.Icon.createWithContentUri((java.lang.String) this.mObj1);
                break;
            case 5:
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = android.graphics.drawable.Icon.createWithAdaptiveBitmap((android.graphics.Bitmap) this.mObj1);
                    break;
                } else {
                    createWithBitmap = android.graphics.drawable.Icon.createWithBitmap(createLegacyIconFromAdaptiveIcon((android.graphics.Bitmap) this.mObj1, false));
                    break;
                }
            case 6:
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(getUri());
                    break;
                } else {
                    if (context == null) {
                        throw new java.lang.IllegalArgumentException("Context is required to resolve the file uri of the icon: " + getUri());
                    }
                    java.io.InputStream uriInputStream = getUriInputStream(context);
                    if (uriInputStream == null) {
                        throw new java.lang.IllegalStateException("Cannot load adaptive icon from uri: " + getUri());
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = android.graphics.drawable.Icon.createWithAdaptiveBitmap(android.graphics.BitmapFactory.decodeStream(uriInputStream));
                        break;
                    } else {
                        createWithBitmap = android.graphics.drawable.Icon.createWithBitmap(createLegacyIconFromAdaptiveIcon(android.graphics.BitmapFactory.decodeStream(uriInputStream), false));
                        break;
                    }
                }
        }
        android.content.res.ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        android.graphics.PorterDuff.Mode mode = this.mTintMode;
        if (mode != DEFAULT_TINT_MODE) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public void checkResource(android.content.Context context) {
        java.lang.Object obj;
        if (this.mType != 2 || (obj = this.mObj1) == null) {
            return;
        }
        java.lang.String str = (java.lang.String) obj;
        if (str.contains(":")) {
            java.lang.String str2 = str.split(":", -1)[1];
            java.lang.String str3 = str2.split("/", -1)[0];
            java.lang.String str4 = str2.split("/", -1)[1];
            java.lang.String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                android.util.Log.i(TAG, "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            java.lang.String resPackage = getResPackage();
            int identifier = getResources(context, resPackage).getIdentifier(str4, str3, str5);
            if (this.mInt1 != identifier) {
                android.util.Log.i(TAG, "Id has changed for " + resPackage + " " + str);
                this.mInt1 = identifier;
            }
        }
    }

    public android.graphics.drawable.Drawable loadDrawable(android.content.Context context) {
        checkResource(context);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return toIcon(context).loadDrawable(context);
        }
        android.graphics.drawable.Drawable loadDrawableInner = loadDrawableInner(context);
        if (loadDrawableInner != null && (this.mTintList != null || this.mTintMode != DEFAULT_TINT_MODE)) {
            loadDrawableInner.mutate();
            androidx.core.graphics.drawable.DrawableCompat.setTintList(loadDrawableInner, this.mTintList);
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(loadDrawableInner, this.mTintMode);
        }
        return loadDrawableInner;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private android.graphics.drawable.Drawable loadDrawableInner(android.content.Context context) {
        switch (this.mType) {
            case 1:
                return new android.graphics.drawable.BitmapDrawable(context.getResources(), (android.graphics.Bitmap) this.mObj1);
            case 2:
                java.lang.String resPackage = getResPackage();
                if (android.text.TextUtils.isEmpty(resPackage)) {
                    resPackage = context.getPackageName();
                }
                try {
                    return androidx.core.content.res.ResourcesCompat.getDrawable(getResources(context, resPackage), this.mInt1, context.getTheme());
                } catch (java.lang.RuntimeException e) {
                    android.util.Log.e(TAG, java.lang.String.format("Unable to load resource 0x%08x from pkg=%s", java.lang.Integer.valueOf(this.mInt1), this.mObj1), e);
                    break;
                }
            case 3:
                return new android.graphics.drawable.BitmapDrawable(context.getResources(), android.graphics.BitmapFactory.decodeByteArray((byte[]) this.mObj1, this.mInt1, this.mInt2));
            case 4:
                java.io.InputStream uriInputStream = getUriInputStream(context);
                if (uriInputStream != null) {
                    return new android.graphics.drawable.BitmapDrawable(context.getResources(), android.graphics.BitmapFactory.decodeStream(uriInputStream));
                }
                return null;
            case 5:
                return new android.graphics.drawable.BitmapDrawable(context.getResources(), createLegacyIconFromAdaptiveIcon((android.graphics.Bitmap) this.mObj1, false));
            case 6:
                java.io.InputStream uriInputStream2 = getUriInputStream(context);
                if (uriInputStream2 != null) {
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        return new android.graphics.drawable.AdaptiveIconDrawable(null, new android.graphics.drawable.BitmapDrawable(context.getResources(), android.graphics.BitmapFactory.decodeStream(uriInputStream2)));
                    }
                    return new android.graphics.drawable.BitmapDrawable(context.getResources(), createLegacyIconFromAdaptiveIcon(android.graphics.BitmapFactory.decodeStream(uriInputStream2), false));
                }
                return null;
            default:
                return null;
        }
    }

    public java.io.InputStream getUriInputStream(android.content.Context context) {
        android.net.Uri uri = getUri();
        java.lang.String scheme = uri.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uri);
            } catch (java.lang.Exception e) {
                android.util.Log.w(TAG, "Unable to load image from URI: " + uri, e);
                return null;
            }
        }
        try {
            return new java.io.FileInputStream(new java.io.File((java.lang.String) this.mObj1));
        } catch (java.io.FileNotFoundException e2) {
            android.util.Log.w(TAG, "Unable to load image from path: " + uri, e2);
            return null;
        }
    }

    private static android.content.res.Resources getResources(android.content.Context context, java.lang.String str) {
        if ("android".equals(str)) {
            return android.content.res.Resources.getSystem();
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e(TAG, java.lang.String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    public void addToShortcutIntent(android.content.Intent intent, android.graphics.drawable.Drawable drawable, android.content.Context context) {
        android.graphics.Bitmap bitmap;
        checkResource(context);
        int i = this.mType;
        if (i == 1) {
            bitmap = (android.graphics.Bitmap) this.mObj1;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                android.content.Context createPackageContext = context.createPackageContext(getResPackage(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(createPackageContext, this.mInt1));
                    return;
                }
                android.graphics.drawable.Drawable drawable2 = androidx.core.content.ContextCompat.getDrawable(createPackageContext, this.mInt1);
                if (drawable2.getIntrinsicWidth() > 0 && drawable2.getIntrinsicHeight() > 0) {
                    bitmap = android.graphics.Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                    drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    drawable2.draw(new android.graphics.Canvas(bitmap));
                }
                int launcherLargeIconSize = ((android.app.ActivityManager) createPackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                bitmap = android.graphics.Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, android.graphics.Bitmap.Config.ARGB_8888);
                drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                drawable2.draw(new android.graphics.Canvas(bitmap));
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                throw new java.lang.IllegalArgumentException("Can't find package " + this.mObj1, e);
            }
        } else if (i == 5) {
            bitmap = createLegacyIconFromAdaptiveIcon((android.graphics.Bitmap) this.mObj1, true);
        } else {
            throw new java.lang.IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new android.graphics.Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        switch (this.mType) {
            case -1:
                bundle.putParcelable(EXTRA_OBJ, (android.os.Parcelable) this.mObj1);
                break;
            case 0:
            default:
                throw new java.lang.IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(EXTRA_OBJ, (android.graphics.Bitmap) this.mObj1);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(EXTRA_OBJ, (java.lang.String) this.mObj1);
                break;
            case 3:
                bundle.putByteArray(EXTRA_OBJ, (byte[]) this.mObj1);
                break;
        }
        bundle.putInt(EXTRA_TYPE, this.mType);
        bundle.putInt(EXTRA_INT1, this.mInt1);
        bundle.putInt(EXTRA_INT2, this.mInt2);
        bundle.putString(EXTRA_STRING1, this.mString1);
        android.content.res.ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            bundle.putParcelable(EXTRA_TINT_LIST, colorStateList);
        }
        android.graphics.PorterDuff.Mode mode = this.mTintMode;
        if (mode != DEFAULT_TINT_MODE) {
            bundle.putString(EXTRA_TINT_MODE, mode.name());
        }
        return bundle;
    }

    public java.lang.String toString() {
        if (this.mType == -1) {
            return java.lang.String.valueOf(this.mObj1);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Icon(typ=");
        sb.append(typeToString(this.mType));
        switch (this.mType) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((android.graphics.Bitmap) this.mObj1).getWidth());
                sb.append("x");
                sb.append(((android.graphics.Bitmap) this.mObj1).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.mString1);
                sb.append(" id=");
                sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(getResId())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.mInt1);
                if (this.mInt2 != 0) {
                    sb.append(" off=");
                    sb.append(this.mInt2);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.mObj1);
                break;
        }
        if (this.mTintList != null) {
            sb.append(" tint=");
            sb.append(this.mTintList);
        }
        if (this.mTintMode != DEFAULT_TINT_MODE) {
            sb.append(" mode=");
            sb.append(this.mTintMode);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z) {
        this.mTintModeStr = this.mTintMode.name();
        switch (this.mType) {
            case -1:
                if (z) {
                    throw new java.lang.IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.mParcelable = (android.os.Parcelable) this.mObj1;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.mObj1;
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.mData = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.mParcelable = (android.os.Parcelable) this.mObj1;
                return;
            case 2:
                this.mData = ((java.lang.String) this.mObj1).getBytes(java.nio.charset.Charset.forName("UTF-16"));
                return;
            case 3:
                this.mData = (byte[]) this.mObj1;
                return;
            case 4:
            case 6:
                this.mData = this.mObj1.toString().getBytes(java.nio.charset.Charset.forName("UTF-16"));
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.mTintMode = android.graphics.PorterDuff.Mode.valueOf(this.mTintModeStr);
        switch (this.mType) {
            case -1:
                android.os.Parcelable parcelable = this.mParcelable;
                if (parcelable != null) {
                    this.mObj1 = parcelable;
                    return;
                }
                throw new java.lang.IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                android.os.Parcelable parcelable2 = this.mParcelable;
                if (parcelable2 != null) {
                    this.mObj1 = parcelable2;
                    return;
                }
                byte[] bArr = this.mData;
                this.mObj1 = bArr;
                this.mType = 3;
                this.mInt1 = 0;
                this.mInt2 = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                java.lang.String str = new java.lang.String(this.mData, java.nio.charset.Charset.forName("UTF-16"));
                this.mObj1 = str;
                if (this.mType == 2 && this.mString1 == null) {
                    this.mString1 = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.mObj1 = this.mData;
                return;
        }
    }

    public static androidx.core.graphics.drawable.IconCompat createFromBundle(android.os.Bundle bundle) {
        int i = bundle.getInt(EXTRA_TYPE);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(i);
        iconCompat.mInt1 = bundle.getInt(EXTRA_INT1);
        iconCompat.mInt2 = bundle.getInt(EXTRA_INT2);
        iconCompat.mString1 = bundle.getString(EXTRA_STRING1);
        if (bundle.containsKey(EXTRA_TINT_LIST)) {
            iconCompat.mTintList = (android.content.res.ColorStateList) bundle.getParcelable(EXTRA_TINT_LIST);
        }
        if (bundle.containsKey(EXTRA_TINT_MODE)) {
            iconCompat.mTintMode = android.graphics.PorterDuff.Mode.valueOf(bundle.getString(EXTRA_TINT_MODE));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.mObj1 = bundle.getParcelable(EXTRA_OBJ);
                return iconCompat;
            case 0:
            default:
                android.util.Log.w(TAG, "Unknown type " + i);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.mObj1 = bundle.getString(EXTRA_OBJ);
                return iconCompat;
            case 3:
                iconCompat.mObj1 = bundle.getByteArray(EXTRA_OBJ);
                return iconCompat;
        }
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIcon(android.content.Context context, android.graphics.drawable.Icon icon) {
        androidx.core.util.Preconditions.checkNotNull(icon);
        int type = getType(icon);
        if (type == 2) {
            java.lang.String resPackage = getResPackage(icon);
            try {
                return createWithResource(getResources(context, resPackage), resPackage, getResId(icon));
            } catch (android.content.res.Resources.NotFoundException unused) {
                throw new java.lang.IllegalArgumentException("Icon resource cannot be found");
            }
        }
        if (type == 4) {
            return createWithContentUri(getUri(icon));
        }
        if (type == 6) {
            return createWithAdaptiveBitmapContentUri(getUri(icon));
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(-1);
        iconCompat.mObj1 = icon;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIcon(android.graphics.drawable.Icon icon) {
        androidx.core.util.Preconditions.checkNotNull(icon);
        int type = getType(icon);
        if (type == 2) {
            return createWithResource(null, getResPackage(icon), getResId(icon));
        }
        if (type == 4) {
            return createWithContentUri(getUri(icon));
        }
        if (type == 6) {
            return createWithAdaptiveBitmapContentUri(getUri(icon));
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(-1);
        iconCompat.mObj1 = icon;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat createFromIconOrNullIfZeroResId(android.graphics.drawable.Icon icon) {
        if (getType(icon) == 2 && getResId(icon) == 0) {
            return null;
        }
        return createFromIcon(icon);
    }

    private static int getType(android.graphics.drawable.Icon icon) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((java.lang.Integer) icon.getClass().getMethod("getType", new java.lang.Class[0]).invoke(icon, new java.lang.Object[0])).intValue();
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.e(TAG, "Unable to get icon type " + icon, e);
            return -1;
        } catch (java.lang.NoSuchMethodException e2) {
            android.util.Log.e(TAG, "Unable to get icon type " + icon, e2);
            return -1;
        } catch (java.lang.reflect.InvocationTargetException e3) {
            android.util.Log.e(TAG, "Unable to get icon type " + icon, e3);
            return -1;
        }
    }

    private static java.lang.String getResPackage(android.graphics.drawable.Icon icon) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (java.lang.String) icon.getClass().getMethod("getResPackage", new java.lang.Class[0]).invoke(icon, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.e(TAG, "Unable to get icon package", e);
            return null;
        } catch (java.lang.NoSuchMethodException e2) {
            android.util.Log.e(TAG, "Unable to get icon package", e2);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e3) {
            android.util.Log.e(TAG, "Unable to get icon package", e3);
            return null;
        }
    }

    private static int getResId(android.graphics.drawable.Icon icon) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((java.lang.Integer) icon.getClass().getMethod("getResId", new java.lang.Class[0]).invoke(icon, new java.lang.Object[0])).intValue();
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.e(TAG, "Unable to get icon resource", e);
            return 0;
        } catch (java.lang.NoSuchMethodException e2) {
            android.util.Log.e(TAG, "Unable to get icon resource", e2);
            return 0;
        } catch (java.lang.reflect.InvocationTargetException e3) {
            android.util.Log.e(TAG, "Unable to get icon resource", e3);
            return 0;
        }
    }

    private static android.net.Uri getUri(android.graphics.drawable.Icon icon) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (android.net.Uri) icon.getClass().getMethod("getUri", new java.lang.Class[0]).invoke(icon, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.e(TAG, "Unable to get icon uri", e);
            return null;
        } catch (java.lang.NoSuchMethodException e2) {
            android.util.Log.e(TAG, "Unable to get icon uri", e2);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e3) {
            android.util.Log.e(TAG, "Unable to get icon uri", e3);
            return null;
        }
    }

    static android.graphics.Bitmap createLegacyIconFromAdaptiveIcon(android.graphics.Bitmap bitmap, boolean z) {
        int min = (int) (java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) * DEFAULT_VIEW_PORT_SCALE);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(min, min, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = ICON_DIAMETER_FACTOR * f2;
        if (z) {
            float f4 = BLUR_FACTOR * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * KEY_SHADOW_OFFSET_FACTOR, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
