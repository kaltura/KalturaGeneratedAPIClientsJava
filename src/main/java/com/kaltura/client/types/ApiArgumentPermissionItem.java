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
public class ApiArgumentPermissionItem extends PermissionItem {

	/**  API service name  */
    private String service;
	/**  API action name  */
    private String action;
	/**  API parameter name  */
    private String parameter;

    // service:
    public String getService(){
        return this.service;
    }
    public void setService(String service){
        this.service = service;
    }

    // action:
    public String getAction(){
        return this.action;
    }
    public void setAction(String action){
        this.action = action;
    }

    // parameter:
    public String getParameter(){
        return this.parameter;
    }
    public void setParameter(String parameter){
        this.parameter = parameter;
    }


    public ApiArgumentPermissionItem() {
       super();
    }

    public ApiArgumentPermissionItem(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        service = GsonParser.parseString(jsonObject.get("service"));
        action = GsonParser.parseString(jsonObject.get("action"));
        parameter = GsonParser.parseString(jsonObject.get("parameter"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaApiArgumentPermissionItem");
        kparams.add("service", this.service);
        kparams.add("action", this.action);
        kparams.add("parameter", this.parameter);
        return kparams;
    }

}

