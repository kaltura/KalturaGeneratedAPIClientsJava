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
import com.kaltura.client.enums.MetadataEnrichmentApplyMode;
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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MetadataEnrichmentVendorTaskData.Tokenizer.class)
public class MetadataEnrichmentVendorTaskData extends LocalizedVendorTaskData {
	
	public interface Tokenizer extends LocalizedVendorTaskData.Tokenizer {
		String detailLevel();
		String instruction();
		String shouldApply();
		String applyMode();
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> overrideFields();
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
	 * Indicates whether the metadata enrichment results should be automatically
	  applied on the task entry.   Default is false.
	 */
	private Boolean shouldApply;
	/**
	 * Specifies how metadata fields should be applied during enrichment.   If
	  'FILL_EMPTY_AND_OVERRIDE_LIST', use overrideFields to specify which fields to
	  override.
	 */
	private MetadataEnrichmentApplyMode applyMode;
	/**
	 * List of entry fields to override when applyMode is set to
	  'FILL_EMPTY_AND_OVERRIDE_LIST'.
	 */
	private List<StringHolder> overrideFields;

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

	// shouldApply:
	public Boolean getShouldApply(){
		return this.shouldApply;
	}
	public void setShouldApply(Boolean shouldApply){
		this.shouldApply = shouldApply;
	}

	public void shouldApply(String multirequestToken){
		setToken("shouldApply", multirequestToken);
	}

	// applyMode:
	public MetadataEnrichmentApplyMode getApplyMode(){
		return this.applyMode;
	}
	public void setApplyMode(MetadataEnrichmentApplyMode applyMode){
		this.applyMode = applyMode;
	}

	public void applyMode(String multirequestToken){
		setToken("applyMode", multirequestToken);
	}

	// overrideFields:
	public List<StringHolder> getOverrideFields(){
		return this.overrideFields;
	}
	public void setOverrideFields(List<StringHolder> overrideFields){
		this.overrideFields = overrideFields;
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
		shouldApply = GsonParser.parseBoolean(jsonObject.get("shouldApply"));
		applyMode = MetadataEnrichmentApplyMode.get(GsonParser.parseString(jsonObject.get("applyMode")));
		overrideFields = GsonParser.parseArray(jsonObject.getAsJsonArray("overrideFields"), StringHolder.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMetadataEnrichmentVendorTaskData");
		kparams.add("detailLevel", this.detailLevel);
		kparams.add("instruction", this.instruction);
		kparams.add("shouldApply", this.shouldApply);
		kparams.add("applyMode", this.applyMode);
		kparams.add("overrideFields", this.overrideFields);
		return kparams;
	}

}

