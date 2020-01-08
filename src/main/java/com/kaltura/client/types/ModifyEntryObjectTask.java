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
// Copyright (C) 2006-2020  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(ModifyEntryObjectTask.Tokenizer.class)
public class ModifyEntryObjectTask extends ObjectTask {
	
	public interface Tokenizer extends ObjectTask.Tokenizer {
		String inputMetadataProfileId();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> inputMetadata();
		String outputMetadataProfileId();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> outputMetadata();
		String inputUserId();
		String inputEntitledUsersEdit();
		String inputEntitledUsersPublish();
	}

	/**
	 * The input metadata profile id
	 */
	private Integer inputMetadataProfileId;
	/**
	 * array of {input metadata xpath location,entry field} objects
	 */
	private List<KeyValue> inputMetadata;
	/**
	 * The output metadata profile id
	 */
	private Integer outputMetadataProfileId;
	/**
	 * array of {output metadata xpath location,entry field} objects
	 */
	private List<KeyValue> outputMetadata;
	/**
	 * The input user id to set on the entry
	 */
	private String inputUserId;
	/**
	 * The input entitled users edit to set on the entry
	 */
	private String inputEntitledUsersEdit;
	/**
	 * The input entitled users publish to set on the entry
	 */
	private String inputEntitledUsersPublish;

	// inputMetadataProfileId:
	public Integer getInputMetadataProfileId(){
		return this.inputMetadataProfileId;
	}
	public void setInputMetadataProfileId(Integer inputMetadataProfileId){
		this.inputMetadataProfileId = inputMetadataProfileId;
	}

	public void inputMetadataProfileId(String multirequestToken){
		setToken("inputMetadataProfileId", multirequestToken);
	}

	// inputMetadata:
	public List<KeyValue> getInputMetadata(){
		return this.inputMetadata;
	}
	public void setInputMetadata(List<KeyValue> inputMetadata){
		this.inputMetadata = inputMetadata;
	}

	// outputMetadataProfileId:
	public Integer getOutputMetadataProfileId(){
		return this.outputMetadataProfileId;
	}
	public void setOutputMetadataProfileId(Integer outputMetadataProfileId){
		this.outputMetadataProfileId = outputMetadataProfileId;
	}

	public void outputMetadataProfileId(String multirequestToken){
		setToken("outputMetadataProfileId", multirequestToken);
	}

	// outputMetadata:
	public List<KeyValue> getOutputMetadata(){
		return this.outputMetadata;
	}
	public void setOutputMetadata(List<KeyValue> outputMetadata){
		this.outputMetadata = outputMetadata;
	}

	// inputUserId:
	public String getInputUserId(){
		return this.inputUserId;
	}
	public void setInputUserId(String inputUserId){
		this.inputUserId = inputUserId;
	}

	public void inputUserId(String multirequestToken){
		setToken("inputUserId", multirequestToken);
	}

	// inputEntitledUsersEdit:
	public String getInputEntitledUsersEdit(){
		return this.inputEntitledUsersEdit;
	}
	public void setInputEntitledUsersEdit(String inputEntitledUsersEdit){
		this.inputEntitledUsersEdit = inputEntitledUsersEdit;
	}

	public void inputEntitledUsersEdit(String multirequestToken){
		setToken("inputEntitledUsersEdit", multirequestToken);
	}

	// inputEntitledUsersPublish:
	public String getInputEntitledUsersPublish(){
		return this.inputEntitledUsersPublish;
	}
	public void setInputEntitledUsersPublish(String inputEntitledUsersPublish){
		this.inputEntitledUsersPublish = inputEntitledUsersPublish;
	}

	public void inputEntitledUsersPublish(String multirequestToken){
		setToken("inputEntitledUsersPublish", multirequestToken);
	}


	public ModifyEntryObjectTask() {
		super();
	}

	public ModifyEntryObjectTask(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		inputMetadataProfileId = GsonParser.parseInt(jsonObject.get("inputMetadataProfileId"));
		inputMetadata = GsonParser.parseArray(jsonObject.getAsJsonArray("inputMetadata"), KeyValue.class);
		outputMetadataProfileId = GsonParser.parseInt(jsonObject.get("outputMetadataProfileId"));
		outputMetadata = GsonParser.parseArray(jsonObject.getAsJsonArray("outputMetadata"), KeyValue.class);
		inputUserId = GsonParser.parseString(jsonObject.get("inputUserId"));
		inputEntitledUsersEdit = GsonParser.parseString(jsonObject.get("inputEntitledUsersEdit"));
		inputEntitledUsersPublish = GsonParser.parseString(jsonObject.get("inputEntitledUsersPublish"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaModifyEntryObjectTask");
		kparams.add("inputMetadataProfileId", this.inputMetadataProfileId);
		kparams.add("inputMetadata", this.inputMetadata);
		kparams.add("outputMetadataProfileId", this.outputMetadataProfileId);
		kparams.add("outputMetadata", this.outputMetadata);
		kparams.add("inputUserId", this.inputUserId);
		kparams.add("inputEntitledUsersEdit", this.inputEntitledUsersEdit);
		kparams.add("inputEntitledUsersPublish", this.inputEntitledUsersPublish);
		return kparams;
	}

}

