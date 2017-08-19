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
import com.kaltura.client.enums.SessionType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(RecalculateResponseProfileCacheJobData.Tokenizer.class)
public class RecalculateResponseProfileCacheJobData extends RecalculateCacheJobData {
	
	public interface Tokenizer extends RecalculateCacheJobData.Tokenizer {
		String protocol();
		String ksType();
		RequestBuilder.ListTokenizer<IntegerValue.Tokenizer> userRoles();
		String cachedObjectType();
		String objectId();
		String startObjectKey();
		String endObjectKey();
	}

	/**  http / https  */
	private String protocol;
	private SessionType ksType;
	private List<IntegerValue> userRoles;
	/**  Class name  */
	private String cachedObjectType;
	private String objectId;
	private String startObjectKey;
	private String endObjectKey;

	// protocol:
	public String getProtocol(){
		return this.protocol;
	}
	public void setProtocol(String protocol){
		this.protocol = protocol;
	}

	public void protocol(String multirequestToken){
		setToken("protocol", multirequestToken);
	}

	// ksType:
	public SessionType getKsType(){
		return this.ksType;
	}
	public void setKsType(SessionType ksType){
		this.ksType = ksType;
	}

	public void ksType(String multirequestToken){
		setToken("ksType", multirequestToken);
	}

	// userRoles:
	public List<IntegerValue> getUserRoles(){
		return this.userRoles;
	}
	public void setUserRoles(List<IntegerValue> userRoles){
		this.userRoles = userRoles;
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


	public RecalculateResponseProfileCacheJobData() {
		super();
	}

	public RecalculateResponseProfileCacheJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		protocol = GsonParser.parseString(jsonObject.get("protocol"));
		ksType = SessionType.get(GsonParser.parseInt(jsonObject.get("ksType")));
		userRoles = GsonParser.parseArray(jsonObject.getAsJsonArray("userRoles"), IntegerValue.class);
		cachedObjectType = GsonParser.parseString(jsonObject.get("cachedObjectType"));
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		startObjectKey = GsonParser.parseString(jsonObject.get("startObjectKey"));
		endObjectKey = GsonParser.parseString(jsonObject.get("endObjectKey"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRecalculateResponseProfileCacheJobData");
		kparams.add("protocol", this.protocol);
		kparams.add("ksType", this.ksType);
		kparams.add("userRoles", this.userRoles);
		kparams.add("cachedObjectType", this.cachedObjectType);
		kparams.add("objectId", this.objectId);
		kparams.add("startObjectKey", this.startObjectKey);
		kparams.add("endObjectKey", this.endObjectKey);
		return kparams;
	}

}

