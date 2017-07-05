// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2017  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.types.ObjectBase;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Coupons group details  */
@SuppressWarnings("serial")
public class CouponsGroup extends ObjectBase {

	/**  Coupon group identifier  */
    private String id;
	/**  Coupon group name  */
    private String name;
	/**  A list of the descriptions of the coupon group on different languages (language
	  code and translation)  */
    private List<TranslationToken> descriptions;
	/**  The first date the coupons in this coupons group are valid  */
    private Long startDate;
	/**  The last date the coupons in this coupons group are valid  */
    private Long endDate;
	/**  Maximum number of uses for each coupon in the group  */
    private Integer maxUsesNumber;
	/**  Maximum number of uses for each coupon in the group on a renewable subscription  */
    private Integer maxUsesNumberOnRenewableSub;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // descriptions:
    public List<TranslationToken> getDescriptions(){
        return this.descriptions;
    }
    public void setDescriptions(List<TranslationToken> descriptions){
        this.descriptions = descriptions;
    }

    // startDate:
    public Long getStartDate(){
        return this.startDate;
    }
    public void setStartDate(Long startDate){
        this.startDate = startDate;
    }

    // endDate:
    public Long getEndDate(){
        return this.endDate;
    }
    public void setEndDate(Long endDate){
        this.endDate = endDate;
    }

    // maxUsesNumber:
    public Integer getMaxUsesNumber(){
        return this.maxUsesNumber;
    }
    public void setMaxUsesNumber(Integer maxUsesNumber){
        this.maxUsesNumber = maxUsesNumber;
    }

    // maxUsesNumberOnRenewableSub:
    public Integer getMaxUsesNumberOnRenewableSub(){
        return this.maxUsesNumberOnRenewableSub;
    }
    public void setMaxUsesNumberOnRenewableSub(Integer maxUsesNumberOnRenewableSub){
        this.maxUsesNumberOnRenewableSub = maxUsesNumberOnRenewableSub;
    }


    public CouponsGroup() {
       super();
    }

    public CouponsGroup(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        descriptions = GsonParser.parseArray(jsonObject.getAsJsonArray("descriptions"), TranslationToken.class);
        startDate = GsonParser.parseLong(jsonObject.get("startDate"));
        endDate = GsonParser.parseLong(jsonObject.get("endDate"));
        maxUsesNumber = GsonParser.parseInt(jsonObject.get("maxUsesNumber"));
        maxUsesNumberOnRenewableSub = GsonParser.parseInt(jsonObject.get("maxUsesNumberOnRenewableSub"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCouponsGroup");
        kparams.add("name", this.name);
        kparams.add("descriptions", this.descriptions);
        kparams.add("startDate", this.startDate);
        kparams.add("endDate", this.endDate);
        kparams.add("maxUsesNumber", this.maxUsesNumber);
        kparams.add("maxUsesNumberOnRenewableSub", this.maxUsesNumberOnRenewableSub);
        return kparams;
    }

}

