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
import com.kaltura.client.enums.CaptionAssetUsage;
import com.kaltura.client.enums.Language;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryCaptionAdvancedFilter.Tokenizer.class)
public class EntryCaptionAdvancedFilter extends SearchItem {
	
	public interface Tokenizer extends SearchItem.Tokenizer {
		String hasCaption();
		String language();
		String accuracyGreaterThanOrEqual();
		String accuracyLessThanOrEqual();
		String accuracyGreaterThan();
		String accuracyLessThan();
		String usage();
	}

	private Boolean hasCaption;
	private Language language;
	private Integer accuracyGreaterThanOrEqual;
	private Integer accuracyLessThanOrEqual;
	private Integer accuracyGreaterThan;
	private Integer accuracyLessThan;
	private CaptionAssetUsage usage;

	// hasCaption:
	public Boolean getHasCaption(){
		return this.hasCaption;
	}
	public void setHasCaption(Boolean hasCaption){
		this.hasCaption = hasCaption;
	}

	public void hasCaption(String multirequestToken){
		setToken("hasCaption", multirequestToken);
	}

	// language:
	public Language getLanguage(){
		return this.language;
	}
	public void setLanguage(Language language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}

	// accuracyGreaterThanOrEqual:
	public Integer getAccuracyGreaterThanOrEqual(){
		return this.accuracyGreaterThanOrEqual;
	}
	public void setAccuracyGreaterThanOrEqual(Integer accuracyGreaterThanOrEqual){
		this.accuracyGreaterThanOrEqual = accuracyGreaterThanOrEqual;
	}

	public void accuracyGreaterThanOrEqual(String multirequestToken){
		setToken("accuracyGreaterThanOrEqual", multirequestToken);
	}

	// accuracyLessThanOrEqual:
	public Integer getAccuracyLessThanOrEqual(){
		return this.accuracyLessThanOrEqual;
	}
	public void setAccuracyLessThanOrEqual(Integer accuracyLessThanOrEqual){
		this.accuracyLessThanOrEqual = accuracyLessThanOrEqual;
	}

	public void accuracyLessThanOrEqual(String multirequestToken){
		setToken("accuracyLessThanOrEqual", multirequestToken);
	}

	// accuracyGreaterThan:
	public Integer getAccuracyGreaterThan(){
		return this.accuracyGreaterThan;
	}
	public void setAccuracyGreaterThan(Integer accuracyGreaterThan){
		this.accuracyGreaterThan = accuracyGreaterThan;
	}

	public void accuracyGreaterThan(String multirequestToken){
		setToken("accuracyGreaterThan", multirequestToken);
	}

	// accuracyLessThan:
	public Integer getAccuracyLessThan(){
		return this.accuracyLessThan;
	}
	public void setAccuracyLessThan(Integer accuracyLessThan){
		this.accuracyLessThan = accuracyLessThan;
	}

	public void accuracyLessThan(String multirequestToken){
		setToken("accuracyLessThan", multirequestToken);
	}

	// usage:
	public CaptionAssetUsage getUsage(){
		return this.usage;
	}
	public void setUsage(CaptionAssetUsage usage){
		this.usage = usage;
	}

	public void usage(String multirequestToken){
		setToken("usage", multirequestToken);
	}


	public EntryCaptionAdvancedFilter() {
		super();
	}

	public EntryCaptionAdvancedFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		hasCaption = GsonParser.parseBoolean(jsonObject.get("hasCaption"));
		language = Language.get(GsonParser.parseString(jsonObject.get("language")));
		accuracyGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("accuracyGreaterThanOrEqual"));
		accuracyLessThanOrEqual = GsonParser.parseInt(jsonObject.get("accuracyLessThanOrEqual"));
		accuracyGreaterThan = GsonParser.parseInt(jsonObject.get("accuracyGreaterThan"));
		accuracyLessThan = GsonParser.parseInt(jsonObject.get("accuracyLessThan"));
		usage = CaptionAssetUsage.get(GsonParser.parseString(jsonObject.get("usage")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryCaptionAdvancedFilter");
		kparams.add("hasCaption", this.hasCaption);
		kparams.add("language", this.language);
		kparams.add("accuracyGreaterThanOrEqual", this.accuracyGreaterThanOrEqual);
		kparams.add("accuracyLessThanOrEqual", this.accuracyLessThanOrEqual);
		kparams.add("accuracyGreaterThan", this.accuracyGreaterThan);
		kparams.add("accuracyLessThan", this.accuracyLessThan);
		kparams.add("usage", this.usage);
		return kparams;
	}

}

