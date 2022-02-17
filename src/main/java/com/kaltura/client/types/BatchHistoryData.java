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
// Copyright (C) 2006-2022  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(BatchHistoryData.Tokenizer.class)
public class BatchHistoryData extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String schedulerId();
		String workerId();
		String batchIndex();
		String timeStamp();
		String message();
		String errType();
		String errNumber();
		String hostName();
		String sessionId();
		String schedulerName();
	}

	private Integer schedulerId;
	private Integer workerId;
	private Integer batchIndex;
	private Integer timeStamp;
	private String message;
	private Integer errType;
	private Integer errNumber;
	private String hostName;
	private String sessionId;
	private String schedulerName;

	// schedulerId:
	public Integer getSchedulerId(){
		return this.schedulerId;
	}
	public void setSchedulerId(Integer schedulerId){
		this.schedulerId = schedulerId;
	}

	public void schedulerId(String multirequestToken){
		setToken("schedulerId", multirequestToken);
	}

	// workerId:
	public Integer getWorkerId(){
		return this.workerId;
	}
	public void setWorkerId(Integer workerId){
		this.workerId = workerId;
	}

	public void workerId(String multirequestToken){
		setToken("workerId", multirequestToken);
	}

	// batchIndex:
	public Integer getBatchIndex(){
		return this.batchIndex;
	}
	public void setBatchIndex(Integer batchIndex){
		this.batchIndex = batchIndex;
	}

	public void batchIndex(String multirequestToken){
		setToken("batchIndex", multirequestToken);
	}

	// timeStamp:
	public Integer getTimeStamp(){
		return this.timeStamp;
	}
	public void setTimeStamp(Integer timeStamp){
		this.timeStamp = timeStamp;
	}

	public void timeStamp(String multirequestToken){
		setToken("timeStamp", multirequestToken);
	}

	// message:
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

	public void message(String multirequestToken){
		setToken("message", multirequestToken);
	}

	// errType:
	public Integer getErrType(){
		return this.errType;
	}
	public void setErrType(Integer errType){
		this.errType = errType;
	}

	public void errType(String multirequestToken){
		setToken("errType", multirequestToken);
	}

	// errNumber:
	public Integer getErrNumber(){
		return this.errNumber;
	}
	public void setErrNumber(Integer errNumber){
		this.errNumber = errNumber;
	}

	public void errNumber(String multirequestToken){
		setToken("errNumber", multirequestToken);
	}

	// hostName:
	public String getHostName(){
		return this.hostName;
	}
	public void setHostName(String hostName){
		this.hostName = hostName;
	}

	public void hostName(String multirequestToken){
		setToken("hostName", multirequestToken);
	}

	// sessionId:
	public String getSessionId(){
		return this.sessionId;
	}
	public void setSessionId(String sessionId){
		this.sessionId = sessionId;
	}

	public void sessionId(String multirequestToken){
		setToken("sessionId", multirequestToken);
	}

	// schedulerName:
	public String getSchedulerName(){
		return this.schedulerName;
	}
	public void setSchedulerName(String schedulerName){
		this.schedulerName = schedulerName;
	}

	public void schedulerName(String multirequestToken){
		setToken("schedulerName", multirequestToken);
	}


	public BatchHistoryData() {
		super();
	}

	public BatchHistoryData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		schedulerId = GsonParser.parseInt(jsonObject.get("schedulerId"));
		workerId = GsonParser.parseInt(jsonObject.get("workerId"));
		batchIndex = GsonParser.parseInt(jsonObject.get("batchIndex"));
		timeStamp = GsonParser.parseInt(jsonObject.get("timeStamp"));
		message = GsonParser.parseString(jsonObject.get("message"));
		errType = GsonParser.parseInt(jsonObject.get("errType"));
		errNumber = GsonParser.parseInt(jsonObject.get("errNumber"));
		hostName = GsonParser.parseString(jsonObject.get("hostName"));
		sessionId = GsonParser.parseString(jsonObject.get("sessionId"));
		schedulerName = GsonParser.parseString(jsonObject.get("schedulerName"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBatchHistoryData");
		kparams.add("schedulerId", this.schedulerId);
		kparams.add("workerId", this.workerId);
		kparams.add("batchIndex", this.batchIndex);
		kparams.add("timeStamp", this.timeStamp);
		kparams.add("message", this.message);
		kparams.add("errType", this.errType);
		kparams.add("errNumber", this.errNumber);
		kparams.add("hostName", this.hostName);
		kparams.add("sessionId", this.sessionId);
		kparams.add("schedulerName", this.schedulerName);
		return kparams;
	}

}

