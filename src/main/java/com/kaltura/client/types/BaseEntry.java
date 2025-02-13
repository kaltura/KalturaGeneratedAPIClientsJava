// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2023  Kaltura Inc.
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
import com.kaltura.client.enums.EntryApplication;
import com.kaltura.client.enums.EntryDisplayInSearchType;
import com.kaltura.client.enums.EntryModerationStatus;
import com.kaltura.client.enums.EntryReplacementStatus;
import com.kaltura.client.enums.EntryStatus;
import com.kaltura.client.enums.EntryType;
import com.kaltura.client.enums.LicenseType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BaseEntry.Tokenizer.class)
public class BaseEntry extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		RequestBuilder.ListTokenizer<MultiLingualString.Tokenizer> multiLingual_name();
		String description();
		RequestBuilder.ListTokenizer<MultiLingualString.Tokenizer> multiLingual_description();
		String partnerId();
		String userId();
		String creatorId();
		String tags();
		RequestBuilder.ListTokenizer<MultiLingualString.Tokenizer> multiLingual_tags();
		String adminTags();
		String categories();
		String categoriesIds();
		String status();
		String moderationStatus();
		String moderationCount();
		String type();
		String createdAt();
		String updatedAt();
		String rank();
		String totalRank();
		String votes();
		String groupId();
		String partnerData();
		String downloadUrl();
		String searchText();
		String licenseType();
		String version();
		String thumbnailUrl();
		String accessControlId();
		String startDate();
		String endDate();
		String referenceId();
		String replacingEntryId();
		String replacedEntryId();
		String replacementStatus();
		String partnerSortValue();
		String conversionProfileId();
		String redirectEntryId();
		String rootEntryId();
		String parentEntryId();
		RequestBuilder.ListTokenizer<OperationAttributes.Tokenizer> operationAttributes();
		String entitledUsersEdit();
		String entitledUsersPublish();
		String entitledUsersView();
		String capabilities();
		String templateEntryId();
		String displayInSearch();
		String application();
		String applicationVersion();
		String blockAutoTranscript();
		String defaultLanguage();
		String responseLanguage();
	}

	/**
	 * Auto generated 10 characters alphanumeric string
	 */
	private String id;
	/**
	 * Entry name (Min 1 chars)
	 */
	private String name;
	/**
	 * Entry name (Min 1 chars)
	 */
	private List<MultiLingualString> multiLingual_name;
	/**
	 * Entry description
	 */
	private String description;
	/**
	 * Entry description
	 */
	private List<MultiLingualString> multiLingual_description;
	private Integer partnerId;
	/**
	 * The ID of the user who is the owner of this entry
	 */
	private String userId;
	/**
	 * The ID of the user who created this entry
	 */
	private String creatorId;
	/**
	 * Entry tags
	 */
	private String tags;
	/**
	 * Entry tags
	 */
	private List<MultiLingualString> multiLingual_tags;
	/**
	 * Entry admin tags can be updated only by administrators
	 */
	private String adminTags;
	/**
	 * Comma separated list of full names of categories to which this entry belongs.
	  Only categories that don't have entitlement (privacy context) are listed, to
	  retrieve the full list of categories, use the categoryEntry.list action.
	 */
	private String categories;
	/**
	 * Comma separated list of ids of categories to which this entry belongs. Only
	  categories that don't have entitlement (privacy context) are listed, to retrieve
	  the full list of categories, use the categoryEntry.list action.
	 */
	private String categoriesIds;
	private EntryStatus status;
	/**
	 * Entry moderation status
	 */
	private EntryModerationStatus moderationStatus;
	/**
	 * Number of moderation requests waiting for this entry
	 */
	private Integer moderationCount;
	/**
	 * The type of the entry, this is auto filled by the derived entry object
	 */
	private EntryType type;
	/**
	 * Entry creation date as Unix timestamp (In seconds)
	 */
	private Long createdAt;
	/**
	 * Entry update date as Unix timestamp (In seconds)
	 */
	private Long updatedAt;
	/**
	 * The calculated average rank. rank = totalRank / votes
	 */
	private Double rank;
	/**
	 * The sum of all rank values submitted to the baseEntry.anonymousRank action
	 */
	private Integer totalRank;
	/**
	 * A count of all requests made to the baseEntry.anonymousRank action
	 */
	private Integer votes;
	private Integer groupId;
	/**
	 * Can be used to store various partner related data as a string
	 */
	private String partnerData;
	/**
	 * Download URL for the entry
	 */
	private String downloadUrl;
	/**
	 * Indexed search text for full text search
	 */
	private String searchText;
	/**
	 * License type used for this entry
	 */
	private LicenseType licenseType;
	/**
	 * Version of the entry data
	 */
	private Integer version;
	/**
	 * Thumbnail URL
	 */
	private String thumbnailUrl;
	/**
	 * The Access Control ID assigned to this entry (null when not set, send -1 to
	  remove)
	 */
	private Integer accessControlId;
	/**
	 * Entry scheduling start date (null when not set, send -1 to remove)
	 */
	private Long startDate;
	/**
	 * Entry scheduling end date (null when not set, send -1 to remove)
	 */
	private Long endDate;
	/**
	 * Entry external reference id
	 */
	private String referenceId;
	/**
	 * ID of temporary entry that will replace this entry when it's approved and ready
	  for replacement
	 */
	private String replacingEntryId;
	/**
	 * ID of the entry that will be replaced when the replacement approved and this
	  entry is ready
	 */
	private String replacedEntryId;
	/**
	 * Status of the replacement readiness and approval
	 */
	private EntryReplacementStatus replacementStatus;
	/**
	 * Can be used to store various partner related data as a numeric value
	 */
	private Integer partnerSortValue;
	/**
	 * Override the default ingestion profile
	 */
	private Integer conversionProfileId;
	/**
	 * IF not empty, points to an entry ID the should replace this current entry's id.
	 */
	private String redirectEntryId;
	/**
	 * ID of source root entry, used for clipped, skipped and cropped entries that
	  created from another entry
	 */
	private String rootEntryId;
	/**
	 * ID of source root entry, used for defining entires association
	 */
	private String parentEntryId;
	/**
	 * clipping, skipping and cropping attributes that used to create this entry
	 */
	private List<OperationAttributes> operationAttributes;
	/**
	 * list of user ids that are entitled to edit the entry (no server enforcement) The
	  difference between entitledUsersEdit, entitledUsersPublish and entitledUsersView
	  is applicative only
	 */
	private String entitledUsersEdit;
	/**
	 * list of user ids that are entitled to publish the entry (no server enforcement)
	  The difference between entitledUsersEdit, entitledUsersPublish and
	  entitledUsersView is applicative only
	 */
	private String entitledUsersPublish;
	/**
	 * list of user ids that are entitled to view the entry (no server enforcement) The
	  difference between entitledUsersEdit, entitledUsersPublish and entitledUsersView
	  is applicative only
	 */
	private String entitledUsersView;
	/**
	 * Comma seperated string of the capabilities of the entry. Any capability needed
	  can be added to this list.
	 */
	private String capabilities;
	/**
	 * Template entry id
	 */
	private String templateEntryId;
	/**
	 * should we display this entry in search
	 */
	private EntryDisplayInSearchType displayInSearch;
	/**
	 * Entry application
	 */
	private EntryApplication application;
	/**
	 * Entry application version
	 */
	private String applicationVersion;
	/**
	 * Block auto transcript on Entry
	 */
	private Boolean blockAutoTranscript;
	/**
	 * Entry's default language if the entry is multi lingual
	 */
	private String defaultLanguage;
	/**
	 * The language in which the object is returned
	 */
	private String responseLanguage;

	// id:
	public String getId(){
		return this.id;
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

	// multiLingual_name:
	public List<MultiLingualString> getMultiLingual_name(){
		return this.multiLingual_name;
	}
	public void setMultiLingual_name(List<MultiLingualString> multiLingual_name){
		this.multiLingual_name = multiLingual_name;
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// multiLingual_description:
	public List<MultiLingualString> getMultiLingual_description(){
		return this.multiLingual_description;
	}
	public void setMultiLingual_description(List<MultiLingualString> multiLingual_description){
		this.multiLingual_description = multiLingual_description;
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
	}

	// creatorId:
	public String getCreatorId(){
		return this.creatorId;
	}
	public void setCreatorId(String creatorId){
		this.creatorId = creatorId;
	}

	public void creatorId(String multirequestToken){
		setToken("creatorId", multirequestToken);
	}

	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// multiLingual_tags:
	public List<MultiLingualString> getMultiLingual_tags(){
		return this.multiLingual_tags;
	}
	public void setMultiLingual_tags(List<MultiLingualString> multiLingual_tags){
		this.multiLingual_tags = multiLingual_tags;
	}

	// adminTags:
	public String getAdminTags(){
		return this.adminTags;
	}
	public void setAdminTags(String adminTags){
		this.adminTags = adminTags;
	}

	public void adminTags(String multirequestToken){
		setToken("adminTags", multirequestToken);
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

	// categoriesIds:
	public String getCategoriesIds(){
		return this.categoriesIds;
	}
	public void setCategoriesIds(String categoriesIds){
		this.categoriesIds = categoriesIds;
	}

	public void categoriesIds(String multirequestToken){
		setToken("categoriesIds", multirequestToken);
	}

	// status:
	public EntryStatus getStatus(){
		return this.status;
	}
	// moderationStatus:
	public EntryModerationStatus getModerationStatus(){
		return this.moderationStatus;
	}
	// moderationCount:
	public Integer getModerationCount(){
		return this.moderationCount;
	}
	// type:
	public EntryType getType(){
		return this.type;
	}
	public void setType(EntryType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// createdAt:
	public Long getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Long getUpdatedAt(){
		return this.updatedAt;
	}
	// rank:
	public Double getRank(){
		return this.rank;
	}
	// totalRank:
	public Integer getTotalRank(){
		return this.totalRank;
	}
	// votes:
	public Integer getVotes(){
		return this.votes;
	}
	// groupId:
	public Integer getGroupId(){
		return this.groupId;
	}
	public void setGroupId(Integer groupId){
		this.groupId = groupId;
	}

	public void groupId(String multirequestToken){
		setToken("groupId", multirequestToken);
	}

	// partnerData:
	public String getPartnerData(){
		return this.partnerData;
	}
	public void setPartnerData(String partnerData){
		this.partnerData = partnerData;
	}

	public void partnerData(String multirequestToken){
		setToken("partnerData", multirequestToken);
	}

	// downloadUrl:
	public String getDownloadUrl(){
		return this.downloadUrl;
	}
	// searchText:
	public String getSearchText(){
		return this.searchText;
	}
	// licenseType:
	public LicenseType getLicenseType(){
		return this.licenseType;
	}
	public void setLicenseType(LicenseType licenseType){
		this.licenseType = licenseType;
	}

	public void licenseType(String multirequestToken){
		setToken("licenseType", multirequestToken);
	}

	// version:
	public Integer getVersion(){
		return this.version;
	}
	// thumbnailUrl:
	public String getThumbnailUrl(){
		return this.thumbnailUrl;
	}
	// accessControlId:
	public Integer getAccessControlId(){
		return this.accessControlId;
	}
	public void setAccessControlId(Integer accessControlId){
		this.accessControlId = accessControlId;
	}

	public void accessControlId(String multirequestToken){
		setToken("accessControlId", multirequestToken);
	}

	// startDate:
	public Long getStartDate(){
		return this.startDate;
	}
	public void setStartDate(Long startDate){
		this.startDate = startDate;
	}

	public void startDate(String multirequestToken){
		setToken("startDate", multirequestToken);
	}

	// endDate:
	public Long getEndDate(){
		return this.endDate;
	}
	public void setEndDate(Long endDate){
		this.endDate = endDate;
	}

	public void endDate(String multirequestToken){
		setToken("endDate", multirequestToken);
	}

	// referenceId:
	public String getReferenceId(){
		return this.referenceId;
	}
	public void setReferenceId(String referenceId){
		this.referenceId = referenceId;
	}

	public void referenceId(String multirequestToken){
		setToken("referenceId", multirequestToken);
	}

	// replacingEntryId:
	public String getReplacingEntryId(){
		return this.replacingEntryId;
	}
	// replacedEntryId:
	public String getReplacedEntryId(){
		return this.replacedEntryId;
	}
	// replacementStatus:
	public EntryReplacementStatus getReplacementStatus(){
		return this.replacementStatus;
	}
	// partnerSortValue:
	public Integer getPartnerSortValue(){
		return this.partnerSortValue;
	}
	public void setPartnerSortValue(Integer partnerSortValue){
		this.partnerSortValue = partnerSortValue;
	}

	public void partnerSortValue(String multirequestToken){
		setToken("partnerSortValue", multirequestToken);
	}

	// conversionProfileId:
	public Integer getConversionProfileId(){
		return this.conversionProfileId;
	}
	public void setConversionProfileId(Integer conversionProfileId){
		this.conversionProfileId = conversionProfileId;
	}

	public void conversionProfileId(String multirequestToken){
		setToken("conversionProfileId", multirequestToken);
	}

	// redirectEntryId:
	public String getRedirectEntryId(){
		return this.redirectEntryId;
	}
	public void setRedirectEntryId(String redirectEntryId){
		this.redirectEntryId = redirectEntryId;
	}

	public void redirectEntryId(String multirequestToken){
		setToken("redirectEntryId", multirequestToken);
	}

	// rootEntryId:
	public String getRootEntryId(){
		return this.rootEntryId;
	}
	// parentEntryId:
	public String getParentEntryId(){
		return this.parentEntryId;
	}
	public void setParentEntryId(String parentEntryId){
		this.parentEntryId = parentEntryId;
	}

	public void parentEntryId(String multirequestToken){
		setToken("parentEntryId", multirequestToken);
	}

	// operationAttributes:
	public List<OperationAttributes> getOperationAttributes(){
		return this.operationAttributes;
	}
	public void setOperationAttributes(List<OperationAttributes> operationAttributes){
		this.operationAttributes = operationAttributes;
	}

	// entitledUsersEdit:
	public String getEntitledUsersEdit(){
		return this.entitledUsersEdit;
	}
	public void setEntitledUsersEdit(String entitledUsersEdit){
		this.entitledUsersEdit = entitledUsersEdit;
	}

	public void entitledUsersEdit(String multirequestToken){
		setToken("entitledUsersEdit", multirequestToken);
	}

	// entitledUsersPublish:
	public String getEntitledUsersPublish(){
		return this.entitledUsersPublish;
	}
	public void setEntitledUsersPublish(String entitledUsersPublish){
		this.entitledUsersPublish = entitledUsersPublish;
	}

	public void entitledUsersPublish(String multirequestToken){
		setToken("entitledUsersPublish", multirequestToken);
	}

	// entitledUsersView:
	public String getEntitledUsersView(){
		return this.entitledUsersView;
	}
	public void setEntitledUsersView(String entitledUsersView){
		this.entitledUsersView = entitledUsersView;
	}

	public void entitledUsersView(String multirequestToken){
		setToken("entitledUsersView", multirequestToken);
	}

	// capabilities:
	public String getCapabilities(){
		return this.capabilities;
	}
	// templateEntryId:
	public String getTemplateEntryId(){
		return this.templateEntryId;
	}
	public void setTemplateEntryId(String templateEntryId){
		this.templateEntryId = templateEntryId;
	}

	public void templateEntryId(String multirequestToken){
		setToken("templateEntryId", multirequestToken);
	}

	// displayInSearch:
	public EntryDisplayInSearchType getDisplayInSearch(){
		return this.displayInSearch;
	}
	public void setDisplayInSearch(EntryDisplayInSearchType displayInSearch){
		this.displayInSearch = displayInSearch;
	}

	public void displayInSearch(String multirequestToken){
		setToken("displayInSearch", multirequestToken);
	}

	// application:
	public EntryApplication getApplication(){
		return this.application;
	}
	public void setApplication(EntryApplication application){
		this.application = application;
	}

	public void application(String multirequestToken){
		setToken("application", multirequestToken);
	}

	// applicationVersion:
	public String getApplicationVersion(){
		return this.applicationVersion;
	}
	public void setApplicationVersion(String applicationVersion){
		this.applicationVersion = applicationVersion;
	}

	public void applicationVersion(String multirequestToken){
		setToken("applicationVersion", multirequestToken);
	}

	// blockAutoTranscript:
	public Boolean getBlockAutoTranscript(){
		return this.blockAutoTranscript;
	}
	public void setBlockAutoTranscript(Boolean blockAutoTranscript){
		this.blockAutoTranscript = blockAutoTranscript;
	}

	public void blockAutoTranscript(String multirequestToken){
		setToken("blockAutoTranscript", multirequestToken);
	}

	// defaultLanguage:
	public String getDefaultLanguage(){
		return this.defaultLanguage;
	}
	// responseLanguage:
	public String getResponseLanguage(){
		return this.responseLanguage;
	}

	public BaseEntry() {
		super();
	}

	public BaseEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		name = jsonObject.has("name") && jsonObject.get("name").isJsonArray() ? 
			GsonParser.parseString(jsonObject.getAsJsonArray("name").get(0).getAsJsonObject().get("value")) : 
			GsonParser.parseString(jsonObject.get("name"));
		multiLingual_name = jsonObject.has("name") && jsonObject.get("name").isJsonArray() ? 
			GsonParser.parseArray(jsonObject.getAsJsonArray("name"), MultiLingualString.class) : 
			new ArrayList<MultiLingualString>();
		description = jsonObject.has("description") && jsonObject.get("description").isJsonArray() ? 
			GsonParser.parseString(jsonObject.getAsJsonArray("description").get(0).getAsJsonObject().get("value")) : 
			GsonParser.parseString(jsonObject.get("description"));
		multiLingual_description = jsonObject.has("description") && jsonObject.get("description").isJsonArray() ? 
			GsonParser.parseArray(jsonObject.getAsJsonArray("description"), MultiLingualString.class) : 
			new ArrayList<MultiLingualString>();
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		creatorId = GsonParser.parseString(jsonObject.get("creatorId"));
		tags = jsonObject.has("tags") && jsonObject.get("tags").isJsonArray() ? 
			GsonParser.parseString(jsonObject.getAsJsonArray("tags").get(0).getAsJsonObject().get("value")) : 
			GsonParser.parseString(jsonObject.get("tags"));
		multiLingual_tags = jsonObject.has("tags") && jsonObject.get("tags").isJsonArray() ? 
			GsonParser.parseArray(jsonObject.getAsJsonArray("tags"), MultiLingualString.class) : 
			new ArrayList<MultiLingualString>();
		adminTags = GsonParser.parseString(jsonObject.get("adminTags"));
		categories = GsonParser.parseString(jsonObject.get("categories"));
		categoriesIds = GsonParser.parseString(jsonObject.get("categoriesIds"));
		status = EntryStatus.get(GsonParser.parseString(jsonObject.get("status")));
		moderationStatus = EntryModerationStatus.get(GsonParser.parseInt(jsonObject.get("moderationStatus")));
		moderationCount = GsonParser.parseInt(jsonObject.get("moderationCount"));
		type = EntryType.get(GsonParser.parseString(jsonObject.get("type")));
		createdAt = GsonParser.parseLong(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseLong(jsonObject.get("updatedAt"));
		rank = GsonParser.parseDouble(jsonObject.get("rank"));
		totalRank = GsonParser.parseInt(jsonObject.get("totalRank"));
		votes = GsonParser.parseInt(jsonObject.get("votes"));
		groupId = GsonParser.parseInt(jsonObject.get("groupId"));
		partnerData = GsonParser.parseString(jsonObject.get("partnerData"));
		downloadUrl = GsonParser.parseString(jsonObject.get("downloadUrl"));
		searchText = GsonParser.parseString(jsonObject.get("searchText"));
		licenseType = LicenseType.get(GsonParser.parseInt(jsonObject.get("licenseType")));
		version = GsonParser.parseInt(jsonObject.get("version"));
		thumbnailUrl = GsonParser.parseString(jsonObject.get("thumbnailUrl"));
		accessControlId = GsonParser.parseInt(jsonObject.get("accessControlId"));
		startDate = GsonParser.parseLong(jsonObject.get("startDate"));
		endDate = GsonParser.parseLong(jsonObject.get("endDate"));
		referenceId = GsonParser.parseString(jsonObject.get("referenceId"));
		replacingEntryId = GsonParser.parseString(jsonObject.get("replacingEntryId"));
		replacedEntryId = GsonParser.parseString(jsonObject.get("replacedEntryId"));
		replacementStatus = EntryReplacementStatus.get(GsonParser.parseString(jsonObject.get("replacementStatus")));
		partnerSortValue = GsonParser.parseInt(jsonObject.get("partnerSortValue"));
		conversionProfileId = GsonParser.parseInt(jsonObject.get("conversionProfileId"));
		redirectEntryId = GsonParser.parseString(jsonObject.get("redirectEntryId"));
		rootEntryId = GsonParser.parseString(jsonObject.get("rootEntryId"));
		parentEntryId = GsonParser.parseString(jsonObject.get("parentEntryId"));
		operationAttributes = GsonParser.parseArray(jsonObject.getAsJsonArray("operationAttributes"), OperationAttributes.class);
		entitledUsersEdit = GsonParser.parseString(jsonObject.get("entitledUsersEdit"));
		entitledUsersPublish = GsonParser.parseString(jsonObject.get("entitledUsersPublish"));
		entitledUsersView = GsonParser.parseString(jsonObject.get("entitledUsersView"));
		capabilities = GsonParser.parseString(jsonObject.get("capabilities"));
		templateEntryId = GsonParser.parseString(jsonObject.get("templateEntryId"));
		displayInSearch = EntryDisplayInSearchType.get(GsonParser.parseInt(jsonObject.get("displayInSearch")));
		application = EntryApplication.get(GsonParser.parseString(jsonObject.get("application")));
		applicationVersion = GsonParser.parseString(jsonObject.get("applicationVersion"));
		blockAutoTranscript = GsonParser.parseBoolean(jsonObject.get("blockAutoTranscript"));
		defaultLanguage = GsonParser.parseString(jsonObject.get("defaultLanguage"));
		responseLanguage = GsonParser.parseString(jsonObject.get("responseLanguage"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBaseEntry");
		kparams.add("name", this.name);
		kparams.add("multiLingual_name", this.multiLingual_name);
		kparams.add("description", this.description);
		kparams.add("multiLingual_description", this.multiLingual_description);
		kparams.add("userId", this.userId);
		kparams.add("creatorId", this.creatorId);
		kparams.add("tags", this.tags);
		kparams.add("multiLingual_tags", this.multiLingual_tags);
		kparams.add("adminTags", this.adminTags);
		kparams.add("categories", this.categories);
		kparams.add("categoriesIds", this.categoriesIds);
		kparams.add("type", this.type);
		kparams.add("groupId", this.groupId);
		kparams.add("partnerData", this.partnerData);
		kparams.add("licenseType", this.licenseType);
		kparams.add("accessControlId", this.accessControlId);
		kparams.add("startDate", this.startDate);
		kparams.add("endDate", this.endDate);
		kparams.add("referenceId", this.referenceId);
		kparams.add("partnerSortValue", this.partnerSortValue);
		kparams.add("conversionProfileId", this.conversionProfileId);
		kparams.add("redirectEntryId", this.redirectEntryId);
		kparams.add("parentEntryId", this.parentEntryId);
		kparams.add("operationAttributes", this.operationAttributes);
		kparams.add("entitledUsersEdit", this.entitledUsersEdit);
		kparams.add("entitledUsersPublish", this.entitledUsersPublish);
		kparams.add("entitledUsersView", this.entitledUsersView);
		kparams.add("templateEntryId", this.templateEntryId);
		kparams.add("displayInSearch", this.displayInSearch);
		kparams.add("application", this.application);
		kparams.add("applicationVersion", this.applicationVersion);
		kparams.add("blockAutoTranscript", this.blockAutoTranscript);
		return kparams;
	}

}

