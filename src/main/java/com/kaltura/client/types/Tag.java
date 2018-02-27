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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.TaggedObjectType;
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
@MultiRequestBuilder.Tokenizer(Tag.Tokenizer.class)
public class Tag extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String tag();
		String taggedObjectType();
		String partnerId();
		String instanceCount();
		String createdAt();
		String updatedAt();
	}

	private Integer id;
	private String tag;
	private TaggedObjectType taggedObjectType;
	private Integer partnerId;
	private Integer instanceCount;
	private Integer createdAt;
	private Integer updatedAt;

	// id:
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// tag:
	public String getTag(){
		return this.tag;
	}
	public void setTag(String tag){
		this.tag = tag;
	}

	public void tag(String multirequestToken){
		setToken("tag", multirequestToken);
	}

	// taggedObjectType:
	public TaggedObjectType getTaggedObjectType(){
		return this.taggedObjectType;
	}
	public void setTaggedObjectType(TaggedObjectType taggedObjectType){
		this.taggedObjectType = taggedObjectType;
	}

	public void taggedObjectType(String multirequestToken){
		setToken("taggedObjectType", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
	}

	// instanceCount:
	public Integer getInstanceCount(){
		return this.instanceCount;
	}
	public void setInstanceCount(Integer instanceCount){
		this.instanceCount = instanceCount;
	}

	public void instanceCount(String multirequestToken){
		setToken("instanceCount", multirequestToken);
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

	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	public void setUpdatedAt(Integer updatedAt){
		this.updatedAt = updatedAt;
	}

	public void updatedAt(String multirequestToken){
		setToken("updatedAt", multirequestToken);
	}


	public Tag() {
		super();
	}

	public Tag(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		tag = GsonParser.parseString(jsonObject.get("tag"));
		taggedObjectType = TaggedObjectType.get(GsonParser.parseString(jsonObject.get("taggedObjectType")));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		instanceCount = GsonParser.parseInt(jsonObject.get("instanceCount"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTag");
		return kparams;
	}

}

