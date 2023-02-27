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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Asset.Tokenizer.class)
public class Asset extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String entryId();
		String partnerId();
		String version();
		String size();
		String tags();
		String fileExt();
		String createdAt();
		String updatedAt();
		String deletedAt();
		String description();
		String partnerData();
		String partnerDescription();
		String actualSourceAssetParamsIds();
		String sizeInBytes();
	}

	/**
	 * The ID of the Flavor Asset
	 */
	private String id;
	/**
	 * The entry ID of the Flavor Asset
	 */
	private String entryId;
	private Integer partnerId;
	/**
	 * The version of the Flavor Asset
	 */
	private Integer version;
	/**
	 * The size (in KBytes) of the Flavor Asset
	 */
	private Integer size;
	/**
	 * Tags used to identify the Flavor Asset in various scenarios
	 */
	private String tags;
	/**
	 * The file extension
	 */
	private String fileExt;
	private Long createdAt;
	private Long updatedAt;
	private Long deletedAt;
	/**
	 * System description, error message, warnings and failure cause.
	 */
	private String description;
	/**
	 * Partner private data
	 */
	private String partnerData;
	/**
	 * Partner friendly description
	 */
	private String partnerDescription;
	/**
	 * Comma separated list of source flavor params ids
	 */
	private String actualSourceAssetParamsIds;
	/**
	 * The size (in Bytes) of the asset
	 */
	private Long sizeInBytes;

	// id:
	public String getId(){
		return this.id;
	}
	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// version:
	public Integer getVersion(){
		return this.version;
	}
	// size:
	public Integer getSize(){
		return this.size;
	}
	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// fileExt:
	public String getFileExt(){
		return this.fileExt;
	}
	public void setFileExt(String fileExt){
		this.fileExt = fileExt;
	}

	public void fileExt(String multirequestToken){
		setToken("fileExt", multirequestToken);
	}

	// createdAt:
	public Long getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Long getUpdatedAt(){
		return this.updatedAt;
	}
	// deletedAt:
	public Long getDeletedAt(){
		return this.deletedAt;
	}
	// description:
	public String getDescription(){
		return this.description;
	}
	// partnerData:
	public String getPartnerData(){
		return this.partnerData;
	}
	public void setPartnerData(String partnerData){
		this.partnerData = partnerData;
	}

	public void partnerData(String multirequestToken){
		setToken("partnerData", multirequestToken);
	}

	// partnerDescription:
	public String getPartnerDescription(){
		return this.partnerDescription;
	}
	public void setPartnerDescription(String partnerDescription){
		this.partnerDescription = partnerDescription;
	}

	public void partnerDescription(String multirequestToken){
		setToken("partnerDescription", multirequestToken);
	}

	// actualSourceAssetParamsIds:
	public String getActualSourceAssetParamsIds(){
		return this.actualSourceAssetParamsIds;
	}
	public void setActualSourceAssetParamsIds(String actualSourceAssetParamsIds){
		this.actualSourceAssetParamsIds = actualSourceAssetParamsIds;
	}

	public void actualSourceAssetParamsIds(String multirequestToken){
		setToken("actualSourceAssetParamsIds", multirequestToken);
	}

	// sizeInBytes:
	public Long getSizeInBytes(){
		return this.sizeInBytes;
	}

	public Asset() {
		super();
	}

	public Asset(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		version = GsonParser.parseInt(jsonObject.get("version"));
		size = GsonParser.parseInt(jsonObject.get("size"));
		tags = GsonParser.parseString(jsonObject.get("tags"));
		fileExt = GsonParser.parseString(jsonObject.get("fileExt"));
		createdAt = GsonParser.parseLong(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseLong(jsonObject.get("updatedAt"));
		deletedAt = GsonParser.parseLong(jsonObject.get("deletedAt"));
		description = GsonParser.parseString(jsonObject.get("description"));
		partnerData = GsonParser.parseString(jsonObject.get("partnerData"));
		partnerDescription = GsonParser.parseString(jsonObject.get("partnerDescription"));
		actualSourceAssetParamsIds = GsonParser.parseString(jsonObject.get("actualSourceAssetParamsIds"));
		sizeInBytes = GsonParser.parseLong(jsonObject.get("sizeInBytes"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAsset");
		kparams.add("tags", this.tags);
		kparams.add("fileExt", this.fileExt);
		kparams.add("partnerData", this.partnerData);
		kparams.add("partnerDescription", this.partnerDescription);
		kparams.add("actualSourceAssetParamsIds", this.actualSourceAssetParamsIds);
		return kparams;
	}

}

