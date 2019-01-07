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
import com.kaltura.client.enums.ServerNodeStatus;
import com.kaltura.client.enums.ServerNodeType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ServerNodeBaseFilter.Tokenizer.class)
public abstract class ServerNodeBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idEqual();
		String idIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String heartbeatTimeGreaterThanOrEqual();
		String heartbeatTimeLessThanOrEqual();
		String nameEqual();
		String nameIn();
		String systemNameEqual();
		String systemNameIn();
		String hostNameLike();
		String hostNameMultiLikeOr();
		String hostNameMultiLikeAnd();
		String statusEqual();
		String statusIn();
		String typeEqual();
		String typeIn();
		String tagsLike();
		String tagsMultiLikeOr();
		String tagsMultiLikeAnd();
		String dcEqual();
		String dcIn();
		String parentIdLike();
		String parentIdMultiLikeOr();
		String parentIdMultiLikeAnd();
		String environmentEqual();
		String environmentIn();
	}

	private Integer idEqual;
	private String idIn;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private Integer heartbeatTimeGreaterThanOrEqual;
	private Integer heartbeatTimeLessThanOrEqual;
	private String nameEqual;
	private String nameIn;
	private String systemNameEqual;
	private String systemNameIn;
	private String hostNameLike;
	private String hostNameMultiLikeOr;
	private String hostNameMultiLikeAnd;
	private ServerNodeStatus statusEqual;
	private String statusIn;
	private ServerNodeType typeEqual;
	private String typeIn;
	private String tagsLike;
	private String tagsMultiLikeOr;
	private String tagsMultiLikeAnd;
	private Integer dcEqual;
	private String dcIn;
	private String parentIdLike;
	private String parentIdMultiLikeOr;
	private String parentIdMultiLikeAnd;
	private String environmentEqual;
	private String environmentIn;

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

	// heartbeatTimeGreaterThanOrEqual:
	public Integer getHeartbeatTimeGreaterThanOrEqual(){
		return this.heartbeatTimeGreaterThanOrEqual;
	}
	public void setHeartbeatTimeGreaterThanOrEqual(Integer heartbeatTimeGreaterThanOrEqual){
		this.heartbeatTimeGreaterThanOrEqual = heartbeatTimeGreaterThanOrEqual;
	}

	public void heartbeatTimeGreaterThanOrEqual(String multirequestToken){
		setToken("heartbeatTimeGreaterThanOrEqual", multirequestToken);
	}

	// heartbeatTimeLessThanOrEqual:
	public Integer getHeartbeatTimeLessThanOrEqual(){
		return this.heartbeatTimeLessThanOrEqual;
	}
	public void setHeartbeatTimeLessThanOrEqual(Integer heartbeatTimeLessThanOrEqual){
		this.heartbeatTimeLessThanOrEqual = heartbeatTimeLessThanOrEqual;
	}

	public void heartbeatTimeLessThanOrEqual(String multirequestToken){
		setToken("heartbeatTimeLessThanOrEqual", multirequestToken);
	}

	// nameEqual:
	public String getNameEqual(){
		return this.nameEqual;
	}
	public void setNameEqual(String nameEqual){
		this.nameEqual = nameEqual;
	}

	public void nameEqual(String multirequestToken){
		setToken("nameEqual", multirequestToken);
	}

	// nameIn:
	public String getNameIn(){
		return this.nameIn;
	}
	public void setNameIn(String nameIn){
		this.nameIn = nameIn;
	}

	public void nameIn(String multirequestToken){
		setToken("nameIn", multirequestToken);
	}

	// systemNameEqual:
	public String getSystemNameEqual(){
		return this.systemNameEqual;
	}
	public void setSystemNameEqual(String systemNameEqual){
		this.systemNameEqual = systemNameEqual;
	}

	public void systemNameEqual(String multirequestToken){
		setToken("systemNameEqual", multirequestToken);
	}

	// systemNameIn:
	public String getSystemNameIn(){
		return this.systemNameIn;
	}
	public void setSystemNameIn(String systemNameIn){
		this.systemNameIn = systemNameIn;
	}

	public void systemNameIn(String multirequestToken){
		setToken("systemNameIn", multirequestToken);
	}

	// hostNameLike:
	public String getHostNameLike(){
		return this.hostNameLike;
	}
	public void setHostNameLike(String hostNameLike){
		this.hostNameLike = hostNameLike;
	}

	public void hostNameLike(String multirequestToken){
		setToken("hostNameLike", multirequestToken);
	}

	// hostNameMultiLikeOr:
	public String getHostNameMultiLikeOr(){
		return this.hostNameMultiLikeOr;
	}
	public void setHostNameMultiLikeOr(String hostNameMultiLikeOr){
		this.hostNameMultiLikeOr = hostNameMultiLikeOr;
	}

	public void hostNameMultiLikeOr(String multirequestToken){
		setToken("hostNameMultiLikeOr", multirequestToken);
	}

	// hostNameMultiLikeAnd:
	public String getHostNameMultiLikeAnd(){
		return this.hostNameMultiLikeAnd;
	}
	public void setHostNameMultiLikeAnd(String hostNameMultiLikeAnd){
		this.hostNameMultiLikeAnd = hostNameMultiLikeAnd;
	}

	public void hostNameMultiLikeAnd(String multirequestToken){
		setToken("hostNameMultiLikeAnd", multirequestToken);
	}

	// statusEqual:
	public ServerNodeStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(ServerNodeStatus statusEqual){
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

	// typeEqual:
	public ServerNodeType getTypeEqual(){
		return this.typeEqual;
	}
	public void setTypeEqual(ServerNodeType typeEqual){
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

	// tagsLike:
	public String getTagsLike(){
		return this.tagsLike;
	}
	public void setTagsLike(String tagsLike){
		this.tagsLike = tagsLike;
	}

	public void tagsLike(String multirequestToken){
		setToken("tagsLike", multirequestToken);
	}

	// tagsMultiLikeOr:
	public String getTagsMultiLikeOr(){
		return this.tagsMultiLikeOr;
	}
	public void setTagsMultiLikeOr(String tagsMultiLikeOr){
		this.tagsMultiLikeOr = tagsMultiLikeOr;
	}

	public void tagsMultiLikeOr(String multirequestToken){
		setToken("tagsMultiLikeOr", multirequestToken);
	}

	// tagsMultiLikeAnd:
	public String getTagsMultiLikeAnd(){
		return this.tagsMultiLikeAnd;
	}
	public void setTagsMultiLikeAnd(String tagsMultiLikeAnd){
		this.tagsMultiLikeAnd = tagsMultiLikeAnd;
	}

	public void tagsMultiLikeAnd(String multirequestToken){
		setToken("tagsMultiLikeAnd", multirequestToken);
	}

	// dcEqual:
	public Integer getDcEqual(){
		return this.dcEqual;
	}
	public void setDcEqual(Integer dcEqual){
		this.dcEqual = dcEqual;
	}

	public void dcEqual(String multirequestToken){
		setToken("dcEqual", multirequestToken);
	}

	// dcIn:
	public String getDcIn(){
		return this.dcIn;
	}
	public void setDcIn(String dcIn){
		this.dcIn = dcIn;
	}

	public void dcIn(String multirequestToken){
		setToken("dcIn", multirequestToken);
	}

	// parentIdLike:
	public String getParentIdLike(){
		return this.parentIdLike;
	}
	public void setParentIdLike(String parentIdLike){
		this.parentIdLike = parentIdLike;
	}

	public void parentIdLike(String multirequestToken){
		setToken("parentIdLike", multirequestToken);
	}

	// parentIdMultiLikeOr:
	public String getParentIdMultiLikeOr(){
		return this.parentIdMultiLikeOr;
	}
	public void setParentIdMultiLikeOr(String parentIdMultiLikeOr){
		this.parentIdMultiLikeOr = parentIdMultiLikeOr;
	}

	public void parentIdMultiLikeOr(String multirequestToken){
		setToken("parentIdMultiLikeOr", multirequestToken);
	}

	// parentIdMultiLikeAnd:
	public String getParentIdMultiLikeAnd(){
		return this.parentIdMultiLikeAnd;
	}
	public void setParentIdMultiLikeAnd(String parentIdMultiLikeAnd){
		this.parentIdMultiLikeAnd = parentIdMultiLikeAnd;
	}

	public void parentIdMultiLikeAnd(String multirequestToken){
		setToken("parentIdMultiLikeAnd", multirequestToken);
	}

	// environmentEqual:
	public String getEnvironmentEqual(){
		return this.environmentEqual;
	}
	public void setEnvironmentEqual(String environmentEqual){
		this.environmentEqual = environmentEqual;
	}

	public void environmentEqual(String multirequestToken){
		setToken("environmentEqual", multirequestToken);
	}

	// environmentIn:
	public String getEnvironmentIn(){
		return this.environmentIn;
	}
	public void setEnvironmentIn(String environmentIn){
		this.environmentIn = environmentIn;
	}

	public void environmentIn(String multirequestToken){
		setToken("environmentIn", multirequestToken);
	}


	public ServerNodeBaseFilter() {
		super();
	}

	public ServerNodeBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		heartbeatTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("heartbeatTimeGreaterThanOrEqual"));
		heartbeatTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("heartbeatTimeLessThanOrEqual"));
		nameEqual = GsonParser.parseString(jsonObject.get("nameEqual"));
		nameIn = GsonParser.parseString(jsonObject.get("nameIn"));
		systemNameEqual = GsonParser.parseString(jsonObject.get("systemNameEqual"));
		systemNameIn = GsonParser.parseString(jsonObject.get("systemNameIn"));
		hostNameLike = GsonParser.parseString(jsonObject.get("hostNameLike"));
		hostNameMultiLikeOr = GsonParser.parseString(jsonObject.get("hostNameMultiLikeOr"));
		hostNameMultiLikeAnd = GsonParser.parseString(jsonObject.get("hostNameMultiLikeAnd"));
		statusEqual = ServerNodeStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		typeEqual = ServerNodeType.get(GsonParser.parseString(jsonObject.get("typeEqual")));
		typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
		tagsLike = GsonParser.parseString(jsonObject.get("tagsLike"));
		tagsMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsMultiLikeOr"));
		tagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsMultiLikeAnd"));
		dcEqual = GsonParser.parseInt(jsonObject.get("dcEqual"));
		dcIn = GsonParser.parseString(jsonObject.get("dcIn"));
		parentIdLike = GsonParser.parseString(jsonObject.get("parentIdLike"));
		parentIdMultiLikeOr = GsonParser.parseString(jsonObject.get("parentIdMultiLikeOr"));
		parentIdMultiLikeAnd = GsonParser.parseString(jsonObject.get("parentIdMultiLikeAnd"));
		environmentEqual = GsonParser.parseString(jsonObject.get("environmentEqual"));
		environmentIn = GsonParser.parseString(jsonObject.get("environmentIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaServerNodeBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("heartbeatTimeGreaterThanOrEqual", this.heartbeatTimeGreaterThanOrEqual);
		kparams.add("heartbeatTimeLessThanOrEqual", this.heartbeatTimeLessThanOrEqual);
		kparams.add("nameEqual", this.nameEqual);
		kparams.add("nameIn", this.nameIn);
		kparams.add("systemNameEqual", this.systemNameEqual);
		kparams.add("systemNameIn", this.systemNameIn);
		kparams.add("hostNameLike", this.hostNameLike);
		kparams.add("hostNameMultiLikeOr", this.hostNameMultiLikeOr);
		kparams.add("hostNameMultiLikeAnd", this.hostNameMultiLikeAnd);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("typeEqual", this.typeEqual);
		kparams.add("typeIn", this.typeIn);
		kparams.add("tagsLike", this.tagsLike);
		kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
		kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
		kparams.add("dcEqual", this.dcEqual);
		kparams.add("dcIn", this.dcIn);
		kparams.add("parentIdLike", this.parentIdLike);
		kparams.add("parentIdMultiLikeOr", this.parentIdMultiLikeOr);
		kparams.add("parentIdMultiLikeAnd", this.parentIdMultiLikeAnd);
		kparams.add("environmentEqual", this.environmentEqual);
		kparams.add("environmentIn", this.environmentIn);
		return kparams;
	}

}

