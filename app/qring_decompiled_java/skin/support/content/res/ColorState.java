package skin.support.content.res;

/* loaded from: classes3.dex */
public final class ColorState {
    private static final java.lang.String TAG = "ColorState";
    java.lang.String colorAccelerated;
    java.lang.String colorActivated;
    java.lang.String colorChecked;
    java.lang.String colorDefault;
    java.lang.String colorDragCanAccept;
    java.lang.String colorDragHovered;
    java.lang.String colorEnabled;
    java.lang.String colorFocused;
    java.lang.String colorHovered;
    java.lang.String colorName;
    java.lang.String colorPressed;
    java.lang.String colorSelected;
    java.lang.String colorWindowFocused;
    boolean onlyDefaultColor;

    ColorState(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12) {
        this.colorWindowFocused = str;
        this.colorSelected = str2;
        this.colorFocused = str3;
        this.colorEnabled = str4;
        this.colorPressed = str5;
        this.colorChecked = str6;
        this.colorActivated = str7;
        this.colorAccelerated = str8;
        this.colorHovered = str9;
        this.colorDragCanAccept = str10;
        this.colorDragHovered = str11;
        this.colorDefault = str12;
        boolean z = android.text.TextUtils.isEmpty(str) && android.text.TextUtils.isEmpty(str2) && android.text.TextUtils.isEmpty(str3) && android.text.TextUtils.isEmpty(str4) && android.text.TextUtils.isEmpty(str5) && android.text.TextUtils.isEmpty(str6) && android.text.TextUtils.isEmpty(str7) && android.text.TextUtils.isEmpty(str8) && android.text.TextUtils.isEmpty(str9) && android.text.TextUtils.isEmpty(str10) && android.text.TextUtils.isEmpty(str11);
        this.onlyDefaultColor = z;
        if (z && !str12.startsWith("#")) {
            throw new skin.support.exception.SkinCompatException("Default color cannot be a reference, when only default color is available!");
        }
    }

    ColorState(java.lang.String str, java.lang.String str2) {
        this.colorName = str;
        this.colorDefault = str2;
        this.onlyDefaultColor = true;
        if (!str2.startsWith("#")) {
            throw new skin.support.exception.SkinCompatException("Default color cannot be a reference, when only default color is available!");
        }
    }

    public boolean isOnlyDefaultColor() {
        return this.onlyDefaultColor;
    }

    public java.lang.String getColorName() {
        return this.colorName;
    }

    public java.lang.String getColorWindowFocused() {
        return this.colorWindowFocused;
    }

    public java.lang.String getColorSelected() {
        return this.colorSelected;
    }

    public java.lang.String getColorFocused() {
        return this.colorFocused;
    }

    public java.lang.String getColorEnabled() {
        return this.colorEnabled;
    }

    public java.lang.String getColorPressed() {
        return this.colorPressed;
    }

    public java.lang.String getColorChecked() {
        return this.colorChecked;
    }

    public java.lang.String getColorActivated() {
        return this.colorActivated;
    }

    public java.lang.String getColorAccelerated() {
        return this.colorAccelerated;
    }

    public java.lang.String getColorHovered() {
        return this.colorHovered;
    }

    public java.lang.String getColorDragCanAccept() {
        return this.colorDragCanAccept;
    }

    public java.lang.String getColorDragHovered() {
        return this.colorDragHovered;
    }

    public java.lang.String getColorDefault() {
        return this.colorDefault;
    }

    android.content.res.ColorStateList parse() {
        if (this.onlyDefaultColor) {
            return android.content.res.ColorStateList.valueOf(android.graphics.Color.parseColor(this.colorDefault));
        }
        return parseAll();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01cc A[Catch: Exception -> 0x0201, TryCatch #6 {Exception -> 0x0201, blocks: (B:32:0x01c0, B:34:0x01cc, B:35:0x01de, B:37:0x01e4, B:39:0x01fb), top: B:31:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e4 A[Catch: Exception -> 0x0201, LOOP:0: B:36:0x01e2->B:37:0x01e4, LOOP_END, TryCatch #6 {Exception -> 0x0201, blocks: (B:32:0x01c0, B:34:0x01cc, B:35:0x01de, B:37:0x01e4, B:39:0x01fb), top: B:31:0x01c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.content.res.ColorStateList parseAll() {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: skin.support.content.res.ColorState.parseAll():android.content.res.ColorStateList");
    }

    private java.lang.String getColorStr(java.lang.String str) {
        if (str.startsWith("#")) {
            return str;
        }
        skin.support.content.res.ColorState colorState = skin.support.content.res.SkinCompatUserThemeManager.get().getColorState(str);
        if (colorState == null) {
            return null;
        }
        if (colorState.isOnlyDefaultColor()) {
            return colorState.colorDefault;
        }
        if (!skin.support.utils.Slog.DEBUG) {
            return null;
        }
        skin.support.utils.Slog.i(TAG, str + " cannot reference " + colorState.colorName);
        return null;
    }

    static boolean checkColorValid(java.lang.String str, java.lang.String str2) {
        boolean z = !android.text.TextUtils.isEmpty(str2) && (!str2.startsWith("#") || str2.length() == 7 || str2.length() == 9);
        if (skin.support.utils.Slog.DEBUG && !z) {
            skin.support.utils.Slog.i(TAG, "Invalid color -> " + str + ": " + str2);
        }
        return z;
    }

    static org.json.JSONObject toJSONObject(skin.support.content.res.ColorState colorState) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (colorState.onlyDefaultColor) {
            jSONObject.putOpt("colorName", colorState.colorName).putOpt("colorDefault", colorState.colorDefault).putOpt("onlyDefaultColor", java.lang.Boolean.valueOf(colorState.onlyDefaultColor));
        } else {
            jSONObject.putOpt("colorName", colorState.colorName).putOpt("colorWindowFocused", colorState.colorWindowFocused).putOpt("colorSelected", colorState.colorSelected).putOpt("colorFocused", colorState.colorFocused).putOpt("colorEnabled", colorState.colorEnabled).putOpt("colorPressed", colorState.colorPressed).putOpt("colorChecked", colorState.colorChecked).putOpt("colorActivated", colorState.colorActivated).putOpt("colorAccelerated", colorState.colorAccelerated).putOpt("colorHovered", colorState.colorHovered).putOpt("colorDragCanAccept", colorState.colorDragCanAccept).putOpt("colorDragHovered", colorState.colorDragHovered).putOpt("colorDefault", colorState.colorDefault).putOpt("onlyDefaultColor", java.lang.Boolean.valueOf(colorState.onlyDefaultColor));
        }
        return jSONObject;
    }

    static skin.support.content.res.ColorState fromJSONObject(org.json.JSONObject jSONObject) {
        if (!jSONObject.has("colorName") || !jSONObject.has("colorDefault") || !jSONObject.has("onlyDefaultColor")) {
            return null;
        }
        try {
            boolean z = jSONObject.getBoolean("onlyDefaultColor");
            java.lang.String string = jSONObject.getString("colorName");
            java.lang.String string2 = jSONObject.getString("colorDefault");
            if (z) {
                return new skin.support.content.res.ColorState(string, string2);
            }
            skin.support.content.res.ColorState.ColorBuilder colorBuilder = new skin.support.content.res.ColorState.ColorBuilder();
            colorBuilder.setColorDefault(string2);
            if (jSONObject.has("colorWindowFocused")) {
                colorBuilder.setColorWindowFocused(jSONObject.getString("colorWindowFocused"));
            }
            if (jSONObject.has("colorSelected")) {
                colorBuilder.setColorSelected(jSONObject.getString("colorSelected"));
            }
            if (jSONObject.has("colorFocused")) {
                colorBuilder.setColorFocused(jSONObject.getString("colorFocused"));
            }
            if (jSONObject.has("colorEnabled")) {
                colorBuilder.setColorEnabled(jSONObject.getString("colorEnabled"));
            }
            if (jSONObject.has("colorPressed")) {
                colorBuilder.setColorPressed(jSONObject.getString("colorPressed"));
            }
            if (jSONObject.has("colorChecked")) {
                colorBuilder.setColorChecked(jSONObject.getString("colorChecked"));
            }
            if (jSONObject.has("colorActivated")) {
                colorBuilder.setColorActivated(jSONObject.getString("colorActivated"));
            }
            if (jSONObject.has("colorAccelerated")) {
                colorBuilder.setColorAccelerated(jSONObject.getString("colorAccelerated"));
            }
            if (jSONObject.has("colorHovered")) {
                colorBuilder.setColorHovered(jSONObject.getString("colorHovered"));
            }
            if (jSONObject.has("colorDragCanAccept")) {
                colorBuilder.setColorDragCanAccept(jSONObject.getString("colorDragCanAccept"));
            }
            if (jSONObject.has("colorDragHovered")) {
                colorBuilder.setColorDragHovered(jSONObject.getString("colorDragHovered"));
            }
            skin.support.content.res.ColorState build = colorBuilder.build();
            build.colorName = string;
            return build;
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static class ColorBuilder {
        java.lang.String colorAccelerated;
        java.lang.String colorActivated;
        java.lang.String colorChecked;
        java.lang.String colorDefault;
        java.lang.String colorDragCanAccept;
        java.lang.String colorDragHovered;
        java.lang.String colorEnabled;
        java.lang.String colorFocused;
        java.lang.String colorHovered;
        java.lang.String colorPressed;
        java.lang.String colorSelected;
        java.lang.String colorWindowFocused;

        public ColorBuilder() {
        }

        public ColorBuilder(skin.support.content.res.ColorState colorState) {
            this.colorWindowFocused = colorState.colorWindowFocused;
            this.colorSelected = colorState.colorSelected;
            this.colorFocused = colorState.colorFocused;
            this.colorEnabled = colorState.colorEnabled;
            this.colorPressed = colorState.colorPressed;
            this.colorChecked = colorState.colorChecked;
            this.colorActivated = colorState.colorActivated;
            this.colorAccelerated = colorState.colorAccelerated;
            this.colorHovered = colorState.colorHovered;
            this.colorDragCanAccept = colorState.colorDragCanAccept;
            this.colorDragHovered = colorState.colorDragHovered;
            this.colorDefault = colorState.colorDefault;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorWindowFocused(java.lang.String str) {
            if (skin.support.content.res.ColorState.checkColorValid("colorWindowFocused", str)) {
                this.colorWindowFocused = str;
            }
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorWindowFocused(android.content.Context context, int i) {
            this.colorWindowFocused = context.getResources().getResourceEntryName(i);
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorSelected(java.lang.String str) {
            if (skin.support.content.res.ColorState.checkColorValid("colorSelected", str)) {
                this.colorSelected = str;
            }
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorSelected(android.content.Context context, int i) {
            this.colorSelected = context.getResources().getResourceEntryName(i);
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorFocused(java.lang.String str) {
            if (skin.support.content.res.ColorState.checkColorValid("colorFocused", str)) {
                this.colorFocused = str;
            }
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorFocused(android.content.Context context, int i) {
            this.colorFocused = context.getResources().getResourceEntryName(i);
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorEnabled(java.lang.String str) {
            if (skin.support.content.res.ColorState.checkColorValid("colorEnabled", str)) {
                this.colorEnabled = str;
            }
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorEnabled(android.content.Context context, int i) {
            this.colorEnabled = context.getResources().getResourceEntryName(i);
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorChecked(java.lang.String str) {
            if (skin.support.content.res.ColorState.checkColorValid("colorChecked", str)) {
                this.colorChecked = str;
            }
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorChecked(android.content.Context context, int i) {
            this.colorChecked = context.getResources().getResourceEntryName(i);
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorPressed(java.lang.String str) {
            if (skin.support.content.res.ColorState.checkColorValid("colorPressed", str)) {
                this.colorPressed = str;
            }
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorPressed(android.content.Context context, int i) {
            this.colorPressed = context.getResources().getResourceEntryName(i);
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorActivated(java.lang.String str) {
            if (skin.support.content.res.ColorState.checkColorValid("colorActivated", str)) {
                this.colorActivated = str;
            }
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorActivated(android.content.Context context, int i) {
            this.colorActivated = context.getResources().getResourceEntryName(i);
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorAccelerated(java.lang.String str) {
            if (skin.support.content.res.ColorState.checkColorValid("colorAccelerated", str)) {
                this.colorAccelerated = str;
            }
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorAccelerated(android.content.Context context, int i) {
            this.colorAccelerated = context.getResources().getResourceEntryName(i);
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorHovered(java.lang.String str) {
            if (skin.support.content.res.ColorState.checkColorValid("colorHovered", str)) {
                this.colorHovered = str;
            }
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorHovered(android.content.Context context, int i) {
            this.colorHovered = context.getResources().getResourceEntryName(i);
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorDragCanAccept(java.lang.String str) {
            if (skin.support.content.res.ColorState.checkColorValid("colorDragCanAccept", str)) {
                this.colorDragCanAccept = str;
            }
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorDragCanAccept(android.content.Context context, int i) {
            this.colorDragCanAccept = context.getResources().getResourceEntryName(i);
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorDragHovered(java.lang.String str) {
            if (skin.support.content.res.ColorState.checkColorValid("colorDragHovered", str)) {
                this.colorDragHovered = str;
            }
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorDragHovered(android.content.Context context, int i) {
            this.colorDragHovered = context.getResources().getResourceEntryName(i);
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorDefault(java.lang.String str) {
            if (skin.support.content.res.ColorState.checkColorValid("colorDefault", str)) {
                this.colorDefault = str;
            }
            return this;
        }

        public skin.support.content.res.ColorState.ColorBuilder setColorDefault(android.content.Context context, int i) {
            this.colorDefault = context.getResources().getResourceEntryName(i);
            return this;
        }

        public skin.support.content.res.ColorState build() {
            if (android.text.TextUtils.isEmpty(this.colorDefault)) {
                throw new skin.support.exception.SkinCompatException("Default color can not empty!");
            }
            return new skin.support.content.res.ColorState(this.colorWindowFocused, this.colorSelected, this.colorFocused, this.colorEnabled, this.colorPressed, this.colorChecked, this.colorActivated, this.colorAccelerated, this.colorHovered, this.colorDragCanAccept, this.colorDragHovered, this.colorDefault);
        }
    }
}
