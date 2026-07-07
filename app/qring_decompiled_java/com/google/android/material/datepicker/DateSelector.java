package com.google.android.material.datepicker;

/* loaded from: /tmp/dex/classes2.dex */
public interface DateSelector<S> extends android.os.Parcelable {
    int getDefaultThemeResId(android.content.Context context);

    int getDefaultTitleResId();

    java.util.Collection<java.lang.Long> getSelectedDays();

    java.util.Collection<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> getSelectedRanges();

    S getSelection();

    java.lang.String getSelectionDisplayString(android.content.Context context);

    boolean isSelectionComplete();

    android.view.View onCreateTextInputView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle, com.google.android.material.datepicker.CalendarConstraints calendarConstraints, com.google.android.material.datepicker.OnSelectionChangedListener<S> onSelectionChangedListener);

    void select(long j);

    void setSelection(S s);
}
