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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Used to ingest a single image extracted from a document entry's  generated image
  list. The image is selected by its zero-based index  within the document's
  imagesList.xml.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DocumentImagesResource.Tokenizer.class)
public class DocumentImagesResource extends ContentResource {
	
	public interface Tokenizer extends ContentResource.Tokenizer {
		String flavorAssetId();
		String index();
	}

	/**
	 * ID of the flavor asset containing the image list
	 */
	private String flavorAssetId;
	/**
	 * Zero-based index of the image to retrieve from the list
	 */
	private Integer index;

	// flavorAssetId:
	public String getFlavorAssetId(){
		return this.flavorAssetId;
	}
	public void setFlavorAssetId(String flavorAssetId){
		this.flavorAssetId = flavorAssetId;
	}

	public void flavorAssetId(String multirequestToken){
		setToken("flavorAssetId", multirequestToken);
	}

	// index:
	public Integer getIndex(){
		return this.index;
	}
	public void setIndex(Integer index){
		this.index = index;
	}

	public void index(String multirequestToken){
		setToken("index", multirequestToken);
	}


	public DocumentImagesResource() {
		super();
	}

	public DocumentImagesResource(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
		index = GsonParser.parseInt(jsonObject.get("index"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDocumentImagesResource");
		kparams.add("flavorAssetId", this.flavorAssetId);
		kparams.add("index", this.index);
		return kparams;
	}

}

