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
// Copyright (C) 2006-2020  Kaltura Inc.
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

/**
 * Used to ingest media that dropped through drop folder
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DropFolderFileResource.Tokenizer.class)
public class DropFolderFileResource extends GenericDataCenterContentResource {
	
	public interface Tokenizer extends GenericDataCenterContentResource.Tokenizer {
		String dropFolderFileId();
	}

	/**
	 * Id of the drop folder file object
	 */
	private Integer dropFolderFileId;

	// dropFolderFileId:
	public Integer getDropFolderFileId(){
		return this.dropFolderFileId;
	}
	public void setDropFolderFileId(Integer dropFolderFileId){
		this.dropFolderFileId = dropFolderFileId;
	}

	public void dropFolderFileId(String multirequestToken){
		setToken("dropFolderFileId", multirequestToken);
	}


	public DropFolderFileResource() {
		super();
	}

	public DropFolderFileResource(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		dropFolderFileId = GsonParser.parseInt(jsonObject.get("dropFolderFileId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDropFolderFileResource");
		kparams.add("dropFolderFileId", this.dropFolderFileId);
		return kparams;
	}

}

