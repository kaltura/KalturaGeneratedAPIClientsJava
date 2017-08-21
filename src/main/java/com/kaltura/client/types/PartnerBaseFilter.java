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
// Copyright (C) 2006-2017  Kaltura Inc.
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
import com.kaltura.client.enums.PartnerGroupType;
import com.kaltura.client.enums.PartnerStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PartnerBaseFilter.Tokenizer.class)
public abstract class PartnerBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idEqual();
		String idIn();
		String idNotIn();
		String nameLike();
		String nameMultiLikeOr();
		String nameMultiLikeAnd();
		String nameEqual();
		String statusEqual();
		String statusIn();
		String partnerPackageEqual();
		String partnerPackageGreaterThanOrEqual();
		String partnerPackageLessThanOrEqual();
		String partnerPackageIn();
		String partnerGroupTypeEqual();
		String partnerNameDescriptionWebsiteAdminNameAdminEmailLike();
	}

	private Integer idEqual;
	private String idIn;
	private String idNotIn;
	private String nameLike;
	private String nameMultiLikeOr;
	private String nameMultiLikeAnd;
	private String nameEqual;
	private PartnerStatus statusEqual;
	private String statusIn;
	private Integer partnerPackageEqual;
	private Integer partnerPackageGreaterThanOrEqual;
	private Integer partnerPackageLessThanOrEqual;
	private String partnerPackageIn;
	private PartnerGroupType partnerGroupTypeEqual;
	private String partnerNameDescriptionWebsiteAdminNameAdminEmailLike;

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

	// idNotIn:
	public String getIdNotIn(){
		return this.idNotIn;
	}
	public void setIdNotIn(String idNotIn){
		this.idNotIn = idNotIn;
	}

	public void idNotIn(String multirequestToken){
		setToken("idNotIn", multirequestToken);
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

	// nameMultiLikeOr:
	public String getNameMultiLikeOr(){
		return this.nameMultiLikeOr;
	}
	public void setNameMultiLikeOr(String nameMultiLikeOr){
		this.nameMultiLikeOr = nameMultiLikeOr;
	}

	public void nameMultiLikeOr(String multirequestToken){
		setToken("nameMultiLikeOr", multirequestToken);
	}

	// nameMultiLikeAnd:
	public String getNameMultiLikeAnd(){
		return this.nameMultiLikeAnd;
	}
	public void setNameMultiLikeAnd(String nameMultiLikeAnd){
		this.nameMultiLikeAnd = nameMultiLikeAnd;
	}

	public void nameMultiLikeAnd(String multirequestToken){
		setToken("nameMultiLikeAnd", multirequestToken);
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

	// statusEqual:
	public PartnerStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(PartnerStatus statusEqual){
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

	// partnerPackageEqual:
	public Integer getPartnerPackageEqual(){
		return this.partnerPackageEqual;
	}
	public void setPartnerPackageEqual(Integer partnerPackageEqual){
		this.partnerPackageEqual = partnerPackageEqual;
	}

	public void partnerPackageEqual(String multirequestToken){
		setToken("partnerPackageEqual", multirequestToken);
	}

	// partnerPackageGreaterThanOrEqual:
	public Integer getPartnerPackageGreaterThanOrEqual(){
		return this.partnerPackageGreaterThanOrEqual;
	}
	public void setPartnerPackageGreaterThanOrEqual(Integer partnerPackageGreaterThanOrEqual){
		this.partnerPackageGreaterThanOrEqual = partnerPackageGreaterThanOrEqual;
	}

	public void partnerPackageGreaterThanOrEqual(String multirequestToken){
		setToken("partnerPackageGreaterThanOrEqual", multirequestToken);
	}

	// partnerPackageLessThanOrEqual:
	public Integer getPartnerPackageLessThanOrEqual(){
		return this.partnerPackageLessThanOrEqual;
	}
	public void setPartnerPackageLessThanOrEqual(Integer partnerPackageLessThanOrEqual){
		this.partnerPackageLessThanOrEqual = partnerPackageLessThanOrEqual;
	}

	public void partnerPackageLessThanOrEqual(String multirequestToken){
		setToken("partnerPackageLessThanOrEqual", multirequestToken);
	}

	// partnerPackageIn:
	public String getPartnerPackageIn(){
		return this.partnerPackageIn;
	}
	public void setPartnerPackageIn(String partnerPackageIn){
		this.partnerPackageIn = partnerPackageIn;
	}

	public void partnerPackageIn(String multirequestToken){
		setToken("partnerPackageIn", multirequestToken);
	}

	// partnerGroupTypeEqual:
	public PartnerGroupType getPartnerGroupTypeEqual(){
		return this.partnerGroupTypeEqual;
	}
	public void setPartnerGroupTypeEqual(PartnerGroupType partnerGroupTypeEqual){
		this.partnerGroupTypeEqual = partnerGroupTypeEqual;
	}

	public void partnerGroupTypeEqual(String multirequestToken){
		setToken("partnerGroupTypeEqual", multirequestToken);
	}

	// partnerNameDescriptionWebsiteAdminNameAdminEmailLike:
	public String getPartnerNameDescriptionWebsiteAdminNameAdminEmailLike(){
		return this.partnerNameDescriptionWebsiteAdminNameAdminEmailLike;
	}
	public void setPartnerNameDescriptionWebsiteAdminNameAdminEmailLike(String partnerNameDescriptionWebsiteAdminNameAdminEmailLike){
		this.partnerNameDescriptionWebsiteAdminNameAdminEmailLike = partnerNameDescriptionWebsiteAdminNameAdminEmailLike;
	}

	public void partnerNameDescriptionWebsiteAdminNameAdminEmailLike(String multirequestToken){
		setToken("partnerNameDescriptionWebsiteAdminNameAdminEmailLike", multirequestToken);
	}


	public PartnerBaseFilter() {
		super();
	}

	public PartnerBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		idNotIn = GsonParser.parseString(jsonObject.get("idNotIn"));
		nameLike = GsonParser.parseString(jsonObject.get("nameLike"));
		nameMultiLikeOr = GsonParser.parseString(jsonObject.get("nameMultiLikeOr"));
		nameMultiLikeAnd = GsonParser.parseString(jsonObject.get("nameMultiLikeAnd"));
		nameEqual = GsonParser.parseString(jsonObject.get("nameEqual"));
		statusEqual = PartnerStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		partnerPackageEqual = GsonParser.parseInt(jsonObject.get("partnerPackageEqual"));
		partnerPackageGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("partnerPackageGreaterThanOrEqual"));
		partnerPackageLessThanOrEqual = GsonParser.parseInt(jsonObject.get("partnerPackageLessThanOrEqual"));
		partnerPackageIn = GsonParser.parseString(jsonObject.get("partnerPackageIn"));
		partnerGroupTypeEqual = PartnerGroupType.get(GsonParser.parseInt(jsonObject.get("partnerGroupTypeEqual")));
		partnerNameDescriptionWebsiteAdminNameAdminEmailLike = GsonParser.parseString(jsonObject.get("partnerNameDescriptionWebsiteAdminNameAdminEmailLike"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPartnerBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("idNotIn", this.idNotIn);
		kparams.add("nameLike", this.nameLike);
		kparams.add("nameMultiLikeOr", this.nameMultiLikeOr);
		kparams.add("nameMultiLikeAnd", this.nameMultiLikeAnd);
		kparams.add("nameEqual", this.nameEqual);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("partnerPackageEqual", this.partnerPackageEqual);
		kparams.add("partnerPackageGreaterThanOrEqual", this.partnerPackageGreaterThanOrEqual);
		kparams.add("partnerPackageLessThanOrEqual", this.partnerPackageLessThanOrEqual);
		kparams.add("partnerPackageIn", this.partnerPackageIn);
		kparams.add("partnerGroupTypeEqual", this.partnerGroupTypeEqual);
		kparams.add("partnerNameDescriptionWebsiteAdminNameAdminEmailLike", this.partnerNameDescriptionWebsiteAdminNameAdminEmailLike);
		return kparams;
	}

}

