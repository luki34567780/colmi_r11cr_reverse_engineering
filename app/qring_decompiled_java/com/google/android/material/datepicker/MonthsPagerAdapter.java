package com.google.android.material.datepicker;

/* loaded from: /tmp/dex/classes2.dex */
class MonthsPagerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.material.datepicker.MonthsPagerAdapter.ViewHolder> {
    private final com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    private final com.google.android.material.datepicker.DateSelector<?> dateSelector;
    private final int itemHeight;
    private final com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener onDayClickListener;

    MonthsPagerAdapter(android.content.Context context, com.google.android.material.datepicker.DateSelector<?> dateSelector, com.google.android.material.datepicker.CalendarConstraints calendarConstraints, com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener onDayClickListener) {
        com.google.android.material.datepicker.Month start = calendarConstraints.getStart();
        com.google.android.material.datepicker.Month end = calendarConstraints.getEnd();
        com.google.android.material.datepicker.Month openAt = calendarConstraints.getOpenAt();
        if (start.compareTo(openAt) > 0) {
            throw new java.lang.IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (openAt.compareTo(end) > 0) {
            throw new java.lang.IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.itemHeight = (com.google.android.material.datepicker.MonthAdapter.MAXIMUM_WEEKS * com.google.android.material.datepicker.MaterialCalendar.getDayHeight(context)) + (com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(context) ? com.google.android.material.datepicker.MaterialCalendar.getDayHeight(context) : 0);
        this.calendarConstraints = calendarConstraints;
        this.dateSelector = dateSelector;
        this.onDayClickListener = onDayClickListener;
        setHasStableIds(true);
    }

    public static class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        final com.google.android.material.datepicker.MaterialCalendarGridView monthGrid;
        final android.widget.TextView monthTitle;

        ViewHolder(android.widget.LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.google.android.material.R.id.month_title);
            this.monthTitle = textView;
            androidx.core.view.ViewCompat.setAccessibilityHeading(textView, true);
            this.monthGrid = (com.google.android.material.datepicker.MaterialCalendarGridView) linearLayout.findViewById(com.google.android.material.R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public com.google.android.material.datepicker.MonthsPagerAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.material.R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, this.itemHeight));
            return new com.google.android.material.datepicker.MonthsPagerAdapter.ViewHolder(linearLayout, true);
        }
        return new com.google.android.material.datepicker.MonthsPagerAdapter.ViewHolder(linearLayout, false);
    }

    public void onBindViewHolder(com.google.android.material.datepicker.MonthsPagerAdapter.ViewHolder viewHolder, int i) {
        com.google.android.material.datepicker.Month monthsLater = this.calendarConstraints.getStart().monthsLater(i);
        viewHolder.monthTitle.setText(monthsLater.getLongName());
        final com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView = (com.google.android.material.datepicker.MaterialCalendarGridView) viewHolder.monthGrid.findViewById(com.google.android.material.R.id.month_grid);
        if (materialCalendarGridView.getAdapter() != null && monthsLater.equals(materialCalendarGridView.getAdapter().month)) {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        } else {
            com.google.android.material.datepicker.MonthAdapter monthAdapter = new com.google.android.material.datepicker.MonthAdapter(monthsLater, this.dateSelector, this.calendarConstraints);
            materialCalendarGridView.setNumColumns(monthsLater.daysInWeek);
            materialCalendarGridView.setAdapter((android.widget.ListAdapter) monthAdapter);
        }
        materialCalendarGridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j) {
                if (materialCalendarGridView.getAdapter().withinMonth(i2)) {
                    com.google.android.material.datepicker.MonthsPagerAdapter.this.onDayClickListener.onDayClick(materialCalendarGridView.getAdapter().getItem(i2).longValue());
                }
            }
        });
    }

    public long getItemId(int i) {
        return this.calendarConstraints.getStart().monthsLater(i).getStableId();
    }

    public int getItemCount() {
        return this.calendarConstraints.getMonthSpan();
    }

    java.lang.CharSequence getPageTitle(int i) {
        return getPageMonth(i).getLongName();
    }

    com.google.android.material.datepicker.Month getPageMonth(int i) {
        return this.calendarConstraints.getStart().monthsLater(i);
    }

    int getPosition(com.google.android.material.datepicker.Month month) {
        return this.calendarConstraints.getStart().monthsUntil(month);
    }
}
