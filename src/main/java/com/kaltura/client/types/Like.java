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
@MultiRequestBuilder.Tokenizer(Like.Tokenizer.class)
public class Like extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String entryId();
		String userId();
		String createdAt();
	}

	/**
	 * The id of the entry that the like belongs to
	 */
	private String entryId;
	/**
	 * The id of user that the like belongs to
	 */
	private String userId;
	/**
	 * The date of the like's creation
	 */
	private Integer createdAt;

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	public void setCreatedAt(Integer createdAt){
		this.createdAt = createdAt;
	}

	public void createdAt(String multirequestToken){
		setToken("createdAt", multirequestToken);
	}


	public Like() {
		super();
	}

	public Like(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLike");
		kparams.add("entryId", this.entryId);
		kparams.add("userId", this.userId);
		kparams.add("createdAt", this.createdAt);
		return kparams;
	}

}

