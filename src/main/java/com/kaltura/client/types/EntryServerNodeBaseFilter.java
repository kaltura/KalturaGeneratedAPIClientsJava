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
import com.kaltura.client.enums.EntryServerNodeStatus;
import com.kaltura.client.enums.EntryServerNodeType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryServerNodeBaseFilter.Tokenizer.class)
public abstract class EntryServerNodeBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String entryIdEqual();
		String entryIdIn();
		String serverNodeIdEqual();
		String serverNodeIdIn();
		String serverNodeIdNotIn();
		String createdAtLessThanOrEqual();
		String createdAtGreaterThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String statusEqual();
		String statusIn();
		String serverTypeEqual();
		String serverTypeIn();
		String serverTypeNotIn();
	}

	private String entryIdEqual;
	private String entryIdIn;
	private Integer serverNodeIdEqual;
	private String serverNodeIdIn;
	private String serverNodeIdNotIn;
	private Long createdAtLessThanOrEqual;
	private Long createdAtGreaterThanOrEqual;
	private Long updatedAtGreaterThanOrEqual;
	private Long updatedAtLessThanOrEqual;
	private EntryServerNodeStatus statusEqual;
	private String statusIn;
	private EntryServerNodeType serverTypeEqual;
	private String serverTypeIn;
	private String serverTypeNotIn;

	// entryIdEqual:
	public String getEntryIdEqual(){
		return this.entryIdEqual;
	}
	public void setEntryIdEqual(String entryIdEqual){
		this.entryIdEqual = entryIdEqual;
	}

	public void entryIdEqual(String multirequestToken){
		setToken("entryIdEqual", multirequestToken);
	}

	// entryIdIn:
	public String getEntryIdIn(){
		return this.entryIdIn;
	}
	public void setEntryIdIn(String entryIdIn){
		this.entryIdIn = entryIdIn;
	}

	public void entryIdIn(String multirequestToken){
		setToken("entryIdIn", multirequestToken);
	}

	// serverNodeIdEqual:
	public Integer getServerNodeIdEqual(){
		return this.serverNodeIdEqual;
	}
	public void setServerNodeIdEqual(Integer serverNodeIdEqual){
		this.serverNodeIdEqual = serverNodeIdEqual;
	}

	public void serverNodeIdEqual(String multirequestToken){
		setToken("serverNodeIdEqual", multirequestToken);
	}

	// serverNodeIdIn:
	public String getServerNodeIdIn(){
		return this.serverNodeIdIn;
	}
	public void setServerNodeIdIn(String serverNodeIdIn){
		this.serverNodeIdIn = serverNodeIdIn;
	}

	public void serverNodeIdIn(String multirequestToken){
		setToken("serverNodeIdIn", multirequestToken);
	}

	// serverNodeIdNotIn:
	public String getServerNodeIdNotIn(){
		return this.serverNodeIdNotIn;
	}
	public void setServerNodeIdNotIn(String serverNodeIdNotIn){
		this.serverNodeIdNotIn = serverNodeIdNotIn;
	}

	public void serverNodeIdNotIn(String multirequestToken){
		setToken("serverNodeIdNotIn", multirequestToken);
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

	// statusEqual:
	public EntryServerNodeStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(EntryServerNodeStatus statusEqual){
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

	// serverTypeEqual:
	public EntryServerNodeType getServerTypeEqual(){
		return this.serverTypeEqual;
	}
	public void setServerTypeEqual(EntryServerNodeType serverTypeEqual){
		this.serverTypeEqual = serverTypeEqual;
	}

	public void serverTypeEqual(String multirequestToken){
		setToken("serverTypeEqual", multirequestToken);
	}

	// serverTypeIn:
	public String getServerTypeIn(){
		return this.serverTypeIn;
	}
	public void setServerTypeIn(String serverTypeIn){
		this.serverTypeIn = serverTypeIn;
	}

	public void serverTypeIn(String multirequestToken){
		setToken("serverTypeIn", multirequestToken);
	}

	// serverTypeNotIn:
	public String getServerTypeNotIn(){
		return this.serverTypeNotIn;
	}
	public void setServerTypeNotIn(String serverTypeNotIn){
		this.serverTypeNotIn = serverTypeNotIn;
	}

	public void serverTypeNotIn(String multirequestToken){
		setToken("serverTypeNotIn", multirequestToken);
	}


	public EntryServerNodeBaseFilter() {
		super();
	}

	public EntryServerNodeBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entryIdEqual = GsonParser.parseString(jsonObject.get("entryIdEqual"));
		entryIdIn = GsonParser.parseString(jsonObject.get("entryIdIn"));
		serverNodeIdEqual = GsonParser.parseInt(jsonObject.get("serverNodeIdEqual"));
		serverNodeIdIn = GsonParser.parseString(jsonObject.get("serverNodeIdIn"));
		serverNodeIdNotIn = GsonParser.parseString(jsonObject.get("serverNodeIdNotIn"));
		createdAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtLessThanOrEqual"));
		createdAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtGreaterThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtLessThanOrEqual"));
		statusEqual = EntryServerNodeStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		serverTypeEqual = EntryServerNodeType.get(GsonParser.parseString(jsonObject.get("serverTypeEqual")));
		serverTypeIn = GsonParser.parseString(jsonObject.get("serverTypeIn"));
		serverTypeNotIn = GsonParser.parseString(jsonObject.get("serverTypeNotIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryServerNodeBaseFilter");
		kparams.add("entryIdEqual", this.entryIdEqual);
		kparams.add("entryIdIn", this.entryIdIn);
		kparams.add("serverNodeIdEqual", this.serverNodeIdEqual);
		kparams.add("serverNodeIdIn", this.serverNodeIdIn);
		kparams.add("serverNodeIdNotIn", this.serverNodeIdNotIn);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("serverTypeEqual", this.serverTypeEqual);
		kparams.add("serverTypeIn", this.serverTypeIn);
		kparams.add("serverTypeNotIn", this.serverTypeNotIn);
		return kparams;
	}

}

