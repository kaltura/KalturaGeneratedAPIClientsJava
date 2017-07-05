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
import com.kaltura.client.enums.BundleType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class BundleFilter extends AssetFilter {

	/**  Bundle Id.  */
    private Integer idEqual;
	/**  Comma separated list of asset types to search within.               Possible
	  values: 0 – EPG linear programs entries, any media type ID (according to media
	  type IDs defined dynamically in the system).              If omitted – all
	  types should be included.  */
    private String typeIn;
	/**  bundleType - possible values: Subscription or Collection  */
    private BundleType bundleTypeEqual;

    // idEqual:
    public Integer getIdEqual(){
        return this.idEqual;
    }
    public void setIdEqual(Integer idEqual){
        this.idEqual = idEqual;
    }

    // typeIn:
    public String getTypeIn(){
        return this.typeIn;
    }
    public void setTypeIn(String typeIn){
        this.typeIn = typeIn;
    }

    // bundleTypeEqual:
    public BundleType getBundleTypeEqual(){
        return this.bundleTypeEqual;
    }
    public void setBundleTypeEqual(BundleType bundleTypeEqual){
        this.bundleTypeEqual = bundleTypeEqual;
    }


    public BundleFilter() {
       super();
    }

    public BundleFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
        typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
        bundleTypeEqual = BundleType.get(GsonParser.parseString(jsonObject.get("bundleTypeEqual")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaBundleFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("typeIn", this.typeIn);
        kparams.add("bundleTypeEqual", this.bundleTypeEqual);
        return kparams;
    }

}

