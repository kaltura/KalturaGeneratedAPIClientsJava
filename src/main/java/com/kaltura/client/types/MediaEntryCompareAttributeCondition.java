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
import com.kaltura.client.enums.MediaEntryCompareAttribute;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Auto-generated class.  Used to search KalturaMediaEntry attributes. Use
  KalturaMediaEntryCompareAttribute enum to provide attribute name. /  */
@SuppressWarnings("serial")
public class MediaEntryCompareAttributeCondition extends SearchComparableAttributeCondition {

    private MediaEntryCompareAttribute attribute;

    // attribute:
    public MediaEntryCompareAttribute getAttribute(){
        return this.attribute;
    }
    public void setAttribute(MediaEntryCompareAttribute attribute){
        this.attribute = attribute;
    }


    public MediaEntryCompareAttributeCondition() {
       super();
    }

    public MediaEntryCompareAttributeCondition(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        attribute = MediaEntryCompareAttribute.get(GsonParser.parseString(jsonObject.get("attribute")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaMediaEntryCompareAttributeCondition");
        kparams.add("attribute", this.attribute);
        return kparams;
    }

}

