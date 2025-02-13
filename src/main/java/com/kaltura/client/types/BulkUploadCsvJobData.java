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
import com.kaltura.client.enums.BulkUploadCsvVersion;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Represents the Bulk upload job data for xml bulk upload
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BulkUploadCsvJobData.Tokenizer.class)
public class BulkUploadCsvJobData extends BulkUploadJobData {
	
	public interface Tokenizer extends BulkUploadJobData.Tokenizer {
		String csvVersion();
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> columns();
		String processObjectId();
		String processObjectType();
	}

	/**
	 * The version of the csv file
	 */
	private BulkUploadCsvVersion csvVersion;
	/**
	 * Array containing CSV headers
	 */
	private List<StringHolder> columns;
	/**
	 * The object in process
	 */
	private String processObjectId;
	/**
	 * The type of the object in process
	 */
	private String processObjectType;

	// csvVersion:
	public BulkUploadCsvVersion getCsvVersion(){
		return this.csvVersion;
	}
	// columns:
	public List<StringHolder> getColumns(){
		return this.columns;
	}
	public void setColumns(List<StringHolder> columns){
		this.columns = columns;
	}

	// processObjectId:
	public String getProcessObjectId(){
		return this.processObjectId;
	}
	public void setProcessObjectId(String processObjectId){
		this.processObjectId = processObjectId;
	}

	public void processObjectId(String multirequestToken){
		setToken("processObjectId", multirequestToken);
	}

	// processObjectType:
	public String getProcessObjectType(){
		return this.processObjectType;
	}
	public void setProcessObjectType(String processObjectType){
		this.processObjectType = processObjectType;
	}

	public void processObjectType(String multirequestToken){
		setToken("processObjectType", multirequestToken);
	}


	public BulkUploadCsvJobData() {
		super();
	}

	public BulkUploadCsvJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		csvVersion = BulkUploadCsvVersion.get(GsonParser.parseInt(jsonObject.get("csvVersion")));
		columns = GsonParser.parseArray(jsonObject.getAsJsonArray("columns"), StringHolder.class);
		processObjectId = GsonParser.parseString(jsonObject.get("processObjectId"));
		processObjectType = GsonParser.parseString(jsonObject.get("processObjectType"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBulkUploadCsvJobData");
		kparams.add("columns", this.columns);
		kparams.add("processObjectId", this.processObjectId);
		kparams.add("processObjectType", this.processObjectType);
		return kparams;
	}

}

