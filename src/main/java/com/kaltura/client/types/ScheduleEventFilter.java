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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ScheduleEventFilter.Tokenizer.class)
public class ScheduleEventFilter extends ScheduleEventBaseFilter {
	
	public interface Tokenizer extends ScheduleEventBaseFilter.Tokenizer {
		String resourceIdsLike();
		String resourceIdsMultiLikeOr();
		String resourceIdsMultiLikeAnd();
		String parentResourceIdsLike();
		String parentResourceIdsMultiLikeOr();
		String parentResourceIdsMultiLikeAnd();
		String templateEntryCategoriesIdsMultiLikeAnd();
		String templateEntryCategoriesIdsMultiLikeOr();
		String resourceSystemNamesMultiLikeOr();
		String templateEntryCategoriesIdsLike();
		String resourceSystemNamesMultiLikeAnd();
		String resourceSystemNamesLike();
		String resourceIdEqual();
	}

	private String resourceIdsLike;
	private String resourceIdsMultiLikeOr;
	private String resourceIdsMultiLikeAnd;
	private String parentResourceIdsLike;
	private String parentResourceIdsMultiLikeOr;
	private String parentResourceIdsMultiLikeAnd;
	private String templateEntryCategoriesIdsMultiLikeAnd;
	private String templateEntryCategoriesIdsMultiLikeOr;
	private String resourceSystemNamesMultiLikeOr;
	private String templateEntryCategoriesIdsLike;
	private String resourceSystemNamesMultiLikeAnd;
	private String resourceSystemNamesLike;
	private String resourceIdEqual;

	// resourceIdsLike:
	public String getResourceIdsLike(){
		return this.resourceIdsLike;
	}
	public void setResourceIdsLike(String resourceIdsLike){
		this.resourceIdsLike = resourceIdsLike;
	}

	public void resourceIdsLike(String multirequestToken){
		setToken("resourceIdsLike", multirequestToken);
	}

	// resourceIdsMultiLikeOr:
	public String getResourceIdsMultiLikeOr(){
		return this.resourceIdsMultiLikeOr;
	}
	public void setResourceIdsMultiLikeOr(String resourceIdsMultiLikeOr){
		this.resourceIdsMultiLikeOr = resourceIdsMultiLikeOr;
	}

	public void resourceIdsMultiLikeOr(String multirequestToken){
		setToken("resourceIdsMultiLikeOr", multirequestToken);
	}

	// resourceIdsMultiLikeAnd:
	public String getResourceIdsMultiLikeAnd(){
		return this.resourceIdsMultiLikeAnd;
	}
	public void setResourceIdsMultiLikeAnd(String resourceIdsMultiLikeAnd){
		this.resourceIdsMultiLikeAnd = resourceIdsMultiLikeAnd;
	}

	public void resourceIdsMultiLikeAnd(String multirequestToken){
		setToken("resourceIdsMultiLikeAnd", multirequestToken);
	}

	// parentResourceIdsLike:
	public String getParentResourceIdsLike(){
		return this.parentResourceIdsLike;
	}
	public void setParentResourceIdsLike(String parentResourceIdsLike){
		this.parentResourceIdsLike = parentResourceIdsLike;
	}

	public void parentResourceIdsLike(String multirequestToken){
		setToken("parentResourceIdsLike", multirequestToken);
	}

	// parentResourceIdsMultiLikeOr:
	public String getParentResourceIdsMultiLikeOr(){
		return this.parentResourceIdsMultiLikeOr;
	}
	public void setParentResourceIdsMultiLikeOr(String parentResourceIdsMultiLikeOr){
		this.parentResourceIdsMultiLikeOr = parentResourceIdsMultiLikeOr;
	}

	public void parentResourceIdsMultiLikeOr(String multirequestToken){
		setToken("parentResourceIdsMultiLikeOr", multirequestToken);
	}

	// parentResourceIdsMultiLikeAnd:
	public String getParentResourceIdsMultiLikeAnd(){
		return this.parentResourceIdsMultiLikeAnd;
	}
	public void setParentResourceIdsMultiLikeAnd(String parentResourceIdsMultiLikeAnd){
		this.parentResourceIdsMultiLikeAnd = parentResourceIdsMultiLikeAnd;
	}

	public void parentResourceIdsMultiLikeAnd(String multirequestToken){
		setToken("parentResourceIdsMultiLikeAnd", multirequestToken);
	}

	// templateEntryCategoriesIdsMultiLikeAnd:
	public String getTemplateEntryCategoriesIdsMultiLikeAnd(){
		return this.templateEntryCategoriesIdsMultiLikeAnd;
	}
	public void setTemplateEntryCategoriesIdsMultiLikeAnd(String templateEntryCategoriesIdsMultiLikeAnd){
		this.templateEntryCategoriesIdsMultiLikeAnd = templateEntryCategoriesIdsMultiLikeAnd;
	}

	public void templateEntryCategoriesIdsMultiLikeAnd(String multirequestToken){
		setToken("templateEntryCategoriesIdsMultiLikeAnd", multirequestToken);
	}

	// templateEntryCategoriesIdsMultiLikeOr:
	public String getTemplateEntryCategoriesIdsMultiLikeOr(){
		return this.templateEntryCategoriesIdsMultiLikeOr;
	}
	public void setTemplateEntryCategoriesIdsMultiLikeOr(String templateEntryCategoriesIdsMultiLikeOr){
		this.templateEntryCategoriesIdsMultiLikeOr = templateEntryCategoriesIdsMultiLikeOr;
	}

	public void templateEntryCategoriesIdsMultiLikeOr(String multirequestToken){
		setToken("templateEntryCategoriesIdsMultiLikeOr", multirequestToken);
	}

	// resourceSystemNamesMultiLikeOr:
	public String getResourceSystemNamesMultiLikeOr(){
		return this.resourceSystemNamesMultiLikeOr;
	}
	public void setResourceSystemNamesMultiLikeOr(String resourceSystemNamesMultiLikeOr){
		this.resourceSystemNamesMultiLikeOr = resourceSystemNamesMultiLikeOr;
	}

	public void resourceSystemNamesMultiLikeOr(String multirequestToken){
		setToken("resourceSystemNamesMultiLikeOr", multirequestToken);
	}

	// templateEntryCategoriesIdsLike:
	public String getTemplateEntryCategoriesIdsLike(){
		return this.templateEntryCategoriesIdsLike;
	}
	public void setTemplateEntryCategoriesIdsLike(String templateEntryCategoriesIdsLike){
		this.templateEntryCategoriesIdsLike = templateEntryCategoriesIdsLike;
	}

	public void templateEntryCategoriesIdsLike(String multirequestToken){
		setToken("templateEntryCategoriesIdsLike", multirequestToken);
	}

	// resourceSystemNamesMultiLikeAnd:
	public String getResourceSystemNamesMultiLikeAnd(){
		return this.resourceSystemNamesMultiLikeAnd;
	}
	public void setResourceSystemNamesMultiLikeAnd(String resourceSystemNamesMultiLikeAnd){
		this.resourceSystemNamesMultiLikeAnd = resourceSystemNamesMultiLikeAnd;
	}

	public void resourceSystemNamesMultiLikeAnd(String multirequestToken){
		setToken("resourceSystemNamesMultiLikeAnd", multirequestToken);
	}

	// resourceSystemNamesLike:
	public String getResourceSystemNamesLike(){
		return this.resourceSystemNamesLike;
	}
	public void setResourceSystemNamesLike(String resourceSystemNamesLike){
		this.resourceSystemNamesLike = resourceSystemNamesLike;
	}

	public void resourceSystemNamesLike(String multirequestToken){
		setToken("resourceSystemNamesLike", multirequestToken);
	}

	// resourceIdEqual:
	public String getResourceIdEqual(){
		return this.resourceIdEqual;
	}
	public void setResourceIdEqual(String resourceIdEqual){
		this.resourceIdEqual = resourceIdEqual;
	}

	public void resourceIdEqual(String multirequestToken){
		setToken("resourceIdEqual", multirequestToken);
	}


	public ScheduleEventFilter() {
		super();
	}

	public ScheduleEventFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		resourceIdsLike = GsonParser.parseString(jsonObject.get("resourceIdsLike"));
		resourceIdsMultiLikeOr = GsonParser.parseString(jsonObject.get("resourceIdsMultiLikeOr"));
		resourceIdsMultiLikeAnd = GsonParser.parseString(jsonObject.get("resourceIdsMultiLikeAnd"));
		parentResourceIdsLike = GsonParser.parseString(jsonObject.get("parentResourceIdsLike"));
		parentResourceIdsMultiLikeOr = GsonParser.parseString(jsonObject.get("parentResourceIdsMultiLikeOr"));
		parentResourceIdsMultiLikeAnd = GsonParser.parseString(jsonObject.get("parentResourceIdsMultiLikeAnd"));
		templateEntryCategoriesIdsMultiLikeAnd = GsonParser.parseString(jsonObject.get("templateEntryCategoriesIdsMultiLikeAnd"));
		templateEntryCategoriesIdsMultiLikeOr = GsonParser.parseString(jsonObject.get("templateEntryCategoriesIdsMultiLikeOr"));
		resourceSystemNamesMultiLikeOr = GsonParser.parseString(jsonObject.get("resourceSystemNamesMultiLikeOr"));
		templateEntryCategoriesIdsLike = GsonParser.parseString(jsonObject.get("templateEntryCategoriesIdsLike"));
		resourceSystemNamesMultiLikeAnd = GsonParser.parseString(jsonObject.get("resourceSystemNamesMultiLikeAnd"));
		resourceSystemNamesLike = GsonParser.parseString(jsonObject.get("resourceSystemNamesLike"));
		resourceIdEqual = GsonParser.parseString(jsonObject.get("resourceIdEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaScheduleEventFilter");
		kparams.add("resourceIdsLike", this.resourceIdsLike);
		kparams.add("resourceIdsMultiLikeOr", this.resourceIdsMultiLikeOr);
		kparams.add("resourceIdsMultiLikeAnd", this.resourceIdsMultiLikeAnd);
		kparams.add("parentResourceIdsLike", this.parentResourceIdsLike);
		kparams.add("parentResourceIdsMultiLikeOr", this.parentResourceIdsMultiLikeOr);
		kparams.add("parentResourceIdsMultiLikeAnd", this.parentResourceIdsMultiLikeAnd);
		kparams.add("templateEntryCategoriesIdsMultiLikeAnd", this.templateEntryCategoriesIdsMultiLikeAnd);
		kparams.add("templateEntryCategoriesIdsMultiLikeOr", this.templateEntryCategoriesIdsMultiLikeOr);
		kparams.add("resourceSystemNamesMultiLikeOr", this.resourceSystemNamesMultiLikeOr);
		kparams.add("templateEntryCategoriesIdsLike", this.templateEntryCategoriesIdsLike);
		kparams.add("resourceSystemNamesMultiLikeAnd", this.resourceSystemNamesMultiLikeAnd);
		kparams.add("resourceSystemNamesLike", this.resourceSystemNamesLike);
		kparams.add("resourceIdEqual", this.resourceIdEqual);
		return kparams;
	}

}

