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
import com.kaltura.client.enums.AdProtocolType;
import com.kaltura.client.enums.AdType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AdCuePoint.Tokenizer.class)
public class AdCuePoint extends CuePoint {
	
	public interface Tokenizer extends CuePoint.Tokenizer {
		String protocolType();
		String sourceUrl();
		String adType();
		String title();
		String endTime();
		String duration();
	}

	private AdProtocolType protocolType;
	private String sourceUrl;
	private AdType adType;
	private String title;
	private Integer endTime;
	/**
	 * Duration in milliseconds
	 */
	private Integer duration;

	// protocolType:
	public AdProtocolType getProtocolType(){
		return this.protocolType;
	}
	public void setProtocolType(AdProtocolType protocolType){
		this.protocolType = protocolType;
	}

	public void protocolType(String multirequestToken){
		setToken("protocolType", multirequestToken);
	}

	// sourceUrl:
	public String getSourceUrl(){
		return this.sourceUrl;
	}
	public void setSourceUrl(String sourceUrl){
		this.sourceUrl = sourceUrl;
	}

	public void sourceUrl(String multirequestToken){
		setToken("sourceUrl", multirequestToken);
	}

	// adType:
	public AdType getAdType(){
		return this.adType;
	}
	public void setAdType(AdType adType){
		this.adType = adType;
	}

	public void adType(String multirequestToken){
		setToken("adType", multirequestToken);
	}

	// title:
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}

	public void title(String multirequestToken){
		setToken("title", multirequestToken);
	}

	// endTime:
	public Integer getEndTime(){
		return this.endTime;
	}
	public void setEndTime(Integer endTime){
		this.endTime = endTime;
	}

	public void endTime(String multirequestToken){
		setToken("endTime", multirequestToken);
	}

	// duration:
	public Integer getDuration(){
		return this.duration;
	}
	public void setDuration(Integer duration){
		this.duration = duration;
	}

	public void duration(String multirequestToken){
		setToken("duration", multirequestToken);
	}


	public AdCuePoint() {
		super();
	}

	public AdCuePoint(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		protocolType = AdProtocolType.get(GsonParser.parseString(jsonObject.get("protocolType")));
		sourceUrl = GsonParser.parseString(jsonObject.get("sourceUrl"));
		adType = AdType.get(GsonParser.parseString(jsonObject.get("adType")));
		title = GsonParser.parseString(jsonObject.get("title"));
		endTime = GsonParser.parseInt(jsonObject.get("endTime"));
		duration = GsonParser.parseInt(jsonObject.get("duration"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAdCuePoint");
		kparams.add("protocolType", this.protocolType);
		kparams.add("sourceUrl", this.sourceUrl);
		kparams.add("adType", this.adType);
		kparams.add("title", this.title);
		kparams.add("endTime", this.endTime);
		kparams.add("duration", this.duration);
		return kparams;
	}

}

