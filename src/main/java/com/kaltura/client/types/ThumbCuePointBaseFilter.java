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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.enums.ThumbCuePointSubType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ThumbCuePointBaseFilter.Tokenizer.class)
public abstract class ThumbCuePointBaseFilter extends CuePointFilter {
	
	public interface Tokenizer extends CuePointFilter.Tokenizer {
		String descriptionLike();
		String descriptionMultiLikeOr();
		String descriptionMultiLikeAnd();
		String titleLike();
		String titleMultiLikeOr();
		String titleMultiLikeAnd();
		String subTypeEqual();
		String subTypeIn();
	}

	private String descriptionLike;
	private String descriptionMultiLikeOr;
	private String descriptionMultiLikeAnd;
	private String titleLike;
	private String titleMultiLikeOr;
	private String titleMultiLikeAnd;
	private ThumbCuePointSubType subTypeEqual;
	private String subTypeIn;

	// descriptionLike:
	public String getDescriptionLike(){
		return this.descriptionLike;
	}
	public void setDescriptionLike(String descriptionLike){
		this.descriptionLike = descriptionLike;
	}

	public void descriptionLike(String multirequestToken){
		setToken("descriptionLike", multirequestToken);
	}

	// descriptionMultiLikeOr:
	public String getDescriptionMultiLikeOr(){
		return this.descriptionMultiLikeOr;
	}
	public void setDescriptionMultiLikeOr(String descriptionMultiLikeOr){
		this.descriptionMultiLikeOr = descriptionMultiLikeOr;
	}

	public void descriptionMultiLikeOr(String multirequestToken){
		setToken("descriptionMultiLikeOr", multirequestToken);
	}

	// descriptionMultiLikeAnd:
	public String getDescriptionMultiLikeAnd(){
		return this.descriptionMultiLikeAnd;
	}
	public void setDescriptionMultiLikeAnd(String descriptionMultiLikeAnd){
		this.descriptionMultiLikeAnd = descriptionMultiLikeAnd;
	}

	public void descriptionMultiLikeAnd(String multirequestToken){
		setToken("descriptionMultiLikeAnd", multirequestToken);
	}

	// titleLike:
	public String getTitleLike(){
		return this.titleLike;
	}
	public void setTitleLike(String titleLike){
		this.titleLike = titleLike;
	}

	public void titleLike(String multirequestToken){
		setToken("titleLike", multirequestToken);
	}

	// titleMultiLikeOr:
	public String getTitleMultiLikeOr(){
		return this.titleMultiLikeOr;
	}
	public void setTitleMultiLikeOr(String titleMultiLikeOr){
		this.titleMultiLikeOr = titleMultiLikeOr;
	}

	public void titleMultiLikeOr(String multirequestToken){
		setToken("titleMultiLikeOr", multirequestToken);
	}

	// titleMultiLikeAnd:
	public String getTitleMultiLikeAnd(){
		return this.titleMultiLikeAnd;
	}
	public void setTitleMultiLikeAnd(String titleMultiLikeAnd){
		this.titleMultiLikeAnd = titleMultiLikeAnd;
	}

	public void titleMultiLikeAnd(String multirequestToken){
		setToken("titleMultiLikeAnd", multirequestToken);
	}

	// subTypeEqual:
	public ThumbCuePointSubType getSubTypeEqual(){
		return this.subTypeEqual;
	}
	public void setSubTypeEqual(ThumbCuePointSubType subTypeEqual){
		this.subTypeEqual = subTypeEqual;
	}

	public void subTypeEqual(String multirequestToken){
		setToken("subTypeEqual", multirequestToken);
	}

	// subTypeIn:
	public String getSubTypeIn(){
		return this.subTypeIn;
	}
	public void setSubTypeIn(String subTypeIn){
		this.subTypeIn = subTypeIn;
	}

	public void subTypeIn(String multirequestToken){
		setToken("subTypeIn", multirequestToken);
	}


	public ThumbCuePointBaseFilter() {
		super();
	}

	public ThumbCuePointBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		descriptionLike = GsonParser.parseString(jsonObject.get("descriptionLike"));
		descriptionMultiLikeOr = GsonParser.parseString(jsonObject.get("descriptionMultiLikeOr"));
		descriptionMultiLikeAnd = GsonParser.parseString(jsonObject.get("descriptionMultiLikeAnd"));
		titleLike = GsonParser.parseString(jsonObject.get("titleLike"));
		titleMultiLikeOr = GsonParser.parseString(jsonObject.get("titleMultiLikeOr"));
		titleMultiLikeAnd = GsonParser.parseString(jsonObject.get("titleMultiLikeAnd"));
		subTypeEqual = ThumbCuePointSubType.get(GsonParser.parseInt(jsonObject.get("subTypeEqual")));
		subTypeIn = GsonParser.parseString(jsonObject.get("subTypeIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaThumbCuePointBaseFilter");
		kparams.add("descriptionLike", this.descriptionLike);
		kparams.add("descriptionMultiLikeOr", this.descriptionMultiLikeOr);
		kparams.add("descriptionMultiLikeAnd", this.descriptionMultiLikeAnd);
		kparams.add("titleLike", this.titleLike);
		kparams.add("titleMultiLikeOr", this.titleMultiLikeOr);
		kparams.add("titleMultiLikeAnd", this.titleMultiLikeAnd);
		kparams.add("subTypeEqual", this.subTypeEqual);
		kparams.add("subTypeIn", this.subTypeIn);
		return kparams;
	}

}

