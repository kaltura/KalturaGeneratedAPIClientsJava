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
@MultiRequestBuilder.Tokenizer(ThumbCuePoint.Tokenizer.class)
public class ThumbCuePoint extends CuePoint {
	
	public interface Tokenizer extends CuePoint.Tokenizer {
		String assetId();
		String description();
		String title();
		String subType();
	}

	private String assetId;
	private String description;
	private String title;
	/**
	 * The sub type of the ThumbCuePoint
	 */
	private ThumbCuePointSubType subType;

	// assetId:
	public String getAssetId(){
		return this.assetId;
	}
	public void setAssetId(String assetId){
		this.assetId = assetId;
	}

	public void assetId(String multirequestToken){
		setToken("assetId", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
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

	// subType:
	public ThumbCuePointSubType getSubType(){
		return this.subType;
	}
	public void setSubType(ThumbCuePointSubType subType){
		this.subType = subType;
	}

	public void subType(String multirequestToken){
		setToken("subType", multirequestToken);
	}


	public ThumbCuePoint() {
		super();
	}

	public ThumbCuePoint(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetId = GsonParser.parseString(jsonObject.get("assetId"));
		description = GsonParser.parseString(jsonObject.get("description"));
		title = GsonParser.parseString(jsonObject.get("title"));
		subType = ThumbCuePointSubType.get(GsonParser.parseInt(jsonObject.get("subType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaThumbCuePoint");
		kparams.add("assetId", this.assetId);
		kparams.add("description", this.description);
		kparams.add("title", this.title);
		kparams.add("subType", this.subType);
		return kparams;
	}

}

