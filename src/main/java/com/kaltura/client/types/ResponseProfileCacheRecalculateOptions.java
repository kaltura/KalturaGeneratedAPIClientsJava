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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ResponseProfileCacheRecalculateOptions.Tokenizer.class)
public class ResponseProfileCacheRecalculateOptions extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String limit();
		String cachedObjectType();
		String objectId();
		String startObjectKey();
		String endObjectKey();
		String jobCreatedAt();
		String isFirstLoop();
	}

	/**
	 * Maximum number of keys to recalculate
	 */
	private Integer limit;
	/**
	 * Class name
	 */
	private String cachedObjectType;
	private String objectId;
	private String startObjectKey;
	private String endObjectKey;
	private Integer jobCreatedAt;
	private Boolean isFirstLoop;

	// limit:
	public Integer getLimit(){
		return this.limit;
	}
	public void setLimit(Integer limit){
		this.limit = limit;
	}

	public void limit(String multirequestToken){
		setToken("limit", multirequestToken);
	}

	// cachedObjectType:
	public String getCachedObjectType(){
		return this.cachedObjectType;
	}
	public void setCachedObjectType(String cachedObjectType){
		this.cachedObjectType = cachedObjectType;
	}

	public void cachedObjectType(String multirequestToken){
		setToken("cachedObjectType", multirequestToken);
	}

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

	// startObjectKey:
	public String getStartObjectKey(){
		return this.startObjectKey;
	}
	public void setStartObjectKey(String startObjectKey){
		this.startObjectKey = startObjectKey;
	}

	public void startObjectKey(String multirequestToken){
		setToken("startObjectKey", multirequestToken);
	}

	// endObjectKey:
	public String getEndObjectKey(){
		return this.endObjectKey;
	}
	public void setEndObjectKey(String endObjectKey){
		this.endObjectKey = endObjectKey;
	}

	public void endObjectKey(String multirequestToken){
		setToken("endObjectKey", multirequestToken);
	}

	// jobCreatedAt:
	public Integer getJobCreatedAt(){
		return this.jobCreatedAt;
	}
	public void setJobCreatedAt(Integer jobCreatedAt){
		this.jobCreatedAt = jobCreatedAt;
	}

	public void jobCreatedAt(String multirequestToken){
		setToken("jobCreatedAt", multirequestToken);
	}

	// isFirstLoop:
	public Boolean getIsFirstLoop(){
		return this.isFirstLoop;
	}
	public void setIsFirstLoop(Boolean isFirstLoop){
		this.isFirstLoop = isFirstLoop;
	}

	public void isFirstLoop(String multirequestToken){
		setToken("isFirstLoop", multirequestToken);
	}


	public ResponseProfileCacheRecalculateOptions() {
		super();
	}

	public ResponseProfileCacheRecalculateOptions(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		limit = GsonParser.parseInt(jsonObject.get("limit"));
		cachedObjectType = GsonParser.parseString(jsonObject.get("cachedObjectType"));
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		startObjectKey = GsonParser.parseString(jsonObject.get("startObjectKey"));
		endObjectKey = GsonParser.parseString(jsonObject.get("endObjectKey"));
		jobCreatedAt = GsonParser.parseInt(jsonObject.get("jobCreatedAt"));
		isFirstLoop = GsonParser.parseBoolean(jsonObject.get("isFirstLoop"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaResponseProfileCacheRecalculateOptions");
		kparams.add("limit", this.limit);
		kparams.add("cachedObjectType", this.cachedObjectType);
		kparams.add("objectId", this.objectId);
		kparams.add("startObjectKey", this.startObjectKey);
		kparams.add("endObjectKey", this.endObjectKey);
		kparams.add("jobCreatedAt", this.jobCreatedAt);
		kparams.add("isFirstLoop", this.isFirstLoop);
		return kparams;
	}

}

