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
import com.kaltura.client.enums.OTTAssetType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class MessageTemplate extends ObjectBase {

	/**  The message template with placeholders  */
    private String message;
	/**  Default date format for the date &amp;amp; time entries used in the template  */
    private String dateFormat;
	/**  Template type. Possible values: Series  */
    private OTTAssetType assetType;
	/**  Sound file name to play upon message arrival to the device (if supported by
	  target device)  */
    private String sound;
	/**  an optional action  */
    private String action;
	/**  URL template for deep linking. Example - /app/location/{mediaId}  */
    private String url;

    // message:
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }

    // dateFormat:
    public String getDateFormat(){
        return this.dateFormat;
    }
    public void setDateFormat(String dateFormat){
        this.dateFormat = dateFormat;
    }

    // assetType:
    public OTTAssetType getAssetType(){
        return this.assetType;
    }
    public void setAssetType(OTTAssetType assetType){
        this.assetType = assetType;
    }

    // sound:
    public String getSound(){
        return this.sound;
    }
    public void setSound(String sound){
        this.sound = sound;
    }

    // action:
    public String getAction(){
        return this.action;
    }
    public void setAction(String action){
        this.action = action;
    }

    // url:
    public String getUrl(){
        return this.url;
    }
    public void setUrl(String url){
        this.url = url;
    }


    public MessageTemplate() {
       super();
    }

    public MessageTemplate(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        message = GsonParser.parseString(jsonObject.get("message"));
        dateFormat = GsonParser.parseString(jsonObject.get("dateFormat"));
        assetType = OTTAssetType.get(GsonParser.parseInt(jsonObject.get("assetType")));
        sound = GsonParser.parseString(jsonObject.get("sound"));
        action = GsonParser.parseString(jsonObject.get("action"));
        url = GsonParser.parseString(jsonObject.get("url"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaMessageTemplate");
        kparams.add("message", this.message);
        kparams.add("dateFormat", this.dateFormat);
        kparams.add("assetType", this.assetType);
        kparams.add("sound", this.sound);
        kparams.add("action", this.action);
        kparams.add("url", this.url);
        return kparams;
    }

}

