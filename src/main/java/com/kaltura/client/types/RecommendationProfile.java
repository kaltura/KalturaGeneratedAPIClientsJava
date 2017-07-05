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

/**  PaymentGW  */
@SuppressWarnings("serial")
public class RecommendationProfile extends ObjectBase {

	/**  recommendation engine id  */
    private Integer id;
	/**  recommendation engine name  */
    private String name;
	/**  recommendation engine is active status  */
    private Boolean isActive;
	/**  recommendation engine adapter URL  */
    private String adapterUrl;
	/**  recommendation engine extra parameters  */
    private Map<String, StringValue> recommendationEngineSettings;
	/**  recommendation engine external identifier  */
    private String externalIdentifier;
	/**  Shared Secret  */
    private String sharedSecret;

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

    // recommendationEngineSettings:
    public Map<String, StringValue> getRecommendationEngineSettings(){
        return this.recommendationEngineSettings;
    }
    public void setRecommendationEngineSettings(Map<String, StringValue> recommendationEngineSettings){
        this.recommendationEngineSettings = recommendationEngineSettings;
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


    public RecommendationProfile() {
       super();
    }

    public RecommendationProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));
        adapterUrl = GsonParser.parseString(jsonObject.get("adapterUrl"));
        recommendationEngineSettings = GsonParser.parseMap(jsonObject.getAsJsonObject("recommendationEngineSettings"), StringValue.class);
        externalIdentifier = GsonParser.parseString(jsonObject.get("externalIdentifier"));
        sharedSecret = GsonParser.parseString(jsonObject.get("sharedSecret"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaRecommendationProfile");
        kparams.add("name", this.name);
        kparams.add("isActive", this.isActive);
        kparams.add("adapterUrl", this.adapterUrl);
        kparams.add("recommendationEngineSettings", this.recommendationEngineSettings);
        kparams.add("externalIdentifier", this.externalIdentifier);
        return kparams;
    }

}

