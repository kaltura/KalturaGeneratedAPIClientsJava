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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ProductPriceFilter extends Filter {

	/**  Comma separated subscriptions identifiers  */
    private String subscriptionIdIn;
	/**  Comma separated media files identifiers  */
    private String fileIdIn;
	/**  A flag that indicates if only the lowest price of an item should return  */
    private Boolean isLowest;
	/**  Discount coupon code  */
    private String couponCodeEqual;

    // subscriptionIdIn:
    public String getSubscriptionIdIn(){
        return this.subscriptionIdIn;
    }
    public void setSubscriptionIdIn(String subscriptionIdIn){
        this.subscriptionIdIn = subscriptionIdIn;
    }

    // fileIdIn:
    public String getFileIdIn(){
        return this.fileIdIn;
    }
    public void setFileIdIn(String fileIdIn){
        this.fileIdIn = fileIdIn;
    }

    // isLowest:
    public Boolean getIsLowest(){
        return this.isLowest;
    }
    public void setIsLowest(Boolean isLowest){
        this.isLowest = isLowest;
    }

    // couponCodeEqual:
    public String getCouponCodeEqual(){
        return this.couponCodeEqual;
    }
    public void setCouponCodeEqual(String couponCodeEqual){
        this.couponCodeEqual = couponCodeEqual;
    }


    public ProductPriceFilter() {
       super();
    }

    public ProductPriceFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        subscriptionIdIn = GsonParser.parseString(jsonObject.get("subscriptionIdIn"));
        fileIdIn = GsonParser.parseString(jsonObject.get("fileIdIn"));
        isLowest = GsonParser.parseBoolean(jsonObject.get("isLowest"));
        couponCodeEqual = GsonParser.parseString(jsonObject.get("couponCodeEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaProductPriceFilter");
        kparams.add("subscriptionIdIn", this.subscriptionIdIn);
        kparams.add("fileIdIn", this.fileIdIn);
        kparams.add("isLowest", this.isLowest);
        kparams.add("couponCodeEqual", this.couponCodeEqual);
        return kparams;
    }

}

