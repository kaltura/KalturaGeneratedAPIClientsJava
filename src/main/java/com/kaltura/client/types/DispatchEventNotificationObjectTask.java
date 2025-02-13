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
@MultiRequestBuilder.Tokenizer(DispatchEventNotificationObjectTask.Tokenizer.class)
public class DispatchEventNotificationObjectTask extends ObjectTask {
	
	public interface Tokenizer extends ObjectTask.Tokenizer {
		String eventNotificationTemplateId();
	}

	/**
	 * The event notification template id to dispatch
	 */
	private Integer eventNotificationTemplateId;

	// eventNotificationTemplateId:
	public Integer getEventNotificationTemplateId(){
		return this.eventNotificationTemplateId;
	}
	public void setEventNotificationTemplateId(Integer eventNotificationTemplateId){
		this.eventNotificationTemplateId = eventNotificationTemplateId;
	}

	public void eventNotificationTemplateId(String multirequestToken){
		setToken("eventNotificationTemplateId", multirequestToken);
	}


	public DispatchEventNotificationObjectTask() {
		super();
	}

	public DispatchEventNotificationObjectTask(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		eventNotificationTemplateId = GsonParser.parseInt(jsonObject.get("eventNotificationTemplateId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDispatchEventNotificationObjectTask");
		kparams.add("eventNotificationTemplateId", this.eventNotificationTemplateId);
		return kparams;
	}

}

