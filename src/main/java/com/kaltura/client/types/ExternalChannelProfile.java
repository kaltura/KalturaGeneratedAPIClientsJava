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
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  OSS Adapter  */
@SuppressWarnings("serial")
public class ExternalChannelProfile extends ObjectBase {

	/**  External channel id  */
    private Integer id;
	/**  External channel name  */
    private String name;
	/**  External channel active status  */
    private Boolean isActive;
	/**  External channel external identifier  */
    private String externalIdentifier;
	/**  Filter expression  */
    private String filterExpression;
	/**  Recommendation engine id  */
    private Integer recommendationEngineId;
	/**  Enrichments  */
    private List<ChannelEnrichmentHolder> enrichments;

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

    // externalIdentifier:
    public String getExternalIdentifier(){
        return this.externalIdentifier;
    }
    public void setExternalIdentifier(String externalIdentifier){
        this.externalIdentifier = externalIdentifier;
    }

    // filterExpression:
    public String getFilterExpression(){
        return this.filterExpression;
    }
    public void setFilterExpression(String filterExpression){
        this.filterExpression = filterExpression;
    }

    // recommendationEngineId:
    public Integer getRecommendationEngineId(){
        return this.recommendationEngineId;
    }
    public void setRecommendationEngineId(Integer recommendationEngineId){
        this.recommendationEngineId = recommendationEngineId;
    }

    // enrichments:
    public List<ChannelEnrichmentHolder> getEnrichments(){
        return this.enrichments;
    }
    public void setEnrichments(List<ChannelEnrichmentHolder> enrichments){
        this.enrichments = enrichments;
    }


    public ExternalChannelProfile() {
       super();
    }

    public ExternalChannelProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));
        externalIdentifier = GsonParser.parseString(jsonObject.get("externalIdentifier"));
        filterExpression = GsonParser.parseString(jsonObject.get("filterExpression"));
        recommendationEngineId = GsonParser.parseInt(jsonObject.get("recommendationEngineId"));
        enrichments = GsonParser.parseArray(jsonObject.getAsJsonArray("enrichments"), ChannelEnrichmentHolder.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaExternalChannelProfile");
        kparams.add("name", this.name);
        kparams.add("isActive", this.isActive);
        kparams.add("externalIdentifier", this.externalIdentifier);
        kparams.add("filterExpression", this.filterExpression);
        kparams.add("recommendationEngineId", this.recommendationEngineId);
        kparams.add("enrichments", this.enrichments);
        return kparams;
    }

}

