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
@MultiRequestBuilder.Tokenizer(ClipsVendorTaskData.Tokenizer.class)
public class ClipsVendorTaskData extends VendorTaskData {
	
	public interface Tokenizer extends VendorTaskData.Tokenizer {
		String clipsDuration();
		String eventSessionContextId();
		String instruction();
		String clipsOutputJson();
	}

	/**
	 * Estimated duration of the clips, in seconds.
	 */
	private Integer clipsDuration;
	/**
	 * Event session context ID used to enhance clip results.
	 */
	private String eventSessionContextId;
	/**
	 * Instruction describing the moments to capture or the objectives to achieve with
	  the clips.
	 */
	private String instruction;
	/**
	 * List of clips as JSON string.   For example: [{"title": "Title of the first
	  clip", "description": "Description of the first clip", "tags": "Tagged-Example",
	  "start": 127, "duration": 30}]
	 */
	private String clipsOutputJson;

	// clipsDuration:
	public Integer getClipsDuration(){
		return this.clipsDuration;
	}
	public void setClipsDuration(Integer clipsDuration){
		this.clipsDuration = clipsDuration;
	}

	public void clipsDuration(String multirequestToken){
		setToken("clipsDuration", multirequestToken);
	}

	// eventSessionContextId:
	public String getEventSessionContextId(){
		return this.eventSessionContextId;
	}
	public void setEventSessionContextId(String eventSessionContextId){
		this.eventSessionContextId = eventSessionContextId;
	}

	public void eventSessionContextId(String multirequestToken){
		setToken("eventSessionContextId", multirequestToken);
	}

	// instruction:
	public String getInstruction(){
		return this.instruction;
	}
	public void setInstruction(String instruction){
		this.instruction = instruction;
	}

	public void instruction(String multirequestToken){
		setToken("instruction", multirequestToken);
	}

	// clipsOutputJson:
	public String getClipsOutputJson(){
		return this.clipsOutputJson;
	}
	public void setClipsOutputJson(String clipsOutputJson){
		this.clipsOutputJson = clipsOutputJson;
	}

	public void clipsOutputJson(String multirequestToken){
		setToken("clipsOutputJson", multirequestToken);
	}


	public ClipsVendorTaskData() {
		super();
	}

	public ClipsVendorTaskData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		clipsDuration = GsonParser.parseInt(jsonObject.get("clipsDuration"));
		eventSessionContextId = GsonParser.parseString(jsonObject.get("eventSessionContextId"));
		instruction = GsonParser.parseString(jsonObject.get("instruction"));
		clipsOutputJson = GsonParser.parseString(jsonObject.get("clipsOutputJson"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaClipsVendorTaskData");
		kparams.add("clipsDuration", this.clipsDuration);
		kparams.add("eventSessionContextId", this.eventSessionContextId);
		kparams.add("instruction", this.instruction);
		kparams.add("clipsOutputJson", this.clipsOutputJson);
		return kparams;
	}

}

