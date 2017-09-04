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
// Copyright (C) 2006-2017  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(ClearBeaconsJobData.Tokenizer.class)
public class ClearBeaconsJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String objectId();
		String relatedObjectType();
	}

	/**  Beacon object Id to clear info for  */
	private String objectId;
	/**  Beacon object Type to clear info for  */
	private Integer relatedObjectType;

	// objectId:
	public String getObjectId(){
		return this.objectId;
	}
	public void setObjectId(String objectId){
		this.objectId = objectId;
	}

	public void objectId(String multirequestToken){
		setToken("objectId", multirequestToken);
	}

	// relatedObjectType:
	public Integer getRelatedObjectType(){
		return this.relatedObjectType;
	}
	public void setRelatedObjectType(Integer relatedObjectType){
		this.relatedObjectType = relatedObjectType;
	}

	public void relatedObjectType(String multirequestToken){
		setToken("relatedObjectType", multirequestToken);
	}


	public ClearBeaconsJobData() {
		super();
	}

	public ClearBeaconsJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		relatedObjectType = GsonParser.parseInt(jsonObject.get("relatedObjectType"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaClearBeaconsJobData");
		kparams.add("relatedObjectType", this.relatedObjectType);
		return kparams;
	}

}

