package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class DataType extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_ACTIVITY_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_CALORIES_EXPENDED;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_DISTANCE_DELTA;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_HEART_POINTS;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_HEART_RATE_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_HEIGHT_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_HYDRATION;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_LOCATION_BOUNDING_BOX;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_MOVE_MINUTES;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_NUTRITION_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_POWER_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_SPEED_SUMMARY;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_STEP_COUNT_DELTA;
    public static final com.google.android.gms.fitness.data.DataType AGGREGATE_WEIGHT_SUMMARY;
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.DataType> CREATOR = new com.google.android.gms.fitness.data.zzk();
    public static final java.lang.String MIME_TYPE_PREFIX = "vnd.google.fitness.data_type/";
    public static final com.google.android.gms.fitness.data.DataType TYPE_ACTIVITY_SEGMENT;
    public static final com.google.android.gms.fitness.data.DataType TYPE_BASAL_METABOLIC_RATE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_BODY_FAT_PERCENTAGE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_CALORIES_EXPENDED;
    public static final com.google.android.gms.fitness.data.DataType TYPE_CYCLING_PEDALING_CADENCE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_CYCLING_PEDALING_CUMULATIVE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_CYCLING_WHEEL_REVOLUTION;
    public static final com.google.android.gms.fitness.data.DataType TYPE_CYCLING_WHEEL_RPM;
    public static final com.google.android.gms.fitness.data.DataType TYPE_DISTANCE_DELTA;
    public static final com.google.android.gms.fitness.data.DataType TYPE_HEART_POINTS;
    public static final com.google.android.gms.fitness.data.DataType TYPE_HEART_RATE_BPM;
    public static final com.google.android.gms.fitness.data.DataType TYPE_HEIGHT;
    public static final com.google.android.gms.fitness.data.DataType TYPE_HYDRATION;
    public static final com.google.android.gms.fitness.data.DataType TYPE_LOCATION_SAMPLE;

    @java.lang.Deprecated
    public static final com.google.android.gms.fitness.data.DataType TYPE_LOCATION_TRACK;
    public static final com.google.android.gms.fitness.data.DataType TYPE_MOVE_MINUTES;
    public static final com.google.android.gms.fitness.data.DataType TYPE_NUTRITION;
    public static final com.google.android.gms.fitness.data.DataType TYPE_POWER_SAMPLE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_SLEEP_SEGMENT;
    public static final com.google.android.gms.fitness.data.DataType TYPE_SPEED;
    public static final com.google.android.gms.fitness.data.DataType TYPE_STEP_COUNT_CADENCE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_STEP_COUNT_CUMULATIVE;
    public static final com.google.android.gms.fitness.data.DataType TYPE_STEP_COUNT_DELTA;
    public static final com.google.android.gms.fitness.data.DataType TYPE_WEIGHT;
    public static final com.google.android.gms.fitness.data.DataType TYPE_WORKOUT_EXERCISE;
    public static final com.google.android.gms.fitness.data.DataType zza;
    public static final com.google.android.gms.fitness.data.DataType zzb;
    public static final com.google.android.gms.fitness.data.DataType zzc;
    public static final com.google.android.gms.fitness.data.DataType zzd;
    public static final com.google.android.gms.fitness.data.DataType zze;
    public static final com.google.android.gms.fitness.data.DataType zzf;
    public static final com.google.android.gms.fitness.data.DataType zzg;
    public static final com.google.android.gms.fitness.data.DataType zzh;
    public static final com.google.android.gms.fitness.data.DataType zzi;
    public static final com.google.android.gms.fitness.data.DataType zzj;
    public static final com.google.android.gms.fitness.data.DataType zzk;
    public static final com.google.android.gms.fitness.data.DataType zzl;
    public static final com.google.android.gms.fitness.data.DataType zzm;
    public static final com.google.android.gms.fitness.data.DataType zzn;
    public static final com.google.android.gms.fitness.data.DataType zzo;
    public static final com.google.android.gms.fitness.data.DataType zzp;
    public static final com.google.android.gms.fitness.data.DataType zzq;
    public static final com.google.android.gms.fitness.data.DataType zzr;
    public static final com.google.android.gms.fitness.data.DataType zzs;
    private final java.lang.String zzt;
    private final java.util.List zzu;
    private final java.lang.String zzv;
    private final java.lang.String zzw;

    static {
        com.google.android.gms.fitness.data.DataType dataType = new com.google.android.gms.fitness.data.DataType("com.google.step_count.delta", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_STEPS);
        TYPE_STEP_COUNT_DELTA = dataType;
        TYPE_STEP_COUNT_CUMULATIVE = new com.google.android.gms.fitness.data.DataType("com.google.step_count.cumulative", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_STEPS);
        TYPE_STEP_COUNT_CADENCE = new com.google.android.gms.fitness.data.DataType("com.google.step_count.cadence", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_RPM);
        zza = new com.google.android.gms.fitness.data.DataType("com.google.internal.goal", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.zze);
        TYPE_ACTIVITY_SEGMENT = new com.google.android.gms.fitness.data.DataType("com.google.activity.segment", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_ACTIVITY);
        TYPE_SLEEP_SEGMENT = new com.google.android.gms.fitness.data.DataType("com.google.sleep.segment", 2, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", com.google.android.gms.fitness.data.Field.FIELD_SLEEP_SEGMENT_TYPE);
        com.google.android.gms.fitness.data.DataType dataType2 = new com.google.android.gms.fitness.data.DataType("com.google.calories.expended", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_CALORIES);
        TYPE_CALORIES_EXPENDED = dataType2;
        TYPE_BASAL_METABOLIC_RATE = new com.google.android.gms.fitness.data.DataType("com.google.calories.bmr", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_CALORIES);
        TYPE_POWER_SAMPLE = new com.google.android.gms.fitness.data.DataType("com.google.power.sample", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_WATTS);
        zzb = new com.google.android.gms.fitness.data.DataType("com.google.sensor.events", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.zzg, com.google.android.gms.fitness.data.Field.zzh, com.google.android.gms.fitness.data.Field.zzi);
        TYPE_HEART_RATE_BPM = new com.google.android.gms.fitness.data.DataType("com.google.heart_rate.bpm", 1, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", com.google.android.gms.fitness.data.Field.FIELD_BPM);
        zzc = new com.google.android.gms.fitness.data.DataType("com.google.respiratory_rate", 1, "https://www.googleapis.com/auth/fitness.respiratory_rate.read", "https://www.googleapis.com/auth/fitness.respiratory_rate.write", com.google.android.gms.fitness.data.Field.zzd);
        TYPE_LOCATION_SAMPLE = new com.google.android.gms.fitness.data.DataType("com.google.location.sample", 1, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", com.google.android.gms.fitness.data.Field.FIELD_LATITUDE, com.google.android.gms.fitness.data.Field.FIELD_LONGITUDE, com.google.android.gms.fitness.data.Field.FIELD_ACCURACY, com.google.android.gms.fitness.data.Field.FIELD_ALTITUDE);
        TYPE_LOCATION_TRACK = new com.google.android.gms.fitness.data.DataType("com.google.location.track", 2, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", com.google.android.gms.fitness.data.Field.FIELD_LATITUDE, com.google.android.gms.fitness.data.Field.FIELD_LONGITUDE, com.google.android.gms.fitness.data.Field.FIELD_ACCURACY, com.google.android.gms.fitness.data.Field.FIELD_ALTITUDE);
        com.google.android.gms.fitness.data.DataType dataType3 = new com.google.android.gms.fitness.data.DataType("com.google.distance.delta", 2, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", com.google.android.gms.fitness.data.Field.FIELD_DISTANCE);
        TYPE_DISTANCE_DELTA = dataType3;
        TYPE_SPEED = new com.google.android.gms.fitness.data.DataType("com.google.speed", 1, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", com.google.android.gms.fitness.data.Field.FIELD_SPEED);
        TYPE_CYCLING_WHEEL_REVOLUTION = new com.google.android.gms.fitness.data.DataType("com.google.cycling.wheel_revolution.cumulative", 1, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", com.google.android.gms.fitness.data.Field.FIELD_REVOLUTIONS);
        TYPE_CYCLING_WHEEL_RPM = new com.google.android.gms.fitness.data.DataType("com.google.cycling.wheel_revolution.rpm", 1, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", com.google.android.gms.fitness.data.Field.FIELD_RPM);
        TYPE_CYCLING_PEDALING_CUMULATIVE = new com.google.android.gms.fitness.data.DataType("com.google.cycling.pedaling.cumulative", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_REVOLUTIONS);
        TYPE_CYCLING_PEDALING_CADENCE = new com.google.android.gms.fitness.data.DataType("com.google.cycling.pedaling.cadence", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_RPM);
        TYPE_HEIGHT = new com.google.android.gms.fitness.data.DataType("com.google.height", 1, "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", com.google.android.gms.fitness.data.Field.FIELD_HEIGHT);
        TYPE_WEIGHT = new com.google.android.gms.fitness.data.DataType("com.google.weight", 1, "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", com.google.android.gms.fitness.data.Field.FIELD_WEIGHT);
        TYPE_BODY_FAT_PERCENTAGE = new com.google.android.gms.fitness.data.DataType("com.google.body.fat.percentage", 1, "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", com.google.android.gms.fitness.data.Field.FIELD_PERCENTAGE);
        TYPE_NUTRITION = new com.google.android.gms.fitness.data.DataType("com.google.nutrition", 1, "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", com.google.android.gms.fitness.data.Field.FIELD_NUTRIENTS, com.google.android.gms.fitness.data.Field.FIELD_MEAL_TYPE, com.google.android.gms.fitness.data.Field.FIELD_FOOD_ITEM);
        com.google.android.gms.fitness.data.DataType dataType4 = new com.google.android.gms.fitness.data.DataType("com.google.hydration", 1, "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", com.google.android.gms.fitness.data.Field.FIELD_VOLUME);
        TYPE_HYDRATION = dataType4;
        TYPE_WORKOUT_EXERCISE = new com.google.android.gms.fitness.data.DataType("com.google.activity.exercise", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_EXERCISE, com.google.android.gms.fitness.data.Field.FIELD_REPETITIONS, com.google.android.gms.fitness.data.Field.zza, com.google.android.gms.fitness.data.Field.FIELD_RESISTANCE_TYPE, com.google.android.gms.fitness.data.Field.FIELD_RESISTANCE);
        com.google.android.gms.fitness.data.DataType dataType5 = new com.google.android.gms.fitness.data.DataType("com.google.active_minutes", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_DURATION);
        TYPE_MOVE_MINUTES = dataType5;
        AGGREGATE_MOVE_MINUTES = dataType5;
        zzd = new com.google.android.gms.fitness.data.DataType("com.google.device_on_body", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.zzk);
        AGGREGATE_ACTIVITY_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.activity.summary", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_ACTIVITY, com.google.android.gms.fitness.data.Field.FIELD_DURATION, com.google.android.gms.fitness.data.Field.FIELD_NUM_SEGMENTS);
        AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.calories.bmr.summary", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_STEP_COUNT_DELTA = dataType;
        AGGREGATE_DISTANCE_DELTA = dataType3;
        AGGREGATE_CALORIES_EXPENDED = dataType2;
        TYPE_HEART_POINTS = new com.google.android.gms.fitness.data.DataType("com.google.heart_minutes", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_INTENSITY);
        AGGREGATE_HEART_POINTS = new com.google.android.gms.fitness.data.DataType("com.google.heart_minutes.summary", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_INTENSITY, com.google.android.gms.fitness.data.Field.FIELD_DURATION);
        AGGREGATE_HEART_RATE_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.heart_rate.summary", 2, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_LOCATION_BOUNDING_BOX = new com.google.android.gms.fitness.data.DataType("com.google.location.bounding_box", 2, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", com.google.android.gms.fitness.data.Field.FIELD_LOW_LATITUDE, com.google.android.gms.fitness.data.Field.FIELD_LOW_LONGITUDE, com.google.android.gms.fitness.data.Field.FIELD_HIGH_LATITUDE, com.google.android.gms.fitness.data.Field.FIELD_HIGH_LONGITUDE);
        AGGREGATE_POWER_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.power.summary", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_SPEED_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.speed.summary", 2, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.body.fat.percentage.summary", 2, "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_WEIGHT_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.weight.summary", 2, "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_HEIGHT_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.height.summary", 2, "https://www.googleapis.com/auth/fitness.body.read", "https://www.googleapis.com/auth/fitness.body.write", com.google.android.gms.fitness.data.Field.FIELD_AVERAGE, com.google.android.gms.fitness.data.Field.FIELD_MAX, com.google.android.gms.fitness.data.Field.FIELD_MIN);
        AGGREGATE_NUTRITION_SUMMARY = new com.google.android.gms.fitness.data.DataType("com.google.nutrition.summary", 2, "https://www.googleapis.com/auth/fitness.nutrition.read", "https://www.googleapis.com/auth/fitness.nutrition.write", com.google.android.gms.fitness.data.Field.FIELD_NUTRIENTS, com.google.android.gms.fitness.data.Field.FIELD_MEAL_TYPE);
        AGGREGATE_HYDRATION = dataType4;
        zze = new com.google.android.gms.fitness.data.DataType("com.google.activity.samples", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.zzj);
        zzf = new com.google.android.gms.fitness.data.DataType("com.google.internal.sleep_attributes", 2, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", com.google.android.gms.fitness.data.Field.zzl);
        zzg = new com.google.android.gms.fitness.data.DataType("com.google.internal.sleep_schedule", 1, "https://www.googleapis.com/auth/fitness.sleep.read", "https://www.googleapis.com/auth/fitness.sleep.write", com.google.android.gms.fitness.data.Field.zzm);
        zzh = new com.google.android.gms.fitness.data.DataType("com.google.internal.paced_walking_attributes", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.zzn);
        zzi = new com.google.android.gms.fitness.data.DataType("com.google.time_zone_change", 1, "https://www.googleapis.com/auth/fitness.location.read", "https://www.googleapis.com/auth/fitness.location.write", com.google.android.gms.fitness.data.Field.zzo);
        zzj = new com.google.android.gms.fitness.data.DataType("com.google.internal.met", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.zzp);
        zzk = new com.google.android.gms.fitness.data.DataType("com.google.internal.internal_device_temperature", 2, "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", com.google.android.gms.fitness.data.Field.zzq);
        zzl = new com.google.android.gms.fitness.data.DataType("com.google.internal.skin_temperature", 2, "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", com.google.android.gms.fitness.data.Field.zzr);
        com.google.android.gms.fitness.data.Field field = com.google.android.gms.fitness.data.Field.FIELD_MIN_INT;
        zzm = new com.google.android.gms.fitness.data.DataType("com.google.internal.custom_heart_rate_zone", 1, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", com.google.android.gms.fitness.data.Field.zzs, field, field);
        zzn = new com.google.android.gms.fitness.data.DataType("com.google.internal.active_minutes_combined", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.zzt, com.google.android.gms.fitness.data.Field.zzu, com.google.android.gms.fitness.data.Field.zzv);
        zzo = new com.google.android.gms.fitness.data.DataType("com.google.internal.sedentary_time", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.zzw);
        zzp = new com.google.android.gms.fitness.data.DataType("com.google.internal.custom_max_heart_rate", 1, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.FIELD_MAX_INT);
        zzq = new com.google.android.gms.fitness.data.DataType("com.google.internal.momentary_stress_algorithm", 1, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", com.google.android.gms.fitness.data.Field.zzx);
        zzr = new com.google.android.gms.fitness.data.DataType("com.google.internal.magnetic_field_presence", 2, "https://www.googleapis.com/auth/fitness.activity.read", "https://www.googleapis.com/auth/fitness.activity.write", com.google.android.gms.fitness.data.Field.zzy);
        zzs = new com.google.android.gms.fitness.data.DataType("com.google.internal.momentary_stress_algorithm_windows", 2, "https://www.googleapis.com/auth/fitness.heart_rate.read", "https://www.googleapis.com/auth/fitness.heart_rate.write", com.google.android.gms.fitness.data.Field.zzz);
    }

    public DataType(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, com.google.android.gms.fitness.data.Field... fieldArr) {
        this.zzt = str;
        this.zzu = java.util.Collections.unmodifiableList(java.util.Arrays.asList(fieldArr));
        this.zzv = str2;
        this.zzw = str3;
    }

    @java.lang.Deprecated
    public static java.util.List<com.google.android.gms.fitness.data.DataType> getAggregatesForInput(com.google.android.gms.fitness.data.DataType dataType) {
        com.google.android.gms.fitness.data.DataType aggregateType = dataType.getAggregateType();
        return aggregateType == null ? java.util.Collections.emptyList() : java.util.Collections.singletonList(aggregateType);
    }

    public static java.lang.String getMimeType(com.google.android.gms.fitness.data.DataType dataType) {
        return MIME_TYPE_PREFIX.concat(java.lang.String.valueOf(dataType.getName()));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.DataType)) {
            return false;
        }
        com.google.android.gms.fitness.data.DataType dataType = (com.google.android.gms.fitness.data.DataType) obj;
        return this.zzt.equals(dataType.zzt) && this.zzu.equals(dataType.zzu);
    }

    public com.google.android.gms.fitness.data.DataType getAggregateType() {
        return (com.google.android.gms.fitness.data.DataType) com.google.android.gms.fitness.data.zza.zza.get(this);
    }

    public java.util.List<com.google.android.gms.fitness.data.Field> getFields() {
        return this.zzu;
    }

    public java.lang.String getName() {
        return this.zzt;
    }

    public int hashCode() {
        return this.zzt.hashCode();
    }

    public int indexOf(com.google.android.gms.fitness.data.Field field) {
        int indexOf = this.zzu.indexOf(field);
        com.google.android.gms.common.internal.Preconditions.checkArgument(indexOf >= 0, "%s not a field of %s", field, this);
        return indexOf;
    }

    public java.lang.String toString() {
        return java.lang.String.format("DataType{%s%s}", this.zzt, this.zzu);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getFields(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzv, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzw, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zza() {
        return this.zzv;
    }

    public final java.lang.String zzb() {
        return this.zzw;
    }

    public final java.lang.String zzc() {
        return this.zzt.startsWith("com.google.") ? this.zzt.substring(11) : this.zzt;
    }

    DataType(java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3) {
        this.zzt = str;
        this.zzu = java.util.Collections.unmodifiableList(list);
        this.zzv = str2;
        this.zzw = str3;
    }
}
