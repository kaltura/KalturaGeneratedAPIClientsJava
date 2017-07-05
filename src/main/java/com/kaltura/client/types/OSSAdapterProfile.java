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
import java.util.Map;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  OSS Adapter  */
@SuppressWarnings("serial")
public class OSSAdapterProfile extends OSSAdapterBaseProfile {

	/**  OSS adapter active status  */
    private Boolean isActive;
	/**  OSS adapter adapter URL  */
    private String adapterUrl;
	/**  OSS adapter extra parameters  */
    private Map<String, StringValue> ossAdapterSettings;
	/**  OSS adapter external identifier  */
    private String externalIdentifier;
	/**  Shared Secret  */
    private String sharedSecret;

    // isActive:
    public Boolean getIsActive(){
        return this.isActive;
    }
    public void setIsActive(Boolean isActive){
        this.isActive = isActive;
    }

    // adapterUrl:
    public String getAdapterUrl(){
        return this.adapterUrl;
    }
    public void setAdapterUrl(String adapterUrl){
        this.adapterUrl = adapterUrl;
    }

    // ossAdapterSettings:
    public Map<String, StringValue> getOssAdapterSettings(){
        return this.ossAdapterSettings;
    }
    public void setOssAdapterSettings(Map<String, StringValue> ossAdapterSettings){
        this.ossAdapterSettings = ossAdapterSettings;
    }

    // externalIdentifier:
    public String getExternalIdentifier(){
        return this.externalIdentifier;
    }
    public void setExternalIdentifier(String externalIdentifier){
        this.externalIdentifier = externalIdentifier;
    }

    // sharedSecret:
    public String getSharedSecret(){
        return this.sharedSecret;
    }
    public void setSharedSecret(String sharedSecret){
        this.sharedSecret = sharedSecret;
    }


    public OSSAdapterProfile() {
       super();
    }

    public OSSAdapterProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));
        adapterUrl = GsonParser.parseString(jsonObject.get("adapterUrl"));
        ossAdapterSettings = GsonParser.parseMap(jsonObject.getAsJsonObject("ossAdapterSettings"), StringValue.class);
        externalIdentifier = GsonParser.parseString(jsonObject.get("externalIdentifier"));
        sharedSecret = GsonParser.parseString(jsonObject.get("sharedSecret"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaOSSAdapterProfile");
        kparams.add("isActive", this.isActive);
        kparams.add("adapterUrl", this.adapterUrl);
        kparams.add("ossAdapterSettings", this.ossAdapterSettings);
        kparams.add("externalIdentifier", this.externalIdentifier);
        return kparams;
    }

}

