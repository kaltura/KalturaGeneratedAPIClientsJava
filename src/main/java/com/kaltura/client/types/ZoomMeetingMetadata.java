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
import com.kaltura.client.enums.RecordingType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ZoomMeetingMetadata.Tokenizer.class)
public class ZoomMeetingMetadata extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String uuid();
		String meetingId();
		String accountId();
		String hostId();
		String topic();
		String meetingStartTime();
		String type();
	}

	private String uuid;
	private String meetingId;
	private String accountId;
	private String hostId;
	private String topic;
	private String meetingStartTime;
	private RecordingType type;

	// uuid:
	public String getUuid(){
		return this.uuid;
	}
	public void setUuid(String uuid){
		this.uuid = uuid;
	}

	public void uuid(String multirequestToken){
		setToken("uuid", multirequestToken);
	}

	// meetingId:
	public String getMeetingId(){
		return this.meetingId;
	}
	public void setMeetingId(String meetingId){
		this.meetingId = meetingId;
	}

	public void meetingId(String multirequestToken){
		setToken("meetingId", multirequestToken);
	}

	// accountId:
	public String getAccountId(){
		return this.accountId;
	}
	public void setAccountId(String accountId){
		this.accountId = accountId;
	}

	public void accountId(String multirequestToken){
		setToken("accountId", multirequestToken);
	}

	// hostId:
	public String getHostId(){
		return this.hostId;
	}
	public void setHostId(String hostId){
		this.hostId = hostId;
	}

	public void hostId(String multirequestToken){
		setToken("hostId", multirequestToken);
	}

	// topic:
	public String getTopic(){
		return this.topic;
	}
	public void setTopic(String topic){
		this.topic = topic;
	}

	public void topic(String multirequestToken){
		setToken("topic", multirequestToken);
	}

	// meetingStartTime:
	public String getMeetingStartTime(){
		return this.meetingStartTime;
	}
	public void setMeetingStartTime(String meetingStartTime){
		this.meetingStartTime = meetingStartTime;
	}

	public void meetingStartTime(String multirequestToken){
		setToken("meetingStartTime", multirequestToken);
	}

	// type:
	public RecordingType getType(){
		return this.type;
	}
	public void setType(RecordingType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}


	public ZoomMeetingMetadata() {
		super();
	}

	public ZoomMeetingMetadata(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		uuid = GsonParser.parseString(jsonObject.get("uuid"));
		meetingId = GsonParser.parseString(jsonObject.get("meetingId"));
		accountId = GsonParser.parseString(jsonObject.get("accountId"));
		hostId = GsonParser.parseString(jsonObject.get("hostId"));
		topic = GsonParser.parseString(jsonObject.get("topic"));
		meetingStartTime = GsonParser.parseString(jsonObject.get("meetingStartTime"));
		type = RecordingType.get(GsonParser.parseInt(jsonObject.get("type")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaZoomMeetingMetadata");
		kparams.add("uuid", this.uuid);
		kparams.add("meetingId", this.meetingId);
		kparams.add("accountId", this.accountId);
		kparams.add("hostId", this.hostId);
		kparams.add("topic", this.topic);
		kparams.add("meetingStartTime", this.meetingStartTime);
		kparams.add("type", this.type);
		return kparams;
	}

}

