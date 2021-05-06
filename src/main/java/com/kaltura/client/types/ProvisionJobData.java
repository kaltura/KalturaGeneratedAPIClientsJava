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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ProvisionJobData.Tokenizer.class)
public class ProvisionJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String streamID();
		String backupStreamID();
		String rtmp();
		String encoderIP();
		String backupEncoderIP();
		String encoderPassword();
		String encoderUsername();
		String endDate();
		String returnVal();
		String mediaType();
		String primaryBroadcastingUrl();
		String secondaryBroadcastingUrl();
		String streamName();
	}

	private String streamID;
	private String backupStreamID;
	private String rtmp;
	private String encoderIP;
	private String backupEncoderIP;
	private String encoderPassword;
	private String encoderUsername;
	private Integer endDate;
	private String returnVal;
	private Integer mediaType;
	private String primaryBroadcastingUrl;
	private String secondaryBroadcastingUrl;
	private String streamName;

	// streamID:
	public String getStreamID(){
		return this.streamID;
	}
	public void setStreamID(String streamID){
		this.streamID = streamID;
	}

	public void streamID(String multirequestToken){
		setToken("streamID", multirequestToken);
	}

	// backupStreamID:
	public String getBackupStreamID(){
		return this.backupStreamID;
	}
	public void setBackupStreamID(String backupStreamID){
		this.backupStreamID = backupStreamID;
	}

	public void backupStreamID(String multirequestToken){
		setToken("backupStreamID", multirequestToken);
	}

	// rtmp:
	public String getRtmp(){
		return this.rtmp;
	}
	public void setRtmp(String rtmp){
		this.rtmp = rtmp;
	}

	public void rtmp(String multirequestToken){
		setToken("rtmp", multirequestToken);
	}

	// encoderIP:
	public String getEncoderIP(){
		return this.encoderIP;
	}
	public void setEncoderIP(String encoderIP){
		this.encoderIP = encoderIP;
	}

	public void encoderIP(String multirequestToken){
		setToken("encoderIP", multirequestToken);
	}

	// backupEncoderIP:
	public String getBackupEncoderIP(){
		return this.backupEncoderIP;
	}
	public void setBackupEncoderIP(String backupEncoderIP){
		this.backupEncoderIP = backupEncoderIP;
	}

	public void backupEncoderIP(String multirequestToken){
		setToken("backupEncoderIP", multirequestToken);
	}

	// encoderPassword:
	public String getEncoderPassword(){
		return this.encoderPassword;
	}
	public void setEncoderPassword(String encoderPassword){
		this.encoderPassword = encoderPassword;
	}

	public void encoderPassword(String multirequestToken){
		setToken("encoderPassword", multirequestToken);
	}

	// encoderUsername:
	public String getEncoderUsername(){
		return this.encoderUsername;
	}
	public void setEncoderUsername(String encoderUsername){
		this.encoderUsername = encoderUsername;
	}

	public void encoderUsername(String multirequestToken){
		setToken("encoderUsername", multirequestToken);
	}

	// endDate:
	public Integer getEndDate(){
		return this.endDate;
	}
	public void setEndDate(Integer endDate){
		this.endDate = endDate;
	}

	public void endDate(String multirequestToken){
		setToken("endDate", multirequestToken);
	}

	// returnVal:
	public String getReturnVal(){
		return this.returnVal;
	}
	public void setReturnVal(String returnVal){
		this.returnVal = returnVal;
	}

	public void returnVal(String multirequestToken){
		setToken("returnVal", multirequestToken);
	}

	// mediaType:
	public Integer getMediaType(){
		return this.mediaType;
	}
	public void setMediaType(Integer mediaType){
		this.mediaType = mediaType;
	}

	public void mediaType(String multirequestToken){
		setToken("mediaType", multirequestToken);
	}

	// primaryBroadcastingUrl:
	public String getPrimaryBroadcastingUrl(){
		return this.primaryBroadcastingUrl;
	}
	public void setPrimaryBroadcastingUrl(String primaryBroadcastingUrl){
		this.primaryBroadcastingUrl = primaryBroadcastingUrl;
	}

	public void primaryBroadcastingUrl(String multirequestToken){
		setToken("primaryBroadcastingUrl", multirequestToken);
	}

	// secondaryBroadcastingUrl:
	public String getSecondaryBroadcastingUrl(){
		return this.secondaryBroadcastingUrl;
	}
	public void setSecondaryBroadcastingUrl(String secondaryBroadcastingUrl){
		this.secondaryBroadcastingUrl = secondaryBroadcastingUrl;
	}

	public void secondaryBroadcastingUrl(String multirequestToken){
		setToken("secondaryBroadcastingUrl", multirequestToken);
	}

	// streamName:
	public String getStreamName(){
		return this.streamName;
	}
	public void setStreamName(String streamName){
		this.streamName = streamName;
	}

	public void streamName(String multirequestToken){
		setToken("streamName", multirequestToken);
	}


	public ProvisionJobData() {
		super();
	}

	public ProvisionJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		streamID = GsonParser.parseString(jsonObject.get("streamID"));
		backupStreamID = GsonParser.parseString(jsonObject.get("backupStreamID"));
		rtmp = GsonParser.parseString(jsonObject.get("rtmp"));
		encoderIP = GsonParser.parseString(jsonObject.get("encoderIP"));
		backupEncoderIP = GsonParser.parseString(jsonObject.get("backupEncoderIP"));
		encoderPassword = GsonParser.parseString(jsonObject.get("encoderPassword"));
		encoderUsername = GsonParser.parseString(jsonObject.get("encoderUsername"));
		endDate = GsonParser.parseInt(jsonObject.get("endDate"));
		returnVal = GsonParser.parseString(jsonObject.get("returnVal"));
		mediaType = GsonParser.parseInt(jsonObject.get("mediaType"));
		primaryBroadcastingUrl = GsonParser.parseString(jsonObject.get("primaryBroadcastingUrl"));
		secondaryBroadcastingUrl = GsonParser.parseString(jsonObject.get("secondaryBroadcastingUrl"));
		streamName = GsonParser.parseString(jsonObject.get("streamName"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaProvisionJobData");
		kparams.add("streamID", this.streamID);
		kparams.add("backupStreamID", this.backupStreamID);
		kparams.add("rtmp", this.rtmp);
		kparams.add("encoderIP", this.encoderIP);
		kparams.add("backupEncoderIP", this.backupEncoderIP);
		kparams.add("encoderPassword", this.encoderPassword);
		kparams.add("encoderUsername", this.encoderUsername);
		kparams.add("endDate", this.endDate);
		kparams.add("returnVal", this.returnVal);
		kparams.add("mediaType", this.mediaType);
		kparams.add("primaryBroadcastingUrl", this.primaryBroadcastingUrl);
		kparams.add("secondaryBroadcastingUrl", this.secondaryBroadcastingUrl);
		kparams.add("streamName", this.streamName);
		return kparams;
	}

}

