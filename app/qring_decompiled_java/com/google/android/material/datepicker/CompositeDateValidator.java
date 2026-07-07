package com.google.android.material.datepicker;

/* loaded from: /tmp/dex/classes2.dex */
public final class CompositeDateValidator implements com.google.android.material.datepicker.CalendarConstraints.DateValidator {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.CompositeDateValidator> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.datepicker.CompositeDateValidator>() { // from class: com.google.android.material.datepicker.CompositeDateValidator.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.CompositeDateValidator createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.material.datepicker.CompositeDateValidator((java.util.List) androidx.core.util.Preconditions.checkNotNull(parcel.readArrayList(com.google.android.material.datepicker.CalendarConstraints.DateValidator.class.getClassLoader())));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.CompositeDateValidator[] newArray(int i) {
            return new com.google.android.material.datepicker.CompositeDateValidator[i];
        }
    };
    private final java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> validators;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CompositeDateValidator(java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> list) {
        this.validators = list;
    }

    public static com.google.android.material.datepicker.CalendarConstraints.DateValidator allOf(java.util.List<com.google.android.material.datepicker.CalendarConstraints.DateValidator> list) {
        return new com.google.android.material.datepicker.CompositeDateValidator(list);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j) {
        for (com.google.android.material.datepicker.CalendarConstraints.DateValidator dateValidator : this.validators) {
            if (dateValidator != null && !dateValidator.isValid(j)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(this.validators);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.material.datepicker.CompositeDateValidator) {
            return this.validators.equals(((com.google.android.material.datepicker.CompositeDateValidator) obj).validators);
        }
        return false;
    }

    public int hashCode() {
        return this.validators.hashCode();
    }
}
