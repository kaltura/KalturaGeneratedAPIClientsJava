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
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BaseSyndicationFeed.Tokenizer.class)
public abstract class BaseSyndicationFeed extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String feedUrl();
		String partnerId();
		String playlistId();
		String name();
		String status();
		String type();
		String landingPage();
		String createdAt();
		String allowEmbed();
		String playerUiconfId();
		String flavorParamId();
		String transcodeExistingContent();
		String addToDefaultConversionProfile();
		String categories();
		String storageId();
		String entriesOrderBy();
		String enforceEntitlement();
		String privacyContext();
		String updatedAt();
		String useCategoryEntries();
		String feedContentTypeHeader();
	}

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

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// feedUrl:
	public String getFeedUrl(){
		return this.feedUrl;
	}
	public void setFeedUrl(String feedUrl){
		this.feedUrl = feedUrl;
	}

	public void feedUrl(String multirequestToken){
		setToken("feedUrl", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
	}

	// playlistId:
	public String getPlaylistId(){
		return this.playlistId;
	}
	public void setPlaylistId(String playlistId){
		this.playlistId = playlistId;
	}

	public void playlistId(String multirequestToken){
		setToken("playlistId", multirequestToken);
	}

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// status:
	public SyndicationFeedStatus getStatus(){
		return this.status;
	}
	public void setStatus(SyndicationFeedStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// type:
	public SyndicationFeedType getType(){
		return this.type;
	}
	public void setType(SyndicationFeedType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// landingPage:
	public String getLandingPage(){
		return this.landingPage;
	}
	public void setLandingPage(String landingPage){
		this.landingPage = landingPage;
	}

	public void landingPage(String multirequestToken){
		setToken("landingPage", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	public void setCreatedAt(Integer createdAt){
		this.createdAt = createdAt;
	}

	public void createdAt(String multirequestToken){
		setToken("createdAt", multirequestToken);
	}

	// allowEmbed:
	public Boolean getAllowEmbed(){
		return this.allowEmbed;
	}
	public void setAllowEmbed(Boolean allowEmbed){
		this.allowEmbed = allowEmbed;
	}

	public void allowEmbed(String multirequestToken){
		setToken("allowEmbed", multirequestToken);
	}

	// playerUiconfId:
	public Integer getPlayerUiconfId(){
		return this.playerUiconfId;
	}
	public void setPlayerUiconfId(Integer playerUiconfId){
		this.playerUiconfId = playerUiconfId;
	}

	public void playerUiconfId(String multirequestToken){
		setToken("playerUiconfId", multirequestToken);
	}

	// flavorParamId:
	public Integer getFlavorParamId(){
		return this.flavorParamId;
	}
	public void setFlavorParamId(Integer flavorParamId){
		this.flavorParamId = flavorParamId;
	}

	public void flavorParamId(String multirequestToken){
		setToken("flavorParamId", multirequestToken);
	}

	// transcodeExistingContent:
	public Boolean getTranscodeExistingContent(){
		return this.transcodeExistingContent;
	}
	public void setTranscodeExistingContent(Boolean transcodeExistingContent){
		this.transcodeExistingContent = transcodeExistingContent;
	}

	public void transcodeExistingContent(String multirequestToken){
		setToken("transcodeExistingContent", multirequestToken);
	}

	// addToDefaultConversionProfile:
	public Boolean getAddToDefaultConversionProfile(){
		return this.addToDefaultConversionProfile;
	}
	public void setAddToDefaultConversionProfile(Boolean addToDefaultConversionProfile){
		this.addToDefaultConversionProfile = addToDefaultConversionProfile;
	}

	public void addToDefaultConversionProfile(String multirequestToken){
		setToken("addToDefaultConversionProfile", multirequestToken);
	}

	// categories:
	public String getCategories(){
		return this.categories;
	}
	public void setCategories(String categories){
		this.categories = categories;
	}

	public void categories(String multirequestToken){
		setToken("categories", multirequestToken);
	}

	// storageId:
	public Integer getStorageId(){
		return this.storageId;
	}
	public void setStorageId(Integer storageId){
		this.storageId = storageId;
	}

	public void storageId(String multirequestToken){
		setToken("storageId", multirequestToken);
	}

	// entriesOrderBy:
	public SyndicationFeedEntriesOrderBy getEntriesOrderBy(){
		return this.entriesOrderBy;
	}
	public void setEntriesOrderBy(SyndicationFeedEntriesOrderBy entriesOrderBy){
		this.entriesOrderBy = entriesOrderBy;
	}

	public void entriesOrderBy(String multirequestToken){
		setToken("entriesOrderBy", multirequestToken);
	}

	// enforceEntitlement:
	public Boolean getEnforceEntitlement(){
		return this.enforceEntitlement;
	}
	public void setEnforceEntitlement(Boolean enforceEntitlement){
		this.enforceEntitlement = enforceEntitlement;
	}

	public void enforceEntitlement(String multirequestToken){
		setToken("enforceEntitlement", multirequestToken);
	}

	// privacyContext:
	public String getPrivacyContext(){
		return this.privacyContext;
	}
	public void setPrivacyContext(String privacyContext){
		this.privacyContext = privacyContext;
	}

	public void privacyContext(String multirequestToken){
		setToken("privacyContext", multirequestToken);
	}

	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	public void setUpdatedAt(Integer updatedAt){
		this.updatedAt = updatedAt;
	}

	public void updatedAt(String multirequestToken){
		setToken("updatedAt", multirequestToken);
	}

	// useCategoryEntries:
	public Boolean getUseCategoryEntries(){
		return this.useCategoryEntries;
	}
	public void setUseCategoryEntries(Boolean useCategoryEntries){
		this.useCategoryEntries = useCategoryEntries;
	}

	public void useCategoryEntries(String multirequestToken){
		setToken("useCategoryEntries", multirequestToken);
	}

	// feedContentTypeHeader:
	public String getFeedContentTypeHeader(){
		return this.feedContentTypeHeader;
	}
	public void setFeedContentTypeHeader(String feedContentTypeHeader){
		this.feedContentTypeHeader = feedContentTypeHeader;
	}

	public void feedContentTypeHeader(String multirequestToken){
		setToken("feedContentTypeHeader", multirequestToken);
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

