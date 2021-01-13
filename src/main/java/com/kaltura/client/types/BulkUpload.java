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
import com.kaltura.client.enums.BatchJobErrorTypes;
import com.kaltura.client.enums.BatchJobStatus;
import com.kaltura.client.enums.BulkUploadObjectType;
import com.kaltura.client.enums.BulkUploadType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUpload.Tokenizer.class)
public class BulkUpload extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String uploadedBy();
		String uploadedByUserId();
		String uploadedOn();
		String numOfEntries();
		String status();
		String logFileUrl();
		String csvFileUrl();
		String bulkFileUrl();
		String bulkUploadType();
		RequestBuilder.ListTokenizer<BulkUploadResult.Tokenizer> results();
		String error();
		String errorType();
		String errorNumber();
		String fileName();
		String description();
		String numOfObjects();
		String bulkUploadObjectType();
	}

	private Long id;
	private String uploadedBy;
	private String uploadedByUserId;
	private Integer uploadedOn;
	private Integer numOfEntries;
	private BatchJobStatus status;
	private String logFileUrl;
	private String csvFileUrl;
	private String bulkFileUrl;
	private BulkUploadType bulkUploadType;
	private List<BulkUploadResult> results;
	private String error;
	private BatchJobErrorTypes errorType;
	private Integer errorNumber;
	private String fileName;
	private String description;
	private Integer numOfObjects;
	private BulkUploadObjectType bulkUploadObjectType;

	// id:
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// uploadedBy:
	public String getUploadedBy(){
		return this.uploadedBy;
	}
	public void setUploadedBy(String uploadedBy){
		this.uploadedBy = uploadedBy;
	}

	public void uploadedBy(String multirequestToken){
		setToken("uploadedBy", multirequestToken);
	}

	// uploadedByUserId:
	public String getUploadedByUserId(){
		return this.uploadedByUserId;
	}
	public void setUploadedByUserId(String uploadedByUserId){
		this.uploadedByUserId = uploadedByUserId;
	}

	public void uploadedByUserId(String multirequestToken){
		setToken("uploadedByUserId", multirequestToken);
	}

	// uploadedOn:
	public Integer getUploadedOn(){
		return this.uploadedOn;
	}
	public void setUploadedOn(Integer uploadedOn){
		this.uploadedOn = uploadedOn;
	}

	public void uploadedOn(String multirequestToken){
		setToken("uploadedOn", multirequestToken);
	}

	// numOfEntries:
	public Integer getNumOfEntries(){
		return this.numOfEntries;
	}
	public void setNumOfEntries(Integer numOfEntries){
		this.numOfEntries = numOfEntries;
	}

	public void numOfEntries(String multirequestToken){
		setToken("numOfEntries", multirequestToken);
	}

	// status:
	public BatchJobStatus getStatus(){
		return this.status;
	}
	public void setStatus(BatchJobStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// logFileUrl:
	public String getLogFileUrl(){
		return this.logFileUrl;
	}
	public void setLogFileUrl(String logFileUrl){
		this.logFileUrl = logFileUrl;
	}

	public void logFileUrl(String multirequestToken){
		setToken("logFileUrl", multirequestToken);
	}

	// csvFileUrl:
	public String getCsvFileUrl(){
		return this.csvFileUrl;
	}
	public void setCsvFileUrl(String csvFileUrl){
		this.csvFileUrl = csvFileUrl;
	}

	public void csvFileUrl(String multirequestToken){
		setToken("csvFileUrl", multirequestToken);
	}

	// bulkFileUrl:
	public String getBulkFileUrl(){
		return this.bulkFileUrl;
	}
	public void setBulkFileUrl(String bulkFileUrl){
		this.bulkFileUrl = bulkFileUrl;
	}

	public void bulkFileUrl(String multirequestToken){
		setToken("bulkFileUrl", multirequestToken);
	}

	// bulkUploadType:
	public BulkUploadType getBulkUploadType(){
		return this.bulkUploadType;
	}
	public void setBulkUploadType(BulkUploadType bulkUploadType){
		this.bulkUploadType = bulkUploadType;
	}

	public void bulkUploadType(String multirequestToken){
		setToken("bulkUploadType", multirequestToken);
	}

	// results:
	public List<BulkUploadResult> getResults(){
		return this.results;
	}
	public void setResults(List<BulkUploadResult> results){
		this.results = results;
	}

	// error:
	public String getError(){
		return this.error;
	}
	public void setError(String error){
		this.error = error;
	}

	public void error(String multirequestToken){
		setToken("error", multirequestToken);
	}

	// errorType:
	public BatchJobErrorTypes getErrorType(){
		return this.errorType;
	}
	public void setErrorType(BatchJobErrorTypes errorType){
		this.errorType = errorType;
	}

	public void errorType(String multirequestToken){
		setToken("errorType", multirequestToken);
	}

	// errorNumber:
	public Integer getErrorNumber(){
		return this.errorNumber;
	}
	public void setErrorNumber(Integer errorNumber){
		this.errorNumber = errorNumber;
	}

	public void errorNumber(String multirequestToken){
		setToken("errorNumber", multirequestToken);
	}

	// fileName:
	public String getFileName(){
		return this.fileName;
	}
	public void setFileName(String fileName){
		this.fileName = fileName;
	}

	public void fileName(String multirequestToken){
		setToken("fileName", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// numOfObjects:
	public Integer getNumOfObjects(){
		return this.numOfObjects;
	}
	public void setNumOfObjects(Integer numOfObjects){
		this.numOfObjects = numOfObjects;
	}

	public void numOfObjects(String multirequestToken){
		setToken("numOfObjects", multirequestToken);
	}

	// bulkUploadObjectType:
	public BulkUploadObjectType getBulkUploadObjectType(){
		return this.bulkUploadObjectType;
	}
	public void setBulkUploadObjectType(BulkUploadObjectType bulkUploadObjectType){
		this.bulkUploadObjectType = bulkUploadObjectType;
	}

	public void bulkUploadObjectType(String multirequestToken){
		setToken("bulkUploadObjectType", multirequestToken);
	}


	public BulkUpload() {
		super();
	}

	public BulkUpload(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseLong(jsonObject.get("id"));
		uploadedBy = GsonParser.parseString(jsonObject.get("uploadedBy"));
		uploadedByUserId = GsonParser.parseString(jsonObject.get("uploadedByUserId"));
		uploadedOn = GsonParser.parseInt(jsonObject.get("uploadedOn"));
		numOfEntries = GsonParser.parseInt(jsonObject.get("numOfEntries"));
		status = BatchJobStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		logFileUrl = GsonParser.parseString(jsonObject.get("logFileUrl"));
		csvFileUrl = GsonParser.parseString(jsonObject.get("csvFileUrl"));
		bulkFileUrl = GsonParser.parseString(jsonObject.get("bulkFileUrl"));
		bulkUploadType = BulkUploadType.get(GsonParser.parseString(jsonObject.get("bulkUploadType")));
		results = GsonParser.parseArray(jsonObject.getAsJsonArray("results"), BulkUploadResult.class);
		error = GsonParser.parseString(jsonObject.get("error"));
		errorType = BatchJobErrorTypes.get(GsonParser.parseInt(jsonObject.get("errorType")));
		errorNumber = GsonParser.parseInt(jsonObject.get("errorNumber"));
		fileName = GsonParser.parseString(jsonObject.get("fileName"));
		description = GsonParser.parseString(jsonObject.get("description"));
		numOfObjects = GsonParser.parseInt(jsonObject.get("numOfObjects"));
		bulkUploadObjectType = BulkUploadObjectType.get(GsonParser.parseString(jsonObject.get("bulkUploadObjectType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUpload");
		kparams.add("id", this.id);
		kparams.add("uploadedBy", this.uploadedBy);
		kparams.add("uploadedByUserId", this.uploadedByUserId);
		kparams.add("uploadedOn", this.uploadedOn);
		kparams.add("numOfEntries", this.numOfEntries);
		kparams.add("status", this.status);
		kparams.add("logFileUrl", this.logFileUrl);
		kparams.add("csvFileUrl", this.csvFileUrl);
		kparams.add("bulkFileUrl", this.bulkFileUrl);
		kparams.add("bulkUploadType", this.bulkUploadType);
		kparams.add("results", this.results);
		kparams.add("error", this.error);
		kparams.add("errorType", this.errorType);
		kparams.add("errorNumber", this.errorNumber);
		kparams.add("fileName", this.fileName);
		kparams.add("description", this.description);
		kparams.add("numOfObjects", this.numOfObjects);
		kparams.add("bulkUploadObjectType", this.bulkUploadObjectType);
		return kparams;
	}

}

