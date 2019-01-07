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
import com.kaltura.client.enums.UiConfCreationMode;
import com.kaltura.client.enums.UiConfObjType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UiConfBaseFilter.Tokenizer.class)
public abstract class UiConfBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idEqual();
		String idIn();
		String nameLike();
		String partnerIdEqual();
		String partnerIdIn();
		String objTypeEqual();
		String objTypeIn();
		String tagsMultiLikeOr();
		String tagsMultiLikeAnd();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String creationModeEqual();
		String creationModeIn();
		String versionEqual();
		String versionMultiLikeOr();
		String versionMultiLikeAnd();
		String partnerTagsMultiLikeOr();
		String partnerTagsMultiLikeAnd();
	}

	private Integer idEqual;
	private String idIn;
	private String nameLike;
	private Integer partnerIdEqual;
	private String partnerIdIn;
	private UiConfObjType objTypeEqual;
	private String objTypeIn;
	private String tagsMultiLikeOr;
	private String tagsMultiLikeAnd;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private UiConfCreationMode creationModeEqual;
	private String creationModeIn;
	private String versionEqual;
	private String versionMultiLikeOr;
	private String versionMultiLikeAnd;
	private String partnerTagsMultiLikeOr;
	private String partnerTagsMultiLikeAnd;

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

	// nameLike:
	public String getNameLike(){
		return this.nameLike;
	}
	public void setNameLike(String nameLike){
		this.nameLike = nameLike;
	}

	public void nameLike(String multirequestToken){
		setToken("nameLike", multirequestToken);
	}

	// partnerIdEqual:
	public Integer getPartnerIdEqual(){
		return this.partnerIdEqual;
	}
	public void setPartnerIdEqual(Integer partnerIdEqual){
		this.partnerIdEqual = partnerIdEqual;
	}

	public void partnerIdEqual(String multirequestToken){
		setToken("partnerIdEqual", multirequestToken);
	}

	// partnerIdIn:
	public String getPartnerIdIn(){
		return this.partnerIdIn;
	}
	public void setPartnerIdIn(String partnerIdIn){
		this.partnerIdIn = partnerIdIn;
	}

	public void partnerIdIn(String multirequestToken){
		setToken("partnerIdIn", multirequestToken);
	}

	// objTypeEqual:
	public UiConfObjType getObjTypeEqual(){
		return this.objTypeEqual;
	}
	public void setObjTypeEqual(UiConfObjType objTypeEqual){
		this.objTypeEqual = objTypeEqual;
	}

	public void objTypeEqual(String multirequestToken){
		setToken("objTypeEqual", multirequestToken);
	}

	// objTypeIn:
	public String getObjTypeIn(){
		return this.objTypeIn;
	}
	public void setObjTypeIn(String objTypeIn){
		this.objTypeIn = objTypeIn;
	}

	public void objTypeIn(String multirequestToken){
		setToken("objTypeIn", multirequestToken);
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

	// creationModeEqual:
	public UiConfCreationMode getCreationModeEqual(){
		return this.creationModeEqual;
	}
	public void setCreationModeEqual(UiConfCreationMode creationModeEqual){
		this.creationModeEqual = creationModeEqual;
	}

	public void creationModeEqual(String multirequestToken){
		setToken("creationModeEqual", multirequestToken);
	}

	// creationModeIn:
	public String getCreationModeIn(){
		return this.creationModeIn;
	}
	public void setCreationModeIn(String creationModeIn){
		this.creationModeIn = creationModeIn;
	}

	public void creationModeIn(String multirequestToken){
		setToken("creationModeIn", multirequestToken);
	}

	// versionEqual:
	public String getVersionEqual(){
		return this.versionEqual;
	}
	public void setVersionEqual(String versionEqual){
		this.versionEqual = versionEqual;
	}

	public void versionEqual(String multirequestToken){
		setToken("versionEqual", multirequestToken);
	}

	// versionMultiLikeOr:
	public String getVersionMultiLikeOr(){
		return this.versionMultiLikeOr;
	}
	public void setVersionMultiLikeOr(String versionMultiLikeOr){
		this.versionMultiLikeOr = versionMultiLikeOr;
	}

	public void versionMultiLikeOr(String multirequestToken){
		setToken("versionMultiLikeOr", multirequestToken);
	}

	// versionMultiLikeAnd:
	public String getVersionMultiLikeAnd(){
		return this.versionMultiLikeAnd;
	}
	public void setVersionMultiLikeAnd(String versionMultiLikeAnd){
		this.versionMultiLikeAnd = versionMultiLikeAnd;
	}

	public void versionMultiLikeAnd(String multirequestToken){
		setToken("versionMultiLikeAnd", multirequestToken);
	}

	// partnerTagsMultiLikeOr:
	public String getPartnerTagsMultiLikeOr(){
		return this.partnerTagsMultiLikeOr;
	}
	public void setPartnerTagsMultiLikeOr(String partnerTagsMultiLikeOr){
		this.partnerTagsMultiLikeOr = partnerTagsMultiLikeOr;
	}

	public void partnerTagsMultiLikeOr(String multirequestToken){
		setToken("partnerTagsMultiLikeOr", multirequestToken);
	}

	// partnerTagsMultiLikeAnd:
	public String getPartnerTagsMultiLikeAnd(){
		return this.partnerTagsMultiLikeAnd;
	}
	public void setPartnerTagsMultiLikeAnd(String partnerTagsMultiLikeAnd){
		this.partnerTagsMultiLikeAnd = partnerTagsMultiLikeAnd;
	}

	public void partnerTagsMultiLikeAnd(String multirequestToken){
		setToken("partnerTagsMultiLikeAnd", multirequestToken);
	}


	public UiConfBaseFilter() {
		super();
	}

	public UiConfBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		nameLike = GsonParser.parseString(jsonObject.get("nameLike"));
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
		objTypeEqual = UiConfObjType.get(GsonParser.parseInt(jsonObject.get("objTypeEqual")));
		objTypeIn = GsonParser.parseString(jsonObject.get("objTypeIn"));
		tagsMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsMultiLikeOr"));
		tagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsMultiLikeAnd"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		creationModeEqual = UiConfCreationMode.get(GsonParser.parseInt(jsonObject.get("creationModeEqual")));
		creationModeIn = GsonParser.parseString(jsonObject.get("creationModeIn"));
		versionEqual = GsonParser.parseString(jsonObject.get("versionEqual"));
		versionMultiLikeOr = GsonParser.parseString(jsonObject.get("versionMultiLikeOr"));
		versionMultiLikeAnd = GsonParser.parseString(jsonObject.get("versionMultiLikeAnd"));
		partnerTagsMultiLikeOr = GsonParser.parseString(jsonObject.get("partnerTagsMultiLikeOr"));
		partnerTagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("partnerTagsMultiLikeAnd"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUiConfBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("nameLike", this.nameLike);
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("partnerIdIn", this.partnerIdIn);
		kparams.add("objTypeEqual", this.objTypeEqual);
		kparams.add("objTypeIn", this.objTypeIn);
		kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
		kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("creationModeEqual", this.creationModeEqual);
		kparams.add("creationModeIn", this.creationModeIn);
		kparams.add("versionEqual", this.versionEqual);
		kparams.add("versionMultiLikeOr", this.versionMultiLikeOr);
		kparams.add("versionMultiLikeAnd", this.versionMultiLikeAnd);
		kparams.add("partnerTagsMultiLikeOr", this.partnerTagsMultiLikeOr);
		kparams.add("partnerTagsMultiLikeAnd", this.partnerTagsMultiLikeAnd);
		return kparams;
	}

}

