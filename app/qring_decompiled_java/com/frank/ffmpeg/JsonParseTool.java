package com.frank.ffmpeg;

/* compiled from: JsonParseTool.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/frank/ffmpeg/JsonParseTool;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "TYPE_AUDIO", "TYPE_VIDEO", "parseMediaFormat", "Lcom/frank/ffmpeg/MediaBean;", "mediaFormat", "parseTag", "", "audioTag", "Lorg/json/JSONObject;", "audioBean", "Lcom/frank/ffmpeg/AudioBean;", "stringFormat", "mediaBean", "libmp3_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class JsonParseTool {
    public static final com.frank.ffmpeg.JsonParseTool INSTANCE = new com.frank.ffmpeg.JsonParseTool();
    private static final java.lang.String TAG = "JsonParseTool";
    private static final java.lang.String TYPE_AUDIO = "audio";
    private static final java.lang.String TYPE_VIDEO = "video";

    private JsonParseTool() {
    }

    public final com.frank.ffmpeg.MediaBean parseMediaFormat(java.lang.String mediaFormat) {
        java.lang.String optString;
        java.util.List emptyList;
        com.frank.ffmpeg.MediaBean mediaBean = null;
        if (mediaFormat != null) {
            if (!(mediaFormat.length() == 0)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(mediaFormat);
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("format");
                    com.frank.ffmpeg.MediaBean mediaBean2 = new com.frank.ffmpeg.MediaBean();
                    try {
                        int optInt = jSONObject2.optInt("nb_streams");
                        mediaBean2.setStreamNum(optInt);
                        java.lang.String str = TAG;
                        android.util.Log.e(str, "streamNum=" + optInt);
                        java.lang.String optString2 = jSONObject2.optString("format_name");
                        mediaBean2.setFormatName(optString2);
                        android.util.Log.e(str, "formatName=" + optString2);
                        java.lang.String optString3 = jSONObject2.optString("bit_rate");
                        if (!android.text.TextUtils.isEmpty(optString3)) {
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(optString3);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(bitRateStr)");
                            mediaBean2.setBitRate(valueOf.intValue());
                        }
                        android.util.Log.e(str, "bitRate=" + optString3);
                        java.lang.String optString4 = jSONObject2.optString("size");
                        if (!android.text.TextUtils.isEmpty(optString4)) {
                            java.lang.Long valueOf2 = java.lang.Long.valueOf(optString4);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(sizeStr)");
                            mediaBean2.setSize(valueOf2.longValue());
                        }
                        android.util.Log.e(str, "size=" + optString4);
                        java.lang.String optString5 = jSONObject2.optString("duration");
                        if (!android.text.TextUtils.isEmpty(optString5)) {
                            mediaBean2.setDuration((long) java.lang.Float.valueOf(optString5).floatValue());
                        }
                        org.json.JSONArray jSONArray = jSONObject.getJSONArray("streams");
                        if (jSONArray == null) {
                            return mediaBean2;
                        }
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
                            if (optJSONObject != null && (optString = optJSONObject.optString("codec_type")) != null) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(optString, "video")) {
                                    com.frank.ffmpeg.VideoBean videoBean = new com.frank.ffmpeg.VideoBean();
                                    mediaBean2.setVideoBean(videoBean);
                                    java.lang.String optString6 = optJSONObject.optString("codec_tag_string");
                                    videoBean.setVideoCodec(optString6);
                                    java.lang.String str2 = TAG;
                                    android.util.Log.e(str2, "codecName=" + optString6);
                                    int optInt2 = optJSONObject.optInt("width");
                                    videoBean.setWidth(optInt2);
                                    int optInt3 = optJSONObject.optInt("height");
                                    videoBean.setHeight(optInt3);
                                    android.util.Log.e(str2, "width=" + optInt2 + "--height=" + optInt3);
                                    java.lang.String optString7 = optJSONObject.optString("display_aspect_ratio");
                                    videoBean.setDisplayAspectRatio(optString7);
                                    android.util.Log.e(str2, "aspectRatio=" + optString7);
                                    java.lang.String optString8 = optJSONObject.optString("pix_fmt");
                                    videoBean.setPixelFormat(optString8);
                                    android.util.Log.e(str2, "pixelFormat=" + optString8);
                                    java.lang.String optString9 = optJSONObject.optString(com.google.android.gms.common.Scopes.PROFILE);
                                    videoBean.setProfile(optString9);
                                    int optInt4 = optJSONObject.optInt("level");
                                    videoBean.setLevel(optInt4);
                                    android.util.Log.e(str2, "profile=" + optString9 + "--level=" + optInt4);
                                    java.lang.String optString10 = optJSONObject.optString("r_frame_rate");
                                    if (android.text.TextUtils.isEmpty(optString10)) {
                                        continue;
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString10, "frameRateStr");
                                        java.util.List split = new kotlin.text.Regex("/").split(optString10, 0);
                                        if (!split.isEmpty()) {
                                            java.util.ListIterator listIterator = split.listIterator(split.size());
                                            while (listIterator.hasPrevious()) {
                                                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                                                    emptyList = kotlin.collections.CollectionsKt.take(split, listIterator.nextIndex() + 1);
                                                    break;
                                                }
                                            }
                                        }
                                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                                        java.lang.Object[] array = emptyList.toArray(new java.lang.String[0]);
                                        if (array != null) {
                                            java.lang.String[] strArr = (java.lang.String[]) array;
                                            double doubleValue = java.lang.Double.valueOf(strArr[0]).doubleValue();
                                            java.lang.Double valueOf3 = java.lang.Double.valueOf(strArr[1]);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf3, "valueOf(frameRateArray[1])");
                                            double ceil = java.lang.Math.ceil(doubleValue / valueOf3.doubleValue());
                                            java.lang.String str3 = TAG;
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            sb.append("frameRate=");
                                            int i2 = (int) ceil;
                                            sb.append(i2);
                                            android.util.Log.e(str3, sb.toString());
                                            videoBean.setFrameRate(i2);
                                        } else {
                                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                        }
                                    }
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(optString, "audio")) {
                                    com.frank.ffmpeg.AudioBean audioBean = new com.frank.ffmpeg.AudioBean();
                                    mediaBean2.setAudioBean(audioBean);
                                    java.lang.String optString11 = optJSONObject.optString("codec_tag_string");
                                    audioBean.setAudioCodec(optString11);
                                    java.lang.String str4 = TAG;
                                    android.util.Log.e(str4, "codecName=" + optString11);
                                    java.lang.String optString12 = optJSONObject.optString("sample_rate");
                                    if (!android.text.TextUtils.isEmpty(optString12)) {
                                        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(optString12);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf4, "valueOf(sampleRateStr)");
                                        audioBean.setSampleRate(valueOf4.intValue());
                                    }
                                    android.util.Log.e(str4, "sampleRate=" + optString12);
                                    int optInt5 = optJSONObject.optInt("channels");
                                    audioBean.setChannels(optInt5);
                                    android.util.Log.e(str4, "channels=" + optInt5);
                                    java.lang.String optString13 = optJSONObject.optString("channel_layout");
                                    audioBean.setChannelLayout(optString13);
                                    android.util.Log.e(str4, "channelLayout=" + optString13);
                                    org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject("tags");
                                    if (jSONObject3 != null) {
                                        parseTag(jSONObject3, audioBean);
                                    }
                                }
                            }
                        }
                        return mediaBean2;
                    } catch (java.lang.Exception e) {
                        e = e;
                        mediaBean = mediaBean2;
                        android.util.Log.e(TAG, "parse error=" + e);
                        return mediaBean;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                }
            }
        }
        return null;
    }

    public final java.lang.String stringFormat(com.frank.ffmpeg.MediaBean mediaBean) {
        if (mediaBean == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("duration:");
        sb.append(mediaBean.getDuration());
        sb.append("\n");
        sb.append("size:");
        sb.append(mediaBean.getSize());
        sb.append("\n");
        sb.append("bitRate:");
        sb.append(mediaBean.getBitRate());
        sb.append("\n");
        sb.append("formatName:");
        sb.append(mediaBean.getFormatName());
        sb.append("\n");
        sb.append("streamNum:");
        sb.append(mediaBean.getStreamNum());
        sb.append("\n");
        if (mediaBean.getVideoBean() != null) {
            com.frank.ffmpeg.VideoBean videoBean = mediaBean.getVideoBean();
            sb.append("width:");
            kotlin.jvm.internal.Intrinsics.checkNotNull(videoBean);
            sb.append(videoBean.getWidth());
            sb.append("\n");
            sb.append("height:");
            sb.append(videoBean.getHeight());
            sb.append("\n");
            if (!android.text.TextUtils.isEmpty(videoBean.getDisplayAspectRatio())) {
                sb.append("aspectRatio:");
                sb.append(videoBean.getDisplayAspectRatio());
                sb.append("\n");
            }
            sb.append("pixelFormat:");
            sb.append(videoBean.getPixelFormat());
            sb.append("\n");
            sb.append("frameRate:");
            sb.append(videoBean.getFrameRate());
            sb.append("\n");
            if (videoBean.getVideoCodec() != null) {
                sb.append("videoCodec:");
                sb.append(videoBean.getVideoCodec());
                sb.append("\n");
            }
        }
        if (mediaBean.getAudioBean() != null) {
            com.frank.ffmpeg.AudioBean audioBean = mediaBean.getAudioBean();
            sb.append("sampleRate:");
            kotlin.jvm.internal.Intrinsics.checkNotNull(audioBean);
            sb.append(audioBean.getSampleRate());
            sb.append("\n");
            sb.append("channels:");
            sb.append(audioBean.getChannels());
            sb.append("\n");
            sb.append("channelLayout:");
            sb.append(audioBean.getChannelLayout());
            sb.append("\n");
            if (audioBean.getAudioCodec() != null) {
                sb.append("audioCodec:");
                sb.append(audioBean.getAudioCodec());
                sb.append("\n");
            }
            if (!android.text.TextUtils.isEmpty(audioBean.getTitle())) {
                sb.append("title:");
                sb.append(audioBean.getTitle());
                sb.append("\n");
            }
            if (!android.text.TextUtils.isEmpty(audioBean.getArtist())) {
                sb.append("artist:");
                sb.append(audioBean.getArtist());
                sb.append("\n");
            }
            if (!android.text.TextUtils.isEmpty(audioBean.getAlbum())) {
                sb.append("album:");
                sb.append(audioBean.getAlbum());
                sb.append("\n");
            }
            if (!android.text.TextUtils.isEmpty(audioBean.getComposer())) {
                sb.append("composer:");
                sb.append(audioBean.getComposer());
                sb.append("\n");
            }
            if (!android.text.TextUtils.isEmpty(audioBean.getGenre())) {
                sb.append("genre:");
                sb.append(audioBean.getGenre());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private final void parseTag(org.json.JSONObject audioTag, com.frank.ffmpeg.AudioBean audioBean) {
        java.lang.String optString = audioTag.optString("title");
        audioBean.setTitle(optString);
        android.util.Log.e(TAG, "title=" + optString);
        audioBean.setArtist(audioTag.optString("artist"));
        audioBean.setAlbum(audioTag.optString("album"));
        audioBean.setAlbumArtist(audioTag.optString("album_artist"));
        audioBean.setComposer(audioTag.optString("composer"));
        audioBean.setGenre(audioTag.optString("genre"));
        java.lang.String optString2 = audioTag.optString("lyrics-eng");
        if (optString2 != null) {
            java.lang.String str = optString2;
            if (kotlin.text.StringsKt.contains$default(str, "\r\n", false, 2, (java.lang.Object) null)) {
                audioBean.setLyrics(kotlin.text.StringsKt.split$default(str, new java.lang.String[]{"\r\n"}, false, 0, 6, (java.lang.Object) null));
            }
        }
    }
}
