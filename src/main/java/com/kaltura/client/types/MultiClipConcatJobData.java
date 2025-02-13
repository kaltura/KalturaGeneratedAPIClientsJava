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
import com.kaltura.client.enums.ChapterNamePolicy;
import com.kaltura.client.types.CropAspectRatio;
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
@MultiRequestBuilder.Tokenizer(MultiClipConcatJobData.Tokenizer.class)
public class MultiClipConcatJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String destEntryId();
		String multiTempEntryId();
		String partnerId();
		String priority();
		String chapterNamePolicy();
		CropAspectRatio.Tokenizer aspectRatio();
		RequestBuilder.ListTokenizer<OperationResource.Tokenizer> operationResources();
	}

	private String destEntryId;
	private String multiTempEntryId;
	private Integer partnerId;
	private Integer priority;
	private ChapterNamePolicy chapterNamePolicy;
	private CropAspectRatio aspectRatio;
	private List<OperationResource> operationResources;

	// destEntryId:
	public String getDestEntryId(){
		return this.destEntryId;
	}
	public void setDestEntryId(String destEntryId){
		this.destEntryId = destEntryId;
	}

	public void destEntryId(String multirequestToken){
		setToken("destEntryId", multirequestToken);
	}

	// multiTempEntryId:
	public String getMultiTempEntryId(){
		return this.multiTempEntryId;
	}
	public void setMultiTempEntryId(String multiTempEntryId){
		this.multiTempEntryId = multiTempEntryId;
	}

	public void multiTempEntryId(String multirequestToken){
		setToken("multiTempEntryId", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
	}

	// priority:
	public Integer getPriority(){
		return this.priority;
	}
	public void setPriority(Integer priority){
		this.priority = priority;
	}

	public void priority(String multirequestToken){
		setToken("priority", multirequestToken);
	}

	// chapterNamePolicy:
	public ChapterNamePolicy getChapterNamePolicy(){
		return this.chapterNamePolicy;
	}
	public void setChapterNamePolicy(ChapterNamePolicy chapterNamePolicy){
		this.chapterNamePolicy = chapterNamePolicy;
	}

	public void chapterNamePolicy(String multirequestToken){
		setToken("chapterNamePolicy", multirequestToken);
	}

	// aspectRatio:
	public CropAspectRatio getAspectRatio(){
		return this.aspectRatio;
	}
	public void setAspectRatio(CropAspectRatio aspectRatio){
		this.aspectRatio = aspectRatio;
	}

	// operationResources:
	public List<OperationResource> getOperationResources(){
		return this.operationResources;
	}
	public void setOperationResources(List<OperationResource> operationResources){
		this.operationResources = operationResources;
	}


	public MultiClipConcatJobData() {
		super();
	}

	public MultiClipConcatJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		destEntryId = GsonParser.parseString(jsonObject.get("destEntryId"));
		multiTempEntryId = GsonParser.parseString(jsonObject.get("multiTempEntryId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		priority = GsonParser.parseInt(jsonObject.get("priority"));
		chapterNamePolicy = ChapterNamePolicy.get(GsonParser.parseInt(jsonObject.get("chapterNamePolicy")));
		aspectRatio = GsonParser.parseObject(jsonObject.getAsJsonObject("aspectRatio"), CropAspectRatio.class);
		operationResources = GsonParser.parseArray(jsonObject.getAsJsonArray("operationResources"), OperationResource.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMultiClipConcatJobData");
		kparams.add("destEntryId", this.destEntryId);
		kparams.add("multiTempEntryId", this.multiTempEntryId);
		kparams.add("partnerId", this.partnerId);
		kparams.add("priority", this.priority);
		kparams.add("chapterNamePolicy", this.chapterNamePolicy);
		kparams.add("aspectRatio", this.aspectRatio);
		kparams.add("operationResources", this.operationResources);
		return kparams;
	}

}

