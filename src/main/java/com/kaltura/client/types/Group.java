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
import com.kaltura.client.enums.GroupProcessStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Group.Tokenizer.class)
public class Group extends BaseUser {
	
	public interface Tokenizer extends BaseUser.Tokenizer {
		String membersCount();
		String processStatus();
	}

	private Integer membersCount;
	private GroupProcessStatus processStatus;

	// membersCount:
	public Integer getMembersCount(){
		return this.membersCount;
	}
	// processStatus:
	public GroupProcessStatus getProcessStatus(){
		return this.processStatus;
	}
	public void setProcessStatus(GroupProcessStatus processStatus){
		this.processStatus = processStatus;
	}

	public void processStatus(String multirequestToken){
		setToken("processStatus", multirequestToken);
	}


	public Group() {
		super();
	}

	public Group(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		membersCount = GsonParser.parseInt(jsonObject.get("membersCount"));
		processStatus = GroupProcessStatus.get(GsonParser.parseInt(jsonObject.get("processStatus")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaGroup");
		kparams.add("processStatus", this.processStatus);
		return kparams;
	}

}

