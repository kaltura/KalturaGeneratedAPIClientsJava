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
// Copyright (C) 2006-2019  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(ClipConcatJobData.Tokenizer.class)
public class ClipConcatJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String partnerId();
		String priority();
		RequestBuilder.ListTokenizer<ObjectBase.Tokenizer> operationAttributes();
	}

	/**
	 * $partnerId
	 */
	private Integer partnerId;
	/**
	 * $priority
	 */
	private Integer priority;
	/**
	 * clip operations
	 */
	private List<ObjectBase> operationAttributes;

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
	public List<ObjectBase> getOperationAttributes(){
		return this.operationAttributes;
	}
	public void setOperationAttributes(List<ObjectBase> operationAttributes){
		this.operationAttributes = operationAttributes;
	}


	public ClipConcatJobData() {
		super();
	}

	public ClipConcatJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		priority = GsonParser.parseInt(jsonObject.get("priority"));
		operationAttributes = GsonParser.parseArray(jsonObject.getAsJsonArray("operationAttributes"), ObjectBase.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaClipConcatJobData");
		kparams.add("partnerId", this.partnerId);
		kparams.add("priority", this.priority);
		kparams.add("operationAttributes", this.operationAttributes);
		return kparams;
	}

}

