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
import com.kaltura.client.enums.RoomType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(RoomEntry.Tokenizer.class)
public class RoomEntry extends BaseEntry {
	
	public interface Tokenizer extends BaseEntry.Tokenizer {
		String roomType();
		String broadcastEntryId();
		String templateRoomEntryId();
		String recordedEntryId();
	}

	private RoomType roomType;
	/**
	 * The entryId of the broadcast that the room streaming to
	 */
	private String broadcastEntryId;
	/**
	 * The entryId of the room where settings will be taken from
	 */
	private String templateRoomEntryId;
	/**
	 * The entryId of the recording
	 */
	private String recordedEntryId;

	// roomType:
	public RoomType getRoomType(){
		return this.roomType;
	}
	public void setRoomType(RoomType roomType){
		this.roomType = roomType;
	}

	public void roomType(String multirequestToken){
		setToken("roomType", multirequestToken);
	}

	// broadcastEntryId:
	public String getBroadcastEntryId(){
		return this.broadcastEntryId;
	}
	public void setBroadcastEntryId(String broadcastEntryId){
		this.broadcastEntryId = broadcastEntryId;
	}

	public void broadcastEntryId(String multirequestToken){
		setToken("broadcastEntryId", multirequestToken);
	}

	// templateRoomEntryId:
	public String getTemplateRoomEntryId(){
		return this.templateRoomEntryId;
	}
	public void setTemplateRoomEntryId(String templateRoomEntryId){
		this.templateRoomEntryId = templateRoomEntryId;
	}

	public void templateRoomEntryId(String multirequestToken){
		setToken("templateRoomEntryId", multirequestToken);
	}

	// recordedEntryId:
	public String getRecordedEntryId(){
		return this.recordedEntryId;
	}
	public void setRecordedEntryId(String recordedEntryId){
		this.recordedEntryId = recordedEntryId;
	}

	public void recordedEntryId(String multirequestToken){
		setToken("recordedEntryId", multirequestToken);
	}


	public RoomEntry() {
		super();
	}

	public RoomEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		roomType = RoomType.get(GsonParser.parseInt(jsonObject.get("roomType")));
		broadcastEntryId = GsonParser.parseString(jsonObject.get("broadcastEntryId"));
		templateRoomEntryId = GsonParser.parseString(jsonObject.get("templateRoomEntryId"));
		recordedEntryId = GsonParser.parseString(jsonObject.get("recordedEntryId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRoomEntry");
		kparams.add("roomType", this.roomType);
		kparams.add("broadcastEntryId", this.broadcastEntryId);
		kparams.add("templateRoomEntryId", this.templateRoomEntryId);
		kparams.add("recordedEntryId", this.recordedEntryId);
		return kparams;
	}

}

