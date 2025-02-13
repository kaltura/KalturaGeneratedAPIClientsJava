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
import com.kaltura.client.enums.ChinaCacheAlgorithmType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UrlTokenizerChinaCache.Tokenizer.class)
public class UrlTokenizerChinaCache extends UrlTokenizer {
	
	public interface Tokenizer extends UrlTokenizer.Tokenizer {
		String algorithmId();
		String keyId();
	}

	private ChinaCacheAlgorithmType algorithmId;
	private Integer keyId;

	// algorithmId:
	public ChinaCacheAlgorithmType getAlgorithmId(){
		return this.algorithmId;
	}
	public void setAlgorithmId(ChinaCacheAlgorithmType algorithmId){
		this.algorithmId = algorithmId;
	}

	public void algorithmId(String multirequestToken){
		setToken("algorithmId", multirequestToken);
	}

	// keyId:
	public Integer getKeyId(){
		return this.keyId;
	}
	public void setKeyId(Integer keyId){
		this.keyId = keyId;
	}

	public void keyId(String multirequestToken){
		setToken("keyId", multirequestToken);
	}


	public UrlTokenizerChinaCache() {
		super();
	}

	public UrlTokenizerChinaCache(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		algorithmId = ChinaCacheAlgorithmType.get(GsonParser.parseInt(jsonObject.get("algorithmId")));
		keyId = GsonParser.parseInt(jsonObject.get("keyId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUrlTokenizerChinaCache");
		kparams.add("algorithmId", this.algorithmId);
		kparams.add("keyId", this.keyId);
		return kparams;
	}

}

