package androidx.core.text;

/* loaded from: classes.dex */
public final class HtmlCompat {
    public static final int FROM_HTML_MODE_COMPACT = 63;
    public static final int FROM_HTML_MODE_LEGACY = 0;
    public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
    public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
    public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;

    public static android.text.Spanned fromHtml(java.lang.String str, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return android.text.Html.fromHtml(str, i);
        }
        return android.text.Html.fromHtml(str);
    }

    public static android.text.Spanned fromHtml(java.lang.String str, int i, android.text.Html.ImageGetter imageGetter, android.text.Html.TagHandler tagHandler) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return android.text.Html.fromHtml(str, i, imageGetter, tagHandler);
        }
        return android.text.Html.fromHtml(str, imageGetter, tagHandler);
    }

    public static java.lang.String toHtml(android.text.Spanned spanned, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return android.text.Html.toHtml(spanned, i);
        }
        return android.text.Html.toHtml(spanned);
    }

    private HtmlCompat() {
    }
}
