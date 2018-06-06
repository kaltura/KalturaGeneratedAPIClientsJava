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
import com.kaltura.client.enums.DrmLicenseExpirationPolicy;
import com.kaltura.client.enums.DrmLicenseScenario;
import com.kaltura.client.enums.DrmLicenseType;
import com.kaltura.client.enums.DrmPolicyStatus;
import com.kaltura.client.enums.DrmProviderType;
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
@MultiRequestBuilder.Tokenizer(DrmPolicy.Tokenizer.class)
public class DrmPolicy extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String partnerId();
		String name();
		String systemName();
		String description();
		String provider();
		String status();
		String scenario();
		String licenseType();
		String licenseExpirationPolicy();
		String duration();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> licenseParams();
	}

	private Integer id;
	private Integer partnerId;
	private String name;
	private String systemName;
	private String description;
	private DrmProviderType provider;
	private DrmPolicyStatus status;
	private DrmLicenseScenario scenario;
	private DrmLicenseType licenseType;
	private DrmLicenseExpirationPolicy licenseExpirationPolicy;
	/**
	 * Duration in days the license is effective
	 */
	private Integer duration;
	private Integer createdAt;
	private Integer updatedAt;
	private List<KeyValue> licenseParams;

	// id:
	public Integer getId(){
		return this.id;
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

	// provider:
	public DrmProviderType getProvider(){
		return this.provider;
	}
	public void setProvider(DrmProviderType provider){
		this.provider = provider;
	}

	public void provider(String multirequestToken){
		setToken("provider", multirequestToken);
	}

	// status:
	public DrmPolicyStatus getStatus(){
		return this.status;
	}
	public void setStatus(DrmPolicyStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// scenario:
	public DrmLicenseScenario getScenario(){
		return this.scenario;
	}
	public void setScenario(DrmLicenseScenario scenario){
		this.scenario = scenario;
	}

	public void scenario(String multirequestToken){
		setToken("scenario", multirequestToken);
	}

	// licenseType:
	public DrmLicenseType getLicenseType(){
		return this.licenseType;
	}
	public void setLicenseType(DrmLicenseType licenseType){
		this.licenseType = licenseType;
	}

	public void licenseType(String multirequestToken){
		setToken("licenseType", multirequestToken);
	}

	// licenseExpirationPolicy:
	public DrmLicenseExpirationPolicy getLicenseExpirationPolicy(){
		return this.licenseExpirationPolicy;
	}
	public void setLicenseExpirationPolicy(DrmLicenseExpirationPolicy licenseExpirationPolicy){
		this.licenseExpirationPolicy = licenseExpirationPolicy;
	}

	public void licenseExpirationPolicy(String multirequestToken){
		setToken("licenseExpirationPolicy", multirequestToken);
	}

	// duration:
	public Integer getDuration(){
		return this.duration;
	}
	public void setDuration(Integer duration){
		this.duration = duration;
	}

	public void duration(String multirequestToken){
		setToken("duration", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// licenseParams:
	public List<KeyValue> getLicenseParams(){
		return this.licenseParams;
	}
	public void setLicenseParams(List<KeyValue> licenseParams){
		this.licenseParams = licenseParams;
	}


	public DrmPolicy() {
		super();
	}

	public DrmPolicy(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		description = GsonParser.parseString(jsonObject.get("description"));
		provider = DrmProviderType.get(GsonParser.parseString(jsonObject.get("provider")));
		status = DrmPolicyStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		scenario = DrmLicenseScenario.get(GsonParser.parseString(jsonObject.get("scenario")));
		licenseType = DrmLicenseType.get(GsonParser.parseString(jsonObject.get("licenseType")));
		licenseExpirationPolicy = DrmLicenseExpirationPolicy.get(GsonParser.parseInt(jsonObject.get("licenseExpirationPolicy")));
		duration = GsonParser.parseInt(jsonObject.get("duration"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		licenseParams = GsonParser.parseArray(jsonObject.getAsJsonArray("licenseParams"), KeyValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDrmPolicy");
		kparams.add("partnerId", this.partnerId);
		kparams.add("name", this.name);
		kparams.add("systemName", this.systemName);
		kparams.add("description", this.description);
		kparams.add("provider", this.provider);
		kparams.add("status", this.status);
		kparams.add("scenario", this.scenario);
		kparams.add("licenseType", this.licenseType);
		kparams.add("licenseExpirationPolicy", this.licenseExpirationPolicy);
		kparams.add("duration", this.duration);
		kparams.add("licenseParams", this.licenseParams);
		return kparams;
	}

}

