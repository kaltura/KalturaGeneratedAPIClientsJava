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
import com.kaltura.client.enums.CountryRestrictionType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class CountryRestriction extends BaseRestriction {

	/**  Country restriction type (Allow or deny)  */
    private CountryRestrictionType countryRestrictionType;
	/**  Comma separated list of country codes to allow to deny  */
    private String countryList;

    // countryRestrictionType:
    public CountryRestrictionType getCountryRestrictionType(){
        return this.countryRestrictionType;
    }
    public void setCountryRestrictionType(CountryRestrictionType countryRestrictionType){
        this.countryRestrictionType = countryRestrictionType;
    }

    // countryList:
    public String getCountryList(){
        return this.countryList;
    }
    public void setCountryList(String countryList){
        this.countryList = countryList;
    }


    public CountryRestriction() {
       super();
    }

    public CountryRestriction(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        countryRestrictionType = CountryRestrictionType.get(GsonParser.parseInt(jsonObject.get("countryRestrictionType")));
        countryList = GsonParser.parseString(jsonObject.get("countryList"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCountryRestriction");
        kparams.add("countryRestrictionType", this.countryRestrictionType);
        kparams.add("countryList", this.countryList);
        return kparams;
    }

}

