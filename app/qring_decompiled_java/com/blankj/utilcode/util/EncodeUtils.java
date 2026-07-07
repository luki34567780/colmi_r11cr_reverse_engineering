package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class EncodeUtils {
    private EncodeUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static java.lang.String urlEncode(java.lang.String str) {
        return urlEncode(str, com.bumptech.glide.load.Key.STRING_CHARSET_NAME);
    }

    public static java.lang.String urlEncode(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            return java.net.URLEncoder.encode(str, str2);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static java.lang.String urlDecode(java.lang.String str) {
        return urlDecode(str, com.bumptech.glide.load.Key.STRING_CHARSET_NAME);
    }

    public static java.lang.String urlDecode(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            return java.net.URLDecoder.decode(str.replaceAll("%(?![0-9a-fA-F]{2})", "%25").replaceAll("\\+", "%2B"), str2);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static byte[] base64Encode(java.lang.String str) {
        return base64Encode(str.getBytes());
    }

    public static byte[] base64Encode(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? new byte[0] : android.util.Base64.encode(bArr, 2);
    }

    public static java.lang.String base64Encode2String(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? "" : android.util.Base64.encodeToString(bArr, 2);
    }

    public static byte[] base64Decode(java.lang.String str) {
        return (str == null || str.length() == 0) ? new byte[0] : android.util.Base64.decode(str, 2);
    }

    public static byte[] base64Decode(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? new byte[0] : android.util.Base64.decode(bArr, 2);
    }

    public static java.lang.String htmlEncode(java.lang.CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\"') {
                sb.append("&quot;");
            } else if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else if (charAt == '\'') {
                sb.append("&#39;");
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static java.lang.CharSequence htmlDecode(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return android.text.Html.fromHtml(str, 0);
        }
        return android.text.Html.fromHtml(str);
    }

    public static java.lang.String binaryEncode(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(java.lang.Integer.toBinaryString(c));
            sb.append(" ");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static java.lang.String binaryDecode(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        java.lang.String[] split = str.split(" ");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str2 : split) {
            sb.append((char) java.lang.Integer.parseInt(str2, 2));
        }
        return sb.toString();
    }
}
