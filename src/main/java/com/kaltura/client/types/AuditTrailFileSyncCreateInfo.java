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
import com.kaltura.client.enums.AuditTrailFileSyncType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AuditTrailFileSyncCreateInfo.Tokenizer.class)
public class AuditTrailFileSyncCreateInfo extends AuditTrailInfo {
	
	public interface Tokenizer extends AuditTrailInfo.Tokenizer {
		String version();
		String objectSubType();
		String dc();
		String original();
		String fileType();
	}

	private String version;
	private Integer objectSubType;
	private Integer dc;
	private Boolean original;
	private AuditTrailFileSyncType fileType;

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

	// dc:
	public Integer getDc(){
		return this.dc;
	}
	public void setDc(Integer dc){
		this.dc = dc;
	}

	public void dc(String multirequestToken){
		setToken("dc", multirequestToken);
	}

	// original:
	public Boolean getOriginal(){
		return this.original;
	}
	public void setOriginal(Boolean original){
		this.original = original;
	}

	public void original(String multirequestToken){
		setToken("original", multirequestToken);
	}

	// fileType:
	public AuditTrailFileSyncType getFileType(){
		return this.fileType;
	}
	public void setFileType(AuditTrailFileSyncType fileType){
		this.fileType = fileType;
	}

	public void fileType(String multirequestToken){
		setToken("fileType", multirequestToken);
	}


	public AuditTrailFileSyncCreateInfo() {
		super();
	}

	public AuditTrailFileSyncCreateInfo(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		version = GsonParser.parseString(jsonObject.get("version"));
		objectSubType = GsonParser.parseInt(jsonObject.get("objectSubType"));
		dc = GsonParser.parseInt(jsonObject.get("dc"));
		original = GsonParser.parseBoolean(jsonObject.get("original"));
		fileType = AuditTrailFileSyncType.get(GsonParser.parseInt(jsonObject.get("fileType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAuditTrailFileSyncCreateInfo");
		kparams.add("version", this.version);
		kparams.add("objectSubType", this.objectSubType);
		kparams.add("dc", this.dc);
		kparams.add("original", this.original);
		kparams.add("fileType", this.fileType);
		return kparams;
	}

}

