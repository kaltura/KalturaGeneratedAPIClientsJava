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
import com.kaltura.client.types.ObjectBase;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class RegionalChannel extends ObjectBase {

	/**  The identifier of the linear media representing the channel  */
    private Integer linearChannelId;
	/**  The number of the channel  */
    private Integer channelNumber;

    // linearChannelId:
    public Integer getLinearChannelId(){
        return this.linearChannelId;
    }
    public void setLinearChannelId(Integer linearChannelId){
        this.linearChannelId = linearChannelId;
    }

    // channelNumber:
    public Integer getChannelNumber(){
        return this.channelNumber;
    }
    public void setChannelNumber(Integer channelNumber){
        this.channelNumber = channelNumber;
    }


    public RegionalChannel() {
       super();
    }

    public RegionalChannel(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        linearChannelId = GsonParser.parseInt(jsonObject.get("linearChannelId"));
        channelNumber = GsonParser.parseInt(jsonObject.get("channelNumber"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaRegionalChannel");
        kparams.add("linearChannelId", this.linearChannelId);
        kparams.add("channelNumber", this.channelNumber);
        return kparams;
    }

}

