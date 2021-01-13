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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.enums.ReachProfileContentDeletionPolicy;
import com.kaltura.client.enums.ReachProfileStatus;
import com.kaltura.client.enums.ReachProfileType;
import com.kaltura.client.enums.VendorCatalogItemOutputFormat;
import com.kaltura.client.enums.VendorTaskProcessingRegion;
import com.kaltura.client.types.BaseVendorCredit;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ReachProfile.Tokenizer.class)
public class ReachProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String name();
		String partnerId();
		String createdAt();
		String updatedAt();
		String status();
		String profileType();
		String defaultOutputFormat();
		String enableMachineModeration();
		String enableHumanModeration();
		String autoDisplayMachineCaptionsOnPlayer();
		String autoDisplayHumanCaptionsOnPlayer();
		String enableMetadataExtraction();
		String enableSpeakerChangeIndication();
		String enableAudioTags();
		String enableProfanityRemoval();
		String maxCharactersPerCaptionLine();
		String labelAdditionForMachineServiceType();
		String labelAdditionForHumanServiceType();
		String contentDeletionPolicy();
		RequestBuilder.ListTokenizer<Rule.Tokenizer> rules();
		BaseVendorCredit.Tokenizer credit();
		String usedCredit();
		RequestBuilder.ListTokenizer<Dictionary.Tokenizer> dictionaries();
		String flavorParamsIds();
		String vendorTaskProcessingRegion();
	}

	private Integer id;
	/**
	 * The name of the profile
	 */
	private String name;
	private Integer partnerId;
	private Integer createdAt;
	private Integer updatedAt;
	private ReachProfileStatus status;
	private ReachProfileType profileType;
	private VendorCatalogItemOutputFormat defaultOutputFormat;
	private Boolean enableMachineModeration;
	private Boolean enableHumanModeration;
	private Boolean autoDisplayMachineCaptionsOnPlayer;
	private Boolean autoDisplayHumanCaptionsOnPlayer;
	private Boolean enableMetadataExtraction;
	private Boolean enableSpeakerChangeIndication;
	private Boolean enableAudioTags;
	private Boolean enableProfanityRemoval;
	private Integer maxCharactersPerCaptionLine;
	private String labelAdditionForMachineServiceType;
	private String labelAdditionForHumanServiceType;
	private ReachProfileContentDeletionPolicy contentDeletionPolicy;
	private List<Rule> rules;
	private BaseVendorCredit credit;
	private Double usedCredit;
	private List<Dictionary> dictionaries;
	/**
	 * Comma separated flavorParamsIds that the vendor should look for it matching
	  asset when trying to download the asset
	 */
	private String flavorParamsIds;
	/**
	 * Indicates in which region the task processing should task place
	 */
	private VendorTaskProcessingRegion vendorTaskProcessingRegion;

	// id:
	public Integer getId(){
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

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// status:
	public ReachProfileStatus getStatus(){
		return this.status;
	}
	// profileType:
	public ReachProfileType getProfileType(){
		return this.profileType;
	}
	public void setProfileType(ReachProfileType profileType){
		this.profileType = profileType;
	}

	public void profileType(String multirequestToken){
		setToken("profileType", multirequestToken);
	}

	// defaultOutputFormat:
	public VendorCatalogItemOutputFormat getDefaultOutputFormat(){
		return this.defaultOutputFormat;
	}
	public void setDefaultOutputFormat(VendorCatalogItemOutputFormat defaultOutputFormat){
		this.defaultOutputFormat = defaultOutputFormat;
	}

	public void defaultOutputFormat(String multirequestToken){
		setToken("defaultOutputFormat", multirequestToken);
	}

	// enableMachineModeration:
	public Boolean getEnableMachineModeration(){
		return this.enableMachineModeration;
	}
	public void setEnableMachineModeration(Boolean enableMachineModeration){
		this.enableMachineModeration = enableMachineModeration;
	}

	public void enableMachineModeration(String multirequestToken){
		setToken("enableMachineModeration", multirequestToken);
	}

	// enableHumanModeration:
	public Boolean getEnableHumanModeration(){
		return this.enableHumanModeration;
	}
	public void setEnableHumanModeration(Boolean enableHumanModeration){
		this.enableHumanModeration = enableHumanModeration;
	}

	public void enableHumanModeration(String multirequestToken){
		setToken("enableHumanModeration", multirequestToken);
	}

	// autoDisplayMachineCaptionsOnPlayer:
	public Boolean getAutoDisplayMachineCaptionsOnPlayer(){
		return this.autoDisplayMachineCaptionsOnPlayer;
	}
	public void setAutoDisplayMachineCaptionsOnPlayer(Boolean autoDisplayMachineCaptionsOnPlayer){
		this.autoDisplayMachineCaptionsOnPlayer = autoDisplayMachineCaptionsOnPlayer;
	}

	public void autoDisplayMachineCaptionsOnPlayer(String multirequestToken){
		setToken("autoDisplayMachineCaptionsOnPlayer", multirequestToken);
	}

	// autoDisplayHumanCaptionsOnPlayer:
	public Boolean getAutoDisplayHumanCaptionsOnPlayer(){
		return this.autoDisplayHumanCaptionsOnPlayer;
	}
	public void setAutoDisplayHumanCaptionsOnPlayer(Boolean autoDisplayHumanCaptionsOnPlayer){
		this.autoDisplayHumanCaptionsOnPlayer = autoDisplayHumanCaptionsOnPlayer;
	}

	public void autoDisplayHumanCaptionsOnPlayer(String multirequestToken){
		setToken("autoDisplayHumanCaptionsOnPlayer", multirequestToken);
	}

	// enableMetadataExtraction:
	public Boolean getEnableMetadataExtraction(){
		return this.enableMetadataExtraction;
	}
	public void setEnableMetadataExtraction(Boolean enableMetadataExtraction){
		this.enableMetadataExtraction = enableMetadataExtraction;
	}

	public void enableMetadataExtraction(String multirequestToken){
		setToken("enableMetadataExtraction", multirequestToken);
	}

	// enableSpeakerChangeIndication:
	public Boolean getEnableSpeakerChangeIndication(){
		return this.enableSpeakerChangeIndication;
	}
	public void setEnableSpeakerChangeIndication(Boolean enableSpeakerChangeIndication){
		this.enableSpeakerChangeIndication = enableSpeakerChangeIndication;
	}

	public void enableSpeakerChangeIndication(String multirequestToken){
		setToken("enableSpeakerChangeIndication", multirequestToken);
	}

	// enableAudioTags:
	public Boolean getEnableAudioTags(){
		return this.enableAudioTags;
	}
	public void setEnableAudioTags(Boolean enableAudioTags){
		this.enableAudioTags = enableAudioTags;
	}

	public void enableAudioTags(String multirequestToken){
		setToken("enableAudioTags", multirequestToken);
	}

	// enableProfanityRemoval:
	public Boolean getEnableProfanityRemoval(){
		return this.enableProfanityRemoval;
	}
	public void setEnableProfanityRemoval(Boolean enableProfanityRemoval){
		this.enableProfanityRemoval = enableProfanityRemoval;
	}

	public void enableProfanityRemoval(String multirequestToken){
		setToken("enableProfanityRemoval", multirequestToken);
	}

	// maxCharactersPerCaptionLine:
	public Integer getMaxCharactersPerCaptionLine(){
		return this.maxCharactersPerCaptionLine;
	}
	public void setMaxCharactersPerCaptionLine(Integer maxCharactersPerCaptionLine){
		this.maxCharactersPerCaptionLine = maxCharactersPerCaptionLine;
	}

	public void maxCharactersPerCaptionLine(String multirequestToken){
		setToken("maxCharactersPerCaptionLine", multirequestToken);
	}

	// labelAdditionForMachineServiceType:
	public String getLabelAdditionForMachineServiceType(){
		return this.labelAdditionForMachineServiceType;
	}
	public void setLabelAdditionForMachineServiceType(String labelAdditionForMachineServiceType){
		this.labelAdditionForMachineServiceType = labelAdditionForMachineServiceType;
	}

	public void labelAdditionForMachineServiceType(String multirequestToken){
		setToken("labelAdditionForMachineServiceType", multirequestToken);
	}

	// labelAdditionForHumanServiceType:
	public String getLabelAdditionForHumanServiceType(){
		return this.labelAdditionForHumanServiceType;
	}
	public void setLabelAdditionForHumanServiceType(String labelAdditionForHumanServiceType){
		this.labelAdditionForHumanServiceType = labelAdditionForHumanServiceType;
	}

	public void labelAdditionForHumanServiceType(String multirequestToken){
		setToken("labelAdditionForHumanServiceType", multirequestToken);
	}

	// contentDeletionPolicy:
	public ReachProfileContentDeletionPolicy getContentDeletionPolicy(){
		return this.contentDeletionPolicy;
	}
	public void setContentDeletionPolicy(ReachProfileContentDeletionPolicy contentDeletionPolicy){
		this.contentDeletionPolicy = contentDeletionPolicy;
	}

	public void contentDeletionPolicy(String multirequestToken){
		setToken("contentDeletionPolicy", multirequestToken);
	}

	// rules:
	public List<Rule> getRules(){
		return this.rules;
	}
	public void setRules(List<Rule> rules){
		this.rules = rules;
	}

	// credit:
	public BaseVendorCredit getCredit(){
		return this.credit;
	}
	public void setCredit(BaseVendorCredit credit){
		this.credit = credit;
	}

	// usedCredit:
	public Double getUsedCredit(){
		return this.usedCredit;
	}
	// dictionaries:
	public List<Dictionary> getDictionaries(){
		return this.dictionaries;
	}
	public void setDictionaries(List<Dictionary> dictionaries){
		this.dictionaries = dictionaries;
	}

	// flavorParamsIds:
	public String getFlavorParamsIds(){
		return this.flavorParamsIds;
	}
	public void setFlavorParamsIds(String flavorParamsIds){
		this.flavorParamsIds = flavorParamsIds;
	}

	public void flavorParamsIds(String multirequestToken){
		setToken("flavorParamsIds", multirequestToken);
	}

	// vendorTaskProcessingRegion:
	public VendorTaskProcessingRegion getVendorTaskProcessingRegion(){
		return this.vendorTaskProcessingRegion;
	}
	public void setVendorTaskProcessingRegion(VendorTaskProcessingRegion vendorTaskProcessingRegion){
		this.vendorTaskProcessingRegion = vendorTaskProcessingRegion;
	}

	public void vendorTaskProcessingRegion(String multirequestToken){
		setToken("vendorTaskProcessingRegion", multirequestToken);
	}


	public ReachProfile() {
		super();
	}

	public ReachProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		name = GsonParser.parseString(jsonObject.get("name"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		status = ReachProfileStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		profileType = ReachProfileType.get(GsonParser.parseInt(jsonObject.get("profileType")));
		defaultOutputFormat = VendorCatalogItemOutputFormat.get(GsonParser.parseInt(jsonObject.get("defaultOutputFormat")));
		enableMachineModeration = GsonParser.parseBoolean(jsonObject.get("enableMachineModeration"));
		enableHumanModeration = GsonParser.parseBoolean(jsonObject.get("enableHumanModeration"));
		autoDisplayMachineCaptionsOnPlayer = GsonParser.parseBoolean(jsonObject.get("autoDisplayMachineCaptionsOnPlayer"));
		autoDisplayHumanCaptionsOnPlayer = GsonParser.parseBoolean(jsonObject.get("autoDisplayHumanCaptionsOnPlayer"));
		enableMetadataExtraction = GsonParser.parseBoolean(jsonObject.get("enableMetadataExtraction"));
		enableSpeakerChangeIndication = GsonParser.parseBoolean(jsonObject.get("enableSpeakerChangeIndication"));
		enableAudioTags = GsonParser.parseBoolean(jsonObject.get("enableAudioTags"));
		enableProfanityRemoval = GsonParser.parseBoolean(jsonObject.get("enableProfanityRemoval"));
		maxCharactersPerCaptionLine = GsonParser.parseInt(jsonObject.get("maxCharactersPerCaptionLine"));
		labelAdditionForMachineServiceType = GsonParser.parseString(jsonObject.get("labelAdditionForMachineServiceType"));
		labelAdditionForHumanServiceType = GsonParser.parseString(jsonObject.get("labelAdditionForHumanServiceType"));
		contentDeletionPolicy = ReachProfileContentDeletionPolicy.get(GsonParser.parseInt(jsonObject.get("contentDeletionPolicy")));
		rules = GsonParser.parseArray(jsonObject.getAsJsonArray("rules"), Rule.class);
		credit = GsonParser.parseObject(jsonObject.getAsJsonObject("credit"), BaseVendorCredit.class);
		usedCredit = GsonParser.parseDouble(jsonObject.get("usedCredit"));
		dictionaries = GsonParser.parseArray(jsonObject.getAsJsonArray("dictionaries"), Dictionary.class);
		flavorParamsIds = GsonParser.parseString(jsonObject.get("flavorParamsIds"));
		vendorTaskProcessingRegion = VendorTaskProcessingRegion.get(GsonParser.parseInt(jsonObject.get("vendorTaskProcessingRegion")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReachProfile");
		kparams.add("name", this.name);
		kparams.add("profileType", this.profileType);
		kparams.add("defaultOutputFormat", this.defaultOutputFormat);
		kparams.add("enableMachineModeration", this.enableMachineModeration);
		kparams.add("enableHumanModeration", this.enableHumanModeration);
		kparams.add("autoDisplayMachineCaptionsOnPlayer", this.autoDisplayMachineCaptionsOnPlayer);
		kparams.add("autoDisplayHumanCaptionsOnPlayer", this.autoDisplayHumanCaptionsOnPlayer);
		kparams.add("enableMetadataExtraction", this.enableMetadataExtraction);
		kparams.add("enableSpeakerChangeIndication", this.enableSpeakerChangeIndication);
		kparams.add("enableAudioTags", this.enableAudioTags);
		kparams.add("enableProfanityRemoval", this.enableProfanityRemoval);
		kparams.add("maxCharactersPerCaptionLine", this.maxCharactersPerCaptionLine);
		kparams.add("labelAdditionForMachineServiceType", this.labelAdditionForMachineServiceType);
		kparams.add("labelAdditionForHumanServiceType", this.labelAdditionForHumanServiceType);
		kparams.add("contentDeletionPolicy", this.contentDeletionPolicy);
		kparams.add("rules", this.rules);
		kparams.add("credit", this.credit);
		kparams.add("dictionaries", this.dictionaries);
		kparams.add("flavorParamsIds", this.flavorParamsIds);
		kparams.add("vendorTaskProcessingRegion", this.vendorTaskProcessingRegion);
		return kparams;
	}

}

