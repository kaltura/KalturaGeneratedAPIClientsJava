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
public class UrlTokenizerAkamaiRtmp extends UrlTokenizer {

	/**  profile  */
    private String profile;
	/**  Type  */
    private String type;
    private String aifp;
    private Boolean usePrefix;

    // profile:
    public String getProfile(){
        return this.profile;
    }
    public void setProfile(String profile){
        this.profile = profile;
    }

    // type:
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }

    // aifp:
    public String getAifp(){
        return this.aifp;
    }
    public void setAifp(String aifp){
        this.aifp = aifp;
    }

    // usePrefix:
    public Boolean getUsePrefix(){
        return this.usePrefix;
    }
    public void setUsePrefix(Boolean usePrefix){
        this.usePrefix = usePrefix;
    }


    public UrlTokenizerAkamaiRtmp() {
       super();
    }

    public UrlTokenizerAkamaiRtmp(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        profile = GsonParser.parseString(jsonObject.get("profile"));
        type = GsonParser.parseString(jsonObject.get("type"));
        aifp = GsonParser.parseString(jsonObject.get("aifp"));
        usePrefix = GsonParser.parseBoolean(jsonObject.get("usePrefix"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaUrlTokenizerAkamaiRtmp");
        kparams.add("profile", this.profile);
        kparams.add("type", this.type);
        kparams.add("aifp", this.aifp);
        kparams.add("usePrefix", this.usePrefix);
        return kparams;
    }

}
