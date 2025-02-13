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
@MultiRequestBuilder.Tokenizer(ClipConcatJobData.Tokenizer.class)
public class ClipConcatJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String destEntryId();
		String tempEntryId();
		String sourceEntryId();
		String importUrl();
		String partnerId();
		String priority();
		RequestBuilder.ListTokenizer<OperationAttributes.Tokenizer> operationAttributes();
		String resourceOrder();
		String conversionParams();
	}

	private String destEntryId;
	private String tempEntryId;
	private String sourceEntryId;
	private String importUrl;
	private Integer partnerId;
	private Integer priority;
	private List<OperationAttributes> operationAttributes;
	private Integer resourceOrder;
	private String conversionParams;

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

	// tempEntryId:
	public String getTempEntryId(){
		return this.tempEntryId;
	}
	public void setTempEntryId(String tempEntryId){
		this.tempEntryId = tempEntryId;
	}

	public void tempEntryId(String multirequestToken){
		setToken("tempEntryId", multirequestToken);
	}

	// sourceEntryId:
	public String getSourceEntryId(){
		return this.sourceEntryId;
	}
	public void setSourceEntryId(String sourceEntryId){
		this.sourceEntryId = sourceEntryId;
	}

	public void sourceEntryId(String multirequestToken){
		setToken("sourceEntryId", multirequestToken);
	}

	// importUrl:
	public String getImportUrl(){
		return this.importUrl;
	}
	public void setImportUrl(String importUrl){
		this.importUrl = importUrl;
	}

	public void importUrl(String multirequestToken){
		setToken("importUrl", multirequestToken);
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

	// operationAttributes:
	public List<OperationAttributes> getOperationAttributes(){
		return this.operationAttributes;
	}
	public void setOperationAttributes(List<OperationAttributes> operationAttributes){
		this.operationAttributes = operationAttributes;
	}

	// resourceOrder:
	public Integer getResourceOrder(){
		return this.resourceOrder;
	}
	public void setResourceOrder(Integer resourceOrder){
		this.resourceOrder = resourceOrder;
	}

	public void resourceOrder(String multirequestToken){
		setToken("resourceOrder", multirequestToken);
	}

	// conversionParams:
	public String getConversionParams(){
		return this.conversionParams;
	}
	public void setConversionParams(String conversionParams){
		this.conversionParams = conversionParams;
	}

	public void conversionParams(String multirequestToken){
		setToken("conversionParams", multirequestToken);
	}


	public ClipConcatJobData() {
		super();
	}

	public ClipConcatJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		destEntryId = GsonParser.parseString(jsonObject.get("destEntryId"));
		tempEntryId = GsonParser.parseString(jsonObject.get("tempEntryId"));
		sourceEntryId = GsonParser.parseString(jsonObject.get("sourceEntryId"));
		importUrl = GsonParser.parseString(jsonObject.get("importUrl"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		priority = GsonParser.parseInt(jsonObject.get("priority"));
		operationAttributes = GsonParser.parseArray(jsonObject.getAsJsonArray("operationAttributes"), OperationAttributes.class);
		resourceOrder = GsonParser.parseInt(jsonObject.get("resourceOrder"));
		conversionParams = GsonParser.parseString(jsonObject.get("conversionParams"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaClipConcatJobData");
		kparams.add("destEntryId", this.destEntryId);
		kparams.add("tempEntryId", this.tempEntryId);
		kparams.add("sourceEntryId", this.sourceEntryId);
		kparams.add("importUrl", this.importUrl);
		kparams.add("partnerId", this.partnerId);
		kparams.add("priority", this.priority);
		kparams.add("operationAttributes", this.operationAttributes);
		kparams.add("resourceOrder", this.resourceOrder);
		kparams.add("conversionParams", this.conversionParams);
		return kparams;
	}

}

