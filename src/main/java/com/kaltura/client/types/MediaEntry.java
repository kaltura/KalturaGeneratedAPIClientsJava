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
import com.kaltura.client.enums.MediaType;
import com.kaltura.client.enums.SearchProviderType;
import com.kaltura.client.enums.SourceType;
import com.kaltura.client.utils.GsonParser;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class MediaEntry extends PlayableEntry {

	/**  The media type of the entry  */
    private MediaType mediaType;
	/**  Override the default conversion quality  */
    private String conversionQuality;
	/**  The source type of the entry  */
    private SourceType sourceType;
	/**  The search provider type used to import this entry  */
    private SearchProviderType searchProviderType;
	/**  The ID of the media in the importing site  */
    private String searchProviderId;
	/**  The user name used for credits  */
    private String creditUserName;
	/**  The URL for credits  */
    private String creditUrl;
	/**  The media date extracted from EXIF data (For images) as Unix timestamp (In
	  seconds)  */
    private Integer mediaDate;
	/**  The URL used for playback. This is not the download URL.  */
    private String dataUrl;
	/**  Comma separated flavor params ids that exists for this media entry  */
    private String flavorParamsIds;
	/**  True if trim action is disabled for this entry  */
    private Boolean isTrimDisabled;
	/**  Array of streams that exists on the entry  */
    private List<StreamContainer> streams;

    // mediaType:
    public MediaType getMediaType(){
        return this.mediaType;
    }
    public void setMediaType(MediaType mediaType){
        this.mediaType = mediaType;
    }

    // conversionQuality:
    public String getConversionQuality(){
        return this.conversionQuality;
    }
    public void setConversionQuality(String conversionQuality){
        this.conversionQuality = conversionQuality;
    }

    // sourceType:
    public SourceType getSourceType(){
        return this.sourceType;
    }
    public void setSourceType(SourceType sourceType){
        this.sourceType = sourceType;
    }

    // searchProviderType:
    public SearchProviderType getSearchProviderType(){
        return this.searchProviderType;
    }
    public void setSearchProviderType(SearchProviderType searchProviderType){
        this.searchProviderType = searchProviderType;
    }

    // searchProviderId:
    public String getSearchProviderId(){
        return this.searchProviderId;
    }
    public void setSearchProviderId(String searchProviderId){
        this.searchProviderId = searchProviderId;
    }

    // creditUserName:
    public String getCreditUserName(){
        return this.creditUserName;
    }
    public void setCreditUserName(String creditUserName){
        this.creditUserName = creditUserName;
    }

    // creditUrl:
    public String getCreditUrl(){
        return this.creditUrl;
    }
    public void setCreditUrl(String creditUrl){
        this.creditUrl = creditUrl;
    }

    // mediaDate:
    public Integer getMediaDate(){
        return this.mediaDate;
    }
    public void setMediaDate(Integer mediaDate){
        this.mediaDate = mediaDate;
    }

    // dataUrl:
    public String getDataUrl(){
        return this.dataUrl;
    }
    public void setDataUrl(String dataUrl){
        this.dataUrl = dataUrl;
    }

    // flavorParamsIds:
    public String getFlavorParamsIds(){
        return this.flavorParamsIds;
    }
    public void setFlavorParamsIds(String flavorParamsIds){
        this.flavorParamsIds = flavorParamsIds;
    }

    // isTrimDisabled:
    public Boolean getIsTrimDisabled(){
        return this.isTrimDisabled;
    }
    public void setIsTrimDisabled(Boolean isTrimDisabled){
        this.isTrimDisabled = isTrimDisabled;
    }

    // streams:
    public List<StreamContainer> getStreams(){
        return this.streams;
    }
    public void setStreams(List<StreamContainer> streams){
        this.streams = streams;
    }


    public MediaEntry() {
       super();
    }

    public MediaEntry(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        mediaType = MediaType.get(GsonParser.parseInt(jsonObject.get("mediaType")));
        conversionQuality = GsonParser.parseString(jsonObject.get("conversionQuality"));
        sourceType = SourceType.get(GsonParser.parseString(jsonObject.get("sourceType")));
        searchProviderType = SearchProviderType.get(GsonParser.parseInt(jsonObject.get("searchProviderType")));
        searchProviderId = GsonParser.parseString(jsonObject.get("searchProviderId"));
        creditUserName = GsonParser.parseString(jsonObject.get("creditUserName"));
        creditUrl = GsonParser.parseString(jsonObject.get("creditUrl"));
        mediaDate = GsonParser.parseInt(jsonObject.get("mediaDate"));
        dataUrl = GsonParser.parseString(jsonObject.get("dataUrl"));
        flavorParamsIds = GsonParser.parseString(jsonObject.get("flavorParamsIds"));
        isTrimDisabled = GsonParser.parseBoolean(jsonObject.get("isTrimDisabled"));
        streams = GsonParser.parseArray(jsonObject.getAsJsonArray("streams"), StreamContainer.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaMediaEntry");
        kparams.add("mediaType", this.mediaType);
        kparams.add("conversionQuality", this.conversionQuality);
        kparams.add("sourceType", this.sourceType);
        kparams.add("searchProviderType", this.searchProviderType);
        kparams.add("searchProviderId", this.searchProviderId);
        kparams.add("creditUserName", this.creditUserName);
        kparams.add("creditUrl", this.creditUrl);
        kparams.add("streams", this.streams);
        return kparams;
    }

}

