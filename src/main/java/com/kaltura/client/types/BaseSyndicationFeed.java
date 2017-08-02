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
import com.kaltura.client.enums.SyndicationFeedEntriesOrderBy;
import com.kaltura.client.enums.SyndicationFeedStatus;
import com.kaltura.client.enums.SyndicationFeedType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class BaseSyndicationFeed extends ObjectBase {

    private String id;
    private String feedUrl;
    private Integer partnerId;
	/**  link a playlist that will set what content the feed will include   if empty, all
	  content will be included in feed  */
    private String playlistId;
	/**  feed name  */
    private String name;
	/**  feed status  */
    private SyndicationFeedStatus status;
	/**  feed type  */
    private SyndicationFeedType type;
	/**  Base URL for each video, on the partners site   This is required by all
	  syndication types.  */
    private String landingPage;
	/**  Creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  allow_embed tells google OR yahoo weather to allow embedding the video on google
	  OR yahoo video results   or just to provide a link to the landing page.   it is
	  applied on the video-player_loc property in the XML (google)   and addes
	  media-player tag (yahoo)  */
    private Boolean allowEmbed;
	/**  Select a uiconf ID as player skin to include in the kwidget url  */
    private Integer playerUiconfId;
    private Integer flavorParamId;
    private Boolean transcodeExistingContent;
    private Boolean addToDefaultConversionProfile;
    private String categories;
    private Integer storageId;
    private SyndicationFeedEntriesOrderBy entriesOrderBy;
	/**  Should enforce entitlement on feed entries  */
    private Boolean enforceEntitlement;
	/**  Set privacy context for search entries that assiged to private and public
	  categories within a category privacy context.  */
    private String privacyContext;
	/**  Update date as Unix timestamp (In seconds)  */
    private Integer updatedAt;
    private Boolean useCategoryEntries;
	/**  Feed content-type header value  */
    private String feedContentTypeHeader;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // feedUrl:
    public String getFeedUrl(){
        return this.feedUrl;
    }
    public void setFeedUrl(String feedUrl){
        this.feedUrl = feedUrl;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // playlistId:
    public String getPlaylistId(){
        return this.playlistId;
    }
    public void setPlaylistId(String playlistId){
        this.playlistId = playlistId;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // status:
    public SyndicationFeedStatus getStatus(){
        return this.status;
    }
    public void setStatus(SyndicationFeedStatus status){
        this.status = status;
    }

    // type:
    public SyndicationFeedType getType(){
        return this.type;
    }
    public void setType(SyndicationFeedType type){
        this.type = type;
    }

    // landingPage:
    public String getLandingPage(){
        return this.landingPage;
    }
    public void setLandingPage(String landingPage){
        this.landingPage = landingPage;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // allowEmbed:
    public Boolean getAllowEmbed(){
        return this.allowEmbed;
    }
    public void setAllowEmbed(Boolean allowEmbed){
        this.allowEmbed = allowEmbed;
    }

    // playerUiconfId:
    public Integer getPlayerUiconfId(){
        return this.playerUiconfId;
    }
    public void setPlayerUiconfId(Integer playerUiconfId){
        this.playerUiconfId = playerUiconfId;
    }

    // flavorParamId:
    public Integer getFlavorParamId(){
        return this.flavorParamId;
    }
    public void setFlavorParamId(Integer flavorParamId){
        this.flavorParamId = flavorParamId;
    }

    // transcodeExistingContent:
    public Boolean getTranscodeExistingContent(){
        return this.transcodeExistingContent;
    }
    public void setTranscodeExistingContent(Boolean transcodeExistingContent){
        this.transcodeExistingContent = transcodeExistingContent;
    }

    // addToDefaultConversionProfile:
    public Boolean getAddToDefaultConversionProfile(){
        return this.addToDefaultConversionProfile;
    }
    public void setAddToDefaultConversionProfile(Boolean addToDefaultConversionProfile){
        this.addToDefaultConversionProfile = addToDefaultConversionProfile;
    }

    // categories:
    public String getCategories(){
        return this.categories;
    }
    public void setCategories(String categories){
        this.categories = categories;
    }

    // storageId:
    public Integer getStorageId(){
        return this.storageId;
    }
    public void setStorageId(Integer storageId){
        this.storageId = storageId;
    }

    // entriesOrderBy:
    public SyndicationFeedEntriesOrderBy getEntriesOrderBy(){
        return this.entriesOrderBy;
    }
    public void setEntriesOrderBy(SyndicationFeedEntriesOrderBy entriesOrderBy){
        this.entriesOrderBy = entriesOrderBy;
    }

    // enforceEntitlement:
    public Boolean getEnforceEntitlement(){
        return this.enforceEntitlement;
    }
    public void setEnforceEntitlement(Boolean enforceEntitlement){
        this.enforceEntitlement = enforceEntitlement;
    }

    // privacyContext:
    public String getPrivacyContext(){
        return this.privacyContext;
    }
    public void setPrivacyContext(String privacyContext){
        this.privacyContext = privacyContext;
    }

    // updatedAt:
    public Integer getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Integer updatedAt){
        this.updatedAt = updatedAt;
    }

    // useCategoryEntries:
    public Boolean getUseCategoryEntries(){
        return this.useCategoryEntries;
    }
    public void setUseCategoryEntries(Boolean useCategoryEntries){
        this.useCategoryEntries = useCategoryEntries;
    }

    // feedContentTypeHeader:
    public String getFeedContentTypeHeader(){
        return this.feedContentTypeHeader;
    }
    public void setFeedContentTypeHeader(String feedContentTypeHeader){
        this.feedContentTypeHeader = feedContentTypeHeader;
    }


    public BaseSyndicationFeed() {
       super();
    }

    public BaseSyndicationFeed(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        feedUrl = GsonParser.parseString(jsonObject.get("feedUrl"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        playlistId = GsonParser.parseString(jsonObject.get("playlistId"));
        name = GsonParser.parseString(jsonObject.get("name"));
        status = SyndicationFeedStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        type = SyndicationFeedType.get(GsonParser.parseInt(jsonObject.get("type")));
        landingPage = GsonParser.parseString(jsonObject.get("landingPage"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        allowEmbed = GsonParser.parseBoolean(jsonObject.get("allowEmbed"));
        playerUiconfId = GsonParser.parseInt(jsonObject.get("playerUiconfId"));
        flavorParamId = GsonParser.parseInt(jsonObject.get("flavorParamId"));
        transcodeExistingContent = GsonParser.parseBoolean(jsonObject.get("transcodeExistingContent"));
        addToDefaultConversionProfile = GsonParser.parseBoolean(jsonObject.get("addToDefaultConversionProfile"));
        categories = GsonParser.parseString(jsonObject.get("categories"));
        storageId = GsonParser.parseInt(jsonObject.get("storageId"));
        entriesOrderBy = SyndicationFeedEntriesOrderBy.get(GsonParser.parseString(jsonObject.get("entriesOrderBy")));
        enforceEntitlement = GsonParser.parseBoolean(jsonObject.get("enforceEntitlement"));
        privacyContext = GsonParser.parseString(jsonObject.get("privacyContext"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        useCategoryEntries = GsonParser.parseBoolean(jsonObject.get("useCategoryEntries"));
        feedContentTypeHeader = GsonParser.parseString(jsonObject.get("feedContentTypeHeader"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaBaseSyndicationFeed");
        kparams.add("playlistId", this.playlistId);
        kparams.add("name", this.name);
        kparams.add("type", this.type);
        kparams.add("landingPage", this.landingPage);
        kparams.add("allowEmbed", this.allowEmbed);
        kparams.add("playerUiconfId", this.playerUiconfId);
        kparams.add("flavorParamId", this.flavorParamId);
        kparams.add("transcodeExistingContent", this.transcodeExistingContent);
        kparams.add("addToDefaultConversionProfile", this.addToDefaultConversionProfile);
        kparams.add("categories", this.categories);
        kparams.add("storageId", this.storageId);
        kparams.add("entriesOrderBy", this.entriesOrderBy);
        kparams.add("enforceEntitlement", this.enforceEntitlement);
        kparams.add("privacyContext", this.privacyContext);
        kparams.add("useCategoryEntries", this.useCategoryEntries);
        kparams.add("feedContentTypeHeader", this.feedContentTypeHeader);
        return kparams;
    }

}

