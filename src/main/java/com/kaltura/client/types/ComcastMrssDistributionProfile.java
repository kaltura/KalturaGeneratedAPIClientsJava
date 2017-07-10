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
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ComcastMrssDistributionProfile extends ConfigurableDistributionProfile {

    private Integer metadataProfileId;
    private String feedUrl;
    private String feedTitle;
    private String feedLink;
    private String feedDescription;
    private String feedLastBuildDate;
    private String itemLink;
    private List<KeyValue> cPlatformTvSeries;
    private String cPlatformTvSeriesField;
    private Boolean shouldIncludeCuePoints;
    private Boolean shouldIncludeCaptions;
    private Boolean shouldAddThumbExtension;

    // metadataProfileId:
    public Integer getMetadataProfileId(){
        return this.metadataProfileId;
    }
    public void setMetadataProfileId(Integer metadataProfileId){
        this.metadataProfileId = metadataProfileId;
    }

    // feedUrl:
    public String getFeedUrl(){
        return this.feedUrl;
    }
    public void setFeedUrl(String feedUrl){
        this.feedUrl = feedUrl;
    }

    // feedTitle:
    public String getFeedTitle(){
        return this.feedTitle;
    }
    public void setFeedTitle(String feedTitle){
        this.feedTitle = feedTitle;
    }

    // feedLink:
    public String getFeedLink(){
        return this.feedLink;
    }
    public void setFeedLink(String feedLink){
        this.feedLink = feedLink;
    }

    // feedDescription:
    public String getFeedDescription(){
        return this.feedDescription;
    }
    public void setFeedDescription(String feedDescription){
        this.feedDescription = feedDescription;
    }

    // feedLastBuildDate:
    public String getFeedLastBuildDate(){
        return this.feedLastBuildDate;
    }
    public void setFeedLastBuildDate(String feedLastBuildDate){
        this.feedLastBuildDate = feedLastBuildDate;
    }

    // itemLink:
    public String getItemLink(){
        return this.itemLink;
    }
    public void setItemLink(String itemLink){
        this.itemLink = itemLink;
    }

    // cPlatformTvSeries:
    public List<KeyValue> getCPlatformTvSeries(){
        return this.cPlatformTvSeries;
    }
    public void setCPlatformTvSeries(List<KeyValue> cPlatformTvSeries){
        this.cPlatformTvSeries = cPlatformTvSeries;
    }

    // cPlatformTvSeriesField:
    public String getCPlatformTvSeriesField(){
        return this.cPlatformTvSeriesField;
    }
    public void setCPlatformTvSeriesField(String cPlatformTvSeriesField){
        this.cPlatformTvSeriesField = cPlatformTvSeriesField;
    }

    // shouldIncludeCuePoints:
    public Boolean getShouldIncludeCuePoints(){
        return this.shouldIncludeCuePoints;
    }
    public void setShouldIncludeCuePoints(Boolean shouldIncludeCuePoints){
        this.shouldIncludeCuePoints = shouldIncludeCuePoints;
    }

    // shouldIncludeCaptions:
    public Boolean getShouldIncludeCaptions(){
        return this.shouldIncludeCaptions;
    }
    public void setShouldIncludeCaptions(Boolean shouldIncludeCaptions){
        this.shouldIncludeCaptions = shouldIncludeCaptions;
    }

    // shouldAddThumbExtension:
    public Boolean getShouldAddThumbExtension(){
        return this.shouldAddThumbExtension;
    }
    public void setShouldAddThumbExtension(Boolean shouldAddThumbExtension){
        this.shouldAddThumbExtension = shouldAddThumbExtension;
    }


    public ComcastMrssDistributionProfile() {
       super();
    }

    public ComcastMrssDistributionProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));
        feedUrl = GsonParser.parseString(jsonObject.get("feedUrl"));
        feedTitle = GsonParser.parseString(jsonObject.get("feedTitle"));
        feedLink = GsonParser.parseString(jsonObject.get("feedLink"));
        feedDescription = GsonParser.parseString(jsonObject.get("feedDescription"));
        feedLastBuildDate = GsonParser.parseString(jsonObject.get("feedLastBuildDate"));
        itemLink = GsonParser.parseString(jsonObject.get("itemLink"));
        cPlatformTvSeries = GsonParser.parseArray(jsonObject.getAsJsonArray("cPlatformTvSeries"), KeyValue.class);
        cPlatformTvSeriesField = GsonParser.parseString(jsonObject.get("cPlatformTvSeriesField"));
        shouldIncludeCuePoints = GsonParser.parseBoolean(jsonObject.get("shouldIncludeCuePoints"));
        shouldIncludeCaptions = GsonParser.parseBoolean(jsonObject.get("shouldIncludeCaptions"));
        shouldAddThumbExtension = GsonParser.parseBoolean(jsonObject.get("shouldAddThumbExtension"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaComcastMrssDistributionProfile");
        kparams.add("metadataProfileId", this.metadataProfileId);
        kparams.add("feedTitle", this.feedTitle);
        kparams.add("feedLink", this.feedLink);
        kparams.add("feedDescription", this.feedDescription);
        kparams.add("feedLastBuildDate", this.feedLastBuildDate);
        kparams.add("itemLink", this.itemLink);
        kparams.add("cPlatformTvSeries", this.cPlatformTvSeries);
        kparams.add("cPlatformTvSeriesField", this.cPlatformTvSeriesField);
        kparams.add("shouldIncludeCuePoints", this.shouldIncludeCuePoints);
        kparams.add("shouldIncludeCaptions", this.shouldIncludeCaptions);
        kparams.add("shouldAddThumbExtension", this.shouldAddThumbExtension);
        return kparams;
    }

}
