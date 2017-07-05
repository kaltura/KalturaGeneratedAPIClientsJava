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

/**  Discount module  */
@SuppressWarnings("serial")
public class DiscountModule extends ObjectBase {

	/**  The discount percentage  */
    private Double percent;
	/**  The first date the discount is available  */
    private Long startDate;
	/**  The last date the discount is available  */
    private Long endDate;

    // percent:
    public Double getPercent(){
        return this.percent;
    }
    public void setPercent(Double percent){
        this.percent = percent;
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


    public DiscountModule() {
       super();
    }

    public DiscountModule(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        percent = GsonParser.parseDouble(jsonObject.get("percent"));
        startDate = GsonParser.parseLong(jsonObject.get("startDate"));
        endDate = GsonParser.parseLong(jsonObject.get("endDate"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaDiscountModule");
        kparams.add("percent", this.percent);
        kparams.add("startDate", this.startDate);
        kparams.add("endDate", this.endDate);
        return kparams;
    }

}

