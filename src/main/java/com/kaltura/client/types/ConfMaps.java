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
import com.kaltura.client.enums.ConfMapsSourceLocation;
import com.kaltura.client.enums.ConfMapsStatus;
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
@MultiRequestBuilder.Tokenizer(ConfMaps.Tokenizer.class)
public class ConfMaps extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String name();
		String content();
		String rawData();
		String userId();
		String isEditable();
		String createdAt();
		String relatedHost();
		String version();
		String sourceLocation();
		String remarks();
		String status();
	}

	/**
	 * Name of the map
	 */
	private String name;
	/**
	 * Ini file content
	 */
	private String content;
	private String rawData;
	private String userId;
	/**
	 * IsEditable - true / false
	 */
	private Boolean isEditable;
	/**
	 * Time of the last update
	 */
	private Integer createdAt;
	/**
	 * Regex that represent the host/s that this map affect
	 */
	private String relatedHost;
	private Integer version;
	private ConfMapsSourceLocation sourceLocation;
	private String remarks;
	/**
	 * map status
	 */
	private ConfMapsStatus status;

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// content:
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content = content;
	}

	public void content(String multirequestToken){
		setToken("content", multirequestToken);
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

	// isEditable:
	public Boolean getIsEditable(){
		return this.isEditable;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// relatedHost:
	public String getRelatedHost(){
		return this.relatedHost;
	}
	public void setRelatedHost(String relatedHost){
		this.relatedHost = relatedHost;
	}

	public void relatedHost(String multirequestToken){
		setToken("relatedHost", multirequestToken);
	}

	// version:
	public Integer getVersion(){
		return this.version;
	}
	// sourceLocation:
	public ConfMapsSourceLocation getSourceLocation(){
		return this.sourceLocation;
	}
	public void setSourceLocation(ConfMapsSourceLocation sourceLocation){
		this.sourceLocation = sourceLocation;
	}

	public void sourceLocation(String multirequestToken){
		setToken("sourceLocation", multirequestToken);
	}

	// remarks:
	public String getRemarks(){
		return this.remarks;
	}
	public void setRemarks(String remarks){
		this.remarks = remarks;
	}

	public void remarks(String multirequestToken){
		setToken("remarks", multirequestToken);
	}

	// status:
	public ConfMapsStatus getStatus(){
		return this.status;
	}
	public void setStatus(ConfMapsStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}


	public ConfMaps() {
		super();
	}

	public ConfMaps(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		name = GsonParser.parseString(jsonObject.get("name"));
		content = GsonParser.parseString(jsonObject.get("content"));
		rawData = GsonParser.parseString(jsonObject.get("rawData"));
		userId = GsonParser.parseString(jsonObject.get("userId"));
		isEditable = GsonParser.parseBoolean(jsonObject.get("isEditable"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		relatedHost = GsonParser.parseString(jsonObject.get("relatedHost"));
		version = GsonParser.parseInt(jsonObject.get("version"));
		sourceLocation = ConfMapsSourceLocation.get(GsonParser.parseString(jsonObject.get("sourceLocation")));
		remarks = GsonParser.parseString(jsonObject.get("remarks"));
		status = ConfMapsStatus.get(GsonParser.parseInt(jsonObject.get("status")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConfMaps");
		kparams.add("name", this.name);
		kparams.add("content", this.content);
		kparams.add("rawData", this.rawData);
		kparams.add("userId", this.userId);
		kparams.add("relatedHost", this.relatedHost);
		kparams.add("sourceLocation", this.sourceLocation);
		kparams.add("remarks", this.remarks);
		kparams.add("status", this.status);
		return kparams;
	}

}

