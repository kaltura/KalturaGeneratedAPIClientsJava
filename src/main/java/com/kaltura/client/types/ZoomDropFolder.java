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
import com.kaltura.client.types.ZoomIntegrationSetting;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ZoomDropFolder.Tokenizer.class)
public class ZoomDropFolder extends DropFolder {
	
	public interface Tokenizer extends DropFolder.Tokenizer {
		String zoomVendorIntegrationId();
		ZoomIntegrationSetting.Tokenizer zoomVendorIntegration();
		String lastHandledMeetingTime();
	}

	private Integer zoomVendorIntegrationId;
	private ZoomIntegrationSetting zoomVendorIntegration;
	private Long lastHandledMeetingTime;

	// zoomVendorIntegrationId:
	public Integer getZoomVendorIntegrationId(){
		return this.zoomVendorIntegrationId;
	}
	// zoomVendorIntegration:
	public ZoomIntegrationSetting getZoomVendorIntegration(){
		return this.zoomVendorIntegration;
	}
	// lastHandledMeetingTime:
	public Long getLastHandledMeetingTime(){
		return this.lastHandledMeetingTime;
	}
	public void setLastHandledMeetingTime(Long lastHandledMeetingTime){
		this.lastHandledMeetingTime = lastHandledMeetingTime;
	}

	public void lastHandledMeetingTime(String multirequestToken){
		setToken("lastHandledMeetingTime", multirequestToken);
	}


	public ZoomDropFolder() {
		super();
	}

	public ZoomDropFolder(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		zoomVendorIntegrationId = GsonParser.parseInt(jsonObject.get("zoomVendorIntegrationId"));
		zoomVendorIntegration = GsonParser.parseObject(jsonObject.getAsJsonObject("zoomVendorIntegration"), ZoomIntegrationSetting.class);
		lastHandledMeetingTime = GsonParser.parseLong(jsonObject.get("lastHandledMeetingTime"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaZoomDropFolder");
		kparams.add("lastHandledMeetingTime", this.lastHandledMeetingTime);
		return kparams;
	}

}

