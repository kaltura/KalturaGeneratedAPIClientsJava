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
import com.kaltura.client.types.BusinessProcessServer;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BusinessProcessNotificationDispatchJobData.Tokenizer.class)
public class BusinessProcessNotificationDispatchJobData extends EventNotificationDispatchJobData {
	
	public interface Tokenizer extends EventNotificationDispatchJobData.Tokenizer {
		BusinessProcessServer.Tokenizer server();
		String caseId();
	}

	private BusinessProcessServer server;
	private String caseId;

	// server:
	public BusinessProcessServer getServer(){
		return this.server;
	}
	public void setServer(BusinessProcessServer server){
		this.server = server;
	}

	// caseId:
	public String getCaseId(){
		return this.caseId;
	}
	public void setCaseId(String caseId){
		this.caseId = caseId;
	}

	public void caseId(String multirequestToken){
		setToken("caseId", multirequestToken);
	}


	public BusinessProcessNotificationDispatchJobData() {
		super();
	}

	public BusinessProcessNotificationDispatchJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		server = GsonParser.parseObject(jsonObject.getAsJsonObject("server"), BusinessProcessServer.class);
		caseId = GsonParser.parseString(jsonObject.get("caseId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBusinessProcessNotificationDispatchJobData");
		kparams.add("server", this.server);
		kparams.add("caseId", this.caseId);
		return kparams;
	}

}

