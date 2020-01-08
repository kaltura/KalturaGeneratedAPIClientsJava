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

/**
 * Used to ingest media that is already ingested to Kaltura system as a different
  file in the past, the new created flavor asset will be ready immediately using a
  file sync of link type that will point to the existing file sync.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FileSyncResource.Tokenizer.class)
public class FileSyncResource extends ContentResource {
	
	public interface Tokenizer extends ContentResource.Tokenizer {
		String fileSyncObjectType();
		String objectSubType();
		String objectId();
		String version();
	}

	/**
	 * The object type of the file sync object
	 */
	private Integer fileSyncObjectType;
	/**
	 * The object sub-type of the file sync object
	 */
	private Integer objectSubType;
	/**
	 * The object id of the file sync object
	 */
	private String objectId;
	/**
	 * The version of the file sync object
	 */
	private String version;

	// fileSyncObjectType:
	public Integer getFileSyncObjectType(){
		return this.fileSyncObjectType;
	}
	public void setFileSyncObjectType(Integer fileSyncObjectType){
		this.fileSyncObjectType = fileSyncObjectType;
	}

	public void fileSyncObjectType(String multirequestToken){
		setToken("fileSyncObjectType", multirequestToken);
	}

	// objectSubType:
	public Integer getObjectSubType(){
		return this.objectSubType;
	}
	public void setObjectSubType(Integer objectSubType){
		this.objectSubType = objectSubType;
	}

	public void objectSubType(String multirequestToken){
		setToken("objectSubType", multirequestToken);
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

	// version:
	public String getVersion(){
		return this.version;
	}
	public void setVersion(String version){
		this.version = version;
	}

	public void version(String multirequestToken){
		setToken("version", multirequestToken);
	}


	public FileSyncResource() {
		super();
	}

	public FileSyncResource(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fileSyncObjectType = GsonParser.parseInt(jsonObject.get("fileSyncObjectType"));
		objectSubType = GsonParser.parseInt(jsonObject.get("objectSubType"));
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		version = GsonParser.parseString(jsonObject.get("version"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFileSyncResource");
		kparams.add("fileSyncObjectType", this.fileSyncObjectType);
		kparams.add("objectSubType", this.objectSubType);
		kparams.add("objectId", this.objectId);
		kparams.add("version", this.version);
		return kparams;
	}

}

