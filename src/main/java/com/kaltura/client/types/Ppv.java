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
import com.kaltura.client.types.PriceDetails;
import com.kaltura.client.types.DiscountModule;
import com.kaltura.client.types.CouponsGroup;
import com.kaltura.client.types.UsageModule;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  PPV details  */
@SuppressWarnings("serial")
public class Ppv extends ObjectBase {

	/**  PPV identifier  */
    private String id;
	/**  the name for the ppv  */
    private String name;
	/**  The price of the ppv  */
    private PriceDetails price;
	/**  A list of file types identifiers that are supported in this ppv  */
    private List<IntegerValue> fileTypes;
	/**  The internal discount module for the ppv  */
    private DiscountModule discountModules;
	/**  Coupons group for the ppv  */
    private CouponsGroup couponsGroup;
	/**  A list of the descriptions of the ppv on different languages (language code and
	  translation)  */
    private List<TranslationToken> descriptions;
	/**  Product code for the ppv  */
    private String productCode;
	/**  Indicates whether or not this ppv can be purchased standalone or only as part of
	  a subscription  */
    private Boolean isSubscriptionOnly;
	/**  Indicates whether or not this ppv can be consumed only on the first device  */
    private Boolean firstDeviceLimitation;
	/**  PPV usage module  */
    private UsageModule usageModule;

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

    // price:
    public PriceDetails getPrice(){
        return this.price;
    }
    public void setPrice(PriceDetails price){
        this.price = price;
    }

    // fileTypes:
    public List<IntegerValue> getFileTypes(){
        return this.fileTypes;
    }
    public void setFileTypes(List<IntegerValue> fileTypes){
        this.fileTypes = fileTypes;
    }

    // discountModules:
    public DiscountModule getDiscountModules(){
        return this.discountModules;
    }
    public void setDiscountModules(DiscountModule discountModules){
        this.discountModules = discountModules;
    }

    // couponsGroup:
    public CouponsGroup getCouponsGroup(){
        return this.couponsGroup;
    }
    public void setCouponsGroup(CouponsGroup couponsGroup){
        this.couponsGroup = couponsGroup;
    }

    // descriptions:
    public List<TranslationToken> getDescriptions(){
        return this.descriptions;
    }
    public void setDescriptions(List<TranslationToken> descriptions){
        this.descriptions = descriptions;
    }

    // productCode:
    public String getProductCode(){
        return this.productCode;
    }
    public void setProductCode(String productCode){
        this.productCode = productCode;
    }

    // isSubscriptionOnly:
    public Boolean getIsSubscriptionOnly(){
        return this.isSubscriptionOnly;
    }
    public void setIsSubscriptionOnly(Boolean isSubscriptionOnly){
        this.isSubscriptionOnly = isSubscriptionOnly;
    }

    // firstDeviceLimitation:
    public Boolean getFirstDeviceLimitation(){
        return this.firstDeviceLimitation;
    }
    public void setFirstDeviceLimitation(Boolean firstDeviceLimitation){
        this.firstDeviceLimitation = firstDeviceLimitation;
    }

    // usageModule:
    public UsageModule getUsageModule(){
        return this.usageModule;
    }
    public void setUsageModule(UsageModule usageModule){
        this.usageModule = usageModule;
    }


    public Ppv() {
       super();
    }

    public Ppv(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        price = GsonParser.parseObject(jsonObject.getAsJsonObject("price"), PriceDetails.class);
        fileTypes = GsonParser.parseArray(jsonObject.getAsJsonArray("fileTypes"), IntegerValue.class);
        discountModules = GsonParser.parseObject(jsonObject.getAsJsonObject("discountModules"), DiscountModule.class);
        couponsGroup = GsonParser.parseObject(jsonObject.getAsJsonObject("couponsGroup"), CouponsGroup.class);
        descriptions = GsonParser.parseArray(jsonObject.getAsJsonArray("descriptions"), TranslationToken.class);
        productCode = GsonParser.parseString(jsonObject.get("productCode"));
        isSubscriptionOnly = GsonParser.parseBoolean(jsonObject.get("isSubscriptionOnly"));
        firstDeviceLimitation = GsonParser.parseBoolean(jsonObject.get("firstDeviceLimitation"));
        usageModule = GsonParser.parseObject(jsonObject.getAsJsonObject("usageModule"), UsageModule.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaPpv");
        kparams.add("id", this.id);
        kparams.add("name", this.name);
        kparams.add("price", this.price);
        kparams.add("fileTypes", this.fileTypes);
        kparams.add("discountModules", this.discountModules);
        kparams.add("couponsGroup", this.couponsGroup);
        kparams.add("descriptions", this.descriptions);
        kparams.add("productCode", this.productCode);
        kparams.add("isSubscriptionOnly", this.isSubscriptionOnly);
        kparams.add("firstDeviceLimitation", this.firstDeviceLimitation);
        kparams.add("usageModule", this.usageModule);
        return kparams;
    }

}

