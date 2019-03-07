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
import com.kaltura.client.types.EntryVendorTaskFilter;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryVendorTaskCsvJobData.Tokenizer.class)
public class EntryVendorTaskCsvJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		EntryVendorTaskFilter.Tokenizer filter();
		String userName();
		String userMail();
		String outputPath();
	}

	/**
	 * The filter should return the list of users that need to be specified in the csv.
	 */
	private EntryVendorTaskFilter filter;
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
	public EntryVendorTaskFilter getFilter(){
		return this.filter;
	}
	public void setFilter(EntryVendorTaskFilter filter){
		this.filter = filter;
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


	public EntryVendorTaskCsvJobData() {
		super();
	}

	public EntryVendorTaskCsvJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		filter = GsonParser.parseObject(jsonObject.getAsJsonObject("filter"), EntryVendorTaskFilter.class);
		userName = GsonParser.parseString(jsonObject.get("userName"));
		userMail = GsonParser.parseString(jsonObject.get("userMail"));
		outputPath = GsonParser.parseString(jsonObject.get("outputPath"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryVendorTaskCsvJobData");
		kparams.add("filter", this.filter);
		kparams.add("userName", this.userName);
		kparams.add("userMail", this.userMail);
		kparams.add("outputPath", this.outputPath);
		return kparams;
	}

}

