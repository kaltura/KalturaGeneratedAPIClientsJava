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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ExtractMediaJobData.Tokenizer.class)
public class ExtractMediaJobData extends ConvartableJobData {
	
	public interface Tokenizer extends ConvartableJobData.Tokenizer {
		String flavorAssetId();
		String calculateComplexity();
		String extractId3Tags();
		String destDataFilePath();
		String detectGOP();
	}

	private String flavorAssetId;
	private Boolean calculateComplexity;
	private Boolean extractId3Tags;
	/**
	 * The data output file
	 */
	private String destDataFilePath;
	private Integer detectGOP;

	// flavorAssetId:
	public String getFlavorAssetId(){
		return this.flavorAssetId;
	}
	public void setFlavorAssetId(String flavorAssetId){
		this.flavorAssetId = flavorAssetId;
	}

	public void flavorAssetId(String multirequestToken){
		setToken("flavorAssetId", multirequestToken);
	}

	// calculateComplexity:
	public Boolean getCalculateComplexity(){
		return this.calculateComplexity;
	}
	public void setCalculateComplexity(Boolean calculateComplexity){
		this.calculateComplexity = calculateComplexity;
	}

	public void calculateComplexity(String multirequestToken){
		setToken("calculateComplexity", multirequestToken);
	}

	// extractId3Tags:
	public Boolean getExtractId3Tags(){
		return this.extractId3Tags;
	}
	public void setExtractId3Tags(Boolean extractId3Tags){
		this.extractId3Tags = extractId3Tags;
	}

	public void extractId3Tags(String multirequestToken){
		setToken("extractId3Tags", multirequestToken);
	}

	// destDataFilePath:
	public String getDestDataFilePath(){
		return this.destDataFilePath;
	}
	public void setDestDataFilePath(String destDataFilePath){
		this.destDataFilePath = destDataFilePath;
	}

	public void destDataFilePath(String multirequestToken){
		setToken("destDataFilePath", multirequestToken);
	}

	// detectGOP:
	public Integer getDetectGOP(){
		return this.detectGOP;
	}
	public void setDetectGOP(Integer detectGOP){
		this.detectGOP = detectGOP;
	}

	public void detectGOP(String multirequestToken){
		setToken("detectGOP", multirequestToken);
	}


	public ExtractMediaJobData() {
		super();
	}

	public ExtractMediaJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
		calculateComplexity = GsonParser.parseBoolean(jsonObject.get("calculateComplexity"));
		extractId3Tags = GsonParser.parseBoolean(jsonObject.get("extractId3Tags"));
		destDataFilePath = GsonParser.parseString(jsonObject.get("destDataFilePath"));
		detectGOP = GsonParser.parseInt(jsonObject.get("detectGOP"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaExtractMediaJobData");
		kparams.add("flavorAssetId", this.flavorAssetId);
		kparams.add("calculateComplexity", this.calculateComplexity);
		kparams.add("extractId3Tags", this.extractId3Tags);
		kparams.add("destDataFilePath", this.destDataFilePath);
		kparams.add("detectGOP", this.detectGOP);
		return kparams;
	}

}

