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
import com.kaltura.client.enums.BeaconObjectTypes;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BeaconBaseFilter.Tokenizer.class)
public abstract class BeaconBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String relatedObjectTypeIn();
		String relatedObjectTypeEqual();
		String eventTypeIn();
		String objectIdIn();
	}

	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private String relatedObjectTypeIn;
	private BeaconObjectTypes relatedObjectTypeEqual;
	private String eventTypeIn;
	private String objectIdIn;

	// updatedAtGreaterThanOrEqual:
	public Integer getUpdatedAtGreaterThanOrEqual(){
		return this.updatedAtGreaterThanOrEqual;
	}
	public void setUpdatedAtGreaterThanOrEqual(Integer updatedAtGreaterThanOrEqual){
		this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
	}

	public void updatedAtGreaterThanOrEqual(String multirequestToken){
		setToken("updatedAtGreaterThanOrEqual", multirequestToken);
	}

	// updatedAtLessThanOrEqual:
	public Integer getUpdatedAtLessThanOrEqual(){
		return this.updatedAtLessThanOrEqual;
	}
	public void setUpdatedAtLessThanOrEqual(Integer updatedAtLessThanOrEqual){
		this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
	}

	public void updatedAtLessThanOrEqual(String multirequestToken){
		setToken("updatedAtLessThanOrEqual", multirequestToken);
	}

	// relatedObjectTypeIn:
	public String getRelatedObjectTypeIn(){
		return this.relatedObjectTypeIn;
	}
	public void setRelatedObjectTypeIn(String relatedObjectTypeIn){
		this.relatedObjectTypeIn = relatedObjectTypeIn;
	}

	public void relatedObjectTypeIn(String multirequestToken){
		setToken("relatedObjectTypeIn", multirequestToken);
	}

	// relatedObjectTypeEqual:
	public BeaconObjectTypes getRelatedObjectTypeEqual(){
		return this.relatedObjectTypeEqual;
	}
	public void setRelatedObjectTypeEqual(BeaconObjectTypes relatedObjectTypeEqual){
		this.relatedObjectTypeEqual = relatedObjectTypeEqual;
	}

	public void relatedObjectTypeEqual(String multirequestToken){
		setToken("relatedObjectTypeEqual", multirequestToken);
	}

	// eventTypeIn:
	public String getEventTypeIn(){
		return this.eventTypeIn;
	}
	public void setEventTypeIn(String eventTypeIn){
		this.eventTypeIn = eventTypeIn;
	}

	public void eventTypeIn(String multirequestToken){
		setToken("eventTypeIn", multirequestToken);
	}

	// objectIdIn:
	public String getObjectIdIn(){
		return this.objectIdIn;
	}
	public void setObjectIdIn(String objectIdIn){
		this.objectIdIn = objectIdIn;
	}

	public void objectIdIn(String multirequestToken){
		setToken("objectIdIn", multirequestToken);
	}


	public BeaconBaseFilter() {
		super();
	}

	public BeaconBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		relatedObjectTypeIn = GsonParser.parseString(jsonObject.get("relatedObjectTypeIn"));
		relatedObjectTypeEqual = BeaconObjectTypes.get(GsonParser.parseString(jsonObject.get("relatedObjectTypeEqual")));
		eventTypeIn = GsonParser.parseString(jsonObject.get("eventTypeIn"));
		objectIdIn = GsonParser.parseString(jsonObject.get("objectIdIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBeaconBaseFilter");
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("relatedObjectTypeIn", this.relatedObjectTypeIn);
		kparams.add("relatedObjectTypeEqual", this.relatedObjectTypeEqual);
		kparams.add("eventTypeIn", this.eventTypeIn);
		kparams.add("objectIdIn", this.objectIdIn);
		return kparams;
	}

}

