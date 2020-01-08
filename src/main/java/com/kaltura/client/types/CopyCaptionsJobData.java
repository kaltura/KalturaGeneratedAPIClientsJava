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
// Copyright (C) 2006-2020  Kaltura Inc.
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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CopyCaptionsJobData.Tokenizer.class)
public class CopyCaptionsJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String entryId();
		RequestBuilder.ListTokenizer<ClipDescription.Tokenizer> clipsDescriptionArray();
		String fullCopy();
	}

	/**
	 * entry Id
	 */
	private String entryId;
	/**
	 * an array of source start time and duration
	 */
	private List<ClipDescription> clipsDescriptionArray;
	private Boolean fullCopy;

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// clipsDescriptionArray:
	public List<ClipDescription> getClipsDescriptionArray(){
		return this.clipsDescriptionArray;
	}
	public void setClipsDescriptionArray(List<ClipDescription> clipsDescriptionArray){
		this.clipsDescriptionArray = clipsDescriptionArray;
	}

	// fullCopy:
	public Boolean getFullCopy(){
		return this.fullCopy;
	}
	public void setFullCopy(Boolean fullCopy){
		this.fullCopy = fullCopy;
	}

	public void fullCopy(String multirequestToken){
		setToken("fullCopy", multirequestToken);
	}


	public CopyCaptionsJobData() {
		super();
	}

	public CopyCaptionsJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		clipsDescriptionArray = GsonParser.parseArray(jsonObject.getAsJsonArray("clipsDescriptionArray"), ClipDescription.class);
		fullCopy = GsonParser.parseBoolean(jsonObject.get("fullCopy"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCopyCaptionsJobData");
		kparams.add("entryId", this.entryId);
		kparams.add("clipsDescriptionArray", this.clipsDescriptionArray);
		kparams.add("fullCopy", this.fullCopy);
		return kparams;
	}

}

