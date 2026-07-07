package com.frank.ffmpeg;

/* loaded from: /tmp/dex/classes2.dex */
public class FFmpegUtil {
    public static java.lang.String[] transformAudio(java.lang.String str, java.lang.String str2) {
        return new java.lang.String[]{"ffmpeg", "-i", str, "-y", str2};
    }

    private static java.lang.String[] insert(java.lang.String[] strArr, int i, java.lang.String str) {
        return insert(strArr, i, str, null);
    }

    private static java.lang.String[] insert(java.lang.String[] strArr, int i, java.lang.String str, java.lang.String str2) {
        if (strArr == null || str == null || i < 2) {
            return strArr;
        }
        int length = str2 != null ? strArr.length + 2 : strArr.length + 1;
        java.lang.String[] strArr2 = new java.lang.String[length];
        java.lang.System.arraycopy(strArr, 0, strArr2, 0, i);
        strArr2[i] = str;
        java.lang.System.arraycopy(strArr, i, strArr2, i + 1, strArr.length - i);
        if (str2 != null) {
            strArr2[length - 1] = str2;
        }
        return strArr2;
    }

    public static java.lang.String[] insert(java.lang.String[] strArr, int i, java.lang.String str, int i2, java.lang.String str2, java.lang.String str3) {
        if (strArr == null || str == null || i < 2 || str2 == null || i2 < 4) {
            return strArr;
        }
        int length = str3 != null ? strArr.length + 3 : 2 + strArr.length;
        java.lang.String[] strArr2 = new java.lang.String[length];
        java.lang.System.arraycopy(strArr, 0, strArr2, 0, i);
        strArr2[i] = str;
        java.lang.System.arraycopy(strArr, i, strArr2, i + 1, (i2 - i) - 1);
        strArr2[i2] = str2;
        int i3 = i2 - 1;
        java.lang.System.arraycopy(strArr, i3, strArr2, i2 + 1, strArr.length - i3);
        if (str3 != null) {
            strArr2[length - 1] = str3;
        }
        return strArr2;
    }

    public static java.lang.String[] transformAudio(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return insert(java.lang.String.format("ffmpeg -i -acodec %s -ac 2 -ar 44100 -y", str2).split(" "), 2, str, str3);
    }

    public static java.lang.String[] cutAudio(java.lang.String str, float f, float f2, java.lang.String str2) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -ss %f -t %f -vn -y", java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2)).split(" "), 2, str, str2);
    }

    public static java.lang.String[] concatAudio(java.util.List<java.lang.String> list, java.lang.String str) {
        if (list == null || list.size() == 0) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("concat:");
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(com.king.zxing.util.LogUtils.VERTICAL);
        }
        return insert("ffmpeg -i -acodec copy -y".split(" "), 2, sb.substring(0, sb.length() - 1), str);
    }

    public static java.lang.String[] mixAudio(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return mixAudio(str, str2, 0, 0, false, str3);
    }

    public static java.lang.String[] mixAudio(java.lang.String str, java.lang.String str2, int i, int i2, boolean z, java.lang.String str3) {
        int i3 = z ? 9 : 8;
        java.lang.String[] strArr = new java.lang.String[i3];
        strArr[0] = "ffmpeg";
        strArr[1] = "-i";
        strArr[2] = str;
        strArr[3] = "-i";
        strArr[4] = str2;
        strArr[5] = "-filter_complex";
        java.lang.String str4 = "amix=inputs=2:duration=longest";
        if (i > 0 && i2 > 0) {
            str4 = "amix=inputs=2:duration=longest" + (":weights='" + i + " " + i2 + "'");
        }
        strArr[6] = str4;
        if (z) {
            strArr[7] = "-vn";
        }
        strArr[i3 - 1] = str3;
        return strArr;
    }

    public static java.lang.String[] mergeAudio(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return java.lang.String.format("ffmpeg -i %s -i %s -filter_complex [0:a][1:a]amerge=inputs=2[aout] -map [aout] -y %s", str, str2, str3).split(" ");
    }

    public static java.lang.String[] audioEcho(java.lang.String str, int i, java.lang.String str2) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -af aecho=0.8:0.8:%d:0.5 -y", java.lang.Integer.valueOf(i)).split(" "), 2, str, str2);
    }

    public static java.lang.String[] audioTremolo(java.lang.String str, int i, float f, java.lang.String str2) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -af tremolo=%d:%f -y", java.lang.Integer.valueOf(i), java.lang.Float.valueOf(f)).split(" "), 2, str, str2);
    }

    public static java.lang.String[] audioDenoise(java.lang.String str, java.lang.String str2) {
        return insert("ffmpeg -i -af afftdn -y".split(" "), 2, str, str2);
    }

    public static java.lang.String[] audioSilenceDetect(java.lang.String str) {
        return insert("ffmpeg -i -af silencedetect=noise=0.0001 -f null -".split(" "), 2, str);
    }

    public static java.lang.String[] audioVolume(java.lang.String str, float f, java.lang.String str2) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -af volume=%f -y", java.lang.Float.valueOf(f)).split(" "), 2, str, str2);
    }

    public static java.lang.String[] audioSurround(java.lang.String str, java.lang.String str2) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -af surround -y", new java.lang.Object[0]).split(" "), 2, str, str2);
    }

    public static java.lang.String[] audioReverb(java.lang.String str, java.lang.String str2) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -af stereowiden -y", new java.lang.Object[0]).split(" "), 2, str, str2);
    }

    public static java.lang.String[] mediaMux(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
        return java.lang.String.format(java.util.Locale.getDefault(), z ? "ffmpeg -i %s -i %s -codec copy -y %s" : "ffmpeg -i %s -i %s -y %s", str, str2, str3).split(" ");
    }

    public static java.lang.String[] extractAudio(java.lang.String str, java.lang.String str2) {
        return insert("ffmpeg -i -vn -y".split(" "), 2, str, str2);
    }

    public static java.lang.String[] extractVideo(java.lang.String str, java.lang.String str2) {
        return insert("ffmpeg -i -vcodec copy -an -y".split(" "), 2, str, str2);
    }

    public static java.lang.String[] transformVideo(java.lang.String str, java.lang.String str2) {
        return insert("ffmpeg -i -vcodec libx264 -preset superfast -profile baseline -acodec libmp3lame -y".split(" "), 2, str, str2);
    }

    public static java.lang.String[] transformVideoWithEncode(java.lang.String str, java.lang.String str2) {
        return transformVideoWithEncode(str, 0, 0, str2);
    }

    public static java.lang.String[] transformVideoWithEncode(java.lang.String str, int i, int i2, java.lang.String str2) {
        java.lang.String str3;
        if (i <= 0 || i2 <= 0) {
            str3 = "ffmpeg -i -vcodec libx264 -threads 8 -preset superfast -acodec aac -y";
        } else {
            str3 = "ffmpeg -i -vcodec libx264 -threads 8 -preset superfast -acodec aac -y " + ("-vf scale=" + i + ":" + i2);
        }
        return insert(str3.split(" "), 2, str, str2);
    }

    public static java.lang.String[] jointVideo(java.lang.String str, java.lang.String str2) {
        return insert("ffmpeg -f concat -safe 0 -i -c copy -y".split(" "), 6, str, str2);
    }

    public static java.lang.String[] cutVideo(java.lang.String str, float f, float f2, java.lang.String str2) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -ss %f -accurate_seek -t %f -i -map 0 -codec copy -avoid_negative_ts 1 -y", java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2)).split(" "), 7, str, str2);
    }

    public static java.lang.String[] screenShot(java.lang.String str, float f, java.lang.String str2) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -ss %f -i -f image2 -vframes 1 -an -y", java.lang.Float.valueOf(f)).split(" "), 4, str, str2);
    }

    private static java.lang.String obtainOverlay(int i, int i2, int i3) {
        if (i3 == 2) {
            return "overlay='(main_w-overlay_w)-" + i + ":" + i2 + "'";
        }
        if (i3 == 3) {
            return "overlay='" + i + ":(main_h-overlay_h)-" + i2 + "'";
        }
        if (i3 == 4) {
            return "overlay='(main_w-overlay_w)-" + i + ":(main_h-overlay_h)-" + i2 + "'";
        }
        return "overlay=(10+t*20):" + i2;
    }

    public static java.lang.String[] addWaterMarkImg(java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.lang.String str3) {
        return insert(java.lang.String.format("ffmpeg -i -i -b:v %s -filter_complex %s -preset:v superfast -y", i2 + "k", obtainOverlay(i3, i3, i)).split(" "), 2, str, 4, str2, str3);
    }

    public static java.lang.String[] removeLogo(java.lang.String str, int i, int i2, int i3, int i4, java.lang.String str2) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -filter_complex delogo=x=%d:y=%d:w=%d:h=%d -y", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4)).split(" "), 2, str, str2);
    }

    public static java.lang.String[] generatePalette(java.lang.String str, int i, int i2, int i3, int i4, java.lang.String str2) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -ss %d -accurate_seek -t %d -i -vf fps=%d,scale=%d:-1:flags=lanczos,palettegen -y", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4)).split(" "), 7, str, str2);
    }

    public static java.lang.String[] generateGifByPalette(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4, java.lang.String str3) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -ss %d -accurate_seek -t %d -i -i -lavfi fps=%d,scale=%d:-1:flags=lanczos[x];[x][1:v]paletteuse=dither=bayer:bayer_scale=3 -y", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4)).split(" "), 7, str, 9, str2, str3);
    }

    public static java.lang.String[] pictureToVideo(java.lang.String str, int i, java.lang.String str2) {
        return java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -f image2 -r %d -i %simg#d.jpg -vcodec mpeg4 -y %s", java.lang.Integer.valueOf(i), str, str2).replace("#", "%").split(" ");
    }

    public static java.lang.String[] convertResolution(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -s %s -pix_fmt yuv420p -y", str2).split(" "), 2, str, str3);
    }

    public static java.lang.String[] encodeAudio(java.lang.String str, java.lang.String str2, int i, int i2) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -f s16le -ar %d -ac %d -i -y", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)).split(" "), 8, str, str2);
    }

    public static java.lang.String[] reverseVideo(java.lang.String str, java.lang.String str2) {
        return insert("ffmpeg -i -vf reverse -an -y".split(" "), 2, str, str2);
    }

    public static java.lang.String[] denoiseVideo(java.lang.String str, java.lang.String str2) {
        return insert("ffmpeg -i -nr 500 -y".split(" "), 2, str, str2);
    }

    public static java.lang.String[] videoToImage(java.lang.String str, int i, int i2, int i3, java.lang.String str2) {
        return videoToImageWithScale(str, i, i2, i3, 0, str2);
    }

    public static java.lang.String[] videoToImageWithScale(java.lang.String str, int i, int i2, int i3, int i4, java.lang.String str2) {
        java.lang.String format;
        if (i4 > 0) {
            format = java.lang.String.format(java.util.Locale.CHINESE, "ffmpeg -ss %d -accurate_seek -t %d -i %s -an -vf fps=%d,scale=%d:-1 -y %s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), str, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), str2);
        } else {
            format = java.lang.String.format(java.util.Locale.CHINESE, "ffmpeg -ss %d -accurate_seek -t %d -i %s -an -r %d -y %s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), str, java.lang.Integer.valueOf(i3), str2);
        }
        return (format + "%3d.png").split(" ");
    }

    public static java.lang.String[] picInPicVideo(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -i -filter_complex overlay=%d:%d -y", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)).split(" "), 2, str, 4, str2, str3);
    }

    public static java.lang.String[] picInPicVideoInCorner(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        java.lang.String str4;
        if (i == 1) {
            str4 = "ffmpeg -i -i -filter_complex -y overlay=W-w";
        } else if (i == 2) {
            str4 = "ffmpeg -i -i -filter_complex -y overlay=0:H-h";
        } else if (i == 3) {
            str4 = "ffmpeg -i -i -filter_complex -y overlay=W-w:H-h";
        } else {
            str4 = "ffmpeg -i -i -filter_complex -y overlay";
        }
        return insert(str4.split(" "), 2, str, 4, str2, str3);
    }

    public static java.lang.String[] moveMoovAhead(java.lang.String str, java.lang.String str2) {
        return insert("ffmpeg -i -movflags faststart -acodec copy -vcodec copy -y".split(" "), 2, str, str2);
    }

    public static java.lang.String[] toGrayVideo(java.lang.String str, java.lang.String str2) {
        return insert("ffmpeg -i -vf lutyuv='u=128:v=128' -y".split(" "), 2, str, str2);
    }

    public static java.lang.String[] photoZoomToVideo(java.lang.String str, int i, java.lang.String str2) {
        java.lang.String str3;
        if (i == 1) {
            str3 = "ffmpeg -i -vf zoompan='1.3':x='if(lte(on,1),(iw/zoom)/2,x-0.5)':y='if(lte(on,1),(ih-ih/zoom)/2,y)':d=180";
        } else if (i == 2) {
            str3 = "ffmpeg -i -vf zoompan='1.3':x='if(lte(on,-1),(iw-iw/zoom)/2,x+0.5)':y='if(lte(on,1),(ih-ih/zoom)/2,y)':d=180";
        } else if (i == 3) {
            str3 = "ffmpeg -i -vf zoompan='1.3':x='if(lte(on,1),(iw-iw/zoom)/2,x)':y='if(lte(on,-1),(ih-ih/zoom)/2,y+0.5)':d=180";
        } else if (i == 4) {
            str3 = "ffmpeg -i -vf zoompan='1.3':x='if(lte(on,1),(iw-iw/zoom)/2,x)':y='if(lte(on,1),(ih/zoom)/2,y-0.5)':d=180";
        } else {
            str3 = "ffmpeg -i -vf zoompan=z='min(zoom+0.0015,1.5)':x='iw/2-(iw/zoom/2)':y='ih/2-(ih/zoom/2)':d=180";
        }
        return insert(str3.split(" "), 2, str, str2);
    }

    public static java.lang.String[] probeFormat(java.lang.String str) {
        return insert("ffprobe -i -show_streams -show_format -print_format json".split(" "), 2, str);
    }

    public static java.lang.String[] changeSpeed(java.lang.String str, java.lang.String str2, float f, boolean z) {
        java.lang.String format;
        if (z) {
            if (f > 4.0f || f < 0.25d) {
                throw new java.lang.IllegalArgumentException("speed range is 0.25--4");
            }
        } else if (f > 2.0f || f < 0.5d) {
            throw new java.lang.IllegalArgumentException("speed range is 0.5--2");
        }
        float f2 = 1.0f / f;
        if (z) {
            format = java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -filter_complex [0:v]setpts=%.2f*PTS[v] -map [v] -y", java.lang.Float.valueOf(f2));
        } else {
            format = java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -filter_complex [0:v]setpts=%.2f*PTS[v];[0:a]atempo=%.2f[a] -map [v] -map [a] -y", java.lang.Float.valueOf(f2), java.lang.Float.valueOf(f));
        }
        return insert(format.split(" "), 2, str, str2);
    }

    public static java.lang.String[] changeAudioSpeed(java.lang.String str, java.lang.String str2, float f) {
        if (f > 100.0f || f < 0.5d) {
            throw new java.lang.IllegalArgumentException("audio speed range is from 0.5 to 100");
        }
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -filter_complex atempo=%.2f -y", java.lang.Float.valueOf(f)).split(" "), 2, str, str2);
    }

    public static java.lang.String[] insertPicIntoVideo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return insert("ffmpeg -i -i -map 0 -map 1 -c copy -c:v:1 png -disposition:v:1 attached_pic -y".split(" "), 2, str, 4, str2, str3);
    }

    public static java.lang.String[] addSubtitleIntoVideo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return insert("ffmpeg -i -i -map 0:v -map 0:a -map 1:s -c copy -y".split(" "), 2, str, 4, str2, str3);
    }

    public static java.lang.String[] pushMultiStreams(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = "flv";
        if (!str2.startsWith("rtmp://") && str2.startsWith("http://")) {
            str4 = "mpegts";
        }
        return java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i %s -vcodec libx264 -acodec aac -t %d -f %s \"tee:%s|%s\" -y", str, java.lang.Integer.valueOf(i), str4, str2, str3).split(" ");
    }

    public static java.lang.String[] rotateVideo(java.lang.String str, int i, java.lang.String str2) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -c copy -metadata:s:v:0 rotate=%d -y", java.lang.Integer.valueOf(i)).split(" "), 2, str, str2);
    }

    public static java.lang.String[] trimVideo(java.lang.String str, int i, int i2, int i3, int i4, java.lang.String str2) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -filter_complex [0:v]trim=start=%d:end=%d,setpts=PTS-STARTPTS[v0];[0:a]atrim=start=%d:end=%d,asetpts=PTS-STARTPTS[a0];[0:v]trim=start=%d:end=%d,setpts=PTS-STARTPTS[v1];[0:a]atrim=start=%d:end=%d,asetpts=PTS-STARTPTS[a1];[v0][a0][v1][a1]concat=n=2:v=1:a=1[out] -map [out]", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4)).split(" "), 2, str, str2);
    }

    public static java.lang.String[] showAudioWaveform(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -filter_complex showwavespic=s=%s:split_channels=%d", str2, java.lang.Integer.valueOf(i)).split(" "), 2, str, str3);
    }

    public static java.lang.String[] videoStereo3D(java.lang.String str, java.lang.String str2) {
        return insert("ffmpeg -i -filter_complex stereo3d=sbsl:arbg -y".split(" "), 2, str, str2);
    }

    public static java.lang.String[] videoTransition(java.lang.String str, int i, int i2, int i3, java.lang.String str2, java.lang.String str3) {
        return insert(java.lang.String.format(java.util.Locale.getDefault(), "ffmpeg -i -i -filter_complex [0]settb=AVTB,fps=24000/1001[v0];[1]settb=AVTB,fps=24000/1001,scale=%d:%d[v1];[v0][v1]xfade=transition=radial:duration=1:offset=%d -y", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)).split(" "), 2, str, 4, str2, str3);
    }
}
