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
public class RelatedExternalFilter extends AssetFilter {

	/**  the External ID of the asset for which to return related assets  */
    private Integer idEqual;
	/**  Comma separated list of asset types to search within.               Possible
	  values: 0 – EPG linear programs entries, any media type ID (according to media
	  type IDs defined dynamically in the system).              If omitted – all
	  types should be included.  */
    private String typeIn;
	/**  UtcOffsetEqual  */
    private Integer utcOffsetEqual;
	/**  FreeText  */
    private String freeText;

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

    // utcOffsetEqual:
    public Integer getUtcOffsetEqual(){
        return this.utcOffsetEqual;
    }
    public void setUtcOffsetEqual(Integer utcOffsetEqual){
        this.utcOffsetEqual = utcOffsetEqual;
    }

    // freeText:
    public String getFreeText(){
        return this.freeText;
    }
    public void setFreeText(String freeText){
        this.freeText = freeText;
    }


    public RelatedExternalFilter() {
       super();
    }

    public RelatedExternalFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
        typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
        utcOffsetEqual = GsonParser.parseInt(jsonObject.get("utcOffsetEqual"));
        freeText = GsonParser.parseString(jsonObject.get("freeText"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaRelatedExternalFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("typeIn", this.typeIn);
        kparams.add("utcOffsetEqual", this.utcOffsetEqual);
        kparams.add("freeText", this.freeText);
        return kparams;
    }

}

