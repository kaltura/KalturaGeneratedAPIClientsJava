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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Clip operation attributes
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ClipAttributes.Tokenizer.class)
public class ClipAttributes extends OperationAttributes {
	
	public interface Tokenizer extends OperationAttributes.Tokenizer {
		String offset();
		String duration();
		String globalOffsetInDestination();
		RequestBuilder.ListTokenizer<Effect.Tokenizer> effectArray();
	}

	/**
	 * Offset in milliseconds
	 */
	private Integer offset;
	/**
	 * Duration in milliseconds
	 */
	private Integer duration;
	/**
	 * global Offset In Destination in milliseconds
	 */
	private Integer globalOffsetInDestination;
	/**
	 * global Offset In Destination in milliseconds
	 */
	private List<Effect> effectArray;

	// offset:
	public Integer getOffset(){
		return this.offset;
	}
	public void setOffset(Integer offset){
		this.offset = offset;
	}

	public void offset(String multirequestToken){
		setToken("offset", multirequestToken);
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

	// globalOffsetInDestination:
	public Integer getGlobalOffsetInDestination(){
		return this.globalOffsetInDestination;
	}
	public void setGlobalOffsetInDestination(Integer globalOffsetInDestination){
		this.globalOffsetInDestination = globalOffsetInDestination;
	}

	public void globalOffsetInDestination(String multirequestToken){
		setToken("globalOffsetInDestination", multirequestToken);
	}

	// effectArray:
	public List<Effect> getEffectArray(){
		return this.effectArray;
	}
	public void setEffectArray(List<Effect> effectArray){
		this.effectArray = effectArray;
	}


	public ClipAttributes() {
		super();
	}

	public ClipAttributes(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		offset = GsonParser.parseInt(jsonObject.get("offset"));
		duration = GsonParser.parseInt(jsonObject.get("duration"));
		globalOffsetInDestination = GsonParser.parseInt(jsonObject.get("globalOffsetInDestination"));
		effectArray = GsonParser.parseArray(jsonObject.getAsJsonArray("effectArray"), Effect.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaClipAttributes");
		kparams.add("offset", this.offset);
		kparams.add("duration", this.duration);
		kparams.add("globalOffsetInDestination", this.globalOffsetInDestination);
		kparams.add("effectArray", this.effectArray);
		return kparams;
	}

}

