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
import com.kaltura.client.types.StringValue;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class EventNotificationParameter extends ObjectBase {

	/**  The key in the subject and body to be replaced with the dynamic value  */
    private String key;
    private String description;
	/**  The dynamic value to be placed in the final output  */
    private StringValue value;

    // key:
    public String getKey(){
        return this.key;
    }
    public void setKey(String key){
        this.key = key;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // value:
    public StringValue getValue(){
        return this.value;
    }
    public void setValue(StringValue value){
        this.value = value;
    }


    public EventNotificationParameter() {
       super();
    }

    public EventNotificationParameter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        key = GsonParser.parseString(jsonObject.get("key"));
        description = GsonParser.parseString(jsonObject.get("description"));
        value = GsonParser.parseObject(jsonObject.getAsJsonObject("value"), StringValue.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaEventNotificationParameter");
        kparams.add("key", this.key);
        kparams.add("description", this.description);
        kparams.add("value", this.value);
        return kparams;
    }

}

