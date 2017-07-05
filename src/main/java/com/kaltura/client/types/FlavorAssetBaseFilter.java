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
import com.kaltura.client.enums.FlavorAssetStatus;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class FlavorAssetBaseFilter extends AssetFilter {

    private Integer flavorParamsIdEqual;
    private String flavorParamsIdIn;
    private FlavorAssetStatus statusEqual;
    private String statusIn;
    private String statusNotIn;

    // flavorParamsIdEqual:
    public Integer getFlavorParamsIdEqual(){
        return this.flavorParamsIdEqual;
    }
    public void setFlavorParamsIdEqual(Integer flavorParamsIdEqual){
        this.flavorParamsIdEqual = flavorParamsIdEqual;
    }

    // flavorParamsIdIn:
    public String getFlavorParamsIdIn(){
        return this.flavorParamsIdIn;
    }
    public void setFlavorParamsIdIn(String flavorParamsIdIn){
        this.flavorParamsIdIn = flavorParamsIdIn;
    }

    // statusEqual:
    public FlavorAssetStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(FlavorAssetStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // statusNotIn:
    public String getStatusNotIn(){
        return this.statusNotIn;
    }
    public void setStatusNotIn(String statusNotIn){
        this.statusNotIn = statusNotIn;
    }


    public FlavorAssetBaseFilter() {
       super();
    }

    public FlavorAssetBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        flavorParamsIdEqual = GsonParser.parseInt(jsonObject.get("flavorParamsIdEqual"));
        flavorParamsIdIn = GsonParser.parseString(jsonObject.get("flavorParamsIdIn"));
        statusEqual = FlavorAssetStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        statusNotIn = GsonParser.parseString(jsonObject.get("statusNotIn"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaFlavorAssetBaseFilter");
        kparams.add("flavorParamsIdEqual", this.flavorParamsIdEqual);
        kparams.add("flavorParamsIdIn", this.flavorParamsIdIn);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("statusNotIn", this.statusNotIn);
        return kparams;
    }

}

