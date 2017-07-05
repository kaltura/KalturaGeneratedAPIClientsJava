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
import com.kaltura.client.types.FeedItemInfo;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class FeedDropFolder extends DropFolder {

    private Integer itemHandlingLimit;
    private FeedItemInfo feedItemInfo;

    // itemHandlingLimit:
    public Integer getItemHandlingLimit(){
        return this.itemHandlingLimit;
    }
    public void setItemHandlingLimit(Integer itemHandlingLimit){
        this.itemHandlingLimit = itemHandlingLimit;
    }

    // feedItemInfo:
    public FeedItemInfo getFeedItemInfo(){
        return this.feedItemInfo;
    }
    public void setFeedItemInfo(FeedItemInfo feedItemInfo){
        this.feedItemInfo = feedItemInfo;
    }


    public FeedDropFolder() {
       super();
    }

    public FeedDropFolder(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        itemHandlingLimit = GsonParser.parseInt(jsonObject.get("itemHandlingLimit"));
        feedItemInfo = GsonParser.parseObject(jsonObject.getAsJsonObject("feedItemInfo"), FeedItemInfo.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaFeedDropFolder");
        kparams.add("itemHandlingLimit", this.itemHandlingLimit);
        kparams.add("feedItemInfo", this.feedItemInfo);
        return kparams;
    }

}

