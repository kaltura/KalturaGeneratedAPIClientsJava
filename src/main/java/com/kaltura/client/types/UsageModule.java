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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Pricing usage module  */
@SuppressWarnings("serial")
public class UsageModule extends ObjectBase {

	/**  Usage module identifier  */
    private Long id;
	/**  Usage module name  */
    private String name;
	/**  The maximum number of times an item in this usage module can be viewed  */
    private Integer maxViewsNumber;
	/**  The amount time an item is available for viewing since a user started watching
	  the item  */
    private Integer viewLifeCycle;
	/**  The amount time an item is available for viewing  */
    private Integer fullLifeCycle;
	/**  Identifies a specific coupon linked to this object  */
    private Integer couponId;
	/**  Time period during which the end user can waive his rights to cancel a purchase.
	  When the time period is passed, the purchase can no longer be cancelled  */
    private Integer waiverPeriod;
	/**  Indicates whether or not the end user has the right to waive his rights to
	  cancel a purchase  */
    private Boolean isWaiverEnabled;
	/**  Indicates that usage is targeted for offline playback  */
    private Boolean isOfflinePlayback;

    // id:
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // maxViewsNumber:
    public Integer getMaxViewsNumber(){
        return this.maxViewsNumber;
    }
    public void setMaxViewsNumber(Integer maxViewsNumber){
        this.maxViewsNumber = maxViewsNumber;
    }

    // viewLifeCycle:
    public Integer getViewLifeCycle(){
        return this.viewLifeCycle;
    }
    public void setViewLifeCycle(Integer viewLifeCycle){
        this.viewLifeCycle = viewLifeCycle;
    }

    // fullLifeCycle:
    public Integer getFullLifeCycle(){
        return this.fullLifeCycle;
    }
    public void setFullLifeCycle(Integer fullLifeCycle){
        this.fullLifeCycle = fullLifeCycle;
    }

    // couponId:
    public Integer getCouponId(){
        return this.couponId;
    }
    public void setCouponId(Integer couponId){
        this.couponId = couponId;
    }

    // waiverPeriod:
    public Integer getWaiverPeriod(){
        return this.waiverPeriod;
    }
    public void setWaiverPeriod(Integer waiverPeriod){
        this.waiverPeriod = waiverPeriod;
    }

    // isWaiverEnabled:
    public Boolean getIsWaiverEnabled(){
        return this.isWaiverEnabled;
    }
    public void setIsWaiverEnabled(Boolean isWaiverEnabled){
        this.isWaiverEnabled = isWaiverEnabled;
    }

    // isOfflinePlayback:
    public Boolean getIsOfflinePlayback(){
        return this.isOfflinePlayback;
    }
    public void setIsOfflinePlayback(Boolean isOfflinePlayback){
        this.isOfflinePlayback = isOfflinePlayback;
    }


    public UsageModule() {
       super();
    }

    public UsageModule(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseLong(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        maxViewsNumber = GsonParser.parseInt(jsonObject.get("maxViewsNumber"));
        viewLifeCycle = GsonParser.parseInt(jsonObject.get("viewLifeCycle"));
        fullLifeCycle = GsonParser.parseInt(jsonObject.get("fullLifeCycle"));
        couponId = GsonParser.parseInt(jsonObject.get("couponId"));
        waiverPeriod = GsonParser.parseInt(jsonObject.get("waiverPeriod"));
        isWaiverEnabled = GsonParser.parseBoolean(jsonObject.get("isWaiverEnabled"));
        isOfflinePlayback = GsonParser.parseBoolean(jsonObject.get("isOfflinePlayback"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaUsageModule");
        kparams.add("name", this.name);
        kparams.add("maxViewsNumber", this.maxViewsNumber);
        kparams.add("viewLifeCycle", this.viewLifeCycle);
        kparams.add("fullLifeCycle", this.fullLifeCycle);
        kparams.add("couponId", this.couponId);
        kparams.add("waiverPeriod", this.waiverPeriod);
        kparams.add("isWaiverEnabled", this.isWaiverEnabled);
        kparams.add("isOfflinePlayback", this.isOfflinePlayback);
        return kparams;
    }

}

