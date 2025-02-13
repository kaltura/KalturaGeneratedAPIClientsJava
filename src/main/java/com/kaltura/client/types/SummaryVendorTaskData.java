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
import com.kaltura.client.enums.LanguageCode;
import com.kaltura.client.enums.SummaryWritingStyleTaskData;
import com.kaltura.client.enums.TypeOfSummaryTaskData;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SummaryVendorTaskData.Tokenizer.class)
public class SummaryVendorTaskData extends VendorTaskData {
	
	public interface Tokenizer extends VendorTaskData.Tokenizer {
		String typeOfSummary();
		String writingStyle();
		String language();
		String summaryOutputJson();
	}

	/**
	 * Type of summary.
	 */
	private TypeOfSummaryTaskData typeOfSummary;
	/**
	 * Writing style of the summary.
	 */
	private SummaryWritingStyleTaskData writingStyle;
	/**
	 * Language code
	 */
	private LanguageCode language;
	/**
	 * JSON string containing the summary output.
	 */
	private String summaryOutputJson;

	// typeOfSummary:
	public TypeOfSummaryTaskData getTypeOfSummary(){
		return this.typeOfSummary;
	}
	public void setTypeOfSummary(TypeOfSummaryTaskData typeOfSummary){
		this.typeOfSummary = typeOfSummary;
	}

	public void typeOfSummary(String multirequestToken){
		setToken("typeOfSummary", multirequestToken);
	}

	// writingStyle:
	public SummaryWritingStyleTaskData getWritingStyle(){
		return this.writingStyle;
	}
	public void setWritingStyle(SummaryWritingStyleTaskData writingStyle){
		this.writingStyle = writingStyle;
	}

	public void writingStyle(String multirequestToken){
		setToken("writingStyle", multirequestToken);
	}

	// language:
	public LanguageCode getLanguage(){
		return this.language;
	}
	public void setLanguage(LanguageCode language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}

	// summaryOutputJson:
	public String getSummaryOutputJson(){
		return this.summaryOutputJson;
	}
	public void setSummaryOutputJson(String summaryOutputJson){
		this.summaryOutputJson = summaryOutputJson;
	}

	public void summaryOutputJson(String multirequestToken){
		setToken("summaryOutputJson", multirequestToken);
	}


	public SummaryVendorTaskData() {
		super();
	}

	public SummaryVendorTaskData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		typeOfSummary = TypeOfSummaryTaskData.get(GsonParser.parseString(jsonObject.get("typeOfSummary")));
		writingStyle = SummaryWritingStyleTaskData.get(GsonParser.parseString(jsonObject.get("writingStyle")));
		language = LanguageCode.get(GsonParser.parseString(jsonObject.get("language")));
		summaryOutputJson = GsonParser.parseString(jsonObject.get("summaryOutputJson"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSummaryVendorTaskData");
		kparams.add("typeOfSummary", this.typeOfSummary);
		kparams.add("writingStyle", this.writingStyle);
		kparams.add("language", this.language);
		kparams.add("summaryOutputJson", this.summaryOutputJson);
		return kparams;
	}

}

