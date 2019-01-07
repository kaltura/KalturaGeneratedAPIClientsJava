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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.enums.YouTubeDistributionFeedSpecVersion;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(YouTubeDistributionProfile.Tokenizer.class)
public class YouTubeDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String feedSpecVersion();
		String username();
		String notificationEmail();
		String sftpHost();
		String sftpPort();
		String sftpLogin();
		String sftpPublicKey();
		String sftpPrivateKey();
		String sftpBaseDir();
		String ownerName();
		String defaultCategory();
		String allowComments();
		String allowEmbedding();
		String allowRatings();
		String allowResponses();
		String commercialPolicy();
		String ugcPolicy();
		String target();
		String adServerPartnerId();
		String enableAdServer();
		String allowPreRollAds();
		String allowPostRollAds();
		String strict();
		String overrideManualEdits();
		String urgentReference();
		String allowSyndication();
		String hideViewCount();
		String allowAdsenseForVideo();
		String allowInvideo();
		String allowMidRollAds();
		String instreamStandard();
		String instreamTrueview();
		String claimType();
		String blockOutsideOwnership();
		String captionAutosync();
		String deleteReference();
		String releaseClaims();
		String apiAuthorizeUrl();
		String privacyStatus();
		String enableContentId();
		String thirdPartyAds();
		String productListingAds();
		String domainWhitelist();
		String notifySubscribers();
	}

	private YouTubeDistributionFeedSpecVersion feedSpecVersion;
	private String username;
	private String notificationEmail;
	private String sftpHost;
	private Integer sftpPort;
	private String sftpLogin;
	private String sftpPublicKey;
	private String sftpPrivateKey;
	private String sftpBaseDir;
	private String ownerName;
	private String defaultCategory;
	private String allowComments;
	private String allowEmbedding;
	private String allowRatings;
	private String allowResponses;
	private String commercialPolicy;
	private String ugcPolicy;
	private String target;
	private String adServerPartnerId;
	private Boolean enableAdServer;
	private Boolean allowPreRollAds;
	private Boolean allowPostRollAds;
	private String strict;
	private String overrideManualEdits;
	private String urgentReference;
	private String allowSyndication;
	private String hideViewCount;
	private String allowAdsenseForVideo;
	private String allowInvideo;
	private Boolean allowMidRollAds;
	private String instreamStandard;
	private String instreamTrueview;
	private String claimType;
	private String blockOutsideOwnership;
	private String captionAutosync;
	private Boolean deleteReference;
	private Boolean releaseClaims;
	private String apiAuthorizeUrl;
	private String privacyStatus;
	private String enableContentId;
	private String thirdPartyAds;
	private String productListingAds;
	private String domainWhitelist;
	private String notifySubscribers;

	// feedSpecVersion:
	public YouTubeDistributionFeedSpecVersion getFeedSpecVersion(){
		return this.feedSpecVersion;
	}
	public void setFeedSpecVersion(YouTubeDistributionFeedSpecVersion feedSpecVersion){
		this.feedSpecVersion = feedSpecVersion;
	}

	public void feedSpecVersion(String multirequestToken){
		setToken("feedSpecVersion", multirequestToken);
	}

	// username:
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username;
	}

	public void username(String multirequestToken){
		setToken("username", multirequestToken);
	}

	// notificationEmail:
	public String getNotificationEmail(){
		return this.notificationEmail;
	}
	public void setNotificationEmail(String notificationEmail){
		this.notificationEmail = notificationEmail;
	}

	public void notificationEmail(String multirequestToken){
		setToken("notificationEmail", multirequestToken);
	}

	// sftpHost:
	public String getSftpHost(){
		return this.sftpHost;
	}
	public void setSftpHost(String sftpHost){
		this.sftpHost = sftpHost;
	}

	public void sftpHost(String multirequestToken){
		setToken("sftpHost", multirequestToken);
	}

	// sftpPort:
	public Integer getSftpPort(){
		return this.sftpPort;
	}
	public void setSftpPort(Integer sftpPort){
		this.sftpPort = sftpPort;
	}

	public void sftpPort(String multirequestToken){
		setToken("sftpPort", multirequestToken);
	}

	// sftpLogin:
	public String getSftpLogin(){
		return this.sftpLogin;
	}
	public void setSftpLogin(String sftpLogin){
		this.sftpLogin = sftpLogin;
	}

	public void sftpLogin(String multirequestToken){
		setToken("sftpLogin", multirequestToken);
	}

	// sftpPublicKey:
	public String getSftpPublicKey(){
		return this.sftpPublicKey;
	}
	public void setSftpPublicKey(String sftpPublicKey){
		this.sftpPublicKey = sftpPublicKey;
	}

	public void sftpPublicKey(String multirequestToken){
		setToken("sftpPublicKey", multirequestToken);
	}

	// sftpPrivateKey:
	public String getSftpPrivateKey(){
		return this.sftpPrivateKey;
	}
	public void setSftpPrivateKey(String sftpPrivateKey){
		this.sftpPrivateKey = sftpPrivateKey;
	}

	public void sftpPrivateKey(String multirequestToken){
		setToken("sftpPrivateKey", multirequestToken);
	}

	// sftpBaseDir:
	public String getSftpBaseDir(){
		return this.sftpBaseDir;
	}
	public void setSftpBaseDir(String sftpBaseDir){
		this.sftpBaseDir = sftpBaseDir;
	}

	public void sftpBaseDir(String multirequestToken){
		setToken("sftpBaseDir", multirequestToken);
	}

	// ownerName:
	public String getOwnerName(){
		return this.ownerName;
	}
	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}

	public void ownerName(String multirequestToken){
		setToken("ownerName", multirequestToken);
	}

	// defaultCategory:
	public String getDefaultCategory(){
		return this.defaultCategory;
	}
	public void setDefaultCategory(String defaultCategory){
		this.defaultCategory = defaultCategory;
	}

	public void defaultCategory(String multirequestToken){
		setToken("defaultCategory", multirequestToken);
	}

	// allowComments:
	public String getAllowComments(){
		return this.allowComments;
	}
	public void setAllowComments(String allowComments){
		this.allowComments = allowComments;
	}

	public void allowComments(String multirequestToken){
		setToken("allowComments", multirequestToken);
	}

	// allowEmbedding:
	public String getAllowEmbedding(){
		return this.allowEmbedding;
	}
	public void setAllowEmbedding(String allowEmbedding){
		this.allowEmbedding = allowEmbedding;
	}

	public void allowEmbedding(String multirequestToken){
		setToken("allowEmbedding", multirequestToken);
	}

	// allowRatings:
	public String getAllowRatings(){
		return this.allowRatings;
	}
	public void setAllowRatings(String allowRatings){
		this.allowRatings = allowRatings;
	}

	public void allowRatings(String multirequestToken){
		setToken("allowRatings", multirequestToken);
	}

	// allowResponses:
	public String getAllowResponses(){
		return this.allowResponses;
	}
	public void setAllowResponses(String allowResponses){
		this.allowResponses = allowResponses;
	}

	public void allowResponses(String multirequestToken){
		setToken("allowResponses", multirequestToken);
	}

	// commercialPolicy:
	public String getCommercialPolicy(){
		return this.commercialPolicy;
	}
	public void setCommercialPolicy(String commercialPolicy){
		this.commercialPolicy = commercialPolicy;
	}

	public void commercialPolicy(String multirequestToken){
		setToken("commercialPolicy", multirequestToken);
	}

	// ugcPolicy:
	public String getUgcPolicy(){
		return this.ugcPolicy;
	}
	public void setUgcPolicy(String ugcPolicy){
		this.ugcPolicy = ugcPolicy;
	}

	public void ugcPolicy(String multirequestToken){
		setToken("ugcPolicy", multirequestToken);
	}

	// target:
	public String getTarget(){
		return this.target;
	}
	public void setTarget(String target){
		this.target = target;
	}

	public void target(String multirequestToken){
		setToken("target", multirequestToken);
	}

	// adServerPartnerId:
	public String getAdServerPartnerId(){
		return this.adServerPartnerId;
	}
	public void setAdServerPartnerId(String adServerPartnerId){
		this.adServerPartnerId = adServerPartnerId;
	}

	public void adServerPartnerId(String multirequestToken){
		setToken("adServerPartnerId", multirequestToken);
	}

	// enableAdServer:
	public Boolean getEnableAdServer(){
		return this.enableAdServer;
	}
	public void setEnableAdServer(Boolean enableAdServer){
		this.enableAdServer = enableAdServer;
	}

	public void enableAdServer(String multirequestToken){
		setToken("enableAdServer", multirequestToken);
	}

	// allowPreRollAds:
	public Boolean getAllowPreRollAds(){
		return this.allowPreRollAds;
	}
	public void setAllowPreRollAds(Boolean allowPreRollAds){
		this.allowPreRollAds = allowPreRollAds;
	}

	public void allowPreRollAds(String multirequestToken){
		setToken("allowPreRollAds", multirequestToken);
	}

	// allowPostRollAds:
	public Boolean getAllowPostRollAds(){
		return this.allowPostRollAds;
	}
	public void setAllowPostRollAds(Boolean allowPostRollAds){
		this.allowPostRollAds = allowPostRollAds;
	}

	public void allowPostRollAds(String multirequestToken){
		setToken("allowPostRollAds", multirequestToken);
	}

	// strict:
	public String getStrict(){
		return this.strict;
	}
	public void setStrict(String strict){
		this.strict = strict;
	}

	public void strict(String multirequestToken){
		setToken("strict", multirequestToken);
	}

	// overrideManualEdits:
	public String getOverrideManualEdits(){
		return this.overrideManualEdits;
	}
	public void setOverrideManualEdits(String overrideManualEdits){
		this.overrideManualEdits = overrideManualEdits;
	}

	public void overrideManualEdits(String multirequestToken){
		setToken("overrideManualEdits", multirequestToken);
	}

	// urgentReference:
	public String getUrgentReference(){
		return this.urgentReference;
	}
	public void setUrgentReference(String urgentReference){
		this.urgentReference = urgentReference;
	}

	public void urgentReference(String multirequestToken){
		setToken("urgentReference", multirequestToken);
	}

	// allowSyndication:
	public String getAllowSyndication(){
		return this.allowSyndication;
	}
	public void setAllowSyndication(String allowSyndication){
		this.allowSyndication = allowSyndication;
	}

	public void allowSyndication(String multirequestToken){
		setToken("allowSyndication", multirequestToken);
	}

	// hideViewCount:
	public String getHideViewCount(){
		return this.hideViewCount;
	}
	public void setHideViewCount(String hideViewCount){
		this.hideViewCount = hideViewCount;
	}

	public void hideViewCount(String multirequestToken){
		setToken("hideViewCount", multirequestToken);
	}

	// allowAdsenseForVideo:
	public String getAllowAdsenseForVideo(){
		return this.allowAdsenseForVideo;
	}
	public void setAllowAdsenseForVideo(String allowAdsenseForVideo){
		this.allowAdsenseForVideo = allowAdsenseForVideo;
	}

	public void allowAdsenseForVideo(String multirequestToken){
		setToken("allowAdsenseForVideo", multirequestToken);
	}

	// allowInvideo:
	public String getAllowInvideo(){
		return this.allowInvideo;
	}
	public void setAllowInvideo(String allowInvideo){
		this.allowInvideo = allowInvideo;
	}

	public void allowInvideo(String multirequestToken){
		setToken("allowInvideo", multirequestToken);
	}

	// allowMidRollAds:
	public Boolean getAllowMidRollAds(){
		return this.allowMidRollAds;
	}
	public void setAllowMidRollAds(Boolean allowMidRollAds){
		this.allowMidRollAds = allowMidRollAds;
	}

	public void allowMidRollAds(String multirequestToken){
		setToken("allowMidRollAds", multirequestToken);
	}

	// instreamStandard:
	public String getInstreamStandard(){
		return this.instreamStandard;
	}
	public void setInstreamStandard(String instreamStandard){
		this.instreamStandard = instreamStandard;
	}

	public void instreamStandard(String multirequestToken){
		setToken("instreamStandard", multirequestToken);
	}

	// instreamTrueview:
	public String getInstreamTrueview(){
		return this.instreamTrueview;
	}
	public void setInstreamTrueview(String instreamTrueview){
		this.instreamTrueview = instreamTrueview;
	}

	public void instreamTrueview(String multirequestToken){
		setToken("instreamTrueview", multirequestToken);
	}

	// claimType:
	public String getClaimType(){
		return this.claimType;
	}
	public void setClaimType(String claimType){
		this.claimType = claimType;
	}

	public void claimType(String multirequestToken){
		setToken("claimType", multirequestToken);
	}

	// blockOutsideOwnership:
	public String getBlockOutsideOwnership(){
		return this.blockOutsideOwnership;
	}
	public void setBlockOutsideOwnership(String blockOutsideOwnership){
		this.blockOutsideOwnership = blockOutsideOwnership;
	}

	public void blockOutsideOwnership(String multirequestToken){
		setToken("blockOutsideOwnership", multirequestToken);
	}

	// captionAutosync:
	public String getCaptionAutosync(){
		return this.captionAutosync;
	}
	public void setCaptionAutosync(String captionAutosync){
		this.captionAutosync = captionAutosync;
	}

	public void captionAutosync(String multirequestToken){
		setToken("captionAutosync", multirequestToken);
	}

	// deleteReference:
	public Boolean getDeleteReference(){
		return this.deleteReference;
	}
	public void setDeleteReference(Boolean deleteReference){
		this.deleteReference = deleteReference;
	}

	public void deleteReference(String multirequestToken){
		setToken("deleteReference", multirequestToken);
	}

	// releaseClaims:
	public Boolean getReleaseClaims(){
		return this.releaseClaims;
	}
	public void setReleaseClaims(Boolean releaseClaims){
		this.releaseClaims = releaseClaims;
	}

	public void releaseClaims(String multirequestToken){
		setToken("releaseClaims", multirequestToken);
	}

	// apiAuthorizeUrl:
	public String getApiAuthorizeUrl(){
		return this.apiAuthorizeUrl;
	}
	public void setApiAuthorizeUrl(String apiAuthorizeUrl){
		this.apiAuthorizeUrl = apiAuthorizeUrl;
	}

	public void apiAuthorizeUrl(String multirequestToken){
		setToken("apiAuthorizeUrl", multirequestToken);
	}

	// privacyStatus:
	public String getPrivacyStatus(){
		return this.privacyStatus;
	}
	public void setPrivacyStatus(String privacyStatus){
		this.privacyStatus = privacyStatus;
	}

	public void privacyStatus(String multirequestToken){
		setToken("privacyStatus", multirequestToken);
	}

	// enableContentId:
	public String getEnableContentId(){
		return this.enableContentId;
	}
	public void setEnableContentId(String enableContentId){
		this.enableContentId = enableContentId;
	}

	public void enableContentId(String multirequestToken){
		setToken("enableContentId", multirequestToken);
	}

	// thirdPartyAds:
	public String getThirdPartyAds(){
		return this.thirdPartyAds;
	}
	public void setThirdPartyAds(String thirdPartyAds){
		this.thirdPartyAds = thirdPartyAds;
	}

	public void thirdPartyAds(String multirequestToken){
		setToken("thirdPartyAds", multirequestToken);
	}

	// productListingAds:
	public String getProductListingAds(){
		return this.productListingAds;
	}
	public void setProductListingAds(String productListingAds){
		this.productListingAds = productListingAds;
	}

	public void productListingAds(String multirequestToken){
		setToken("productListingAds", multirequestToken);
	}

	// domainWhitelist:
	public String getDomainWhitelist(){
		return this.domainWhitelist;
	}
	public void setDomainWhitelist(String domainWhitelist){
		this.domainWhitelist = domainWhitelist;
	}

	public void domainWhitelist(String multirequestToken){
		setToken("domainWhitelist", multirequestToken);
	}

	// notifySubscribers:
	public String getNotifySubscribers(){
		return this.notifySubscribers;
	}
	public void setNotifySubscribers(String notifySubscribers){
		this.notifySubscribers = notifySubscribers;
	}

	public void notifySubscribers(String multirequestToken){
		setToken("notifySubscribers", multirequestToken);
	}


	public YouTubeDistributionProfile() {
		super();
	}

	public YouTubeDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		feedSpecVersion = YouTubeDistributionFeedSpecVersion.get(GsonParser.parseString(jsonObject.get("feedSpecVersion")));
		username = GsonParser.parseString(jsonObject.get("username"));
		notificationEmail = GsonParser.parseString(jsonObject.get("notificationEmail"));
		sftpHost = GsonParser.parseString(jsonObject.get("sftpHost"));
		sftpPort = GsonParser.parseInt(jsonObject.get("sftpPort"));
		sftpLogin = GsonParser.parseString(jsonObject.get("sftpLogin"));
		sftpPublicKey = GsonParser.parseString(jsonObject.get("sftpPublicKey"));
		sftpPrivateKey = GsonParser.parseString(jsonObject.get("sftpPrivateKey"));
		sftpBaseDir = GsonParser.parseString(jsonObject.get("sftpBaseDir"));
		ownerName = GsonParser.parseString(jsonObject.get("ownerName"));
		defaultCategory = GsonParser.parseString(jsonObject.get("defaultCategory"));
		allowComments = GsonParser.parseString(jsonObject.get("allowComments"));
		allowEmbedding = GsonParser.parseString(jsonObject.get("allowEmbedding"));
		allowRatings = GsonParser.parseString(jsonObject.get("allowRatings"));
		allowResponses = GsonParser.parseString(jsonObject.get("allowResponses"));
		commercialPolicy = GsonParser.parseString(jsonObject.get("commercialPolicy"));
		ugcPolicy = GsonParser.parseString(jsonObject.get("ugcPolicy"));
		target = GsonParser.parseString(jsonObject.get("target"));
		adServerPartnerId = GsonParser.parseString(jsonObject.get("adServerPartnerId"));
		enableAdServer = GsonParser.parseBoolean(jsonObject.get("enableAdServer"));
		allowPreRollAds = GsonParser.parseBoolean(jsonObject.get("allowPreRollAds"));
		allowPostRollAds = GsonParser.parseBoolean(jsonObject.get("allowPostRollAds"));
		strict = GsonParser.parseString(jsonObject.get("strict"));
		overrideManualEdits = GsonParser.parseString(jsonObject.get("overrideManualEdits"));
		urgentReference = GsonParser.parseString(jsonObject.get("urgentReference"));
		allowSyndication = GsonParser.parseString(jsonObject.get("allowSyndication"));
		hideViewCount = GsonParser.parseString(jsonObject.get("hideViewCount"));
		allowAdsenseForVideo = GsonParser.parseString(jsonObject.get("allowAdsenseForVideo"));
		allowInvideo = GsonParser.parseString(jsonObject.get("allowInvideo"));
		allowMidRollAds = GsonParser.parseBoolean(jsonObject.get("allowMidRollAds"));
		instreamStandard = GsonParser.parseString(jsonObject.get("instreamStandard"));
		instreamTrueview = GsonParser.parseString(jsonObject.get("instreamTrueview"));
		claimType = GsonParser.parseString(jsonObject.get("claimType"));
		blockOutsideOwnership = GsonParser.parseString(jsonObject.get("blockOutsideOwnership"));
		captionAutosync = GsonParser.parseString(jsonObject.get("captionAutosync"));
		deleteReference = GsonParser.parseBoolean(jsonObject.get("deleteReference"));
		releaseClaims = GsonParser.parseBoolean(jsonObject.get("releaseClaims"));
		apiAuthorizeUrl = GsonParser.parseString(jsonObject.get("apiAuthorizeUrl"));
		privacyStatus = GsonParser.parseString(jsonObject.get("privacyStatus"));
		enableContentId = GsonParser.parseString(jsonObject.get("enableContentId"));
		thirdPartyAds = GsonParser.parseString(jsonObject.get("thirdPartyAds"));
		productListingAds = GsonParser.parseString(jsonObject.get("productListingAds"));
		domainWhitelist = GsonParser.parseString(jsonObject.get("domainWhitelist"));
		notifySubscribers = GsonParser.parseString(jsonObject.get("notifySubscribers"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaYouTubeDistributionProfile");
		kparams.add("feedSpecVersion", this.feedSpecVersion);
		kparams.add("username", this.username);
		kparams.add("notificationEmail", this.notificationEmail);
		kparams.add("sftpHost", this.sftpHost);
		kparams.add("sftpPort", this.sftpPort);
		kparams.add("sftpLogin", this.sftpLogin);
		kparams.add("sftpPublicKey", this.sftpPublicKey);
		kparams.add("sftpPrivateKey", this.sftpPrivateKey);
		kparams.add("sftpBaseDir", this.sftpBaseDir);
		kparams.add("ownerName", this.ownerName);
		kparams.add("defaultCategory", this.defaultCategory);
		kparams.add("allowComments", this.allowComments);
		kparams.add("allowEmbedding", this.allowEmbedding);
		kparams.add("allowRatings", this.allowRatings);
		kparams.add("allowResponses", this.allowResponses);
		kparams.add("commercialPolicy", this.commercialPolicy);
		kparams.add("ugcPolicy", this.ugcPolicy);
		kparams.add("target", this.target);
		kparams.add("adServerPartnerId", this.adServerPartnerId);
		kparams.add("enableAdServer", this.enableAdServer);
		kparams.add("allowPreRollAds", this.allowPreRollAds);
		kparams.add("allowPostRollAds", this.allowPostRollAds);
		kparams.add("strict", this.strict);
		kparams.add("overrideManualEdits", this.overrideManualEdits);
		kparams.add("urgentReference", this.urgentReference);
		kparams.add("allowSyndication", this.allowSyndication);
		kparams.add("hideViewCount", this.hideViewCount);
		kparams.add("allowAdsenseForVideo", this.allowAdsenseForVideo);
		kparams.add("allowInvideo", this.allowInvideo);
		kparams.add("allowMidRollAds", this.allowMidRollAds);
		kparams.add("instreamStandard", this.instreamStandard);
		kparams.add("instreamTrueview", this.instreamTrueview);
		kparams.add("claimType", this.claimType);
		kparams.add("blockOutsideOwnership", this.blockOutsideOwnership);
		kparams.add("captionAutosync", this.captionAutosync);
		kparams.add("deleteReference", this.deleteReference);
		kparams.add("releaseClaims", this.releaseClaims);
		kparams.add("apiAuthorizeUrl", this.apiAuthorizeUrl);
		kparams.add("privacyStatus", this.privacyStatus);
		kparams.add("enableContentId", this.enableContentId);
		kparams.add("thirdPartyAds", this.thirdPartyAds);
		kparams.add("productListingAds", this.productListingAds);
		kparams.add("domainWhitelist", this.domainWhitelist);
		kparams.add("notifySubscribers", this.notifySubscribers);
		return kparams;
	}

}

