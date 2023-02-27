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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ScheduleEventResourceBaseFilter.Tokenizer.class)
public abstract class ScheduleEventResourceBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String eventIdEqual();
		String eventIdIn();
		String resourceIdEqual();
		String resourceIdIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
	}

	private Integer eventIdEqual;
	private String eventIdIn;
	private Integer resourceIdEqual;
	private String resourceIdIn;
	private Long createdAtGreaterThanOrEqual;
	private Long createdAtLessThanOrEqual;
	private Long updatedAtGreaterThanOrEqual;
	private Long updatedAtLessThanOrEqual;

	// eventIdEqual:
	public Integer getEventIdEqual(){
		return this.eventIdEqual;
	}
	public void setEventIdEqual(Integer eventIdEqual){
		this.eventIdEqual = eventIdEqual;
	}

	public void eventIdEqual(String multirequestToken){
		setToken("eventIdEqual", multirequestToken);
	}

	// eventIdIn:
	public String getEventIdIn(){
		return this.eventIdIn;
	}
	public void setEventIdIn(String eventIdIn){
		this.eventIdIn = eventIdIn;
	}

	public void eventIdIn(String multirequestToken){
		setToken("eventIdIn", multirequestToken);
	}

	// resourceIdEqual:
	public Integer getResourceIdEqual(){
		return this.resourceIdEqual;
	}
	public void setResourceIdEqual(Integer resourceIdEqual){
		this.resourceIdEqual = resourceIdEqual;
	}

	public void resourceIdEqual(String multirequestToken){
		setToken("resourceIdEqual", multirequestToken);
	}

	// resourceIdIn:
	public String getResourceIdIn(){
		return this.resourceIdIn;
	}
	public void setResourceIdIn(String resourceIdIn){
		this.resourceIdIn = resourceIdIn;
	}

	public void resourceIdIn(String multirequestToken){
		setToken("resourceIdIn", multirequestToken);
	}

	// createdAtGreaterThanOrEqual:
	public Long getCreatedAtGreaterThanOrEqual(){
		return this.createdAtGreaterThanOrEqual;
	}
	public void setCreatedAtGreaterThanOrEqual(Long createdAtGreaterThanOrEqual){
		this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
	}

	public void createdAtGreaterThanOrEqual(String multirequestToken){
		setToken("createdAtGreaterThanOrEqual", multirequestToken);
	}

	// createdAtLessThanOrEqual:
	public Long getCreatedAtLessThanOrEqual(){
		return this.createdAtLessThanOrEqual;
	}
	public void setCreatedAtLessThanOrEqual(Long createdAtLessThanOrEqual){
		this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
	}

	public void createdAtLessThanOrEqual(String multirequestToken){
		setToken("createdAtLessThanOrEqual", multirequestToken);
	}

	// updatedAtGreaterThanOrEqual:
	public Long getUpdatedAtGreaterThanOrEqual(){
		return this.updatedAtGreaterThanOrEqual;
	}
	public void setUpdatedAtGreaterThanOrEqual(Long updatedAtGreaterThanOrEqual){
		this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
	}

	public void updatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("updatedAtGreaterThanOrEqual", multirequestToken);
	}

	// updatedAtLessThanOrEqual:
	public Long getUpdatedAtLessThanOrEqual(){
		return this.updatedAtLessThanOrEqual;
	}
	public void setUpdatedAtLessThanOrEqual(Long updatedAtLessThanOrEqual){
		this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
	}

	public void updatedAtLessThanOrEqual(String multirequestToken){
		setToken("updatedAtLessThanOrEqual", multirequestToken);
	}


	public ScheduleEventResourceBaseFilter() {
		super();
	}

	public ScheduleEventResourceBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		eventIdEqual = GsonParser.parseInt(jsonObject.get("eventIdEqual"));
		eventIdIn = GsonParser.parseString(jsonObject.get("eventIdIn"));
		resourceIdEqual = GsonParser.parseInt(jsonObject.get("resourceIdEqual"));
		resourceIdIn = GsonParser.parseString(jsonObject.get("resourceIdIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtLessThanOrEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaScheduleEventResourceBaseFilter");
		kparams.add("eventIdEqual", this.eventIdEqual);
		kparams.add("eventIdIn", this.eventIdIn);
		kparams.add("resourceIdEqual", this.resourceIdEqual);
		kparams.add("resourceIdIn", this.resourceIdIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		return kparams;
	}

}

