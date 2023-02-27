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
import com.kaltura.client.enums.BeaconObjectTypes;
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
@MultiRequestBuilder.Tokenizer(Beacon.Tokenizer.class)
public class Beacon extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String indexType();
		String updatedAt();
		String relatedObjectType();
		String eventType();
		String objectId();
		String privateData();
		String rawData();
	}

	/**
	 * Beacon id
	 */
	private String id;
	/**
	 * Beacon indexType
	 */
	private String indexType;
	/**
	 * Beacon update date as Unix timestamp (In seconds)
	 */
	private Long updatedAt;
	/**
	 * The object which this beacon belongs to
	 */
	private BeaconObjectTypes relatedObjectType;
	private String eventType;
	private String objectId;
	private String privateData;
	private String rawData;

	// id:
	public String getId(){
		return this.id;
	}
	// indexType:
	public String getIndexType(){
		return this.indexType;
	}
	// updatedAt:
	public Long getUpdatedAt(){
		return this.updatedAt;
	}
	// relatedObjectType:
	public BeaconObjectTypes getRelatedObjectType(){
		return this.relatedObjectType;
	}
	public void setRelatedObjectType(BeaconObjectTypes relatedObjectType){
		this.relatedObjectType = relatedObjectType;
	}

	public void relatedObjectType(String multirequestToken){
		setToken("relatedObjectType", multirequestToken);
	}

	// eventType:
	public String getEventType(){
		return this.eventType;
	}
	public void setEventType(String eventType){
		this.eventType = eventType;
	}

	public void eventType(String multirequestToken){
		setToken("eventType", multirequestToken);
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

	// privateData:
	public String getPrivateData(){
		return this.privateData;
	}
	public void setPrivateData(String privateData){
		this.privateData = privateData;
	}

	public void privateData(String multirequestToken){
		setToken("privateData", multirequestToken);
	}

	// rawData:
	public String getRawData(){
		return this.rawData;
	}
	public void setRawData(String rawData){
		this.rawData = rawData;
	}

	public void rawData(String multirequestToken){
		setToken("rawData", multirequestToken);
	}


	public Beacon() {
		super();
	}

	public Beacon(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		indexType = GsonParser.parseString(jsonObject.get("indexType"));
		updatedAt = GsonParser.parseLong(jsonObject.get("updatedAt"));
		relatedObjectType = BeaconObjectTypes.get(GsonParser.parseString(jsonObject.get("relatedObjectType")));
		eventType = GsonParser.parseString(jsonObject.get("eventType"));
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		privateData = GsonParser.parseString(jsonObject.get("privateData"));
		rawData = GsonParser.parseString(jsonObject.get("rawData"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBeacon");
		kparams.add("relatedObjectType", this.relatedObjectType);
		kparams.add("eventType", this.eventType);
		kparams.add("objectId", this.objectId);
		kparams.add("privateData", this.privateData);
		kparams.add("rawData", this.rawData);
		return kparams;
	}

}

