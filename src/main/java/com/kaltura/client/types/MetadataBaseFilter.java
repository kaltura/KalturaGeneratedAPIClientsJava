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
import com.kaltura.client.enums.MetadataObjectType;
import com.kaltura.client.enums.MetadataStatus;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MetadataBaseFilter.Tokenizer.class)
public abstract class MetadataBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String partnerIdEqual();
		String metadataProfileIdEqual();
		String metadataProfileIdIn();
		String metadataProfileVersionEqual();
		String metadataProfileVersionGreaterThanOrEqual();
		String metadataProfileVersionLessThanOrEqual();
		String metadataObjectTypeEqual();
		String objectIdEqual();
		String objectIdIn();
		String versionEqual();
		String versionGreaterThanOrEqual();
		String versionLessThanOrEqual();
		String createdAtGreaterThanOrEqual();
		String createdAtLessThanOrEqual();
		String updatedAtGreaterThanOrEqual();
		String updatedAtLessThanOrEqual();
		String statusEqual();
		String statusIn();
	}

	private Integer partnerIdEqual;
	private Integer metadataProfileIdEqual;
	private String metadataProfileIdIn;
	private Integer metadataProfileVersionEqual;
	private Integer metadataProfileVersionGreaterThanOrEqual;
	private Integer metadataProfileVersionLessThanOrEqual;
	/**
	 * When null, default is KalturaMetadataObjectType::ENTRY
	 */
	private MetadataObjectType metadataObjectTypeEqual;
	private String objectIdEqual;
	private String objectIdIn;
	private Integer versionEqual;
	private Integer versionGreaterThanOrEqual;
	private Integer versionLessThanOrEqual;
	private Long createdAtGreaterThanOrEqual;
	private Long createdAtLessThanOrEqual;
	private Long updatedAtGreaterThanOrEqual;
	private Long updatedAtLessThanOrEqual;
	private MetadataStatus statusEqual;
	private String statusIn;

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

	// metadataProfileIdEqual:
	public Integer getMetadataProfileIdEqual(){
		return this.metadataProfileIdEqual;
	}
	public void setMetadataProfileIdEqual(Integer metadataProfileIdEqual){
		this.metadataProfileIdEqual = metadataProfileIdEqual;
	}

	public void metadataProfileIdEqual(String multirequestToken){
		setToken("metadataProfileIdEqual", multirequestToken);
	}

	// metadataProfileIdIn:
	public String getMetadataProfileIdIn(){
		return this.metadataProfileIdIn;
	}
	public void setMetadataProfileIdIn(String metadataProfileIdIn){
		this.metadataProfileIdIn = metadataProfileIdIn;
	}

	public void metadataProfileIdIn(String multirequestToken){
		setToken("metadataProfileIdIn", multirequestToken);
	}

	// metadataProfileVersionEqual:
	public Integer getMetadataProfileVersionEqual(){
		return this.metadataProfileVersionEqual;
	}
	public void setMetadataProfileVersionEqual(Integer metadataProfileVersionEqual){
		this.metadataProfileVersionEqual = metadataProfileVersionEqual;
	}

	public void metadataProfileVersionEqual(String multirequestToken){
		setToken("metadataProfileVersionEqual", multirequestToken);
	}

	// metadataProfileVersionGreaterThanOrEqual:
	public Integer getMetadataProfileVersionGreaterThanOrEqual(){
		return this.metadataProfileVersionGreaterThanOrEqual;
	}
	public void setMetadataProfileVersionGreaterThanOrEqual(Integer metadataProfileVersionGreaterThanOrEqual){
		this.metadataProfileVersionGreaterThanOrEqual = metadataProfileVersionGreaterThanOrEqual;
	}

	public void metadataProfileVersionGreaterThanOrEqual(String multirequestToken){
		setToken("metadataProfileVersionGreaterThanOrEqual", multirequestToken);
	}

	// metadataProfileVersionLessThanOrEqual:
	public Integer getMetadataProfileVersionLessThanOrEqual(){
		return this.metadataProfileVersionLessThanOrEqual;
	}
	public void setMetadataProfileVersionLessThanOrEqual(Integer metadataProfileVersionLessThanOrEqual){
		this.metadataProfileVersionLessThanOrEqual = metadataProfileVersionLessThanOrEqual;
	}

	public void metadataProfileVersionLessThanOrEqual(String multirequestToken){
		setToken("metadataProfileVersionLessThanOrEqual", multirequestToken);
	}

	// metadataObjectTypeEqual:
	public MetadataObjectType getMetadataObjectTypeEqual(){
		return this.metadataObjectTypeEqual;
	}
	public void setMetadataObjectTypeEqual(MetadataObjectType metadataObjectTypeEqual){
		this.metadataObjectTypeEqual = metadataObjectTypeEqual;
	}

	public void metadataObjectTypeEqual(String multirequestToken){
		setToken("metadataObjectTypeEqual", multirequestToken);
	}

	// objectIdEqual:
	public String getObjectIdEqual(){
		return this.objectIdEqual;
	}
	public void setObjectIdEqual(String objectIdEqual){
		this.objectIdEqual = objectIdEqual;
	}

	public void objectIdEqual(String multirequestToken){
		setToken("objectIdEqual", multirequestToken);
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

	// versionEqual:
	public Integer getVersionEqual(){
		return this.versionEqual;
	}
	public void setVersionEqual(Integer versionEqual){
		this.versionEqual = versionEqual;
	}

	public void versionEqual(String multirequestToken){
		setToken("versionEqual", multirequestToken);
	}

	// versionGreaterThanOrEqual:
	public Integer getVersionGreaterThanOrEqual(){
		return this.versionGreaterThanOrEqual;
	}
	public void setVersionGreaterThanOrEqual(Integer versionGreaterThanOrEqual){
		this.versionGreaterThanOrEqual = versionGreaterThanOrEqual;
	}

	public void versionGreaterThanOrEqual(String multirequestToken){
		setToken("versionGreaterThanOrEqual", multirequestToken);
	}

	// versionLessThanOrEqual:
	public Integer getVersionLessThanOrEqual(){
		return this.versionLessThanOrEqual;
	}
	public void setVersionLessThanOrEqual(Integer versionLessThanOrEqual){
		this.versionLessThanOrEqual = versionLessThanOrEqual;
	}

	public void versionLessThanOrEqual(String multirequestToken){
		setToken("versionLessThanOrEqual", multirequestToken);
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

	// statusEqual:
	public MetadataStatus getStatusEqual(){
		return this.statusEqual;
	}
	public void setStatusEqual(MetadataStatus statusEqual){
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


	public MetadataBaseFilter() {
		super();
	}

	public MetadataBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
		metadataProfileIdEqual = GsonParser.parseInt(jsonObject.get("metadataProfileIdEqual"));
		metadataProfileIdIn = GsonParser.parseString(jsonObject.get("metadataProfileIdIn"));
		metadataProfileVersionEqual = GsonParser.parseInt(jsonObject.get("metadataProfileVersionEqual"));
		metadataProfileVersionGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("metadataProfileVersionGreaterThanOrEqual"));
		metadataProfileVersionLessThanOrEqual = GsonParser.parseInt(jsonObject.get("metadataProfileVersionLessThanOrEqual"));
		metadataObjectTypeEqual = MetadataObjectType.get(GsonParser.parseString(jsonObject.get("metadataObjectTypeEqual")));
		objectIdEqual = GsonParser.parseString(jsonObject.get("objectIdEqual"));
		objectIdIn = GsonParser.parseString(jsonObject.get("objectIdIn"));
		versionEqual = GsonParser.parseInt(jsonObject.get("versionEqual"));
		versionGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("versionGreaterThanOrEqual"));
		versionLessThanOrEqual = GsonParser.parseInt(jsonObject.get("versionLessThanOrEqual"));
		createdAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtGreaterThanOrEqual"));
		createdAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("createdAtLessThanOrEqual"));
		updatedAtGreaterThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtGreaterThanOrEqual"));
		updatedAtLessThanOrEqual = GsonParser.parseLong(jsonObject.get("updatedAtLessThanOrEqual"));
		statusEqual = MetadataStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
		statusIn = GsonParser.parseString(jsonObject.get("statusIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMetadataBaseFilter");
		kparams.add("partnerIdEqual", this.partnerIdEqual);
		kparams.add("metadataProfileIdEqual", this.metadataProfileIdEqual);
		kparams.add("metadataProfileIdIn", this.metadataProfileIdIn);
		kparams.add("metadataProfileVersionEqual", this.metadataProfileVersionEqual);
		kparams.add("metadataProfileVersionGreaterThanOrEqual", this.metadataProfileVersionGreaterThanOrEqual);
		kparams.add("metadataProfileVersionLessThanOrEqual", this.metadataProfileVersionLessThanOrEqual);
		kparams.add("metadataObjectTypeEqual", this.metadataObjectTypeEqual);
		kparams.add("objectIdEqual", this.objectIdEqual);
		kparams.add("objectIdIn", this.objectIdIn);
		kparams.add("versionEqual", this.versionEqual);
		kparams.add("versionGreaterThanOrEqual", this.versionGreaterThanOrEqual);
		kparams.add("versionLessThanOrEqual", this.versionLessThanOrEqual);
		kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
		kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
		kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
		kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
		kparams.add("statusEqual", this.statusEqual);
		kparams.add("statusIn", this.statusIn);
		return kparams;
	}

}

