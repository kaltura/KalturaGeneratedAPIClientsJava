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
import com.kaltura.client.enums.DrmLicenseScenario;
import com.kaltura.client.enums.DrmPolicyStatus;
import com.kaltura.client.enums.DrmProviderType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DrmPolicyBaseFilter.Tokenizer.class)
public abstract class DrmPolicyBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String partnerIdEqual();
		String partnerIdIn();
		String nameLike();
		String systemNameLike();
		String providerEqual();
		String providerIn();
		String statusEqual();
		String statusIn();
		String scenarioEqual();
		String scenarioIn();
	}

	private Integer partnerIdEqual;
	private String partnerIdIn;
	private String nameLike;
	private String systemNameLike;
	private DrmProviderType providerEqual;
	private String providerIn;
	private DrmPolicyStatus statusEqual;
	private String statusIn;
	private DrmLicenseScenario scenarioEqual;
	private String scenarioIn;

	// partnerIdEqual:
	public Integer getPartnerIdEqual(){
		return this.partnerIdEqual;
	}
	public void setPartnerIdEqual(Integer partnerIdEqual){
		this.partnerIdEqual = partnerIdEqual;
	}

	public void partnerIdEqual(String multirequestToken){
		setToken("partnerIdEqual", multirequestToken);
	}

	// partnerIdIn:
	public String getPartnerIdIn(){
		return this.partnerIdIn;
	}
	public void setPartnerIdIn(String partnerIdIn){
		this.partnerIdIn = partnerIdIn;
	}

	public void partnerIdIn(String multirequestToken){
		setToken("partnerIdIn", multirequestToken);
	}

	// nameLike:
	public String getNameLike(){
		return this.nameLike;
	}
	public void setNameLike(String nameLike){
		this.nameLike = nameLike;
	}

	public void nameLike(String multirequestToken){
		setToken("nameLike", multirequestToken);
	}

	// systemNameLike:
	public String getSystemNameLike(){
		return this.systemNameLike;
	}
	public void setSystemNameLike(String systemNameLike){
		this.systemNameLike = systemNameLike;
	}

	public void systemNameLike(String multirequestToken){
		setToken("systemNameLike", multirequestToken);
	}

	// providerEqual:
	public DrmProviderType getProviderEqual(){
		return this.providerEqual;
	}
	public void setProviderEqual(DrmProviderType providerEqual){
		this.providerEqual = providerEqual;
	}

	public void providerEqual(String multirequestToken){
		setToken("providerEqual", multirequestToken);
	}

	// providerIn:
	public String getProviderIn(){
		return this.providerIn;
	}
	public void setProviderIn(String providerIn){
		this.providerIn = providerIn;
	}

	public void providerIn(String multirequestToken){
		setToken("providerIn", multirequestToken);
	}

	// statusEqual:
	public DrmPolicyStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(DrmPolicyStatus statusEqual){
		this.statusEqual = statusEqual;
	}

	public void statusEqual(String multirequestToken){
		setToken("statusEqual", multirequestToken);
	}

	// statusIn:
	public String getStatusIn(){
		return this.statusIn;
	}
	public void setStatusIn(String statusIn){
		this.statusIn = statusIn;
	}

	public void statusIn(String multirequestToken){
		setToken("statusIn", multirequestToken);
	}

	// scenarioEqual:
	public DrmLicenseScenario getScenarioEqual(){
		return this.scenarioEqual;
	}
	public void setScenarioEqual(DrmLicenseScenario scenarioEqual){
		this.scenarioEqual = scenarioEqual;
	}

	public void scenarioEqual(String multirequestToken){
		setToken("scenarioEqual", multirequestToken);
	}

	// scenarioIn:
	public String getScenarioIn(){
		return this.scenarioIn;
	}
	public void setScenarioIn(String scenarioIn){
		this.scenarioIn = scenarioIn;
	}

	public void scenarioIn(String multirequestToken){
		setToken("scenarioIn", multirequestToken);
	}


	public DrmPolicyBaseFilter() {
		super();
	}

	public DrmPolicyBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
		nameLike = GsonParser.parseString(jsonObject.get("nameLike"));
		systemNameLike = GsonParser.parseString(jsonObject.get("systemNameLike"));
		providerEqual = DrmProviderType.get(GsonParser.parseString(jsonObject.get("providerEqual")));
		providerIn = GsonParser.parseString(jsonObject.get("providerIn"));
		statusEqual = DrmPolicyStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		scenarioEqual = DrmLicenseScenario.get(GsonParser.parseString(jsonObject.get("scenarioEqual")));
		scenarioIn = GsonParser.parseString(jsonObject.get("scenarioIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDrmPolicyBaseFilter");
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("partnerIdIn", this.partnerIdIn);
		kparams.add("nameLike", this.nameLike);
		kparams.add("systemNameLike", this.systemNameLike);
		kparams.add("providerEqual", this.providerEqual);
		kparams.add("providerIn", this.providerIn);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("scenarioEqual", this.scenarioEqual);
		kparams.add("scenarioIn", this.scenarioIn);
		return kparams;
	}

}

