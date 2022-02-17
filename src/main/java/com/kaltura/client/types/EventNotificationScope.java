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
import com.kaltura.client.enums.EventNotificationEventObjectType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EventNotificationScope.Tokenizer.class)
public class EventNotificationScope extends Scope {
	
	public interface Tokenizer extends Scope.Tokenizer {
		String objectId();
		String scopeObjectType();
	}

	private String objectId;
	private EventNotificationEventObjectType scopeObjectType;

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

	// scopeObjectType:
	public EventNotificationEventObjectType getScopeObjectType(){
		return this.scopeObjectType;
	}
	public void setScopeObjectType(EventNotificationEventObjectType scopeObjectType){
		this.scopeObjectType = scopeObjectType;
	}

	public void scopeObjectType(String multirequestToken){
		setToken("scopeObjectType", multirequestToken);
	}


	public EventNotificationScope() {
		super();
	}

	public EventNotificationScope(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		scopeObjectType = EventNotificationEventObjectType.get(GsonParser.parseString(jsonObject.get("scopeObjectType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEventNotificationScope");
		kparams.add("objectId", this.objectId);
		kparams.add("scopeObjectType", this.scopeObjectType);
		return kparams;
	}

}

