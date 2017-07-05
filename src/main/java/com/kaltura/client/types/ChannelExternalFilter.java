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
public class ChannelExternalFilter extends AssetFilter {

	/**  External Channel Id.  */
    private Integer idEqual;
	/**  UtcOffsetEqual  */
    private String utcOffsetEqual;
	/**  FreeTextEqual  */
    private String freeText;

    // idEqual:
    public Integer getIdEqual(){
        return this.idEqual;
    }
    public void setIdEqual(Integer idEqual){
        this.idEqual = idEqual;
    }

    // utcOffsetEqual:
    public String getUtcOffsetEqual(){
        return this.utcOffsetEqual;
    }
    public void setUtcOffsetEqual(String utcOffsetEqual){
        this.utcOffsetEqual = utcOffsetEqual;
    }

    // freeText:
    public String getFreeText(){
        return this.freeText;
    }
    public void setFreeText(String freeText){
        this.freeText = freeText;
    }


    public ChannelExternalFilter() {
       super();
    }

    public ChannelExternalFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
        utcOffsetEqual = GsonParser.parseString(jsonObject.get("utcOffsetEqual"));
        freeText = GsonParser.parseString(jsonObject.get("freeText"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaChannelExternalFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("utcOffsetEqual", this.utcOffsetEqual);
        kparams.add("freeText", this.freeText);
        return kparams;
    }

}

