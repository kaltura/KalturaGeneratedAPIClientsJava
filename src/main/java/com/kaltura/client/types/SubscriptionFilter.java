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
public class SubscriptionFilter extends Filter {

	/**  Comma separated subscription identifiers or file identifier (only 1) to get the
	  subscriptions by  */
    private String subscriptionIdIn;
	/**  Media-file identifier to get the subscriptions by  */
    private Integer mediaFileIdEqual;

    // subscriptionIdIn:
    public String getSubscriptionIdIn(){
        return this.subscriptionIdIn;
    }
    public void setSubscriptionIdIn(String subscriptionIdIn){
        this.subscriptionIdIn = subscriptionIdIn;
    }

    // mediaFileIdEqual:
    public Integer getMediaFileIdEqual(){
        return this.mediaFileIdEqual;
    }
    public void setMediaFileIdEqual(Integer mediaFileIdEqual){
        this.mediaFileIdEqual = mediaFileIdEqual;
    }


    public SubscriptionFilter() {
       super();
    }

    public SubscriptionFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        subscriptionIdIn = GsonParser.parseString(jsonObject.get("subscriptionIdIn"));
        mediaFileIdEqual = GsonParser.parseInt(jsonObject.get("mediaFileIdEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaSubscriptionFilter");
        kparams.add("subscriptionIdIn", this.subscriptionIdIn);
        kparams.add("mediaFileIdEqual", this.mediaFileIdEqual);
        return kparams;
    }

}

