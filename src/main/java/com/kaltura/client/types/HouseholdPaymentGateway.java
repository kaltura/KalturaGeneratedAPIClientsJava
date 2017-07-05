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
import com.kaltura.client.enums.HouseholdPaymentGatewaySelectedBy;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class HouseholdPaymentGateway extends ObjectBase {

	/**  payment gateway id  */
    private Integer id;
	/**  payment gateway name  */
    private String name;
	/**  Payment gateway default (true/false)  */
    private Boolean isDefault;
	/**  distinction payment gateway selected by account or household  */
    private HouseholdPaymentGatewaySelectedBy selectedBy;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // isDefault:
    public Boolean getIsDefault(){
        return this.isDefault;
    }
    public void setIsDefault(Boolean isDefault){
        this.isDefault = isDefault;
    }

    // selectedBy:
    public HouseholdPaymentGatewaySelectedBy getSelectedBy(){
        return this.selectedBy;
    }
    public void setSelectedBy(HouseholdPaymentGatewaySelectedBy selectedBy){
        this.selectedBy = selectedBy;
    }


    public HouseholdPaymentGateway() {
       super();
    }

    public HouseholdPaymentGateway(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));
        selectedBy = HouseholdPaymentGatewaySelectedBy.get(GsonParser.parseString(jsonObject.get("selectedBy")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaHouseholdPaymentGateway");
        kparams.add("name", this.name);
        kparams.add("isDefault", this.isDefault);
        kparams.add("selectedBy", this.selectedBy);
        return kparams;
    }

}

