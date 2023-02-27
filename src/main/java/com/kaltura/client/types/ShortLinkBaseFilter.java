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
import com.kaltura.client.enums.ShortLinkStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ShortLinkBaseFilter.Tokenizer.class)
public abstract class ShortLinkBaseFilter extends Filter {
	
	public interface Tokenizer extends Filter.Tokenizer {
		String idEqual();
		String idIn();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String expiresAtGreaterThanOrEqual();
		String expiresAtLessThanOrEqual();
		String partnerIdEqual();
		String partnerIdIn();
		String userIdEqual();
		String userIdIn();
		String systemNameEqual();
		String systemNameIn();
		String statusEqual();
		String statusIn();
	}

	private String idEqual;
	private String idIn;
	private Long createdAtGreaterThanOrEqual;
	private Long createdAtLessThanOrEqual;
	private Long updatedAtGreaterThanOrEqual;
	private Long updatedAtLessThanOrEqual;
	private Integer expiresAtGreaterThanOrEqual;
	private Integer expiresAtLessThanOrEqual;
	private Integer partnerIdEqual;
	private String partnerIdIn;
	private String userIdEqual;
	private String userIdIn;
	private String systemNameEqual;
	private String systemNameIn;
	private ShortLinkStatus statusEqual;
	private String statusIn;

	// idEqual:
	public String getIdEqual(){
		return this.idEqual;
	}
	public void setIdEqual(String idEqual){
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

	// expiresAtGreaterThanOrEqual:
	public Integer getExpiresAtGreaterThanOrEqual(){
		return this.expiresAtGreaterThanOrEqual;
	}
	public void setExpiresAtGreaterThanOrEqual(Integer expiresAtGreaterThanOrEqual){
		this.expiresAtGreaterThanOrEqual = expiresAtGreaterThanOrEqual;
	}

	public void expiresAtGreaterThanOrEqual(String multirequestToken){
		setToken("expiresAtGreaterThanOrEqual", multirequestToken);
	}

	// expiresAtLessThanOrEqual:
	public Integer getExpiresAtLessThanOrEqual(){
		return this.expiresAtLessThanOrEqual;
	}
	public void setExpiresAtLessThanOrEqual(Integer expiresAtLessThanOrEqual){
		this.expiresAtLessThanOrEqual = expiresAtLessThanOrEqual;
	}

	public void expiresAtLessThanOrEqual(String multirequestToken){
		setToken("expiresAtLessThanOrEqual", multirequestToken);
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

	// userIdEqual:
	public String getUserIdEqual(){
		return this.userIdEqual;
	}
	public void setUserIdEqual(String userIdEqual){
		this.userIdEqual = userIdEqual;
	}

	public void userIdEqual(String multirequestToken){
		setToken("userIdEqual", multirequestToken);
	}

	// userIdIn:
	public String getUserIdIn(){
		return this.userIdIn;
	}
	public void setUserIdIn(String userIdIn){
		this.userIdIn = userIdIn;
	}

	public void userIdIn(String multirequestToken){
		setToken("userIdIn", multirequestToken);
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

	// statusEqual:
	public ShortLinkStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(ShortLinkStatus statusEqual){
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


	public ShortLinkBaseFilter() {
		super();
	}

	public ShortLinkBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		idEqual = GsonParser.parseString(jsonObject.get("idEqual"));
		idIn = GsonParser.parseString(jsonObject.get("idIn"));
		createdAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtLessThanOrEqual"));
		expiresAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("expiresAtGreaterThanOrEqual"));
		expiresAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("expiresAtLessThanOrEqual"));
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
		userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
		userIdIn = GsonParser.parseString(jsonObject.get("userIdIn"));
		systemNameEqual = GsonParser.parseString(jsonObject.get("systemNameEqual"));
		systemNameIn = GsonParser.parseString(jsonObject.get("systemNameIn"));
		statusEqual = ShortLinkStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaShortLinkBaseFilter");
		kparams.add("idEqual", this.idEqual);
		kparams.add("idIn", this.idIn);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("expiresAtGreaterThanOrEqual", this.expiresAtGreaterThanOrEqual);
		kparams.add("expiresAtLessThanOrEqual", this.expiresAtLessThanOrEqual);
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("partnerIdIn", this.partnerIdIn);
		kparams.add("userIdEqual", this.userIdEqual);
		kparams.add("userIdIn", this.userIdIn);
		kparams.add("systemNameEqual", this.systemNameEqual);
		kparams.add("systemNameIn", this.systemNameIn);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		return kparams;
	}

}

