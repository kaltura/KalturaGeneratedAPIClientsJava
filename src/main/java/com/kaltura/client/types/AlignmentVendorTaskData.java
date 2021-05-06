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
@MultiRequestBuilder.Tokenizer(AlignmentVendorTaskData.Tokenizer.class)
public class AlignmentVendorTaskData extends VendorTaskDataCaptionAsset {
	
	public interface Tokenizer extends VendorTaskDataCaptionAsset.Tokenizer {
		String textTranscriptAssetId();
		String jsonTranscriptAssetId();
	}

	/**
	 * The id of the text transcript object the vendor should use while runing the
	  alignment task
	 */
	private String textTranscriptAssetId;
	/**
	 * Optional - The id of the json transcript object the vendor should update once
	  alignment task processing is done
	 */
	private String jsonTranscriptAssetId;

	// textTranscriptAssetId:
	public String getTextTranscriptAssetId(){
		return this.textTranscriptAssetId;
	}
	public void setTextTranscriptAssetId(String textTranscriptAssetId){
		this.textTranscriptAssetId = textTranscriptAssetId;
	}

	public void textTranscriptAssetId(String multirequestToken){
		setToken("textTranscriptAssetId", multirequestToken);
	}

	// jsonTranscriptAssetId:
	public String getJsonTranscriptAssetId(){
		return this.jsonTranscriptAssetId;
	}
	public void setJsonTranscriptAssetId(String jsonTranscriptAssetId){
		this.jsonTranscriptAssetId = jsonTranscriptAssetId;
	}

	public void jsonTranscriptAssetId(String multirequestToken){
		setToken("jsonTranscriptAssetId", multirequestToken);
	}


	public AlignmentVendorTaskData() {
		super();
	}

	public AlignmentVendorTaskData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		textTranscriptAssetId = GsonParser.parseString(jsonObject.get("textTranscriptAssetId"));
		jsonTranscriptAssetId = GsonParser.parseString(jsonObject.get("jsonTranscriptAssetId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAlignmentVendorTaskData");
		kparams.add("textTranscriptAssetId", this.textTranscriptAssetId);
		kparams.add("jsonTranscriptAssetId", this.jsonTranscriptAssetId);
		return kparams;
	}

}

