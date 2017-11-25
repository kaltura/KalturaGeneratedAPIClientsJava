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
// Copyright (C) 2006-2017  Kaltura Inc.
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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CopyCaptionsJobData.Tokenizer.class)
public class CopyCaptionsJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String sourceEntryId();
		String entryId();
		String offset();
		String duration();
		String fullCopy();
	}

	/**
	 * source entry Id
	 */
	private String sourceEntryId;
	/**
	 * entry Id
	 */
	private String entryId;
	/**
	 * clip offset
	 */
	private Integer offset;
	/**
	 * clip duration
	 */
	private Integer duration;
	private Boolean fullCopy;

	// sourceEntryId:
	public String getSourceEntryId(){
		return this.sourceEntryId;
	}
	public void setSourceEntryId(String sourceEntryId){
		this.sourceEntryId = sourceEntryId;
	}

	public void sourceEntryId(String multirequestToken){
		setToken("sourceEntryId", multirequestToken);
	}

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
		sourceEntryId = GsonParser.parseString(jsonObject.get("sourceEntryId"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		offset = GsonParser.parseInt(jsonObject.get("offset"));
		duration = GsonParser.parseInt(jsonObject.get("duration"));
		fullCopy = GsonParser.parseBoolean(jsonObject.get("fullCopy"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCopyCaptionsJobData");
		kparams.add("sourceEntryId", this.sourceEntryId);
		kparams.add("entryId", this.entryId);
		kparams.add("offset", this.offset);
		kparams.add("duration", this.duration);
		kparams.add("fullCopy", this.fullCopy);
		return kparams;
	}

}

