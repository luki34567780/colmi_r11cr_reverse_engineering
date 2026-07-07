package com.qcwireless.qcwatch.ui.device.week.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class WeekDayAdapter<VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> implements android.view.View.OnClickListener {
    private com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemClickListener onItemClickListener;
    private com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener onItemMultiSelectListener;
    private com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemSingleSelectListener onItemSingleSelectListener;
    private com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode selectMode;
    private int singleSelected = 0;
    private java.util.List<java.lang.Integer> multiSelected = new java.util.ArrayList();
    private int maxSelectedCount = -1;

    public interface OnItemClickListener {
        void onClicked(int itemPosition);
    }

    public interface OnItemMultiSelectListener {
        void onSelected(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.Operation operation, int itemPosition, boolean isSelected);
    }

    public interface OnItemSingleSelectListener {
        void onSelected(int itemPosition, boolean isSelected);
    }

    public enum Operation {
        ORDINARY,
        ALL_SELECTED,
        REVERSE_SELECTED,
        ALL_CANCEL,
        SET_MAX_COUNT
    }

    public enum SelectMode {
        CLICK,
        SINGLE_SELECT,
        MULTI_SELECT
    }

    public abstract void whenBindViewHolder(VH holder, int position);

    public void setOnItemClickListener(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setOnItemSingleSelectListener(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemSingleSelectListener onItemSingleSelectListener) {
        this.onItemSingleSelectListener = onItemSingleSelectListener;
    }

    public void setOnItemMultiSelectListener(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener onItemMultiSelectListener) {
        this.onItemMultiSelectListener = onItemMultiSelectListener;
    }

    public void onBindViewHolder(VH holder, int position) {
        whenBindViewHolder(holder, position);
        ((androidx.recyclerview.widget.RecyclerView.ViewHolder) holder).itemView.setTag(java.lang.Integer.valueOf(position));
        ((androidx.recyclerview.widget.RecyclerView.ViewHolder) holder).itemView.setOnClickListener(this);
        if (this.selectMode == com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode.CLICK) {
            ((androidx.recyclerview.widget.RecyclerView.ViewHolder) holder).itemView.setSelected(false);
            return;
        }
        if (this.selectMode == com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode.SINGLE_SELECT) {
            if (this.singleSelected == position) {
                ((androidx.recyclerview.widget.RecyclerView.ViewHolder) holder).itemView.setSelected(true);
                return;
            } else {
                ((androidx.recyclerview.widget.RecyclerView.ViewHolder) holder).itemView.setSelected(false);
                return;
            }
        }
        if (this.selectMode == com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode.MULTI_SELECT) {
            if (this.multiSelected.contains(java.lang.Integer.valueOf(position))) {
                ((androidx.recyclerview.widget.RecyclerView.ViewHolder) holder).itemView.setSelected(true);
            } else {
                ((androidx.recyclerview.widget.RecyclerView.ViewHolder) holder).itemView.setSelected(false);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v) {
        int intValue = ((java.lang.Integer) v.getTag()).intValue();
        if (this.selectMode == com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode.CLICK) {
            com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemClickListener onItemClickListener = this.onItemClickListener;
            if (onItemClickListener != null) {
                onItemClickListener.onClicked(intValue);
                return;
            }
            return;
        }
        if (this.selectMode == com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode.SINGLE_SELECT) {
            com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemSingleSelectListener onItemSingleSelectListener = this.onItemSingleSelectListener;
            if (onItemSingleSelectListener != null) {
                if (this.singleSelected == intValue) {
                    onItemSingleSelectListener.onSelected(intValue, false);
                } else {
                    this.singleSelected = intValue;
                    onItemSingleSelectListener.onSelected(intValue, true);
                }
            }
            notifyDataSetChanged();
            return;
        }
        if (this.selectMode == com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode.MULTI_SELECT) {
            if (this.maxSelectedCount <= 0 || this.multiSelected.size() < this.maxSelectedCount) {
                if (this.multiSelected.contains(java.lang.Integer.valueOf(intValue))) {
                    this.multiSelected.remove(java.lang.Integer.valueOf(intValue));
                    com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener onItemMultiSelectListener = this.onItemMultiSelectListener;
                    if (onItemMultiSelectListener != null) {
                        onItemMultiSelectListener.onSelected(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.Operation.ORDINARY, intValue, false);
                    }
                } else {
                    this.multiSelected.add(java.lang.Integer.valueOf(intValue));
                    com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener onItemMultiSelectListener2 = this.onItemMultiSelectListener;
                    if (onItemMultiSelectListener2 != null) {
                        onItemMultiSelectListener2.onSelected(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.Operation.ORDINARY, intValue, true);
                    }
                }
            } else if (this.multiSelected.size() == this.maxSelectedCount && this.multiSelected.contains(java.lang.Integer.valueOf(intValue))) {
                this.multiSelected.remove(java.lang.Integer.valueOf(intValue));
                com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener onItemMultiSelectListener3 = this.onItemMultiSelectListener;
                if (onItemMultiSelectListener3 != null) {
                    onItemMultiSelectListener3.onSelected(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.Operation.ORDINARY, intValue, false);
                }
            }
            notifyDataSetChanged();
        }
    }

    public void setSelectMode(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode selectMode) {
        this.selectMode = selectMode;
        notifyDataSetChanged();
    }

    public com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode getSelectMode() {
        return this.selectMode;
    }

    public void setSelected(int... itemPositions) {
        this.multiSelected.clear();
        if (this.selectMode == com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode.SINGLE_SELECT) {
            int i = itemPositions[0];
            this.singleSelected = i;
            com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemSingleSelectListener onItemSingleSelectListener = this.onItemSingleSelectListener;
            if (onItemSingleSelectListener != null) {
                onItemSingleSelectListener.onSelected(i, true);
            }
        } else {
            for (int i2 : itemPositions) {
                this.multiSelected.add(java.lang.Integer.valueOf(i2));
                com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener onItemMultiSelectListener = this.onItemMultiSelectListener;
                if (onItemMultiSelectListener != null) {
                    onItemMultiSelectListener.onSelected(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.Operation.ORDINARY, i2, true);
                }
            }
        }
        notifyDataSetChanged();
    }

    public int getSingleSelected() {
        return this.singleSelected;
    }

    public void clearSelected() {
        if (this.selectMode == com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode.MULTI_SELECT) {
            this.multiSelected.clear();
            com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener onItemMultiSelectListener = this.onItemMultiSelectListener;
            if (onItemMultiSelectListener != null) {
                onItemMultiSelectListener.onSelected(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.Operation.ALL_CANCEL, -1, false);
            }
            notifyDataSetChanged();
        }
    }

    public int getSingleSelectedPosition() {
        return this.singleSelected;
    }

    public java.util.List<java.lang.Integer> getMultiSelectedPosition() {
        return this.multiSelected;
    }

    public void setMaxSelectedCount(int maxSelectedCount) {
        if (maxSelectedCount < this.multiSelected.size()) {
            this.multiSelected.clear();
        }
        this.maxSelectedCount = maxSelectedCount;
        com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener onItemMultiSelectListener = this.onItemMultiSelectListener;
        if (onItemMultiSelectListener != null) {
            onItemMultiSelectListener.onSelected(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.Operation.SET_MAX_COUNT, -1, false);
        }
        notifyDataSetChanged();
    }

    public int getMaxSelectedCount() {
        return this.maxSelectedCount;
    }

    public void selectAll() {
        if (this.maxSelectedCount <= 0) {
            this.multiSelected.clear();
            for (int i = 0; i < getItemCount(); i++) {
                this.multiSelected.add(java.lang.Integer.valueOf(i));
            }
            com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener onItemMultiSelectListener = this.onItemMultiSelectListener;
            if (onItemMultiSelectListener != null) {
                onItemMultiSelectListener.onSelected(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.Operation.ALL_SELECTED, -1, false);
            }
            notifyDataSetChanged();
        }
    }

    public void reverseSelected() {
        if (this.maxSelectedCount <= 0) {
            com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.OnItemMultiSelectListener onItemMultiSelectListener = this.onItemMultiSelectListener;
            if (onItemMultiSelectListener != null) {
                onItemMultiSelectListener.onSelected(com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.Operation.REVERSE_SELECTED, -1, false);
            }
            for (int i = 0; i < getItemCount(); i++) {
                if (this.multiSelected.contains(java.lang.Integer.valueOf(i))) {
                    this.multiSelected.remove(java.lang.Integer.valueOf(i));
                } else {
                    this.multiSelected.add(java.lang.Integer.valueOf(i));
                }
            }
            notifyDataSetChanged();
        }
    }

    public boolean isSelected(int position) {
        if (this.selectMode == com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode.SINGLE_SELECT) {
            return position == this.singleSelected;
        }
        if (this.selectMode == com.qcwireless.qcwatch.ui.device.week.adapter.WeekDayAdapter.SelectMode.MULTI_SELECT) {
            return this.multiSelected.contains(java.lang.Integer.valueOf(position));
        }
        return false;
    }
}
