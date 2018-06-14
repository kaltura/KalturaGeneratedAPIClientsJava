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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.StorageProfileDeliveryStatus;
import com.kaltura.client.enums.StorageProfileProtocol;
import com.kaltura.client.enums.StorageProfileReadyBehavior;
import com.kaltura.client.enums.StorageProfileStatus;
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
@MultiRequestBuilder.Tokenizer(StorageProfile.Tokenizer.class)
public class StorageProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String createdAt();
		String updatedAt();
		String partnerId();
		String name();
		String systemName();
		String desciption();
		String status();
		String protocol();
		String storageUrl();
		String storageBaseDir();
		String storageUsername();
		String storagePassword();
		String storageFtpPassiveMode();
		String minFileSize();
		String maxFileSize();
		String flavorParamsIds();
		String maxConcurrentConnections();
		String pathManagerClass();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> pathManagerParams();
		String trigger();
		String deliveryPriority();
		String deliveryStatus();
		String readyBehavior();
		String allowAutoDelete();
		String createFileLink();
		RequestBuilder.ListTokenizer<Rule.Tokenizer> rules();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> deliveryProfileIds();
		String privateKey();
		String publicKey();
		String passPhrase();
		String shouldExportThumbs();
	}

	private Integer id;
	private Integer createdAt;
	private Integer updatedAt;
	private Integer partnerId;
	private String name;
	private String systemName;
	private String desciption;
	private StorageProfileStatus status;
	private StorageProfileProtocol protocol;
	private String storageUrl;
	private String storageBaseDir;
	private String storageUsername;
	private String storagePassword;
	private Boolean storageFtpPassiveMode;
	private Integer minFileSize;
	private Integer maxFileSize;
	private String flavorParamsIds;
	private Integer maxConcurrentConnections;
	private String pathManagerClass;
	private List<KeyValue> pathManagerParams;
	/**
	 * No need to create enum for temp field
	 */
	private Integer trigger;
	/**
	 * Delivery Priority
	 */
	private Integer deliveryPriority;
	private StorageProfileDeliveryStatus deliveryStatus;
	private StorageProfileReadyBehavior readyBehavior;
	/**
	 * Flag sugnifying that the storage exported content should be deleted when soure
	  entry is deleted
	 */
	private Integer allowAutoDelete;
	/**
	 * Indicates to the local file transfer manager to create a link to the file
	  instead of copying it
	 */
	private Boolean createFileLink;
	/**
	 * Holds storage profile export rules
	 */
	private List<Rule> rules;
	/**
	 * Delivery profile ids
	 */
	private List<KeyValue> deliveryProfileIds;
	private String privateKey;
	private String publicKey;
	private String passPhrase;
	private Boolean shouldExportThumbs;

	// id:
	public Integer getId(){
		return this.id;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
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

	// systemName:
	public String getSystemName(){
		return this.systemName;
	}
	public void setSystemName(String systemName){
		this.systemName = systemName;
	}

	public void systemName(String multirequestToken){
		setToken("systemName", multirequestToken);
	}

	// desciption:
	public String getDesciption(){
		return this.desciption;
	}
	public void setDesciption(String desciption){
		this.desciption = desciption;
	}

	public void desciption(String multirequestToken){
		setToken("desciption", multirequestToken);
	}

	// status:
	public StorageProfileStatus getStatus(){
		return this.status;
	}
	public void setStatus(StorageProfileStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// protocol:
	public StorageProfileProtocol getProtocol(){
		return this.protocol;
	}
	public void setProtocol(StorageProfileProtocol protocol){
		this.protocol = protocol;
	}

	public void protocol(String multirequestToken){
		setToken("protocol", multirequestToken);
	}

	// storageUrl:
	public String getStorageUrl(){
		return this.storageUrl;
	}
	public void setStorageUrl(String storageUrl){
		this.storageUrl = storageUrl;
	}

	public void storageUrl(String multirequestToken){
		setToken("storageUrl", multirequestToken);
	}

	// storageBaseDir:
	public String getStorageBaseDir(){
		return this.storageBaseDir;
	}
	public void setStorageBaseDir(String storageBaseDir){
		this.storageBaseDir = storageBaseDir;
	}

	public void storageBaseDir(String multirequestToken){
		setToken("storageBaseDir", multirequestToken);
	}

	// storageUsername:
	public String getStorageUsername(){
		return this.storageUsername;
	}
	public void setStorageUsername(String storageUsername){
		this.storageUsername = storageUsername;
	}

	public void storageUsername(String multirequestToken){
		setToken("storageUsername", multirequestToken);
	}

	// storagePassword:
	public String getStoragePassword(){
		return this.storagePassword;
	}
	public void setStoragePassword(String storagePassword){
		this.storagePassword = storagePassword;
	}

	public void storagePassword(String multirequestToken){
		setToken("storagePassword", multirequestToken);
	}

	// storageFtpPassiveMode:
	public Boolean getStorageFtpPassiveMode(){
		return this.storageFtpPassiveMode;
	}
	public void setStorageFtpPassiveMode(Boolean storageFtpPassiveMode){
		this.storageFtpPassiveMode = storageFtpPassiveMode;
	}

	public void storageFtpPassiveMode(String multirequestToken){
		setToken("storageFtpPassiveMode", multirequestToken);
	}

	// minFileSize:
	public Integer getMinFileSize(){
		return this.minFileSize;
	}
	public void setMinFileSize(Integer minFileSize){
		this.minFileSize = minFileSize;
	}

	public void minFileSize(String multirequestToken){
		setToken("minFileSize", multirequestToken);
	}

	// maxFileSize:
	public Integer getMaxFileSize(){
		return this.maxFileSize;
	}
	public void setMaxFileSize(Integer maxFileSize){
		this.maxFileSize = maxFileSize;
	}

	public void maxFileSize(String multirequestToken){
		setToken("maxFileSize", multirequestToken);
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

	// maxConcurrentConnections:
	public Integer getMaxConcurrentConnections(){
		return this.maxConcurrentConnections;
	}
	public void setMaxConcurrentConnections(Integer maxConcurrentConnections){
		this.maxConcurrentConnections = maxConcurrentConnections;
	}

	public void maxConcurrentConnections(String multirequestToken){
		setToken("maxConcurrentConnections", multirequestToken);
	}

	// pathManagerClass:
	public String getPathManagerClass(){
		return this.pathManagerClass;
	}
	public void setPathManagerClass(String pathManagerClass){
		this.pathManagerClass = pathManagerClass;
	}

	public void pathManagerClass(String multirequestToken){
		setToken("pathManagerClass", multirequestToken);
	}

	// pathManagerParams:
	public List<KeyValue> getPathManagerParams(){
		return this.pathManagerParams;
	}
	public void setPathManagerParams(List<KeyValue> pathManagerParams){
		this.pathManagerParams = pathManagerParams;
	}

	// trigger:
	public Integer getTrigger(){
		return this.trigger;
	}
	public void setTrigger(Integer trigger){
		this.trigger = trigger;
	}

	public void trigger(String multirequestToken){
		setToken("trigger", multirequestToken);
	}

	// deliveryPriority:
	public Integer getDeliveryPriority(){
		return this.deliveryPriority;
	}
	public void setDeliveryPriority(Integer deliveryPriority){
		this.deliveryPriority = deliveryPriority;
	}

	public void deliveryPriority(String multirequestToken){
		setToken("deliveryPriority", multirequestToken);
	}

	// deliveryStatus:
	public StorageProfileDeliveryStatus getDeliveryStatus(){
		return this.deliveryStatus;
	}
	public void setDeliveryStatus(StorageProfileDeliveryStatus deliveryStatus){
		this.deliveryStatus = deliveryStatus;
	}

	public void deliveryStatus(String multirequestToken){
		setToken("deliveryStatus", multirequestToken);
	}

	// readyBehavior:
	public StorageProfileReadyBehavior getReadyBehavior(){
		return this.readyBehavior;
	}
	public void setReadyBehavior(StorageProfileReadyBehavior readyBehavior){
		this.readyBehavior = readyBehavior;
	}

	public void readyBehavior(String multirequestToken){
		setToken("readyBehavior", multirequestToken);
	}

	// allowAutoDelete:
	public Integer getAllowAutoDelete(){
		return this.allowAutoDelete;
	}
	public void setAllowAutoDelete(Integer allowAutoDelete){
		this.allowAutoDelete = allowAutoDelete;
	}

	public void allowAutoDelete(String multirequestToken){
		setToken("allowAutoDelete", multirequestToken);
	}

	// createFileLink:
	public Boolean getCreateFileLink(){
		return this.createFileLink;
	}
	public void setCreateFileLink(Boolean createFileLink){
		this.createFileLink = createFileLink;
	}

	public void createFileLink(String multirequestToken){
		setToken("createFileLink", multirequestToken);
	}

	// rules:
	public List<Rule> getRules(){
		return this.rules;
	}
	public void setRules(List<Rule> rules){
		this.rules = rules;
	}

	// deliveryProfileIds:
	public List<KeyValue> getDeliveryProfileIds(){
		return this.deliveryProfileIds;
	}
	public void setDeliveryProfileIds(List<KeyValue> deliveryProfileIds){
		this.deliveryProfileIds = deliveryProfileIds;
	}

	// privateKey:
	public String getPrivateKey(){
		return this.privateKey;
	}
	public void setPrivateKey(String privateKey){
		this.privateKey = privateKey;
	}

	public void privateKey(String multirequestToken){
		setToken("privateKey", multirequestToken);
	}

	// publicKey:
	public String getPublicKey(){
		return this.publicKey;
	}
	public void setPublicKey(String publicKey){
		this.publicKey = publicKey;
	}

	public void publicKey(String multirequestToken){
		setToken("publicKey", multirequestToken);
	}

	// passPhrase:
	public String getPassPhrase(){
		return this.passPhrase;
	}
	public void setPassPhrase(String passPhrase){
		this.passPhrase = passPhrase;
	}

	public void passPhrase(String multirequestToken){
		setToken("passPhrase", multirequestToken);
	}

	// shouldExportThumbs:
	public Boolean getShouldExportThumbs(){
		return this.shouldExportThumbs;
	}
	public void setShouldExportThumbs(Boolean shouldExportThumbs){
		this.shouldExportThumbs = shouldExportThumbs;
	}

	public void shouldExportThumbs(String multirequestToken){
		setToken("shouldExportThumbs", multirequestToken);
	}


	public StorageProfile() {
		super();
	}

	public StorageProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		desciption = GsonParser.parseString(jsonObject.get("desciption"));
		status = StorageProfileStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		protocol = StorageProfileProtocol.get(GsonParser.parseString(jsonObject.get("protocol")));
		storageUrl = GsonParser.parseString(jsonObject.get("storageUrl"));
		storageBaseDir = GsonParser.parseString(jsonObject.get("storageBaseDir"));
		storageUsername = GsonParser.parseString(jsonObject.get("storageUsername"));
		storagePassword = GsonParser.parseString(jsonObject.get("storagePassword"));
		storageFtpPassiveMode = GsonParser.parseBoolean(jsonObject.get("storageFtpPassiveMode"));
		minFileSize = GsonParser.parseInt(jsonObject.get("minFileSize"));
		maxFileSize = GsonParser.parseInt(jsonObject.get("maxFileSize"));
		flavorParamsIds = GsonParser.parseString(jsonObject.get("flavorParamsIds"));
		maxConcurrentConnections = GsonParser.parseInt(jsonObject.get("maxConcurrentConnections"));
		pathManagerClass = GsonParser.parseString(jsonObject.get("pathManagerClass"));
		pathManagerParams = GsonParser.parseArray(jsonObject.getAsJsonArray("pathManagerParams"), KeyValue.class);
		trigger = GsonParser.parseInt(jsonObject.get("trigger"));
		deliveryPriority = GsonParser.parseInt(jsonObject.get("deliveryPriority"));
		deliveryStatus = StorageProfileDeliveryStatus.get(GsonParser.parseInt(jsonObject.get("deliveryStatus")));
		readyBehavior = StorageProfileReadyBehavior.get(GsonParser.parseInt(jsonObject.get("readyBehavior")));
		allowAutoDelete = GsonParser.parseInt(jsonObject.get("allowAutoDelete"));
		createFileLink = GsonParser.parseBoolean(jsonObject.get("createFileLink"));
		rules = GsonParser.parseArray(jsonObject.getAsJsonArray("rules"), Rule.class);
		deliveryProfileIds = GsonParser.parseArray(jsonObject.getAsJsonArray("deliveryProfileIds"), KeyValue.class);
		privateKey = GsonParser.parseString(jsonObject.get("privateKey"));
		publicKey = GsonParser.parseString(jsonObject.get("publicKey"));
		passPhrase = GsonParser.parseString(jsonObject.get("passPhrase"));
		shouldExportThumbs = GsonParser.parseBoolean(jsonObject.get("shouldExportThumbs"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaStorageProfile");
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("desciption", this.desciption);
		kparams.add("status", this.status);
		kparams.add("protocol", this.protocol);
		kparams.add("storageUrl", this.storageUrl);
		kparams.add("storageBaseDir", this.storageBaseDir);
		kparams.add("storageUsername", this.storageUsername);
		kparams.add("storagePassword", this.storagePassword);
		kparams.add("storageFtpPassiveMode", this.storageFtpPassiveMode);
		kparams.add("minFileSize", this.minFileSize);
		kparams.add("maxFileSize", this.maxFileSize);
		kparams.add("flavorParamsIds", this.flavorParamsIds);
		kparams.add("maxConcurrentConnections", this.maxConcurrentConnections);
		kparams.add("pathManagerClass", this.pathManagerClass);
		kparams.add("pathManagerParams", this.pathManagerParams);
		kparams.add("trigger", this.trigger);
		kparams.add("deliveryPriority", this.deliveryPriority);
		kparams.add("deliveryStatus", this.deliveryStatus);
		kparams.add("readyBehavior", this.readyBehavior);
		kparams.add("allowAutoDelete", this.allowAutoDelete);
		kparams.add("createFileLink", this.createFileLink);
		kparams.add("rules", this.rules);
		kparams.add("deliveryProfileIds", this.deliveryProfileIds);
		kparams.add("privateKey", this.privateKey);
		kparams.add("publicKey", this.publicKey);
		kparams.add("passPhrase", this.passPhrase);
		kparams.add("shouldExportThumbs", this.shouldExportThumbs);
		return kparams;
	}

}

