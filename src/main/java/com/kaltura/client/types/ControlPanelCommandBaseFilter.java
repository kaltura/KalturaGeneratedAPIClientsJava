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
import com.kaltura.client.enums.ControlPanelCommandStatus;
import com.kaltura.client.enums.ControlPanelCommandTargetType;
import com.kaltura.client.enums.ControlPanelCommandType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ControlPanelCommandBaseFilter.Tokenizer.class)
public abstract class ControlPanelCommandBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idEqual();
		String idIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String createdByIdEqual();
		String typeEqual();
		String typeIn();
		String targetTypeEqual();
		String targetTypeIn();
		String statusEqual();
		String statusIn();
	}

	private Integer idEqual;
	private String idIn;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer createdByIdEqual;
	private ControlPanelCommandType typeEqual;
	private String typeIn;
	private ControlPanelCommandTargetType targetTypeEqual;
	private String targetTypeIn;
	private ControlPanelCommandStatus statusEqual;
	private String statusIn;

	// idEqual:
	public Integer getIdEqual(){
		return this.idEqual;
	}
	public void setIdEqual(Integer idEqual){
		this.idEqual = idEqual;
	}

	public void idEqual(String multirequestToken){
		setToken("idEqual", multirequestToken);
	}

	// idIn:
	public String getIdIn(){
		return this.idIn;
	}
	public void setIdIn(String idIn){
		this.idIn = idIn;
	}

	public void idIn(String multirequestToken){
		setToken("idIn", multirequestToken);
	}

	// createdAtGreaterThanOrEqual:
	public Integer getCreatedAtGreaterThanOrEqual(){
		return this.createdAtGreaterThanOrEqual;
	}
	public void setCreatedAtGreaterThanOrEqual(Integer createdAtGreaterThanOrEqual){
		this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
	}

	public void createdAtGreaterThanOrEqual(String multirequestToken){
		setToken("createdAtGreaterThanOrEqual", multirequestToken);
	}

	// createdAtLessThanOrEqual:
	public Integer getCreatedAtLessThanOrEqual(){
		return this.createdAtLessThanOrEqual;
	}
	public void setCreatedAtLessThanOrEqual(Integer createdAtLessThanOrEqual){
		this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
	}

	public void createdAtLessThanOrEqual(String multirequestToken){
		setToken("createdAtLessThanOrEqual", multirequestToken);
	}

	// createdByIdEqual:
	public Integer getCreatedByIdEqual(){
		return this.createdByIdEqual;
	}
	public void setCreatedByIdEqual(Integer createdByIdEqual){
		this.createdByIdEqual = createdByIdEqual;
	}

	public void createdByIdEqual(String multirequestToken){
		setToken("createdByIdEqual", multirequestToken);
	}

	// typeEqual:
	public ControlPanelCommandType getTypeEqual(){
		return this.typeEqual;
	}
	public void setTypeEqual(ControlPanelCommandType typeEqual){
		this.typeEqual = typeEqual;
	}

	public void typeEqual(String multirequestToken){
		setToken("typeEqual", multirequestToken);
	}

	// typeIn:
	public String getTypeIn(){
		return this.typeIn;
	}
	public void setTypeIn(String typeIn){
		this.typeIn = typeIn;
	}

	public void typeIn(String multirequestToken){
		setToken("typeIn", multirequestToken);
	}

	// targetTypeEqual:
	public ControlPanelCommandTargetType getTargetTypeEqual(){
		return this.targetTypeEqual;
	}
	public void setTargetTypeEqual(ControlPanelCommandTargetType targetTypeEqual){
		this.targetTypeEqual = targetTypeEqual;
	}

	public void targetTypeEqual(String multirequestToken){
		setToken("targetTypeEqual", multirequestToken);
	}

	// targetTypeIn:
	public String getTargetTypeIn(){
		return this.targetTypeIn;
	}
	public void setTargetTypeIn(String targetTypeIn){
		this.targetTypeIn = targetTypeIn;
	}

	public void targetTypeIn(String multirequestToken){
		setToken("targetTypeIn", multirequestToken);
	}

	// statusEqual:
	public ControlPanelCommandStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(ControlPanelCommandStatus statusEqual){
		this.statusEqual = statusEqual;
	}

	public void statusEqual(String multirequestToken){
		setToken("statusEqual", multirequestToken);
	}

	// statusIn:
	public String getStatusIn(){
		return this.statusIn;
	}
	public void setStatusIn(String statusIn){
		this.statusIn = statusIn;
	}

	public void statusIn(String multirequestToken){
		setToken("statusIn", multirequestToken);
	}


	public ControlPanelCommandBaseFilter() {
		super();
	}

	public ControlPanelCommandBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		createdByIdEqual = GsonParser.parseInt(jsonObject.get("createdByIdEqual"));
		typeEqual = ControlPanelCommandType.get(GsonParser.parseInt(jsonObject.get("typeEqual")));
		typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
		targetTypeEqual = ControlPanelCommandTargetType.get(GsonParser.parseInt(jsonObject.get("targetTypeEqual")));
		targetTypeIn = GsonParser.parseString(jsonObject.get("targetTypeIn"));
		statusEqual = ControlPanelCommandStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaControlPanelCommandBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("createdByIdEqual", this.createdByIdEqual);
		kparams.add("typeEqual", this.typeEqual);
		kparams.add("typeIn", this.typeIn);
		kparams.add("targetTypeEqual", this.targetTypeEqual);
		kparams.add("targetTypeIn", this.targetTypeIn);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		return kparams;
	}

}

