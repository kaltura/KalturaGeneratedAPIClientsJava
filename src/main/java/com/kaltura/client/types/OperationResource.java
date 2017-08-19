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
import com.kaltura.client.types.ContentResource;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  A resource that perform operation (transcoding, clipping, cropping) before the
  flavor is ready.  */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(OperationResource.Tokenizer.class)
public class OperationResource extends ContentResource {
	
	public interface Tokenizer extends ContentResource.Tokenizer {
		ContentResource.Tokenizer resource();
		RequestBuilder.ListTokenizer<OperationAttributes.Tokenizer> operationAttributes();
		String assetParamsId();
	}

	/**  Only KalturaEntryResource and KalturaAssetResource are supported  */
	private ContentResource resource;
	private List<OperationAttributes> operationAttributes;
	/**  ID of alternative asset params to be used instead of the system default flavor
	  params  */
	private Integer assetParamsId;

	// resource:
	public ContentResource getResource(){
		return this.resource;
	}
	public void setResource(ContentResource resource){
		this.resource = resource;
	}

	// operationAttributes:
	public List<OperationAttributes> getOperationAttributes(){
		return this.operationAttributes;
	}
	public void setOperationAttributes(List<OperationAttributes> operationAttributes){
		this.operationAttributes = operationAttributes;
	}

	// assetParamsId:
	public Integer getAssetParamsId(){
		return this.assetParamsId;
	}
	public void setAssetParamsId(Integer assetParamsId){
		this.assetParamsId = assetParamsId;
	}

	public void assetParamsId(String multirequestToken){
		setToken("assetParamsId", multirequestToken);
	}


	public OperationResource() {
		super();
	}

	public OperationResource(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		resource = GsonParser.parseObject(jsonObject.getAsJsonObject("resource"), ContentResource.class);
		operationAttributes = GsonParser.parseArray(jsonObject.getAsJsonArray("operationAttributes"), OperationAttributes.class);
		assetParamsId = GsonParser.parseInt(jsonObject.get("assetParamsId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaOperationResource");
		kparams.add("resource", this.resource);
		kparams.add("operationAttributes", this.operationAttributes);
		kparams.add("assetParamsId", this.assetParamsId);
		return kparams;
	}

}

