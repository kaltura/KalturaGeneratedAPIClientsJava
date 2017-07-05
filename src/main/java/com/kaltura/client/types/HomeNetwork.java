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

/**  Home network details  */
@SuppressWarnings("serial")
public class HomeNetwork extends ObjectBase {

	/**  Home network identifier  */
    private String externalId;
	/**  Home network name  */
    private String name;
	/**  Home network description  */
    private String description;
	/**  Is home network is active  */
    private Boolean isActive;

    // externalId:
    public String getExternalId(){
        return this.externalId;
    }
    public void setExternalId(String externalId){
        this.externalId = externalId;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // isActive:
    public Boolean getIsActive(){
        return this.isActive;
    }
    public void setIsActive(Boolean isActive){
        this.isActive = isActive;
    }


    public HomeNetwork() {
       super();
    }

    public HomeNetwork(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        externalId = GsonParser.parseString(jsonObject.get("externalId"));
        name = GsonParser.parseString(jsonObject.get("name"));
        description = GsonParser.parseString(jsonObject.get("description"));
        isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaHomeNetwork");
        kparams.add("externalId", this.externalId);
        kparams.add("name", this.name);
        kparams.add("description", this.description);
        kparams.add("isActive", this.isActive);
        return kparams;
    }

}

