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
@MultiRequestBuilder.Tokenizer(LiveReportExportJobData.Tokenizer.class)
public class LiveReportExportJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String timeReference();
		String timeZoneOffset();
		String entryIds();
		String outputPath();
		String recipientEmail();
	}

	private Integer timeReference;
	private Integer timeZoneOffset;
	private String entryIds;
	private String outputPath;
	private String recipientEmail;

	// timeReference:
	public Integer getTimeReference(){
		return this.timeReference;
	}
	public void setTimeReference(Integer timeReference){
		this.timeReference = timeReference;
	}

	public void timeReference(String multirequestToken){
		setToken("timeReference", multirequestToken);
	}

	// timeZoneOffset:
	public Integer getTimeZoneOffset(){
		return this.timeZoneOffset;
	}
	public void setTimeZoneOffset(Integer timeZoneOffset){
		this.timeZoneOffset = timeZoneOffset;
	}

	public void timeZoneOffset(String multirequestToken){
		setToken("timeZoneOffset", multirequestToken);
	}

	// entryIds:
	public String getEntryIds(){
		return this.entryIds;
	}
	public void setEntryIds(String entryIds){
		this.entryIds = entryIds;
	}

	public void entryIds(String multirequestToken){
		setToken("entryIds", multirequestToken);
	}

	// outputPath:
	public String getOutputPath(){
		return this.outputPath;
	}
	public void setOutputPath(String outputPath){
		this.outputPath = outputPath;
	}

	public void outputPath(String multirequestToken){
		setToken("outputPath", multirequestToken);
	}

	// recipientEmail:
	public String getRecipientEmail(){
		return this.recipientEmail;
	}
	public void setRecipientEmail(String recipientEmail){
		this.recipientEmail = recipientEmail;
	}

	public void recipientEmail(String multirequestToken){
		setToken("recipientEmail", multirequestToken);
	}


	public LiveReportExportJobData() {
		super();
	}

	public LiveReportExportJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		timeReference = GsonParser.parseInt(jsonObject.get("timeReference"));
		timeZoneOffset = GsonParser.parseInt(jsonObject.get("timeZoneOffset"));
		entryIds = GsonParser.parseString(jsonObject.get("entryIds"));
		outputPath = GsonParser.parseString(jsonObject.get("outputPath"));
		recipientEmail = GsonParser.parseString(jsonObject.get("recipientEmail"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveReportExportJobData");
		kparams.add("timeReference", this.timeReference);
		kparams.add("timeZoneOffset", this.timeZoneOffset);
		kparams.add("entryIds", this.entryIds);
		kparams.add("outputPath", this.outputPath);
		kparams.add("recipientEmail", this.recipientEmail);
		return kparams;
	}

}

