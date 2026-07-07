package com.google.android.material.datepicker;

/* loaded from: /tmp/dex/classes2.dex */
final class MaterialCalendarGridView extends android.widget.GridView {
    private final java.util.Calendar dayCompute;

    public MaterialCalendarGridView(android.content.Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dayCompute = com.google.android.material.datepicker.UtcDates.getUtcCalendar();
        if (com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(com.google.android.material.R.id.cancel_button);
            setNextFocusRightId(com.google.android.material.R.id.confirm_button);
        }
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this, new androidx.core.view.AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo((java.lang.Object) null);
            }
        });
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().firstPositionInMonth()) {
            super.setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().firstPositionInMonth()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().firstPositionInMonth());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public android.widget.ListAdapter getAdapter2() {
        return (com.google.android.material.datepicker.MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(android.widget.ListAdapter listAdapter) {
        if (!(listAdapter instanceof com.google.android.material.datepicker.MonthAdapter)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%1$s must have its Adapter set to a %2$s", com.google.android.material.datepicker.MaterialCalendarGridView.class.getCanonicalName(), com.google.android.material.datepicker.MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        int dayToPosition;
        int horizontalMidPoint;
        int dayToPosition2;
        int horizontalMidPoint2;
        com.google.android.material.datepicker.MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        com.google.android.material.datepicker.MonthAdapter adapter = getAdapter();
        com.google.android.material.datepicker.DateSelector<?> dateSelector = adapter.dateSelector;
        com.google.android.material.datepicker.CalendarStyle calendarStyle = adapter.calendarStyle;
        java.lang.Long item = adapter.getItem(adapter.firstPositionInMonth());
        java.lang.Long item2 = adapter.getItem(adapter.lastPositionInMonth());
        for (androidx.core.util.Pair<java.lang.Long, java.lang.Long> pair : dateSelector.getSelectedRanges()) {
            if (pair.first != null) {
                if (pair.second == null) {
                    continue;
                } else {
                    long longValue = ((java.lang.Long) pair.first).longValue();
                    long longValue2 = ((java.lang.Long) pair.second).longValue();
                    if (skipMonth(item, item2, java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue2))) {
                        return;
                    }
                    if (longValue < item.longValue()) {
                        dayToPosition = adapter.firstPositionInMonth();
                        horizontalMidPoint = adapter.isFirstInRow(dayToPosition) ? 0 : materialCalendarGridView.getChildAt(dayToPosition - 1).getRight();
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(longValue);
                        dayToPosition = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        horizontalMidPoint = horizontalMidPoint(materialCalendarGridView.getChildAt(dayToPosition));
                    }
                    if (longValue2 > item2.longValue()) {
                        dayToPosition2 = java.lang.Math.min(adapter.lastPositionInMonth(), getChildCount() - 1);
                        if (adapter.isLastInRow(dayToPosition2)) {
                            horizontalMidPoint2 = getWidth();
                        } else {
                            horizontalMidPoint2 = materialCalendarGridView.getChildAt(dayToPosition2).getRight();
                        }
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(longValue2);
                        dayToPosition2 = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        horizontalMidPoint2 = horizontalMidPoint(materialCalendarGridView.getChildAt(dayToPosition2));
                    }
                    int itemId = (int) adapter.getItemId(dayToPosition);
                    int itemId2 = (int) adapter.getItemId(dayToPosition2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        android.view.View childAt = materialCalendarGridView.getChildAt(numColumns);
                        canvas.drawRect(numColumns > dayToPosition ? 0 : horizontalMidPoint, childAt.getTop() + calendarStyle.day.getTopInset(), dayToPosition2 > numColumns2 ? getWidth() : horizontalMidPoint2, childAt.getBottom() - calendarStyle.day.getBottomInset(), calendarStyle.rangeFill);
                        itemId++;
                        materialCalendarGridView = this;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        if (z) {
            gainFocus(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    private void gainFocus(int i, android.graphics.Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().lastPositionInMonth());
        } else if (i == 130) {
            setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    private static boolean skipMonth(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    private static int horizontalMidPoint(android.view.View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }
}
