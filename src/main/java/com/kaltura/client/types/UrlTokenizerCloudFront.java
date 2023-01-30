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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UrlTokenizerCloudFront.Tokenizer.class)
public class UrlTokenizerCloudFront extends UrlTokenizer {
	
	public interface Tokenizer extends UrlTokenizer.Tokenizer {
		String keyPairId();
		String rootDir();
	}

	private String keyPairId;
	private String rootDir;

	// keyPairId:
	public String getKeyPairId(){
		return this.keyPairId;
	}
	public void setKeyPairId(String keyPairId){
		this.keyPairId = keyPairId;
	}

	public void keyPairId(String multirequestToken){
		setToken("keyPairId", multirequestToken);
	}

	// rootDir:
	public String getRootDir(){
		return this.rootDir;
	}
	public void setRootDir(String rootDir){
		this.rootDir = rootDir;
	}

	public void rootDir(String multirequestToken){
		setToken("rootDir", multirequestToken);
	}


	public UrlTokenizerCloudFront() {
		super();
	}

	public UrlTokenizerCloudFront(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		keyPairId = GsonParser.parseString(jsonObject.get("keyPairId"));
		rootDir = GsonParser.parseString(jsonObject.get("rootDir"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUrlTokenizerCloudFront");
		kparams.add("keyPairId", this.keyPairId);
		kparams.add("rootDir", this.rootDir);
		return kparams;
	}

}

