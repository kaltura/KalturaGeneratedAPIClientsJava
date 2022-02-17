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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ConvertCaptionAssetJobData.Tokenizer.class)
public class ConvertCaptionAssetJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String captionAssetId();
		String fileLocation();
		String fileEncryptionKey();
		String fromType();
		String toType();
	}

	private String captionAssetId;
	private String fileLocation;
	private String fileEncryptionKey;
	private String fromType;
	private String toType;

	// captionAssetId:
	public String getCaptionAssetId(){
		return this.captionAssetId;
	}
	public void setCaptionAssetId(String captionAssetId){
		this.captionAssetId = captionAssetId;
	}

	public void captionAssetId(String multirequestToken){
		setToken("captionAssetId", multirequestToken);
	}

	// fileLocation:
	public String getFileLocation(){
		return this.fileLocation;
	}
	public void setFileLocation(String fileLocation){
		this.fileLocation = fileLocation;
	}

	public void fileLocation(String multirequestToken){
		setToken("fileLocation", multirequestToken);
	}

	// fileEncryptionKey:
	public String getFileEncryptionKey(){
		return this.fileEncryptionKey;
	}
	public void setFileEncryptionKey(String fileEncryptionKey){
		this.fileEncryptionKey = fileEncryptionKey;
	}

	public void fileEncryptionKey(String multirequestToken){
		setToken("fileEncryptionKey", multirequestToken);
	}

	// fromType:
	public String getFromType(){
		return this.fromType;
	}
	public void setFromType(String fromType){
		this.fromType = fromType;
	}

	public void fromType(String multirequestToken){
		setToken("fromType", multirequestToken);
	}

	// toType:
	public String getToType(){
		return this.toType;
	}
	public void setToType(String toType){
		this.toType = toType;
	}

	public void toType(String multirequestToken){
		setToken("toType", multirequestToken);
	}


	public ConvertCaptionAssetJobData() {
		super();
	}

	public ConvertCaptionAssetJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		captionAssetId = GsonParser.parseString(jsonObject.get("captionAssetId"));
		fileLocation = GsonParser.parseString(jsonObject.get("fileLocation"));
		fileEncryptionKey = GsonParser.parseString(jsonObject.get("fileEncryptionKey"));
		fromType = GsonParser.parseString(jsonObject.get("fromType"));
		toType = GsonParser.parseString(jsonObject.get("toType"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConvertCaptionAssetJobData");
		kparams.add("captionAssetId", this.captionAssetId);
		kparams.add("fileLocation", this.fileLocation);
		kparams.add("fileEncryptionKey", this.fileEncryptionKey);
		kparams.add("fromType", this.fromType);
		kparams.add("toType", this.toType);
		return kparams;
	}

}

