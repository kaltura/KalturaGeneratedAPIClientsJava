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
import com.kaltura.client.types.ClipAttributes;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ClippingTaskEntryServerNode.Tokenizer.class)
public class ClippingTaskEntryServerNode extends TaskEntryServerNode {
	
	public interface Tokenizer extends TaskEntryServerNode.Tokenizer {
		ClipAttributes.Tokenizer clipAttributes();
		String clippedEntryId();
		String liveEntryId();
	}

	private ClipAttributes clipAttributes;
	private String clippedEntryId;
	private String liveEntryId;

	// clipAttributes:
	public ClipAttributes getClipAttributes(){
		return this.clipAttributes;
	}
	public void setClipAttributes(ClipAttributes clipAttributes){
		this.clipAttributes = clipAttributes;
	}

	// clippedEntryId:
	public String getClippedEntryId(){
		return this.clippedEntryId;
	}
	public void setClippedEntryId(String clippedEntryId){
		this.clippedEntryId = clippedEntryId;
	}

	public void clippedEntryId(String multirequestToken){
		setToken("clippedEntryId", multirequestToken);
	}

	// liveEntryId:
	public String getLiveEntryId(){
		return this.liveEntryId;
	}
	public void setLiveEntryId(String liveEntryId){
		this.liveEntryId = liveEntryId;
	}

	public void liveEntryId(String multirequestToken){
		setToken("liveEntryId", multirequestToken);
	}


	public ClippingTaskEntryServerNode() {
		super();
	}

	public ClippingTaskEntryServerNode(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		clipAttributes = GsonParser.parseObject(jsonObject.getAsJsonObject("clipAttributes"), ClipAttributes.class);
		clippedEntryId = GsonParser.parseString(jsonObject.get("clippedEntryId"));
		liveEntryId = GsonParser.parseString(jsonObject.get("liveEntryId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaClippingTaskEntryServerNode");
		kparams.add("clipAttributes", this.clipAttributes);
		kparams.add("clippedEntryId", this.clippedEntryId);
		kparams.add("liveEntryId", this.liveEntryId);
		return kparams;
	}

}

