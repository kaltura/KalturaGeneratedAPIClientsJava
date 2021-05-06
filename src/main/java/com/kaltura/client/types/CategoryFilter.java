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
// Copyright (C) 2006-2021  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(CategoryFilter.Tokenizer.class)
public class CategoryFilter extends CategoryBaseFilter {
	
	public interface Tokenizer extends CategoryBaseFilter.Tokenizer {
		String freeText();
		String membersIn();
		String nameOrReferenceIdStartsWith();
		String managerEqual();
		String memberEqual();
		String fullNameStartsWithIn();
		String ancestorIdIn();
		String idOrInheritedParentIdIn();
	}

	private String freeText;
	private String membersIn;
	private String nameOrReferenceIdStartsWith;
	private String managerEqual;
	private String memberEqual;
	private String fullNameStartsWithIn;
	/**
	 * not includes the category itself (only sub categories)
	 */
	private String ancestorIdIn;
	private String idOrInheritedParentIdIn;

	// freeText:
	public String getFreeText(){
		return this.freeText;
	}
	public void setFreeText(String freeText){
		this.freeText = freeText;
	}

	public void freeText(String multirequestToken){
		setToken("freeText", multirequestToken);
	}

	// membersIn:
	public String getMembersIn(){
		return this.membersIn;
	}
	public void setMembersIn(String membersIn){
		this.membersIn = membersIn;
	}

	public void membersIn(String multirequestToken){
		setToken("membersIn", multirequestToken);
	}

	// nameOrReferenceIdStartsWith:
	public String getNameOrReferenceIdStartsWith(){
		return this.nameOrReferenceIdStartsWith;
	}
	public void setNameOrReferenceIdStartsWith(String nameOrReferenceIdStartsWith){
		this.nameOrReferenceIdStartsWith = nameOrReferenceIdStartsWith;
	}

	public void nameOrReferenceIdStartsWith(String multirequestToken){
		setToken("nameOrReferenceIdStartsWith", multirequestToken);
	}

	// managerEqual:
	public String getManagerEqual(){
		return this.managerEqual;
	}
	public void setManagerEqual(String managerEqual){
		this.managerEqual = managerEqual;
	}

	public void managerEqual(String multirequestToken){
		setToken("managerEqual", multirequestToken);
	}

	// memberEqual:
	public String getMemberEqual(){
		return this.memberEqual;
	}
	public void setMemberEqual(String memberEqual){
		this.memberEqual = memberEqual;
	}

	public void memberEqual(String multirequestToken){
		setToken("memberEqual", multirequestToken);
	}

	// fullNameStartsWithIn:
	public String getFullNameStartsWithIn(){
		return this.fullNameStartsWithIn;
	}
	public void setFullNameStartsWithIn(String fullNameStartsWithIn){
		this.fullNameStartsWithIn = fullNameStartsWithIn;
	}

	public void fullNameStartsWithIn(String multirequestToken){
		setToken("fullNameStartsWithIn", multirequestToken);
	}

	// ancestorIdIn:
	public String getAncestorIdIn(){
		return this.ancestorIdIn;
	}
	public void setAncestorIdIn(String ancestorIdIn){
		this.ancestorIdIn = ancestorIdIn;
	}

	public void ancestorIdIn(String multirequestToken){
		setToken("ancestorIdIn", multirequestToken);
	}

	// idOrInheritedParentIdIn:
	public String getIdOrInheritedParentIdIn(){
		return this.idOrInheritedParentIdIn;
	}
	public void setIdOrInheritedParentIdIn(String idOrInheritedParentIdIn){
		this.idOrInheritedParentIdIn = idOrInheritedParentIdIn;
	}

	public void idOrInheritedParentIdIn(String multirequestToken){
		setToken("idOrInheritedParentIdIn", multirequestToken);
	}


	public CategoryFilter() {
		super();
	}

	public CategoryFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		freeText = GsonParser.parseString(jsonObject.get("freeText"));
		membersIn = GsonParser.parseString(jsonObject.get("membersIn"));
		nameOrReferenceIdStartsWith = GsonParser.parseString(jsonObject.get("nameOrReferenceIdStartsWith"));
		managerEqual = GsonParser.parseString(jsonObject.get("managerEqual"));
		memberEqual = GsonParser.parseString(jsonObject.get("memberEqual"));
		fullNameStartsWithIn = GsonParser.parseString(jsonObject.get("fullNameStartsWithIn"));
		ancestorIdIn = GsonParser.parseString(jsonObject.get("ancestorIdIn"));
		idOrInheritedParentIdIn = GsonParser.parseString(jsonObject.get("idOrInheritedParentIdIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCategoryFilter");
		kparams.add("freeText", this.freeText);
		kparams.add("membersIn", this.membersIn);
		kparams.add("nameOrReferenceIdStartsWith", this.nameOrReferenceIdStartsWith);
		kparams.add("managerEqual", this.managerEqual);
		kparams.add("memberEqual", this.memberEqual);
		kparams.add("fullNameStartsWithIn", this.fullNameStartsWithIn);
		kparams.add("ancestorIdIn", this.ancestorIdIn);
		kparams.add("idOrInheritedParentIdIn", this.idOrInheritedParentIdIn);
		return kparams;
	}

}

