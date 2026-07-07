package com.chad.library.adapter.base.entity;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class JSectionEntity implements com.chad.library.adapter.base.entity.SectionEntity {
    @Override // com.chad.library.adapter.base.entity.SectionEntity, com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        if (isHeader()) {
            com.chad.library.adapter.base.entity.SectionEntity.Companion companion = com.chad.library.adapter.base.entity.SectionEntity.INSTANCE;
            return -99;
        }
        com.chad.library.adapter.base.entity.SectionEntity.Companion companion2 = com.chad.library.adapter.base.entity.SectionEntity.INSTANCE;
        return -100;
    }
}
