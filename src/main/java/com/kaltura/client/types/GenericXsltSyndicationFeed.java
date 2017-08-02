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

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class GenericXsltSyndicationFeed extends GenericSyndicationFeed {

    private String xslt;
    private List<ExtendingItemMrssParameter> itemXpathsToExtend;

    // xslt:
    public String getXslt(){
        return this.xslt;
    }
    public void setXslt(String xslt){
        this.xslt = xslt;
    }

    // itemXpathsToExtend:
    public List<ExtendingItemMrssParameter> getItemXpathsToExtend(){
        return this.itemXpathsToExtend;
    }
    public void setItemXpathsToExtend(List<ExtendingItemMrssParameter> itemXpathsToExtend){
        this.itemXpathsToExtend = itemXpathsToExtend;
    }


    public GenericXsltSyndicationFeed() {
       super();
    }

    public GenericXsltSyndicationFeed(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        xslt = GsonParser.parseString(jsonObject.get("xslt"));
        itemXpathsToExtend = GsonParser.parseArray(jsonObject.getAsJsonArray("itemXpathsToExtend"), ExtendingItemMrssParameter.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaGenericXsltSyndicationFeed");
        kparams.add("xslt", this.xslt);
        kparams.add("itemXpathsToExtend", this.itemXpathsToExtend);
        return kparams;
    }

}

