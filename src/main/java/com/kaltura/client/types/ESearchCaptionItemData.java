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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchCaptionItemData.Tokenizer.class)
public class ESearchCaptionItemData extends ESearchItemData {
	
	public interface Tokenizer extends ESearchItemData.Tokenizer {
		String line();
		String startsAt();
		String endsAt();
		String language();
		String captionAssetId();
		String label();
		String accuracy();
		String usage();
	}

	private String line;
	private Integer startsAt;
	private Integer endsAt;
	private String language;
	private String captionAssetId;
	private String label;
	private Integer accuracy;
	private Integer usage;

	// line:
	public String getLine(){
		return this.line;
	}
	public void setLine(String line){
		this.line = line;
	}

	public void line(String multirequestToken){
		setToken("line", multirequestToken);
	}

	// startsAt:
	public Integer getStartsAt(){
		return this.startsAt;
	}
	public void setStartsAt(Integer startsAt){
		this.startsAt = startsAt;
	}

	public void startsAt(String multirequestToken){
		setToken("startsAt", multirequestToken);
	}

	// endsAt:
	public Integer getEndsAt(){
		return this.endsAt;
	}
	public void setEndsAt(Integer endsAt){
		this.endsAt = endsAt;
	}

	public void endsAt(String multirequestToken){
		setToken("endsAt", multirequestToken);
	}

	// language:
	public String getLanguage(){
		return this.language;
	}
	public void setLanguage(String language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}

	// captionAssetId:
	public String getCaptionAssetId(){
		return this.captionAssetId;
	}
	public void setCaptionAssetId(String captionAssetId){
		this.captionAssetId = captionAssetId;
	}

	public void captionAssetId(String multirequestToken){
		setToken("captionAssetId", multirequestToken);
	}

	// label:
	public String getLabel(){
		return this.label;
	}
	public void setLabel(String label){
		this.label = label;
	}

	public void label(String multirequestToken){
		setToken("label", multirequestToken);
	}

	// accuracy:
	public Integer getAccuracy(){
		return this.accuracy;
	}
	public void setAccuracy(Integer accuracy){
		this.accuracy = accuracy;
	}

	public void accuracy(String multirequestToken){
		setToken("accuracy", multirequestToken);
	}

	// usage:
	public Integer getUsage(){
		return this.usage;
	}
	public void setUsage(Integer usage){
		this.usage = usage;
	}

	public void usage(String multirequestToken){
		setToken("usage", multirequestToken);
	}


	public ESearchCaptionItemData() {
		super();
	}

	public ESearchCaptionItemData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		line = GsonParser.parseString(jsonObject.get("line"));
		startsAt = GsonParser.parseInt(jsonObject.get("startsAt"));
		endsAt = GsonParser.parseInt(jsonObject.get("endsAt"));
		language = GsonParser.parseString(jsonObject.get("language"));
		captionAssetId = GsonParser.parseString(jsonObject.get("captionAssetId"));
		label = GsonParser.parseString(jsonObject.get("label"));
		accuracy = GsonParser.parseInt(jsonObject.get("accuracy"));
		usage = GsonParser.parseInt(jsonObject.get("usage"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchCaptionItemData");
		kparams.add("line", this.line);
		kparams.add("startsAt", this.startsAt);
		kparams.add("endsAt", this.endsAt);
		kparams.add("language", this.language);
		kparams.add("captionAssetId", this.captionAssetId);
		kparams.add("label", this.label);
		kparams.add("accuracy", this.accuracy);
		kparams.add("usage", this.usage);
		return kparams;
	}

}

