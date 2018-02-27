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
@MultiRequestBuilder.Tokenizer(PlayReadyContentKey.Tokenizer.class)
public class PlayReadyContentKey extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String keyId();
		String contentKey();
	}

	/**
	 * Guid - key id of the specific content
	 */
	private String keyId;
	/**
	 * License content key 64 bit encoded
	 */
	private String contentKey;

	// keyId:
	public String getKeyId(){
		return this.keyId;
	}
	public void setKeyId(String keyId){
		this.keyId = keyId;
	}

	public void keyId(String multirequestToken){
		setToken("keyId", multirequestToken);
	}

	// contentKey:
	public String getContentKey(){
		return this.contentKey;
	}
	public void setContentKey(String contentKey){
		this.contentKey = contentKey;
	}

	public void contentKey(String multirequestToken){
		setToken("contentKey", multirequestToken);
	}


	public PlayReadyContentKey() {
		super();
	}

	public PlayReadyContentKey(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		keyId = GsonParser.parseString(jsonObject.get("keyId"));
		contentKey = GsonParser.parseString(jsonObject.get("contentKey"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPlayReadyContentKey");
		kparams.add("keyId", this.keyId);
		kparams.add("contentKey", this.contentKey);
		return kparams;
	}

}

