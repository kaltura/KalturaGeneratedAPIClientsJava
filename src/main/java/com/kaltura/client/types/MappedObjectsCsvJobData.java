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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MappedObjectsCsvJobData.Tokenizer.class)
public abstract class MappedObjectsCsvJobData extends ExportCsvJobData {
	
	public interface Tokenizer extends ExportCsvJobData.Tokenizer {
		String metadataProfileId();
		RequestBuilder.ListTokenizer<CsvAdditionalFieldInfo.Tokenizer> additionalFields();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> mappedFields();
	}

	/**
	 * The metadata profile we should look the xpath in
	 */
	private Integer metadataProfileId;
	/**
	 * The xpath to look in the metadataProfileId  and the wanted csv field name
	 */
	private List<CsvAdditionalFieldInfo> additionalFields;
	/**
	 * Array of header names and their mapped user fields
	 */
	private List<KeyValue> mappedFields;

	// metadataProfileId:
	public Integer getMetadataProfileId(){
		return this.metadataProfileId;
	}
	public void setMetadataProfileId(Integer metadataProfileId){
		this.metadataProfileId = metadataProfileId;
	}

	public void metadataProfileId(String multirequestToken){
		setToken("metadataProfileId", multirequestToken);
	}

	// additionalFields:
	public List<CsvAdditionalFieldInfo> getAdditionalFields(){
		return this.additionalFields;
	}
	public void setAdditionalFields(List<CsvAdditionalFieldInfo> additionalFields){
		this.additionalFields = additionalFields;
	}

	// mappedFields:
	public List<KeyValue> getMappedFields(){
		return this.mappedFields;
	}
	public void setMappedFields(List<KeyValue> mappedFields){
		this.mappedFields = mappedFields;
	}


	public MappedObjectsCsvJobData() {
		super();
	}

	public MappedObjectsCsvJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));
		additionalFields = GsonParser.parseArray(jsonObject.getAsJsonArray("additionalFields"), CsvAdditionalFieldInfo.class);
		mappedFields = GsonParser.parseArray(jsonObject.getAsJsonArray("mappedFields"), KeyValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMappedObjectsCsvJobData");
		kparams.add("metadataProfileId", this.metadataProfileId);
		kparams.add("additionalFields", this.additionalFields);
		kparams.add("mappedFields", this.mappedFields);
		return kparams;
	}

}

