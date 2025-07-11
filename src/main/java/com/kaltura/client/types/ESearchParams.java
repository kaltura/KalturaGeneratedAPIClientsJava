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
import com.kaltura.client.types.ESearchOrderBy;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchParams.Tokenizer.class)
public abstract class ESearchParams extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String objectStatuses();
		String objectId();
		ESearchOrderBy.Tokenizer orderBy();
		String ignoreSynonym();
		String objectIds();
		String objectIdsNotIn();
	}

	private String objectStatuses;
	private String objectId;
	private ESearchOrderBy orderBy;
	private Boolean ignoreSynonym;
	private String objectIds;
	private Boolean objectIdsNotIn;

	// objectStatuses:
	public String getObjectStatuses(){
		return this.objectStatuses;
	}
	public void setObjectStatuses(String objectStatuses){
		this.objectStatuses = objectStatuses;
	}

	public void objectStatuses(String multirequestToken){
		setToken("objectStatuses", multirequestToken);
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

	// orderBy:
	public ESearchOrderBy getOrderBy(){
		return this.orderBy;
	}
	public void setOrderBy(ESearchOrderBy orderBy){
		this.orderBy = orderBy;
	}

	// ignoreSynonym:
	public Boolean getIgnoreSynonym(){
		return this.ignoreSynonym;
	}
	public void setIgnoreSynonym(Boolean ignoreSynonym){
		this.ignoreSynonym = ignoreSynonym;
	}

	public void ignoreSynonym(String multirequestToken){
		setToken("ignoreSynonym", multirequestToken);
	}

	// objectIds:
	public String getObjectIds(){
		return this.objectIds;
	}
	public void setObjectIds(String objectIds){
		this.objectIds = objectIds;
	}

	public void objectIds(String multirequestToken){
		setToken("objectIds", multirequestToken);
	}

	// objectIdsNotIn:
	public Boolean getObjectIdsNotIn(){
		return this.objectIdsNotIn;
	}
	public void setObjectIdsNotIn(Boolean objectIdsNotIn){
		this.objectIdsNotIn = objectIdsNotIn;
	}

	public void objectIdsNotIn(String multirequestToken){
		setToken("objectIdsNotIn", multirequestToken);
	}


	public ESearchParams() {
		super();
	}

	public ESearchParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		objectStatuses = GsonParser.parseString(jsonObject.get("objectStatuses"));
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		orderBy = GsonParser.parseObject(jsonObject.getAsJsonObject("orderBy"), ESearchOrderBy.class);
		ignoreSynonym = GsonParser.parseBoolean(jsonObject.get("ignoreSynonym"));
		objectIds = GsonParser.parseString(jsonObject.get("objectIds"));
		objectIdsNotIn = GsonParser.parseBoolean(jsonObject.get("objectIdsNotIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchParams");
		kparams.add("objectStatuses", this.objectStatuses);
		kparams.add("objectId", this.objectId);
		kparams.add("orderBy", this.orderBy);
		kparams.add("ignoreSynonym", this.ignoreSynonym);
		kparams.add("objectIds", this.objectIds);
		kparams.add("objectIdsNotIn", this.objectIdsNotIn);
		return kparams;
	}

}

