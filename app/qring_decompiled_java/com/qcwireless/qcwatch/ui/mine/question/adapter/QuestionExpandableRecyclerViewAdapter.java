package com.qcwireless.qcwatch.ui.mine.question.adapter;

/* loaded from: /tmp/dex/classes2.dex */
public class QuestionExpandableRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter {
    private android.content.Context mContext;
    private java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.DataListTree<java.lang.String, com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail>> mDataListTrees;
    private java.util.List<java.lang.Boolean> mGroupItemStatus;
    private java.util.Map<java.lang.Integer, int[]> map = new java.util.HashMap();
    private java.text.DecimalFormat df = new java.text.DecimalFormat("#.00", new java.text.DecimalFormatSymbols(java.util.Locale.US));

    public QuestionExpandableRecyclerViewAdapter(android.content.Context context) {
        this.mContext = context;
        this.map.put(4, new int[]{com.qcwireless.qcwatch.R.string.qc_text_213, com.qcwireless.qcwatch.R.mipmap.sport_buxing});
        this.map.put(5, new int[]{com.qcwireless.qcwatch.R.string.qc_text_271, com.qcwireless.qcwatch.R.mipmap.sport_tiaosheng});
        this.map.put(7, new int[]{com.qcwireless.qcwatch.R.string.qc_text_92, com.qcwireless.qcwatch.R.mipmap.sport_paobu});
        this.map.put(8, new int[]{com.qcwireless.qcwatch.R.string.qc_text_214, com.qcwireless.qcwatch.R.mipmap.sport_tubu});
        this.map.put(9, new int[]{com.qcwireless.qcwatch.R.string.qc_text_216, com.qcwireless.qcwatch.R.mipmap.sport_qixing});
        this.map.put(10, new int[]{com.qcwireless.qcwatch.R.string.qc_text_215, com.qcwireless.qcwatch.R.mipmap.sport_duanlian});
        this.map.put(11, new int[]{com.qcwireless.qcwatch.R.string.qc_text_217, com.qcwireless.qcwatch.R.mipmap.sport_huipai});
        this.df.setRoundingMode(java.math.RoundingMode.HALF_UP);
    }

    public void setData(java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.DataListTree<java.lang.String, com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail>> dataListTrees) {
        this.mDataListTrees = dataListTrees;
        initGroupItemStatus();
        notifyDataSetChanged();
    }

    private void initGroupItemStatus() {
        this.mGroupItemStatus = new java.util.ArrayList();
        for (int i = 0; i < this.mDataListTrees.size(); i++) {
            this.mGroupItemStatus.add(false);
        }
    }

    private com.qcwireless.qcwatch.ui.home.sport.bean.ItemStatus getItemStatusByPosition(int position) {
        com.qcwireless.qcwatch.ui.home.sport.bean.ItemStatus itemStatus = new com.qcwireless.qcwatch.ui.home.sport.bean.ItemStatus();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.mGroupItemStatus.size()) {
                break;
            }
            if (i2 == position) {
                itemStatus.setViewType(0);
                itemStatus.setGroupItemIndex(i);
                break;
            }
            if (i2 > position) {
                itemStatus.setViewType(1);
                int i3 = i - 1;
                itemStatus.setGroupItemIndex(i3);
                itemStatus.setSubItemIndex(position - (i2 - this.mDataListTrees.get(i3).getSubItem().size()));
                break;
            }
            i2++;
            if (this.mGroupItemStatus.get(i).booleanValue()) {
                i2 += this.mDataListTrees.get(i).getSubItem().size();
            }
            i++;
        }
        if (i >= this.mGroupItemStatus.size()) {
            itemStatus.setViewType(1);
            int i4 = i - 1;
            itemStatus.setGroupItemIndex(i4);
            itemStatus.setSubItemIndex(position - (i2 - this.mDataListTrees.get(i4).getSubItem().size()));
        }
        return itemStatus;
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
        if (viewType == 0) {
            return new com.qcwireless.qcwatch.ui.mine.question.adapter.QuestionExpandableRecyclerViewAdapter.GroupItemViewHolder(android.view.LayoutInflater.from(this.mContext).inflate(com.qcwireless.qcwatch.R.layout.recycleview_exp_list_group, parent, false));
        }
        if (viewType == 1) {
            return new com.qcwireless.qcwatch.ui.mine.question.adapter.QuestionExpandableRecyclerViewAdapter.SubItemViewHolder(android.view.LayoutInflater.from(this.mContext).inflate(com.qcwireless.qcwatch.R.layout.recycleview_item_sport_detail, parent, false));
        }
        return null;
    }

    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
        com.qcwireless.qcwatch.ui.home.sport.bean.ItemStatus itemStatusByPosition = getItemStatusByPosition(position);
        final com.qcwireless.qcwatch.ui.home.sport.bean.DataListTree<java.lang.String, com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail> dataListTree = this.mDataListTrees.get(itemStatusByPosition.getGroupItemIndex());
        if (itemStatusByPosition.getViewType() == 0) {
            final com.qcwireless.qcwatch.ui.mine.question.adapter.QuestionExpandableRecyclerViewAdapter.GroupItemViewHolder groupItemViewHolder = (com.qcwireless.qcwatch.ui.mine.question.adapter.QuestionExpandableRecyclerViewAdapter.GroupItemViewHolder) holder;
            groupItemViewHolder.mGroupItemTitle.setText(dataListTree.getGroupItem());
            final int groupItemIndex = itemStatusByPosition.getGroupItemIndex();
            groupItemViewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.question.adapter.QuestionExpandableRecyclerViewAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.qcwireless.qcwatch.ui.mine.question.adapter.QuestionExpandableRecyclerViewAdapter.this.m1312x9c683780(groupItemIndex, groupItemViewHolder, dataListTree, view);
                }
            });
            return;
        }
        if (itemStatusByPosition.getViewType() == 1) {
            final com.qcwireless.qcwatch.ui.mine.question.adapter.QuestionExpandableRecyclerViewAdapter.SubItemViewHolder subItemViewHolder = (com.qcwireless.qcwatch.ui.mine.question.adapter.QuestionExpandableRecyclerViewAdapter.SubItemViewHolder) holder;
            com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail sportDetail = dataListTree.getSubItem().get(itemStatusByPosition.getSubItemIndex());
            try {
                subItemViewHolder.sportType.setItemTitle(this.mContext.getString(this.map.get(java.lang.Integer.valueOf(sportDetail.getSportType()))[0]));
                subItemViewHolder.sportIcon.setImageResource(this.map.get(java.lang.Integer.valueOf(sportDetail.getSportType()))[1]);
                subItemViewHolder.sportType.setItemUnit(new com.qcwireless.qc_utils.date.DateUtil(sportDetail.getStartTime(), true).getY_M_D_H_M_S());
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            if (sportDetail.getDuration() >= 3600) {
                subItemViewHolder.duration.setItemTitle("0" + (sportDetail.getDuration() / 3600) + ":" + com.qcwireless.qc_utils.date.DateUtil.dayMinToStr(sportDetail.getDuration()));
            } else {
                subItemViewHolder.duration.setItemTitle(com.qcwireless.qc_utils.date.DateUtil.dayMinToStrSymbol(sportDetail.getDuration()));
            }
            subItemViewHolder.calorie.setItemTitle(this.df.format((sportDetail.getCalorie() * 1.0f) / 1000.0f));
            subItemViewHolder.image.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.qcwireless.qcwatch.ui.mine.question.adapter.QuestionExpandableRecyclerViewAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View v) {
                    if (subItemViewHolder.group.getVisibility() == 0) {
                        subItemViewHolder.group.setVisibility(8);
                        subItemViewHolder.image.setImageResource(com.qcwireless.qcwatch.R.mipmap.icon_next);
                    } else {
                        subItemViewHolder.group.setVisibility(0);
                        subItemViewHolder.image.setImageResource(com.qcwireless.qcwatch.R.mipmap.icon_down);
                    }
                }
            });
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.qcwireless.qcwatch.ui.home.sport.bean.HeartDetail heartDetail : sportDetail.getHeartData()) {
                if (heartDetail.getHeartValue() != 0) {
                    arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QHeartSportDetailLineChartView.HeartDataBean((int) heartDetail.getTime(), heartDetail.getHeartValue(), false));
                }
            }
            if (arrayList.size() > 0) {
                subItemViewHolder.heartView.setData(sportDetail.getStartTime(), sportDetail.getStartTime() + sportDetail.getDuration(), arrayList);
            }
        }
    }

    /* renamed from: lambda$onBindViewHolder$0$com-qcwireless-qcwatch-ui-mine-question-adapter-QuestionExpandableRecyclerViewAdapter, reason: not valid java name */
    public /* synthetic */ void m1312x9c683780(int i, com.qcwireless.qcwatch.ui.mine.question.adapter.QuestionExpandableRecyclerViewAdapter.GroupItemViewHolder groupItemViewHolder, com.qcwireless.qcwatch.ui.home.sport.bean.DataListTree dataListTree, android.view.View view) {
        if (this.mGroupItemStatus.get(i).booleanValue()) {
            this.mGroupItemStatus.set(i, false);
            groupItemViewHolder.imageRightClick.setImageResource(com.qcwireless.qcwatch.R.mipmap.icon_next);
            notifyItemRangeRemoved(groupItemViewHolder.getAdapterPosition() + 1, dataListTree.getSubItem().size());
        } else {
            this.mGroupItemStatus.set(i, true);
            groupItemViewHolder.imageRightClick.setImageResource(com.qcwireless.qcwatch.R.mipmap.icon_down);
            notifyDataSetChanged();
        }
    }

    public int getItemCount() {
        if (this.mGroupItemStatus.size() == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.mDataListTrees.size(); i2++) {
            i++;
            if (this.mGroupItemStatus.get(i2).booleanValue()) {
                i += this.mDataListTrees.get(i2).getSubItem().size();
            }
        }
        return i;
    }

    public int getItemViewType(int position) {
        return getItemStatusByPosition(position).getViewType();
    }

    static class GroupItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        android.widget.ImageView imageRightClick;
        android.widget.TextView mGroupItemTitle;

        GroupItemViewHolder(android.view.View itemView) {
            super(itemView);
            this.mGroupItemTitle = (android.widget.TextView) itemView.findViewById(com.qcwireless.qcwatch.R.id.tv_item_group_title);
            this.imageRightClick = (android.widget.ImageView) itemView.findViewById(com.qcwireless.qcwatch.R.id.image_click);
        }
    }

    static class SubItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        com.qcwireless.qcwatch.ui.base.view.QSportItemView calorie;
        com.qcwireless.qcwatch.ui.base.view.QSportItemView duration;
        androidx.constraintlayout.widget.Group group;
        com.qcwireless.qcwatch.ui.base.view.QHeartSportDetailLineChartView heartView;
        android.widget.ImageView image;
        androidx.constraintlayout.widget.ConstraintLayout itemLayout;
        android.widget.ImageView sportIcon;
        com.qcwireless.qcwatch.ui.base.view.QSportItemView sportType;

        SubItemViewHolder(android.view.View itemView) {
            super(itemView);
            this.sportType = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) itemView.findViewById(com.qcwireless.qcwatch.R.id.total_days);
            this.duration = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) itemView.findViewById(com.qcwireless.qcwatch.R.id.detail_1);
            this.calorie = (com.qcwireless.qcwatch.ui.base.view.QSportItemView) itemView.findViewById(com.qcwireless.qcwatch.R.id.detail_2);
            this.group = itemView.findViewById(com.qcwireless.qcwatch.R.id.group_sport_detail);
            this.sportIcon = (android.widget.ImageView) itemView.findViewById(com.qcwireless.qcwatch.R.id.sport_type_image);
            this.image = (android.widget.ImageView) itemView.findViewById(com.qcwireless.qcwatch.R.id.image_click);
            this.itemLayout = itemView.findViewById(com.qcwireless.qcwatch.R.id.item_layout);
            this.heartView = (com.qcwireless.qcwatch.ui.base.view.QHeartSportDetailLineChartView) itemView.findViewById(com.qcwireless.qcwatch.R.id.sport_detail_heart_line);
        }
    }
}
