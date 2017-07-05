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
import com.kaltura.client.enums.OTTUserBy;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  OTT User filter  */
@SuppressWarnings("serial")
public class OTTUserFilter extends Filter {

	/**  User Filter By  */
    private OTTUserBy userByEqual;
	/**  The User identifiers  */
    private String valueEqual;

    // userByEqual:
    public OTTUserBy getUserByEqual(){
        return this.userByEqual;
    }
    public void setUserByEqual(OTTUserBy userByEqual){
        this.userByEqual = userByEqual;
    }

    // valueEqual:
    public String getValueEqual(){
        return this.valueEqual;
    }
    public void setValueEqual(String valueEqual){
        this.valueEqual = valueEqual;
    }


    public OTTUserFilter() {
       super();
    }

    public OTTUserFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        userByEqual = OTTUserBy.get(GsonParser.parseString(jsonObject.get("userByEqual")));
        valueEqual = GsonParser.parseString(jsonObject.get("valueEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaOTTUserFilter");
        kparams.add("userByEqual", this.userByEqual);
        kparams.add("valueEqual", this.valueEqual);
        return kparams;
    }

}

