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
import com.kaltura.client.enums.TaggedObjectType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TagFilter.Tokenizer.class)
public class TagFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String objectTypeEqual();
		String tagEqual();
		String tagStartsWith();
		String instanceCountEqual();
		String instanceCountIn();
	}

	private TaggedObjectType objectTypeEqual;
	private String tagEqual;
	private String tagStartsWith;
	private Integer instanceCountEqual;
	private Integer instanceCountIn;

	// objectTypeEqual:
	public TaggedObjectType getObjectTypeEqual(){
		return this.objectTypeEqual;
	}
	public void setObjectTypeEqual(TaggedObjectType objectTypeEqual){
		this.objectTypeEqual = objectTypeEqual;
	}

	public void objectTypeEqual(String multirequestToken){
		setToken("objectTypeEqual", multirequestToken);
	}

	// tagEqual:
	public String getTagEqual(){
		return this.tagEqual;
	}
	public void setTagEqual(String tagEqual){
		this.tagEqual = tagEqual;
	}

	public void tagEqual(String multirequestToken){
		setToken("tagEqual", multirequestToken);
	}

	// tagStartsWith:
	public String getTagStartsWith(){
		return this.tagStartsWith;
	}
	public void setTagStartsWith(String tagStartsWith){
		this.tagStartsWith = tagStartsWith;
	}

	public void tagStartsWith(String multirequestToken){
		setToken("tagStartsWith", multirequestToken);
	}

	// instanceCountEqual:
	public Integer getInstanceCountEqual(){
		return this.instanceCountEqual;
	}
	public void setInstanceCountEqual(Integer instanceCountEqual){
		this.instanceCountEqual = instanceCountEqual;
	}

	public void instanceCountEqual(String multirequestToken){
		setToken("instanceCountEqual", multirequestToken);
	}

	// instanceCountIn:
	public Integer getInstanceCountIn(){
		return this.instanceCountIn;
	}
	public void setInstanceCountIn(Integer instanceCountIn){
		this.instanceCountIn = instanceCountIn;
	}

	public void instanceCountIn(String multirequestToken){
		setToken("instanceCountIn", multirequestToken);
	}


	public TagFilter() {
		super();
	}

	public TagFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		objectTypeEqual = TaggedObjectType.get(GsonParser.parseString(jsonObject.get("objectTypeEqual")));
		tagEqual = GsonParser.parseString(jsonObject.get("tagEqual"));
		tagStartsWith = GsonParser.parseString(jsonObject.get("tagStartsWith"));
		instanceCountEqual = GsonParser.parseInt(jsonObject.get("instanceCountEqual"));
		instanceCountIn = GsonParser.parseInt(jsonObject.get("instanceCountIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTagFilter");
		kparams.add("objectTypeEqual", this.objectTypeEqual);
		kparams.add("tagEqual", this.tagEqual);
		kparams.add("tagStartsWith", this.tagStartsWith);
		kparams.add("instanceCountEqual", this.instanceCountEqual);
		kparams.add("instanceCountIn", this.instanceCountIn);
		return kparams;
	}

}

