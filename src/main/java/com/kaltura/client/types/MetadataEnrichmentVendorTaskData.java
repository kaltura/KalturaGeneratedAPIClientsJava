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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MetadataEnrichmentVendorTaskData.Tokenizer.class)
public class MetadataEnrichmentVendorTaskData extends VendorTaskData {
	
	public interface Tokenizer extends VendorTaskData.Tokenizer {
		String detailLevel();
		String instruction();
		String outputJson();
	}

	/**
	 * The level of detail for the metadata enrichment process.
	 */
	private String detailLevel;
	/**
	 * Instructions describing what should be taken into account during the metadata
	  enrichment process.
	 */
	private String instruction;
	/**
	 * Metadata enrichment result as JSON string.   For example: {"titles": ["The first
	  title", "The second title"], "descriptions": ["The first description"], "tags":
	  ["Tag1", "Tag2"]}
	 */
	private String outputJson;

	// detailLevel:
	public String getDetailLevel(){
		return this.detailLevel;
	}
	public void setDetailLevel(String detailLevel){
		this.detailLevel = detailLevel;
	}

	public void detailLevel(String multirequestToken){
		setToken("detailLevel", multirequestToken);
	}

	// instruction:
	public String getInstruction(){
		return this.instruction;
	}
	public void setInstruction(String instruction){
		this.instruction = instruction;
	}

	public void instruction(String multirequestToken){
		setToken("instruction", multirequestToken);
	}

	// outputJson:
	public String getOutputJson(){
		return this.outputJson;
	}
	public void setOutputJson(String outputJson){
		this.outputJson = outputJson;
	}

	public void outputJson(String multirequestToken){
		setToken("outputJson", multirequestToken);
	}


	public MetadataEnrichmentVendorTaskData() {
		super();
	}

	public MetadataEnrichmentVendorTaskData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		detailLevel = GsonParser.parseString(jsonObject.get("detailLevel"));
		instruction = GsonParser.parseString(jsonObject.get("instruction"));
		outputJson = GsonParser.parseString(jsonObject.get("outputJson"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMetadataEnrichmentVendorTaskData");
		kparams.add("detailLevel", this.detailLevel);
		kparams.add("instruction", this.instruction);
		kparams.add("outputJson", this.outputJson);
		return kparams;
	}

}

