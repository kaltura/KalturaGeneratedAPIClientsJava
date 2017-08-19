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
import com.kaltura.client.enums.AppearInListType;
import com.kaltura.client.enums.CategoryStatus;
import com.kaltura.client.enums.ContributionPolicyType;
import com.kaltura.client.enums.InheritanceType;
import com.kaltura.client.enums.PrivacyType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CategoryBaseFilter.Tokenizer.class)
public abstract class CategoryBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String idEqual();
		String idIn();
		String idNotIn();
		String parentIdEqual();
		String parentIdIn();
		String depthEqual();
		String fullNameEqual();
		String fullNameStartsWith();
		String fullNameIn();
		String fullIdsEqual();
		String fullIdsStartsWith();
		String fullIdsMatchOr();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String tagsLike();
		String tagsMultiLikeOr();
		String tagsMultiLikeAnd();
		String appearInListEqual();
		String privacyEqual();
		String privacyIn();
		String inheritanceTypeEqual();
		String inheritanceTypeIn();
		String referenceIdEqual();
		String referenceIdEmpty();
		String contributionPolicyEqual();
		String membersCountGreaterThanOrEqual();
		String membersCountLessThanOrEqual();
		String pendingMembersCountGreaterThanOrEqual();
		String pendingMembersCountLessThanOrEqual();
		String privacyContextEqual();
		String statusEqual();
		String statusIn();
		String inheritedParentIdEqual();
		String inheritedParentIdIn();
		String partnerSortValueGreaterThanOrEqual();
		String partnerSortValueLessThanOrEqual();
		String aggregationCategoriesMultiLikeOr();
		String aggregationCategoriesMultiLikeAnd();
	}

	private Integer idEqual;
	private String idIn;
	private String idNotIn;
	private Integer parentIdEqual;
	private String parentIdIn;
	private Integer depthEqual;
	private String fullNameEqual;
	private String fullNameStartsWith;
	private String fullNameIn;
	private String fullIdsEqual;
	private String fullIdsStartsWith;
	private String fullIdsMatchOr;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private String tagsLike;
	private String tagsMultiLikeOr;
	private String tagsMultiLikeAnd;
	private AppearInListType appearInListEqual;
	private PrivacyType privacyEqual;
	private String privacyIn;
	private InheritanceType inheritanceTypeEqual;
	private String inheritanceTypeIn;
	private String referenceIdEqual;
	private Boolean referenceIdEmpty;
	private ContributionPolicyType contributionPolicyEqual;
	private Integer membersCountGreaterThanOrEqual;
	private Integer membersCountLessThanOrEqual;
	private Integer pendingMembersCountGreaterThanOrEqual;
	private Integer pendingMembersCountLessThanOrEqual;
	private String privacyContextEqual;
	private CategoryStatus statusEqual;
	private String statusIn;
	private Integer inheritedParentIdEqual;
	private String inheritedParentIdIn;
	private Integer partnerSortValueGreaterThanOrEqual;
	private Integer partnerSortValueLessThanOrEqual;
	private String aggregationCategoriesMultiLikeOr;
	private String aggregationCategoriesMultiLikeAnd;

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

	// parentIdEqual:
	public Integer getParentIdEqual(){
		return this.parentIdEqual;
	}
	public void setParentIdEqual(Integer parentIdEqual){
		this.parentIdEqual = parentIdEqual;
	}

	public void parentIdEqual(String multirequestToken){
		setToken("parentIdEqual", multirequestToken);
	}

	// parentIdIn:
	public String getParentIdIn(){
		return this.parentIdIn;
	}
	public void setParentIdIn(String parentIdIn){
		this.parentIdIn = parentIdIn;
	}

	public void parentIdIn(String multirequestToken){
		setToken("parentIdIn", multirequestToken);
	}

	// depthEqual:
	public Integer getDepthEqual(){
		return this.depthEqual;
	}
	public void setDepthEqual(Integer depthEqual){
		this.depthEqual = depthEqual;
	}

	public void depthEqual(String multirequestToken){
		setToken("depthEqual", multirequestToken);
	}

	// fullNameEqual:
	public String getFullNameEqual(){
		return this.fullNameEqual;
	}
	public void setFullNameEqual(String fullNameEqual){
		this.fullNameEqual = fullNameEqual;
	}

	public void fullNameEqual(String multirequestToken){
		setToken("fullNameEqual", multirequestToken);
	}

	// fullNameStartsWith:
	public String getFullNameStartsWith(){
		return this.fullNameStartsWith;
	}
	public void setFullNameStartsWith(String fullNameStartsWith){
		this.fullNameStartsWith = fullNameStartsWith;
	}

	public void fullNameStartsWith(String multirequestToken){
		setToken("fullNameStartsWith", multirequestToken);
	}

	// fullNameIn:
	public String getFullNameIn(){
		return this.fullNameIn;
	}
	public void setFullNameIn(String fullNameIn){
		this.fullNameIn = fullNameIn;
	}

	public void fullNameIn(String multirequestToken){
		setToken("fullNameIn", multirequestToken);
	}

	// fullIdsEqual:
	public String getFullIdsEqual(){
		return this.fullIdsEqual;
	}
	public void setFullIdsEqual(String fullIdsEqual){
		this.fullIdsEqual = fullIdsEqual;
	}

	public void fullIdsEqual(String multirequestToken){
		setToken("fullIdsEqual", multirequestToken);
	}

	// fullIdsStartsWith:
	public String getFullIdsStartsWith(){
		return this.fullIdsStartsWith;
	}
	public void setFullIdsStartsWith(String fullIdsStartsWith){
		this.fullIdsStartsWith = fullIdsStartsWith;
	}

	public void fullIdsStartsWith(String multirequestToken){
		setToken("fullIdsStartsWith", multirequestToken);
	}

	// fullIdsMatchOr:
	public String getFullIdsMatchOr(){
		return this.fullIdsMatchOr;
	}
	public void setFullIdsMatchOr(String fullIdsMatchOr){
		this.fullIdsMatchOr = fullIdsMatchOr;
	}

	public void fullIdsMatchOr(String multirequestToken){
		setToken("fullIdsMatchOr", multirequestToken);
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

	// appearInListEqual:
	public AppearInListType getAppearInListEqual(){
		return this.appearInListEqual;
	}
	public void setAppearInListEqual(AppearInListType appearInListEqual){
		this.appearInListEqual = appearInListEqual;
	}

	public void appearInListEqual(String multirequestToken){
		setToken("appearInListEqual", multirequestToken);
	}

	// privacyEqual:
	public PrivacyType getPrivacyEqual(){
		return this.privacyEqual;
	}
	public void setPrivacyEqual(PrivacyType privacyEqual){
		this.privacyEqual = privacyEqual;
	}

	public void privacyEqual(String multirequestToken){
		setToken("privacyEqual", multirequestToken);
	}

	// privacyIn:
	public String getPrivacyIn(){
		return this.privacyIn;
	}
	public void setPrivacyIn(String privacyIn){
		this.privacyIn = privacyIn;
	}

	public void privacyIn(String multirequestToken){
		setToken("privacyIn", multirequestToken);
	}

	// inheritanceTypeEqual:
	public InheritanceType getInheritanceTypeEqual(){
		return this.inheritanceTypeEqual;
	}
	public void setInheritanceTypeEqual(InheritanceType inheritanceTypeEqual){
		this.inheritanceTypeEqual = inheritanceTypeEqual;
	}

	public void inheritanceTypeEqual(String multirequestToken){
		setToken("inheritanceTypeEqual", multirequestToken);
	}

	// inheritanceTypeIn:
	public String getInheritanceTypeIn(){
		return this.inheritanceTypeIn;
	}
	public void setInheritanceTypeIn(String inheritanceTypeIn){
		this.inheritanceTypeIn = inheritanceTypeIn;
	}

	public void inheritanceTypeIn(String multirequestToken){
		setToken("inheritanceTypeIn", multirequestToken);
	}

	// referenceIdEqual:
	public String getReferenceIdEqual(){
		return this.referenceIdEqual;
	}
	public void setReferenceIdEqual(String referenceIdEqual){
		this.referenceIdEqual = referenceIdEqual;
	}

	public void referenceIdEqual(String multirequestToken){
		setToken("referenceIdEqual", multirequestToken);
	}

	// referenceIdEmpty:
	public Boolean getReferenceIdEmpty(){
		return this.referenceIdEmpty;
	}
	public void setReferenceIdEmpty(Boolean referenceIdEmpty){
		this.referenceIdEmpty = referenceIdEmpty;
	}

	public void referenceIdEmpty(String multirequestToken){
		setToken("referenceIdEmpty", multirequestToken);
	}

	// contributionPolicyEqual:
	public ContributionPolicyType getContributionPolicyEqual(){
		return this.contributionPolicyEqual;
	}
	public void setContributionPolicyEqual(ContributionPolicyType contributionPolicyEqual){
		this.contributionPolicyEqual = contributionPolicyEqual;
	}

	public void contributionPolicyEqual(String multirequestToken){
		setToken("contributionPolicyEqual", multirequestToken);
	}

	// membersCountGreaterThanOrEqual:
	public Integer getMembersCountGreaterThanOrEqual(){
		return this.membersCountGreaterThanOrEqual;
	}
	public void setMembersCountGreaterThanOrEqual(Integer membersCountGreaterThanOrEqual){
		this.membersCountGreaterThanOrEqual = membersCountGreaterThanOrEqual;
	}

	public void membersCountGreaterThanOrEqual(String multirequestToken){
		setToken("membersCountGreaterThanOrEqual", multirequestToken);
	}

	// membersCountLessThanOrEqual:
	public Integer getMembersCountLessThanOrEqual(){
		return this.membersCountLessThanOrEqual;
	}
	public void setMembersCountLessThanOrEqual(Integer membersCountLessThanOrEqual){
		this.membersCountLessThanOrEqual = membersCountLessThanOrEqual;
	}

	public void membersCountLessThanOrEqual(String multirequestToken){
		setToken("membersCountLessThanOrEqual", multirequestToken);
	}

	// pendingMembersCountGreaterThanOrEqual:
	public Integer getPendingMembersCountGreaterThanOrEqual(){
		return this.pendingMembersCountGreaterThanOrEqual;
	}
	public void setPendingMembersCountGreaterThanOrEqual(Integer pendingMembersCountGreaterThanOrEqual){
		this.pendingMembersCountGreaterThanOrEqual = pendingMembersCountGreaterThanOrEqual;
	}

	public void pendingMembersCountGreaterThanOrEqual(String multirequestToken){
		setToken("pendingMembersCountGreaterThanOrEqual", multirequestToken);
	}

	// pendingMembersCountLessThanOrEqual:
	public Integer getPendingMembersCountLessThanOrEqual(){
		return this.pendingMembersCountLessThanOrEqual;
	}
	public void setPendingMembersCountLessThanOrEqual(Integer pendingMembersCountLessThanOrEqual){
		this.pendingMembersCountLessThanOrEqual = pendingMembersCountLessThanOrEqual;
	}

	public void pendingMembersCountLessThanOrEqual(String multirequestToken){
		setToken("pendingMembersCountLessThanOrEqual", multirequestToken);
	}

	// privacyContextEqual:
	public String getPrivacyContextEqual(){
		return this.privacyContextEqual;
	}
	public void setPrivacyContextEqual(String privacyContextEqual){
		this.privacyContextEqual = privacyContextEqual;
	}

	public void privacyContextEqual(String multirequestToken){
		setToken("privacyContextEqual", multirequestToken);
	}

	// statusEqual:
	public CategoryStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(CategoryStatus statusEqual){
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

	// inheritedParentIdEqual:
	public Integer getInheritedParentIdEqual(){
		return this.inheritedParentIdEqual;
	}
	public void setInheritedParentIdEqual(Integer inheritedParentIdEqual){
		this.inheritedParentIdEqual = inheritedParentIdEqual;
	}

	public void inheritedParentIdEqual(String multirequestToken){
		setToken("inheritedParentIdEqual", multirequestToken);
	}

	// inheritedParentIdIn:
	public String getInheritedParentIdIn(){
		return this.inheritedParentIdIn;
	}
	public void setInheritedParentIdIn(String inheritedParentIdIn){
		this.inheritedParentIdIn = inheritedParentIdIn;
	}

	public void inheritedParentIdIn(String multirequestToken){
		setToken("inheritedParentIdIn", multirequestToken);
	}

	// partnerSortValueGreaterThanOrEqual:
	public Integer getPartnerSortValueGreaterThanOrEqual(){
		return this.partnerSortValueGreaterThanOrEqual;
	}
	public void setPartnerSortValueGreaterThanOrEqual(Integer partnerSortValueGreaterThanOrEqual){
		this.partnerSortValueGreaterThanOrEqual = partnerSortValueGreaterThanOrEqual;
	}

	public void partnerSortValueGreaterThanOrEqual(String multirequestToken){
		setToken("partnerSortValueGreaterThanOrEqual", multirequestToken);
	}

	// partnerSortValueLessThanOrEqual:
	public Integer getPartnerSortValueLessThanOrEqual(){
		return this.partnerSortValueLessThanOrEqual;
	}
	public void setPartnerSortValueLessThanOrEqual(Integer partnerSortValueLessThanOrEqual){
		this.partnerSortValueLessThanOrEqual = partnerSortValueLessThanOrEqual;
	}

	public void partnerSortValueLessThanOrEqual(String multirequestToken){
		setToken("partnerSortValueLessThanOrEqual", multirequestToken);
	}

	// aggregationCategoriesMultiLikeOr:
	public String getAggregationCategoriesMultiLikeOr(){
		return this.aggregationCategoriesMultiLikeOr;
	}
	public void setAggregationCategoriesMultiLikeOr(String aggregationCategoriesMultiLikeOr){
		this.aggregationCategoriesMultiLikeOr = aggregationCategoriesMultiLikeOr;
	}

	public void aggregationCategoriesMultiLikeOr(String multirequestToken){
		setToken("aggregationCategoriesMultiLikeOr", multirequestToken);
	}

	// aggregationCategoriesMultiLikeAnd:
	public String getAggregationCategoriesMultiLikeAnd(){
		return this.aggregationCategoriesMultiLikeAnd;
	}
	public void setAggregationCategoriesMultiLikeAnd(String aggregationCategoriesMultiLikeAnd){
		this.aggregationCategoriesMultiLikeAnd = aggregationCategoriesMultiLikeAnd;
	}

	public void aggregationCategoriesMultiLikeAnd(String multirequestToken){
		setToken("aggregationCategoriesMultiLikeAnd", multirequestToken);
	}


	public CategoryBaseFilter() {
		super();
	}

	public CategoryBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		idNotIn = GsonParser.parseString(jsonObject.get("idNotIn"));
		parentIdEqual = GsonParser.parseInt(jsonObject.get("parentIdEqual"));
		parentIdIn = GsonParser.parseString(jsonObject.get("parentIdIn"));
		depthEqual = GsonParser.parseInt(jsonObject.get("depthEqual"));
		fullNameEqual = GsonParser.parseString(jsonObject.get("fullNameEqual"));
		fullNameStartsWith = GsonParser.parseString(jsonObject.get("fullNameStartsWith"));
		fullNameIn = GsonParser.parseString(jsonObject.get("fullNameIn"));
		fullIdsEqual = GsonParser.parseString(jsonObject.get("fullIdsEqual"));
		fullIdsStartsWith = GsonParser.parseString(jsonObject.get("fullIdsStartsWith"));
		fullIdsMatchOr = GsonParser.parseString(jsonObject.get("fullIdsMatchOr"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		tagsLike = GsonParser.parseString(jsonObject.get("tagsLike"));
		tagsMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsMultiLikeOr"));
		tagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsMultiLikeAnd"));
		appearInListEqual = AppearInListType.get(GsonParser.parseInt(jsonObject.get("appearInListEqual")));
		privacyEqual = PrivacyType.get(GsonParser.parseInt(jsonObject.get("privacyEqual")));
		privacyIn = GsonParser.parseString(jsonObject.get("privacyIn"));
		inheritanceTypeEqual = InheritanceType.get(GsonParser.parseInt(jsonObject.get("inheritanceTypeEqual")));
		inheritanceTypeIn = GsonParser.parseString(jsonObject.get("inheritanceTypeIn"));
		referenceIdEqual = GsonParser.parseString(jsonObject.get("referenceIdEqual"));
		referenceIdEmpty = GsonParser.parseBoolean(jsonObject.get("referenceIdEmpty"));
		contributionPolicyEqual = ContributionPolicyType.get(GsonParser.parseInt(jsonObject.get("contributionPolicyEqual")));
		membersCountGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("membersCountGreaterThanOrEqual"));
		membersCountLessThanOrEqual = GsonParser.parseInt(jsonObject.get("membersCountLessThanOrEqual"));
		pendingMembersCountGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("pendingMembersCountGreaterThanOrEqual"));
		pendingMembersCountLessThanOrEqual = GsonParser.parseInt(jsonObject.get("pendingMembersCountLessThanOrEqual"));
		privacyContextEqual = GsonParser.parseString(jsonObject.get("privacyContextEqual"));
		statusEqual = CategoryStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
		inheritedParentIdEqual = GsonParser.parseInt(jsonObject.get("inheritedParentIdEqual"));
		inheritedParentIdIn = GsonParser.parseString(jsonObject.get("inheritedParentIdIn"));
		partnerSortValueGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("partnerSortValueGreaterThanOrEqual"));
		partnerSortValueLessThanOrEqual = GsonParser.parseInt(jsonObject.get("partnerSortValueLessThanOrEqual"));
		aggregationCategoriesMultiLikeOr = GsonParser.parseString(jsonObject.get("aggregationCategoriesMultiLikeOr"));
		aggregationCategoriesMultiLikeAnd = GsonParser.parseString(jsonObject.get("aggregationCategoriesMultiLikeAnd"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCategoryBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("idNotIn", this.idNotIn);
		kparams.add("parentIdEqual", this.parentIdEqual);
		kparams.add("parentIdIn", this.parentIdIn);
		kparams.add("depthEqual", this.depthEqual);
		kparams.add("fullNameEqual", this.fullNameEqual);
		kparams.add("fullNameStartsWith", this.fullNameStartsWith);
		kparams.add("fullNameIn", this.fullNameIn);
		kparams.add("fullIdsEqual", this.fullIdsEqual);
		kparams.add("fullIdsStartsWith", this.fullIdsStartsWith);
		kparams.add("fullIdsMatchOr", this.fullIdsMatchOr);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("tagsLike", this.tagsLike);
		kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
		kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
		kparams.add("appearInListEqual", this.appearInListEqual);
		kparams.add("privacyEqual", this.privacyEqual);
		kparams.add("privacyIn", this.privacyIn);
		kparams.add("inheritanceTypeEqual", this.inheritanceTypeEqual);
		kparams.add("inheritanceTypeIn", this.inheritanceTypeIn);
		kparams.add("referenceIdEqual", this.referenceIdEqual);
		kparams.add("referenceIdEmpty", this.referenceIdEmpty);
		kparams.add("contributionPolicyEqual", this.contributionPolicyEqual);
		kparams.add("membersCountGreaterThanOrEqual", this.membersCountGreaterThanOrEqual);
		kparams.add("membersCountLessThanOrEqual", this.membersCountLessThanOrEqual);
		kparams.add("pendingMembersCountGreaterThanOrEqual", this.pendingMembersCountGreaterThanOrEqual);
		kparams.add("pendingMembersCountLessThanOrEqual", this.pendingMembersCountLessThanOrEqual);
		kparams.add("privacyContextEqual", this.privacyContextEqual);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		kparams.add("inheritedParentIdEqual", this.inheritedParentIdEqual);
		kparams.add("inheritedParentIdIn", this.inheritedParentIdIn);
		kparams.add("partnerSortValueGreaterThanOrEqual", this.partnerSortValueGreaterThanOrEqual);
		kparams.add("partnerSortValueLessThanOrEqual", this.partnerSortValueLessThanOrEqual);
		kparams.add("aggregationCategoriesMultiLikeOr", this.aggregationCategoriesMultiLikeOr);
		kparams.add("aggregationCategoriesMultiLikeAnd", this.aggregationCategoriesMultiLikeAnd);
		return kparams;
	}

}

