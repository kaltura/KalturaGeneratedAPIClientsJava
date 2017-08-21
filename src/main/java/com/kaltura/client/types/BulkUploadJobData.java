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
import com.kaltura.client.enums.BulkUploadObjectType;
import com.kaltura.client.enums.BulkUploadType;
import com.kaltura.client.types.BulkUploadObjectData;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadJobData.Tokenizer.class)
public class BulkUploadJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String userId();
		String uploadedBy();
		String conversionProfileId();
		String resultsFileLocalPath();
		String resultsFileUrl();
		String numOfEntries();
		String numOfObjects();
		String filePath();
		String bulkUploadObjectType();
		String fileName();
		BulkUploadObjectData.Tokenizer objectData();
		String type();
		String emailRecipients();
		String numOfErrorObjects();
	}

	private String userId;
	/**  The screen name of the user  */
	private String uploadedBy;
	/**  Selected profile id for all bulk entries  */
	private Integer conversionProfileId;
	/**  Created by the API  */
	private String resultsFileLocalPath;
	/**  Created by the API  */
	private String resultsFileUrl;
	/**  Number of created entries  */
	private Integer numOfEntries;
	/**  Number of created objects  */
	private Integer numOfObjects;
	/**  The bulk upload file path  */
	private String filePath;
	/**  Type of object for bulk upload  */
	private BulkUploadObjectType bulkUploadObjectType;
	/**  Friendly name of the file, used to be recognized later in the logs.  */
	private String fileName;
	/**  Data pertaining to the objects being uploaded  */
	private BulkUploadObjectData objectData;
	/**  Type of bulk upload  */
	private BulkUploadType type;
	/**  Recipients of the email for bulk upload success/failure  */
	private String emailRecipients;
	/**  Number of objects that finished on error status  */
	private Integer numOfErrorObjects;

	// userId:
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public void userId(String multirequestToken){
		setToken("userId", multirequestToken);
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

	// conversionProfileId:
	public Integer getConversionProfileId(){
		return this.conversionProfileId;
	}
	public void setConversionProfileId(Integer conversionProfileId){
		this.conversionProfileId = conversionProfileId;
	}

	public void conversionProfileId(String multirequestToken){
		setToken("conversionProfileId", multirequestToken);
	}

	// resultsFileLocalPath:
	public String getResultsFileLocalPath(){
		return this.resultsFileLocalPath;
	}
	public void setResultsFileLocalPath(String resultsFileLocalPath){
		this.resultsFileLocalPath = resultsFileLocalPath;
	}

	public void resultsFileLocalPath(String multirequestToken){
		setToken("resultsFileLocalPath", multirequestToken);
	}

	// resultsFileUrl:
	public String getResultsFileUrl(){
		return this.resultsFileUrl;
	}
	public void setResultsFileUrl(String resultsFileUrl){
		this.resultsFileUrl = resultsFileUrl;
	}

	public void resultsFileUrl(String multirequestToken){
		setToken("resultsFileUrl", multirequestToken);
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

	// filePath:
	public String getFilePath(){
		return this.filePath;
	}
	public void setFilePath(String filePath){
		this.filePath = filePath;
	}

	public void filePath(String multirequestToken){
		setToken("filePath", multirequestToken);
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

	// objectData:
	public BulkUploadObjectData getObjectData(){
		return this.objectData;
	}
	public void setObjectData(BulkUploadObjectData objectData){
		this.objectData = objectData;
	}

	// type:
	public BulkUploadType getType(){
		return this.type;
	}
	public void setType(BulkUploadType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// emailRecipients:
	public String getEmailRecipients(){
		return this.emailRecipients;
	}
	public void setEmailRecipients(String emailRecipients){
		this.emailRecipients = emailRecipients;
	}

	public void emailRecipients(String multirequestToken){
		setToken("emailRecipients", multirequestToken);
	}

	// numOfErrorObjects:
	public Integer getNumOfErrorObjects(){
		return this.numOfErrorObjects;
	}
	public void setNumOfErrorObjects(Integer numOfErrorObjects){
		this.numOfErrorObjects = numOfErrorObjects;
	}

	public void numOfErrorObjects(String multirequestToken){
		setToken("numOfErrorObjects", multirequestToken);
	}


	public BulkUploadJobData() {
		super();
	}

	public BulkUploadJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		userId = GsonParser.parseString(jsonObject.get("userId"));
		uploadedBy = GsonParser.parseString(jsonObject.get("uploadedBy"));
		conversionProfileId = GsonParser.parseInt(jsonObject.get("conversionProfileId"));
		resultsFileLocalPath = GsonParser.parseString(jsonObject.get("resultsFileLocalPath"));
		resultsFileUrl = GsonParser.parseString(jsonObject.get("resultsFileUrl"));
		numOfEntries = GsonParser.parseInt(jsonObject.get("numOfEntries"));
		numOfObjects = GsonParser.parseInt(jsonObject.get("numOfObjects"));
		filePath = GsonParser.parseString(jsonObject.get("filePath"));
		bulkUploadObjectType = BulkUploadObjectType.get(GsonParser.parseString(jsonObject.get("bulkUploadObjectType")));
		fileName = GsonParser.parseString(jsonObject.get("fileName"));
		objectData = GsonParser.parseObject(jsonObject.getAsJsonObject("objectData"), BulkUploadObjectData.class);
		type = BulkUploadType.get(GsonParser.parseString(jsonObject.get("type")));
		emailRecipients = GsonParser.parseString(jsonObject.get("emailRecipients"));
		numOfErrorObjects = GsonParser.parseInt(jsonObject.get("numOfErrorObjects"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadJobData");
		kparams.add("fileName", this.fileName);
		kparams.add("emailRecipients", this.emailRecipients);
		kparams.add("numOfErrorObjects", this.numOfErrorObjects);
		return kparams;
	}

}

