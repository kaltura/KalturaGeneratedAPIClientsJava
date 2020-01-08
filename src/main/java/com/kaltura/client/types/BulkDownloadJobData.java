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
// Copyright (C) 2006-2020  Kaltura Inc.
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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkDownloadJobData.Tokenizer.class)
public class BulkDownloadJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String entryIds();
		String flavorParamsId();
		String puserId();
	}

	/**
	 * Comma separated list of entry ids
	 */
	private String entryIds;
	/**
	 * Flavor params id to use for conversion
	 */
	private Integer flavorParamsId;
	/**
	 * The id of the requesting user
	 */
	private String puserId;

	// entryIds:
	public String getEntryIds(){
		return this.entryIds;
	}
	public void setEntryIds(String entryIds){
		this.entryIds = entryIds;
	}

	public void entryIds(String multirequestToken){
		setToken("entryIds", multirequestToken);
	}

	// flavorParamsId:
	public Integer getFlavorParamsId(){
		return this.flavorParamsId;
	}
	public void setFlavorParamsId(Integer flavorParamsId){
		this.flavorParamsId = flavorParamsId;
	}

	public void flavorParamsId(String multirequestToken){
		setToken("flavorParamsId", multirequestToken);
	}

	// puserId:
	public String getPuserId(){
		return this.puserId;
	}
	public void setPuserId(String puserId){
		this.puserId = puserId;
	}

	public void puserId(String multirequestToken){
		setToken("puserId", multirequestToken);
	}


	public BulkDownloadJobData() {
		super();
	}

	public BulkDownloadJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entryIds = GsonParser.parseString(jsonObject.get("entryIds"));
		flavorParamsId = GsonParser.parseInt(jsonObject.get("flavorParamsId"));
		puserId = GsonParser.parseString(jsonObject.get("puserId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkDownloadJobData");
		kparams.add("entryIds", this.entryIds);
		kparams.add("flavorParamsId", this.flavorParamsId);
		kparams.add("puserId", this.puserId);
		return kparams;
	}

}

