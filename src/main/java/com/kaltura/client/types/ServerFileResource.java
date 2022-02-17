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
// Copyright (C) 2006-2022  Kaltura Inc.
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
 * Used to ingest media file that is already accessible on the shared disc.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ServerFileResource.Tokenizer.class)
public class ServerFileResource extends GenericDataCenterContentResource {
	
	public interface Tokenizer extends GenericDataCenterContentResource.Tokenizer {
		String localFilePath();
		String keepOriginalFile();
	}

	/**
	 * Full path to the local file
	 */
	private String localFilePath;
	/**
	 * Should keep original file (false = mv, true = cp)
	 */
	private Boolean keepOriginalFile;

	// localFilePath:
	public String getLocalFilePath(){
		return this.localFilePath;
	}
	public void setLocalFilePath(String localFilePath){
		this.localFilePath = localFilePath;
	}

	public void localFilePath(String multirequestToken){
		setToken("localFilePath", multirequestToken);
	}

	// keepOriginalFile:
	public Boolean getKeepOriginalFile(){
		return this.keepOriginalFile;
	}
	public void setKeepOriginalFile(Boolean keepOriginalFile){
		this.keepOriginalFile = keepOriginalFile;
	}

	public void keepOriginalFile(String multirequestToken){
		setToken("keepOriginalFile", multirequestToken);
	}


	public ServerFileResource() {
		super();
	}

	public ServerFileResource(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		localFilePath = GsonParser.parseString(jsonObject.get("localFilePath"));
		keepOriginalFile = GsonParser.parseBoolean(jsonObject.get("keepOriginalFile"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaServerFileResource");
		kparams.add("localFilePath", this.localFilePath);
		kparams.add("keepOriginalFile", this.keepOriginalFile);
		return kparams;
	}

}

