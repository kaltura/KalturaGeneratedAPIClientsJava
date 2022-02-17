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
// Copyright (C) 2006-2022  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(DrmLicenseAccessDetails.Tokenizer.class)
public class DrmLicenseAccessDetails extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String policy();
		String duration();
		String absolute_duration();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> licenseParams();
	}

	/**
	 * Drm policy name
	 */
	private String policy;
	/**
	 * movie duration in seconds
	 */
	private Integer duration;
	/**
	 * playback window in seconds
	 */
	private Integer absolute_duration;
	private List<KeyValue> licenseParams;

	// policy:
	public String getPolicy(){
		return this.policy;
	}
	public void setPolicy(String policy){
		this.policy = policy;
	}

	public void policy(String multirequestToken){
		setToken("policy", multirequestToken);
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

	// absolute_duration:
	public Integer getAbsolute_duration(){
		return this.absolute_duration;
	}
	public void setAbsolute_duration(Integer absolute_duration){
		this.absolute_duration = absolute_duration;
	}

	public void absolute_duration(String multirequestToken){
		setToken("absolute_duration", multirequestToken);
	}

	// licenseParams:
	public List<KeyValue> getLicenseParams(){
		return this.licenseParams;
	}
	public void setLicenseParams(List<KeyValue> licenseParams){
		this.licenseParams = licenseParams;
	}


	public DrmLicenseAccessDetails() {
		super();
	}

	public DrmLicenseAccessDetails(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		policy = GsonParser.parseString(jsonObject.get("policy"));
		duration = GsonParser.parseInt(jsonObject.get("duration"));
		absolute_duration = GsonParser.parseInt(jsonObject.get("absolute_duration"));
		licenseParams = GsonParser.parseArray(jsonObject.getAsJsonArray("licenseParams"), KeyValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDrmLicenseAccessDetails");
		kparams.add("policy", this.policy);
		kparams.add("duration", this.duration);
		kparams.add("absolute_duration", this.absolute_duration);
		kparams.add("licenseParams", this.licenseParams);
		return kparams;
	}

}

