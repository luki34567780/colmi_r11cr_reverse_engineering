package com.amap.api.col.p0003sl;

/* compiled from: AutoTSearchResultParser.java */
/* loaded from: classes.dex */
public final class fc {
    public static com.amap.api.services.auto.AutoTChargeStationResult a(org.json.JSONObject jSONObject) {
        com.amap.api.services.auto.AutoTChargeStationResult autoTChargeStationResult = new com.amap.api.services.auto.AutoTChargeStationResult();
        try {
            autoTChargeStationResult.code = jSONObject.optInt("code");
            autoTChargeStationResult.message = jSONObject.optString("message");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.autonavi.base.amap.mapcore.AeUtil.ROOT_DATA_PATH_OLD_NAME);
            if (optJSONObject != null) {
                autoTChargeStationResult.classify = b(optJSONObject.optJSONObject("classify"));
                autoTChargeStationResult.listData = h(optJSONObject.optJSONObject("list_data"));
                autoTChargeStationResult.lqii = l(optJSONObject.optJSONObject("lqii"));
                autoTChargeStationResult.meta = m(optJSONObject.optJSONObject("meta"));
                autoTChargeStationResult.originJson = optJSONObject.toString();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return autoTChargeStationResult;
    }

    private static com.amap.api.services.auto.Classify b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.amap.api.services.auto.Classify classify = new com.amap.api.services.auto.Classify();
        classify.itermData = c(jSONObject.optJSONObject("item_data"));
        classify.retainState = g(jSONObject.optJSONObject("retain_state"));
        return classify;
    }

    private static com.amap.api.services.auto.Classify.ItermData c(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.amap.api.services.auto.Classify.ItermData itermData = new com.amap.api.services.auto.Classify.ItermData();
        itermData.checkedNodes = a(jSONObject.optJSONArray("checked_nodes"));
        itermData.checkedValue = d(jSONObject.optJSONObject("checked_value"));
        itermData.datas = b(jSONObject.optJSONArray(com.autonavi.base.amap.mapcore.AeUtil.ROOT_DATA_PATH_OLD_NAME));
        itermData.defaultPositionDatas = b(jSONObject.optJSONArray("default_position_data"));
        itermData.level2Datas = b(jSONObject.optJSONArray("level2_data"));
        return itermData;
    }

    private static java.util.List<com.amap.api.services.auto.Classify.CheckedNode> a(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(0);
            if (optJSONObject != null) {
                com.amap.api.services.auto.Classify.CheckedNode checkedNode = new com.amap.api.services.auto.Classify.CheckedNode();
                checkedNode.id = optJSONObject.optString(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID);
                checkedNode.value = optJSONObject.optString("value");
                checkedNode.name = optJSONObject.optString("name");
                arrayList.add(checkedNode);
            }
        }
        return arrayList;
    }

    private static com.amap.api.services.auto.Classify.CheckedValue d(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.amap.api.services.auto.Classify.CheckedValue checkedValue = new com.amap.api.services.auto.Classify.CheckedValue();
        checkedValue.classifyV2Data = jSONObject.optString("classify_v2_data");
        checkedValue.classifyV2Level2Data = jSONObject.optString("classify_v2_level2_data");
        checkedValue.classifyV2Level3Data = jSONObject.optString("classify_v2_level3_data");
        return checkedValue;
    }

    private static java.util.List<com.amap.api.services.auto.Classify.Data> b(org.json.JSONArray jSONArray) {
        com.amap.api.services.auto.Classify.DataCategory e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                com.amap.api.services.auto.Classify.Data data = new com.amap.api.services.auto.Classify.Data();
                org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("category");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                        if (optJSONObject2 != null && (e = e(optJSONObject2)) != null) {
                            arrayList2.add(e);
                        }
                    }
                }
                data.categories = arrayList2;
                data.checked = optJSONObject.optInt("checked");
                data.classifyItemType = optJSONObject.optString("classify_item_type");
                data.isCancelDefaultSelect = optJSONObject.optInt("is_cancel_default_select");
                data.isNoBtn = optJSONObject.optInt("is_no_btn");
                data.name = optJSONObject.optString("name");
                data.params = optJSONObject.optString("params");
                data.separator = optJSONObject.optString("separator");
                data.type = optJSONObject.optString("type");
                data.useCommonlyUsedConfig = optJSONObject.optInt("use_commonly_used_config");
                data.useLocalConfig = optJSONObject.optInt("use_local_config");
                data.useRemoteConfig = optJSONObject.optInt("use_remote_config");
                data.multiSelect = optJSONObject.optInt("multi_select");
                arrayList.add(data);
            }
        }
        return arrayList;
    }

    private static com.amap.api.services.auto.Classify.DataCategory e(org.json.JSONObject jSONObject) {
        com.amap.api.services.auto.Classify.Category f;
        if (jSONObject == null) {
            return null;
        }
        com.amap.api.services.auto.Classify.DataCategory dataCategory = new com.amap.api.services.auto.Classify.DataCategory();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("category");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (f = f(optJSONObject)) != null) {
                    arrayList.add(f);
                }
            }
        }
        dataCategory.categories = arrayList;
        dataCategory.checked = jSONObject.optInt("checked");
        dataCategory.defaultValue = jSONObject.optInt("default");
        dataCategory.componentType = jSONObject.optString("component_type");
        dataCategory.name = jSONObject.optString("name");
        dataCategory.params = jSONObject.optString("params");
        dataCategory.areaSubwayMark = jSONObject.optInt("area_subway_mark");
        dataCategory.hideTitle = jSONObject.optInt("hide_title");
        dataCategory.maxShowNum = jSONObject.optInt("max_show_num");
        dataCategory.maxShowNumRow = jSONObject.optInt("max_show_num_row");
        dataCategory.multiSelect = jSONObject.optInt("multi_select");
        dataCategory.img = jSONObject.optString("img");
        dataCategory.showType = jSONObject.optString("show_type");
        dataCategory.value = jSONObject.optString("value");
        dataCategory.classifyItemType = jSONObject.optString("classify_item_type");
        return dataCategory;
    }

    private static com.amap.api.services.auto.Classify.Category f(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.amap.api.services.auto.Classify.Category category = new com.amap.api.services.auto.Classify.Category();
        category.checked = jSONObject.optInt("checked");
        category.componentType = jSONObject.optString("component_type");
        category.defaultValue = jSONObject.optInt("default");
        category.name = jSONObject.optString("name");
        category.value = jSONObject.optString("value");
        category.classifyItemType = jSONObject.optString("classify_item_type");
        category.img = jSONObject.optString("img");
        category.showType = jSONObject.optString("show_type");
        category.params = jSONObject.optString("params");
        return category;
    }

    private static com.amap.api.services.auto.Classify.RetainState g(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.amap.api.services.auto.Classify.RetainState retainState = new com.amap.api.services.auto.Classify.RetainState();
        retainState.classifyBusinessType = jSONObject.optString("classify_business_type");
        retainState.classifyConf = jSONObject.optString("classify_conf");
        retainState.classifyRetainLevel2 = jSONObject.optString("classify_retain_level2");
        retainState.level2All = jSONObject.optString("level2_all");
        retainState.newClassifyCityadcode = jSONObject.optString("new_classify_cityadcode");
        retainState.newClassifyFlag = jSONObject.optString("new_classify_flag");
        return retainState;
    }

    private static com.amap.api.services.auto.ListData h(org.json.JSONObject jSONObject) {
        com.amap.api.services.auto.ListData.Content i;
        if (jSONObject == null) {
            return null;
        }
        com.amap.api.services.auto.ListData listData = new com.amap.api.services.auto.ListData();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("content");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null && (i = i(optJSONObject)) != null) {
                arrayList.add(i);
            }
        }
        listData.content = arrayList;
        return listData;
    }

    private static com.amap.api.services.auto.ListData.Content i(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.amap.api.services.auto.ListData.Content content = new com.amap.api.services.auto.ListData.Content();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.autonavi.base.amap.mapcore.AeUtil.ROOT_DATA_PATH_OLD_NAME);
        if (optJSONObject != null) {
            com.amap.api.services.auto.ListData.Data data = new com.amap.api.services.auto.ListData.Data();
            data.basicInfo = j(optJSONObject.optJSONObject("basic_info"));
            data.chargingInfo = k(optJSONObject.optJSONObject("charging_info"));
            content.data = data;
        }
        content.itemType = jSONObject.optString("item_type");
        return content;
    }

    private static com.amap.api.services.auto.ListData.BasicInfo j(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.amap.api.services.auto.ListData.BasicInfo basicInfo = new com.amap.api.services.auto.ListData.BasicInfo();
        basicInfo.adcode = jSONObject.optString("adcode");
        basicInfo.address = jSONObject.optString("address");
        basicInfo.averagecost = jSONObject.optString("averagecost");
        basicInfo.buildingStatus = jSONObject.optString("building_status");
        basicInfo.businessArea = jSONObject.optString("business_area");
        basicInfo.childShortname = jSONObject.optString("child_shortname");
        basicInfo.childShortnameEn = jSONObject.optString("child_shortname_en");
        basicInfo.childtype = jSONObject.optString("childtype");
        basicInfo.citycode = jSONObject.optString("citycode");
        basicInfo.cname = jSONObject.optString("cname");
        basicInfo.dispName = jSONObject.optString("disp_name");
        basicInfo.distance = jSONObject.optString("distance");
        basicInfo.dname = jSONObject.optString("dname");
        basicInfo.eaddress = jSONObject.optString("eaddress");
        basicInfo.endPoiExtension = jSONObject.optString("end_poi_extension");
        basicInfo.fNona = jSONObject.optString("f_nona");
        basicInfo.hisMark = jSONObject.optString("his_mark");
        basicInfo.hotText = jSONObject.optString("hot_text");
        basicInfo.id = jSONObject.optString(com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey.ID);
        basicInfo.industry = jSONObject.optString("industry");
        basicInfo.latitude = jSONObject.optString("latitude");
        basicInfo.longitude = jSONObject.optString("longitude");
        basicInfo.name = jSONObject.optString("name");
        basicInfo.category = jSONObject.optString("category");
        com.amap.api.services.auto.ListData.NaviVisited naviVisited = new com.amap.api.services.auto.ListData.NaviVisited();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("navi_visited");
        if (optJSONObject != null) {
            naviVisited.randUnionMonthUv = optJSONObject.optString("rand_union_month_uv");
        }
        basicInfo.naviVisited = naviVisited;
        basicInfo.numSpaceW = jSONObject.optString("num_space_w");
        basicInfo.numSpaceWF = jSONObject.optString("num_space_w_f");
        basicInfo.opentime2 = jSONObject.optString("opentime2");
        basicInfo.opentimeText = jSONObject.optString("opentime_text");
        basicInfo.parent = jSONObject.optString("parent");
        basicInfo.parentName = jSONObject.optString("parent_name");
        basicInfo.picInfo = jSONObject.optString("pic_info");
        basicInfo.rating = jSONObject.optString("rating");
        basicInfo.recommendFlag = jSONObject.optString("recommend_flag");
        basicInfo.reviewTotal = jSONObject.optString("review_total");
        basicInfo.sell = jSONObject.optString("sell");
        com.amap.api.services.auto.ListData.ShortReview shortReview = new com.amap.api.services.auto.ListData.ShortReview();
        if (jSONObject.optJSONObject("short_review") != null) {
            basicInfo.shortReview = shortReview;
        }
        basicInfo.tel = jSONObject.optString("tel");
        basicInfo.towardsAngle = jSONObject.optString("towards_angle");
        basicInfo.typeCode = jSONObject.optString("typecode");
        basicInfo.updateFlag = jSONObject.optString("update_flag");
        basicInfo.xEntr = jSONObject.optString("x_entr");
        basicInfo.yEntr = jSONObject.optString("y_entr");
        return basicInfo;
    }

    private static com.amap.api.services.auto.ListData.ChargingInfo k(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.amap.api.services.auto.ListData.ChargingInfo chargingInfo = new com.amap.api.services.auto.ListData.ChargingInfo();
        chargingInfo.brandDesc = jSONObject.optString("brand_desc");
        chargingInfo.chargeInfo = c(jSONObject.optJSONArray("charge_info"));
        chargingInfo.chargingRatingFlagTerm = jSONObject.optString("charging_rating_flag_term");
        chargingInfo.creditZhima = jSONObject.optString("credit_zhima");
        chargingInfo.cscf = jSONObject.optString("cscf");
        chargingInfo.currentElePrice = jSONObject.optString("current_ele_price");
        chargingInfo.currentSerPrice = jSONObject.optString("current_ser_price");
        chargingInfo.deepRightsTag = jSONObject.optString("deep_rights_tag");
        chargingInfo.latestCharge = jSONObject.optString("latest_charge");
        chargingInfo.numFast = jSONObject.optString("num_fast");
        chargingInfo.numSlow = jSONObject.optString("num_slow");
        chargingInfo.parkCategory = jSONObject.optString("park_category");
        chargingInfo.priceChargingPark = d(jSONObject.optJSONArray("price_charging_pack"));
        chargingInfo.priceParkingStd = jSONObject.optString("price_parking_std");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("iddictionary");
        if (optJSONObject != null) {
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
            java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next));
            }
            chargingInfo.idDictionary = hashMap;
        }
        return chargingInfo;
    }

    private static java.util.List<com.amap.api.services.auto.ListData.ChargeInfo> c(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                com.amap.api.services.auto.ListData.ChargeInfo chargeInfo = new com.amap.api.services.auto.ListData.ChargeInfo();
                org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("plugs_info");
                if (optJSONArray != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                        if (optJSONObject2 != null) {
                            com.amap.api.services.auto.ListData.PlugsInfo plugsInfo = new com.amap.api.services.auto.ListData.PlugsInfo();
                            plugsInfo.brandDesc = optJSONObject2.optString("brand_desc");
                            plugsInfo.fastcur = optJSONObject2.optString("fastcur");
                            plugsInfo.fastpower = optJSONObject2.optString("fastpower");
                            plugsInfo.fastvol = optJSONObject2.optString("fastvol");
                            arrayList2.add(plugsInfo);
                        }
                    }
                    chargeInfo.plugsInfos = arrayList2;
                    chargeInfo.plugsType = optJSONObject.optString("plugstype");
                    arrayList.add(chargeInfo);
                }
            }
        }
        return arrayList;
    }

    private static com.amap.api.services.auto.ListData.PriceChargingPark d(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        com.amap.api.services.auto.ListData.PriceChargingPark priceChargingPark = new com.amap.api.services.auto.ListData.PriceChargingPark();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                com.amap.api.services.auto.ListData.Park park = new com.amap.api.services.auto.ListData.Park();
                park.srcType = optJSONObject.optString("src_type");
                org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("price_charging");
                if (optJSONArray != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                        if (optJSONObject2 != null) {
                            com.amap.api.services.auto.ListData.PriceCharging priceCharging = new com.amap.api.services.auto.ListData.PriceCharging();
                            priceCharging.elePrice = optJSONObject2.optString("ele_price");
                            priceCharging.serPrice = optJSONObject2.optString("ser_price");
                            priceCharging.time = optJSONObject2.optString("time");
                            priceCharging.updatetime = optJSONObject2.optInt("updatetime");
                            arrayList2.add(priceCharging);
                        }
                    }
                    park.priceChargings = arrayList2;
                }
                arrayList.add(park);
            }
        }
        priceChargingPark.parks = arrayList;
        return priceChargingPark;
    }

    private static com.amap.api.services.auto.Lqii l(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.amap.api.services.auto.Lqii lqii = new com.amap.api.services.auto.Lqii();
        lqii.categoryBrandRecognitionResult = jSONObject.optString("category_brand_recognition_result");
        lqii.changeQueryTip = jSONObject.optString("change_query_tip");
        lqii.expandRangeTip = jSONObject.optString("change_query_tip");
        lqii.isCurrentCity = jSONObject.optString("is_current_city");
        lqii.isUserCity = jSONObject.optString("is_user_city");
        lqii.queryCateResult = jSONObject.optString("query_cate_result");
        lqii.suggestContent = jSONObject.optString("suggestcontent");
        lqii.targetViewCity = jSONObject.optString("target_view_city");
        lqii.totalhits = jSONObject.optString("totalhits");
        lqii.viewRegion = jSONObject.optString("view_region");
        return lqii;
    }

    private static com.amap.api.services.auto.Meta m(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.amap.api.services.auto.Meta meta = new com.amap.api.services.auto.Meta();
        meta.listBizType = jSONObject.optString("list_biz_type");
        return meta;
    }
}
