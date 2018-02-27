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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveReportExportParams.Tokenizer.class)
public class LiveReportExportParams extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String entryIds();
		String recpientEmail();
		String timeZoneOffset();
		String applicationUrlTemplate();
	}

	private String entryIds;
	private String recpientEmail;
	/**
	 * Time zone offset in minutes (between client to UTC)
	 */
	private Integer timeZoneOffset;
	/**
	 * Optional argument that allows controlling the prefix of the exported csv url
	 */
	private String applicationUrlTemplate;

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

	// recpientEmail:
	public String getRecpientEmail(){
		return this.recpientEmail;
	}
	public void setRecpientEmail(String recpientEmail){
		this.recpientEmail = recpientEmail;
	}

	public void recpientEmail(String multirequestToken){
		setToken("recpientEmail", multirequestToken);
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

	// applicationUrlTemplate:
	public String getApplicationUrlTemplate(){
		return this.applicationUrlTemplate;
	}
	public void setApplicationUrlTemplate(String applicationUrlTemplate){
		this.applicationUrlTemplate = applicationUrlTemplate;
	}

	public void applicationUrlTemplate(String multirequestToken){
		setToken("applicationUrlTemplate", multirequestToken);
	}


	public LiveReportExportParams() {
		super();
	}

	public LiveReportExportParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entryIds = GsonParser.parseString(jsonObject.get("entryIds"));
		recpientEmail = GsonParser.parseString(jsonObject.get("recpientEmail"));
		timeZoneOffset = GsonParser.parseInt(jsonObject.get("timeZoneOffset"));
		applicationUrlTemplate = GsonParser.parseString(jsonObject.get("applicationUrlTemplate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveReportExportParams");
		kparams.add("entryIds", this.entryIds);
		kparams.add("recpientEmail", this.recpientEmail);
		kparams.add("timeZoneOffset", this.timeZoneOffset);
		kparams.add("applicationUrlTemplate", this.applicationUrlTemplate);
		return kparams;
	}

}

