package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class Field extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int FORMAT_FLOAT = 2;
    public static final int FORMAT_INT32 = 1;
    public static final int FORMAT_MAP = 4;
    public static final int FORMAT_STRING = 3;
    public static final int MEAL_TYPE_BREAKFAST = 1;
    public static final int MEAL_TYPE_DINNER = 3;
    public static final int MEAL_TYPE_LUNCH = 2;
    public static final int MEAL_TYPE_SNACK = 4;
    public static final int MEAL_TYPE_UNKNOWN = 0;
    public static final java.lang.String NUTRIENT_CALCIUM = "calcium";
    public static final java.lang.String NUTRIENT_CHOLESTEROL = "cholesterol";
    public static final java.lang.String NUTRIENT_DIETARY_FIBER = "dietary_fiber";
    public static final java.lang.String NUTRIENT_IRON = "iron";
    public static final java.lang.String NUTRIENT_MONOUNSATURATED_FAT = "fat.monounsaturated";
    public static final java.lang.String NUTRIENT_POLYUNSATURATED_FAT = "fat.polyunsaturated";
    public static final java.lang.String NUTRIENT_POTASSIUM = "potassium";
    public static final java.lang.String NUTRIENT_PROTEIN = "protein";
    public static final java.lang.String NUTRIENT_SATURATED_FAT = "fat.saturated";
    public static final java.lang.String NUTRIENT_SODIUM = "sodium";
    public static final java.lang.String NUTRIENT_SUGAR = "sugar";
    public static final java.lang.String NUTRIENT_TOTAL_CARBS = "carbs.total";
    public static final java.lang.String NUTRIENT_TOTAL_FAT = "fat.total";
    public static final java.lang.String NUTRIENT_TRANS_FAT = "fat.trans";
    public static final java.lang.String NUTRIENT_UNSATURATED_FAT = "fat.unsaturated";
    public static final java.lang.String NUTRIENT_VITAMIN_A = "vitamin_a";
    public static final java.lang.String NUTRIENT_VITAMIN_C = "vitamin_c";
    public static final int RESISTANCE_TYPE_BARBELL = 1;
    public static final int RESISTANCE_TYPE_BODY = 6;
    public static final int RESISTANCE_TYPE_CABLE = 2;
    public static final int RESISTANCE_TYPE_DUMBBELL = 3;
    public static final int RESISTANCE_TYPE_KETTLEBELL = 4;
    public static final int RESISTANCE_TYPE_MACHINE = 5;
    public static final int RESISTANCE_TYPE_UNKNOWN = 0;
    private final java.lang.String zzA;
    private final int zzB;
    private final java.lang.Boolean zzC;
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Field> CREATOR = new com.google.android.gms.fitness.data.zzq();
    public static final com.google.android.gms.fitness.data.Field FIELD_ACTIVITY = zzd("activity");
    public static final com.google.android.gms.fitness.data.Field FIELD_SLEEP_SEGMENT_TYPE = zzd("sleep_segment_type");
    public static final com.google.android.gms.fitness.data.Field FIELD_CONFIDENCE = zzb("confidence");
    public static final com.google.android.gms.fitness.data.Field FIELD_STEPS = zzd("steps");

    @java.lang.Deprecated
    public static final com.google.android.gms.fitness.data.Field FIELD_STEP_LENGTH = zzb("step_length");
    public static final com.google.android.gms.fitness.data.Field FIELD_DURATION = zzd("duration");
    public static final com.google.android.gms.fitness.data.Field zza = zzf("duration");
    public static final com.google.android.gms.fitness.data.Field zzb = zzc("activity_duration.ascending");
    public static final com.google.android.gms.fitness.data.Field zzc = zzc("activity_duration.descending");
    public static final com.google.android.gms.fitness.data.Field FIELD_BPM = zzb("bpm");
    public static final com.google.android.gms.fitness.data.Field zzd = zzb("respiratory_rate");
    public static final com.google.android.gms.fitness.data.Field FIELD_LATITUDE = zzb("latitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_LONGITUDE = zzb("longitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_ACCURACY = zzb("accuracy");
    public static final com.google.android.gms.fitness.data.Field FIELD_ALTITUDE = zze("altitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_DISTANCE = zzb("distance");
    public static final com.google.android.gms.fitness.data.Field FIELD_HEIGHT = zzb("height");
    public static final com.google.android.gms.fitness.data.Field FIELD_WEIGHT = zzb("weight");
    public static final com.google.android.gms.fitness.data.Field FIELD_PERCENTAGE = zzb("percentage");
    public static final com.google.android.gms.fitness.data.Field FIELD_SPEED = zzb("speed");
    public static final com.google.android.gms.fitness.data.Field FIELD_RPM = zzb("rpm");
    public static final com.google.android.gms.fitness.data.Field zze = zza("google.android.fitness.GoalV2");
    public static final com.google.android.gms.fitness.data.Field zzf = zza("google.android.fitness.Device");
    public static final com.google.android.gms.fitness.data.Field FIELD_REVOLUTIONS = zzd("revolutions");
    public static final java.lang.String NUTRIENT_CALORIES = "calories";
    public static final com.google.android.gms.fitness.data.Field FIELD_CALORIES = zzb(NUTRIENT_CALORIES);
    public static final com.google.android.gms.fitness.data.Field FIELD_WATTS = zzb("watts");
    public static final com.google.android.gms.fitness.data.Field FIELD_VOLUME = zzb("volume");
    public static final com.google.android.gms.fitness.data.Field FIELD_MEAL_TYPE = zzf("meal_type");
    public static final com.google.android.gms.fitness.data.Field FIELD_FOOD_ITEM = new com.google.android.gms.fitness.data.Field("food_item", 3, true);
    public static final com.google.android.gms.fitness.data.Field FIELD_NUTRIENTS = zzc("nutrients");
    public static final com.google.android.gms.fitness.data.Field FIELD_EXERCISE = zzg("exercise");
    public static final com.google.android.gms.fitness.data.Field FIELD_REPETITIONS = zzf("repetitions");
    public static final com.google.android.gms.fitness.data.Field FIELD_RESISTANCE = zze("resistance");
    public static final com.google.android.gms.fitness.data.Field FIELD_RESISTANCE_TYPE = zzf("resistance_type");
    public static final com.google.android.gms.fitness.data.Field FIELD_NUM_SEGMENTS = zzd("num_segments");
    public static final com.google.android.gms.fitness.data.Field FIELD_AVERAGE = zzb("average");
    public static final com.google.android.gms.fitness.data.Field FIELD_MAX = zzb("max");
    public static final com.google.android.gms.fitness.data.Field FIELD_MIN = zzb("min");
    public static final com.google.android.gms.fitness.data.Field FIELD_LOW_LATITUDE = zzb("low_latitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_LOW_LONGITUDE = zzb("low_longitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_HIGH_LATITUDE = zzb("high_latitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_HIGH_LONGITUDE = zzb("high_longitude");
    public static final com.google.android.gms.fitness.data.Field FIELD_OCCURRENCES = zzd("occurrences");
    public static final com.google.android.gms.fitness.data.Field zzg = zzd("sensor_type");
    public static final com.google.android.gms.fitness.data.Field zzh = new com.google.android.gms.fitness.data.Field("timestamps", 5, null);
    public static final com.google.android.gms.fitness.data.Field zzi = new com.google.android.gms.fitness.data.Field("sensor_values", 6, null);
    public static final com.google.android.gms.fitness.data.Field FIELD_INTENSITY = zzb("intensity");
    public static final com.google.android.gms.fitness.data.Field zzj = zzc("activity_confidence");
    public static final com.google.android.gms.fitness.data.Field zzk = zzb("probability");
    public static final com.google.android.gms.fitness.data.Field zzl = zza("google.android.fitness.SleepAttributes");
    public static final com.google.android.gms.fitness.data.Field zzm = zza("google.android.fitness.SleepSchedule");

    @java.lang.Deprecated
    public static final com.google.android.gms.fitness.data.Field FIELD_CIRCUMFERENCE = zzb("circumference");
    public static final com.google.android.gms.fitness.data.Field zzn = zza("google.android.fitness.PacedWalkingAttributes");
    public static final com.google.android.gms.fitness.data.Field zzo = zzg("zone_id");
    public static final com.google.android.gms.fitness.data.Field zzp = zzb("met");
    public static final com.google.android.gms.fitness.data.Field zzq = zzb("internal_device_temperature");
    public static final com.google.android.gms.fitness.data.Field zzr = zzb("skin_temperature");
    public static final com.google.android.gms.fitness.data.Field zzs = zzd("custom_heart_rate_zone_status");
    public static final com.google.android.gms.fitness.data.Field FIELD_MIN_INT = zzd("min_int");
    public static final com.google.android.gms.fitness.data.Field FIELD_MAX_INT = zzd("max_int");
    public static final com.google.android.gms.fitness.data.Field zzt = zzf("lightly_active_duration");
    public static final com.google.android.gms.fitness.data.Field zzu = zzf("moderately_active_duration");
    public static final com.google.android.gms.fitness.data.Field zzv = zzf("very_active_duration");
    public static final com.google.android.gms.fitness.data.Field zzw = zza("google.android.fitness.SedentaryTime");
    public static final com.google.android.gms.fitness.data.Field zzx = zza("google.android.fitness.MomentaryStressAlgorithm");
    public static final com.google.android.gms.fitness.data.Field zzy = zzd("magnet_presence");
    public static final com.google.android.gms.fitness.data.Field zzz = zza("google.android.fitness.MomentaryStressAlgorithmWindows");

    public Field(java.lang.String str, int i, java.lang.Boolean bool) {
        this.zzA = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzB = i;
        this.zzC = bool;
    }

    public static com.google.android.gms.fitness.data.Field zza(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 7, null);
    }

    public static com.google.android.gms.fitness.data.Field zzb(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 2, null);
    }

    public static com.google.android.gms.fitness.data.Field zzc(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 4, null);
    }

    public static com.google.android.gms.fitness.data.Field zzd(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 1, null);
    }

    public static com.google.android.gms.fitness.data.Field zze(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 2, true);
    }

    public static com.google.android.gms.fitness.data.Field zzf(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 1, true);
    }

    public static com.google.android.gms.fitness.data.Field zzg(java.lang.String str) {
        return new com.google.android.gms.fitness.data.Field(str, 3, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.Field)) {
            return false;
        }
        com.google.android.gms.fitness.data.Field field = (com.google.android.gms.fitness.data.Field) obj;
        return this.zzA.equals(field.zzA) && this.zzB == field.zzB;
    }

    public int getFormat() {
        return this.zzB;
    }

    public java.lang.String getName() {
        return this.zzA;
    }

    public int hashCode() {
        return this.zzA.hashCode();
    }

    public java.lang.Boolean isOptional() {
        return this.zzC;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.zzA;
        objArr[1] = this.zzB == 1 ? "i" : "f";
        return java.lang.String.format("%s(%s)", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getFormat());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanObject(parcel, 3, isOptional(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
