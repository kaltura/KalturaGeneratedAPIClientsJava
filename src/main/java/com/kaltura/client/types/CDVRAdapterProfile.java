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
import java.util.Map;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  C-DVR Adapter  */
@SuppressWarnings("serial")
public class CDVRAdapterProfile extends ObjectBase {

	/**  C-DVR adapter identifier  */
    private Integer id;
	/**  C-DVR adapter name  */
    private String name;
	/**  C-DVR adapter active status  */
    private Boolean isActive;
	/**  C-DVR adapter adapter URL  */
    private String adapterUrl;
	/**  C-DVR adapter extra parameters  */
    private Map<String, StringValue> settings;
	/**  C-DVR adapter external identifier  */
    private String externalIdentifier;
	/**  C-DVR shared secret  */
    private String sharedSecret;
	/**  Indicates whether the C-DVR adapter supports dynamic URLs  */
    private Boolean dynamicLinksSupport;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

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

    // settings:
    public Map<String, StringValue> getSettings(){
        return this.settings;
    }
    public void setSettings(Map<String, StringValue> settings){
        this.settings = settings;
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

    // dynamicLinksSupport:
    public Boolean getDynamicLinksSupport(){
        return this.dynamicLinksSupport;
    }
    public void setDynamicLinksSupport(Boolean dynamicLinksSupport){
        this.dynamicLinksSupport = dynamicLinksSupport;
    }


    public CDVRAdapterProfile() {
       super();
    }

    public CDVRAdapterProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));
        adapterUrl = GsonParser.parseString(jsonObject.get("adapterUrl"));
        settings = GsonParser.parseMap(jsonObject.getAsJsonObject("settings"), StringValue.class);
        externalIdentifier = GsonParser.parseString(jsonObject.get("externalIdentifier"));
        sharedSecret = GsonParser.parseString(jsonObject.get("sharedSecret"));
        dynamicLinksSupport = GsonParser.parseBoolean(jsonObject.get("dynamicLinksSupport"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCDVRAdapterProfile");
        kparams.add("name", this.name);
        kparams.add("isActive", this.isActive);
        kparams.add("adapterUrl", this.adapterUrl);
        kparams.add("settings", this.settings);
        kparams.add("externalIdentifier", this.externalIdentifier);
        kparams.add("dynamicLinksSupport", this.dynamicLinksSupport);
        return kparams;
    }

}

