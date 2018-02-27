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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.DistributionAction;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(GenericDistributionProviderActionBaseFilter.Tokenizer.class)
public abstract class GenericDistributionProviderActionBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idEqual();
		String idIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String genericDistributionProviderIdEqual();
		String genericDistributionProviderIdIn();
		String actionEqual();
		String actionIn();
	}

	private Integer idEqual;
	private String idIn;
	private Integer createdAtGreaterThanOrEqual;
	private Integer createdAtLessThanOrEqual;
	private Integer updatedAtGreaterThanOrEqual;
	private Integer updatedAtLessThanOrEqual;
	private Integer genericDistributionProviderIdEqual;
	private String genericDistributionProviderIdIn;
	private DistributionAction actionEqual;
	private String actionIn;

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

	// genericDistributionProviderIdEqual:
	public Integer getGenericDistributionProviderIdEqual(){
		return this.genericDistributionProviderIdEqual;
	}
	public void setGenericDistributionProviderIdEqual(Integer genericDistributionProviderIdEqual){
		this.genericDistributionProviderIdEqual = genericDistributionProviderIdEqual;
	}

	public void genericDistributionProviderIdEqual(String multirequestToken){
		setToken("genericDistributionProviderIdEqual", multirequestToken);
	}

	// genericDistributionProviderIdIn:
	public String getGenericDistributionProviderIdIn(){
		return this.genericDistributionProviderIdIn;
	}
	public void setGenericDistributionProviderIdIn(String genericDistributionProviderIdIn){
		this.genericDistributionProviderIdIn = genericDistributionProviderIdIn;
	}

	public void genericDistributionProviderIdIn(String multirequestToken){
		setToken("genericDistributionProviderIdIn", multirequestToken);
	}

	// actionEqual:
	public DistributionAction getActionEqual(){
		return this.actionEqual;
	}
	public void setActionEqual(DistributionAction actionEqual){
		this.actionEqual = actionEqual;
	}

	public void actionEqual(String multirequestToken){
		setToken("actionEqual", multirequestToken);
	}

	// actionIn:
	public String getActionIn(){
		return this.actionIn;
	}
	public void setActionIn(String actionIn){
		this.actionIn = actionIn;
	}

	public void actionIn(String multirequestToken){
		setToken("actionIn", multirequestToken);
	}


	public GenericDistributionProviderActionBaseFilter() {
		super();
	}

	public GenericDistributionProviderActionBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
		genericDistributionProviderIdEqual = GsonParser.parseInt(jsonObject.get("genericDistributionProviderIdEqual"));
		genericDistributionProviderIdIn = GsonParser.parseString(jsonObject.get("genericDistributionProviderIdIn"));
		actionEqual = DistributionAction.get(GsonParser.parseInt(jsonObject.get("actionEqual")));
		actionIn = GsonParser.parseString(jsonObject.get("actionIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaGenericDistributionProviderActionBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("genericDistributionProviderIdEqual", this.genericDistributionProviderIdEqual);
		kparams.add("genericDistributionProviderIdIn", this.genericDistributionProviderIdIn);
		kparams.add("actionEqual", this.actionEqual);
		kparams.add("actionIn", this.actionIn);
		return kparams;
	}

}

