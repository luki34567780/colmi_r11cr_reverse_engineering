package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzl {
    public static final java.util.Set zza = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(com.google.android.gms.fitness.data.DataType.TYPE_MOVE_MINUTES, com.google.android.gms.fitness.data.DataType.AGGREGATE_MOVE_MINUTES, com.google.android.gms.fitness.data.DataType.TYPE_WORKOUT_EXERCISE, com.google.android.gms.fitness.data.DataType.zze, com.google.android.gms.fitness.data.DataType.TYPE_ACTIVITY_SEGMENT, com.google.android.gms.fitness.data.DataType.AGGREGATE_ACTIVITY_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BLOOD_GLUCOSE, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BLOOD_GLUCOSE_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BLOOD_PRESSURE, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BLOOD_PRESSURE_SUMMARY, com.google.android.gms.fitness.data.DataType.TYPE_BODY_FAT_PERCENTAGE, com.google.android.gms.fitness.data.DataType.AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BODY_TEMPERATURE, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BODY_TEMPERATURE_SUMMARY, com.google.android.gms.fitness.data.DataType.TYPE_BASAL_METABOLIC_RATE, com.google.android.gms.fitness.data.DataType.AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY, com.google.android.gms.fitness.data.DataType.TYPE_CALORIES_EXPENDED, com.google.android.gms.fitness.data.DataType.AGGREGATE_CALORIES_EXPENDED, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_MUCUS, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_POSITION, com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_PEDALING_CADENCE, com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_PEDALING_CUMULATIVE, com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_WHEEL_REVOLUTION, com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_WHEEL_RPM, com.google.android.gms.fitness.data.DataType.zzd, com.google.android.gms.fitness.data.DataType.TYPE_DISTANCE_DELTA, com.google.android.gms.fitness.data.DataType.AGGREGATE_DISTANCE_DELTA, com.google.android.gms.fitness.data.DataType.TYPE_HEART_POINTS, com.google.android.gms.fitness.data.DataType.AGGREGATE_HEART_POINTS, com.google.android.gms.fitness.data.DataType.TYPE_HEART_RATE_BPM, com.google.android.gms.fitness.data.DataType.AGGREGATE_HEART_RATE_SUMMARY, com.google.android.gms.fitness.data.DataType.TYPE_HEIGHT, com.google.android.gms.fitness.data.DataType.AGGREGATE_HEIGHT_SUMMARY, com.google.android.gms.fitness.data.DataType.TYPE_HYDRATION, com.google.android.gms.fitness.data.DataType.AGGREGATE_HYDRATION, com.google.android.gms.fitness.data.DataType.zzn, com.google.android.gms.fitness.data.DataType.zzm, com.google.android.gms.fitness.data.DataType.zzp, com.google.android.gms.fitness.data.DataType.zza, com.google.android.gms.fitness.data.DataType.zzk, com.google.android.gms.fitness.data.DataType.zzr, com.google.android.gms.fitness.data.DataType.zzj, com.google.android.gms.fitness.data.DataType.zzq, com.google.android.gms.fitness.data.DataType.zzs, com.google.android.gms.fitness.data.DataType.zzh, com.google.android.gms.fitness.data.DataType.zzo, com.google.android.gms.fitness.data.DataType.zzl, com.google.android.gms.fitness.data.DataType.zzf, com.google.android.gms.fitness.data.DataType.zzg, com.google.android.gms.fitness.data.DataType.AGGREGATE_LOCATION_BOUNDING_BOX, com.google.android.gms.fitness.data.DataType.TYPE_LOCATION_SAMPLE, com.google.android.gms.fitness.data.DataType.TYPE_LOCATION_TRACK, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_MENSTRUATION, com.google.android.gms.fitness.data.DataType.TYPE_NUTRITION, com.google.android.gms.fitness.data.DataType.AGGREGATE_NUTRITION_SUMMARY, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_OVULATION_TEST, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_OXYGEN_SATURATION, com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_OXYGEN_SATURATION_SUMMARY, com.google.android.gms.fitness.data.DataType.TYPE_POWER_SAMPLE, com.google.android.gms.fitness.data.DataType.AGGREGATE_POWER_SUMMARY, com.google.android.gms.fitness.data.DataType.zzc, com.google.android.gms.fitness.data.DataType.zzb, com.google.android.gms.fitness.data.DataType.TYPE_SLEEP_SEGMENT, com.google.android.gms.fitness.data.DataType.TYPE_SPEED, com.google.android.gms.fitness.data.DataType.AGGREGATE_SPEED_SUMMARY, com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_CADENCE, com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_CUMULATIVE, com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_DELTA, com.google.android.gms.fitness.data.DataType.AGGREGATE_STEP_COUNT_DELTA, com.google.android.gms.fitness.data.DataType.zzi, com.google.android.gms.fitness.data.HealthDataTypes.TYPE_VAGINAL_SPOTTING, com.google.android.gms.fitness.data.DataType.TYPE_WEIGHT, com.google.android.gms.fitness.data.DataType.AGGREGATE_WEIGHT_SUMMARY)));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.google.android.gms.fitness.data.DataType zza(java.lang.String str) {
        char c;
        switch (str.hashCode()) {
            case -2060095039:
                if (str.equals("com.google.cycling.wheel_revolution.rpm")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -2032495331:
                if (str.equals("com.google.respiratory_rate")) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case -2023954015:
                if (str.equals("com.google.location.bounding_box")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -1999891138:
                if (str.equals("com.google.heart_minutes")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1939429191:
                if (str.equals("com.google.blood_glucose.summary")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1823712045:
                if (str.equals("com.google.internal.met")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -1757812901:
                if (str.equals("com.google.location.sample")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case -1659958877:
                if (str.equals("com.google.menstruation")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case -1431431801:
                if (str.equals("com.google.height.summary")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1416335448:
                if (str.equals("com.google.internal.sleep_schedule")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case -1248818137:
                if (str.equals("com.google.distance.delta")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1194221816:
                if (str.equals("com.google.internal.momentary_stress_algorithm_windows")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1103712522:
                if (str.equals("com.google.heart_minutes.summary")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -1102520626:
                if (str.equals("com.google.step_count.delta")) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case -1091068721:
                if (str.equals("com.google.height")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -1026139708:
                if (str.equals("com.google.internal.momentary_stress_algorithm")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case -922976890:
                if (str.equals("com.google.cycling.pedaling.cumulative")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -900592674:
                if (str.equals("com.google.cycling.pedaling.cadence")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -892966990:
                if (str.equals("com.google.internal.magnetic_field_presence")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -886569606:
                if (str.equals("com.google.location.track")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case -812484668:
                if (str.equals("com.google.internal.internal_device_temperature")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -777285735:
                if (str.equals("com.google.heart_rate.summary")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -700668164:
                if (str.equals("com.google.internal.goal")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -661631456:
                if (str.equals("com.google.weight")) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case -526422027:
                if (str.equals("com.google.internal.active_minutes_combined")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -424876584:
                if (str.equals("com.google.weight.summary")) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case -362418992:
                if (str.equals("com.google.body.temperature")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -316596620:
                if (str.equals("com.google.sleep.segment")) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case -217611775:
                if (str.equals("com.google.blood_glucose")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -185830635:
                if (str.equals("com.google.power.summary")) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case -177293656:
                if (str.equals("com.google.nutrition.summary")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case -177035827:
                if (str.equals("com.google.internal.custom_heart_rate_zone")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -164586193:
                if (str.equals("com.google.activity.exercise")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -98150574:
                if (str.equals("com.google.heart_rate.bpm")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -56824761:
                if (str.equals("com.google.calories.bmr")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 53773386:
                if (str.equals("com.google.blood_pressure.summary")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 250049721:
                if (str.equals("com.google.internal.custom_max_heart_rate")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 269180370:
                if (str.equals("com.google.activity.samples")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 295793957:
                if (str.equals("com.google.sensor.events")) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case 296250623:
                if (str.equals("com.google.calories.bmr.summary")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 324760871:
                if (str.equals("com.google.step_count.cadence")) {
                    c = '=';
                    break;
                }
                c = 65535;
                break;
            case 378060028:
                if (str.equals("com.google.activity.segment")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 529727579:
                if (str.equals("com.google.power.sample")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 551831579:
                if (str.equals("com.google.internal.skin_temperature")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 657433501:
                if (str.equals("com.google.step_count.cumulative")) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case 682891187:
                if (str.equals("com.google.body.fat.percentage")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 841663855:
                if (str.equals("com.google.activity.summary")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 877955159:
                if (str.equals("com.google.speed.summary")) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case 899666941:
                if (str.equals("com.google.calories.expended")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 936279698:
                if (str.equals("com.google.blood_pressure")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 946706510:
                if (str.equals("com.google.hydration")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1029221057:
                if (str.equals("com.google.device_on_body")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1111569113:
                if (str.equals("com.google.time_zone_change")) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case 1111714923:
                if (str.equals("com.google.body.fat.percentage.summary")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1203049798:
                if (str.equals("com.google.internal.sedentary_time")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 1214093899:
                if (str.equals("com.google.vaginal_spotting")) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case 1404118825:
                if (str.equals("com.google.oxygen_saturation")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 1439932546:
                if (str.equals("com.google.ovulation_test")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 1498973736:
                if (str.equals("com.google.internal.sleep_attributes")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 1524007137:
                if (str.equals("com.google.cycling.wheel_revolution.cumulative")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1532018766:
                if (str.equals("com.google.active_minutes")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1633152752:
                if (str.equals("com.google.nutrition")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 1925848149:
                if (str.equals("com.google.cervical_position")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1975902189:
                if (str.equals("com.google.cervical_mucus")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2051843553:
                if (str.equals("com.google.oxygen_saturation.summary")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 2053496735:
                if (str.equals("com.google.speed")) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case 2131809416:
                if (str.equals("com.google.body.temperature.summary")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2145123220:
                if (str.equals("com.google.internal.paced_walking_attributes")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return com.google.android.gms.fitness.data.DataType.TYPE_MOVE_MINUTES;
            case 1:
                return com.google.android.gms.fitness.data.DataType.TYPE_WORKOUT_EXERCISE;
            case 2:
                return com.google.android.gms.fitness.data.DataType.zze;
            case 3:
                return com.google.android.gms.fitness.data.DataType.TYPE_ACTIVITY_SEGMENT;
            case 4:
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_ACTIVITY_SUMMARY;
            case 5:
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BLOOD_GLUCOSE;
            case 6:
                return com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BLOOD_GLUCOSE_SUMMARY;
            case 7:
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BLOOD_PRESSURE;
            case '\b':
                return com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BLOOD_PRESSURE_SUMMARY;
            case '\t':
                return com.google.android.gms.fitness.data.DataType.TYPE_BODY_FAT_PERCENTAGE;
            case '\n':
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY;
            case 11:
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_BODY_TEMPERATURE;
            case '\f':
                return com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_BODY_TEMPERATURE_SUMMARY;
            case '\r':
                return com.google.android.gms.fitness.data.DataType.TYPE_BASAL_METABOLIC_RATE;
            case 14:
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY;
            case 15:
                return com.google.android.gms.fitness.data.DataType.TYPE_CALORIES_EXPENDED;
            case 16:
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_MUCUS;
            case 17:
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_CERVICAL_POSITION;
            case 18:
                return com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_PEDALING_CADENCE;
            case 19:
                return com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_PEDALING_CUMULATIVE;
            case 20:
                return com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_WHEEL_REVOLUTION;
            case 21:
                return com.google.android.gms.fitness.data.DataType.TYPE_CYCLING_WHEEL_RPM;
            case 22:
                return com.google.android.gms.fitness.data.DataType.zzd;
            case 23:
                return com.google.android.gms.fitness.data.DataType.TYPE_DISTANCE_DELTA;
            case 24:
                return com.google.android.gms.fitness.data.DataType.TYPE_HEART_POINTS;
            case 25:
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_HEART_POINTS;
            case 26:
                return com.google.android.gms.fitness.data.DataType.TYPE_HEART_RATE_BPM;
            case 27:
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_HEART_RATE_SUMMARY;
            case 28:
                return com.google.android.gms.fitness.data.DataType.TYPE_HEIGHT;
            case 29:
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_HEIGHT_SUMMARY;
            case 30:
                return com.google.android.gms.fitness.data.DataType.TYPE_HYDRATION;
            case 31:
                return com.google.android.gms.fitness.data.DataType.zzn;
            case ' ':
                return com.google.android.gms.fitness.data.DataType.zzm;
            case '!':
                return com.google.android.gms.fitness.data.DataType.zzp;
            case '\"':
                return com.google.android.gms.fitness.data.DataType.zza;
            case '#':
                return com.google.android.gms.fitness.data.DataType.zzk;
            case '$':
                return com.google.android.gms.fitness.data.DataType.zzr;
            case '%':
                return com.google.android.gms.fitness.data.DataType.zzj;
            case '&':
                return com.google.android.gms.fitness.data.DataType.zzq;
            case '\'':
                return com.google.android.gms.fitness.data.DataType.zzs;
            case '(':
                return com.google.android.gms.fitness.data.DataType.zzh;
            case ')':
                return com.google.android.gms.fitness.data.DataType.zzo;
            case '*':
                return com.google.android.gms.fitness.data.DataType.zzl;
            case '+':
                return com.google.android.gms.fitness.data.DataType.zzf;
            case ',':
                return com.google.android.gms.fitness.data.DataType.zzg;
            case '-':
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_LOCATION_BOUNDING_BOX;
            case '.':
                return com.google.android.gms.fitness.data.DataType.TYPE_LOCATION_SAMPLE;
            case '/':
                return com.google.android.gms.fitness.data.DataType.TYPE_LOCATION_TRACK;
            case '0':
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_MENSTRUATION;
            case '1':
                return com.google.android.gms.fitness.data.DataType.TYPE_NUTRITION;
            case '2':
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_NUTRITION_SUMMARY;
            case '3':
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_OVULATION_TEST;
            case '4':
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_OXYGEN_SATURATION;
            case '5':
                return com.google.android.gms.fitness.data.HealthDataTypes.AGGREGATE_OXYGEN_SATURATION_SUMMARY;
            case '6':
                return com.google.android.gms.fitness.data.DataType.TYPE_POWER_SAMPLE;
            case '7':
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_POWER_SUMMARY;
            case '8':
                return com.google.android.gms.fitness.data.DataType.zzc;
            case '9':
                return com.google.android.gms.fitness.data.DataType.zzb;
            case ':':
                return com.google.android.gms.fitness.data.DataType.TYPE_SLEEP_SEGMENT;
            case ';':
                return com.google.android.gms.fitness.data.DataType.TYPE_SPEED;
            case '<':
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_SPEED_SUMMARY;
            case '=':
                return com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_CADENCE;
            case '>':
                return com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_CUMULATIVE;
            case '?':
                return com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_DELTA;
            case '@':
                return com.google.android.gms.fitness.data.DataType.zzi;
            case 'A':
                return com.google.android.gms.fitness.data.HealthDataTypes.TYPE_VAGINAL_SPOTTING;
            case 'B':
                return com.google.android.gms.fitness.data.DataType.TYPE_WEIGHT;
            case 'C':
                return com.google.android.gms.fitness.data.DataType.AGGREGATE_WEIGHT_SUMMARY;
            default:
                return null;
        }
    }
}
