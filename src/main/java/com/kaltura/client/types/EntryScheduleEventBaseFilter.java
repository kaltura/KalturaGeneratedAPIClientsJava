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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryScheduleEventBaseFilter.Tokenizer.class)
public abstract class EntryScheduleEventBaseFilter extends ScheduleEventFilter {
	
	public interface Tokenizer extends ScheduleEventFilter.Tokenizer {
		String templateEntryIdEqual();
		String entryIdsLike();
		String entryIdsMultiLikeOr();
		String entryIdsMultiLikeAnd();
		String categoryIdsLike();
		String categoryIdsMultiLikeOr();
		String categoryIdsMultiLikeAnd();
	}

	private String templateEntryIdEqual;
	private String entryIdsLike;
	private String entryIdsMultiLikeOr;
	private String entryIdsMultiLikeAnd;
	private String categoryIdsLike;
	private String categoryIdsMultiLikeOr;
	private String categoryIdsMultiLikeAnd;

	// templateEntryIdEqual:
	public String getTemplateEntryIdEqual(){
		return this.templateEntryIdEqual;
	}
	public void setTemplateEntryIdEqual(String templateEntryIdEqual){
		this.templateEntryIdEqual = templateEntryIdEqual;
	}

	public void templateEntryIdEqual(String multirequestToken){
		setToken("templateEntryIdEqual", multirequestToken);
	}

	// entryIdsLike:
	public String getEntryIdsLike(){
		return this.entryIdsLike;
	}
	public void setEntryIdsLike(String entryIdsLike){
		this.entryIdsLike = entryIdsLike;
	}

	public void entryIdsLike(String multirequestToken){
		setToken("entryIdsLike", multirequestToken);
	}

	// entryIdsMultiLikeOr:
	public String getEntryIdsMultiLikeOr(){
		return this.entryIdsMultiLikeOr;
	}
	public void setEntryIdsMultiLikeOr(String entryIdsMultiLikeOr){
		this.entryIdsMultiLikeOr = entryIdsMultiLikeOr;
	}

	public void entryIdsMultiLikeOr(String multirequestToken){
		setToken("entryIdsMultiLikeOr", multirequestToken);
	}

	// entryIdsMultiLikeAnd:
	public String getEntryIdsMultiLikeAnd(){
		return this.entryIdsMultiLikeAnd;
	}
	public void setEntryIdsMultiLikeAnd(String entryIdsMultiLikeAnd){
		this.entryIdsMultiLikeAnd = entryIdsMultiLikeAnd;
	}

	public void entryIdsMultiLikeAnd(String multirequestToken){
		setToken("entryIdsMultiLikeAnd", multirequestToken);
	}

	// categoryIdsLike:
	public String getCategoryIdsLike(){
		return this.categoryIdsLike;
	}
	public void setCategoryIdsLike(String categoryIdsLike){
		this.categoryIdsLike = categoryIdsLike;
	}

	public void categoryIdsLike(String multirequestToken){
		setToken("categoryIdsLike", multirequestToken);
	}

	// categoryIdsMultiLikeOr:
	public String getCategoryIdsMultiLikeOr(){
		return this.categoryIdsMultiLikeOr;
	}
	public void setCategoryIdsMultiLikeOr(String categoryIdsMultiLikeOr){
		this.categoryIdsMultiLikeOr = categoryIdsMultiLikeOr;
	}

	public void categoryIdsMultiLikeOr(String multirequestToken){
		setToken("categoryIdsMultiLikeOr", multirequestToken);
	}

	// categoryIdsMultiLikeAnd:
	public String getCategoryIdsMultiLikeAnd(){
		return this.categoryIdsMultiLikeAnd;
	}
	public void setCategoryIdsMultiLikeAnd(String categoryIdsMultiLikeAnd){
		this.categoryIdsMultiLikeAnd = categoryIdsMultiLikeAnd;
	}

	public void categoryIdsMultiLikeAnd(String multirequestToken){
		setToken("categoryIdsMultiLikeAnd", multirequestToken);
	}


	public EntryScheduleEventBaseFilter() {
		super();
	}

	public EntryScheduleEventBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		templateEntryIdEqual = GsonParser.parseString(jsonObject.get("templateEntryIdEqual"));
		entryIdsLike = GsonParser.parseString(jsonObject.get("entryIdsLike"));
		entryIdsMultiLikeOr = GsonParser.parseString(jsonObject.get("entryIdsMultiLikeOr"));
		entryIdsMultiLikeAnd = GsonParser.parseString(jsonObject.get("entryIdsMultiLikeAnd"));
		categoryIdsLike = GsonParser.parseString(jsonObject.get("categoryIdsLike"));
		categoryIdsMultiLikeOr = GsonParser.parseString(jsonObject.get("categoryIdsMultiLikeOr"));
		categoryIdsMultiLikeAnd = GsonParser.parseString(jsonObject.get("categoryIdsMultiLikeAnd"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryScheduleEventBaseFilter");
		kparams.add("templateEntryIdEqual", this.templateEntryIdEqual);
		kparams.add("entryIdsLike", this.entryIdsLike);
		kparams.add("entryIdsMultiLikeOr", this.entryIdsMultiLikeOr);
		kparams.add("entryIdsMultiLikeAnd", this.entryIdsMultiLikeAnd);
		kparams.add("categoryIdsLike", this.categoryIdsLike);
		kparams.add("categoryIdsMultiLikeOr", this.categoryIdsMultiLikeOr);
		kparams.add("categoryIdsMultiLikeAnd", this.categoryIdsMultiLikeAnd);
		return kparams;
	}

}

