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

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class UrlTokenizerVelocix extends UrlTokenizer {

	/**  hdsPaths  */
    private String hdsPaths;
	/**  tokenParamName  */
    private String paramName;
	/**  secure URL prefix  */
    private String authPrefix;

    // hdsPaths:
    public String getHdsPaths(){
        return this.hdsPaths;
    }
    public void setHdsPaths(String hdsPaths){
        this.hdsPaths = hdsPaths;
    }

    // paramName:
    public String getParamName(){
        return this.paramName;
    }
    public void setParamName(String paramName){
        this.paramName = paramName;
    }

    // authPrefix:
    public String getAuthPrefix(){
        return this.authPrefix;
    }
    public void setAuthPrefix(String authPrefix){
        this.authPrefix = authPrefix;
    }


    public UrlTokenizerVelocix() {
       super();
    }

    public UrlTokenizerVelocix(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        hdsPaths = GsonParser.parseString(jsonObject.get("hdsPaths"));
        paramName = GsonParser.parseString(jsonObject.get("paramName"));
        authPrefix = GsonParser.parseString(jsonObject.get("authPrefix"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaUrlTokenizerVelocix");
        kparams.add("hdsPaths", this.hdsPaths);
        kparams.add("paramName", this.paramName);
        kparams.add("authPrefix", this.authPrefix);
        return kparams;
    }

}

