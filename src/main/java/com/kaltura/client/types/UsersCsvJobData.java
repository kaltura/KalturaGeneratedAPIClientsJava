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
import com.kaltura.client.types.UserFilter;
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
@MultiRequestBuilder.Tokenizer(UsersCsvJobData.Tokenizer.class)
public class UsersCsvJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		UserFilter.Tokenizer filter();
		String metadataProfileId();
		RequestBuilder.ListTokenizer<CsvAdditionalFieldInfo.Tokenizer> additionalFields();
		String userName();
		String userMail();
		String outputPath();
	}

	/**
	 * The filter should return the list of users that need to be specified in the csv.
	 */
	private UserFilter filter;
	/**
	 * The metadata profile we should look the xpath in
	 */
	private Integer metadataProfileId;
	/**
	 * The xpath to look in the metadataProfileId  and the wanted csv field name
	 */
	private List<CsvAdditionalFieldInfo> additionalFields;
	/**
	 * The users name
	 */
	private String userName;
	/**
	 * The users email
	 */
	private String userMail;
	/**
	 * The file location
	 */
	private String outputPath;

	// filter:
	public UserFilter getFilter(){
		return this.filter;
	}
	public void setFilter(UserFilter filter){
		this.filter = filter;
	}

	// metadataProfileId:
	public Integer getMetadataProfileId(){
		return this.metadataProfileId;
	}
	public void setMetadataProfileId(Integer metadataProfileId){
		this.metadataProfileId = metadataProfileId;
	}

	public void metadataProfileId(String multirequestToken){
		setToken("metadataProfileId", multirequestToken);
	}

	// additionalFields:
	public List<CsvAdditionalFieldInfo> getAdditionalFields(){
		return this.additionalFields;
	}
	public void setAdditionalFields(List<CsvAdditionalFieldInfo> additionalFields){
		this.additionalFields = additionalFields;
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

	// userMail:
	public String getUserMail(){
		return this.userMail;
	}
	public void setUserMail(String userMail){
		this.userMail = userMail;
	}

	public void userMail(String multirequestToken){
		setToken("userMail", multirequestToken);
	}

	// outputPath:
	public String getOutputPath(){
		return this.outputPath;
	}
	public void setOutputPath(String outputPath){
		this.outputPath = outputPath;
	}

	public void outputPath(String multirequestToken){
		setToken("outputPath", multirequestToken);
	}


	public UsersCsvJobData() {
		super();
	}

	public UsersCsvJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		filter = GsonParser.parseObject(jsonObject.getAsJsonObject("filter"), UserFilter.class);
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));
		additionalFields = GsonParser.parseArray(jsonObject.getAsJsonArray("additionalFields"), CsvAdditionalFieldInfo.class);
		userName = GsonParser.parseString(jsonObject.get("userName"));
		userMail = GsonParser.parseString(jsonObject.get("userMail"));
		outputPath = GsonParser.parseString(jsonObject.get("outputPath"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUsersCsvJobData");
		kparams.add("filter", this.filter);
		kparams.add("metadataProfileId", this.metadataProfileId);
		kparams.add("additionalFields", this.additionalFields);
		kparams.add("userName", this.userName);
		kparams.add("userMail", this.userMail);
		kparams.add("outputPath", this.outputPath);
		return kparams;
	}

}

