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
@MultiRequestBuilder.Tokenizer(VelocixProvisionJobData.Tokenizer.class)
public class VelocixProvisionJobData extends ProvisionJobData {
	
	public interface Tokenizer extends ProvisionJobData.Tokenizer {
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> provisioningParams();
		String userName();
		String password();
	}

	private List<KeyValue> provisioningParams;
	private String userName;
	private String password;

	// provisioningParams:
	public List<KeyValue> getProvisioningParams(){
		return this.provisioningParams;
	}
	public void setProvisioningParams(List<KeyValue> provisioningParams){
		this.provisioningParams = provisioningParams;
	}

	// userName:
	public String getUserName(){
		return this.userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}

	public void userName(String multirequestToken){
		setToken("userName", multirequestToken);
	}

	// password:
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public void password(String multirequestToken){
		setToken("password", multirequestToken);
	}


	public VelocixProvisionJobData() {
		super();
	}

	public VelocixProvisionJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		provisioningParams = GsonParser.parseArray(jsonObject.getAsJsonArray("provisioningParams"), KeyValue.class);
		userName = GsonParser.parseString(jsonObject.get("userName"));
		password = GsonParser.parseString(jsonObject.get("password"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVelocixProvisionJobData");
		kparams.add("provisioningParams", this.provisioningParams);
		kparams.add("userName", this.userName);
		kparams.add("password", this.password);
		return kparams;
	}

}

